package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcrm implements zzhpx {
    private final zzcri zza;

    private zzcrm(zzcri zzcriVar) {
        this.zza = zzcriVar;
    }

    public static zzcrm zzc(zzcri zzcriVar) {
        return new zzcrm(zzcriVar);
    }

    public static zzfcu zzd(zzcri zzcriVar) {
        zzfcu zzfcuVarZza = zzcriVar.zza();
        zzhqf.zzb(zzfcuVarZza);
        return zzfcuVarZza;
    }

    public final zzfcu zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
