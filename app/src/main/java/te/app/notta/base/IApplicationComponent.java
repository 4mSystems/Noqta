package te.app.notta.base;

import javax.inject.Singleton;

import dagger.Component;
import te.app.notta.activity.BaseActivity;
import te.app.notta.activity.MainActivity;
import te.app.notta.connection.ConnectionModule;
import te.app.notta.pages.addAnswer.AddAnswerFragment;
import te.app.notta.pages.auth.changePassword.ChangePasswordFragment;
import te.app.notta.pages.auth.confirmCode.ConfirmCodeFragment;
import te.app.notta.pages.auth.forgetPassword.ForgetPasswordFragment;
import te.app.notta.pages.auth.login.LoginFragment;
import te.app.notta.pages.auth.register.RegisterFragment;
import te.app.notta.pages.home.GroupDetailsFragment;
import te.app.notta.pages.home.GroupMembersFragment;
import te.app.notta.pages.home.GroupStudentFragment;
import te.app.notta.pages.home.HomeFragment;
import te.app.notta.pages.points.MyPointsFragment;
import te.app.notta.pages.points.PointsFragment;
import te.app.notta.pages.home.TasksFragment;
import te.app.notta.pages.myGroups.MyGroupsFragment;
import te.app.notta.pages.onBoard.OnBoardFragment;
import te.app.notta.pages.auth.register.EditProfileFragment;
import te.app.notta.pages.settings.AboutFragment;
import te.app.notta.pages.settings.ContactUsFragment;
import te.app.notta.pages.settings.LangFragment;
import te.app.notta.pages.settings.MoreFragment;
import te.app.notta.pages.settings.ProfileFragment;
import te.app.notta.pages.splash.SplashFragment;
import te.app.notta.pages.teacher.AddGiftFragment;
import te.app.notta.pages.teacher.AddGroupFragment;
import te.app.notta.pages.teacher.AddTaskFragment;
import te.app.notta.pages.teacher.InviteStudentsToGroupFragment;
import te.app.notta.pages.teacher.StudentRequestsFragment;

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

    @Component.Builder
    interface Builder {
        IApplicationComponent build();
    }
}
