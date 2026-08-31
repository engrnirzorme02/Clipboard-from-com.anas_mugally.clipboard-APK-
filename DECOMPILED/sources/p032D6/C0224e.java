package p032D6;

import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p016B6.InterfaceC0096d;
import p152T5.AbstractC1631j;
import p238e6.InterfaceC5371p;

/* JADX INFO: renamed from: D6.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0224e {

    /* JADX INFO: renamed from: e */
    private static final a f938e = new a(null);

    /* JADX INFO: renamed from: f */
    private static final long[] f939f = new long[0];

    /* JADX INFO: renamed from: a */
    private final InterfaceC0096d f940a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC5371p f941b;

    /* JADX INFO: renamed from: c */
    private long f942c;

    /* JADX INFO: renamed from: d */
    private final long[] f943d;

    /* JADX INFO: renamed from: D6.e$a */
    private static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    public C0224e(InterfaceC0096d descriptor, InterfaceC5371p readIfAbsent) {
        AbstractC6118n.m27187e(descriptor, "descriptor");
        AbstractC6118n.m27187e(readIfAbsent, "readIfAbsent");
        this.f940a = descriptor;
        this.f941b = readIfAbsent;
        int iMo375f = descriptor.mo375f();
        if (iMo375f <= 64) {
            this.f942c = iMo375f != 64 ? (-1) << iMo375f : 0L;
            this.f943d = f939f;
        } else {
            this.f942c = 0L;
            this.f943d = m1129e(iMo375f);
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m1127b(int i7) {
        int i8 = (i7 >>> 6) - 1;
        long[] jArr = this.f943d;
        jArr[i8] = jArr[i8] | (1 << (i7 & 63));
    }

    /* JADX INFO: renamed from: c */
    private final int m1128c() {
        int length = this.f943d.length;
        int i7 = 0;
        while (i7 < length) {
            int i8 = i7 + 1;
            int i9 = i8 * 64;
            long j7 = this.f943d[i7];
            while (j7 != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j7);
                j7 |= 1 << iNumberOfTrailingZeros;
                int i10 = iNumberOfTrailingZeros + i9;
                if (((Boolean) this.f941b.invoke(this.f940a, Integer.valueOf(i10))).booleanValue()) {
                    this.f943d[i7] = j7;
                    return i10;
                }
            }
            this.f943d[i7] = j7;
            i7 = i8;
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    private final long[] m1129e(int i7) {
        long[] jArr = new long[(i7 - 1) >>> 6];
        if ((i7 & 63) != 0) {
            jArr[AbstractC1631j.m6748u(jArr)] = (-1) << i7;
        }
        return jArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m1130a(int i7) {
        if (i7 < 64) {
            this.f942c |= 1 << i7;
        } else {
            m1127b(i7);
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m1131d() {
        int iNumberOfTrailingZeros;
        int iMo375f = this.f940a.mo375f();
        do {
            long j7 = this.f942c;
            if (j7 == -1) {
                if (iMo375f > 64) {
                    return m1128c();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j7);
            this.f942c |= 1 << iNumberOfTrailingZeros;
        } while (!((Boolean) this.f941b.invoke(this.f940a, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }
}
