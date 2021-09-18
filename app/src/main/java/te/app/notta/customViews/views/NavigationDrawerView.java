package te.app.notta.customViews.views;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;
import te.app.notta.R;
import te.app.notta.databinding.MenuBinding;
import te.app.notta.model.base.Mutable;

public class NavigationDrawerView extends RelativeLayout {
    public MutableLiveData<Mutable> liveData;
    public MenuBinding layoutNavigationDrawerBinding;
    AppCompatActivity context;
    public MenuViewModel menuViewModel;

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

    private void setEvents() {
        menuViewModel.getLiveData().observe(context, o -> {
//            ((MainActivity) context).menuBuilder.closeMenu(true);
//            Mutable mutable = (Mutable) o;
//            ((ParentActivity) context).handleActions(mutable);
//            switch (((Mutable) o).message) {
//                case Constants.MENU_HOME:
//                    ((MainActivity) context).setHomeActionTitle(getResources().getString(R.string.menuHome), "Visible");
//                    MovementHelper.replaceFragment(context, new HomeFragment(), "");
//                    break;
//                case Constants.MORE:
//                    MovementHelper.startActivityWithBundle(context, new PassingObject(Constants.MORE), ResourceManager.getString(R.string.more), MyAccountSettingsFragment.class.getName(), null);
//                    break;
//                case Constants.MENU_ACCOUNT:
//                    MovementHelper.startActivityWithBundle(context, new PassingObject(Constants.MENU_ACCOUNT), ResourceManager.getString(R.string.menu_account), MyAccountSettingsFragment.class.getName(), null);
//                    break;
//                case Constants.COUNTRIES:
//                    MovementHelper.startActivity(context, CountriesFragment.class.getName(), ResourceManager.getString(R.string.country), null);
//                    break;
//                case Constants.CITIES:
//                    MovementHelper.startActivity(context, CitiesFragment.class.getName(), ResourceManager.getString(R.string.register_city_hint), null);
//                    break;
//                case Constants.LANGUAGE:
//                    MovementHelper.startActivity(context, LangFragment.class.getName(), ResourceManager.getString(R.string.lang), null);
//                    break;
//                case Constants.MY_ORDERS:
//                    MovementHelper.startActivityWithBundle(context, new PassingObject(Constants.CURRENT), ResourceManager.getString(R.string.current), MyServicesOrdersFragment.class.getName(), null);
//                    break;
//                case Constants.PREVIOUS:
//                    MovementHelper.startActivityWithBundle(context, new PassingObject(Constants.LAST), ResourceManager.getString(R.string.previous), MyServicesOrdersFragment.class.getName(), null);
//                    break;
//                case Constants.NOTIFICATIONS:
//                    MovementHelper.startActivity(context, NotificationsFragment.class.getName(), ResourceManager.getString(R.string.notifications), null);
//                    break;

//            }
        });
    }

}
