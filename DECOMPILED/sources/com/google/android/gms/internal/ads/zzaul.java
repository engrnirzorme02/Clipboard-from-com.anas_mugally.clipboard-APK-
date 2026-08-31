package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzaul implements Runnable {
    final /* synthetic */ zzaum zza;

    zzaul(zzaum zzaumVar) {
        Objects.requireNonNull(zzaumVar);
        this.zza = zzaumVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaum zzaumVar = this.zza;
        synchronized (zzaumVar.zzp()) {
            if (zzaumVar.zzq()) {
                return;
            }
            zzaumVar.zzr(true);
            try {
                zzaumVar.zzn();
            } catch (Exception e7) {
                this.zza.zzo().zzc(2023, -1L, e7);
            }
            zzaum zzaumVar2 = this.zza;
            synchronized (zzaumVar2.zzp()) {
                zzaumVar2.zzr(false);
            }
        }
    }
}
