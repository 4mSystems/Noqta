package grand.app.aber_provider.pages.home.adapters;

import android.annotation.SuppressLint;
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

import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.R;
import grand.app.aber_provider.databinding.ItemHomeBinding;
import grand.app.aber_provider.pages.home.models.Orders;
import grand.app.aber_provider.pages.home.viewModels.ItemHomeViewModel;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.MovementHelper;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.MenuView> {
    List<Orders> postDataList;
    private Context context;
    public int lastSelected = -1;
    public int lastPosition = -1;
    public MutableLiveData<Object> liveData = new MutableLiveData<>();

    public OrderAdapter() {
        this.postDataList = new ArrayList<>();
    }


    public List<Orders> getPostDataList() {
        return postDataList;
    }

    @NonNull
    @Override
    public MenuView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home,
                parent, false);
        this.context = parent.getContext();
        return new MenuView(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final MenuView holder, @SuppressLint("RecyclerView") final int position) {
        Orders menuModel = postDataList.get(position);
        ItemHomeViewModel itemMenuViewModel = new ItemHomeViewModel(menuModel);
        itemMenuViewModel.getLiveData().observe(((LifecycleOwner) context), o -> {
            this.lastSelected = menuModel.getId();
            this.lastPosition = position;
            if (o.equals(Constants.ORDER_DETAILS)) {
//                MovementHelper.startActivityForResultWithBundle(MovementHelper.unwrap(context), new PassingObject(menuModel.getId()), menuModel.getServiceName(), Detai.class.getName(), Constants.POST_DETAILS_REQUEST);
            }
//            else if (o.equals(Constants.LIVE_TIME)) {
//                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(menuModel.getId()), menuModel.getTitle(), LiveDetailsFragment.class.getName(), Constants.POST_DETAILS_REQUEST);
//            } else if (o.equals(Constants.PROFILE)) {
//                MovementHelper.startActivityWithBundle(context, new PassingObject(menuModel.getUser().getId()), null, MyServicesOrdersFragment.class.getName(), null);
//            } else if (o.equals(Constants.DELETE)) {
//                showPostOption(holder);
//            } else if (o.equals(Constants.SHARE_POST)) {
//                liveData.setValue(o);
//            }

        });

        holder.setViewModel(itemMenuViewModel);
    }

    public void update(List<Orders> dataList) {
        this.postDataList.clear();
        postDataList.addAll(dataList);
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
        return postDataList.size();
    }

    public class MenuView extends RecyclerView.ViewHolder {
        public ItemHomeBinding itemMenuBinding;

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
