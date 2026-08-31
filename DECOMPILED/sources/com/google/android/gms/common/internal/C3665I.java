package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.InterfaceC3598f;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.I */
/* JADX INFO: loaded from: classes.dex */
final class C3665I implements AbstractC3686c.a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceC3598f f14722a;

    C3665I(InterfaceC3598f interfaceC3598f) {
        this.f14722a = interfaceC3598f;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c.a
    public final void onConnected(Bundle bundle) {
        this.f14722a.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c.a
    public final void onConnectionSuspended(int i7) {
        this.f14722a.onConnectionSuspended(i7);
    }
}
