// Generated by data binding compiler. Do not edit!
package com.ekoapp.ekosdk.uikit.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ekoapp.ekosdk.uikit.chat.R;
import com.ekoapp.ekosdk.uikit.chat.messages.viewModel.EkoSelectableMessageViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AmityPopupMsgReportBinding extends ViewDataBinding {
  @Bindable
  protected EkoSelectableMessageViewModel mViewModel;

  protected AmityPopupMsgReportBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable EkoSelectableMessageViewModel viewModel);

  @Nullable
  public EkoSelectableMessageViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static AmityPopupMsgReportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_popup_msg_report, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AmityPopupMsgReportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AmityPopupMsgReportBinding>inflateInternal(inflater, R.layout.amity_popup_msg_report, root, attachToRoot, component);
  }

  @NonNull
  public static AmityPopupMsgReportBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_popup_msg_report, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AmityPopupMsgReportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AmityPopupMsgReportBinding>inflateInternal(inflater, R.layout.amity_popup_msg_report, null, false, component);
  }

  public static AmityPopupMsgReportBinding bind(@NonNull View view) {
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
  public static AmityPopupMsgReportBinding bind(@NonNull View view, @Nullable Object component) {
    return (AmityPopupMsgReportBinding)bind(component, view, R.layout.amity_popup_msg_report);
  }
}
