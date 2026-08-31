package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p050G0.AbstractC0468b;
import p050G0.C0469c;
import p050G0.InterfaceC0467a;
import p066I0.AbstractC0578a;

/* JADX INFO: renamed from: androidx.startup.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2807a {

    /* JADX INFO: renamed from: d */
    private static volatile C2807a f11316d;

    /* JADX INFO: renamed from: e */
    private static final Object f11317e = new Object();

    /* JADX INFO: renamed from: c */
    final Context f11320c;

    /* JADX INFO: renamed from: b */
    final Set f11319b = new HashSet();

    /* JADX INFO: renamed from: a */
    final Map f11318a = new HashMap();

    C2807a(Context context) {
        this.f11320c = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: d */
    private Object m13987d(Class cls, Set set) {
        Object objMo2030b;
        if (AbstractC0578a.m2546d()) {
            try {
                AbstractC0578a.m2543a(cls.getSimpleName());
            } catch (Throwable th) {
                AbstractC0578a.m2544b();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f11318a.containsKey(cls)) {
            objMo2030b = this.f11318a.get(cls);
        } else {
            set.add(cls);
            try {
                InterfaceC0467a interfaceC0467a = (InterfaceC0467a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> listMo2029a = interfaceC0467a.mo2029a();
                if (!listMo2029a.isEmpty()) {
                    for (Class cls2 : listMo2029a) {
                        if (!this.f11318a.containsKey(cls2)) {
                            m13987d(cls2, set);
                        }
                    }
                }
                objMo2030b = interfaceC0467a.mo2030b(this.f11320c);
                set.remove(cls);
                this.f11318a.put(cls, objMo2030b);
            } catch (Throwable th2) {
                throw new C0469c(th2);
            }
        }
        AbstractC0578a.m2544b();
        return objMo2030b;
    }

    /* JADX INFO: renamed from: e */
    public static C2807a m13988e(Context context) {
        if (f11316d == null) {
            synchronized (f11317e) {
                try {
                    if (f11316d == null) {
                        f11316d = new C2807a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11316d;
    }

    /* JADX INFO: renamed from: a */
    void m13989a() {
        try {
            try {
                AbstractC0578a.m2543a("Startup");
                m13990b(this.f11320c.getPackageManager().getProviderInfo(new ComponentName(this.f11320c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
                AbstractC0578a.m2544b();
            } catch (PackageManager.NameNotFoundException e7) {
                throw new C0469c(e7);
            }
        } catch (Throwable th) {
            AbstractC0578a.m2544b();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    void m13990b(Bundle bundle) {
        String string = this.f11320c.getString(AbstractC0468b.f1764a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC0467a.class.isAssignableFrom(cls)) {
                            this.f11319b.add(cls);
                        }
                    }
                }
                Iterator it = this.f11319b.iterator();
                while (it.hasNext()) {
                    m13987d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e7) {
                throw new C0469c(e7);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    Object m13991c(Class cls) {
        Object objM13987d;
        synchronized (f11317e) {
            try {
                objM13987d = this.f11318a.get(cls);
                if (objM13987d == null) {
                    objM13987d = m13987d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objM13987d;
    }

    /* JADX INFO: renamed from: f */
    public Object m13992f(Class cls) {
        return m13991c(cls);
    }

    /* JADX INFO: renamed from: g */
    public boolean m13993g(Class cls) {
        return this.f11319b.contains(cls);
    }
}
