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
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ekoapp.ekosdk.uikit.community.R;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AmityItemAddedMemberBinding extends ViewDataBinding {
  @NonNull
  public final ShapeableImageView amAvatar;

  @NonNull
  public final ImageView amCross;

  @NonNull
  public final TextView amName;

  @NonNull
  public final ConstraintLayout lAddedMemberItem;

  @Bindable
  protected String mAvatarUrl;

  protected AmityItemAddedMemberBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ShapeableImageView amAvatar, ImageView amCross, TextView amName,
      ConstraintLayout lAddedMemberItem) {
    super(_bindingComponent, _root, _localFieldCount);
    this.amAvatar = amAvatar;
    this.amCross = amCross;
    this.amName = amName;
    this.lAddedMemberItem = lAddedMemberItem;
  }

  public abstract void setAvatarUrl(@Nullable String avatarUrl);

  @Nullable
  public String getAvatarUrl() {
    return mAvatarUrl;
  }

  @NonNull
  public static AmityItemAddedMemberBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_item_added_member, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AmityItemAddedMemberBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AmityItemAddedMemberBinding>inflateInternal(inflater, R.layout.amity_item_added_member, root, attachToRoot, component);
  }

  @NonNull
  public static AmityItemAddedMemberBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_item_added_member, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AmityItemAddedMemberBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AmityItemAddedMemberBinding>inflateInternal(inflater, R.layout.amity_item_added_member, null, false, component);
  }

  public static AmityItemAddedMemberBinding bind(@NonNull View view) {
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
  public static AmityItemAddedMemberBinding bind(@NonNull View view, @Nullable Object component) {
    return (AmityItemAddedMemberBinding)bind(component, view, R.layout.amity_item_added_member);
  }
}
