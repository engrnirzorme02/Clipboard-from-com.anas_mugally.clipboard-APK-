package p179X4;

import com.google.protobuf.C5125s0;
import com.google.protobuf.C5138z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p063H5.C0554l0;
import p137R4.AbstractC1370q;
import p137R4.C1342J;
import p137R4.C1343K;
import p137R4.C1348P;
import p137R4.C1362i;
import p137R4.C1364k;
import p137R4.C1369p;
import p151T4.C1477B1;
import p151T4.EnumC1529b0;
import p158U4.AbstractC1701y;
import p158U4.C1682f;
import p158U4.C1687k;
import p158U4.C1693q;
import p158U4.C1694r;
import p158U4.C1695s;
import p158U4.C1696t;
import p158U4.C1698v;
import p164V3.C1774s;
import p165V4.AbstractC1775a;
import p165V4.AbstractC1780f;
import p165V4.C1777c;
import p165V4.C1778d;
import p165V4.C1779e;
import p165V4.C1783i;
import p165V4.C1784j;
import p165V4.C1786l;
import p165V4.C1787m;
import p165V4.C1788n;
import p165V4.C1789o;
import p165V4.C1791q;
import p165V4.InterfaceC1790p;
import p186Y4.AbstractC2034b;
import p351s5.C7019a;
import p351s5.C7023e;
import p351s5.C7024f;
import p351s5.C7025g;
import p351s5.C7026h;
import p351s5.C7027i;
import p351s5.C7028j;
import p351s5.C7029k;
import p351s5.C7030l;
import p351s5.C7033o;
import p351s5.C7035q;
import p351s5.C7036r;
import p351s5.C7037s;
import p351s5.C7038t;
import p351s5.C7040v;
import p351s5.C7043y;
import p399y5.C7553a;

/* JADX INFO: renamed from: X4.K */
/* JADX INFO: loaded from: classes.dex */
public final class C1964K {

    /* JADX INFO: renamed from: a */
    private final C1682f f6467a;

    /* JADX INFO: renamed from: b */
    private final String f6468b;

    /* JADX INFO: renamed from: X4.K$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f6469a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f6470b;

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f6471c;

        /* JADX INFO: renamed from: d */
        static final /* synthetic */ int[] f6472d;

        /* JADX INFO: renamed from: e */
        static final /* synthetic */ int[] f6473e;

        /* JADX INFO: renamed from: f */
        static final /* synthetic */ int[] f6474f;

        /* JADX INFO: renamed from: g */
        static final /* synthetic */ int[] f6475g;

        /* JADX INFO: renamed from: h */
        static final /* synthetic */ int[] f6476h;

        /* JADX INFO: renamed from: i */
        static final /* synthetic */ int[] f6477i;

        /* JADX INFO: renamed from: j */
        static final /* synthetic */ int[] f6478j;

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f6479k;

        /* JADX INFO: renamed from: l */
        static final /* synthetic */ int[] f6480l;

        /* JADX INFO: renamed from: m */
        static final /* synthetic */ int[] f6481m;

