package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.collection.C2391b;
import com.google.android.gms.common.internal.AbstractC3718s;
import p170W2.C1837b;
import p170W2.C1840e;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.C */
/* JADX INFO: loaded from: classes.dex */
public final class C3565C extends AbstractDialogInterfaceOnCancelListenerC3625s0 {

    /* JADX INFO: renamed from: e */
    private final C2391b f14566e;

    /* JADX INFO: renamed from: f */
    private final C3600g f14567f;

    C3565C(InterfaceC3608k interfaceC3608k, C3600g c3600g, C1840e c1840e) {
        super(interfaceC3608k, c1840e);
        this.f14566e = new C2391b();
        this.f14567f = c3600g;
        this.mLifecycleFragment.mo17923a("ConnectionlessLifecycleHelper", this);
    }

    /* JADX INFO: renamed from: j */
    public static void m17791j(Activity activity, C3600g c3600g, C3590b c3590b) {
        InterfaceC3608k fragment = AbstractC3606j.getFragment(activity);
        C3565C c3565c = (C3565C) fragment.mo17924c("ConnectionlessLifecycleHelper", C3565C.class);
        if (c3565c == null) {
            c3565c = new C3565C(fragment, c3600g, C1840e.m7604n());
        }
        AbstractC3718s.m18084m(c3590b, "ApiKey cannot be null");
        c3565c.f14566e.add(c3590b);
        c3600g.m17896b(c3565c);
    }

    /* JADX INFO: renamed from: k */
    private final void m17792k() {
        if (this.f14566e.isEmpty()) {
            return;
        }
        this.f14567f.m17896b(this);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC3625s0
    /* JADX INFO: renamed from: b */
    protected final void mo17793b(C1837b c1837b, int i7) {
        this.f14567f.m17893F(c1837b, i7);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC3625s0
    /* JADX INFO: renamed from: c */
    protected final void mo17794c() {
        this.f14567f.m17894G();
    }

    /* JADX INFO: renamed from: i */
    final C2391b m17795i() {
        return this.f14566e;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3606j
    public final void onResume() {
        super.onResume();
        m17792k();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC3625s0, com.google.android.gms.common.api.internal.AbstractC3606j
    public final void onStart() {
        super.onStart();
        m17792k();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC3625s0, com.google.android.gms.common.api.internal.AbstractC3606j
    public final void onStop() {
        super.onStop();
        this.f14567f.m17897c(this);
    }
}
