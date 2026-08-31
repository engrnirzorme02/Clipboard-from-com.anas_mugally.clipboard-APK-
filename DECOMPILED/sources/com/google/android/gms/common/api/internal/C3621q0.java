package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.q0 */
/* JADX INFO: loaded from: classes.dex */
final class C3621q0 extends AbstractC3580S {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Dialog f14682a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ RunnableC3623r0 f14683b;

    C3621q0(RunnableC3623r0 runnableC3623r0, Dialog dialog) {
        this.f14683b = runnableC3623r0;
        this.f14682a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3580S
    /* JADX INFO: renamed from: a */
    public final void mo17847a() {
        this.f14683b.f14685b.m17937d();
        if (this.f14682a.isShowing()) {
            this.f14682a.dismiss();
        }
    }
}
