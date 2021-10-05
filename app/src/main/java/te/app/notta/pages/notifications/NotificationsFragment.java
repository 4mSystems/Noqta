package te.app.notta.pages.notifications;


import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import javax.inject.Inject;

import te.app.notta.R;
import te.app.notta.base.BaseFragment;
import te.app.notta.base.IApplicationComponent;
import te.app.notta.base.MyApplication;
import te.app.notta.databinding.FragmentNotificationsBinding;
import te.app.notta.model.base.Mutable;
import te.app.notta.pages.notifications.models.NotificationsResponse;
import te.app.notta.pages.notifications.viewModels.NotificationsViewModels;
import te.app.notta.utils.Constants;

public class NotificationsFragment extends BaseFragment {
    FragmentNotificationsBinding notificationsBinding;
    @Inject
    NotificationsViewModels notificationsViewModels;

    public NotificationsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        notificationsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_notifications, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        notificationsBinding.setNotifyViewModel(notificationsViewModels);
        notificationsViewModels.notifications(1, true);
        setEvent();
        return notificationsBinding.getRoot();
    }

    private void setEvent() {
        notificationsViewModels.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.NOTIFICATIONS.equals(((Mutable) o).message)) {
                notificationsViewModels.setNotificationsPaginate(((NotificationsResponse) ((Mutable) o).object).getNotificationsPaginate());
            }
        });
        notificationsBinding.rcNotifications.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (!notificationsViewModels.searchProgressVisible.get() && !TextUtils.isEmpty(notificationsViewModels.getNotificationsPaginate().getNextPageUrl())) {
                    if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == notificationsViewModels.getNotificationsAdapter().getItemCount() - 1) {
                        notificationsViewModels.searchProgressVisible.set(true);
                        notificationsViewModels.notifications((notificationsViewModels.getNotificationsPaginate().getCurrentPage() + 1), false);
                    }
                }
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        notificationsViewModels.getSettingsRepository().setLiveData(notificationsViewModels.liveData);
    }
}
