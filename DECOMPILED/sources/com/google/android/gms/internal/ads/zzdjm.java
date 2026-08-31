package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdjm implements zzhpx {
    private final zzdjf zza;

    private zzdjm(zzdjf zzdjfVar) {
        this.zza = zzdjfVar;
    }

    public static zzdjm zzc(zzdjf zzdjfVar) {
        return new zzdjm(zzdjfVar);
    }

    public static zzdiu zzd(zzdjf zzdjfVar) {
        zzdiu zzdiuVarZza = zzdjfVar.zza();
        zzhqf.zzb(zzdiuVarZza);
        return zzdiuVarZza;
    }

    public final zzdiu zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
