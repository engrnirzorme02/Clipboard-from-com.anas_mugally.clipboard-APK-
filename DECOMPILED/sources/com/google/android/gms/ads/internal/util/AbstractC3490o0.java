package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.android.gms.internal.ads.zzbek;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.o0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3490o0 extends AbstractC7599p {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f14278b = 0;

    /* JADX INFO: renamed from: k */
    public static void m17545k(String str) {
        if (m17547m()) {
            if (str == null || str.length() <= 4000) {
                Log.v("Ads", str);
                return;
            }
            boolean z7 = true;
            for (String str2 : AbstractC7599p.f30269a.zzd(str)) {
                if (z7) {
                    Log.v("Ads", str2);
                } else {
                    Log.v("Ads-cont", str2);
                }
                z7 = false;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m17546l(String str, Throwable th) {
        if (m17547m()) {
            Log.v("Ads", str, th);
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m17547m() {
        return AbstractC7599p.m33335j(2) && ((Boolean) zzbek.zza.zze()).booleanValue();
    }
}
