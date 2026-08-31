package com.google.android.gms.common.util;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.google.android.gms.common.util.h */
/* JADX INFO: loaded from: classes.dex */
public class C3753h implements InterfaceC3750e {

    /* JADX INFO: renamed from: a */
    private static final C3753h f14897a = new C3753h();

    private C3753h() {
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC3750e m18171d() {
        return f14897a;
    }

    @Override // com.google.android.gms.common.util.InterfaceC3750e
    /* JADX INFO: renamed from: a */
    public final long mo18159a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.InterfaceC3750e
    /* JADX INFO: renamed from: b */
    public final long mo18160b() {
        return System.nanoTime();
    }

    @Override // com.google.android.gms.common.util.InterfaceC3750e
    /* JADX INFO: renamed from: c */
    public final long mo18161c() {
        return SystemClock.elapsedRealtime();
    }
}
