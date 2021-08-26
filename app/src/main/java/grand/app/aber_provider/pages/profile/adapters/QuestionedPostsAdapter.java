package grand.app.aber_provider.pages.profile.adapters;

import android.content.Context;
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

import grand.app.aber_provider.R;
import grand.app.aber_provider.databinding.ItemColorBinding;
import grand.app.aber_provider.pages.home.models.Orders;
import grand.app.aber_provider.pages.home.viewModels.ItemHomeViewModel;
import grand.app.aber_provider.utils.Constants;

public class QuestionedPostsAdapter extends RecyclerView.Adapter<QuestionedPostsAdapter.MenuView> {
    List<Orders> postDataList;
    private Context context;
    public int lastSelected = -1;
    public int lastPosition = -1;
    public boolean isProfile = true;
    public MutableLiveData<Object> liveData = new MutableLiveData<>();

    public QuestionedPostsAdapter() {
        this.postDataList = new ArrayList<>();
    }


    public List<Orders> getPostDataList() {
        return postDataList;
    }

    @NonNull
    @Override
    public MenuView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_color,
                parent, false);
        this.context = parent.getContext();
        return new MenuView(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final MenuView holder, final int position) {
        Orders menuModel = postDataList.get(position);
        ItemHomeViewModel itemMenuViewModel = new ItemHomeViewModel(menuModel);
        itemMenuViewModel.getLiveData().observe(((LifecycleOwner) context), o -> {
            this.lastSelected = menuModel.getId();
            this.lastPosition = position;
           if (o.equals(Constants.DELETE)) {
                liveData.setValue(Constants.DELETE);
            } else if (o.equals(Constants.HIDE_POST)) {
                liveData.setValue(Constants.HIDE_POST);
            } else if (o.equals(Constants.REJECT_ORDER)) {
                liveData.setValue(o);
            }

        });
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<Orders> dataList) {
        this.postDataList.clear();
        postDataList.addAll(dataList);
        notifyDataSetChanged();
    }

    public void loadMore(@NotNull List<Orders> dataList) {
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
        public ItemColorBinding itemMenuBinding;

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
