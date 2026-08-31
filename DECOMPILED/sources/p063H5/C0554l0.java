package p063H5;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import p122P3.AbstractC1199c;
import p122P3.AbstractC1203g;
import p122P3.AbstractC1205i;
import p122P3.AbstractC1209m;
import p122P3.AbstractC1217u;

/* JADX INFO: renamed from: H5.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0554l0 {

    /* JADX INFO: renamed from: d */
    private static final List f2097d = m2448f();

    /* JADX INFO: renamed from: e */
    public static final C0554l0 f2098e = b.OK.m2465d();

    /* JADX INFO: renamed from: f */
    public static final C0554l0 f2099f = b.CANCELLED.m2465d();

    /* JADX INFO: renamed from: g */
    public static final C0554l0 f2100g = b.UNKNOWN.m2465d();

    /* JADX INFO: renamed from: h */
    public static final C0554l0 f2101h = b.INVALID_ARGUMENT.m2465d();

    /* JADX INFO: renamed from: i */
    public static final C0554l0 f2102i = b.DEADLINE_EXCEEDED.m2465d();

    /* JADX INFO: renamed from: j */
    public static final C0554l0 f2103j = b.NOT_FOUND.m2465d();

    /* JADX INFO: renamed from: k */
    public static final C0554l0 f2104k = b.ALREADY_EXISTS.m2465d();

    /* JADX INFO: renamed from: l */
    public static final C0554l0 f2105l = b.PERMISSION_DENIED.m2465d();

    /* JADX INFO: renamed from: m */
    public static final C0554l0 f2106m = b.UNAUTHENTICATED.m2465d();

    /* JADX INFO: renamed from: n */
    public static final C0554l0 f2107n = b.RESOURCE_EXHAUSTED.m2465d();

    /* JADX INFO: renamed from: o */
    public static final C0554l0 f2108o = b.FAILED_PRECONDITION.m2465d();

    /* JADX INFO: renamed from: p */
    public static final C0554l0 f2109p = b.ABORTED.m2465d();

    /* JADX INFO: renamed from: q */
    public static final C0554l0 f2110q = b.OUT_OF_RANGE.m2465d();

    /* JADX INFO: renamed from: r */
    public static final C0554l0 f2111r = b.UNIMPLEMENTED.m2465d();

    /* JADX INFO: renamed from: s */
    public static final C0554l0 f2112s = b.INTERNAL.m2465d();

    /* JADX INFO: renamed from: t */
    public static final C0554l0 f2113t = b.UNAVAILABLE.m2465d();

    /* JADX INFO: renamed from: u */
    public static final C0554l0 f2114u = b.DATA_LOSS.m2465d();

    /* JADX INFO: renamed from: v */
    static final C0530Z.g f2115v;

    /* JADX INFO: renamed from: w */
    private static final C0530Z.j f2116w;

    /* JADX INFO: renamed from: x */
    static final C0530Z.g f2117x;

    /* JADX INFO: renamed from: a */
    private final b f2118a;

    /* JADX INFO: renamed from: b */
    private final String f2119b;

    /* JADX INFO: renamed from: c */
    private final Throwable f2120c;

    /* JADX INFO: renamed from: H5.l0$b */
    public enum b {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);


        /* JADX INFO: renamed from: a */
        private final int f2139a;

        /* JADX INFO: renamed from: b */
        private final byte[] f2140b;

        b(int i7) {
            this.f2139a = i7;
            this.f2140b = Integer.toString(i7).getBytes(AbstractC1199c.f4277a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public byte[] m2464j() {
            return this.f2140b;
        }

        /* JADX INFO: renamed from: d */
        public C0554l0 m2465d() {
            return (C0554l0) C0554l0.f2097d.get(this.f2139a);
        }

        /* JADX INFO: renamed from: h */
        public int m2466h() {
            return this.f2139a;
        }
    }

    /* JADX INFO: renamed from: H5.l0$c */
    private static final class c implements C0530Z.j {
        private c() {
        }

        @Override // p063H5.C0530Z.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C0554l0 mo2310b(byte[] bArr) {
            return C0554l0.m2451i(bArr);
        }

        @Override // p063H5.C0530Z.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] mo2309a(C0554l0 c0554l0) {
            return c0554l0.m2458m().m2464j();
        }
    }

    /* JADX INFO: renamed from: H5.l0$d */
    private static final class d implements C0530Z.j {

        /* JADX INFO: renamed from: a */
        private static final byte[] f2141a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

        private d() {
        }

        /* JADX INFO: renamed from: c */
        private static boolean m2469c(byte b7) {
            return b7 < 32 || b7 >= 126 || b7 == 37;
        }

        /* JADX INFO: renamed from: e */
        private static String m2470e(byte[] bArr) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
            int i7 = 0;
            while (i7 < bArr.length) {
                if (bArr[i7] == 37 && i7 + 2 < bArr.length) {
                    try {
                        byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i7 + 1, 2, AbstractC1199c.f4277a), 16));
                        i7 += 3;
                    } catch (NumberFormatException unused) {
                        byteBufferAllocate.put(bArr[i7]);
                        i7++;
                    }
                }
                byteBufferAllocate.put(bArr[i7]);
                i7++;
            }
            return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), AbstractC1199c.f4279c);
        }

        /* JADX INFO: renamed from: g */
        private static byte[] m2471g(byte[] bArr, int i7) {
            byte[] bArr2 = new byte[((bArr.length - i7) * 3) + i7];
            if (i7 != 0) {
                System.arraycopy(bArr, 0, bArr2, 0, i7);
            }
            int i8 = i7;
            while (i7 < bArr.length) {
                byte b7 = bArr[i7];
                if (m2469c(b7)) {
                    bArr2[i8] = 37;
                    byte[] bArr3 = f2141a;
                    bArr2[i8 + 1] = bArr3[(b7 >> 4) & 15];
                    bArr2[i8 + 2] = bArr3[b7 & 15];
                    i8 += 3;
                } else {
                    bArr2[i8] = b7;
                    i8++;
                }
                i7++;
            }
            return Arrays.copyOf(bArr2, i8);
        }

        @Override // p063H5.C0530Z.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String mo2310b(byte[] bArr) {
            for (int i7 = 0; i7 < bArr.length; i7++) {
                byte b7 = bArr[i7];
                if (b7 < 32 || b7 >= 126 || (b7 == 37 && i7 + 2 < bArr.length)) {
                    return m2470e(bArr);
                }
            }
            return new String(bArr, 0);
        }

        @Override // p063H5.C0530Z.j
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public byte[] mo2309a(String str) {
            byte[] bytes = str.getBytes(AbstractC1199c.f4279c);
            for (int i7 = 0; i7 < bytes.length; i7++) {
                if (m2469c(bytes[i7])) {
                    return m2471g(bytes, i7);
                }
            }
            return bytes;
        }
    }

    static {
        f2115v = C0530Z.g.m2298g("grpc-status", false, new c());
        d dVar = new d();
        f2116w = dVar;
        f2117x = C0530Z.g.m2298g("grpc-message", false, dVar);
    }

    private C0554l0(b bVar) {
        this(bVar, null, null);
    }

    /* JADX INFO: renamed from: f */
    private static List m2448f() {
        TreeMap treeMap = new TreeMap();
        for (b bVar : b.values()) {
            C0554l0 c0554l0 = (C0554l0) treeMap.put(Integer.valueOf(bVar.m2466h()), new C0554l0(bVar));
            if (c0554l0 != null) {
                throw new IllegalStateException("Code value duplication between " + c0554l0.m2458m().name() + " & " + bVar.name());
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    /* JADX INFO: renamed from: g */
    static String m2449g(C0554l0 c0554l0) {
        if (c0554l0.f2119b == null) {
            return c0554l0.f2118a.toString();
        }
        return c0554l0.f2118a + ": " + c0554l0.f2119b;
    }

    /* JADX INFO: renamed from: h */
    public static C0554l0 m2450h(int i7) {
        if (i7 >= 0) {
            List list = f2097d;
            if (i7 < list.size()) {
                return (C0554l0) list.get(i7);
            }
        }
        return f2100g.m2462q("Unknown code " + i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static C0554l0 m2451i(byte[] bArr) {
        return (bArr.length == 1 && bArr[0] == 48) ? f2098e : m2452j(bArr);
    }

    /* JADX INFO: renamed from: j */
    private static C0554l0 m2452j(byte[] bArr) {
        int i7;
        byte b7;
        int length = bArr.length;
        char c7 = 1;
        if (length != 1) {
            i7 = (length == 2 && (b7 = bArr[0]) >= 48 && b7 <= 57) ? (b7 - 48) * 10 : 0;
            return f2100g.m2462q("Unknown code " + new String(bArr, AbstractC1199c.f4277a));
        }
        c7 = 0;
        byte b8 = bArr[c7];
        if (b8 >= 48 && b8 <= 57) {
            int i8 = i7 + (b8 - 48);
            List list = f2097d;
            if (i8 < list.size()) {
                return (C0554l0) list.get(i8);
            }
        }
        return f2100g.m2462q("Unknown code " + new String(bArr, AbstractC1199c.f4277a));
    }

    /* JADX INFO: renamed from: k */
    public static C0554l0 m2453k(Throwable th) {
        for (Throwable cause = (Throwable) AbstractC1209m.m5303o(th, "t"); cause != null; cause = cause.getCause()) {
            if (cause instanceof C0556m0) {
                return ((C0556m0) cause).m2475a();
            }
            if (cause instanceof C0558n0) {
                return ((C0558n0) cause).m2476a();
            }
        }
        return f2100g.m2461p(th);
    }

    /* JADX INFO: renamed from: c */
    public C0556m0 m2454c() {
        return new C0556m0(this);
    }

    /* JADX INFO: renamed from: d */
    public C0558n0 m2455d() {
        return new C0558n0(this);
    }

    /* JADX INFO: renamed from: e */
    public C0554l0 m2456e(String str) {
        if (str == null) {
            return this;
        }
        if (this.f2119b == null) {
            return new C0554l0(this.f2118a, str, this.f2120c);
        }
        return new C0554l0(this.f2118a, this.f2119b + "\n" + str, this.f2120c);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: l */
    public Throwable m2457l() {
        return this.f2120c;
    }

    /* JADX INFO: renamed from: m */
    public b m2458m() {
        return this.f2118a;
    }

    /* JADX INFO: renamed from: n */
    public String m2459n() {
        return this.f2119b;
    }

    /* JADX INFO: renamed from: o */
    public boolean m2460o() {
        return b.OK == this.f2118a;
    }

    /* JADX INFO: renamed from: p */
    public C0554l0 m2461p(Throwable th) {
        return AbstractC1205i.m5282a(this.f2120c, th) ? this : new C0554l0(this.f2118a, this.f2119b, th);
    }

    /* JADX INFO: renamed from: q */
    public C0554l0 m2462q(String str) {
        return AbstractC1205i.m5282a(this.f2119b, str) ? this : new C0554l0(this.f2118a, str, this.f2120c);
    }

    public String toString() {
        AbstractC1203g.b bVarM5277d = AbstractC1203g.m5267b(this).m5277d("code", this.f2118a.name()).m5277d("description", this.f2119b);
        Throwable th = this.f2120c;
        Object objM5333e = th;
        if (th != null) {
            objM5333e = AbstractC1217u.m5333e(th);
        }
        return bVarM5277d.m5277d("cause", objM5333e).toString();
    }

    private C0554l0(b bVar, String str, Throwable th) {
        this.f2118a = (b) AbstractC1209m.m5303o(bVar, "code");
        this.f2119b = str;
        this.f2120c = th;
    }
}
