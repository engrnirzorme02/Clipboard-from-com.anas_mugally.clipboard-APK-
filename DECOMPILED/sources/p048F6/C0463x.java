package p048F6;

import kotlin.jvm.internal.AbstractC6118n;
import p016B6.AbstractC0098f;
import p016B6.InterfaceC0096d;
import p024C6.AbstractC0152a;
import p024C6.InterfaceC0154c;
import p024C6.InterfaceC0156e;
import p040E6.AbstractC0393b;
import p040E6.C0395d;
import p056G6.AbstractC0488b;
import p145S5.C1426d;
import p302m6.AbstractC6406h;
import p408z6.C7617c;
import p408z6.InterfaceC7615a;

/* JADX INFO: renamed from: F6.x */
/* JADX INFO: loaded from: classes.dex */
public class C0463x extends AbstractC0152a implements InterfaceC0156e, InterfaceC0154c {

    /* JADX INFO: renamed from: a */
    private final AbstractC0393b f1737a;

    /* JADX INFO: renamed from: b */
    private final EnumC0438D f1738b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0440a f1739c;

    /* JADX INFO: renamed from: d */
    private final AbstractC0488b f1740d;

    /* JADX INFO: renamed from: e */
    private int f1741e;

    /* JADX INFO: renamed from: f */
    private a f1742f;

    /* JADX INFO: renamed from: g */
    private final C0395d f1743g;

    /* JADX INFO: renamed from: h */
    private final C0453n f1744h;

    /* JADX INFO: renamed from: F6.x$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public String f1745a;
    }

    /* JADX INFO: renamed from: F6.x$b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1746a;

        static {
            int[] iArr = new int[EnumC0438D.values().length];
            try {
                iArr[EnumC0438D.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0438D.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0438D.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC0438D.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1746a = iArr;
        }
    }

    public C0463x(AbstractC0393b json, EnumC0438D mode, AbstractC0440a lexer, InterfaceC0096d descriptor, a aVar) {
        AbstractC6118n.m27187e(json, "json");
        AbstractC6118n.m27187e(mode, "mode");
        AbstractC6118n.m27187e(lexer, "lexer");
        AbstractC6118n.m27187e(descriptor, "descriptor");
        this.f1737a = json;
        this.f1738b = mode;
        this.f1739c = lexer;
        this.f1740d = json.m1674d();
        this.f1741e = -1;
        this.f1742f = aVar;
        C0395d c0395dM1673c = json.m1673c();
        this.f1743g = c0395dM1673c;
        this.f1744h = c0395dM1673c.m1685j() ? null : new C0453n(descriptor);
    }

    /* JADX INFO: renamed from: A */
    private final void m1994A(InterfaceC0096d interfaceC0096d) {
        while (mo719q(interfaceC0096d) != -1) {
        }
    }

    /* JADX INFO: renamed from: B */
    private final boolean m1995B(a aVar, String str) {
        return false;
    }

    /* JADX INFO: renamed from: t */
    private final void m1996t() {
        if (this.f1739c.mo1872C() != 4) {
            return;
        }
        AbstractC0440a.m1894v(this.f1739c, "Unexpected leading comma", 0, null, 6, null);
        throw new C1426d();
    }

