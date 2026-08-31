package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.internal.AbstractC3686c;
import com.google.android.gms.common.internal.InterfaceC3702k;
import java.util.Set;
import p170W2.C1837b;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.P */
/* JADX INFO: loaded from: classes.dex */
final class C3578P implements AbstractC3686c.c, InterfaceC3595d0 {

    /* JADX INFO: renamed from: a */
    private final C3553a.f f14595a;

    /* JADX INFO: renamed from: b */
    private final C3590b f14596b;

    /* JADX INFO: renamed from: c */
    private InterfaceC3702k f14597c = null;

    /* JADX INFO: renamed from: d */
    private Set f14598d = null;

    /* JADX INFO: renamed from: e */
    private boolean f14599e = false;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ C3600g f14600f;

    public C3578P(C3600g c3600g, C3553a.f fVar, C3590b c3590b) {
        this.f14600f = c3600g;
        this.f14595a = fVar;
        this.f14596b = c3590b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final void m17842i() {
        InterfaceC3702k interfaceC3702k;
        if (!this.f14599e || (interfaceC3702k = this.f14597c) == null) {
            return;
        }
        this.f14595a.getRemoteService(interfaceC3702k, this.f14598d);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c.c
    /* JADX INFO: renamed from: a */
    public final void mo17843a(C1837b c1837b) {
        this.f14600f.f14657y.post(new RunnableC3577O(this, c1837b));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3595d0
    /* JADX INFO: renamed from: b */
    public final void mo17844b(C1837b c1837b) {
        C3574L c3574l = (C3574L) this.f14600f.f14653u.get(this.f14596b);
        if (c3574l != null) {
            c3574l.m17826F(c1837b);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3595d0
    /* JADX INFO: renamed from: c */
    public final void mo17845c(InterfaceC3702k interfaceC3702k, Set set) {
        if (interfaceC3702k == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo17844b(new C1837b(4));
        } else {
            this.f14597c = interfaceC3702k;
            this.f14598d = set;
            m17842i();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3595d0
    /* JADX INFO: renamed from: d */
    public final void mo17846d(int i7) {
        C3574L c3574l = (C3574L) this.f14600f.f14653u.get(this.f14596b);
        if (c3574l != null) {
            if (c3574l.f14586t) {
                c3574l.m17826F(new C1837b(17));
            } else {
                c3574l.onConnectionSuspended(i7);
            }
        }
    }
}
