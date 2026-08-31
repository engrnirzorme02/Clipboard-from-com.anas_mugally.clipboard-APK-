package com.bumptech.glide;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import androidx.appcompat.app.AbstractC2263x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p035E1.AbstractC0289j;
import p155U1.AbstractC1658a;
import p155U1.C1659b;
import p155U1.C1663f;
import p155U1.C1665h;
import p155U1.C1666i;
import p155U1.InterfaceC1660c;
import p155U1.InterfaceC1661d;
import p155U1.InterfaceC1662e;
import p162V1.AbstractC1721i;
import p162V1.InterfaceC1720h;
import p176X1.C1941a;
import p183Y1.AbstractC2016e;
import p183Y1.AbstractC2022k;
import p183Y1.AbstractC2023l;

/* JADX INFO: renamed from: com.bumptech.glide.k */
/* JADX INFO: loaded from: classes.dex */
public class C3211k extends AbstractC1658a implements Cloneable {

    /* JADX INFO: renamed from: Z */
    protected static final C1663f f13748Z = (C1663f) ((C1663f) ((C1663f) new C1663f().m6954e(AbstractC0289j.f1157c)).m6943V(EnumC3207g.LOW)).m6953d0(true);

    /* JADX INFO: renamed from: L */
    private final Context f13749L;

    /* JADX INFO: renamed from: M */
    private final ComponentCallbacks2C3212l f13750M;

    /* JADX INFO: renamed from: N */
    private final Class f13751N;

    /* JADX INFO: renamed from: O */
    private final ComponentCallbacks2C3202b f13752O;

    /* JADX INFO: renamed from: P */
    private final C3204d f13753P;

    /* JADX INFO: renamed from: Q */
    private AbstractC3230m f13754Q;

    /* JADX INFO: renamed from: R */
    private Object f13755R;

    /* JADX INFO: renamed from: S */
    private List f13756S;

    /* JADX INFO: renamed from: T */
    private C3211k f13757T;

    /* JADX INFO: renamed from: U */
    private C3211k f13758U;

    /* JADX INFO: renamed from: V */
    private Float f13759V;

    /* JADX INFO: renamed from: W */
    private boolean f13760W = true;

    /* JADX INFO: renamed from: X */
    private boolean f13761X;

    /* JADX INFO: renamed from: Y */
    private boolean f13762Y;

    /* JADX INFO: renamed from: com.bumptech.glide.k$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f13763a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f13764b;

        static {
            int[] iArr = new int[EnumC3207g.values().length];
            f13764b = iArr;
            try {
                iArr[EnumC3207g.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13764b[EnumC3207g.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13764b[EnumC3207g.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13764b[EnumC3207g.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f13763a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13763a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13763a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13763a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13763a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13763a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13763a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13763a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    protected C3211k(ComponentCallbacks2C3202b componentCallbacks2C3202b, ComponentCallbacks2C3212l componentCallbacks2C3212l, Class cls, Context context) {
        this.f13752O = componentCallbacks2C3202b;
        this.f13750M = componentCallbacks2C3212l;
        this.f13751N = cls;
        this.f13749L = context;
        this.f13754Q = componentCallbacks2C3212l.m17077r(cls);
        this.f13753P = componentCallbacks2C3202b.m17001i();
        m17056s0(componentCallbacks2C3212l.m17075p());
        mo6946a(componentCallbacks2C3212l.m17076q());
    }

    /* JADX INFO: renamed from: B0 */
    private C3211k m17048B0(Object obj) {
        if (m6927C()) {
            return clone().m17048B0(obj);
        }
        this.f13755R = obj;
        this.f13761X = true;
        return (C3211k) m6945Z();
    }

    /* JADX INFO: renamed from: C0 */
    private C3211k m17049C0(Uri uri, C3211k c3211k) {
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? c3211k : m17051m0(c3211k);
    }

