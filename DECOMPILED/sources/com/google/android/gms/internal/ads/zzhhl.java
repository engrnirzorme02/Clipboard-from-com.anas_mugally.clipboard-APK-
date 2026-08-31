package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
final class zzhhl extends zzhhi {
    private final OutputStream zzg;

    zzhhl(OutputStream outputStream, int i7) {
        super(i7);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.zzg = outputStream;
    }

    private final void zzH(int i7) throws IOException {
        if (this.zzb - this.zzc < i7) {
            zzI();
        }
    }

    private final void zzI() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzJ(int i7, int i8) throws IOException {
        zzs((i7 << 3) | i8);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzK(int i7, int i8) throws IOException {
        zzH(20);
        zzd(i7 << 3);
        if (i8 >= 0) {
            zzd(i8);
        } else {
            zze(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzL(int i7, int i8) throws IOException {
        zzH(20);
        zzd(i7 << 3);
        zzd(i8);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzM(int i7, int i8) throws IOException {
        zzH(14);
        zzd((i7 << 3) | 5);
        zzf(i8);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzN(int i7, long j7) throws IOException {
        zzH(20);
        zzd(i7 << 3);
        zze(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm, com.google.android.gms.internal.ads.zzhgs
    public final void zza(byte[] bArr, int i7, int i8) throws IOException {
        zzw(bArr, i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzh(int i7, long j7) throws IOException {
        zzH(18);
        zzd((i7 << 3) | 1);
        zzg(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzi(int i7, boolean z7) throws IOException {
        zzH(11);
        zzd(i7 << 3);
        zzc(z7 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzj(int i7, String str) throws IOException {
        zzs((i7 << 3) | 2);
        zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzk(int i7, zzhhb zzhhbVar) throws IOException {
        zzs((i7 << 3) | 2);
        zzl(zzhhbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzl(zzhhb zzhhbVar) throws IOException {
        zzs(zzhhbVar.zzc());
        zzhhbVar.zzk(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzm(byte[] bArr, int i7, int i8) throws IOException {
        zzs(i8);
        zzw(bArr, 0, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzn(int i7, zzhjs zzhjsVar) throws IOException {
        zzs(11);
        zzL(2, i7);
        zzs(26);
        zzp(zzhjsVar);
        zzs(12);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzo(int i7, zzhhb zzhhbVar) throws IOException {
        zzs(11);
        zzL(2, i7);
        zzk(3, zzhhbVar);
        zzs(12);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzp(zzhjs zzhjsVar) throws IOException {
        zzs(zzhjsVar.zzbr());
        zzhjsVar.zzdc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzq(byte b7) throws IOException {
        if (this.zzc == this.zzb) {
            zzI();
        }
        zzc(b7);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzr(int i7) throws IOException {
        if (i7 >= 0) {
            zzs(i7);
        } else {
            zzu(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzs(int i7) throws IOException {
        zzH(5);
        zzd(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzt(int i7) throws IOException {
        zzH(4);
        zzf(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzu(long j7) throws IOException {
        zzH(10);
        zze(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzv(long j7) throws IOException {
        zzH(8);
        zzg(j7);
    }

    public final void zzw(byte[] bArr, int i7, int i8) throws IOException {
        int i9 = this.zzb;
        int i10 = this.zzc;
        int i11 = i9 - i10;
        if (i11 >= i8) {
            System.arraycopy(bArr, i7, this.zza, i10, i8);
            this.zzc += i8;
            this.zzd += i8;
            return;
        }
        byte[] bArr2 = this.zza;
        System.arraycopy(bArr, i7, bArr2, i10, i11);
        int i12 = i7 + i11;
        this.zzc = i9;
        this.zzd += i11;
        zzI();
        int i13 = i8 - i11;
        if (i13 <= i9) {
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            this.zzc = i13;
        } else {
            this.zzg.write(bArr, i12, i13);
        }
        this.zzd += i13;
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzx(String str) throws IOException {
        int iZzc;
        try {
            int length = str.length() * 3;
            int iZzA = zzhhm.zzA(length);
            int i7 = iZzA + length;
            int i8 = this.zzb;
            if (i7 > i8) {
                byte[] bArr = new byte[length];
                int iZzd = zzhlh.zzd(str, bArr, 0, length);
                zzs(iZzd);
                zzw(bArr, 0, iZzd);
                return;
            }
            if (i7 > i8 - this.zzc) {
                zzI();
            }
            int iZzA2 = zzhhm.zzA(str.length());
            int i9 = this.zzc;
            try {
                try {
                    if (iZzA2 == iZzA) {
                        int i10 = i9 + iZzA2;
                        this.zzc = i10;
                        int iZzd2 = zzhlh.zzd(str, this.zza, i10, i8 - i10);
                        this.zzc = i9;
                        iZzc = (iZzd2 - i9) - iZzA2;
                        zzd(iZzc);
                        this.zzc = iZzd2;
                    } else {
                        iZzc = zzhlh.zzc(str);
                        zzd(iZzc);
                        this.zzc = zzhlh.zzd(str, this.zza, this.zzc, iZzc);
                    }
                    this.zzd += iZzc;
                } catch (zzhlg e7) {
                    this.zzd -= this.zzc - i9;
                    this.zzc = i9;
                    throw e7;
                }
            } catch (ArrayIndexOutOfBoundsException e8) {
                throw new zzhhk(e8);
            }
        } catch (zzhlg e9) {
            zzF(str, e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzy() throws IOException {
        if (this.zzc > 0) {
            zzI();
        }
    }
}
