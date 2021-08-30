package grand.app.aber_provider;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import grand.app.aber_provider.databinding.ActivityBaseBindingImpl;
import grand.app.aber_provider.databinding.ActivityMainBindingImpl;
import grand.app.aber_provider.databinding.ActivityMapAddressBindingImpl;
import grand.app.aber_provider.databinding.ChangeDialogBindingImpl;
import grand.app.aber_provider.databinding.ExistLayoutBindingImpl;
import grand.app.aber_provider.databinding.FragmentAboutBindingImpl;
import grand.app.aber_provider.databinding.FragmentAppWalletBindingImpl;
import grand.app.aber_provider.databinding.FragmentChangePasswordBindingImpl;
import grand.app.aber_provider.databinding.FragmentCitiesBindingImpl;
import grand.app.aber_provider.databinding.FragmentConfirmCodeBindingImpl;
import grand.app.aber_provider.databinding.FragmentContactBindingImpl;
import grand.app.aber_provider.databinding.FragmentCountriesBindingImpl;
import grand.app.aber_provider.databinding.FragmentEditProfileBindingImpl;
import grand.app.aber_provider.databinding.FragmentFollowUpOrdersBindingImpl;
import grand.app.aber_provider.databinding.FragmentForgetPasswordBindingImpl;
import grand.app.aber_provider.databinding.FragmentHomeBindingImpl;
import grand.app.aber_provider.databinding.FragmentLangBindingImpl;
import grand.app.aber_provider.databinding.FragmentLoginBindingImpl;
import grand.app.aber_provider.databinding.FragmentMyAccountSettingsBindingImpl;
import grand.app.aber_provider.databinding.FragmentNotificationsBindingImpl;
import grand.app.aber_provider.databinding.FragmentOnboardBindingImpl;
import grand.app.aber_provider.databinding.FragmentOrderDetailsBindingImpl;
import grand.app.aber_provider.databinding.FragmentPackagesBindingImpl;
import grand.app.aber_provider.databinding.FragmentRegisterBindingImpl;
import grand.app.aber_provider.databinding.FragmentRegisterDocumentsBindingImpl;
import grand.app.aber_provider.databinding.FragmentRegisterServicesBindingImpl;
import grand.app.aber_provider.databinding.FragmentServicesOrdersBindingImpl;
import grand.app.aber_provider.databinding.FragmentSocialMediaBindingImpl;
import grand.app.aber_provider.databinding.FragmentSplashBindingImpl;
import grand.app.aber_provider.databinding.FragmentTermsBindingImpl;
import grand.app.aber_provider.databinding.ItemAuthServicesBindingImpl;
import grand.app.aber_provider.databinding.ItemContactBindingImpl;
import grand.app.aber_provider.databinding.ItemCountryBindingImpl;
import grand.app.aber_provider.databinding.ItemExtraServicesBindingImpl;
import grand.app.aber_provider.databinding.ItemHomeBindingImpl;
import grand.app.aber_provider.databinding.ItemOrderOptionsDetailsBindingImpl;
import grand.app.aber_provider.databinding.ItemPackageBindingImpl;
import grand.app.aber_provider.databinding.ItemRequiredServiceBindingImpl;
import grand.app.aber_provider.databinding.ItemSocialBindingImpl;
import grand.app.aber_provider.databinding.ItemSocialMenuBindingImpl;
import grand.app.aber_provider.databinding.ItemWalletHistoryBindingImpl;
import grand.app.aber_provider.databinding.LayoutActionBarBackBindingImpl;
import grand.app.aber_provider.databinding.LayoutActionBarHomeBindingImpl;
import grand.app.aber_provider.databinding.LayoutGrandBindingImpl;
import grand.app.aber_provider.databinding.MenuBindingImpl;
import grand.app.aber_provider.databinding.NotifyItemBindingImpl;
import grand.app.aber_provider.databinding.OptionDialogBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYBASE = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_ACTIVITYMAPADDRESS = 3;

  private static final int LAYOUT_CHANGEDIALOG = 4;

  private static final int LAYOUT_EXISTLAYOUT = 5;

  private static final int LAYOUT_FRAGMENTABOUT = 6;

  private static final int LAYOUT_FRAGMENTAPPWALLET = 7;

  private static final int LAYOUT_FRAGMENTCHANGEPASSWORD = 8;

  private static final int LAYOUT_FRAGMENTCITIES = 9;

  private static final int LAYOUT_FRAGMENTCONFIRMCODE = 10;

  private static final int LAYOUT_FRAGMENTCONTACT = 11;

  private static final int LAYOUT_FRAGMENTCOUNTRIES = 12;

  private static final int LAYOUT_FRAGMENTEDITPROFILE = 13;

  private static final int LAYOUT_FRAGMENTFOLLOWUPORDERS = 14;

  private static final int LAYOUT_FRAGMENTFORGETPASSWORD = 15;

  private static final int LAYOUT_FRAGMENTHOME = 16;

  private static final int LAYOUT_FRAGMENTLANG = 17;

  private static final int LAYOUT_FRAGMENTLOGIN = 18;

  private static final int LAYOUT_FRAGMENTMYACCOUNTSETTINGS = 19;

  private static final int LAYOUT_FRAGMENTNOTIFICATIONS = 20;

  private static final int LAYOUT_FRAGMENTONBOARD = 21;

  private static final int LAYOUT_FRAGMENTORDERDETAILS = 22;

  private static final int LAYOUT_FRAGMENTPACKAGES = 23;

  private static final int LAYOUT_FRAGMENTREGISTER = 24;

  private static final int LAYOUT_FRAGMENTREGISTERDOCUMENTS = 25;

  private static final int LAYOUT_FRAGMENTREGISTERSERVICES = 26;

  private static final int LAYOUT_FRAGMENTSERVICESORDERS = 27;

  private static final int LAYOUT_FRAGMENTSOCIALMEDIA = 28;

  private static final int LAYOUT_FRAGMENTSPLASH = 29;

  private static final int LAYOUT_FRAGMENTTERMS = 30;

  private static final int LAYOUT_ITEMAUTHSERVICES = 31;

  private static final int LAYOUT_ITEMCONTACT = 32;

  private static final int LAYOUT_ITEMCOUNTRY = 33;

  private static final int LAYOUT_ITEMEXTRASERVICES = 34;

  private static final int LAYOUT_ITEMHOME = 35;

  private static final int LAYOUT_ITEMORDEROPTIONSDETAILS = 36;

  private static final int LAYOUT_ITEMPACKAGE = 37;

  private static final int LAYOUT_ITEMREQUIREDSERVICE = 38;

  private static final int LAYOUT_ITEMSOCIAL = 39;

  private static final int LAYOUT_ITEMSOCIALMENU = 40;

  private static final int LAYOUT_ITEMWALLETHISTORY = 41;

  private static final int LAYOUT_LAYOUTACTIONBARBACK = 42;

  private static final int LAYOUT_LAYOUTACTIONBARHOME = 43;

  private static final int LAYOUT_LAYOUTGRAND = 44;

  private static final int LAYOUT_MENU = 45;

  private static final int LAYOUT_NOTIFYITEM = 46;

  private static final int LAYOUT_OPTIONDIALOG = 47;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(47);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.activity_base, LAYOUT_ACTIVITYBASE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.activity_map_address, LAYOUT_ACTIVITYMAPADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.change_dialog, LAYOUT_CHANGEDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.exist_layout, LAYOUT_EXISTLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_about, LAYOUT_FRAGMENTABOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_app_wallet, LAYOUT_FRAGMENTAPPWALLET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_change_password, LAYOUT_FRAGMENTCHANGEPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_cities, LAYOUT_FRAGMENTCITIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_confirm_code, LAYOUT_FRAGMENTCONFIRMCODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_contact, LAYOUT_FRAGMENTCONTACT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_countries, LAYOUT_FRAGMENTCOUNTRIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_edit_profile, LAYOUT_FRAGMENTEDITPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_follow_up_orders, LAYOUT_FRAGMENTFOLLOWUPORDERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_forget_password, LAYOUT_FRAGMENTFORGETPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_lang, LAYOUT_FRAGMENTLANG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_my_account_settings, LAYOUT_FRAGMENTMYACCOUNTSETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_notifications, LAYOUT_FRAGMENTNOTIFICATIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_onboard, LAYOUT_FRAGMENTONBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_order_details, LAYOUT_FRAGMENTORDERDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_packages, LAYOUT_FRAGMENTPACKAGES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_register, LAYOUT_FRAGMENTREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_register_documents, LAYOUT_FRAGMENTREGISTERDOCUMENTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_register_services, LAYOUT_FRAGMENTREGISTERSERVICES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_services_orders, LAYOUT_FRAGMENTSERVICESORDERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_social_media, LAYOUT_FRAGMENTSOCIALMEDIA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_terms, LAYOUT_FRAGMENTTERMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_auth_services, LAYOUT_ITEMAUTHSERVICES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_contact, LAYOUT_ITEMCONTACT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_country, LAYOUT_ITEMCOUNTRY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_extra_services, LAYOUT_ITEMEXTRASERVICES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_home, LAYOUT_ITEMHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_order_options_details, LAYOUT_ITEMORDEROPTIONSDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_package, LAYOUT_ITEMPACKAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_required_service, LAYOUT_ITEMREQUIREDSERVICE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_social, LAYOUT_ITEMSOCIAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_social_menu, LAYOUT_ITEMSOCIALMENU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_wallet_history, LAYOUT_ITEMWALLETHISTORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.layout_action_bar_back, LAYOUT_LAYOUTACTIONBARBACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.layout_action_bar_home, LAYOUT_LAYOUTACTIONBARHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.layout_grand, LAYOUT_LAYOUTGRAND);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.menu, LAYOUT_MENU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.notify_item, LAYOUT_NOTIFYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.option_dialog, LAYOUT_OPTIONDIALOG);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYBASE: {
          if ("layout/activity_base_0".equals(tag)) {
            return new ActivityBaseBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_base is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAPADDRESS: {
          if ("layout/activity_map_address_0".equals(tag)) {
            return new ActivityMapAddressBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_map_address is invalid. Received: " + tag);
        }
        case  LAYOUT_CHANGEDIALOG: {
          if ("layout/change_dialog_0".equals(tag)) {
            return new ChangeDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for change_dialog is invalid. Received: " + tag);
        }
        case  LAYOUT_EXISTLAYOUT: {
          if ("layout/exist_layout_0".equals(tag)) {
            return new ExistLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for exist_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTABOUT: {
          if ("layout/fragment_about_0".equals(tag)) {
            return new FragmentAboutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_about is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTAPPWALLET: {
          if ("layout/fragment_app_wallet_0".equals(tag)) {
            return new FragmentAppWalletBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_app_wallet is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCHANGEPASSWORD: {
          if ("layout/fragment_change_password_0".equals(tag)) {
            return new FragmentChangePasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_change_password is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCITIES: {
          if ("layout/fragment_cities_0".equals(tag)) {
            return new FragmentCitiesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_cities is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCONFIRMCODE: {
          if ("layout/fragment_confirm_code_0".equals(tag)) {
            return new FragmentConfirmCodeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_confirm_code is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCONTACT: {
          if ("layout/fragment_contact_0".equals(tag)) {
            return new FragmentContactBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_contact is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCOUNTRIES: {
          if ("layout/fragment_countries_0".equals(tag)) {
            return new FragmentCountriesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_countries is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEDITPROFILE: {
          if ("layout/fragment_edit_profile_0".equals(tag)) {
            return new FragmentEditProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_edit_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFOLLOWUPORDERS: {
          if ("layout/fragment_follow_up_orders_0".equals(tag)) {
            return new FragmentFollowUpOrdersBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_follow_up_orders is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFORGETPASSWORD: {
          if ("layout/fragment_forget_password_0".equals(tag)) {
            return new FragmentForgetPasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_forget_password is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLANG: {
          if ("layout/fragment_lang_0".equals(tag)) {
            return new FragmentLangBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_lang is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMYACCOUNTSETTINGS: {
          if ("layout/fragment_my_account_settings_0".equals(tag)) {
            return new FragmentMyAccountSettingsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_my_account_settings is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNOTIFICATIONS: {
          if ("layout/fragment_notifications_0".equals(tag)) {
            return new FragmentNotificationsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_notifications is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTONBOARD: {
          if ("layout/fragment_onboard_0".equals(tag)) {
            return new FragmentOnboardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_onboard is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTORDERDETAILS: {
          if ("layout/fragment_order_details_0".equals(tag)) {
            return new FragmentOrderDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_order_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPACKAGES: {
          if ("layout/fragment_packages_0".equals(tag)) {
            return new FragmentPackagesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_packages is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREGISTER: {
          if ("layout/fragment_register_0".equals(tag)) {
            return new FragmentRegisterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_register is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREGISTERDOCUMENTS: {
          if ("layout/fragment_register_documents_0".equals(tag)) {
            return new FragmentRegisterDocumentsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_register_documents is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREGISTERSERVICES: {
          if ("layout/fragment_register_services_0".equals(tag)) {
            return new FragmentRegisterServicesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_register_services is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSERVICESORDERS: {
          if ("layout/fragment_services_orders_0".equals(tag)) {
            return new FragmentServicesOrdersBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_services_orders is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSOCIALMEDIA: {
          if ("layout/fragment_social_media_0".equals(tag)) {
            return new FragmentSocialMediaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_social_media is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSPLASH: {
          if ("layout/fragment_splash_0".equals(tag)) {
            return new FragmentSplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTERMS: {
          if ("layout/fragment_terms_0".equals(tag)) {
            return new FragmentTermsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_terms is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMAUTHSERVICES: {
          if ("layout/item_auth_services_0".equals(tag)) {
            return new ItemAuthServicesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_auth_services is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCONTACT: {
          if ("layout/item_contact_0".equals(tag)) {
            return new ItemContactBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_contact is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCOUNTRY: {
          if ("layout/item_country_0".equals(tag)) {
            return new ItemCountryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_country is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMEXTRASERVICES: {
          if ("layout/item_extra_services_0".equals(tag)) {
            return new ItemExtraServicesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_extra_services is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMHOME: {
          if ("layout/item_home_0".equals(tag)) {
            return new ItemHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMORDEROPTIONSDETAILS: {
          if ("layout/item_order_options_details_0".equals(tag)) {
            return new ItemOrderOptionsDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_order_options_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPACKAGE: {
          if ("layout/item_package_0".equals(tag)) {
            return new ItemPackageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_package is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMREQUIREDSERVICE: {
          if ("layout/item_required_service_0".equals(tag)) {
            return new ItemRequiredServiceBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_required_service is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSOCIAL: {
          if ("layout/item_social_0".equals(tag)) {
            return new ItemSocialBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_social is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSOCIALMENU: {
          if ("layout/item_social_menu_0".equals(tag)) {
            return new ItemSocialMenuBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_social_menu is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMWALLETHISTORY: {
          if ("layout/item_wallet_history_0".equals(tag)) {
            return new ItemWalletHistoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_wallet_history is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTACTIONBARBACK: {
          if ("layout/layout_action_bar_back_0".equals(tag)) {
            return new LayoutActionBarBackBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_action_bar_back is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTACTIONBARHOME: {
          if ("layout/layout_action_bar_home_0".equals(tag)) {
            return new LayoutActionBarHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_action_bar_home is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTGRAND: {
          if ("layout/layout_grand_0".equals(tag)) {
            return new LayoutGrandBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_grand is invalid. Received: " + tag);
        }
        case  LAYOUT_MENU: {
          if ("layout/menu_0".equals(tag)) {
            return new MenuBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for menu is invalid. Received: " + tag);
        }
        case  LAYOUT_NOTIFYITEM: {
          if ("layout/notify_item_0".equals(tag)) {
            return new NotifyItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for notify_item is invalid. Received: " + tag);
        }
        case  LAYOUT_OPTIONDIALOG: {
          if ("layout/option_dialog_0".equals(tag)) {
            return new OptionDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for option_dialog is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(41);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "aboutData");
      sKeys.put(2, "baseViewModel");
      sKeys.put(3, "childServices");
      sKeys.put(4, "contact");
      sKeys.put(5, "contactsAdapter");
      sKeys.put(6, "countriesAdapter");
      sKeys.put(7, "countriesData");
      sKeys.put(8, "extraRequiredAdapter");
      sKeys.put(9, "historyWalletData");
      sKeys.put(10, "itemPostViewModel");
      sKeys.put(11, "itemViewModel");
      sKeys.put(12, "itemWalletViewModel");
      sKeys.put(13, "mainData");
      sKeys.put(14, "mapAddressViewModel");
      sKeys.put(15, "menuViewModel");
      sKeys.put(16, "message");
      sKeys.put(17, "myOrdersMain");
      sKeys.put(18, "notificationsAdapter");
      sKeys.put(19, "notificationsData");
      sKeys.put(20, "notifyItemViewModels");
      sKeys.put(21, "notifyViewModel");
      sKeys.put(22, "onBoardAdapter");
      sKeys.put(23, "onBoardViewModels");
      sKeys.put(24, "optionsDetailsAdapter");
      sKeys.put(25, "orderAdapter");
      sKeys.put(26, "orderDetailsMain");
      sKeys.put(27, "orders");
      sKeys.put(28, "packagesAdapter");
      sKeys.put(29, "packagesData");
      sKeys.put(30, "passingObject");
      sKeys.put(31, "request");
      sKeys.put(32, "service");
      sKeys.put(33, "servicesAdapter");
      sKeys.put(34, "servicesRequiredAdapter");
      sKeys.put(35, "socialAdapter");
      sKeys.put(36, "socialMediaData");
      sKeys.put(37, "userDocuments");
      sKeys.put(38, "viewModel");
      sKeys.put(39, "viewmodel");
      sKeys.put(40, "walletHistoryItem");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(47);

    static {
      sKeys.put("layout/activity_base_0", grand.app.aber_provider.R.layout.activity_base);
      sKeys.put("layout/activity_main_0", grand.app.aber_provider.R.layout.activity_main);
      sKeys.put("layout/activity_map_address_0", grand.app.aber_provider.R.layout.activity_map_address);
      sKeys.put("layout/change_dialog_0", grand.app.aber_provider.R.layout.change_dialog);
      sKeys.put("layout/exist_layout_0", grand.app.aber_provider.R.layout.exist_layout);
      sKeys.put("layout/fragment_about_0", grand.app.aber_provider.R.layout.fragment_about);
      sKeys.put("layout/fragment_app_wallet_0", grand.app.aber_provider.R.layout.fragment_app_wallet);
      sKeys.put("layout/fragment_change_password_0", grand.app.aber_provider.R.layout.fragment_change_password);
      sKeys.put("layout/fragment_cities_0", grand.app.aber_provider.R.layout.fragment_cities);
      sKeys.put("layout/fragment_confirm_code_0", grand.app.aber_provider.R.layout.fragment_confirm_code);
      sKeys.put("layout/fragment_contact_0", grand.app.aber_provider.R.layout.fragment_contact);
      sKeys.put("layout/fragment_countries_0", grand.app.aber_provider.R.layout.fragment_countries);
      sKeys.put("layout/fragment_edit_profile_0", grand.app.aber_provider.R.layout.fragment_edit_profile);
      sKeys.put("layout/fragment_follow_up_orders_0", grand.app.aber_provider.R.layout.fragment_follow_up_orders);
      sKeys.put("layout/fragment_forget_password_0", grand.app.aber_provider.R.layout.fragment_forget_password);
      sKeys.put("layout/fragment_home_0", grand.app.aber_provider.R.layout.fragment_home);
      sKeys.put("layout/fragment_lang_0", grand.app.aber_provider.R.layout.fragment_lang);
      sKeys.put("layout/fragment_login_0", grand.app.aber_provider.R.layout.fragment_login);
      sKeys.put("layout/fragment_my_account_settings_0", grand.app.aber_provider.R.layout.fragment_my_account_settings);
      sKeys.put("layout/fragment_notifications_0", grand.app.aber_provider.R.layout.fragment_notifications);
      sKeys.put("layout/fragment_onboard_0", grand.app.aber_provider.R.layout.fragment_onboard);
      sKeys.put("layout/fragment_order_details_0", grand.app.aber_provider.R.layout.fragment_order_details);
      sKeys.put("layout/fragment_packages_0", grand.app.aber_provider.R.layout.fragment_packages);
      sKeys.put("layout/fragment_register_0", grand.app.aber_provider.R.layout.fragment_register);
      sKeys.put("layout/fragment_register_documents_0", grand.app.aber_provider.R.layout.fragment_register_documents);
      sKeys.put("layout/fragment_register_services_0", grand.app.aber_provider.R.layout.fragment_register_services);
      sKeys.put("layout/fragment_services_orders_0", grand.app.aber_provider.R.layout.fragment_services_orders);
      sKeys.put("layout/fragment_social_media_0", grand.app.aber_provider.R.layout.fragment_social_media);
      sKeys.put("layout/fragment_splash_0", grand.app.aber_provider.R.layout.fragment_splash);
      sKeys.put("layout/fragment_terms_0", grand.app.aber_provider.R.layout.fragment_terms);
      sKeys.put("layout/item_auth_services_0", grand.app.aber_provider.R.layout.item_auth_services);
      sKeys.put("layout/item_contact_0", grand.app.aber_provider.R.layout.item_contact);
      sKeys.put("layout/item_country_0", grand.app.aber_provider.R.layout.item_country);
      sKeys.put("layout/item_extra_services_0", grand.app.aber_provider.R.layout.item_extra_services);
      sKeys.put("layout/item_home_0", grand.app.aber_provider.R.layout.item_home);
      sKeys.put("layout/item_order_options_details_0", grand.app.aber_provider.R.layout.item_order_options_details);
      sKeys.put("layout/item_package_0", grand.app.aber_provider.R.layout.item_package);
      sKeys.put("layout/item_required_service_0", grand.app.aber_provider.R.layout.item_required_service);
      sKeys.put("layout/item_social_0", grand.app.aber_provider.R.layout.item_social);
      sKeys.put("layout/item_social_menu_0", grand.app.aber_provider.R.layout.item_social_menu);
      sKeys.put("layout/item_wallet_history_0", grand.app.aber_provider.R.layout.item_wallet_history);
      sKeys.put("layout/layout_action_bar_back_0", grand.app.aber_provider.R.layout.layout_action_bar_back);
      sKeys.put("layout/layout_action_bar_home_0", grand.app.aber_provider.R.layout.layout_action_bar_home);
      sKeys.put("layout/layout_grand_0", grand.app.aber_provider.R.layout.layout_grand);
      sKeys.put("layout/menu_0", grand.app.aber_provider.R.layout.menu);
      sKeys.put("layout/notify_item_0", grand.app.aber_provider.R.layout.notify_item);
      sKeys.put("layout/option_dialog_0", grand.app.aber_provider.R.layout.option_dialog);
    }
  }
}
