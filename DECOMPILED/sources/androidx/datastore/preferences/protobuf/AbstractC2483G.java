package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.G */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2483G {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC2481E f9439a = m10892c();

    /* JADX INFO: renamed from: b */
    private static final InterfaceC2481E f9440b = new C2482F();

    /* JADX INFO: renamed from: a */
    static InterfaceC2481E m10890a() {
        return f9439a;
    }

    /* JADX INFO: renamed from: b */
    static InterfaceC2481E m10891b() {
        return f9440b;
    }

    /* JADX INFO: renamed from: c */
    private static InterfaceC2481E m10892c() {
        if (C2496U.f9472d) {
            return null;
        }
        try {
            return (InterfaceC2481E) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
