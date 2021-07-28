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
import grand.app.aber_provider.databinding.FragmentAberBoxBindingImpl;
import grand.app.aber_provider.databinding.FragmentAboutBindingImpl;
import grand.app.aber_provider.databinding.FragmentAddPlaceBindingImpl;
import grand.app.aber_provider.databinding.FragmentAppWalletBindingImpl;
import grand.app.aber_provider.databinding.FragmentBatteriesBindingImpl;
import grand.app.aber_provider.databinding.FragmentCarCheckBindingImpl;
import grand.app.aber_provider.databinding.FragmentChangePasswordBindingImpl;
import grand.app.aber_provider.databinding.FragmentChooseServiceTimeBindingImpl;
import grand.app.aber_provider.databinding.FragmentConfirmCodeBindingImpl;
import grand.app.aber_provider.databinding.FragmentConfirmOrderBindingImpl;
import grand.app.aber_provider.databinding.FragmentContactBindingImpl;
import grand.app.aber_provider.databinding.FragmentCountriesBindingImpl;
import grand.app.aber_provider.databinding.FragmentEditProfileBindingImpl;
import grand.app.aber_provider.databinding.FragmentFavoritesBindingImpl;
import grand.app.aber_provider.databinding.FragmentForgetPasswordBindingImpl;
import grand.app.aber_provider.databinding.FragmentFuelBindingImpl;
import grand.app.aber_provider.databinding.FragmentHiddenBindingImpl;
import grand.app.aber_provider.databinding.FragmentHomeBindingImpl;
import grand.app.aber_provider.databinding.FragmentLangBindingImpl;
import grand.app.aber_provider.databinding.FragmentLiveDetailsBindingImpl;
import grand.app.aber_provider.databinding.FragmentLoginBindingImpl;
import grand.app.aber_provider.databinding.FragmentMyAccountSettingsBindingImpl;
import grand.app.aber_provider.databinding.FragmentMyLocationBindingImpl;
import grand.app.aber_provider.databinding.FragmentMyOrderDetailsBindingImpl;
import grand.app.aber_provider.databinding.FragmentMyOrdersBindingImpl;
import grand.app.aber_provider.databinding.FragmentNotificationsBindingImpl;
import grand.app.aber_provider.databinding.FragmentOilBindingImpl;
import grand.app.aber_provider.databinding.FragmentOnboardBindingImpl;
import grand.app.aber_provider.databinding.FragmentOpenCarBindingImpl;
import grand.app.aber_provider.databinding.FragmentOrderServiceDetailsBindingImpl;
import grand.app.aber_provider.databinding.FragmentPackagesBindingImpl;
import grand.app.aber_provider.databinding.FragmentPartServicesBindingImpl;
import grand.app.aber_provider.databinding.FragmentProductDetailsBindingImpl;
import grand.app.aber_provider.databinding.FragmentProfilePostsBindingImpl;
import grand.app.aber_provider.databinding.FragmentQuestionsPostsBindingImpl;
import grand.app.aber_provider.databinding.FragmentReactionsBindingImpl;
import grand.app.aber_provider.databinding.FragmentRegisterBindingImpl;
import grand.app.aber_provider.databinding.FragmentRegisterDocumentsBindingImpl;
import grand.app.aber_provider.databinding.FragmentRegisterServicesBindingImpl;
import grand.app.aber_provider.databinding.FragmentRepliesBindingImpl;
import grand.app.aber_provider.databinding.FragmentSearchBindingImpl;
import grand.app.aber_provider.databinding.FragmentServicesOrdersBindingImpl;
import grand.app.aber_provider.databinding.FragmentSocialMediaBindingImpl;
import grand.app.aber_provider.databinding.FragmentSplashBindingImpl;
import grand.app.aber_provider.databinding.FragmentTermsBindingImpl;
import grand.app.aber_provider.databinding.FragmentTiersBindingImpl;
import grand.app.aber_provider.databinding.FragmentWashBindingImpl;
import grand.app.aber_provider.databinding.FragmentWaterBallonBindingImpl;
import grand.app.aber_provider.databinding.FragmentWinchBindingImpl;
import grand.app.aber_provider.databinding.ItemColorBindingImpl;
import grand.app.aber_provider.databinding.ItemCountryBindingImpl;
import grand.app.aber_provider.databinding.ItemExtraServicesBindingImpl;
import grand.app.aber_provider.databinding.ItemFavoriteBindingImpl;
import grand.app.aber_provider.databinding.ItemHomeBindingImpl;
import grand.app.aber_provider.databinding.ItemMainMyOrderBindingImpl;
import grand.app.aber_provider.databinding.ItemMainServiceOrderBindingImpl;
import grand.app.aber_provider.databinding.ItemMyLocationBindingImpl;
import grand.app.aber_provider.databinding.ItemOrderConfirmedBindingImpl;
import grand.app.aber_provider.databinding.ItemOrderDetailBindingImpl;
import grand.app.aber_provider.databinding.ItemOrderServiceBindingImpl;
import grand.app.aber_provider.databinding.ItemPartBindingImpl;
import grand.app.aber_provider.databinding.ItemPartServiceBindingImpl;
import grand.app.aber_provider.databinding.ItemRequiredServiceBindingImpl;
import grand.app.aber_provider.databinding.ItemSaleDescBindingImpl;
import grand.app.aber_provider.databinding.ItemSearchBindingImpl;
import grand.app.aber_provider.databinding.ItemServiceBindingImpl;
import grand.app.aber_provider.databinding.ItemSizeBindingImpl;
import grand.app.aber_provider.databinding.ItemSocialBindingImpl;
import grand.app.aber_provider.databinding.ItemWalletHistoryBindingImpl;
import grand.app.aber_provider.databinding.LayoutActionBarBackBindingImpl;
import grand.app.aber_provider.databinding.LayoutActionBarHomeBindingImpl;
import grand.app.aber_provider.databinding.MenuBindingImpl;
import grand.app.aber_provider.databinding.NotifyItemBindingImpl;
import grand.app.aber_provider.databinding.OptionDialogBindingImpl;
import grand.app.aber_provider.databinding.ReportDialogBindingImpl;
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

  private static final int LAYOUT_FRAGMENTABERBOX = 6;

  private static final int LAYOUT_FRAGMENTABOUT = 7;

  private static final int LAYOUT_FRAGMENTADDPLACE = 8;

  private static final int LAYOUT_FRAGMENTAPPWALLET = 9;

  private static final int LAYOUT_FRAGMENTBATTERIES = 10;

  private static final int LAYOUT_FRAGMENTCARCHECK = 11;

  private static final int LAYOUT_FRAGMENTCHANGEPASSWORD = 12;

  private static final int LAYOUT_FRAGMENTCHOOSESERVICETIME = 13;

  private static final int LAYOUT_FRAGMENTCONFIRMCODE = 14;

  private static final int LAYOUT_FRAGMENTCONFIRMORDER = 15;

  private static final int LAYOUT_FRAGMENTCONTACT = 16;

  private static final int LAYOUT_FRAGMENTCOUNTRIES = 17;

  private static final int LAYOUT_FRAGMENTEDITPROFILE = 18;

  private static final int LAYOUT_FRAGMENTFAVORITES = 19;

  private static final int LAYOUT_FRAGMENTFORGETPASSWORD = 20;

  private static final int LAYOUT_FRAGMENTFUEL = 21;

  private static final int LAYOUT_FRAGMENTHIDDEN = 22;

  private static final int LAYOUT_FRAGMENTHOME = 23;

  private static final int LAYOUT_FRAGMENTLANG = 24;

  private static final int LAYOUT_FRAGMENTLIVEDETAILS = 25;

  private static final int LAYOUT_FRAGMENTLOGIN = 26;

  private static final int LAYOUT_FRAGMENTMYACCOUNTSETTINGS = 27;

  private static final int LAYOUT_FRAGMENTMYLOCATION = 28;

  private static final int LAYOUT_FRAGMENTMYORDERDETAILS = 29;

  private static final int LAYOUT_FRAGMENTMYORDERS = 30;

  private static final int LAYOUT_FRAGMENTNOTIFICATIONS = 31;

  private static final int LAYOUT_FRAGMENTOIL = 32;

  private static final int LAYOUT_FRAGMENTONBOARD = 33;

  private static final int LAYOUT_FRAGMENTOPENCAR = 34;

  private static final int LAYOUT_FRAGMENTORDERSERVICEDETAILS = 35;

  private static final int LAYOUT_FRAGMENTPACKAGES = 36;

  private static final int LAYOUT_FRAGMENTPARTSERVICES = 37;

  private static final int LAYOUT_FRAGMENTPRODUCTDETAILS = 38;

  private static final int LAYOUT_FRAGMENTPROFILEPOSTS = 39;

  private static final int LAYOUT_FRAGMENTQUESTIONSPOSTS = 40;

  private static final int LAYOUT_FRAGMENTREACTIONS = 41;

  private static final int LAYOUT_FRAGMENTREGISTER = 42;

  private static final int LAYOUT_FRAGMENTREGISTERDOCUMENTS = 43;

  private static final int LAYOUT_FRAGMENTREGISTERSERVICES = 44;

  private static final int LAYOUT_FRAGMENTREPLIES = 45;

  private static final int LAYOUT_FRAGMENTSEARCH = 46;

  private static final int LAYOUT_FRAGMENTSERVICESORDERS = 47;

  private static final int LAYOUT_FRAGMENTSOCIALMEDIA = 48;

  private static final int LAYOUT_FRAGMENTSPLASH = 49;

  private static final int LAYOUT_FRAGMENTTERMS = 50;

  private static final int LAYOUT_FRAGMENTTIERS = 51;

  private static final int LAYOUT_FRAGMENTWASH = 52;

  private static final int LAYOUT_FRAGMENTWATERBALLON = 53;

  private static final int LAYOUT_FRAGMENTWINCH = 54;

  private static final int LAYOUT_ITEMCOLOR = 55;

  private static final int LAYOUT_ITEMCOUNTRY = 56;

  private static final int LAYOUT_ITEMEXTRASERVICES = 57;

  private static final int LAYOUT_ITEMFAVORITE = 58;

  private static final int LAYOUT_ITEMHOME = 59;

  private static final int LAYOUT_ITEMMAINMYORDER = 60;

  private static final int LAYOUT_ITEMMAINSERVICEORDER = 61;

  private static final int LAYOUT_ITEMMYLOCATION = 62;

  private static final int LAYOUT_ITEMORDERCONFIRMED = 63;

  private static final int LAYOUT_ITEMORDERDETAIL = 64;

  private static final int LAYOUT_ITEMORDERSERVICE = 65;

  private static final int LAYOUT_ITEMPART = 66;

  private static final int LAYOUT_ITEMPARTSERVICE = 67;

  private static final int LAYOUT_ITEMREQUIREDSERVICE = 68;

  private static final int LAYOUT_ITEMSALEDESC = 69;

  private static final int LAYOUT_ITEMSEARCH = 70;

  private static final int LAYOUT_ITEMSERVICE = 71;

  private static final int LAYOUT_ITEMSIZE = 72;

  private static final int LAYOUT_ITEMSOCIAL = 73;

  private static final int LAYOUT_ITEMWALLETHISTORY = 74;

  private static final int LAYOUT_LAYOUTACTIONBARBACK = 75;

  private static final int LAYOUT_LAYOUTACTIONBARHOME = 76;

  private static final int LAYOUT_MENU = 77;

  private static final int LAYOUT_NOTIFYITEM = 78;

  private static final int LAYOUT_OPTIONDIALOG = 79;

  private static final int LAYOUT_REPORTDIALOG = 80;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(80);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.activity_base, LAYOUT_ACTIVITYBASE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.activity_map_address, LAYOUT_ACTIVITYMAPADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.change_dialog, LAYOUT_CHANGEDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.exist_layout, LAYOUT_EXISTLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_aber_box, LAYOUT_FRAGMENTABERBOX);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_about, LAYOUT_FRAGMENTABOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_add_place, LAYOUT_FRAGMENTADDPLACE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_app_wallet, LAYOUT_FRAGMENTAPPWALLET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_batteries, LAYOUT_FRAGMENTBATTERIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_car_check, LAYOUT_FRAGMENTCARCHECK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_change_password, LAYOUT_FRAGMENTCHANGEPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_choose_service_time, LAYOUT_FRAGMENTCHOOSESERVICETIME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_confirm_code, LAYOUT_FRAGMENTCONFIRMCODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_confirm_order, LAYOUT_FRAGMENTCONFIRMORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_contact, LAYOUT_FRAGMENTCONTACT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_countries, LAYOUT_FRAGMENTCOUNTRIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_edit_profile, LAYOUT_FRAGMENTEDITPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_favorites, LAYOUT_FRAGMENTFAVORITES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_forget_password, LAYOUT_FRAGMENTFORGETPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_fuel, LAYOUT_FRAGMENTFUEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_hidden, LAYOUT_FRAGMENTHIDDEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_lang, LAYOUT_FRAGMENTLANG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_live_details, LAYOUT_FRAGMENTLIVEDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_my_account_settings, LAYOUT_FRAGMENTMYACCOUNTSETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_my_location, LAYOUT_FRAGMENTMYLOCATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_my_order_details, LAYOUT_FRAGMENTMYORDERDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_my_orders, LAYOUT_FRAGMENTMYORDERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_notifications, LAYOUT_FRAGMENTNOTIFICATIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_oil, LAYOUT_FRAGMENTOIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_onboard, LAYOUT_FRAGMENTONBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_open_car, LAYOUT_FRAGMENTOPENCAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_order_service_details, LAYOUT_FRAGMENTORDERSERVICEDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_packages, LAYOUT_FRAGMENTPACKAGES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_part_services, LAYOUT_FRAGMENTPARTSERVICES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_product_details, LAYOUT_FRAGMENTPRODUCTDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_profile_posts, LAYOUT_FRAGMENTPROFILEPOSTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_questions_posts, LAYOUT_FRAGMENTQUESTIONSPOSTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_reactions, LAYOUT_FRAGMENTREACTIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_register, LAYOUT_FRAGMENTREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_register_documents, LAYOUT_FRAGMENTREGISTERDOCUMENTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_register_services, LAYOUT_FRAGMENTREGISTERSERVICES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_replies, LAYOUT_FRAGMENTREPLIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_search, LAYOUT_FRAGMENTSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_services_orders, LAYOUT_FRAGMENTSERVICESORDERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_social_media, LAYOUT_FRAGMENTSOCIALMEDIA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_terms, LAYOUT_FRAGMENTTERMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_tiers, LAYOUT_FRAGMENTTIERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_wash, LAYOUT_FRAGMENTWASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_water_ballon, LAYOUT_FRAGMENTWATERBALLON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.fragment_winch, LAYOUT_FRAGMENTWINCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_color, LAYOUT_ITEMCOLOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_country, LAYOUT_ITEMCOUNTRY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_extra_services, LAYOUT_ITEMEXTRASERVICES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_favorite, LAYOUT_ITEMFAVORITE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_home, LAYOUT_ITEMHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_main_my_order, LAYOUT_ITEMMAINMYORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_main_service_order, LAYOUT_ITEMMAINSERVICEORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_my_location, LAYOUT_ITEMMYLOCATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_order_confirmed, LAYOUT_ITEMORDERCONFIRMED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_order_detail, LAYOUT_ITEMORDERDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_order_service, LAYOUT_ITEMORDERSERVICE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_part, LAYOUT_ITEMPART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_part_service, LAYOUT_ITEMPARTSERVICE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_required_service, LAYOUT_ITEMREQUIREDSERVICE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_sale_desc, LAYOUT_ITEMSALEDESC);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_search, LAYOUT_ITEMSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_service, LAYOUT_ITEMSERVICE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_size, LAYOUT_ITEMSIZE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_social, LAYOUT_ITEMSOCIAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.item_wallet_history, LAYOUT_ITEMWALLETHISTORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.layout_action_bar_back, LAYOUT_LAYOUTACTIONBARBACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.layout_action_bar_home, LAYOUT_LAYOUTACTIONBARHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.menu, LAYOUT_MENU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.notify_item, LAYOUT_NOTIFYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.option_dialog, LAYOUT_OPTIONDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.aber_provider.R.layout.report_dialog, LAYOUT_REPORTDIALOG);
  }

  private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
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
      case  LAYOUT_FRAGMENTABERBOX: {
        if ("layout/fragment_aber_box_0".equals(tag)) {
          return new FragmentAberBoxBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_aber_box is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTABOUT: {
        if ("layout/fragment_about_0".equals(tag)) {
          return new FragmentAboutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_about is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDPLACE: {
        if ("layout/fragment_add_place_0".equals(tag)) {
          return new FragmentAddPlaceBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_place is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTAPPWALLET: {
        if ("layout/fragment_app_wallet_0".equals(tag)) {
          return new FragmentAppWalletBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_app_wallet is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTBATTERIES: {
        if ("layout/fragment_batteries_0".equals(tag)) {
          return new FragmentBatteriesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_batteries is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCARCHECK: {
        if ("layout/fragment_car_check_0".equals(tag)) {
          return new FragmentCarCheckBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_car_check is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCHANGEPASSWORD: {
        if ("layout/fragment_change_password_0".equals(tag)) {
          return new FragmentChangePasswordBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_change_password is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCHOOSESERVICETIME: {
        if ("layout/fragment_choose_service_time_0".equals(tag)) {
          return new FragmentChooseServiceTimeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_choose_service_time is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCONFIRMCODE: {
        if ("layout/fragment_confirm_code_0".equals(tag)) {
          return new FragmentConfirmCodeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_confirm_code is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCONFIRMORDER: {
        if ("layout/fragment_confirm_order_0".equals(tag)) {
          return new FragmentConfirmOrderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_confirm_order is invalid. Received: " + tag);
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
      case  LAYOUT_FRAGMENTFAVORITES: {
        if ("layout/fragment_favorites_0".equals(tag)) {
          return new FragmentFavoritesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_favorites is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTFORGETPASSWORD: {
        if ("layout/fragment_forget_password_0".equals(tag)) {
          return new FragmentForgetPasswordBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_forget_password is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTFUEL: {
        if ("layout/fragment_fuel_0".equals(tag)) {
          return new FragmentFuelBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_fuel is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTHIDDEN: {
        if ("layout/fragment_hidden_0".equals(tag)) {
          return new FragmentHiddenBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_hidden is invalid. Received: " + tag);
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
      case  LAYOUT_FRAGMENTLIVEDETAILS: {
        if ("layout/fragment_live_details_0".equals(tag)) {
          return new FragmentLiveDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_live_details is invalid. Received: " + tag);
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
      case  LAYOUT_FRAGMENTMYLOCATION: {
        if ("layout/fragment_my_location_0".equals(tag)) {
          return new FragmentMyLocationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_my_location is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMYORDERDETAILS: {
        if ("layout/fragment_my_order_details_0".equals(tag)) {
          return new FragmentMyOrderDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_my_order_details is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMYORDERS: {
        if ("layout/fragment_my_orders_0".equals(tag)) {
          return new FragmentMyOrdersBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_my_orders is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTNOTIFICATIONS: {
        if ("layout/fragment_notifications_0".equals(tag)) {
          return new FragmentNotificationsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_notifications is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTOIL: {
        if ("layout/fragment_oil_0".equals(tag)) {
          return new FragmentOilBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_oil is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTONBOARD: {
        if ("layout/fragment_onboard_0".equals(tag)) {
          return new FragmentOnboardBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_onboard is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTOPENCAR: {
        if ("layout/fragment_open_car_0".equals(tag)) {
          return new FragmentOpenCarBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_open_car is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTORDERSERVICEDETAILS: {
        if ("layout/fragment_order_service_details_0".equals(tag)) {
          return new FragmentOrderServiceDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_order_service_details is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPACKAGES: {
        if ("layout/fragment_packages_0".equals(tag)) {
          return new FragmentPackagesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_packages is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPARTSERVICES: {
        if ("layout/fragment_part_services_0".equals(tag)) {
          return new FragmentPartServicesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_part_services is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPRODUCTDETAILS: {
        if ("layout/fragment_product_details_0".equals(tag)) {
          return new FragmentProductDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_product_details is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPROFILEPOSTS: {
        if ("layout/fragment_profile_posts_0".equals(tag)) {
          return new FragmentProfilePostsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_profile_posts is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTQUESTIONSPOSTS: {
        if ("layout/fragment_questions_posts_0".equals(tag)) {
          return new FragmentQuestionsPostsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_questions_posts is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREACTIONS: {
        if ("layout/fragment_reactions_0".equals(tag)) {
          return new FragmentReactionsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_reactions is invalid. Received: " + tag);
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
      case  LAYOUT_FRAGMENTREPLIES: {
        if ("layout/fragment_replies_0".equals(tag)) {
          return new FragmentRepliesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_replies is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSEARCH: {
        if ("layout/fragment_search_0".equals(tag)) {
          return new FragmentSearchBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_search is invalid. Received: " + tag);
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
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_FRAGMENTTIERS: {
        if ("layout/fragment_tiers_0".equals(tag)) {
          return new FragmentTiersBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_tiers is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTWASH: {
        if ("layout/fragment_wash_0".equals(tag)) {
          return new FragmentWashBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_wash is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTWATERBALLON: {
        if ("layout/fragment_water_ballon_0".equals(tag)) {
          return new FragmentWaterBallonBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_water_ballon is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTWINCH: {
        if ("layout/fragment_winch_0".equals(tag)) {
          return new FragmentWinchBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_winch is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCOLOR: {
        if ("layout/item_color_0".equals(tag)) {
          return new ItemColorBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_color is invalid. Received: " + tag);
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
      case  LAYOUT_ITEMFAVORITE: {
        if ("layout/item_favorite_0".equals(tag)) {
          return new ItemFavoriteBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_favorite is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMHOME: {
        if ("layout/item_home_0".equals(tag)) {
          return new ItemHomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_home is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMAINMYORDER: {
        if ("layout/item_main_my_order_0".equals(tag)) {
          return new ItemMainMyOrderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_main_my_order is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMAINSERVICEORDER: {
        if ("layout/item_main_service_order_0".equals(tag)) {
          return new ItemMainServiceOrderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_main_service_order is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMYLOCATION: {
        if ("layout/item_my_location_0".equals(tag)) {
          return new ItemMyLocationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_my_location is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMORDERCONFIRMED: {
        if ("layout/item_order_confirmed_0".equals(tag)) {
          return new ItemOrderConfirmedBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_order_confirmed is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMORDERDETAIL: {
        if ("layout/item_order_detail_0".equals(tag)) {
          return new ItemOrderDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_order_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMORDERSERVICE: {
        if ("layout/item_order_service_0".equals(tag)) {
          return new ItemOrderServiceBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_order_service is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMPART: {
        if ("layout/item_part_0".equals(tag)) {
          return new ItemPartBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_part is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMPARTSERVICE: {
        if ("layout/item_part_service_0".equals(tag)) {
          return new ItemPartServiceBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_part_service is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMREQUIREDSERVICE: {
        if ("layout/item_required_service_0".equals(tag)) {
          return new ItemRequiredServiceBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_required_service is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSALEDESC: {
        if ("layout/item_sale_desc_0".equals(tag)) {
          return new ItemSaleDescBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_sale_desc is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSEARCH: {
        if ("layout/item_search_0".equals(tag)) {
          return new ItemSearchBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_search is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSERVICE: {
        if ("layout/item_service_0".equals(tag)) {
          return new ItemServiceBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_service is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSIZE: {
        if ("layout/item_size_0".equals(tag)) {
          return new ItemSizeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_size is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSOCIAL: {
        if ("layout/item_social_0".equals(tag)) {
          return new ItemSocialBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_social is invalid. Received: " + tag);
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
      case  LAYOUT_REPORTDIALOG: {
        if ("layout/report_dialog_0".equals(tag)) {
          return new ReportDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for report_dialog is invalid. Received: " + tag);
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      // find which method will have it. -1 is necessary becausefirst id starts with 1;
      int methodIndex = (localizedLayoutId - 1) / 50;
      switch(methodIndex) {
        case 0: {
          return internalGetViewDataBinding0(component, view, localizedLayoutId, tag);
        }
        case 1: {
          return internalGetViewDataBinding1(component, view, localizedLayoutId, tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(45);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "aboutData");
      sKeys.put(2, "baseViewModel");
      sKeys.put(3, "comments");
      sKeys.put(4, "commentsAdapter");
      sKeys.put(5, "createCommentRequest");
      sKeys.put(6, "fileObject");
      sKeys.put(7, "followersAdapter");
      sKeys.put(8, "followersResponse");
      sKeys.put(9, "historyWalletData");
      sKeys.put(10, "itemOrderViewModel");
      sKeys.put(11, "itemPostViewModel");
      sKeys.put(12, "itemViewModel");
      sKeys.put(13, "itemWalletViewModel");
      sKeys.put(14, "locationsAdapters");
      sKeys.put(15, "locationsData");
      sKeys.put(16, "mainComment");
      sKeys.put(17, "mainData");
      sKeys.put(18, "mainFollowersData");
      sKeys.put(19, "mapAddressViewModel");
      sKeys.put(20, "memberCertificatesAdapter");
      sKeys.put(21, "menuViewModel");
      sKeys.put(22, "message");
      sKeys.put(23, "notificationsAdapter");
      sKeys.put(24, "notificationsData");
      sKeys.put(25, "notifyItemViewModels");
      sKeys.put(26, "notifyViewModel");
      sKeys.put(27, "onBoardAdapter");
      sKeys.put(28, "onBoardViewModels");
      sKeys.put(29, "orderImages");
      sKeys.put(30, "passingObject");
      sKeys.put(31, "peopleData");
      sKeys.put(32, "postData");
      sKeys.put(33, "postsAdapter");
      sKeys.put(34, "questionedPostsAdapter");
      sKeys.put(35, "raiseWalletRequest");
      sKeys.put(36, "reactType");
      sKeys.put(37, "reportData");
      sKeys.put(38, "reportReasonsAdapter");
      sKeys.put(39, "userCertificatesItem");
      sKeys.put(40, "userDocuments");
      sKeys.put(41, "userProfile");
      sKeys.put(42, "viewModel");
      sKeys.put(43, "viewmodel");
      sKeys.put(44, "walletHistoryItem");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(80);

    static {
      sKeys.put("layout/activity_base_0", grand.app.aber_provider.R.layout.activity_base);
      sKeys.put("layout/activity_main_0", grand.app.aber_provider.R.layout.activity_main);
      sKeys.put("layout/activity_map_address_0", grand.app.aber_provider.R.layout.activity_map_address);
      sKeys.put("layout/change_dialog_0", grand.app.aber_provider.R.layout.change_dialog);
      sKeys.put("layout/exist_layout_0", grand.app.aber_provider.R.layout.exist_layout);
      sKeys.put("layout/fragment_aber_box_0", grand.app.aber_provider.R.layout.fragment_aber_box);
      sKeys.put("layout/fragment_about_0", grand.app.aber_provider.R.layout.fragment_about);
      sKeys.put("layout/fragment_add_place_0", grand.app.aber_provider.R.layout.fragment_add_place);
      sKeys.put("layout/fragment_app_wallet_0", grand.app.aber_provider.R.layout.fragment_app_wallet);
      sKeys.put("layout/fragment_batteries_0", grand.app.aber_provider.R.layout.fragment_batteries);
      sKeys.put("layout/fragment_car_check_0", grand.app.aber_provider.R.layout.fragment_car_check);
      sKeys.put("layout/fragment_change_password_0", grand.app.aber_provider.R.layout.fragment_change_password);
      sKeys.put("layout/fragment_choose_service_time_0", grand.app.aber_provider.R.layout.fragment_choose_service_time);
      sKeys.put("layout/fragment_confirm_code_0", grand.app.aber_provider.R.layout.fragment_confirm_code);
      sKeys.put("layout/fragment_confirm_order_0", grand.app.aber_provider.R.layout.fragment_confirm_order);
      sKeys.put("layout/fragment_contact_0", grand.app.aber_provider.R.layout.fragment_contact);
      sKeys.put("layout/fragment_countries_0", grand.app.aber_provider.R.layout.fragment_countries);
      sKeys.put("layout/fragment_edit_profile_0", grand.app.aber_provider.R.layout.fragment_edit_profile);
      sKeys.put("layout/fragment_favorites_0", grand.app.aber_provider.R.layout.fragment_favorites);
      sKeys.put("layout/fragment_forget_password_0", grand.app.aber_provider.R.layout.fragment_forget_password);
      sKeys.put("layout/fragment_fuel_0", grand.app.aber_provider.R.layout.fragment_fuel);
      sKeys.put("layout/fragment_hidden_0", grand.app.aber_provider.R.layout.fragment_hidden);
      sKeys.put("layout/fragment_home_0", grand.app.aber_provider.R.layout.fragment_home);
      sKeys.put("layout/fragment_lang_0", grand.app.aber_provider.R.layout.fragment_lang);
      sKeys.put("layout/fragment_live_details_0", grand.app.aber_provider.R.layout.fragment_live_details);
      sKeys.put("layout/fragment_login_0", grand.app.aber_provider.R.layout.fragment_login);
      sKeys.put("layout/fragment_my_account_settings_0", grand.app.aber_provider.R.layout.fragment_my_account_settings);
      sKeys.put("layout/fragment_my_location_0", grand.app.aber_provider.R.layout.fragment_my_location);
      sKeys.put("layout/fragment_my_order_details_0", grand.app.aber_provider.R.layout.fragment_my_order_details);
      sKeys.put("layout/fragment_my_orders_0", grand.app.aber_provider.R.layout.fragment_my_orders);
      sKeys.put("layout/fragment_notifications_0", grand.app.aber_provider.R.layout.fragment_notifications);
      sKeys.put("layout/fragment_oil_0", grand.app.aber_provider.R.layout.fragment_oil);
      sKeys.put("layout/fragment_onboard_0", grand.app.aber_provider.R.layout.fragment_onboard);
      sKeys.put("layout/fragment_open_car_0", grand.app.aber_provider.R.layout.fragment_open_car);
      sKeys.put("layout/fragment_order_service_details_0", grand.app.aber_provider.R.layout.fragment_order_service_details);
      sKeys.put("layout/fragment_packages_0", grand.app.aber_provider.R.layout.fragment_packages);
      sKeys.put("layout/fragment_part_services_0", grand.app.aber_provider.R.layout.fragment_part_services);
      sKeys.put("layout/fragment_product_details_0", grand.app.aber_provider.R.layout.fragment_product_details);
      sKeys.put("layout/fragment_profile_posts_0", grand.app.aber_provider.R.layout.fragment_profile_posts);
      sKeys.put("layout/fragment_questions_posts_0", grand.app.aber_provider.R.layout.fragment_questions_posts);
      sKeys.put("layout/fragment_reactions_0", grand.app.aber_provider.R.layout.fragment_reactions);
      sKeys.put("layout/fragment_register_0", grand.app.aber_provider.R.layout.fragment_register);
      sKeys.put("layout/fragment_register_documents_0", grand.app.aber_provider.R.layout.fragment_register_documents);
      sKeys.put("layout/fragment_register_services_0", grand.app.aber_provider.R.layout.fragment_register_services);
      sKeys.put("layout/fragment_replies_0", grand.app.aber_provider.R.layout.fragment_replies);
      sKeys.put("layout/fragment_search_0", grand.app.aber_provider.R.layout.fragment_search);
      sKeys.put("layout/fragment_services_orders_0", grand.app.aber_provider.R.layout.fragment_services_orders);
      sKeys.put("layout/fragment_social_media_0", grand.app.aber_provider.R.layout.fragment_social_media);
      sKeys.put("layout/fragment_splash_0", grand.app.aber_provider.R.layout.fragment_splash);
      sKeys.put("layout/fragment_terms_0", grand.app.aber_provider.R.layout.fragment_terms);
      sKeys.put("layout/fragment_tiers_0", grand.app.aber_provider.R.layout.fragment_tiers);
      sKeys.put("layout/fragment_wash_0", grand.app.aber_provider.R.layout.fragment_wash);
      sKeys.put("layout/fragment_water_ballon_0", grand.app.aber_provider.R.layout.fragment_water_ballon);
      sKeys.put("layout/fragment_winch_0", grand.app.aber_provider.R.layout.fragment_winch);
      sKeys.put("layout/item_color_0", grand.app.aber_provider.R.layout.item_color);
      sKeys.put("layout/item_country_0", grand.app.aber_provider.R.layout.item_country);
      sKeys.put("layout/item_extra_services_0", grand.app.aber_provider.R.layout.item_extra_services);
      sKeys.put("layout/item_favorite_0", grand.app.aber_provider.R.layout.item_favorite);
      sKeys.put("layout/item_home_0", grand.app.aber_provider.R.layout.item_home);
      sKeys.put("layout/item_main_my_order_0", grand.app.aber_provider.R.layout.item_main_my_order);
      sKeys.put("layout/item_main_service_order_0", grand.app.aber_provider.R.layout.item_main_service_order);
      sKeys.put("layout/item_my_location_0", grand.app.aber_provider.R.layout.item_my_location);
      sKeys.put("layout/item_order_confirmed_0", grand.app.aber_provider.R.layout.item_order_confirmed);
      sKeys.put("layout/item_order_detail_0", grand.app.aber_provider.R.layout.item_order_detail);
      sKeys.put("layout/item_order_service_0", grand.app.aber_provider.R.layout.item_order_service);
      sKeys.put("layout/item_part_0", grand.app.aber_provider.R.layout.item_part);
      sKeys.put("layout/item_part_service_0", grand.app.aber_provider.R.layout.item_part_service);
      sKeys.put("layout/item_required_service_0", grand.app.aber_provider.R.layout.item_required_service);
      sKeys.put("layout/item_sale_desc_0", grand.app.aber_provider.R.layout.item_sale_desc);
      sKeys.put("layout/item_search_0", grand.app.aber_provider.R.layout.item_search);
      sKeys.put("layout/item_service_0", grand.app.aber_provider.R.layout.item_service);
      sKeys.put("layout/item_size_0", grand.app.aber_provider.R.layout.item_size);
      sKeys.put("layout/item_social_0", grand.app.aber_provider.R.layout.item_social);
      sKeys.put("layout/item_wallet_history_0", grand.app.aber_provider.R.layout.item_wallet_history);
      sKeys.put("layout/layout_action_bar_back_0", grand.app.aber_provider.R.layout.layout_action_bar_back);
      sKeys.put("layout/layout_action_bar_home_0", grand.app.aber_provider.R.layout.layout_action_bar_home);
      sKeys.put("layout/menu_0", grand.app.aber_provider.R.layout.menu);
      sKeys.put("layout/notify_item_0", grand.app.aber_provider.R.layout.notify_item);
      sKeys.put("layout/option_dialog_0", grand.app.aber_provider.R.layout.option_dialog);
      sKeys.put("layout/report_dialog_0", grand.app.aber_provider.R.layout.report_dialog);
    }
  }
}