        static {
            int[] iArr = new int[C7033o.c.values().length];
            f6481m = iArr;
            try {
                iArr[C7033o.c.TARGET_CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6481m[C7033o.c.DOCUMENT_CHANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6481m[C7033o.c.DOCUMENT_DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6481m[C7033o.c.DOCUMENT_REMOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6481m[C7033o.c.FILTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6481m[C7033o.c.RESPONSETYPE_NOT_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[C7038t.c.values().length];
            f6480l = iArr2;
            try {
                iArr2[C7038t.c.NO_CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6480l[C7038t.c.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6480l[C7038t.c.REMOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6480l[C7038t.c.CURRENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6480l[C7038t.c.RESET.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6480l[C7038t.c.UNRECOGNIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr3 = new int[C7036r.e.values().length];
            f6479k = iArr3;
            try {
                iArr3[C7036r.e.ASCENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f6479k[C7036r.e.DESCENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr4 = new int[C7036r.f.b.values().length];
            f6478j = iArr4;
            try {
                iArr4[C7036r.f.b.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f6478j[C7036r.f.b.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f6478j[C7036r.f.b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f6478j[C7036r.f.b.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f6478j[C7036r.f.b.GREATER_THAN_OR_EQUAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f6478j[C7036r.f.b.GREATER_THAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f6478j[C7036r.f.b.ARRAY_CONTAINS.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f6478j[C7036r.f.b.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f6478j[C7036r.f.b.ARRAY_CONTAINS_ANY.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f6478j[C7036r.f.b.NOT_IN.ordinal()] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr5 = new int[C1369p.b.values().length];
            f6477i = iArr5;
            try {
                iArr5[C1369p.b.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f6477i[C1369p.b.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f6477i[C1369p.b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f6477i[C1369p.b.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f6477i[C1369p.b.GREATER_THAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f6477i[C1369p.b.GREATER_THAN_OR_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f6477i[C1369p.b.ARRAY_CONTAINS.ordinal()] = 7;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f6477i[C1369p.b.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f6477i[C1369p.b.ARRAY_CONTAINS_ANY.ordinal()] = 9;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f6477i[C1369p.b.NOT_IN.ordinal()] = 10;
            } catch (NoSuchFieldError unused34) {
            }
            int[] iArr6 = new int[C7036r.k.b.values().length];
            f6476h = iArr6;
            try {
                iArr6[C7036r.k.b.IS_NAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f6476h[C7036r.k.b.IS_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f6476h[C7036r.k.b.IS_NOT_NAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f6476h[C7036r.k.b.IS_NOT_NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused38) {
            }
            int[] iArr7 = new int[C7036r.h.b.values().length];
            f6475g = iArr7;
            try {
                iArr7[C7036r.h.b.COMPOSITE_FILTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f6475g[C7036r.h.b.FIELD_FILTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f6475g[C7036r.h.b.UNARY_FILTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            int[] iArr8 = new int[C7036r.d.b.values().length];
            f6474f = iArr8;
            try {
                iArr8[C7036r.d.b.AND.ordinal()] = 1;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f6474f[C7036r.d.b.OR.ordinal()] = 2;
            } catch (NoSuchFieldError unused43) {
            }
            int[] iArr9 = new int[C1364k.a.values().length];
            f6473e = iArr9;
            try {
                iArr9[C1364k.a.AND.ordinal()] = 1;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f6473e[C1364k.a.OR.ordinal()] = 2;
            } catch (NoSuchFieldError unused45) {
            }
            int[] iArr10 = new int[EnumC1529b0.values().length];
            f6472d = iArr10;
            try {
                iArr10[EnumC1529b0.LISTEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f6472d[EnumC1529b0.EXISTENCE_FILTER_MISMATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f6472d[EnumC1529b0.EXISTENCE_FILTER_MISMATCH_BLOOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f6472d[EnumC1529b0.LIMBO_RESOLUTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused49) {
            }
            int[] iArr11 = new int[C7029k.c.EnumC7725c.values().length];
            f6471c = iArr11;
            try {
                iArr11[C7029k.c.EnumC7725c.SET_TO_SERVER_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f6471c[C7029k.c.EnumC7725c.APPEND_MISSING_ELEMENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f6471c[C7029k.c.EnumC7725c.REMOVE_ALL_FROM_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f6471c[C7029k.c.EnumC7725c.INCREMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused53) {
            }
            int[] iArr12 = new int[C7035q.c.values().length];
            f6470b = iArr12;
            try {
                iArr12[C7035q.c.UPDATE_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f6470b[C7035q.c.EXISTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f6470b[C7035q.c.CONDITIONTYPE_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused56) {
            }
            int[] iArr13 = new int[C7040v.c.values().length];
            f6469a = iArr13;
            try {
                iArr13[C7040v.c.UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f6469a[C7040v.c.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f6469a[C7040v.c.VERIFY.ordinal()] = 3;
            } catch (NoSuchFieldError unused59) {
            }
        }
    }

    public C1964K(C1682f c1682f) {
        this.f6467a = c1682f;
        this.f6468b = m8138V(c1682f).mo7057h();
    }

    /* JADX INFO: renamed from: B */
    private C7027i m8128B(C1778d c1778d) {
        C7027i.b bVarM30729g0 = C7027i.m30729g0();
        Iterator it = c1778d.m7457b().iterator();
        while (it.hasNext()) {
            bVarM30729g0.m30732x(((C1693q) it.next()).mo7057h());
        }
        return (C7027i) bVarM30729g0.m23721o();
    }

    /* JADX INFO: renamed from: D */
    private C7036r.f.b m8129D(C1369p.b bVar) {
        switch (a.f6477i[bVar.ordinal()]) {
            case 1:
                return C7036r.f.b.LESS_THAN;
            case 2:
                return C7036r.f.b.LESS_THAN_OR_EQUAL;
            case 3:
                return C7036r.f.b.EQUAL;
            case 4:
                return C7036r.f.b.NOT_EQUAL;
            case 5:
                return C7036r.f.b.GREATER_THAN;
            case 6:
                return C7036r.f.b.GREATER_THAN_OR_EQUAL;
            case 7:
                return C7036r.f.b.ARRAY_CONTAINS;
            case 8:
                return C7036r.f.b.IN;
            case 9:
                return C7036r.f.b.ARRAY_CONTAINS_ANY;
            case 10:
                return C7036r.f.b.NOT_IN;
            default:
                throw AbstractC2034b.m8457a("Unknown operator %d", bVar);
        }
    }

    /* JADX INFO: renamed from: E */
    private C7036r.g m8130E(C1693q c1693q) {
        return (C7036r.g) C7036r.g.m30913d0().m30916x(c1693q.mo7057h()).m23721o();
    }

    /* JADX INFO: renamed from: F */
    private C7029k.c m8131F(C1779e c1779e) {
        InterfaceC1790p interfaceC1790pM7459b = c1779e.m7459b();
        if (interfaceC1790pM7459b instanceof C1788n) {
            return (C7029k.c) C7029k.c.m30746l0().m30761y(c1779e.m7458a().mo7057h()).m30759B(C7029k.c.b.REQUEST_TIME).m23721o();
        }
        if (interfaceC1790pM7459b instanceof AbstractC1775a.b) {
            return (C7029k.c) C7029k.c.m30746l0().m30761y(c1779e.m7458a().mo7057h()).m30760x(C7019a.m30666j0().m30673x(((AbstractC1775a.b) interfaceC1790pM7459b).m7450e())).m23721o();
        }
        if (interfaceC1790pM7459b instanceof AbstractC1775a.a) {
            return (C7029k.c) C7029k.c.m30746l0().m30761y(c1779e.m7458a().mo7057h()).m30758A(C7019a.m30666j0().m30673x(((AbstractC1775a.a) interfaceC1790pM7459b).m7450e())).m23721o();
        }
        if (interfaceC1790pM7459b instanceof C1784j) {
            return (C7029k.c) C7029k.c.m30746l0().m30761y(c1779e.m7458a().mo7057h()).m30762z(((C1784j) interfaceC1790pM7459b).m7489d()).m23721o();
        }
        throw AbstractC2034b.m8457a("Unknown transform: %s", interfaceC1790pM7459b);
    }

    /* JADX INFO: renamed from: H */
    private C7036r.h m8132H(List list) {
        return m8153G(new C1364k(list, C1364k.a.AND));
    }

    /* JADX INFO: renamed from: J */
    private String m8133J(EnumC1529b0 enumC1529b0) {
        int i7 = a.f6472d[enumC1529b0.ordinal()];
        if (i7 == 1) {
            return null;
        }
        if (i7 == 2) {
            return "existence-filter-mismatch";
        }
        if (i7 == 3) {
            return "existence-filter-mismatch-bloom";
        }
        if (i7 == 4) {
            return "limbo-document";
        }
        throw AbstractC2034b.m8457a("Unrecognized query purpose: %s", enumC1529b0);
    }

    /* JADX INFO: renamed from: M */
    private C7036r.i m8134M(C1342J c1342j) {
        C7036r.i.a aVarM30938e0 = C7036r.i.m30938e0();
        if (c1342j.m5740b().equals(C1342J.a.ASCENDING)) {
            aVarM30938e0.m30943x(C7036r.e.ASCENDING);
        } else {
            aVarM30938e0.m30943x(C7036r.e.DESCENDING);
        }
        aVarM30938e0.m30944y(m8130E(c1342j.m5741c()));
        return (C7036r.i) aVarM30938e0.m23721o();
    }

    /* JADX INFO: renamed from: N */
    private C7035q m8135N(C1787m c1787m) {
        AbstractC2034b.m8460d(!c1787m.m7499d(), "Can't serialize an empty precondition", new Object[0]);
        C7035q.b bVarM30822g0 = C7035q.m30822g0();
        if (c1787m.m7498c() != null) {
            return (C7035q) bVarM30822g0.m30829y(m8161U(c1787m.m7498c())).m23721o();
        }
        if (c1787m.m7497b() != null) {
            return (C7035q) bVarM30822g0.m30828x(c1787m.m7497b().booleanValue()).m23721o();
        }
        throw AbstractC2034b.m8457a("Unknown Precondition", new Object[0]);
    }

    /* JADX INFO: renamed from: O */
    private String m8136O(C1696t c1696t) {
        return m8137Q(this.f6467a, c1696t);
    }

    /* JADX INFO: renamed from: Q */
    private String m8137Q(C1682f c1682f, C1696t c1696t) {
        return ((C1696t) ((C1696t) m8138V(c1682f).m7056d("documents")).m7055c(c1696t)).mo7057h();
    }

    /* JADX INFO: renamed from: V */
    private static C1696t m8138V(C1682f c1682f) {
        return C1696t.m7148z(Arrays.asList("projects", c1682f.m7070k(), "databases", c1682f.m7069j()));
    }

    /* JADX INFO: renamed from: W */
    private static C1696t m8139W(C1696t c1696t) {
        AbstractC2034b.m8460d(c1696t.m7063v() > 4 && c1696t.m7061p(4).equals("documents"), "Tried to deserialize invalid key %s", c1696t);
        return (C1696t) c1696t.m7064w(5);
    }

    /* JADX INFO: renamed from: X */
    private C0554l0 m8140X(C7553a c7553a) {
        return C0554l0.m2450h(c7553a.m33251a0()).m2462q(c7553a.m33252c0());
    }

    /* JADX INFO: renamed from: Y */
    private static boolean m8141Y(C1696t c1696t) {
        return c1696t.m7063v() >= 4 && c1696t.m7061p(0).equals("projects") && c1696t.m7061p(2).equals("databases");
    }

    /* JADX INFO: renamed from: d */
    private C1778d m8142d(C7027i c7027i) {
        int iM30731f0 = c7027i.m30731f0();
        HashSet hashSet = new HashSet(iM30731f0);
        for (int i7 = 0; i7 < iM30731f0; i7++) {
            hashSet.add(C1693q.m7120z(c7027i.m30730e0(i7)));
        }
        return C1778d.m7456a(hashSet);
    }

    /* JADX INFO: renamed from: g */
    private C1369p.b m8143g(C7036r.f.b bVar) {
        switch (a.f6478j[bVar.ordinal()]) {
            case 1:
                return C1369p.b.LESS_THAN;
            case 2:
                return C1369p.b.LESS_THAN_OR_EQUAL;
            case 3:
                return C1369p.b.EQUAL;
            case 4:
                return C1369p.b.NOT_EQUAL;
            case 5:
                return C1369p.b.GREATER_THAN_OR_EQUAL;
            case 6:
                return C1369p.b.GREATER_THAN;
            case 7:
                return C1369p.b.ARRAY_CONTAINS;
            case 8:
                return C1369p.b.IN;
            case 9:
                return C1369p.b.ARRAY_CONTAINS_ANY;
            case 10:
                return C1369p.b.NOT_IN;
            default:
                throw AbstractC2034b.m8457a("Unhandled FieldFilter.operator %d", bVar);
        }
    }

    /* JADX INFO: renamed from: h */
    private C1779e m8144h(C7029k.c cVar) {
        int i7 = a.f6471c[cVar.m30757k0().ordinal()];
        if (i7 == 1) {
            AbstractC2034b.m8460d(cVar.m30756j0() == C7029k.c.b.REQUEST_TIME, "Unknown transform setToServerValue: %s", cVar.m30756j0());
            return new C1779e(C1693q.m7120z(cVar.m30753g0()), C1788n.m7501c());
        }
        if (i7 == 2) {
            return new C1779e(C1693q.m7120z(cVar.m30753g0()), new AbstractC1775a.b(cVar.m30752f0().mo30668g()));
        }
        if (i7 == 3) {
            return new C1779e(C1693q.m7120z(cVar.m30753g0()), new AbstractC1775a.a(cVar.m30755i0().mo30668g()));
        }
        if (i7 == 4) {
            return new C1779e(C1693q.m7120z(cVar.m30753g0()), new C1784j(cVar.m30754h0()));
        }
        throw AbstractC2034b.m8457a("Unknown FieldTransform proto: %s", cVar);
    }

    /* JADX INFO: renamed from: j */
    private List m8145j(C7036r.h hVar) {
        AbstractC1370q abstractC1370qM8167i = m8167i(hVar);
        if (abstractC1370qM8167i instanceof C1364k) {
            C1364k c1364k = (C1364k) abstractC1370qM8167i;
            if (c1364k.m5897i()) {
                return c1364k.mo5891b();
            }
        }
        return Collections.singletonList(abstractC1370qM8167i);
    }

    /* JADX INFO: renamed from: n */
    private C1342J m8146n(C7036r.i iVar) {
        C1342J.a aVar;
        C1693q c1693qM7120z = C1693q.m7120z(iVar.m30942d0().m30915c0());
        int i7 = a.f6479k[iVar.m30941c0().ordinal()];
        if (i7 == 1) {
            aVar = C1342J.a.ASCENDING;
        } else {
            if (i7 != 2) {
                throw AbstractC2034b.m8457a("Unrecognized direction %d", iVar.m30941c0());
            }
            aVar = C1342J.a.DESCENDING;
        }
        return C1342J.m5738d(aVar, c1693qM7120z);
    }

    /* JADX INFO: renamed from: o */
    private C1787m m8147o(C7035q c7035q) {
        int i7 = a.f6470b[c7035q.m30825c0().ordinal()];
        if (i7 == 1) {
            return C1787m.m7496f(m8174v(c7035q.m30827f0()));
        }
        if (i7 == 2) {
            return C1787m.m7495a(c7035q.m30826e0());
        }
        if (i7 == 3) {
            return C1787m.f5852c;
        }
        throw AbstractC2034b.m8457a("Unknown precondition", new Object[0]);
    }

    /* JADX INFO: renamed from: p */
    private C1696t m8148p(String str) {
        C1696t c1696tM8149s = m8149s(str);
        return c1696tM8149s.m7063v() == 4 ? C1696t.f5635b : m8139W(c1696tM8149s);
    }

    /* JADX INFO: renamed from: s */
    private C1696t m8149s(String str) {
        C1696t c1696tM7147A = C1696t.m7147A(str);
        AbstractC2034b.m8460d(m8141Y(c1696tM7147A), "Tried to deserialize invalid key %s", c1696tM7147A);
        return c1696tM7147A;
    }

    /* JADX INFO: renamed from: u */
    private AbstractC1370q m8150u(C7036r.k kVar) {
        C1693q c1693qM7120z = C1693q.m7120z(kVar.m30953d0().m30915c0());
        int i7 = a.f6476h[kVar.m30954e0().ordinal()];
        if (i7 == 1) {
            return C1369p.m5921e(c1693qM7120z, C1369p.b.EQUAL, AbstractC1701y.f5642a);
        }
        if (i7 == 2) {
            return C1369p.m5921e(c1693qM7120z, C1369p.b.EQUAL, AbstractC1701y.f5643b);
        }
        if (i7 == 3) {
            return C1369p.m5921e(c1693qM7120z, C1369p.b.NOT_EQUAL, AbstractC1701y.f5642a);
        }
        if (i7 == 4) {
            return C1369p.m5921e(c1693qM7120z, C1369p.b.NOT_EQUAL, AbstractC1701y.f5643b);
        }
        throw AbstractC2034b.m8457a("Unrecognized UnaryFilter.operator %d", kVar.m30954e0());
    }

    /* JADX INFO: renamed from: A */
    public C7024f m8151A(C1687k c1687k, C1695s c1695s) {
        C7024f.b bVarM30705k0 = C7024f.m30705k0();
        bVarM30705k0.m30712y(m8154I(c1687k));
        bVarM30705k0.m30711x(c1695s.m7144h());
        return (C7024f) bVarM30705k0.m23721o();
    }

    /* JADX INFO: renamed from: C */
    public C7037s.c m8152C(C1348P c1348p) {
        C7037s.c.a aVarM30984g0 = C7037s.c.m30984g0();
        aVarM30984g0.m30987x(m8136O(c1348p.m5820n()));
        return (C7037s.c) aVarM30984g0.m23721o();
    }

    /* JADX INFO: renamed from: G */
    C7036r.h m8153G(AbstractC1370q abstractC1370q) {
        if (abstractC1370q instanceof C1369p) {
            return m8160T((C1369p) abstractC1370q);
        }
        if (abstractC1370q instanceof C1364k) {
            return m8177y((C1364k) abstractC1370q);
        }
        throw AbstractC2034b.m8457a("Unrecognized filter type %s", abstractC1370q.toString());
    }

    /* JADX INFO: renamed from: I */
    public String m8154I(C1687k c1687k) {
        return m8137Q(this.f6467a, c1687k.m7095t());
    }

    /* JADX INFO: renamed from: K */
    public Map m8155K(C1477B1 c1477b1) {
        String strM8133J = m8133J(c1477b1.m6209c());
        if (strM8133J == null) {
            return null;
        }
        HashMap map = new HashMap(1);
        map.put("goog-listen-tags", strM8133J);
        return map;
    }

    /* JADX INFO: renamed from: L */
    public C7040v m8156L(AbstractC1780f abstractC1780f) {
        C7040v.b bVarM31072u0 = C7040v.m31072u0();
        if (abstractC1780f instanceof C1789o) {
            bVarM31072u0.m31090A(m8151A(abstractC1780f.m7462f(), ((C1789o) abstractC1780f).m7502n()));
        } else if (abstractC1780f instanceof C1786l) {
            bVarM31072u0.m31090A(m8151A(abstractC1780f.m7462f(), ((C1786l) abstractC1780f).m7494p()));
            bVarM31072u0.m31091B(m8128B(abstractC1780f.mo7455d()));
        } else if (abstractC1780f instanceof C1777c) {
            bVarM31072u0.m31095z(m8154I(abstractC1780f.m7462f()));
        } else {
            if (!(abstractC1780f instanceof C1791q)) {
                throw AbstractC2034b.m8457a("unknown mutation type %s", abstractC1780f.getClass());
            }
            bVarM31072u0.m31092C(m8154I(abstractC1780f.m7462f()));
        }
        Iterator it = abstractC1780f.m7461e().iterator();
        while (it.hasNext()) {
            bVarM31072u0.m31093x(m8131F((C1779e) it.next()));
        }
        if (!abstractC1780f.m7463g().m7499d()) {
            bVarM31072u0.m31094y(m8135N(abstractC1780f.m7463g()));
        }
        return (C7040v) bVarM31072u0.m23721o();
    }

    /* JADX INFO: renamed from: P */
    public C7037s.d m8157P(C1348P c1348p) {
        C7037s.d.a aVarM30992f0 = C7037s.d.m30992f0();
        C7036r.b bVarM30846x0 = C7036r.m30846x0();
        C1696t c1696tM5820n = c1348p.m5820n();
        if (c1348p.m5812d() != null) {
            AbstractC2034b.m8460d(c1696tM5820n.m7063v() % 2 == 0, "Collection Group queries should be within a document path or root.", new Object[0]);
            aVarM30992f0.m30997x(m8136O(c1696tM5820n));
            C7036r.c.a aVarM30870e0 = C7036r.c.m30870e0();
            aVarM30870e0.m30876y(c1348p.m5812d());
            aVarM30870e0.m30875x(true);
            bVarM30846x0.m30864x(aVarM30870e0);
        } else {
            AbstractC2034b.m8460d(c1696tM5820n.m7063v() % 2 != 0, "Document queries with filters are not supported.", new Object[0]);
            aVarM30992f0.m30997x(m8136O((C1696t) c1696tM5820n.m7065x()));
            C7036r.c.a aVarM30870e1 = C7036r.c.m30870e0();
            aVarM30870e1.m30876y(c1696tM5820n.m7060o());
            bVarM30846x0.m30864x(aVarM30870e1);
        }
        if (c1348p.m5814h().size() > 0) {
            bVarM30846x0.m30863C(m8132H(c1348p.m5814h()));
        }
        Iterator it = c1348p.m5819m().iterator();
        while (it.hasNext()) {
            bVarM30846x0.m30865y(m8134M((C1342J) it.next()));
        }
        if (c1348p.m5824r()) {
            bVarM30846x0.m30861A(C5138z.m23805d0().m23808x((int) c1348p.m5816j()));
        }
        if (c1348p.m5822p() != null) {
            C7023e.b bVarM30691g0 = C7023e.m30691g0();
            bVarM30691g0.m30695x(c1348p.m5822p().m5873b());
            bVarM30691g0.m30696y(c1348p.m5822p().m5874c());
            bVarM30846x0.m30862B(bVarM30691g0);
        }
        if (c1348p.m5813f() != null) {
            C7023e.b bVarM30691g1 = C7023e.m30691g0();
            bVarM30691g1.m30695x(c1348p.m5813f().m5873b());
            bVarM30691g1.m30696y(!c1348p.m5813f().m5874c());
            bVarM30846x0.m30866z(bVarM30691g1);
        }
        aVarM30992f0.m30998y(bVarM30846x0);
        return (C7037s.d) aVarM30992f0.m23721o();
    }

    /* JADX INFO: renamed from: R */
    public C7037s m8158R(C1477B1 c1477b1) {
        C7037s.b bVarM30966g0 = C7037s.m30966g0();
        C1348P c1348pM6213g = c1477b1.m6213g();
        if (c1348pM6213g.m5825s()) {
            bVarM30966g0.m30976x(m8152C(c1348pM6213g));
        } else {
            bVarM30966g0.m30978z(m8157P(c1348pM6213g));
        }
        bVarM30966g0.m30975C(c1477b1.m6214h());
        if (!c1477b1.m6210d().isEmpty() || c1477b1.m6212f().compareTo(C1698v.f5636b) <= 0) {
            bVarM30966g0.m30974B(c1477b1.m6210d());
        } else {
            bVarM30966g0.m30973A(m8159S(c1477b1.m6212f().m7155d()));
        }
        if (c1477b1.m6207a() != null && (!c1477b1.m6210d().isEmpty() || c1477b1.m6212f().compareTo(C1698v.f5636b) > 0)) {
            bVarM30966g0.m30977y(C5138z.m23805d0().m23808x(c1477b1.m6207a().intValue()));
        }
        return (C7037s) bVarM30966g0.m23721o();
    }

    /* JADX INFO: renamed from: S */
    public C5125s0 m8159S(C1774s c1774s) {
        C5125s0.b bVarM23582f0 = C5125s0.m23582f0();
        bVarM23582f0.m23588y(c1774s.m7438h());
        bVarM23582f0.m23587x(c1774s.m7437d());
        return (C5125s0) bVarM23582f0.m23721o();
    }

    /* JADX INFO: renamed from: T */
    C7036r.h m8160T(C1369p c1369p) {
        C1369p.b bVarM5923g = c1369p.m5923g();
        C1369p.b bVar = C1369p.b.EQUAL;
        if (bVarM5923g == bVar || c1369p.m5923g() == C1369p.b.NOT_EQUAL) {
            C7036r.k.a aVarM30950f0 = C7036r.k.m30950f0();
            aVarM30950f0.m30955x(m8130E(c1369p.m5922f()));
            if (AbstractC1701y.m7198z(c1369p.m5924h())) {
                aVarM30950f0.m30956y(c1369p.m5923g() == bVar ? C7036r.k.b.IS_NAN : C7036r.k.b.IS_NOT_NAN);
                return (C7036r.h) C7036r.h.m30922i0().m30932z(aVarM30950f0).m23721o();
            }
            if (AbstractC1701y.m7163A(c1369p.m5924h())) {
                aVarM30950f0.m30956y(c1369p.m5923g() == bVar ? C7036r.k.b.IS_NULL : C7036r.k.b.IS_NOT_NULL);
                return (C7036r.h) C7036r.h.m30922i0().m30932z(aVarM30950f0).m23721o();
            }
        }
        C7036r.f.a aVarM30898h0 = C7036r.f.m30898h0();
        aVarM30898h0.m30905x(m8130E(c1369p.m5922f()));
        aVarM30898h0.m30906y(m8129D(c1369p.m5923g()));
        aVarM30898h0.m30907z(c1369p.m5924h());
        return (C7036r.h) C7036r.h.m30922i0().m30931y(aVarM30898h0).m23721o();
    }

    /* JADX INFO: renamed from: U */
    public C5125s0 m8161U(C1698v c1698v) {
        return m8159S(c1698v.m7155d());
    }

    /* JADX INFO: renamed from: a */
    public String m8162a() {
        return this.f6468b;
    }

    /* JADX INFO: renamed from: b */
    C1364k m8163b(C7036r.d dVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = dVar.m30885f0().iterator();
        while (it.hasNext()) {
            arrayList.add(m8167i((C7036r.h) it.next()));
        }
        return new C1364k(arrayList, m8164c(dVar.m30886g0()));
    }

    /* JADX INFO: renamed from: c */
    C1364k.a m8164c(C7036r.d.b bVar) {
        int i7 = a.f6474f[bVar.ordinal()];
        if (i7 == 1) {
            return C1364k.a.AND;
        }
        if (i7 == 2) {
            return C1364k.a.OR;
        }
        throw AbstractC2034b.m8457a("Only AND and OR composite filter types are supported.", new Object[0]);
    }

    /* JADX INFO: renamed from: e */
    public C1348P m8165e(C7037s.c cVar) {
        int iM30986f0 = cVar.m30986f0();
        AbstractC2034b.m8460d(iM30986f0 == 1, "DocumentsTarget contained other than 1 document %d", Integer.valueOf(iM30986f0));
        return C1343K.m5744b(m8148p(cVar.m30985e0(0))).m5768x();
    }

    /* JADX INFO: renamed from: f */
    C1369p m8166f(C7036r.f fVar) {
        return C1369p.m5921e(C1693q.m7120z(fVar.m30902e0().m30915c0()), m8143g(fVar.m30903f0()), fVar.m30904g0());
    }

    /* JADX INFO: renamed from: i */
    AbstractC1370q m8167i(C7036r.h hVar) {
        int i7 = a.f6475g[hVar.m30928g0().ordinal()];
        if (i7 == 1) {
            return m8163b(hVar.m30926d0());
        }
        if (i7 == 2) {
            return m8166f(hVar.m30927f0());
        }
        if (i7 == 3) {
            return m8150u(hVar.m30929h0());
        }
        throw AbstractC2034b.m8457a("Unrecognized Filter.filterType %d", hVar.m30928g0());
    }

    /* JADX INFO: renamed from: k */
    public C1687k m8168k(String str) {
        C1696t c1696tM8149s = m8149s(str);
        AbstractC2034b.m8460d(c1696tM8149s.m7061p(1).equals(this.f6467a.m7070k()), "Tried to deserialize key from different project.", new Object[0]);
        AbstractC2034b.m8460d(c1696tM8149s.m7061p(3).equals(this.f6467a.m7069j()), "Tried to deserialize key from different database.", new Object[0]);
        return C1687k.m7088m(m8139W(c1696tM8149s));
    }

    /* JADX INFO: renamed from: l */
    public AbstractC1780f m8169l(C7040v c7040v) {
        C1787m c1787mM8147o = c7040v.m31086q0() ? m8147o(c7040v.m31078i0()) : C1787m.f5852c;
        ArrayList arrayList = new ArrayList();
        Iterator it = c7040v.m31084o0().iterator();
        while (it.hasNext()) {
            arrayList.add(m8144h((C7029k.c) it.next()));
        }
        int i7 = a.f6469a[c7040v.m31080k0().ordinal()];
        if (i7 == 1) {
            return c7040v.m31089t0() ? new C1786l(m8168k(c7040v.m31082m0().m30709g0()), C1695s.m7139f(c7040v.m31082m0().m30708e0()), m8142d(c7040v.m31083n0()), c1787mM8147o, arrayList) : new C1789o(m8168k(c7040v.m31082m0().m30709g0()), C1695s.m7139f(c7040v.m31082m0().m30708e0()), c1787mM8147o, arrayList);
        }
        if (i7 == 2) {
            return new C1777c(m8168k(c7040v.m31079j0()), c1787mM8147o);
        }
        if (i7 == 3) {
            return new C1791q(m8168k(c7040v.m31085p0()), c1787mM8147o);
        }
        throw AbstractC2034b.m8457a("Unknown mutation operation: %d", c7040v.m31080k0());
    }

    /* JADX INFO: renamed from: m */
    public C1783i m8170m(C7043y c7043y, C1698v c1698v) {
        C1698v c1698vM8174v = m8174v(c7043y.m31120c0());
        if (!C1698v.f5636b.equals(c1698vM8174v)) {
            c1698v = c1698vM8174v;
        }
        int iM31119b0 = c7043y.m31119b0();
        ArrayList arrayList = new ArrayList(iM31119b0);
        for (int i7 = 0; i7 < iM31119b0; i7++) {
            arrayList.add(c7043y.m31118a0(i7));
        }
        return new C1783i(c1698v, arrayList);
    }

    /* JADX INFO: renamed from: q */
    public C1348P m8171q(String str, C7036r c7036r) {
        C1696t c1696t;
        String strM30874d0;
        List arrayList;
        C1696t c1696tM8148p = m8148p(str);
        int iM30851n0 = c7036r.m30851n0();
        if (iM30851n0 <= 0) {
            c1696t = c1696tM8148p;
            strM30874d0 = null;
        } else {
            AbstractC2034b.m8460d(iM30851n0 == 1, "StructuredQuery.from with more than one collection is not supported.", new Object[0]);
            C7036r.c cVarM30850m0 = c7036r.m30850m0(0);
            if (cVarM30850m0.m30873c0()) {
                c1696t = c1696tM8148p;
                strM30874d0 = cVarM30850m0.m30874d0();
            } else {
                c1696tM8148p = (C1696t) c1696tM8148p.m7056d(cVarM30850m0.m30874d0());
                c1696t = c1696tM8148p;
                strM30874d0 = null;
            }
        }
        List listM8145j = c7036r.m30860w0() ? m8145j(c7036r.m30856s0()) : Collections.EMPTY_LIST;
        int iM30854q0 = c7036r.m30854q0();
        if (iM30854q0 > 0) {
            arrayList = new ArrayList(iM30854q0);
            for (int i7 = 0; i7 < iM30854q0; i7++) {
                arrayList.add(m8146n(c7036r.m30853p0(i7)));
            }
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        return new C1348P(c1696t, strM30874d0, listM8145j, arrayList, c7036r.m30858u0() ? c7036r.m30852o0().m23807c0() : -1L, c7036r.m30859v0() ? new C1362i(c7036r.m30855r0().m30694g(), c7036r.m30855r0().m30693e0()) : null, c7036r.m30857t0() ? new C1362i(c7036r.m30849l0().m30694g(), !c7036r.m30849l0().m30693e0()) : null);
    }

    /* JADX INFO: renamed from: r */
    public C1348P m8172r(C7037s.d dVar) {
        return m8171q(dVar.m30995d0(), dVar.m30996e0());
    }

    /* JADX INFO: renamed from: t */
    public C1774s m8173t(C5125s0 c5125s0) {
        return new C1774s(c5125s0.m23586e0(), c5125s0.m23585d0());
    }

    /* JADX INFO: renamed from: v */
    public C1698v m8174v(C5125s0 c5125s0) {
        return (c5125s0.m23586e0() == 0 && c5125s0.m23585d0() == 0) ? C1698v.f5636b : new C1698v(m8173t(c5125s0));
    }

    /* JADX INFO: renamed from: w */
    public C1698v m8175w(C7033o c7033o) {
        if (c7033o.m30799f0() == C7033o.c.TARGET_CHANGE && c7033o.m30800g0().m31005f0() == 0) {
            return m8174v(c7033o.m30800g0().m31002c0());
        }
        return C1698v.f5636b;
    }

    /* JADX INFO: renamed from: x */
    public AbstractC1974V m8176x(C7033o c7033o) {
        AbstractC1974V.e eVar;
        int i7 = a.f6481m[c7033o.m30799f0().ordinal()];
        C0554l0 c0554l0M8140X = null;
        if (i7 == 1) {
            C7038t c7038tM30800g0 = c7033o.m30800g0();
            int i8 = a.f6480l[c7038tM30800g0.m31004e0().ordinal()];
            if (i8 == 1) {
                eVar = AbstractC1974V.e.NoChange;
            } else if (i8 == 2) {
                eVar = AbstractC1974V.e.Added;
            } else if (i8 == 3) {
                eVar = AbstractC1974V.e.Removed;
                c0554l0M8140X = m8140X(c7038tM30800g0.m31001a0());
            } else if (i8 == 4) {
                eVar = AbstractC1974V.e.Current;
            } else {
                if (i8 != 5) {
                    throw new IllegalArgumentException("Unknown target change type");
                }
                eVar = AbstractC1974V.e.Reset;
            }
            return new AbstractC1974V.d(eVar, c7038tM30800g0.m31006g0(), c7038tM30800g0.m31003d0(), c0554l0M8140X);
        }
        if (i7 == 2) {
            C7025g c7025gM30795b0 = c7033o.m30795b0();
            List listM30718d0 = c7025gM30795b0.m30718d0();
            List listM30717c0 = c7025gM30795b0.m30717c0();
            C1687k c1687kM8168k = m8168k(c7025gM30795b0.m30716b0().m30709g0());
            C1698v c1698vM8174v = m8174v(c7025gM30795b0.m30716b0().m30710h0());
            AbstractC2034b.m8460d(!c1698vM8174v.equals(C1698v.f5636b), "Got a document change without an update time", new Object[0]);
            C1694r c1694rM7123p = C1694r.m7123p(c1687kM8168k, c1698vM8174v, C1695s.m7139f(c7025gM30795b0.m30716b0().m30708e0()));
            return new AbstractC1974V.b(listM30718d0, listM30717c0, c1694rM7123p.getKey(), c1694rM7123p);
        }
        if (i7 == 3) {
            C7026h c7026hM30796c0 = c7033o.m30796c0();
            List listM30723d0 = c7026hM30796c0.m30723d0();
            C1694r c1694rM7125r = C1694r.m7125r(m8168k(c7026hM30796c0.m30721b0()), m8174v(c7026hM30796c0.m30722c0()));
            return new AbstractC1974V.b(Collections.EMPTY_LIST, listM30723d0, c1694rM7125r.getKey(), c1694rM7125r);
        }
        if (i7 == 4) {
            C7028j c7028jM30797d0 = c7033o.m30797d0();
            return new AbstractC1974V.b(Collections.EMPTY_LIST, c7028jM30797d0.m30736c0(), m8168k(c7028jM30797d0.m30735b0()), null);
        }
        if (i7 != 5) {
            throw new IllegalArgumentException("Unknown change type set");
        }
        C7030l c7030lM30798e0 = c7033o.m30798e0();
        return new AbstractC1974V.c(c7030lM30798e0.m30770c0(), new C1993p(c7030lM30798e0.m30769a0(), c7030lM30798e0.m30771d0()));
    }

    /* JADX INFO: renamed from: y */
    C7036r.h m8177y(C1364k c1364k) {
        ArrayList arrayList = new ArrayList(c1364k.mo5891b().size());
        Iterator it = c1364k.mo5891b().iterator();
        while (it.hasNext()) {
            arrayList.add(m8153G((AbstractC1370q) it.next()));
        }
        if (arrayList.size() == 1) {
            return (C7036r.h) arrayList.get(0);
        }
        C7036r.d.a aVarM30883h0 = C7036r.d.m30883h0();
        aVarM30883h0.m30888y(m8178z(c1364k.m5893e()));
        aVarM30883h0.m30887x(arrayList);
        return (C7036r.h) C7036r.h.m30922i0().m30930x(aVarM30883h0).m23721o();
    }

    /* JADX INFO: renamed from: z */
    C7036r.d.b m8178z(C1364k.a aVar) {
        int i7 = a.f6473e[aVar.ordinal()];
        if (i7 == 1) {
            return C7036r.d.b.AND;
        }
        if (i7 == 2) {
            return C7036r.d.b.OR;
        }
        throw AbstractC2034b.m8457a("Unrecognized composite filter type.", new Object[0]);
    }
}
