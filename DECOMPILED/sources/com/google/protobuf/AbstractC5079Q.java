package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.Q */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5079Q {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC5077O f19347a = m22965c();

    /* JADX INFO: renamed from: b */
    private static final InterfaceC5077O f19348b = new C5078P();

    /* JADX INFO: renamed from: a */
    static InterfaceC5077O m22963a() {
        return f19347a;
    }

    /* JADX INFO: renamed from: b */
    static InterfaceC5077O m22964b() {
        return f19348b;
    }

    /* JADX INFO: renamed from: c */
    private static InterfaceC5077O m22965c() {
        try {
            return (InterfaceC5077O) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
