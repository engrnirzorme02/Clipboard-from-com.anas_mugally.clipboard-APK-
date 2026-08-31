package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaed {
    private final byte[] zza;
    private final int zzb;
    private int zzc;
    private int zzd;

    public zzaed(byte[] bArr) {
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    public final boolean zza() {
        int i7 = (this.zza[this.zzc] & 255) >> this.zzd;
        zzc(1);
        return 1 == (i7 & 1);
    }

    public final int zzb(int i7) {
        int i8 = this.zzc;
        int i9 = 8 - this.zzd;
        int i10 = i8 + 1;
        byte[] bArr = this.zza;
        int iMin = Math.min(i7, i9);
        int i11 = ((bArr[i8] & 255) >> this.zzd) & (255 >> (8 - iMin));
        while (iMin < i7) {
            i11 |= (bArr[i10] & 255) << iMin;
            iMin += 8;
            i10++;
        }
        int i12 = i11 & ((-1) >>> (32 - i7));
        zzc(i7);
        return i12;
    }

    public final void zzc(int i7) {
        int i8;
        int i9 = i7 / 8;
        int i10 = this.zzc + i9;
        this.zzc = i10;
        int i11 = this.zzd + (i7 - (i9 * 8));
        this.zzd = i11;
        if (i11 > 7) {
            i10++;
            this.zzc = i10;
            i11 -= 8;
            this.zzd = i11;
        }
        boolean z7 = false;
        if (i10 >= 0 && (i10 < (i8 = this.zzb) || (i10 == i8 && i11 == 0))) {
            z7 = true;
        }
        zzghc.zzh(z7);
    }

    public final int zzd() {
        return (this.zzc * 8) + this.zzd;
    }
}
