package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import p170W2.C1837b;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.V */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC3677V extends AbstractC3697h0 {

    /* JADX INFO: renamed from: d */
    public final int f14739d;

    /* JADX INFO: renamed from: e */
    public final Bundle f14740e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ AbstractC3686c f14741f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC3677V(AbstractC3686c abstractC3686c, int i7, Bundle bundle) {
        super(abstractC3686c, Boolean.TRUE);
        this.f14741f = abstractC3686c;
        this.f14739d = i7;
        this.f14740e = bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3697h0
    /* JADX INFO: renamed from: a */
    protected final /* bridge */ /* synthetic */ void mo17990a(Object obj) {
        if (this.f14739d != 0) {
            this.f14741f.m18001c(1, null);
            Bundle bundle = this.f14740e;
            mo17992f(new C1837b(this.f14739d, bundle != null ? (PendingIntent) bundle.getParcelable(AbstractC3686c.KEY_PENDING_INTENT) : null));
        } else {
            if (mo17993g()) {
                return;
            }
            this.f14741f.m18001c(1, null);
            mo17992f(new C1837b(8, null));
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC3697h0
    /* JADX INFO: renamed from: b */
    protected final void mo17991b() {
    }

    /* JADX INFO: renamed from: f */
    protected abstract void mo17992f(C1837b c1837b);

    /* JADX INFO: renamed from: g */
    protected abstract boolean mo17993g();
}
