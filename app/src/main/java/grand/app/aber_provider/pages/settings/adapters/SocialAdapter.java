package grand.app.aber_provider.pages.settings.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import grand.app.aber_provider.R;
import grand.app.aber_provider.databinding.ItemSocialBinding;
import grand.app.aber_provider.pages.settings.models.SocialMediaData;
import grand.app.aber_provider.pages.settings.viewModels.ItemSocialViewModel;
import grand.app.aber_provider.utils.helper.AppHelper;

public class SocialAdapter extends RecyclerView.Adapter<SocialAdapter.MenuView> {
    List<SocialMediaData> socialMediaDataList;
    private Context context;

    public SocialAdapter() {
        this.socialMediaDataList = new ArrayList<>();
    }

    @NonNull
    @Override
    public MenuView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_social,
                parent, false);
        this.context = parent.getContext();
        return new MenuView(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final MenuView holder, @SuppressLint("RecyclerView") final int position) {
        SocialMediaData menuModel = socialMediaDataList.get(position);
        ItemSocialViewModel itemMenuViewModel = new ItemSocialViewModel(menuModel);
        itemMenuViewModel.getLiveData().observe(((LifecycleOwner) context), o -> {
            if (TextUtils.isDigitsOnly(menuModel.getLink()))
                AppHelper.openWhats(((Activity) context), menuModel.getLink());
            else
                AppHelper.openBrowser(context, menuModel.getLink());
        });
        holder.setViewModel(itemMenuViewModel);
    }

    public void update(List<SocialMediaData> dataList) {
        this.socialMediaDataList.clear();
        socialMediaDataList.addAll(dataList);
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
        return socialMediaDataList.size();
    }

    public class MenuView extends RecyclerView.ViewHolder {
        public ItemSocialBinding itemMenuBinding;

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

        void setViewModel(ItemSocialViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
