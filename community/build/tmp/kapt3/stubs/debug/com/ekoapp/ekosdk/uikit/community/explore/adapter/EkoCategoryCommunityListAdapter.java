package com.ekoapp.ekosdk.uikit.community.explore.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/ekoapp/ekosdk/uikit/community/explore/adapter/EkoCategoryCommunityListAdapter;", "Lcom/ekoapp/ekosdk/uikit/base/EkoBaseRecyclerViewPagedAdapter;", "Lcom/ekoapp/ekosdk/community/EkoCommunity;", "diffUtil", "Lcom/ekoapp/ekosdk/uikit/community/explore/adapter/EkoCategoryCommunityListAdapter$EkoCommunityDiffUtil;", "itemClickListener", "Lcom/ekoapp/ekosdk/uikit/community/explore/listener/IEkoCommunityItemClickListener;", "(Lcom/ekoapp/ekosdk/uikit/community/explore/adapter/EkoCategoryCommunityListAdapter$EkoCommunityDiffUtil;Lcom/ekoapp/ekosdk/uikit/community/explore/listener/IEkoCommunityItemClickListener;)V", "getLayoutId", "", "position", "obj", "getViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "viewType", "EkoCommunityDiffUtil", "community_debug"})
public final class EkoCategoryCommunityListAdapter extends com.ekoapp.ekosdk.uikit.base.EkoBaseRecyclerViewPagedAdapter<com.ekoapp.ekosdk.community.EkoCommunity> {
    private final com.ekoapp.ekosdk.uikit.community.explore.listener.IEkoCommunityItemClickListener itemClickListener = null;
    
    @java.lang.Override()
    protected int getLayoutId(int position, @org.jetbrains.annotations.Nullable()
    com.ekoapp.ekosdk.community.EkoCommunity obj) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder getViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view, int viewType) {
        return null;
    }
    
    public EkoCategoryCommunityListAdapter(@org.jetbrains.annotations.NotNull()
    com.ekoapp.ekosdk.uikit.community.explore.adapter.EkoCategoryCommunityListAdapter.EkoCommunityDiffUtil diffUtil, @org.jetbrains.annotations.NotNull()
    com.ekoapp.ekosdk.uikit.community.explore.listener.IEkoCommunityItemClickListener itemClickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/ekoapp/ekosdk/uikit/community/explore/adapter/EkoCategoryCommunityListAdapter$EkoCommunityDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ekoapp/ekosdk/community/EkoCommunity;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "community_debug"})
    public static final class EkoCommunityDiffUtil extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.ekoapp.ekosdk.community.EkoCommunity> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.ekoapp.ekosdk.community.EkoCommunity oldItem, @org.jetbrains.annotations.NotNull()
        com.ekoapp.ekosdk.community.EkoCommunity newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.ekoapp.ekosdk.community.EkoCommunity oldItem, @org.jetbrains.annotations.NotNull()
        com.ekoapp.ekosdk.community.EkoCommunity newItem) {
            return false;
        }
        
        public EkoCommunityDiffUtil() {
            super();
        }
    }
}