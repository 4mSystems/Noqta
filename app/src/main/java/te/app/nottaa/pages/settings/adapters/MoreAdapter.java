package te.app.nottaa.pages.settings.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import te.app.nottaa.PassingObject;
import te.app.nottaa.R;
import te.app.nottaa.databinding.ItemMoreBindingImpl;
import te.app.nottaa.pages.settings.models.ProfileItem;
import te.app.nottaa.pages.settings.viewModels.ItemProfileViewModel;
import te.app.nottaa.utils.helper.MovementHelper;

public class MoreAdapter extends RecyclerView.Adapter<MoreAdapter.ViewHolder> {
    List<ProfileItem> profileItemList;
    Context context;

    public MoreAdapter() {
        this.profileItemList = new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_more,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        ProfileItem item = profileItemList.get(position);
        ItemProfileViewModel itemMenuViewModel = new ItemProfileViewModel(item);
        itemMenuViewModel.getLiveData().observeForever(o -> {
            if (item.getFragment() != null)
                MovementHelper.startActivityWithBundle(context, new PassingObject(item.getId()), null, item.getFragment(), null);

        });
        if (position == profileItemList.size() - 1)
            holder.itemMenuBinding.vLine.setVisibility(View.INVISIBLE);
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<ProfileItem> dataList) {
        this.profileItemList.clear();
        profileItemList.addAll(dataList);
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
        return profileItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemMoreBindingImpl itemMenuBinding;

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

        void setViewModel(ItemProfileViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setViewModel(itemViewModels);
            }
        }
    }
}
