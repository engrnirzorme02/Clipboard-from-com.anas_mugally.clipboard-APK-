package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.internal.InterfaceC3616o;
import p170W2.C1837b;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.J */
/* JADX INFO: loaded from: classes.dex */
final class C3666J implements AbstractC3686c.b {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceC3616o f14723a;

    C3666J(InterfaceC3616o interfaceC3616o) {
        this.f14723a = interfaceC3616o;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c.b
    public final void onConnectionFailed(C1837b c1837b) {
        this.f14723a.onConnectionFailed(c1837b);
    }
}
