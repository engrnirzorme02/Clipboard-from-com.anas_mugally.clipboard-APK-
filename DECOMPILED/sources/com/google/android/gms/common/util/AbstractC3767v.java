package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.core.content.AbstractC2436b;
import java.lang.reflect.Method;
import p227d3.C5228d;

/* JADX INFO: renamed from: com.google.android.gms.common.util.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3767v {

    /* JADX INFO: renamed from: a */
    private static final int f14912a;

    /* JADX INFO: renamed from: b */
    private static final Method f14913b;

    /* JADX INFO: renamed from: c */
    private static final Method f14914c;

    /* JADX INFO: renamed from: d */
    private static final Method f14915d;

    /* JADX INFO: renamed from: e */
    private static final Method f14916e;

    /* JADX INFO: renamed from: f */
    private static final Method f14917f;

    /* JADX INFO: renamed from: g */
    private static final Method f14918g;

    /* JADX INFO: renamed from: h */
    private static final Method f14919h;

    /* JADX INFO: renamed from: i */
    private static final Method f14920i;

    /* JADX INFO: renamed from: j */
    private static Boolean f14921j;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        Class cls = Integer.TYPE;
        f14912a = Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        f14913b = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f14914c = method2;
        try {
            method3 = WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused3) {
            method3 = null;
        }
        f14915d = method3;
        try {
            method4 = WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
            method4 = null;
        }
        f14916e = method4;
        try {
            method5 = WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
            method5 = null;
        }
        f14917f = method5;
        if (AbstractC3760o.m18200h()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e7) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e7);
                method6 = null;
            }
        } else {
            method6 = null;
        }
        f14918g = method6;
        if (AbstractC3760o.m18200h()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
            } catch (Exception e8) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e8);
                method7 = null;
            }
        } else {
            method7 = null;
        }
        f14919h = method7;
        if (AbstractC3760o.m18200h()) {
            try {
                method8 = WorkSource.class.getMethod("isEmpty", new Class[0]);
                try {
                    method8.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
                method8 = null;
            }
        } else {
            method8 = null;
        }
        f14920i = method8;
        f14921j = null;
    }

    /* JADX INFO: renamed from: a */
    public static void m18212a(WorkSource workSource, int i7, String str) {
        Method method = f14914c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i7), str);
                return;
            } catch (Exception e7) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e7);
                return;
            }
        }
        Method method2 = f14913b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i7));
            } catch (Exception e8) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e8);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static WorkSource m18213b(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfoM24149c = C5228d.m24155a(context).m24149c(str, 0);
                if (applicationInfoM24149c == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i7 = applicationInfoM24149c.uid;
                WorkSource workSource = new WorkSource();
                m18212a(workSource, i7, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized boolean m18214c(Context context) {
        Boolean bool = f14921j;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        boolean z7 = AbstractC2436b.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
        f14921j = Boolean.valueOf(z7);
        return z7;
    }
}
