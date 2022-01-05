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
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AmityViewDateBinding extends ViewDataBinding {
  @Bindable
  protected String mDate;

  @Bindable
  protected int mDateFillColor;

  protected AmityViewDateBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setDate(@Nullable String date);

  @Nullable
  public String getDate() {
    return mDate;
  }

  public abstract void setDateFillColor(int dateFillColor);

  public int getDateFillColor() {
    return mDateFillColor;
  }

  @NonNull
  public static AmityViewDateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_view_date, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AmityViewDateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AmityViewDateBinding>inflateInternal(inflater, R.layout.amity_view_date, root, attachToRoot, component);
  }

  @NonNull
  public static AmityViewDateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_view_date, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AmityViewDateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AmityViewDateBinding>inflateInternal(inflater, R.layout.amity_view_date, null, false, component);
  }

  public static AmityViewDateBinding bind(@NonNull View view) {
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
  public static AmityViewDateBinding bind(@NonNull View view, @Nullable Object component) {
    return (AmityViewDateBinding)bind(component, view, R.layout.amity_view_date);
  }
}
