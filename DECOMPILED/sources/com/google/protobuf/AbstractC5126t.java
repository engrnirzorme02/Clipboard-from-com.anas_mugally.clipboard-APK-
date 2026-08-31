package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.t */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5126t {

    /* JADX INFO: renamed from: a */
    private static final AbstractC5122r f19531a = new C5124s();

    /* JADX INFO: renamed from: b */
    private static final AbstractC5122r f19532b = m23591c();

    /* JADX INFO: renamed from: a */
    static AbstractC5122r m23589a() {
        AbstractC5122r abstractC5122r = f19532b;
        if (abstractC5122r != null) {
            return abstractC5122r;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: renamed from: b */
    static AbstractC5122r m23590b() {
        return f19531a;
    }

    /* JADX INFO: renamed from: c */
    private static AbstractC5122r m23591c() {
        try {
            return (AbstractC5122r) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
