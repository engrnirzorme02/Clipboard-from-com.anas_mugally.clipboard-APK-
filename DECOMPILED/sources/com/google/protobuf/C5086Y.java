package com.google.protobuf;

import androidx.appcompat.app.AbstractC2263x;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.Y */
/* JADX INFO: loaded from: classes.dex */
final class C5086Y implements InterfaceC5113m0 {

    /* JADX INFO: renamed from: a */
    private final InterfaceC5082U f19370a;

    /* JADX INFO: renamed from: b */
    private final AbstractC5129u0 f19371b;

    /* JADX INFO: renamed from: c */
    private final boolean f19372c;

    /* JADX INFO: renamed from: d */
    private final AbstractC5122r f19373d;

    private C5086Y(AbstractC5129u0 abstractC5129u0, AbstractC5122r abstractC5122r, InterfaceC5082U interfaceC5082U) {
        this.f19371b = abstractC5129u0;
        this.f19372c = abstractC5122r.mo23568e(interfaceC5082U);
        this.f19373d = abstractC5122r;
        this.f19370a = interfaceC5082U;
    }

    /* JADX INFO: renamed from: k */
    private int m23062k(AbstractC5129u0 abstractC5129u0, Object obj) {
        return abstractC5129u0.mo23628i(abstractC5129u0.mo23626g(obj));
    }

