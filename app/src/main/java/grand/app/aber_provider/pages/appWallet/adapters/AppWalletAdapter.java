package grand.app.aber_provider.pages.appWallet.adapters;

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

import grand.app.aber_provider.R;
import grand.app.aber_provider.databinding.ItemWalletHistoryBinding;
import grand.app.aber_provider.pages.appWallet.models.WalletHistoryItem;
import grand.app.aber_provider.pages.appWallet.viewModels.ItemAppWalletHistoryViewModel;


public class AppWalletAdapter extends RecyclerView.Adapter<AppWalletAdapter.MenuView> {
    List<WalletHistoryItem> walletHistoryItemList;
    Context context;
    String balance;

    public AppWalletAdapter() {
        this.walletHistoryItemList = new ArrayList<>();
    }

    @NonNull
    @Override
    public MenuView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_wallet_history,
                parent, false);
        this.context = parent.getContext();
        return new MenuView(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final MenuView holder, final int position) {
        WalletHistoryItem menuModel = walletHistoryItemList.get(position);
        menuModel.setBalance(balance);
        ItemAppWalletHistoryViewModel itemMenuViewModel = new ItemAppWalletHistoryViewModel(menuModel);
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<WalletHistoryItem> dataList, String balance) {
        this.balance = balance;
        this.walletHistoryItemList.clear();
        walletHistoryItemList.addAll(dataList);
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
        return walletHistoryItemList.size();
    }

    public class MenuView extends RecyclerView.ViewHolder {
        public ItemWalletHistoryBinding itemMenuBinding;

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

        void setViewModel(ItemAppWalletHistoryViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemWalletViewModel(itemViewModels);
            }
        }
    }
}
