package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbcl {
    private final String zza = (String) zzbec.zza.zze();
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbcl(Context context, String str) {
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        C7351t.m32349g();
        linkedHashMap.put("device", C3431F0.m17411f0());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        C7351t.m32349g();
        linkedHashMap.put("is_lite_sdk", true != C3431F0.m17416i(context) ? "0" : "1");
        Future futureZza = C7351t.m32362t().zza(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbuz) futureZza.get()).zzj));
            linkedHashMap.put("network_fine", Integer.toString(((zzbuz) futureZza.get()).zzk));
        } catch (Exception e7) {
            C7351t.m32354l().zzg(e7, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmf)).booleanValue()) {
            Map map = this.zzb;
            C7351t.m32349g();
            map.put("is_bstar", true != C3431F0.m17410f(context) ? "0" : "1");
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkj)).booleanValue()) {
            if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzcE)).booleanValue() || zzghs.zzc(C7351t.m32354l().zzu())) {
                return;
            }
            this.zzb.put("plugin", C7351t.m32354l().zzu());
        }
    }

    final String zza() {
        return this.zza;
    }

    final Context zzb() {
        return this.zzc;
    }

    final String zzc() {
        return this.zzd;
    }

    final Map zzd() {
        return this.zzb;
    }
}
