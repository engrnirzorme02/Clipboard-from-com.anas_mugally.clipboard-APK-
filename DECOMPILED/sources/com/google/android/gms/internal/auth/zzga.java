package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.internal.ads.zzbbn;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzga<T> implements zzgi<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhj.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfx zzg;
    private final int[] zzh;
    private final int zzi;
    private final int zzj;
    private final zzfl zzk;
    private final zzgz zzl;
    private final zzem zzm;
    private final zzgc zzn;
    private final zzfs zzo;

    private zzga(int[] iArr, Object[] objArr, int i7, int i8, zzfx zzfxVar, int i9, boolean z7, int[] iArr2, int i10, int i11, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i7;
        this.zzf = i8;
        this.zzh = iArr2;
        this.zzi = i10;
        this.zzj = i11;
        this.zzn = zzgcVar;
        this.zzk = zzflVar;
        this.zzl = zzgzVar;
        this.zzm = zzemVar;
        this.zzg = zzfxVar;
        this.zzo = zzfsVar;
    }

    private final void zzA(Object obj, int i7, int i8) {
        zzhj.zzn(obj, zzl(i8) & 1048575, i7);
    }

    private final void zzB(Object obj, int i7, Object obj2) {
        zzb.putObject(obj, zzo(i7) & 1048575, obj2);
        zzz(obj, i7);
    }

    private final void zzC(Object obj, int i7, int i8, Object obj2) {
        zzb.putObject(obj, zzo(i8) & 1048575, obj2);
        zzA(obj, i7, i8);
    }

    private final boolean zzD(Object obj, Object obj2, int i7) {
        return zzE(obj, i7) == zzE(obj2, i7);
    }

    private final boolean zzE(Object obj, int i7) {
        int iZzl = zzl(i7);
        long j7 = iZzl & 1048575;
        if (j7 != 1048575) {
            return (zzhj.zzc(obj, j7) & (1 << (iZzl >>> 20))) != 0;
        }
        int iZzo = zzo(i7);
        long j8 = iZzo & 1048575;
        switch (zzn(iZzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzhj.zza(obj, j8)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhj.zzb(obj, j8)) != 0;
            case 2:
                return zzhj.zzd(obj, j8) != 0;
            case 3:
                return zzhj.zzd(obj, j8) != 0;
            case 4:
                return zzhj.zzc(obj, j8) != 0;
            case 5:
                return zzhj.zzd(obj, j8) != 0;
            case 6:
                return zzhj.zzc(obj, j8) != 0;
            case 7:
                return zzhj.zzt(obj, j8);
            case 8:
                Object objZzf = zzhj.zzf(obj, j8);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzef) {
                    return !zzef.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhj.zzf(obj, j8) != null;
            case 10:
                return !zzef.zzb.equals(zzhj.zzf(obj, j8));
            case 11:
                return zzhj.zzc(obj, j8) != 0;
            case 12:
                return zzhj.zzc(obj, j8) != 0;
            case 13:
                return zzhj.zzc(obj, j8) != 0;
            case 14:
                return zzhj.zzd(obj, j8) != 0;
            case 15:
                return zzhj.zzc(obj, j8) != 0;
            case 16:
                return zzhj.zzd(obj, j8) != 0;
            case 17:
                return zzhj.zzf(obj, j8) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzF(Object obj, int i7, int i8, int i9, int i10) {
        if (i8 == 1048575) {
            return zzE(obj, i7);
        }
        return (i9 & i10) != 0;
    }

    private static boolean zzG(Object obj, int i7, zzgi zzgiVar) {
        return zzgiVar.zzi(zzhj.zzf(obj, i7 & 1048575));
    }

    private static boolean zzH(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzev) {
            return ((zzev) obj).zzm();
        }
        return true;
    }

    private final boolean zzI(Object obj, int i7, int i8) {
        return zzhj.zzc(obj, (long) (zzl(i8) & 1048575)) == i7;
    }

    static zzha zzc(Object obj) {
        zzev zzevVar = (zzev) obj;
        zzha zzhaVar = zzevVar.zzc;
        if (zzhaVar != zzha.zza()) {
            return zzhaVar;
        }
        zzha zzhaVarZzd = zzha.zzd();
        zzevVar.zzc = zzhaVarZzd;
        return zzhaVarZzd;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0254  */
    /* JADX WARN: Code duplicated, block: B:125:0x025a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0270  */
    /* JADX WARN: Code duplicated, block: B:129:0x0273  */
    static zzga zzj(Class cls, zzfu zzfuVar, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        int i7;
        int iCharAt;
        int i8;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
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
        zzgh zzghVar;
        int i24;
        int i25;
        int i26;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        Field fieldZzv;
        char cCharAt9;
        int i27;
        int i28;
        int i29;
        Object obj;
        Field fieldZzv2;
        int i30;
        Object obj2;
        Field fieldZzv3;
        int i31;
        char cCharAt10;
        int i32;
        char cCharAt11;
        int i33;
        char cCharAt12;
        int i34;
        char cCharAt13;
        if (!(zzfuVar instanceof zzgh)) {
            throw null;
        }
        zzgh zzghVar2 = (zzgh) zzfuVar;
        String strZzd = zzghVar2.zzd();
        int length = strZzd.length();
        char c7 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i35 = 1;
            while (true) {
                i7 = i35 + 1;
                if (strZzd.charAt(i35) < 55296) {
                    break;
                }
                i35 = i7;
            }
        } else {
            i7 = 1;
        }
        int i36 = i7 + 1;
        int iCharAt2 = strZzd.charAt(i7);
        if (iCharAt2 >= 55296) {
            int i37 = iCharAt2 & 8191;
            int i38 = 13;
            while (true) {
                i34 = i36 + 1;
                cCharAt13 = strZzd.charAt(i36);
                if (cCharAt13 < 55296) {
                    break;
                }
                i37 |= (cCharAt13 & 8191) << i38;
                i38 += 13;
                i36 = i34;
            }
            iCharAt2 = i37 | (cCharAt13 << i38);
            i36 = i34;
        }
        if (iCharAt2 == 0) {
            i10 = 0;
            iCharAt = 0;
            i9 = 0;
            i11 = 0;
            i8 = 0;
            i12 = 0;
            iArr = zza;
            i13 = 0;
        } else {
            int i39 = i36 + 1;
            int iCharAt3 = strZzd.charAt(i36);
            if (iCharAt3 >= 55296) {
                int i40 = iCharAt3 & 8191;
                int i41 = 13;
                while (true) {
                    i21 = i39 + 1;
                    cCharAt8 = strZzd.charAt(i39);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt8 & 8191) << i41;
                    i41 += 13;
                    i39 = i21;
                }
                iCharAt3 = i40 | (cCharAt8 << i41);
                i39 = i21;
            }
            int i42 = i39 + 1;
            int iCharAt4 = strZzd.charAt(i39);
            if (iCharAt4 >= 55296) {
                int i43 = iCharAt4 & 8191;
                int i44 = 13;
                while (true) {
                    i20 = i42 + 1;
                    cCharAt7 = strZzd.charAt(i42);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt7 & 8191) << i44;
                    i44 += 13;
                    i42 = i20;
                }
                iCharAt4 = i43 | (cCharAt7 << i44);
                i42 = i20;
            }
            int i45 = i42 + 1;
            int iCharAt5 = strZzd.charAt(i42);
            if (iCharAt5 >= 55296) {
                int i46 = iCharAt5 & 8191;
                int i47 = 13;
                while (true) {
                    i19 = i45 + 1;
                    cCharAt6 = strZzd.charAt(i45);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt6 & 8191) << i47;
                    i47 += 13;
                    i45 = i19;
                }
                iCharAt5 = i46 | (cCharAt6 << i47);
                i45 = i19;
            }
            int i48 = i45 + 1;
            int iCharAt6 = strZzd.charAt(i45);
            if (iCharAt6 >= 55296) {
                int i49 = iCharAt6 & 8191;
                int i50 = 13;
                while (true) {
                    i18 = i48 + 1;
                    cCharAt5 = strZzd.charAt(i48);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt5 & 8191) << i50;
                    i50 += 13;
                    i48 = i18;
                }
                iCharAt6 = i49 | (cCharAt5 << i50);
                i48 = i18;
            }
            int i51 = i48 + 1;
            iCharAt = strZzd.charAt(i48);
            if (iCharAt >= 55296) {
                int i52 = iCharAt & 8191;
                int i53 = 13;
                while (true) {
                    i17 = i51 + 1;
                    cCharAt4 = strZzd.charAt(i51);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt4 & 8191) << i53;
                    i53 += 13;
                    i51 = i17;
                }
                iCharAt = i52 | (cCharAt4 << i53);
                i51 = i17;
            }
            int i54 = i51 + 1;
            int iCharAt7 = strZzd.charAt(i51);
            if (iCharAt7 >= 55296) {
                int i55 = iCharAt7 & 8191;
                int i56 = 13;
                while (true) {
                    i16 = i54 + 1;
                    cCharAt3 = strZzd.charAt(i54);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt3 & 8191) << i56;
                    i56 += 13;
                    i54 = i16;
                }
                iCharAt7 = i55 | (cCharAt3 << i56);
                i54 = i16;
            }
            int i57 = i54 + 1;
            int iCharAt8 = strZzd.charAt(i54);
            if (iCharAt8 >= 55296) {
                int i58 = iCharAt8 & 8191;
                int i59 = 13;
                while (true) {
                    i15 = i57 + 1;
                    cCharAt2 = strZzd.charAt(i57);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt2 & 8191) << i59;
                    i59 += 13;
                    i57 = i15;
                }
                iCharAt8 = i58 | (cCharAt2 << i59);
                i57 = i15;
            }
            int i60 = i57 + 1;
            int iCharAt9 = strZzd.charAt(i57);
            if (iCharAt9 >= 55296) {
                int i61 = iCharAt9 & 8191;
                int i62 = 13;
                while (true) {
                    i14 = i60 + 1;
                    cCharAt = strZzd.charAt(i60);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i61 |= (cCharAt & 8191) << i62;
                    i62 += 13;
                    i60 = i14;
                }
                iCharAt9 = i61 | (cCharAt << i62);
                i60 = i14;
            }
            i8 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i63 = iCharAt7;
            i9 = iCharAt5;
            i10 = i63;
            iArr = iArr2;
            i11 = iCharAt6;
            i12 = iCharAt9;
            i13 = iCharAt3;
            i36 = i60;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzghVar2.zze();
        Class<?> cls2 = zzghVar2.zza().getClass();
        int i64 = i12 + i10;
        int i65 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i65];
        int i66 = 0;
        int i67 = 0;
        int i68 = i12;
        int i69 = i64;
        while (i36 < length) {
            int i70 = i36 + 1;
            int iCharAt10 = strZzd.charAt(i36);
            if (iCharAt10 >= c7) {
                int i71 = iCharAt10 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i33 = i72 + 1;
                    cCharAt12 = strZzd.charAt(i72);
                    if (cCharAt12 < c7) {
                        break;
                    }
                    i71 |= (cCharAt12 & 8191) << i73;
                    i73 += 13;
                    i72 = i33;
                }
                iCharAt10 = i71 | (cCharAt12 << i73);
                i22 = i33;
            } else {
                i22 = i70;
            }
            int i74 = i22 + 1;
            int iCharAt11 = strZzd.charAt(i22);
            if (iCharAt11 >= c7) {
                int i75 = iCharAt11 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i32 = i76 + 1;
                    cCharAt11 = strZzd.charAt(i76);
                    if (cCharAt11 < c7) {
                        break;
                    }
                    i75 |= (cCharAt11 & 8191) << i77;
                    i77 += 13;
                    i76 = i32;
                }
                iCharAt11 = i75 | (cCharAt11 << i77);
                i23 = i32;
            } else {
                i23 = i74;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            int i78 = iCharAt11 & 255;
            if (i78 >= 51) {
                int i79 = i23 + 1;
                int iCharAt12 = strZzd.charAt(i23);
                zzghVar = zzghVar2;
                char c8 = 55296;
                if (iCharAt12 >= 55296) {
                    int i80 = iCharAt12 & 8191;
                    int i81 = 13;
                    while (true) {
                        i31 = i79 + 1;
                        cCharAt10 = strZzd.charAt(i79);
                        if (cCharAt10 < c8) {
                            break;
                        }
                        i80 |= (cCharAt10 & 8191) << i81;
                        i81 += 13;
                        i79 = i31;
                        c8 = 55296;
                    }
                    iCharAt12 = i80 | (cCharAt10 << i81);
                    i79 = i31;
                }
                int i82 = i78 - 51;
                if (i82 == 9 || i82 == 17) {
                    int i83 = i67 / 3;
                    i28 = i8 + 1;
                    objArr[i83 + i83 + 1] = objArrZze[i8];
                } else {
                    if (i82 == 12 && (zzghVar.zzc() == 1 || (iCharAt11 & 2048) != 0)) {
                        int i84 = i67 / 3;
                        i28 = i8 + 1;
                        objArr[i84 + i84 + 1] = objArrZze[i8];
                    }
                    i29 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i29];
                    if (obj instanceof Field) {
                        fieldZzv2 = (Field) obj;
                    } else {
                        fieldZzv2 = zzv(cls2, (String) obj);
                        objArrZze[i29] = fieldZzv2;
                    }
                    int i85 = i79;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzv2);
                    i30 = i29 + 1;
                    obj2 = objArrZze[i30];
                    if (obj2 instanceof Field) {
                        fieldZzv3 = (Field) obj2;
                    } else {
                        fieldZzv3 = zzv(cls2, (String) obj2);
                        objArrZze[i30] = fieldZzv3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzv3);
                    strZzd = strZzd;
                    i25 = i85;
                    i26 = 0;
                }
                i8 = i28;
                i29 = iCharAt12 + iCharAt12;
                obj = objArrZze[i29];
                if (obj instanceof Field) {
                    fieldZzv2 = (Field) obj;
                } else {
                    fieldZzv2 = zzv(cls2, (String) obj);
                    objArrZze[i29] = fieldZzv2;
                }
                int i86 = i79;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzv2);
                i30 = i29 + 1;
                obj2 = objArrZze[i30];
                if (obj2 instanceof Field) {
                    fieldZzv3 = (Field) obj2;
                } else {
                    fieldZzv3 = zzv(cls2, (String) obj2);
                    objArrZze[i30] = fieldZzv3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzv3);
                strZzd = strZzd;
                i25 = i86;
                i26 = 0;
            } else {
                zzghVar = zzghVar2;
                int i87 = i8 + 1;
                Field fieldZzv4 = zzv(cls2, (String) objArrZze[i8]);
                if (i78 == 9 || i78 == 17) {
                    i24 = i87;
                    int i88 = i67 / 3;
                    objArr[i88 + i88 + 1] = fieldZzv4.getType();
                } else {
                    if (i78 == 27 || i78 == 49) {
                        int i89 = i67 / 3;
                        i27 = i8 + 2;
                        objArr[i89 + i89 + 1] = objArrZze[i87];
                    } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                        i24 = i87;
                        if (zzghVar.zzc() == 1 || (iCharAt11 & 2048) != 0) {
                            int i90 = i67 / 3;
                            i27 = i8 + 2;
                            objArr[i90 + i90 + 1] = objArrZze[i24];
                        }
                    } else if (i78 == 50) {
                        int i91 = i68 + 1;
                        iArr[i68] = i67;
                        int i92 = i67 / 3;
                        i24 = i8 + 2;
                        int i93 = i92 + i92;
                        objArr[i93] = objArrZze[i87];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr[i93 + 1] = objArrZze[i24];
                            i24 = i8 + 3;
                        }
                        i68 = i91;
                    } else {
                        i24 = i87;
                    }
                    i24 = i27;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzv4);
                int iObjectFieldOffset4 = 1048575;
                if ((iCharAt11 & 4096) == 0 || i78 > 17) {
                    i25 = i23;
                    i26 = 0;
                } else {
                    int i94 = i23 + 1;
                    int iCharAt13 = strZzd.charAt(i23);
                    if (iCharAt13 >= 55296) {
                        int i95 = iCharAt13 & 8191;
                        int i96 = 13;
                        while (true) {
                            i25 = i94 + 1;
                            cCharAt9 = strZzd.charAt(i94);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i95 |= (cCharAt9 & 8191) << i96;
                            i96 += 13;
                            i94 = i25;
                        }
                        iCharAt13 = i95 | (cCharAt9 << i96);
                    } else {
                        i25 = i94;
                    }
                    int i97 = i13 + i13 + (iCharAt13 / 32);
                    Object obj3 = objArrZze[i97];
                    if (obj3 instanceof Field) {
                        fieldZzv = (Field) obj3;
                    } else {
                        fieldZzv = zzv(cls2, (String) obj3);
                        objArrZze[i97] = fieldZzv;
                    }
                    i26 = iCharAt13 % 32;
                    iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzv);
                }
                if (i78 >= 18 && i78 <= 49) {
                    iArr[i69] = iObjectFieldOffset3;
                    i69++;
                }
                iObjectFieldOffset = iObjectFieldOffset3;
                iObjectFieldOffset2 = iObjectFieldOffset4;
                i8 = i24;
            }
            int i98 = i67 + 1;
            iArr3[i67] = iCharAt10;
            int i99 = i67 + 2;
            iArr3[i98] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i78 << 20) | iObjectFieldOffset;
            i67 += 3;
            iArr3[i99] = (i26 << 20) | iObjectFieldOffset2;
            i36 = i25;
            zzghVar2 = zzghVar;
            strZzd = strZzd;
            length = length;
            c7 = 55296;
        }
        zzgh zzghVar3 = zzghVar2;
        return new zzga(iArr3, objArr, i9, i11, zzghVar3.zza(), zzghVar3.zzc(), false, iArr, i12, i64, zzgcVar, zzflVar, zzgzVar, zzemVar, zzfsVar);
    }

    private static int zzk(Object obj, long j7) {
        return ((Integer) zzhj.zzf(obj, j7)).intValue();
    }

    private final int zzl(int i7) {
        return this.zzc[i7 + 2];
    }

    private final int zzm(int i7, int i8) {
        int length = (this.zzc.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int i11 = this.zzc[i10];
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

    private static int zzn(int i7) {
        return (i7 >>> 20) & 255;
    }

    private final int zzo(int i7) {
        return this.zzc[i7 + 1];
    }

    private static long zzp(Object obj, long j7) {
        return ((Long) zzhj.zzf(obj, j7)).longValue();
    }

    private final zzey zzq(int i7) {
        int i8 = i7 / 3;
        return (zzey) this.zzd[i8 + i8 + 1];
    }

    private final zzgi zzr(int i7) {
        int i8 = i7 / 3;
        int i9 = i8 + i8;
        zzgi zzgiVar = (zzgi) this.zzd[i9];
        if (zzgiVar != null) {
            return zzgiVar;
        }
        zzgi zzgiVarZzb = zzgf.zza().zzb((Class) this.zzd[i9 + 1]);
        this.zzd[i9] = zzgiVarZzb;
        return zzgiVarZzb;
    }

    private final Object zzs(int i7) {
        int i8 = i7 / 3;
        return this.zzd[i8 + i8];
    }

    private final Object zzt(Object obj, int i7) {
        zzgi zzgiVarZzr = zzr(i7);
        int iZzo = zzo(i7) & 1048575;
        if (!zzE(obj, i7)) {
            return zzgiVarZzr.zzd();
        }
        Object object = zzb.getObject(obj, iZzo);
        if (zzH(object)) {
            return object;
        }
        Object objZzd = zzgiVarZzr.zzd();
        if (object != null) {
            zzgiVarZzr.zzf(objZzd, object);
        }
        return objZzd;
    }

    private final Object zzu(Object obj, int i7, int i8) {
        zzgi zzgiVarZzr = zzr(i8);
        if (!zzI(obj, i7, i8)) {
            return zzgiVarZzr.zzd();
        }
        Object object = zzb.getObject(obj, zzo(i8) & 1048575);
        if (zzH(object)) {
            return object;
        }
        Object objZzd = zzgiVarZzr.zzd();
        if (object != null) {
            zzgiVarZzr.zzf(objZzd, object);
        }
        return objZzd;
    }

    private static Field zzv(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzw(Object obj) {
        if (!zzH(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzx(Object obj, Object obj2, int i7) {
        if (zzE(obj2, i7)) {
            int iZzo = zzo(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j7 = iZzo;
            Object object = unsafe.getObject(obj2, j7);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + obj2.toString());
            }
            zzgi zzgiVarZzr = zzr(i7);
            if (!zzE(obj, i7)) {
                if (zzH(object)) {
                    Object objZzd = zzgiVarZzr.zzd();
                    zzgiVarZzr.zzf(objZzd, object);
                    unsafe.putObject(obj, j7, objZzd);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                zzz(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!zzH(object2)) {
                Object objZzd2 = zzgiVarZzr.zzd();
                zzgiVarZzr.zzf(objZzd2, object2);
                unsafe.putObject(obj, j7, objZzd2);
                object2 = objZzd2;
            }
            zzgiVarZzr.zzf(object2, object);
        }
    }

    private final void zzy(Object obj, Object obj2, int i7) {
        int i8 = this.zzc[i7];
        if (zzI(obj2, i8, i7)) {
            int iZzo = zzo(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j7 = iZzo;
            Object object = unsafe.getObject(obj2, j7);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + obj2.toString());
            }
            zzgi zzgiVarZzr = zzr(i7);
            if (!zzI(obj, i8, i7)) {
                if (zzH(object)) {
                    Object objZzd = zzgiVarZzr.zzd();
                    zzgiVarZzr.zzf(objZzd, object);
                    unsafe.putObject(obj, j7, objZzd);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                zzA(obj, i8, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!zzH(object2)) {
                Object objZzd2 = zzgiVarZzr.zzd();
                zzgiVarZzr.zzf(objZzd2, object2);
                unsafe.putObject(obj, j7, objZzd2);
                object2 = objZzd2;
            }
            zzgiVarZzr.zzf(object2, object);
        }
    }

    private final void zzz(Object obj, int i7) {
        int iZzl = zzl(i7);
        long j7 = 1048575 & iZzl;
        if (j7 == 1048575) {
            return;
        }
        zzhj.zzn(obj, j7, (1 << (iZzl >>> 20)) | zzhj.zzc(obj, j7));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final int zza(Object obj) {
        int i7;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int length = this.zzc.length;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9 += 3) {
            int iZzo = zzo(i9);
            int i10 = this.zzc[i9];
            long j7 = 1048575 & iZzo;
            int iHashCode = 37;
            switch (zzn(iZzo)) {
                case 0:
                    i7 = i8 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzhj.zza(obj, j7));
                    byte[] bArr = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i8 = i7 + iFloatToIntBits;
                    break;
                case 1:
                    i7 = i8 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzhj.zzb(obj, j7));
                    i8 = i7 + iFloatToIntBits;
                    break;
                case 2:
                    i7 = i8 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j7);
                    byte[] bArr2 = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i8 = i7 + iFloatToIntBits;
                    break;
                case 3:
                    i7 = i8 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j7);
                    byte[] bArr3 = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i8 = i7 + iFloatToIntBits;
                    break;
                case 4:
                    i7 = i8 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j7);
                    i8 = i7 + iFloatToIntBits;
                    break;
                case 5:
                    i7 = i8 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j7);
                    byte[] bArr4 = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i8 = i7 + iFloatToIntBits;
                    break;
                case 6:
                    i7 = i8 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j7);
                    i8 = i7 + iFloatToIntBits;
                    break;
                case 7:
                    i7 = i8 * 53;
                    iFloatToIntBits = zzfa.zza(zzhj.zzt(obj, j7));
                    i8 = i7 + iFloatToIntBits;
                    break;
                case 8:
                    i7 = i8 * 53;
                    iFloatToIntBits = ((String) zzhj.zzf(obj, j7)).hashCode();
                    i8 = i7 + iFloatToIntBits;
                    break;
                case 9:
                    Object objZzf = zzhj.zzf(obj, j7);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i8 = (i8 * 53) + iHashCode;
                    break;
                case 10:
                    i7 = i8 * 53;
                    iFloatToIntBits = zzhj.zzf(obj, j7).hashCode();
                    i8 = i7 + iFloatToIntBits;
                    break;
                case 11:
                    i7 = i8 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j7);
                    i8 = i7 + iFloatToIntBits;
                    break;
                case 12:
                    i7 = i8 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j7);
                    i8 = i7 + iFloatToIntBits;
                    break;
                case 13:
                    i7 = i8 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j7);
                    i8 = i7 + iFloatToIntBits;
                    break;
                case 14:
                    i7 = i8 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j7);
                    byte[] bArr5 = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i8 = i7 + iFloatToIntBits;
                    break;
                case 15:
                    i7 = i8 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j7);
                    i8 = i7 + iFloatToIntBits;
                    break;
                case 16:
                    i7 = i8 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j7);
                    byte[] bArr6 = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i8 = i7 + iFloatToIntBits;
                    break;
                case 17:
                    Object objZzf2 = zzhj.zzf(obj, j7);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i8 = (i8 * 53) + iHashCode;
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
                    i7 = i8 * 53;
                    iFloatToIntBits = zzhj.zzf(obj, j7).hashCode();
                    i8 = i7 + iFloatToIntBits;
                    break;
                case 50:
                    i7 = i8 * 53;
                    iFloatToIntBits = zzhj.zzf(obj, j7).hashCode();
                    i8 = i7 + iFloatToIntBits;
                    break;
                case 51:
                    if (zzI(obj, i10, i9)) {
                        i7 = i8 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) zzhj.zzf(obj, j7)).doubleValue());
                        byte[] bArr7 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i8 = i7 + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzI(obj, i10, i9)) {
                        i7 = i8 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) zzhj.zzf(obj, j7)).floatValue());
                        i8 = i7 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzI(obj, i10, i9)) {
                        i7 = i8 * 53;
                        jDoubleToLongBits = zzp(obj, j7);
                        byte[] bArr8 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i8 = i7 + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzI(obj, i10, i9)) {
                        i7 = i8 * 53;
                        jDoubleToLongBits = zzp(obj, j7);
                        byte[] bArr9 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i8 = i7 + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzI(obj, i10, i9)) {
                        i7 = i8 * 53;
                        iFloatToIntBits = zzk(obj, j7);
                        i8 = i7 + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzI(obj, i10, i9)) {
                        i7 = i8 * 53;
                        jDoubleToLongBits = zzp(obj, j7);
                        byte[] bArr10 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i8 = i7 + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (zzI(obj, i10, i9)) {
                        i7 = i8 * 53;
                        iFloatToIntBits = zzk(obj, j7);
                        i8 = i7 + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzI(obj, i10, i9)) {
                        i7 = i8 * 53;
                        iFloatToIntBits = zzfa.zza(((Boolean) zzhj.zzf(obj, j7)).booleanValue());
                        i8 = i7 + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzI(obj, i10, i9)) {
                        i7 = i8 * 53;
                        iFloatToIntBits = ((String) zzhj.zzf(obj, j7)).hashCode();
                        i8 = i7 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzI(obj, i10, i9)) {
                        i7 = i8 * 53;
                        iFloatToIntBits = zzhj.zzf(obj, j7).hashCode();
                        i8 = i7 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzI(obj, i10, i9)) {
                        i7 = i8 * 53;
                        iFloatToIntBits = zzhj.zzf(obj, j7).hashCode();
                        i8 = i7 + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzI(obj, i10, i9)) {
                        i7 = i8 * 53;
                        iFloatToIntBits = zzk(obj, j7);
                        i8 = i7 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzI(obj, i10, i9)) {
                        i7 = i8 * 53;
                        iFloatToIntBits = zzk(obj, j7);
                        i8 = i7 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzI(obj, i10, i9)) {
                        i7 = i8 * 53;
                        iFloatToIntBits = zzk(obj, j7);
                        i8 = i7 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzI(obj, i10, i9)) {
                        i7 = i8 * 53;
                        jDoubleToLongBits = zzp(obj, j7);
                        byte[] bArr11 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i8 = i7 + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (zzI(obj, i10, i9)) {
                        i7 = i8 * 53;
                        iFloatToIntBits = zzk(obj, j7);
                        i8 = i7 + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzI(obj, i10, i9)) {
                        i7 = i8 * 53;
                        jDoubleToLongBits = zzp(obj, j7);
                        byte[] bArr12 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i8 = i7 + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (zzI(obj, i10, i9)) {
                        i7 = i8 * 53;
                        iFloatToIntBits = zzhj.zzf(obj, j7).hashCode();
                        i8 = i7 + iFloatToIntBits;
                    }
                    break;
            }
        }
        return (i8 * 53) + this.zzl.zzb(obj).hashCode();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 38181. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int zzb(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, com.google.android.gms.internal.auth.zzdt r42) throws com.google.android.gms.internal.auth.zzfb {
        /*
            Method dump skipped, instruction units count: 3818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzdt):int");
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final Object zzd() {
        return ((zzev) this.zzg).zzc();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x007f A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zze(Object obj) {
        if (zzH(obj)) {
            if (obj instanceof zzev) {
                zzev zzevVar = (zzev) obj;
                zzevVar.zzl(C3553a.e.API_PRIORITY_OTHER);
                zzevVar.zza = 0;
                zzevVar.zzj();
            }
            int length = this.zzc.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int iZzo = zzo(i7);
                int i8 = 1048575 & iZzo;
                int iZzn = zzn(iZzo);
                long j7 = i8;
                if (iZzn != 9) {
                    if (iZzn != 60 && iZzn != 68) {
                        switch (iZzn) {
                            case 17:
                                if (zzE(obj, i7)) {
                                    zzr(i7).zze(zzb.getObject(obj, j7));
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
                                this.zzk.zza(obj, j7);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j7);
                                if (object != null) {
                                    ((zzfr) object).zzc();
                                    unsafe.putObject(obj, j7, object);
                                }
                                break;
                        }
                    } else if (zzI(obj, this.zzc[i7], i7)) {
                        zzr(i7).zze(zzb.getObject(obj, j7));
                    }
                } else if (zzE(obj, i7)) {
                    zzr(i7).zze(zzb.getObject(obj, j7));
                }
            }
            this.zzl.zze(obj);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzf(Object obj, Object obj2) {
        zzw(obj);
        obj2.getClass();
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int iZzo = zzo(i7);
            int i8 = this.zzc[i7];
            long j7 = 1048575 & iZzo;
            switch (zzn(iZzo)) {
                case 0:
                    if (zzE(obj2, i7)) {
                        zzhj.zzl(obj, j7, zzhj.zza(obj2, j7));
                        zzz(obj, i7);
                    }
                    break;
                case 1:
                    if (zzE(obj2, i7)) {
                        zzhj.zzm(obj, j7, zzhj.zzb(obj2, j7));
                        zzz(obj, i7);
                    }
                    break;
                case 2:
                    if (zzE(obj2, i7)) {
                        zzhj.zzo(obj, j7, zzhj.zzd(obj2, j7));
                        zzz(obj, i7);
                    }
                    break;
                case 3:
                    if (zzE(obj2, i7)) {
                        zzhj.zzo(obj, j7, zzhj.zzd(obj2, j7));
                        zzz(obj, i7);
                    }
                    break;
                case 4:
                    if (zzE(obj2, i7)) {
                        zzhj.zzn(obj, j7, zzhj.zzc(obj2, j7));
                        zzz(obj, i7);
                    }
                    break;
                case 5:
                    if (zzE(obj2, i7)) {
                        zzhj.zzo(obj, j7, zzhj.zzd(obj2, j7));
                        zzz(obj, i7);
                    }
                    break;
                case 6:
                    if (zzE(obj2, i7)) {
                        zzhj.zzn(obj, j7, zzhj.zzc(obj2, j7));
                        zzz(obj, i7);
                    }
                    break;
                case 7:
                    if (zzE(obj2, i7)) {
                        zzhj.zzk(obj, j7, zzhj.zzt(obj2, j7));
                        zzz(obj, i7);
                    }
                    break;
                case 8:
                    if (zzE(obj2, i7)) {
                        zzhj.zzp(obj, j7, zzhj.zzf(obj2, j7));
                        zzz(obj, i7);
                    }
                    break;
                case 9:
                    zzx(obj, obj2, i7);
                    break;
                case 10:
                    if (zzE(obj2, i7)) {
                        zzhj.zzp(obj, j7, zzhj.zzf(obj2, j7));
                        zzz(obj, i7);
                    }
                    break;
                case 11:
                    if (zzE(obj2, i7)) {
                        zzhj.zzn(obj, j7, zzhj.zzc(obj2, j7));
                        zzz(obj, i7);
                    }
                    break;
                case 12:
                    if (zzE(obj2, i7)) {
                        zzhj.zzn(obj, j7, zzhj.zzc(obj2, j7));
                        zzz(obj, i7);
                    }
                    break;
                case 13:
                    if (zzE(obj2, i7)) {
                        zzhj.zzn(obj, j7, zzhj.zzc(obj2, j7));
                        zzz(obj, i7);
                    }
                    break;
                case 14:
                    if (zzE(obj2, i7)) {
                        zzhj.zzo(obj, j7, zzhj.zzd(obj2, j7));
                        zzz(obj, i7);
                    }
                    break;
                case 15:
                    if (zzE(obj2, i7)) {
                        zzhj.zzn(obj, j7, zzhj.zzc(obj2, j7));
                        zzz(obj, i7);
                    }
                    break;
                case 16:
                    if (zzE(obj2, i7)) {
                        zzhj.zzo(obj, j7, zzhj.zzd(obj2, j7));
                        zzz(obj, i7);
                    }
                    break;
                case 17:
                    zzx(obj, obj2, i7);
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
                    this.zzk.zzb(obj, obj2, j7);
                    break;
                case 50:
                    int i9 = zzgk.zza;
                    zzhj.zzp(obj, j7, zzfs.zza(zzhj.zzf(obj, j7), zzhj.zzf(obj2, j7)));
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
                    if (zzI(obj2, i8, i7)) {
                        zzhj.zzp(obj, j7, zzhj.zzf(obj2, j7));
                        zzA(obj, i8, i7);
                    }
                    break;
                case 60:
                    zzy(obj, obj2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzI(obj2, i8, i7)) {
                        zzhj.zzp(obj, j7, zzhj.zzf(obj2, j7));
                        zzA(obj, i8, i7);
                    }
                    break;
                case 68:
                    zzy(obj, obj2, i7);
                    break;
            }
        }
        zzgk.zzd(this.zzl, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzg(Object obj, byte[] bArr, int i7, int i8, zzdt zzdtVar) throws zzfb {
        zzb(obj, bArr, i7, i8, 0, zzdtVar);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzh(Object obj, Object obj2) {
        boolean zZzf;
        int length = this.zzc.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int iZzo = zzo(i7);
            long j7 = iZzo & 1048575;
            switch (zzn(iZzo)) {
                case 0:
                    if (!zzD(obj, obj2, i7) || Double.doubleToLongBits(zzhj.zza(obj, j7)) != Double.doubleToLongBits(zzhj.zza(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzD(obj, obj2, i7) || Float.floatToIntBits(zzhj.zzb(obj, j7)) != Float.floatToIntBits(zzhj.zzb(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzD(obj, obj2, i7) || zzhj.zzd(obj, j7) != zzhj.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzD(obj, obj2, i7) || zzhj.zzd(obj, j7) != zzhj.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzD(obj, obj2, i7) || zzhj.zzc(obj, j7) != zzhj.zzc(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzD(obj, obj2, i7) || zzhj.zzd(obj, j7) != zzhj.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzD(obj, obj2, i7) || zzhj.zzc(obj, j7) != zzhj.zzc(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzD(obj, obj2, i7) || zzhj.zzt(obj, j7) != zzhj.zzt(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzD(obj, obj2, i7) || !zzgk.zzf(zzhj.zzf(obj, j7), zzhj.zzf(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzD(obj, obj2, i7) || !zzgk.zzf(zzhj.zzf(obj, j7), zzhj.zzf(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzD(obj, obj2, i7) || !zzgk.zzf(zzhj.zzf(obj, j7), zzhj.zzf(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzD(obj, obj2, i7) || zzhj.zzc(obj, j7) != zzhj.zzc(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzD(obj, obj2, i7) || zzhj.zzc(obj, j7) != zzhj.zzc(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzD(obj, obj2, i7) || zzhj.zzc(obj, j7) != zzhj.zzc(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzD(obj, obj2, i7) || zzhj.zzd(obj, j7) != zzhj.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzD(obj, obj2, i7) || zzhj.zzc(obj, j7) != zzhj.zzc(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzD(obj, obj2, i7) || zzhj.zzd(obj, j7) != zzhj.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzD(obj, obj2, i7) || !zzgk.zzf(zzhj.zzf(obj, j7), zzhj.zzf(obj2, j7))) {
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
                    zZzf = zzgk.zzf(zzhj.zzf(obj, j7), zzhj.zzf(obj2, j7));
                    break;
                case 50:
                    zZzf = zzgk.zzf(zzhj.zzf(obj, j7), zzhj.zzf(obj2, j7));
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
                    long jZzl = zzl(i7) & 1048575;
                    if (zzhj.zzc(obj, jZzl) != zzhj.zzc(obj2, jZzl) || !zzgk.zzf(zzhj.zzf(obj, j7), zzhj.zzf(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzf) {
                return false;
            }
        }
        return this.zzl.zzb(obj).equals(this.zzl.zzb(obj2));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzi(Object obj) {
        int i7;
        int i8;
        List list;
        zzgi zzgiVarZzr;
        int i9;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        while (i10 < this.zzi) {
            int i13 = this.zzh[i10];
            int i14 = this.zzc[i13];
            int iZzo = zzo(i13);
            int i15 = this.zzc[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i12) {
                if (i16 != 1048575) {
                    i11 = zzb.getInt(obj, i16);
                }
                i8 = i11;
                i7 = i16;
            } else {
                i7 = i12;
                i8 = i11;
            }
            Object obj2 = obj;
            if ((268435456 & iZzo) != 0 && !zzF(obj2, i13, i7, i8, i17)) {
                return false;
            }
            int iZzn = zzn(iZzo);
            if (iZzn == 9 || iZzn == 17) {
                if (zzF(obj2, i13, i7, i8, i17) && !zzG(obj2, iZzo, zzr(i13))) {
                    return false;
                }
            } else if (iZzn == 27) {
                list = (List) zzhj.zzf(obj2, iZzo & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgiVarZzr = zzr(i13);
                    for (i9 = 0; i9 < list.size(); i9++) {
                        if (!zzgiVarZzr.zzi(list.get(i9))) {
                            return false;
                        }
                    }
                }
            } else if (iZzn == 60 || iZzn == 68) {
                if (zzI(obj2, i14, i13) && !zzG(obj2, iZzo, zzr(i13))) {
                    return false;
                }
            } else if (iZzn == 49) {
                list = (List) zzhj.zzf(obj2, iZzo & 1048575);
                if (list.isEmpty()) {
                    zzgiVarZzr = zzr(i13);
                    while (i9 < list.size()) {
                        if (!zzgiVarZzr.zzi(list.get(i9))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzn == 50 && !((zzfr) zzhj.zzf(obj2, iZzo & 1048575)).isEmpty()) {
                throw null;
            }
            i10++;
            obj = obj2;
            i12 = i7;
            i11 = i8;
        }
        return true;
    }
}
