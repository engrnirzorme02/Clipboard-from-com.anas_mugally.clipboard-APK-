package p151T4;

import com.google.protobuf.AbstractC5104i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p137R4.C1348P;
import p158U4.AbstractC1692p;
import p158U4.C1693q;
import p158U4.C1694r;
import p158U4.C1695s;
import p158U4.C1698v;
import p158U4.InterfaceC1684h;
import p164V3.C1774s;
import p165V4.AbstractC1780f;
import p165V4.C1781g;
import p172W4.C1866a;
import p172W4.C1867b;
import p172W4.C1868c;
import p172W4.C1869d;
import p172W4.C1870e;
import p179X4.C1964K;
import p186Y4.AbstractC2034b;
import p343r5.C6915a;
import p351s5.C7024f;
import p351s5.C7029k;
import p351s5.C7040v;

/* JADX INFO: renamed from: T4.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1570p {

    /* JADX INFO: renamed from: a */
    private final C1964K f5289a;

    /* JADX INFO: renamed from: T4.p$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f5290a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f5291b;

        static {
            int[] iArr = new int[C1868c.c.values().length];
            f5291b = iArr;
            try {
                iArr[C1868c.c.DOCUMENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5291b[C1868c.c.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[C1866a.c.values().length];
            f5290a = iArr2;
            try {
                iArr2[C1866a.c.DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5290a[C1866a.c.NO_DOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5290a[C1866a.c.UNKNOWN_DOCUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C1570p(C1964K c1964k) {
        this.f5289a = c1964k;
    }

    /* JADX INFO: renamed from: a */
    private C1694r m6452a(C7024f c7024f, boolean z7) {
        C1694r c1694rM7123p = C1694r.m7123p(this.f5289a.m8168k(c7024f.m30709g0()), this.f5289a.m8174v(c7024f.m30710h0()), C1695s.m7139f(c7024f.m30708e0()));
        return z7 ? c1694rM7123p.m7131t() : c1694rM7123p;
    }

    /* JADX INFO: renamed from: f */
    private C1694r m6453f(C1867b c1867b, boolean z7) {
        C1694r c1694rM7125r = C1694r.m7125r(this.f5289a.m8168k(c1867b.m7691d0()), this.f5289a.m8174v(c1867b.m7692e0()));
        return z7 ? c1694rM7125r.m7131t() : c1694rM7125r;
    }

    /* JADX INFO: renamed from: h */
    private C1694r m6454h(C1869d c1869d) {
        return C1694r.m7126s(this.f5289a.m8168k(c1869d.m7739d0()), this.f5289a.m8174v(c1869d.m7740e0()));
    }

    /* JADX INFO: renamed from: i */
    private C7024f m6455i(InterfaceC1684h interfaceC1684h) {
        C7024f.b bVarM30705k0 = C7024f.m30705k0();
        bVarM30705k0.m30712y(this.f5289a.m8154I(interfaceC1684h.getKey()));
        bVarM30705k0.m30711x(interfaceC1684h.getData().m7144h());
        bVarM30705k0.m30713z(this.f5289a.m8159S(interfaceC1684h.mo7081j().m7155d()));
        return (C7024f) bVarM30705k0.m23721o();
    }

    /* JADX INFO: renamed from: n */
    private C1867b m6456n(InterfaceC1684h interfaceC1684h) {
        C1867b.b bVarM7688f0 = C1867b.m7688f0();
        bVarM7688f0.m7693x(this.f5289a.m8154I(interfaceC1684h.getKey()));
        bVarM7688f0.m7694y(this.f5289a.m8159S(interfaceC1684h.mo7081j().m7155d()));
        return (C1867b) bVarM7688f0.m23721o();
    }

    /* JADX INFO: renamed from: p */
    private C1869d m6457p(InterfaceC1684h interfaceC1684h) {
        C1869d.b bVarM7736f0 = C1869d.m7736f0();
        bVarM7736f0.m7741x(this.f5289a.m8154I(interfaceC1684h.getKey()));
        bVarM7736f0.m7742y(this.f5289a.m8159S(interfaceC1684h.mo7081j().m7155d()));
        return (C1869d) bVarM7736f0.m23721o();
    }

    /* JADX INFO: renamed from: b */
    public List m6458b(C6915a c6915a) {
        ArrayList arrayList = new ArrayList();
        for (C6915a.c cVar : c6915a.m30328e0()) {
            arrayList.add(AbstractC1692p.c.m7115d(C1693q.m7120z(cVar.m30339d0()), cVar.m30341f0().equals(C6915a.c.d.ARRAY_CONFIG) ? AbstractC1692p.c.a.CONTAINS : cVar.m30340e0().equals(C6915a.c.EnumC7720c.ASCENDING) ? AbstractC1692p.c.a.ASCENDING : AbstractC1692p.c.a.DESCENDING));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    C1694r m6459c(C1866a c1866a) {
        int i7 = a.f5290a[c1866a.m7673f0().ordinal()];
        if (i7 == 1) {
            return m6452a(c1866a.m7672e0(), c1866a.m7674g0());
        }
        if (i7 == 2) {
            return m6453f(c1866a.m7675h0(), c1866a.m7674g0());
        }
        if (i7 == 3) {
            return m6454h(c1866a.m7676i0());
        }
        throw AbstractC2034b.m8457a("Unknown MaybeDocument %s", c1866a);
    }

    /* JADX INFO: renamed from: d */
    public AbstractC1780f m6460d(C7040v c7040v) {
        return this.f5289a.m8169l(c7040v);
    }

    /* JADX INFO: renamed from: e */
    C1781g m6461e(C1870e c1870e) {
        int iM7759k0 = c1870e.m7759k0();
        C1774s c1774sM8173t = this.f5289a.m8173t(c1870e.m7760l0());
        int iM7758j0 = c1870e.m7758j0();
        ArrayList arrayList = new ArrayList(iM7758j0);
        for (int i7 = 0; i7 < iM7758j0; i7++) {
            arrayList.add(this.f5289a.m8169l(c1870e.m7757i0(i7)));
        }
        ArrayList arrayList2 = new ArrayList(c1870e.m7762n0());
        int i8 = 0;
        while (i8 < c1870e.m7762n0()) {
            C7040v c7040vM7761m0 = c1870e.m7761m0(i8);
            int i9 = i8 + 1;
            if (i9 >= c1870e.m7762n0() || !c1870e.m7761m0(i9).m31087r0()) {
                arrayList2.add(this.f5289a.m8169l(c7040vM7761m0));
            } else {
                AbstractC2034b.m8460d(c1870e.m7761m0(i8).m31088s0(), "TransformMutation should be preceded by a patch or set mutation", new Object[0]);
                C7040v.b bVarM31073v0 = C7040v.m31073v0(c7040vM7761m0);
                Iterator it = c1870e.m7761m0(i9).m31081l0().m30739b0().iterator();
                while (it.hasNext()) {
                    bVarM31073v0.m31093x((C7029k.c) it.next());
                }
                arrayList2.add(this.f5289a.m8169l((C7040v) bVarM31073v0.m23721o()));
                i8 = i9;
            }
            i8++;
        }
        return new C1781g(iM7759k0, c1774sM8173t, arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: g */
    C1477B1 m6462g(C1868c c1868c) {
        C1348P c1348pM8165e;
        int iM7720p0 = c1868c.m7720p0();
        C1698v c1698vM8174v = this.f5289a.m8174v(c1868c.m7719o0());
        C1698v c1698vM8174v2 = this.f5289a.m8174v(c1868c.m7715k0());
        AbstractC5104i abstractC5104iM7718n0 = c1868c.m7718n0();
        long jM7716l0 = c1868c.m7716l0();
        int i7 = a.f5291b[c1868c.m7721q0().ordinal()];
        if (i7 == 1) {
            c1348pM8165e = this.f5289a.m8165e(c1868c.m7714j0());
        } else {
            if (i7 != 2) {
                throw AbstractC2034b.m8457a("Unknown targetType %d", c1868c.m7721q0());
            }
            c1348pM8165e = this.f5289a.m8172r(c1868c.m7717m0());
        }
        return new C1477B1(c1348pM8165e, iM7720p0, jM7716l0, EnumC1529b0.LISTEN, c1698vM8174v, c1698vM8174v2, abstractC5104iM7718n0, null);
    }

    /* JADX INFO: renamed from: j */
    public C6915a m6463j(List list) {
        C6915a.b bVarM30325f0 = C6915a.m30325f0();
        bVarM30325f0.m30330y(C6915a.d.COLLECTION_GROUP);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1692p.c cVar = (AbstractC1692p.c) it.next();
            C6915a.c.b bVarM30335g0 = C6915a.c.m30335g0();
            bVarM30335g0.m30344y(cVar.mo7050h().mo7057h());
            if (cVar.mo7051j() == AbstractC1692p.c.a.CONTAINS) {
                bVarM30335g0.m30343x(C6915a.c.a.CONTAINS);
            } else if (cVar.mo7051j() == AbstractC1692p.c.a.ASCENDING) {
                bVarM30335g0.m30345z(C6915a.c.EnumC7720c.ASCENDING);
            } else {
                bVarM30335g0.m30345z(C6915a.c.EnumC7720c.DESCENDING);
            }
            bVarM30325f0.m30329x(bVarM30335g0);
        }
        return (C6915a) bVarM30325f0.m23721o();
    }

    /* JADX INFO: renamed from: k */
    C1866a m6464k(InterfaceC1684h interfaceC1684h) {
        C1866a.b bVarM7666j0 = C1866a.m7666j0();
        if (interfaceC1684h.mo7079h()) {
            bVarM7666j0.m7681z(m6456n(interfaceC1684h));
        } else if (interfaceC1684h.mo7073b()) {
            bVarM7666j0.m7679x(m6455i(interfaceC1684h));
        } else {
            if (!interfaceC1684h.mo7080i()) {
                throw AbstractC2034b.m8457a("Cannot encode invalid document %s", interfaceC1684h);
            }
            bVarM7666j0.m7678A(m6457p(interfaceC1684h));
        }
        bVarM7666j0.m7680y(interfaceC1684h.mo7074c());
        return (C1866a) bVarM7666j0.m23721o();
    }

    /* JADX INFO: renamed from: l */
    public C7040v m6465l(AbstractC1780f abstractC1780f) {
        return this.f5289a.m8156L(abstractC1780f);
    }

    /* JADX INFO: renamed from: m */
    C1870e m6466m(C1781g c1781g) {
        C1870e.b bVarM7752o0 = C1870e.m7752o0();
        bVarM7752o0.m7766z(c1781g.m7473d());
        bVarM7752o0.m7763A(this.f5289a.m8159S(c1781g.m7475f()));
        Iterator it = c1781g.m7472c().iterator();
        while (it.hasNext()) {
            bVarM7752o0.m7764x(this.f5289a.m8156L((AbstractC1780f) it.next()));
        }
        Iterator it2 = c1781g.m7476g().iterator();
        while (it2.hasNext()) {
            bVarM7752o0.m7765y(this.f5289a.m8156L((AbstractC1780f) it2.next()));
        }
        return (C1870e) bVarM7752o0.m23721o();
    }

    /* JADX INFO: renamed from: o */
    C1868c m6467o(C1477B1 c1477b1) {
        EnumC1529b0 enumC1529b0 = EnumC1529b0.LISTEN;
        AbstractC2034b.m8460d(enumC1529b0.equals(c1477b1.m6209c()), "Only queries with purpose %s may be stored, got %s", enumC1529b0, c1477b1.m6209c());
        C1868c.b bVarM7705r0 = C1868c.m7705r0();
        bVarM7705r0.m7726E(c1477b1.m6214h()).m7722A(c1477b1.m6211e()).m7729z(this.f5289a.m8161U(c1477b1.m6208b())).m7725D(this.f5289a.m8161U(c1477b1.m6212f())).m7724C(c1477b1.m6210d());
        C1348P c1348pM6213g = c1477b1.m6213g();
        if (c1348pM6213g.m5825s()) {
            bVarM7705r0.m7728y(this.f5289a.m8152C(c1348pM6213g));
        } else {
            bVarM7705r0.m7723B(this.f5289a.m8157P(c1348pM6213g));
        }
        return (C1868c) bVarM7705r0.m23721o();
    }
}
