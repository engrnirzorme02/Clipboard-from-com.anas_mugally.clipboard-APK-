package com.google.android.gms.common.api;

import p170W2.C1839d;

/* JADX INFO: renamed from: com.google.android.gms.common.api.q */
/* JADX INFO: loaded from: classes.dex */
public final class C3647q extends UnsupportedOperationException {

    /* JADX INFO: renamed from: a */
    private final C1839d f14711a;

    public C3647q(C1839d c1839d) {
        this.f14711a = c1839d;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f14711a));
    }
}