    /* JADX INFO: renamed from: l */
    private void m23063l(AbstractC5129u0 abstractC5129u0, AbstractC5122r abstractC5122r, Object obj, InterfaceC5109k0 interfaceC5109k0, C5120q c5120q) throws Throwable {
        AbstractC5129u0 abstractC5129u1;
        Object objMo23625f = abstractC5129u0.mo23625f(obj);
        C5128u c5128uMo23567d = abstractC5122r.mo23567d(obj);
        while (interfaceC5109k0.mo23333w() != Integer.MAX_VALUE) {
            try {
                abstractC5129u1 = abstractC5129u0;
                AbstractC5122r abstractC5122r2 = abstractC5122r;
                InterfaceC5109k0 interfaceC5109k1 = interfaceC5109k0;
                C5120q c5120q2 = c5120q;
                try {
                    if (!m23065n(interfaceC5109k1, c5120q2, abstractC5122r2, c5128uMo23567d, abstractC5129u1, objMo23625f)) {
                        abstractC5129u1.mo23633o(obj, objMo23625f);
                        return;
                    }
                    interfaceC5109k0 = interfaceC5109k1;
                    c5120q = c5120q2;
                    abstractC5122r = abstractC5122r2;
                    abstractC5129u0 = abstractC5129u1;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    abstractC5129u1.mo23633o(obj, objMo23625f);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                abstractC5129u1 = abstractC5129u0;
            }
        }
        abstractC5129u0.mo23633o(obj, objMo23625f);
    }

    /* JADX INFO: renamed from: m */
    static C5086Y m23064m(AbstractC5129u0 abstractC5129u0, AbstractC5122r abstractC5122r, InterfaceC5082U interfaceC5082U) {
        return new C5086Y(abstractC5129u0, abstractC5122r, interfaceC5082U);
    }

    /* JADX INFO: renamed from: n */
    private boolean m23065n(InterfaceC5109k0 interfaceC5109k0, C5120q c5120q, AbstractC5122r abstractC5122r, C5128u c5128u, AbstractC5129u0 abstractC5129u0, Object obj) throws C5065C {
        int iMo23311a = interfaceC5109k0.mo23311a();
        int iMo23322l = 0;
        if (iMo23311a != AbstractC5062A0.f19257a) {
            if (AbstractC5062A0.m22833b(iMo23311a) != 2) {
                return interfaceC5109k0.mo23297C();
            }
            Object objMo23565b = abstractC5122r.mo23565b(c5120q, this.f19370a, AbstractC5062A0.m22832a(iMo23311a));
            if (objMo23565b == null) {
                return abstractC5129u0.m23631m(obj, interfaceC5109k0, 0);
            }
            abstractC5122r.mo23571h(interfaceC5109k0, objMo23565b, c5120q, c5128u);
            return true;
        }
        Object objMo23565b2 = null;
        AbstractC5104i abstractC5104iMo23336z = null;
        while (interfaceC5109k0.mo23333w() != Integer.MAX_VALUE) {
            int iMo23311a2 = interfaceC5109k0.mo23311a();
            if (iMo23311a2 == AbstractC5062A0.f19259c) {
                iMo23322l = interfaceC5109k0.mo23322l();
                objMo23565b2 = abstractC5122r.mo23565b(c5120q, this.f19370a, iMo23322l);
            } else if (iMo23311a2 == AbstractC5062A0.f19260d) {
                if (objMo23565b2 != null) {
                    abstractC5122r.mo23571h(interfaceC5109k0, objMo23565b2, c5120q, c5128u);
                } else {
                    abstractC5104iMo23336z = interfaceC5109k0.mo23336z();
                }
            } else if (!interfaceC5109k0.mo23297C()) {
                break;
            }
        }
        if (interfaceC5109k0.mo23311a() != AbstractC5062A0.f19258b) {
            throw C5065C.m22891b();
        }
        if (abstractC5104iMo23336z != null) {
            if (objMo23565b2 != null) {
                abstractC5122r.mo23572i(abstractC5104iMo23336z, objMo23565b2, c5120q, c5128u);
            } else {
                abstractC5129u0.mo23623d(obj, iMo23322l, abstractC5104iMo23336z);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    private void m23066o(AbstractC5129u0 abstractC5129u0, Object obj, InterfaceC5064B0 interfaceC5064B0) {
        abstractC5129u0.mo23637s(abstractC5129u0.mo23626g(obj), interfaceC5064B0);
    }

    @Override // com.google.protobuf.InterfaceC5113m0
    /* JADX INFO: renamed from: a */
    public void mo23051a(Object obj, Object obj2) {
        AbstractC5117o0.m23480F(this.f19371b, obj, obj2);
        if (this.f19372c) {
            AbstractC5117o0.m23478D(this.f19373d, obj, obj2);
        }
    }

    @Override // com.google.protobuf.InterfaceC5113m0
    /* JADX INFO: renamed from: b */
    public void mo23052b(Object obj) {
        this.f19371b.mo23629j(obj);
        this.f19373d.mo23569f(obj);
    }

    @Override // com.google.protobuf.InterfaceC5113m0
    /* JADX INFO: renamed from: c */
    public final boolean mo23053c(Object obj) {
        return this.f19373d.mo23566c(obj).m23610k();
    }

    @Override // com.google.protobuf.InterfaceC5113m0
    /* JADX INFO: renamed from: d */
    public boolean mo23054d(Object obj, Object obj2) {
        if (!this.f19371b.mo23626g(obj).equals(this.f19371b.mo23626g(obj2))) {
            return false;
        }
        if (this.f19372c) {
            return this.f19373d.mo23566c(obj).equals(this.f19373d.mo23566c(obj2));
        }
        return true;
    }

    @Override // com.google.protobuf.InterfaceC5113m0
    /* JADX INFO: renamed from: e */
    public int mo23056e(Object obj) {
        int iM23062k = m23062k(this.f19371b, obj);
        return this.f19372c ? iM23062k + this.f19373d.mo23566c(obj).m23607f() : iM23062k;
    }

    @Override // com.google.protobuf.InterfaceC5113m0
    /* JADX INFO: renamed from: f */
    public Object mo23057f() {
        InterfaceC5082U interfaceC5082U = this.f19370a;
        return interfaceC5082U instanceof AbstractC5136y ? ((AbstractC5136y) interfaceC5082U).m23707O() : interfaceC5082U.mo22970c().mo22975m();
    }

    @Override // com.google.protobuf.InterfaceC5113m0
    /* JADX INFO: renamed from: g */
    public int mo23058g(Object obj) {
        int iHashCode = this.f19371b.mo23626g(obj).hashCode();
        return this.f19372c ? (iHashCode * 53) + this.f19373d.mo23566c(obj).hashCode() : iHashCode;
    }

    @Override // com.google.protobuf.InterfaceC5113m0
    /* JADX INFO: renamed from: h */
    public void mo23059h(Object obj, InterfaceC5064B0 interfaceC5064B0) {
        Iterator itM23611n = this.f19373d.mo23566c(obj).m23611n();
        if (itM23611n.hasNext()) {
            AbstractC2263x.m9328a(((Map.Entry) itM23611n.next()).getKey());
            throw null;
        }
        m23066o(this.f19371b, obj, interfaceC5064B0);
    }

    @Override // com.google.protobuf.InterfaceC5113m0
    /* JADX INFO: renamed from: i */
    public void mo23060i(Object obj, InterfaceC5109k0 interfaceC5109k0, C5120q c5120q) throws Throwable {
        m23063l(this.f19371b, this.f19373d, obj, interfaceC5109k0, c5120q);
    }

    @Override // com.google.protobuf.InterfaceC5113m0
    /* JADX INFO: renamed from: j */
    public void mo23061j(Object obj, byte[] bArr, int i7, int i8, AbstractC5098f.a aVar) {
        AbstractC5136y abstractC5136y = (AbstractC5136y) obj;
        if (abstractC5136y.unknownFields == C5131v0.m23641c()) {
            abstractC5136y.unknownFields = C5131v0.m23645k();
        }
        AbstractC2263x.m9328a(obj);
        throw null;
    }
}
