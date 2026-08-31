package p280k0;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

/* JADX INFO: renamed from: k0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5909a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private static final SparseArray f23483a = new SparseArray();

    /* JADX INFO: renamed from: b */
    private static int f23484b = 1;

    /* JADX INFO: renamed from: b */
    public static boolean m26664b(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray sparseArray = f23483a;
        synchronized (sparseArray) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray.remove(intExtra);
                    return true;
                }
                Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static ComponentName m26665c(Context context, Intent intent) {
        SparseArray sparseArray = f23483a;
        synchronized (sparseArray) {
            try {
                int i7 = f23484b;
                int i8 = i7 + 1;
                f23484b = i8;
                if (i8 <= 0) {
                    f23484b = 1;
                }
                intent.putExtra("androidx.contentpager.content.wakelockid", i7);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i7, wakeLockNewWakeLock);
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
