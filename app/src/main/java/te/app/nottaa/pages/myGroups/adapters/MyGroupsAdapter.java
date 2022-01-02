package te.app.nottaa.pages.myGroups.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import te.app.nottaa.PassingObject;
import te.app.nottaa.R;
import te.app.nottaa.databinding.ItemMyGroupBinding;
import te.app.nottaa.pages.groupDetails.GroupDetailsFragment;
import te.app.nottaa.pages.home.models.GroupItem;
import te.app.nottaa.pages.home.viewModels.ItemHomeViewModel;
import te.app.nottaa.utils.Constants;
import te.app.nottaa.utils.helper.MovementHelper;

public class MyGroupsAdapter extends RecyclerView.Adapter<MyGroupsAdapter.ViewHolder> {
    List<GroupItem> groupItemList;
    Context context;
    public int lastSelected = -1;
    public MutableLiveData<PassingObject> liveData = new MutableLiveData<>();

    public MyGroupsAdapter() {
        this.groupItemList = new ArrayList<>();
    }

    public List<GroupItem> getGroupItemList() {
        return groupItemList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_my_group,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        GroupItem item = groupItemList.get(position);
        ItemHomeViewModel itemMenuViewModel = new ItemHomeViewModel(item);
        itemMenuViewModel.getLiveData().observeForever(o -> {
            lastSelected = position;
            if (o.equals(Constants.DELETE_GROUP) || o.equals(Constants.DIALOG_SHOW_LEAVE)) {
                liveData.setValue(new PassingObject(item.getId(), String.valueOf(o)));
            } else if (o.equals(Constants.GROUP_DETAILS)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(item.getId(), item.getName()), null, GroupDetailsFragment.class.getName(), Constants.ADD_GROUP_REQUEST);
            }
        });
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<GroupItem> dataList) {
        this.groupItemList.clear();
        groupItemList.addAll(dataList);
    }

    public void loadMore(@NotNull List<GroupItem> dataList) {
        int start = groupItemList.size();
        groupItemList.addAll(dataList);
        notifyItemRangeInserted(start, dataList.size());
    }

    public void removeItem() {
        getGroupItemList().remove(lastSelected);
        notifyDataSetChanged();
    }

    @Override
    public void onViewAttachedToWindow(@NotNull ViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        holder.bind();
    }

    @Override
    public void onViewDetachedFromWindow(@NotNull ViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        holder.unbind();
    }

    @Override
    public int getItemCount() {
        return groupItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemMyGroupBinding itemMenuBinding;

        ViewHolder(View itemView) {
            super(itemView);
            bind();
        }


        void bind() {
            if (itemMenuBinding == null) {
                itemMenuBinding = DataBindingUtil.bind(itemView);
            }
        }

        void unbind() {
            if (itemMenuBinding != null) {
                itemMenuBinding.unbind();
            }
        }

        void setViewModel(ItemHomeViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setViewModel(itemViewModels);
            }
        }
    }
}
