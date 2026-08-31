package p081K;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: K.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0709a {

    /* JADX INFO: renamed from: a */
    public static final C0709a f2876a = new C0709a();

    /* JADX INFO: renamed from: b */
    public static final int f2877b;

    /* JADX INFO: renamed from: c */
    public static final int f2878c;

    /* JADX INFO: renamed from: d */
    public static final int f2879d;

    /* JADX INFO: renamed from: e */
    public static final int f2880e;

    /* JADX INFO: renamed from: K.a$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f2881a = new a();

        private a() {
        }

        /* JADX INFO: renamed from: a */
        public final int m3453a(int i7) {
            return SdkExtensions.getExtensionVersion(i7);
        }
    }

    static {
        int i7 = Build.VERSION.SDK_INT;
        f2877b = i7 >= 30 ? a.f2881a.m3453a(30) : 0;
        f2878c = i7 >= 30 ? a.f2881a.m3453a(31) : 0;
        f2879d = i7 >= 30 ? a.f2881a.m3453a(33) : 0;
        f2880e = i7 >= 30 ? a.f2881a.m3453a(1000000) : 0;
    }

    private C0709a() {
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m3450a(String codename, String buildCodename) {
        AbstractC6118n.m27187e(codename, "codename");
        AbstractC6118n.m27187e(buildCodename, "buildCodename");
        if (AbstractC6118n.m27183a("REL", buildCodename)) {
            return false;
        }
        Integer numM3451b = m3451b(buildCodename);
        Integer numM3451b2 = m3451b(codename);
        if (numM3451b != null && numM3451b2 != null) {
            return numM3451b.intValue() >= numM3451b2.intValue();
        }
        if (numM3451b != null || numM3451b2 != null) {
            return numM3451b != null;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        AbstractC6118n.m27186d(upperCase, "toUpperCase(...)");
        String upperCase2 = codename.toUpperCase(locale);
        AbstractC6118n.m27186d(upperCase2, "toUpperCase(...)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    /* JADX INFO: renamed from: b */
    private static final Integer m3451b(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        AbstractC6118n.m27186d(upperCase, "toUpperCase(...)");
        return AbstractC6118n.m27183a(upperCase, "BAKLAVA") ? 0 : null;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m3452c() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            return true;
        }
        if (i7 < 30) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        AbstractC6118n.m27186d(CODENAME, "CODENAME");
        return m3450a("S", CODENAME);
    }
}
