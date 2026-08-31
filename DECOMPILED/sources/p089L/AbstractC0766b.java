package p089L;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: L.b */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0766b {
    /* JADX INFO: renamed from: a */
    static Handler m3602a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
