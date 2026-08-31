package p143S3;

import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.internal.ads.zzbbn;
import java.math.RoundingMode;
import p122P3.AbstractC1209m;
import p150T3.AbstractC1470a;

/* JADX INFO: renamed from: S3.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1413a {

    /* JADX INFO: renamed from: a */
    static final byte[] f4915a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* JADX INFO: renamed from: b */
    static final int[] f4916b = {1, 10, 100, zzbbn.zzq.zzf, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: c */
    static final int[] f4917c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, C3553a.e.API_PRIORITY_OTHER};

    /* JADX INFO: renamed from: d */
    private static final int[] f4918d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* JADX INFO: renamed from: e */
    static int[] f4919e = {C3553a.e.API_PRIORITY_OTHER, C3553a.e.API_PRIORITY_OTHER, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* JADX INFO: renamed from: S3.a$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f4920a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f4920a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4920a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4920a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4920a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4920a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4920a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4920a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4920a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: a */
    public static int m6002a(int i7, int i8, RoundingMode roundingMode) {
        AbstractC1209m.m5302n(roundingMode);
        if (i8 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i9 = i7 / i8;
        int i10 = i7 - (i8 * i9);
        if (i10 == 0) {
            return i9;
        }
        int i11 = ((i7 ^ i8) >> 31) | 1;
        switch (a.f4920a[roundingMode.ordinal()]) {
            case 1:
                AbstractC1415c.m6010c(i10 == 0);
                return i9;
            case 2:
                return i9;
            case 3:
                if (i11 >= 0) {
                    return i9;
                }
                return i9 + i11;
            case 4:
                return i9 + i11;
            case 5:
                if (i11 <= 0) {
                    return i9;
                }
                return i9 + i11;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i10);
                int iAbs2 = iAbs - (Math.abs(i8) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i9 & 1) != 0))) {
                            return i9;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i9;
                }
                return i9 + i11;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m6003b(int i7) {
        return (i7 > 0) & ((i7 & (i7 + (-1))) == 0);
    }

    /* JADX INFO: renamed from: c */
    static int m6004c(int i7, int i8) {
        return (~(~(i7 - i8))) >>> 31;
    }

    /* JADX INFO: renamed from: d */
    public static int m6005d(int i7, RoundingMode roundingMode) {
        AbstractC1415c.m6009b("x", i7);
        switch (a.f4920a[roundingMode.ordinal()]) {
            case 1:
                AbstractC1415c.m6010c(m6003b(i7));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i7 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i7);
                return (31 - iNumberOfLeadingZeros) + m6004c((-1257966797) >>> iNumberOfLeadingZeros, i7);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i7);
    }

    /* JADX INFO: renamed from: e */
    public static int m6006e(int i7, int i8) {
        return AbstractC1470a.m6131a(((long) i7) * ((long) i8));
    }
}
