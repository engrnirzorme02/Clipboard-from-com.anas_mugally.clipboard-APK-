package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcna {
    private final String zza;
    private final zzbom zzb;
    private final Executor zzc;
    private zzcnf zzd;
    private final zzbjl zze = new zzcmx(this);
    private final zzbjl zzf = new zzcmz(this);

    public zzcna(String str, zzbom zzbomVar, Executor executor) {
        this.zza = str;
        this.zzb = zzbomVar;
        this.zzc = executor;
    }

    public final void zza(zzcnf zzcnfVar) {
        zzbom zzbomVar = this.zzb;
        zzbomVar.zzb("/updateActiveView", this.zze);
        zzbomVar.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcnfVar;
    }

    public final void zzb(zzcek zzcekVar) {
        zzcekVar.zzab("/updateActiveView", this.zze);
        zzcekVar.zzab("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzc(zzcek zzcekVar) {
        zzcekVar.zzac("/updateActiveView", this.zze);
        zzcekVar.zzac("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzd() {
        zzbom zzbomVar = this.zzb;
        zzbomVar.zzc("/updateActiveView", this.zze);
        zzbomVar.zzc("/untrackActiveViewUnit", this.zzf);
    }

    final /* synthetic */ boolean zze(Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.zza);
    }

    final /* synthetic */ Executor zzf() {
        return this.zzc;
    }

    final /* synthetic */ zzcnf zzg() {
        return this.zzd;
    }
}
