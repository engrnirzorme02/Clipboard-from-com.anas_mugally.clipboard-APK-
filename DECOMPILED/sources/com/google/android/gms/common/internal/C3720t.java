package com.google.android.gms.common.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.t */
/* JADX INFO: loaded from: classes.dex */
public final class C3720t {

    /* JADX INFO: renamed from: b */
    private static C3720t f14840b;

    /* JADX INFO: renamed from: c */
    private static final C3722u f14841c = new C3722u(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a */
    private C3722u f14842a;

    private C3720t() {
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C3720t m18089b() {
        try {
            if (f14840b == null) {
                f14840b = new C3720t();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f14840b;
    }

    /* JADX INFO: renamed from: a */
    public C3722u m18090a() {
        return this.f14842a;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m18091c(C3722u c3722u) {
        try {
            if (c3722u == null) {
                this.f14842a = f14841c;
                return;
            }
            C3722u c3722u2 = this.f14842a;
            if (c3722u2 == null || c3722u2.m18096X() < c3722u.m18096X()) {
                this.f14842a = c3722u;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
