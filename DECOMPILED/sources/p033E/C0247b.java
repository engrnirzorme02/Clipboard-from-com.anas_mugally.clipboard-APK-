package p033E;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: renamed from: E.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0247b {

    /* JADX INFO: renamed from: e */
    public static final C0247b f983e = new C0247b(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f984a;

    /* JADX INFO: renamed from: b */
    public final int f985b;

    /* JADX INFO: renamed from: c */
    public final int f986c;

    /* JADX INFO: renamed from: d */
    public final int f987d;

    /* JADX INFO: renamed from: E.b$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static Insets m1188a(int i7, int i8, int i9, int i10) {
            return Insets.of(i7, i8, i9, i10);
        }
    }

    private C0247b(int i7, int i8, int i9, int i10) {
        this.f984a = i7;
        this.f985b = i8;
        this.f986c = i9;
        this.f987d = i10;
    }

    /* JADX INFO: renamed from: a */
    public static C0247b m1183a(C0247b c0247b, C0247b c0247b2) {
        return m1184b(Math.max(c0247b.f984a, c0247b2.f984a), Math.max(c0247b.f985b, c0247b2.f985b), Math.max(c0247b.f986c, c0247b2.f986c), Math.max(c0247b.f987d, c0247b2.f987d));
    }

    /* JADX INFO: renamed from: b */
    public static C0247b m1184b(int i7, int i8, int i9, int i10) {
        return (i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) ? f983e : new C0247b(i7, i8, i9, i10);
    }

    /* JADX INFO: renamed from: c */
    public static C0247b m1185c(Rect rect) {
        return m1184b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: d */
    public static C0247b m1186d(Insets insets) {
        return m1184b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: e */
    public Insets m1187e() {
        return a.m1188a(this.f984a, this.f985b, this.f986c, this.f987d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0247b.class != obj.getClass()) {
            return false;
        }
        C0247b c0247b = (C0247b) obj;
        return this.f987d == c0247b.f987d && this.f984a == c0247b.f984a && this.f986c == c0247b.f986c && this.f985b == c0247b.f985b;
    }

    public int hashCode() {
        return (((((this.f984a * 31) + this.f985b) * 31) + this.f986c) * 31) + this.f987d;
    }

    public String toString() {
        return "Insets{left=" + this.f984a + ", top=" + this.f985b + ", right=" + this.f986c + ", bottom=" + this.f987d + '}';
    }
}
