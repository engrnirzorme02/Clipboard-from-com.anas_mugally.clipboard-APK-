package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzbam implements zzazc {
    final /* synthetic */ zzbap zza;

    zzbam(zzbap zzbapVar) {
        Objects.requireNonNull(zzbapVar);
        this.zza = zzbapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zza(boolean z7) {
        if (z7) {
            this.zza.zzf();
        } else {
            this.zza.zzg();
        }
    }
}
