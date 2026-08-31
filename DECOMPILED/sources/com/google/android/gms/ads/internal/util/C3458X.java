package com.google.android.gms.ads.internal.util;

import p380w2.C7351t;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.X */
/* JADX INFO: loaded from: classes.dex */
public final class C3458X {

    /* JADX INFO: renamed from: a */
    private long f14219a;

    /* JADX INFO: renamed from: b */
    private long f14220b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    private final Object f14221c = new Object();

    public C3458X(long j7) {
        this.f14219a = j7;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m17506a() {
        synchronized (this.f14221c) {
            try {
                long jMo18161c = C7351t.m32357o().mo18161c();
                if (this.f14220b + this.f14219a > jMo18161c) {
                    return false;
                }
                this.f14220b = jMo18161c;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m17507b(long j7) {
        synchronized (this.f14221c) {
            this.f14219a = j7;
        }
    }
}
