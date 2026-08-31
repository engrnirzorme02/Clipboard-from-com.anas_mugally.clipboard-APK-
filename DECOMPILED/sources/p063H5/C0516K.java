package p063H5;

import java.util.concurrent.atomic.AtomicLong;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: H5.K */
/* JADX INFO: loaded from: classes.dex */
public final class C0516K {

    /* JADX INFO: renamed from: d */
    private static final AtomicLong f1933d = new AtomicLong();

    /* JADX INFO: renamed from: a */
    private final String f1934a;

    /* JADX INFO: renamed from: b */
    private final String f1935b;

    /* JADX INFO: renamed from: c */
    private final long f1936c;

    C0516K(String str, String str2, long j7) {
        AbstractC1209m.m5303o(str, "typeName");
        AbstractC1209m.m5293e(!str.isEmpty(), "empty type");
        this.f1934a = str;
        this.f1935b = str2;
        this.f1936c = j7;
    }

    /* JADX INFO: renamed from: a */
    public static C0516K m2160a(Class cls, String str) {
        return m2161b(m2162c(cls), str);
    }

    /* JADX INFO: renamed from: b */
    public static C0516K m2161b(String str, String str2) {
        return new C0516K(str, str2, m2163e());
    }

    /* JADX INFO: renamed from: c */
    private static String m2162c(Class cls) {
        String simpleName = ((Class) AbstractC1209m.m5303o(cls, "type")).getSimpleName();
        return !simpleName.isEmpty() ? simpleName : cls.getName().substring(cls.getPackage().getName().length() + 1);
    }

    /* JADX INFO: renamed from: e */
    static long m2163e() {
        return f1933d.incrementAndGet();
    }

    /* JADX INFO: renamed from: d */
    public long m2164d() {
        return this.f1936c;
    }

    /* JADX INFO: renamed from: f */
    public String m2165f() {
        return this.f1934a + "<" + this.f1936c + ">";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m2165f());
        if (this.f1935b != null) {
            sb.append(": (");
            sb.append(this.f1935b);
            sb.append(')');
        }
        return sb.toString();
    }
}
