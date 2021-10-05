package te.app.notta;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import te.app.notta.databinding.ActivityBaseBindingImpl;
import te.app.notta.databinding.ActivityExoPlayerBindingImpl;
import te.app.notta.databinding.ActivityMainBindingImpl;
import te.app.notta.databinding.DeleteSheetBindingImpl;
import te.app.notta.databinding.FragmentAboutBindingImpl;
import te.app.notta.databinding.FragmentAddAnswerBindingImpl;
import te.app.notta.databinding.FragmentAddGiftBindingImpl;
import te.app.notta.databinding.FragmentAddGroupBindingImpl;
import te.app.notta.databinding.FragmentAddTaskBindingImpl;
import te.app.notta.databinding.FragmentChangePasswordBindingImpl;
import te.app.notta.databinding.FragmentConfirmCodeBindingImpl;
import te.app.notta.databinding.FragmentContactBindingImpl;
import te.app.notta.databinding.FragmentEditProfileBindingImpl;
import te.app.notta.databinding.FragmentForgetPasswordBindingImpl;
import te.app.notta.databinding.FragmentGroupDetailsBindingImpl;
import te.app.notta.databinding.FragmentGroupMembersBindingImpl;
import te.app.notta.databinding.FragmentGroupStudentsBindingImpl;
import te.app.notta.databinding.FragmentHomeBindingImpl;
import te.app.notta.databinding.FragmentInviteStudentBindingImpl;
import te.app.notta.databinding.FragmentLangBindingImpl;
import te.app.notta.databinding.FragmentLoginBindingImpl;
import te.app.notta.databinding.FragmentMoreBindingImpl;
import te.app.notta.databinding.FragmentMyGroupsBindingImpl;
import te.app.notta.databinding.FragmentMyPointsBindingImpl;
import te.app.notta.databinding.FragmentNotificationsBindingImpl;
import te.app.notta.databinding.FragmentOnboardBindingImpl;
import te.app.notta.databinding.FragmentPointsBindingImpl;
import te.app.notta.databinding.FragmentProfileBindingImpl;
import te.app.notta.databinding.FragmentRegisterBindingImpl;
import te.app.notta.databinding.FragmentRequestsBindingImpl;
import te.app.notta.databinding.FragmentSplashBindingImpl;
import te.app.notta.databinding.FragmentStudentTasksBindingImpl;
import te.app.notta.databinding.FragmentTasksBindingImpl;
import te.app.notta.databinding.GivePointsSheetBindingImpl;
import te.app.notta.databinding.ItemHomeBindingImpl;
import te.app.notta.databinding.ItemHorMemberBindingImpl;
import te.app.notta.databinding.ItemMemberBindingImpl;
import te.app.notta.databinding.ItemMoreBindingImpl;
import te.app.notta.databinding.ItemMyGroupBindingImpl;
import te.app.notta.databinding.ItemPointsBindingImpl;
import te.app.notta.databinding.ItemProfileBindingImpl;
import te.app.notta.databinding.ItemRecentTaskBindingImpl;
import te.app.notta.databinding.ItemStudentInviteBindingImpl;
import te.app.notta.databinding.ItemStudentRequestBindingImpl;
import te.app.notta.databinding.ItemTaskMediaBindingImpl;
import te.app.notta.databinding.LayoutActionBarBackBindingImpl;
import te.app.notta.databinding.LayoutActionBarHomeBindingImpl;
import te.app.notta.databinding.LayoutGrandBindingImpl;
import te.app.notta.databinding.MenuBindingImpl;
import te.app.notta.databinding.NotifyItemBindingImpl;
import te.app.notta.databinding.SuccessSheetBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYBASE = 1;

  private static final int LAYOUT_ACTIVITYEXOPLAYER = 2;

  private static final int LAYOUT_ACTIVITYMAIN = 3;

  private static final int LAYOUT_DELETESHEET = 4;

  private static final int LAYOUT_FRAGMENTABOUT = 5;

  private static final int LAYOUT_FRAGMENTADDANSWER = 6;

  private static final int LAYOUT_FRAGMENTADDGIFT = 7;

  private static final int LAYOUT_FRAGMENTADDGROUP = 8;

  private static final int LAYOUT_FRAGMENTADDTASK = 9;

  private static final int LAYOUT_FRAGMENTCHANGEPASSWORD = 10;

  private static final int LAYOUT_FRAGMENTCONFIRMCODE = 11;

  private static final int LAYOUT_FRAGMENTCONTACT = 12;

  private static final int LAYOUT_FRAGMENTEDITPROFILE = 13;

  private static final int LAYOUT_FRAGMENTFORGETPASSWORD = 14;

  private static final int LAYOUT_FRAGMENTGROUPDETAILS = 15;

  private static final int LAYOUT_FRAGMENTGROUPMEMBERS = 16;

  private static final int LAYOUT_FRAGMENTGROUPSTUDENTS = 17;

  private static final int LAYOUT_FRAGMENTHOME = 18;

  private static final int LAYOUT_FRAGMENTINVITESTUDENT = 19;

  private static final int LAYOUT_FRAGMENTLANG = 20;

  private static final int LAYOUT_FRAGMENTLOGIN = 21;

  private static final int LAYOUT_FRAGMENTMORE = 22;

  private static final int LAYOUT_FRAGMENTMYGROUPS = 23;

  private static final int LAYOUT_FRAGMENTMYPOINTS = 24;

  private static final int LAYOUT_FRAGMENTNOTIFICATIONS = 25;

  private static final int LAYOUT_FRAGMENTONBOARD = 26;

  private static final int LAYOUT_FRAGMENTPOINTS = 27;

  private static final int LAYOUT_FRAGMENTPROFILE = 28;

  private static final int LAYOUT_FRAGMENTREGISTER = 29;

  private static final int LAYOUT_FRAGMENTREQUESTS = 30;

  private static final int LAYOUT_FRAGMENTSPLASH = 31;

  private static final int LAYOUT_FRAGMENTSTUDENTTASKS = 32;

  private static final int LAYOUT_FRAGMENTTASKS = 33;

  private static final int LAYOUT_GIVEPOINTSSHEET = 34;

  private static final int LAYOUT_ITEMHOME = 35;

  private static final int LAYOUT_ITEMHORMEMBER = 36;

  private static final int LAYOUT_ITEMMEMBER = 37;

  private static final int LAYOUT_ITEMMORE = 38;

  private static final int LAYOUT_ITEMMYGROUP = 39;

  private static final int LAYOUT_ITEMPOINTS = 40;

  private static final int LAYOUT_ITEMPROFILE = 41;

  private static final int LAYOUT_ITEMRECENTTASK = 42;

  private static final int LAYOUT_ITEMSTUDENTINVITE = 43;

  private static final int LAYOUT_ITEMSTUDENTREQUEST = 44;

  private static final int LAYOUT_ITEMTASKMEDIA = 45;

  private static final int LAYOUT_LAYOUTACTIONBARBACK = 46;

  private static final int LAYOUT_LAYOUTACTIONBARHOME = 47;

  private static final int LAYOUT_LAYOUTGRAND = 48;

  private static final int LAYOUT_MENU = 49;

  private static final int LAYOUT_NOTIFYITEM = 50;

  private static final int LAYOUT_SUCCESSSHEET = 51;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(51);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.activity_base, LAYOUT_ACTIVITYBASE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.activity_exo_player, LAYOUT_ACTIVITYEXOPLAYER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.delete_sheet, LAYOUT_DELETESHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_about, LAYOUT_FRAGMENTABOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_add_answer, LAYOUT_FRAGMENTADDANSWER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_add_gift, LAYOUT_FRAGMENTADDGIFT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_add_group, LAYOUT_FRAGMENTADDGROUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_add_task, LAYOUT_FRAGMENTADDTASK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_change_password, LAYOUT_FRAGMENTCHANGEPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_confirm_code, LAYOUT_FRAGMENTCONFIRMCODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_contact, LAYOUT_FRAGMENTCONTACT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_edit_profile, LAYOUT_FRAGMENTEDITPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_forget_password, LAYOUT_FRAGMENTFORGETPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_group_details, LAYOUT_FRAGMENTGROUPDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_group_members, LAYOUT_FRAGMENTGROUPMEMBERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_group_students, LAYOUT_FRAGMENTGROUPSTUDENTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_invite_student, LAYOUT_FRAGMENTINVITESTUDENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_lang, LAYOUT_FRAGMENTLANG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_more, LAYOUT_FRAGMENTMORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_my_groups, LAYOUT_FRAGMENTMYGROUPS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_my_points, LAYOUT_FRAGMENTMYPOINTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_notifications, LAYOUT_FRAGMENTNOTIFICATIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_onboard, LAYOUT_FRAGMENTONBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_points, LAYOUT_FRAGMENTPOINTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_register, LAYOUT_FRAGMENTREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_requests, LAYOUT_FRAGMENTREQUESTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_student_tasks, LAYOUT_FRAGMENTSTUDENTTASKS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.fragment_tasks, LAYOUT_FRAGMENTTASKS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.give_points_sheet, LAYOUT_GIVEPOINTSSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.item_home, LAYOUT_ITEMHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.item_hor_member, LAYOUT_ITEMHORMEMBER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.item_member, LAYOUT_ITEMMEMBER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.item_more, LAYOUT_ITEMMORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.item_my_group, LAYOUT_ITEMMYGROUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.item_points, LAYOUT_ITEMPOINTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.item_profile, LAYOUT_ITEMPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.item_recent_task, LAYOUT_ITEMRECENTTASK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.item_student_invite, LAYOUT_ITEMSTUDENTINVITE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.item_student_request, LAYOUT_ITEMSTUDENTREQUEST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.item_task_media, LAYOUT_ITEMTASKMEDIA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.layout_action_bar_back, LAYOUT_LAYOUTACTIONBARBACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.layout_action_bar_home, LAYOUT_LAYOUTACTIONBARHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.layout_grand, LAYOUT_LAYOUTGRAND);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.menu, LAYOUT_MENU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.notify_item, LAYOUT_NOTIFYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.notta.R.layout.success_sheet, LAYOUT_SUCCESSSHEET);
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
      case  LAYOUT_ACTIVITYEXOPLAYER: {
        if ("layout/activity_exo_player_0".equals(tag)) {
          return new ActivityExoPlayerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_exo_player is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYMAIN: {
        if ("layout/activity_main_0".equals(tag)) {
          return new ActivityMainBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
      }
      case  LAYOUT_DELETESHEET: {
        if ("layout/delete_sheet_0".equals(tag)) {
          return new DeleteSheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for delete_sheet is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTABOUT: {
        if ("layout/fragment_about_0".equals(tag)) {
          return new FragmentAboutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_about is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDANSWER: {
        if ("layout/fragment_add_answer_0".equals(tag)) {
          return new FragmentAddAnswerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_answer is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDGIFT: {
        if ("layout/fragment_add_gift_0".equals(tag)) {
          return new FragmentAddGiftBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_gift is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDGROUP: {
        if ("layout/fragment_add_group_0".equals(tag)) {
          return new FragmentAddGroupBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_group is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDTASK: {
        if ("layout/fragment_add_task_0".equals(tag)) {
          return new FragmentAddTaskBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_task is invalid. Received: " + tag);
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
      case  LAYOUT_FRAGMENTCONTACT: {
        if ("layout/fragment_contact_0".equals(tag)) {
          return new FragmentContactBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_contact is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTEDITPROFILE: {
        if ("layout/fragment_edit_profile_0".equals(tag)) {
          return new FragmentEditProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_edit_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTFORGETPASSWORD: {
        if ("layout/fragment_forget_password_0".equals(tag)) {
          return new FragmentForgetPasswordBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_forget_password is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTGROUPDETAILS: {
        if ("layout/fragment_group_details_0".equals(tag)) {
          return new FragmentGroupDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_group_details is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTGROUPMEMBERS: {
        if ("layout/fragment_group_members_0".equals(tag)) {
          return new FragmentGroupMembersBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_group_members is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTGROUPSTUDENTS: {
        if ("layout/fragment_group_students_0".equals(tag)) {
          return new FragmentGroupStudentsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_group_students is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTHOME: {
        if ("layout/fragment_home_0".equals(tag)) {
          return new FragmentHomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTINVITESTUDENT: {
        if ("layout/fragment_invite_student_0".equals(tag)) {
          return new FragmentInviteStudentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_invite_student is invalid. Received: " + tag);
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
      case  LAYOUT_FRAGMENTMORE: {
        if ("layout/fragment_more_0".equals(tag)) {
          return new FragmentMoreBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_more is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMYGROUPS: {
        if ("layout/fragment_my_groups_0".equals(tag)) {
          return new FragmentMyGroupsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_my_groups is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMYPOINTS: {
        if ("layout/fragment_my_points_0".equals(tag)) {
          return new FragmentMyPointsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_my_points is invalid. Received: " + tag);
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
      case  LAYOUT_FRAGMENTPOINTS: {
        if ("layout/fragment_points_0".equals(tag)) {
          return new FragmentPointsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_points is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPROFILE: {
        if ("layout/fragment_profile_0".equals(tag)) {
          return new FragmentProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREGISTER: {
        if ("layout/fragment_register_0".equals(tag)) {
          return new FragmentRegisterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_register is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREQUESTS: {
        if ("layout/fragment_requests_0".equals(tag)) {
          return new FragmentRequestsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_requests is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSPLASH: {
        if ("layout/fragment_splash_0".equals(tag)) {
          return new FragmentSplashBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSTUDENTTASKS: {
        if ("layout/fragment_student_tasks_0".equals(tag)) {
          return new FragmentStudentTasksBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_student_tasks is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTTASKS: {
        if ("layout/fragment_tasks_0".equals(tag)) {
          return new FragmentTasksBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_tasks is invalid. Received: " + tag);
      }
      case  LAYOUT_GIVEPOINTSSHEET: {
        if ("layout/give_points_sheet_0".equals(tag)) {
          return new GivePointsSheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for give_points_sheet is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMHOME: {
        if ("layout/item_home_0".equals(tag)) {
          return new ItemHomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_home is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMHORMEMBER: {
        if ("layout/item_hor_member_0".equals(tag)) {
          return new ItemHorMemberBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_hor_member is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMEMBER: {
        if ("layout/item_member_0".equals(tag)) {
          return new ItemMemberBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_member is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMORE: {
        if ("layout/item_more_0".equals(tag)) {
          return new ItemMoreBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_more is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMYGROUP: {
        if ("layout/item_my_group_0".equals(tag)) {
          return new ItemMyGroupBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_my_group is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMPOINTS: {
        if ("layout/item_points_0".equals(tag)) {
          return new ItemPointsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_points is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMPROFILE: {
        if ("layout/item_profile_0".equals(tag)) {
          return new ItemProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMRECENTTASK: {
        if ("layout/item_recent_task_0".equals(tag)) {
          return new ItemRecentTaskBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_recent_task is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSTUDENTINVITE: {
        if ("layout/item_student_invite_0".equals(tag)) {
          return new ItemStudentInviteBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_student_invite is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSTUDENTREQUEST: {
        if ("layout/item_student_request_0".equals(tag)) {
          return new ItemStudentRequestBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_student_request is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMTASKMEDIA: {
        if ("layout/item_task_media_0".equals(tag)) {
          return new ItemTaskMediaBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_task_media is invalid. Received: " + tag);
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
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_SUCCESSSHEET: {
        if ("layout/success_sheet_0".equals(tag)) {
          return new SuccessSheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for success_sheet is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(42);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "aboutData");
      sKeys.put(2, "addAnswerRequest");
      sKeys.put(3, "addTaskRequest");
      sKeys.put(4, "baseViewModel");
      sKeys.put(5, "groupDetails");
      sKeys.put(6, "groupDetailsStudentsAdapter");
      sKeys.put(7, "groupItem");
      sKeys.put(8, "groupRequest");
      sKeys.put(9, "groupsAdapter");
      sKeys.put(10, "homeData");
      sKeys.put(11, "inviteStudentsAdapter");
      sKeys.put(12, "menuViewModel");
      sKeys.put(13, "message");
      sKeys.put(14, "moreAdapter");
      sKeys.put(15, "notificationsAdapter");
      sKeys.put(16, "notificationsData");
      sKeys.put(17, "notifyItemViewModels");
      sKeys.put(18, "notifyViewModel");
      sKeys.put(19, "onBoardAdapter");
      sKeys.put(20, "onBoardViewModels");
      sKeys.put(21, "passingObject");
      sKeys.put(22, "pointsAdapter");
      sKeys.put(23, "pointsData");
      sKeys.put(24, "profileAdaptersAdapter");
      sKeys.put(25, "profileItem");
      sKeys.put(26, "request");
      sKeys.put(27, "selectedUri");
      sKeys.put(28, "student");
      sKeys.put(29, "studentMainData");
      sKeys.put(30, "studentMainPoints");
      sKeys.put(31, "studentTasksMain");
      sKeys.put(32, "studentsItem");
      sKeys.put(33, "studentsRequestsAdapter");
      sKeys.put(34, "taskDetailsData");
      sKeys.put(35, "taskFilesItem");
      sKeys.put(36, "taskMediaAdapter");
      sKeys.put(37, "tasksAdapter");
      sKeys.put(38, "tasksItem");
      sKeys.put(39, "teacherPointsMain");
      sKeys.put(40, "viewModel");
      sKeys.put(41, "viewmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(51);

    static {
      sKeys.put("layout/activity_base_0", te.app.notta.R.layout.activity_base);
      sKeys.put("layout/activity_exo_player_0", te.app.notta.R.layout.activity_exo_player);
      sKeys.put("layout/activity_main_0", te.app.notta.R.layout.activity_main);
      sKeys.put("layout/delete_sheet_0", te.app.notta.R.layout.delete_sheet);
      sKeys.put("layout/fragment_about_0", te.app.notta.R.layout.fragment_about);
      sKeys.put("layout/fragment_add_answer_0", te.app.notta.R.layout.fragment_add_answer);
      sKeys.put("layout/fragment_add_gift_0", te.app.notta.R.layout.fragment_add_gift);
      sKeys.put("layout/fragment_add_group_0", te.app.notta.R.layout.fragment_add_group);
      sKeys.put("layout/fragment_add_task_0", te.app.notta.R.layout.fragment_add_task);
      sKeys.put("layout/fragment_change_password_0", te.app.notta.R.layout.fragment_change_password);
      sKeys.put("layout/fragment_confirm_code_0", te.app.notta.R.layout.fragment_confirm_code);
      sKeys.put("layout/fragment_contact_0", te.app.notta.R.layout.fragment_contact);
      sKeys.put("layout/fragment_edit_profile_0", te.app.notta.R.layout.fragment_edit_profile);
      sKeys.put("layout/fragment_forget_password_0", te.app.notta.R.layout.fragment_forget_password);
      sKeys.put("layout/fragment_group_details_0", te.app.notta.R.layout.fragment_group_details);
      sKeys.put("layout/fragment_group_members_0", te.app.notta.R.layout.fragment_group_members);
      sKeys.put("layout/fragment_group_students_0", te.app.notta.R.layout.fragment_group_students);
      sKeys.put("layout/fragment_home_0", te.app.notta.R.layout.fragment_home);
      sKeys.put("layout/fragment_invite_student_0", te.app.notta.R.layout.fragment_invite_student);
      sKeys.put("layout/fragment_lang_0", te.app.notta.R.layout.fragment_lang);
      sKeys.put("layout/fragment_login_0", te.app.notta.R.layout.fragment_login);
      sKeys.put("layout/fragment_more_0", te.app.notta.R.layout.fragment_more);
      sKeys.put("layout/fragment_my_groups_0", te.app.notta.R.layout.fragment_my_groups);
      sKeys.put("layout/fragment_my_points_0", te.app.notta.R.layout.fragment_my_points);
      sKeys.put("layout/fragment_notifications_0", te.app.notta.R.layout.fragment_notifications);
      sKeys.put("layout/fragment_onboard_0", te.app.notta.R.layout.fragment_onboard);
      sKeys.put("layout/fragment_points_0", te.app.notta.R.layout.fragment_points);
      sKeys.put("layout/fragment_profile_0", te.app.notta.R.layout.fragment_profile);
      sKeys.put("layout/fragment_register_0", te.app.notta.R.layout.fragment_register);
      sKeys.put("layout/fragment_requests_0", te.app.notta.R.layout.fragment_requests);
      sKeys.put("layout/fragment_splash_0", te.app.notta.R.layout.fragment_splash);
      sKeys.put("layout/fragment_student_tasks_0", te.app.notta.R.layout.fragment_student_tasks);
      sKeys.put("layout/fragment_tasks_0", te.app.notta.R.layout.fragment_tasks);
      sKeys.put("layout/give_points_sheet_0", te.app.notta.R.layout.give_points_sheet);
      sKeys.put("layout/item_home_0", te.app.notta.R.layout.item_home);
      sKeys.put("layout/item_hor_member_0", te.app.notta.R.layout.item_hor_member);
      sKeys.put("layout/item_member_0", te.app.notta.R.layout.item_member);
      sKeys.put("layout/item_more_0", te.app.notta.R.layout.item_more);
      sKeys.put("layout/item_my_group_0", te.app.notta.R.layout.item_my_group);
      sKeys.put("layout/item_points_0", te.app.notta.R.layout.item_points);
      sKeys.put("layout/item_profile_0", te.app.notta.R.layout.item_profile);
      sKeys.put("layout/item_recent_task_0", te.app.notta.R.layout.item_recent_task);
      sKeys.put("layout/item_student_invite_0", te.app.notta.R.layout.item_student_invite);
      sKeys.put("layout/item_student_request_0", te.app.notta.R.layout.item_student_request);
      sKeys.put("layout/item_task_media_0", te.app.notta.R.layout.item_task_media);
      sKeys.put("layout/layout_action_bar_back_0", te.app.notta.R.layout.layout_action_bar_back);
      sKeys.put("layout/layout_action_bar_home_0", te.app.notta.R.layout.layout_action_bar_home);
      sKeys.put("layout/layout_grand_0", te.app.notta.R.layout.layout_grand);
      sKeys.put("layout/menu_0", te.app.notta.R.layout.menu);
      sKeys.put("layout/notify_item_0", te.app.notta.R.layout.notify_item);
      sKeys.put("layout/success_sheet_0", te.app.notta.R.layout.success_sheet);
    }
  }
}
