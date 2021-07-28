package grand.app.aber_provider.pages.postDetails.adapters;

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
import grand.app.aber_provider.databinding.ItemOrderConfirmedBinding;
import grand.app.aber_provider.pages.home.models.commentsAndReplies.Comments;
import grand.app.aber_provider.pages.postDetails.viewModels.ItemCommentsViewModel;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.PopUp.PopUp;
import grand.app.aber_provider.utils.PopUp.PopUpMenuHelper;
import grand.app.aber_provider.utils.resources.ResourceManager;

public class CommentsAdapter extends RecyclerView.Adapter<CommentsAdapter.MenuView> {
    List<Comments> commentsList;
    private Context context;
    public int lastSelected = -1;
    public int lastPosition = -1;
    public int postId;
    public boolean isVisible = true;
    public MutableLiveData<Object> liveData = new MutableLiveData<>();

    public List<Comments> getCommentsList() {
        return commentsList;
    }

    public CommentsAdapter() {
        this.commentsList = new ArrayList<>();
    }

    @NonNull
    @Override
    public MenuView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_order_confirmed,
                parent, false);
        this.context = parent.getContext();
        return new MenuView(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final MenuView holder, final int position) {
        Comments menuModel = commentsList.get(position);
        menuModel.setVisible(isVisible);
        menuModel.setPostId(postId);
        ItemCommentsViewModel itemMenuViewModel = new ItemCommentsViewModel(menuModel);
        holder.setViewModel(itemMenuViewModel);
    }

    public void newComment(Comments comments) {
        getCommentsList().add(0, comments);
        notifyDataSetChanged();
    }

    public void updateComment(Comments comments) {
        if (lastPosition != -1) {
            getCommentsList().set(lastPosition, comments);
            notifyItemChanged(lastPosition);
        }
    }

    public void removeComment() {
        if (lastPosition != -1) {
            getCommentsList().remove(lastPosition);
            notifyDataSetChanged();
        }
    }

    private void showPostOption(View view) {
        List<PopUp> popUpList = new ArrayList<>();
        popUpList.add(new PopUp(ResourceManager.getString(R.string.edit), 1));
        popUpList.add(new PopUp(ResourceManager.getString(R.string.remove), 2));
        PopUpMenuHelper.showPostOptionPopUp(context, view, popUpList).
                setOnMenuItemClickListener(item -> {
                    if (popUpList.get(item.getItemId()).getId() == 2)
                        liveData.setValue(Constants.DELETE);
                    else
                        liveData.setValue(Constants.EDIT);
                    return false;
                });
    }

    public void update(@NonNull List<Comments> dataList) {
        this.commentsList.clear();
        commentsList.addAll(dataList);
        notifyDataSetChanged();
    }

    public void loadMore(@NotNull List<Comments> dataList) {
        int start = commentsList.size();
        commentsList.addAll(dataList);
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
        return commentsList.size();
    }

    public class MenuView extends RecyclerView.ViewHolder {
        public ItemOrderConfirmedBinding itemMenuBinding;

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

        void setViewModel(ItemCommentsViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
