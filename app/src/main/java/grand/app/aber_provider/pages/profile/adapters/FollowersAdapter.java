package grand.app.aber_provider.pages.profile.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.R;
import grand.app.aber_provider.databinding.ItemPartServiceBinding;
import grand.app.aber_provider.pages.auth.models.UserData;
import grand.app.aber_provider.pages.myOrders.MyServicesOrdersFragment;
import grand.app.aber_provider.pages.profile.viewModels.ItemPeopleViewModel;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.MovementHelper;

public class FollowersAdapter extends RecyclerView.Adapter<FollowersAdapter.MenuView> {
    List<UserData> userDataList;
    private Context context;
    public int lastSelected = -1;
    public int lastPosition = -1;
    public boolean isFollowVisible = false;
    public String followBtnText;
    public MutableLiveData<Object> liveData = new MutableLiveData<>();

    public FollowersAdapter() {
        this.userDataList = new ArrayList<>();
    }


    public List<UserData> getUserDataList() {
        return userDataList;
    }

    @NonNull
    @Override
    public MenuView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_part_service,
                parent, false);
        this.context = parent.getContext();
        return new MenuView(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final MenuView holder, final int position) {
        UserData menuModel = userDataList.get(position);
        menuModel.setFollowVisible(isFollowVisible);
        if (!TextUtils.isEmpty(followBtnText))
            menuModel.setFollowBtnText(followBtnText);
        ItemPeopleViewModel itemMenuViewModel = new ItemPeopleViewModel(menuModel);
        itemMenuViewModel.getLiveData().observe(((LifecycleOwner) context), o -> {
            this.lastSelected = menuModel.getId();
            this.lastPosition = position;
            if (o.equals(Constants.PROFILE))
                MovementHelper.startActivityWithBundle(context, new PassingObject(menuModel.getId()), null, MyServicesOrdersFragment.class.getName(), null);
            else
                liveData.setValue(o);
        });

        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<UserData> dataList) {
        this.userDataList.clear();
        userDataList.addAll(dataList);
        notifyDataSetChanged();
    }

    public void loadMore(@NotNull List<UserData> dataList) {
        int start = userDataList.size();
        userDataList.addAll(dataList);
        notifyItemRangeInserted(start, dataList.size());
    }

    @Override
    public void onViewAttachedToWindow(@NotNull MenuView holder) {
        super.onViewAttachedToWindow(holder);
        holder.bind();
    }

    @Override
    public void onViewDetachedFromWindow(@NotNull MenuView holder) {
        super.onViewDetachedFromWindow(holder);
        holder.unbind();
    }

    @Override
    public int getItemCount() {
        return userDataList.size();
    }

    public class MenuView extends RecyclerView.ViewHolder {
        public ItemPartServiceBinding itemMenuBinding;

        MenuView(View itemView) {
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

        void setViewModel(ItemPeopleViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
