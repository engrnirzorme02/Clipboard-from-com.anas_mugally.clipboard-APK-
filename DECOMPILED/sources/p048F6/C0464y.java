package p048F6;

import kotlin.jvm.internal.AbstractC6118n;
import p016B6.AbstractC0098f;
import p016B6.AbstractC0099g;
import p016B6.InterfaceC0096d;
import p024C6.AbstractC0153b;
import p024C6.InterfaceC0155d;
import p040E6.AbstractC0393b;
import p040E6.C0395d;
import p040E6.InterfaceC0396e;
import p056G6.AbstractC0488b;
import p145S5.C1434l;
import p408z6.InterfaceC7619e;

/* JADX INFO: renamed from: F6.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0464y extends AbstractC0153b implements InterfaceC0396e {

    /* JADX INFO: renamed from: a */
    private final C0446g f1747a;

    /* JADX INFO: renamed from: b */
    private final AbstractC0393b f1748b;

    /* JADX INFO: renamed from: c */
    private final EnumC0438D f1749c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0396e[] f1750d;

    /* JADX INFO: renamed from: e */
    private final AbstractC0488b f1751e;

    /* JADX INFO: renamed from: f */
    private final C0395d f1752f;

    /* JADX INFO: renamed from: g */
    private boolean f1753g;

    /* JADX INFO: renamed from: h */
    private String f1754h;

    /* JADX INFO: renamed from: i */
    private String f1755i;

    /* JADX INFO: renamed from: F6.y$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1756a;

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
            f1756a = iArr;
        }
    }

    public C0464y(C0446g composer, AbstractC0393b json, EnumC0438D mode, InterfaceC0396e[] interfaceC0396eArr) {
        AbstractC6118n.m27187e(composer, "composer");
        AbstractC6118n.m27187e(json, "json");
        AbstractC6118n.m27187e(mode, "mode");
        this.f1747a = composer;
        this.f1748b = json;
        this.f1749c = mode;
        this.f1750d = interfaceC0396eArr;
        this.f1751e = mo1693n().m1674d();
        this.f1752f = mo1693n().m1673c();
        int iOrdinal = mode.ordinal();
        if (interfaceC0396eArr != null) {
            InterfaceC0396e interfaceC0396e = interfaceC0396eArr[iOrdinal];
            if (interfaceC0396e == null && interfaceC0396e == this) {
                return;
            }
            interfaceC0396eArr[iOrdinal] = this;
        }
    }

    /* JADX INFO: renamed from: u */
    private final void m2003u(String str, String str2) {
        this.f1747a.mo1935c();
        mo715r(str);
        this.f1747a.m1937e(':');
        this.f1747a.mo1945m();
        mo715r(str2);
    }

    @Override // p024C6.InterfaceC0157f
    /* JADX INFO: renamed from: a */
    public InterfaceC0155d mo730a(InterfaceC0096d descriptor) {
        InterfaceC0396e interfaceC0396e;
        AbstractC6118n.m27187e(descriptor, "descriptor");
        EnumC0438D enumC0438DM1883b = AbstractC0439E.m1883b(mo1693n(), descriptor);
        char c7 = enumC0438DM1883b.f1706a;
        if (c7 != 0) {
            this.f1747a.m1937e(c7);
            this.f1747a.mo1934b();
        }
        String str = this.f1754h;
        if (str != null) {
            String strMo371a = this.f1755i;
            if (strMo371a == null) {
                strMo371a = descriptor.mo371a();
            }
            m2003u(str, strMo371a);
            this.f1754h = null;
            this.f1755i = null;
        }
        if (this.f1749c == enumC0438DM1883b) {
            return this;
        }
        InterfaceC0396e[] interfaceC0396eArr = this.f1750d;
        return (interfaceC0396eArr == null || (interfaceC0396e = interfaceC0396eArr[enumC0438DM1883b.ordinal()]) == null) ? new C0464y(this.f1747a, mo1693n(), enumC0438DM1883b, this.f1750d) : interfaceC0396e;
    }

    @Override // p024C6.InterfaceC0155d
    /* JADX INFO: renamed from: b */
    public void mo723b(InterfaceC0096d descriptor) {
        AbstractC6118n.m27187e(descriptor, "descriptor");
        if (this.f1749c.f1707b != 0) {
            this.f1747a.mo1946n();
            this.f1747a.mo1936d();
            this.f1747a.m1937e(this.f1749c.f1707b);
        }
    }

    @Override // p024C6.InterfaceC0157f
    /* JADX INFO: renamed from: c */
    public void mo731c() {
        this.f1747a.m1941i("null");
    }

    @Override // p024C6.InterfaceC0157f
    /* JADX INFO: renamed from: f */
    public void mo732f(double d7) {
        if (this.f1753g) {
            mo715r(String.valueOf(d7));
        } else {
            this.f1747a.m1938f(d7);
        }
        if (this.f1752f.m1677b()) {
            return;
        }
        if (Double.isInfinite(d7) || Double.isNaN(d7)) {
            throw AbstractC0456q.m1962a(Double.valueOf(d7), this.f1747a.f1719a.toString());
        }
    }

    @Override // p024C6.InterfaceC0157f
    /* JADX INFO: renamed from: h */
    public void mo733h(boolean z7) {
        if (this.f1753g) {
            mo715r(String.valueOf(z7));
        } else {
            this.f1747a.m1942j(z7);
        }
    }

    @Override // p024C6.InterfaceC0155d
    /* JADX INFO: renamed from: j */
    public boolean mo724j(InterfaceC0096d descriptor, int i7) {
        AbstractC6118n.m27187e(descriptor, "descriptor");
        return this.f1752f.m1684i();
    }

    @Override // p024C6.AbstractC0153b, p024C6.InterfaceC0155d
    /* JADX INFO: renamed from: l */
    public void mo710l(InterfaceC0096d descriptor, int i7, InterfaceC7619e serializer, Object obj) {
        AbstractC6118n.m27187e(descriptor, "descriptor");
        AbstractC6118n.m27187e(serializer, "serializer");
        if (obj != null || this.f1752f.m1685j()) {
            super.mo710l(descriptor, i7, serializer, obj);
        }
    }

    @Override // p040E6.InterfaceC0396e
    /* JADX INFO: renamed from: n */
    public AbstractC0393b mo1693n() {
        return this.f1748b;
    }

    @Override // p024C6.AbstractC0153b, p024C6.InterfaceC0157f
    /* JADX INFO: renamed from: o */
    public void mo712o(int i7) {
        if (this.f1753g) {
            mo715r(String.valueOf(i7));
        } else {
            this.f1747a.m1939g(i7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    @Override // p024C6.AbstractC0153b, p024C6.InterfaceC0157f
    /* JADX INFO: renamed from: p */
    public void mo713p(InterfaceC7619e serializer, Object obj) {
        String strM1993a;
        AbstractC6118n.m27187e(serializer, "serializer");
        if (mo1693n().m1673c().m1691p()) {
            serializer.mo1121d(this, obj);
            return;
        }
        int i7 = AbstractC0462w.a.f1736a[mo1693n().m1673c().m1681f().ordinal()];
        if (i7 == 1 || i7 == 2) {
            strM1993a = null;
        } else {
            if (i7 != 3) {
                throw new C1434l();
            }
            AbstractC0098f abstractC0098fMo374e = serializer.mo1120a().mo374e();
            if (AbstractC6118n.m27183a(abstractC0098fMo374e, AbstractC0099g.a.f527a) || AbstractC6118n.m27183a(abstractC0098fMo374e, AbstractC0099g.d.f530a)) {
                strM1993a = AbstractC0462w.m1993a(serializer.mo1120a(), mo1693n());
            } else {
                strM1993a = null;
            }
        }
        if (strM1993a != null) {
            String strMo371a = serializer.mo1120a().mo371a();
            this.f1754h = strM1993a;
            this.f1755i = strMo371a;
        }
        serializer.mo1121d(this, obj);
    }

    @Override // p024C6.AbstractC0153b, p024C6.InterfaceC0157f
    /* JADX INFO: renamed from: q */
    public void mo714q(long j7) {
        if (this.f1753g) {
            mo715r(String.valueOf(j7));
        } else {
            this.f1747a.m1940h(j7);
        }
    }

    @Override // p024C6.AbstractC0153b, p024C6.InterfaceC0157f
    /* JADX INFO: renamed from: r */
    public void mo715r(String value) {
        AbstractC6118n.m27187e(value, "value");
        this.f1747a.m1943k(value);
    }

    @Override // p024C6.AbstractC0153b
    /* JADX INFO: renamed from: s */
    public boolean mo716s(InterfaceC0096d descriptor, int i7) {
        AbstractC6118n.m27187e(descriptor, "descriptor");
        int i8 = a.f1756a[this.f1749c.ordinal()];
        if (i8 != 1) {
            boolean z7 = false;
            if (i8 != 2) {
                if (i8 != 3) {
                    if (!this.f1747a.m1933a()) {
                        this.f1747a.m1937e(',');
                    }
                    this.f1747a.mo1935c();
                    mo715r(AbstractC0458s.m1977g(descriptor, mo1693n(), i7));
                    this.f1747a.m1937e(':');
                    this.f1747a.mo1945m();
                } else {
                    if (i7 == 0) {
                        this.f1753g = true;
                    }
                    if (i7 == 1) {
                        this.f1747a.m1937e(',');
                        this.f1747a.mo1945m();
                        this.f1753g = false;
                    }
                }
            } else if (this.f1747a.m1933a()) {
                this.f1753g = true;
                this.f1747a.mo1935c();
            } else {
                if (i7 % 2 == 0) {
                    this.f1747a.m1937e(',');
                    this.f1747a.mo1935c();
                    z7 = true;
                } else {
                    this.f1747a.m1937e(':');
                    this.f1747a.mo1945m();
                }
                this.f1753g = z7;
            }
        } else {
            if (!this.f1747a.m1933a()) {
                this.f1747a.m1937e(',');
            }
            this.f1747a.mo1935c();
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0464y(InterfaceC0451l output, AbstractC0393b json, EnumC0438D mode, InterfaceC0396e[] modeReuseCache) {
        this(AbstractC0448i.m1947a(output, json), json, mode, modeReuseCache);
        AbstractC6118n.m27187e(output, "output");
        AbstractC6118n.m27187e(json, "json");
        AbstractC6118n.m27187e(mode, "mode");
        AbstractC6118n.m27187e(modeReuseCache, "modeReuseCache");
    }
}
