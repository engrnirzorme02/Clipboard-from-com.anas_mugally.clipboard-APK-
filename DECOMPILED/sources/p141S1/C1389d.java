package p141S1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: S1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1389d {

    /* JADX INFO: renamed from: a */
    private final Context f4892a;

    public C1389d(Context context) {
        this.f4892a = context;
    }

    /* JADX INFO: renamed from: a */
    private ApplicationInfo m5962a() {
        return this.f4892a.getPackageManager().getApplicationInfo(this.f4892a.getPackageName(), 128);
    }

    /* JADX INFO: renamed from: c */
    private static InterfaceC1387b m5963c(String str) {
        Object objNewInstance;
        try {
            Class<?> cls = Class.forName(str);
            try {
                objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e7) {
                m5964d(cls, e7);
                objNewInstance = null;
            } catch (InstantiationException e8) {
                m5964d(cls, e8);
                objNewInstance = null;
            } catch (NoSuchMethodException e9) {
                m5964d(cls, e9);
                objNewInstance = null;
            } catch (InvocationTargetException e10) {
                m5964d(cls, e10);
                objNewInstance = null;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
        } catch (ClassNotFoundException e11) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e11);
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m5964d(Class cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    /* JADX INFO: renamed from: b */
    public List m5965b() {
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfoM5962a = m5962a();
            if (applicationInfoM5962a != null && applicationInfoM5962a.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfoM5962a.metaData);
                }
                for (String str : applicationInfoM5962a.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfoM5962a.metaData.get(str))) {
                        m5963c(str);
                        arrayList.add(null);
                        if (Log.isLoggable("ManifestParser", 3)) {
                            Log.d("ManifestParser", "Loaded Glide module: " + str);
                        }
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                    return arrayList;
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
                return arrayList;
            }
        } catch (PackageManager.NameNotFoundException e7) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e7);
            }
        }
        return arrayList;
    }
}
