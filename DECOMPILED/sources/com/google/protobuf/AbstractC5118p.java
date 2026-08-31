package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.p */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5118p {

    /* JADX INFO: renamed from: a */
    static final Class f19501a = m23532c();

    /* JADX INFO: renamed from: a */
    public static C5120q m23530a() {
        C5120q c5120qM23531b = m23531b("getEmptyRegistry");
        return c5120qM23531b != null ? c5120qM23531b : C5120q.f19525d;
    }

    /* JADX INFO: renamed from: b */
    private static final C5120q m23531b(String str) {
        Class cls = f19501a;
        if (cls == null) {
            return null;
        }
        try {
            return (C5120q) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    static Class m23532c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