    /* JADX INFO: renamed from: D0 */
    private InterfaceC1660c m17050D0(Object obj, InterfaceC1720h interfaceC1720h, InterfaceC1662e interfaceC1662e, AbstractC1658a abstractC1658a, InterfaceC1661d interfaceC1661d, AbstractC3230m abstractC3230m, EnumC3207g enumC3207g, int i7, int i8, Executor executor) {
        Context context = this.f13749L;
        C3204d c3204d = this.f13753P;
        return C1665h.m7021y(context, c3204d, obj, this.f13755R, this.f13751N, abstractC1658a, i7, i8, enumC3207g, interfaceC1720h, interfaceC1662e, this.f13756S, interfaceC1661d, c3204d.m17016f(), abstractC3230m.m17139b(), executor);
    }

    /* JADX INFO: renamed from: m0 */
    private C3211k m17051m0(C3211k c3211k) {
        return (C3211k) ((C3211k) c3211k.m6955e0(this.f13749L.getTheme())).m6949b0(C1941a.m7993c(this.f13749L));
    }

    /* JADX INFO: renamed from: n0 */
    private InterfaceC1660c m17052n0(InterfaceC1720h interfaceC1720h, InterfaceC1662e interfaceC1662e, AbstractC1658a abstractC1658a, Executor executor) {
        return m17053o0(new Object(), interfaceC1720h, interfaceC1662e, null, this.f13754Q, abstractC1658a.m6974u(), abstractC1658a.m6971r(), abstractC1658a.m6970q(), abstractC1658a, executor);
    }

