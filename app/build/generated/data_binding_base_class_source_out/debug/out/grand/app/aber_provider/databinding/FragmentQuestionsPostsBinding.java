// Generated by data binding compiler. Do not edit!
package grand.app.aber_provider.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import grand.app.aber_provider.R;
import grand.app.aber_provider.pages.profile.viewModels.QuestionsPostsViewModels;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentQuestionsPostsBinding extends ViewDataBinding {
  @NonNull
  public final LottieAnimationView animationView;

  @NonNull
  public final CircularProgressIndicator progress;

  @NonNull
  public final RecyclerView rcQPosts;

  @NonNull
  public final ConstraintLayout searchContainer;

  @Bindable
  protected QuestionsPostsViewModels mViewModel;

  protected FragmentQuestionsPostsBinding(Object _bindingComponent, View _root,
      int _localFieldCount, LottieAnimationView animationView, CircularProgressIndicator progress,
      RecyclerView rcQPosts, ConstraintLayout searchContainer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.animationView = animationView;
    this.progress = progress;
    this.rcQPosts = rcQPosts;
    this.searchContainer = searchContainer;
  }

  public abstract void setViewModel(@Nullable QuestionsPostsViewModels viewModel);

  @Nullable
  public QuestionsPostsViewModels getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentQuestionsPostsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_questions_posts, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentQuestionsPostsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentQuestionsPostsBinding>inflateInternal(inflater, R.layout.fragment_questions_posts, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentQuestionsPostsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_questions_posts, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentQuestionsPostsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentQuestionsPostsBinding>inflateInternal(inflater, R.layout.fragment_questions_posts, null, false, component);
  }

  public static FragmentQuestionsPostsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentQuestionsPostsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentQuestionsPostsBinding)bind(component, view, R.layout.fragment_questions_posts);
  }
}