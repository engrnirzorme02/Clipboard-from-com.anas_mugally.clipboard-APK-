package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeni implements zzeun {
    private final Bundle zza;

    zzeni(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.zza;
        zzcuu zzcuuVar = (zzcuu) obj;
        if (bundle.isEmpty()) {
            return;
        }
        zzcuuVar.zza.putBundle("installed_adapter_data", bundle);
    }
}
