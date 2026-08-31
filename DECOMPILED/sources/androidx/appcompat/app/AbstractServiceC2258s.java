package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ServiceInfo;

/* JADX INFO: renamed from: androidx.appcompat.app.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC2258s extends Service {

    /* JADX INFO: renamed from: androidx.appcompat.app.s$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        static int m9313a() {
            return 512;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ServiceInfo m9312a(Context context) {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC2258s.class), a.m9313a() | 128);
    }
}
