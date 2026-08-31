package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.InterfaceC3328c1;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzfkw implements Runnable {
    final /* synthetic */ InterfaceC3328c1 zza;
    final /* synthetic */ zzflb zzb;

    zzfkw(zzflb zzflbVar, InterfaceC3328c1 interfaceC3328c1) {
        this.zza = interfaceC3328c1;
        Objects.requireNonNull(zzflbVar);
        this.zzb = zzflbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzx(this.zza);
    }
}
