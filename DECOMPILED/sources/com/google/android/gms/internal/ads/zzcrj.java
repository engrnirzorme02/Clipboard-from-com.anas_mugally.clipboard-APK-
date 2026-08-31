package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcrj implements zzhpx {
    private final zzcri zza;

    private zzcrj(zzcri zzcriVar) {
        this.zza = zzcriVar;
    }

    public static zzcrj zzc(zzcri zzcriVar) {
        return new zzcrj(zzcriVar);
    }

    public static zzfcj zzd(zzcri zzcriVar) {
        zzfcj zzfcjVarZzb = zzcriVar.zzb();
        zzhqf.zzb(zzfcjVarZzb);
        return zzfcjVarZzb;
    }

    public final zzfcj zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
