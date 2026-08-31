package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzaeq {
    private final zzaep zza;
    private final zzaeb zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private long[] zzm;
    private int[] zzn;

    public zzaeq(int i7, zzaep zzaepVar, zzaeb zzaebVar) {
        this.zza = zzaepVar;
        int iZzc = zzaepVar.zzc();
        boolean z7 = true;
        if (iZzc != 1) {
            if (iZzc == 2) {
                iZzc = 2;
            } else {
                z7 = false;
            }
        }
        zzghc.zza(z7);
        this.zzc = zzj(i7, iZzc == 2 ? 1667497984 : 1651965952);
        this.zze = zzaepVar.zzd();
        this.zzb = zzaebVar;
        this.zzd = iZzc == 2 ? zzj(i7, 1650720768) : -1;
        this.zzl = -1L;
        this.zzm = new long[512];
        this.zzn = new int[512];
        this.zzf = zzaepVar.zzd;
    }

    private final long zzh(int i7) {
        return (this.zze * ((long) i7)) / ((long) this.zzf);
    }

    private final zzadw zzi(int i7) {
        return new zzadw(((long) this.zzn[i7]) * zzh(1), this.zzm[i7]);
    }

    private static int zzj(int i7, int i8) {
        return (((i7 % 10) + 48) << 8) | ((i7 / 10) + 48) | i8;
    }

    public final void zza(long j7, boolean z7) {
        if (this.zzl == -1) {
            this.zzl = j7;
        }
        if (z7) {
            if (this.zzk == this.zzn.length) {
                long[] jArr = this.zzm;
                this.zzm = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.zzn;
                this.zzn = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.zzm;
            int i7 = this.zzk;
            jArr2[i7] = j7;
            this.zzn[i7] = this.zzj;
            this.zzk = i7 + 1;
        }
        this.zzj++;
    }

    public final void zzb() {
        int i7;
        this.zzm = Arrays.copyOf(this.zzm, this.zzk);
        this.zzn = Arrays.copyOf(this.zzn, this.zzk);
        if ((this.zzc & 1651965952) != 1651965952 || this.zza.zzf == 0 || (i7 = this.zzk) <= 0) {
            return;
        }
        this.zzf = i7;
    }

    public final boolean zzc(int i7) {
        return this.zzc == i7 || this.zzd == i7;
    }

    public final void zzd(int i7) {
        this.zzg = i7;
        this.zzh = i7;
    }

    public final boolean zze(zzacv zzacvVar) {
        int i7 = this.zzh;
        zzaeb zzaebVar = this.zzb;
        int iZzy = i7 - zzaebVar.zzy(zzacvVar, i7, false);
        this.zzh = iZzy;
        boolean z7 = iZzy == 0;
        if (z7) {
            if (this.zzg > 0) {
                zzaebVar.zzx(zzh(this.zzi), Arrays.binarySearch(this.zzn, this.zzi) >= 0 ? 1 : 0, this.zzg, 0, null);
            }
            this.zzi++;
        }
        return z7;
    }

    public final void zzf(long j7) {
        if (this.zzk == 0) {
            this.zzi = 0;
        } else {
            this.zzi = this.zzn[zzeo.zzm(this.zzm, j7, true, true)];
        }
    }

    public final zzadt zzg(long j7) {
        if (this.zzk == 0) {
            zzadw zzadwVar = new zzadw(0L, this.zzl);
            return new zzadt(zzadwVar, zzadwVar);
        }
        int iZzh = (int) (j7 / zzh(1));
        int iZzl = zzeo.zzl(this.zzn, iZzh, true, true);
        if (this.zzn[iZzl] == iZzh) {
            zzadw zzadwVarZzi = zzi(iZzl);
            return new zzadt(zzadwVarZzi, zzadwVarZzi);
        }
        zzadw zzadwVarZzi2 = zzi(iZzl);
        int i7 = iZzl + 1;
        return i7 < this.zzm.length ? new zzadt(zzadwVarZzi2, zzi(i7)) : new zzadt(zzadwVarZzi2, zzadwVarZzi2);
    }
}
