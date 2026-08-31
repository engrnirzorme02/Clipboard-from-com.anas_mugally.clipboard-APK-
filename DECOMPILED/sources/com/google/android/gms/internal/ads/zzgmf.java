package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzgmf {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    zzgmf(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i7 = 0; i7 < cArr.length; i7++) {
            char c7 = cArr[i7];
            boolean z7 = true;
            zzghc.zzc(c7 < 128, "Non-ASCII character: %s", c7);
            if (bArr[c7] != -1) {
                z7 = false;
            }
            zzghc.zzc(z7, "Duplicate character: %s", c7);
            bArr[c7] = (byte) i7;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgmf) {
            zzgmf zzgmfVar = (zzgmf) obj;
            if (this.zzi == zzgmfVar.zzi && Arrays.equals(this.zzf, zzgmfVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzi ? 1237 : 1231);
    }

    public final String toString() {
        return this.zze;
    }

    final char zza(int i7) {
        return this.zzf[i7];
    }

    final boolean zzb(int i7) {
        return this.zzh[i7 % this.zzc];
    }

    final int zzc(char c7) throws zzgmi {
        if (c7 > 127) {
            throw new zzgmi("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c7))));
        }
        byte b7 = this.zzg[c7];
        if (b7 != -1) {
            return b7;
        }
        if (c7 <= ' ' || c7 == 127) {
            throw new zzgmi("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c7))));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(c7).length() + 24);
        sb.append("Unrecognized character: ");
        sb.append(c7);
        throw new zzgmi(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    final zzgmf zzd() {
        boolean z7;
        int i7 = 0;
        while (true) {
            char[] cArr = this.zzf;
            int length = cArr.length;
            if (i7 >= length) {
                return this;
            }
            if (zzggj.zzd(cArr[i7])) {
                int i8 = 0;
                while (true) {
                    if (i8 >= length) {
                        z7 = false;
                        break;
                    }
                    if (zzggj.zzc(cArr[i8])) {
                        z7 = true;
                        break;
                    }
                    i8++;
                }
                zzghc.zzi(!z7, "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr2 = new char[cArr.length];
                for (int i9 = 0; i9 < cArr.length; i9++) {
                    char c7 = cArr[i9];
                    if (zzggj.zzd(c7)) {
                        c7 ^= 32;
                    }
                    cArr2[i9] = (char) c7;
                }
                zzgmf zzgmfVar = new zzgmf(this.zze.concat(".lowerCase()"), cArr2);
                if (!this.zzi || zzgmfVar.zzi) {
                    return zzgmfVar;
                }
                byte[] bArr = zzgmfVar.zzg;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (int i10 = 65; i10 <= 90; i10++) {
                    int i11 = i10 | 32;
                    byte b7 = bArr[i10];
                    byte b8 = bArr[i11];
                    if (b7 == -1) {
                        bArrCopyOf[i10] = b8;
                    } else {
                        char c8 = (char) i10;
                        char c9 = (char) i11;
                        if (b8 != -1) {
                            throw new IllegalStateException(zzghs.zzd("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c8), Character.valueOf(c9)));
                        }
                        bArrCopyOf[i11] = b7;
                    }
                }
                return new zzgmf(zzgmfVar.zze.concat(".ignoreCase()"), zzgmfVar.zzf, bArrCopyOf, true);
            }
            i7++;
        }
    }

    public final boolean zze(char c7) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    final /* synthetic */ char[] zzf() {
        return this.zzf;
    }

    private zzgmf(String str, char[] cArr, byte[] bArr, boolean z7) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZza = zzgmx.zza(length, RoundingMode.UNNECESSARY);
            this.zzb = iZza;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZza);
            int i7 = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i7;
            this.zzd = iZza >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i7];
            for (int i8 = 0; i8 < this.zzd; i8++) {
                zArr[zzgmx.zzb(i8 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = z7;
        } catch (ArithmeticException e7) {
            int length2 = cArr.length;
            StringBuilder sb = new StringBuilder(String.valueOf(length2).length() + 24);
            sb.append("Illegal alphabet length ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString(), e7);
        }
    }
}
