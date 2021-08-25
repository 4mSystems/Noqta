package grand.app.aber_provider.pages.orderDetails.adapters;

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

import grand.app.aber_provider.R;
import grand.app.aber_provider.databinding.ItemRequiredServiceBinding;
import grand.app.aber_provider.pages.orderDetails.models.SubServices;
import grand.app.aber_provider.pages.orderDetails.viewModels.ItemRequiredOrderServiceViewModel;

public class ServicesRequiredAdapter extends RecyclerView.Adapter<ServicesRequiredAdapter.MenuView> {
    List<SubServices> serviceList;
    Context context;

    public ServicesRequiredAdapter() {
        this.serviceList = new ArrayList<>();
    }

    public List<SubServices> getServiceList() {
        return serviceList;
    }

    @NonNull
    @Override
    public MenuView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_required_service,
                parent, false);
        this.context = parent.getContext();
        return new MenuView(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final MenuView holder, final int position) {
        SubServices menuModel = serviceList.get(position);
        ItemRequiredOrderServiceViewModel itemMenuViewModel = new ItemRequiredOrderServiceViewModel(menuModel);
        if (position == getServiceList().size() - 1)
            holder.itemMenuBinding.vChoosenOrder.setVisibility(View.INVISIBLE);
        holder.setViewModel(itemMenuViewModel);
    }

    public void update(@NotNull List<SubServices> dataList) {
        this.serviceList.clear();
        serviceList.addAll(dataList);
        notifyDataSetChanged();
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
        return serviceList.size();
    }

    public class MenuView extends RecyclerView.ViewHolder {
        public ItemRequiredServiceBinding itemMenuBinding;

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

        void setViewModel(ItemRequiredOrderServiceViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
