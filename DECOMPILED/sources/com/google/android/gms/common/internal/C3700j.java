package com.google.android.gms.common.internal;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.j */
/* JADX INFO: loaded from: classes.dex */
public final class C3700j {

    /* JADX INFO: renamed from: a */
    private final String f14800a;

    /* JADX INFO: renamed from: b */
    private final String f14801b;

    public C3700j(String str) {
        this(str, null);
    }

    /* JADX INFO: renamed from: f */
    private final String m18042f(String str) {
        String str2 = this.f14801b;
        return str2 == null ? str : str2.concat(str);
    }

    /* JADX INFO: renamed from: a */
    public boolean m18043a(int i7) {
        return Log.isLoggable(this.f14800a, i7);
    }

    /* JADX INFO: renamed from: b */
    public void m18044b(String str, String str2) {
        if (m18043a(3)) {
            Log.d(str, m18042f(str2));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m18045c(String str, String str2, Throwable th) {
        if (m18043a(6)) {
            Log.e(str, m18042f(str2), th);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m18046d(String str, String str2) {
        if (m18043a(2)) {
            Log.v(str, m18042f(str2));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m18047e(String str, String str2) {
        if (m18043a(5)) {
            Log.w(str, m18042f(str2));
        }
    }

    public C3700j(String str, String str2) {
        AbstractC3718s.m18084m(str, "log tag cannot be null");
        AbstractC3718s.m18074c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f14800a = str;
        this.f14801b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
