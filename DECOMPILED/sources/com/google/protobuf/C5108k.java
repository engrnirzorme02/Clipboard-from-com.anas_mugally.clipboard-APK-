package com.google.protobuf;

import com.google.android.gms.common.api.C3553a;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.k */
/* JADX INFO: loaded from: classes.dex */
final class C5108k implements InterfaceC5109k0 {

    /* JADX INFO: renamed from: a */
    private final AbstractC5106j f19466a;

    /* JADX INFO: renamed from: b */
    private int f19467b;

    /* JADX INFO: renamed from: c */
    private int f19468c;

    /* JADX INFO: renamed from: d */
    private int f19469d = 0;

    /* JADX INFO: renamed from: com.google.protobuf.k$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f19470a;

        static {
            int[] iArr = new int[AbstractC5062A0.b.values().length];
            f19470a = iArr;
            try {
                iArr[AbstractC5062A0.b.f19274u.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19470a[AbstractC5062A0.b.f19278y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19470a[AbstractC5062A0.b.f19267c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19470a[AbstractC5062A0.b.f19261A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19470a[AbstractC5062A0.b.f19273t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19470a[AbstractC5062A0.b.f19272s.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19470a[AbstractC5062A0.b.f19268d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19470a[AbstractC5062A0.b.f19271r.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19470a[AbstractC5062A0.b.f19269e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19470a[AbstractC5062A0.b.f19277x.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19470a[AbstractC5062A0.b.f19262B.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19470a[AbstractC5062A0.b.f19263C.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19470a[AbstractC5062A0.b.f19264D.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19470a[AbstractC5062A0.b.f19265E.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19470a[AbstractC5062A0.b.f19275v.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19470a[AbstractC5062A0.b.f19279z.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f19470a[AbstractC5062A0.b.f19270f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private C5108k(AbstractC5106j abstractC5106j) {
        AbstractC5106j abstractC5106j2 = (AbstractC5106j) AbstractC5063B.m22838b(abstractC5106j, "input");
        this.f19466a = abstractC5106j2;
        abstractC5106j2.f19418d = this;
    }

    /* JADX INFO: renamed from: O */
    public static C5108k m23285O(AbstractC5106j abstractC5106j) {
        C5108k c5108k = abstractC5106j.f19418d;
        return c5108k != null ? c5108k : new C5108k(abstractC5106j);
    }

    /* JADX INFO: renamed from: P */
    private void m23286P(Object obj, InterfaceC5113m0 interfaceC5113m0, C5120q c5120q) {
        int i7 = this.f19468c;
        this.f19468c = AbstractC5062A0.m22834c(AbstractC5062A0.m22832a(this.f19467b), 4);
        try {
            interfaceC5113m0.mo23060i(obj, this, c5120q);
            if (this.f19467b != this.f19468c) {
                throw C5065C.m22897h();
            }
            this.f19468c = i7;
        } catch (Throwable th) {
            this.f19468c = i7;
            throw th;
        }
    }

    /* JADX INFO: renamed from: Q */
    private void m23287Q(Object obj, InterfaceC5113m0 interfaceC5113m0, C5120q c5120q) throws C5065C {
        int iMo23197F = this.f19466a.mo23197F();
        AbstractC5106j abstractC5106j = this.f19466a;
        if (abstractC5106j.f19415a >= abstractC5106j.f19416b) {
            throw C5065C.m22898i();
        }
        int iMo23208o = abstractC5106j.mo23208o(iMo23197F);
        this.f19466a.f19415a++;
        interfaceC5113m0.mo23060i(obj, this, c5120q);
        this.f19466a.mo23203a(0);
        AbstractC5106j abstractC5106j2 = this.f19466a;
        abstractC5106j2.f19415a--;
        abstractC5106j2.mo23207n(iMo23208o);
    }

    /* JADX INFO: renamed from: R */
    private Object m23288R(AbstractC5062A0.b bVar, Class cls, C5120q c5120q) {
        switch (a.f19470a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo23319i());
            case 2:
                return mo23336z();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo23327q());
            case 5:
                return Integer.valueOf(mo23318h());
            case 6:
                return Long.valueOf(mo23314d());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(mo23296B());
            case 9:
                return Long.valueOf(mo23301G());
            case 10:
                return m23309U(cls, c5120q);
            case 11:
                return Integer.valueOf(mo23298D());
            case 12:
                return Long.valueOf(mo23320j());
            case 13:
                return Integer.valueOf(mo23329s());
            case 14:
                return Long.valueOf(mo23330t());
            case 15:
                return mo23302H();
            case 16:
                return Integer.valueOf(mo23322l());
            case 17:
                return Long.valueOf(mo23313c());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    /* JADX INFO: renamed from: S */
    private Object m23289S(InterfaceC5113m0 interfaceC5113m0, C5120q c5120q) {
        Object objMo23057f = interfaceC5113m0.mo23057f();
        m23286P(objMo23057f, interfaceC5113m0, c5120q);
        interfaceC5113m0.mo23052b(objMo23057f);
        return objMo23057f;
    }

