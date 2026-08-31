package p145S5;

import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: S5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1427e implements Comparable {

    /* JADX INFO: renamed from: e */
    public static final a f4943e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final C1427e f4944f = C1428f.m6063a();

    /* JADX INFO: renamed from: a */
    private final int f4945a;

    /* JADX INFO: renamed from: b */
    private final int f4946b;

    /* JADX INFO: renamed from: c */
    private final int f4947c;

    /* JADX INFO: renamed from: d */
    private final int f4948d;

    /* JADX INFO: renamed from: S5.e$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    public C1427e(int i7, int i8, int i9) {
        this.f4945a = i7;
        this.f4946b = i8;
        this.f4947c = i9;
        this.f4948d = m6061d(i7, i8, i9);
    }

    /* JADX INFO: renamed from: d */
    private final int m6061d(int i7, int i8, int i9) {
        if (i7 >= 0 && i7 < 256 && i8 >= 0 && i8 < 256 && i9 >= 0 && i9 < 256) {
            return (i7 << 16) + (i8 << 8) + i9;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i7 + '.' + i8 + '.' + i9).toString());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1427e other) {
        AbstractC6118n.m27187e(other, "other");
        return this.f4948d - other.f4948d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C1427e c1427e = obj instanceof C1427e ? (C1427e) obj : null;
        return c1427e != null && this.f4948d == c1427e.f4948d;
    }

    public int hashCode() {
        return this.f4948d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4945a);
        sb.append('.');
        sb.append(this.f4946b);
        sb.append('.');
        sb.append(this.f4947c);
        return sb.toString();
    }
}
