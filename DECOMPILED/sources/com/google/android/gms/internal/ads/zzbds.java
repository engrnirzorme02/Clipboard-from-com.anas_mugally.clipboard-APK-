package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public class zzbds {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    protected zzbds(String str, Object obj, int i7) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i7;
    }

    public static zzbds zza(String str, boolean z7) {
        return new zzbds(str, Boolean.valueOf(z7), 1);
    }

    public static zzbds zzb(String str, long j7) {
        return new zzbds(str, Long.valueOf(j7), 2);
    }

    public static zzbds zzc(String str, double d7) {
        return new zzbds(str, Double.valueOf(d7), 3);
    }

    public static zzbds zzd(String str, String str2) {
        return new zzbds("gad:dynamite_module:experiment_id", "", 4);
    }

    public final Object zze() {
        zzbey zzbeyVarZza = zzbfa.zza();
        if (zzbeyVarZza == null) {
            if (zzbfa.zzb() != null) {
                zzbfa.zzb().zza();
            }
            return this.zzb;
        }
        int i7 = this.zzc - 1;
        if (i7 == 0) {
            return zzbeyVarZza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (i7 != 1) {
            return i7 != 2 ? zzbeyVarZza.zzd(this.zza, (String) this.zzb) : zzbeyVarZza.zzc(this.zza, ((Double) this.zzb).doubleValue());
        }
        return zzbeyVarZza.zzb(this.zza, ((Long) this.zzb).longValue());
    }
}
