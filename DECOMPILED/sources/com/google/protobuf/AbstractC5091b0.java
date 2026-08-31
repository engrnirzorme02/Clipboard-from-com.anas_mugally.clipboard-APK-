package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.b0 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5091b0 {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC5087Z f19375a = m23081c();

    /* JADX INFO: renamed from: b */
    private static final InterfaceC5087Z f19376b = new C5089a0();

    /* JADX INFO: renamed from: a */
    static InterfaceC5087Z m23079a() {
        return f19375a;
    }

    /* JADX INFO: renamed from: b */
    static InterfaceC5087Z m23080b() {
        return f19376b;
    }

    /* JADX INFO: renamed from: c */
    private static InterfaceC5087Z m23081c() {
        try {
            return (InterfaceC5087Z) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
