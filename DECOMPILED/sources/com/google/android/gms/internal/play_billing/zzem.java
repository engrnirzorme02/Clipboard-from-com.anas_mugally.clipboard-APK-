package com.google.android.gms.internal.play_billing;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
final class zzem extends zzep {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    zzem(byte[] bArr, int i7, int i8) {
        super(null);
        int length = bArr.length;
        if (((length - i8) | i8) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i8)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i8;
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzb(byte b7) throws zzen {
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
                throw new zzen(i7, this.zzd, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e8) {
            indexOutOfBoundsException = e8;
        }
    }

    public final void zzc(byte[] bArr, int i7, int i8) {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i8);
            this.zze += i8;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzen(this.zze, this.zzd, i8, e7);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzd(int i7, boolean z7) throws zzen {
        zzv(i7 << 3);
        zzb(z7 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zze(int i7, zzei zzeiVar) throws zzen {
        zzv((i7 << 3) | 2);
        zzf(zzeiVar);
    }

    public final void zzf(zzei zzeiVar) throws zzen {
        zzv(zzeiVar.zzd());
        zzeiVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzg(int i7, int i8) throws zzen {
        zzv((i7 << 3) | 5);
        zzh(i8);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzh(int i7) throws zzen {
        int i8 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i8] = (byte) i7;
            bArr[i8 + 1] = (byte) (i7 >> 8);
            bArr[i8 + 2] = (byte) (i7 >> 16);
            bArr[i8 + 3] = (byte) (i7 >> 24);
            this.zze = i8 + 4;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzen(i8, this.zzd, 4, e7);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzi(int i7, long j7) throws zzen {
        zzv((i7 << 3) | 1);
        zzj(j7);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzj(long j7) throws zzen {
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
            throw new zzen(i7, this.zzd, 8, e7);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzk(int i7, int i8) throws zzen {
        zzv(i7 << 3);
        zzl(i8);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzl(int i7) throws zzen {
        if (i7 >= 0) {
            zzv(i7);
        } else {
            zzx(i7);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzm(byte[] bArr, int i7, int i8) {
        zzc(bArr, 0, i8);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    final void zzn(int i7, zzgl zzglVar, zzgv zzgvVar) throws zzen {
        zzv((i7 << 3) | 2);
        zzv(((zzds) zzglVar).zze(zzgvVar));
        zzgvVar.zzi(zzglVar, this.zza);
    }

    public final void zzo(zzgl zzglVar) throws zzen {
        zzv(zzglVar.zzj());
        zzglVar.zzL(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzp(int i7, zzgl zzglVar) throws zzen {
        zzv(11);
        zzu(2, i7);
        zzv(26);
        zzo(zzglVar);
        zzv(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzq(int i7, zzei zzeiVar) throws zzen {
        zzv(11);
        zzu(2, i7);
        zze(3, zzeiVar);
        zzv(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzr(int i7, String str) throws zzen {
        zzv((i7 << 3) | 2);
        zzs(str);
    }

    public final void zzs(String str) throws zzen {
        int i7 = this.zze;
        try {
            int iZzC = zzep.zzC(str.length() * 3);
            int iZzC2 = zzep.zzC(str.length());
            if (iZzC2 != iZzC) {
                zzv(zzhr.zzc(str));
                byte[] bArr = this.zzc;
                int i8 = this.zze;
                this.zze = zzhr.zzb(str, bArr, i8, this.zzd - i8);
                return;
            }
            int i9 = i7 + iZzC2;
            this.zze = i9;
            int iZzb = zzhr.zzb(str, this.zzc, i9, this.zzd - i9);
            this.zze = i7;
            zzv((iZzb - i7) - iZzC2);
            this.zze = iZzb;
        } catch (zzhq e7) {
            this.zze = i7;
            zzF(str, e7);
        } catch (IndexOutOfBoundsException e8) {
            throw new zzen(e8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzt(int i7, int i8) throws zzen {
        zzv((i7 << 3) | i8);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzu(int i7, int i8) throws zzen {
        zzv(i7 << 3);
        zzv(i8);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzv(int i7) throws zzen {
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
                    throw new zzen(i9, this.zzd, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e8) {
                indexOutOfBoundsException = e8;
                throw new zzen(i9, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i8 = i9 + 1;
        this.zzc[i9] = (byte) i7;
        this.zze = i8;
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzw(int i7, long j7) throws zzen {
        zzv(i7 << 3);
        zzx(j7);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzx(long j7) throws zzen {
        int i7;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i8 = this.zze;
        if (!zzep.zzd || this.zzd - i8 < 10) {
            int i9 = i8;
            while ((j7 & (-128)) != 0) {
                try {
                    int i10 = i9 + 1;
                    try {
                        this.zzc[i9] = (byte) (((int) j7) | 128);
                        j7 >>>= 7;
                        i9 = i10;
                    } catch (IndexOutOfBoundsException e7) {
                        indexOutOfBoundsException = e7;
                        i9 = i10;
                        throw new zzen(i9, this.zzd, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e8) {
                    indexOutOfBoundsException = e8;
                }
            }
            i7 = i9 + 1;
            try {
                this.zzc[i9] = (byte) j7;
            } catch (IndexOutOfBoundsException e9) {
                indexOutOfBoundsException = e9;
                i9 = i7;
                throw new zzen(i9, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j7 & (-128)) != 0) {
                zzho.zzn(this.zzc, i8, (byte) (((int) j7) | 128));
                j7 >>>= 7;
                i8++;
            }
            i7 = i8 + 1;
            zzho.zzn(this.zzc, i8, (byte) j7);
        }
        this.zze = i7;
    }
}
