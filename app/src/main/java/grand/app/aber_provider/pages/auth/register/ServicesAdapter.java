package grand.app.aber_provider.pages.auth.register;

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
import grand.app.aber_provider.databinding.ItemAuthServicesBinding;
import grand.app.aber_provider.pages.orderDetails.models.SubServices;
import grand.app.aber_provider.pages.orderDetails.viewModels.ItemRequiredOrderServiceViewModel;

public class ServicesAdapter extends RecyclerView.Adapter<ServicesAdapter.MenuView> {
    List<SubServices> serviceList;
    Context context;
    public List<Integer> selectedIds = new ArrayList<>();

    public ServicesAdapter() {
        this.serviceList = new ArrayList<>();
    }

    @NonNull
    @Override
    public MenuView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_auth_services,
                parent, false);
        this.context = parent.getContext();
        return new MenuView(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final MenuView holder, final int position) {
        SubServices menuModel = serviceList.get(position);
        ItemRequiredOrderServiceViewModel itemMenuViewModel = new ItemRequiredOrderServiceViewModel(menuModel);
        itemMenuViewModel.getLiveData().observeForever(o -> {
            int index = isExist(menuModel.getId());
            if (index == -1) {
                selectedIds.add(menuModel.getId());
            } else
                selectedIds.remove(index);
        });
        if (menuModel.isSelected())
            selectedIds.add(menuModel.getId());
        holder.setViewModel(itemMenuViewModel);
    }

    private int isExist(int id) {
        for (int i = 0; i < selectedIds.size(); i++) {
            if (selectedIds.get(i) == id)
                return i;
        }
        return -1;
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
        public ItemAuthServicesBinding itemMenuBinding;

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
