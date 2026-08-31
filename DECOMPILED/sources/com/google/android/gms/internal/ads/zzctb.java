package com.google.android.gms.internal.ads;

import android.content.Context;
import p380w2.C7333b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzctb implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzctb(zzcta zzctaVar, zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzctb zza(zzcta zzctaVar, zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzctb(zzctaVar, zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C7333b((Context) this.zza.zzb(), (zzbxf) this.zzb.zzb(), null);
    }
}
