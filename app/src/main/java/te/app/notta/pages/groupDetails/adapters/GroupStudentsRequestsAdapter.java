package te.app.notta.pages.groupDetails.adapters;

import android.annotation.SuppressLint;
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

import te.app.notta.PassingObject;
import te.app.notta.R;
import te.app.notta.databinding.ItemStudentRequestBinding;
import te.app.notta.pages.groupDetails.StudentTasksFragment;
import te.app.notta.pages.groupDetails.models.details.StudentsItem;
import te.app.notta.pages.groupDetails.viewModels.ItemGroupStudentViewModel;
import te.app.notta.utils.Constants;
import te.app.notta.utils.helper.MovementHelper;

public class GroupStudentsRequestsAdapter extends RecyclerView.Adapter<GroupStudentsRequestsAdapter.ViewHolder> {
    List<StudentsItem> studentsItemList;
    Context context;
    private int lastSelected = -1;
    public MutableLiveData<PassingObject> liveData = new MutableLiveData<>();

    public GroupStudentsRequestsAdapter() {
        this.studentsItemList = new ArrayList<>();
    }

    public List<StudentsItem> getStudentsItemList() {
        return studentsItemList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student_request,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        StudentsItem item = studentsItemList.get(position);
        ItemGroupStudentViewModel itemMenuViewModel = new ItemGroupStudentViewModel(item);
        itemMenuViewModel.getLiveData().observeForever(o -> {
            lastSelected = position;
            if (o.equals(Constants.ACCEPT) || o.equals(Constants.REJECT)) {
                liveData.setValue(new PassingObject(item.getGroupId(), item.getStudentId(), String.valueOf(o)));
            }
        });
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<StudentsItem> dataList) {
        this.studentsItemList.clear();
        studentsItemList.addAll(dataList);
        notifyDataSetChanged();
    }

    public void loadMore(@NotNull List<StudentsItem> dataList) {
        int start = studentsItemList.size();
        studentsItemList.addAll(dataList);
        notifyItemRangeInserted(start, dataList.size());
    }

    public void removeItem() {
        getStudentsItemList().remove(lastSelected);
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
        return studentsItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemStudentRequestBinding itemMenuBinding;

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

        void setViewModel(ItemGroupStudentViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setViewModel(itemViewModels);
            }
        }
    }
}