    /* JADX INFO: renamed from: T */
    private Object m23290T(InterfaceC5113m0 interfaceC5113m0, C5120q c5120q) throws C5065C {
        Object objMo23057f = interfaceC5113m0.mo23057f();
        m23287Q(objMo23057f, interfaceC5113m0, c5120q);
        interfaceC5113m0.mo23052b(objMo23057f);
        return objMo23057f;
    }

    /* JADX INFO: renamed from: W */
    private void m23291W(int i7) throws C5065C {
        if (this.f19466a.mo23205e() != i7) {
            throw C5065C.m22900m();
        }
    }

    /* JADX INFO: renamed from: X */
    private void m23292X(int i7) throws C5065C.a {
        if (AbstractC5062A0.m22833b(this.f19467b) != i7) {
            throw C5065C.m22894e();
        }
    }

    /* JADX INFO: renamed from: Y */
    private void m23293Y(int i7) throws C5065C {
        if ((i7 & 3) != 0) {
            throw C5065C.m22897h();
        }
    }

    /* JADX INFO: renamed from: Z */
    private void m23294Z(int i7) throws C5065C {
        if ((i7 & 7) != 0) {
            throw C5065C.m22897h();
        }
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: A */
    public void mo23295A(List list) throws C5065C {
        int iMo23196E;
        int iMo23196E2;
        if (!(list instanceof AbstractC5132w)) {
            int iM22833b = AbstractC5062A0.m22833b(this.f19467b);
            if (iM22833b == 2) {
                int iMo23197F = this.f19466a.mo23197F();
                m23293Y(iMo23197F);
                int iMo23205e = this.f19466a.mo23205e() + iMo23197F;
                do {
                    list.add(Float.valueOf(this.f19466a.mo23215v()));
                } while (this.f19466a.mo23205e() < iMo23205e);
                return;
            }
            if (iM22833b != 5) {
                throw C5065C.m22894e();
            }
            do {
                list.add(Float.valueOf(this.f19466a.mo23215v()));
                if (this.f19466a.mo23206f()) {
                    return;
                } else {
                    iMo23196E = this.f19466a.mo23196E();
                }
            } while (iMo23196E == this.f19467b);
            this.f19469d = iMo23196E;
            return;
        }
        AbstractC5132w abstractC5132w = (AbstractC5132w) list;
        int iM22833b2 = AbstractC5062A0.m22833b(this.f19467b);
        if (iM22833b2 == 2) {
            int iMo23197F2 = this.f19466a.mo23197F();
            m23293Y(iMo23197F2);
            int iMo23205e2 = this.f19466a.mo23205e() + iMo23197F2;
            do {
                abstractC5132w.m23658b(this.f19466a.mo23215v());
            } while (this.f19466a.mo23205e() < iMo23205e2);
            return;
        }
        if (iM22833b2 != 5) {
            throw C5065C.m22894e();
        }
        do {
            abstractC5132w.m23658b(this.f19466a.mo23215v());
            if (this.f19466a.mo23206f()) {
                return;
            } else {
                iMo23196E2 = this.f19466a.mo23196E();
            }
        } while (iMo23196E2 == this.f19467b);
        this.f19469d = iMo23196E2;
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: B */
    public int mo23296B() throws C5065C.a {
        m23292X(0);
        return this.f19466a.mo23216w();
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: C */
    public boolean mo23297C() {
        int i7;
        if (this.f19466a.mo23206f() || (i7 = this.f19467b) == this.f19468c) {
            return false;
        }
        return this.f19466a.mo23201J(i7);
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: D */
    public int mo23298D() throws C5065C.a {
        m23292X(5);
        return this.f19466a.mo23218y();
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: E */
    public void mo23299E(List list) throws C5065C.a {
        int iMo23196E;
        if (AbstractC5062A0.m22833b(this.f19467b) != 2) {
            throw C5065C.m22894e();
        }
        do {
            list.add(mo23336z());
            if (this.f19466a.mo23206f()) {
                return;
            } else {
                iMo23196E = this.f19466a.mo23196E();
            }
        } while (iMo23196E == this.f19467b);
        this.f19469d = iMo23196E;
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: F */
    public void mo23300F(List list) throws C5065C {
        int iMo23196E;
        int iMo23196E2;
        if (!(list instanceof AbstractC5114n)) {
            int iM22833b = AbstractC5062A0.m22833b(this.f19467b);
            if (iM22833b == 1) {
                do {
                    list.add(Double.valueOf(this.f19466a.mo23211r()));
                    if (this.f19466a.mo23206f()) {
                        return;
                    } else {
                        iMo23196E = this.f19466a.mo23196E();
                    }
                } while (iMo23196E == this.f19467b);
                this.f19469d = iMo23196E;
                return;
            }
            if (iM22833b != 2) {
                throw C5065C.m22894e();
            }
            int iMo23197F = this.f19466a.mo23197F();
            m23294Z(iMo23197F);
            int iMo23205e = this.f19466a.mo23205e() + iMo23197F;
            do {
                list.add(Double.valueOf(this.f19466a.mo23211r()));
            } while (this.f19466a.mo23205e() < iMo23205e);
            return;
        }
        AbstractC5114n abstractC5114n = (AbstractC5114n) list;
        int iM22833b2 = AbstractC5062A0.m22833b(this.f19467b);
        if (iM22833b2 == 1) {
            do {
                abstractC5114n.m23474b(this.f19466a.mo23211r());
                if (this.f19466a.mo23206f()) {
                    return;
                } else {
                    iMo23196E2 = this.f19466a.mo23196E();
                }
            } while (iMo23196E2 == this.f19467b);
            this.f19469d = iMo23196E2;
            return;
        }
        if (iM22833b2 != 2) {
            throw C5065C.m22894e();
        }
        int iMo23197F2 = this.f19466a.mo23197F();
        m23294Z(iMo23197F2);
        int iMo23205e2 = this.f19466a.mo23205e() + iMo23197F2;
        do {
            abstractC5114n.m23474b(this.f19466a.mo23211r());
        } while (this.f19466a.mo23205e() < iMo23205e2);
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: G */
    public long mo23301G() throws C5065C.a {
        m23292X(0);
        return this.f19466a.mo23217x();
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: H */
    public String mo23302H() throws C5065C.a {
        m23292X(2);
        return this.f19466a.mo23195D();
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: I */
    public void mo23303I(List list) throws C5065C {
        int iMo23196E;
        int iMo23196E2;
        if (!(list instanceof AbstractC5073K)) {
            int iM22833b = AbstractC5062A0.m22833b(this.f19467b);
            if (iM22833b == 1) {
                do {
                    list.add(Long.valueOf(this.f19466a.mo23214u()));
                    if (this.f19466a.mo23206f()) {
                        return;
                    } else {
                        iMo23196E = this.f19466a.mo23196E();
                    }
                } while (iMo23196E == this.f19467b);
                this.f19469d = iMo23196E;
                return;
            }
            if (iM22833b != 2) {
                throw C5065C.m22894e();
            }
            int iMo23197F = this.f19466a.mo23197F();
            m23294Z(iMo23197F);
            int iMo23205e = this.f19466a.mo23205e() + iMo23197F;
            do {
                list.add(Long.valueOf(this.f19466a.mo23214u()));
            } while (this.f19466a.mo23205e() < iMo23205e);
            return;
        }
        AbstractC5073K abstractC5073K = (AbstractC5073K) list;
        int iM22833b2 = AbstractC5062A0.m22833b(this.f19467b);
        if (iM22833b2 == 1) {
            do {
                abstractC5073K.m22928b(this.f19466a.mo23214u());
                if (this.f19466a.mo23206f()) {
                    return;
                } else {
                    iMo23196E2 = this.f19466a.mo23196E();
                }
            } while (iMo23196E2 == this.f19467b);
            this.f19469d = iMo23196E2;
            return;
        }
        if (iM22833b2 != 2) {
            throw C5065C.m22894e();
        }
        int iMo23197F2 = this.f19466a.mo23197F();
        m23294Z(iMo23197F2);
        int iMo23205e2 = this.f19466a.mo23205e() + iMo23197F2;
        do {
            abstractC5073K.m22928b(this.f19466a.mo23214u());
        } while (this.f19466a.mo23205e() < iMo23205e2);
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: J */
    public void mo23304J(List list, InterfaceC5113m0 interfaceC5113m0, C5120q c5120q) throws C5065C.a {
        int iMo23196E;
        if (AbstractC5062A0.m22833b(this.f19467b) != 3) {
            throw C5065C.m22894e();
        }
        int i7 = this.f19467b;
        do {
            list.add(m23289S(interfaceC5113m0, c5120q));
            if (this.f19466a.mo23206f() || this.f19469d != 0) {
                return;
            } else {
                iMo23196E = this.f19466a.mo23196E();
            }
        } while (iMo23196E == i7);
        this.f19469d = iMo23196E;
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: K */
    public void mo23305K(Object obj, InterfaceC5113m0 interfaceC5113m0, C5120q c5120q) throws C5065C.a {
        m23292X(3);
        m23286P(obj, interfaceC5113m0, c5120q);
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: L */
    public void mo23306L(List list, InterfaceC5113m0 interfaceC5113m0, C5120q c5120q) throws C5065C.a {
        int iMo23196E;
        if (AbstractC5062A0.m22833b(this.f19467b) != 2) {
            throw C5065C.m22894e();
        }
        int i7 = this.f19467b;
        do {
            list.add(m23290T(interfaceC5113m0, c5120q));
            if (this.f19466a.mo23206f() || this.f19469d != 0) {
                return;
            } else {
                iMo23196E = this.f19466a.mo23196E();
            }
        } while (iMo23196E == i7);
        this.f19469d = iMo23196E;
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: M */
    public void mo23307M(Object obj, InterfaceC5113m0 interfaceC5113m0, C5120q c5120q) throws C5065C {
        m23292X(2);
        m23287Q(obj, interfaceC5113m0, c5120q);
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: N */
    public void mo23308N(Map map, C5075M.a aVar, C5120q c5120q) throws C5065C.a {
        m23292X(2);
        int iMo23208o = this.f19466a.mo23208o(this.f19466a.mo23197F());
        Object objM23288R = aVar.f19342b;
        Object objM23288R2 = aVar.f19344d;
        while (true) {
            try {
                int iMo23333w = mo23333w();
                if (iMo23333w == Integer.MAX_VALUE || this.f19466a.mo23206f()) {
                    break;
                }
                if (iMo23333w == 1) {
                    objM23288R = m23288R(aVar.f19341a, null, null);
                } else if (iMo23333w != 2) {
                    try {
                        if (!mo23297C()) {
                            throw new C5065C("Unable to parse map entry.");
                        }
                    } catch (C5065C.a unused) {
                        if (!mo23297C()) {
                            throw new C5065C("Unable to parse map entry.");
                        }
                    }
                } else {
                    objM23288R2 = m23288R(aVar.f19343c, aVar.f19344d.getClass(), c5120q);
                }
            } catch (Throwable th) {
                this.f19466a.mo23207n(iMo23208o);
                throw th;
            }
        }
        map.put(objM23288R, objM23288R2);
        this.f19466a.mo23207n(iMo23208o);
    }

    /* JADX INFO: renamed from: U */
    public Object m23309U(Class cls, C5120q c5120q) throws C5065C.a {
        m23292X(2);
        return m23290T(C5103h0.m23146a().m23148c(cls), c5120q);
    }

    /* JADX INFO: renamed from: V */
    public void m23310V(List list, boolean z7) throws C5065C.a {
        int iMo23196E;
        int iMo23196E2;
        if (AbstractC5062A0.m22833b(this.f19467b) != 2) {
            throw C5065C.m22894e();
        }
        if (!(list instanceof InterfaceC5071I) || z7) {
            do {
                list.add(z7 ? mo23302H() : mo23332v());
                if (this.f19466a.mo23206f()) {
                    return;
                } else {
                    iMo23196E = this.f19466a.mo23196E();
                }
            } while (iMo23196E == this.f19467b);
            this.f19469d = iMo23196E;
            return;
        }
        InterfaceC5071I interfaceC5071I = (InterfaceC5071I) list;
        do {
            interfaceC5071I.mo22918o(mo23336z());
            if (this.f19466a.mo23206f()) {
                return;
            } else {
                iMo23196E2 = this.f19466a.mo23196E();
            }
        } while (iMo23196E2 == this.f19467b);
        this.f19469d = iMo23196E2;
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: a */
    public int mo23311a() {
        return this.f19467b;
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: b */
    public void mo23312b(List list) throws C5065C {
        int iMo23196E;
        int iMo23196E2;
        if (!(list instanceof C5061A)) {
            int iM22833b = AbstractC5062A0.m22833b(this.f19467b);
            if (iM22833b == 0) {
                do {
                    list.add(Integer.valueOf(this.f19466a.mo23192A()));
                    if (this.f19466a.mo23206f()) {
                        return;
                    } else {
                        iMo23196E = this.f19466a.mo23196E();
                    }
                } while (iMo23196E == this.f19467b);
                this.f19469d = iMo23196E;
                return;
            }
            if (iM22833b != 2) {
                throw C5065C.m22894e();
            }
            int iMo23205e = this.f19466a.mo23205e() + this.f19466a.mo23197F();
            do {
                list.add(Integer.valueOf(this.f19466a.mo23192A()));
            } while (this.f19466a.mo23205e() < iMo23205e);
            m23291W(iMo23205e);
            return;
        }
        C5061A c5061a = (C5061A) list;
        int iM22833b2 = AbstractC5062A0.m22833b(this.f19467b);
        if (iM22833b2 == 0) {
            do {
                c5061a.m22825g(this.f19466a.mo23192A());
                if (this.f19466a.mo23206f()) {
                    return;
                } else {
                    iMo23196E2 = this.f19466a.mo23196E();
                }
            } while (iMo23196E2 == this.f19467b);
            this.f19469d = iMo23196E2;
            return;
        }
        if (iM22833b2 != 2) {
            throw C5065C.m22894e();
        }
        int iMo23205e2 = this.f19466a.mo23205e() + this.f19466a.mo23197F();
        do {
            c5061a.m22825g(this.f19466a.mo23192A());
        } while (this.f19466a.mo23205e() < iMo23205e2);
        m23291W(iMo23205e2);
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: c */
    public long mo23313c() throws C5065C.a {
        m23292X(0);
        return this.f19466a.mo23198G();
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: d */
    public long mo23314d() throws C5065C.a {
        m23292X(1);
        return this.f19466a.mo23214u();
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: e */
    public void mo23315e(List list) throws C5065C {
        int iMo23196E;
        int iMo23196E2;
        if (!(list instanceof C5061A)) {
            int iM22833b = AbstractC5062A0.m22833b(this.f19467b);
            if (iM22833b == 2) {
                int iMo23197F = this.f19466a.mo23197F();
                m23293Y(iMo23197F);
                int iMo23205e = this.f19466a.mo23205e() + iMo23197F;
                do {
                    list.add(Integer.valueOf(this.f19466a.mo23218y()));
                } while (this.f19466a.mo23205e() < iMo23205e);
                return;
            }
            if (iM22833b != 5) {
                throw C5065C.m22894e();
            }
            do {
                list.add(Integer.valueOf(this.f19466a.mo23218y()));
                if (this.f19466a.mo23206f()) {
                    return;
                } else {
                    iMo23196E = this.f19466a.mo23196E();
                }
            } while (iMo23196E == this.f19467b);
            this.f19469d = iMo23196E;
            return;
        }
        C5061A c5061a = (C5061A) list;
        int iM22833b2 = AbstractC5062A0.m22833b(this.f19467b);
        if (iM22833b2 == 2) {
            int iMo23197F2 = this.f19466a.mo23197F();
            m23293Y(iMo23197F2);
            int iMo23205e2 = this.f19466a.mo23205e() + iMo23197F2;
            do {
                c5061a.m22825g(this.f19466a.mo23218y());
            } while (this.f19466a.mo23205e() < iMo23205e2);
            return;
        }
        if (iM22833b2 != 5) {
            throw C5065C.m22894e();
        }
        do {
            c5061a.m22825g(this.f19466a.mo23218y());
            if (this.f19466a.mo23206f()) {
                return;
            } else {
                iMo23196E2 = this.f19466a.mo23196E();
            }
        } while (iMo23196E2 == this.f19467b);
        this.f19469d = iMo23196E2;
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: f */
    public void mo23316f(List list) throws C5065C {
        int iMo23196E;
        int iMo23196E2;
        if (!(list instanceof AbstractC5073K)) {
            int iM22833b = AbstractC5062A0.m22833b(this.f19467b);
            if (iM22833b == 0) {
                do {
                    list.add(Long.valueOf(this.f19466a.mo23193B()));
                    if (this.f19466a.mo23206f()) {
                        return;
                    } else {
                        iMo23196E = this.f19466a.mo23196E();
                    }
                } while (iMo23196E == this.f19467b);
                this.f19469d = iMo23196E;
                return;
            }
            if (iM22833b != 2) {
                throw C5065C.m22894e();
            }
            int iMo23205e = this.f19466a.mo23205e() + this.f19466a.mo23197F();
            do {
                list.add(Long.valueOf(this.f19466a.mo23193B()));
            } while (this.f19466a.mo23205e() < iMo23205e);
            m23291W(iMo23205e);
            return;
        }
        AbstractC5073K abstractC5073K = (AbstractC5073K) list;
        int iM22833b2 = AbstractC5062A0.m22833b(this.f19467b);
        if (iM22833b2 == 0) {
            do {
                abstractC5073K.m22928b(this.f19466a.mo23193B());
                if (this.f19466a.mo23206f()) {
                    return;
                } else {
                    iMo23196E2 = this.f19466a.mo23196E();
                }
            } while (iMo23196E2 == this.f19467b);
            this.f19469d = iMo23196E2;
            return;
        }
        if (iM22833b2 != 2) {
            throw C5065C.m22894e();
        }
        int iMo23205e2 = this.f19466a.mo23205e() + this.f19466a.mo23197F();
        do {
            abstractC5073K.m22928b(this.f19466a.mo23193B());
        } while (this.f19466a.mo23205e() < iMo23205e2);
        m23291W(iMo23205e2);
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: g */
    public void mo23317g(List list) throws C5065C {
        int iMo23196E;
        int iMo23196E2;
        if (!(list instanceof C5061A)) {
            int iM22833b = AbstractC5062A0.m22833b(this.f19467b);
            if (iM22833b == 0) {
                do {
                    list.add(Integer.valueOf(this.f19466a.mo23197F()));
                    if (this.f19466a.mo23206f()) {
                        return;
                    } else {
                        iMo23196E = this.f19466a.mo23196E();
                    }
                } while (iMo23196E == this.f19467b);
                this.f19469d = iMo23196E;
                return;
            }
            if (iM22833b != 2) {
                throw C5065C.m22894e();
            }
            int iMo23205e = this.f19466a.mo23205e() + this.f19466a.mo23197F();
            do {
                list.add(Integer.valueOf(this.f19466a.mo23197F()));
            } while (this.f19466a.mo23205e() < iMo23205e);
            m23291W(iMo23205e);
            return;
        }
        C5061A c5061a = (C5061A) list;
        int iM22833b2 = AbstractC5062A0.m22833b(this.f19467b);
        if (iM22833b2 == 0) {
            do {
                c5061a.m22825g(this.f19466a.mo23197F());
                if (this.f19466a.mo23206f()) {
                    return;
                } else {
                    iMo23196E2 = this.f19466a.mo23196E();
                }
            } while (iMo23196E2 == this.f19467b);
            this.f19469d = iMo23196E2;
            return;
        }
        if (iM22833b2 != 2) {
            throw C5065C.m22894e();
        }
        int iMo23205e2 = this.f19466a.mo23205e() + this.f19466a.mo23197F();
        do {
            c5061a.m22825g(this.f19466a.mo23197F());
        } while (this.f19466a.mo23205e() < iMo23205e2);
        m23291W(iMo23205e2);
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: h */
    public int mo23318h() throws C5065C.a {
        m23292X(5);
        return this.f19466a.mo23213t();
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: i */
    public boolean mo23319i() throws C5065C.a {
        m23292X(0);
        return this.f19466a.mo23209p();
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: j */
    public long mo23320j() throws C5065C.a {
        m23292X(1);
        return this.f19466a.mo23219z();
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: k */
    public void mo23321k(List list) throws C5065C {
        int iMo23196E;
        int iMo23196E2;
        if (!(list instanceof AbstractC5073K)) {
            int iM22833b = AbstractC5062A0.m22833b(this.f19467b);
            if (iM22833b == 0) {
                do {
                    list.add(Long.valueOf(this.f19466a.mo23198G()));
                    if (this.f19466a.mo23206f()) {
                        return;
                    } else {
                        iMo23196E = this.f19466a.mo23196E();
                    }
                } while (iMo23196E == this.f19467b);
                this.f19469d = iMo23196E;
                return;
            }
            if (iM22833b != 2) {
                throw C5065C.m22894e();
            }
            int iMo23205e = this.f19466a.mo23205e() + this.f19466a.mo23197F();
            do {
                list.add(Long.valueOf(this.f19466a.mo23198G()));
            } while (this.f19466a.mo23205e() < iMo23205e);
            m23291W(iMo23205e);
            return;
        }
        AbstractC5073K abstractC5073K = (AbstractC5073K) list;
        int iM22833b2 = AbstractC5062A0.m22833b(this.f19467b);
        if (iM22833b2 == 0) {
            do {
                abstractC5073K.m22928b(this.f19466a.mo23198G());
                if (this.f19466a.mo23206f()) {
                    return;
                } else {
                    iMo23196E2 = this.f19466a.mo23196E();
                }
            } while (iMo23196E2 == this.f19467b);
            this.f19469d = iMo23196E2;
            return;
        }
        if (iM22833b2 != 2) {
            throw C5065C.m22894e();
        }
        int iMo23205e2 = this.f19466a.mo23205e() + this.f19466a.mo23197F();
        do {
            abstractC5073K.m22928b(this.f19466a.mo23198G());
        } while (this.f19466a.mo23205e() < iMo23205e2);
        m23291W(iMo23205e2);
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: l */
    public int mo23322l() throws C5065C.a {
        m23292X(0);
        return this.f19466a.mo23197F();
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: m */
    public void mo23323m(List list) throws C5065C {
        int iMo23196E;
        int iMo23196E2;
        if (!(list instanceof AbstractC5073K)) {
            int iM22833b = AbstractC5062A0.m22833b(this.f19467b);
            if (iM22833b == 0) {
                do {
                    list.add(Long.valueOf(this.f19466a.mo23217x()));
                    if (this.f19466a.mo23206f()) {
                        return;
                    } else {
                        iMo23196E = this.f19466a.mo23196E();
                    }
                } while (iMo23196E == this.f19467b);
                this.f19469d = iMo23196E;
                return;
            }
            if (iM22833b != 2) {
                throw C5065C.m22894e();
            }
            int iMo23205e = this.f19466a.mo23205e() + this.f19466a.mo23197F();
            do {
                list.add(Long.valueOf(this.f19466a.mo23217x()));
            } while (this.f19466a.mo23205e() < iMo23205e);
            m23291W(iMo23205e);
            return;
        }
        AbstractC5073K abstractC5073K = (AbstractC5073K) list;
        int iM22833b2 = AbstractC5062A0.m22833b(this.f19467b);
        if (iM22833b2 == 0) {
            do {
                abstractC5073K.m22928b(this.f19466a.mo23217x());
                if (this.f19466a.mo23206f()) {
                    return;
                } else {
                    iMo23196E2 = this.f19466a.mo23196E();
                }
            } while (iMo23196E2 == this.f19467b);
            this.f19469d = iMo23196E2;
            return;
        }
        if (iM22833b2 != 2) {
            throw C5065C.m22894e();
        }
        int iMo23205e2 = this.f19466a.mo23205e() + this.f19466a.mo23197F();
        do {
            abstractC5073K.m22928b(this.f19466a.mo23217x());
        } while (this.f19466a.mo23205e() < iMo23205e2);
        m23291W(iMo23205e2);
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: n */
    public void mo23324n(List list) throws C5065C {
        int iMo23196E;
        int iMo23196E2;
        if (!(list instanceof AbstractC5073K)) {
            int iM22833b = AbstractC5062A0.m22833b(this.f19467b);
            if (iM22833b == 1) {
                do {
                    list.add(Long.valueOf(this.f19466a.mo23219z()));
                    if (this.f19466a.mo23206f()) {
                        return;
                    } else {
                        iMo23196E = this.f19466a.mo23196E();
                    }
                } while (iMo23196E == this.f19467b);
                this.f19469d = iMo23196E;
                return;
            }
            if (iM22833b != 2) {
                throw C5065C.m22894e();
            }
            int iMo23197F = this.f19466a.mo23197F();
            m23294Z(iMo23197F);
            int iMo23205e = this.f19466a.mo23205e() + iMo23197F;
            do {
                list.add(Long.valueOf(this.f19466a.mo23219z()));
            } while (this.f19466a.mo23205e() < iMo23205e);
            return;
        }
        AbstractC5073K abstractC5073K = (AbstractC5073K) list;
        int iM22833b2 = AbstractC5062A0.m22833b(this.f19467b);
        if (iM22833b2 == 1) {
            do {
                abstractC5073K.m22928b(this.f19466a.mo23219z());
                if (this.f19466a.mo23206f()) {
                    return;
                } else {
                    iMo23196E2 = this.f19466a.mo23196E();
                }
            } while (iMo23196E2 == this.f19467b);
            this.f19469d = iMo23196E2;
            return;
        }
        if (iM22833b2 != 2) {
            throw C5065C.m22894e();
        }
        int iMo23197F2 = this.f19466a.mo23197F();
        m23294Z(iMo23197F2);
        int iMo23205e2 = this.f19466a.mo23205e() + iMo23197F2;
        do {
            abstractC5073K.m22928b(this.f19466a.mo23219z());
        } while (this.f19466a.mo23205e() < iMo23205e2);
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: o */
    public void mo23325o(List list) throws C5065C {
        int iMo23196E;
        int iMo23196E2;
        if (!(list instanceof C5061A)) {
            int iM22833b = AbstractC5062A0.m22833b(this.f19467b);
            if (iM22833b == 0) {
                do {
                    list.add(Integer.valueOf(this.f19466a.mo23216w()));
                    if (this.f19466a.mo23206f()) {
                        return;
                    } else {
                        iMo23196E = this.f19466a.mo23196E();
                    }
                } while (iMo23196E == this.f19467b);
                this.f19469d = iMo23196E;
                return;
            }
            if (iM22833b != 2) {
                throw C5065C.m22894e();
            }
            int iMo23205e = this.f19466a.mo23205e() + this.f19466a.mo23197F();
            do {
                list.add(Integer.valueOf(this.f19466a.mo23216w()));
            } while (this.f19466a.mo23205e() < iMo23205e);
            m23291W(iMo23205e);
            return;
        }
        C5061A c5061a = (C5061A) list;
        int iM22833b2 = AbstractC5062A0.m22833b(this.f19467b);
        if (iM22833b2 == 0) {
            do {
                c5061a.m22825g(this.f19466a.mo23216w());
                if (this.f19466a.mo23206f()) {
                    return;
                } else {
                    iMo23196E2 = this.f19466a.mo23196E();
                }
            } while (iMo23196E2 == this.f19467b);
            this.f19469d = iMo23196E2;
            return;
        }
        if (iM22833b2 != 2) {
            throw C5065C.m22894e();
        }
        int iMo23205e2 = this.f19466a.mo23205e() + this.f19466a.mo23197F();
        do {
            c5061a.m22825g(this.f19466a.mo23216w());
        } while (this.f19466a.mo23205e() < iMo23205e2);
        m23291W(iMo23205e2);
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: p */
    public void mo23326p(List list) throws C5065C {
        int iMo23196E;
        int iMo23196E2;
        if (!(list instanceof C5061A)) {
            int iM22833b = AbstractC5062A0.m22833b(this.f19467b);
            if (iM22833b == 0) {
                do {
                    list.add(Integer.valueOf(this.f19466a.mo23212s()));
                    if (this.f19466a.mo23206f()) {
                        return;
                    } else {
                        iMo23196E = this.f19466a.mo23196E();
                    }
                } while (iMo23196E == this.f19467b);
                this.f19469d = iMo23196E;
                return;
            }
            if (iM22833b != 2) {
                throw C5065C.m22894e();
            }
            int iMo23205e = this.f19466a.mo23205e() + this.f19466a.mo23197F();
            do {
                list.add(Integer.valueOf(this.f19466a.mo23212s()));
            } while (this.f19466a.mo23205e() < iMo23205e);
            m23291W(iMo23205e);
            return;
        }
        C5061A c5061a = (C5061A) list;
        int iM22833b2 = AbstractC5062A0.m22833b(this.f19467b);
        if (iM22833b2 == 0) {
            do {
                c5061a.m22825g(this.f19466a.mo23212s());
                if (this.f19466a.mo23206f()) {
                    return;
                } else {
                    iMo23196E2 = this.f19466a.mo23196E();
                }
            } while (iMo23196E2 == this.f19467b);
            this.f19469d = iMo23196E2;
            return;
        }
        if (iM22833b2 != 2) {
            throw C5065C.m22894e();
        }
        int iMo23205e2 = this.f19466a.mo23205e() + this.f19466a.mo23197F();
        do {
            c5061a.m22825g(this.f19466a.mo23212s());
        } while (this.f19466a.mo23205e() < iMo23205e2);
        m23291W(iMo23205e2);
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: q */
    public int mo23327q() throws C5065C.a {
        m23292X(0);
        return this.f19466a.mo23212s();
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: r */
    public void mo23328r(List list) throws C5065C {
        int iMo23196E;
        int iMo23196E2;
        if (!(list instanceof C5061A)) {
            int iM22833b = AbstractC5062A0.m22833b(this.f19467b);
            if (iM22833b == 2) {
                int iMo23197F = this.f19466a.mo23197F();
                m23293Y(iMo23197F);
                int iMo23205e = this.f19466a.mo23205e() + iMo23197F;
                do {
                    list.add(Integer.valueOf(this.f19466a.mo23213t()));
                } while (this.f19466a.mo23205e() < iMo23205e);
                return;
            }
            if (iM22833b != 5) {
                throw C5065C.m22894e();
            }
            do {
                list.add(Integer.valueOf(this.f19466a.mo23213t()));
                if (this.f19466a.mo23206f()) {
                    return;
                } else {
                    iMo23196E = this.f19466a.mo23196E();
                }
            } while (iMo23196E == this.f19467b);
            this.f19469d = iMo23196E;
            return;
        }
        C5061A c5061a = (C5061A) list;
        int iM22833b2 = AbstractC5062A0.m22833b(this.f19467b);
        if (iM22833b2 == 2) {
            int iMo23197F2 = this.f19466a.mo23197F();
            m23293Y(iMo23197F2);
            int iMo23205e2 = this.f19466a.mo23205e() + iMo23197F2;
            do {
                c5061a.m22825g(this.f19466a.mo23213t());
            } while (this.f19466a.mo23205e() < iMo23205e2);
            return;
        }
        if (iM22833b2 != 5) {
            throw C5065C.m22894e();
        }
        do {
            c5061a.m22825g(this.f19466a.mo23213t());
            if (this.f19466a.mo23206f()) {
                return;
            } else {
                iMo23196E2 = this.f19466a.mo23196E();
            }
        } while (iMo23196E2 == this.f19467b);
        this.f19469d = iMo23196E2;
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    public double readDouble() throws C5065C.a {
        m23292X(1);
        return this.f19466a.mo23211r();
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    public float readFloat() throws C5065C.a {
        m23292X(5);
        return this.f19466a.mo23215v();
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: s */
    public int mo23329s() throws C5065C.a {
        m23292X(0);
        return this.f19466a.mo23192A();
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: t */
    public long mo23330t() throws C5065C.a {
        m23292X(0);
        return this.f19466a.mo23193B();
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: u */
    public void mo23331u(List list) throws C5065C {
        int iMo23196E;
        int iMo23196E2;
        if (!(list instanceof AbstractC5100g)) {
            int iM22833b = AbstractC5062A0.m22833b(this.f19467b);
            if (iM22833b == 0) {
                do {
                    list.add(Boolean.valueOf(this.f19466a.mo23209p()));
                    if (this.f19466a.mo23206f()) {
                        return;
                    } else {
                        iMo23196E = this.f19466a.mo23196E();
                    }
                } while (iMo23196E == this.f19467b);
                this.f19469d = iMo23196E;
                return;
            }
            if (iM22833b != 2) {
                throw C5065C.m22894e();
            }
            int iMo23205e = this.f19466a.mo23205e() + this.f19466a.mo23197F();
            do {
                list.add(Boolean.valueOf(this.f19466a.mo23209p()));
            } while (this.f19466a.mo23205e() < iMo23205e);
            m23291W(iMo23205e);
            return;
        }
        AbstractC5100g abstractC5100g = (AbstractC5100g) list;
        int iM22833b2 = AbstractC5062A0.m22833b(this.f19467b);
        if (iM22833b2 == 0) {
            do {
                abstractC5100g.m23143b(this.f19466a.mo23209p());
                if (this.f19466a.mo23206f()) {
                    return;
                } else {
                    iMo23196E2 = this.f19466a.mo23196E();
                }
            } while (iMo23196E2 == this.f19467b);
            this.f19469d = iMo23196E2;
            return;
        }
        if (iM22833b2 != 2) {
            throw C5065C.m22894e();
        }
        int iMo23205e2 = this.f19466a.mo23205e() + this.f19466a.mo23197F();
        do {
            abstractC5100g.m23143b(this.f19466a.mo23209p());
        } while (this.f19466a.mo23205e() < iMo23205e2);
        m23291W(iMo23205e2);
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: v */
    public String mo23332v() throws C5065C.a {
        m23292X(2);
        return this.f19466a.mo23194C();
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: w */
    public int mo23333w() {
        int i7 = this.f19469d;
        if (i7 != 0) {
            this.f19467b = i7;
            this.f19469d = 0;
        } else {
            this.f19467b = this.f19466a.mo23196E();
        }
        int i8 = this.f19467b;
        return (i8 == 0 || i8 == this.f19468c) ? C3553a.e.API_PRIORITY_OTHER : AbstractC5062A0.m22832a(i8);
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: x */
    public void mo23334x(List list) throws C5065C.a {
        m23310V(list, false);
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: y */
    public void mo23335y(List list) throws C5065C.a {
        m23310V(list, true);
    }

    @Override // com.google.protobuf.InterfaceC5109k0
    /* JADX INFO: renamed from: z */
    public AbstractC5104i mo23336z() throws C5065C.a {
        m23292X(2);
        return this.f19466a.mo23210q();
    }
}
