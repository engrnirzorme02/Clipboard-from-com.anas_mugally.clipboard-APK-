package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p229d5.AbstractC5244d;
import p245f5.C5441b;
import p245f5.InterfaceC5440a;

/* JADX INFO: renamed from: com.google.firebase.installations.i */
/* JADX INFO: loaded from: classes.dex */
public final class C4949i {

    /* JADX INFO: renamed from: b */
    public static final long f18771b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c */
    private static final Pattern f18772c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d */
    private static C4949i f18773d;

    /* JADX INFO: renamed from: a */
    private final InterfaceC5440a f18774a;

    private C4949i(InterfaceC5440a interfaceC5440a) {
        this.f18774a = interfaceC5440a;
    }

    /* JADX INFO: renamed from: c */
    public static C4949i m22237c() {
        return m22238d(C5441b.m24645b());
    }

    /* JADX INFO: renamed from: d */
    public static C4949i m22238d(InterfaceC5440a interfaceC5440a) {
        if (f18773d == null) {
            f18773d = new C4949i(interfaceC5440a);
        }
        return f18773d;
    }

    /* JADX INFO: renamed from: g */
    static boolean m22239g(String str) {
        return f18772c.matcher(str).matches();
    }

    /* JADX INFO: renamed from: h */
    static boolean m22240h(String str) {
        return str.contains(":");
    }

    /* JADX INFO: renamed from: a */
    public long m22241a() {
        return this.f18774a.mo24644a();
    }

    /* JADX INFO: renamed from: b */
    public long m22242b() {
        return TimeUnit.MILLISECONDS.toSeconds(m22241a());
    }

    /* JADX INFO: renamed from: e */
    public long m22243e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* JADX INFO: renamed from: f */
    public boolean m22244f(AbstractC5244d abstractC5244d) {
        return TextUtils.isEmpty(abstractC5244d.mo24199b()) || abstractC5244d.mo24205h() + abstractC5244d.mo24200c() < m22242b() + f18771b;
    }
}
