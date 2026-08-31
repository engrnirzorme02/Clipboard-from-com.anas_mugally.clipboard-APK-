package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfhm implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;

    private zzfhm(zzfhl zzfhlVar, zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
    }

    public static zzfhm zza(zzfhl zzfhlVar, zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        return new zzfhm(zzfhlVar, zzhqgVar, zzhqgVar2, zzhqgVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbod zzbodVarZzb = new zzbnu().zzb(((zzchd) this.zza).zza(), ((zzchs) this.zzb).zza(), (zzfie) this.zzc.zzb());
        zzhqf.zzb(zzbodVarZzb);
        return zzbodVarZzb;
    }
}
