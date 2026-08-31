package p095L5;

import p072I6.C0651h;

/* JADX INFO: renamed from: L5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0848d {

    /* JADX INFO: renamed from: d */
    public static final C0651h f3347d = C0651h.m3084j(":status");

    /* JADX INFO: renamed from: e */
    public static final C0651h f3348e = C0651h.m3084j(":method");

    /* JADX INFO: renamed from: f */
    public static final C0651h f3349f = C0651h.m3084j(":path");

    /* JADX INFO: renamed from: g */
    public static final C0651h f3350g = C0651h.m3084j(":scheme");

    /* JADX INFO: renamed from: h */
    public static final C0651h f3351h = C0651h.m3084j(":authority");

    /* JADX INFO: renamed from: i */
    public static final C0651h f3352i = C0651h.m3084j(":host");

    /* JADX INFO: renamed from: j */
    public static final C0651h f3353j = C0651h.m3084j(":version");

    /* JADX INFO: renamed from: a */
    public final C0651h f3354a;

    /* JADX INFO: renamed from: b */
    public final C0651h f3355b;

    /* JADX INFO: renamed from: c */
    final int f3356c;

    public C0848d(String str, String str2) {
        this(C0651h.m3084j(str), C0651h.m3084j(str2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0848d) {
            C0848d c0848d = (C0848d) obj;
            if (this.f3354a.equals(c0848d.f3354a) && this.f3355b.equals(c0848d.f3355b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f3354a.hashCode()) * 31) + this.f3355b.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", this.f3354a.m3094M(), this.f3355b.m3094M());
    }

    public C0848d(C0651h c0651h, String str) {
        this(c0651h, C0651h.m3084j(str));
    }

    public C0848d(C0651h c0651h, C0651h c0651h2) {
        this.f3354a = c0651h;
        this.f3355b = c0651h2;
        this.f3356c = c0651h.m3090F() + 32 + c0651h2.m3090F();
    }
}
