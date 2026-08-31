package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgeb implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzgeb(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzgeb zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzgeb(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgea((zzftp) this.zza.zzb(), (zzfvz) this.zzb.zzb());
    }
}
