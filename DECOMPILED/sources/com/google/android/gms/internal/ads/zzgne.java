package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.C3553a;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgne extends zzgnf {
    public static int zza(long j7) {
        int i7 = (int) j7;
        zzghc.zze(((long) i7) == j7, "Out of range: %s", j7);
        return i7;
    }

    public static int zzb(long j7) {
        if (j7 > 2147483647L) {
            return C3553a.e.API_PRIORITY_OTHER;
        }
        if (j7 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j7;
    }

    public static int zzc(int i7, int i8, int i9) {
        zzghc.zzg(true, "min (%s) must be less than or equal to max (%s)", i8, 1073741823);
        return Math.min(Math.max(i7, i8), 1073741823);
    }

    public static int zzd(byte[] bArr) {
        int length = bArr.length;
        zzghc.zzg(length >= 4, "array too small: %s < %s", length, 4);
        return zze(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int zze(byte b7, byte b8, byte b9, byte b10) {
        return (b7 << 24) | ((b8 & 255) << 16) | ((b9 & 255) << 8) | (b10 & 255);
    }

    public static int[] zzf(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            Object obj = array[i7];
            obj.getClass();
            iArr[i7] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static List zzg(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new zzgnd(iArr, 0, length);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public static Integer zzh(String str, int i7) {
        Long lValueOf;
        str.getClass();
        if (!str.isEmpty()) {
            char cCharAt = str.charAt(0);
            int i8 = cCharAt == '-' ? 1 : 0;
            if (i8 != str.length()) {
                int i9 = i8 + 1;
                int iZza = zzgng.zza(str.charAt(i8));
                if (iZza >= 0 && iZza < 10) {
                    long j7 = -iZza;
                    while (true) {
                        if (i9 >= str.length()) {
                            if (cCharAt != '-') {
                                if (j7 != Long.MIN_VALUE) {
                                    lValueOf = Long.valueOf(-j7);
                                    break;
                                }
                                break;
                            }
                            lValueOf = Long.valueOf(j7);
                            break;
                        }
                        int i10 = i9 + 1;
                        int iZza2 = zzgng.zza(str.charAt(i9));
                        if (iZza2 >= 0 && iZza2 < 10 && j7 >= -922337203685477580L) {
                            long j8 = j7 * 10;
                            long j9 = iZza2;
                            if (j8 >= Long.MIN_VALUE + j9) {
                                j7 = j8 - j9;
                                i9 = i10;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }

    static /* synthetic */ int zzi(int[] iArr, int i7, int i8, int i9) {
        while (i8 < i9) {
            if (iArr[i8] == i7) {
                return i8;
            }
            i8++;
        }
        return -1;
    }
}
