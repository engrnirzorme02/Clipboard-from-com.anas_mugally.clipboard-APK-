package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.api.C3553a;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzakj extends zzakh {
    private final InputStream zzd;
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    private final int zzaa() {
        int i7;
        int i8 = this.zzh;
        int i9 = this.zzf;
        if (i9 != i8) {
            byte[] bArr = this.zze;
            int i10 = i8 + 1;
            byte b7 = bArr[i8];
            if (b7 >= 0) {
                this.zzh = i10;
                return b7;
            }
            if (i9 - i10 >= 9) {
                int i11 = i8 + 2;
                int i12 = (bArr[i10] << 7) ^ b7;
                if (i12 < 0) {
                    i7 = i12 ^ (-128);
                } else {
                    int i13 = i8 + 3;
                    int i14 = (bArr[i11] << 14) ^ i12;
                    if (i14 >= 0) {
                        i7 = i14 ^ 16256;
                    } else {
                        int i15 = i8 + 4;
                        int i16 = i14 ^ (bArr[i13] << 21);
                        if (i16 < 0) {
                            i7 = (-2080896) ^ i16;
                        } else {
                            i13 = i8 + 5;
                            byte b8 = bArr[i15];
                            int i17 = (i16 ^ (b8 << 28)) ^ 266354560;
                            if (b8 < 0) {
                                i15 = i8 + 6;
                                if (bArr[i13] < 0) {
                                    i13 = i8 + 7;
                                    if (bArr[i15] < 0) {
                                        i15 = i8 + 8;
                                        if (bArr[i13] < 0) {
                                            i13 = i8 + 9;
                                            if (bArr[i15] < 0) {
                                                int i18 = i8 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i11 = i18;
                                                    i7 = i17;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i17;
                            }
                            i7 = i17;
                        }
                        i11 = i15;
                    }
                    i11 = i13;
                }
                this.zzh = i11;
                return i7;
            }
        }
        return (int) zzm();
    }

    private final long zzab() throws zzall {
        int i7 = this.zzh;
        if (this.zzf - i7 < 8) {
            zzg(8);
            i7 = this.zzh;
        }
        byte[] bArr = this.zze;
        this.zzh = i7 + 8;
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }

    private final long zzac() {
        long j7;
        long j8;
        long j9;
        int i7 = this.zzh;
        int i8 = this.zzf;
        if (i8 != i7) {
            byte[] bArr = this.zze;
            int i9 = i7 + 1;
            byte b7 = bArr[i7];
            if (b7 >= 0) {
                this.zzh = i9;
                return b7;
            }
            if (i8 - i9 >= 9) {
                int i10 = i7 + 2;
                int i11 = (bArr[i9] << 7) ^ b7;
                if (i11 < 0) {
                    j7 = i11 ^ (-128);
                } else {
                    int i12 = i7 + 3;
                    int i13 = (bArr[i10] << 14) ^ i11;
                    if (i13 >= 0) {
                        j7 = i13 ^ 16256;
                        i10 = i12;
                    } else {
                        int i14 = i7 + 4;
                        int i15 = i13 ^ (bArr[i12] << 21);
                        if (i15 < 0) {
                            long j10 = (-2080896) ^ i15;
                            i10 = i14;
                            j7 = j10;
                        } else {
                            long j11 = i15;
                            i10 = i7 + 5;
                            long j12 = j11 ^ (((long) bArr[i14]) << 28);
                            if (j12 >= 0) {
                                j9 = 266354560;
                            } else {
                                int i16 = i7 + 6;
                                long j13 = j12 ^ (((long) bArr[i10]) << 35);
                                if (j13 < 0) {
                                    j8 = -34093383808L;
                                } else {
                                    i10 = i7 + 7;
                                    j12 = j13 ^ (((long) bArr[i16]) << 42);
                                    if (j12 >= 0) {
                                        j9 = 4363953127296L;
                                    } else {
                                        i16 = i7 + 8;
                                        j13 = j12 ^ (((long) bArr[i10]) << 49);
                                        if (j13 < 0) {
                                            j8 = -558586000294016L;
                                        } else {
                                            i10 = i7 + 9;
                                            long j14 = (j13 ^ (((long) bArr[i16]) << 56)) ^ 71499008037633920L;
                                            if (j14 < 0) {
                                                int i17 = i7 + 10;
                                                if (bArr[i10] >= 0) {
                                                    i10 = i17;
                                                }
                                            }
                                            j7 = j14;
                                        }
                                    }
                                }
                                j7 = j13 ^ j8;
                                i10 = i16;
                            }
                            j7 = j12 ^ j9;
                        }
                    }
                }
                this.zzh = i10;
                return j7;
            }
        }
        return zzm();
    }

    private final void zzad() {
        int i7 = this.zzf + this.zzg;
        this.zzf = i7;
        int i8 = this.zzj + i7;
        int i9 = this.zzk;
        if (i8 <= i9) {
            this.zzg = 0;
            return;
        }
        int i10 = i8 - i9;
        this.zzg = i10;
        this.zzf = i7 - i10;
    }

    private final byte zzy() throws zzall {
        if (this.zzh == this.zzf) {
            zzg(1);
        }
        byte[] bArr = this.zze;
        int i7 = this.zzh;
        this.zzh = i7 + 1;
        return bArr[i7];
    }

    private final int zzz() throws zzall {
        int i7 = this.zzh;
        if (this.zzf - i7 < 4) {
            zzg(4);
            i7 = this.zzh;
        }
        byte[] bArr = this.zze;
        this.zzh = i7 + 4;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakh
    public final double zza() {
        return Double.longBitsToDouble(zzab());
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakh
    public final float zzb() {
        return Float.intBitsToFloat(zzz());
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakh
    public final int zzc() {
        return this.zzj + this.zzh;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakh
    public final int zzd() {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakh
    public final int zze() {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakh
    public final int zzf() {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakh
    public final int zzg() {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakh
    public final int zzh() {
        return zzakh.zza(zzaa());
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakh
    public final int zzi() throws zzall {
        if (zzw()) {
            this.zzi = 0;
            return 0;
        }
        int iZzaa = zzaa();
        this.zzi = iZzaa;
        if ((iZzaa >>> 3) != 0) {
            return iZzaa;
        }
        throw zzall.zzc();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakh
    public final int zzj() {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakh
    public final long zzk() {
        return zzab();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakh
    public final long zzl() {
        return zzac();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakh
    final long zzm() throws zzall {
        long j7 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            byte bZzy = zzy();
            j7 |= ((long) (bZzy & 127)) << i7;
            if ((bZzy & 128) == 0) {
                return j7;
            }
        }
        throw zzall.zze();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakh
    public final long zzn() {
        return zzab();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakh
    public final long zzo() {
        return zzakh.zza(zzac());
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakh
    public final long zzp() {
        return zzac();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakh
    public final zzajv zzq() throws IOException {
        int iZzaa = zzaa();
        int i7 = this.zzf;
        int i8 = this.zzh;
        if (iZzaa <= i7 - i8 && iZzaa > 0) {
            zzajv zzajvVarZza = zzajv.zza(this.zze, i8, iZzaa);
            this.zzh += iZzaa;
            return zzajvVarZza;
        }
        if (iZzaa == 0) {
            return zzajv.zza;
        }
        if (iZzaa < 0) {
            throw zzall.zzf();
        }
        byte[] bArrZzj = zzj(iZzaa);
        if (bArrZzj != null) {
            return zzajv.zza(bArrZzj);
        }
        int i9 = this.zzh;
        int i10 = this.zzf;
        int length = i10 - i9;
        this.zzj += i10;
        this.zzh = 0;
        this.zzf = 0;
        List<byte[]> listZzf = zzf(iZzaa - length);
        byte[] bArr = new byte[iZzaa];
        System.arraycopy(this.zze, i9, bArr, 0, length);
        for (byte[] bArr2 : listZzf) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return zzajv.zzb(bArr);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakh
    public final String zzr() throws zzall {
        int iZzaa = zzaa();
        if (iZzaa > 0) {
            int i7 = this.zzf;
            int i8 = this.zzh;
            if (iZzaa <= i7 - i8) {
                String str = new String(this.zze, i8, iZzaa, zzalh.zza);
                this.zzh += iZzaa;
                return str;
            }
        }
        if (iZzaa == 0) {
            return "";
        }
        if (iZzaa < 0) {
            throw zzall.zzf();
        }
        if (iZzaa > this.zzf) {
            return new String(zza(iZzaa, false), zzalh.zza);
        }
        zzg(iZzaa);
        String str2 = new String(this.zze, this.zzh, iZzaa, zzalh.zza);
        this.zzh += iZzaa;
        return str2;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakh
    public final String zzs() throws IOException {
        byte[] bArrZza;
        int iZzaa = zzaa();
        int i7 = this.zzh;
        int i8 = this.zzf;
        if (iZzaa <= i8 - i7 && iZzaa > 0) {
            bArrZza = this.zze;
            this.zzh = i7 + iZzaa;
        } else {
            if (iZzaa == 0) {
                return "";
            }
            if (iZzaa < 0) {
                throw zzall.zzf();
            }
            i7 = 0;
            if (iZzaa <= i8) {
                zzg(iZzaa);
                bArrZza = this.zze;
                this.zzh = iZzaa;
            } else {
                bArrZza = zza(iZzaa, false);
            }
        }
        return zzaoa.zzb(bArrZza, i7, iZzaa);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakh
    public final boolean zzw() {
        return this.zzh == this.zzf && !zzi(1);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakh
    public final boolean zzx() {
        return zzac() != 0;
    }

    private zzakj(InputStream inputStream, int i7) {
        super();
        this.zzk = C3553a.e.API_PRIORITY_OTHER;
        zzalh.zza(inputStream, "input");
        this.zzd = inputStream;
        this.zze = new byte[4096];
        this.zzf = 0;
        this.zzh = 0;
        this.zzj = 0;
    }

    private static int zza(InputStream inputStream) throws zzall {
        try {
            return inputStream.available();
        } catch (zzall e7) {
            e7.zzk();
            throw e7;
        }
    }

    private final List<byte[]> zzf(int i7) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int iMin = Math.min(i7, 4096);
            byte[] bArr = new byte[iMin];
            int i8 = 0;
            while (i8 < iMin) {
                int i9 = this.zzd.read(bArr, i8, iMin - i8);
                if (i9 == -1) {
                    throw zzall.zzj();
                }
                this.zzj += i9;
                i8 += i9;
            }
            i7 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzg(int i7) throws zzall {
        if (zzi(i7)) {
            return;
        }
        if (i7 <= (this.zzb - this.zzj) - this.zzh) {
            throw zzall.zzj();
        }
        throw zzall.zzi();
    }

    private final void zzh(int i7) throws zzall {
        int i8 = this.zzf;
        int i9 = this.zzh;
        if (i7 <= i8 - i9 && i7 >= 0) {
            this.zzh = i9 + i7;
            return;
        }
        if (i7 < 0) {
            throw zzall.zzf();
        }
        int i10 = this.zzj;
        int i11 = i10 + i9 + i7;
        int i12 = this.zzk;
        if (i11 > i12) {
            zzh((i12 - i10) - i9);
            throw zzall.zzj();
        }
        this.zzj = i10 + i9;
        int i13 = i8 - i9;
        this.zzf = 0;
        this.zzh = 0;
        while (i13 < i7) {
            try {
                long j7 = i7 - i13;
                long jZza = zza(this.zzd, j7);
                if (jZza >= 0 && jZza <= j7) {
                    if (jZza == 0) {
                        break;
                    } else {
                        i13 += (int) jZza;
                    }
                } else {
                    throw new IllegalStateException(String.valueOf(this.zzd.getClass()) + "#skip returned invalid result: " + jZza + "\nThe InputStream implementation is buggy.");
                }
            } catch (Throwable th) {
                this.zzj += i13;
                zzad();
                throw th;
            }
        }
        this.zzj += i13;
        zzad();
        if (i13 >= i7) {
            return;
        }
        int i14 = this.zzf;
        int i15 = i14 - this.zzh;
        this.zzh = i14;
        zzg(1);
        while (true) {
            int i16 = i7 - i15;
            int i17 = this.zzf;
            if (i16 <= i17) {
                this.zzh = i16;
                return;
            } else {
                i15 += i17;
                this.zzh = i17;
                zzg(1);
            }
        }
    }

    private final byte[] zzj(int i7) throws zzall {
        if (i7 == 0) {
            return zzalh.zzb;
        }
        if (i7 < 0) {
            throw zzall.zzf();
        }
        int i8 = this.zzj;
        int i9 = this.zzh;
        int i10 = i8 + i9 + i7;
        if (i10 - this.zzb > 0) {
            throw zzall.zzi();
        }
        int i11 = this.zzk;
        if (i10 > i11) {
            zzh((i11 - i8) - i9);
            throw zzall.zzj();
        }
        int i12 = this.zzf - i9;
        int i13 = i7 - i12;
        if (i13 >= 4096 && i13 > zza(this.zzd)) {
            return null;
        }
        byte[] bArr = new byte[i7];
        System.arraycopy(this.zze, this.zzh, bArr, 0, i12);
        this.zzj += this.zzf;
        this.zzh = 0;
        this.zzf = 0;
        while (i12 < i7) {
            int iZza = zza(this.zzd, bArr, i12, i7 - i12);
            if (iZza == -1) {
                throw zzall.zzj();
            }
            this.zzj += iZza;
            i12 += iZza;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakh
    public final int zzb(int i7) throws zzall {
        if (i7 < 0) {
            throw zzall.zzf();
        }
        int i8 = i7 + this.zzj + this.zzh;
        if (i8 < 0) {
            throw zzall.zzi();
        }
        int i9 = this.zzk;
        if (i8 > i9) {
            throw zzall.zzj();
        }
        this.zzk = i8;
        zzad();
        return i9;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakh
    public final void zzc(int i7) throws zzall {
        if (this.zzi != i7) {
            throw zzall.zzb();
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakh
    public final void zzd(int i7) {
        this.zzk = i7;
        zzad();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakh
    public final boolean zze(int i7) throws zzall {
        int i8 = i7 & 7;
        int i9 = 0;
        if (i8 == 0) {
            if (this.zzf - this.zzh < 10) {
                while (i9 < 10) {
                    if (zzy() < 0) {
                        i9++;
                    }
                }
                throw zzall.zze();
            }
            while (i9 < 10) {
                byte[] bArr = this.zze;
                int i10 = this.zzh;
                this.zzh = i10 + 1;
                if (bArr[i10] < 0) {
                    i9++;
                }
            }
            throw zzall.zze();
            return true;
        }
        if (i8 == 1) {
            zzh(8);
            return true;
        }
        if (i8 == 2) {
            zzh(zzaa());
            return true;
        }
        if (i8 == 3) {
            zzv();
            zzc(((i7 >>> 3) << 3) | 4);
            return true;
        }
        if (i8 == 4) {
            zzu();
            return false;
        }
        if (i8 != 5) {
            throw zzall.zza();
        }
        zzh(4);
        return true;
    }

    private static int zza(InputStream inputStream, byte[] bArr, int i7, int i8) throws zzall {
        try {
            return inputStream.read(bArr, i7, i8);
        } catch (zzall e7) {
            e7.zzk();
            throw e7;
        }
    }

    private final boolean zzi(int i7) throws zzall {
        int i8 = this.zzh;
        int i9 = i8 + i7;
        int i10 = this.zzf;
        if (i9 > i10) {
            int i11 = this.zzb;
            int i12 = this.zzj;
            if (i7 > (i11 - i12) - i8 || i12 + i8 + i7 > this.zzk) {
                return false;
            }
            if (i8 > 0) {
                if (i10 > i8) {
                    byte[] bArr = this.zze;
                    System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
                }
                this.zzj += i8;
                this.zzf -= i8;
                this.zzh = 0;
            }
            InputStream inputStream = this.zzd;
            byte[] bArr2 = this.zze;
            int i13 = this.zzf;
            int iZza = zza(inputStream, bArr2, i13, Math.min(bArr2.length - i13, (this.zzb - this.zzj) - i13));
            if (iZza != 0 && iZza >= -1 && iZza <= this.zze.length) {
                if (iZza <= 0) {
                    return false;
                }
                this.zzf += iZza;
                zzad();
                return this.zzf >= i7 || zzi(i7);
            }
            throw new IllegalStateException(String.valueOf(this.zzd.getClass()) + "#read(byte[]) returned invalid result: " + iZza + "\nThe InputStream implementation is buggy.");
        }
        throw new IllegalStateException("refillBuffer() called when " + i7 + " bytes were already available in buffer");
    }

    private static long zza(InputStream inputStream, long j7) throws zzall {
        try {
            return inputStream.skip(j7);
        } catch (zzall e7) {
            e7.zzk();
            throw e7;
        }
    }

    private final byte[] zza(int i7, boolean z7) throws IOException {
        byte[] bArrZzj = zzj(i7);
        if (bArrZzj != null) {
            return bArrZzj;
        }
        int i8 = this.zzh;
        int i9 = this.zzf;
        int length = i9 - i8;
        this.zzj += i9;
        this.zzh = 0;
        this.zzf = 0;
        List<byte[]> listZzf = zzf(i7 - length);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.zze, i8, bArr, 0, length);
        for (byte[] bArr2 : listZzf) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }
}
