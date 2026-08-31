package com.google.android.gms.internal.measurement;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
final class zzlk extends zzlm {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    zzlk(byte[] bArr, int i7, int i8) {
        super(null);
        int length = bArr.length;
        if (((length - i8) | i8) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i8)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i8;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zza(int i7, int i8) throws zzll {
        zzr((i7 << 3) | i8);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzb(int i7, int i8) throws zzll {
        zzr(i7 << 3);
        zzq(i8);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzc(int i7, int i8) throws zzll {
        zzr(i7 << 3);
        zzr(i8);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzd(int i7, int i8) throws zzll {
        zzr((i7 << 3) | 5);
        zzs(i8);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zze(int i7, long j7) throws zzll {
        zzr(i7 << 3);
        zzt(j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzf(int i7, long j7) throws zzll {
        zzr((i7 << 3) | 1);
        zzu(j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzg(int i7, boolean z7) throws zzll {
        zzr(i7 << 3);
        zzp(z7 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzh(int i7, String str) throws zzll {
        zzr((i7 << 3) | 2);
        zzx(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzi(int i7, zzlh zzlhVar) throws zzll {
        zzr((i7 << 3) | 2);
        zzj(zzlhVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzj(zzlh zzlhVar) throws zzll {
        zzr(zzlhVar.zzc());
        zzlhVar.zzf(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzk(byte[] bArr, int i7, int i8) throws zzll {
        zzr(i8);
        zzv(bArr, 0, i8);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    final void zzl(int i7, zznm zznmVar, zznx zznxVar) throws zzll {
        zzr((i7 << 3) | 2);
        zzr(((zzks) zznmVar).zzcd(zznxVar));
        zznxVar.zzf(zznmVar, this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzm(int i7, zznm zznmVar) throws zzll {
        zzr(11);
        zzc(2, i7);
        zzr(26);
        zzo(zznmVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzn(int i7, zzlh zzlhVar) throws zzll {
        zzr(11);
        zzc(2, i7);
        zzi(3, zzlhVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzo(zznm zznmVar) throws zzll {
        zzr(zznmVar.zzcn());
        zznmVar.zzcB(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzp(byte b7) throws zzll {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i7 = this.zze;
        try {
            int i8 = i7 + 1;
            try {
                this.zzc[i7] = b7;
                this.zze = i8;
            } catch (IndexOutOfBoundsException e7) {
                indexOutOfBoundsException = e7;
                i7 = i8;
                throw new zzll(i7, this.zzd, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e8) {
            indexOutOfBoundsException = e8;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzq(int i7) throws zzll {
        if (i7 >= 0) {
            zzr(i7);
        } else {
            zzt(i7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzr(int i7) throws zzll {
        int i8;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i9 = this.zze;
        while ((i7 & (-128)) != 0) {
            try {
                i8 = i9 + 1;
                try {
                    this.zzc[i9] = (byte) (i7 | 128);
                    i7 >>>= 7;
                    i9 = i8;
                } catch (IndexOutOfBoundsException e7) {
                    indexOutOfBoundsException = e7;
                    i9 = i8;
                    throw new zzll(i9, this.zzd, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e8) {
                indexOutOfBoundsException = e8;
                throw new zzll(i9, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i8 = i9 + 1;
        this.zzc[i9] = (byte) i7;
        this.zze = i8;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzs(int i7) throws zzll {
        int i8 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i8] = (byte) i7;
            bArr[i8 + 1] = (byte) (i7 >> 8);
            bArr[i8 + 2] = (byte) (i7 >> 16);
            bArr[i8 + 3] = (byte) (i7 >> 24);
            this.zze = i8 + 4;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzll(i8, this.zzd, 4, e7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzt(long j7) throws zzll {
        int i7;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z7 = zzlm.zzd;
        int i8 = this.zze;
        if (!z7 || this.zzd - i8 < 10) {
            while ((j7 & (-128)) != 0) {
                try {
                    int i9 = i8 + 1;
                    try {
                        this.zzc[i8] = (byte) (((int) j7) | 128);
                        j7 >>>= 7;
                        i8 = i9;
                    } catch (IndexOutOfBoundsException e7) {
                        indexOutOfBoundsException = e7;
                        i8 = i9;
                        throw new zzll(i8, this.zzd, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e8) {
                    indexOutOfBoundsException = e8;
                }
            }
            i7 = i8 + 1;
            try {
                this.zzc[i8] = (byte) j7;
            } catch (IndexOutOfBoundsException e9) {
                indexOutOfBoundsException = e9;
                i8 = i7;
                throw new zzll(i8, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j7 & (-128)) != 0) {
                zzop.zzp(this.zzc, i8, (byte) (((int) j7) | 128));
                j7 >>>= 7;
                i8++;
            }
            i7 = i8 + 1;
            zzop.zzp(this.zzc, i8, (byte) j7);
        }
        this.zze = i7;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzu(long j7) throws zzll {
        int i7 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i7] = (byte) j7;
            bArr[i7 + 1] = (byte) (j7 >> 8);
            bArr[i7 + 2] = (byte) (j7 >> 16);
            bArr[i7 + 3] = (byte) (j7 >> 24);
            bArr[i7 + 4] = (byte) (j7 >> 32);
            bArr[i7 + 5] = (byte) (j7 >> 40);
            bArr[i7 + 6] = (byte) (j7 >> 48);
            bArr[i7 + 7] = (byte) (j7 >> 56);
            this.zze = i7 + 8;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzll(i7, this.zzd, 8, e7);
        }
    }

    public final void zzv(byte[] bArr, int i7, int i8) {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i8);
            this.zze += i8;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzll(this.zze, this.zzd, i8, e7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzw(byte[] bArr, int i7, int i8) {
        zzv(bArr, 0, i8);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzx(String str) throws zzll {
        int i7 = this.zze;
        try {
            int iZzz = zzlm.zzz(str.length() * 3);
            int iZzz2 = zzlm.zzz(str.length());
            if (iZzz2 != iZzz) {
                zzr(zzos.zzb(str));
                byte[] bArr = this.zzc;
                int i8 = this.zze;
                this.zze = zzos.zzc(str, bArr, i8, this.zzd - i8);
                return;
            }
            int i9 = i7 + iZzz2;
            this.zze = i9;
            int iZzc = zzos.zzc(str, this.zzc, i9, this.zzd - i9);
            this.zze = i7;
            zzr((iZzc - i7) - iZzz2);
            this.zze = iZzc;
        } catch (zzor e7) {
            this.zze = i7;
            zzF(str, e7);
        } catch (IndexOutOfBoundsException e8) {
            throw new zzll(e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final int zzy() {
        return this.zzd - this.zze;
    }
}
