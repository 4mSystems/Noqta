package grand.app.aber_provider.pages.profile.adapters;

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
import grand.app.aber_provider.databinding.ItemSizeBinding;
import grand.app.aber_provider.pages.profile.models.reportReasons.ReportData;
import grand.app.aber_provider.pages.profile.viewModels.ItemReportReasonsViewModel;

public class ReportReasonsAdapter extends RecyclerView.Adapter<ReportReasonsAdapter.MenuView> {
    List<ReportData> reportDataList;
    Context context;

    public MutableLiveData<Object> liveData = new MutableLiveData<>();

    public ReportReasonsAdapter() {
        this.reportDataList = new ArrayList<>();
    }


    public List<ReportData> getReportDataList() {
        return reportDataList;
    }

    @NonNull
    @Override
    public MenuView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_size,
                parent, false);
        this.context = parent.getContext();
        return new MenuView(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final MenuView holder, final int position) {
        ReportData menuModel = reportDataList.get(position);
        ItemReportReasonsViewModel itemMenuViewModel = new ItemReportReasonsViewModel(menuModel);
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<ReportData> dataList) {
        this.reportDataList.clear();
        reportDataList.addAll(dataList);
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
        return reportDataList.size();
    }

    public class MenuView extends RecyclerView.ViewHolder {
        public ItemSizeBinding itemMenuBinding;

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

        void setViewModel(ItemReportReasonsViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