    /* JADX INFO: renamed from: o0 */
    private InterfaceC1660c m17053o0(Object obj, InterfaceC1720h interfaceC1720h, InterfaceC1662e interfaceC1662e, InterfaceC1661d interfaceC1661d, AbstractC3230m abstractC3230m, EnumC3207g enumC3207g, int i7, int i8, AbstractC1658a abstractC1658a, Executor executor) {
        C1659b c1659b;
        InterfaceC1661d interfaceC1661d2;
        if (this.f13758U != null) {
            c1659b = new C1659b(obj, interfaceC1661d);
            interfaceC1661d2 = c1659b;
        } else {
            c1659b = null;
            interfaceC1661d2 = interfaceC1661d;
        }
        InterfaceC1660c interfaceC1660cM17054p0 = m17054p0(obj, interfaceC1720h, interfaceC1662e, interfaceC1661d2, abstractC3230m, enumC3207g, i7, i8, abstractC1658a, executor);
        if (c1659b == null) {
            return interfaceC1660cM17054p0;
        }
        int iM6971r = this.f13758U.m6971r();
        int iM6970q = this.f13758U.m6970q();
        if (AbstractC2023l.m8429t(i7, i8) && !this.f13758U.m6935M()) {
            iM6971r = abstractC1658a.m6971r();
            iM6970q = abstractC1658a.m6970q();
        }
        C3211k c3211k = this.f13758U;
        C1659b c1659b2 = c1659b;
        c1659b2.m6995p(interfaceC1660cM17054p0, c3211k.m17053o0(obj, interfaceC1720h, interfaceC1662e, c1659b2, c3211k.f13754Q, c3211k.m6974u(), iM6971r, iM6970q, this.f13758U, executor));
        return c1659b2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: p0 */
    private InterfaceC1660c m17054p0(Object obj, InterfaceC1720h interfaceC1720h, InterfaceC1662e interfaceC1662e, InterfaceC1661d interfaceC1661d, AbstractC3230m abstractC3230m, EnumC3207g enumC3207g, int i7, int i8, AbstractC1658a abstractC1658a, Executor executor) {
        C3211k c3211k = this.f13757T;
        if (c3211k == null) {
            if (this.f13759V == null) {
                return m17050D0(obj, interfaceC1720h, interfaceC1662e, abstractC1658a, interfaceC1661d, abstractC3230m, enumC3207g, i7, i8, executor);
            }
            C1666i c1666i = new C1666i(obj, interfaceC1661d);
            c1666i.m7028o(m17050D0(obj, interfaceC1720h, interfaceC1662e, abstractC1658a, c1666i, abstractC3230m, enumC3207g, i7, i8, executor), m17050D0(obj, interfaceC1720h, interfaceC1662e, abstractC1658a.clone().m6951c0(this.f13759V.floatValue()), c1666i, abstractC3230m, m17055r0(enumC3207g), i7, i8, executor));
            return c1666i;
        }
        if (this.f13762Y) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        AbstractC3230m abstractC3230m2 = c3211k.f13760W ? abstractC3230m : c3211k.f13754Q;
        EnumC3207g enumC3207gM6974u = c3211k.m6930F() ? this.f13757T.m6974u() : m17055r0(enumC3207g);
        int iM6971r = this.f13757T.m6971r();
        int iM6970q = this.f13757T.m6970q();
        if (AbstractC2023l.m8429t(i7, i8) && !this.f13757T.m6935M()) {
            iM6971r = abstractC1658a.m6971r();
            iM6970q = abstractC1658a.m6970q();
        }
        C1666i c1666i2 = new C1666i(obj, interfaceC1661d);
        InterfaceC1660c interfaceC1660cM17050D0 = m17050D0(obj, interfaceC1720h, interfaceC1662e, abstractC1658a, c1666i2, abstractC3230m, enumC3207g, i7, i8, executor);
        this.f13762Y = true;
        C3211k c3211k2 = this.f13757T;
        InterfaceC1660c interfaceC1660cM17053o0 = c3211k2.m17053o0(obj, interfaceC1720h, interfaceC1662e, c1666i2, abstractC3230m2, enumC3207gM6974u, iM6971r, iM6970q, c3211k2, executor);
        this.f13762Y = false;
        c1666i2.m7028o(interfaceC1660cM17050D0, interfaceC1660cM17053o0);
        return c1666i2;
    }

    /* JADX INFO: renamed from: r0 */
    private EnumC3207g m17055r0(EnumC3207g enumC3207g) {
        int i7 = a.f13764b[enumC3207g.ordinal()];
        if (i7 == 1) {
            return EnumC3207g.NORMAL;
        }
        if (i7 == 2) {
            return EnumC3207g.HIGH;
        }
        if (i7 == 3 || i7 == 4) {
            return EnumC3207g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + m6974u());
    }

    /* JADX INFO: renamed from: s0 */
    private void m17056s0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2263x.m9328a(it.next());
            m17060k0(null);
        }
    }

    /* JADX INFO: renamed from: u0 */
    private InterfaceC1720h m17057u0(InterfaceC1720h interfaceC1720h, InterfaceC1662e interfaceC1662e, AbstractC1658a abstractC1658a, Executor executor) {
        AbstractC2022k.m8408e(interfaceC1720h);
        if (!this.f13761X) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        InterfaceC1660c interfaceC1660cM17052n0 = m17052n0(interfaceC1720h, interfaceC1662e, abstractC1658a, executor);
        InterfaceC1660c interfaceC1660cMo7316h = interfaceC1720h.mo7316h();
        if (interfaceC1660cM17052n0.mo6992i(interfaceC1660cMo7316h) && !m17058x0(abstractC1658a, interfaceC1660cMo7316h)) {
            if (!((InterfaceC1660c) AbstractC2022k.m8408e(interfaceC1660cMo7316h)).isRunning()) {
                interfaceC1660cMo7316h.mo6991h();
            }
            return interfaceC1720h;
        }
        this.f13750M.m17074n(interfaceC1720h);
        interfaceC1720h.mo7315f(interfaceC1660cM17052n0);
        this.f13750M.m17085z(interfaceC1720h, interfaceC1660cM17052n0);
        return interfaceC1720h;
    }

    /* JADX INFO: renamed from: x0 */
    private boolean m17058x0(AbstractC1658a abstractC1658a, InterfaceC1660c interfaceC1660c) {
        return !abstractC1658a.m6929E() && interfaceC1660c.mo6994k();
    }

    /* JADX INFO: renamed from: A0 */
    public C3211k m17059A0(String str) {
        return m17048B0(str);
    }

    @Override // p155U1.AbstractC1658a
    public boolean equals(Object obj) {
        if (obj instanceof C3211k) {
            C3211k c3211k = (C3211k) obj;
            if (super.equals(c3211k) && Objects.equals(this.f13751N, c3211k.f13751N) && this.f13754Q.equals(c3211k.f13754Q) && Objects.equals(this.f13755R, c3211k.f13755R) && Objects.equals(this.f13756S, c3211k.f13756S) && Objects.equals(this.f13757T, c3211k.f13757T) && Objects.equals(this.f13758U, c3211k.f13758U) && Objects.equals(this.f13759V, c3211k.f13759V) && this.f13760W == c3211k.f13760W && this.f13761X == c3211k.f13761X) {
                return true;
            }
        }
        return false;
    }

    @Override // p155U1.AbstractC1658a
    public int hashCode() {
        return AbstractC2023l.m8425p(this.f13761X, AbstractC2023l.m8425p(this.f13760W, AbstractC2023l.m8424o(this.f13759V, AbstractC2023l.m8424o(this.f13758U, AbstractC2023l.m8424o(this.f13757T, AbstractC2023l.m8424o(this.f13756S, AbstractC2023l.m8424o(this.f13755R, AbstractC2023l.m8424o(this.f13754Q, AbstractC2023l.m8424o(this.f13751N, super.hashCode())))))))));
    }

    /* JADX INFO: renamed from: k0 */
    public C3211k m17060k0(InterfaceC1662e interfaceC1662e) {
        if (m6927C()) {
            return clone().m17060k0(interfaceC1662e);
        }
        if (interfaceC1662e != null) {
            if (this.f13756S == null) {
                this.f13756S = new ArrayList();
            }
            this.f13756S.add(interfaceC1662e);
        }
        return (C3211k) m6945Z();
    }

    @Override // p155U1.AbstractC1658a
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public C3211k mo6946a(AbstractC1658a abstractC1658a) {
        AbstractC2022k.m8408e(abstractC1658a);
        return (C3211k) super.mo6946a(abstractC1658a);
    }

    @Override // p155U1.AbstractC1658a
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public C3211k clone() {
        C3211k c3211k = (C3211k) super.clone();
        c3211k.f13754Q = c3211k.f13754Q.clone();
        if (c3211k.f13756S != null) {
            c3211k.f13756S = new ArrayList(c3211k.f13756S);
        }
        C3211k c3211k2 = c3211k.f13757T;
        if (c3211k2 != null) {
            c3211k.f13757T = c3211k2.clone();
        }
        C3211k c3211k3 = c3211k.f13758U;
        if (c3211k3 != null) {
            c3211k.f13758U = c3211k3.clone();
        }
        return c3211k;
    }

    /* JADX INFO: renamed from: t0 */
    public InterfaceC1720h m17063t0(InterfaceC1720h interfaceC1720h) {
        return m17064v0(interfaceC1720h, null, AbstractC2016e.m8390b());
    }

    /* JADX INFO: renamed from: v0 */
    public InterfaceC1720h m17064v0(InterfaceC1720h interfaceC1720h, InterfaceC1662e interfaceC1662e, Executor executor) {
        return m17057u0(interfaceC1720h, interfaceC1662e, this, executor);
    }

    /* JADX INFO: renamed from: w0 */
    public AbstractC1721i m17065w0(ImageView imageView) {
        AbstractC1658a abstractC1658aM6937O;
        AbstractC2023l.m8410a();
        AbstractC2022k.m8408e(imageView);
        if (!m6934L() && m6932J() && imageView.getScaleType() != null) {
            switch (a.f13763a[imageView.getScaleType().ordinal()]) {
                case 1:
                    abstractC1658aM6937O = clone().m6937O();
                    break;
                case 2:
                    abstractC1658aM6937O = clone().m6938P();
                    break;
                case 3:
                case 4:
                case 5:
                    abstractC1658aM6937O = clone().m6939Q();
                    break;
                case 6:
                    abstractC1658aM6937O = clone().m6938P();
                    break;
                default:
                    abstractC1658aM6937O = this;
                    break;
            }
        } else {
            abstractC1658aM6937O = this;
        }
        return (AbstractC1721i) m17057u0(this.f13753P.m17011a(imageView, this.f13751N), null, abstractC1658aM6937O, AbstractC2016e.m8390b());
    }

    /* JADX INFO: renamed from: y0 */
    public C3211k m17066y0(Uri uri) {
        return m17049C0(uri, m17048B0(uri));
    }

    /* JADX INFO: renamed from: z0 */
    public C3211k m17067z0(Object obj) {
        return m17048B0(obj);
    }
}
