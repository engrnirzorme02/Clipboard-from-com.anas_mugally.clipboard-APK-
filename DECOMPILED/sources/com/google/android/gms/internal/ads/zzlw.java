package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlw implements zzkm {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzau zzd = zzau.zza;

    public zzlw(zzdb zzdbVar) {
    }

    public final void zza() {
        if (this.zza) {
            return;
        }
        this.zzc = SystemClock.elapsedRealtime();
        this.zza = true;
    }

    public final void zzb() {
        if (this.zza) {
            zzc(zzg());
            this.zza = false;
        }
    }

    public final void zzc(long j7) {
        this.zzb = j7;
        if (this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final long zzg() {
        long j7 = this.zzb;
        if (!this.zza) {
            return j7;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
        zzau zzauVar = this.zzd;
        return j7 + (zzauVar.zzb == 1.0f ? zzeo.zzq(jElapsedRealtime) : zzauVar.zza(jElapsedRealtime));
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzi(zzau zzauVar) {
        if (this.zza) {
            zzc(zzg());
        }
        this.zzd = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final zzau zzj() {
        return this.zzd;
    }
}
