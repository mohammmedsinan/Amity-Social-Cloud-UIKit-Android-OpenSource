// Generated by data binding compiler. Do not edit!
package com.ekoapp.ekosdk.uikit.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ekoapp.ekosdk.uikit.chat.R;
import com.ekoapp.ekosdk.uikit.chat.editMessage.EkoEditMessageViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AmityEditMsgBarBinding extends ViewDataBinding {
  @NonNull
  public final ImageView icCross;

  @NonNull
  public final TextView tvSave;

  @Bindable
  protected EkoEditMessageViewModel mViewModel;

  protected AmityEditMsgBarBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView icCross, TextView tvSave) {
    super(_bindingComponent, _root, _localFieldCount);
    this.icCross = icCross;
    this.tvSave = tvSave;
  }

  public abstract void setViewModel(@Nullable EkoEditMessageViewModel viewModel);

  @Nullable
  public EkoEditMessageViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static AmityEditMsgBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_edit_msg_bar, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AmityEditMsgBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AmityEditMsgBarBinding>inflateInternal(inflater, R.layout.amity_edit_msg_bar, root, attachToRoot, component);
  }

  @NonNull
  public static AmityEditMsgBarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_edit_msg_bar, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AmityEditMsgBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AmityEditMsgBarBinding>inflateInternal(inflater, R.layout.amity_edit_msg_bar, null, false, component);
  }

  public static AmityEditMsgBarBinding bind(@NonNull View view) {
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
  public static AmityEditMsgBarBinding bind(@NonNull View view, @Nullable Object component) {
    return (AmityEditMsgBarBinding)bind(component, view, R.layout.amity_edit_msg_bar);
  }
}
