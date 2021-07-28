package grand.app.aber_provider.pages.myLocations.adapters;

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
import grand.app.aber_provider.databinding.ItemMyLocationBinding;
import grand.app.aber_provider.pages.myLocations.models.LocationsData;
import grand.app.aber_provider.pages.myLocations.viewModels.LocationsItemViewModels;

public class LocationsAdapters extends RecyclerView.Adapter<LocationsAdapters.ViewHolder> {
    public List<LocationsData> locationsDataList;
    Context context;
    public MutableLiveData<LocationsData> locationsDataMutableLiveData = new MutableLiveData<>();
    public int position;

    public LocationsAdapters() {
        locationsDataList = new ArrayList<>();
    }


    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_my_location,
                parent, false);
        context = parent.getContext();
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        LocationsData dataModel = locationsDataList.get(position);
        LocationsItemViewModels homeItemViewModels = new LocationsItemViewModels(dataModel);
        homeItemViewModels.getLiveData().observe((LifecycleOwner) context, o -> {
//            if (o.equals(Constants.EDIT))
//                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(dataModel), ResourceManager.getString(R.string.edit_location), AddPlaceFragment.class.getName(), null);
//            else if (o.equals(Constants.DELETE)) {
//                this.position = position;
//                locationsDataMutableLiveData.setValue(dataModel);
//            } else if (o.equals(Constants.MENu)) {
//                UserHelper.getInstance(context).saveLastKnownLocation(dataModel);
//                notifyDataSetChanged();
//            }
        });
//        if (position == 0 && UserHelper.getInstance(context).getSaveLastKnownLocation() == null)
//            UserHelper.getInstance(context).saveLastKnownLocation(dataModel);
//        holder.itemBinding.radio.setChecked(dataModel.getId() == UserHelper.getInstance(context).getSaveLastKnownLocation().getId());
        holder.setViewModel(homeItemViewModels);
    }

    @Override
    public int getItemCount() {
        return this.locationsDataList.size();
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

    public void updateData(@NotNull List<LocationsData> data) {
        this.locationsDataList.clear();
        this.locationsDataList.addAll(data);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemMyLocationBinding itemBinding;

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

        void setViewModel(LocationsItemViewModels itemViewModels) {
            if (itemBinding != null) {
                itemBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
