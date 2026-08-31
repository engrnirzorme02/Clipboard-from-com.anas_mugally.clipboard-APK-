package p175X0;

import android.content.Context;
import android.os.PowerManager;
import java.util.HashMap;
import java.util.WeakHashMap;
import p112O0.AbstractC1097j;

/* JADX INFO: renamed from: X0.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1936n {

    /* JADX INFO: renamed from: a */
    private static final String f6392a = AbstractC1097j.m4846f("WakeLocks");

    /* JADX INFO: renamed from: b */
    private static final WeakHashMap f6393b = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public static void m7986a() {
        HashMap map = new HashMap();
        WeakHashMap weakHashMap = f6393b;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                AbstractC1097j.m4844c().mo4851h(f6392a, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static PowerManager.WakeLock m7987b(Context context, String str) {
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, str2);
        WeakHashMap weakHashMap = f6393b;
        synchronized (weakHashMap) {
            weakHashMap.put(wakeLockNewWakeLock, str2);
        }
        return wakeLockNewWakeLock;
    }
}
