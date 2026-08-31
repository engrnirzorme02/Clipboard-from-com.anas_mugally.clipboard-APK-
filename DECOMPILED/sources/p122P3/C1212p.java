package p122P3;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: P3.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C1212p {

    /* JADX INFO: renamed from: a */
    private final AbstractC1218v f4300a = AbstractC1218v.m5335b();

    /* JADX INFO: renamed from: b */
    private boolean f4301b;

    /* JADX INFO: renamed from: c */
    private long f4302c;

    /* JADX INFO: renamed from: d */
    private long f4303d;

    /* JADX INFO: renamed from: P3.p$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f4304a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f4304a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4304a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4304a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4304a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4304a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4304a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4304a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    C1212p() {
    }

    /* JADX INFO: renamed from: a */
    private static String m5316a(TimeUnit timeUnit) {
        switch (a.f4304a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "min";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: b */
    private static TimeUnit m5317b(long j7) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j7, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(j7, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(j7, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(j7, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(j7, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        return timeUnit7.convert(j7, timeUnit2) > 0 ? timeUnit7 : timeUnit2;
    }

    /* JADX INFO: renamed from: c */
    public static C1212p m5318c() {
        return new C1212p();
    }

    /* JADX INFO: renamed from: e */
    private long m5319e() {
        return this.f4301b ? (this.f4300a.mo5336a() - this.f4303d) + this.f4302c : this.f4302c;
    }

    /* JADX INFO: renamed from: d */
    public long m5320d(TimeUnit timeUnit) {
        return timeUnit.convert(m5319e(), TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: f */
    public C1212p m5321f() {
        this.f4302c = 0L;
        this.f4301b = false;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C1212p m5322g() {
        AbstractC1209m.m5309u(!this.f4301b, "This stopwatch is already running.");
        this.f4301b = true;
        this.f4303d = this.f4300a.mo5336a();
        return this;
    }

    public String toString() {
        long jM5319e = m5319e();
        TimeUnit timeUnitM5317b = m5317b(jM5319e);
        return AbstractC1208l.m5286a(jM5319e / TimeUnit.NANOSECONDS.convert(1L, timeUnitM5317b)) + " " + m5316a(timeUnitM5317b);
    }
}
