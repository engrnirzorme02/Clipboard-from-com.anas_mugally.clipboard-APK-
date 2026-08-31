package p155U1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.appcompat.app.AbstractC2263x;
import com.bumptech.glide.C3203c;
import com.bumptech.glide.C3204d;
import com.bumptech.glide.EnumC3207g;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p019C1.C0132h;
import p019C1.EnumC0125a;
import p019C1.InterfaceC0130f;
import p035E1.AbstractC0289j;
import p035E1.C0290k;
import p035E1.C0296q;
import p035E1.InterfaceC0301v;
import p106N1.AbstractC0943i;
import p162V1.InterfaceC1719g;
import p162V1.InterfaceC1720h;
import p169W1.InterfaceC1823c;
import p183Y1.AbstractC2018g;
import p183Y1.AbstractC2023l;
import p190Z1.AbstractC2084b;
import p190Z1.AbstractC2085c;

/* JADX INFO: renamed from: U1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1665h implements InterfaceC1660c, InterfaceC1719g, InterfaceC1664g {

    /* JADX INFO: renamed from: D */
    private static final boolean f5510D = Log.isLoggable("GlideRequest", 2);

    /* JADX INFO: renamed from: A */
    private int f5511A;

    /* JADX INFO: renamed from: B */
    private boolean f5512B;

    /* JADX INFO: renamed from: C */
    private RuntimeException f5513C;

    /* JADX INFO: renamed from: a */
    private int f5514a;

    /* JADX INFO: renamed from: b */
    private final String f5515b;

    /* JADX INFO: renamed from: c */
    private final AbstractC2085c f5516c;

    /* JADX INFO: renamed from: d */
    private final Object f5517d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1661d f5518e;

    /* JADX INFO: renamed from: f */
    private final Context f5519f;

    /* JADX INFO: renamed from: g */
    private final C3204d f5520g;

    /* JADX INFO: renamed from: h */
    private final Object f5521h;

    /* JADX INFO: renamed from: i */
    private final Class f5522i;

    /* JADX INFO: renamed from: j */
    private final AbstractC1658a f5523j;

    /* JADX INFO: renamed from: k */
    private final int f5524k;

    /* JADX INFO: renamed from: l */
    private final int f5525l;

    /* JADX INFO: renamed from: m */
    private final EnumC3207g f5526m;

    /* JADX INFO: renamed from: n */
    private final InterfaceC1720h f5527n;

    /* JADX INFO: renamed from: o */
    private final List f5528o;

    /* JADX INFO: renamed from: p */
    private final InterfaceC1823c f5529p;

    /* JADX INFO: renamed from: q */
    private final Executor f5530q;

    /* JADX INFO: renamed from: r */
    private InterfaceC0301v f5531r;

    /* JADX INFO: renamed from: s */
    private C0290k.d f5532s;

    /* JADX INFO: renamed from: t */
    private long f5533t;

    /* JADX INFO: renamed from: u */
    private volatile C0290k f5534u;

    /* JADX INFO: renamed from: v */
    private a f5535v;

    /* JADX INFO: renamed from: w */
    private Drawable f5536w;

    /* JADX INFO: renamed from: x */
    private Drawable f5537x;

    /* JADX INFO: renamed from: y */
    private Drawable f5538y;

    /* JADX INFO: renamed from: z */
    private int f5539z;

    /* JADX INFO: renamed from: U1.h$a */
    private enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private C1665h(Context context, C3204d c3204d, Object obj, Object obj2, Class cls, AbstractC1658a abstractC1658a, int i7, int i8, EnumC3207g enumC3207g, InterfaceC1720h interfaceC1720h, InterfaceC1662e interfaceC1662e, List list, InterfaceC1661d interfaceC1661d, C0290k c0290k, InterfaceC1823c interfaceC1823c, Executor executor) {
        this.f5515b = f5510D ? String.valueOf(super.hashCode()) : null;
        this.f5516c = AbstractC2085c.m8610a();
        this.f5517d = obj;
        this.f5519f = context;
        this.f5520g = c3204d;
        this.f5521h = obj2;
        this.f5522i = cls;
        this.f5523j = abstractC1658a;
        this.f5524k = i7;
        this.f5525l = i8;
        this.f5526m = enumC3207g;
        this.f5527n = interfaceC1720h;
        this.f5528o = list;
        this.f5518e = interfaceC1661d;
        this.f5534u = c0290k;
        this.f5529p = interfaceC1823c;
        this.f5530q = executor;
        this.f5535v = a.PENDING;
        if (this.f5513C == null && c3204d.m17017g().m17020a(C3203c.c.class)) {
            this.f5513C = new RuntimeException("Glide request origin trace");
        }
    }

    /* JADX INFO: renamed from: A */
    private void m7004A(InterfaceC0301v interfaceC0301v, Object obj, EnumC0125a enumC0125a, boolean z7) {
        boolean zM7015s = m7015s();
        this.f5535v = a.COMPLETE;
        this.f5531r = interfaceC0301v;
        if (this.f5520g.m17018h() <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + enumC0125a + " for " + this.f5521h + " with size [" + this.f5539z + "x" + this.f5511A + "] in " + AbstractC2018g.m8392a(this.f5533t) + " ms");
        }
        m7020x();
        this.f5512B = true;
        try {
            List list = this.f5528o;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    AbstractC2263x.m9328a(it.next());
                    throw null;
                }
            }
            this.f5527n.mo5242c(obj, this.f5529p.mo7574a(enumC0125a, zM7015s));
            this.f5512B = false;
            AbstractC2084b.m8609f("GlideRequest", this.f5514a);
        } catch (Throwable th) {
            this.f5512B = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: B */
    private void m7005B() {
        if (m7008l()) {
            Drawable drawableM7013q = this.f5521h == null ? m7013q() : null;
            if (drawableM7013q == null) {
                drawableM7013q = m7012p();
            }
            if (drawableM7013q == null) {
                drawableM7013q = m7014r();
            }
            this.f5527n.mo7310d(drawableM7013q);
        }
    }

    /* JADX INFO: renamed from: f */
    private void m7006f() {
        if (this.f5512B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* JADX INFO: renamed from: j */
    private boolean m7007j() {
        InterfaceC1661d interfaceC1661d = this.f5518e;
        return interfaceC1661d == null || interfaceC1661d.mo6984a(this);
    }

    /* JADX INFO: renamed from: l */
    private boolean m7008l() {
        InterfaceC1661d interfaceC1661d = this.f5518e;
        return interfaceC1661d == null || interfaceC1661d.mo6987d(this);
    }

    /* JADX INFO: renamed from: m */
    private boolean m7009m() {
        InterfaceC1661d interfaceC1661d = this.f5518e;
        return interfaceC1661d == null || interfaceC1661d.mo6989f(this);
    }

    /* JADX INFO: renamed from: n */
    private void m7010n() {
        m7006f();
        this.f5516c.mo8612c();
        this.f5527n.mo7314b(this);
        C0290k.d dVar = this.f5532s;
        if (dVar != null) {
            dVar.m1412a();
            this.f5532s = null;
        }
    }

    /* JADX INFO: renamed from: o */
    private void m7011o(Object obj) {
        List list = this.f5528o;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2263x.m9328a(it.next());
        }
    }

    /* JADX INFO: renamed from: p */
    private Drawable m7012p() {
        if (this.f5536w == null) {
            Drawable drawableM6964j = this.f5523j.m6964j();
            this.f5536w = drawableM6964j;
            if (drawableM6964j == null && this.f5523j.m6962i() > 0) {
                this.f5536w = m7016t(this.f5523j.m6962i());
            }
        }
        return this.f5536w;
    }

    /* JADX INFO: renamed from: q */
    private Drawable m7013q() {
        if (this.f5538y == null) {
            Drawable drawableM6966k = this.f5523j.m6966k();
            this.f5538y = drawableM6966k;
            if (drawableM6966k == null && this.f5523j.m6967l() > 0) {
                this.f5538y = m7016t(this.f5523j.m6967l());
            }
        }
        return this.f5538y;
    }

    /* JADX INFO: renamed from: r */
    private Drawable m7014r() {
        if (this.f5537x == null) {
            Drawable drawableM6972s = this.f5523j.m6972s();
            this.f5537x = drawableM6972s;
            if (drawableM6972s == null && this.f5523j.m6973t() > 0) {
                this.f5537x = m7016t(this.f5523j.m6973t());
            }
        }
        return this.f5537x;
    }

    /* JADX INFO: renamed from: s */
    private boolean m7015s() {
        InterfaceC1661d interfaceC1661d = this.f5518e;
        return interfaceC1661d == null || !interfaceC1661d.mo6986c().mo6985b();
    }

    /* JADX INFO: renamed from: t */
    private Drawable m7016t(int i7) {
        return AbstractC0943i.m4191a(this.f5519f, i7, this.f5523j.m6978y() != null ? this.f5523j.m6978y() : this.f5519f.getTheme());
    }

    /* JADX INFO: renamed from: u */
    private void m7017u(String str) {
        Log.v("GlideRequest", str + " this: " + this.f5515b);
    }

    /* JADX INFO: renamed from: v */
    private static int m7018v(int i7, float f7) {
        return i7 == Integer.MIN_VALUE ? i7 : Math.round(f7 * i7);
    }

    /* JADX INFO: renamed from: w */
    private void m7019w() {
        InterfaceC1661d interfaceC1661d = this.f5518e;
        if (interfaceC1661d != null) {
            interfaceC1661d.mo6988e(this);
        }
    }

    /* JADX INFO: renamed from: x */
    private void m7020x() {
        InterfaceC1661d interfaceC1661d = this.f5518e;
        if (interfaceC1661d != null) {
            interfaceC1661d.mo6993j(this);
        }
    }

    /* JADX INFO: renamed from: y */
    public static C1665h m7021y(Context context, C3204d c3204d, Object obj, Object obj2, Class cls, AbstractC1658a abstractC1658a, int i7, int i8, EnumC3207g enumC3207g, InterfaceC1720h interfaceC1720h, InterfaceC1662e interfaceC1662e, List list, InterfaceC1661d interfaceC1661d, C0290k c0290k, InterfaceC1823c interfaceC1823c, Executor executor) {
        return new C1665h(context, c3204d, obj, obj2, cls, abstractC1658a, i7, i8, enumC3207g, interfaceC1720h, interfaceC1662e, list, interfaceC1661d, c0290k, interfaceC1823c, executor);
    }

    /* JADX INFO: renamed from: z */
    private void m7022z(C0296q c0296q, int i7) {
        this.f5516c.mo8612c();
        synchronized (this.f5517d) {
            try {
                c0296q.m1452k(this.f5513C);
                int iM17018h = this.f5520g.m17018h();
                if (iM17018h <= i7) {
                    Log.w("Glide", "Load failed for [" + this.f5521h + "] with dimensions [" + this.f5539z + "x" + this.f5511A + "]", c0296q);
                    if (iM17018h <= 4) {
                        c0296q.m1449g("Glide");
                    }
                }
                this.f5532s = null;
                this.f5535v = a.FAILED;
                m7019w();
                this.f5512B = true;
                try {
                    List list = this.f5528o;
                    if (list != null) {
                        Iterator it = list.iterator();
                        if (it.hasNext()) {
                            AbstractC2263x.m9328a(it.next());
                            m7015s();
                            throw null;
                        }
                    }
                    m7005B();
                    this.f5512B = false;
                    AbstractC2084b.m8609f("GlideRequest", this.f5514a);
                } catch (Throwable th) {
                    this.f5512B = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p155U1.InterfaceC1664g
    /* JADX INFO: renamed from: a */
    public void mo7001a(InterfaceC0301v interfaceC0301v, EnumC0125a enumC0125a, boolean z7) {
        this.f5516c.mo8612c();
        InterfaceC0301v interfaceC0301v2 = null;
        try {
            synchronized (this.f5517d) {
                try {
                    this.f5532s = null;
                    if (interfaceC0301v == null) {
                        mo7002c(new C0296q("Expected to receive a Resource<R> with an object of " + this.f5522i + " inside, but instead got null."));
                        return;
                    }
                    Object obj = interfaceC0301v.get();
                    try {
                        if (obj == null || !this.f5522i.isAssignableFrom(obj.getClass())) {
                            this.f5531r = null;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Expected to receive an object of ");
                            sb.append(this.f5522i);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(interfaceC0301v);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            mo7002c(new C0296q(sb.toString()));
                        } else if (m7009m()) {
                            m7004A(interfaceC0301v, obj, enumC0125a, z7);
                            return;
                        } else {
                            this.f5531r = null;
                            this.f5535v = a.COMPLETE;
                            AbstractC2084b.m8609f("GlideRequest", this.f5514a);
                        }
                        this.f5534u.m1406k(interfaceC0301v);
                    } catch (Throwable th) {
                        interfaceC0301v2 = interfaceC0301v;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (interfaceC0301v2 != null) {
                this.f5534u.m1406k(interfaceC0301v2);
            }
            throw th3;
        }
    }

    @Override // p155U1.InterfaceC1660c
    /* JADX INFO: renamed from: b */
    public boolean mo6985b() {
        boolean z7;
        synchronized (this.f5517d) {
            z7 = this.f5535v == a.COMPLETE;
        }
        return z7;
    }

    @Override // p155U1.InterfaceC1664g
    /* JADX INFO: renamed from: c */
    public void mo7002c(C0296q c0296q) {
        m7022z(c0296q, 5);
    }

    @Override // p155U1.InterfaceC1660c
    public void clear() {
        synchronized (this.f5517d) {
            try {
                m7006f();
                this.f5516c.mo8612c();
                a aVar = this.f5535v;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                m7010n();
                InterfaceC0301v interfaceC0301v = this.f5531r;
                if (interfaceC0301v != null) {
                    this.f5531r = null;
                } else {
                    interfaceC0301v = null;
                }
                if (m7007j()) {
                    this.f5527n.mo5243i(m7014r());
                }
                AbstractC2084b.m8609f("GlideRequest", this.f5514a);
                this.f5535v = aVar2;
                if (interfaceC0301v != null) {
                    this.f5534u.m1406k(interfaceC0301v);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
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
    @Override // p162V1.InterfaceC1719g
    /* JADX INFO: renamed from: d */
    public void mo7023d(int i7, int i8) throws Throwable {
        Object obj;
        C1665h c1665h = this;
        c1665h.f5516c.mo8612c();
        Object obj2 = c1665h.f5517d;
        synchronized (obj2) {
            try {
                try {
                    boolean z7 = f5510D;
                    if (z7) {
                        c1665h.m7017u("Got onSizeReady in " + AbstractC2018g.m8392a(c1665h.f5533t));
                    }
                    if (c1665h.f5535v == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        c1665h.f5535v = aVar;
                        float fM6977x = c1665h.f5523j.m6977x();
                        c1665h.f5539z = m7018v(i7, fM6977x);
                        c1665h.f5511A = m7018v(i8, fM6977x);
                        if (z7) {
                            c1665h.m7017u("finished setup for calling load in " + AbstractC2018g.m8392a(c1665h.f5533t));
                        }
                        try {
                            C0290k c0290k = c1665h.f5534u;
                            C3204d c3204d = c1665h.f5520g;
                            try {
                                Object obj3 = c1665h.f5521h;
                                InterfaceC0130f interfaceC0130fM6976w = c1665h.f5523j.m6976w();
                                try {
                                    int i9 = c1665h.f5539z;
                                    int i10 = c1665h.f5511A;
                                    Class clsM6975v = c1665h.f5523j.m6975v();
                                    Class cls = c1665h.f5522i;
                                    try {
                                        EnumC3207g enumC3207g = c1665h.f5526m;
                                        AbstractC0289j abstractC0289jM6960h = c1665h.f5523j.m6960h();
                                        Map mapM6979z = c1665h.f5523j.m6979z();
                                        boolean zM6933K = c1665h.f5523j.m6933K();
                                        boolean zM6931G = c1665h.f5523j.m6931G();
                                        C0132h c0132hM6969p = c1665h.f5523j.m6969p();
                                        boolean zM6929E = c1665h.f5523j.m6929E();
                                        boolean zM6926B = c1665h.f5523j.m6926B();
                                        boolean zM6925A = c1665h.f5523j.m6925A();
                                        boolean zM6968o = c1665h.f5523j.m6968o();
                                        Executor executor = c1665h.f5530q;
                                        Object obj4 = obj2;
                                        try {
                                            c1665h.f5532s = c0290k.m1405f(c3204d, obj3, interfaceC0130fM6976w, i9, i10, clsM6975v, cls, enumC3207g, abstractC0289jM6960h, mapM6979z, zM6933K, zM6931G, c0132hM6969p, zM6929E, zM6926B, zM6925A, zM6968o, c1665h, executor);
                                            if (c1665h.f5535v != aVar) {
                                                c1665h.f5532s = null;
                                            }
                                            if (z7) {
                                                c1665h.m7017u("finished onSizeReady in " + AbstractC2018g.m8392a(c1665h.f5533t));
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            obj = obj4;
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        obj = obj2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj = obj2;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                obj = obj2;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            obj = obj2;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    obj = obj2;
                }
            } catch (Throwable th7) {
                th = th7;
                obj = c1665h;
            }
        }
    }

    @Override // p155U1.InterfaceC1664g
    /* JADX INFO: renamed from: e */
    public Object mo7003e() {
        this.f5516c.mo8612c();
        return this.f5517d;
    }

    @Override // p155U1.InterfaceC1660c
    /* JADX INFO: renamed from: g */
    public boolean mo6990g() {
        boolean z7;
        synchronized (this.f5517d) {
            z7 = this.f5535v == a.CLEARED;
        }
        return z7;
    }

    @Override // p155U1.InterfaceC1660c
    /* JADX INFO: renamed from: h */
    public void mo6991h() {
        synchronized (this.f5517d) {
            try {
                m7006f();
                this.f5516c.mo8612c();
                this.f5533t = AbstractC2018g.m8393b();
                Object obj = this.f5521h;
                if (obj == null) {
                    if (AbstractC2023l.m8429t(this.f5524k, this.f5525l)) {
                        this.f5539z = this.f5524k;
                        this.f5511A = this.f5525l;
                    }
                    m7022z(new C0296q("Received null model"), m7013q() == null ? 5 : 3);
                    return;
                }
                a aVar = this.f5535v;
                a aVar2 = a.RUNNING;
                if (aVar == aVar2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.COMPLETE) {
                    mo7001a(this.f5531r, EnumC0125a.MEMORY_CACHE, false);
                    return;
                }
                m7011o(obj);
                this.f5514a = AbstractC2084b.m8605b("GlideRequest");
                a aVar3 = a.WAITING_FOR_SIZE;
                this.f5535v = aVar3;
                if (AbstractC2023l.m8429t(this.f5524k, this.f5525l)) {
                    mo7023d(this.f5524k, this.f5525l);
                } else {
                    this.f5527n.mo7317j(this);
                }
                a aVar4 = this.f5535v;
                if ((aVar4 == aVar2 || aVar4 == aVar3) && m7008l()) {
                    this.f5527n.mo7311g(m7014r());
                }
                if (f5510D) {
                    m7017u("finished run method in " + AbstractC2018g.m8392a(this.f5533t));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p155U1.InterfaceC1660c
    /* JADX INFO: renamed from: i */
    public boolean mo6992i(InterfaceC1660c interfaceC1660c) {
        int i7;
        int i8;
        Object obj;
        Class cls;
        AbstractC1658a abstractC1658a;
        EnumC3207g enumC3207g;
        int size;
        int i9;
        int i10;
        Object obj2;
        Class cls2;
        AbstractC1658a abstractC1658a2;
        EnumC3207g enumC3207g2;
        int size2;
        if (!(interfaceC1660c instanceof C1665h)) {
            return false;
        }
        synchronized (this.f5517d) {
            try {
                i7 = this.f5524k;
                i8 = this.f5525l;
                obj = this.f5521h;
                cls = this.f5522i;
                abstractC1658a = this.f5523j;
                enumC3207g = this.f5526m;
                List list = this.f5528o;
                size = list != null ? list.size() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        C1665h c1665h = (C1665h) interfaceC1660c;
        synchronized (c1665h.f5517d) {
            try {
                i9 = c1665h.f5524k;
                i10 = c1665h.f5525l;
                obj2 = c1665h.f5521h;
                cls2 = c1665h.f5522i;
                abstractC1658a2 = c1665h.f5523j;
                enumC3207g2 = c1665h.f5526m;
                List list2 = c1665h.f5528o;
                size2 = list2 != null ? list2.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i7 == i9 && i8 == i10 && AbstractC2023l.m8412c(obj, obj2) && cls.equals(cls2) && AbstractC2023l.m8411b(abstractC1658a, abstractC1658a2) && enumC3207g == enumC3207g2 && size == size2;
    }

    @Override // p155U1.InterfaceC1660c
    public boolean isRunning() {
        boolean z7;
        synchronized (this.f5517d) {
            try {
                a aVar = this.f5535v;
                z7 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    @Override // p155U1.InterfaceC1660c
    /* JADX INFO: renamed from: k */
    public boolean mo6994k() {
        boolean z7;
        synchronized (this.f5517d) {
            z7 = this.f5535v == a.COMPLETE;
        }
        return z7;
    }

    @Override // p155U1.InterfaceC1660c
    public void pause() {
        synchronized (this.f5517d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        Object obj;
        Class cls;
        synchronized (this.f5517d) {
            obj = this.f5521h;
            cls = this.f5522i;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
