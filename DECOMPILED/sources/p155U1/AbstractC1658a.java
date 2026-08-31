package p155U1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.EnumC3207g;
import java.util.Map;
import p019C1.C0131g;
import p019C1.C0132h;
import p019C1.InterfaceC0130f;
import p019C1.InterfaceC0136l;
import p035E1.AbstractC0289j;
import p091L1.AbstractC0823p;
import p091L1.C0819l;
import p091L1.C0820m;
import p091L1.C0826s;
import p091L1.C0828u;
import p106N1.C0946l;
import p120P1.C1186c;
import p120P1.C1189f;
import p176X1.C1943c;
import p183Y1.AbstractC2022k;
import p183Y1.AbstractC2023l;
import p183Y1.C2013b;

/* JADX INFO: renamed from: U1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1658a implements Cloneable {

    /* JADX INFO: renamed from: A */
    private int f5471A;

    /* JADX INFO: renamed from: E */
    private boolean f5475E;

    /* JADX INFO: renamed from: F */
    private Resources.Theme f5476F;

    /* JADX INFO: renamed from: G */
    private boolean f5477G;

    /* JADX INFO: renamed from: H */
    private boolean f5478H;

    /* JADX INFO: renamed from: I */
    private boolean f5479I;

    /* JADX INFO: renamed from: K */
    private boolean f5481K;

    /* JADX INFO: renamed from: a */
    private int f5482a;

    /* JADX INFO: renamed from: e */
    private Drawable f5486e;

    /* JADX INFO: renamed from: f */
    private int f5487f;

    /* JADX INFO: renamed from: r */
    private Drawable f5488r;

    /* JADX INFO: renamed from: s */
    private int f5489s;

    /* JADX INFO: renamed from: x */
    private boolean f5494x;

    /* JADX INFO: renamed from: z */
    private Drawable f5496z;

    /* JADX INFO: renamed from: b */
    private float f5483b = 1.0f;

    /* JADX INFO: renamed from: c */
    private AbstractC0289j f5484c = AbstractC0289j.f1159e;

    /* JADX INFO: renamed from: d */
    private EnumC3207g f5485d = EnumC3207g.NORMAL;

    /* JADX INFO: renamed from: t */
    private boolean f5490t = true;

    /* JADX INFO: renamed from: u */
    private int f5491u = -1;

    /* JADX INFO: renamed from: v */
    private int f5492v = -1;

    /* JADX INFO: renamed from: w */
    private InterfaceC0130f f5493w = C1943c.m7998c();

    /* JADX INFO: renamed from: y */
    private boolean f5495y = true;

    /* JADX INFO: renamed from: B */
    private C0132h f5472B = new C0132h();

    /* JADX INFO: renamed from: C */
    private Map f5473C = new C2013b();

    /* JADX INFO: renamed from: D */
    private Class f5474D = Object.class;

    /* JADX INFO: renamed from: J */
    private boolean f5480J = true;

    /* JADX INFO: renamed from: H */
    private boolean m6920H(int i7) {
        return m6921I(this.f5482a, i7);
    }

    /* JADX INFO: renamed from: I */
    private static boolean m6921I(int i7, int i8) {
        return (i7 & i8) != 0;
    }

    /* JADX INFO: renamed from: R */
    private AbstractC1658a m6922R(AbstractC0823p abstractC0823p, InterfaceC0136l interfaceC0136l) {
        return m6923X(abstractC0823p, interfaceC0136l, false);
    }

    /* JADX INFO: renamed from: X */
    private AbstractC1658a m6923X(AbstractC0823p abstractC0823p, InterfaceC0136l interfaceC0136l, boolean z7) {
        AbstractC1658a abstractC1658aM6961h0 = z7 ? m6961h0(abstractC0823p, interfaceC0136l) : m6940S(abstractC0823p, interfaceC0136l);
        abstractC1658aM6961h0.f5480J = true;
        return abstractC1658aM6961h0;
    }

    /* JADX INFO: renamed from: Y */
    private AbstractC1658a m6924Y() {
        return this;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m6925A() {
        return this.f5481K;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m6926B() {
        return this.f5478H;
    }

    /* JADX INFO: renamed from: C */
    protected final boolean m6927C() {
        return this.f5477G;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m6928D(AbstractC1658a abstractC1658a) {
        return Float.compare(abstractC1658a.f5483b, this.f5483b) == 0 && this.f5487f == abstractC1658a.f5487f && AbstractC2023l.m8413d(this.f5486e, abstractC1658a.f5486e) && this.f5489s == abstractC1658a.f5489s && AbstractC2023l.m8413d(this.f5488r, abstractC1658a.f5488r) && this.f5471A == abstractC1658a.f5471A && AbstractC2023l.m8413d(this.f5496z, abstractC1658a.f5496z) && this.f5490t == abstractC1658a.f5490t && this.f5491u == abstractC1658a.f5491u && this.f5492v == abstractC1658a.f5492v && this.f5494x == abstractC1658a.f5494x && this.f5495y == abstractC1658a.f5495y && this.f5478H == abstractC1658a.f5478H && this.f5479I == abstractC1658a.f5479I && this.f5484c.equals(abstractC1658a.f5484c) && this.f5485d == abstractC1658a.f5485d && this.f5472B.equals(abstractC1658a.f5472B) && this.f5473C.equals(abstractC1658a.f5473C) && this.f5474D.equals(abstractC1658a.f5474D) && AbstractC2023l.m8413d(this.f5493w, abstractC1658a.f5493w) && AbstractC2023l.m8413d(this.f5476F, abstractC1658a.f5476F);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m6929E() {
        return this.f5490t;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m6930F() {
        return m6920H(8);
    }

    /* JADX INFO: renamed from: G */
    boolean m6931G() {
        return this.f5480J;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m6932J() {
        return this.f5495y;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m6933K() {
        return this.f5494x;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m6934L() {
        return m6920H(2048);
    }

    /* JADX INFO: renamed from: M */
    public final boolean m6935M() {
        return AbstractC2023l.m8429t(this.f5492v, this.f5491u);
    }

    /* JADX INFO: renamed from: N */
    public AbstractC1658a m6936N() {
        this.f5475E = true;
        return m6924Y();
    }

    /* JADX INFO: renamed from: O */
    public AbstractC1658a m6937O() {
        return m6940S(AbstractC0823p.f3268e, new C0819l());
    }

    /* JADX INFO: renamed from: P */
    public AbstractC1658a m6938P() {
        return m6922R(AbstractC0823p.f3267d, new C0820m());
    }

    /* JADX INFO: renamed from: Q */
    public AbstractC1658a m6939Q() {
        return m6922R(AbstractC0823p.f3266c, new C0828u());
    }

    /* JADX INFO: renamed from: S */
    final AbstractC1658a m6940S(AbstractC0823p abstractC0823p, InterfaceC0136l interfaceC0136l) {
        if (this.f5477G) {
            return clone().m6940S(abstractC0823p, interfaceC0136l);
        }
        m6956f(abstractC0823p);
        return m6959g0(interfaceC0136l, false);
    }

    /* JADX INFO: renamed from: T */
    public AbstractC1658a m6941T(int i7, int i8) {
        if (this.f5477G) {
            return clone().m6941T(i7, i8);
        }
        this.f5492v = i7;
        this.f5491u = i8;
        this.f5482a |= 512;
        return m6945Z();
    }

    /* JADX INFO: renamed from: U */
    public AbstractC1658a m6942U(int i7) {
        if (this.f5477G) {
            return clone().m6942U(i7);
        }
        this.f5489s = i7;
        int i8 = this.f5482a | 128;
        this.f5488r = null;
        this.f5482a = i8 & (-65);
        return m6945Z();
    }

    /* JADX INFO: renamed from: V */
    public AbstractC1658a m6943V(EnumC3207g enumC3207g) {
        if (this.f5477G) {
            return clone().m6943V(enumC3207g);
        }
        this.f5485d = (EnumC3207g) AbstractC2022k.m8408e(enumC3207g);
        this.f5482a |= 8;
        return m6945Z();
    }

    /* JADX INFO: renamed from: W */
    AbstractC1658a m6944W(C0131g c0131g) {
        if (this.f5477G) {
            return clone().m6944W(c0131g);
        }
        this.f5472B.m602e(c0131g);
        return m6945Z();
    }

    /* JADX INFO: renamed from: Z */
    protected final AbstractC1658a m6945Z() {
        if (this.f5475E) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return m6924Y();
    }

    /* JADX INFO: renamed from: a */
    public AbstractC1658a mo6946a(AbstractC1658a abstractC1658a) {
        if (this.f5477G) {
            return clone().mo6946a(abstractC1658a);
        }
        if (m6921I(abstractC1658a.f5482a, 2)) {
            this.f5483b = abstractC1658a.f5483b;
        }
        if (m6921I(abstractC1658a.f5482a, 262144)) {
            this.f5478H = abstractC1658a.f5478H;
        }
        if (m6921I(abstractC1658a.f5482a, 1048576)) {
            this.f5481K = abstractC1658a.f5481K;
        }
        if (m6921I(abstractC1658a.f5482a, 4)) {
            this.f5484c = abstractC1658a.f5484c;
        }
        if (m6921I(abstractC1658a.f5482a, 8)) {
            this.f5485d = abstractC1658a.f5485d;
        }
        if (m6921I(abstractC1658a.f5482a, 16)) {
            this.f5486e = abstractC1658a.f5486e;
            this.f5487f = 0;
            this.f5482a &= -33;
        }
        if (m6921I(abstractC1658a.f5482a, 32)) {
            this.f5487f = abstractC1658a.f5487f;
            this.f5486e = null;
            this.f5482a &= -17;
        }
        if (m6921I(abstractC1658a.f5482a, 64)) {
            this.f5488r = abstractC1658a.f5488r;
            this.f5489s = 0;
            this.f5482a &= -129;
        }
        if (m6921I(abstractC1658a.f5482a, 128)) {
            this.f5489s = abstractC1658a.f5489s;
            this.f5488r = null;
            this.f5482a &= -65;
        }
        if (m6921I(abstractC1658a.f5482a, 256)) {
            this.f5490t = abstractC1658a.f5490t;
        }
        if (m6921I(abstractC1658a.f5482a, 512)) {
            this.f5492v = abstractC1658a.f5492v;
            this.f5491u = abstractC1658a.f5491u;
        }
        if (m6921I(abstractC1658a.f5482a, 1024)) {
            this.f5493w = abstractC1658a.f5493w;
        }
        if (m6921I(abstractC1658a.f5482a, 4096)) {
            this.f5474D = abstractC1658a.f5474D;
        }
        if (m6921I(abstractC1658a.f5482a, 8192)) {
            this.f5496z = abstractC1658a.f5496z;
            this.f5471A = 0;
            this.f5482a &= -16385;
        }
        if (m6921I(abstractC1658a.f5482a, 16384)) {
            this.f5471A = abstractC1658a.f5471A;
            this.f5496z = null;
            this.f5482a &= -8193;
        }
        if (m6921I(abstractC1658a.f5482a, 32768)) {
            this.f5476F = abstractC1658a.f5476F;
        }
        if (m6921I(abstractC1658a.f5482a, 65536)) {
            this.f5495y = abstractC1658a.f5495y;
        }
        if (m6921I(abstractC1658a.f5482a, 131072)) {
            this.f5494x = abstractC1658a.f5494x;
        }
        if (m6921I(abstractC1658a.f5482a, 2048)) {
            this.f5473C.putAll(abstractC1658a.f5473C);
            this.f5480J = abstractC1658a.f5480J;
        }
        if (m6921I(abstractC1658a.f5482a, 524288)) {
            this.f5479I = abstractC1658a.f5479I;
        }
        if (!this.f5495y) {
            this.f5473C.clear();
            int i7 = this.f5482a;
            this.f5494x = false;
            this.f5482a = i7 & (-133121);
            this.f5480J = true;
        }
        this.f5482a |= abstractC1658a.f5482a;
        this.f5472B.m601d(abstractC1658a.f5472B);
        return m6945Z();
    }

    /* JADX INFO: renamed from: a0 */
    public AbstractC1658a m6947a0(C0131g c0131g, Object obj) {
        if (this.f5477G) {
            return clone().m6947a0(c0131g, obj);
        }
        AbstractC2022k.m8408e(c0131g);
        AbstractC2022k.m8408e(obj);
        this.f5472B.m603f(c0131g, obj);
        return m6945Z();
    }

    /* JADX INFO: renamed from: b */
    public AbstractC1658a m6948b() {
        if (this.f5475E && !this.f5477G) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f5477G = true;
        return m6936N();
    }

    /* JADX INFO: renamed from: b0 */
    public AbstractC1658a m6949b0(InterfaceC0130f interfaceC0130f) {
        if (this.f5477G) {
            return clone().m6949b0(interfaceC0130f);
        }
        this.f5493w = (InterfaceC0130f) AbstractC2022k.m8408e(interfaceC0130f);
        this.f5482a |= 1024;
        return m6945Z();
    }

    @Override // 
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC1658a clone() {
        try {
            AbstractC1658a abstractC1658a = (AbstractC1658a) super.clone();
            C0132h c0132h = new C0132h();
            abstractC1658a.f5472B = c0132h;
            c0132h.m601d(this.f5472B);
            C2013b c2013b = new C2013b();
            abstractC1658a.f5473C = c2013b;
            c2013b.putAll(this.f5473C);
            abstractC1658a.f5475E = false;
            abstractC1658a.f5477G = false;
            return abstractC1658a;
        } catch (CloneNotSupportedException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public AbstractC1658a m6951c0(float f7) {
        if (this.f5477G) {
            return clone().m6951c0(f7);
        }
        if (f7 < 0.0f || f7 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f5483b = f7;
        this.f5482a |= 2;
        return m6945Z();
    }

    /* JADX INFO: renamed from: d */
    public AbstractC1658a m6952d(Class cls) {
        if (this.f5477G) {
            return clone().m6952d(cls);
        }
        this.f5474D = (Class) AbstractC2022k.m8408e(cls);
        this.f5482a |= 4096;
        return m6945Z();
    }

    /* JADX INFO: renamed from: d0 */
    public AbstractC1658a m6953d0(boolean z7) {
        if (this.f5477G) {
            return clone().m6953d0(true);
        }
        this.f5490t = !z7;
        this.f5482a |= 256;
        return m6945Z();
    }

    /* JADX INFO: renamed from: e */
    public AbstractC1658a m6954e(AbstractC0289j abstractC0289j) {
        if (this.f5477G) {
            return clone().m6954e(abstractC0289j);
        }
        this.f5484c = (AbstractC0289j) AbstractC2022k.m8408e(abstractC0289j);
        this.f5482a |= 4;
        return m6945Z();
    }

    /* JADX INFO: renamed from: e0 */
    public AbstractC1658a m6955e0(Resources.Theme theme) {
        if (this.f5477G) {
            return clone().m6955e0(theme);
        }
        this.f5476F = theme;
        if (theme != null) {
            this.f5482a |= 32768;
            return m6947a0(C0946l.f3658b, theme);
        }
        this.f5482a &= -32769;
        return m6944W(C0946l.f3658b);
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC1658a) {
            return m6928D((AbstractC1658a) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public AbstractC1658a m6956f(AbstractC0823p abstractC0823p) {
        return m6947a0(AbstractC0823p.f3271h, (AbstractC0823p) AbstractC2022k.m8408e(abstractC0823p));
    }

    /* JADX INFO: renamed from: f0 */
    public AbstractC1658a m6957f0(InterfaceC0136l interfaceC0136l) {
        return m6959g0(interfaceC0136l, true);
    }

    /* JADX INFO: renamed from: g */
    public AbstractC1658a m6958g(int i7) {
        if (this.f5477G) {
            return clone().m6958g(i7);
        }
        this.f5487f = i7;
        int i8 = this.f5482a | 32;
        this.f5486e = null;
        this.f5482a = i8 & (-17);
        return m6945Z();
    }

    /* JADX INFO: renamed from: g0 */
    AbstractC1658a m6959g0(InterfaceC0136l interfaceC0136l, boolean z7) {
        if (this.f5477G) {
            return clone().m6959g0(interfaceC0136l, z7);
        }
        C0826s c0826s = new C0826s(interfaceC0136l, z7);
        m6963i0(Bitmap.class, interfaceC0136l, z7);
        m6963i0(Drawable.class, c0826s, z7);
        m6963i0(BitmapDrawable.class, c0826s.m3874c(), z7);
        m6963i0(C1186c.class, new C1189f(interfaceC0136l), z7);
        return m6945Z();
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC0289j m6960h() {
        return this.f5484c;
    }

    /* JADX INFO: renamed from: h0 */
    final AbstractC1658a m6961h0(AbstractC0823p abstractC0823p, InterfaceC0136l interfaceC0136l) {
        if (this.f5477G) {
            return clone().m6961h0(abstractC0823p, interfaceC0136l);
        }
        m6956f(abstractC0823p);
        return m6957f0(interfaceC0136l);
    }

    public int hashCode() {
        return AbstractC2023l.m8424o(this.f5476F, AbstractC2023l.m8424o(this.f5493w, AbstractC2023l.m8424o(this.f5474D, AbstractC2023l.m8424o(this.f5473C, AbstractC2023l.m8424o(this.f5472B, AbstractC2023l.m8424o(this.f5485d, AbstractC2023l.m8424o(this.f5484c, AbstractC2023l.m8425p(this.f5479I, AbstractC2023l.m8425p(this.f5478H, AbstractC2023l.m8425p(this.f5495y, AbstractC2023l.m8425p(this.f5494x, AbstractC2023l.m8423n(this.f5492v, AbstractC2023l.m8423n(this.f5491u, AbstractC2023l.m8425p(this.f5490t, AbstractC2023l.m8424o(this.f5496z, AbstractC2023l.m8423n(this.f5471A, AbstractC2023l.m8424o(this.f5488r, AbstractC2023l.m8423n(this.f5489s, AbstractC2023l.m8424o(this.f5486e, AbstractC2023l.m8423n(this.f5487f, AbstractC2023l.m8421l(this.f5483b)))))))))))))))))))));
    }

    /* JADX INFO: renamed from: i */
    public final int m6962i() {
        return this.f5487f;
    }

    /* JADX INFO: renamed from: i0 */
    AbstractC1658a m6963i0(Class cls, InterfaceC0136l interfaceC0136l, boolean z7) {
        if (this.f5477G) {
            return clone().m6963i0(cls, interfaceC0136l, z7);
        }
        AbstractC2022k.m8408e(cls);
        AbstractC2022k.m8408e(interfaceC0136l);
        this.f5473C.put(cls, interfaceC0136l);
        int i7 = this.f5482a;
        this.f5495y = true;
        this.f5482a = 67584 | i7;
        this.f5480J = false;
        if (z7) {
            this.f5482a = i7 | 198656;
            this.f5494x = true;
        }
        return m6945Z();
    }

    /* JADX INFO: renamed from: j */
    public final Drawable m6964j() {
        return this.f5486e;
    }

    /* JADX INFO: renamed from: j0 */
    public AbstractC1658a m6965j0(boolean z7) {
        if (this.f5477G) {
            return clone().m6965j0(z7);
        }
        this.f5481K = z7;
        this.f5482a |= 1048576;
        return m6945Z();
    }

    /* JADX INFO: renamed from: k */
    public final Drawable m6966k() {
        return this.f5496z;
    }

    /* JADX INFO: renamed from: l */
    public final int m6967l() {
        return this.f5471A;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m6968o() {
        return this.f5479I;
    }

    /* JADX INFO: renamed from: p */
    public final C0132h m6969p() {
        return this.f5472B;
    }

    /* JADX INFO: renamed from: q */
    public final int m6970q() {
        return this.f5491u;
    }

    /* JADX INFO: renamed from: r */
    public final int m6971r() {
        return this.f5492v;
    }

    /* JADX INFO: renamed from: s */
    public final Drawable m6972s() {
        return this.f5488r;
    }

    /* JADX INFO: renamed from: t */
    public final int m6973t() {
        return this.f5489s;
    }

    /* JADX INFO: renamed from: u */
    public final EnumC3207g m6974u() {
        return this.f5485d;
    }

    /* JADX INFO: renamed from: v */
    public final Class m6975v() {
        return this.f5474D;
    }

    /* JADX INFO: renamed from: w */
    public final InterfaceC0130f m6976w() {
        return this.f5493w;
    }

    /* JADX INFO: renamed from: x */
    public final float m6977x() {
        return this.f5483b;
    }

    /* JADX INFO: renamed from: y */
    public final Resources.Theme m6978y() {
        return this.f5476F;
    }

    /* JADX INFO: renamed from: z */
    public final Map m6979z() {
        return this.f5473C;
    }
}
