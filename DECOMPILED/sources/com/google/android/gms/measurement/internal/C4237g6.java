package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.g6 */
/* JADX INFO: loaded from: classes2.dex */
final class C4237g6 implements InterfaceC4329s2 {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f15787a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4341t6 f15788b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C4317q6 f15789c;

    C4237g6(C4317q6 c4317q6, String str, C4341t6 c4341t6) {
        this.f15787a = str;
        this.f15788b = c4341t6;
        Objects.requireNonNull(c4317q6);
        this.f15789c = c4317q6;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4329s2
    /* JADX INFO: renamed from: a */
    public final void mo18751a(String str, int i7, Throwable th, byte[] bArr, Map map) {
        this.f15789c.m18950v(this.f15787a, i7, th, bArr, this.f15788b);
    }
}
