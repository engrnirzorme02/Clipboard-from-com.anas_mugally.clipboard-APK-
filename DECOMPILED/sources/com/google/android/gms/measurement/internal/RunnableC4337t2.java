package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.t2 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4337t2 implements Runnable {

    /* JADX INFO: renamed from: a */
    private final InterfaceC4329s2 f16059a;

    /* JADX INFO: renamed from: b */
    private final int f16060b;

    /* JADX INFO: renamed from: c */
    private final Throwable f16061c;

    /* JADX INFO: renamed from: d */
    private final byte[] f16062d;

    /* JADX INFO: renamed from: e */
    private final String f16063e;

    /* JADX INFO: renamed from: f */
    private final Map f16064f;

    /* synthetic */ RunnableC4337t2(String str, InterfaceC4329s2 interfaceC4329s2, int i7, Throwable th, byte[] bArr, Map map, byte[] bArr2) {
        AbstractC3718s.m18083l(interfaceC4329s2);
        this.f16059a = interfaceC4329s2;
        this.f16060b = i7;
        this.f16061c = th;
        this.f16062d = bArr;
        this.f16063e = str;
        this.f16064f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16059a.mo18751a(this.f16063e, this.f16060b, this.f16061c, this.f16062d, this.f16064f);
    }
}
