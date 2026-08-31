package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeol implements zzhpx {
    private final zzhqg zza;

    private zzeol(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
    }

    public static zzeol zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzeol(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeoj zzb() {
        return new zzeoj(((zzchs) this.zza).zza(), zzfgc.zzc());
    }
}
