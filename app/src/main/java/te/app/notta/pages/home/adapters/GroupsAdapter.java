package te.app.notta.pages.home.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import te.app.notta.PassingObject;
import te.app.notta.R;
import te.app.notta.databinding.ItemHomeBinding;
import te.app.notta.pages.home.GroupDetailsFragment;
import te.app.notta.pages.home.models.GroupItem;
import te.app.notta.pages.home.viewModels.ItemHomeViewModel;
import te.app.notta.pages.teacher.AddTaskFragment;
import te.app.notta.utils.Constants;
import te.app.notta.utils.helper.MovementHelper;

public class GroupsAdapter extends RecyclerView.Adapter<GroupsAdapter.ViewHolder> {
    List<GroupItem> groupItemList;
    Context context;

    public GroupsAdapter() {
        this.groupItemList = new ArrayList<>();
    }

    public List<GroupItem> getGroupItemList() {
        return groupItemList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        GroupItem item = groupItemList.get(position);
        ItemHomeViewModel itemMenuViewModel = new ItemHomeViewModel(item);
        itemMenuViewModel.getLiveData().observeForever(o -> {
//            lastSelected = position;
            if (o.equals(Constants.ADD_TASK)) {
                MovementHelper.startActivityWithBundle(context, new PassingObject(item.getId()), null, AddTaskFragment.class.getName(), null);
            } else if (o.equals(Constants.GROUP_DETAILS)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(item.getId(), item.getName()), null, GroupDetailsFragment.class.getName(), Constants.ADD_GROUP_REQUEST);
            }
//            else if (o.equals(Constants.CLIENT_ATTACHMENTS)) {
//                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(client.getClientId(), Constants.CLIENT_ATTACHMENTS), ResourceManager.getString(R.string.attachments), AttachmentsFragment.class.getName(), null);
//            } else if (o.equals(Constants.DELETE)) {
//                actionLiveData.setValue(o);
//            }
        });
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<GroupItem> dataList) {
        this.groupItemList.clear();
        groupItemList.addAll(dataList);
        notifyDataSetChanged();
    }

    public void loadMore(@NotNull List<GroupItem> dataList) {
        int start = groupItemList.size();
        groupItemList.addAll(dataList);
        notifyItemRangeInserted(start, dataList.size());
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
        public ItemHomeBinding itemMenuBinding;

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
