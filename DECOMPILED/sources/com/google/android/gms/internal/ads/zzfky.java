package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3324b1;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzfky implements Runnable {
    final /* synthetic */ C3324b1 zza;
    final /* synthetic */ zzflb zzb;

    zzfky(zzflb zzflbVar, C3324b1 c3324b1) {
        this.zza = c3324b1;
        Objects.requireNonNull(zzflbVar);
        this.zzb = zzflbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzw(this.zza);
    }
}
