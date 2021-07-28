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
import grand.app.aber_provider.databinding.ItemPartBinding;
import grand.app.aber_provider.pages.home.models.PostData;
import grand.app.aber_provider.pages.home.viewModels.ItemHomeViewModel;

public class PackagesAdapter extends RecyclerView.Adapter<PackagesAdapter.MenuView> {
    List<PostData> postDataList;
     Context context;
    public MutableLiveData<Object> liveData = new MutableLiveData<>();

    public PackagesAdapter() {
        this.postDataList = new ArrayList<>();
    }


    public List<PostData> getPostDataList() {
        return postDataList;
    }

    @NonNull
    @Override
    public MenuView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_part,
                parent, false);
        this.context = parent.getContext();
        return new MenuView(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final MenuView holder, final int position) {
        PostData menuModel = postDataList.get(position);
        ItemHomeViewModel itemMenuViewModel = new ItemHomeViewModel(menuModel);
        holder.setViewModel(itemMenuViewModel);
    }
    public void update(List<PostData> dataList) {
        this.postDataList.clear();
        postDataList.addAll(dataList);
        notifyDataSetChanged();
    }

    public void loadMore(@NotNull List<PostData> dataList) {
        int start = postDataList.size();
        postDataList.addAll(dataList);
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
        return postDataList.size();
    }

    public class MenuView extends RecyclerView.ViewHolder {
        public ItemPartBinding itemMenuBinding;

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

        void setViewModel(ItemHomeViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemPostViewModel(itemViewModels);
            }
        }
    }
}