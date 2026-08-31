package p063H5;

import p122P3.AbstractC1203g;
import p122P3.AbstractC1205i;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: H5.F */
/* JADX INFO: loaded from: classes.dex */
public final class C0511F {

    /* JADX INFO: renamed from: a */
    public final String f1914a;

    /* JADX INFO: renamed from: b */
    public final b f1915b;

    /* JADX INFO: renamed from: c */
    public final long f1916c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0521P f1917d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0521P f1918e;

    /* JADX INFO: renamed from: H5.F$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private String f1919a;

        /* JADX INFO: renamed from: b */
        private b f1920b;

        /* JADX INFO: renamed from: c */
        private Long f1921c;

        /* JADX INFO: renamed from: d */
        private InterfaceC0521P f1922d;

        /* JADX INFO: renamed from: e */
        private InterfaceC0521P f1923e;

        /* JADX INFO: renamed from: a */
        public C0511F m2146a() {
            AbstractC1209m.m5303o(this.f1919a, "description");
            AbstractC1209m.m5303o(this.f1920b, "severity");
            AbstractC1209m.m5303o(this.f1921c, "timestampNanos");
            AbstractC1209m.m5309u(this.f1922d == null || this.f1923e == null, "at least one of channelRef and subchannelRef must be null");
            return new C0511F(this.f1919a, this.f1920b, this.f1921c.longValue(), this.f1922d, this.f1923e);
        }

        /* JADX INFO: renamed from: b */
        public a m2147b(String str) {
            this.f1919a = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m2148c(b bVar) {
            this.f1920b = bVar;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m2149d(InterfaceC0521P interfaceC0521P) {
            this.f1923e = interfaceC0521P;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m2150e(long j7) {
            this.f1921c = Long.valueOf(j7);
            return this;
        }
    }

    /* JADX INFO: renamed from: H5.F$b */
    public enum b {
        CT_UNKNOWN,
        CT_INFO,
        CT_WARNING,
        CT_ERROR
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0511F) {
            C0511F c0511f = (C0511F) obj;
            if (AbstractC1205i.m5282a(this.f1914a, c0511f.f1914a) && AbstractC1205i.m5282a(this.f1915b, c0511f.f1915b) && this.f1916c == c0511f.f1916c && AbstractC1205i.m5282a(this.f1917d, c0511f.f1917d) && AbstractC1205i.m5282a(this.f1918e, c0511f.f1918e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC1205i.m5283b(this.f1914a, this.f1915b, Long.valueOf(this.f1916c), this.f1917d, this.f1918e);
    }

    public String toString() {
        return AbstractC1203g.m5267b(this).m5277d("description", this.f1914a).m5277d("severity", this.f1915b).m5276c("timestampNanos", this.f1916c).m5277d("channelRef", this.f1917d).m5277d("subchannelRef", this.f1918e).toString();
    }

    private C0511F(String str, b bVar, long j7, InterfaceC0521P interfaceC0521P, InterfaceC0521P interfaceC0521P2) {
        this.f1914a = str;
        this.f1915b = (b) AbstractC1209m.m5303o(bVar, "severity");
        this.f1916c = j7;
        this.f1917d = interfaceC0521P;
        this.f1918e = interfaceC0521P2;
    }
}
