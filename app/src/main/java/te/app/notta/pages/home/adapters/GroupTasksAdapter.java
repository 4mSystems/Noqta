package te.app.notta.pages.home.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import te.app.notta.PassingObject;
import te.app.notta.R;
import te.app.notta.databinding.ItemRecentTaskBinding;
import te.app.notta.pages.addAnswer.AddAnswerFragment;
import te.app.notta.pages.home.models.details.StudentsItem;
import te.app.notta.pages.home.models.details.TasksItem;
import te.app.notta.pages.home.viewModels.ItemGroupTasksViewModel;
import te.app.notta.utils.Constants;
import te.app.notta.utils.helper.MovementHelper;

public class GroupTasksAdapter extends RecyclerView.Adapter<GroupTasksAdapter.ViewHolder> {
    List<TasksItem> tasksItemList;
    Context context;
    private int techId;
    public MutableLiveData<Object> liveData = new MutableLiveData<>();
    public int selectedId, lastPosition;

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
            if (o.equals(Constants.DELETE_TASK))
                liveData.setValue(item.getId());
            else if (o.equals(Constants.Add_ANSWER))
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(item.getId()), null, AddAnswerFragment.class.getName(), Constants.ADD_GROUP_REQUEST);
        });
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<TasksItem> dataList, int techId) {
        this.tasksItemList.clear();
        this.techId = techId;
        tasksItemList.addAll(dataList);
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
