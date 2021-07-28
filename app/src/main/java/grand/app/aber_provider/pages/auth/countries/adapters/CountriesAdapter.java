package grand.app.aber_provider.pages.auth.countries.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import grand.app.aber_provider.R;
import grand.app.aber_provider.databinding.ItemServiceBinding;
import grand.app.aber_provider.pages.auth.countries.models.UserCertificatesItem;
import grand.app.aber_provider.pages.auth.countries.viewModels.CountriesItemViewModels;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.MovementHelper;

public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.ViewHolder> {
    public List<UserCertificatesItem> membersDataList;
    Context context;
    public boolean isRemoved = false;
    public MutableLiveData<Object> certLiveData = new MutableLiveData<>();
    public int lastPosition;

    public CountriesAdapter() {
        membersDataList = new ArrayList<>();
    }


    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_service,
                parent, false);
        context = parent.getContext();
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        UserCertificatesItem dataModel = membersDataList.get(position);
        dataModel.setRemoved(isRemoved);
        CountriesItemViewModels homeItemViewModels = new CountriesItemViewModels(dataModel);
        homeItemViewModels.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> {
            lastPosition = position;
            if (o.equals(Constants.DELETE)) {
                membersDataList.remove(position);
                notifyDataSetChanged();
            }
            certLiveData.setValue(o);
        });
        holder.setViewModel(homeItemViewModels);
    }

    @Override
    public int getItemCount() {
        return this.membersDataList.size();
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

    public void updateData(@NotNull List<UserCertificatesItem> data) {
        this.membersDataList.clear();
        this.membersDataList.addAll(data);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemServiceBinding itemBinding;

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
                itemBinding.setItemOrderViewModel(itemViewModels);
            }
        }
    }
}
