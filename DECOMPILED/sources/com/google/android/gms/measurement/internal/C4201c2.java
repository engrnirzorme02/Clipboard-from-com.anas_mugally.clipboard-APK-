package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4201c2 {

    /* JADX INFO: renamed from: g */
    private static final Object f15574g = new Object();

    /* JADX INFO: renamed from: a */
    private final String f15575a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC4092N f15576b;

    /* JADX INFO: renamed from: c */
    private final Object f15577c;

    /* JADX INFO: renamed from: d */
    private final Object f15578d = new Object();

    /* JADX INFO: renamed from: e */
    private volatile Object f15579e = null;

    /* JADX INFO: renamed from: f */
    private volatile Object f15580f = null;

    /* synthetic */ C4201c2(String str, Object obj, Object obj2, InterfaceC4092N interfaceC4092N, byte[] bArr) {
        this.f15575a = str;
        this.f15577c = obj;
        this.f15576b = interfaceC4092N;
    }

    /* JADX INFO: renamed from: a */
    public final String m18705a() {
        return this.f15575a;
    }

    /* JADX INFO: renamed from: b */
    public final Object m18706b(Object obj) {
        synchronized (this.f15578d) {
        }
        if (obj != null) {
            return obj;
        }
        if (AbstractC4156W1.f15460a == null) {
            return this.f15577c;
        }
        synchronized (f15574g) {
            try {
                if (C4222f.m18746a()) {
                    return this.f15580f == null ? this.f15577c : this.f15580f;
                }
                try {
                    for (C4201c2 c4201c2 : AbstractC4209d2.f15648a) {
                        if (C4222f.m18746a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objZza = null;
                        try {
                            InterfaceC4092N interfaceC4092N = c4201c2.f15576b;
                            if (interfaceC4092N != null) {
                                objZza = interfaceC4092N.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f15574g) {
                            c4201c2.f15580f = objZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                InterfaceC4092N interfaceC4092N2 = this.f15576b;
                if (interfaceC4092N2 != null) {
                    try {
                        return interfaceC4092N2.zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f15577c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
