package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.R3 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4123R3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f15389a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f15390b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ long f15391c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ Bundle f15392d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ boolean f15393e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ boolean f15394f;

    /* JADX INFO: renamed from: r */
    final /* synthetic */ boolean f15395r;

    /* JADX INFO: renamed from: s */
    final /* synthetic */ String f15396s;

    /* JADX INFO: renamed from: t */
    final /* synthetic */ C4371x4 f15397t;

    RunnableC4123R3(C4371x4 c4371x4, String str, String str2, long j7, Bundle bundle, boolean z7, boolean z8, boolean z9, String str3) {
        this.f15389a = str;
        this.f15390b = str2;
        this.f15391c = j7;
        this.f15392d = bundle;
        this.f15393e = z7;
        this.f15394f = z8;
        this.f15395r = z9;
        this.f15396s = str3;
        Objects.requireNonNull(c4371x4);
        this.f15397t = c4371x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15397t.m19307v(this.f15389a, this.f15390b, this.f15391c, this.f15392d, this.f15393e, this.f15394f, this.f15395r, this.f15396s);
    }
}
