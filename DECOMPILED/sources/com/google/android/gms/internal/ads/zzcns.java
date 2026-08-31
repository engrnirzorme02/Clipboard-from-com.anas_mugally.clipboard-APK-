package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcns {
    private final zzdsm zza;
    private final zzfcu zzb;

    zzcns(zzdsm zzdsmVar, zzfcu zzfcuVar) {
        this.zza = zzdsmVar;
        this.zzb = zzfcuVar;
    }

    public final void zza(long j7, int i7) {
        String str;
        zzdsl zzdslVarZza = this.zza.zza();
        zzdslVarZza.zza(this.zzb.zzb.zzb);
        zzdslVarZza.zzc("action", "ad_closed");
        zzdslVarZza.zzc("show_time", String.valueOf(j7));
        zzdslVarZza.zzc("ad_format", "app_open_ad");
        int i8 = i7 - 1;
        if (i8 == 0) {
            str = "h";
        } else if (i8 == 1) {
            str = "bb";
        } else if (i8 == 2) {
            str = "cc";
        } else if (i8 != 3) {
            str = i8 != 4 ? "u" : "ac";
        } else {
            str = "cb";
        }
        zzdslVarZza.zzc("acr", str);
        zzdslVarZza.zzd();
    }
}
