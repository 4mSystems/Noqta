package grand.app.aber_provider.customViews.views;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;

import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.R;
import grand.app.aber_provider.activity.MainActivity;
import grand.app.aber_provider.base.ParentActivity;
import grand.app.aber_provider.customViews.actionbar.HomeActionBarView;
import grand.app.aber_provider.databinding.MenuBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.home.HomeFragment;
import grand.app.aber_provider.pages.settings.AboutAppFragment;
import grand.app.aber_provider.pages.settings.ContactUsFragment;
import grand.app.aber_provider.pages.settings.MyAccountSettingsFragment;
import grand.app.aber_provider.pages.settings.TermsFragment;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.MovementHelper;
import grand.app.aber_provider.utils.resources.ResourceManager;

public class NavigationDrawerView extends RelativeLayout {
    public MutableLiveData<Mutable> liveData;
    public MenuBinding layoutNavigationDrawerBinding;
    AppCompatActivity context;
    HomeActionBarView homeActionBarView;
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

    public void setActionBar(HomeActionBarView homeActionBarView) {
        this.homeActionBarView = homeActionBarView;
    }

    private void setEvents() {
        menuViewModel.getLiveData().observe(context, o -> {
            ((MainActivity) context).menuBuilder.closeMenu(true);
            Mutable mutable = (Mutable) o;
            ((ParentActivity) context).handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.MENU_HOME:
                    ((MainActivity) context).setHomeActionTitle(getResources().getString(R.string.menuHome), "Visible");
                    MovementHelper.replaceFragment(context, new HomeFragment(), "");
                    break;
                case Constants.MORE:
                    MovementHelper.startActivityWithBundle(context, new PassingObject(Constants.MORE), ResourceManager.getString(R.string.more), MyAccountSettingsFragment.class.getName(), null);
                    break;
                case Constants.MENU_ACCOUNT:
                    MovementHelper.startActivityWithBundle(context, new PassingObject(Constants.MENU_ACCOUNT), ResourceManager.getString(R.string.menu_account), MyAccountSettingsFragment.class.getName(), null);
                    break;
//                case Constants.SUGGESTION:
//                    MovementHelper.startActivityWithBundle(context, new PassingObject(Constants.SUGGESTION), ResourceManager.getString(R.string.tv_account_suggest), ContactUsFragment.class.getName(), null);
//                    break;
//                case Constants.CONTACT:
//                    MovementHelper.startActivityWithBundle(context, new PassingObject(Constants.CONTACT), ResourceManager.getString(R.string.tv_account_contact), ContactUsFragment.class.getName(), null);
//                    break;
//                case Constants.MENU_ACCOUNT:
//                    MovementHelper.startActivity(context, MyAccountSettingsFragment.class.getName(), ResourceManager.getString(R.string.menu_account), null);
//                    break;
//                case Constants.SOCIAL:
//                    MovementHelper.startActivity(context, SocialMediaFragment.class.getName(), ResourceManager.getString(R.string.social_media), null);
//                    break;
//                case Constants.CART:
//                    MovementHelper.startActivity(context, CartFragment.class.getName(), ResourceManager.getString(R.string.menuCart), null);
//                    break;
//                case Constants.FAVORITE:
//                    MovementHelper.startActivity(context, FavoritesFragment.class.getName(), ResourceManager.getString(R.string.menuFavorite), null);
//                    break;
//                case Constants.COUNTRIES:
//                    MovementHelper.startActivity(context, CountriesFragment.class.getName(), ResourceManager.getString(R.string.country), null);
//                    break;
//                case Constants.SERVICES:
//                    MovementHelper.startActivity(context, MyServicesOrdersFragment.class.getName(), ResourceManager.getString(R.string.my_services), null);
//                    break;
//                case Constants.LANGUAGE:
//                    MovementHelper.startActivity(context, LangFragment.class.getName(), ResourceManager.getString(R.string.change_lang), null);
//                    break;

            }
        });
    }

}
