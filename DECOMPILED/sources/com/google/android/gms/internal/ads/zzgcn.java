package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgcn implements zzhpx {
    private final zzhqg zza;

    private zzgcn(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzgcn zza(zzhqg zzhqgVar) {
        return new zzgcn(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.zza.zzb(), "dgd"), "pmtd");
    }
}
