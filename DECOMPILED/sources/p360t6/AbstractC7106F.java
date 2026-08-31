package p360t6;

/* JADX INFO: renamed from: t6.F */
/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class AbstractC7106F {

    /* JADX INFO: renamed from: a */
    private static final int f28396a = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: a */
    public static final int m31394a() {
        return f28396a;
    }

    /* JADX INFO: renamed from: b */
    public static final String m31395b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
