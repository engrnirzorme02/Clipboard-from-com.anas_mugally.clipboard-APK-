package com.google.android.gms.internal.ads;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
final class zzhhj extends zzhhm {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    zzhhj(byte[] bArr, int i7, int i8) {
        super(null);
        int length = bArr.length;
        if (((length - i8) | i8) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i8)));
        }
        this.zza = bArr;
        this.zzc = 0;
        this.zzb = i8;
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzJ(int i7, int i8) throws zzhhk {
        zzs((i7 << 3) | i8);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzK(int i7, int i8) throws zzhhk {
        zzs(i7 << 3);
        zzr(i8);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzL(int i7, int i8) throws zzhhk {
        zzs(i7 << 3);
        zzs(i8);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzM(int i7, int i8) throws zzhhk {
        zzs((i7 << 3) | 5);
        zzt(i8);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzN(int i7, long j7) throws zzhhk {
        zzs(i7 << 3);
        zzu(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm, com.google.android.gms.internal.ads.zzhgs
    public final void zza(byte[] bArr, int i7, int i8) throws zzhhk {
        zzw(bArr, i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzh(int i7, long j7) throws zzhhk {
        zzs((i7 << 3) | 1);
        zzv(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzi(int i7, boolean z7) throws zzhhk {
        zzs(i7 << 3);
        zzq(z7 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzj(int i7, String str) throws zzhhk {
        zzs((i7 << 3) | 2);
        zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzk(int i7, zzhhb zzhhbVar) throws zzhhk {
        zzs((i7 << 3) | 2);
        zzl(zzhhbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzl(zzhhb zzhhbVar) throws zzhhk {
        zzs(zzhhbVar.zzc());
        zzhhbVar.zzk(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzm(byte[] bArr, int i7, int i8) throws zzhhk {
        zzs(i8);
        zzw(bArr, 0, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzn(int i7, zzhjs zzhjsVar) throws zzhhk {
        zzs(11);
        zzL(2, i7);
        zzs(26);
        zzp(zzhjsVar);
        zzs(12);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzo(int i7, zzhhb zzhhbVar) throws zzhhk {
        zzs(11);
        zzL(2, i7);
        zzk(3, zzhhbVar);
        zzs(12);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzp(zzhjs zzhjsVar) throws zzhhk {
        zzs(zzhjsVar.zzbr());
        zzhjsVar.zzdc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzq(byte b7) throws zzhhk {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i7 = this.zzc;
        try {
            int i8 = i7 + 1;
            try {
                this.zza[i7] = b7;
                this.zzc = i8;
            } catch (IndexOutOfBoundsException e7) {
                indexOutOfBoundsException = e7;
                i7 = i8;
                throw new zzhhk(i7, this.zzb, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e8) {
            indexOutOfBoundsException = e8;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzr(int i7) throws zzhhk {
        if (i7 >= 0) {
            zzs(i7);
        } else {
            zzu(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzs(int i7) throws zzhhk {
        int i8;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i9 = this.zzc;
        while ((i7 & (-128)) != 0) {
            try {
                i8 = i9 + 1;
                try {
                    this.zza[i9] = (byte) (i7 | 128);
                    i7 >>>= 7;
                    i9 = i8;
                } catch (IndexOutOfBoundsException e7) {
                    indexOutOfBoundsException = e7;
                    i9 = i8;
                    throw new zzhhk(i9, this.zzb, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e8) {
                indexOutOfBoundsException = e8;
                throw new zzhhk(i9, this.zzb, 1, indexOutOfBoundsException);
            }
        }
        i8 = i9 + 1;
        this.zza[i9] = (byte) i7;
        this.zzc = i8;
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzt(int i7) throws zzhhk {
        int i8 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i8] = (byte) i7;
            bArr[i8 + 1] = (byte) (i7 >> 8);
            bArr[i8 + 2] = (byte) (i7 >> 16);
            bArr[i8 + 3] = (byte) (i7 >> 24);
            this.zzc = i8 + 4;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzhhk(i8, this.zzb, 4, e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzu(long j7) throws zzhhk {
        int i7;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z7 = zzhhm.zzb;
        int i8 = this.zzc;
        if (!z7 || this.zzb - i8 < 10) {
            while ((j7 & (-128)) != 0) {
                try {
                    int i9 = i8 + 1;
                    try {
                        this.zza[i8] = (byte) (((int) j7) | 128);
                        j7 >>>= 7;
                        i8 = i9;
                    } catch (IndexOutOfBoundsException e7) {
                        indexOutOfBoundsException = e7;
                        i8 = i9;
                        throw new zzhhk(i8, this.zzb, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e8) {
                    indexOutOfBoundsException = e8;
                }
            }
            i7 = i8 + 1;
            try {
                this.zza[i8] = (byte) j7;
            } catch (IndexOutOfBoundsException e9) {
                indexOutOfBoundsException = e9;
                i8 = i7;
                throw new zzhhk(i8, this.zzb, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j7 & (-128)) != 0) {
                zzhlc.zzp(this.zza, i8, (byte) (((int) j7) | 128));
                j7 >>>= 7;
                i8++;
            }
            i7 = i8 + 1;
            zzhlc.zzp(this.zza, i8, (byte) j7);
        }
        this.zzc = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzv(long j7) throws zzhhk {
        int i7 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i7] = (byte) j7;
            bArr[i7 + 1] = (byte) (j7 >> 8);
            bArr[i7 + 2] = (byte) (j7 >> 16);
            bArr[i7 + 3] = (byte) (j7 >> 24);
            bArr[i7 + 4] = (byte) (j7 >> 32);
            bArr[i7 + 5] = (byte) (j7 >> 40);
            bArr[i7 + 6] = (byte) (j7 >> 48);
            bArr[i7 + 7] = (byte) (j7 >> 56);
            this.zzc = i7 + 8;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzhhk(i7, this.zzb, 8, e7);
        }
    }

    public final void zzw(byte[] bArr, int i7, int i8) throws zzhhk {
        try {
            System.arraycopy(bArr, i7, this.zza, this.zzc, i8);
            this.zzc += i8;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzhhk(this.zzc, this.zzb, i8, e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzx(String str) throws zzhhk {
        int i7 = this.zzc;
        try {
            int iZzA = zzhhm.zzA(str.length() * 3);
            int iZzA2 = zzhhm.zzA(str.length());
            if (iZzA2 != iZzA) {
                zzs(zzhlh.zzc(str));
                byte[] bArr = this.zza;
                int i8 = this.zzc;
                this.zzc = zzhlh.zzd(str, bArr, i8, this.zzb - i8);
                return;
            }
            int i9 = i7 + iZzA2;
            this.zzc = i9;
            int iZzd = zzhlh.zzd(str, this.zza, i9, this.zzb - i9);
            this.zzc = i7;
            zzs((iZzd - i7) - iZzA2);
            this.zzc = iZzd;
        } catch (zzhlg e7) {
            this.zzc = i7;
            zzF(str, e7);
        } catch (IndexOutOfBoundsException e8) {
            throw new zzhhk(e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzy() {
    }
}
