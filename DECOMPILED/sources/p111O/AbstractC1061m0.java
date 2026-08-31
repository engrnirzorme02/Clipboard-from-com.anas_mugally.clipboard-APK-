package p111O;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: O.m0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1061m0 {

    /* JADX INFO: renamed from: O.m0$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static void m4704a(Window window, boolean z7) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z7 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* JADX INFO: renamed from: O.m0$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static void m4705a(Window window, boolean z7) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z7 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
            window.setDecorFitsSystemWindows(z7);
        }
    }

    /* JADX INFO: renamed from: O.m0$c */
    static class c {
        /* JADX INFO: renamed from: a */
        static void m4706a(Window window, boolean z7) {
            window.setDecorFitsSystemWindows(z7);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1034a1 m4702a(Window window, View view) {
        return new C1034a1(window, view);
    }

    /* JADX INFO: renamed from: b */
    public static void m4703b(Window window, boolean z7) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            c.m4706a(window, z7);
        } else if (i7 >= 30) {
            b.m4705a(window, z7);
        } else {
            a.m4704a(window, z7);
        }
    }
}
