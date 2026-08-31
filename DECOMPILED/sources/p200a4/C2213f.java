package p200a4;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p211b5.InterfaceC2972b;

/* JADX INFO: renamed from: a4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2213f {

    /* JADX INFO: renamed from: a */
    private final Object f7167a;

    /* JADX INFO: renamed from: b */
    private final c f7168b;

    /* JADX INFO: renamed from: a4.f$b */
    private static class b implements c {

        /* JADX INFO: renamed from: a */
        private final Class f7169a;

        /* JADX INFO: renamed from: b */
        private Bundle m8994b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) this.f7169a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f7169a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // p200a4.C2213f.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List mo8995a(Context context) {
            Bundle bundleM8994b = m8994b(context);
            if (bundleM8994b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundleM8994b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundleM8994b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private b(Class cls) {
            this.f7169a = cls;
        }
    }

    /* JADX INFO: renamed from: a4.f$c */
    interface c {
        /* JADX INFO: renamed from: a */
        List mo8995a(Object obj);
    }

    C2213f(Object obj, c cVar) {
        this.f7167a = obj;
        this.f7168b = cVar;
    }

    /* JADX INFO: renamed from: c */
    public static C2213f m8991c(Context context, Class cls) {
        return new C2213f(context, new b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static ComponentRegistrar m8992d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new C2229v(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e7) {
            throw new C2229v(String.format("Could not instantiate %s.", str), e7);
        } catch (InstantiationException e8) {
            throw new C2229v(String.format("Could not instantiate %s.", str), e8);
        } catch (NoSuchMethodException e9) {
            throw new C2229v(String.format("Could not instantiate %s", str), e9);
        } catch (InvocationTargetException e10) {
            throw new C2229v(String.format("Could not instantiate %s", str), e10);
        }
    }

    /* JADX INFO: renamed from: b */
    public List m8993b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f7168b.mo8995a(this.f7167a)) {
            arrayList.add(new InterfaceC2972b() { // from class: a4.e
                @Override // p211b5.InterfaceC2972b
                public final Object get() {
                    return C2213f.m8992d(str);
                }
            });
        }
        return arrayList;
    }
}
