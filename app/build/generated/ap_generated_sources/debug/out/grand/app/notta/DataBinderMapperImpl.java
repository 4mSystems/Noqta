package grand.app.notta;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import grand.app.notta.databinding.ActivityBaseBindingImpl;
import grand.app.notta.databinding.ActivityMainBindingImpl;
import grand.app.notta.databinding.FragmentChangePasswordBindingImpl;
import grand.app.notta.databinding.FragmentConfirmCodeBindingImpl;
import grand.app.notta.databinding.FragmentForgetPasswordBindingImpl;
import grand.app.notta.databinding.FragmentLoginBindingImpl;
import grand.app.notta.databinding.FragmentOnboardBindingImpl;
import grand.app.notta.databinding.FragmentRegisterBindingImpl;
import grand.app.notta.databinding.FragmentSplashBindingImpl;
import grand.app.notta.databinding.LayoutActionBarBackBindingImpl;
import grand.app.notta.databinding.LayoutActionBarHomeBindingImpl;
import grand.app.notta.databinding.LayoutGrandBindingImpl;
import grand.app.notta.databinding.MenuBindingImpl;
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

  private static final int LAYOUT_FRAGMENTCHANGEPASSWORD = 3;

  private static final int LAYOUT_FRAGMENTCONFIRMCODE = 4;

  private static final int LAYOUT_FRAGMENTFORGETPASSWORD = 5;

  private static final int LAYOUT_FRAGMENTLOGIN = 6;

  private static final int LAYOUT_FRAGMENTONBOARD = 7;

  private static final int LAYOUT_FRAGMENTREGISTER = 8;

  private static final int LAYOUT_FRAGMENTSPLASH = 9;

  private static final int LAYOUT_LAYOUTACTIONBARBACK = 10;

  private static final int LAYOUT_LAYOUTACTIONBARHOME = 11;

  private static final int LAYOUT_LAYOUTGRAND = 12;

  private static final int LAYOUT_MENU = 13;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(13);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.notta.R.layout.activity_base, LAYOUT_ACTIVITYBASE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.notta.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.notta.R.layout.fragment_change_password, LAYOUT_FRAGMENTCHANGEPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.notta.R.layout.fragment_confirm_code, LAYOUT_FRAGMENTCONFIRMCODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.notta.R.layout.fragment_forget_password, LAYOUT_FRAGMENTFORGETPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.notta.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.notta.R.layout.fragment_onboard, LAYOUT_FRAGMENTONBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.notta.R.layout.fragment_register, LAYOUT_FRAGMENTREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.notta.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.notta.R.layout.layout_action_bar_back, LAYOUT_LAYOUTACTIONBARBACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.notta.R.layout.layout_action_bar_home, LAYOUT_LAYOUTACTIONBARHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.notta.R.layout.layout_grand, LAYOUT_LAYOUTGRAND);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grand.app.notta.R.layout.menu, LAYOUT_MENU);
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
        case  LAYOUT_FRAGMENTCHANGEPASSWORD: {
          if ("layout/fragment_change_password_0".equals(tag)) {
            return new FragmentChangePasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_change_password is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCONFIRMCODE: {
          if ("layout/fragment_confirm_code_0".equals(tag)) {
            return new FragmentConfirmCodeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_confirm_code is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFORGETPASSWORD: {
          if ("layout/fragment_forget_password_0".equals(tag)) {
            return new FragmentForgetPasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_forget_password is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTONBOARD: {
          if ("layout/fragment_onboard_0".equals(tag)) {
            return new FragmentOnboardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_onboard is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREGISTER: {
          if ("layout/fragment_register_0".equals(tag)) {
            return new FragmentRegisterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_register is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSPLASH: {
          if ("layout/fragment_splash_0".equals(tag)) {
            return new FragmentSplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(9);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "baseViewModel");
      sKeys.put(2, "menuViewModel");
      sKeys.put(3, "message");
      sKeys.put(4, "onBoardAdapter");
      sKeys.put(5, "onBoardViewModels");
      sKeys.put(6, "passingObject");
      sKeys.put(7, "request");
      sKeys.put(8, "viewmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(13);

    static {
      sKeys.put("layout/activity_base_0", grand.app.notta.R.layout.activity_base);
      sKeys.put("layout/activity_main_0", grand.app.notta.R.layout.activity_main);
      sKeys.put("layout/fragment_change_password_0", grand.app.notta.R.layout.fragment_change_password);
      sKeys.put("layout/fragment_confirm_code_0", grand.app.notta.R.layout.fragment_confirm_code);
      sKeys.put("layout/fragment_forget_password_0", grand.app.notta.R.layout.fragment_forget_password);
      sKeys.put("layout/fragment_login_0", grand.app.notta.R.layout.fragment_login);
      sKeys.put("layout/fragment_onboard_0", grand.app.notta.R.layout.fragment_onboard);
      sKeys.put("layout/fragment_register_0", grand.app.notta.R.layout.fragment_register);
      sKeys.put("layout/fragment_splash_0", grand.app.notta.R.layout.fragment_splash);
      sKeys.put("layout/layout_action_bar_back_0", grand.app.notta.R.layout.layout_action_bar_back);
      sKeys.put("layout/layout_action_bar_home_0", grand.app.notta.R.layout.layout_action_bar_home);
      sKeys.put("layout/layout_grand_0", grand.app.notta.R.layout.layout_grand);
      sKeys.put("layout/menu_0", grand.app.notta.R.layout.menu);
    }
  }
}
