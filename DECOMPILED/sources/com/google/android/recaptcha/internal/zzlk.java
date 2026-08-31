package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzlk extends zzln {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    zzlk(byte[] bArr, int i7, int i8) {
        super(null);
        int length = bArr.length;
        if (((length - i8) | i8) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i8)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i8;
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzb(byte b7) throws zzll {
        try {
            byte[] bArr = this.zzb;
            int i7 = this.zzd;
            this.zzd = i7 + 1;
            bArr[i7] = b7;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
        }
    }

    public final void zzc(byte[] bArr, int i7, int i8) {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i8);
            this.zzd += i8;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i8)), e7);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzd(int i7, boolean z7) throws zzll {
        zzt(i7 << 3);
        zzb(z7 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zze(int i7, zzle zzleVar) throws zzll {
        zzt((i7 << 3) | 2);
        zzt(zzleVar.zzd());
        zzleVar.zzh(this);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzf(int i7, int i8) throws zzll {
        zzt((i7 << 3) | 5);
        zzg(i8);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzg(int i7) throws zzll {
        try {
            byte[] bArr = this.zzb;
            int i8 = this.zzd;
            int i9 = i8 + 1;
            this.zzd = i9;
            bArr[i8] = (byte) (i7 & 255);
            int i10 = i8 + 2;
            this.zzd = i10;
            bArr[i9] = (byte) ((i7 >> 8) & 255);
            int i11 = i8 + 3;
            this.zzd = i11;
            bArr[i10] = (byte) ((i7 >> 16) & 255);
            this.zzd = i8 + 4;
            bArr[i11] = (byte) ((i7 >> 24) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzh(int i7, long j7) throws zzll {
        zzt((i7 << 3) | 1);
        zzi(j7);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzi(long j7) throws zzll {
        try {
            byte[] bArr = this.zzb;
            int i7 = this.zzd;
            int i8 = i7 + 1;
            this.zzd = i8;
            bArr[i7] = (byte) (((int) j7) & 255);
            int i9 = i7 + 2;
            this.zzd = i9;
            bArr[i8] = (byte) (((int) (j7 >> 8)) & 255);
            int i10 = i7 + 3;
            this.zzd = i10;
            bArr[i9] = (byte) (((int) (j7 >> 16)) & 255);
            int i11 = i7 + 4;
            this.zzd = i11;
            bArr[i10] = (byte) (((int) (j7 >> 24)) & 255);
            int i12 = i7 + 5;
            this.zzd = i12;
            bArr[i11] = (byte) (((int) (j7 >> 32)) & 255);
            int i13 = i7 + 6;
            this.zzd = i13;
            bArr[i12] = (byte) (((int) (j7 >> 40)) & 255);
            int i14 = i7 + 7;
            this.zzd = i14;
            bArr[i13] = (byte) (((int) (j7 >> 48)) & 255);
            this.zzd = i7 + 8;
            bArr[i14] = (byte) (((int) (j7 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzj(int i7, int i8) throws zzll {
        zzt(i7 << 3);
        zzk(i8);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzk(int i7) throws zzll {
        if (i7 >= 0) {
            zzt(i7);
        } else {
            zzv(i7);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzl(byte[] bArr, int i7, int i8) {
        zzc(bArr, 0, i8);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    final void zzm(int i7, zzoi zzoiVar, zzow zzowVar) throws zzll {
        zzt((i7 << 3) | 2);
        zzt(((zzko) zzoiVar).zza(zzowVar));
        zzowVar.zzj(zzoiVar, this.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzn(int i7, zzoi zzoiVar) throws zzll {
        zzt(11);
        zzs(2, i7);
        zzt(26);
        zzt(zzoiVar.zzo());
        zzoiVar.zze(this);
        zzt(12);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzo(int i7, zzle zzleVar) throws zzll {
        zzt(11);
        zzs(2, i7);
        zze(3, zzleVar);
        zzt(12);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzp(int i7, String str) throws zzll {
        zzt((i7 << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) throws zzll {
        int i7 = this.zzd;
        try {
            int iZzA = zzln.zzA(str.length() * 3);
            int iZzA2 = zzln.zzA(str.length());
            if (iZzA2 != iZzA) {
                zzt(zzpv.zzc(str));
                byte[] bArr = this.zzb;
                int i8 = this.zzd;
                this.zzd = zzpv.zzb(str, bArr, i8, this.zzc - i8);
                return;
            }
            int i9 = i7 + iZzA2;
            this.zzd = i9;
            int iZzb = zzpv.zzb(str, this.zzb, i9, this.zzc - i9);
            this.zzd = i7;
            zzt((iZzb - i7) - iZzA2);
            this.zzd = iZzb;
        } catch (zzpu e7) {
            this.zzd = i7;
            zzD(str, e7);
        } catch (IndexOutOfBoundsException e8) {
            throw new zzll(e8);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzr(int i7, int i8) throws zzll {
        zzt((i7 << 3) | i8);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzs(int i7, int i8) throws zzll {
        zzt(i7 << 3);
        zzt(i8);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzt(int i7) throws zzll {
        while ((i7 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i8 = this.zzd;
                this.zzd = i8 + 1;
                bArr[i8] = (byte) ((i7 | 128) & 255);
                i7 >>>= 7;
            } catch (IndexOutOfBoundsException e7) {
                throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
            }
        }
        byte[] bArr2 = this.zzb;
        int i9 = this.zzd;
        this.zzd = i9 + 1;
        bArr2[i9] = (byte) i7;
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzu(int i7, long j7) throws zzll {
        zzt(i7 << 3);
        zzv(j7);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzv(long j7) throws zzll {
        if (!zzln.zzc || this.zzc - this.zzd < 10) {
            while ((j7 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i7 = this.zzd;
                    this.zzd = i7 + 1;
                    bArr[i7] = (byte) ((((int) j7) | 128) & 255);
                    j7 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
                }
            }
            byte[] bArr2 = this.zzb;
            int i8 = this.zzd;
            this.zzd = i8 + 1;
            bArr2[i8] = (byte) j7;
            return;
        }
        while (true) {
            int i9 = (int) j7;
            if ((j7 & (-128)) == 0) {
                byte[] bArr3 = this.zzb;
                int i10 = this.zzd;
                this.zzd = i10 + 1;
                zzps.zzn(bArr3, i10, (byte) i9);
                return;
            }
            byte[] bArr4 = this.zzb;
            int i11 = this.zzd;
            this.zzd = i11 + 1;
            zzps.zzn(bArr4, i11, (byte) ((i9 | 128) & 255));
            j7 >>>= 7;
        }
    }
}
