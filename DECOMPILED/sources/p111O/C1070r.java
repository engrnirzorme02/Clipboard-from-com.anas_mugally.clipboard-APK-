package p111O;

import android.os.Build;
import android.view.DisplayCutout;
import p104N.AbstractC0905b;

/* JADX INFO: renamed from: O.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1070r {

    /* JADX INFO: renamed from: a */
    private final DisplayCutout f3911a;

    /* JADX INFO: renamed from: O.r$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static int m4763a(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        /* JADX INFO: renamed from: b */
        static int m4764b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        /* JADX INFO: renamed from: c */
        static int m4765c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        /* JADX INFO: renamed from: d */
        static int m4766d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    private C1070r(DisplayCutout displayCutout) {
        this.f3911a = displayCutout;
    }

    /* JADX INFO: renamed from: e */
    static C1070r m4758e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C1070r(displayCutout);
    }

    /* JADX INFO: renamed from: a */
    public int m4759a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m4763a(this.f3911a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public int m4760b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m4764b(this.f3911a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public int m4761c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m4765c(this.f3911a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public int m4762d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m4766d(this.f3911a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1070r.class != obj.getClass()) {
            return false;
        }
        return AbstractC0905b.m4125a(this.f3911a, ((C1070r) obj).f3911a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f3911a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f3911a + "}";
    }
}
