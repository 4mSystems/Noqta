package grand.app.aber_provider.pages.notifications.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.R;
import grand.app.aber_provider.databinding.NotifyItemBinding;
import grand.app.aber_provider.pages.services.CarCheckFragment;
import grand.app.aber_provider.pages.notifications.itemViewModels.NotificationsItemViewModels;
import grand.app.aber_provider.pages.notifications.models.NotificationsData;
import grand.app.aber_provider.pages.packages.ProductDetailsFragment;
import grand.app.aber_provider.pages.postDetails.RepliesFragment;
import grand.app.aber_provider.pages.myOrders.MyServicesOrdersFragment;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.MovementHelper;
import grand.app.aber_provider.utils.resources.ResourceManager;

public class NotificationsAdapter extends RecyclerView.Adapter<NotificationsAdapter.ViewHolder> {
    public List<NotificationsData> notificationsDataList;
    Context context;

    public NotificationsAdapter() {
        notificationsDataList = new ArrayList<>();
    }


    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.notify_item,
                parent, false);
        context = parent.getContext();
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        NotificationsData dataModel = notificationsDataList.get(position);
        NotificationsItemViewModels homeItemViewModels = new NotificationsItemViewModels(dataModel);
        homeItemViewModels.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> {
            switch (dataModel.getType()) {
                case Constants.POST_TYPE:
                    MovementHelper.startActivityWithBundle(context, new PassingObject(dataModel.getPost_id()), "", ProductDetailsFragment.class.getName(), null);
                    break;
                case Constants.COMMENT_TYPE:
                case Constants.REPLY_TYPE:
                    MovementHelper.startActivityWithBundle(context, new PassingObject(dataModel.getComment_id(), String.valueOf(dataModel.getPost_id())), ResourceManager.getString(R.string.replies), RepliesFragment.class.getName(), null);
                    break;
                case Constants.ASK_TYPE:
                    MovementHelper.startActivityWithBundle(context, new PassingObject(dataModel.getPost_id(), Constants.Add_ANSWER), ResourceManager.getString(R.string.previous), CarCheckFragment.class.getName(), null);
                    break;
                case Constants.USER_TYPE:
                    MovementHelper.startActivityWithBundle(context, new PassingObject(dataModel.getFollowerId()), null, MyServicesOrdersFragment.class.getName(), null);
                    break;

            }
        });
        holder.setViewModel(homeItemViewModels);
    }

    @Override
    public int getItemCount() {
        return this.notificationsDataList.size();
    }

    //
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

    public void updateData(@NotNull List<NotificationsData> data) {
        this.notificationsDataList.clear();
        this.notificationsDataList.addAll(data);
        notifyDataSetChanged();
    }

    public void loadMore(@NotNull List<NotificationsData> dataList) {
        int start = notificationsDataList.size();
        notificationsDataList.addAll(dataList);
        notifyItemRangeInserted(start, dataList.size());
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        NotifyItemBinding itemBinding;

        //
        ViewHolder(View itemView) {
            super(itemView);
            bind();
        }


        void bind() {
            if (itemBinding == null) {
                itemBinding = DataBindingUtil.bind(itemView);
            }
        }

        void unbind() {
            if (itemBinding != null) {
                itemBinding.unbind();
            }
        }

        void setViewModel(NotificationsItemViewModels itemViewModels) {
            if (itemBinding != null) {
                itemBinding.setNotifyItemViewModels(itemViewModels);
            }
        }
    }
}
