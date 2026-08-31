package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzapf implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzaph zzc;

    zzapf(zzaph zzaphVar, String str, long j7) {
        this.zza = str;
        this.zzb = j7;
        Objects.requireNonNull(zzaphVar);
        this.zzc = zzaphVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaph zzaphVar = this.zzc;
        zzaphVar.zzx().zza(this.zza, this.zzb);
        zzaphVar.zzx().zzb(zzaphVar.toString());
    }
}
