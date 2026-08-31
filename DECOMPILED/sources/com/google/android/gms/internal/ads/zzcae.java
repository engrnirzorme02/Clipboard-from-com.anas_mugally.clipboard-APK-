package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzcae implements Runnable {
    final /* synthetic */ zzcah zza;

    zzcae(zzcah zzcahVar) {
        Objects.requireNonNull(zzcahVar);
        this.zza = zzcahVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcah zzcahVar = this.zza;
        if (zzcahVar.zzt() != null) {
            if (!zzcahVar.zzu()) {
                zzcahVar.zzt().zzk();
                zzcahVar.zzv(true);
            }
            zzcahVar.zzt().zzc();
        }
    }
}
