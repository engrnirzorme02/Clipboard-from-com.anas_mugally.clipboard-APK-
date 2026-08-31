package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzciw implements zzdud {
    private final zzcih zza;
    private Context zzb;
    private zzbkl zzc;

    /* synthetic */ zzciw(zzcih zzcihVar, byte[] bArr) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdud
    public final zzdue zza() {
        zzhqf.zzc(this.zzb, Context.class);
        zzhqf.zzc(this.zzc, zzbkl.class);
        return new zzcix(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdud
    public final /* bridge */ /* synthetic */ zzdud zzb(zzbkl zzbklVar) {
        zzbklVar.getClass();
        this.zzc = zzbklVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdud
    public final /* bridge */ /* synthetic */ zzdud zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
