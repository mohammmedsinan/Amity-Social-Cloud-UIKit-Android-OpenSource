// Generated by data binding compiler. Do not edit!
package com.ekoapp.ekosdk.uikit.community.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ekoapp.ekosdk.uikit.community.R;
import com.ekoapp.ekosdk.uikit.community.newsfeed.viewmodel.EkoEditCommentViewModel;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AmityFragmentEditCommentBinding extends ViewDataBinding {
  @NonNull
  public final TextInputEditText etPostComment;

  @NonNull
  public final TextView textviewReplyTo;

  @Bindable
  protected EkoEditCommentViewModel mVm;

  @Bindable
  protected String mReplyingToUser;

  @Bindable
  protected Boolean mShowReplyingTo;

  protected AmityFragmentEditCommentBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextInputEditText etPostComment, TextView textviewReplyTo) {
    super(_bindingComponent, _root, _localFieldCount);
    this.etPostComment = etPostComment;
    this.textviewReplyTo = textviewReplyTo;
  }

  public abstract void setVm(@Nullable EkoEditCommentViewModel vm);

  @Nullable
  public EkoEditCommentViewModel getVm() {
    return mVm;
  }

  public abstract void setReplyingToUser(@Nullable String replyingToUser);

  @Nullable
  public String getReplyingToUser() {
    return mReplyingToUser;
  }

  public abstract void setShowReplyingTo(@Nullable Boolean showReplyingTo);

  @Nullable
  public Boolean getShowReplyingTo() {
    return mShowReplyingTo;
  }

  @NonNull
  public static AmityFragmentEditCommentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_fragment_edit_comment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AmityFragmentEditCommentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AmityFragmentEditCommentBinding>inflateInternal(inflater, R.layout.amity_fragment_edit_comment, root, attachToRoot, component);
  }

  @NonNull
  public static AmityFragmentEditCommentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_fragment_edit_comment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AmityFragmentEditCommentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AmityFragmentEditCommentBinding>inflateInternal(inflater, R.layout.amity_fragment_edit_comment, null, false, component);
  }

  public static AmityFragmentEditCommentBinding bind(@NonNull View view) {
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
  public static AmityFragmentEditCommentBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (AmityFragmentEditCommentBinding)bind(component, view, R.layout.amity_fragment_edit_comment);
  }
}