    /* JADX INFO: renamed from: u */
    private final boolean m1997u(InterfaceC0096d interfaceC0096d, int i7) {
        String strM1899D;
        AbstractC0393b abstractC0393b = this.f1737a;
        boolean zMo379j = interfaceC0096d.mo379j(i7);
        InterfaceC0096d interfaceC0096dMo378i = interfaceC0096d.mo378i(i7);
        if (zMo379j && !interfaceC0096dMo378i.mo372c() && this.f1739c.m1904K(true)) {
            return true;
        }
        if (!AbstractC6118n.m27183a(interfaceC0096dMo378i.mo374e(), AbstractC0098f.b.f526a) || ((interfaceC0096dMo378i.mo372c() && this.f1739c.m1904K(false)) || (strM1899D = this.f1739c.m1899D(this.f1743g.m1692q())) == null)) {
            return false;
        }
        int iM1978h = AbstractC0458s.m1978h(interfaceC0096dMo378i, abstractC0393b, strM1899D);
        boolean z7 = !abstractC0393b.m1673c().m1685j() && interfaceC0096dMo378i.mo372c();
        if (iM1978h == -3 && (zMo379j || z7)) {
            this.f1739c.m1910n();
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    private final int m1998v() {
        boolean zM1903J = this.f1739c.m1903J();
        if (!this.f1739c.mo1874e()) {
            if (!zM1903J || this.f1737a.m1673c().m1679d()) {
                return -1;
            }
            AbstractC0456q.m1966e(this.f1739c, "array");
            throw new C1426d();
        }
        int i7 = this.f1741e;
        if (i7 != -1 && !zM1903J) {
            AbstractC0440a.m1894v(this.f1739c, "Expected end of the array or comma", 0, null, 6, null);
            throw new C1426d();
        }
        int i8 = i7 + 1;
        this.f1741e = i8;
        return i8;
    }

    /* JADX INFO: renamed from: w */
    private final int m1999w() {
        int i7 = this.f1741e;
        boolean zM1903J = false;
        boolean z7 = i7 % 2 != 0;
        if (!z7) {
            this.f1739c.mo1876k(':');
        } else if (i7 != -1) {
            zM1903J = this.f1739c.m1903J();
        }
        if (!this.f1739c.mo1874e()) {
            if (!zM1903J || this.f1737a.m1673c().m1679d()) {
                return -1;
            }
            AbstractC0456q.m1967f(this.f1739c, null, 1, null);
            throw new C1426d();
        }
        if (z7) {
            if (this.f1741e == -1) {
                AbstractC0440a abstractC0440a = this.f1739c;
                int i8 = abstractC0440a.f1708a;
                if (zM1903J) {
                    AbstractC0440a.m1894v(abstractC0440a, "Unexpected leading comma", i8, null, 4, null);
                    throw new C1426d();
                }
            } else {
                AbstractC0440a abstractC0440a2 = this.f1739c;
                boolean z8 = zM1903J;
                int i9 = abstractC0440a2.f1708a;
                if (!z8) {
                    AbstractC0440a.m1894v(abstractC0440a2, "Expected comma after the key-value pair", i9, null, 4, null);
                    throw new C1426d();
                }
            }
        }
        int i10 = this.f1741e + 1;
        this.f1741e = i10;
        return i10;
    }

    /* JADX INFO: renamed from: x */
    private final int m2000x(InterfaceC0096d interfaceC0096d) {
        boolean zM1903J;
        boolean zM1903J2 = this.f1739c.m1903J();
        while (true) {
            boolean z7 = true;
            if (!this.f1739c.mo1874e()) {
                if (zM1903J2 && !this.f1737a.m1673c().m1679d()) {
                    AbstractC0456q.m1967f(this.f1739c, null, 1, null);
                    throw new C1426d();
                }
                C0453n c0453n = this.f1744h;
                if (c0453n != null) {
                    return c0453n.m1960d();
                }
                return -1;
            }
            String strM2001y = m2001y();
            this.f1739c.mo1876k(':');
            int iM1978h = AbstractC0458s.m1978h(interfaceC0096d, this.f1737a, strM2001y);
            if (iM1978h == -3) {
                zM1903J = false;
            } else {
                if (!this.f1743g.m1682g() || !m1997u(interfaceC0096d, iM1978h)) {
                    C0453n c0453n2 = this.f1744h;
                    if (c0453n2 != null) {
                        c0453n2.m1959c(iM1978h);
                    }
                    return iM1978h;
                }
                zM1903J = this.f1739c.m1903J();
                z7 = false;
            }
            zM1903J2 = z7 ? m2002z(strM2001y) : zM1903J;
        }
    }

    /* JADX INFO: renamed from: y */
    private final String m2001y() {
        return this.f1743g.m1692q() ? this.f1739c.m1913q() : this.f1739c.mo1908i();
    }

    /* JADX INFO: renamed from: z */
    private final boolean m2002z(String str) {
        if (this.f1743g.m1686k() || m1995B(this.f1742f, str)) {
            this.f1739c.m1901F(this.f1743g.m1692q());
        } else {
            this.f1739c.m1918y(str);
        }
        return this.f1739c.m1903J();
    }

    @Override // p024C6.InterfaceC0156e
    /* JADX INFO: renamed from: a */
    public InterfaceC0154c mo725a(InterfaceC0096d descriptor) {
        AbstractC6118n.m27187e(descriptor, "descriptor");
        EnumC0438D enumC0438DM1883b = AbstractC0439E.m1883b(this.f1737a, descriptor);
        this.f1739c.f1709b.m1984c(descriptor);
        this.f1739c.mo1876k(enumC0438DM1883b.f1706a);
        m1996t();
        int i7 = b.f1746a[enumC0438DM1883b.ordinal()];
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            return new C0463x(this.f1737a, enumC0438DM1883b, this.f1739c, descriptor, this.f1742f);
        }
        return (this.f1738b == enumC0438DM1883b && this.f1737a.m1673c().m1685j()) ? this : new C0463x(this.f1737a, enumC0438DM1883b, this.f1739c, descriptor, this.f1742f);
    }

    @Override // p024C6.InterfaceC0154c
    /* JADX INFO: renamed from: b */
    public void mo718b(InterfaceC0096d descriptor) {
        AbstractC6118n.m27187e(descriptor, "descriptor");
        if (this.f1737a.m1673c().m1686k() && descriptor.mo375f() == 0) {
            m1994A(descriptor);
        }
        if (this.f1739c.m1903J() && !this.f1737a.m1673c().m1679d()) {
            AbstractC0456q.m1966e(this.f1739c, "");
            throw new C1426d();
        }
        this.f1739c.mo1876k(this.f1738b.f1707b);
        this.f1739c.f1709b.m1983b();
    }

    @Override // p024C6.InterfaceC0156e
    /* JADX INFO: renamed from: c */
    public boolean mo726c() {
        return this.f1739c.m1907g();
    }

    @Override // p024C6.AbstractC0152a, p024C6.InterfaceC0156e
    /* JADX INFO: renamed from: g */
    public Object mo696g(InterfaceC7615a deserializer) {
        AbstractC6118n.m27187e(deserializer, "deserializer");
        try {
            return deserializer.mo1109b(this);
        } catch (C7617c e7) {
            String message = e7.getMessage();
            AbstractC6118n.m27184b(message);
            if (AbstractC6406h.m27589Q(message, "at path", false, 2, null)) {
                throw e7;
            }
            throw new C7617c(e7.m33396a(), e7.getMessage() + " at path: " + this.f1739c.f1709b.m1982a(), e7);
        }
    }

    @Override // p024C6.AbstractC0152a, p024C6.InterfaceC0154c
    /* JADX INFO: renamed from: h */
    public Object mo697h(InterfaceC0096d descriptor, int i7, InterfaceC7615a deserializer, Object obj) {
        AbstractC6118n.m27187e(descriptor, "descriptor");
        AbstractC6118n.m27187e(deserializer, "deserializer");
        boolean z7 = this.f1738b == EnumC0438D.MAP && (i7 & 1) == 0;
        if (z7) {
            this.f1739c.f1709b.m1985d();
        }
        Object objMo697h = super.mo697h(descriptor, i7, deserializer, obj);
        if (z7) {
            this.f1739c.f1709b.m1986f(objMo697h);
        }
        return objMo697h;
    }

    @Override // p024C6.AbstractC0152a, p024C6.InterfaceC0156e
    /* JADX INFO: renamed from: i */
    public int mo698i() {
        long jM1909l = this.f1739c.m1909l();
        int i7 = (int) jM1909l;
        if (jM1909l == i7) {
            return i7;
        }
        AbstractC0440a.m1894v(this.f1739c, "Failed to parse int for input '" + jM1909l + '\'', 0, null, 6, null);
        throw new C1426d();
    }

    @Override // p024C6.InterfaceC0156e
    /* JADX INFO: renamed from: j */
    public Void mo727j() {
        return null;
    }

    @Override // p024C6.AbstractC0152a, p024C6.InterfaceC0156e
    /* JADX INFO: renamed from: l */
    public String mo700l() {
        return this.f1743g.m1692q() ? this.f1739c.m1913q() : this.f1739c.m1910n();
    }

    @Override // p024C6.AbstractC0152a, p024C6.InterfaceC0156e
    /* JADX INFO: renamed from: m */
    public long mo701m() {
        return this.f1739c.m1909l();
    }

    @Override // p024C6.InterfaceC0156e
    /* JADX INFO: renamed from: n */
    public boolean mo728n() {
        C0453n c0453n = this.f1744h;
        return ((c0453n != null ? c0453n.m1958b() : false) || AbstractC0440a.m1885L(this.f1739c, false, 1, null)) ? false : true;
    }

    @Override // p024C6.InterfaceC0154c
    /* JADX INFO: renamed from: q */
    public int mo719q(InterfaceC0096d descriptor) {
        int iM1999w;
        AbstractC6118n.m27187e(descriptor, "descriptor");
        int i7 = b.f1746a[this.f1738b.ordinal()];
        if (i7 != 2) {
            iM1999w = i7 != 4 ? m1998v() : m2000x(descriptor);
        } else {
            iM1999w = m1999w();
        }
        if (this.f1738b != EnumC0438D.MAP) {
            this.f1739c.f1709b.m1987g(iM1999w);
        }
        return iM1999w;
    }

    @Override // p024C6.InterfaceC0156e
    /* JADX INFO: renamed from: r */
    public double mo729r() {
        AbstractC0440a abstractC0440a = this.f1739c;
        String strM1912p = abstractC0440a.m1912p();
        try {
            double d7 = Double.parseDouble(strM1912p);
            if (this.f1737a.m1673c().m1677b()) {
                return d7;
            }
            if (!Double.isInfinite(d7) && !Double.isNaN(d7)) {
                return d7;
            }
            AbstractC0456q.m1970i(this.f1739c, Double.valueOf(d7));
            throw new C1426d();
        } catch (IllegalArgumentException unused) {
            AbstractC0440a.m1894v(abstractC0440a, "Failed to parse type 'double' for input '" + strM1912p + '\'', 0, null, 6, null);
            throw new C1426d();
        }
    }
}
