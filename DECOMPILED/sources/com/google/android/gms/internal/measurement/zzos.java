package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzos {
    public static final /* synthetic */ int zza = 0;

    static {
        if (zzop.zza() && zzop.zzb()) {
            int i7 = zzkv.zza;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0076 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x007a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    static boolean zza(byte[] bArr, int i7, int i8) {
        while (i7 < i8 && bArr[i7] >= 0) {
            i7++;
        }
        if (i7 >= i8) {
            return true;
        }
        while (i7 < i8) {
            int i9 = i7 + 1;
            int iZzd = bArr[i7];
            if (iZzd >= 0) {
                i7 = i9;
            } else if (iZzd < -32) {
                if (i9 >= i8) {
                    if (iZzd != 0) {
                        return false;
                    }
                    return true;
                }
                if (iZzd < -62) {
                    return false;
                }
                i7 += 2;
                if (bArr[i9] > -65) {
                    return false;
                }
            } else if (iZzd < -16) {
                if (i9 >= i8 - 1) {
                    iZzd = zzd(bArr, i9, i8);
                    if (iZzd != 0) {
                        return false;
                    }
                    return true;
                }
                int i10 = i7 + 2;
                char c7 = bArr[i9];
                if (c7 > -65) {
                    return false;
                }
                if (iZzd == -32 && c7 < -96) {
                    return false;
                }
                if (iZzd == -19 && c7 >= -96) {
                    return false;
                }
                i7 += 3;
                if (bArr[i10] > -65) {
                    return false;
                }
            } else {
                if (i9 >= i8 - 2) {
                    iZzd = zzd(bArr, i9, i8);
                    if (iZzd != 0) {
                        return false;
                    }
                    return true;
                }
                int i11 = i7 + 2;
                int i12 = bArr[i9];
                if (i12 > -65 || (((iZzd << 28) + (i12 + 112)) >> 30) != 0) {
                    return false;
                }
                int i13 = i7 + 3;
                if (bArr[i11] > -65) {
                    return false;
                }
                i7 += 4;
                if (bArr[i13] > -65) {
                    return false;
                }
            }
        }
        return true;
    }

    static int zzb(String str) {
        int length = str.length();
        int i7 = 0;
        int i8 = 0;
        while (i8 < length && str.charAt(i8) < 128) {
            i8++;
        }
        int i9 = length;
        while (i8 < length) {
            char cCharAt = str.charAt(i8);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i8 < length2) {
                    char cCharAt2 = str.charAt(i8);
                    if (cCharAt2 < 2048) {
                        i7 += (127 - cCharAt2) >>> 31;
                    } else {
                        i7 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i8) < 65536) {
                                throw new zzor(i8, length2);
                            }
                            i8++;
                        }
                    }
                    i8++;
                }
                i9 += i7;
                break;
            }
            i9 += (127 - cCharAt) >>> 31;
            i8++;
        }
        if (i9 >= length) {
            return i9;
        }
        long j7 = ((long) i9) + 4294967296L;
        StringBuilder sb = new StringBuilder(String.valueOf(j7).length() + 34);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j7);
        throw new IllegalArgumentException(sb.toString());
    }

    static int zzc(String str, byte[] bArr, int i7, int i8) {
        int i9;
        int i10;
        int i11;
        char cCharAt;
        int length = str.length();
        int i12 = 0;
        while (true) {
            i9 = i7 + i8;
            if (i12 >= length || (i11 = i12 + i7) >= i9 || (cCharAt = str.charAt(i12)) >= 128) {
                break;
            }
            bArr[i11] = (byte) cCharAt;
            i12++;
        }
        if (i12 == length) {
            return i7 + length;
        }
        int i13 = i7 + i12;
        while (i12 < length) {
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 128 && i13 < i9) {
                bArr[i13] = (byte) cCharAt2;
                i13++;
            } else if (cCharAt2 < 2048 && i13 <= i9 - 2) {
                bArr[i13] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i13 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i13 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i13 > i9 - 3) {
                    if (i13 > i9 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i10 = i12 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i10)))) {
                            throw new zzor(i12, length);
                        }
                        StringBuilder sb = new StringBuilder(String.valueOf(cCharAt2).length() + 25 + String.valueOf(i13).length());
                        sb.append("Failed writing ");
                        sb.append(cCharAt2);
                        sb.append(" at index ");
                        sb.append(i13);
                        throw new ArrayIndexOutOfBoundsException(sb.toString());
                    }
                    int i14 = i12 + 1;
                    if (i14 != str.length()) {
                        char cCharAt3 = str.charAt(i14);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i15 = i13 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i13] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i13 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i13 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i13 += 4;
                            bArr[i15] = (byte) ((codePoint & 63) | 128);
                            i12 = i14;
                        } else {
                            i12 = i14;
                        }
                    }
                    throw new zzor(i12 - 1, length);
                }
                bArr[i13] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i13 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i13 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i13 += 3;
            }
            i12++;
        }
        return i13;
    }

    static /* synthetic */ int zzd(byte[] bArr, int i7, int i8) {
        int i9 = i8 - i7;
        byte b7 = bArr[i7 - 1];
        if (i9 == 0) {
            if (b7 <= -12) {
                return b7;
            }
            return -1;
        }
        if (i9 == 1) {
            byte b8 = bArr[i7];
            if (b7 > -12 || b8 > -65) {
                return -1;
            }
            return (b8 << 8) ^ b7;
        }
        if (i9 != 2) {
            throw new AssertionError();
        }
        byte b9 = bArr[i7];
        byte b10 = bArr[i7 + 1];
        if (b7 > -12 || b9 > -65 || b10 > -65) {
            return -1;
        }
        return (b10 << 16) ^ ((b9 << 8) ^ b7);
    }
}
