package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.InterfaceC3750e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzehu implements zzhpx {
    private final zzeht zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;
    private final zzhqg zze;

    private zzehu(zzeht zzehtVar, zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        this.zza = zzehtVar;
        this.zzb = zzhqgVar;
        this.zzc = zzhqgVar2;
        this.zzd = zzhqgVar3;
        this.zze = zzhqgVar4;
    }

    public static zzehu zza(zzeht zzehtVar, zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        return new zzehu(zzehtVar, zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return this.zza.zzb((InterfaceC3750e) this.zzb.zzb(), ((zzehn) this.zzc).zzb(), (zzeee) this.zzd.zzb(), (zzfjv) this.zze.zzb());
    }
}
