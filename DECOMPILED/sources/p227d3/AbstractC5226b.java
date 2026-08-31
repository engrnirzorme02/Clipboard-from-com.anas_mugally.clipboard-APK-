package p227d3;

import android.content.Context;
import com.google.android.gms.common.util.AbstractC3760o;

/* JADX INFO: renamed from: d3.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5226b {

    /* JADX INFO: renamed from: a */
    private static Context f19947a;

    /* JADX INFO: renamed from: b */
    private static Boolean f19948b;

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m24146a(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f19947a;
        if (context2 != null && (bool = f19948b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f19948b = null;
        if (AbstractC3760o.m18199g()) {
            f19948b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f19948b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f19948b = Boolean.FALSE;
            }
        }
        f19947a = applicationContext;
        return f19948b.booleanValue();
    }
}
