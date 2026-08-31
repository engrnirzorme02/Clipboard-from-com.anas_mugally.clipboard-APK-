package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.d */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5094d {

    /* JADX INFO: renamed from: a */
    private static boolean f19379a;

    /* JADX INFO: renamed from: b */
    private static final Class f19380b = m23096a("libcore.io.Memory");

    /* JADX INFO: renamed from: c */
    private static final boolean f19381c;

    static {
        f19381c = (f19379a || m23096a("org.robolectric.Robolectric") == null) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    private static Class m23096a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    static Class m23097b() {
        return f19380b;
    }

    /* JADX INFO: renamed from: c */
    static boolean m23098c() {
        if (f19379a) {
            return true;
        }
        return (f19380b == null || f19381c) ? false : true;
    }
}
