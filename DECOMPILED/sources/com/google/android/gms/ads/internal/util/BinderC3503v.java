package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AbstractBinderC3281N0;
import com.google.android.gms.ads.internal.client.C3324b1;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.v */
/* JADX INFO: loaded from: classes.dex */
final class BinderC3503v extends AbstractBinderC3281N0 {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f14335a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C3509y f14336b;

    BinderC3503v(C3509y c3509y, Context context) {
        this.f14335a = context;
        Objects.requireNonNull(c3509y);
        this.f14336b = c3509y;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3284O0
    public final void zze(C3324b1 c3324b1) {
        if (c3324b1 == null) {
            return;
        }
        this.f14336b.m17599n(this.f14335a, c3324b1.f13919b, true, true);
    }
}
