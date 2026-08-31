package p186Y4;

import android.util.Log;

/* JADX INFO: renamed from: Y4.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2049q {

    /* JADX INFO: renamed from: a */
    private static b f6776a = b.WARN;

    /* JADX INFO: renamed from: Y4.q$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f6777a;

        static {
            int[] iArr = new int[b.values().length];
            f6777a = iArr;
            try {
                iArr[b.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6777a[b.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6777a[b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: Y4.q$b */
    public enum b {
        DEBUG,
        WARN,
        NONE
    }

    /* JADX INFO: renamed from: a */
    public static void m8502a(String str, String str2, Object... objArr) {
        m8503b(b.DEBUG, str, str2, objArr);
    }

    /* JADX INFO: renamed from: b */
    private static void m8503b(b bVar, String str, String str2, Object... objArr) {
        if (bVar.ordinal() >= f6776a.ordinal()) {
            String str3 = String.format("(%s) [%s]: ", "26.0.1", str) + String.format(str2, objArr);
            int i7 = a.f6777a[bVar.ordinal()];
            if (i7 == 1) {
                Log.i("Firestore", str3);
            } else if (i7 == 2) {
                Log.w("Firestore", str3);
            } else if (i7 == 3) {
                throw new IllegalStateException("Trying to log something on level NONE");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m8504c() {
        return f6776a.ordinal() >= b.DEBUG.ordinal();
    }

    /* JADX INFO: renamed from: d */
    public static void m8505d(String str, String str2, Object... objArr) {
        m8503b(b.WARN, str, str2, objArr);
    }
}
