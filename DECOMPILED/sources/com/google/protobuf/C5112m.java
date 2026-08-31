package com.google.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.m */
/* JADX INFO: loaded from: classes.dex */
final class C5112m implements InterfaceC5064B0 {

    /* JADX INFO: renamed from: a */
    private final AbstractC5110l f19496a;

    /* JADX INFO: renamed from: com.google.protobuf.m$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f19497a;

        static {
            int[] iArr = new int[AbstractC5062A0.b.values().length];
            f19497a = iArr;
            try {
                iArr[AbstractC5062A0.b.f19274u.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19497a[AbstractC5062A0.b.f19273t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19497a[AbstractC5062A0.b.f19271r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19497a[AbstractC5062A0.b.f19262B.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19497a[AbstractC5062A0.b.f19264D.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19497a[AbstractC5062A0.b.f19279z.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19497a[AbstractC5062A0.b.f19272s.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19497a[AbstractC5062A0.b.f19269e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19497a[AbstractC5062A0.b.f19263C.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19497a[AbstractC5062A0.b.f19265E.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19497a[AbstractC5062A0.b.f19270f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19497a[AbstractC5062A0.b.f19275v.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C5112m(AbstractC5110l abstractC5110l) {
        AbstractC5110l abstractC5110l2 = (AbstractC5110l) AbstractC5063B.m22838b(abstractC5110l, "output");
        this.f19496a = abstractC5110l2;
        abstractC5110l2.f19473a = this;
    }

    /* JADX INFO: renamed from: P */
    public static C5112m m23467P(AbstractC5110l abstractC5110l) {
        C5112m c5112m = abstractC5110l.f19473a;
        return c5112m != null ? c5112m : new C5112m(abstractC5110l);
    }

    /* JADX INFO: renamed from: Q */
    private void m23468Q(int i7, boolean z7, Object obj, C5075M.a aVar) {
        this.f19496a.mo23403R0(i7, 2);
        this.f19496a.mo23405T0(C5075M.m22937b(aVar, Boolean.valueOf(z7), obj));
        C5075M.m22939e(this.f19496a, aVar, Boolean.valueOf(z7), obj);
    }

