package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j */
/* JADX INFO: loaded from: classes.dex */
final class C2520j implements InterfaceC2525l0 {

    /* JADX INFO: renamed from: a */
    private final AbstractC2518i f9588a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f9589a;

        static {
            int[] iArr = new int[AbstractC2523k0.b.values().length];
            f9589a = iArr;
            try {
                iArr[AbstractC2523k0.b.f9608u.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9589a[AbstractC2523k0.b.f9607t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9589a[AbstractC2523k0.b.f9605r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9589a[AbstractC2523k0.b.f9596B.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9589a[AbstractC2523k0.b.f9598D.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9589a[AbstractC2523k0.b.f9613z.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9589a[AbstractC2523k0.b.f9606s.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9589a[AbstractC2523k0.b.f9603e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9589a[AbstractC2523k0.b.f9597C.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9589a[AbstractC2523k0.b.f9599E.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9589a[AbstractC2523k0.b.f9604f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9589a[AbstractC2523k0.b.f9609v.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C2520j(AbstractC2518i abstractC2518i) {
        AbstractC2518i abstractC2518i2 = (AbstractC2518i) AbstractC2534u.m11638b(abstractC2518i, "output");
        this.f9588a = abstractC2518i2;
        abstractC2518i2.f9557a = this;
    }

    /* JADX INFO: renamed from: P */
    public static C2520j m11462P(AbstractC2518i abstractC2518i) {
        C2520j c2520j = abstractC2518i.f9557a;
        return c2520j != null ? c2520j : new C2520j(abstractC2518i);
    }

    /* JADX INFO: renamed from: Q */
    private void m11463Q(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9588a.mo11362a0(i7, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
            return;
        }
        this.f9588a.mo11353M0(i7, 2);
        int iM11318d = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM11318d += AbstractC2518i.m11318d(((Boolean) list.get(i9)).booleanValue());
        }
        this.f9588a.mo11355O0(iM11318d);
        while (i8 < list.size()) {
            this.f9588a.m11363b0(((Boolean) list.get(i8)).booleanValue());
            i8++;
        }
    }

    /* JADX INFO: renamed from: R */
    private void m11464R(int i7, boolean z7, Object obj, C2479C.a aVar) {
        this.f9588a.mo11353M0(i7, 2);
        this.f9588a.mo11355O0(C2479C.m10864b(aVar, Boolean.valueOf(z7), obj));
        C2479C.m10866e(this.f9588a, aVar, Boolean.valueOf(z7), obj);
    }

    /* JADX INFO: renamed from: S */
    private void m11465S(int i7, C2479C.a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            iArr[i8] = ((Integer) it.next()).intValue();
            i8++;
        }
        Arrays.sort(iArr);
        for (int i9 = 0; i9 < size; i9++) {
            int i10 = iArr[i9];
            Object obj = map.get(Integer.valueOf(i10));
            this.f9588a.mo11353M0(i7, 2);
            this.f9588a.mo11355O0(C2479C.m10864b(aVar, Integer.valueOf(i10), obj));
            C2479C.m10866e(this.f9588a, aVar, Integer.valueOf(i10), obj);
        }
    }

    /* JADX INFO: renamed from: T */
    private void m11466T(int i7, C2479C.a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            jArr[i8] = ((Long) it.next()).longValue();
            i8++;
        }
        Arrays.sort(jArr);
        for (int i9 = 0; i9 < size; i9++) {
            long j7 = jArr[i9];
            Object obj = map.get(Long.valueOf(j7));
            this.f9588a.mo11353M0(i7, 2);
            this.f9588a.mo11355O0(C2479C.m10864b(aVar, Long.valueOf(j7), obj));
            C2479C.m10866e(this.f9588a, aVar, Long.valueOf(j7), obj);
        }
    }

    /* JADX INFO: renamed from: U */
    private void m11467U(int i7, C2479C.a aVar, Map map) {
        switch (a.f9589a[aVar.f9433a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    m11464R(i7, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    m11464R(i7, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                m11465S(i7, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                m11466T(i7, aVar, map);
                return;
            case 12:
                m11468V(i7, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f9433a);
        }
    }

    /* JADX INFO: renamed from: V */
    private void m11468V(int i7, C2479C.a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            strArr[i8] = (String) it.next();
            i8++;
        }
        Arrays.sort(strArr);
        for (int i9 = 0; i9 < size; i9++) {
            String str = strArr[i9];
            Object obj = map.get(str);
            this.f9588a.mo11353M0(i7, 2);
            this.f9588a.mo11355O0(C2479C.m10864b(aVar, str, obj));
            C2479C.m10866e(this.f9588a, aVar, str, obj);
        }
    }

    /* JADX INFO: renamed from: W */
    private void m11469W(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9588a.m11368g0(i7, ((Double) list.get(i8)).doubleValue());
                i8++;
            }
            return;
        }
        this.f9588a.mo11353M0(i7, 2);
        int iM11323i = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM11323i += AbstractC2518i.m11323i(((Double) list.get(i9)).doubleValue());
        }
        this.f9588a.mo11355O0(iM11323i);
        while (i8 < list.size()) {
            this.f9588a.m11369h0(((Double) list.get(i8)).doubleValue());
            i8++;
        }
    }

    /* JADX INFO: renamed from: X */
    private void m11470X(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9588a.m11370i0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f9588a.mo11353M0(i7, 2);
        int iM11325k = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM11325k += AbstractC2518i.m11325k(((Integer) list.get(i9)).intValue());
        }
        this.f9588a.mo11355O0(iM11325k);
        while (i8 < list.size()) {
            this.f9588a.m11371j0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    /* JADX INFO: renamed from: Y */
    private void m11471Y(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9588a.mo11372k0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f9588a.mo11353M0(i7, 2);
        int iM11327m = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM11327m += AbstractC2518i.m11327m(((Integer) list.get(i9)).intValue());
        }
        this.f9588a.mo11355O0(iM11327m);
        while (i8 < list.size()) {
            this.f9588a.mo11373l0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    /* JADX INFO: renamed from: Z */
    private void m11472Z(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9588a.mo11374m0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f9588a.mo11353M0(i7, 2);
        int iM11329o = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM11329o += AbstractC2518i.m11329o(((Long) list.get(i9)).longValue());
        }
        this.f9588a.mo11355O0(iM11329o);
        while (i8 < list.size()) {
            this.f9588a.mo11375n0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    /* JADX INFO: renamed from: a0 */
    private void m11473a0(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9588a.m11376o0(i7, ((Float) list.get(i8)).floatValue());
                i8++;
            }
            return;
        }
        this.f9588a.mo11353M0(i7, 2);
        int iM11331q = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM11331q += AbstractC2518i.m11331q(((Float) list.get(i9)).floatValue());
        }
        this.f9588a.mo11355O0(iM11331q);
        while (i8 < list.size()) {
            this.f9588a.m11377p0(((Float) list.get(i8)).floatValue());
            i8++;
        }
    }

    /* JADX INFO: renamed from: b0 */
    private void m11474b0(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9588a.mo11382u0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f9588a.mo11353M0(i7, 2);
        int iM11336v = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM11336v += AbstractC2518i.m11336v(((Integer) list.get(i9)).intValue());
        }
        this.f9588a.mo11355O0(iM11336v);
        while (i8 < list.size()) {
            this.f9588a.mo11383v0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    /* JADX INFO: renamed from: c0 */
    private void m11475c0(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9588a.m11384w0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f9588a.mo11353M0(i7, 2);
        int iM11338x = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM11338x += AbstractC2518i.m11338x(((Long) list.get(i9)).longValue());
        }
        this.f9588a.mo11355O0(iM11338x);
        while (i8 < list.size()) {
            this.f9588a.m11385x0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    /* JADX INFO: renamed from: d0 */
    private void m11476d0(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9588a.m11343C0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f9588a.mo11353M0(i7, 2);
        int iM11299F = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM11299F += AbstractC2518i.m11299F(((Integer) list.get(i9)).intValue());
        }
        this.f9588a.mo11355O0(iM11299F);
        while (i8 < list.size()) {
            this.f9588a.m11344D0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    /* JADX INFO: renamed from: e0 */
    private void m11477e0(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9588a.m11345E0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f9588a.mo11353M0(i7, 2);
        int iM11301H = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM11301H += AbstractC2518i.m11301H(((Long) list.get(i9)).longValue());
        }
        this.f9588a.mo11355O0(iM11301H);
        while (i8 < list.size()) {
            this.f9588a.m11346F0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    /* JADX INFO: renamed from: g0 */
    private void m11478g0(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9588a.m11349I0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f9588a.mo11353M0(i7, 2);
        int iM11305L = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM11305L += AbstractC2518i.m11305L(((Long) list.get(i9)).longValue());
        }
        this.f9588a.mo11355O0(iM11305L);
        while (i8 < list.size()) {
            this.f9588a.m11350J0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    /* JADX INFO: renamed from: i0 */
    private void m11479i0(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9588a.mo11356P0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f9588a.mo11353M0(i7, 2);
        int iM11312S = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM11312S += AbstractC2518i.m11312S(((Long) list.get(i9)).longValue());
        }
        this.f9588a.mo11355O0(iM11312S);
        while (i8 < list.size()) {
            this.f9588a.mo11357Q0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: A */
    public void mo11480A(int i7, float f7) {
        this.f9588a.m11376o0(i7, f7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: B */
    public void mo11481B(int i7) {
        this.f9588a.mo11353M0(i7, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: C */
    public void mo11482C(int i7, List list, boolean z7) {
        m11501f0(i7, list, z7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: D */
    public void mo11483D(int i7, int i8) {
        this.f9588a.m11370i0(i7, i8);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: E */
    public void mo11484E(int i7, List list, boolean z7) {
        m11475c0(i7, list, z7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: F */
    public void mo11485F(int i7, List list, boolean z7) {
        m11470X(i7, list, z7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: G */
    public void mo11486G(int i7, List list, boolean z7) {
        m11469W(i7, list, z7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: H */
    public void mo11487H(int i7, int i8) {
        this.f9588a.m11347G0(i7, i8);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: I */
    public void mo11488I(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f9588a.mo11366e0(i7, (AbstractC2512f) list.get(i8));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: J */
    public void mo11489J(int i7, List list, InterfaceC2500Y interfaceC2500Y) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            mo11492M(i7, list.get(i8), interfaceC2500Y);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: K */
    public void mo11490K(int i7, List list, InterfaceC2500Y interfaceC2500Y) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            mo11494O(i7, list.get(i8), interfaceC2500Y);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: L */
    public void mo11491L(int i7, AbstractC2512f abstractC2512f) {
        this.f9588a.mo11366e0(i7, abstractC2512f);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: M */
    public void mo11492M(int i7, Object obj, InterfaceC2500Y interfaceC2500Y) {
        this.f9588a.mo11386y0(i7, (InterfaceC2486J) obj, interfaceC2500Y);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: N */
    public void mo11493N(int i7, C2479C.a aVar, Map map) {
        if (this.f9588a.m11360X()) {
            m11467U(i7, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f9588a.mo11353M0(i7, 2);
            this.f9588a.mo11355O0(C2479C.m10864b(aVar, entry.getKey(), entry.getValue()));
            C2479C.m10866e(this.f9588a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: O */
    public void mo11494O(int i7, Object obj, InterfaceC2500Y interfaceC2500Y) {
        this.f9588a.m11379r0(i7, (InterfaceC2486J) obj, interfaceC2500Y);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: a */
    public void mo11495a(int i7, List list, boolean z7) {
        m11473a0(i7, list, z7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: b */
    public void mo11496b(int i7, int i8) {
        this.f9588a.mo11354N0(i7, i8);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: c */
    public final void mo11497c(int i7, Object obj) {
        if (obj instanceof AbstractC2512f) {
            this.f9588a.mo11342B0(i7, (AbstractC2512f) obj);
        } else {
            this.f9588a.mo11341A0(i7, (InterfaceC2486J) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: d */
    public void mo11498d(int i7, int i8) {
        this.f9588a.mo11372k0(i7, i8);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: e */
    public void mo11499e(int i7, double d7) {
        this.f9588a.m11368g0(i7, d7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: f */
    public void mo11500f(int i7, List list, boolean z7) {
        m11477e0(i7, list, z7);
    }

    /* JADX INFO: renamed from: f0 */
    public void m11501f0(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9588a.m11347G0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f9588a.mo11353M0(i7, 2);
        int iM11303J = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM11303J += AbstractC2518i.m11303J(((Integer) list.get(i9)).intValue());
        }
        this.f9588a.mo11355O0(iM11303J);
        while (i8 < list.size()) {
            this.f9588a.m11348H0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: g */
    public void mo11502g(int i7, List list, boolean z7) {
        m11479i0(i7, list, z7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: h */
    public void mo11503h(int i7, long j7) {
        this.f9588a.mo11374m0(i7, j7);
    }

    /* JADX INFO: renamed from: h0 */
    public void m11504h0(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9588a.mo11354N0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f9588a.mo11353M0(i7, 2);
        int iM11310Q = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM11310Q += AbstractC2518i.m11310Q(((Integer) list.get(i9)).intValue());
        }
        this.f9588a.mo11355O0(iM11310Q);
        while (i8 < list.size()) {
            this.f9588a.mo11355O0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: i */
    public InterfaceC2525l0.a mo11505i() {
        return InterfaceC2525l0.a.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: j */
    public void mo11506j(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f9588a.mo11351K0(i7, (String) list.get(i8));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: k */
    public void mo11507k(int i7, String str) {
        this.f9588a.mo11351K0(i7, str);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: l */
    public void mo11508l(int i7, long j7) {
        this.f9588a.mo11356P0(i7, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: m */
    public void mo11509m(int i7, List list, boolean z7) {
        m11474b0(i7, list, z7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: n */
    public void mo11510n(int i7, long j7) {
        this.f9588a.m11384w0(i7, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: o */
    public void mo11511o(int i7, boolean z7) {
        this.f9588a.mo11362a0(i7, z7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: p */
    public void mo11512p(int i7, int i8) {
        this.f9588a.m11343C0(i7, i8);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: q */
    public void mo11513q(int i7) {
        this.f9588a.mo11353M0(i7, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: r */
    public void mo11514r(int i7, int i8) {
        this.f9588a.mo11382u0(i7, i8);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: s */
    public void mo11515s(int i7, List list, boolean z7) {
        m11472Z(i7, list, z7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: t */
    public void mo11516t(int i7, List list, boolean z7) {
        m11476d0(i7, list, z7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: u */
    public void mo11517u(int i7, long j7) {
        this.f9588a.m11345E0(i7, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: v */
    public void mo11518v(int i7, List list, boolean z7) {
        m11471Y(i7, list, z7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: w */
    public void mo11519w(int i7, List list, boolean z7) {
        m11463Q(i7, list, z7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: x */
    public void mo11520x(int i7, List list, boolean z7) {
        m11504h0(i7, list, z7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: y */
    public void mo11521y(int i7, List list, boolean z7) {
        m11478g0(i7, list, z7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525l0
    /* JADX INFO: renamed from: z */
    public void mo11522z(int i7, long j7) {
        this.f9588a.m11349I0(i7, j7);
    }
}
