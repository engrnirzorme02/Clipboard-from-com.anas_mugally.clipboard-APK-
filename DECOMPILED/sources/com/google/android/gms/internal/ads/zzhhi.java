package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzhhi extends zzhhm {
    final byte[] zza;
    final int zzb;
    int zzc;
    int zzd;

    zzhhi(int i7) {
        super(null);
        if (i7 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i7, 20)];
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final int zzb() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    final void zzc(byte b7) {
        byte[] bArr = this.zza;
        int i7 = this.zzc;
        bArr[i7] = b7;
        this.zzc = i7 + 1;
        this.zzd++;
    }

    final void zzd(int i7) {
        if (!zzhhm.zzb) {
            while ((i7 & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i8 = this.zzc;
                this.zzc = i8 + 1;
                bArr[i8] = (byte) (i7 | 128);
                this.zzd++;
                i7 >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i9 = this.zzc;
            this.zzc = i9 + 1;
            bArr2[i9] = (byte) i7;
            this.zzd++;
            return;
        }
        long j7 = this.zzc;
        while ((i7 & (-128)) != 0) {
            byte[] bArr3 = this.zza;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            zzhlc.zzp(bArr3, i10, (byte) (i7 | 128));
            i7 >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        zzhlc.zzp(bArr4, i11, (byte) i7);
        this.zzd += (int) (((long) this.zzc) - j7);
    }

    final void zze(long j7) {
        if (zzhhm.zzb) {
            long j8 = this.zzc;
            while (true) {
                int i7 = (int) j7;
                if ((j7 & (-128)) == 0) {
                    byte[] bArr = this.zza;
                    int i8 = this.zzc;
                    this.zzc = i8 + 1;
                    zzhlc.zzp(bArr, i8, (byte) i7);
                    this.zzd += (int) (((long) this.zzc) - j8);
                    return;
                }
                byte[] bArr2 = this.zza;
                int i9 = this.zzc;
                this.zzc = i9 + 1;
                zzhlc.zzp(bArr2, i9, (byte) (i7 | 128));
                j7 >>>= 7;
            }
        } else {
            while (true) {
                int i10 = (int) j7;
                if ((j7 & (-128)) == 0) {
                    byte[] bArr3 = this.zza;
                    int i11 = this.zzc;
                    this.zzc = i11 + 1;
                    bArr3[i11] = (byte) i10;
                    this.zzd++;
                    return;
                }
                byte[] bArr4 = this.zza;
                int i12 = this.zzc;
                this.zzc = i12 + 1;
                bArr4[i12] = (byte) (i10 | 128);
                this.zzd++;
                j7 >>>= 7;
            }
        }
    }

    final void zzf(int i7) {
        int i8 = this.zzc;
        byte[] bArr = this.zza;
        bArr[i8] = (byte) i7;
        bArr[i8 + 1] = (byte) (i7 >> 8);
        bArr[i8 + 2] = (byte) (i7 >> 16);
        bArr[i8 + 3] = (byte) (i7 >> 24);
        this.zzc = i8 + 4;
        this.zzd += 4;
    }

    final void zzg(long j7) {
        int i7 = this.zzc;
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
        this.zzd += 8;
    }
}