    /* JADX INFO: renamed from: R */
    private void m23469R(int i7, C5075M.a aVar, Map map) {
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
            this.f19496a.mo23403R0(i7, 2);
            this.f19496a.mo23405T0(C5075M.m22937b(aVar, Integer.valueOf(i10), obj));
            C5075M.m22939e(this.f19496a, aVar, Integer.valueOf(i10), obj);
        }
    }

    /* JADX INFO: renamed from: S */
    private void m23470S(int i7, C5075M.a aVar, Map map) {
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
            this.f19496a.mo23403R0(i7, 2);
            this.f19496a.mo23405T0(C5075M.m22937b(aVar, Long.valueOf(j7), obj));
            C5075M.m22939e(this.f19496a, aVar, Long.valueOf(j7), obj);
        }
    }

    /* JADX INFO: renamed from: T */
    private void m23471T(int i7, C5075M.a aVar, Map map) {
        switch (a.f19497a[aVar.f19341a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    m23468Q(i7, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    m23468Q(i7, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                m23469R(i7, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                m23470S(i7, aVar, map);
                return;
            case 12:
                m23472U(i7, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f19341a);
        }
    }

    /* JADX INFO: renamed from: U */
    private void m23472U(int i7, C5075M.a aVar, Map map) {
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
            this.f19496a.mo23403R0(i7, 2);
            this.f19496a.mo23405T0(C5075M.m22937b(aVar, str, obj));
            C5075M.m22939e(this.f19496a, aVar, str, obj);
        }
    }

    /* JADX INFO: renamed from: V */
    private void m23473V(int i7, Object obj) {
        if (obj instanceof String) {
            this.f19496a.mo23401P0(i7, (String) obj);
        } else {
            this.f19496a.mo23418j0(i7, (AbstractC5104i) obj);
        }
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: A */
    public void mo22850A(int i7, float f7) {
        this.f19496a.m23428t0(i7, f7);
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: B */
    public void mo22851B(int i7) {
        this.f19496a.mo23403R0(i7, 4);
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: C */
    public void mo22852C(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f19496a.m23397L0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f19496a.mo23403R0(i7, 2);
        int iM23348L = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM23348L += AbstractC5110l.m23348L(((Integer) list.get(i9)).intValue());
        }
        this.f19496a.mo23405T0(iM23348L);
        while (i8 < list.size()) {
            this.f19496a.m23398M0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: D */
    public void mo22853D(int i7, int i8) {
        this.f19496a.m23422n0(i7, i8);
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: E */
    public void mo22854E(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f19496a.m23387B0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f19496a.mo23403R0(i7, 2);
        int iM23385z = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM23385z += AbstractC5110l.m23385z(((Long) list.get(i9)).longValue());
        }
        this.f19496a.mo23405T0(iM23385z);
        while (i8 < list.size()) {
            this.f19496a.m23388C0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: F */
    public void mo22855F(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f19496a.m23422n0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f19496a.mo23403R0(i7, 2);
        int iM23372m = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM23372m += AbstractC5110l.m23372m(((Integer) list.get(i9)).intValue());
        }
        this.f19496a.mo23405T0(iM23372m);
        while (i8 < list.size()) {
            this.f19496a.m23423o0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: G */
    public void mo22856G(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f19496a.m23420l0(i7, ((Double) list.get(i8)).doubleValue());
                i8++;
            }
            return;
        }
        this.f19496a.mo23403R0(i7, 2);
        int iM23370k = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM23370k += AbstractC5110l.m23370k(((Double) list.get(i9)).doubleValue());
        }
        this.f19496a.mo23405T0(iM23370k);
        while (i8 < list.size()) {
            this.f19496a.m23421m0(((Double) list.get(i8)).doubleValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: H */
    public void mo22857H(int i7, int i8) {
        this.f19496a.m23397L0(i7, i8);
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: I */
    public void mo22858I(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f19496a.mo23418j0(i7, (AbstractC5104i) list.get(i8));
        }
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: J */
    public void mo22859J(int i7, List list, InterfaceC5113m0 interfaceC5113m0) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            mo22861L(i7, list.get(i8), interfaceC5113m0);
        }
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: K */
    public void mo22860K(int i7, List list, InterfaceC5113m0 interfaceC5113m0) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            mo22862M(i7, list.get(i8), interfaceC5113m0);
        }
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: L */
    public void mo22861L(int i7, Object obj, InterfaceC5113m0 interfaceC5113m0) {
        this.f19496a.mo23389D0(i7, (InterfaceC5082U) obj, interfaceC5113m0);
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: M */
    public void mo22862M(int i7, Object obj, InterfaceC5113m0 interfaceC5113m0) {
        this.f19496a.m23431w0(i7, (InterfaceC5082U) obj, interfaceC5113m0);
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: N */
    public void mo22863N(int i7, AbstractC5104i abstractC5104i) {
        this.f19496a.mo23418j0(i7, abstractC5104i);
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: O */
    public void mo22864O(int i7, C5075M.a aVar, Map map) {
        if (this.f19496a.m23410Z()) {
            m23471T(i7, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f19496a.mo23403R0(i7, 2);
            this.f19496a.mo23405T0(C5075M.m22937b(aVar, entry.getKey(), entry.getValue()));
            C5075M.m22939e(this.f19496a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: a */
    public void mo22865a(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f19496a.m23428t0(i7, ((Float) list.get(i8)).floatValue());
                i8++;
            }
            return;
        }
        this.f19496a.mo23403R0(i7, 2);
        int iM23378s = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM23378s += AbstractC5110l.m23378s(((Float) list.get(i9)).floatValue());
        }
        this.f19496a.mo23405T0(iM23378s);
        while (i8 < list.size()) {
            this.f19496a.m23429u0(((Float) list.get(i8)).floatValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: b */
    public void mo22866b(int i7, int i8) {
        this.f19496a.mo23404S0(i7, i8);
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: c */
    public final void mo22867c(int i7, Object obj) {
        if (obj instanceof AbstractC5104i) {
            this.f19496a.mo23392G0(i7, (AbstractC5104i) obj);
        } else {
            this.f19496a.mo23391F0(i7, (InterfaceC5082U) obj);
        }
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: d */
    public void mo22868d(int i7, int i8) {
        this.f19496a.mo23424p0(i7, i8);
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: e */
    public void mo22869e(int i7, double d7) {
        this.f19496a.m23420l0(i7, d7);
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: f */
    public void mo22870f(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f19496a.m23395J0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f19496a.mo23403R0(i7, 2);
        int iM23346J = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM23346J += AbstractC5110l.m23346J(((Long) list.get(i9)).longValue());
        }
        this.f19496a.mo23405T0(iM23346J);
        while (i8 < list.size()) {
            this.f19496a.m23396K0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: g */
    public void mo22871g(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f19496a.mo23406U0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f19496a.mo23403R0(i7, 2);
        int iM23357U = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM23357U += AbstractC5110l.m23357U(((Long) list.get(i9)).longValue());
        }
        this.f19496a.mo23405T0(iM23357U);
        while (i8 < list.size()) {
            this.f19496a.mo23407V0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: h */
    public void mo22872h(int i7, long j7) {
        this.f19496a.mo23426r0(i7, j7);
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: i */
    public InterfaceC5064B0.a mo22873i() {
        return InterfaceC5064B0.a.ASCENDING;
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: j */
    public void mo22874j(int i7, List list) {
        int i8 = 0;
        if (!(list instanceof InterfaceC5071I)) {
            while (i8 < list.size()) {
                this.f19496a.mo23401P0(i7, (String) list.get(i8));
                i8++;
            }
        } else {
            InterfaceC5071I interfaceC5071I = (InterfaceC5071I) list;
            while (i8 < list.size()) {
                m23473V(i7, interfaceC5071I.mo22912M(i8));
                i8++;
            }
        }
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: k */
    public void mo22875k(int i7, String str) {
        this.f19496a.mo23401P0(i7, str);
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: l */
    public void mo22876l(int i7, long j7) {
        this.f19496a.mo23406U0(i7, j7);
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: m */
    public void mo22877m(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f19496a.mo23434z0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f19496a.mo23403R0(i7, 2);
        int iM23383x = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM23383x += AbstractC5110l.m23383x(((Integer) list.get(i9)).intValue());
        }
        this.f19496a.mo23405T0(iM23383x);
        while (i8 < list.size()) {
            this.f19496a.mo23386A0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: n */
    public void mo22878n(int i7, long j7) {
        this.f19496a.m23387B0(i7, j7);
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: o */
    public void mo22879o(int i7, boolean z7) {
        this.f19496a.mo23414f0(i7, z7);
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: p */
    public void mo22880p(int i7, int i8) {
        this.f19496a.m23393H0(i7, i8);
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: q */
    public void mo22881q(int i7) {
        this.f19496a.mo23403R0(i7, 3);
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: r */
    public void mo22882r(int i7, int i8) {
        this.f19496a.mo23434z0(i7, i8);
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: s */
    public void mo22883s(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f19496a.mo23426r0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f19496a.mo23403R0(i7, 2);
        int iM23376q = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM23376q += AbstractC5110l.m23376q(((Long) list.get(i9)).longValue());
        }
        this.f19496a.mo23405T0(iM23376q);
        while (i8 < list.size()) {
            this.f19496a.mo23427s0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: t */
    public void mo22884t(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f19496a.m23393H0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f19496a.mo23403R0(i7, 2);
        int iM23344H = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM23344H += AbstractC5110l.m23344H(((Integer) list.get(i9)).intValue());
        }
        this.f19496a.mo23405T0(iM23344H);
        while (i8 < list.size()) {
            this.f19496a.m23394I0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: u */
    public void mo22885u(int i7, long j7) {
        this.f19496a.m23395J0(i7, j7);
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: v */
    public void mo22886v(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f19496a.mo23424p0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f19496a.mo23403R0(i7, 2);
        int iM23374o = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM23374o += AbstractC5110l.m23374o(((Integer) list.get(i9)).intValue());
        }
        this.f19496a.mo23405T0(iM23374o);
        while (i8 < list.size()) {
            this.f19496a.mo23425q0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: w */
    public void mo22887w(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f19496a.mo23414f0(i7, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
            return;
        }
        this.f19496a.mo23403R0(i7, 2);
        int iM23365f = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM23365f += AbstractC5110l.m23365f(((Boolean) list.get(i9)).booleanValue());
        }
        this.f19496a.mo23405T0(iM23365f);
        while (i8 < list.size()) {
            this.f19496a.m23415g0(((Boolean) list.get(i8)).booleanValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: x */
    public void mo22888x(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f19496a.mo23404S0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f19496a.mo23403R0(i7, 2);
        int iM23355S = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM23355S += AbstractC5110l.m23355S(((Integer) list.get(i9)).intValue());
        }
        this.f19496a.mo23405T0(iM23355S);
        while (i8 < list.size()) {
            this.f19496a.mo23405T0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: y */
    public void mo22889y(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f19496a.m23399N0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f19496a.mo23403R0(i7, 2);
        int iM23350N = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM23350N += AbstractC5110l.m23350N(((Long) list.get(i9)).longValue());
        }
        this.f19496a.mo23405T0(iM23350N);
        while (i8 < list.size()) {
            this.f19496a.m23400O0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC5064B0
    /* JADX INFO: renamed from: z */
    public void mo22890z(int i7, long j7) {
        this.f19496a.m23399N0(i7, j7);
    }
}
