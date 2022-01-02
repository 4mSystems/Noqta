package te.app.nottaa.pages.points.adapters;

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

import te.app.nottaa.R;
import te.app.nottaa.databinding.ItemPointsBinding;
import te.app.nottaa.pages.points.models.PointsData;
import te.app.nottaa.pages.points.viewModels.ItemPointsViewModel;

public class PointsAdapter extends RecyclerView.Adapter<PointsAdapter.ViewHolder> {
    List<PointsData> pointsDataList;
    Context context;
    public int lastSelected = -1, lastPosition;
    public MutableLiveData<Object> liveData = new MutableLiveData<>();

    public PointsAdapter() {
        this.pointsDataList = new ArrayList<>();
    }

    public List<PointsData> getPointsDataList() {
        return pointsDataList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_points,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        PointsData item = pointsDataList.get(position);
        ItemPointsViewModel itemMenuViewModel = new ItemPointsViewModel(item);
        itemMenuViewModel.getLiveData().observeForever(o -> {
            lastSelected = item.getId();
            lastPosition = position;
            liveData.setValue(o);
        });
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<PointsData> dataList) {
        this.pointsDataList.clear();
        pointsDataList.addAll(dataList);
        notifyDataSetChanged();
    }

    public void loadMore(@NotNull List<PointsData> dataList) {
        int start = pointsDataList.size();
        pointsDataList.addAll(dataList);
        notifyItemRangeInserted(start, dataList.size());
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
        return pointsDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemPointsBinding itemMenuBinding;

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

        void setViewModel(ItemPointsViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setViewModel(itemViewModels);
            }
        }
    }
}
