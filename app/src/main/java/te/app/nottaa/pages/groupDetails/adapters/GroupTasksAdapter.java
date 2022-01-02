package te.app.nottaa.pages.groupDetails.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
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

import te.app.nottaa.PassingObject;
import te.app.nottaa.R;
import te.app.nottaa.databinding.ItemRecentTaskBinding;
import te.app.nottaa.pages.addAnswer.AddAnswerFragment;
import te.app.nottaa.pages.groupDetails.models.details.TasksItem;
import te.app.nottaa.pages.groupDetails.viewModels.ItemGroupTasksViewModel;
import te.app.nottaa.utils.Constants;
import te.app.nottaa.utils.helper.MovementHelper;

public class GroupTasksAdapter extends RecyclerView.Adapter<GroupTasksAdapter.ViewHolder> {
    List<TasksItem> tasksItemList;
    Context context;
    private int techId;
    public MutableLiveData<PassingObject> liveData = new MutableLiveData<>();
    public int selectedId, lastPosition;
    public String studentId;

    public GroupTasksAdapter() {
        this.tasksItemList = new ArrayList<>();
    }

    public List<TasksItem> getTasksItemList() {
        return tasksItemList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recent_task,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        TasksItem item = tasksItemList.get(position);
        item.setTech_id(techId);
        ItemGroupTasksViewModel itemMenuViewModel = new ItemGroupTasksViewModel(item);
        itemMenuViewModel.getLiveData().observeForever(o -> {
            selectedId = item.getId();
            lastPosition = position;
            if (o.equals(Constants.DELETE_TASK) || o.equals(Constants.TAKE_CHANCE))
                liveData.setValue(new PassingObject(item.getId(), String.valueOf(o)));
            else if (o.equals(Constants.Add_ANSWER))
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(item.getId(), String.valueOf(o)), null, AddAnswerFragment.class.getName(), Constants.ADD_GROUP_REQUEST);
            else if (o.equals(Constants.SHOW_ANSWERS))
                if (!TextUtils.isEmpty(studentId))
                    MovementHelper.startActivityForResultWithBundle(context, new PassingObject(item.getId(), String.valueOf(o), studentId), null, AddAnswerFragment.class.getName(), Constants.ADD_GROUP_REQUEST);

        });
        holder.setViewModel(itemMenuViewModel);
    }

    public void update(List<TasksItem> dataList, int techId) {
        this.tasksItemList.clear();
        this.techId = techId;
        tasksItemList.addAll(dataList);
    }

    public void loadMore(@NotNull List<TasksItem> dataList, int techId) {
        this.techId = techId;
        int start = tasksItemList.size();
        tasksItemList.addAll(dataList);
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
        return tasksItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemRecentTaskBinding itemMenuBinding;

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

        void setViewModel(ItemGroupTasksViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setViewModel(itemViewModels);
            }
        }
    }
}
