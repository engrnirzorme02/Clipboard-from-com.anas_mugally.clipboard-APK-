package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcvj implements zzhpx {
    private final zzcvb zza;

    private zzcvj(zzcvb zzcvbVar) {
        this.zza = zzcvbVar;
    }

    public static zzcvj zzc(zzcvb zzcvbVar) {
        return new zzcvj(zzcvbVar);
    }

    public static zzfdc zzd(zzcvb zzcvbVar) {
        zzfdc zzfdcVarZzb = zzcvbVar.zzb();
        zzhqf.zzb(zzfdcVarZzb);
        return zzfdcVarZzb;
    }

    public final zzfdc zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
