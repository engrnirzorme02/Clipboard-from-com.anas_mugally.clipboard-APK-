package p225d1;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: d1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5211c implements Serializable {

    /* JADX INFO: renamed from: a */
    private int f19912a;

    /* JADX INFO: renamed from: b */
    private long f19913b;

    /* JADX INFO: renamed from: c */
    private String f19914c;

    /* JADX INFO: renamed from: d */
    private String f19915d;

    /* JADX INFO: renamed from: e */
    private String f19916e;

    /* JADX INFO: renamed from: f */
    private long f19917f;

    /* JADX INFO: renamed from: r */
    private boolean f19918r;

    public C5211c(int i7, long j7, String str, String textContent, String category, long j8, boolean z7) {
        AbstractC6118n.m27187e(textContent, "textContent");
        AbstractC6118n.m27187e(category, "category");
        this.f19912a = i7;
        this.f19913b = j7;
        this.f19914c = str;
        this.f19915d = textContent;
        this.f19916e = category;
        this.f19917f = j8;
        this.f19918r = z7;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C5211c m24107b(C5211c c5211c, int i7, long j7, String str, String str2, String str3, long j8, boolean z7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = c5211c.f19912a;
        }
        if ((i8 & 2) != 0) {
            j7 = c5211c.f19913b;
        }
        if ((i8 & 4) != 0) {
            str = c5211c.f19914c;
        }
        if ((i8 & 8) != 0) {
            str2 = c5211c.f19915d;
        }
        if ((i8 & 16) != 0) {
            str3 = c5211c.f19916e;
        }
        if ((i8 & 32) != 0) {
            j8 = c5211c.f19917f;
        }
        if ((i8 & 64) != 0) {
            z7 = c5211c.f19918r;
        }
        boolean z8 = z7;
        String str4 = str3;
        String str5 = str;
        return c5211c.m24108a(i7, j7, str5, str2, str4, j8, z8);
    }

    /* JADX INFO: renamed from: a */
    public final C5211c m24108a(int i7, long j7, String str, String textContent, String category, long j8, boolean z7) {
        AbstractC6118n.m27187e(textContent, "textContent");
        AbstractC6118n.m27187e(category, "category");
        return new C5211c(i7, j7, str, textContent, category, j8, z7);
    }

    /* JADX INFO: renamed from: c */
    public final String m24109c() {
        return this.f19916e;
    }

    /* JADX INFO: renamed from: d */
    public final int m24110d() {
        return this.f19912a;
    }

    /* JADX INFO: renamed from: e */
    public final long m24111e() {
        return this.f19917f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5211c)) {
            return false;
        }
        C5211c c5211c = (C5211c) obj;
        return this.f19912a == c5211c.f19912a && this.f19913b == c5211c.f19913b && AbstractC6118n.m27183a(this.f19914c, c5211c.f19914c) && AbstractC6118n.m27183a(this.f19915d, c5211c.f19915d) && AbstractC6118n.m27183a(this.f19916e, c5211c.f19916e) && this.f19917f == c5211c.f19917f && this.f19918r == c5211c.f19918r;
    }

    /* JADX INFO: renamed from: f */
    public final String m24112f() {
        return this.f19915d;
    }

    /* JADX INFO: renamed from: g */
    public final String m24113g() {
        return this.f19914c;
    }

    /* JADX INFO: renamed from: h */
    public final long m24114h() {
        return this.f19913b;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f19912a) * 31) + Long.hashCode(this.f19913b)) * 31;
        String str = this.f19914c;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f19915d.hashCode()) * 31) + this.f19916e.hashCode()) * 31) + Long.hashCode(this.f19917f)) * 31) + Boolean.hashCode(this.f19918r);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m24115i() {
        return this.f19918r;
    }

    /* JADX INFO: renamed from: j */
    public final void m24116j(long j7) {
        this.f19917f = j7;
    }

    public String toString() {
        return "Text(id=" + this.f19912a + ", time=" + this.f19913b + ", textTitle=" + this.f19914c + ", textContent=" + this.f19915d + ", category=" + this.f19916e + ", orderPin=" + this.f19917f + ", isUploaded=" + this.f19918r + ')';
    }

    public /* synthetic */ C5211c(int i7, long j7, String str, String str2, String str3, long j8, boolean z7, int i8, AbstractC6112h abstractC6112h) {
        this((i8 & 1) != 0 ? 0 : i7, (i8 & 2) != 0 ? System.currentTimeMillis() : j7, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? "" : str2, (i8 & 16) != 0 ? "" : str3, (i8 & 32) != 0 ? 0L : j8, (i8 & 64) != 0 ? false : z7);
    }
}
