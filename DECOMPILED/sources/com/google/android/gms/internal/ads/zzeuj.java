package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
final class zzeuj implements zzeun {
    private final Bundle zza;

    public zzeuj(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.zza;
        zzcuu zzcuuVar = (zzcuu) obj;
        if (bundle.isEmpty()) {
            return;
        }
        zzcuuVar.zza.putBundle("shared_pref", bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = this.zza;
        zzcuu zzcuuVar = (zzcuu) obj;
        if (bundle.isEmpty()) {
            return;
        }
        zzcuuVar.zzb.putBundle("shared_pref", bundle);
    }
}
