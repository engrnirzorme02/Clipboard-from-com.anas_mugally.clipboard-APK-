package p051G1;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: renamed from: G1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0478i {

    /* JADX INFO: renamed from: a */
    private final int f1780a;

    /* JADX INFO: renamed from: b */
    private final int f1781b;

    /* JADX INFO: renamed from: c */
    private final Context f1782c;

    /* JADX INFO: renamed from: d */
    private final int f1783d;

    /* JADX INFO: renamed from: G1.i$a */
    public static final class a {

        /* JADX INFO: renamed from: i */
        static final int f1784i = 1;

        /* JADX INFO: renamed from: a */
        final Context f1785a;

        /* JADX INFO: renamed from: b */
        ActivityManager f1786b;

        /* JADX INFO: renamed from: c */
        c f1787c;

        /* JADX INFO: renamed from: e */
        float f1789e;

        /* JADX INFO: renamed from: d */
        float f1788d = 2.0f;

        /* JADX INFO: renamed from: f */
        float f1790f = 0.4f;

        /* JADX INFO: renamed from: g */
        float f1791g = 0.33f;

        /* JADX INFO: renamed from: h */
        int f1792h = 4194304;

        public a(Context context) {
            this.f1789e = f1784i;
            this.f1785a = context;
            this.f1786b = (ActivityManager) context.getSystemService("activity");
            this.f1787c = new b(context.getResources().getDisplayMetrics());
            if (C0478i.m2051e(this.f1786b)) {
                this.f1789e = 0.0f;
            }
        }

        /* JADX INFO: renamed from: a */
        public C0478i m2056a() {
            return new C0478i(this);
        }
    }

    /* JADX INFO: renamed from: G1.i$b */
    private static final class b implements c {

        /* JADX INFO: renamed from: a */
        private final DisplayMetrics f1793a;

        b(DisplayMetrics displayMetrics) {
            this.f1793a = displayMetrics;
        }

        @Override // p051G1.C0478i.c
        /* JADX INFO: renamed from: a */
        public int mo2057a() {
            return this.f1793a.heightPixels;
        }

        @Override // p051G1.C0478i.c
        /* JADX INFO: renamed from: b */
        public int mo2058b() {
            return this.f1793a.widthPixels;
        }
    }

    /* JADX INFO: renamed from: G1.i$c */
    interface c {
        /* JADX INFO: renamed from: a */
        int mo2057a();

        /* JADX INFO: renamed from: b */
        int mo2058b();
    }

    C0478i(a aVar) {
        this.f1782c = aVar.f1785a;
        int i7 = m2051e(aVar.f1786b) ? aVar.f1792h / 2 : aVar.f1792h;
        this.f1783d = i7;
        int iM2050c = m2050c(aVar.f1786b, aVar.f1790f, aVar.f1791g);
        float fMo2058b = aVar.f1787c.mo2058b() * aVar.f1787c.mo2057a() * 4;
        int iRound = Math.round(aVar.f1789e * fMo2058b);
        int iRound2 = Math.round(fMo2058b * aVar.f1788d);
        int i8 = iM2050c - i7;
        int i9 = iRound2 + iRound;
        if (i9 <= i8) {
            this.f1781b = iRound2;
            this.f1780a = iRound;
        } else {
            float f7 = i8;
            float f8 = aVar.f1789e;
            float f9 = aVar.f1788d;
            float f10 = f7 / (f8 + f9);
            this.f1781b = Math.round(f9 * f10);
            this.f1780a = Math.round(f10 * aVar.f1789e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m2052f(this.f1781b));
            sb.append(", pool size: ");
            sb.append(m2052f(this.f1780a));
            sb.append(", byte array size: ");
            sb.append(m2052f(i7));
            sb.append(", memory class limited? ");
            sb.append(i9 > iM2050c);
            sb.append(", max size: ");
            sb.append(m2052f(iM2050c));
            sb.append(", memoryClass: ");
            sb.append(aVar.f1786b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m2051e(aVar.f1786b));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    /* JADX INFO: renamed from: c */
    private static int m2050c(ActivityManager activityManager, float f7, float f8) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (m2051e(activityManager)) {
            f7 = f8;
        }
        return Math.round(memoryClass * f7);
    }

    /* JADX INFO: renamed from: e */
    static boolean m2051e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    /* JADX INFO: renamed from: f */
    private String m2052f(int i7) {
        return Formatter.formatFileSize(this.f1782c, i7);
    }

    /* JADX INFO: renamed from: a */
    public int m2053a() {
        return this.f1783d;
    }

    /* JADX INFO: renamed from: b */
    public int m2054b() {
        return this.f1780a;
    }

    /* JADX INFO: renamed from: d */
    public int m2055d() {
        return this.f1781b;
    }
}
