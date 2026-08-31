package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.A */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2477A {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC2538y f9424a = m10855c();

    /* JADX INFO: renamed from: b */
    private static final InterfaceC2538y f9425b = new C2539z();

    /* JADX INFO: renamed from: a */
    static InterfaceC2538y m10853a() {
        return f9424a;
    }

    /* JADX INFO: renamed from: b */
    static InterfaceC2538y m10854b() {
        return f9425b;
    }

    /* JADX INFO: renamed from: c */
    private static InterfaceC2538y m10855c() {
        if (C2496U.f9472d) {
            return null;
        }
        try {
            return (InterfaceC2538y) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
