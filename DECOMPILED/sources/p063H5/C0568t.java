package p063H5;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: H5.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0568t implements Comparable {

    /* JADX INFO: renamed from: d */
    private static final b f2192d = new b();

    /* JADX INFO: renamed from: e */
    private static final long f2193e;

    /* JADX INFO: renamed from: f */
    private static final long f2194f;

    /* JADX INFO: renamed from: r */
    private static final long f2195r;

    /* JADX INFO: renamed from: a */
    private final c f2196a;

    /* JADX INFO: renamed from: b */
    private final long f2197b;

    /* JADX INFO: renamed from: c */
    private volatile boolean f2198c;

    /* JADX INFO: renamed from: H5.t$b */
    private static class b extends c {
        private b() {
        }

        @Override // p063H5.C0568t.c
        /* JADX INFO: renamed from: a */
        public long mo2525a() {
            return System.nanoTime();
        }
    }

    /* JADX INFO: renamed from: H5.t$c */
    public static abstract class c {
        /* JADX INFO: renamed from: a */
        public abstract long mo2525a();
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f2193e = nanos;
        f2194f = -nanos;
        f2195r = TimeUnit.SECONDS.toNanos(1L);
    }

    private C0568t(c cVar, long j7, boolean z7) {
        this(cVar, cVar.mo2525a(), j7, z7);
    }

    /* JADX INFO: renamed from: c */
    public static C0568t m2515c(long j7, TimeUnit timeUnit) {
        return m2516d(j7, timeUnit, f2192d);
    }

    /* JADX INFO: renamed from: d */
    public static C0568t m2516d(long j7, TimeUnit timeUnit, c cVar) {
        m2517h(timeUnit, "units");
        return new C0568t(cVar, timeUnit.toNanos(j7), true);
    }

    /* JADX INFO: renamed from: h */
    private static Object m2517h(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* JADX INFO: renamed from: j */
    private void m2518j(C0568t c0568t) {
        if (this.f2196a == c0568t.f2196a) {
            return;
        }
        throw new AssertionError("Tickers (" + this.f2196a + " and " + c0568t.f2196a + ") don't match. Custom Ticker should only be used in tests!");
    }

    /* JADX INFO: renamed from: m */
    public static c m2519m() {
        return f2192d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0568t)) {
            return false;
        }
        C0568t c0568t = (C0568t) obj;
        c cVar = this.f2196a;
        if (cVar != null ? cVar == c0568t.f2196a : c0568t.f2196a == null) {
            return this.f2197b == c0568t.f2197b;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.asList(this.f2196a, Long.valueOf(this.f2197b)).hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0568t c0568t) {
        m2518j(c0568t);
        long j7 = this.f2197b - c0568t.f2197b;
        if (j7 < 0) {
            return -1;
        }
        return j7 > 0 ? 1 : 0;
    }

    /* JADX INFO: renamed from: n */
    public boolean m2521n(C0568t c0568t) {
        m2518j(c0568t);
        return this.f2197b - c0568t.f2197b < 0;
    }

    /* JADX INFO: renamed from: o */
    public boolean m2522o() {
        if (!this.f2198c) {
            if (this.f2197b - this.f2196a.mo2525a() > 0) {
                return false;
            }
            this.f2198c = true;
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public C0568t m2523p(C0568t c0568t) {
        m2518j(c0568t);
        return m2521n(c0568t) ? this : c0568t;
    }

    /* JADX INFO: renamed from: q */
    public long m2524q(TimeUnit timeUnit) {
        long jMo2525a = this.f2196a.mo2525a();
        if (!this.f2198c && this.f2197b - jMo2525a <= 0) {
            this.f2198c = true;
        }
        return timeUnit.convert(this.f2197b - jMo2525a, TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long jM2524q = m2524q(TimeUnit.NANOSECONDS);
        long jAbs = Math.abs(jM2524q);
        long j7 = f2195r;
        long j8 = jAbs / j7;
        long jAbs2 = Math.abs(jM2524q) % j7;
        StringBuilder sb = new StringBuilder();
        if (jM2524q < 0) {
            sb.append('-');
        }
        sb.append(j8);
        if (jAbs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        if (this.f2196a != f2192d) {
            sb.append(" (ticker=" + this.f2196a + ")");
        }
        return sb.toString();
    }

    private C0568t(c cVar, long j7, long j8, boolean z7) {
        this.f2196a = cVar;
        long jMin = Math.min(f2193e, Math.max(f2194f, j8));
        this.f2197b = j7 + jMin;
        this.f2198c = z7 && jMin <= 0;
    }
}
