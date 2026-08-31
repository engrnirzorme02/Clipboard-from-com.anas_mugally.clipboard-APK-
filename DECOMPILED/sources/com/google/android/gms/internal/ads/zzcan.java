package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzcan implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcar zzb;

    zzcan(zzcar zzcarVar, boolean z7) {
        this.zza = z7;
        Objects.requireNonNull(zzcarVar);
        this.zzb = zzcarVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzI("windowVisibilityChanged", new String[]{"isVisible", String.valueOf(this.zza)});
    }
}
