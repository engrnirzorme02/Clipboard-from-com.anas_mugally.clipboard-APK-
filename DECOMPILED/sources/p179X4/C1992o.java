package p179X4;

import com.google.firebase.firestore.C4928n;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLHandshakeException;
import p063H5.C0554l0;
import p186Y4.C2037e;

/* JADX INFO: renamed from: X4.o */
/* JADX INFO: loaded from: classes.dex */
public class C1992o {

    /* JADX INFO: renamed from: d */
    static final Set f6620d = new HashSet(Arrays.asList("date", "x-google-backends", "x-google-netmon-label", "x-google-service", "x-google-gfe-request-trace"));

    /* JADX INFO: renamed from: a */
    protected final C1964K f6621a;

    /* JADX INFO: renamed from: b */
    private final C2037e f6622b;

    /* JADX INFO: renamed from: c */
    private final C1998u f6623c;

    /* JADX INFO: renamed from: X4.o$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f6624a;

        static {
            int[] iArr = new int[C4928n.a.values().length];
            f6624a = iArr;
            try {
                iArr[C4928n.a.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6624a[C4928n.a.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6624a[C4928n.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6624a[C4928n.a.DEADLINE_EXCEEDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6624a[C4928n.a.RESOURCE_EXHAUSTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6624a[C4928n.a.INTERNAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6624a[C4928n.a.UNAVAILABLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6624a[C4928n.a.UNAUTHENTICATED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6624a[C4928n.a.INVALID_ARGUMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6624a[C4928n.a.NOT_FOUND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6624a[C4928n.a.ALREADY_EXISTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6624a[C4928n.a.PERMISSION_DENIED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f6624a[C4928n.a.FAILED_PRECONDITION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f6624a[C4928n.a.ABORTED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f6624a[C4928n.a.OUT_OF_RANGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f6624a[C4928n.a.UNIMPLEMENTED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f6624a[C4928n.a.DATA_LOSS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    C1992o(C2037e c2037e, C1964K c1964k, C1998u c1998u) {
        this.f6622b = c2037e;
        this.f6621a = c1964k;
        this.f6623c = c1998u;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m8347c(C0554l0 c0554l0) {
        c0554l0.m2458m();
        Throwable thM2457l = c0554l0.m2457l();
        if (!(thM2457l instanceof SSLHandshakeException)) {
            return false;
        }
        thM2457l.getMessage().contains("no ciphers available");
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m8348d(C0554l0 c0554l0) {
        return m8349e(C4928n.a.m22174h(c0554l0.m2458m().m2466h()));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m8349e(C4928n.a aVar) {
        switch (a.f6624a[aVar.ordinal()]) {
            case 1:
                throw new IllegalArgumentException("Treated status OK as error");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return true;
            default:
                throw new IllegalArgumentException("Unknown gRPC status code: " + aVar);
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m8350f(C0554l0 c0554l0) {
        return m8348d(c0554l0) && !c0554l0.m2458m().equals(C0554l0.b.ABORTED);
    }

    /* JADX INFO: renamed from: a */
    C1976X m8351a(C1976X.a aVar) {
        return new C1976X(this.f6623c, this.f6622b, this.f6621a, aVar);
    }

    /* JADX INFO: renamed from: b */
    C1977Y m8352b(C1977Y.a aVar) {
        return new C1977Y(this.f6623c, this.f6622b, this.f6621a, aVar);
    }
}
