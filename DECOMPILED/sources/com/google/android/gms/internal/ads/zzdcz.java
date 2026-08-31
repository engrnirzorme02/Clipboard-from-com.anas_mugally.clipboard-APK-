package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdcz implements zzhpx {
    private final zzhqg zza;

    private zzdcz(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdcz zzc(zzhqg zzhqgVar) {
        return new zzdcz(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdcy zzb() {
        return new zzdcy(((zzhqj) this.zza).zzb());
    }
}
