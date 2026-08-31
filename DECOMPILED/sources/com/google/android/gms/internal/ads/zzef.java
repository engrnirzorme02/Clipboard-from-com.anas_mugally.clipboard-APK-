package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzef {
    private static final char[] zza = {'\r', '\n'};
    private static final char[] zzb = {'\n'};
    private static final zzgke zzc = zzgke.zzl(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private static final AtomicBoolean zzd = new AtomicBoolean();
    private byte[] zze;
    private int zzf;
    private int zzg;

    public zzef(byte[] bArr, int i7) {
        this.zze = bArr;
        this.zzg = i7;
    }

    private final char zzS(ByteOrder byteOrder, int i7) {
        zzW(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.zze;
            int i8 = this.zzf + i7;
            return zzgnb.zza(bArr[i8], bArr[i8 + 1]);
        }
        byte[] bArr2 = this.zze;
        int i9 = this.zzf + i7;
        return zzgnb.zza(bArr2[i9 + 1], bArr2[i9]);
    }

    private final char zzT(Charset charset, char[] cArr) {
        int iZzU;
        if (zzd() >= zzV(charset) && (iZzU = zzU(charset)) != 0) {
            int i7 = iZzU >>> 8;
            if (!Character.isSupplementaryCodePoint(i7)) {
                long j7 = i7;
                char c7 = (char) j7;
                zzghc.zze(((long) c7) == j7, "Out of range: %s", j7);
                for (char c8 : cArr) {
                    if (c8 == c7) {
                        this.zzf += zzgne.zza(iZzU & 255);
                        return c7;
                    }
                }
            }
        }
        return (char) 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    private final int zzU(Charset charset) {
        int codePoint;
        int i7;
        int unsignedInt;
        zzghc.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        if (zzd() < zzV(charset)) {
            int i8 = this.zzf;
            int i9 = this.zzg;
            StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 17 + String.valueOf(i9).length());
            sb.append("position=");
            sb.append(i8);
            sb.append(", limit=");
            sb.append(i9);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        int i10 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b7 = this.zze[this.zzf];
            if ((b7 & 128) == 0) {
                codePoint = Byte.toUnsignedInt(b7);
                return (codePoint << 8) | i10;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b8 = this.zze[this.zzf];
            if ((b8 & 128) == 0) {
                i7 = 1;
            } else if ((b8 & 224) == 192 && zzd() >= 2 && zzX(this.zze[this.zzf + 1])) {
                i7 = 2;
            } else if ((this.zze[this.zzf] & 240) == 224 && zzd() >= 3) {
                byte[] bArr = this.zze;
                int i11 = this.zzf;
                if (zzX(bArr[i11 + 1]) && zzX(bArr[i11 + 2])) {
                    i7 = 3;
                } else if ((this.zze[this.zzf] & 248) == 240) {
                    i7 = 0;
                } else {
                    i7 = 0;
                }
            } else if ((this.zze[this.zzf] & 248) == 240 || zzd() < 4) {
                i7 = 0;
            } else {
                byte[] bArr2 = this.zze;
                int i12 = this.zzf;
                if (zzX(bArr2[i12 + 1]) && zzX(bArr2[i12 + 2]) && zzX(bArr2[i12 + 3])) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
            }
            if (i7 == 1) {
                unsignedInt = Byte.toUnsignedInt(this.zze[this.zzf]);
            } else if (i7 == 2) {
                byte[] bArr3 = this.zze;
                int i13 = this.zzf;
                unsignedInt = zzY(0, 0, bArr3[i13], bArr3[i13 + 1]);
            } else {
                if (i7 != 3) {
                    if (i7 == 4) {
                        byte[] bArr4 = this.zze;
                        int i14 = this.zzf;
                        unsignedInt = zzY(bArr4[i14], bArr4[i14 + 1], bArr4[i14 + 2], bArr4[i14 + 3]);
                    }
                    return 0;
                }
                byte[] bArr5 = this.zze;
                int i15 = this.zzf;
                unsignedInt = zzY(0, bArr5[i15] & 15, bArr5[i15 + 1], bArr5[i15 + 2]);
            }
            i10 = i7;
            codePoint = unsignedInt;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cZzS = zzS(byteOrder, 0);
            if (!Character.isHighSurrogate(cZzS) || zzd() < 4) {
                codePoint = cZzS;
                i10 = 2;
            } else {
                codePoint = Character.toCodePoint(cZzS, zzS(byteOrder, 2));
                i10 = 4;
            }
        }
        return (codePoint << 8) | i10;
    }

    private static int zzV(Charset charset) {
        zzghc.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private final void zzW(int i7) {
        if (!zzd.get() || zzd() >= i7) {
            return;
        }
        int iZzd = zzd();
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 25 + String.valueOf(iZzd).length());
        sb.append("bytesNeeded= ");
        sb.append(i7);
        sb.append(", bytesLeft=");
        sb.append(iZzd);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    private static boolean zzX(byte b7) {
        return (b7 & 192) == 128;
    }

    private static int zzY(int i7, int i8, int i9, int i10) {
        return zzgne.zze((byte) 0, zzgni.zza(((i7 & 7) << 2) | ((i8 & 48) >> 4)), zzgni.zza(((i9 & 60) >> 2) | ((i8 & 15) << 4)), zzgni.zza((i10 & 63) | ((i9 & 3) << 6)));
    }

    public final long zzA() {
        zzW(4);
        byte[] bArr = this.zze;
        int i7 = this.zzf;
        int i8 = i7 + 1;
        this.zzf = i8;
        long j7 = bArr[i7];
        int i9 = i7 + 2;
        this.zzf = i9;
        long j8 = bArr[i8];
        int i10 = i7 + 3;
        this.zzf = i10;
        long j9 = bArr[i9];
        this.zzf = i7 + 4;
        return ((((long) bArr[i10]) & 255) << 24) | (255 & j7) | ((j8 & 255) << 8) | ((j9 & 255) << 16);
    }

    public final int zzB() {
        zzW(4);
        byte[] bArr = this.zze;
        int i7 = this.zzf;
        int i8 = i7 + 1;
        this.zzf = i8;
        int i9 = bArr[i7] & 255;
        int i10 = i7 + 2;
        this.zzf = i10;
        int i11 = bArr[i8] & 255;
        int i12 = i7 + 3;
        this.zzf = i12;
        int i13 = bArr[i10] & 255;
        this.zzf = i7 + 4;
        return (bArr[i12] & 255) | (i9 << 24) | (i11 << 16) | (i13 << 8);
    }

    public final int zzC() {
        zzW(4);
        byte[] bArr = this.zze;
        int i7 = this.zzf;
        int i8 = i7 + 1;
        this.zzf = i8;
        int i9 = bArr[i7] & 255;
        int i10 = i7 + 2;
        this.zzf = i10;
        int i11 = bArr[i8] & 255;
        int i12 = i7 + 3;
        this.zzf = i12;
        int i13 = bArr[i10] & 255;
        this.zzf = i7 + 4;
        return ((bArr[i12] & 255) << 24) | (i11 << 8) | i9 | (i13 << 16);
    }

    public final long zzD() {
        zzW(8);
        byte[] bArr = this.zze;
        int i7 = this.zzf;
        int i8 = i7 + 1;
        this.zzf = i8;
        long j7 = bArr[i7];
        int i9 = i7 + 2;
        this.zzf = i9;
        long j8 = bArr[i8];
        int i10 = i7 + 3;
        this.zzf = i10;
        long j9 = bArr[i9];
        int i11 = i7 + 4;
        this.zzf = i11;
        long j10 = bArr[i10];
        int i12 = i7 + 5;
        this.zzf = i12;
        long j11 = bArr[i11];
        int i13 = i7 + 6;
        this.zzf = i13;
        long j12 = bArr[i12];
        int i14 = i7 + 7;
        this.zzf = i14;
        long j13 = bArr[i13];
        this.zzf = i7 + 8;
        return ((j13 & 255) << 8) | ((j7 & 255) << 56) | ((j8 & 255) << 48) | ((j9 & 255) << 40) | ((j10 & 255) << 32) | ((j11 & 255) << 24) | ((j12 & 255) << 16) | (((long) bArr[i14]) & 255);
    }

    public final long zzE() {
        zzW(8);
        byte[] bArr = this.zze;
        int i7 = this.zzf;
        int i8 = i7 + 1;
        this.zzf = i8;
        long j7 = bArr[i7];
        int i9 = i7 + 2;
        this.zzf = i9;
        long j8 = bArr[i8];
        int i10 = i7 + 3;
        this.zzf = i10;
        long j9 = bArr[i9];
        int i11 = i7 + 4;
        this.zzf = i11;
        long j10 = bArr[i10];
        int i12 = i7 + 5;
        this.zzf = i12;
        long j11 = bArr[i11];
        int i13 = i7 + 6;
        this.zzf = i13;
        long j12 = bArr[i12];
        int i14 = i7 + 7;
        this.zzf = i14;
        long j13 = bArr[i13];
        this.zzf = i7 + 8;
        return ((j13 & 255) << 48) | (j7 & 255) | ((j8 & 255) << 8) | ((j9 & 255) << 16) | ((j10 & 255) << 24) | ((j11 & 255) << 32) | ((j12 & 255) << 40) | ((((long) bArr[i14]) & 255) << 56);
    }

    public final int zzF() {
        zzW(4);
        byte[] bArr = this.zze;
        int i7 = this.zzf;
        int i8 = i7 + 1;
        this.zzf = i8;
        int i9 = bArr[i7] & 255;
        this.zzf = i7 + 2;
        int i10 = bArr[i8] & 255;
        this.zzf = i7 + 4;
        return (i9 << 8) | i10;
    }

    public final int zzG() {
        return (zzs() << 21) | (zzs() << 14) | (zzs() << 7) | zzs();
    }

    public final int zzH() {
        int iZzB = zzB();
        if (iZzB >= 0) {
            return iZzB;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iZzB).length() + 18);
        sb.append("Top bit not zero: ");
        sb.append(iZzB);
        throw new IllegalStateException(sb.toString());
    }

    public final int zzI() {
        int iZzC = zzC();
        if (iZzC >= 0) {
            return iZzC;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iZzC).length() + 18);
        sb.append("Top bit not zero: ");
        sb.append(iZzC);
        throw new IllegalStateException(sb.toString());
    }

    public final long zzJ() {
        long jZzD = zzD();
        if (jZzD >= 0) {
            return jZzD;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(jZzD).length() + 18);
        sb.append("Top bit not zero: ");
        sb.append(jZzD);
        throw new IllegalStateException(sb.toString());
    }

    public final String zzK(int i7, Charset charset) {
        zzW(i7);
        byte[] bArr = this.zze;
        int i8 = this.zzf;
        String str = new String(bArr, i8, i7, charset);
        this.zzf = i8 + i7;
        return str;
    }

    public final String zzL(int i7) {
        zzW(i7);
        if (i7 == 0) {
            return "";
        }
        int i8 = this.zzf;
        int i9 = (i8 + i7) - 1;
        String strZzj = zzeo.zzj(this.zze, i8, (i9 >= this.zzg || this.zze[i9] != 0) ? i7 : i7 - 1);
        this.zzf += i7;
        return strZzj;
    }

    public final String zzM(char c7) {
        if (zzd() == 0) {
            return null;
        }
        int i7 = this.zzf;
        while (i7 < this.zzg && this.zze[i7] != 0) {
            i7++;
        }
        byte[] bArr = this.zze;
        int i8 = this.zzf;
        String strZzj = zzeo.zzj(bArr, i8, i7 - i8);
        this.zzf = i7;
        if (i7 < this.zzg) {
            this.zzf = i7 + 1;
        }
        return strZzj;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5 A[SYNTHETIC] */
    public final String zzN(Charset charset) {
        byte[] bArr;
        zzghc.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        if (zzd() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            zzR();
        }
        int i7 = 1;
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(charset2)) {
            i7 = 2;
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: ".concat(String.valueOf(charset)));
            }
        }
        int i8 = this.zzf;
        while (true) {
            int i9 = this.zzg;
            if (i8 >= i9 - (i7 - 1)) {
                i8 = i9;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && zzeo.zzk(this.zze[i8])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr2 = this.zze;
                if (bArr2[i8] == 0 && zzeo.zzk(bArr2[i8 + 1])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.zze;
                    if (bArr[i8 + 1] == 0 && zzeo.zzk(bArr[i8])) {
                        break;
                    }
                }
                i8 += i7;
            } else {
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.zze;
                    if (bArr[i8 + 1] == 0) {
                        continue;
                    }
                }
                i8 += i7;
            }
        }
        String strZzK = zzK(i8 - this.zzf, charset);
        if (this.zzf != this.zzg && zzT(charset, zza) == '\r') {
            zzT(charset, zzb);
        }
        return strZzK;
    }

    public final long zzO() {
        int i7;
        zzW(1);
        long j7 = this.zze[this.zzf];
        int i8 = 7;
        while (true) {
            i7 = 0;
            if (i8 < 0) {
                break;
            }
            int i9 = 1 << i8;
            if ((((long) i9) & j7) == 0) {
                if (i8 >= 6) {
                    if (i8 != 7) {
                        break;
                    }
                    i7 = 1;
                    break;
                }
                j7 &= (long) (i9 - 1);
                i7 = 7 - i8;
                break;
            }
            i8--;
        }
        if (i7 == 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(j7).length() + 35);
            sb.append("Invalid UTF-8 sequence first byte: ");
            sb.append(j7);
            throw new NumberFormatException(sb.toString());
        }
        zzW(i7);
        for (int i10 = 1; i10 < i7; i10++) {
            byte b7 = this.zze[this.zzf + i10];
            if ((b7 & 192) != 128) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(j7).length() + 42);
                sb2.append("Invalid UTF-8 sequence continuation byte: ");
                sb2.append(j7);
                throw new NumberFormatException(sb2.toString());
            }
            j7 = (j7 << 6) | ((long) (b7 & 63));
        }
        this.zzf += i7;
        return j7;
    }

    public final long zzP() {
        long j7 = 0;
        for (int i7 = 0; i7 < 9; i7++) {
            if (this.zzf == this.zzg) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jZzs = zzs();
            j7 |= (127 & jZzs) << (i7 * 7);
            if ((jZzs & 128) == 0) {
                return j7;
            }
        }
        return j7;
    }

    public final void zzQ() {
        while ((zzs() & 128) != 0) {
        }
    }

    public final Charset zzR() {
        if (zzd() >= 3) {
            byte[] bArr = this.zze;
            int i7 = this.zzf;
            if (bArr[i7] == -17 && bArr[i7 + 1] == -69 && bArr[i7 + 2] == -65) {
                this.zzf = i7 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (zzd() < 2) {
            return null;
        }
        byte[] bArr2 = this.zze;
        int i8 = this.zzf;
        byte b7 = bArr2[i8];
        if (b7 == -2) {
            if (bArr2[i8 + 1] != -1) {
                return null;
            }
            this.zzf = i8 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b7 != -1 || bArr2[i8 + 1] != -2) {
            return null;
        }
        this.zzf = i8 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void zza(int i7) {
        byte[] bArr = this.zze;
        if (bArr.length < i7) {
            bArr = new byte[i7];
        }
        zzb(bArr, i7);
    }

    public final void zzb(byte[] bArr, int i7) {
        this.zze = bArr;
        this.zzg = i7;
        this.zzf = 0;
    }

    public final void zzc(int i7) {
        byte[] bArr = this.zze;
        if (i7 > bArr.length) {
            this.zze = Arrays.copyOf(bArr, i7);
        }
    }

    public final int zzd() {
        return Math.max(this.zzg - this.zzf, 0);
    }

    public final int zze() {
        return this.zzg;
    }

    public final void zzf(int i7) {
        boolean z7 = false;
        if (i7 >= 0 && i7 <= this.zze.length) {
            z7 = true;
        }
        zzghc.zza(z7);
        this.zzg = i7;
    }

    public final int zzg() {
        return this.zzf;
    }

    public final void zzh(int i7) {
        boolean z7 = false;
        if (i7 >= 0 && i7 <= this.zzg) {
            z7 = true;
        }
        zzghc.zza(z7);
        this.zzf = i7;
    }

    public final byte[] zzi() {
        return this.zze;
    }

    public final int zzj() {
        return this.zze.length;
    }

    public final void zzk(int i7) {
        zzh(this.zzf + i7);
    }

    public final void zzl(zzee zzeeVar, int i7) {
        zzm(zzeeVar.zza, 0, i7);
        zzeeVar.zzf(0);
    }

    public final void zzm(byte[] bArr, int i7, int i8) {
        zzW(i8);
        System.arraycopy(this.zze, this.zzf, bArr, i7, i8);
        this.zzf += i8;
    }

    public final int zzn() {
        zzW(1);
        return this.zze[this.zzf] & 255;
    }

    public final char zzo() {
        return zzS(ByteOrder.BIG_ENDIAN, 0);
    }

    public final int zzp(Charset charset) {
        int iZzU = zzU(charset);
        if (iZzU != 0) {
            return zzgne.zza(iZzU >>> 8);
        }
        return 1114112;
    }

    public final int zzq() {
        if (zzd() >= 3) {
            int iZzx = zzx();
            this.zzf -= 3;
            return iZzx;
        }
        int i7 = this.zzf;
        int i8 = this.zzg;
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 17 + String.valueOf(i8).length());
        sb.append("position=");
        sb.append(i7);
        sb.append(", limit=");
        sb.append(i8);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int zzr() {
        if (zzd() >= 4) {
            int iZzB = zzB();
            this.zzf -= 4;
            return iZzB;
        }
        int i7 = this.zzf;
        int i8 = this.zzg;
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 17 + String.valueOf(i8).length());
        sb.append("position=");
        sb.append(i7);
        sb.append(", limit=");
        sb.append(i8);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int zzs() {
        zzW(1);
        byte[] bArr = this.zze;
        int i7 = this.zzf;
        this.zzf = i7 + 1;
        return bArr[i7] & 255;
    }

    public final int zzt() {
        zzW(2);
        byte[] bArr = this.zze;
        int i7 = this.zzf;
        int i8 = i7 + 1;
        this.zzf = i8;
        int i9 = bArr[i7] & 255;
        this.zzf = i7 + 2;
        return (bArr[i8] & 255) | (i9 << 8);
    }

    public final int zzu() {
        zzW(2);
        byte[] bArr = this.zze;
        int i7 = this.zzf;
        int i8 = i7 + 1;
        this.zzf = i8;
        int i9 = bArr[i7] & 255;
        this.zzf = i7 + 2;
        return ((bArr[i8] & 255) << 8) | i9;
    }

    public final short zzv() {
        zzW(2);
        byte[] bArr = this.zze;
        int i7 = this.zzf;
        int i8 = i7 + 1;
        this.zzf = i8;
        int i9 = bArr[i7] & 255;
        this.zzf = i7 + 2;
        return (short) ((bArr[i8] & 255) | (i9 << 8));
    }

    public final short zzw() {
        zzW(2);
        byte[] bArr = this.zze;
        int i7 = this.zzf;
        int i8 = i7 + 1;
        this.zzf = i8;
        int i9 = bArr[i7] & 255;
        this.zzf = i7 + 2;
        return (short) (((bArr[i8] & 255) << 8) | i9);
    }

    public final int zzx() {
        zzW(3);
        byte[] bArr = this.zze;
        int i7 = this.zzf;
        int i8 = i7 + 1;
        this.zzf = i8;
        int i9 = bArr[i7] & 255;
        int i10 = i7 + 2;
        this.zzf = i10;
        int i11 = bArr[i8] & 255;
        this.zzf = i7 + 3;
        return (bArr[i10] & 255) | (i9 << 16) | (i11 << 8);
    }

    public final int zzy() {
        zzW(3);
        byte[] bArr = this.zze;
        int i7 = this.zzf;
        int i8 = i7 + 1;
        this.zzf = i8;
        int i9 = bArr[i7] & 255;
        int i10 = i7 + 2;
        this.zzf = i10;
        int i11 = bArr[i8] & 255;
        this.zzf = i7 + 3;
        return (bArr[i10] & 255) | ((i9 << 24) >> 8) | (i11 << 8);
    }

    public final long zzz() {
        zzW(4);
        byte[] bArr = this.zze;
        int i7 = this.zzf;
        int i8 = i7 + 1;
        this.zzf = i8;
        long j7 = bArr[i7];
        int i9 = i7 + 2;
        this.zzf = i9;
        long j8 = bArr[i8];
        int i10 = i7 + 3;
        this.zzf = i10;
        long j9 = bArr[i9];
        this.zzf = i7 + 4;
        return (((long) bArr[i10]) & 255) | ((j7 & 255) << 24) | ((j8 & 255) << 16) | ((j9 & 255) << 8);
    }

    public zzef() {
        this.zze = zzeo.zzb;
    }

    public zzef(int i7) {
        this.zze = new byte[i7];
        this.zzg = i7;
    }

    public zzef(byte[] bArr) {
        this.zze = bArr;
        this.zzg = bArr.length;
    }
}
