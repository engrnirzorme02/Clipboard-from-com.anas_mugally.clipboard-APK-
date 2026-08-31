package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.o2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4297o2 {

    /* JADX INFO: renamed from: a */
    private final int f15927a;

    /* JADX INFO: renamed from: b */
    private final boolean f15928b;

    /* JADX INFO: renamed from: c */
    private final boolean f15929c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C4313q2 f15930d;

    C4297o2(C4313q2 c4313q2, int i7, boolean z7, boolean z8) {
        Objects.requireNonNull(c4313q2);
        this.f15930d = c4313q2;
        this.f15927a = i7;
        this.f15928b = z7;
        this.f15929c = z8;
    }

    /* JADX INFO: renamed from: a */
    public final void m18834a(String str) {
        this.f15930d.m18860y(this.f15927a, this.f15928b, this.f15929c, str, null, null, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m18835b(String str, Object obj) {
        this.f15930d.m18860y(this.f15927a, this.f15928b, this.f15929c, str, obj, null, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m18836c(String str, Object obj, Object obj2) {
        this.f15930d.m18860y(this.f15927a, this.f15928b, this.f15929c, str, obj, obj2, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m18837d(String str, Object obj, Object obj2, Object obj3) {
        this.f15930d.m18860y(this.f15927a, this.f15928b, this.f15929c, str, obj, obj2, obj3);
    }
}
