package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcqh implements zzcxg, zzayi, zzdau {
    private final zzfcj zza;
    private final zzcwk zzb;
    private final zzcxp zzc;
    private final zzcyl zzf;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();
    private final AtomicBoolean zzg = new AtomicBoolean();

    public zzcqh(zzfcj zzfcjVar, zzcwk zzcwkVar, zzcxp zzcxpVar, zzcyl zzcylVar) {
        this.zza = zzfcjVar;
        this.zzb = zzcwkVar;
        this.zzc = zzcxpVar;
        this.zzf = zzcylVar;
    }

    private final void zzd() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdau
    public final void zzdL() {
        if (this.zza.zze == 4) {
            zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdau
    public final void zzdM() {
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zzdo(zzayh zzayhVar) {
        int i7 = this.zza.zze;
        if (i7 == 1) {
            if (zzayhVar.zzj) {
                zzd();
            }
        } else if (i7 == 4 && zzayhVar.zzj && this.zzg.compareAndSet(false, true)) {
            this.zzf.zza();
        }
        if (zzayhVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final synchronized void zzg() {
        int i7 = this.zza.zze;
        if (i7 == 1 || i7 == 4) {
            return;
        }
        zzd();
    }
}
