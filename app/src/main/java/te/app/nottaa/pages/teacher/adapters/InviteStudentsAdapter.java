package te.app.nottaa.pages.teacher.adapters;

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
import te.app.nottaa.R;
import te.app.nottaa.databinding.ItemStudentInviteBinding;
import te.app.nottaa.pages.auth.models.UserData;
import te.app.nottaa.pages.teacher.viewModels.ItemStudentInviteViewModel;

public class InviteStudentsAdapter extends RecyclerView.Adapter<InviteStudentsAdapter.ViewHolder> {
    List<UserData> studentList;
    Context context;
    public List<Integer> selectedIds = new ArrayList<>();

    public InviteStudentsAdapter() {
        this.studentList = new ArrayList<>();
    }

    public List<UserData> getGroupItemList() {
        return studentList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student_invite,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        UserData item = studentList.get(position);
        ItemStudentInviteViewModel itemMenuViewModel = new ItemStudentInviteViewModel(item);
        itemMenuViewModel.getLiveData().observeForever(o -> {
            int index = findIndex(item.getId());
            if (index == -1)
                selectedIds.add(item.getId());
            else
                selectedIds.remove(index);
        });
        holder.setViewModel(itemMenuViewModel);
    }

    private int findIndex(int id) {
        for (int i = 0; i < selectedIds.size(); i++) {
            if (selectedIds.get(i) == id)
                return i;
        }
        return -1;
    }

    public void update(List<UserData> dataList) {
        this.studentList.clear();
        studentList.addAll(dataList);
        notifyDataSetChanged();
    }

    public void loadMore(@NotNull List<UserData> dataList) {
        int start = studentList.size();
        studentList.addAll(dataList);
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
        return studentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemStudentInviteBinding itemMenuBinding;

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

        void setViewModel(ItemStudentInviteViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setViewModel(itemViewModels);
            }
        }
    }
}
