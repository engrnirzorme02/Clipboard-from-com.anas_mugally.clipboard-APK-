package p226d2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: d2.k */
/* JADX INFO: loaded from: classes.dex */
class C5222k implements InterfaceC5216e {

    /* JADX INFO: renamed from: a */
    private final a f19940a;

    /* JADX INFO: renamed from: b */
    private final C5220i f19941b;

    /* JADX INFO: renamed from: c */
    private final Map f19942c;

    /* JADX INFO: renamed from: d2.k$a */
    static class a {

        /* JADX INFO: renamed from: a */
        private final Context f19943a;

        /* JADX INFO: renamed from: b */
        private Map f19944b = null;

        a(Context context) {
            this.f19943a = context;
        }

        /* JADX INFO: renamed from: a */
        private Map m24139a(Context context) {
            Bundle bundleM24141d = m24141d(context);
            if (bundleM24141d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.EMPTY_MAP;
            }
            HashMap map = new HashMap();
            for (String str : bundleM24141d.keySet()) {
                Object obj = bundleM24141d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        /* JADX INFO: renamed from: c */
        private Map m24140c() {
            if (this.f19944b == null) {
                this.f19944b = m24139a(this.f19943a);
            }
            return this.f19944b;
        }

        /* JADX INFO: renamed from: d */
        private static Bundle m24141d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* JADX INFO: renamed from: b */
        InterfaceC5215d m24142b(String str) {
            String str2 = (String) m24140c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC5215d) Class.forName(str2).asSubclass(InterfaceC5215d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e7) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e7);
                return null;
            } catch (IllegalAccessException e8) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e8);
                return null;
            } catch (InstantiationException e9) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e9);
                return null;
            } catch (NoSuchMethodException e10) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e11);
                return null;
            }
        }
    }

    C5222k(Context context, C5220i c5220i) {
        this(new a(context), c5220i);
    }

    @Override // p226d2.InterfaceC5216e
    /* JADX INFO: renamed from: a */
    public synchronized InterfaceC5224m mo24128a(String str) {
        if (this.f19942c.containsKey(str)) {
            return (InterfaceC5224m) this.f19942c.get(str);
        }
        InterfaceC5215d interfaceC5215dM24142b = this.f19940a.m24142b(str);
        if (interfaceC5215dM24142b == null) {
            return null;
        }
        InterfaceC5224m interfaceC5224mCreate = interfaceC5215dM24142b.create(this.f19941b.m24135a(str));
        this.f19942c.put(str, interfaceC5224mCreate);
        return interfaceC5224mCreate;
    }

    C5222k(a aVar, C5220i c5220i) {
        this.f19942c = new HashMap();
        this.f19940a = aVar;
        this.f19941b = c5220i;
    }
}
