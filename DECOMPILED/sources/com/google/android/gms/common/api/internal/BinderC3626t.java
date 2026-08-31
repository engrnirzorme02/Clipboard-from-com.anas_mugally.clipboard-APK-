package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.t */
/* JADX INFO: loaded from: classes.dex */
public class BinderC3626t extends InterfaceC3602h.a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC3596e f14690a;

    public BinderC3626t(InterfaceC3596e interfaceC3596e) {
        this.f14690a = interfaceC3596e;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3602h
    public void onResult(Status status) {
        this.f14690a.setResult(status);
    }
}
