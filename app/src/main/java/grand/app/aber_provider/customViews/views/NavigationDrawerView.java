package grand.app.aber_provider.customViews.views;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;

import grand.app.aber_provider.R;
import grand.app.aber_provider.customViews.actionbar.HomeActionBarView;
import grand.app.aber_provider.databinding.MenuBinding;
import grand.app.aber_provider.model.base.Mutable;

public class NavigationDrawerView extends RelativeLayout {
    public MutableLiveData<Mutable> liveData;
    public MenuBinding layoutNavigationDrawerBinding;
    AppCompatActivity context;
    HomeActionBarView homeActionBarView;
   MenuViewModel menuViewModel;

    public NavigationDrawerView(AppCompatActivity context) {
        super(context);
        this.context = context;
        liveData = new MutableLiveData<>();
        init();
    }

    public NavigationDrawerView(AppCompatActivity context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init();

    }

    public NavigationDrawerView(AppCompatActivity context, AttributeSet attrs, int defStyle) {
        super(context, attrs);
        this.context = context;
        init();
    }

    private void init() {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        layoutNavigationDrawerBinding = DataBindingUtil.inflate(layoutInflater, R.layout.menu, this, true);
        menuViewModel = new MenuViewModel();
        layoutNavigationDrawerBinding.setMenuViewModel(menuViewModel);
        setEvents();
    }

    public void setActionBar(HomeActionBarView homeActionBarView) {
        this.homeActionBarView = homeActionBarView;
    }

    private void setEvents() {
//        menuViewModel.getMenuAdapter().getLiveDataAdapter().observeForever(position -> {
//            layoutNavigationDrawerBinding.dlMainNavigationMenu.closeDrawer(GravityCompat.START);
//            if (position == 1) { // account
//                MovementHelper.startActivity(context, ProfileFragment.class.getName(), ResourceManager.getString(R.string.menuAccount), null);
//            } else if (position == 2) { // history
//                MovementHelper.startActivity(context, HistoryFragment.class.getName(), ResourceManager.getString(R.string.menuHistroy), null);
//            } else if (position == 3) {// notifications
//                MovementHelper.startActivity(context, NotificationsFragment.class.getName(), null, null);
//            } else if (position == 4) {// balance
//                MovementHelper.startActivity(context, PaymentFragment.class.getName(), ResourceManager.getString(R.string.menuPayment), null);
//            } else if (position == 5) {// privacy
//                MovementHelper.startActivity(context, TermsFragment.class.getName(), ResourceManager.getString(R.string.privacyUber), null);
//            } else if (position == 6) {// docs
//                MovementHelper.startActivity(context, DocumentsFragment.class.getName(), ResourceManager.getString(R.string.menu_document), null);
//            } else if (position == 7) {// cars
//                MovementHelper.startActivity(context, CarCategoriesFragment.class.getName(), ResourceManager.getString(R.string.menu_categries), null);
//            } else if (position == 8) {// About
//                MovementHelper.startActivity(context, AboutAppFragment.class.getName(), ResourceManager.getString(R.string.menu_about), null);
//            } else if (position == 9) {// logout
//                ((ParentActivity) context).handleActions(new Mutable(Constants.LOGOUT));
//            }
//        });

    }

}
