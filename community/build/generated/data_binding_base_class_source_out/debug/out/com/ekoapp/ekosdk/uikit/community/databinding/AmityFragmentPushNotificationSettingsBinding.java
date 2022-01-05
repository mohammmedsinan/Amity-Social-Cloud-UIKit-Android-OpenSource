// Generated by view binder compiler. Do not edit!
package com.ekoapp.ekosdk.uikit.community.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.ekoapp.ekosdk.uikit.community.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AmityFragmentPushNotificationSettingsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AmityLayoutSettingsErrorBinding errorLayout;

  @NonNull
  public final ProgressBar progressbar;

  @NonNull
  public final RecyclerView rvNotificationSettings;

  private AmityFragmentPushNotificationSettingsBinding(@NonNull ConstraintLayout rootView,
      @NonNull AmityLayoutSettingsErrorBinding errorLayout, @NonNull ProgressBar progressbar,
      @NonNull RecyclerView rvNotificationSettings) {
    this.rootView = rootView;
    this.errorLayout = errorLayout;
    this.progressbar = progressbar;
    this.rvNotificationSettings = rvNotificationSettings;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AmityFragmentPushNotificationSettingsBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AmityFragmentPushNotificationSettingsBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.amity_fragment_push_notification_settings, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AmityFragmentPushNotificationSettingsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.errorLayout;
      View errorLayout = rootView.findViewById(id);
      if (errorLayout == null) {
        break missingId;
      }
      AmityLayoutSettingsErrorBinding binding_errorLayout = AmityLayoutSettingsErrorBinding.bind(errorLayout);

      id = R.id.progressbar;
      ProgressBar progressbar = rootView.findViewById(id);
      if (progressbar == null) {
        break missingId;
      }

      id = R.id.rvNotificationSettings;
      RecyclerView rvNotificationSettings = rootView.findViewById(id);
      if (rvNotificationSettings == null) {
        break missingId;
      }

      return new AmityFragmentPushNotificationSettingsBinding((ConstraintLayout) rootView,
          binding_errorLayout, progressbar, rvNotificationSettings);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
