package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.InterfaceC3750e;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.R5 */
/* JADX INFO: loaded from: classes2.dex */
final class C4125R5 {

    /* JADX INFO: renamed from: a */
    private final InterfaceC3750e f15400a;

    /* JADX INFO: renamed from: b */
    private long f15401b;

    public C4125R5(InterfaceC3750e interfaceC3750e) {
        AbstractC3718s.m18083l(interfaceC3750e);
        this.f15400a = interfaceC3750e;
    }

    /* JADX INFO: renamed from: a */
    public final void m18622a() {
        this.f15401b = this.f15400a.mo18161c();
    }

    /* JADX INFO: renamed from: b */
    public final void m18623b() {
        this.f15401b = 0L;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m18624c(long j7) {
        return this.f15401b == 0 || this.f15400a.mo18161c() - this.f15401b >= 3600000;
    }
}
