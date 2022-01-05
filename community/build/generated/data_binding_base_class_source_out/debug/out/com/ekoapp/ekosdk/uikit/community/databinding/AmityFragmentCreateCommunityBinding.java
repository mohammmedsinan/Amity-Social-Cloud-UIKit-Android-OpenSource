// Generated by data binding compiler. Do not edit!
package com.ekoapp.ekosdk.uikit.community.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.ekoapp.ekosdk.uikit.community.R;
import com.ekoapp.ekosdk.uikit.community.ui.viewModel.EkoCreateCommunityViewModel;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AmityFragmentCreateCommunityBinding extends ViewDataBinding {
  @NonNull
  public final Barrier barrier;

  @NonNull
  public final SwitchMaterial btnAdminSwitch;

  @NonNull
  public final MaterialButton btnCreateCommunity;

  @NonNull
  public final TextView category;

  @NonNull
  public final ImageView categoryArrow;

  @NonNull
  public final ShapeableImageView ccAvatar;

  @NonNull
  public final TextInputEditText ccName;

  @NonNull
  public final View divider1;

  @NonNull
  public final View divider2;

  @NonNull
  public final View divider3;

  @NonNull
  public final View divider4;

  @NonNull
  public final View divider5;

  @NonNull
  public final View divider6;

  @NonNull
  public final View divider7;

  @NonNull
  public final View divider8;

  @NonNull
  public final TextInputEditText etDescription;

  @NonNull
  public final Group groupAddMembers;

  @NonNull
  public final ImageView icCamera;

  @NonNull
  public final ImageView ivAdd;

  @NonNull
  public final ImageView ivGlobe;

  @NonNull
  public final ImageView ivLock;

  @NonNull
  public final ConstraintLayout lAvatar;

  @NonNull
  public final RadioButton rbPrivate;

  @NonNull
  public final RadioButton rbPublic;

  @NonNull
  public final RecyclerView rvAddedMembers;

  @NonNull
  public final TextView tvAbout;

  @NonNull
  public final TextView tvAddMembers;

  @NonNull
  public final TextView tvAdmin;

  @NonNull
  public final TextView tvAdminDescription;

  @NonNull
  public final TextView tvCategory;

  @NonNull
  public final TextView tvCommName;

  @NonNull
  public final TextView tvCount;

  @NonNull
  public final TextView tvPrivate;

  @NonNull
  public final TextView tvPrivateDescription;

  @NonNull
  public final TextView tvPublic;

  @NonNull
  public final TextView tvPublicDescription;

  @Bindable
  protected EkoCreateCommunityViewModel mViewModel;

  protected AmityFragmentCreateCommunityBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Barrier barrier, SwitchMaterial btnAdminSwitch,
      MaterialButton btnCreateCommunity, TextView category, ImageView categoryArrow,
      ShapeableImageView ccAvatar, TextInputEditText ccName, View divider1, View divider2,
      View divider3, View divider4, View divider5, View divider6, View divider7, View divider8,
      TextInputEditText etDescription, Group groupAddMembers, ImageView icCamera, ImageView ivAdd,
      ImageView ivGlobe, ImageView ivLock, ConstraintLayout lAvatar, RadioButton rbPrivate,
      RadioButton rbPublic, RecyclerView rvAddedMembers, TextView tvAbout, TextView tvAddMembers,
      TextView tvAdmin, TextView tvAdminDescription, TextView tvCategory, TextView tvCommName,
      TextView tvCount, TextView tvPrivate, TextView tvPrivateDescription, TextView tvPublic,
      TextView tvPublicDescription) {
    super(_bindingComponent, _root, _localFieldCount);
    this.barrier = barrier;
    this.btnAdminSwitch = btnAdminSwitch;
    this.btnCreateCommunity = btnCreateCommunity;
    this.category = category;
    this.categoryArrow = categoryArrow;
    this.ccAvatar = ccAvatar;
    this.ccName = ccName;
    this.divider1 = divider1;
    this.divider2 = divider2;
    this.divider3 = divider3;
    this.divider4 = divider4;
    this.divider5 = divider5;
    this.divider6 = divider6;
    this.divider7 = divider7;
    this.divider8 = divider8;
    this.etDescription = etDescription;
    this.groupAddMembers = groupAddMembers;
    this.icCamera = icCamera;
    this.ivAdd = ivAdd;
    this.ivGlobe = ivGlobe;
    this.ivLock = ivLock;
    this.lAvatar = lAvatar;
    this.rbPrivate = rbPrivate;
    this.rbPublic = rbPublic;
    this.rvAddedMembers = rvAddedMembers;
    this.tvAbout = tvAbout;
    this.tvAddMembers = tvAddMembers;
    this.tvAdmin = tvAdmin;
    this.tvAdminDescription = tvAdminDescription;
    this.tvCategory = tvCategory;
    this.tvCommName = tvCommName;
    this.tvCount = tvCount;
    this.tvPrivate = tvPrivate;
    this.tvPrivateDescription = tvPrivateDescription;
    this.tvPublic = tvPublic;
    this.tvPublicDescription = tvPublicDescription;
  }

  public abstract void setViewModel(@Nullable EkoCreateCommunityViewModel viewModel);

  @Nullable
  public EkoCreateCommunityViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static AmityFragmentCreateCommunityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_fragment_create_community, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AmityFragmentCreateCommunityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AmityFragmentCreateCommunityBinding>inflateInternal(inflater, R.layout.amity_fragment_create_community, root, attachToRoot, component);
  }

  @NonNull
  public static AmityFragmentCreateCommunityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.amity_fragment_create_community, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AmityFragmentCreateCommunityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AmityFragmentCreateCommunityBinding>inflateInternal(inflater, R.layout.amity_fragment_create_community, null, false, component);
  }

  public static AmityFragmentCreateCommunityBinding bind(@NonNull View view) {
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
  public static AmityFragmentCreateCommunityBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (AmityFragmentCreateCommunityBinding)bind(component, view, R.layout.amity_fragment_create_community);
  }
}
