package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfm {
    private byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    public zzfm(byte[] bArr, int i7, int i8) {
        this.zza = bArr;
        this.zzc = i7;
        this.zzb = i8;
        zzk();
    }

    private final int zzi() {
        int i7 = 0;
        while (!zze()) {
            i7++;
        }
        return ((1 << i7) - 1) + (i7 > 0 ? zzf(i7) : 0);
    }

    private final boolean zzj(int i7) {
        if (i7 < 2 || i7 >= this.zzb) {
            return false;
        }
        byte[] bArr = this.zza;
        return bArr[i7] == 3 && bArr[i7 + (-2)] == 0 && bArr[i7 + (-1)] == 0;
    }

    private final void zzk() {
        int i7;
        int i8 = this.zzc;
        boolean z7 = false;
        if (i8 >= 0 && (i8 < (i7 = this.zzb) || (i8 == i7 && this.zzd == 0))) {
            z7 = true;
        }
        zzghc.zzh(z7);
    }

    public final void zza() {
        int i7 = this.zzd + 1;
        this.zzd = i7;
        if (i7 == 8) {
            this.zzd = 0;
            int i8 = this.zzc;
            this.zzc = i8 + (true == zzj(i8 + 1) ? 2 : 1);
        }
        zzk();
    }

    public final void zzb(int i7) {
        int i8 = this.zzc;
        int i9 = i7 / 8;
        int i10 = i8 + i9;
        this.zzc = i10;
        int i11 = this.zzd + (i7 - (i9 * 8));
        this.zzd = i11;
        if (i11 > 7) {
            this.zzc = i10 + 1;
            this.zzd = i11 - 8;
        }
        while (true) {
            i8++;
            if (i8 > this.zzc) {
                zzk();
                return;
            } else if (zzj(i8)) {
                this.zzc++;
                i8 += 2;
            }
        }
    }

    public final void zzc() {
        int i7 = this.zzd;
        if (i7 > 0) {
            zzb(8 - i7);
        }
    }

    public final boolean zzd(int i7) {
        int i8 = this.zzc;
        int i9 = i7 / 8;
        int i10 = i8 + i9;
        int i11 = (this.zzd + i7) - (i9 * 8);
        if (i11 > 7) {
            i10++;
            i11 -= 8;
        }
        while (true) {
            i8++;
            if (i8 > i10 || i10 >= this.zzb) {
                break;
            }
            if (zzj(i8)) {
                i10++;
                i8 += 2;
            }
        }
        int i12 = this.zzb;
        if (i10 >= i12) {
            return i10 == i12 && i11 == 0;
        }
        return true;
    }

    public final boolean zze() {
        int i7 = this.zza[this.zzc] & (128 >> this.zzd);
        zza();
        return i7 != 0;
    }

    public final int zzf(int i7) {
        int i8;
        this.zzd += i7;
        int i9 = 0;
        while (true) {
            i8 = this.zzd;
            int i10 = 2;
            if (i8 <= 8) {
                break;
            }
            int i11 = i8 - 8;
            this.zzd = i11;
            byte[] bArr = this.zza;
            int i12 = this.zzc;
            i9 |= (bArr[i12] & 255) << i11;
            if (true != zzj(i12 + 1)) {
                i10 = 1;
            }
            this.zzc = i12 + i10;
        }
        byte[] bArr2 = this.zza;
        int i13 = this.zzc;
        int i14 = i9 | ((bArr2[i13] & 255) >> (8 - i8));
        int i15 = 32 - i7;
        if (i8 == 8) {
            this.zzd = 0;
            this.zzc = i13 + (true != zzj(i13 + 1) ? 1 : 2);
        }
        int i16 = ((-1) >>> i15) & i14;
        zzk();
        return i16;
    }

    public final int zzg() {
        return zzi();
    }

    public final int zzh() {
        int iZzi = zzi();
        return (iZzi % 2 == 0 ? -1 : 1) * ((iZzi + 1) / 2);
    }
}
