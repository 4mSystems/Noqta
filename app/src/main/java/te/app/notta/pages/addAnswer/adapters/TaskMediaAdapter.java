package te.app.notta.pages.addAnswer.adapters;

import android.annotation.SuppressLint;
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

import te.app.notta.R;
import te.app.notta.databinding.ItemTaskMediaBinding;
import te.app.notta.pages.addAnswer.models.TaskFilesItem;
import te.app.notta.pages.addAnswer.viewModels.ItemTaskMediaViewModel;

public class TaskMediaAdapter extends RecyclerView.Adapter<TaskMediaAdapter.ViewHolder> {
    List<TaskFilesItem> filesItemList;
    Context context;
    public MutableLiveData<Object> liveData = new MutableLiveData<>();

    public TaskMediaAdapter() {
        this.filesItemList = new ArrayList<>();
    }

    public List<TaskFilesItem> getFilesItemList() {
        return filesItemList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_task_media,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        TaskFilesItem item = filesItemList.get(position);
        ItemTaskMediaViewModel itemMenuViewModel = new ItemTaskMediaViewModel(item);
        itemMenuViewModel.getLiveData().observeForever(o -> {
            liveData.setValue(item.getFile());
        });
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<TaskFilesItem> dataList) {
        this.filesItemList.clear();
        filesItemList.addAll(dataList);
        notifyDataSetChanged();
    }

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

    @Override
    public int getItemCount() {
        return filesItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemTaskMediaBinding itemMenuBinding;

        ViewHolder(View itemView) {
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

        void setViewModel(ItemTaskMediaViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setViewModel(itemViewModels);
            }
        }
    }
}
