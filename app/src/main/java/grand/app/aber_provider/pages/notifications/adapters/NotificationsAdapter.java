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
import grand.app.aber_provider.pages.notifications.itemViewModels.NotificationsItemViewModels;
import grand.app.aber_provider.pages.notifications.models.NotificationsData;
import grand.app.aber_provider.pages.orderDetails.OrderDetailsFragment;
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
            if (dataModel.getType().equals(Constants.ORDER_SERVICE)) {
                MovementHelper.startActivityForResultWithBundle(MovementHelper.unwrap(context), new PassingObject(dataModel.getOrderServiceId()), ResourceManager.getString(R.string.service_details), OrderDetailsFragment.class.getName(), Constants.ORDER_DETAILS_REQUEST);
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
