package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.util.AbstractC3745A;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3718s {
    /* JADX INFO: renamed from: a */
    public static void m18072a(boolean z7) {
        if (!z7) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m18073b(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m18074c(boolean z7, String str, Object... objArr) {
        if (!z7) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m18075d(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m18076e(String str) {
        if (!AbstractC3745A.m18141a()) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m18077f(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    /* JADX INFO: renamed from: g */
    public static String m18078g(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    /* JADX INFO: renamed from: h */
    public static void m18079h() {
        m18080i("Must not be called on GoogleApiHandler thread.");
    }

    /* JADX INFO: renamed from: i */
    public static void m18080i(String str) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m18081j() {
        m18082k("Must not be called on the main application thread");
    }

    /* JADX INFO: renamed from: k */
    public static void m18082k(String str) {
        if (AbstractC3745A.m18141a()) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX INFO: renamed from: l */
    public static Object m18083l(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    /* JADX INFO: renamed from: m */
    public static Object m18084m(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* JADX INFO: renamed from: n */
    public static int m18085n(int i7) {
        if (i7 != 0) {
            return i7;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    /* JADX INFO: renamed from: o */
    public static void m18086o(boolean z7) {
        if (!z7) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m18087p(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m18088q(boolean z7, String str, Object... objArr) {
        if (!z7) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
