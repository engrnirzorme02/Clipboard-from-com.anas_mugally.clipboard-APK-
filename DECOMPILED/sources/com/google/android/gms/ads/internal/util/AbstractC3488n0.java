package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbzk;
import p157U3.InterfaceFutureC1673e;
import p404z2.AbstractC7599p;
import p404z2.C7596m;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.n0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3488n0 {
    /* JADX INFO: renamed from: a */
    public static void m17544a(Context context) {
        int i7 = C7596m.f30260g;
        if (((Boolean) zzbee.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || C7596m.m33303i()) {
                    return;
                }
                InterfaceFutureC1673e interfaceFutureC1673eZzb = new C3468d0(context).zzb();
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33330e("Updating ad debug logging enablement.");
                zzbzk.zza(interfaceFutureC1673eZzb, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e7) {
                AbstractC7599p.m33332g("Fail to determine debug setting.", e7);
            }
        }
    }
}
