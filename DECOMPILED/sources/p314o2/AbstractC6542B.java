package p314o2;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.InterfaceC3359k0;
import com.google.android.gms.internal.ads.zzbot;

/* JADX INFO: renamed from: o2.B */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6542B {

    /* JADX INFO: renamed from: a */
    private static volatile InterfaceC3359k0 f24713a;

    /* JADX INFO: renamed from: a */
    public static InterfaceC3359k0 m27788a(Context context) {
        if (f24713a == null) {
            synchronized (AbstractC6542B.class) {
                try {
                    if (f24713a == null) {
                        f24713a = C3244B.m17191b().m17348d(context, new zzbot());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f24713a;
    }
}
