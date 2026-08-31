package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbe {
    public static final zzbe zza = new zzbb();

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    protected zzbe() {
    }

    public final boolean equals(Object obj) {
        int iZzj;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbe)) {
            return false;
        }
        zzbe zzbeVar = (zzbe) obj;
        if (zzbeVar.zza() == zza() && zzbeVar.zzc() == zzc()) {
            zzbd zzbdVar = new zzbd();
            zzbc zzbcVar = new zzbc();
            zzbd zzbdVar2 = new zzbd();
            zzbc zzbcVar2 = new zzbc();
            for (int i7 = 0; i7 < zza(); i7++) {
                if (!zzb(i7, zzbdVar, 0L).equals(zzbeVar.zzb(i7, zzbdVar2, 0L))) {
                    return false;
                }
            }
            for (int i8 = 0; i8 < zzc(); i8++) {
                if (!zzd(i8, zzbcVar, true).equals(zzbeVar.zzd(i8, zzbcVar2, true))) {
                    return false;
                }
            }
            int iZzk = zzk(true);
            if (iZzk == zzbeVar.zzk(true) && (iZzj = zzj(true)) == zzbeVar.zzj(true)) {
                while (iZzk != iZzj) {
                    int iZzh = zzh(iZzk, 0, true);
                    if (iZzh != zzbeVar.zzh(iZzk, 0, true)) {
                        return false;
                    }
                    iZzk = iZzh;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        zzbd zzbdVar = new zzbd();
        zzbc zzbcVar = new zzbc();
        int iZza = zza() + 217;
        int i8 = 0;
        while (true) {
            i7 = iZza * 31;
            if (i8 >= zza()) {
                break;
            }
            iZza = i7 + zzb(i8, zzbdVar, 0L).hashCode();
            i8++;
        }
        int iZzc = i7 + zzc();
        for (int i9 = 0; i9 < zzc(); i9++) {
            iZzc = (iZzc * 31) + zzd(i9, zzbcVar, true).hashCode();
        }
        int iZzk = zzk(true);
        while (iZzk != -1) {
            iZzc = (iZzc * 31) + iZzk;
            iZzk = zzh(iZzk, 0, true);
        }
        return iZzc;
    }

    public abstract int zza();

    public abstract zzbd zzb(int i7, zzbd zzbdVar, long j7);

    public abstract int zzc();

    public abstract zzbc zzd(int i7, zzbc zzbcVar, boolean z7);

    public abstract int zze(Object obj);

    public abstract Object zzf(int i7);

    public final boolean zzg() {
        return zza() == 0;
    }

    public int zzh(int i7, int i8, boolean z7) {
        if (i8 == 0) {
            if (i7 == zzj(z7)) {
                return -1;
            }
            return i7 + 1;
        }
        if (i8 == 1) {
            return i7;
        }
        if (i8 == 2) {
            return i7 == zzj(z7) ? zzk(z7) : i7 + 1;
        }
        throw new IllegalStateException();
    }

    public int zzi(int i7, int i8, boolean z7) {
        if (i7 == zzk(false)) {
            return -1;
        }
        return i7 - 1;
    }

    public int zzj(boolean z7) {
        if (zzg()) {
            return -1;
        }
        return zza() - 1;
    }

    public int zzk(boolean z7) {
        return zzg() ? -1 : 0;
    }

    public final int zzl(int i7, zzbc zzbcVar, zzbd zzbdVar, int i8, boolean z7) {
        int i9 = zzd(i7, zzbcVar, false).zzc;
        if (zzb(i9, zzbdVar, 0L).zzo != i7) {
            return i7 + 1;
        }
        int iZzh = zzh(i9, i8, z7);
        if (iZzh == -1) {
            return -1;
        }
        return zzb(iZzh, zzbdVar, 0L).zzn;
    }

    public final Pair zzm(zzbd zzbdVar, zzbc zzbcVar, int i7, long j7) {
        Pair pairZzn = zzn(zzbdVar, zzbcVar, i7, j7, 0L);
        pairZzn.getClass();
        return pairZzn;
    }

    public final Pair zzn(zzbd zzbdVar, zzbc zzbcVar, int i7, long j7, long j8) {
        zzghc.zzm(i7, zza(), "index");
        zzb(i7, zzbdVar, j8);
        if (j7 == -9223372036854775807L) {
            long j9 = zzbdVar.zzl;
            j7 = 0;
        }
        int i8 = zzbdVar.zzn;
        zzd(i8, zzbcVar, false);
        while (i8 < zzbdVar.zzo) {
            long j10 = zzbcVar.zze;
            if (j7 == 0) {
                break;
            }
            int i9 = i8 + 1;
            long j11 = zzd(i9, zzbcVar, false).zze;
            if (j7 < 0) {
                break;
            }
            i8 = i9;
        }
        zzd(i8, zzbcVar, true);
        long j12 = zzbcVar.zze;
        long j13 = zzbcVar.zzd;
        if (j13 != -9223372036854775807L) {
            j7 = Math.min(j7, j13 - 1);
        }
        long jMax = Math.max(0L, j7);
        Object obj = zzbcVar.zzb;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public zzbc zzo(Object obj, zzbc zzbcVar) {
        return zzd(zze(obj), zzbcVar, true);
    }
}
