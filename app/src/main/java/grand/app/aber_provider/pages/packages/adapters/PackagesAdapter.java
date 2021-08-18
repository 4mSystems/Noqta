package grand.app.aber_provider.pages.packages.adapters;

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

import grand.app.aber_provider.R;
import grand.app.aber_provider.databinding.ItemPackageBinding;
import grand.app.aber_provider.pages.packages.models.PackagesData;
import grand.app.aber_provider.pages.packages.viewModels.ItemPackageViewModels;

public class PackagesAdapter extends RecyclerView.Adapter<PackagesAdapter.MenuView> {
    List<PackagesData> packagesDataList;
    Context context;
    public MutableLiveData<Integer> liveData = new MutableLiveData<>();
    public int lastSelected = -1;

    public PackagesAdapter() {
        this.packagesDataList = new ArrayList<>();
    }


    @NonNull
    @Override
    public MenuView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_package,
                parent, false);
        this.context = parent.getContext();
        return new MenuView(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final MenuView holder, final int position) {
        PackagesData menuModel = packagesDataList.get(position);
        ItemPackageViewModels itemMenuViewModel = new ItemPackageViewModels(menuModel);
        itemMenuViewModel.getLiveData().observeForever(o -> {
            lastSelected = menuModel.getId();
            liveData.setValue(menuModel.getId());
        });
        holder.setViewModel(itemMenuViewModel);
    }

    public void update(List<PackagesData> dataList) {
        this.packagesDataList.clear();
        packagesDataList.addAll(dataList);
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
        return packagesDataList.size();
    }

    public class MenuView extends RecyclerView.ViewHolder {
        public ItemPackageBinding itemMenuBinding;

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

        void setViewModel(ItemPackageViewModels itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemPostViewModel(itemViewModels);
            }
        }
    }
}
