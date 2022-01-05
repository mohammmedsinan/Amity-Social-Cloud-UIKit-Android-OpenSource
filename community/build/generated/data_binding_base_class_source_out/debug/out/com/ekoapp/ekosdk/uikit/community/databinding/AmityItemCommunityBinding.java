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
import com.ekoapp.ekosdk.uikit.community.mycommunity.listener.IMyCommunityItemClickListener;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AmityItemCommunityBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout communityNameContainer;

  @NonNull
  public final ShapeableImageView ivAvatar;

  @NonNull
  public final TextView tvCommunityName;

  @Bindable
  protected EkoCommunity mEkoCommunity;

  @Bindable
  protected String mAvatarUrl;

  @Bindable
  protected IMyCommunityItemClickListener mListener;

  protected AmityItemCommunityBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FrameLayout communityNameContainer, ShapeableImageView ivAvatar, TextView tvCommunityName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.communityNameContainer = communityNameContainer;
    this.ivAvatar = ivAvatar;
    this.tvCommunityName = tvCommunityName;
  }

  public abstract void setEkoCommunity(@Nullable EkoCommunity ekoCommunity);

  @Nullable
  public EkoCommunity getEkoCommunity() {
    return mEkoCommunity;
  }

  public abstract void setAvatarUrl(@Nullable String avatarUrl);

  @Nullable
  public String getAvatarUrl() {
    return mAvatarUrl;
  }

  public abstract void setListener(@Nullable IMyCommunityItemClickListener listener);

  @Nullable
  public IMyCommunityItemClickListener getListener() {
    return mListener;
  }

  @NonNull
  public static AmityItemCommunityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_item_community, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AmityItemCommunityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AmityItemCommunityBinding>inflateInternal(inflater, R.layout.amity_item_community, root, attachToRoot, component);
  }

  @NonNull
  public static AmityItemCommunityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_item_community, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AmityItemCommunityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AmityItemCommunityBinding>inflateInternal(inflater, R.layout.amity_item_community, null, false, component);
  }

  public static AmityItemCommunityBinding bind(@NonNull View view) {
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
  public static AmityItemCommunityBinding bind(@NonNull View view, @Nullable Object component) {
    return (AmityItemCommunityBinding)bind(component, view, R.layout.amity_item_community);
  }
}
