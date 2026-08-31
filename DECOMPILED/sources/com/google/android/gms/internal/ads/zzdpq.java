package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdpq implements zzcwn {
    private final zzcek zza;

    zzdpq(zzcek zzcekVar) {
        this.zza = zzcekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zza(Context context) {
        zzcek zzcekVar = this.zza;
        if (zzcekVar != null) {
            zzcekVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzb(Context context) {
        zzcek zzcekVar = this.zza;
        if (zzcekVar != null) {
            zzcekVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzc(Context context) {
        zzcek zzcekVar = this.zza;
        if (zzcekVar != null) {
            zzcekVar.destroy();
        }
    }
}
