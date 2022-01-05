// Generated by data binding compiler. Do not edit!
package com.ekoapp.ekosdk.uikit.community.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ekoapp.ekosdk.uikit.community.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AmityItemViewPostFileBinding extends ViewDataBinding {
  @NonNull
  public final ImageView ivFileIcon;

  @NonNull
  public final TextView tvFileName;

  @NonNull
  public final TextView tvFileSize;

  protected AmityItemViewPostFileBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView ivFileIcon, TextView tvFileName, TextView tvFileSize) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivFileIcon = ivFileIcon;
    this.tvFileName = tvFileName;
    this.tvFileSize = tvFileSize;
  }

  @NonNull
  public static AmityItemViewPostFileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_item_view_post_file, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AmityItemViewPostFileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AmityItemViewPostFileBinding>inflateInternal(inflater, R.layout.amity_item_view_post_file, root, attachToRoot, component);
  }

  @NonNull
  public static AmityItemViewPostFileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_item_view_post_file, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AmityItemViewPostFileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AmityItemViewPostFileBinding>inflateInternal(inflater, R.layout.amity_item_view_post_file, null, false, component);
  }

  public static AmityItemViewPostFileBinding bind(@NonNull View view) {
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
  public static AmityItemViewPostFileBinding bind(@NonNull View view, @Nullable Object component) {
    return (AmityItemViewPostFileBinding)bind(component, view, R.layout.amity_item_view_post_file);
  }
}
