package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzafn implements Runnable {
    private final /* synthetic */ zzafm zza;
    private final /* synthetic */ zzafh zzb;

    zzafn(zzafh zzafhVar, zzafm zzafmVar) {
        this.zza = zzafmVar;
        Objects.requireNonNull(zzafhVar);
        this.zzb = zzafhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb.zza.zzh) {
            try {
                if (!this.zzb.zza.zzh.isEmpty()) {
                    this.zza.zza(this.zzb.zza.zzh.get(0), new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
