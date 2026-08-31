package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.C3553a;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
final class zzhhf extends zzhhg {
    public static final /* synthetic */ int zza = 0;
    private final ByteBuffer zzg;
    private final long zzh;
    private long zzi;
    private long zzj;
    private final long zzk;
    private int zzl;
    private int zzm;
    private int zzn;

    /* synthetic */ zzhhf(ByteBuffer byteBuffer, boolean z7, byte[] bArr) {
        super(null);
        this.zzn = C3553a.e.API_PRIORITY_OTHER;
        this.zzg = byteBuffer.duplicate();
        long jZzs = zzhlc.zzs(byteBuffer);
        this.zzh = jZzs;
        this.zzi = ((long) byteBuffer.limit()) + jZzs;
        long jPosition = jZzs + ((long) byteBuffer.position());
        this.zzj = jPosition;
        this.zzk = jPosition;
    }

    private final void zzN() {
        long j7 = this.zzi + ((long) this.zzl);
        this.zzi = j7;
        int i7 = (int) (j7 - this.zzk);
        int i8 = this.zzn;
        if (i7 <= i8) {
            this.zzl = 0;
            return;
        }
        int i9 = i7 - i8;
        this.zzl = i9;
        this.zzi = j7 - ((long) i9);
    }

    private final int zzO() {
        return (int) (this.zzi - this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final void zzA(int i7) {
        this.zzn = i7;
        zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final boolean zzB() {
        return this.zzj == this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzC() {
        return (int) (this.zzj - this.zzk);
    }

    public final byte zzD() throws zzhiw {
        long j7 = this.zzj;
        if (j7 == this.zzi) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = 1 + j7;
        return zzhlc.zzr(j7);
    }

    public final void zzE(int i7) throws zzhiw {
        if (i7 >= 0 && i7 <= zzO()) {
            this.zzj += (long) i7;
        } else {
            if (i7 >= 0) {
                throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zza() throws zzhiw {
        if (zzB()) {
            this.zzm = 0;
            return 0;
        }
        int iZzu = zzu();
        this.zzm = iZzu;
        if ((iZzu >>> 3) != 0) {
            return iZzu;
        }
        throw new zzhiw("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final void zzb(int i7) throws zzhiw {
        if (this.zzm != i7) {
            throw new zzhiw("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final boolean zzc(int i7) throws zzhiw {
        int i8 = i7 & 7;
        int i9 = 0;
        if (i8 == 0) {
            if (zzO() < 10) {
                while (i9 < 10) {
                    if (zzD() < 0) {
                        i9++;
                    }
                }
                throw new zzhiw("CodedInputStream encountered a malformed varint.");
            }
            while (i9 < 10) {
                long j7 = this.zzj;
                this.zzj = 1 + j7;
                if (zzhlc.zzr(j7) < 0) {
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
        if (iZzu <= 0 || iZzu > zzO()) {
            if (iZzu == 0) {
                return "";
            }
            if (iZzu < 0) {
                throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[iZzu];
        long j7 = iZzu;
        zzhlc.zzq(this.zzj, bArr, 0L, j7);
        String str = new String(bArr, zzhiu.zza);
        this.zzj += j7;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final String zzm() throws zzhiw {
        int iZzu = zzu();
        if (iZzu > 0 && iZzu <= zzO()) {
            String strZze = zzhlh.zze(this.zzg, (int) (this.zzj - this.zzh), iZzu);
            this.zzj += (long) iZzu;
            return strZze;
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
        if (iZzu <= 0 || iZzu > zzO()) {
            if (iZzu == 0) {
                return zzhhb.zzb;
            }
            if (iZzu < 0) {
                throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[iZzu];
        long j7 = iZzu;
        zzhlc.zzq(this.zzj, bArr, 0L, j7);
        this.zzj += j7;
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

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (com.google.android.gms.internal.ads.zzhlc.zzr(r3) >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzu() {
        int i7;
        long j7 = this.zzj;
        if (this.zzi != j7) {
            long j8 = 1 + j7;
            byte bZzr = zzhlc.zzr(j7);
            if (bZzr >= 0) {
                this.zzj = j8;
                return bZzr;
            }
            if (this.zzi - j8 >= 9) {
                long j9 = 2 + j7;
                int iZzr = (zzhlc.zzr(j8) << 7) ^ bZzr;
                if (iZzr < 0) {
                    i7 = iZzr ^ (-128);
                } else {
                    long j10 = 3 + j7;
                    int iZzr2 = iZzr ^ (zzhlc.zzr(j9) << 14);
                    if (iZzr2 >= 0) {
                        i7 = iZzr2 ^ 16256;
                    } else {
                        j9 = 4 + j7;
                        int iZzr3 = iZzr2 ^ (zzhlc.zzr(j10) << 21);
                        if (iZzr3 < 0) {
                            i7 = (-2080896) ^ iZzr3;
                        } else {
                            j10 = 5 + j7;
                            byte bZzr2 = zzhlc.zzr(j9);
                            int i8 = (iZzr3 ^ (bZzr2 << 28)) ^ 266354560;
                            if (bZzr2 < 0) {
                                j9 = 6 + j7;
                                if (zzhlc.zzr(j10) < 0) {
                                    j10 = 7 + j7;
                                    if (zzhlc.zzr(j9) < 0) {
                                        j9 = 8 + j7;
                                        if (zzhlc.zzr(j10) < 0) {
                                            j10 = j7 + 9;
                                            if (zzhlc.zzr(j9) < 0) {
                                                j9 = 10 + j7;
                                            }
                                        }
                                    }
                                }
                                i7 = i8;
                            }
                            i7 = i8;
                        }
                    }
                    j9 = j10;
                }
                this.zzj = j9;
                return i7;
            }
        }
        return (int) zzw();
    }

    public final long zzv() {
        long j7;
        long j8;
        int i7;
        long j9 = this.zzj;
        if (this.zzi != j9) {
            long j10 = 1 + j9;
            byte bZzr = zzhlc.zzr(j9);
            if (bZzr >= 0) {
                this.zzj = j10;
                return bZzr;
            }
            if (this.zzi - j10 >= 9) {
                long j11 = 2 + j9;
                int iZzr = (zzhlc.zzr(j10) << 7) ^ bZzr;
                if (iZzr >= 0) {
                    long j12 = 3 + j9;
                    int iZzr2 = iZzr ^ (zzhlc.zzr(j11) << 14);
                    if (iZzr2 < 0) {
                        j11 = 4 + j9;
                        int iZzr3 = iZzr2 ^ (zzhlc.zzr(j12) << 21);
                        if (iZzr3 < 0) {
                            i7 = (-2080896) ^ iZzr3;
                        } else {
                            j12 = 5 + j9;
                            long jZzr = (((long) zzhlc.zzr(j11)) << 28) ^ ((long) iZzr3);
                            if (jZzr >= 0) {
                                j7 = 266354560 ^ jZzr;
                            } else {
                                long j13 = 6 + j9;
                                long jZzr2 = (((long) zzhlc.zzr(j12)) << 35) ^ jZzr;
                                if (jZzr2 < 0) {
                                    j8 = -34093383808L;
                                } else {
                                    j11 = j9 + 7;
                                    long jZzr3 = jZzr2 ^ (((long) zzhlc.zzr(j13)) << 42);
                                    if (jZzr3 >= 0) {
                                        j7 = 4363953127296L ^ jZzr3;
                                    } else {
                                        j13 = 8 + j9;
                                        jZzr2 = jZzr3 ^ (((long) zzhlc.zzr(j11)) << 49);
                                        if (jZzr2 < 0) {
                                            j8 = -558586000294016L;
                                        } else {
                                            j11 = j9 + 9;
                                            long jZzr4 = (jZzr2 ^ (((long) zzhlc.zzr(j13)) << 56)) ^ 71499008037633920L;
                                            if (jZzr4 < 0) {
                                                long j14 = j9 + 10;
                                                if (zzhlc.zzr(j11) >= 0) {
                                                    j11 = j14;
                                                }
                                            }
                                            j7 = jZzr4;
                                        }
                                    }
                                }
                                j7 = j8 ^ jZzr2;
                                j11 = j13;
                            }
                        }
                        this.zzj = j11;
                        return j7;
                    }
                    j7 = iZzr2 ^ 16256;
                    j11 = j12;
                    this.zzj = j11;
                    return j7;
                }
                i7 = iZzr ^ (-128);
                j7 = i7;
                this.zzj = j11;
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
        long j7 = this.zzj;
        if (this.zzi - j7 < 4) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = 4 + j7;
        int iZzr = zzhlc.zzr(j7) & 255;
        int iZzr2 = zzhlc.zzr(1 + j7) & 255;
        int iZzr3 = zzhlc.zzr(2 + j7) & 255;
        return ((zzhlc.zzr(j7 + 3) & 255) << 24) | (iZzr2 << 8) | iZzr | (iZzr3 << 16);
    }

    public final long zzy() throws zzhiw {
        long j7 = this.zzj;
        if (this.zzi - j7 < 8) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = 8 + j7;
        long jZzr = zzhlc.zzr(j7);
        long jZzr2 = zzhlc.zzr(1 + j7);
        long jZzr3 = zzhlc.zzr(2 + j7);
        long jZzr4 = zzhlc.zzr(3 + j7);
        long jZzr5 = zzhlc.zzr(4 + j7);
        return ((((long) zzhlc.zzr(j7 + 7)) & 255) << 56) | (jZzr & 255) | ((jZzr2 & 255) << 8) | ((jZzr3 & 255) << 16) | ((jZzr4 & 255) << 24) | ((jZzr5 & 255) << 32) | ((zzhlc.zzr(5 + j7) & 255) << 40) | ((zzhlc.zzr(6 + j7) & 255) << 48);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzz(int i7) throws zzhiw {
        if (i7 < 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iZzC = i7 + zzC();
        int i8 = this.zzn;
        if (iZzC > i8) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzn = iZzC;
        zzN();
        return i8;
    }
}
