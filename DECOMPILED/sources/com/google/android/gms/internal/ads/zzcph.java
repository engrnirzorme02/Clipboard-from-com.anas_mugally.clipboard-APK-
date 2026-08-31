package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcph implements zzhpx {
    private final zzhqg zza;

    private zzcph(zzcor zzcorVar, zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzcph zza(zzcor zzcorVar, zzhqg zzhqgVar) {
        return new zzcph(zzcorVar, zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        final zzcyt zzcytVarZza = ((zzcqn) this.zza).zza();
        return new zzddr(new zzdap() { // from class: com.google.android.gms.internal.ads.zzcop
            @Override // com.google.android.gms.internal.ads.zzdap
            public final /* synthetic */ void zza() {
                zzcytVarZza.zzc();
            }
        }, zzbzh.zzg);
    }
}
