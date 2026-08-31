package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.C3553a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzhhc extends zzhhg {
    private final byte[] zza;
    private int zzg;
    private int zzh;
    private int zzi;
    private final int zzj;
    private int zzk;
    private int zzl;

    /* synthetic */ zzhhc(byte[] bArr, int i7, int i8, boolean z7, byte[] bArr2) {
        super(null);
        this.zzl = C3553a.e.API_PRIORITY_OTHER;
        this.zza = bArr;
        this.zzg = i8 + i7;
        this.zzi = i7;
        this.zzj = i7;
    }

    private final void zzN() {
        int i7 = this.zzg + this.zzh;
        this.zzg = i7;
        int i8 = i7 - this.zzj;
        int i9 = this.zzl;
        if (i8 <= i9) {
            this.zzh = 0;
            return;
        }
        int i10 = i8 - i9;
        this.zzh = i10;
        this.zzg = i7 - i10;
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final void zzA(int i7) {
        this.zzl = i7;
        zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final boolean zzB() {
        return this.zzi == this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzC() {
        return this.zzi - this.zzj;
    }

    public final byte zzD() throws zzhiw {
        int i7 = this.zzi;
        if (i7 == this.zzg) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zza;
        this.zzi = i7 + 1;
        return bArr[i7];
    }

    public final void zzE(int i7) throws zzhiw {
        if (i7 >= 0) {
            int i8 = this.zzg;
            int i9 = this.zzi;
            if (i7 <= i8 - i9) {
                this.zzi = i9 + i7;
                return;
            }
        }
        if (i7 >= 0) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
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
            if (this.zzg - this.zzi < 10) {
                while (i9 < 10) {
                    if (zzD() < 0) {
                        i9++;
                    }
                }
                throw new zzhiw("CodedInputStream encountered a malformed varint.");
            }
            while (i9 < 10) {
                byte[] bArr = this.zza;
                int i10 = this.zzi;
                this.zzi = i10 + 1;
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
            int i7 = this.zzg;
            int i8 = this.zzi;
            if (iZzu <= i7 - i8) {
                String str = new String(this.zza, i8, iZzu, zzhiu.zza);
                this.zzi += iZzu;
                return str;
            }
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu < 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final String zzm() throws zzhiw {
        int iZzu = zzu();
        if (iZzu > 0) {
            int i7 = this.zzg;
            int i8 = this.zzi;
            if (iZzu <= i7 - i8) {
                String strZzf = zzhlh.zzf(this.zza, i8, iZzu);
                this.zzi += iZzu;
                return strZzf;
            }
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu <= 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final zzhhb zzn() throws zzhiw {
        int iZzu = zzu();
        if (iZzu > 0) {
            int i7 = this.zzg;
            int i8 = this.zzi;
            if (iZzu <= i7 - i8) {
                zzhhb zzhhbVarZzr = zzhhb.zzr(this.zza, i8, iZzu);
                this.zzi += iZzu;
                return zzhhbVarZzr;
            }
        }
        if (iZzu == 0) {
            return zzhhb.zzb;
        }
        if (iZzu > 0) {
            int i9 = this.zzg;
            int i10 = this.zzi;
            if (iZzu <= i9 - i10) {
                int i11 = iZzu + i10;
                this.zzi = i11;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(this.zza, i10, i11);
                zzhhb zzhhbVar = zzhhb.zzb;
                return new zzhgz(bArrCopyOfRange);
            }
        }
        if (iZzu <= 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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
        int i8 = this.zzi;
        int i9 = this.zzg;
        if (i9 != i8) {
            byte[] bArr = this.zza;
            int i10 = i8 + 1;
            byte b7 = bArr[i8];
            if (b7 >= 0) {
                this.zzi = i10;
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
                this.zzi = i11;
                return i7;
            }
        }
        return (int) zzw();
    }

    public final long zzv() {
        long j7;
        long j8;
        int i7 = this.zzi;
        int i8 = this.zzg;
        if (i8 != i7) {
            byte[] bArr = this.zza;
            int i9 = i7 + 1;
            byte b7 = bArr[i7];
            if (b7 >= 0) {
                this.zzi = i9;
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
                this.zzi = i10;
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
        int i7 = this.zzi;
        if (this.zzg - i7 < 4) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zza;
        this.zzi = i7 + 4;
        int i8 = bArr[i7] & 255;
        int i9 = bArr[i7 + 1] & 255;
        int i10 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i9 << 8) | i8 | (i10 << 16);
    }

    public final long zzy() throws zzhiw {
        int i7 = this.zzi;
        if (this.zzg - i7 < 8) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zza;
        this.zzi = i7 + 8;
        long j7 = bArr[i7];
        long j8 = (((long) bArr[i7 + 1]) & 255) << 8;
        long j9 = bArr[i7 + 2];
        long j10 = bArr[i7 + 3];
        return ((((long) bArr[i7 + 6]) & 255) << 48) | (j7 & 255) | j8 | ((j9 & 255) << 16) | ((j10 & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((((long) bArr[i7 + 7]) & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzz(int i7) {
        if (i7 < 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i8 = i7 + (this.zzi - this.zzj);
        if (i8 < 0) {
            throw new zzhiw("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i9 = this.zzl;
        if (i8 > i9) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i8;
        zzN();
        return i9;
    }
}
