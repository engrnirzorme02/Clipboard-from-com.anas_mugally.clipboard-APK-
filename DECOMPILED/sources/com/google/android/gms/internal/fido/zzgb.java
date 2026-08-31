package com.google.android.gms.internal.fido;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzgb {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    zzgb(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i7 = 0; i7 < cArr.length; i7++) {
            char c7 = cArr[i7];
            boolean z7 = true;
            zzbm.zzd(c7 < 128, "Non-ASCII character: %s", c7);
            if (bArr[c7] != -1) {
                z7 = false;
            }
            zzbm.zzd(z7, "Duplicate character: %s", c7);
            bArr[c7] = (byte) i7;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgb) {
            zzgb zzgbVar = (zzgb) obj;
            if (this.zzh == zzgbVar.zzh && Arrays.equals(this.zzf, zzgbVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzh ? 1237 : 1231);
    }

    public final String toString() {
        return this.zze;
    }

    final char zza(int i7) {
        return this.zzf[i7];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    final zzgb zzb() {
        int i7;
        boolean z7;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            char[] cArr = this.zzf;
            if (i9 >= cArr.length) {
                return this;
            }
            if (zzba.zza(cArr[i9])) {
                int i10 = 0;
                while (true) {
                    if (i10 >= cArr.length) {
                        z7 = false;
                        break;
                    }
                    char c7 = cArr[i10];
                    if (c7 >= 'A' && c7 <= 'Z') {
                        z7 = true;
                        break;
                    }
                    i10++;
                }
                zzbm.zzf(!z7, "Cannot call upperCase() on a mixed-case alphabet");
                char[] cArr2 = new char[this.zzf.length];
                while (true) {
                    char[] cArr3 = this.zzf;
                    if (i8 >= cArr3.length) {
                        break;
                    }
                    char c8 = cArr3[i8];
                    if (zzba.zza(c8)) {
                        c8 ^= 32;
                    }
                    cArr2[i8] = (char) c8;
                    i8++;
                }
                zzgb zzgbVar = new zzgb(this.zze.concat(".upperCase()"), cArr2);
                if (!this.zzh || zzgbVar.zzh) {
                    return zzgbVar;
                }
                byte[] bArr = zzgbVar.zzg;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (i7 = 65; i7 <= 90; i7++) {
                    int i11 = i7 | 32;
                    byte[] bArr2 = zzgbVar.zzg;
                    byte b7 = bArr2[i7];
                    byte b8 = bArr2[i11];
                    if (b7 == -1) {
                        bArrCopyOf[i7] = b8;
                    } else {
                        char c9 = (char) i7;
                        char c10 = (char) i11;
                        if (b8 != -1) {
                            throw new IllegalStateException(zzbo.zza("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c9), Character.valueOf(c10)));
                        }
                        bArrCopyOf[i11] = b7;
                    }
                }
                return new zzgb(zzgbVar.zze.concat(".ignoreCase()"), zzgbVar.zzf, bArrCopyOf, true);
            }
            i9++;
        }
    }

    public final boolean zzc(char c7) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    private zzgb(String str, char[] cArr, byte[] bArr, boolean z7) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZzb = zzgh.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = iZzb;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzb);
            int i7 = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i7;
            this.zzd = iZzb >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i7];
            for (int i8 = 0; i8 < this.zzd; i8++) {
                zArr[zzgh.zza(i8 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = z7;
        } catch (ArithmeticException e7) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e7);
        }
    }
}
