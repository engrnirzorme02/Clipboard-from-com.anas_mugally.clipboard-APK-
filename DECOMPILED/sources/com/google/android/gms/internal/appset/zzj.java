package com.google.android.gms.internal.appset;

import com.google.android.gms.common.util.C3753h;

/* JADX INFO: loaded from: classes2.dex */
final class zzj implements Runnable {
    final /* synthetic */ zzl zza;

    /* synthetic */ zzj(zzl zzlVar, zzi zziVar) {
        this.zza = zzlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jZza = this.zza.zza();
        if (jZza == -1 || C3753h.m18171d().mo18159a() <= jZza) {
            return;
        }
        zzl.zze(this.zza.zzb);
    }
}
