package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.f6 */
/* JADX INFO: loaded from: classes2.dex */
final class C4229f6 implements InterfaceC4329s2 {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f15753a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ List f15754b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C4317q6 f15755c;

    C4229f6(C4317q6 c4317q6, String str, List list) {
        this.f15753a = str;
        this.f15754b = list;
        Objects.requireNonNull(c4317q6);
        this.f15755c = c4317q6;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4329s2
    /* JADX INFO: renamed from: a */
    public final void mo18751a(String str, int i7, Throwable th, byte[] bArr, Map map) {
        this.f15755c.m18888A(true, i7, th, bArr, this.f15753a, this.f15754b);
    }
}
