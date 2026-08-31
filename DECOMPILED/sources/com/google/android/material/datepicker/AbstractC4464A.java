package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C2791j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.google.android.material.datepicker.A */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4464A extends LinearLayoutManager {

    /* JADX INFO: renamed from: com.google.android.material.datepicker.A$a */
    class a extends C2791j {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C2791j
        /* JADX INFO: renamed from: v */
        protected float mo13831v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    AbstractC4464A(Context context, int i7, boolean z7) {
        super(context, i7, z7);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: N1 */
    public void mo13041N1(RecyclerView recyclerView, RecyclerView.C2746B c2746b, int i7) {
        a aVar = new a(recyclerView.getContext());
        aVar.m13230p(i7);
        m13406O1(aVar);
    }
}
