package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzado {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public zzado() {
    }

    public final boolean zza(int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        if (!zzadp.zzl(i7) || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0 || (i10 = (i7 >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i7 >>> 10) & 3) == 3) {
            return false;
        }
        int i12 = i10 - 1;
        this.zza = i8;
        this.zzb = zzadp.zza[3 - i9];
        int i13 = zzadp.zzb[i11];
        this.zzd = i13;
        if (i8 == 2) {
            i13 /= 2;
            this.zzd = i13;
        } else if (i8 == 0) {
            i13 /= 4;
            this.zzd = i13;
        }
        int i14 = (i7 >>> 9) & 1;
        this.zzg = zzadp.zzm(i8, i9);
        if (i9 == 3) {
            int i15 = i8 == 3 ? zzadp.zzc[i12] : zzadp.zzd[i12];
            this.zzf = i15;
            this.zzc = (((i15 * 12) / i13) + i14) * 4;
        } else {
            if (i8 == 3) {
                int i16 = i9 == 2 ? zzadp.zze[i12] : zzadp.zzf[i12];
                this.zzf = i16;
                this.zzc = ((i16 * 144) / i13) + i14;
            } else {
                int i17 = zzadp.zzg[i12];
                this.zzf = i17;
                this.zzc = (((i9 == 1 ? 72 : 144) * i17) / i13) + i14;
            }
        }
        this.zze = ((i7 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }

    public zzado(zzado zzadoVar) {
        this.zza = zzadoVar.zza;
        this.zzb = zzadoVar.zzb;
        this.zzc = zzadoVar.zzc;
        this.zzd = zzadoVar.zzd;
        this.zze = zzadoVar.zze;
        this.zzf = zzadoVar.zzf;
        this.zzg = zzadoVar.zzg;
    }
}
