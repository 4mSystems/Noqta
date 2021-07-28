package grand.app.aber_provider.pages.home.adapters;

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
import grand.app.aber_provider.pages.auth.models.UserData;
import grand.app.aber_provider.pages.home.models.PostData;
import grand.app.aber_provider.pages.home.viewModels.ItemHomeViewModel;
import grand.app.aber_provider.pages.myOrders.MyServicesOrdersFragment;
import grand.app.aber_provider.pages.packages.ProductDetailsFragment;
import grand.app.aber_provider.pages.postDetails.LiveDetailsFragment;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.PopUp.PopUp;
import grand.app.aber_provider.utils.helper.MovementHelper;
import grand.app.aber_provider.utils.resources.ResourceManager;
import grand.app.aber_provider.utils.session.UserHelper;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.MenuView> {
    List<PostData> postDataList;
    private Context context;
    public int lastSelected = -1;
    public int lastPosition = -1;
    public int isPostShare = 0;
    public UserData userProfile;
    public MutableLiveData<Object> liveData = new MutableLiveData<>();

    public PostsAdapter() {
        this.postDataList = new ArrayList<>();
    }


    public List<PostData> getPostDataList() {
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
    public void onBindViewHolder(@NonNull final MenuView holder, final int position) {
        PostData menuModel = postDataList.get(position);
        menuModel.setShare(isPostShare);
        menuModel.setUserProfile(userProfile);
        ItemHomeViewModel itemMenuViewModel = new ItemHomeViewModel(menuModel);
        itemMenuViewModel.getLiveData().observe(((LifecycleOwner) context), o -> {
            this.lastSelected = menuModel.getId();
            this.lastPosition = position;
            if (o.equals(Constants.POST_DETAILS)) {
                MovementHelper.startActivityForResultWithBundle(MovementHelper.unwrap(context), new PassingObject(menuModel.getId()), menuModel.getTitle(), ProductDetailsFragment.class.getName(), Constants.POST_DETAILS_REQUEST);
            } else if (o.equals(Constants.LIVE_TIME)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(menuModel.getId()), menuModel.getTitle(), LiveDetailsFragment.class.getName(), Constants.POST_DETAILS_REQUEST);
            } else if (o.equals(Constants.PROFILE)) {
                MovementHelper.startActivityWithBundle(context, new PassingObject(menuModel.getUser().getId()), null, MyServicesOrdersFragment.class.getName(), null);
            } else if (o.equals(Constants.DELETE)) {
                showPostOption(holder);
            } else if (o.equals(Constants.SHARE_POST)) {
                liveData.setValue(o);
            }

        });

        holder.setViewModel(itemMenuViewModel);
    }

    private void showPostOption(MenuView holder) {
        List<PopUp> popUpList = new ArrayList<>();
        if (getPostDataList().get(lastPosition).getShare() == 0 && UserHelper.getInstance(context).getUserData().getId() == getPostDataList().get(lastPosition).getUser().getId() && getPostDataList().get(lastPosition).getLiveStream() == 0) {
            popUpList.add(new PopUp(ResourceManager.getString(R.string.edit), 1));
        }
        if (UserHelper.getInstance(context).getUserData().getId() == getPostDataList().get(lastPosition).getUser().getId())
            popUpList.add(new PopUp(ResourceManager.getString(R.string.remove), 2));
        if (getPostDataList().get(lastPosition).getUser().getId() != UserHelper.getInstance(context).getUserData().getId())
            popUpList.add(new PopUp(ResourceManager.getString(R.string.hide), 3));
//        PopUpMenuHelper.showPostOptionPopUp(context, holder.itemMenuBinding.icClosePage, popUpList).
//                setOnMenuItemClickListener(item -> {
//                    if (popUpList.get(item.getItemId()).getId() == 2)
//                        liveData.setValue(Constants.DELETE);
//                    else if (popUpList.get(item.getItemId()).getId() == 3)
//                        liveData.setValue(Constants.HIDE_POST);
//                    else
//                        MovementHelper.startActivityForResultWithBundle(context, new PassingObject(getPostDataList().get(lastPosition)), null, NewPostFragment.class.getName(), Constants.NEW_POST_REQUEST);
//                    return false;
//                });
    }

    public void update(List<PostData> dataList) {
        this.postDataList.clear();
        postDataList.addAll(dataList);
        notifyDataSetChanged();
    }

    public void loadMore(@NotNull List<PostData> dataList) {
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
