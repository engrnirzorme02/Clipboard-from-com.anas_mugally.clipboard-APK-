package p164V3;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.C2390a;
import androidx.lifecycle.AbstractC2636b;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C3592c;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3748c;
import com.google.android.gms.common.util.AbstractC3760o;
import com.google.android.gms.common.util.AbstractC3763r;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p081K.AbstractC0724p;
import p116O4.InterfaceC1147c;
import p193Z4.C2154f;
import p200a4.C2210c;
import p200a4.C2213f;
import p200a4.C2221n;
import p200a4.C2230w;
import p210b4.EnumC2970k;
import p211b5.InterfaceC2972b;
import p253g5.C5517a;
import p335q5.AbstractC6844c;
import p335q5.C6843b;

/* JADX INFO: renamed from: V3.g */
/* JADX INFO: loaded from: classes.dex */
public class C1762g {

    /* JADX INFO: renamed from: k */
    private static final Object f5794k = new Object();

    /* JADX INFO: renamed from: l */
    static final Map f5795l = new C2390a();

    /* JADX INFO: renamed from: a */
    private final Context f5796a;

    /* JADX INFO: renamed from: b */
    private final String f5797b;

    /* JADX INFO: renamed from: c */
    private final C1771p f5798c;

    /* JADX INFO: renamed from: d */
    private final C2221n f5799d;

    /* JADX INFO: renamed from: g */
    private final C2230w f5802g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC2972b f5803h;

    /* JADX INFO: renamed from: e */
    private final AtomicBoolean f5800e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    private final AtomicBoolean f5801f = new AtomicBoolean();

