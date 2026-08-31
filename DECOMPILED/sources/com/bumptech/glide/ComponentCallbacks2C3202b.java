package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import androidx.appcompat.app.AbstractC2263x;
import androidx.fragment.app.AbstractActivityC2592j;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p035E1.C0290k;
import p043F1.InterfaceC0404b;
import p043F1.InterfaceC0406d;
import p051G1.InterfaceC0477h;
import p134R1.C1322o;
import p134R1.InterfaceC1310c;
import p141S1.AbstractC1386a;
import p141S1.C1389d;
import p155U1.C1663f;
import p162V1.C1718f;
import p162V1.InterfaceC1720h;
import p183Y1.AbstractC2022k;
import p183Y1.AbstractC2023l;

/* JADX INFO: renamed from: com.bumptech.glide.b */
/* JADX INFO: loaded from: classes.dex */
public class ComponentCallbacks2C3202b implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: v */
    private static volatile ComponentCallbacks2C3202b f13680v;

    /* JADX INFO: renamed from: w */
    private static volatile boolean f13681w;

    /* JADX INFO: renamed from: a */
    private final C0290k f13682a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0406d f13683b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0477h f13684c;

    /* JADX INFO: renamed from: d */
    private final C3204d f13685d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC0404b f13686e;

    /* JADX INFO: renamed from: f */
    private final C1322o f13687f;

    /* JADX INFO: renamed from: r */
    private final InterfaceC1310c f13688r;

    /* JADX INFO: renamed from: t */
    private final a f13690t;

    /* JADX INFO: renamed from: s */
    private final List f13689s = new ArrayList();

    /* JADX INFO: renamed from: u */
    private EnumC3206f f13691u = EnumC3206f.NORMAL;

    /* JADX INFO: renamed from: com.bumptech.glide.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        C1663f mo17008a();
    }

    ComponentCallbacks2C3202b(Context context, C0290k c0290k, InterfaceC0477h interfaceC0477h, InterfaceC0406d interfaceC0406d, InterfaceC0404b interfaceC0404b, C1322o c1322o, InterfaceC1310c interfaceC1310c, int i7, a aVar, Map map, List list, List list2, AbstractC1386a abstractC1386a, C3205e c3205e) {
        this.f13682a = c0290k;
        this.f13683b = interfaceC0406d;
        this.f13686e = interfaceC0404b;
        this.f13684c = interfaceC0477h;
        this.f13687f = c1322o;
        this.f13688r = interfaceC1310c;
        this.f13690t = aVar;
        this.f13685d = new C3204d(context, interfaceC0404b, AbstractC3210j.m17046d(this, list2, abstractC1386a), new C1718f(), aVar, map, list, c0290k, c3205e, i7);
    }

    /* JADX INFO: renamed from: a */
    static void m16987a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f13681w) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f13681w = true;
        try {
            m16991m(context, generatedAppGlideModule);
        } finally {
            f13681w = false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static ComponentCallbacks2C3202b m16988c(Context context) {
        if (f13680v == null) {
            GeneratedAppGlideModule generatedAppGlideModuleM16989d = m16989d(context.getApplicationContext());
            synchronized (ComponentCallbacks2C3202b.class) {
                try {
                    if (f13680v == null) {
                        m16987a(context, generatedAppGlideModuleM16989d);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13680v;
    }

    /* JADX INFO: renamed from: d */
    private static GeneratedAppGlideModule m16989d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e7) {
            m16993q(e7);
            return null;
        } catch (InstantiationException e8) {
            m16993q(e8);
            return null;
        } catch (NoSuchMethodException e9) {
            m16993q(e9);
            return null;
        } catch (InvocationTargetException e10) {
            m16993q(e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    private static C1322o m16990l(Context context) {
        AbstractC2022k.m8409f(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m16988c(context).m17003k();
    }

    /* JADX INFO: renamed from: m */
    private static void m16991m(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        m16992n(context, new C3203c(), generatedAppGlideModule);
    }

    /* JADX INFO: renamed from: n */
    private static void m16992n(Context context, C3203c c3203c, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List listM5965b = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.m5960c()) {
            listM5965b = new C1389d(applicationContext).m5965b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.m16985d().isEmpty()) {
            generatedAppGlideModule.m16985d();
            Iterator it = listM5965b.iterator();
            if (it.hasNext()) {
                AbstractC2263x.m9328a(it.next());
                throw null;
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = listM5965b.iterator();
            if (it2.hasNext()) {
                AbstractC2263x.m9328a(it2.next());
                new StringBuilder().append("Discovered GlideModule from manifest: ");
                throw null;
            }
        }
        c3203c.m17010b(generatedAppGlideModule != null ? generatedAppGlideModule.m16986e() : null);
        Iterator it3 = listM5965b.iterator();
        if (it3.hasNext()) {
            AbstractC2263x.m9328a(it3.next());
            throw null;
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.m5959b(applicationContext, c3203c);
        }
        ComponentCallbacks2C3202b componentCallbacks2C3202bM17009a = c3203c.m17009a(applicationContext, listM5965b, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(componentCallbacks2C3202bM17009a);
        f13680v = componentCallbacks2C3202bM17009a;
    }

    /* JADX INFO: renamed from: q */
    private static void m16993q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* JADX INFO: renamed from: t */
    public static ComponentCallbacks2C3212l m16994t(Context context) {
        return m16990l(context).m5667d(context);
    }

    /* JADX INFO: renamed from: u */
    public static ComponentCallbacks2C3212l m16995u(AbstractActivityC2592j abstractActivityC2592j) {
        return m16990l(abstractActivityC2592j).m5668e(abstractActivityC2592j);
    }

    /* JADX INFO: renamed from: b */
    public void m16996b() {
        AbstractC2023l.m8410a();
        this.f13684c.m2049b();
        this.f13683b.mo1744b();
        this.f13686e.mo1736b();
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC0404b m16997e() {
        return this.f13686e;
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC0406d m16998f() {
        return this.f13683b;
    }

    /* JADX INFO: renamed from: g */
    InterfaceC1310c m16999g() {
        return this.f13688r;
    }

    /* JADX INFO: renamed from: h */
    public Context m17000h() {
        return this.f13685d.getBaseContext();
    }

    /* JADX INFO: renamed from: i */
    C3204d m17001i() {
        return this.f13685d;
    }

    /* JADX INFO: renamed from: j */
    public C3209i m17002j() {
        return this.f13685d.m17019i();
    }

    /* JADX INFO: renamed from: k */
    public C1322o m17003k() {
        return this.f13687f;
    }

    /* JADX INFO: renamed from: o */
    void m17004o(ComponentCallbacks2C3212l componentCallbacks2C3212l) {
        synchronized (this.f13689s) {
            try {
                if (this.f13689s.contains(componentCallbacks2C3212l)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f13689s.add(componentCallbacks2C3212l);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        m16996b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i7) {
        m17006r(i7);
    }

    /* JADX INFO: renamed from: p */
    boolean m17005p(InterfaceC1720h interfaceC1720h) {
        synchronized (this.f13689s) {
            try {
                Iterator it = this.f13689s.iterator();
                while (it.hasNext()) {
                    if (((ComponentCallbacks2C3212l) it.next()).m17070A(interfaceC1720h)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m17006r(int i7) {
        AbstractC2023l.m8410a();
        synchronized (this.f13689s) {
            try {
                Iterator it = this.f13689s.iterator();
                while (it.hasNext()) {
                    ((ComponentCallbacks2C3212l) it.next()).onTrimMemory(i7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f13684c.mo2041a(i7);
        this.f13683b.mo1743a(i7);
        this.f13686e.mo1735a(i7);
    }

    /* JADX INFO: renamed from: s */
    void m17007s(ComponentCallbacks2C3212l componentCallbacks2C3212l) {
        synchronized (this.f13689s) {
            try {
                if (!this.f13689s.contains(componentCallbacks2C3212l)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f13689s.remove(componentCallbacks2C3212l);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
