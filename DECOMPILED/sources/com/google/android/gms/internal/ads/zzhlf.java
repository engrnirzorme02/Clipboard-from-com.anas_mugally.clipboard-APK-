package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzhlf extends zzhle {
    zzhlf() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0080, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.zzhle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zza(int i7, byte[] bArr, int i8, int i9) {
        int i10;
        int i11;
        if (i7 != 0) {
            if (i8 >= i9) {
                return i7;
            }
            byte b7 = (byte) i7;
            if (b7 < -32) {
                if (b7 >= -62) {
                    i11 = i8 + 1;
                }
                return -1;
            }
            int i12 = ~(i7 >> 8);
            if (b7 < -16) {
                byte b8 = (byte) i12;
                if (b8 == 0) {
                    int i13 = i8 + 1;
                    byte b9 = bArr[i8];
                    if (i13 >= i9) {
                        return zzhlh.zzj(b7, b9);
                    }
                    i8 = i13;
                    b8 = b9;
                }
                if (b8 <= -65 && ((b7 != -32 || b8 >= -96) && (b7 != -19 || b8 < -96))) {
                    i11 = i8 + 1;
                }
                return -1;
            }
            byte b10 = (byte) i12;
            if (b10 == 0) {
                int i14 = i8 + 1;
                b10 = bArr[i8];
                if (i14 >= i9) {
                    return zzhlh.zzj(b7, b10);
                }
                i8 = i14;
                i10 = 0;
            } else {
                i10 = i7 >> 16;
            }
            if (i10 == 0) {
                int i15 = i8 + 1;
                byte b11 = bArr[i8];
                if (i15 >= i9) {
                    return zzhlh.zzk(b7, b10, b11);
                }
                i8 = i15;
                i10 = b11;
            }
            if (b10 <= -65 && (((b7 << 28) + (b10 + 112)) >> 30) == 0 && i10 <= -65) {
                i11 = i8 + 1;
            }
            return -1;
            i8 = i11;
        }
        while (i8 < i9 && bArr[i8] >= 0) {
            i8++;
        }
        if (i8 >= i9) {
            return 0;
        }
        while (i8 < i9) {
            int i16 = i8 + 1;
            byte b12 = bArr[i8];
            if (b12 >= 0) {
                i8 = i16;
            } else {
                if (b12 < -32) {
                    if (i16 >= i9) {
                        return b12;
                    }
                    if (b12 >= -62) {
                        i8 += 2;
                        if (bArr[i16] > -65) {
                        }
                    }
                    return -1;
                }
                if (b12 >= -16) {
                    if (i16 >= i9 - 2) {
                        return zzhlh.zzi(bArr, i16, i9);
                    }
                    int i17 = i8 + 2;
                    byte b13 = bArr[i16];
                    if (b13 <= -65 && (((b12 << 28) + (b13 + 112)) >> 30) == 0) {
                        int i18 = i8 + 3;
                        if (bArr[i17] <= -65) {
                            i8 += 4;
                            if (bArr[i18] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i16 >= i9 - 1) {
                    return zzhlh.zzi(bArr, i16, i9);
                }
                int i19 = i8 + 2;
                byte b14 = bArr[i16];
                if (b14 > -65 || (b12 == -32 && b14 < -96)) {
                    return -1;
                }
                if (b12 == -19 && b14 >= -96) {
                    return -1;
                }
                i8 += 3;
                if (bArr[i19] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhle
    final String zzb(byte[] bArr, int i7, int i8) throws zzhiw {
        int i9;
        int length = bArr.length;
        if ((((length - i7) - i8) | i7 | i8) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i7), Integer.valueOf(i8)));
        }
        int i10 = i7 + i8;
        char[] cArr = new char[i8];
        int i11 = 0;
        while (i7 < i10) {
            byte b7 = bArr[i7];
            if (!zzhld.zza(b7)) {
                break;
            }
            i7++;
            cArr[i11] = (char) b7;
            i11++;
        }
        int i12 = i11;
        while (i7 < i10) {
            int i13 = i7 + 1;
            byte b8 = bArr[i7];
            if (zzhld.zza(b8)) {
                cArr[i12] = (char) b8;
                i12++;
                i7 = i13;
                while (i7 < i10) {
                    byte b9 = bArr[i7];
                    if (!zzhld.zza(b9)) {
                        break;
                    }
                    i7++;
                    cArr[i12] = (char) b9;
                    i12++;
                }
            } else {
                if (zzhld.zzb(b8)) {
                    if (i13 >= i10) {
                        throw new zzhiw("Protocol message had invalid UTF-8.");
                    }
                    i9 = i12 + 1;
                    i7 += 2;
                    zzhld.zzd(b8, bArr[i13], cArr, i12);
                } else if (zzhld.zzc(b8)) {
                    if (i13 >= i10 - 1) {
                        throw new zzhiw("Protocol message had invalid UTF-8.");
                    }
                    i9 = i12 + 1;
                    int i14 = i7 + 2;
                    i7 += 3;
                    zzhld.zze(b8, bArr[i13], bArr[i14], cArr, i12);
                } else {
                    if (i13 >= i10 - 2) {
                        throw new zzhiw("Protocol message had invalid UTF-8.");
                    }
                    byte b10 = bArr[i13];
                    int i15 = i7 + 3;
                    byte b11 = bArr[i7 + 2];
                    i7 += 4;
                    zzhld.zzf(b8, b10, b11, bArr[i15], cArr, i12);
                    i12 += 2;
                }
                i12 = i9;
            }
        }
        return new String(cArr, 0, i12);
    }
}
