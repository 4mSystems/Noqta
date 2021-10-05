package te.app.notta.pages.notifications.adapters;

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

import te.app.notta.PassingObject;
import te.app.notta.R;
import te.app.notta.databinding.NotifyItemBinding;
import te.app.notta.pages.groupDetails.GroupDetailsFragment;
import te.app.notta.pages.notifications.itemViewModels.NotificationsItemViewModels;
import te.app.notta.pages.notifications.models.NotificationsData;
import te.app.notta.pages.points.MyPointsFragment;
import te.app.notta.utils.Constants;
import te.app.notta.utils.helper.MovementHelper;

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
                case "1":
                    MovementHelper.startActivityWithBundle(context, new PassingObject(dataModel.getGroupId()), null, GroupDetailsFragment.class.getName(), null);
                    break;
                case "2":
                    MovementHelper.startActivity(context, MyPointsFragment.class.getName(), null, null);
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
