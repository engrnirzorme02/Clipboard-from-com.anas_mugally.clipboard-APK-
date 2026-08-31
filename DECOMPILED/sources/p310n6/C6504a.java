package p310n6;

import com.google.android.gms.internal.ads.zzbbn;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p302m6.AbstractC6406h;

/* JADX INFO: renamed from: n6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6504a implements Comparable {

    /* JADX INFO: renamed from: b */
    public static final a f24605b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final long f24606c = m27701k(0);

    /* JADX INFO: renamed from: d */
    private static final long f24607d = AbstractC6506c.m27720e(4611686018427387903L);

    /* JADX INFO: renamed from: e */
    private static final long f24608e = AbstractC6506c.m27720e(-4611686018427387903L);

    /* JADX INFO: renamed from: a */
    private final long f24609a;

    /* JADX INFO: renamed from: n6.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ C6504a(long j7) {
        this.f24609a = j7;
    }

    /* JADX INFO: renamed from: A */
    private static final long m27687A(long j7) {
        return j7 >> 1;
    }

    /* JADX INFO: renamed from: B */
    public static int m27688B(long j7) {
        return Long.hashCode(j7);
    }

    /* JADX INFO: renamed from: C */
    public static final boolean m27689C(long j7) {
        return !m27692I(j7);
    }

    /* JADX INFO: renamed from: D */
    private static final boolean m27690D(long j7) {
        return (((int) j7) & 1) == 1;
    }

    /* JADX INFO: renamed from: F */
    private static final boolean m27691F(long j7) {
        return (((int) j7) & 1) == 0;
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m27692I(long j7) {
        return j7 == f24607d || j7 == f24608e;
    }

    /* JADX INFO: renamed from: J */
    public static final boolean m27693J(long j7) {
        return j7 < 0;
    }

    /* JADX INFO: renamed from: K */
    public static final boolean m27694K(long j7) {
        return j7 > 0;
    }

    /* JADX INFO: renamed from: M */
    public static final long m27695M(long j7, EnumC6507d unit) {
        AbstractC6118n.m27187e(unit, "unit");
        if (j7 == f24607d) {
            return Long.MAX_VALUE;
        }
        if (j7 == f24608e) {
            return Long.MIN_VALUE;
        }
        return AbstractC6508e.m27727a(m27687A(j7), m27712z(j7), unit);
    }

    /* JADX INFO: renamed from: O */
    public static String m27696O(long j7) {
        if (j7 == 0) {
            return "0s";
        }
        if (j7 == f24607d) {
            return "Infinity";
        }
        if (j7 == f24608e) {
            return "-Infinity";
        }
        boolean zM27693J = m27693J(j7);
        StringBuilder sb = new StringBuilder();
        if (zM27693J) {
            sb.append('-');
        }
        long jM27703n = m27703n(j7);
        long jM27705p = m27705p(jM27703n);
        int iM27704o = m27704o(jM27703n);
        int iM27709w = m27709w(jM27703n);
        int iM27711y = m27711y(jM27703n);
        int iM27710x = m27710x(jM27703n);
        int i7 = 0;
        boolean z7 = jM27705p != 0;
        boolean z8 = iM27704o != 0;
        boolean z9 = iM27709w != 0;
        boolean z10 = (iM27711y == 0 && iM27710x == 0) ? false : true;
        if (z7) {
            sb.append(jM27705p);
            sb.append('d');
            i7 = 1;
        }
        if (z8 || (z7 && (z9 || z10))) {
            int i8 = i7 + 1;
            if (i7 > 0) {
                sb.append(' ');
            }
            sb.append(iM27704o);
            sb.append('h');
            i7 = i8;
        }
        if (z9 || (z10 && (z8 || z7))) {
            int i9 = i7 + 1;
            if (i7 > 0) {
                sb.append(' ');
            }
            sb.append(iM27709w);
            sb.append('m');
            i7 = i9;
        }
        if (z10) {
            int i10 = i7 + 1;
            if (i7 > 0) {
                sb.append(' ');
            }
            if (iM27711y != 0 || z7 || z8 || z9) {
                m27698c(j7, sb, iM27711y, iM27710x, 9, "s", false);
            } else if (iM27710x >= 1000000) {
                m27698c(j7, sb, iM27710x / 1000000, iM27710x % 1000000, 6, "ms", false);
            } else if (iM27710x >= 1000) {
                m27698c(j7, sb, iM27710x / zzbbn.zzq.zzf, iM27710x % zzbbn.zzq.zzf, 3, "us", false);
            } else {
                sb.append(iM27710x);
                sb.append("ns");
            }
            i7 = i10;
        }
        if (zM27693J && i7 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: P */
    public static final long m27697P(long j7) {
        return AbstractC6506c.m27719d(-m27687A(j7), ((int) j7) & 1);
    }

    /* JADX INFO: renamed from: c */
    private static final void m27698c(long j7, StringBuilder sb, int i7, int i8, int i9, String str, boolean z7) {
        sb.append(i7);
        if (i8 != 0) {
            sb.append('.');
            String strO0 = AbstractC6406h.m27616o0(String.valueOf(i8), i9, '0');
            int i10 = -1;
            int length = strO0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i11 = length - 1;
                    if (strO0.charAt(length) != '0') {
                        i10 = length;
                        break;
                    } else if (i11 < 0) {
                        break;
                    } else {
                        length = i11;
                    }
                }
            }
            int i12 = i10 + 1;
            if (z7 || i12 >= 3) {
                sb.append((CharSequence) strO0, 0, ((i10 + 3) / 3) * 3);
                AbstractC6118n.m27186d(sb, "append(...)");
            } else {
                sb.append((CharSequence) strO0, 0, i12);
                AbstractC6118n.m27186d(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ C6504a m27699d(long j7) {
        return new C6504a(j7);
    }

    /* JADX INFO: renamed from: j */
    public static int m27700j(long j7, long j8) {
        long j9 = j7 ^ j8;
        if (j9 < 0 || (((int) j9) & 1) == 0) {
            return AbstractC6118n.m27189g(j7, j8);
        }
        int i7 = (((int) j7) & 1) - (((int) j8) & 1);
        return m27693J(j7) ? -i7 : i7;
    }

    /* JADX INFO: renamed from: k */
    public static long m27701k(long j7) {
        if (!AbstractC6505b.m27715a()) {
            return j7;
        }
        if (m27691F(j7)) {
            long jM27687A = m27687A(j7);
            if (-4611686018426999999L <= jM27687A && jM27687A < 4611686018427000000L) {
                return j7;
            }
            throw new AssertionError(m27687A(j7) + " ns is out of nanoseconds range");
        }
        long jM27687A2 = m27687A(j7);
        if (-4611686018427387903L > jM27687A2 || jM27687A2 >= 4611686018427387904L) {
            throw new AssertionError(m27687A(j7) + " ms is out of milliseconds range");
        }
        long jM27687A3 = m27687A(j7);
        if (-4611686018426L > jM27687A3 || jM27687A3 >= 4611686018427L) {
            return j7;
        }
        throw new AssertionError(m27687A(j7) + " ms is denormalized");
    }

    /* JADX INFO: renamed from: m */
    public static boolean m27702m(long j7, Object obj) {
        return (obj instanceof C6504a) && j7 == ((C6504a) obj).m27713T();
    }

    /* JADX INFO: renamed from: n */
    public static final long m27703n(long j7) {
        return m27693J(j7) ? m27697P(j7) : j7;
    }

    /* JADX INFO: renamed from: o */
    public static final int m27704o(long j7) {
        if (m27692I(j7)) {
            return 0;
        }
        return (int) (m27706q(j7) % ((long) 24));
    }

    /* JADX INFO: renamed from: p */
    public static final long m27705p(long j7) {
        return m27695M(j7, EnumC6507d.DAYS);
    }

    /* JADX INFO: renamed from: q */
    public static final long m27706q(long j7) {
        return m27695M(j7, EnumC6507d.HOURS);
    }

    /* JADX INFO: renamed from: t */
    public static final long m27707t(long j7) {
        return m27695M(j7, EnumC6507d.MINUTES);
    }

    /* JADX INFO: renamed from: v */
    public static final long m27708v(long j7) {
        return m27695M(j7, EnumC6507d.SECONDS);
    }

    /* JADX INFO: renamed from: w */
    public static final int m27709w(long j7) {
        if (m27692I(j7)) {
            return 0;
        }
        return (int) (m27707t(j7) % ((long) 60));
    }

    /* JADX INFO: renamed from: x */
    public static final int m27710x(long j7) {
        if (m27692I(j7)) {
            return 0;
        }
        return (int) (m27690D(j7) ? AbstractC6506c.m27722g(m27687A(j7) % ((long) zzbbn.zzq.zzf)) : m27687A(j7) % ((long) 1000000000));
    }

    /* JADX INFO: renamed from: y */
    public static final int m27711y(long j7) {
        if (m27692I(j7)) {
            return 0;
        }
        return (int) (m27708v(j7) % ((long) 60));
    }

    /* JADX INFO: renamed from: z */
    private static final EnumC6507d m27712z(long j7) {
        return m27691F(j7) ? EnumC6507d.NANOSECONDS : EnumC6507d.MILLISECONDS;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ long m27713T() {
        return this.f24609a;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m27714h(((C6504a) obj).m27713T());
    }

    public boolean equals(Object obj) {
        return m27702m(this.f24609a, obj);
    }

    /* JADX INFO: renamed from: h */
    public int m27714h(long j7) {
        return m27700j(this.f24609a, j7);
    }

    public int hashCode() {
        return m27688B(this.f24609a);
    }

    public String toString() {
        return m27696O(this.f24609a);
    }
}
