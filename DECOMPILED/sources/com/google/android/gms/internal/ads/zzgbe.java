package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgbe implements zzfqb {
    private final Context zza;
    private final zzgcx zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;

    zzgbe(Context context, zzfui zzfuiVar, zzgcx zzgcxVar) {
        this.zza = context;
        this.zzc = zzfuiVar.zzb();
        this.zzd = zzfuiVar.zzj();
        this.zze = zzfuiVar.zzk();
        this.zzb = zzgcxVar;
    }

    final void zza(Map map) {
        String strZzb;
        zzast zzastVar;
        map.put("v", this.zzc);
        map.put("t", new Throwable());
        try {
            InterfaceFutureC1673e interfaceFutureC1673e = (InterfaceFutureC1673e) map.get("gs");
            strZzb = (interfaceFutureC1673e == null || (Build.VERSION.SDK_INT >= 31 && !interfaceFutureC1673e.isDone()) || (zzastVar = (zzast) interfaceFutureC1673e.get(this.zzd, TimeUnit.MILLISECONDS)) == null || zzastVar.zzb().length() <= 1) ? "E" : zzastVar.zzb();
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strZzb.equals("E")) {
            try {
                InterfaceFutureC1673e interfaceFutureC1673e2 = (InterfaceFutureC1673e) map.get("ai");
                if (interfaceFutureC1673e2 != null) {
                    String str = (String) interfaceFutureC1673e2.get(this.zze, TimeUnit.MILLISECONDS);
                    if (!zzghs.zzc(str)) {
                        strZzb = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        map.put("int", strZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfqb
    public final Map zzb() {
        Map mapZzb = this.zzb.zzb();
        zza(mapZzb);
        return mapZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqb
    public final Map zzc() {
        Map mapZzc = this.zzb.zzc(this.zza, null);
        zza(mapZzc);
        return mapZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfqb
    public final Map zzd() {
        Map mapZzd = this.zzb.zzd();
        zza(mapZzd);
        return mapZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfqb
    public final Map zze() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }
}
