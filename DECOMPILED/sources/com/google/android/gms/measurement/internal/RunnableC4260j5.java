package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.j5 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4260j5 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ComponentName f15844a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ServiceConnectionC4316q5 f15845b;

    RunnableC4260j5(ServiceConnectionC4316q5 serviceConnectionC4316q5, ComponentName componentName) {
        this.f15844a = componentName;
        Objects.requireNonNull(serviceConnectionC4316q5);
        this.f15845b = serviceConnectionC4316q5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15845b.f15981c.m19212K(this.f15844a);
    }
}
