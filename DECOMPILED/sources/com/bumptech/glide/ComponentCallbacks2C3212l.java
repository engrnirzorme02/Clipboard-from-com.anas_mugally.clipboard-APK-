package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p035E1.AbstractC0289j;
import p120P1.C1186c;
import p134R1.C1324q;
import p134R1.C1326s;
import p134R1.InterfaceC1309b;
import p134R1.InterfaceC1310c;
import p134R1.InterfaceC1317j;
import p134R1.InterfaceC1319l;
import p134R1.InterfaceC1323p;
import p155U1.C1663f;
import p155U1.InterfaceC1660c;
import p162V1.InterfaceC1720h;
import p183Y1.AbstractC2023l;

/* JADX INFO: renamed from: com.bumptech.glide.l */
/* JADX INFO: loaded from: classes.dex */
public class ComponentCallbacks2C3212l implements ComponentCallbacks2, InterfaceC1319l {

    /* JADX INFO: renamed from: x */
    private static final C1663f f13765x = (C1663f) C1663f.m6998k0(Bitmap.class).m6936N();

    /* JADX INFO: renamed from: y */
    private static final C1663f f13766y = (C1663f) C1663f.m6998k0(C1186c.class).m6936N();

    /* JADX INFO: renamed from: z */
    private static final C1663f f13767z = (C1663f) ((C1663f) C1663f.m6999l0(AbstractC0289j.f1157c).m6943V(EnumC3207g.LOW)).m6953d0(true);

    /* JADX INFO: renamed from: a */
    protected final ComponentCallbacks2C3202b f13768a;

    /* JADX INFO: renamed from: b */
    protected final Context f13769b;

    /* JADX INFO: renamed from: c */
    final InterfaceC1317j f13770c;

    /* JADX INFO: renamed from: d */
    private final C1324q f13771d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1323p f13772e;

    /* JADX INFO: renamed from: f */
    private final C1326s f13773f;

    /* JADX INFO: renamed from: r */
    private final Runnable f13774r;

    /* JADX INFO: renamed from: s */
    private final InterfaceC1309b f13775s;

    /* JADX INFO: renamed from: t */
    private final CopyOnWriteArrayList f13776t;

    /* JADX INFO: renamed from: u */
    private C1663f f13777u;

    /* JADX INFO: renamed from: v */
    private boolean f13778v;

    /* JADX INFO: renamed from: w */
    private boolean f13779w;

    /* JADX INFO: renamed from: com.bumptech.glide.l$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentCallbacks2C3212l componentCallbacks2C3212l = ComponentCallbacks2C3212l.this;
            componentCallbacks2C3212l.f13770c.mo5648a(componentCallbacks2C3212l);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.l$b */
    private class b implements InterfaceC1309b.a {

        /* JADX INFO: renamed from: a */
        private final C1324q f13781a;

        b(C1324q c1324q) {
            this.f13781a = c1324q;
        }

        @Override // p134R1.InterfaceC1309b.a
        /* JADX INFO: renamed from: a */
        public void mo5650a(boolean z7) {
            if (z7) {
                synchronized (ComponentCallbacks2C3212l.this) {
                    this.f13781a.m5674e();
                }
            }
        }
    }

    public ComponentCallbacks2C3212l(ComponentCallbacks2C3202b componentCallbacks2C3202b, InterfaceC1317j interfaceC1317j, InterfaceC1323p interfaceC1323p, Context context) {
        this(componentCallbacks2C3202b, interfaceC1317j, interfaceC1323p, new C1324q(), componentCallbacks2C3202b.m16999g(), context);
    }

    /* JADX INFO: renamed from: B */
    private void m17068B(InterfaceC1720h interfaceC1720h) {
        boolean zM17070A = m17070A(interfaceC1720h);
        InterfaceC1660c interfaceC1660cMo7316h = interfaceC1720h.mo7316h();
        if (zM17070A || this.f13768a.m17005p(interfaceC1720h) || interfaceC1660cMo7316h == null) {
            return;
        }
        interfaceC1720h.mo7315f(null);
        interfaceC1660cMo7316h.clear();
    }

