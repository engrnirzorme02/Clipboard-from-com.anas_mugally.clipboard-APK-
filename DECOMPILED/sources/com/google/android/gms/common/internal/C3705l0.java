package com.google.android.gms.common.internal;

import android.os.Bundle;
import p170W2.C1837b;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3705l0 extends AbstractC3677V {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ AbstractC3686c f14806g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3705l0(AbstractC3686c abstractC3686c, int i7, Bundle bundle) {
        super(abstractC3686c, i7, bundle);
        this.f14806g = abstractC3686c;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3677V
    /* JADX INFO: renamed from: f */
    protected final void mo17992f(C1837b c1837b) {
        if (this.f14806g.enableLocalFallback() && AbstractC3686c.zzo(this.f14806g)) {
            AbstractC3686c.zzk(this.f14806g, 16);
        } else {
            this.f14806g.zzc.mo17843a(c1837b);
            this.f14806g.onConnectionFailed(c1837b);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC3677V
    /* JADX INFO: renamed from: g */
    protected final boolean mo17993g() {
        this.f14806g.zzc.mo17843a(C1837b.f5972e);
        return true;
    }
}
