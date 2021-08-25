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
import grand.app.aber_provider.databinding.ItemOrderOptionsDetailsBinding;
import grand.app.aber_provider.pages.orderDetails.models.ChildServices;
import grand.app.aber_provider.pages.orderDetails.viewModels.ItemChildServiceViewModel;

public class OptionsDetailsAdapter extends RecyclerView.Adapter<OptionsDetailsAdapter.MenuView> {
    List<ChildServices> serviceList;
    Context context;

    public OptionsDetailsAdapter() {
        this.serviceList = new ArrayList<>();
    }

    public List<ChildServices> getServiceList() {
        return serviceList;
    }

    @NonNull
    @Override
    public MenuView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_order_options_details,
                parent, false);
        this.context = parent.getContext();
        return new MenuView(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final MenuView holder, final int position) {
        ChildServices menuModel = serviceList.get(position);
        ItemChildServiceViewModel itemMenuViewModel = new ItemChildServiceViewModel(menuModel);
        holder.setViewModel(itemMenuViewModel);
    }

    public void update(@NotNull List<ChildServices> dataList) {
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
        public ItemOrderOptionsDetailsBinding itemMenuBinding;

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

        void setViewModel(ItemChildServiceViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
