package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.AbstractC2436b;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzemg implements zzeup {
    private final Context zza;

    zzemg(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        return zzgot.zza(new zzemh(AbstractC2436b.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 2;
    }
}
