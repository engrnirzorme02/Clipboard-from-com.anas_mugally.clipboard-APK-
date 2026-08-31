package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.j0 */
/* JADX INFO: loaded from: classes.dex */
final class C3480j0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C3482k0 f14253a;

    C3480j0(C3482k0 c3482k0) {
        Objects.requireNonNull(c3482k0);
        this.f14253a = c3482k0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f14253a.m17533d(context, intent);
    }
}
