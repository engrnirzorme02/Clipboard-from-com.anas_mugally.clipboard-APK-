package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzcil implements zzexm {
    private final zzcih zza;
    private Context zzb;
    private String zzc;

    /* synthetic */ zzcil(zzcih zzcihVar, byte[] bArr) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexm
    public final zzexn zza() {
        zzhqf.zzc(this.zzb, Context.class);
        zzhqf.zzc(this.zzc, String.class);
        return new zzcim(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzexm
    public final /* bridge */ /* synthetic */ zzexm zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzexm
    public final /* bridge */ /* synthetic */ zzexm zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
