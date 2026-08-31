package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2524l {

    /* JADX INFO: renamed from: a */
    static final Class f9627a = m11555c();

    /* JADX INFO: renamed from: a */
    public static C2526m m11553a() {
        C2526m c2526mM11554b = m11554b("getEmptyRegistry");
        return c2526mM11554b != null ? c2526mM11554b : C2526m.f9632c;
    }

    /* JADX INFO: renamed from: b */
    private static final C2526m m11554b(String str) {
        Class cls = f9627a;
        if (cls == null) {
            return null;
        }
        try {
            return (C2526m) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    static Class m11555c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
