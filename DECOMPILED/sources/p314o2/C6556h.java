package p314o2;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3369m2;
import p404z2.C7590g;

/* JADX INFO: renamed from: o2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C6556h {

    /* JADX INFO: renamed from: i */
    public static final C6556h f24740i = new C6556h(320, 50, "320x50_mb");

    /* JADX INFO: renamed from: j */
    public static final C6556h f24741j = new C6556h(468, 60, "468x60_as");

    /* JADX INFO: renamed from: k */
    public static final C6556h f24742k = new C6556h(320, 100, "320x100_as");

    /* JADX INFO: renamed from: l */
    public static final C6556h f24743l = new C6556h(728, 90, "728x90_as");

    /* JADX INFO: renamed from: m */
    public static final C6556h f24744m = new C6556h(300, 250, "300x250_as");

    /* JADX INFO: renamed from: n */
    public static final C6556h f24745n = new C6556h(160, 600, "160x600_as");

    /* JADX INFO: renamed from: o */
    public static final C6556h f24746o = new C6556h(-1, -2, "smart_banner");

    /* JADX INFO: renamed from: p */
    public static final C6556h f24747p = new C6556h(-3, -4, "fluid");

    /* JADX INFO: renamed from: q */
    public static final C6556h f24748q = new C6556h(0, 0, "invalid");

    /* JADX INFO: renamed from: r */
    public static final C6556h f24749r = new C6556h(50, 50, "50x50_mb");

    /* JADX INFO: renamed from: a */
    private final int f24750a;

    /* JADX INFO: renamed from: b */
    private final int f24751b;

    /* JADX INFO: renamed from: c */
    private final String f24752c;

    /* JADX INFO: renamed from: d */
    private boolean f24753d;

    /* JADX INFO: renamed from: e */
    private boolean f24754e;

    /* JADX INFO: renamed from: f */
    private int f24755f;

    /* JADX INFO: renamed from: g */
    private boolean f24756g;

    /* JADX INFO: renamed from: h */
    private int f24757h;

    static {
        new C6556h(-3, 0, "search_v2");
    }

    public C6556h(int i7, int i8) {
        String strValueOf = i7 == -1 ? "FULL" : String.valueOf(i7);
        String strValueOf2 = i8 == -2 ? "AUTO" : String.valueOf(i8);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(strValueOf2).length() + 3);
        sb.append(strValueOf);
        sb.append("x");
        sb.append(strValueOf2);
        sb.append("_as");
        this(i7, i8, sb.toString());
    }

    /* JADX INFO: renamed from: a */
    public int m27827a() {
        return this.f24751b;
    }

    /* JADX INFO: renamed from: b */
    public int m27828b(Context context) {
        int i7 = this.f24751b;
        if (i7 == -4 || i7 == -3) {
            return -1;
        }
        if (i7 == -2) {
            return C3369m2.m17287T(context.getResources().getDisplayMetrics());
        }
        C3244B.m17190a();
        return C7590g.m33276c(context, i7);
    }

    /* JADX INFO: renamed from: c */
    public int m27829c() {
        return this.f24750a;
    }

    /* JADX INFO: renamed from: d */
    public int m27830d(Context context) {
        int i7 = this.f24750a;
        if (i7 == -3) {
            return -1;
        }
        if (i7 != -1) {
            C3244B.m17190a();
            return C7590g.m33276c(context, i7);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<C3369m2> creator = C3369m2.CREATOR;
        return displayMetrics.widthPixels;
    }

    /* JADX INFO: renamed from: e */
    public boolean m27831e() {
        return this.f24750a == -3 && this.f24751b == -4;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6556h)) {
            return false;
        }
        C6556h c6556h = (C6556h) obj;
        return this.f24750a == c6556h.f24750a && this.f24751b == c6556h.f24751b && this.f24752c.equals(c6556h.f24752c);
    }

    /* JADX INFO: renamed from: f */
    final boolean m27832f() {
        return this.f24753d;
    }

    /* JADX INFO: renamed from: g */
    final boolean m27833g() {
        return this.f24754e;
    }

    /* JADX INFO: renamed from: h */
    final void m27834h(boolean z7) {
        this.f24754e = true;
    }

    public int hashCode() {
        return this.f24752c.hashCode();
    }

    /* JADX INFO: renamed from: i */
    final void m27835i(int i7) {
        this.f24755f = i7;
    }

    /* JADX INFO: renamed from: j */
    final int m27836j() {
        return this.f24755f;
    }

    /* JADX INFO: renamed from: k */
    final boolean m27837k() {
        return this.f24756g;
    }

    /* JADX INFO: renamed from: l */
    final void m27838l(boolean z7) {
        this.f24756g = true;
    }

    /* JADX INFO: renamed from: m */
    final int m27839m() {
        return this.f24757h;
    }

    /* JADX INFO: renamed from: n */
    final void m27840n(int i7) {
        this.f24757h = i7;
    }

    public String toString() {
        return this.f24752c;
    }

    C6556h(int i7, int i8, String str) {
        if (i7 < 0 && i7 != -1 && i7 != -3) {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 26);
            sb.append("Invalid width for AdSize: ");
            sb.append(i7);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i8 < 0 && i8 != -2 && i8 != -4) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i8).length() + 27);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(i8);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f24750a = i7;
        this.f24751b = i8;
        this.f24752c = str;
    }
}
