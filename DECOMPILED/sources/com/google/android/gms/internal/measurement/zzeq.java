package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzeq implements Runnable {
    final long zzh;
    final long zzi;
    final boolean zzj;
    final /* synthetic */ zzfb zzk;

    zzeq(zzfb zzfbVar, boolean z7) {
        Objects.requireNonNull(zzfbVar);
        this.zzk = zzfbVar;
        this.zzh = zzfbVar.zza.mo18159a();
        this.zzi = zzfbVar.zza.mo18161c();
        this.zzj = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzk.zzP()) {
            zzb();
            return;
        }
        try {
            zza();
        } catch (Exception e7) {
            this.zzk.zzN(e7, false, this.zzj);
            zzb();
        }
    }

    abstract void zza();

    protected void zzb() {
    }
}
