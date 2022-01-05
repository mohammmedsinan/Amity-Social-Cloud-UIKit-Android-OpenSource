// Generated by data binding compiler. Do not edit!
package com.ekoapp.ekosdk.uikit.community.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ekoapp.ekosdk.community.EkoCommunity;
import com.ekoapp.ekosdk.uikit.community.R;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AmityItemCommunitySelectionListBinding extends ViewDataBinding {
  @NonNull
  public final ShapeableImageView avCommunityProfile;

  @NonNull
  public final FrameLayout communityNameContainer;

  @NonNull
  public final TextView tvCommunityName;

  @Bindable
  protected EkoCommunity mCommunity;

  protected AmityItemCommunitySelectionListBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ShapeableImageView avCommunityProfile,
      FrameLayout communityNameContainer, TextView tvCommunityName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.avCommunityProfile = avCommunityProfile;
    this.communityNameContainer = communityNameContainer;
    this.tvCommunityName = tvCommunityName;
  }

  public abstract void setCommunity(@Nullable EkoCommunity community);

  @Nullable
  public EkoCommunity getCommunity() {
    return mCommunity;
  }

  @NonNull
  public static AmityItemCommunitySelectionListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_item_community_selection_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AmityItemCommunitySelectionListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AmityItemCommunitySelectionListBinding>inflateInternal(inflater, R.layout.amity_item_community_selection_list, root, attachToRoot, component);
  }

  @NonNull
  public static AmityItemCommunitySelectionListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_item_community_selection_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AmityItemCommunitySelectionListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AmityItemCommunitySelectionListBinding>inflateInternal(inflater, R.layout.amity_item_community_selection_list, null, false, component);
  }

  public static AmityItemCommunitySelectionListBinding bind(@NonNull View view) {
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
  public static AmityItemCommunitySelectionListBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (AmityItemCommunitySelectionListBinding)bind(component, view, R.layout.amity_item_community_selection_list);
  }
}
