package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.B0 */
/* JADX INFO: loaded from: classes.dex */
final class C3423B0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C3431F0 f14172a;

    /* synthetic */ C3423B0(C3431F0 c3431f0, byte[] bArr) {
        Objects.requireNonNull(c3431f0);
        this.f14172a = c3431f0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
            this.f14172a.m17445Y(true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f14172a.m17445Y(false);
        }
    }
}