    /* JADX INFO: renamed from: i */
    private final List f5804i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j */
    private final List f5805j = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: V3.g$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo7385a(boolean z7);
    }

    /* JADX INFO: renamed from: V3.g$b */
    private static class b implements ComponentCallbacks2C3592c.a {

        /* JADX INFO: renamed from: a */
        private static AtomicReference f5806a = new AtomicReference();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static void m7412c(Context context) {
            if (AbstractC3760o.m18193a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f5806a.get() == null) {
                    b bVar = new b();
                    if (AbstractC2636b.m12603a(f5806a, null, bVar)) {
                        ComponentCallbacks2C3592c.m17858c(application);
                        ComponentCallbacks2C3592c.m17857b().m17860a(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C3592c.a
        /* JADX INFO: renamed from: a */
        public void mo7413a(boolean z7) {
            synchronized (C1762g.f5794k) {
                try {
                    for (C1762g c1762g : new ArrayList(C1762g.f5795l.values())) {
                        if (c1762g.f5800e.get()) {
                            c1762g.m7401y(z7);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: V3.g$c */
    private static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: b */
        private static AtomicReference f5807b = new AtomicReference();

        /* JADX INFO: renamed from: a */
        private final Context f5808a;

        public c(Context context) {
            this.f5808a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static void m7415b(Context context) {
            if (f5807b.get() == null) {
                c cVar = new c(context);
                if (AbstractC2636b.m12603a(f5807b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m7416c() {
            this.f5808a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C1762g.f5794k) {
                try {
                    Iterator it = C1762g.f5795l.values().iterator();
                    while (it.hasNext()) {
                        ((C1762g) it.next()).m7396r();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            m7416c();
        }
    }

    protected C1762g(final Context context, String str, C1771p c1771p) {
        this.f5796a = (Context) AbstractC3718s.m18083l(context);
        this.f5797b = AbstractC3718s.m18077f(str);
        this.f5798c = (C1771p) AbstractC3718s.m18083l(c1771p);
        AbstractC1773r abstractC1773rM22550b = FirebaseInitProvider.m22550b();
        AbstractC6844c.m29879b("Firebase");
        AbstractC6844c.m29879b("ComponentDiscovery");
        List listM8993b = C2213f.m8991c(context, ComponentDiscoveryService.class).m8993b();
        AbstractC6844c.m29878a();
        AbstractC6844c.m29879b("Runtime");
        C2221n.b bVarM9015f = C2221n.m9001m(EnumC2970k.INSTANCE).m9013d(listM8993b).m9012c(new FirebaseCommonRegistrar()).m9012c(new ExecutorsRegistrar()).m9011b(C2210c.m8969q(context, Context.class, new Class[0])).m9011b(C2210c.m8969q(this, C1762g.class, new Class[0])).m9011b(C2210c.m8969q(c1771p, C1771p.class, new Class[0])).m9015f(new C6843b());
        if (AbstractC0724p.m3488a(context) && FirebaseInitProvider.m22551c()) {
            bVarM9015f.m9011b(C2210c.m8969q(abstractC1773rM22550b, AbstractC1773r.class, new Class[0]));
        }
        C2221n c2221nM9014e = bVarM9015f.m9014e();
        this.f5799d = c2221nM9014e;
        AbstractC6844c.m29878a();
        this.f5802g = new C2230w(new InterfaceC2972b() { // from class: V3.e
            @Override // p211b5.InterfaceC2972b
            public final Object get() {
                return C1762g.m7387b(this.f5791a, context);
            }
        });
        this.f5803h = c2221nM9014e.mo8955c(C2154f.class);
        m7402g(new a() { // from class: V3.f
            @Override // p164V3.C1762g.a
            /* JADX INFO: renamed from: a */
            public final void mo7385a(boolean z7) {
                C1762g.m7386a(this.f5793a, z7);
            }
        });
        AbstractC6844c.m29878a();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m7386a(C1762g c1762g, boolean z7) {
        if (z7) {
            c1762g.getClass();
        } else {
            ((C2154f) c1762g.f5803h.get()).m8763h();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C5517a m7387b(C1762g c1762g, Context context) {
        return new C5517a(context, c1762g.m7408q(), (InterfaceC1147c) c1762g.f5799d.mo8953a(InterfaceC1147c.class));
    }

    /* JADX INFO: renamed from: i */
    private void m7392i() {
        AbstractC3718s.m18087p(!this.f5801f.get(), "FirebaseApp was deleted");
    }

    /* JADX INFO: renamed from: k */
    private static List m7393k() {
        ArrayList arrayList = new ArrayList();
        synchronized (f5794k) {
            try {
                Iterator it = f5795l.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(((C1762g) it.next()).m7406o());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public static C1762g m7394m() {
        C1762g c1762g;
        synchronized (f5794k) {
            try {
                c1762g = (C1762g) f5795l.get("[DEFAULT]");
                if (c1762g == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + AbstractC3763r.m18205a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((C2154f) c1762g.f5803h.get()).m8763h();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1762g;
    }

    /* JADX INFO: renamed from: n */
    public static C1762g m7395n(String str) {
        C1762g c1762g;
        String str2;
        synchronized (f5794k) {
            try {
                c1762g = (C1762g) f5795l.get(m7400x(str));
                if (c1762g == null) {
                    List listM7393k = m7393k();
                    if (listM7393k.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", listM7393k);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
                }
                ((C2154f) c1762g.f5803h.get()).m8763h();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1762g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public void m7396r() {
        if (!AbstractC0724p.m3488a(this.f5796a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m7406o());
            c.m7415b(this.f5796a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m7406o());
        this.f5799d.m9009p(m7410w());
        ((C2154f) this.f5803h.get()).m8763h();
    }

    /* JADX INFO: renamed from: s */
    public static C1762g m7397s(Context context) {
        synchronized (f5794k) {
            try {
                if (f5795l.containsKey("[DEFAULT]")) {
                    return m7394m();
                }
                C1771p c1771pM7421a = C1771p.m7421a(context);
                if (c1771pM7421a == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return m7398t(context, c1771pM7421a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public static C1762g m7398t(Context context, C1771p c1771p) {
        return m7399u(context, c1771p, "[DEFAULT]");
    }

    /* JADX INFO: renamed from: u */
    public static C1762g m7399u(Context context, C1771p c1771p, String str) {
        C1762g c1762g;
        b.m7412c(context);
        String strM7400x = m7400x(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f5794k) {
            Map map = f5795l;
            AbstractC3718s.m18087p(!map.containsKey(strM7400x), "FirebaseApp name " + strM7400x + " already exists!");
            AbstractC3718s.m18084m(context, "Application context cannot be null.");
            c1762g = new C1762g(context, strM7400x, c1771p);
            map.put(strM7400x, c1762g);
        }
        c1762g.m7396r();
        return c1762g;
    }

    /* JADX INFO: renamed from: x */
    private static String m7400x(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m7401y(boolean z7) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f5804i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).mo7385a(z7);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1762g) {
            return this.f5797b.equals(((C1762g) obj).m7406o());
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void m7402g(a aVar) {
        m7392i();
        if (this.f5800e.get() && ComponentCallbacks2C3592c.m17857b().m17861d()) {
            aVar.mo7385a(true);
        }
        this.f5804i.add(aVar);
    }

    /* JADX INFO: renamed from: h */
    public void m7403h(InterfaceC1763h interfaceC1763h) {
        m7392i();
        AbstractC3718s.m18083l(interfaceC1763h);
        this.f5805j.add(interfaceC1763h);
    }

    public int hashCode() {
        return this.f5797b.hashCode();
    }

    /* JADX INFO: renamed from: j */
    public Object m7404j(Class cls) {
        m7392i();
        return this.f5799d.mo8953a(cls);
    }

    /* JADX INFO: renamed from: l */
    public Context m7405l() {
        m7392i();
        return this.f5796a;
    }

    /* JADX INFO: renamed from: o */
    public String m7406o() {
        m7392i();
        return this.f5797b;
    }

    /* JADX INFO: renamed from: p */
    public C1771p m7407p() {
        m7392i();
        return this.f5798c;
    }

    /* JADX INFO: renamed from: q */
    public String m7408q() {
        return AbstractC3748c.m18157e(m7406o().getBytes(Charset.defaultCharset())) + "+" + AbstractC3748c.m18157e(m7407p().m7423c().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return AbstractC3714q.m18055d(this).m18056a("name", this.f5797b).m18056a("options", this.f5798c).toString();
    }

    /* JADX INFO: renamed from: v */
    public boolean m7409v() {
        m7392i();
        return ((C5517a) this.f5802g.get()).m24928b();
    }

    /* JADX INFO: renamed from: w */
    public boolean m7410w() {
        return "[DEFAULT]".equals(m7406o());
    }
}
