package p346s0;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* JADX INFO: renamed from: s0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6943b {

    /* JADX INFO: renamed from: a */
    public static final C6943b f27895a = new C6943b();

    /* JADX INFO: renamed from: s0.b$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f27896a = new a();

        private a() {
        }

        /* JADX INFO: renamed from: a */
        public final int m30417a() {
            return SdkExtensions.getExtensionVersion(31);
        }
    }

    /* JADX INFO: renamed from: s0.b$b */
    private static final class b {

        /* JADX INFO: renamed from: a */
        public static final b f27897a = new b();

        private b() {
        }

        /* JADX INFO: renamed from: a */
        public final int m30418a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    private C6943b() {
    }

    /* JADX INFO: renamed from: a */
    public final int m30415a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return b.f27897a.m30418a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m30416b() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 == 31 || i7 == 32) {
            return a.f27896a.m30417a();
        }
        return 0;
    }
}
