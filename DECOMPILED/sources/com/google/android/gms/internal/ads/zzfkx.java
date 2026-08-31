package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.InterfaceC3328c1;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzfkx implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ InterfaceC3328c1 zzb;
    final /* synthetic */ zzflb zzc;

    zzfkx(zzflb zzflbVar, long j7, InterfaceC3328c1 interfaceC3328c1) {
        this.zza = j7;
        this.zzb = interfaceC3328c1;
        Objects.requireNonNull(zzflbVar);
        this.zzc = zzflbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzflb zzflbVar = this.zzc;
        if (zzflbVar.zzA() != null) {
            zzfkk zzfkkVarZzA = zzflbVar.zzA();
            long j7 = this.zza;
            InterfaceC3328c1 interfaceC3328c1 = this.zzb;
            zzfkkVarZzA.zzi(j7, zzflb.zzQ(interfaceC3328c1), zzflbVar.zzC(), zzflbVar.zze.f13904d, zzflbVar.zzn(), zzflbVar.zzz());
        }
    }
}
