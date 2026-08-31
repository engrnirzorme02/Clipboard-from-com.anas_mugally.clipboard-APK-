package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzhjv<T> implements zzhkk<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhlc.zzt();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhjs zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzhkv zzm;
    private final zzhhs zzn;

    private zzhjv(int[] iArr, Object[] objArr, int i7, int i8, zzhjs zzhjsVar, boolean z7, int[] iArr2, int i9, int i10, zzhjy zzhjyVar, zzhje zzhjeVar, zzhkv zzhkvVar, zzhhs zzhhsVar, zzhjn zzhjnVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i7;
        this.zzf = i8;
        this.zzi = zzhjsVar instanceof zzhih;
        boolean z8 = false;
        if (zzhhsVar != null && (zzhjsVar instanceof zzhid)) {
            z8 = true;
        }
        this.zzh = z8;
        this.zzj = iArr2;
        this.zzk = i9;
        this.zzl = i10;
        this.zzm = zzhkvVar;
        this.zzn = zzhhsVar;
        this.zzg = zzhjsVar;
    }

    private final int zzA(int i7) {
        return this.zzc[i7 + 1];
    }

    private final int zzB(int i7) {
        return this.zzc[i7 + 2];
    }

    private static int zzC(int i7) {
        return (i7 >>> 20) & 255;
    }

    private static boolean zzD(int i7) {
        return (i7 & 536870912) != 0;
    }

    private static boolean zzE(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzhih) {
            return ((zzhih) obj).zzaX();
        }
        return true;
    }

    private static void zzF(Object obj) {
        if (!zzE(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static double zzG(Object obj, long j7) {
        return ((Double) zzhlc.zzn(obj, j7)).doubleValue();
    }

    private static float zzH(Object obj, long j7) {
        return ((Float) zzhlc.zzn(obj, j7)).floatValue();
    }

    private static int zzI(Object obj, long j7) {
        return ((Integer) zzhlc.zzn(obj, j7)).intValue();
    }

    private static long zzJ(Object obj, long j7) {
        return ((Long) zzhlc.zzn(obj, j7)).longValue();
    }

    private static boolean zzK(Object obj, long j7) {
        return ((Boolean) zzhlc.zzn(obj, j7)).booleanValue();
    }

    private final boolean zzL(Object obj, Object obj2, int i7) {
        return zzN(obj, i7) == zzN(obj2, i7);
    }

    private final boolean zzM(Object obj, int i7, int i8, int i9, int i10) {
        if (i8 == 1048575) {
            return zzN(obj, i7);
        }
        return (i9 & i10) != 0;
    }

    private final boolean zzN(Object obj, int i7) {
        int iZzB = zzB(i7);
        long j7 = iZzB & 1048575;
        if (j7 != 1048575) {
            return (zzhlc.zzd(obj, j7) & (1 << (iZzB >>> 20))) != 0;
        }
        int iZzA = zzA(i7);
        long j8 = iZzA & 1048575;
        switch (zzC(iZzA)) {
            case 0:
                return Double.doubleToRawLongBits(zzhlc.zzl(obj, j8)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhlc.zzj(obj, j8)) != 0;
            case 2:
                return zzhlc.zzf(obj, j8) != 0;
            case 3:
                return zzhlc.zzf(obj, j8) != 0;
            case 4:
                return zzhlc.zzd(obj, j8) != 0;
            case 5:
                return zzhlc.zzf(obj, j8) != 0;
            case 6:
                return zzhlc.zzd(obj, j8) != 0;
            case 7:
                return zzhlc.zzh(obj, j8);
            case 8:
                Object objZzn = zzhlc.zzn(obj, j8);
                if (objZzn instanceof String) {
                    return !((String) objZzn).isEmpty();
                }
                if (objZzn instanceof zzhhb) {
                    return !zzhhb.zzb.equals(objZzn);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhlc.zzn(obj, j8) != null;
            case 10:
                return !zzhhb.zzb.equals(zzhlc.zzn(obj, j8));
            case 11:
                return zzhlc.zzd(obj, j8) != 0;
            case 12:
                return zzhlc.zzd(obj, j8) != 0;
            case 13:
                return zzhlc.zzd(obj, j8) != 0;
            case 14:
                return zzhlc.zzf(obj, j8) != 0;
            case 15:
                return zzhlc.zzd(obj, j8) != 0;
            case 16:
                return zzhlc.zzf(obj, j8) != 0;
            case 17:
                return zzhlc.zzn(obj, j8) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzO(Object obj, int i7) {
        int iZzB = zzB(i7);
        long j7 = 1048575 & iZzB;
        if (j7 == 1048575) {
            return;
        }
        zzhlc.zze(obj, j7, (1 << (iZzB >>> 20)) | zzhlc.zzd(obj, j7));
    }

    private final boolean zzP(Object obj, int i7, int i8) {
        return zzhlc.zzd(obj, (long) (zzB(i8) & 1048575)) == i7;
    }

    private final void zzQ(Object obj, int i7, int i8) {
        zzhlc.zze(obj, zzB(i8) & 1048575, i7);
    }

    private final int zzR(int i7) {
        if (i7 < this.zze || i7 > this.zzf) {
            return -1;
        }
        return zzS(i7, 0);
    }

    private final int zzS(int i7, int i8) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int i11 = iArr[i10];
            if (i7 == i11) {
                return i10;
            }
            if (i7 < i11) {
                length = i9 - 1;
            } else {
                i8 = i9 + 1;
            }
        }
        return -1;
    }

    private static final int zzT(byte[] bArr, int i7, int i8, zzhli zzhliVar, Class cls, zzhgp zzhgpVar) {
        zzhli zzhliVar2 = zzhli.zza;
        switch (zzhliVar.ordinal()) {
            case 0:
                int i9 = i7 + 8;
                zzhgpVar.zzc = Double.valueOf(Double.longBitsToDouble(zzhgq.zze(bArr, i7)));
                return i9;
            case 1:
                int i10 = i7 + 4;
                zzhgpVar.zzc = Float.valueOf(Float.intBitsToFloat(zzhgq.zzd(bArr, i7)));
                return i10;
            case 2:
            case 3:
                int iZzc = zzhgq.zzc(bArr, i7, zzhgpVar);
                zzhgpVar.zzc = Long.valueOf(zzhgpVar.zzb);
                return iZzc;
            case 4:
            case 12:
            case 13:
                int iZza = zzhgq.zza(bArr, i7, zzhgpVar);
                zzhgpVar.zzc = Integer.valueOf(zzhgpVar.zza);
                return iZza;
            case 5:
            case 15:
                int i11 = i7 + 8;
                zzhgpVar.zzc = Long.valueOf(zzhgq.zze(bArr, i7));
                return i11;
            case 6:
            case 14:
                int i12 = i7 + 4;
                zzhgpVar.zzc = Integer.valueOf(zzhgq.zzd(bArr, i7));
                return i12;
            case 7:
                int iZzc2 = zzhgq.zzc(bArr, i7, zzhgpVar);
                zzhgpVar.zzc = Boolean.valueOf(zzhgpVar.zzb != 0);
                return iZzc2;
            case 8:
                return zzhgq.zzf(bArr, i7, zzhgpVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zzhgq.zzh(zzhkc.zza().zzb(cls), bArr, i7, i8, zzhgpVar);
            case 11:
                return zzhgq.zzg(bArr, i7, zzhgpVar);
            case 16:
                int iZza2 = zzhgq.zza(bArr, i7, zzhgpVar);
                zzhgpVar.zzc = Integer.valueOf(zzhhg.zzK(zzhgpVar.zza));
                return iZza2;
            case 17:
                int iZzc3 = zzhgq.zzc(bArr, i7, zzhgpVar);
                zzhgpVar.zzc = Long.valueOf(zzhhg.zzL(zzhgpVar.zzb));
                return iZzc3;
        }
    }

    private static final void zzU(int i7, Object obj, zzhlk zzhlkVar) {
        if (obj instanceof String) {
            zzhlkVar.zzm(i7, (String) obj);
        } else {
            zzhlkVar.zzn(i7, (zzhhb) obj);
        }
    }

    static zzhkw zzh(Object obj) {
        zzhih zzhihVar = (zzhih) obj;
        zzhkw zzhkwVar = zzhihVar.zzt;
        if (zzhkwVar != zzhkw.zza()) {
            return zzhkwVar;
        }
        zzhkw zzhkwVarZzb = zzhkw.zzb();
        zzhihVar.zzt = zzhkwVarZzb;
        return zzhkwVarZzb;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0274  */
    /* JADX WARN: Code duplicated, block: B:131:0x028c  */
    /* JADX WARN: Code duplicated, block: B:132:0x028f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0350  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:190:0x03b0  */
    static zzhjv zzm(Class cls, zzhjp zzhjpVar, zzhjy zzhjyVar, zzhje zzhjeVar, zzhkv zzhkvVar, zzhhs zzhhsVar, zzhjn zzhjnVar) {
        int i7;
        int iCharAt;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        char cCharAt;
        int i15;
        char cCharAt2;
        int i16;
        char cCharAt3;
        int i17;
        char cCharAt4;
        int i18;
        char cCharAt5;
        int i19;
        char cCharAt6;
        int i20;
        char cCharAt7;
        int i21;
        char cCharAt8;
        int i22;
        int i23;
        int i24;
        int iObjectFieldOffset;
        char c7;
        int iObjectFieldOffset2;
        int i25;
        int i26;
        int i27;
        Field fieldZzn;
        char cCharAt9;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        Object obj;
        Field fieldZzn2;
        int i33;
        Object obj2;
        Field fieldZzn3;
        int i34;
        char cCharAt10;
        int i35;
        char cCharAt11;
        int i36;
        char cCharAt12;
        int i37;
        char cCharAt13;
        if (!(zzhjpVar instanceof zzhke)) {
            throw null;
        }
        zzhke zzhkeVar = (zzhke) zzhjpVar;
        String strZzd = zzhkeVar.zzd();
        int length = strZzd.length();
        char c8 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i38 = 1;
            while (true) {
                i7 = i38 + 1;
                if (strZzd.charAt(i38) < 55296) {
                    break;
                }
                i38 = i7;
            }
        } else {
            i7 = 1;
        }
        int i39 = i7 + 1;
        int iCharAt2 = strZzd.charAt(i7);
        if (iCharAt2 >= 55296) {
            int i40 = iCharAt2 & 8191;
            int i41 = 13;
            while (true) {
                i37 = i39 + 1;
                cCharAt13 = strZzd.charAt(i39);
                if (cCharAt13 < 55296) {
                    break;
                }
                i40 |= (cCharAt13 & 8191) << i41;
                i41 += 13;
                i39 = i37;
            }
            iCharAt2 = i40 | (cCharAt13 << i41);
            i39 = i37;
        }
        if (iCharAt2 == 0) {
            i9 = 0;
            i12 = 0;
            iCharAt = 0;
            i8 = 0;
            i10 = 0;
            i11 = 0;
            iArr = zza;
            i13 = 0;
        } else {
            int i42 = i39 + 1;
            int iCharAt3 = strZzd.charAt(i39);
            if (iCharAt3 >= 55296) {
                int i43 = iCharAt3 & 8191;
                int i44 = 13;
                while (true) {
                    i21 = i42 + 1;
                    cCharAt8 = strZzd.charAt(i42);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt8 & 8191) << i44;
                    i44 += 13;
                    i42 = i21;
                }
                iCharAt3 = i43 | (cCharAt8 << i44);
                i42 = i21;
            }
            int i45 = i42 + 1;
            int iCharAt4 = strZzd.charAt(i42);
            if (iCharAt4 >= 55296) {
                int i46 = iCharAt4 & 8191;
                int i47 = 13;
                while (true) {
                    i20 = i45 + 1;
                    cCharAt7 = strZzd.charAt(i45);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt7 & 8191) << i47;
                    i47 += 13;
                    i45 = i20;
                }
                iCharAt4 = i46 | (cCharAt7 << i47);
                i45 = i20;
            }
            int i48 = i45 + 1;
            int iCharAt5 = strZzd.charAt(i45);
            if (iCharAt5 >= 55296) {
                int i49 = iCharAt5 & 8191;
                int i50 = 13;
                while (true) {
                    i19 = i48 + 1;
                    cCharAt6 = strZzd.charAt(i48);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt6 & 8191) << i50;
                    i50 += 13;
                    i48 = i19;
                }
                iCharAt5 = i49 | (cCharAt6 << i50);
                i48 = i19;
            }
            int i51 = i48 + 1;
            int iCharAt6 = strZzd.charAt(i48);
            if (iCharAt6 >= 55296) {
                int i52 = iCharAt6 & 8191;
                int i53 = 13;
                while (true) {
                    i18 = i51 + 1;
                    cCharAt5 = strZzd.charAt(i51);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt5 & 8191) << i53;
                    i53 += 13;
                    i51 = i18;
                }
                iCharAt6 = i52 | (cCharAt5 << i53);
                i51 = i18;
            }
            int i54 = i51 + 1;
            iCharAt = strZzd.charAt(i51);
            if (iCharAt >= 55296) {
                int i55 = iCharAt & 8191;
                int i56 = 13;
                while (true) {
                    i17 = i54 + 1;
                    cCharAt4 = strZzd.charAt(i54);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt4 & 8191) << i56;
                    i56 += 13;
                    i54 = i17;
                }
                iCharAt = i55 | (cCharAt4 << i56);
                i54 = i17;
            }
            int i57 = i54 + 1;
            int iCharAt7 = strZzd.charAt(i54);
            if (iCharAt7 >= 55296) {
                int i58 = iCharAt7 & 8191;
                int i59 = 13;
                while (true) {
                    i16 = i57 + 1;
                    cCharAt3 = strZzd.charAt(i57);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt3 & 8191) << i59;
                    i59 += 13;
                    i57 = i16;
                }
                iCharAt7 = i58 | (cCharAt3 << i59);
                i57 = i16;
            }
            int i60 = i57 + 1;
            int iCharAt8 = strZzd.charAt(i57);
            if (iCharAt8 >= 55296) {
                int i61 = iCharAt8 & 8191;
                int i62 = 13;
                while (true) {
                    i15 = i60 + 1;
                    cCharAt2 = strZzd.charAt(i60);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt2 & 8191) << i62;
                    i62 += 13;
                    i60 = i15;
                }
                iCharAt8 = i61 | (cCharAt2 << i62);
                i60 = i15;
            }
            int i63 = i60 + 1;
            int iCharAt9 = strZzd.charAt(i60);
            if (iCharAt9 >= 55296) {
                int i64 = iCharAt9 & 8191;
                int i65 = 13;
                while (true) {
                    i14 = i63 + 1;
                    cCharAt = strZzd.charAt(i63);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i64 |= (cCharAt & 8191) << i65;
                    i65 += 13;
                    i63 = i14;
                }
                iCharAt9 = i64 | (cCharAt << i65);
                i63 = i14;
            }
            int i66 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i67 = iCharAt7;
            i8 = iCharAt5;
            i9 = i67;
            i10 = iCharAt6;
            i11 = iCharAt9;
            i12 = i66;
            iArr = iArr2;
            i13 = iCharAt3;
            i39 = i63;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzhkeVar.zze();
        Class<?> cls2 = zzhkeVar.zzb().getClass();
        int i68 = i11 + i9;
        int i69 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i69];
        int i70 = i11;
        int i71 = i68;
        int i72 = 0;
        int i73 = 0;
        while (i39 < length) {
            int i74 = i39 + 1;
            int iCharAt10 = strZzd.charAt(i39);
            if (iCharAt10 >= c8) {
                int i75 = iCharAt10 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i36 = i76 + 1;
                    cCharAt12 = strZzd.charAt(i76);
                    if (cCharAt12 < c8) {
                        break;
                    }
                    i75 |= (cCharAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i36;
                }
                iCharAt10 = i75 | (cCharAt12 << i77);
                i22 = i36;
            } else {
                i22 = i74;
            }
            int i78 = i22 + 1;
            int iCharAt11 = strZzd.charAt(i22);
            if (iCharAt11 >= c8) {
                int i79 = iCharAt11 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i35 = i80 + 1;
                    cCharAt11 = strZzd.charAt(i80);
                    if (cCharAt11 < c8) {
                        break;
                    }
                    i79 |= (cCharAt11 & 8191) << i81;
                    i81 += 13;
                    i80 = i35;
                }
                iCharAt11 = i79 | (cCharAt11 << i81);
                i23 = i35;
            } else {
                i23 = i78;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i72] = i73;
                i72++;
            }
            int i82 = iCharAt11 & 255;
            zzhke zzhkeVar2 = zzhkeVar;
            int i83 = iCharAt11 & 2048;
            if (i82 >= 51) {
                int i84 = i23 + 1;
                int iCharAt12 = strZzd.charAt(i23);
                char c9 = 55296;
                if (iCharAt12 >= 55296) {
                    int i85 = iCharAt12 & 8191;
                    int i86 = i84;
                    int i87 = 13;
                    while (true) {
                        i34 = i86 + 1;
                        cCharAt10 = strZzd.charAt(i86);
                        if (cCharAt10 < c9) {
                            break;
                        }
                        i85 |= (cCharAt10 & 8191) << i87;
                        i87 += 13;
                        i86 = i34;
                        c9 = 55296;
                    }
                    iCharAt12 = i85 | (cCharAt10 << i87);
                    i29 = i34;
                } else {
                    i29 = i84;
                }
                int i88 = i29;
                int i89 = i82 - 51;
                if (i89 == 9 || i89 == 17) {
                    i30 = i12 + 1;
                    int i90 = i73 / 3;
                    objArr[i90 + i90 + 1] = objArrZze[i12];
                } else {
                    if (i89 != 12) {
                        i31 = i83;
                    } else if (zzhkeVar2.zzc() == 1 || i83 != 0) {
                        i30 = i12 + 1;
                        int i91 = i73 / 3;
                        objArr[i91 + i91 + 1] = objArrZze[i12];
                    } else {
                        i31 = 0;
                    }
                    i32 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i32];
                    int i92 = i31;
                    if (obj instanceof Field) {
                        fieldZzn2 = (Field) obj;
                    } else {
                        fieldZzn2 = zzn(cls2, (String) obj);
                        objArrZze[i32] = fieldZzn2;
                    }
                    int i93 = i13;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn2);
                    i33 = i32 + 1;
                    obj2 = objArrZze[i33];
                    i24 = i93;
                    if (obj2 instanceof Field) {
                        fieldZzn3 = (Field) obj2;
                    } else {
                        fieldZzn3 = zzn(cls2, (String) obj2);
                        objArrZze[i33] = fieldZzn3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzn3);
                    strZzd = strZzd;
                    i26 = i92;
                    i23 = i88;
                    i25 = 0;
                    c7 = 55296;
                }
                i12 = i30;
                i31 = i83;
                i32 = iCharAt12 + iCharAt12;
                obj = objArrZze[i32];
                int i94 = i31;
                if (obj instanceof Field) {
                    fieldZzn2 = (Field) obj;
                } else {
                    fieldZzn2 = zzn(cls2, (String) obj);
                    objArrZze[i32] = fieldZzn2;
                }
                int i95 = i13;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn2);
                i33 = i32 + 1;
                obj2 = objArrZze[i33];
                i24 = i95;
                if (obj2 instanceof Field) {
                    fieldZzn3 = (Field) obj2;
                } else {
                    fieldZzn3 = zzn(cls2, (String) obj2);
                    objArrZze[i33] = fieldZzn3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzn3);
                strZzd = strZzd;
                i26 = i94;
                i23 = i88;
                i25 = 0;
                c7 = 55296;
            } else {
                i24 = i13;
                int i96 = i12 + 1;
                Field fieldZzn4 = zzn(cls2, (String) objArrZze[i12]);
                if (i82 == 9 || i82 == 17) {
                    int i97 = i73 / 3;
                    objArr[i97 + i97 + 1] = fieldZzn4.getType();
                } else {
                    if (i82 != 27) {
                        if (i82 == 49) {
                            i12 += 2;
                            i28 = 1;
                        } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                            if (zzhkeVar2.zzc() == 1 || i83 != 0) {
                                i12 += 2;
                                int i98 = i73 / 3;
                                objArr[i98 + i98 + 1] = objArrZze[i96];
                            } else {
                                i12 = i96;
                                i83 = 0;
                            }
                        } else if (i82 == 50) {
                            int i99 = i12 + 2;
                            int i100 = i70 + 1;
                            iArr[i70] = i73;
                            int i101 = i73 / 3;
                            int i102 = i101 + i101;
                            objArr[i102] = objArrZze[i96];
                            if (i83 != 0) {
                                objArr[i102 + 1] = objArrZze[i99];
                                i12 += 3;
                                i70 = i100;
                            } else {
                                i12 = i99;
                                i70 = i100;
                                i83 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn4);
                        if ((iCharAt11 & 4096) != 0 || i82 > 17) {
                            c7 = 55296;
                            iObjectFieldOffset2 = 1048575;
                            i25 = 0;
                        } else {
                            int i103 = i23 + 1;
                            int iCharAt13 = strZzd.charAt(i23);
                            if (iCharAt13 >= 55296) {
                                int i104 = iCharAt13 & 8191;
                                int i105 = 13;
                                while (true) {
                                    i27 = i103 + 1;
                                    cCharAt9 = strZzd.charAt(i103);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i104 |= (cCharAt9 & 8191) << i105;
                                    i105 += 13;
                                    i103 = i27;
                                }
                                iCharAt13 = i104 | (cCharAt9 << i105);
                            } else {
                                i27 = i103;
                            }
                            int i106 = i24 + i24 + (iCharAt13 / 32);
                            Object obj3 = objArrZze[i106];
                            if (obj3 instanceof Field) {
                                fieldZzn = (Field) obj3;
                            } else {
                                fieldZzn = zzn(cls2, (String) obj3);
                                objArrZze[i106] = fieldZzn;
                            }
                            int i107 = iCharAt13;
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzn);
                            i25 = i107 % 32;
                            i23 = i27;
                            c7 = 55296;
                            iObjectFieldOffset2 = iObjectFieldOffset3;
                        }
                        if (i82 >= 18 && i82 <= 49) {
                            iArr[i71] = iObjectFieldOffset;
                            i71++;
                        }
                        i26 = i83;
                    } else {
                        i28 = 1;
                        i12 += 2;
                    }
                    int i108 = i73 / 3;
                    objArr[i108 + i108 + i28] = objArrZze[i96];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn4);
                    if ((iCharAt11 & 4096) != 0) {
                        c7 = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i25 = 0;
                    } else {
                        c7 = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i25 = 0;
                    }
                    if (i82 >= 18) {
                        iArr[i71] = iObjectFieldOffset;
                        i71++;
                    }
                    i26 = i83;
                }
                i12 = i96;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn4);
                if ((iCharAt11 & 4096) != 0) {
                    c7 = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i25 = 0;
                } else {
                    c7 = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i25 = 0;
                }
                if (i82 >= 18) {
                    iArr[i71] = iObjectFieldOffset;
                    i71++;
                }
                i26 = i83;
            }
            int i109 = i73 + 1;
            iArr3[i73] = iCharAt10;
            int i110 = i73 + 2;
            iArr3[i109] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i26 != 0 ? Integer.MIN_VALUE : 0) | (i82 << 20) | iObjectFieldOffset;
            i73 += 3;
            iArr3[i110] = (i25 << 20) | iObjectFieldOffset2;
            i39 = i23;
            strZzd = strZzd;
            c8 = c7;
            zzhkeVar = zzhkeVar2;
            length = length;
            i13 = i24;
        }
        return new zzhjv(iArr3, objArr, i8, i10, zzhkeVar.zzb(), false, iArr, i11, i68, zzhjyVar, zzhjeVar, zzhkvVar, zzhhsVar, zzhjnVar);
    }

    private static Field zzn(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e7) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(string);
            throw new RuntimeException(sb.toString(), e7);
        }
    }

    private final void zzo(Object obj, Object obj2, int i7) {
        if (zzN(obj2, i7)) {
            int iZzA = zzA(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j7 = iZzA;
            Object object = unsafe.getObject(obj2, j7);
            if (object == null) {
                int i8 = this.zzc[i7];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i8);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            zzhkk zzhkkVarZzq = zzq(i7);
            if (!zzN(obj, i7)) {
                if (zzE(object)) {
                    Object objZza = zzhkkVarZzq.zza();
                    zzhkkVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j7, objZza);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                zzO(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!zzE(object2)) {
                Object objZza2 = zzhkkVarZzq.zza();
                zzhkkVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j7, objZza2);
                object2 = objZza2;
            }
            zzhkkVarZzq.zzd(object2, object);
        }
    }

    private final void zzp(Object obj, Object obj2, int i7) {
        int[] iArr = this.zzc;
        int i8 = iArr[i7];
        if (zzP(obj2, i8, i7)) {
            int iZzA = zzA(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j7 = iZzA;
            Object object = unsafe.getObject(obj2, j7);
            if (object == null) {
                int i9 = iArr[i7];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i9);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            zzhkk zzhkkVarZzq = zzq(i7);
            if (!zzP(obj, i8, i7)) {
                if (zzE(object)) {
                    Object objZza = zzhkkVarZzq.zza();
                    zzhkkVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j7, objZza);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                zzQ(obj, i8, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!zzE(object2)) {
                Object objZza2 = zzhkkVarZzq.zza();
                zzhkkVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j7, objZza2);
                object2 = objZza2;
            }
            zzhkkVarZzq.zzd(object2, object);
        }
    }

    private final zzhkk zzq(int i7) {
        Object[] objArr = this.zzd;
        int i8 = i7 / 3;
        int i9 = i8 + i8;
        zzhkk zzhkkVar = (zzhkk) objArr[i9];
        if (zzhkkVar != null) {
            return zzhkkVar;
        }
        zzhkk zzhkkVarZzb = zzhkc.zza().zzb((Class) objArr[i9 + 1]);
        objArr[i9] = zzhkkVarZzb;
        return zzhkkVarZzb;
    }

    private final Object zzr(int i7) {
        int i8 = i7 / 3;
        return this.zzd[i8 + i8];
    }

    private final zzhin zzs(int i7) {
        int i8 = i7 / 3;
        return (zzhin) this.zzd[i8 + i8 + 1];
    }

    private final Object zzt(Object obj, int i7) {
        zzhkk zzhkkVarZzq = zzq(i7);
        int iZzA = zzA(i7) & 1048575;
        if (!zzN(obj, i7)) {
            return zzhkkVarZzq.zza();
        }
        Object object = zzb.getObject(obj, iZzA);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zzhkkVarZzq.zza();
        if (object != null) {
            zzhkkVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzu(Object obj, int i7, Object obj2) {
        zzb.putObject(obj, zzA(i7) & 1048575, obj2);
        zzO(obj, i7);
    }

    private final Object zzv(Object obj, int i7, int i8) {
        zzhkk zzhkkVarZzq = zzq(i8);
        if (!zzP(obj, i7, i8)) {
            return zzhkkVarZzq.zza();
        }
        Object object = zzb.getObject(obj, zzA(i8) & 1048575);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zzhkkVarZzq.zza();
        if (object != null) {
            zzhkkVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzw(Object obj, int i7, int i8, Object obj2) {
        zzb.putObject(obj, zzA(i8) & 1048575, obj2);
        zzQ(obj, i7, i8);
    }

    private final Object zzx(Object obj, int i7, Object obj2, zzhkv zzhkvVar, Object obj3) {
        zzhin zzhinVarZzs;
        int i8 = this.zzc[i7];
        Object objZzn = zzhlc.zzn(obj, zzA(i7) & 1048575);
        if (objZzn == null || (zzhinVarZzs = zzs(i7)) == null) {
            return obj2;
        }
        zzhjk zzhjkVarZze = ((zzhjl) zzr(i7)).zze();
        Iterator it = ((zzhjm) objZzn).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzhinVarZzs.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zzhkvVar.zzh(obj3);
                }
                int iZzc = zzhjl.zzc(zzhjkVarZze, entry.getKey(), entry.getValue());
                zzhhb zzhhbVar = zzhhb.zzb;
                byte[] bArr = new byte[iZzc];
                int i9 = zzhhm.zzf;
                zzhhj zzhhjVar = new zzhhj(bArr, 0, iZzc);
                try {
                    zzhjl.zzb(zzhhjVar, zzhjkVarZze, entry.getKey(), entry.getValue());
                    zzhkvVar.zzd(obj2, i8, zzhgx.zza(zzhhjVar, bArr));
                    it.remove();
                } catch (IOException e7) {
                    throw new RuntimeException(e7);
                }
            }
        }
        return obj2;
    }

    private static boolean zzy(Object obj, int i7, zzhkk zzhkkVar) {
        return zzhkkVar.zzl(zzhlc.zzn(obj, i7 & 1048575));
    }

    private final void zzz(Object obj, int i7, zzhkf zzhkfVar) {
        long j7 = i7 & 1048575;
        if (zzD(i7)) {
            zzhlc.zzo(obj, j7, zzhkfVar.zzn());
        } else if (this.zzi) {
            zzhlc.zzo(obj, j7, zzhkfVar.zzm());
        } else {
            zzhlc.zzo(obj, j7, zzhkfVar.zzq());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
    public final Object zza() {
        return ((zzhih) this.zzg).zzbg();
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
    public final boolean zzb(Object obj, Object obj2) {
        boolean zZzG;
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int iZzA = zzA(i7);
            long j7 = iZzA & 1048575;
            switch (zzC(iZzA)) {
                case 0:
                    if (!zzL(obj, obj2, i7) || Double.doubleToLongBits(zzhlc.zzl(obj, j7)) != Double.doubleToLongBits(zzhlc.zzl(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i7) || Float.floatToIntBits(zzhlc.zzj(obj, j7)) != Float.floatToIntBits(zzhlc.zzj(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i7) || zzhlc.zzf(obj, j7) != zzhlc.zzf(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i7) || zzhlc.zzf(obj, j7) != zzhlc.zzf(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i7) || zzhlc.zzd(obj, j7) != zzhlc.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i7) || zzhlc.zzf(obj, j7) != zzhlc.zzf(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i7) || zzhlc.zzd(obj, j7) != zzhlc.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i7) || zzhlc.zzh(obj, j7) != zzhlc.zzh(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i7) || !zzhkm.zzG(zzhlc.zzn(obj, j7), zzhlc.zzn(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i7) || !zzhkm.zzG(zzhlc.zzn(obj, j7), zzhlc.zzn(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i7) || !zzhkm.zzG(zzhlc.zzn(obj, j7), zzhlc.zzn(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i7) || zzhlc.zzd(obj, j7) != zzhlc.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i7) || zzhlc.zzd(obj, j7) != zzhlc.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i7) || zzhlc.zzd(obj, j7) != zzhlc.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i7) || zzhlc.zzf(obj, j7) != zzhlc.zzf(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i7) || zzhlc.zzd(obj, j7) != zzhlc.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i7) || zzhlc.zzf(obj, j7) != zzhlc.zzf(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i7) || !zzhkm.zzG(zzhlc.zzn(obj, j7), zzhlc.zzn(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case zzbbn.zzt.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzG = zzhkm.zzG(zzhlc.zzn(obj, j7), zzhlc.zzn(obj2, j7));
                    break;
                case 50:
                    zZzG = zzhkm.zzG(zzhlc.zzn(obj, j7), zzhlc.zzn(obj2, j7));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzB = zzB(i7) & 1048575;
                    if (zzhlc.zzd(obj, jZzB) != zzhlc.zzd(obj2, jZzB) || !zzhkm.zzG(zzhlc.zzn(obj, j7), zzhlc.zzn(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzG) {
                return false;
            }
        }
        if (!((zzhih) obj).zzt.equals(((zzhih) obj2).zzt)) {
            return false;
        }
        if (this.zzh) {
            return ((zzhid) obj).zza.equals(((zzhid) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
    public final int zzc(Object obj) {
        int i7;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i8;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i9 >= iArr.length) {
                int iHashCode = (i10 * 53) + ((zzhih) obj).zzt.hashCode();
                return this.zzh ? (iHashCode * 53) + ((zzhid) obj).zza.zza.hashCode() : iHashCode;
            }
            int iZzA = zzA(i9);
            int i11 = 1048575 & iZzA;
            int iZzC = zzC(iZzA);
            int i12 = iArr[i9];
            long j7 = i11;
            int iHashCode2 = 37;
            switch (iZzC) {
                case 0:
                    i7 = i10 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzhlc.zzl(obj, j7));
                    byte[] bArr = zzhiu.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 1:
                    i7 = i10 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzhlc.zzj(obj, j7));
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 2:
                    i7 = i10 * 53;
                    jDoubleToLongBits = zzhlc.zzf(obj, j7);
                    byte[] bArr2 = zzhiu.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 3:
                    i7 = i10 * 53;
                    jDoubleToLongBits = zzhlc.zzf(obj, j7);
                    byte[] bArr3 = zzhiu.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 4:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzhlc.zzd(obj, j7);
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 5:
                    i7 = i10 * 53;
                    jDoubleToLongBits = zzhlc.zzf(obj, j7);
                    byte[] bArr4 = zzhiu.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 6:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzhlc.zzd(obj, j7);
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 7:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzhiu.zzb(zzhlc.zzh(obj, j7));
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 8:
                    i7 = i10 * 53;
                    iFloatToIntBits = ((String) zzhlc.zzn(obj, j7)).hashCode();
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 9:
                    i8 = i10 * 53;
                    Object objZzn = zzhlc.zzn(obj, j7);
                    if (objZzn != null) {
                        iHashCode2 = objZzn.hashCode();
                    }
                    i10 = i8 + iHashCode2;
                    break;
                case 10:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzhlc.zzn(obj, j7).hashCode();
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 11:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzhlc.zzd(obj, j7);
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 12:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzhlc.zzd(obj, j7);
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 13:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzhlc.zzd(obj, j7);
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 14:
                    i7 = i10 * 53;
                    jDoubleToLongBits = zzhlc.zzf(obj, j7);
                    byte[] bArr5 = zzhiu.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 15:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzhlc.zzd(obj, j7);
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 16:
                    i7 = i10 * 53;
                    jDoubleToLongBits = zzhlc.zzf(obj, j7);
                    byte[] bArr6 = zzhiu.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 17:
                    i8 = i10 * 53;
                    Object objZzn2 = zzhlc.zzn(obj, j7);
                    if (objZzn2 != null) {
                        iHashCode2 = objZzn2.hashCode();
                    }
                    i10 = i8 + iHashCode2;
                    break;
                case 18:
                case 19:
                case 20:
                case zzbbn.zzt.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzhlc.zzn(obj, j7).hashCode();
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 50:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzhlc.zzn(obj, j7).hashCode();
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 51:
                    if (zzP(obj, i12, i9)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzG(obj, j7));
                        byte[] bArr7 = zzhiu.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzP(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzH(obj, j7));
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzP(obj, i12, i9)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = zzJ(obj, j7);
                        byte[] bArr8 = zzhiu.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzP(obj, i12, i9)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = zzJ(obj, j7);
                        byte[] bArr9 = zzhiu.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzP(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzI(obj, j7);
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzP(obj, i12, i9)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = zzJ(obj, j7);
                        byte[] bArr10 = zzhiu.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (zzP(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzI(obj, j7);
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzP(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzhiu.zzb(zzK(obj, j7));
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzP(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = ((String) zzhlc.zzn(obj, j7)).hashCode();
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzP(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzhlc.zzn(obj, j7).hashCode();
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzP(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzhlc.zzn(obj, j7).hashCode();
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzP(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzI(obj, j7);
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzP(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzI(obj, j7);
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzP(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzI(obj, j7);
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzP(obj, i12, i9)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = zzJ(obj, j7);
                        byte[] bArr11 = zzhiu.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (zzP(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzI(obj, j7);
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzP(obj, i12, i9)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = zzJ(obj, j7);
                        byte[] bArr12 = zzhiu.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (zzP(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzhlc.zzn(obj, j7).hashCode();
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
            }
            i9 += 3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
    public final void zzd(Object obj, Object obj2) {
        zzF(obj);
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i7 >= iArr.length) {
                zzhkm.zzI(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzhkm.zzH(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int iZzA = zzA(i7);
            int i8 = 1048575 & iZzA;
            int iZzC = zzC(iZzA);
            int i9 = iArr[i7];
            long j7 = i8;
            switch (iZzC) {
                case 0:
                    if (zzN(obj2, i7)) {
                        zzhlc.zzm(obj, j7, zzhlc.zzl(obj2, j7));
                        zzO(obj, i7);
                    }
                    break;
                case 1:
                    if (zzN(obj2, i7)) {
                        zzhlc.zzk(obj, j7, zzhlc.zzj(obj2, j7));
                        zzO(obj, i7);
                    }
                    break;
                case 2:
                    if (zzN(obj2, i7)) {
                        zzhlc.zzg(obj, j7, zzhlc.zzf(obj2, j7));
                        zzO(obj, i7);
                    }
                    break;
                case 3:
                    if (zzN(obj2, i7)) {
                        zzhlc.zzg(obj, j7, zzhlc.zzf(obj2, j7));
                        zzO(obj, i7);
                    }
                    break;
                case 4:
                    if (zzN(obj2, i7)) {
                        zzhlc.zze(obj, j7, zzhlc.zzd(obj2, j7));
                        zzO(obj, i7);
                    }
                    break;
                case 5:
                    if (zzN(obj2, i7)) {
                        zzhlc.zzg(obj, j7, zzhlc.zzf(obj2, j7));
                        zzO(obj, i7);
                    }
                    break;
                case 6:
                    if (zzN(obj2, i7)) {
                        zzhlc.zze(obj, j7, zzhlc.zzd(obj2, j7));
                        zzO(obj, i7);
                    }
                    break;
                case 7:
                    if (zzN(obj2, i7)) {
                        zzhlc.zzi(obj, j7, zzhlc.zzh(obj2, j7));
                        zzO(obj, i7);
                    }
                    break;
                case 8:
                    if (zzN(obj2, i7)) {
                        zzhlc.zzo(obj, j7, zzhlc.zzn(obj2, j7));
                        zzO(obj, i7);
                    }
                    break;
                case 9:
                    zzo(obj, obj2, i7);
                    break;
                case 10:
                    if (zzN(obj2, i7)) {
                        zzhlc.zzo(obj, j7, zzhlc.zzn(obj2, j7));
                        zzO(obj, i7);
                    }
                    break;
                case 11:
                    if (zzN(obj2, i7)) {
                        zzhlc.zze(obj, j7, zzhlc.zzd(obj2, j7));
                        zzO(obj, i7);
                    }
                    break;
                case 12:
                    if (zzN(obj2, i7)) {
                        zzhlc.zze(obj, j7, zzhlc.zzd(obj2, j7));
                        zzO(obj, i7);
                    }
                    break;
                case 13:
                    if (zzN(obj2, i7)) {
                        zzhlc.zze(obj, j7, zzhlc.zzd(obj2, j7));
                        zzO(obj, i7);
                    }
                    break;
                case 14:
                    if (zzN(obj2, i7)) {
                        zzhlc.zzg(obj, j7, zzhlc.zzf(obj2, j7));
                        zzO(obj, i7);
                    }
                    break;
                case 15:
                    if (zzN(obj2, i7)) {
                        zzhlc.zze(obj, j7, zzhlc.zzd(obj2, j7));
                        zzO(obj, i7);
                    }
                    break;
                case 16:
                    if (zzN(obj2, i7)) {
                        zzhlc.zzg(obj, j7, zzhlc.zzf(obj2, j7));
                        zzO(obj, i7);
                    }
                    break;
                case 17:
                    zzo(obj, obj2, i7);
                    break;
                case 18:
                case 19:
                case 20:
                case zzbbn.zzt.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzhit zzhitVarZzh = (zzhit) zzhlc.zzn(obj, j7);
                    zzhit zzhitVar = (zzhit) zzhlc.zzn(obj2, j7);
                    int size = zzhitVarZzh.size();
                    int size2 = zzhitVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzhitVarZzh.zza()) {
                            zzhitVarZzh = zzhitVarZzh.zzh(size2 + size);
                        }
                        zzhitVarZzh.addAll(zzhitVar);
                    }
                    if (size > 0) {
                        zzhitVar = zzhitVarZzh;
                    }
                    zzhlc.zzo(obj, j7, zzhitVar);
                    break;
                case 50:
                    int i10 = zzhkm.zza;
                    zzhlc.zzo(obj, j7, zzhjn.zzb(zzhlc.zzn(obj, j7), zzhlc.zzn(obj2, j7)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzP(obj2, i9, i7)) {
                        zzhlc.zzo(obj, j7, zzhlc.zzn(obj2, j7));
                        zzQ(obj, i9, i7);
                    }
                    break;
                case 60:
                    zzp(obj, obj2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzP(obj2, i9, i7)) {
                        zzhlc.zzo(obj, j7, zzhlc.zzn(obj2, j7));
                        zzQ(obj, i9, i7);
                    }
                    break;
                case 68:
                    zzp(obj, obj2, i7);
                    break;
            }
            i7 += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:145:0x03b6 A[PHI: r17
      0x03b6: PHI (r17v46 int) = (r17v29 int), (r17v30 int), (r17v33 int), (r17v39 int), (r17v40 int), (r17v43 int), (r17v47 int) binds: [B:213:0x057a, B:209:0x055c, B:203:0x0523, B:160:0x0427, B:156:0x040b, B:150:0x03d5, B:144:0x03b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:184:0x04bf A[PHI: r17
      0x04bf: PHI (r17v35 int) = (r17v28 int), (r17v36 int) binds: [B:217:0x0598, B:183:0x04bd] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzhkk
    public final int zze(Object obj) {
        int i7;
        int i8;
        int iZzA;
        int iZzA2;
        int iZzB;
        int iZzA3;
        int iZzA4;
        int iZzA5;
        int iZzc;
        int iZzA6;
        int iZzD;
        int iZzs;
        int size;
        int iZzt;
        int iZzA7;
        int iZzA8;
        int iZzaT;
        int iZzA9;
        int iZzA10;
        int iZzB2;
        int iZzA11;
        int iZzA12;
        int iZzE;
        int iZzd;
        int iZzA13;
        int iZzA14;
        int iZzA15;
        int iZzB3;
        int iZzA16;
        int iZzA17;
        int iZzc2;
        int iZzA18;
        zzhjv<T> zzhjvVar = this;
        int i9 = 1;
        Unsafe unsafe = zzb;
        int i10 = 0;
        int i11 = 0;
        int iZzA19 = 0;
        int i12 = 1048575;
        while (true) {
            int[] iArr = zzhjvVar.zzc;
            if (i10 >= iArr.length) {
                int iZzi = iZzA19 + ((zzhih) obj).zzt.zzi();
                if (!zzhjvVar.zzh) {
                    return iZzi;
                }
                zzhkr zzhkrVar = ((zzhid) obj).zza.zza;
                int iZzc3 = zzhkrVar.zzc();
                int iZzj = 0;
                for (int i13 = 0; i13 < iZzc3; i13++) {
                    Map.Entry entryZzd = zzhkrVar.zzd(i13);
                    iZzj += zzhhw.zzj((zzhhv) ((zzhko) entryZzd).zza(), entryZzd.getValue());
                }
                for (Map.Entry entry : zzhkrVar.zze()) {
                    iZzj += zzhhw.zzj((zzhhv) entry.getKey(), entry.getValue());
                }
                return iZzi + iZzj;
            }
            int iZzA20 = zzhjvVar.zzA(i10);
            int iZzC = zzC(iZzA20);
            int i14 = iArr[i10];
            int i15 = iArr[i10 + 2];
            int i16 = i15 & 1048575;
            if (iZzC <= 17) {
                if (i16 != i12) {
                    i11 = i16 == 1048575 ? 0 : unsafe.getInt(obj, i16);
                    i12 = i16;
                }
                i7 = i9 << (i15 >>> 20);
            } else {
                i7 = 0;
            }
            int i17 = iZzA20 & 1048575;
            if (iZzC >= zzhhx.zzJ.zza()) {
                zzhhx.zzW.zza();
            }
            long j7 = i17;
            switch (iZzC) {
                case 0:
                    i8 = i9;
                    if (zzhjvVar.zzM(obj, i10, i12, i11, i7)) {
                        iZzA19 += zzhhm.zzA(i14 << 3) + 8;
                    }
                    break;
                case 1:
                    i8 = i9;
                    if (zzhjvVar.zzM(obj, i10, i12, i11, i7)) {
                        iZzA = zzhhm.zzA(i14 << 3);
                        iZzA4 = iZzA + 4;
                        iZzA19 += iZzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 2:
                    i8 = i9;
                    if (zzhjvVar.zzM(obj, i10, i12, i11, i7)) {
                        long j8 = unsafe.getLong(obj, j7);
                        iZzA2 = zzhhm.zzA(i14 << 3);
                        iZzB = zzhhm.zzB(j8);
                        iZzA4 = iZzA2 + iZzB;
                        iZzA19 += iZzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 3:
                    i8 = i9;
                    if (zzhjvVar.zzM(obj, i10, i12, i11, i7)) {
                        long j9 = unsafe.getLong(obj, j7);
                        iZzA2 = zzhhm.zzA(i14 << 3);
                        iZzB = zzhhm.zzB(j9);
                        iZzA4 = iZzA2 + iZzB;
                        iZzA19 += iZzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 4:
                    i8 = i9;
                    if (zzhjvVar.zzM(obj, i10, i12, i11, i7)) {
                        long j10 = unsafe.getInt(obj, j7);
                        iZzA2 = zzhhm.zzA(i14 << 3);
                        iZzB = zzhhm.zzB(j10);
                        iZzA4 = iZzA2 + iZzB;
                        iZzA19 += iZzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 5:
                    i8 = i9;
                    if (zzhjvVar.zzM(obj, i10, i12, i11, i7)) {
                        iZzA3 = zzhhm.zzA(i14 << 3);
                        iZzA4 = iZzA3 + 8;
                        iZzA19 += iZzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 6:
                    i8 = i9;
                    if (zzhjvVar.zzM(obj, i10, i12, i11, i7)) {
                        iZzA = zzhhm.zzA(i14 << 3);
                        iZzA4 = iZzA + 4;
                        iZzA19 += iZzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 7:
                    i8 = i9;
                    if (zzhjvVar.zzM(obj, i10, i12, i11, i7)) {
                        iZzA4 = zzhhm.zzA(i14 << 3) + 1;
                        iZzA19 += iZzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 8:
                    i8 = i9;
                    if (zzhjvVar.zzM(obj, i10, i12, i11, i7)) {
                        int i18 = i14 << 3;
                        Object object = unsafe.getObject(obj, j7);
                        if (object instanceof zzhhb) {
                            iZzA5 = zzhhm.zzA(i18);
                            iZzc = ((zzhhb) object).zzc();
                            iZzA6 = zzhhm.zzA(iZzc);
                            iZzA4 = iZzA5 + iZzA6 + iZzc;
                            iZzA19 += iZzA4;
                        } else {
                            iZzA2 = zzhhm.zzA(i18);
                            iZzB = zzhhm.zzC((String) object);
                            iZzA4 = iZzA2 + iZzB;
                            iZzA19 += iZzA4;
                        }
                    }
                    zzhjvVar = this;
                    break;
                case 9:
                    i8 = i9;
                    if (zzhjvVar.zzM(obj, i10, i12, i11, i7)) {
                        iZzD = zzhkm.zzD(i14, unsafe.getObject(obj, j7), zzhjvVar.zzq(i10));
                        iZzA19 += iZzD;
                    }
                    break;
                case 10:
                    i8 = i9;
                    if (zzhjvVar.zzM(obj, i10, i12, i11, i7)) {
                        zzhhb zzhhbVar = (zzhhb) unsafe.getObject(obj, j7);
                        iZzA5 = zzhhm.zzA(i14 << 3);
                        iZzc = zzhhbVar.zzc();
                        iZzA6 = zzhhm.zzA(iZzc);
                        iZzA4 = iZzA5 + iZzA6 + iZzc;
                        iZzA19 += iZzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 11:
                    i8 = i9;
                    if (zzhjvVar.zzM(obj, i10, i12, i11, i7)) {
                        int i19 = unsafe.getInt(obj, j7);
                        iZzA2 = zzhhm.zzA(i14 << 3);
                        iZzB = zzhhm.zzA(i19);
                        iZzA4 = iZzA2 + iZzB;
                        iZzA19 += iZzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 12:
                    i8 = i9;
                    if (zzhjvVar.zzM(obj, i10, i12, i11, i7)) {
                        long j11 = unsafe.getInt(obj, j7);
                        iZzA2 = zzhhm.zzA(i14 << 3);
                        iZzB = zzhhm.zzB(j11);
                        iZzA4 = iZzA2 + iZzB;
                        iZzA19 += iZzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 13:
                    i8 = i9;
                    if (zzhjvVar.zzM(obj, i10, i12, i11, i7)) {
                        iZzA = zzhhm.zzA(i14 << 3);
                        iZzA4 = iZzA + 4;
                        iZzA19 += iZzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 14:
                    i8 = i9;
                    if (zzhjvVar.zzM(obj, i10, i12, i11, i7)) {
                        iZzA3 = zzhhm.zzA(i14 << 3);
                        iZzA4 = iZzA3 + 8;
                        iZzA19 += iZzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 15:
                    i8 = i9;
                    if (zzhjvVar.zzM(obj, i10, i12, i11, i7)) {
                        int i20 = unsafe.getInt(obj, j7);
                        iZzA2 = zzhhm.zzA(i14 << 3);
                        iZzB = zzhhm.zzA((i20 >> 31) ^ (i20 + i20));
                        iZzA4 = iZzA2 + iZzB;
                        iZzA19 += iZzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 16:
                    i8 = i9;
                    if (zzhjvVar.zzM(obj, i10, i12, i11, i7)) {
                        long j12 = unsafe.getLong(obj, j7);
                        iZzA2 = zzhhm.zzA(i14 << 3);
                        iZzB = zzhhm.zzB((j12 >> 63) ^ (j12 + j12));
                        iZzA4 = iZzA2 + iZzB;
                        iZzA19 += iZzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 17:
                    i8 = i9;
                    if (zzhjvVar.zzM(obj, i10, i12, i11, i7)) {
                        iZzD = zzhkm.zzE(i14, (zzhjs) unsafe.getObject(obj, j7), zzhjvVar.zzq(i10));
                        iZzA19 += iZzD;
                    }
                    break;
                case 18:
                    i8 = i9;
                    iZzD = zzhkm.zzC(i14, (List) unsafe.getObject(obj, j7), false);
                    iZzA19 += iZzD;
                    break;
                case 19:
                    i8 = i9;
                    iZzD = zzhkm.zzA(i14, (List) unsafe.getObject(obj, j7), false);
                    iZzA19 += iZzD;
                    break;
                case 20:
                    i8 = i9;
                    List list = (List) unsafe.getObject(obj, j7);
                    int i21 = zzhkm.zza;
                    if (list.size() == 0) {
                        iZzs = 0;
                    } else {
                        iZzs = zzhkm.zzs(list) + (list.size() * zzhhm.zzA(i14 << 3));
                    }
                    iZzA19 += iZzs;
                    break;
                case zzbbn.zzt.zzm /* 21 */:
                    i8 = i9;
                    List list2 = (List) unsafe.getObject(obj, j7);
                    int i22 = zzhkm.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzD = 0;
                    } else {
                        iZzt = zzhkm.zzt(list2);
                        iZzA7 = zzhhm.zzA(i14 << 3);
                        iZzD = iZzt + (size * iZzA7);
                    }
                    iZzA19 += iZzD;
                    break;
                case 22:
                    i8 = i9;
                    List list3 = (List) unsafe.getObject(obj, j7);
                    int i23 = zzhkm.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzD = 0;
                    } else {
                        iZzt = zzhkm.zzw(list3);
                        iZzA7 = zzhhm.zzA(i14 << 3);
                        iZzD = iZzt + (size * iZzA7);
                    }
                    iZzA19 += iZzD;
                    break;
                case 23:
                    i8 = i9;
                    iZzD = zzhkm.zzC(i14, (List) unsafe.getObject(obj, j7), false);
                    iZzA19 += iZzD;
                    break;
                case 24:
                    i8 = i9;
                    iZzD = zzhkm.zzA(i14, (List) unsafe.getObject(obj, j7), false);
                    iZzA19 += iZzD;
                    break;
                case 25:
                    i8 = i9;
                    List list4 = (List) unsafe.getObject(obj, j7);
                    int i24 = zzhkm.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZzD = 0;
                    } else {
                        iZzD = size2 * (zzhhm.zzA(i14 << 3) + 1);
                    }
                    iZzA19 += iZzD;
                    break;
                case 26:
                    i8 = i9;
                    List list5 = (List) unsafe.getObject(obj, j7);
                    int i25 = zzhkm.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzs = 0;
                    } else {
                        iZzs = zzhhm.zzA(i14 << 3) * size3;
                        if (list5 instanceof zzhjd) {
                            zzhjd zzhjdVar = (zzhjd) list5;
                            for (int i26 = 0; i26 < size3; i26++) {
                                Object objZzc = zzhjdVar.zzc();
                                if (objZzc instanceof zzhhb) {
                                    int iZzc4 = ((zzhhb) objZzc).zzc();
                                    iZzs += zzhhm.zzA(iZzc4) + iZzc4;
                                } else {
                                    iZzs += zzhhm.zzC((String) objZzc);
                                }
                            }
                        } else {
                            for (int i27 = 0; i27 < size3; i27++) {
                                Object obj2 = list5.get(i27);
                                if (obj2 instanceof zzhhb) {
                                    int iZzc5 = ((zzhhb) obj2).zzc();
                                    iZzs += zzhhm.zzA(iZzc5) + iZzc5;
                                } else {
                                    iZzs += zzhhm.zzC((String) obj2);
                                }
                            }
                        }
                    }
                    iZzA19 += iZzs;
                    break;
                case 27:
                    i8 = i9;
                    List list6 = (List) unsafe.getObject(obj, j7);
                    zzhkk zzhkkVarZzq = zzhjvVar.zzq(i10);
                    int i28 = zzhkm.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzA8 = 0;
                    } else {
                        iZzA8 = zzhhm.zzA(i14 << 3) * size4;
                        for (int i29 = 0; i29 < size4; i29++) {
                            Object obj3 = list6.get(i29);
                            if (obj3 instanceof zzhjc) {
                                iZzaT = ((zzhjc) obj3).zzb();
                                iZzA9 = zzhhm.zzA(iZzaT);
                            } else {
                                iZzaT = ((zzhgk) obj3).zzaT(zzhkkVarZzq);
                                iZzA9 = zzhhm.zzA(iZzaT);
                            }
                            iZzA8 += iZzA9 + iZzaT;
                        }
                    }
                    iZzA19 += iZzA8;
                    break;
                case 28:
                    i8 = i9;
                    List list7 = (List) unsafe.getObject(obj, j7);
                    int i30 = zzhkm.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzA10 = 0;
                    } else {
                        iZzA10 = size5 * zzhhm.zzA(i14 << 3);
                        for (int i31 = 0; i31 < list7.size(); i31++) {
                            int iZzc6 = ((zzhhb) list7.get(i31)).zzc();
                            iZzA10 += zzhhm.zzA(iZzc6) + iZzc6;
                        }
                    }
                    iZzA19 += iZzA10;
                    break;
                case 29:
                    i8 = i9;
                    List list8 = (List) unsafe.getObject(obj, j7);
                    int i32 = zzhkm.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZzD = 0;
                    } else {
                        iZzt = zzhkm.zzx(list8);
                        iZzA7 = zzhhm.zzA(i14 << 3);
                        iZzD = iZzt + (size * iZzA7);
                    }
                    iZzA19 += iZzD;
                    break;
                case 30:
                    i8 = i9;
                    List list9 = (List) unsafe.getObject(obj, j7);
                    int i33 = zzhkm.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZzD = 0;
                    } else {
                        iZzt = zzhkm.zzv(list9);
                        iZzA7 = zzhhm.zzA(i14 << 3);
                        iZzD = iZzt + (size * iZzA7);
                    }
                    iZzA19 += iZzD;
                    break;
                case 31:
                    i8 = i9;
                    iZzD = zzhkm.zzA(i14, (List) unsafe.getObject(obj, j7), false);
                    iZzA19 += iZzD;
                    break;
                case 32:
                    i8 = i9;
                    iZzD = zzhkm.zzC(i14, (List) unsafe.getObject(obj, j7), false);
                    iZzA19 += iZzD;
                    break;
                case 33:
                    i8 = i9;
                    List list10 = (List) unsafe.getObject(obj, j7);
                    int i34 = zzhkm.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZzD = 0;
                    } else {
                        iZzt = zzhkm.zzy(list10);
                        iZzA7 = zzhhm.zzA(i14 << 3);
                        iZzD = iZzt + (size * iZzA7);
                    }
                    iZzA19 += iZzD;
                    break;
                case 34:
                    i8 = i9;
                    List list11 = (List) unsafe.getObject(obj, j7);
                    int i35 = zzhkm.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZzD = 0;
                    } else {
                        iZzt = zzhkm.zzu(list11);
                        iZzA7 = zzhhm.zzA(i14 << 3);
                        iZzD = iZzt + (size * iZzA7);
                    }
                    iZzA19 += iZzD;
                    break;
                case 35:
                    i8 = i9;
                    iZzB2 = zzhkm.zzB((List) unsafe.getObject(obj, j7));
                    if (iZzB2 > 0) {
                        iZzA11 = zzhhm.zzA(i14 << 3);
                        iZzA12 = zzhhm.zzA(iZzB2);
                        iZzA10 = iZzA11 + iZzA12 + iZzB2;
                        iZzA19 += iZzA10;
                    }
                    break;
                case 36:
                    i8 = i9;
                    iZzB2 = zzhkm.zzz((List) unsafe.getObject(obj, j7));
                    if (iZzB2 > 0) {
                        iZzA11 = zzhhm.zzA(i14 << 3);
                        iZzA12 = zzhhm.zzA(iZzB2);
                        iZzA10 = iZzA11 + iZzA12 + iZzB2;
                        iZzA19 += iZzA10;
                    }
                    break;
                case 37:
                    i8 = i9;
                    iZzB2 = zzhkm.zzs((List) unsafe.getObject(obj, j7));
                    if (iZzB2 > 0) {
                        iZzA11 = zzhhm.zzA(i14 << 3);
                        iZzA12 = zzhhm.zzA(iZzB2);
                        iZzA10 = iZzA11 + iZzA12 + iZzB2;
                        iZzA19 += iZzA10;
                    }
                    break;
                case 38:
                    i8 = i9;
                    iZzB2 = zzhkm.zzt((List) unsafe.getObject(obj, j7));
                    if (iZzB2 > 0) {
                        iZzA11 = zzhhm.zzA(i14 << 3);
                        iZzA12 = zzhhm.zzA(iZzB2);
                        iZzA10 = iZzA11 + iZzA12 + iZzB2;
                        iZzA19 += iZzA10;
                    }
                    break;
                case 39:
                    i8 = i9;
                    iZzB2 = zzhkm.zzw((List) unsafe.getObject(obj, j7));
                    if (iZzB2 > 0) {
                        iZzA11 = zzhhm.zzA(i14 << 3);
                        iZzA12 = zzhhm.zzA(iZzB2);
                        iZzA10 = iZzA11 + iZzA12 + iZzB2;
                        iZzA19 += iZzA10;
                    }
                    break;
                case 40:
                    i8 = i9;
                    iZzB2 = zzhkm.zzB((List) unsafe.getObject(obj, j7));
                    if (iZzB2 > 0) {
                        iZzA11 = zzhhm.zzA(i14 << 3);
                        iZzA12 = zzhhm.zzA(iZzB2);
                        iZzA10 = iZzA11 + iZzA12 + iZzB2;
                        iZzA19 += iZzA10;
                    }
                    break;
                case 41:
                    i8 = i9;
                    iZzB2 = zzhkm.zzz((List) unsafe.getObject(obj, j7));
                    if (iZzB2 > 0) {
                        iZzA11 = zzhhm.zzA(i14 << 3);
                        iZzA12 = zzhhm.zzA(iZzB2);
                        iZzA10 = iZzA11 + iZzA12 + iZzB2;
                        iZzA19 += iZzA10;
                    }
                    break;
                case 42:
                    i8 = i9;
                    List list12 = (List) unsafe.getObject(obj, j7);
                    int i36 = zzhkm.zza;
                    iZzB2 = list12.size();
                    if (iZzB2 > 0) {
                        iZzA11 = zzhhm.zzA(i14 << 3);
                        iZzA12 = zzhhm.zzA(iZzB2);
                        iZzA10 = iZzA11 + iZzA12 + iZzB2;
                        iZzA19 += iZzA10;
                    }
                    break;
                case 43:
                    i8 = i9;
                    iZzB2 = zzhkm.zzx((List) unsafe.getObject(obj, j7));
                    if (iZzB2 > 0) {
                        iZzA11 = zzhhm.zzA(i14 << 3);
                        iZzA12 = zzhhm.zzA(iZzB2);
                        iZzA10 = iZzA11 + iZzA12 + iZzB2;
                        iZzA19 += iZzA10;
                    }
                    break;
                case 44:
                    i8 = i9;
                    iZzB2 = zzhkm.zzv((List) unsafe.getObject(obj, j7));
                    if (iZzB2 > 0) {
                        iZzA11 = zzhhm.zzA(i14 << 3);
                        iZzA12 = zzhhm.zzA(iZzB2);
                        iZzA10 = iZzA11 + iZzA12 + iZzB2;
                        iZzA19 += iZzA10;
                    }
                    break;
                case 45:
                    i8 = i9;
                    iZzB2 = zzhkm.zzz((List) unsafe.getObject(obj, j7));
                    if (iZzB2 > 0) {
                        iZzA11 = zzhhm.zzA(i14 << 3);
                        iZzA12 = zzhhm.zzA(iZzB2);
                        iZzA10 = iZzA11 + iZzA12 + iZzB2;
                        iZzA19 += iZzA10;
                    }
                    break;
                case 46:
                    i8 = i9;
                    iZzB2 = zzhkm.zzB((List) unsafe.getObject(obj, j7));
                    if (iZzB2 > 0) {
                        iZzA11 = zzhhm.zzA(i14 << 3);
                        iZzA12 = zzhhm.zzA(iZzB2);
                        iZzA10 = iZzA11 + iZzA12 + iZzB2;
                        iZzA19 += iZzA10;
                    }
                    break;
                case 47:
                    i8 = i9;
                    iZzB2 = zzhkm.zzy((List) unsafe.getObject(obj, j7));
                    if (iZzB2 > 0) {
                        iZzA11 = zzhhm.zzA(i14 << 3);
                        iZzA12 = zzhhm.zzA(iZzB2);
                        iZzA10 = iZzA11 + iZzA12 + iZzB2;
                        iZzA19 += iZzA10;
                    }
                    break;
                case 48:
                    i8 = i9;
                    iZzB2 = zzhkm.zzu((List) unsafe.getObject(obj, j7));
                    if (iZzB2 > 0) {
                        iZzA11 = zzhhm.zzA(i14 << 3);
                        iZzA12 = zzhhm.zzA(iZzB2);
                        iZzA10 = iZzA11 + iZzA12 + iZzB2;
                        iZzA19 += iZzA10;
                    }
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j7);
                    zzhkk zzhkkVarZzq2 = zzhjvVar.zzq(i10);
                    int i37 = zzhkm.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZzE = 0;
                    } else {
                        int i38 = 0;
                        iZzE = 0;
                        while (i38 < size6) {
                            iZzE += zzhkm.zzE(i14, (zzhjs) list13.get(i38), zzhkkVarZzq2);
                            i38++;
                            i9 = i9;
                        }
                    }
                    i8 = i9;
                    iZzA19 += iZzE;
                    break;
                case 50:
                    zzhjm zzhjmVar = (zzhjm) unsafe.getObject(obj, j7);
                    zzhjl zzhjlVar = (zzhjl) zzhjvVar.zzr(i10);
                    if (zzhjmVar.isEmpty()) {
                        iZzd = 0;
                    } else {
                        iZzd = 0;
                        for (Map.Entry entry2 : zzhjmVar.entrySet()) {
                            iZzd += zzhjlVar.zzd(i14, entry2.getKey(), entry2.getValue());
                        }
                    }
                    iZzA19 += iZzd;
                    i8 = i9;
                    break;
                case 51:
                    if (zzhjvVar.zzP(obj, i14, i10)) {
                        iZzA13 = zzhhm.zzA(i14 << 3);
                        iZzA16 = iZzA13 + 8;
                        iZzA19 += iZzA16;
                    }
                    i8 = i9;
                    break;
                case 52:
                    if (zzhjvVar.zzP(obj, i14, i10)) {
                        iZzA14 = zzhhm.zzA(i14 << 3);
                        iZzA16 = iZzA14 + 4;
                        iZzA19 += iZzA16;
                    }
                    i8 = i9;
                    break;
                case 53:
                    if (zzhjvVar.zzP(obj, i14, i10)) {
                        long jZzJ = zzJ(obj, j7);
                        iZzA15 = zzhhm.zzA(i14 << 3);
                        iZzB3 = zzhhm.zzB(jZzJ);
                        iZzA16 = iZzA15 + iZzB3;
                        iZzA19 += iZzA16;
                    }
                    i8 = i9;
                    break;
                case 54:
                    if (zzhjvVar.zzP(obj, i14, i10)) {
                        long jZzJ2 = zzJ(obj, j7);
                        iZzA15 = zzhhm.zzA(i14 << 3);
                        iZzB3 = zzhhm.zzB(jZzJ2);
                        iZzA16 = iZzA15 + iZzB3;
                        iZzA19 += iZzA16;
                    }
                    i8 = i9;
                    break;
                case 55:
                    if (zzhjvVar.zzP(obj, i14, i10)) {
                        long jZzI = zzI(obj, j7);
                        iZzA15 = zzhhm.zzA(i14 << 3);
                        iZzB3 = zzhhm.zzB(jZzI);
                        iZzA16 = iZzA15 + iZzB3;
                        iZzA19 += iZzA16;
                    }
                    i8 = i9;
                    break;
                case 56:
                    if (zzhjvVar.zzP(obj, i14, i10)) {
                        iZzA13 = zzhhm.zzA(i14 << 3);
                        iZzA16 = iZzA13 + 8;
                        iZzA19 += iZzA16;
                    }
                    i8 = i9;
                    break;
                case 57:
                    if (zzhjvVar.zzP(obj, i14, i10)) {
                        iZzA14 = zzhhm.zzA(i14 << 3);
                        iZzA16 = iZzA14 + 4;
                        iZzA19 += iZzA16;
                    }
                    i8 = i9;
                    break;
                case 58:
                    if (zzhjvVar.zzP(obj, i14, i10)) {
                        iZzA16 = zzhhm.zzA(i14 << 3) + i9;
                        iZzA19 += iZzA16;
                    }
                    i8 = i9;
                    break;
                case 59:
                    if (zzhjvVar.zzP(obj, i14, i10)) {
                        int i39 = i14 << 3;
                        Object object2 = unsafe.getObject(obj, j7);
                        if (object2 instanceof zzhhb) {
                            iZzA17 = zzhhm.zzA(i39);
                            iZzc2 = ((zzhhb) object2).zzc();
                            iZzA18 = zzhhm.zzA(iZzc2);
                            iZzA16 = iZzA17 + iZzA18 + iZzc2;
                            iZzA19 += iZzA16;
                        } else {
                            iZzA15 = zzhhm.zzA(i39);
                            iZzB3 = zzhhm.zzC((String) object2);
                            iZzA16 = iZzA15 + iZzB3;
                            iZzA19 += iZzA16;
                        }
                    }
                    i8 = i9;
                    break;
                case 60:
                    if (zzhjvVar.zzP(obj, i14, i10)) {
                        iZzA16 = zzhkm.zzD(i14, unsafe.getObject(obj, j7), zzhjvVar.zzq(i10));
                        iZzA19 += iZzA16;
                    }
                    i8 = i9;
                    break;
                case 61:
                    if (zzhjvVar.zzP(obj, i14, i10)) {
                        zzhhb zzhhbVar2 = (zzhhb) unsafe.getObject(obj, j7);
                        iZzA17 = zzhhm.zzA(i14 << 3);
                        iZzc2 = zzhhbVar2.zzc();
                        iZzA18 = zzhhm.zzA(iZzc2);
                        iZzA16 = iZzA17 + iZzA18 + iZzc2;
                        iZzA19 += iZzA16;
                    }
                    i8 = i9;
                    break;
                case 62:
                    if (zzhjvVar.zzP(obj, i14, i10)) {
                        int iZzI = zzI(obj, j7);
                        iZzA15 = zzhhm.zzA(i14 << 3);
                        iZzB3 = zzhhm.zzA(iZzI);
                        iZzA16 = iZzA15 + iZzB3;
                        iZzA19 += iZzA16;
                    }
                    i8 = i9;
                    break;
                case 63:
                    if (zzhjvVar.zzP(obj, i14, i10)) {
                        long jZzI2 = zzI(obj, j7);
                        iZzA15 = zzhhm.zzA(i14 << 3);
                        iZzB3 = zzhhm.zzB(jZzI2);
                        iZzA16 = iZzA15 + iZzB3;
                        iZzA19 += iZzA16;
                    }
                    i8 = i9;
                    break;
                case 64:
                    if (zzhjvVar.zzP(obj, i14, i10)) {
                        iZzA14 = zzhhm.zzA(i14 << 3);
                        iZzA16 = iZzA14 + 4;
                        iZzA19 += iZzA16;
                    }
                    i8 = i9;
                    break;
                case 65:
                    if (zzhjvVar.zzP(obj, i14, i10)) {
                        iZzA13 = zzhhm.zzA(i14 << 3);
                        iZzA16 = iZzA13 + 8;
                        iZzA19 += iZzA16;
                    }
                    i8 = i9;
                    break;
                case 66:
                    if (zzhjvVar.zzP(obj, i14, i10)) {
                        int iZzI2 = zzI(obj, j7);
                        iZzA15 = zzhhm.zzA(i14 << 3);
                        iZzB3 = zzhhm.zzA((iZzI2 >> 31) ^ (iZzI2 + iZzI2));
                        iZzA16 = iZzA15 + iZzB3;
                        iZzA19 += iZzA16;
                    }
                    i8 = i9;
                    break;
                case 67:
                    if (zzhjvVar.zzP(obj, i14, i10)) {
                        long jZzJ3 = zzJ(obj, j7);
                        iZzA15 = zzhhm.zzA(i14 << 3);
                        iZzB3 = zzhhm.zzB((jZzJ3 >> 63) ^ (jZzJ3 + jZzJ3));
                        iZzA16 = iZzA15 + iZzB3;
                        iZzA19 += iZzA16;
                    }
                    i8 = i9;
                    break;
                case 68:
                    if (zzhjvVar.zzP(obj, i14, i10)) {
                        iZzA16 = zzhkm.zzE(i14, (zzhjs) unsafe.getObject(obj, j7), zzhjvVar.zzq(i10));
                        iZzA19 += iZzA16;
                    }
                    i8 = i9;
                    break;
                default:
                    i8 = i9;
                    break;
            }
            i10 += 3;
            i9 = i8;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.ads.zzhkk
    public final void zzf(Object obj, zzhlk zzhlkVar) {
        Map.Entry entry;
        Iterator it;
        boolean z7;
        int i7;
        int i8;
        int i9;
        zzhjv<T> zzhjvVar = this;
        if (zzhjvVar.zzh) {
            zzhhw zzhhwVar = ((zzhid) obj).zza;
            if (zzhhwVar.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzc = zzhhwVar.zzc();
                entry = (Map.Entry) itZzc.next();
                it = itZzc;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = zzhjvVar.zzc;
        Unsafe unsafe = zzb;
        int i10 = 1048575;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (i12 < iArr.length) {
            int iZzA = zzhjvVar.zzA(i12);
            int iZzC = zzC(iZzA);
            int i14 = iArr[i12];
            if (iZzC <= 17) {
                int i15 = iArr[i12 + 2];
                z7 = true;
                int i16 = i15 & i10;
                if (i16 != i11) {
                    i13 = i16 == i10 ? 0 : unsafe.getInt(obj, i16);
                    i11 = i16;
                }
                i7 = i11;
                i8 = i13;
                i9 = 1 << (i15 >>> 20);
            } else {
                z7 = true;
                i7 = i11;
                i8 = i13;
                i9 = 0;
            }
            while (true) {
                if (entry != null) {
                    zzhhs zzhhsVar = zzhjvVar.zzn;
                    i10 = i10;
                    if (((zzhie) entry.getKey()).zza <= i14) {
                        zzhhsVar.zzb(zzhlkVar, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                } else {
                    i10 = i10;
                }
            }
            long j7 = iZzA & i10;
            switch (iZzC) {
                case 0:
                    if (zzhjvVar.zzM(obj, i12, i7, i8, i9)) {
                        zzhlkVar.zzf(i14, zzhlc.zzl(obj, j7));
                    }
                    break;
                case 1:
                    if (zzhjvVar.zzM(obj, i12, i7, i8, i9)) {
                        zzhlkVar.zze(i14, zzhlc.zzj(obj, j7));
                    }
                    zzhjvVar = this;
                    break;
                case 2:
                    if (zzhjvVar.zzM(obj, i12, i7, i8, i9)) {
                        zzhlkVar.zzc(i14, unsafe.getLong(obj, j7));
                    }
                    zzhjvVar = this;
                    break;
                case 3:
                    if (zzhjvVar.zzM(obj, i12, i7, i8, i9)) {
                        zzhlkVar.zzh(i14, unsafe.getLong(obj, j7));
                    }
                    zzhjvVar = this;
                    break;
                case 4:
                    if (zzhjvVar.zzM(obj, i12, i7, i8, i9)) {
                        zzhlkVar.zzi(i14, unsafe.getInt(obj, j7));
                    }
                    zzhjvVar = this;
                    break;
                case 5:
                    if (zzhjvVar.zzM(obj, i12, i7, i8, i9)) {
                        zzhlkVar.zzj(i14, unsafe.getLong(obj, j7));
                    }
                    zzhjvVar = this;
                    break;
                case 6:
                    if (zzhjvVar.zzM(obj, i12, i7, i8, i9)) {
                        zzhlkVar.zzk(i14, unsafe.getInt(obj, j7));
                    }
                    zzhjvVar = this;
                    break;
                case 7:
                    if (zzhjvVar.zzM(obj, i12, i7, i8, i9)) {
                        zzhlkVar.zzl(i14, zzhlc.zzh(obj, j7));
                    }
                    zzhjvVar = this;
                    break;
                case 8:
                    if (zzhjvVar.zzM(obj, i12, i7, i8, i9)) {
                        zzU(i14, unsafe.getObject(obj, j7), zzhlkVar);
                    }
                    zzhjvVar = this;
                    break;
                case 9:
                    if (zzhjvVar.zzM(obj, i12, i7, i8, i9)) {
                        zzhlkVar.zzr(i14, unsafe.getObject(obj, j7), zzhjvVar.zzq(i12));
                    }
                    break;
                case 10:
                    if (zzhjvVar.zzM(obj, i12, i7, i8, i9)) {
                        zzhlkVar.zzn(i14, (zzhhb) unsafe.getObject(obj, j7));
                    }
                    zzhjvVar = this;
                    break;
                case 11:
                    if (zzhjvVar.zzM(obj, i12, i7, i8, i9)) {
                        zzhlkVar.zzo(i14, unsafe.getInt(obj, j7));
                    }
                    zzhjvVar = this;
                    break;
                case 12:
                    if (zzhjvVar.zzM(obj, i12, i7, i8, i9)) {
                        zzhlkVar.zzg(i14, unsafe.getInt(obj, j7));
                    }
                    zzhjvVar = this;
                    break;
                case 13:
                    if (zzhjvVar.zzM(obj, i12, i7, i8, i9)) {
                        zzhlkVar.zzb(i14, unsafe.getInt(obj, j7));
                    }
                    zzhjvVar = this;
                    break;
                case 14:
                    if (zzhjvVar.zzM(obj, i12, i7, i8, i9)) {
                        zzhlkVar.zzd(i14, unsafe.getLong(obj, j7));
                    }
                    zzhjvVar = this;
                    break;
                case 15:
                    if (zzhjvVar.zzM(obj, i12, i7, i8, i9)) {
                        zzhlkVar.zzp(i14, unsafe.getInt(obj, j7));
                    }
                    zzhjvVar = this;
                    break;
                case 16:
                    if (zzhjvVar.zzM(obj, i12, i7, i8, i9)) {
                        zzhlkVar.zzq(i14, unsafe.getLong(obj, j7));
                    }
                    zzhjvVar = this;
                    break;
                case 17:
                    if (zzhjvVar.zzM(obj, i12, i7, i8, i9)) {
                        zzhlkVar.zzs(i14, unsafe.getObject(obj, j7), zzhjvVar.zzq(i12));
                    }
                    break;
                case 18:
                    zzhkm.zza(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, false);
                    break;
                case 19:
                    zzhkm.zzb(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, false);
                    break;
                case 20:
                    zzhkm.zzc(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, false);
                    break;
                case zzbbn.zzt.zzm /* 21 */:
                    zzhkm.zzd(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, false);
                    break;
                case 22:
                    zzhkm.zzh(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, false);
                    break;
                case 23:
                    zzhkm.zzf(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, false);
                    break;
                case 24:
                    zzhkm.zzk(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, false);
                    break;
                case 25:
                    zzhkm.zzn(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, false);
                    break;
                case 26:
                    zzhkm.zzo(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar);
                    break;
                case 27:
                    zzhkm.zzq(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, zzhjvVar.zzq(i12));
                    break;
                case 28:
                    zzhkm.zzp(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar);
                    break;
                case 29:
                    zzhkm.zzi(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, false);
                    break;
                case 30:
                    zzhkm.zzm(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, false);
                    break;
                case 31:
                    zzhkm.zzl(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, false);
                    break;
                case 32:
                    zzhkm.zzg(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, false);
                    break;
                case 33:
                    zzhkm.zzj(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, false);
                    break;
                case 34:
                    zzhkm.zze(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, false);
                    break;
                case 35:
                    zzhkm.zza(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, z7);
                    break;
                case 36:
                    zzhkm.zzb(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, z7);
                    break;
                case 37:
                    zzhkm.zzc(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, z7);
                    break;
                case 38:
                    zzhkm.zzd(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, z7);
                    break;
                case 39:
                    zzhkm.zzh(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, z7);
                    break;
                case 40:
                    zzhkm.zzf(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, z7);
                    break;
                case 41:
                    zzhkm.zzk(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, z7);
                    break;
                case 42:
                    zzhkm.zzn(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, z7);
                    break;
                case 43:
                    zzhkm.zzi(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, z7);
                    break;
                case 44:
                    zzhkm.zzm(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, z7);
                    break;
                case 45:
                    zzhkm.zzl(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, z7);
                    break;
                case 46:
                    zzhkm.zzg(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, z7);
                    break;
                case 47:
                    zzhkm.zzj(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, z7);
                    break;
                case 48:
                    zzhkm.zze(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, z7);
                    break;
                case 49:
                    zzhkm.zzr(iArr[i12], (List) unsafe.getObject(obj, j7), zzhlkVar, zzhjvVar.zzq(i12));
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j7);
                    if (object != null) {
                        zzhlkVar.zzM(i14, ((zzhjl) zzhjvVar.zzr(i12)).zze(), (zzhjm) object);
                    }
                    break;
                case 51:
                    if (zzhjvVar.zzP(obj, i14, i12)) {
                        zzhlkVar.zzf(i14, zzG(obj, j7));
                    }
                    break;
                case 52:
                    if (zzhjvVar.zzP(obj, i14, i12)) {
                        zzhlkVar.zze(i14, zzH(obj, j7));
                    }
                    break;
                case 53:
                    if (zzhjvVar.zzP(obj, i14, i12)) {
                        zzhlkVar.zzc(i14, zzJ(obj, j7));
                    }
                    break;
                case 54:
                    if (zzhjvVar.zzP(obj, i14, i12)) {
                        zzhlkVar.zzh(i14, zzJ(obj, j7));
                    }
                    break;
                case 55:
                    if (zzhjvVar.zzP(obj, i14, i12)) {
                        zzhlkVar.zzi(i14, zzI(obj, j7));
                    }
                    break;
                case 56:
                    if (zzhjvVar.zzP(obj, i14, i12)) {
                        zzhlkVar.zzj(i14, zzJ(obj, j7));
                    }
                    break;
                case 57:
                    if (zzhjvVar.zzP(obj, i14, i12)) {
                        zzhlkVar.zzk(i14, zzI(obj, j7));
                    }
                    break;
                case 58:
                    if (zzhjvVar.zzP(obj, i14, i12)) {
                        zzhlkVar.zzl(i14, zzK(obj, j7));
                    }
                    break;
                case 59:
                    if (zzhjvVar.zzP(obj, i14, i12)) {
                        zzU(i14, unsafe.getObject(obj, j7), zzhlkVar);
                    }
                    break;
                case 60:
                    if (zzhjvVar.zzP(obj, i14, i12)) {
                        zzhlkVar.zzr(i14, unsafe.getObject(obj, j7), zzhjvVar.zzq(i12));
                    }
                    break;
                case 61:
                    if (zzhjvVar.zzP(obj, i14, i12)) {
                        zzhlkVar.zzn(i14, (zzhhb) unsafe.getObject(obj, j7));
                    }
                    break;
                case 62:
                    if (zzhjvVar.zzP(obj, i14, i12)) {
                        zzhlkVar.zzo(i14, zzI(obj, j7));
                    }
                    break;
                case 63:
                    if (zzhjvVar.zzP(obj, i14, i12)) {
                        zzhlkVar.zzg(i14, zzI(obj, j7));
                    }
                    break;
                case 64:
                    if (zzhjvVar.zzP(obj, i14, i12)) {
                        zzhlkVar.zzb(i14, zzI(obj, j7));
                    }
                    break;
                case 65:
                    if (zzhjvVar.zzP(obj, i14, i12)) {
                        zzhlkVar.zzd(i14, zzJ(obj, j7));
                    }
                    break;
                case 66:
                    if (zzhjvVar.zzP(obj, i14, i12)) {
                        zzhlkVar.zzp(i14, zzI(obj, j7));
                    }
                    break;
                case 67:
                    if (zzhjvVar.zzP(obj, i14, i12)) {
                        zzhlkVar.zzq(i14, zzJ(obj, j7));
                    }
                    break;
                case 68:
                    if (zzhjvVar.zzP(obj, i14, i12)) {
                        zzhlkVar.zzs(i14, unsafe.getObject(obj, j7), zzhjvVar.zzq(i12));
                    }
                    break;
                default:
                    break;
            }
            i12 += 3;
            i13 = i8;
            i10 = i10;
            i11 = i7;
            entry = entry;
        }
        while (entry != null) {
            zzhjvVar.zzn.zzb(zzhlkVar, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        ((zzhih) obj).zzt.zzg(zzhlkVar);
    }

    /* JADX WARN: Code duplicated, block: B:182:0x0581 A[LOOP:2: B:180:0x057d->B:182:0x0581, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x0593  */
    /* JADX WARN: Code duplicated, block: B:187:0x0597  */
    /* JADX WARN: Code duplicated, block: B:198:0x05ad A[LOOP:1: B:196:0x05a9->B:198:0x05ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:201:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:215:0x0569 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x057a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhkk
    public final void zzg(Object obj, zzhkf zzhkfVar, zzhhr zzhhrVar) throws Throwable {
        zzhjv<T> zzhjvVar;
        Object obj2;
        Throwable th;
        int i7;
        Object objZzx;
        zzhkv zzhkvVar;
        Object objZzx2;
        Object obj3;
        zzhjv<T> zzhjvVar2;
        int i8;
        zzhhrVar.getClass();
        zzF(obj);
        zzhkv zzhkvVar2 = this.zzm;
        Object objZzh = null;
        while (true) {
            try {
                int iZzb = zzhkfVar.zzb();
                int iZzR = zzR(iZzb);
                if (iZzR >= 0) {
                    obj3 = obj;
                    zzhjvVar2 = this;
                    try {
                        int iZzA = zzA(iZzR);
                        try {
                            try {
                                switch (zzC(iZzA)) {
                                    case 0:
                                        obj2 = obj3;
                                        zzhlc.zzm(obj2, iZzA & 1048575, zzhkfVar.zze());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 1:
                                        obj2 = obj3;
                                        zzhlc.zzk(obj2, iZzA & 1048575, zzhkfVar.zzf());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 2:
                                        obj2 = obj3;
                                        zzhlc.zzg(obj2, iZzA & 1048575, zzhkfVar.zzh());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 3:
                                        obj2 = obj3;
                                        zzhlc.zzg(obj2, iZzA & 1048575, zzhkfVar.zzg());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 4:
                                        obj2 = obj3;
                                        zzhlc.zze(obj2, iZzA & 1048575, zzhkfVar.zzi());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 5:
                                        obj2 = obj3;
                                        zzhlc.zzg(obj2, iZzA & 1048575, zzhkfVar.zzj());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 6:
                                        obj2 = obj3;
                                        zzhlc.zze(obj2, iZzA & 1048575, zzhkfVar.zzk());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 7:
                                        obj2 = obj3;
                                        zzhlc.zzi(obj2, iZzA & 1048575, zzhkfVar.zzl());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 8:
                                        obj2 = obj3;
                                        zzz(obj2, iZzA, zzhkfVar);
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 9:
                                        obj2 = obj3;
                                        zzhjs zzhjsVar = (zzhjs) zzt(obj2, iZzR);
                                        zzhkfVar.zzo(zzhjsVar, zzq(iZzR), zzhhrVar);
                                        zzu(obj2, iZzR, zzhjsVar);
                                        obj = obj2;
                                        break;
                                    case 10:
                                        obj2 = obj3;
                                        zzhlc.zzo(obj2, iZzA & 1048575, zzhkfVar.zzq());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 11:
                                        obj2 = obj3;
                                        zzhlc.zze(obj2, iZzA & 1048575, zzhkfVar.zzr());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 12:
                                        obj2 = obj3;
                                        int iZzs = zzhkfVar.zzs();
                                        zzhin zzhinVarZzs = zzs(iZzR);
                                        if (zzhinVarZzs == null || zzhinVarZzs.zza(iZzs)) {
                                            zzhlc.zze(obj2, iZzA & 1048575, iZzs);
                                            zzO(obj2, iZzR);
                                        } else {
                                            objZzh = zzhkm.zzK(obj2, iZzb, iZzs, objZzh, zzhkvVar2);
                                        }
                                        obj = obj2;
                                        break;
                                    case 13:
                                        obj2 = obj3;
                                        zzhlc.zze(obj2, iZzA & 1048575, zzhkfVar.zzt());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 14:
                                        obj2 = obj3;
                                        zzhlc.zzg(obj2, iZzA & 1048575, zzhkfVar.zzu());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 15:
                                        obj2 = obj3;
                                        zzhlc.zze(obj2, iZzA & 1048575, zzhkfVar.zzv());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 16:
                                        obj2 = obj3;
                                        zzhlc.zzg(obj2, iZzA & 1048575, zzhkfVar.zzw());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 17:
                                        obj2 = obj3;
                                        zzhjs zzhjsVar2 = (zzhjs) zzt(obj2, iZzR);
                                        zzhkfVar.zzp(zzhjsVar2, zzq(iZzR), zzhhrVar);
                                        zzu(obj2, iZzR, zzhjsVar2);
                                        obj = obj2;
                                        break;
                                    case 18:
                                        obj2 = obj3;
                                        zzhkfVar.zzx(zzhje.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 19:
                                        obj2 = obj3;
                                        zzhkfVar.zzy(zzhje.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 20:
                                        obj2 = obj3;
                                        zzhkfVar.zzA(zzhje.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case zzbbn.zzt.zzm /* 21 */:
                                        obj2 = obj3;
                                        zzhkfVar.zzz(zzhje.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 22:
                                        obj2 = obj3;
                                        zzhkfVar.zzB(zzhje.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 23:
                                        obj2 = obj3;
                                        zzhkfVar.zzC(zzhje.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 24:
                                        obj2 = obj3;
                                        zzhkfVar.zzD(zzhje.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 25:
                                        obj2 = obj3;
                                        zzhkfVar.zzE(zzhje.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 26:
                                        obj2 = obj3;
                                        if (zzD(iZzA)) {
                                            ((zzhhh) zzhkfVar).zzF(zzhje.zza(obj2, iZzA & 1048575), true);
                                        } else {
                                            ((zzhhh) zzhkfVar).zzF(zzhje.zza(obj2, iZzA & 1048575), false);
                                        }
                                        obj = obj2;
                                        break;
                                    case 27:
                                        obj2 = obj3;
                                        zzhkfVar.zzG(zzhje.zza(obj2, iZzA & 1048575), zzq(iZzR), zzhhrVar);
                                        obj = obj2;
                                        break;
                                    case 28:
                                        obj2 = obj3;
                                        zzhkfVar.zzI(zzhje.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 29:
                                        obj2 = obj3;
                                        zzhkfVar.zzJ(zzhje.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 30:
                                        List listZza = zzhje.zza(obj3, iZzA & 1048575);
                                        zzhkfVar.zzK(listZza);
                                        objZzh = zzhkm.zzJ(obj3, iZzb, listZza, zzs(iZzR), objZzh, zzhkvVar2);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 31:
                                        obj2 = obj3;
                                        zzhkfVar.zzL(zzhje.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 32:
                                        obj2 = obj3;
                                        zzhkfVar.zzM(zzhje.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 33:
                                        obj2 = obj3;
                                        zzhkfVar.zzN(zzhje.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 34:
                                        obj2 = obj3;
                                        zzhkfVar.zzO(zzhje.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 35:
                                        obj2 = obj3;
                                        zzhkfVar.zzx(zzhje.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 36:
                                        obj2 = obj3;
                                        zzhkfVar.zzy(zzhje.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 37:
                                        obj2 = obj3;
                                        zzhkfVar.zzA(zzhje.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 38:
                                        obj2 = obj3;
                                        zzhkfVar.zzz(zzhje.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 39:
                                        obj2 = obj3;
                                        zzhkfVar.zzB(zzhje.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 40:
                                        obj2 = obj3;
                                        zzhkfVar.zzC(zzhje.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 41:
                                        obj2 = obj3;
                                        zzhkfVar.zzD(zzhje.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 42:
                                        obj2 = obj3;
                                        zzhkfVar.zzE(zzhje.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 43:
                                        obj2 = obj3;
                                        try {
                                            zzhkfVar.zzJ(zzhje.zza(obj2, iZzA & 1048575));
                                            break;
                                        } catch (zzhiv unused) {
                                            if (objZzh == null) {
                                                try {
                                                    objZzh = zzhkvVar2.zzh(obj2);
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    th = th;
                                                    zzhjvVar = zzhjvVar2;
                                                    i7 = zzhjvVar.zzk;
                                                    objZzx = objZzh;
                                                    while (i7 < zzhjvVar.zzl) {
                                                        zzhkv zzhkvVar3 = zzhkvVar2;
                                                        objZzx = zzhjvVar.zzx(obj2, zzhjvVar.zzj[i7], objZzx, zzhkvVar3, obj2);
                                                        i7++;
                                                        zzhjvVar = this;
                                                        zzhkvVar2 = zzhkvVar3;
                                                    }
                                                    zzhkvVar = zzhkvVar2;
                                                    if (objZzx != null) {
                                                        throw th;
                                                    }
                                                    zzhkvVar.zzi(obj2, objZzx);
                                                    throw th;
                                                }
                                            }
                                            try {
                                                if (!zzhkvVar2.zzk(objZzh, zzhkfVar, 0)) {
                                                    objZzx2 = objZzh;
                                                    for (i8 = zzhjvVar2.zzk; i8 < zzhjvVar2.zzl; i8++) {
                                                        zzhkv zzhkvVar4 = zzhkvVar2;
                                                        objZzx2 = zzhjvVar2.zzx(obj2, zzhjvVar2.zzj[i8], objZzx2, zzhkvVar4, obj2);
                                                        zzhkvVar2 = zzhkvVar4;
                                                    }
                                                    if (objZzx2 != null) {
                                                        zzhkvVar2.zzi(obj2, objZzx2);
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                zzhjvVar = zzhjvVar2;
                                                th = th;
                                                i7 = zzhjvVar.zzk;
                                                objZzx = objZzh;
                                                while (i7 < zzhjvVar.zzl) {
                                                    zzhkv zzhkvVar5 = zzhkvVar2;
                                                    objZzx = zzhjvVar.zzx(obj2, zzhjvVar.zzj[i7], objZzx, zzhkvVar5, obj2);
                                                    i7++;
                                                    zzhjvVar = this;
                                                    zzhkvVar2 = zzhkvVar5;
                                                }
                                                zzhkvVar = zzhkvVar2;
                                                if (objZzx != null) {
                                                    throw th;
                                                }
                                                zzhkvVar.zzi(obj2, objZzx);
                                                throw th;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            th = th;
                                            zzhjvVar = zzhjvVar2;
                                            i7 = zzhjvVar.zzk;
                                            objZzx = objZzh;
                                            while (i7 < zzhjvVar.zzl) {
                                                zzhkv zzhkvVar6 = zzhkvVar2;
                                                objZzx = zzhjvVar.zzx(obj2, zzhjvVar.zzj[i7], objZzx, zzhkvVar6, obj2);
                                                i7++;
                                                zzhjvVar = this;
                                                zzhkvVar2 = zzhkvVar6;
                                            }
                                            zzhkvVar = zzhkvVar2;
                                            if (objZzx != null) {
                                                throw th;
                                            }
                                            zzhkvVar.zzi(obj2, objZzx);
                                            throw th;
                                        }
                                        obj = obj2;
                                        break;
                                    case 44:
                                        List listZza2 = zzhje.zza(obj3, iZzA & 1048575);
                                        zzhkfVar.zzK(listZza2);
                                        try {
                                            objZzh = zzhkm.zzJ(obj3, iZzb, listZza2, zzs(iZzR), objZzh, zzhkvVar2);
                                            obj2 = obj3;
                                        } catch (zzhiv unused2) {
                                            obj2 = obj3;
                                            if (objZzh == null) {
                                                objZzh = zzhkvVar2.zzh(obj2);
                                            }
                                            if (!zzhkvVar2.zzk(objZzh, zzhkfVar, 0)) {
                                                objZzx2 = objZzh;
                                                while (i8 < zzhjvVar2.zzl) {
                                                    zzhkv zzhkvVar7 = zzhkvVar2;
                                                    objZzx2 = zzhjvVar2.zzx(obj2, zzhjvVar2.zzj[i8], objZzx2, zzhkvVar7, obj2);
                                                    zzhkvVar2 = zzhkvVar7;
                                                }
                                                if (objZzx2 != null) {
                                                    zzhkvVar2.zzi(obj2, objZzx2);
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            obj2 = obj3;
                                            th = th;
                                            zzhjvVar = zzhjvVar2;
                                            i7 = zzhjvVar.zzk;
                                            objZzx = objZzh;
                                            while (i7 < zzhjvVar.zzl) {
                                                zzhkv zzhkvVar8 = zzhkvVar2;
                                                objZzx = zzhjvVar.zzx(obj2, zzhjvVar.zzj[i7], objZzx, zzhkvVar8, obj2);
                                                i7++;
                                                zzhjvVar = this;
                                                zzhkvVar2 = zzhkvVar8;
                                            }
                                            zzhkvVar = zzhkvVar2;
                                            if (objZzx != null) {
                                                throw th;
                                            }
                                            zzhkvVar.zzi(obj2, objZzx);
                                            throw th;
                                        }
                                        obj = obj2;
                                        break;
                                    case 45:
                                        zzhkfVar.zzL(zzhje.zza(obj3, iZzA & 1048575));
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 46:
                                        zzhkfVar.zzM(zzhje.zza(obj3, iZzA & 1048575));
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 47:
                                        zzhkfVar.zzN(zzhje.zza(obj3, iZzA & 1048575));
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 48:
                                        zzhkfVar.zzO(zzhje.zza(obj3, iZzA & 1048575));
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 49:
                                        zzhkfVar.zzH(zzhje.zza(obj3, iZzA & 1048575), zzq(iZzR), zzhhrVar);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 50:
                                        Object objZzr = zzr(iZzR);
                                        long jZzA = zzA(iZzR) & 1048575;
                                        Object objZzn = zzhlc.zzn(obj3, jZzA);
                                        if (objZzn == null) {
                                            objZzn = zzhjm.zza().zzc();
                                            zzhlc.zzo(obj3, jZzA, objZzn);
                                        } else if (zzhjn.zza(objZzn)) {
                                            Object objZzc = zzhjm.zza().zzc();
                                            zzhjn.zzb(objZzc, objZzn);
                                            zzhlc.zzo(obj3, jZzA, objZzc);
                                            objZzn = objZzc;
                                        }
                                        zzhkfVar.zzP((zzhjm) objZzn, ((zzhjl) objZzr).zze(), zzhhrVar);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 51:
                                        zzhlc.zzo(obj3, iZzA & 1048575, Double.valueOf(zzhkfVar.zze()));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 52:
                                        zzhlc.zzo(obj3, iZzA & 1048575, Float.valueOf(zzhkfVar.zzf()));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 53:
                                        zzhlc.zzo(obj3, iZzA & 1048575, Long.valueOf(zzhkfVar.zzh()));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 54:
                                        zzhlc.zzo(obj3, iZzA & 1048575, Long.valueOf(zzhkfVar.zzg()));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 55:
                                        zzhlc.zzo(obj3, iZzA & 1048575, Integer.valueOf(zzhkfVar.zzi()));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 56:
                                        zzhlc.zzo(obj3, iZzA & 1048575, Long.valueOf(zzhkfVar.zzj()));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 57:
                                        zzhlc.zzo(obj3, iZzA & 1048575, Integer.valueOf(zzhkfVar.zzk()));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 58:
                                        zzhlc.zzo(obj3, iZzA & 1048575, Boolean.valueOf(zzhkfVar.zzl()));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 59:
                                        zzz(obj3, iZzA, zzhkfVar);
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 60:
                                        zzhjs zzhjsVar3 = (zzhjs) zzv(obj3, iZzb, iZzR);
                                        zzhkfVar.zzo(zzhjsVar3, zzq(iZzR), zzhhrVar);
                                        zzw(obj3, iZzb, iZzR, zzhjsVar3);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 61:
                                        zzhlc.zzo(obj3, iZzA & 1048575, zzhkfVar.zzq());
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 62:
                                        zzhlc.zzo(obj3, iZzA & 1048575, Integer.valueOf(zzhkfVar.zzr()));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 63:
                                        int iZzs2 = zzhkfVar.zzs();
                                        zzhin zzhinVarZzs2 = zzs(iZzR);
                                        if (zzhinVarZzs2 != null && !zzhinVarZzs2.zza(iZzs2)) {
                                            objZzh = zzhkm.zzK(obj3, iZzb, iZzs2, objZzh, zzhkvVar2);
                                            obj = obj3;
                                        }
                                        zzhlc.zzo(obj3, iZzA & 1048575, Integer.valueOf(iZzs2));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 64:
                                        zzhlc.zzo(obj3, iZzA & 1048575, Integer.valueOf(zzhkfVar.zzt()));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 65:
                                        zzhlc.zzo(obj3, iZzA & 1048575, Long.valueOf(zzhkfVar.zzu()));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 66:
                                        zzhlc.zzo(obj3, iZzA & 1048575, Integer.valueOf(zzhkfVar.zzv()));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 67:
                                        zzhlc.zzo(obj3, iZzA & 1048575, Long.valueOf(zzhkfVar.zzw()));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 68:
                                        zzhjs zzhjsVar4 = (zzhjs) zzv(obj3, iZzb, iZzR);
                                        zzhkfVar.zzp(zzhjsVar4, zzq(iZzR), zzhhrVar);
                                        zzw(obj3, iZzb, iZzR, zzhjsVar4);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    default:
                                        if (objZzh == null) {
                                            try {
                                                objZzh = zzhkvVar2.zzh(obj3);
                                            } catch (Throwable th6) {
                                                th = th6;
                                                th = th;
                                                zzhjvVar = zzhjvVar2;
                                                obj2 = obj3;
                                                i7 = zzhjvVar.zzk;
                                                objZzx = objZzh;
                                                while (i7 < zzhjvVar.zzl) {
                                                    zzhkv zzhkvVar9 = zzhkvVar2;
                                                    objZzx = zzhjvVar.zzx(obj2, zzhjvVar.zzj[i7], objZzx, zzhkvVar9, obj2);
                                                    i7++;
                                                    zzhjvVar = this;
                                                    zzhkvVar2 = zzhkvVar9;
                                                }
                                                zzhkvVar = zzhkvVar2;
                                                if (objZzx != null) {
                                                    throw th;
                                                }
                                                zzhkvVar.zzi(obj2, objZzx);
                                                throw th;
                                            }
                                        }
                                        if (!zzhkvVar2.zzk(objZzh, zzhkfVar, 0)) {
                                            objZzx2 = objZzh;
                                            for (int i9 = zzhjvVar2.zzk; i9 < zzhjvVar2.zzl; i9++) {
                                                zzhkv zzhkvVar10 = zzhkvVar2;
                                                Object obj4 = obj3;
                                                objZzx2 = zzhjvVar2.zzx(obj4, zzhjvVar2.zzj[i9], objZzx2, zzhkvVar10, obj3);
                                                obj3 = obj4;
                                                zzhkvVar2 = zzhkvVar10;
                                            }
                                            obj2 = obj3;
                                        }
                                        obj = obj3;
                                        break;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                obj2 = obj3;
                            }
                        } catch (zzhiv unused3) {
                            obj2 = obj3;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        zzhjvVar = zzhjvVar2;
                        obj2 = obj3;
                    }
                } else if (iZzb == Integer.MAX_VALUE) {
                    objZzx2 = objZzh;
                    for (int i10 = this.zzk; i10 < this.zzl; i10++) {
                        zzhkv zzhkvVar11 = zzhkvVar2;
                        objZzx2 = zzx(obj, this.zzj[i10], objZzx2, zzhkvVar11, obj);
                        zzhkvVar2 = zzhkvVar11;
                    }
                    obj2 = obj;
                } else {
                    zzhjvVar = this;
                    try {
                        if ((!zzhjvVar.zzh ? null : zzhhrVar.zzc(zzhjvVar.zzg, iZzb)) != null) {
                            obj3 = obj;
                            zzhjvVar2 = zzhjvVar;
                            throw null;
                        }
                        if (objZzh == null) {
                            try {
                                objZzh = zzhkvVar2.zzh(obj);
                            } catch (Throwable th9) {
                                th = th9;
                                obj2 = obj;
                                i7 = zzhjvVar.zzk;
                                objZzx = objZzh;
                                while (i7 < zzhjvVar.zzl) {
                                    zzhkv zzhkvVar12 = zzhkvVar2;
                                    objZzx = zzhjvVar.zzx(obj2, zzhjvVar.zzj[i7], objZzx, zzhkvVar12, obj2);
                                    i7++;
                                    zzhjvVar = this;
                                    zzhkvVar2 = zzhkvVar12;
                                }
                                zzhkvVar = zzhkvVar2;
                                if (objZzx != null) {
                                    throw th;
                                }
                                zzhkvVar.zzi(obj2, objZzx);
                                throw th;
                            }
                        }
                        try {
                            if (zzhkvVar2.zzk(objZzh, zzhkfVar, 0)) {
                                obj3 = obj;
                                obj = obj3;
                            } else {
                                int i11 = zzhjvVar.zzk;
                                objZzx2 = objZzh;
                                while (i11 < zzhjvVar.zzl) {
                                    zzhkv zzhkvVar13 = zzhkvVar2;
                                    Object obj5 = obj;
                                    objZzx2 = zzhjvVar.zzx(obj5, zzhjvVar.zzj[i11], objZzx2, zzhkvVar13, obj);
                                    zzhkvVar2 = zzhkvVar13;
                                    i11++;
                                    obj = obj5;
                                }
                                obj3 = obj;
                                obj2 = obj3;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            obj3 = obj;
                            zzhjvVar2 = zzhjvVar;
                            th = th;
                            zzhjvVar = zzhjvVar2;
                            obj2 = obj3;
                            i7 = zzhjvVar.zzk;
                            objZzx = objZzh;
                            while (i7 < zzhjvVar.zzl) {
                                zzhkv zzhkvVar14 = zzhkvVar2;
                                objZzx = zzhjvVar.zzx(obj2, zzhjvVar.zzj[i7], objZzx, zzhkvVar14, obj2);
                                i7++;
                                zzhjvVar = this;
                                zzhkvVar2 = zzhkvVar14;
                            }
                            zzhkvVar = zzhkvVar2;
                            if (objZzx != null) {
                                throw th;
                            }
                            zzhkvVar.zzi(obj2, objZzx);
                            throw th;
                        }
                    } catch (Throwable th11) {
                        obj3 = obj;
                        th = th11;
                        obj2 = obj3;
                        i7 = zzhjvVar.zzk;
                        objZzx = objZzh;
                        while (i7 < zzhjvVar.zzl) {
                            zzhkv zzhkvVar15 = zzhkvVar2;
                            objZzx = zzhjvVar.zzx(obj2, zzhjvVar.zzj[i7], objZzx, zzhkvVar15, obj2);
                            i7++;
                            zzhjvVar = this;
                            zzhkvVar2 = zzhkvVar15;
                        }
                        zzhkvVar = zzhkvVar2;
                        if (objZzx != null) {
                            throw th;
                        }
                        zzhkvVar.zzi(obj2, objZzx);
                        throw th;
                    }
                }
            } catch (Throwable th12) {
                th = th12;
                zzhjvVar = this;
                obj2 = obj;
            }
        }
        if (objZzx2 != null) {
            zzhkvVar2.zzi(obj2, objZzx2);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 41101. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int zzi(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.ads.zzhgp r39) {
        /*
            Method dump skipped, instruction units count: 4110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhjv.zzi(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzhgp):int");
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
    public final void zzj(Object obj, byte[] bArr, int i7, int i8, zzhgp zzhgpVar) {
        zzi(obj, bArr, i7, i8, 0, zzhgpVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhkk
    public final void zzk(Object obj) {
        if (zzE(obj)) {
            if (obj instanceof zzhih) {
                zzhih zzhihVar = (zzhih) obj;
                zzhihVar.zzbq();
                zzhihVar.zzbb();
                zzhihVar.zzaY();
            }
            int[] iArr = this.zzc;
            for (int i7 = 0; i7 < iArr.length; i7 += 3) {
                int iZzA = zzA(i7);
                int i8 = 1048575 & iZzA;
                int iZzC = zzC(iZzA);
                long j7 = i8;
                if (iZzC != 9) {
                    if (iZzC != 60 && iZzC != 68) {
                        switch (iZzC) {
                            case 17:
                                if (zzN(obj, i7)) {
                                    zzq(i7).zzk(zzb.getObject(obj, j7));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case zzbbn.zzt.zzm /* 21 */:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((zzhit) zzhlc.zzn(obj, j7)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j7);
                                if (object != null) {
                                    ((zzhjm) object).zzd();
                                    unsafe.putObject(obj, j7, object);
                                }
                                break;
                        }
                    } else if (zzP(obj, iArr[i7], i7)) {
                        zzq(i7).zzk(zzb.getObject(obj, j7));
                    }
                } else if (zzN(obj, i7)) {
                    zzq(i7).zzk(zzb.getObject(obj, j7));
                }
            }
            this.zzm.zzj(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6 A[LOOP:2: B:53:0x00d5->B:58:0x00e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhkk
    public final boolean zzl(Object obj) {
        int i7;
        int i8;
        List list;
        zzhkk zzhkkVarZzq;
        int i9;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        while (i11 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i13 = iArr[i11];
            int i14 = iArr2[i13];
            int iZzA = zzA(i13);
            int i15 = iArr2[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i12) {
                if (i16 != 1048575) {
                    i10 = zzb.getInt(obj, i16);
                }
                i8 = i10;
                i7 = i16;
            } else {
                int i18 = i10;
                i7 = i12;
                i8 = i18;
            }
            if ((268435456 & iZzA) != 0 && !zzM(obj, i13, i7, i8, i17)) {
                return false;
            }
            int iZzC = zzC(iZzA);
            if (iZzC == 9 || iZzC == 17) {
                if (zzM(obj, i13, i7, i8, i17) && !zzy(obj, iZzA, zzq(i13))) {
                    return false;
                }
            } else if (iZzC == 27) {
                list = (List) zzhlc.zzn(obj, iZzA & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzhkkVarZzq = zzq(i13);
                    for (i9 = 0; i9 < list.size(); i9++) {
                        if (!zzhkkVarZzq.zzl(list.get(i9))) {
                            return false;
                        }
                    }
                }
            } else if (iZzC == 60 || iZzC == 68) {
                if (zzP(obj, i14, i13) && !zzy(obj, iZzA, zzq(i13))) {
                    return false;
                }
            } else if (iZzC == 49) {
                list = (List) zzhlc.zzn(obj, iZzA & 1048575);
                if (list.isEmpty()) {
                    zzhkkVarZzq = zzq(i13);
                    while (i9 < list.size()) {
                        if (!zzhkkVarZzq.zzl(list.get(i9))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzC != 50) {
                continue;
            } else {
                zzhjm zzhjmVar = (zzhjm) zzhlc.zzn(obj, iZzA & 1048575);
                if (!zzhjmVar.isEmpty() && ((zzhjl) zzr(i13)).zze().zzc.zza() == zzhlj.MESSAGE) {
                    zzhkk zzhkkVarZzb = null;
                    for (Object obj2 : zzhjmVar.values()) {
                        if (zzhkkVarZzb == null) {
                            zzhkkVarZzb = zzhkc.zza().zzb(obj2.getClass());
                        }
                        if (!zzhkkVarZzb.zzl(obj2)) {
                            return false;
                        }
                    }
                }
            }
            i11++;
            i12 = i7;
            i10 = i8;
        }
        return !this.zzh || ((zzhid) obj).zza.zze();
    }
}
