package p176X1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p019C1.InterfaceC0130f;

/* JADX INFO: renamed from: X1.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1942b {

    /* JADX INFO: renamed from: a */
    private static final ConcurrentMap f6433a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    private static PackageInfo m7994a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e7) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m7995b(PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0130f m7996c(Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap concurrentMap = f6433a;
        InterfaceC0130f interfaceC0130f = (InterfaceC0130f) concurrentMap.get(packageName);
        if (interfaceC0130f != null) {
            return interfaceC0130f;
        }
        InterfaceC0130f interfaceC0130fM7997d = m7997d(context);
        InterfaceC0130f interfaceC0130f2 = (InterfaceC0130f) concurrentMap.putIfAbsent(packageName, interfaceC0130fM7997d);
        return interfaceC0130f2 == null ? interfaceC0130fM7997d : interfaceC0130f2;
    }

    /* JADX INFO: renamed from: d */
    private static InterfaceC0130f m7997d(Context context) {
        return new C1944d(m7995b(m7994a(context)));
    }
}
