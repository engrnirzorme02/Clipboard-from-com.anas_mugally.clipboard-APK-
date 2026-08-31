package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdpz {
    private final Map zza = new HashMap();

    zzdpz() {
    }

    final synchronized void zza(String str, zzfea zzfeaVar) {
        zzbrl zzbrlVarZzB;
        if (this.zza.containsKey(str)) {
            return;
        }
        zzbrl zzbrlVarZzC = null;
        if (zzfeaVar == null) {
            zzbrlVarZzB = null;
        } else {
            try {
                zzbrlVarZzB = zzfeaVar.zzB();
            } catch (zzfdj unused) {
                zzbrlVarZzB = null;
            }
        }
        if (zzfeaVar != null) {
            try {
                zzbrlVarZzC = zzfeaVar.zzC();
            } catch (zzfdj unused2) {
            }
        }
        boolean z7 = true;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkf)).booleanValue()) {
            if (zzfeaVar == null) {
                z7 = false;
            } else {
                try {
                    zzfeaVar.zzn();
                } catch (zzfdj unused3) {
                    z7 = false;
                }
            }
        }
        this.zza.put(str, new zzdpy(str, zzbrlVarZzB, zzbrlVarZzC, z7));
    }

    final synchronized void zzb(String str, zzbqw zzbqwVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdpy(str, zzbqwVar.zzf(), zzbqwVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }

    public final synchronized zzdpy zzc(String str) {
        return (zzdpy) this.zza.get(str);
    }

    public final String zzd(String str) {
        zzbrl zzbrlVar;
        zzdpy zzdpyVarZzc = zzc(str);
        return (zzdpyVarZzc == null || (zzbrlVar = zzdpyVarZzc.zzb) == null) ? "" : zzbrlVar.toString();
    }
}
