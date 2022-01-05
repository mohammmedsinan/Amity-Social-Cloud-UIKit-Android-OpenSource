// Generated by view binder compiler. Do not edit!
package com.ekoapp.ekosdk.uikit.community.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.ekoapp.ekosdk.uikit.common.views.text.EkoExpandableTextView;
import com.ekoapp.ekosdk.uikit.community.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AmityItemImagePostBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView rvImages;

  @NonNull
  public final EkoExpandableTextView tvFeed;

  private AmityItemImagePostBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView rvImages, @NonNull EkoExpandableTextView tvFeed) {
    this.rootView = rootView;
    this.rvImages = rvImages;
    this.tvFeed = tvFeed;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AmityItemImagePostBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AmityItemImagePostBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.amity_item_image_post, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AmityItemImagePostBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rvImages;
      RecyclerView rvImages = rootView.findViewById(id);
      if (rvImages == null) {
        break missingId;
      }

      id = R.id.tvFeed;
      EkoExpandableTextView tvFeed = rootView.findViewById(id);
      if (tvFeed == null) {
        break missingId;
      }

      return new AmityItemImagePostBinding((ConstraintLayout) rootView, rvImages, tvFeed);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
