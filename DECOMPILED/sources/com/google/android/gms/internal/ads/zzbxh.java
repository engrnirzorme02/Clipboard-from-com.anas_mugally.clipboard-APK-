package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.InterfaceC3494q0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbxh implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzbxh(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzbxh zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzbxh(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzbxg((Context) this.zza.zzb(), (InterfaceC3494q0) this.zzb.zzb());
    }
}
