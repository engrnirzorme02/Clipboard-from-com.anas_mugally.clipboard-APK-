package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzehm {
    private final zzfdv zza;
    private final zzdpz zzb;
    private final zzdsm zzc;

    public zzehm(zzfdv zzfdvVar, zzdpz zzdpzVar, zzdsm zzdsmVar) {
        this.zza = zzfdvVar;
        this.zzb = zzdpzVar;
        this.zzc = zzdsmVar;
    }

    public final void zza(zzfcm zzfcmVar, zzfcj zzfcjVar, int i7, zzeed zzeedVar, long j7) {
        zzdpy zzdpyVarZzc;
        zzdsl zzdslVarZza = this.zzc.zza();
        zzdslVarZza.zza(zzfcmVar);
        zzdslVarZza.zzb(zzfcjVar);
        zzdslVarZza.zzc("action", "adapter_status");
        zzdslVarZza.zzc("adapter_l", String.valueOf(j7));
        zzdslVarZza.zzc("sc", Integer.toString(i7));
        if (zzeedVar != null) {
            zzdslVarZza.zzc("arec", Integer.toString(zzeedVar.zzb().f13918a));
            String strZza = this.zza.zza(zzeedVar.getMessage());
            if (strZza != null) {
                zzdslVarZza.zzc("areec", strZza);
            }
        }
        zzdpz zzdpzVar = this.zzb;
        Iterator it = zzfcjVar.zzt.iterator();
        do {
            if (!it.hasNext()) {
                zzdpyVarZzc = null;
                break;
            }
            zzdpyVarZzc = zzdpzVar.zzc((String) it.next());
        } while (zzdpyVarZzc == null);
        if (zzdpyVarZzc != null) {
            zzdslVarZza.zzc("ancn", zzdpyVarZzc.zza);
            zzbrl zzbrlVar = zzdpyVarZzc.zzb;
            if (zzbrlVar != null) {
                zzdslVarZza.zzc("adapter_v", zzbrlVar.toString());
            }
            zzbrl zzbrlVar2 = zzdpyVarZzc.zzc;
            if (zzbrlVar2 != null) {
                zzdslVarZza.zzc("adapter_sv", zzbrlVar2.toString());
            }
        }
        zzdslVarZza.zzd();
    }
}
