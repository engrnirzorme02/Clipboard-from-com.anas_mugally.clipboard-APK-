package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.T */
/* JADX INFO: loaded from: classes.dex */
public final class C3581T extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    Context f14602a;

    /* JADX INFO: renamed from: b */
    private final AbstractC3580S f14603b;

    public C3581T(AbstractC3580S abstractC3580S) {
        this.f14603b = abstractC3580S;
    }

    /* JADX INFO: renamed from: a */
    public final void m17848a(Context context) {
        this.f14602a = context;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m17849b() {
        try {
            Context context = this.f14602a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f14602a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f14603b.mo17847a();
            m17849b();
        }
    }
}
