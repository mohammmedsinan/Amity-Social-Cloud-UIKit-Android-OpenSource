// Generated by data binding compiler. Do not edit!
package com.ekoapp.ekosdk.uikit.community.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ekoapp.ekosdk.uikit.common.views.list.EkoRecyclerView;
import com.ekoapp.ekosdk.uikit.community.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AmityFragmentCategoryCommunityListBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout emptyView;

  @NonNull
  public final ImageView ivIcon;

  @NonNull
  public final EkoRecyclerView rvCommunity;

  @NonNull
  public final TextView tvEmptyCommunity;

  @NonNull
  public final TextView tvEmptyCommunityMessage;

  protected AmityFragmentCategoryCommunityListBinding(Object _bindingComponent, View _root,
      int _localFieldCount, LinearLayout emptyView, ImageView ivIcon, EkoRecyclerView rvCommunity,
      TextView tvEmptyCommunity, TextView tvEmptyCommunityMessage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.emptyView = emptyView;
    this.ivIcon = ivIcon;
    this.rvCommunity = rvCommunity;
    this.tvEmptyCommunity = tvEmptyCommunity;
    this.tvEmptyCommunityMessage = tvEmptyCommunityMessage;
  }

  @NonNull
  public static AmityFragmentCategoryCommunityListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_fragment_category_community_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AmityFragmentCategoryCommunityListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AmityFragmentCategoryCommunityListBinding>inflateInternal(inflater, R.layout.amity_fragment_category_community_list, root, attachToRoot, component);
  }

  @NonNull
  public static AmityFragmentCategoryCommunityListBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_fragment_category_community_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AmityFragmentCategoryCommunityListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AmityFragmentCategoryCommunityListBinding>inflateInternal(inflater, R.layout.amity_fragment_category_community_list, null, false, component);
  }

  public static AmityFragmentCategoryCommunityListBinding bind(@NonNull View view) {
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
  public static AmityFragmentCategoryCommunityListBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (AmityFragmentCategoryCommunityListBinding)bind(component, view, R.layout.amity_fragment_category_community_list);
  }
}
