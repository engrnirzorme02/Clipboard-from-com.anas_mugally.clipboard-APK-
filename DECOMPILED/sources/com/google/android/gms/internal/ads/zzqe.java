package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes2.dex */
final class zzqe {
    private final zzqd zza;
    private final int zzb;
    private final zzqf zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    public zzqe(AudioTrack audioTrack, zzqf zzqfVar) {
        this.zza = new zzqd(audioTrack);
        this.zzb = audioTrack.getSampleRate();
        this.zzc = zzqfVar;
        zzf(0);
    }

    private final void zzf(int i7) {
        this.zzd = i7;
        long j7 = 10000;
        if (i7 == 0) {
            this.zzg = 0L;
            this.zzh = -1L;
            this.zzi = -9223372036854775807L;
            this.zze = System.nanoTime() / 1000;
        } else {
            if (i7 == 1) {
                this.zzf = 10000L;
                return;
            }
            j7 = (i7 == 2 || i7 == 3) ? 10000000L : 500000L;
        }
        this.zzf = j7;
    }

    private final long zzg(long j7, float f7) {
        zzqd zzqdVar = this.zza;
        return zzh(zzqdVar.zzc(), zzqdVar.zzb(), j7, f7);
    }

    private final long zzh(long j7, long j8, long j9, float f7) {
        return zzeo.zzr(j7, this.zzb) + zzeo.zzv(j9 - j8, f7);
    }

    public final void zza(long j7, float f7, long j8) {
        if (j7 - this.zzg < this.zzf) {
            return;
        }
        this.zzg = j7;
        zzqd zzqdVar = this.zza;
        boolean zZza = zzqdVar.zza();
        if (zZza) {
            long jZzb = zzqdVar.zzb();
            long jZzg = zzg(j7, f7);
            if (Math.abs(jZzb - j7) > 5000000) {
                this.zzc.zzc(zzqdVar.zzc(), jZzb, j7, j8);
                zzf(4);
            } else if (Math.abs(jZzg - j8) > 5000000) {
                this.zzc.zzb(zzqdVar.zzc(), jZzb, j7, j8);
                zzf(4);
            } else if (this.zzd == 4) {
                zzf(0);
            }
        }
        int i7 = this.zzd;
        if (i7 == 0) {
            if (!zZza) {
                if (j7 - this.zze > 500000) {
                    zzf(3);
                    return;
                }
                return;
            } else {
                if (zzqdVar.zzb() >= this.zze) {
                    this.zzh = zzqdVar.zzc();
                    this.zzi = zzqdVar.zzb();
                    zzf(1);
                    return;
                }
                return;
            }
        }
        if (i7 != 1) {
            if (i7 == 2) {
                if (zZza) {
                    return;
                }
                zzf(0);
                return;
            } else {
                if (i7 == 3 && zZza) {
                    zzf(0);
                    return;
                }
                return;
            }
        }
        if (!zZza) {
            zzf(0);
            return;
        }
        long jZzc = zzqdVar.zzc();
        long j9 = this.zzh;
        if (jZzc > j9) {
            if (Math.abs(zzg(j7, f7) - zzh(j9, this.zzi, j7, f7)) < 1000) {
                zzf(2);
                return;
            }
        }
        if (j7 - this.zze > 2000000) {
            zzf(3);
        } else {
            this.zzh = zzqdVar.zzc();
            this.zzi = zzqdVar.zzb();
        }
    }

    public final boolean zzb() {
        return this.zzd == 2;
    }

    public final boolean zzc() {
        int i7 = this.zzd;
        return i7 == 0 || i7 == 1;
    }

    public final void zzd() {
        zzf(0);
    }

    public final long zze(long j7, float f7) {
        return zzg(j7, f7);
    }
}
