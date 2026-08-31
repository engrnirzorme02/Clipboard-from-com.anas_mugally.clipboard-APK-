package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaau {
    private final zzaat zza;
    private final zzaaz zzb;
    private boolean zzc;
    private long zzf;
    private boolean zzi;
    private boolean zzl;
    private boolean zzm;
    private int zzd = 0;
    private long zze = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private float zzj = 1.0f;
    private zzdb zzk = zzdb.zza;

    public zzaau(Context context, zzaat zzaatVar, long j7) {
        this.zza = zzaatVar;
        this.zzb = new zzaaz(context);
    }

    private final void zzo(int i7) {
        this.zzd = Math.min(this.zzd, i7);
    }

    public final void zza(int i7) {
        if (i7 == 0) {
            this.zzd = 1;
        } else if (i7 != 1) {
            zzo(2);
        } else {
            this.zzd = 0;
        }
    }

    public final void zzb() {
        this.zzc = true;
        this.zzf = zzeo.zzq(this.zzk.zzb());
        this.zzb.zzb();
    }

    public final void zzc() {
        this.zzc = false;
        this.zzh = -9223372036854775807L;
        this.zzb.zzh();
    }

    public final void zzd(Surface surface) {
        this.zzl = surface != null;
        this.zzm = false;
        this.zzb.zzc(surface);
        zzo(1);
    }

    public final void zze(float f7) {
        this.zzb.zzf(f7);
    }

    public final boolean zzf() {
        int i7 = this.zzd;
        this.zzd = 3;
        this.zzf = zzeo.zzq(this.zzk.zzb());
        return i7 != 3;
    }

    public final void zzg(zzdb zzdbVar) {
        this.zzk = zzdbVar;
    }

    public final void zzh() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final boolean zzi(boolean z7) {
        if (z7 && (this.zzd == 3 || (!this.zzl && this.zzm))) {
            this.zzh = -9223372036854775807L;
            return true;
        }
        if (this.zzh == -9223372036854775807L) {
            return false;
        }
        if (this.zzk.zzb() < this.zzh) {
            return true;
        }
        this.zzh = -9223372036854775807L;
        return false;
    }

    public final void zzj(boolean z7) {
        this.zzi = z7;
        this.zzh = -9223372036854775807L;
    }

    public final int zzk(long j7, long j8, long j9, long j10, boolean z7, boolean z8, zzaas zzaasVar) {
        boolean z9;
        zzaasVar.zzc();
        if (this.zzc && this.zze == -9223372036854775807L) {
            this.zze = j8;
        }
        if (this.zzg != j7) {
            this.zzb.zzg(j7);
            this.zzg = j7;
        }
        long jZzq = (long) ((j7 - j8) / ((double) this.zzj));
        if (this.zzc) {
            jZzq -= zzeo.zzq(this.zzk.zzb()) - j9;
        }
        zzaasVar.zze(jZzq);
        if (z7 && !z8) {
            return 3;
        }
        if (!this.zzl) {
            this.zzm = true;
            if (this.zza.zzan(zzaasVar.zzd(), j8, j9, z8, true)) {
                return 4;
            }
            return (!this.zzc || zzaasVar.zzd() >= 30000) ? 5 : 3;
        }
        long jZzd = zzaasVar.zzd();
        if (this.zzh == -9223372036854775807L || this.zzi) {
            int i7 = this.zzd;
            if (i7 == 0) {
                z9 = false;
                if (this.zzc) {
                    return 0;
                }
            } else {
                if (i7 == 1) {
                    return 0;
                }
                if (i7 == 2) {
                    z9 = false;
                    if (j8 >= j10) {
                        return 0;
                    }
                } else {
                    if (i7 != 3) {
                        throw new IllegalStateException();
                    }
                    z9 = false;
                    long jZzq2 = zzeo.zzq(this.zzk.zzb()) - this.zzf;
                    if (this.zzc) {
                        long j11 = this.zze;
                        if (j11 != -9223372036854775807L && j11 != j8 && jZzd < -30000 && jZzq2 > 100000) {
                            return 0;
                        }
                    }
                }
            }
        } else {
            z9 = false;
        }
        if (!this.zzc || j8 == this.zze) {
            return 5;
        }
        long jZzc = this.zzk.zzc();
        zzaasVar.zzg(this.zzb.zzi((zzaasVar.zzd() * 1000) + jZzc));
        zzaasVar.zze((zzaasVar.zzf() - jZzc) / 1000);
        boolean z10 = (this.zzh == -9223372036854775807L || this.zzi) ? z9 : true;
        if (this.zza.zzan(zzaasVar.zzd(), j8, j9, z8, z10)) {
            return 4;
        }
        if (zzaasVar.zzd() >= -30000 || z8) {
            return zzaasVar.zzd() > 50000 ? 5 : 1;
        }
        return z10 ? 3 : 2;
    }

    public final void zzl() {
        this.zzb.zzd();
        this.zzg = -9223372036854775807L;
        this.zze = -9223372036854775807L;
        zzo(1);
        this.zzh = -9223372036854775807L;
    }

    public final void zzm(int i7) {
        this.zzb.zza(i7);
    }

    public final void zzn(float f7) {
        zzghc.zza(f7 > 0.0f);
        if (f7 == this.zzj) {
            return;
        }
        this.zzj = f7;
        this.zzb.zze(f7);
    }
}
