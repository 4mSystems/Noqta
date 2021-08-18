package grand.app.aber_provider.pages.auth.countries.adapters;

import android.annotation.SuppressLint;
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

import grand.app.aber_provider.R;
import grand.app.aber_provider.databinding.ItemCountryBinding;
import grand.app.aber_provider.pages.auth.countries.models.CountriesData;
import grand.app.aber_provider.pages.auth.countries.viewModels.CountriesItemViewModels;
import grand.app.aber_provider.utils.helper.MovementHelper;

public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.ViewHolder> {
    public List<CountriesData> countriesDataList;
    Context context;
    public int lastSelected = -1;
    public int lastPosition = -1;

    public CountriesAdapter() {
        countriesDataList = new ArrayList<>();
    }

    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country,
                parent, false);
        context = parent.getContext();
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        CountriesData dataModel = countriesDataList.get(position);
        CountriesItemViewModels homeItemViewModels = new CountriesItemViewModels(dataModel);
        homeItemViewModels.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> {
            lastSelected = dataModel.getId();
            this.lastPosition = position;
            notifyDataSetChanged();
        });
        dataModel.setSelected(lastSelected == dataModel.getId());
        holder.setViewModel(homeItemViewModels);
    }

    @Override
    public int getItemCount() {
        return this.countriesDataList.size();
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

    public void updateData(@NotNull List<CountriesData> data) {
        this.countriesDataList.clear();
        this.countriesDataList.addAll(data);
        if (data.size() > 0) {
            lastSelected = data.get(0).getId();
            lastPosition = 0;
        }
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemCountryBinding itemBinding;

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

        void setViewModel(CountriesItemViewModels itemViewModels) {
            if (itemBinding != null) {
                itemBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
