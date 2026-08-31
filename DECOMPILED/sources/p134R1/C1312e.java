package p134R1;

import android.content.Context;
import android.util.Log;
import androidx.core.content.AbstractC2436b;

/* JADX INFO: renamed from: R1.e */
/* JADX INFO: loaded from: classes.dex */
public class C1312e implements InterfaceC1310c {
    @Override // p134R1.InterfaceC1310c
    /* JADX INFO: renamed from: a */
    public InterfaceC1309b mo5651a(Context context, InterfaceC1309b.a aVar) {
        boolean z7 = AbstractC2436b.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z7 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z7 ? new C1311d(context, aVar) : new C1321n();
    }
}
