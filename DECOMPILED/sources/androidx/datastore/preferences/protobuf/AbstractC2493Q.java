package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Q */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2493Q {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC2491O f9465a = m10983c();

    /* JADX INFO: renamed from: b */
    private static final InterfaceC2491O f9466b = new C2492P();

    /* JADX INFO: renamed from: a */
    static InterfaceC2491O m10981a() {
        return f9465a;
    }

    /* JADX INFO: renamed from: b */
    static InterfaceC2491O m10982b() {
        return f9466b;
    }

    /* JADX INFO: renamed from: c */
    private static InterfaceC2491O m10983c() {
        if (C2496U.f9472d) {
            return null;
        }
        try {
            return (InterfaceC2491O) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
