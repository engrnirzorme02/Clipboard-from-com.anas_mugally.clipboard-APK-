package p226d2;

/* JADX INFO: renamed from: d2.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5218g {

    /* JADX INFO: renamed from: d2.g$a */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC5218g m24130a() {
        return new C5213b(a.FATAL_ERROR, -1L);
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC5218g m24131d() {
        return new C5213b(a.INVALID_PAYLOAD, -1L);
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC5218g m24132e(long j7) {
        return new C5213b(a.OK, j7);
    }

    /* JADX INFO: renamed from: f */
    public static AbstractC5218g m24133f() {
        return new C5213b(a.TRANSIENT_ERROR, -1L);
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo24122b();

    /* JADX INFO: renamed from: c */
    public abstract a mo24123c();
}
