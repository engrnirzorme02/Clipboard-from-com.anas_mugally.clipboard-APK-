package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgf implements zzfz {
    private final Context zza;
    private final zzfz zzb;

    public zzgf(Context context) {
        zzgh zzghVar = new zzgh();
        this.zza = context.getApplicationContext();
        this.zzb = zzghVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    public final /* bridge */ /* synthetic */ zzga zza() {
        return new zzgg(this.zza, this.zzb.zza());
    }
}