    /* JADX INFO: renamed from: o */
    private synchronized void m17069o() {
        try {
            Iterator it = this.f13773f.m5688l().iterator();
            while (it.hasNext()) {
                m17074n((InterfaceC1720h) it.next());
            }
            this.f13773f.m5687k();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: A */
    synchronized boolean m17070A(InterfaceC1720h interfaceC1720h) {
        InterfaceC1660c interfaceC1660cMo7316h = interfaceC1720h.mo7316h();
        if (interfaceC1660cMo7316h == null) {
            return true;
        }
        if (!this.f13771d.m5670a(interfaceC1660cMo7316h)) {
            return false;
        }
        this.f13773f.m5690n(interfaceC1720h);
        interfaceC1720h.mo7315f(null);
        return true;
    }

    @Override // p134R1.InterfaceC1319l
    /* JADX INFO: renamed from: a */
    public synchronized void mo5654a() {
        m17083x();
        this.f13773f.mo5654a();
    }

    @Override // p134R1.InterfaceC1319l
    /* JADX INFO: renamed from: e */
    public synchronized void mo5655e() {
        try {
            this.f13773f.mo5655e();
            if (this.f13779w) {
                m17069o();
            } else {
                m17082w();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public C3211k m17071k(Class cls) {
        return new C3211k(this.f13768a, this, cls, this.f13769b);
    }

    /* JADX INFO: renamed from: l */
    public C3211k m17072l() {
        return m17071k(Bitmap.class).mo6946a(f13765x);
    }

    /* JADX INFO: renamed from: m */
    public C3211k m17073m() {
        return m17071k(Drawable.class);
    }

    /* JADX INFO: renamed from: n */
    public void m17074n(InterfaceC1720h interfaceC1720h) {
        if (interfaceC1720h == null) {
            return;
        }
        m17068B(interfaceC1720h);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // p134R1.InterfaceC1319l
    public synchronized void onDestroy() {
        this.f13773f.onDestroy();
        m17069o();
        this.f13771d.m5671b();
        this.f13770c.mo5649b(this);
        this.f13770c.mo5649b(this.f13775s);
        AbstractC2023l.m8432w(this.f13774r);
        this.f13768a.m17007s(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i7) {
        if (i7 == 60 && this.f13778v) {
            m17081v();
        }
    }

    /* JADX INFO: renamed from: p */
    List m17075p() {
        return this.f13776t;
    }

    /* JADX INFO: renamed from: q */
    synchronized C1663f m17076q() {
        return this.f13777u;
    }

    /* JADX INFO: renamed from: r */
    AbstractC3230m m17077r(Class cls) {
        return this.f13768a.m17001i().m17015e(cls);
    }

    /* JADX INFO: renamed from: s */
    public C3211k m17078s(Uri uri) {
        return m17073m().m17066y0(uri);
    }

    /* JADX INFO: renamed from: t */
    public C3211k m17079t(String str) {
        return m17073m().m17059A0(str);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f13771d + ", treeNode=" + this.f13772e + "}";
    }

    /* JADX INFO: renamed from: u */
    public synchronized void m17080u() {
        this.f13771d.m5672c();
    }

    /* JADX INFO: renamed from: v */
    public synchronized void m17081v() {
        m17080u();
        Iterator it = this.f13772e.mo5657a().iterator();
        while (it.hasNext()) {
            ((ComponentCallbacks2C3212l) it.next()).m17080u();
        }
    }

    /* JADX INFO: renamed from: w */
    public synchronized void m17082w() {
        this.f13771d.m5673d();
    }

    /* JADX INFO: renamed from: x */
    public synchronized void m17083x() {
        this.f13771d.m5675f();
    }

    /* JADX INFO: renamed from: y */
    protected synchronized void m17084y(C1663f c1663f) {
        this.f13777u = (C1663f) ((C1663f) c1663f.clone()).m6948b();
    }

    /* JADX INFO: renamed from: z */
    synchronized void m17085z(InterfaceC1720h interfaceC1720h, InterfaceC1660c interfaceC1660c) {
        this.f13773f.m5689m(interfaceC1720h);
        this.f13771d.m5676g(interfaceC1660c);
    }

    ComponentCallbacks2C3212l(ComponentCallbacks2C3202b componentCallbacks2C3202b, InterfaceC1317j interfaceC1317j, InterfaceC1323p interfaceC1323p, C1324q c1324q, InterfaceC1310c interfaceC1310c, Context context) {
        this.f13773f = new C1326s();
        a aVar = new a();
        this.f13774r = aVar;
        this.f13768a = componentCallbacks2C3202b;
        this.f13770c = interfaceC1317j;
        this.f13772e = interfaceC1323p;
        this.f13771d = c1324q;
        this.f13769b = context;
        InterfaceC1309b interfaceC1309bMo5651a = interfaceC1310c.mo5651a(context.getApplicationContext(), new b(c1324q));
        this.f13775s = interfaceC1309bMo5651a;
        componentCallbacks2C3202b.m17004o(this);
        if (AbstractC2023l.m8426q()) {
            AbstractC2023l.m8431v(aVar);
        } else {
            interfaceC1317j.mo5648a(this);
        }
        interfaceC1317j.mo5648a(interfaceC1309bMo5651a);
        this.f13776t = new CopyOnWriteArrayList(componentCallbacks2C3202b.m17001i().m17013c());
        m17084y(componentCallbacks2C3202b.m17001i().m17014d());
    }
}
