package p225d1;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: d1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5209a implements Serializable {

    /* JADX INFO: renamed from: a */
    private String f19903a;

    /* JADX INFO: renamed from: b */
    private int f19904b;

    /* JADX INFO: renamed from: c */
    private boolean f19905c;

    /* JADX INFO: renamed from: d */
    private String f19906d;

    /* JADX INFO: renamed from: e */
    private boolean f19907e;

    /* JADX INFO: renamed from: f */
    private String f19908f;

    public C5209a(String categoryName, int i7, boolean z7, String pass, boolean z8, String str) {
        AbstractC6118n.m27187e(categoryName, "categoryName");
        AbstractC6118n.m27187e(pass, "pass");
        this.f19903a = categoryName;
        this.f19904b = i7;
        this.f19905c = z7;
        this.f19906d = pass;
        this.f19907e = z8;
        this.f19908f = str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C5209a m24095b(C5209a c5209a, String str, int i7, boolean z7, String str2, boolean z8, String str3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = c5209a.f19903a;
        }
        if ((i8 & 2) != 0) {
            i7 = c5209a.f19904b;
        }
        if ((i8 & 4) != 0) {
            z7 = c5209a.f19905c;
        }
        if ((i8 & 8) != 0) {
            str2 = c5209a.f19906d;
        }
        if ((i8 & 16) != 0) {
            z8 = c5209a.f19907e;
        }
        if ((i8 & 32) != 0) {
            str3 = c5209a.f19908f;
        }
        boolean z9 = z8;
        String str4 = str3;
        return c5209a.m24096a(str, i7, z7, str2, z9, str4);
    }

    /* JADX INFO: renamed from: a */
    public final C5209a m24096a(String categoryName, int i7, boolean z7, String pass, boolean z8, String str) {
        AbstractC6118n.m27187e(categoryName, "categoryName");
        AbstractC6118n.m27187e(pass, "pass");
        return new C5209a(categoryName, i7, z7, pass, z8, str);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m24097c() {
        return this.f19907e;
    }

    /* JADX INFO: renamed from: d */
    public final String m24098d() {
        return this.f19903a;
    }

    /* JADX INFO: renamed from: e */
    public final String m24099e() {
        return this.f19908f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5209a)) {
            return false;
        }
        C5209a c5209a = (C5209a) obj;
        return AbstractC6118n.m27183a(this.f19903a, c5209a.f19903a) && this.f19904b == c5209a.f19904b && this.f19905c == c5209a.f19905c && AbstractC6118n.m27183a(this.f19906d, c5209a.f19906d) && this.f19907e == c5209a.f19907e && AbstractC6118n.m27183a(this.f19908f, c5209a.f19908f);
    }

    /* JADX INFO: renamed from: f */
    public final int m24100f() {
        return this.f19904b;
    }

    /* JADX INFO: renamed from: g */
    public final String m24101g() {
        return this.f19906d;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m24102h() {
        return this.f19905c;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f19903a.hashCode() * 31) + Integer.hashCode(this.f19904b)) * 31) + Boolean.hashCode(this.f19905c)) * 31) + this.f19906d.hashCode()) * 31) + Boolean.hashCode(this.f19907e)) * 31;
        String str = this.f19908f;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    /* JADX INFO: renamed from: i */
    public final void m24103i(int i7) {
        this.f19904b = i7;
    }

    public String toString() {
        return "Category(categoryName=" + this.f19903a + ", order=" + this.f19904b + ", isLocked=" + this.f19905c + ", pass=" + this.f19906d + ", allowBiometric=" + this.f19907e + ", name=" + this.f19908f + ')';
    }

    public /* synthetic */ C5209a(String str, int i7, boolean z7, String str2, boolean z8, String str3, int i8, AbstractC6112h abstractC6112h) {
        this(str, i7, (i8 & 4) != 0 ? false : z7, (i8 & 8) != 0 ? "" : str2, (i8 & 16) != 0 ? false : z8, (i8 & 32) != 0 ? null : str3);
    }
}
