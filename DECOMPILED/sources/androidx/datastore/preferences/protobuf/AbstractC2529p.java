package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2529p {

    /* JADX INFO: renamed from: a */
    private static final AbstractC2527n f9636a = new C2528o();

    /* JADX INFO: renamed from: b */
    private static final AbstractC2527n f9637b = m11570c();

    /* JADX INFO: renamed from: a */
    static AbstractC2527n m11568a() {
        AbstractC2527n abstractC2527n = f9637b;
        if (abstractC2527n != null) {
            return abstractC2527n;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: renamed from: b */
    static AbstractC2527n m11569b() {
        return f9636a;
    }

    /* JADX INFO: renamed from: c */
    private static AbstractC2527n m11570c() {
        if (C2496U.f9472d) {
            return null;
        }
        try {
            return (AbstractC2527n) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
