package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdhb implements zzhpx {
    private final zzdgy zza;

    private zzdhb(zzdgy zzdgyVar) {
        this.zza = zzdgyVar;
    }

    public static zzdhb zzc(zzdgy zzdgyVar) {
        return new zzdhb(zzdgyVar);
    }

    public static zzdje zzd(zzdgy zzdgyVar) {
        zzdje zzdjeVarZza = zzdgyVar.zza();
        zzhqf.zzb(zzdjeVarZza);
        return zzdjeVarZza;
    }

    public final zzdje zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
