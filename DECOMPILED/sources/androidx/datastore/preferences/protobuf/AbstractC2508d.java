package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2508d {

    /* JADX INFO: renamed from: a */
    private static boolean f9505a;

    /* JADX INFO: renamed from: b */
    private static final Class f9506b = m11128a("libcore.io.Memory");

    /* JADX INFO: renamed from: c */
    private static final boolean f9507c;

    static {
        f9507c = (f9505a || m11128a("org.robolectric.Robolectric") == null) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    private static Class m11128a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    static Class m11129b() {
        return f9506b;
    }

    /* JADX INFO: renamed from: c */
    static boolean m11130c() {
        if (f9505a) {
            return true;
        }
        return (f9506b == null || f9507c) ? false : true;
    }
}
