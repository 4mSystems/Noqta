package te.app.nottaa.base;

import javax.inject.Singleton;

import dagger.Component;
import te.app.nottaa.activity.BaseActivity;
import te.app.nottaa.activity.MainActivity;
import te.app.nottaa.connection.ConnectionModule;
import te.app.nottaa.pages.addAnswer.AddAnswerFragment;
import te.app.nottaa.pages.auth.changePassword.ChangePasswordFragment;
import te.app.nottaa.pages.auth.confirmCode.ConfirmCodeFragment;
import te.app.nottaa.pages.auth.forgetPassword.ForgetPasswordFragment;
import te.app.nottaa.pages.auth.login.LoginFragment;
import te.app.nottaa.pages.auth.register.RegisterFragment;
import te.app.nottaa.pages.groupDetails.GroupDetailsFragment;
import te.app.nottaa.pages.groupDetails.GroupMembersFragment;
import te.app.nottaa.pages.groupDetails.GroupStudentFragment;
import te.app.nottaa.pages.groupDetails.StudentTasksFragment;
import te.app.nottaa.pages.home.HomeFragment;
import te.app.nottaa.pages.notifications.NotificationsFragment;
import te.app.nottaa.pages.points.MyPointsFragment;
import te.app.nottaa.pages.points.PointsFragment;
import te.app.nottaa.pages.home.TasksFragment;
import te.app.nottaa.pages.myGroups.MyGroupsFragment;
import te.app.nottaa.pages.onBoard.OnBoardFragment;
import te.app.nottaa.pages.auth.register.EditProfileFragment;
import te.app.nottaa.pages.settings.AboutFragment;
import te.app.nottaa.pages.settings.ContactUsFragment;
import te.app.nottaa.pages.settings.LangFragment;
import te.app.nottaa.pages.settings.MoreFragment;
import te.app.nottaa.pages.settings.ProfileFragment;
import te.app.nottaa.pages.splash.SplashFragment;
import te.app.nottaa.pages.teacher.AddGiftFragment;
import te.app.nottaa.pages.teacher.AddGroupFragment;
import te.app.nottaa.pages.teacher.AddTaskFragment;
import te.app.nottaa.pages.teacher.InviteStudentsToGroupFragment;
import te.app.nottaa.pages.teacher.StudentRequestsFragment;

@Singleton
@Component(modules = {ConnectionModule.class, LiveData.class})
public interface IApplicationComponent {
    void inject(MainActivity mainActivity);

    void inject(BaseActivity tmpActivity);

    void inject(SplashFragment splashFragment);

    void inject(OnBoardFragment onBoardFragment);

    void inject(LoginFragment loginFragment);

    void inject(ForgetPasswordFragment forgetPasswordFragment);

    void inject(ConfirmCodeFragment confirmCodeFragment);

    void inject(ChangePasswordFragment changePasswordFragment);

    void inject(RegisterFragment registerFragment);

    void inject(HomeFragment homeFragment);

    void inject(TasksFragment tasksFragment);

    void inject(PointsFragment pointsFragment);

    void inject(ProfileFragment profileFragment);

    void inject(EditProfileFragment editProfileFragment);

    void inject(MyGroupsFragment myGroupsFragment);

    void inject(MoreFragment moreFragment);

    void inject(AboutFragment aboutFragment);

    void inject(ContactUsFragment contactUsFragment);

    void inject(AddAnswerFragment addAnswerFragment);

    void inject(GroupMembersFragment groupMembersFragment);

    void inject(AddGroupFragment addGroupFragment);

    void inject(AddGiftFragment addGiftFragment);

    void inject(StudentRequestsFragment studentRequestsFragment);

    void inject(LangFragment langFragment);

    void inject(GroupDetailsFragment groupDetailsFragment);

    void inject(InviteStudentsToGroupFragment inviteStudentsToGroupFragment);

    void inject(AddTaskFragment addTaskFragment);

    void inject(GroupStudentFragment groupStudentFragment);

    void inject(MyPointsFragment myPointsFragment);

    void inject(StudentTasksFragment studentTasksFragment);

    void inject(NotificationsFragment notificationsFragment);

    @Component.Builder
    interface Builder {
        IApplicationComponent build();
    }
}
