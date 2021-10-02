package te.app.notta.pages.groupDetails.adapters;

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
import te.app.notta.PassingObject;
import te.app.notta.R;
import te.app.notta.databinding.ItemHorMemberBinding;
import te.app.notta.databinding.ItemMemberBinding;
import te.app.notta.pages.groupDetails.StudentTasksFragment;
import te.app.notta.pages.groupDetails.models.details.StudentsItem;
import te.app.notta.pages.groupDetails.viewModels.ItemGroupStudentViewModel;
import te.app.notta.utils.Constants;
import te.app.notta.utils.helper.MovementHelper;

public class GroupDetailsStudentsAdapter extends RecyclerView.Adapter<GroupDetailsStudentsAdapter.ViewHolder> {
    List<StudentsItem> studentsItemList;
    Context context;
    boolean isStudentGroup;

    public GroupDetailsStudentsAdapter() {
        this.studentsItemList = new ArrayList<>();
    }

    public List<StudentsItem> getStudentsItemList() {
        return studentsItemList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(isStudentGroup ? R.layout.item_hor_member : R.layout.item_member,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        StudentsItem item = studentsItemList.get(position);
        ItemGroupStudentViewModel itemMenuViewModel = new ItemGroupStudentViewModel(item);
        itemMenuViewModel.getLiveData().observeForever(o -> {
            if (o.equals(Constants.SHOW_ANSWERS)) {
                MovementHelper.startActivityWithBundle(context, new PassingObject(item.getGroupId(), item.getStudentId(), item.getStudentName()), null, StudentTasksFragment.class.getName(), null);
            }
        });
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<StudentsItem> dataList, boolean isStudentGroup) {
        this.studentsItemList.clear();
        this.isStudentGroup = isStudentGroup;
        studentsItemList.addAll(dataList);
        notifyDataSetChanged();
    }

    public void loadMore(@NotNull List<StudentsItem> dataList) {
        int start = studentsItemList.size();
        studentsItemList.addAll(dataList);
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
        return studentsItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemHorMemberBinding itemMenuBinding;
        public ItemMemberBinding itemMemberBinding;

        ViewHolder(View itemView) {
            super(itemView);
            bind();
        }


        void bind() {
            if (isStudentGroup) {
                if (itemMenuBinding == null) {
                    itemMenuBinding = DataBindingUtil.bind(itemView);
                }
            } else {
                if (itemMemberBinding == null) {
                    itemMemberBinding = DataBindingUtil.bind(itemView);
                }
            }
        }

        void unbind() {
            if (isStudentGroup) {
                if (itemMenuBinding != null) {
                    itemMenuBinding.unbind();
                }
            } else {
                if (itemMemberBinding != null) {
                    itemMemberBinding.unbind();
                }
            }
        }

        void setViewModel(ItemGroupStudentViewModel itemViewModels) {
            if (isStudentGroup) {
                if (itemMenuBinding != null) {
                    itemMenuBinding.setViewModel(itemViewModels);
                }
            } else {
                if (itemMemberBinding != null) {
                    itemMemberBinding.setViewModel(itemViewModels);
                }
            }
        }
    }
}
