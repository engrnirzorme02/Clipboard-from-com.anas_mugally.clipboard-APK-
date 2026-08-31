package p063H5;

import java.nio.charset.Charset;
import p136R3.AbstractC1331a;

/* JADX INFO: renamed from: H5.M */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0518M {

    /* JADX INFO: renamed from: a */
    public static final Charset f1937a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b */
    public static final AbstractC1331a f1938b = C0530Z.f1981f;

    /* JADX INFO: renamed from: H5.M$a */
    public interface a extends C0530Z.j {
    }

    /* JADX INFO: renamed from: a */
    public static int m2167a(C0530Z c0530z) {
        return c0530z.m2284h();
    }

    /* JADX INFO: renamed from: b */
    public static C0530Z.g m2168b(String str, a aVar) {
        boolean z7 = false;
        if (str != null && !str.isEmpty() && str.charAt(0) == ':') {
            z7 = true;
        }
        return C0530Z.g.m2298g(str, z7, aVar);
    }

    /* JADX INFO: renamed from: c */
    public static C0530Z m2169c(byte[]... bArr) {
        return new C0530Z(bArr);
    }

    /* JADX INFO: renamed from: d */
    public static byte[][] m2170d(C0530Z c0530z) {
        return c0530z.m2288q();
    }
}
