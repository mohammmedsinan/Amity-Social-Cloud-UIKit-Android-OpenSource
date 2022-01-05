// Generated by data binding compiler. Do not edit!
package com.ekoapp.ekosdk.uikit.community.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ekoapp.ekosdk.uikit.community.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AmityItemSettingsNavContentBinding extends ViewDataBinding {
  @NonNull
  public final ImageView ivNavigation;

  @NonNull
  public final AmityViewMainSettingsContentBinding mainSettingsContent;

  @NonNull
  public final ConstraintLayout rootView;

  @NonNull
  public final TextView tvValue;

  protected AmityItemSettingsNavContentBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView ivNavigation,
      AmityViewMainSettingsContentBinding mainSettingsContent, ConstraintLayout rootView,
      TextView tvValue) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivNavigation = ivNavigation;
    this.mainSettingsContent = mainSettingsContent;
    setContainedBinding(this.mainSettingsContent);
    this.rootView = rootView;
    this.tvValue = tvValue;
  }

  @NonNull
  public static AmityItemSettingsNavContentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_item_settings_nav_content, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AmityItemSettingsNavContentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AmityItemSettingsNavContentBinding>inflateInternal(inflater, R.layout.amity_item_settings_nav_content, root, attachToRoot, component);
  }

  @NonNull
  public static AmityItemSettingsNavContentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_item_settings_nav_content, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AmityItemSettingsNavContentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AmityItemSettingsNavContentBinding>inflateInternal(inflater, R.layout.amity_item_settings_nav_content, null, false, component);
  }

  public static AmityItemSettingsNavContentBinding bind(@NonNull View view) {
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
  public static AmityItemSettingsNavContentBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (AmityItemSettingsNavContentBinding)bind(component, view, R.layout.amity_item_settings_nav_content);
  }
}
