package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.C3553a;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzhhe extends zzhhg {
    private final InputStream zza;
    private final byte[] zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    /* synthetic */ zzhhe(InputStream inputStream, int i7, byte[] bArr) {
        super(null);
        this.zzm = C3553a.e.API_PRIORITY_OTHER;
        byte[] bArr2 = zzhiu.zzb;
        this.zza = inputStream;
        this.zzg = new byte[4096];
        this.zzh = 0;
        this.zzj = 0;
        this.zzl = 0;
    }

    private final void zzN() {
        int i7 = this.zzh + this.zzi;
        this.zzh = i7;
        int i8 = this.zzl + i7;
        int i9 = this.zzm;
        if (i8 <= i9) {
            this.zzi = 0;
            return;
        }
        int i10 = i8 - i9;
        this.zzi = i10;
        this.zzh = i7 - i10;
    }

    private final void zzO(int i7) throws zzhiw {
        if (zzP(i7)) {
            return;
        }
        if (i7 <= (C3553a.e.API_PRIORITY_OTHER - this.zzl) - this.zzj) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzhiw("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private final boolean zzP(int i7) throws IOException {
        int i8 = this.zzj;
        int i9 = i8 + i7;
        int i10 = this.zzh;
        if (i9 <= i10) {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 66);
            sb.append("refillBuffer() called when ");
            sb.append(i7);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        int i11 = this.zzl;
        if (i7 > (C3553a.e.API_PRIORITY_OTHER - i11) - i8 || i11 + i8 + i7 > this.zzm) {
            return false;
        }
        if (i8 > 0) {
            if (i10 > i8) {
                byte[] bArr = this.zzg;
                System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
            }
            i11 = this.zzl + i8;
            this.zzl = i11;
            i10 = this.zzh - i8;
            this.zzh = i10;
            this.zzj = 0;
        }
        try {
            int i12 = this.zza.read(this.zzg, i10, Math.min(4096 - i10, (C3553a.e.API_PRIORITY_OTHER - i11) - i10));
            if (i12 != 0 && i12 >= -1 && i12 <= 4096) {
                if (i12 <= 0) {
                    return false;
                }
                this.zzh += i12;
                zzN();
                return this.zzh >= i7 || zzP(i7);
            }
            String strValueOf = String.valueOf(this.zza.getClass());
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 39 + String.valueOf(i12).length() + 41);
            sb2.append(strValueOf);
            sb2.append("#read(byte[]) returned invalid result: ");
            sb2.append(i12);
            sb2.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb2.toString());
        } catch (zzhiw e7) {
            e7.zza();
            throw e7;
        }
    }

    private final byte[] zzQ(int i7, boolean z7) throws IOException {
        byte[] bArrZzR = zzR(i7);
        if (bArrZzR != null) {
            return bArrZzR;
        }
        int i8 = this.zzj;
        int i9 = this.zzh;
        int i10 = i9 - i8;
        this.zzl += i9;
        this.zzj = 0;
        this.zzh = 0;
        List<byte[]> listZzS = zzS(i7 - i10);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.zzg, i8, bArr, 0, i10);
        for (byte[] bArr2 : listZzS) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i10, length);
            i10 += length;
        }
        return bArr;
    }

    private final byte[] zzR(int i7) throws IOException {
        if (i7 == 0) {
            return zzhiu.zzb;
        }
        int i8 = this.zzl;
        int i9 = this.zzj;
        int i10 = i8 + i9 + i7;
        if ((-2147483647) + i10 > 0) {
            throw new zzhiw("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i11 = this.zzm;
        if (i10 > i11) {
            zzE((i11 - i8) - i9);
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i12 = this.zzh - i9;
        int i13 = i7 - i12;
        if (i13 >= 4096) {
            try {
                if (i13 > this.zza.available()) {
                    return null;
                }
            } catch (zzhiw e7) {
                e7.zza();
                throw e7;
            }
        }
        byte[] bArr = new byte[i7];
        System.arraycopy(this.zzg, this.zzj, bArr, 0, i12);
        this.zzl += this.zzh;
        this.zzj = 0;
        this.zzh = 0;
        while (i12 < i7) {
            try {
                int i14 = this.zza.read(bArr, i12, i7 - i12);
                if (i14 == -1) {
                    throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzl += i14;
                i12 += i14;
            } catch (zzhiw e8) {
                e8.zza();
                throw e8;
            }
        }
        return bArr;
    }

    private final List zzS(int i7) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int iMin = Math.min(i7, 4096);
            byte[] bArr = new byte[iMin];
            int i8 = 0;
            while (i8 < iMin) {
                int i9 = this.zza.read(bArr, i8, iMin - i8);
                if (i9 == -1) {
                    throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzl += i9;
                i8 += i9;
            }
            i7 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final void zzA(int i7) {
        this.zzm = i7;
        zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final boolean zzB() {
        return this.zzj == this.zzh && !zzP(1);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzC() {
        return this.zzl + this.zzj;
    }

    public final byte zzD() throws zzhiw {
        if (this.zzj == this.zzh) {
            zzO(1);
        }
        byte[] bArr = this.zzg;
        int i7 = this.zzj;
        this.zzj = i7 + 1;
        return bArr[i7];
    }

    public final void zzE(int i7) throws zzhiw {
        int i8 = this.zzh;
        int i9 = this.zzj;
        int i10 = i8 - i9;
        if (i7 <= i10 && i7 >= 0) {
            this.zzj = i9 + i7;
            return;
        }
        if (i7 < 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = this.zzl;
        int i12 = i11 + i9;
        int i13 = this.zzm;
        if (i12 + i7 > i13) {
            zzE((i13 - i11) - i9);
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i12;
        this.zzh = 0;
        this.zzj = 0;
        while (i10 < i7) {
            try {
                long j7 = i7 - i10;
                try {
                    long jSkip = this.zza.skip(j7);
                    if (jSkip < 0 || jSkip > j7) {
                        String strValueOf = String.valueOf(this.zza.getClass());
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb.append(strValueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(jSkip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i10 += (int) jSkip;
                    }
                } catch (zzhiw e7) {
                    e7.zza();
                    throw e7;
                }
            } catch (Throwable th) {
                this.zzl += i10;
                zzN();
                throw th;
            }
        }
        this.zzl += i10;
        zzN();
        if (i10 >= i7) {
            return;
        }
        int i14 = this.zzh;
        int i15 = i14 - this.zzj;
        this.zzj = i14;
        zzO(1);
        while (true) {
            int i16 = i7 - i15;
            int i17 = this.zzh;
            if (i16 <= i17) {
                this.zzj = i16;
                return;
            } else {
                i15 += i17;
                this.zzj = i17;
                zzO(1);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zza() throws zzhiw {
        if (zzB()) {
            this.zzk = 0;
            return 0;
        }
        int iZzu = zzu();
        this.zzk = iZzu;
        if ((iZzu >>> 3) != 0) {
            return iZzu;
        }
        throw new zzhiw("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final void zzb(int i7) throws zzhiw {
        if (this.zzk != i7) {
            throw new zzhiw("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final boolean zzc(int i7) throws zzhiw {
        int i8 = i7 & 7;
        int i9 = 0;
        if (i8 == 0) {
            if (this.zzh - this.zzj < 10) {
                while (i9 < 10) {
                    if (zzD() < 0) {
                        i9++;
                    }
                }
                throw new zzhiw("CodedInputStream encountered a malformed varint.");
            }
            while (i9 < 10) {
                byte[] bArr = this.zzg;
                int i10 = this.zzj;
                this.zzj = i10 + 1;
                if (bArr[i10] < 0) {
                    i9++;
                }
            }
            throw new zzhiw("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i8 == 1) {
            zzE(8);
            return true;
        }
        if (i8 == 2) {
            zzE(zzu());
            return true;
        }
        if (i8 == 3) {
            zzJ();
            zzb(((i7 >>> 3) << 3) | 4);
            return true;
        }
        if (i8 == 4) {
            zzI();
            return false;
        }
        if (i8 != 5) {
            throw new zzhiv("Protocol message tag had invalid wire type.");
        }
        zzE(4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final double zzd() {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final float zze() {
        return Float.intBitsToFloat(zzx());
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final long zzf() {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final long zzg() {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzh() {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final long zzi() {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzj() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final boolean zzk() {
        return zzv() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final String zzl() throws zzhiw {
        int iZzu = zzu();
        if (iZzu > 0) {
            int i7 = this.zzh;
            int i8 = this.zzj;
            if (iZzu <= i7 - i8) {
                String str = new String(this.zzg, i8, iZzu, zzhiu.zza);
                this.zzj += iZzu;
                return str;
            }
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu < 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iZzu > this.zzh) {
            return new String(zzQ(iZzu, false), zzhiu.zza);
        }
        zzO(iZzu);
        String str2 = new String(this.zzg, this.zzj, iZzu, zzhiu.zza);
        this.zzj += iZzu;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final String zzm() throws IOException {
        byte[] bArrZzQ;
        int iZzu = zzu();
        int i7 = this.zzj;
        int i8 = this.zzh;
        if (iZzu <= i8 - i7 && iZzu > 0) {
            bArrZzQ = this.zzg;
            this.zzj = i7 + iZzu;
        } else {
            if (iZzu == 0) {
                return "";
            }
            if (iZzu < 0) {
                throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i7 = 0;
            if (iZzu <= i8) {
                zzO(iZzu);
                bArrZzQ = this.zzg;
                this.zzj = iZzu;
            } else {
                bArrZzQ = zzQ(iZzu, false);
            }
        }
        return zzhlh.zzf(bArrZzQ, i7, iZzu);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final zzhhb zzn() throws IOException {
        int iZzu = zzu();
        int i7 = this.zzh;
        int i8 = this.zzj;
        if (iZzu <= i7 - i8 && iZzu > 0) {
            zzhhb zzhhbVarZzr = zzhhb.zzr(this.zzg, i8, iZzu);
            this.zzj += iZzu;
            return zzhhbVarZzr;
        }
        if (iZzu == 0) {
            return zzhhb.zzb;
        }
        if (iZzu < 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrZzR = zzR(iZzu);
        if (bArrZzR != null) {
            return zzhhb.zzr(bArrZzR, 0, bArrZzR.length);
        }
        int i9 = this.zzj;
        int i10 = this.zzh;
        int i11 = i10 - i9;
        this.zzl += i10;
        this.zzj = 0;
        this.zzh = 0;
        List<byte[]> listZzS = zzS(iZzu - i11);
        byte[] bArr = new byte[iZzu];
        System.arraycopy(this.zzg, i9, bArr, 0, i11);
        for (byte[] bArr2 : listZzS) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i11, length);
            i11 += length;
        }
        zzhhb zzhhbVar = zzhhb.zzb;
        return new zzhgz(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzo() {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzp() {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzq() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final long zzr() {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzs() {
        return zzhhg.zzK(zzu());
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final long zzt() {
        return zzhhg.zzL(zzv());
    }

    public final int zzu() {
        int i7;
        int i8 = this.zzj;
        int i9 = this.zzh;
        if (i9 != i8) {
            byte[] bArr = this.zzg;
            int i10 = i8 + 1;
            byte b7 = bArr[i8];
            if (b7 >= 0) {
                this.zzj = i10;
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
                this.zzj = i11;
                return i7;
            }
        }
        return (int) zzw();
    }

    public final long zzv() {
        long j7;
        long j8;
        int i7 = this.zzj;
        int i8 = this.zzh;
        if (i8 != i7) {
            byte[] bArr = this.zzg;
            int i9 = i7 + 1;
            byte b7 = bArr[i7];
            if (b7 >= 0) {
                this.zzj = i9;
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
                    } else {
                        int i14 = i7 + 4;
                        int i15 = i13 ^ (bArr[i12] << 21);
                        if (i15 < 0) {
                            long j9 = (-2080896) ^ i15;
                            i10 = i14;
                            j7 = j9;
                        } else {
                            i12 = i7 + 5;
                            long j10 = (((long) bArr[i14]) << 28) ^ ((long) i15);
                            if (j10 >= 0) {
                                j7 = j10 ^ 266354560;
                            } else {
                                i10 = i7 + 6;
                                long j11 = (((long) bArr[i12]) << 35) ^ j10;
                                if (j11 < 0) {
                                    j8 = -34093383808L;
                                } else {
                                    int i16 = i7 + 7;
                                    long j12 = j11 ^ (((long) bArr[i10]) << 42);
                                    if (j12 >= 0) {
                                        j7 = j12 ^ 4363953127296L;
                                    } else {
                                        i10 = i7 + 8;
                                        j11 = j12 ^ (((long) bArr[i16]) << 49);
                                        if (j11 < 0) {
                                            j8 = -558586000294016L;
                                        } else {
                                            i16 = i7 + 9;
                                            long j13 = (j11 ^ (((long) bArr[i10]) << 56)) ^ 71499008037633920L;
                                            if (j13 < 0) {
                                                i10 = i7 + 10;
                                                if (bArr[i16] >= 0) {
                                                    j7 = j13;
                                                }
                                            } else {
                                                j7 = j13;
                                            }
                                        }
                                    }
                                    i10 = i16;
                                }
                                j7 = j11 ^ j8;
                            }
                        }
                    }
                    i10 = i12;
                }
                this.zzj = i10;
                return j7;
            }
        }
        return zzw();
    }

    final long zzw() throws zzhiw {
        long j7 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            byte bZzD = zzD();
            j7 |= ((long) (bZzD & 127)) << i7;
            if ((bZzD & 128) == 0) {
                return j7;
            }
        }
        throw new zzhiw("CodedInputStream encountered a malformed varint.");
    }

    public final int zzx() throws zzhiw {
        int i7 = this.zzj;
        if (this.zzh - i7 < 4) {
            zzO(4);
            i7 = this.zzj;
        }
        byte[] bArr = this.zzg;
        this.zzj = i7 + 4;
        int i8 = bArr[i7] & 255;
        int i9 = bArr[i7 + 1] & 255;
        int i10 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i9 << 8) | i8 | (i10 << 16);
    }

    public final long zzy() throws zzhiw {
        int i7 = this.zzj;
        if (this.zzh - i7 < 8) {
            zzO(8);
            i7 = this.zzj;
        }
        byte[] bArr = this.zzg;
        this.zzj = i7 + 8;
        long j7 = bArr[i7];
        long j8 = (((long) bArr[i7 + 1]) & 255) << 8;
        long j9 = bArr[i7 + 2];
        long j10 = bArr[i7 + 3];
        return ((((long) bArr[i7 + 6]) & 255) << 48) | (j7 & 255) | j8 | ((j9 & 255) << 16) | ((j10 & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((((long) bArr[i7 + 7]) & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzz(int i7) throws zzhiw {
        if (i7 < 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i8 = i7 + this.zzl + this.zzj;
        if (i8 < 0) {
            throw new zzhiw("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i9 = this.zzm;
        if (i8 > i9) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzm = i8;
        zzN();
        return i9;
    }
}
