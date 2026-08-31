package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzzx {
    private boolean zzc;
    private int zze;
    private zzzw zza = new zzzw();
    private zzzw zzb = new zzzw();
    private long zzd = -9223372036854775807L;

    public final void zza() {
        this.zza.zza();
        this.zzb.zza();
        this.zzc = false;
        this.zzd = -9223372036854775807L;
        this.zze = 0;
    }

    public final void zzb(long j7) {
        this.zza.zzf(j7);
        if (this.zza.zzb()) {
            this.zzc = false;
        } else if (this.zzd != -9223372036854775807L) {
            if (!this.zzc || this.zzb.zzc()) {
                this.zzb.zza();
                this.zzb.zzf(this.zzd);
            }
            this.zzc = true;
            this.zzb.zzf(j7);
        }
        if (this.zzc && this.zzb.zzb()) {
            zzzw zzzwVar = this.zza;
            this.zza = this.zzb;
            this.zzb = zzzwVar;
            this.zzc = false;
        }
        this.zzd = j7;
        this.zze = this.zza.zzb() ? 0 : this.zze + 1;
    }

    public final boolean zzc() {
        return this.zza.zzb();
    }

    public final int zzd() {
        return this.zze;
    }

    public final long zze() {
        if (this.zza.zzb()) {
            return this.zza.zzd();
        }
        return -9223372036854775807L;
    }

    public final long zzf() {
        if (this.zza.zzb()) {
            return this.zza.zze();
        }
        return -9223372036854775807L;
    }

    public final float zzg() {
        if (this.zza.zzb()) {
            return (float) (1.0E9d / this.zza.zze());
        }
        return -1.0f;
    }
}
