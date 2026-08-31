package p168W0;

import androidx.appcompat.app.AbstractC2263x;
import androidx.work.C2896b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p112O0.AbstractC1097j;
import p112O0.C1089b;
import p112O0.EnumC1088a;
import p112O0.EnumC1101n;
import p112O0.EnumC1106s;
import p321p.InterfaceC6714a;

/* JADX INFO: renamed from: W0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1814p {

    /* JADX INFO: renamed from: s */
    private static final String f5890s = AbstractC1097j.m4846f("WorkSpec");

    /* JADX INFO: renamed from: t */
    public static final InterfaceC6714a f5891t = new a();

    /* JADX INFO: renamed from: a */
    public String f5892a;

    /* JADX INFO: renamed from: b */
    public EnumC1106s f5893b;

    /* JADX INFO: renamed from: c */
    public String f5894c;

    /* JADX INFO: renamed from: d */
    public String f5895d;

    /* JADX INFO: renamed from: e */
    public C2896b f5896e;

    /* JADX INFO: renamed from: f */
    public C2896b f5897f;

    /* JADX INFO: renamed from: g */
    public long f5898g;

    /* JADX INFO: renamed from: h */
    public long f5899h;

    /* JADX INFO: renamed from: i */
    public long f5900i;

    /* JADX INFO: renamed from: j */
    public C1089b f5901j;

    /* JADX INFO: renamed from: k */
    public int f5902k;

    /* JADX INFO: renamed from: l */
    public EnumC1088a f5903l;

    /* JADX INFO: renamed from: m */
    public long f5904m;

    /* JADX INFO: renamed from: n */
    public long f5905n;

    /* JADX INFO: renamed from: o */
    public long f5906o;

    /* JADX INFO: renamed from: p */
    public long f5907p;

    /* JADX INFO: renamed from: q */
    public boolean f5908q;

    /* JADX INFO: renamed from: r */
    public EnumC1101n f5909r;

    /* JADX INFO: renamed from: W0.p$a */
    class a implements InterfaceC6714a {
        a() {
        }

        @Override // p321p.InterfaceC6714a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List apply(List list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                return arrayList;
            }
            AbstractC2263x.m9328a(it.next());
            throw null;
        }
    }

    /* JADX INFO: renamed from: W0.p$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public String f5910a;

        /* JADX INFO: renamed from: b */
        public EnumC1106s f5911b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f5911b != bVar.f5911b) {
                return false;
            }
            return this.f5910a.equals(bVar.f5910a);
        }

        public int hashCode() {
            return (this.f5910a.hashCode() * 31) + this.f5911b.hashCode();
        }
    }

    public C1814p(String str, String str2) {
        this.f5893b = EnumC1106s.ENQUEUED;
        C2896b c2896b = C2896b.f11884c;
        this.f5896e = c2896b;
        this.f5897f = c2896b;
        this.f5901j = C1089b.f3923i;
        this.f5903l = EnumC1088a.EXPONENTIAL;
        this.f5904m = 30000L;
        this.f5907p = -1L;
        this.f5909r = EnumC1101n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f5892a = str;
        this.f5894c = str2;
    }

    /* JADX INFO: renamed from: a */
    public long m7532a() {
        if (m7534c()) {
            return this.f5905n + Math.min(18000000L, this.f5903l == EnumC1088a.LINEAR ? this.f5904m * ((long) this.f5902k) : (long) Math.scalb(this.f5904m, this.f5902k - 1));
        }
        if (!m7535d()) {
            long jCurrentTimeMillis = this.f5905n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f5898g;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j7 = this.f5905n;
        long j8 = j7 == 0 ? jCurrentTimeMillis2 + this.f5898g : j7;
        long j9 = this.f5900i;
        long j10 = this.f5899h;
        if (j9 != j10) {
            return j8 + j10 + (j7 == 0 ? j9 * (-1) : 0L);
        }
        return j8 + (j7 != 0 ? j10 : 0L);
    }

    /* JADX INFO: renamed from: b */
    public boolean m7533b() {
        return !C1089b.f3923i.equals(this.f5901j);
    }

    /* JADX INFO: renamed from: c */
    public boolean m7534c() {
        return this.f5893b == EnumC1106s.ENQUEUED && this.f5902k > 0;
    }

    /* JADX INFO: renamed from: d */
    public boolean m7535d() {
        return this.f5899h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1814p.class == obj.getClass()) {
            C1814p c1814p = (C1814p) obj;
            if (this.f5898g != c1814p.f5898g || this.f5899h != c1814p.f5899h || this.f5900i != c1814p.f5900i || this.f5902k != c1814p.f5902k || this.f5904m != c1814p.f5904m || this.f5905n != c1814p.f5905n || this.f5906o != c1814p.f5906o || this.f5907p != c1814p.f5907p || this.f5908q != c1814p.f5908q || !this.f5892a.equals(c1814p.f5892a) || this.f5893b != c1814p.f5893b || !this.f5894c.equals(c1814p.f5894c)) {
                return false;
            }
            String str = this.f5895d;
            if (str == null ? c1814p.f5895d != null : !str.equals(c1814p.f5895d)) {
                return false;
            }
            if (this.f5896e.equals(c1814p.f5896e) && this.f5897f.equals(c1814p.f5897f) && this.f5901j.equals(c1814p.f5901j) && this.f5903l == c1814p.f5903l && this.f5909r == c1814p.f5909r) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((this.f5892a.hashCode() * 31) + this.f5893b.hashCode()) * 31) + this.f5894c.hashCode()) * 31;
        String str = this.f5895d;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f5896e.hashCode()) * 31) + this.f5897f.hashCode()) * 31;
        long j7 = this.f5898g;
        int i7 = (iHashCode2 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f5899h;
        int i8 = (i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f5900i;
        int iHashCode3 = (((((((i8 + ((int) (j9 ^ (j9 >>> 32)))) * 31) + this.f5901j.hashCode()) * 31) + this.f5902k) * 31) + this.f5903l.hashCode()) * 31;
        long j10 = this.f5904m;
        int i9 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f5905n;
        int i10 = (i9 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f5906o;
        int i11 = (i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f5907p;
        return ((((i11 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + (this.f5908q ? 1 : 0)) * 31) + this.f5909r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f5892a + "}";
    }

    public C1814p(C1814p c1814p) {
        this.f5893b = EnumC1106s.ENQUEUED;
        C2896b c2896b = C2896b.f11884c;
        this.f5896e = c2896b;
        this.f5897f = c2896b;
        this.f5901j = C1089b.f3923i;
        this.f5903l = EnumC1088a.EXPONENTIAL;
        this.f5904m = 30000L;
        this.f5907p = -1L;
        this.f5909r = EnumC1101n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f5892a = c1814p.f5892a;
        this.f5894c = c1814p.f5894c;
        this.f5893b = c1814p.f5893b;
        this.f5895d = c1814p.f5895d;
        this.f5896e = new C2896b(c1814p.f5896e);
        this.f5897f = new C2896b(c1814p.f5897f);
        this.f5898g = c1814p.f5898g;
        this.f5899h = c1814p.f5899h;
        this.f5900i = c1814p.f5900i;
        this.f5901j = new C1089b(c1814p.f5901j);
        this.f5902k = c1814p.f5902k;
        this.f5903l = c1814p.f5903l;
        this.f5904m = c1814p.f5904m;
        this.f5905n = c1814p.f5905n;
        this.f5906o = c1814p.f5906o;
        this.f5907p = c1814p.f5907p;
        this.f5908q = c1814p.f5908q;
        this.f5909r = c1814p.f5909r;
    }
}
