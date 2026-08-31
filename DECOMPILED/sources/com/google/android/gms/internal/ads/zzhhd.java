package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.C3553a;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzhhd extends zzhhg {
    private final Iterable zza;
    private final Iterator zzg;
    private ByteBuffer zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private long zzo;
    private long zzp;

    /* synthetic */ zzhhd(Iterable iterable, int i7, boolean z7, byte[] bArr) {
        super(null);
        this.zzk = C3553a.e.API_PRIORITY_OTHER;
        this.zzi = i7;
        this.zza = iterable;
        this.zzg = iterable.iterator();
        this.zzm = 0;
        if (i7 != 0) {
            zzO();
            return;
        }
        this.zzh = zzhiu.zzc;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = 0L;
    }

    private final void zzN() throws zzhiw {
        if (!this.zzg.hasNext()) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        zzO();
    }

    private final void zzO() {
        ByteBuffer byteBuffer = (ByteBuffer) this.zzg.next();
        this.zzh = byteBuffer;
        this.zzm += (int) (this.zzn - this.zzo);
        long jPosition = byteBuffer.position();
        this.zzn = jPosition;
        this.zzo = jPosition;
        this.zzp = this.zzh.limit();
        long jZzs = zzhlc.zzs(this.zzh);
        this.zzn += jZzs;
        this.zzo += jZzs;
        this.zzp += jZzs;
    }

    private final void zzP() {
        int i7 = this.zzi + this.zzj;
        this.zzi = i7;
        int i8 = this.zzk;
        if (i7 <= i8) {
            this.zzj = 0;
            return;
        }
        int i9 = i7 - i8;
        this.zzj = i9;
        this.zzi = i7 - i9;
    }

    private final void zzQ(byte[] bArr, int i7, int i8) throws zzhiw {
        if (i8 > zzR()) {
            if (i8 > 0) {
                throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            return;
        }
        int i9 = i8;
        while (i9 > 0) {
            if (this.zzp - this.zzn == 0) {
                zzN();
            }
            int iMin = Math.min(i9, (int) (this.zzp - this.zzn));
            long j7 = iMin;
            zzhlc.zzq(this.zzn, bArr, i8 - i9, j7);
            i9 -= iMin;
            this.zzn += j7;
        }
    }

    private final int zzR() {
        return (int) ((((long) (this.zzi - this.zzm)) - this.zzn) + this.zzo);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final void zzA(int i7) {
        this.zzk = i7;
        zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final boolean zzB() {
        return (((long) this.zzm) + this.zzn) - this.zzo == ((long) this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzC() {
        return (int) ((((long) this.zzm) + this.zzn) - this.zzo);
    }

    public final byte zzD() throws zzhiw {
        if (this.zzp - this.zzn == 0) {
            zzN();
        }
        long j7 = this.zzn;
        this.zzn = 1 + j7;
        return zzhlc.zzr(j7);
    }

    public final void zzE(int i7) throws zzhiw {
        if (i7 >= 0) {
            if (i7 <= (((long) (this.zzi - this.zzm)) - this.zzn) + this.zzo) {
                while (i7 > 0) {
                    if (this.zzp - this.zzn == 0) {
                        zzN();
                    }
                    int iMin = Math.min(i7, (int) (this.zzp - this.zzn));
                    i7 -= iMin;
                    this.zzn += (long) iMin;
                }
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
            this.zzl = 0;
            return 0;
        }
        int iZzu = zzu();
        this.zzl = iZzu;
        if ((iZzu >>> 3) != 0) {
            return iZzu;
        }
        throw new zzhiw("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final void zzb(int i7) throws zzhiw {
        if (this.zzl != i7) {
            throw new zzhiw("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final boolean zzc(int i7) throws zzhiw {
        int i8 = i7 & 7;
        if (i8 == 0) {
            for (int i9 = 0; i9 < 10; i9++) {
                if (zzD() >= 0) {
                    return true;
                }
            }
            throw new zzhiw("CodedInputStream encountered a malformed varint.");
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
            long j7 = this.zzp;
            long j8 = this.zzn;
            long j9 = iZzu;
            if (j9 <= j7 - j8) {
                byte[] bArr = new byte[iZzu];
                zzhlc.zzq(j8, bArr, 0L, j9);
                String str = new String(bArr, zzhiu.zza);
                this.zzn += j9;
                return str;
            }
        }
        if (iZzu > 0 && iZzu <= zzR()) {
            byte[] bArr2 = new byte[iZzu];
            zzQ(bArr2, 0, iZzu);
            return new String(bArr2, zzhiu.zza);
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
            long j7 = this.zzp;
            long j8 = this.zzn;
            long j9 = iZzu;
            if (j9 <= j7 - j8) {
                String strZze = zzhlh.zze(this.zzh, (int) (j8 - this.zzo), iZzu);
                this.zzn += j9;
                return strZze;
            }
        }
        if (iZzu >= 0 && iZzu <= zzR()) {
            byte[] bArr = new byte[iZzu];
            zzQ(bArr, 0, iZzu);
            return zzhlh.zzf(bArr, 0, iZzu);
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
            long j7 = this.zzp;
            long j8 = this.zzn;
            long j9 = iZzu;
            if (j9 <= j7 - j8) {
                byte[] bArr = new byte[iZzu];
                zzhlc.zzq(j8, bArr, 0L, j9);
                this.zzn += j9;
                zzhhb zzhhbVar = zzhhb.zzb;
                return new zzhgz(bArr);
            }
        }
        if (iZzu > 0 && iZzu <= zzR()) {
            byte[] bArr2 = new byte[iZzu];
            zzQ(bArr2, 0, iZzu);
            zzhhb zzhhbVar2 = zzhhb.zzb;
            return new zzhgz(bArr2);
        }
        if (iZzu == 0) {
            return zzhhb.zzb;
        }
        if (iZzu < 0) {
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
        long j7 = this.zzn;
        if (this.zzp != j7) {
            long j8 = j7 + 1;
            byte bZzr = zzhlc.zzr(j7);
            if (bZzr >= 0) {
                this.zzn++;
                return bZzr;
            }
            if (this.zzp - this.zzn >= 10) {
                long j9 = 2 + j7;
                int iZzr = (zzhlc.zzr(j8) << 7) ^ bZzr;
                if (iZzr < 0) {
                    i7 = iZzr ^ (-128);
                } else {
                    long j10 = 3 + j7;
                    int iZzr2 = (zzhlc.zzr(j9) << 14) ^ iZzr;
                    if (iZzr2 >= 0) {
                        i7 = iZzr2 ^ 16256;
                    } else {
                        long j11 = 4 + j7;
                        int iZzr3 = iZzr2 ^ (zzhlc.zzr(j10) << 21);
                        if (iZzr3 < 0) {
                            i7 = (-2080896) ^ iZzr3;
                        } else {
                            j10 = 5 + j7;
                            byte bZzr2 = zzhlc.zzr(j11);
                            int i8 = (iZzr3 ^ (bZzr2 << 28)) ^ 266354560;
                            if (bZzr2 < 0) {
                                j11 = 6 + j7;
                                if (zzhlc.zzr(j10) < 0) {
                                    j10 = 7 + j7;
                                    if (zzhlc.zzr(j11) < 0) {
                                        j11 = 8 + j7;
                                        if (zzhlc.zzr(j10) < 0) {
                                            j10 = 9 + j7;
                                            if (zzhlc.zzr(j11) < 0) {
                                                long j12 = j7 + 10;
                                                if (zzhlc.zzr(j10) >= 0) {
                                                    i7 = i8;
                                                    j9 = j12;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i8;
                            }
                            i7 = i8;
                        }
                        j9 = j11;
                    }
                    j9 = j10;
                }
                this.zzn = j9;
                return i7;
            }
        }
        return (int) zzw();
    }

    public final long zzv() {
        long j7;
        long j8;
        long j9 = this.zzn;
        if (this.zzp != j9) {
            long j10 = j9 + 1;
            byte bZzr = zzhlc.zzr(j9);
            if (bZzr >= 0) {
                this.zzn++;
                return bZzr;
            }
            if (this.zzp - this.zzn >= 10) {
                long j11 = 2 + j9;
                int iZzr = (zzhlc.zzr(j10) << 7) ^ bZzr;
                if (iZzr < 0) {
                    j7 = iZzr ^ (-128);
                } else {
                    long j12 = 3 + j9;
                    int iZzr2 = (zzhlc.zzr(j11) << 14) ^ iZzr;
                    if (iZzr2 >= 0) {
                        j7 = iZzr2 ^ 16256;
                    } else {
                        long j13 = 4 + j9;
                        int iZzr3 = iZzr2 ^ (zzhlc.zzr(j12) << 21);
                        if (iZzr3 < 0) {
                            j7 = (-2080896) ^ iZzr3;
                            j11 = j13;
                        } else {
                            j12 = 5 + j9;
                            long jZzr = (((long) zzhlc.zzr(j13)) << 28) ^ ((long) iZzr3);
                            if (jZzr >= 0) {
                                j7 = 266354560 ^ jZzr;
                            } else {
                                long j14 = 6 + j9;
                                long jZzr2 = jZzr ^ (((long) zzhlc.zzr(j12)) << 35);
                                if (jZzr2 < 0) {
                                    j8 = -34093383808L;
                                } else {
                                    long j15 = 7 + j9;
                                    long jZzr3 = jZzr2 ^ (((long) zzhlc.zzr(j14)) << 42);
                                    if (jZzr3 >= 0) {
                                        j7 = 4363953127296L ^ jZzr3;
                                    } else {
                                        j14 = 8 + j9;
                                        jZzr2 = jZzr3 ^ (((long) zzhlc.zzr(j15)) << 49);
                                        if (jZzr2 < 0) {
                                            j8 = -558586000294016L;
                                        } else {
                                            j15 = 9 + j9;
                                            long jZzr4 = (jZzr2 ^ (((long) zzhlc.zzr(j14)) << 56)) ^ 71499008037633920L;
                                            if (jZzr4 < 0) {
                                                long j16 = j9 + 10;
                                                if (zzhlc.zzr(j15) >= 0) {
                                                    j11 = j16;
                                                    j7 = jZzr4;
                                                }
                                            } else {
                                                j7 = jZzr4;
                                            }
                                        }
                                    }
                                    j11 = j15;
                                }
                                j7 = j8 ^ jZzr2;
                                j11 = j14;
                            }
                        }
                    }
                    j11 = j12;
                }
                this.zzn = j11;
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

    public final int zzx() {
        long j7 = this.zzp;
        long j8 = this.zzn;
        if (j7 - j8 < 4) {
            int iZzD = zzD() & 255;
            int iZzD2 = (zzD() & 255) << 8;
            return iZzD | iZzD2 | ((zzD() & 255) << 16) | ((zzD() & 255) << 24);
        }
        this.zzn = 4 + j8;
        int iZzr = zzhlc.zzr(j8) & 255;
        int iZzr2 = (zzhlc.zzr(1 + j8) & 255) << 8;
        return iZzr | iZzr2 | ((zzhlc.zzr(2 + j8) & 255) << 16) | ((zzhlc.zzr(j8 + 3) & 255) << 24);
    }

    public final long zzy() {
        long j7 = this.zzp;
        long j8 = this.zzn;
        if (j7 - j8 < 8) {
            long jZzD = ((long) zzD()) & 255;
            long jZzD2 = (((long) zzD()) & 255) << 8;
            long jZzD3 = (((long) zzD()) & 255) << 16;
            long jZzD4 = (((long) zzD()) & 255) << 24;
            long jZzD5 = (((long) zzD()) & 255) << 32;
            long jZzD6 = (((long) zzD()) & 255) << 40;
            return ((((long) zzD()) & 255) << 56) | jZzD | jZzD2 | jZzD3 | jZzD4 | jZzD5 | jZzD6 | ((((long) zzD()) & 255) << 48);
        }
        this.zzn = 8 + j8;
        long jZzr = ((long) zzhlc.zzr(j8)) & 255;
        long jZzr2 = (((long) zzhlc.zzr(1 + j8)) & 255) << 8;
        long jZzr3 = (((long) zzhlc.zzr(j8 + 2)) & 255) << 16;
        long jZzr4 = (((long) zzhlc.zzr(3 + j8)) & 255) << 24;
        long jZzr5 = (((long) zzhlc.zzr(j8 + 4)) & 255) << 32;
        long jZzr6 = (((long) zzhlc.zzr(j8 + 5)) & 255) << 40;
        return jZzr | jZzr2 | jZzr3 | jZzr4 | jZzr5 | jZzr6 | ((((long) zzhlc.zzr(j8 + 6)) & 255) << 48) | ((((long) zzhlc.zzr(j8 + 7)) & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzz(int i7) throws zzhiw {
        if (i7 < 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iZzC = i7 + zzC();
        int i8 = this.zzk;
        if (iZzC > i8) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzk = iZzC;
        zzP();
        return i8;
    }
}
