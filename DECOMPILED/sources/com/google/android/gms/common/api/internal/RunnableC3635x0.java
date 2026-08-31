package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.x0 */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC3635x0 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AbstractC3606j f14701a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f14702b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C3637y0 f14703c;

    RunnableC3635x0(C3637y0 c3637y0, AbstractC3606j abstractC3606j, String str) {
        this.f14701a = abstractC3606j;
        this.f14702b = str;
        this.f14703c = c3637y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        C3637y0 c3637y0 = this.f14703c;
        if (c3637y0.f14705b > 0) {
            AbstractC3606j abstractC3606j = this.f14701a;
            if (c3637y0.f14706c != null) {
                bundle = c3637y0.f14706c.getBundle(this.f14702b);
            } else {
                bundle = null;
            }
            abstractC3606j.onCreate(bundle);
        }
        if (this.f14703c.f14705b >= 2) {
            this.f14701a.onStart();
        }
        if (this.f14703c.f14705b >= 3) {
            this.f14701a.onResume();
        }
        if (this.f14703c.f14705b >= 4) {
            this.f14701a.onStop();
        }
        if (this.f14703c.f14705b >= 5) {
            this.f14701a.onDestroy();
        }
    }
}
