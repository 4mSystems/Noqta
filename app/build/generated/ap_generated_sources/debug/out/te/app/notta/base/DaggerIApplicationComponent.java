// Generated by Dagger (https://dagger.dev).
package te.app.notta.base;

import dagger.internal.DoubleCheck;
import javax.inject.Provider;
import te.app.notta.activity.BaseActivity;
import te.app.notta.activity.MainActivity;
import te.app.notta.activity.MainActivity_MembersInjector;
import te.app.notta.connection.Api;
import te.app.notta.connection.ConnectionHelper;
import te.app.notta.connection.ConnectionHelper_Factory;
import te.app.notta.connection.ConnectionModule;
import te.app.notta.connection.ConnectionModule_WebServiceFactory;
import te.app.notta.pages.addAnswer.AddAnswerFragment;
import te.app.notta.pages.addAnswer.AddAnswerFragment_MembersInjector;
import te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel;
import te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel_Factory;
import te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel_MembersInjector;
import te.app.notta.pages.auth.changePassword.ChangePasswordFragment;
import te.app.notta.pages.auth.changePassword.ChangePasswordFragment_MembersInjector;
import te.app.notta.pages.auth.changePassword.ChangePasswordViewModel;
import te.app.notta.pages.auth.changePassword.ChangePasswordViewModel_Factory;
import te.app.notta.pages.auth.changePassword.ChangePasswordViewModel_MembersInjector;
import te.app.notta.pages.auth.confirmCode.ConfirmCodeFragment;
import te.app.notta.pages.auth.confirmCode.ConfirmCodeFragment_MembersInjector;
import te.app.notta.pages.auth.confirmCode.ConfirmViewModel;
import te.app.notta.pages.auth.confirmCode.ConfirmViewModel_Factory;
import te.app.notta.pages.auth.confirmCode.ConfirmViewModel_MembersInjector;
import te.app.notta.pages.auth.forgetPassword.ForgetPasswordFragment;
import te.app.notta.pages.auth.forgetPassword.ForgetPasswordFragment_MembersInjector;
import te.app.notta.pages.auth.forgetPassword.ForgetPasswordViewModel;
import te.app.notta.pages.auth.forgetPassword.ForgetPasswordViewModel_Factory;
import te.app.notta.pages.auth.forgetPassword.ForgetPasswordViewModel_MembersInjector;
import te.app.notta.pages.auth.login.LoginFragment;
import te.app.notta.pages.auth.login.LoginFragment_MembersInjector;
import te.app.notta.pages.auth.login.LoginViewModel;
import te.app.notta.pages.auth.login.LoginViewModel_Factory;
import te.app.notta.pages.auth.login.LoginViewModel_MembersInjector;
import te.app.notta.pages.auth.register.EditProfileFragment;
import te.app.notta.pages.auth.register.EditProfileFragment_MembersInjector;
import te.app.notta.pages.auth.register.RegisterFragment;
import te.app.notta.pages.auth.register.RegisterFragment_MembersInjector;
import te.app.notta.pages.auth.register.RegisterViewModel;
import te.app.notta.pages.auth.register.RegisterViewModel_Factory;
import te.app.notta.pages.auth.register.RegisterViewModel_MembersInjector;
import te.app.notta.pages.home.GroupDetailsFragment;
import te.app.notta.pages.home.GroupDetailsFragment_MembersInjector;
import te.app.notta.pages.home.GroupMembersFragment;
import te.app.notta.pages.home.GroupMembersFragment_MembersInjector;
import te.app.notta.pages.home.GroupStudentFragment;
import te.app.notta.pages.home.GroupStudentFragment_MembersInjector;
import te.app.notta.pages.home.HomeFragment;
import te.app.notta.pages.home.HomeFragment_MembersInjector;
import te.app.notta.pages.home.PointsFragment;
import te.app.notta.pages.home.PointsFragment_MembersInjector;
import te.app.notta.pages.home.TasksFragment;
import te.app.notta.pages.home.TasksFragment_MembersInjector;
import te.app.notta.pages.home.viewModels.GroupDetailsViewModel;
import te.app.notta.pages.home.viewModels.GroupDetailsViewModel_Factory;
import te.app.notta.pages.home.viewModels.GroupDetailsViewModel_MembersInjector;
import te.app.notta.pages.home.viewModels.HomeViewModel;
import te.app.notta.pages.home.viewModels.HomeViewModel_Factory;
import te.app.notta.pages.home.viewModels.HomeViewModel_MembersInjector;
import te.app.notta.pages.home.viewModels.PointsViewModel;
import te.app.notta.pages.home.viewModels.PointsViewModel_Factory;
import te.app.notta.pages.home.viewModels.PointsViewModel_MembersInjector;
import te.app.notta.pages.myGroups.MyGroupsFragment;
import te.app.notta.pages.myGroups.MyGroupsFragment_MembersInjector;
import te.app.notta.pages.myGroups.viewModels.MyGroupsViewModel;
import te.app.notta.pages.myGroups.viewModels.MyGroupsViewModel_Factory;
import te.app.notta.pages.myGroups.viewModels.MyGroupsViewModel_MembersInjector;
import te.app.notta.pages.onBoard.OnBoardFragment;
import te.app.notta.pages.onBoard.OnBoardFragment_MembersInjector;
import te.app.notta.pages.settings.AboutFragment;
import te.app.notta.pages.settings.AboutFragment_MembersInjector;
import te.app.notta.pages.settings.ContactUsFragment;
import te.app.notta.pages.settings.ContactUsFragment_MembersInjector;
import te.app.notta.pages.settings.LangFragment;
import te.app.notta.pages.settings.LangFragment_MembersInjector;
import te.app.notta.pages.settings.MoreFragment;
import te.app.notta.pages.settings.MoreFragment_MembersInjector;
import te.app.notta.pages.settings.ProfileFragment;
import te.app.notta.pages.settings.ProfileFragment_MembersInjector;
import te.app.notta.pages.settings.viewModels.SettingsViewModel;
import te.app.notta.pages.settings.viewModels.SettingsViewModel_Factory;
import te.app.notta.pages.settings.viewModels.SettingsViewModel_MembersInjector;
import te.app.notta.pages.splash.SplashFragment;
import te.app.notta.pages.splash.SplashFragment_MembersInjector;
import te.app.notta.pages.splash.SplashViewModel;
import te.app.notta.pages.splash.SplashViewModel_Factory;
import te.app.notta.pages.splash.SplashViewModel_MembersInjector;
import te.app.notta.pages.teacher.AddGiftFragment;
import te.app.notta.pages.teacher.AddGiftFragment_MembersInjector;
import te.app.notta.pages.teacher.AddGroupFragment;
import te.app.notta.pages.teacher.AddGroupFragment_MembersInjector;
import te.app.notta.pages.teacher.AddTaskFragment;
import te.app.notta.pages.teacher.AddTaskFragment_MembersInjector;
import te.app.notta.pages.teacher.InviteStudentsToGroupFragment;
import te.app.notta.pages.teacher.InviteStudentsToGroupFragment_MembersInjector;
import te.app.notta.pages.teacher.StudentRequestsFragment;
import te.app.notta.pages.teacher.StudentRequestsFragment_MembersInjector;
import te.app.notta.pages.teacher.viewModels.AddGroupViewModel;
import te.app.notta.pages.teacher.viewModels.AddGroupViewModel_Factory;
import te.app.notta.pages.teacher.viewModels.AddGroupViewModel_MembersInjector;
import te.app.notta.pages.teacher.viewModels.AddTaskViewModel;
import te.app.notta.pages.teacher.viewModels.AddTaskViewModel_Factory;
import te.app.notta.pages.teacher.viewModels.AddTaskViewModel_MembersInjector;
import te.app.notta.repository.AuthRepository;
import te.app.notta.repository.AuthRepository_Factory;
import te.app.notta.repository.GroupRepository;
import te.app.notta.repository.GroupRepository_Factory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerIApplicationComponent implements IApplicationComponent {
  private Provider<Api> webServiceProvider;

  private Provider<ConnectionHelper> connectionHelperProvider;

  private Provider<GroupRepository> groupRepositoryProvider;

  private Provider<AuthRepository> authRepositoryProvider;

  private DaggerIApplicationComponent(ConnectionModule connectionModuleParam) {

    initialize(connectionModuleParam);
  }

  public static IApplicationComponent.Builder builder() {
    return new Builder();
  }

  public static IApplicationComponent create() {
    return new Builder().build();
  }

  private HomeViewModel homeViewModel() {
    return injectHomeViewModel(HomeViewModel_Factory.newInstance(groupRepositoryProvider.get()));
  }

  private SplashViewModel splashViewModel() {
    return injectSplashViewModel(SplashViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private LoginViewModel loginViewModel() {
    return injectLoginViewModel(LoginViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private ForgetPasswordViewModel forgetPasswordViewModel() {
    return injectForgetPasswordViewModel(ForgetPasswordViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private ConfirmViewModel confirmViewModel() {
    return injectConfirmViewModel(ConfirmViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private ChangePasswordViewModel changePasswordViewModel() {
    return injectChangePasswordViewModel(ChangePasswordViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private RegisterViewModel registerViewModel() {
    return injectRegisterViewModel(RegisterViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private PointsViewModel pointsViewModel() {
    return injectPointsViewModel(PointsViewModel_Factory.newInstance(groupRepositoryProvider.get()));
  }

  private SettingsViewModel settingsViewModel() {
    return injectSettingsViewModel(SettingsViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private MyGroupsViewModel myGroupsViewModel() {
    return injectMyGroupsViewModel(MyGroupsViewModel_Factory.newInstance(groupRepositoryProvider.get()));
  }

  private AddAnswerViewModel addAnswerViewModel() {
    return injectAddAnswerViewModel(AddAnswerViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private AddGroupViewModel addGroupViewModel() {
    return injectAddGroupViewModel(AddGroupViewModel_Factory.newInstance(groupRepositoryProvider.get()));
  }

  private GroupDetailsViewModel groupDetailsViewModel() {
    return injectGroupDetailsViewModel(GroupDetailsViewModel_Factory.newInstance(groupRepositoryProvider.get()));
  }

  private AddTaskViewModel addTaskViewModel() {
    return injectAddTaskViewModel(AddTaskViewModel_Factory.newInstance(groupRepositoryProvider.get()));
  }

  @SuppressWarnings("unchecked")
  private void initialize(final ConnectionModule connectionModuleParam) {
    this.webServiceProvider = DoubleCheck.provider(ConnectionModule_WebServiceFactory.create(connectionModuleParam));
    this.connectionHelperProvider = DoubleCheck.provider(ConnectionHelper_Factory.create(webServiceProvider, webServiceProvider));
    this.groupRepositoryProvider = DoubleCheck.provider(GroupRepository_Factory.create(connectionHelperProvider, connectionHelperProvider, connectionHelperProvider));
    this.authRepositoryProvider = DoubleCheck.provider(AuthRepository_Factory.create(connectionHelperProvider, connectionHelperProvider, connectionHelperProvider));
  }

  @Override
  public void inject(MainActivity mainActivity) {
    injectMainActivity(mainActivity);
  }

  @Override
  public void inject(BaseActivity tmpActivity) {
  }

  @Override
  public void inject(SplashFragment splashFragment) {
    injectSplashFragment(splashFragment);
  }

  @Override
  public void inject(OnBoardFragment onBoardFragment) {
    injectOnBoardFragment(onBoardFragment);
  }

  @Override
  public void inject(LoginFragment loginFragment) {
    injectLoginFragment(loginFragment);
  }

  @Override
  public void inject(ForgetPasswordFragment forgetPasswordFragment) {
    injectForgetPasswordFragment(forgetPasswordFragment);
  }

  @Override
  public void inject(ConfirmCodeFragment confirmCodeFragment) {
    injectConfirmCodeFragment(confirmCodeFragment);
  }

  @Override
  public void inject(ChangePasswordFragment changePasswordFragment) {
    injectChangePasswordFragment(changePasswordFragment);
  }

  @Override
  public void inject(RegisterFragment registerFragment) {
    injectRegisterFragment(registerFragment);
  }

  @Override
  public void inject(HomeFragment homeFragment) {
    injectHomeFragment(homeFragment);
  }

  @Override
  public void inject(TasksFragment tasksFragment) {
    injectTasksFragment(tasksFragment);
  }

  @Override
  public void inject(PointsFragment pointsFragment) {
    injectPointsFragment(pointsFragment);
  }

  @Override
  public void inject(ProfileFragment profileFragment) {
    injectProfileFragment(profileFragment);
  }

  @Override
  public void inject(EditProfileFragment editProfileFragment) {
    injectEditProfileFragment(editProfileFragment);
  }

  @Override
  public void inject(MyGroupsFragment myGroupsFragment) {
    injectMyGroupsFragment(myGroupsFragment);
  }

  @Override
  public void inject(MoreFragment moreFragment) {
    injectMoreFragment(moreFragment);
  }

  @Override
  public void inject(AboutFragment aboutFragment) {
    injectAboutFragment(aboutFragment);
  }

  @Override
  public void inject(ContactUsFragment contactUsFragment) {
    injectContactUsFragment(contactUsFragment);
  }

  @Override
  public void inject(AddAnswerFragment addAnswerFragment) {
    injectAddAnswerFragment(addAnswerFragment);
  }

  @Override
  public void inject(GroupMembersFragment groupMembersFragment) {
    injectGroupMembersFragment(groupMembersFragment);
  }

  @Override
  public void inject(AddGroupFragment addGroupFragment) {
    injectAddGroupFragment(addGroupFragment);
  }

  @Override
  public void inject(AddGiftFragment addGiftFragment) {
    injectAddGiftFragment(addGiftFragment);
  }

  @Override
  public void inject(StudentRequestsFragment studentRequestsFragment) {
    injectStudentRequestsFragment(studentRequestsFragment);
  }

  @Override
  public void inject(LangFragment langFragment) {
    injectLangFragment(langFragment);
  }

  @Override
  public void inject(GroupDetailsFragment groupDetailsFragment) {
    injectGroupDetailsFragment(groupDetailsFragment);
  }

  @Override
  public void inject(InviteStudentsToGroupFragment inviteStudentsToGroupFragment) {
    injectInviteStudentsToGroupFragment(inviteStudentsToGroupFragment);
  }

  @Override
  public void inject(AddTaskFragment addTaskFragment) {
    injectAddTaskFragment(addTaskFragment);
  }

  @Override
  public void inject(GroupStudentFragment groupStudentFragment) {
    injectGroupStudentFragment(groupStudentFragment);
  }

  private HomeViewModel injectHomeViewModel(HomeViewModel instance) {
    HomeViewModel_MembersInjector.injectRepository(instance, groupRepositoryProvider.get());
    return instance;
  }

  private MainActivity injectMainActivity(MainActivity instance) {
    MainActivity_MembersInjector.injectViewModel(instance, homeViewModel());
    return instance;
  }

  private SplashViewModel injectSplashViewModel(SplashViewModel instance) {
    SplashViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private SplashFragment injectSplashFragment(SplashFragment instance) {
    SplashFragment_MembersInjector.injectViewModel(instance, splashViewModel());
    return instance;
  }

  private OnBoardFragment injectOnBoardFragment(OnBoardFragment instance) {
    OnBoardFragment_MembersInjector.injectViewModel(instance, splashViewModel());
    return instance;
  }

  private LoginViewModel injectLoginViewModel(LoginViewModel instance) {
    LoginViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private LoginFragment injectLoginFragment(LoginFragment instance) {
    LoginFragment_MembersInjector.injectViewModel(instance, loginViewModel());
    return instance;
  }

  private ForgetPasswordViewModel injectForgetPasswordViewModel(ForgetPasswordViewModel instance) {
    ForgetPasswordViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private ForgetPasswordFragment injectForgetPasswordFragment(ForgetPasswordFragment instance) {
    ForgetPasswordFragment_MembersInjector.injectViewModel(instance, forgetPasswordViewModel());
    return instance;
  }

  private ConfirmViewModel injectConfirmViewModel(ConfirmViewModel instance) {
    ConfirmViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private ConfirmCodeFragment injectConfirmCodeFragment(ConfirmCodeFragment instance) {
    ConfirmCodeFragment_MembersInjector.injectViewModel(instance, confirmViewModel());
    return instance;
  }

  private ChangePasswordViewModel injectChangePasswordViewModel(ChangePasswordViewModel instance) {
    ChangePasswordViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private ChangePasswordFragment injectChangePasswordFragment(ChangePasswordFragment instance) {
    ChangePasswordFragment_MembersInjector.injectViewModel(instance, changePasswordViewModel());
    return instance;
  }

  private RegisterViewModel injectRegisterViewModel(RegisterViewModel instance) {
    RegisterViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private RegisterFragment injectRegisterFragment(RegisterFragment instance) {
    RegisterFragment_MembersInjector.injectViewModel(instance, registerViewModel());
    return instance;
  }

  private HomeFragment injectHomeFragment(HomeFragment instance) {
    HomeFragment_MembersInjector.injectViewModel(instance, homeViewModel());
    return instance;
  }

  private TasksFragment injectTasksFragment(TasksFragment instance) {
    TasksFragment_MembersInjector.injectViewModel(instance, homeViewModel());
    return instance;
  }

  private PointsViewModel injectPointsViewModel(PointsViewModel instance) {
    PointsViewModel_MembersInjector.injectRepository(instance, groupRepositoryProvider.get());
    return instance;
  }

  private PointsFragment injectPointsFragment(PointsFragment instance) {
    PointsFragment_MembersInjector.injectViewModel(instance, pointsViewModel());
    return instance;
  }

  private SettingsViewModel injectSettingsViewModel(SettingsViewModel instance) {
    SettingsViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private ProfileFragment injectProfileFragment(ProfileFragment instance) {
    ProfileFragment_MembersInjector.injectViewModel(instance, settingsViewModel());
    return instance;
  }

  private EditProfileFragment injectEditProfileFragment(EditProfileFragment instance) {
    EditProfileFragment_MembersInjector.injectViewModel(instance, registerViewModel());
    return instance;
  }

  private MyGroupsViewModel injectMyGroupsViewModel(MyGroupsViewModel instance) {
    MyGroupsViewModel_MembersInjector.injectRepository(instance, groupRepositoryProvider.get());
    return instance;
  }

  private MyGroupsFragment injectMyGroupsFragment(MyGroupsFragment instance) {
    MyGroupsFragment_MembersInjector.injectViewModel(instance, myGroupsViewModel());
    return instance;
  }

  private MoreFragment injectMoreFragment(MoreFragment instance) {
    MoreFragment_MembersInjector.injectViewModel(instance, settingsViewModel());
    return instance;
  }

  private AboutFragment injectAboutFragment(AboutFragment instance) {
    AboutFragment_MembersInjector.injectViewModel(instance, settingsViewModel());
    return instance;
  }

  private ContactUsFragment injectContactUsFragment(ContactUsFragment instance) {
    ContactUsFragment_MembersInjector.injectViewModel(instance, settingsViewModel());
    return instance;
  }

  private AddAnswerViewModel injectAddAnswerViewModel(AddAnswerViewModel instance) {
    AddAnswerViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private AddAnswerFragment injectAddAnswerFragment(AddAnswerFragment instance) {
    AddAnswerFragment_MembersInjector.injectViewModel(instance, addAnswerViewModel());
    return instance;
  }

  private GroupMembersFragment injectGroupMembersFragment(GroupMembersFragment instance) {
    GroupMembersFragment_MembersInjector.injectViewModel(instance, homeViewModel());
    return instance;
  }

  private AddGroupViewModel injectAddGroupViewModel(AddGroupViewModel instance) {
    AddGroupViewModel_MembersInjector.injectRepository(instance, groupRepositoryProvider.get());
    return instance;
  }

  private AddGroupFragment injectAddGroupFragment(AddGroupFragment instance) {
    AddGroupFragment_MembersInjector.injectViewModel(instance, addGroupViewModel());
    return instance;
  }

  private AddGiftFragment injectAddGiftFragment(AddGiftFragment instance) {
    AddGiftFragment_MembersInjector.injectViewModel(instance, pointsViewModel());
    return instance;
  }

  private GroupDetailsViewModel injectGroupDetailsViewModel(GroupDetailsViewModel instance) {
    GroupDetailsViewModel_MembersInjector.injectRepository(instance, groupRepositoryProvider.get());
    return instance;
  }

  private StudentRequestsFragment injectStudentRequestsFragment(StudentRequestsFragment instance) {
    StudentRequestsFragment_MembersInjector.injectViewModel(instance, groupDetailsViewModel());
    return instance;
  }

  private LangFragment injectLangFragment(LangFragment instance) {
    LangFragment_MembersInjector.injectViewModel(instance, settingsViewModel());
    return instance;
  }

  private GroupDetailsFragment injectGroupDetailsFragment(GroupDetailsFragment instance) {
    GroupDetailsFragment_MembersInjector.injectViewModel(instance, groupDetailsViewModel());
    return instance;
  }

  private InviteStudentsToGroupFragment injectInviteStudentsToGroupFragment(
      InviteStudentsToGroupFragment instance) {
    InviteStudentsToGroupFragment_MembersInjector.injectViewModel(instance, addGroupViewModel());
    return instance;
  }

  private AddTaskViewModel injectAddTaskViewModel(AddTaskViewModel instance) {
    AddTaskViewModel_MembersInjector.injectRepository(instance, groupRepositoryProvider.get());
    return instance;
  }

  private AddTaskFragment injectAddTaskFragment(AddTaskFragment instance) {
    AddTaskFragment_MembersInjector.injectViewModel(instance, addTaskViewModel());
    return instance;
  }

  private GroupStudentFragment injectGroupStudentFragment(GroupStudentFragment instance) {
    GroupStudentFragment_MembersInjector.injectViewModel(instance, groupDetailsViewModel());
    return instance;
  }

  private static final class Builder implements IApplicationComponent.Builder {
    @Override
    public IApplicationComponent build() {
      return new DaggerIApplicationComponent(new ConnectionModule());
    }
  }
}
