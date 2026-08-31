package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.internal.ads.zzbbn;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzgo<T> implements zzgv<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzho.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgl zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzhh zzl;
    private final zzev zzm;

    private zzgo(int[] iArr, Object[] objArr, int i7, int i8, zzgl zzglVar, boolean z7, int[] iArr2, int i9, int i10, zzgq zzgqVar, zzfy zzfyVar, zzhh zzhhVar, zzev zzevVar, zzgg zzggVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i7;
        this.zzf = i8;
        boolean z8 = false;
        if (zzevVar != null && (zzglVar instanceof zzff)) {
            z8 = true;
        }
        this.zzh = z8;
        this.zzi = iArr2;
        this.zzj = i9;
        this.zzk = i10;
        this.zzl = zzhhVar;
        this.zzm = zzevVar;
        this.zzg = zzglVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzB(Object obj, Object obj2, int i7) {
        if (zzI(obj2, i7)) {
            int iZzs = zzs(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j7 = iZzs;
            Object object = unsafe.getObject(obj2, j7);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + obj2.toString());
            }
            zzgv zzgvVarZzv = zzv(i7);
            if (!zzI(obj, i7)) {
                if (zzL(object)) {
                    Object objZze = zzgvVarZzv.zze();
                    zzgvVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j7, objZze);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                zzD(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!zzL(object2)) {
                Object objZze2 = zzgvVarZzv.zze();
                zzgvVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j7, objZze2);
                object2 = objZze2;
            }
            zzgvVarZzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i7) {
        int[] iArr = this.zzc;
        int i8 = iArr[i7];
        if (zzM(obj2, i8, i7)) {
            int iZzs = zzs(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j7 = iZzs;
            Object object = unsafe.getObject(obj2, j7);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i7] + " is present but null: " + obj2.toString());
            }
            zzgv zzgvVarZzv = zzv(i7);
            if (!zzM(obj, i8, i7)) {
                if (zzL(object)) {
                    Object objZze = zzgvVarZzv.zze();
                    zzgvVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j7, objZze);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                zzE(obj, i8, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!zzL(object2)) {
                Object objZze2 = zzgvVarZzv.zze();
                zzgvVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j7, objZze2);
                object2 = objZze2;
            }
            zzgvVarZzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i7) {
        int iZzp = zzp(i7);
        long j7 = 1048575 & iZzp;
        if (j7 == 1048575) {
            return;
        }
        zzho.zzq(obj, j7, (1 << (iZzp >>> 20)) | zzho.zzc(obj, j7));
    }

    private final void zzE(Object obj, int i7, int i8) {
        zzho.zzq(obj, zzp(i8) & 1048575, i7);
    }

    private final void zzF(Object obj, int i7, Object obj2) {
        zzb.putObject(obj, zzs(i7) & 1048575, obj2);
        zzD(obj, i7);
    }

    private final void zzG(Object obj, int i7, int i8, Object obj2) {
        zzb.putObject(obj, zzs(i8) & 1048575, obj2);
        zzE(obj, i7, i8);
    }

    private final boolean zzH(Object obj, Object obj2, int i7) {
        return zzI(obj, i7) == zzI(obj2, i7);
    }

    private final boolean zzI(Object obj, int i7) {
        int iZzp = zzp(i7);
        long j7 = iZzp & 1048575;
        if (j7 != 1048575) {
            return (zzho.zzc(obj, j7) & (1 << (iZzp >>> 20))) != 0;
        }
        int iZzs = zzs(i7);
        long j8 = iZzs & 1048575;
        switch (zzr(iZzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzho.zza(obj, j8)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzho.zzb(obj, j8)) != 0;
            case 2:
                return zzho.zzd(obj, j8) != 0;
            case 3:
                return zzho.zzd(obj, j8) != 0;
            case 4:
                return zzho.zzc(obj, j8) != 0;
            case 5:
                return zzho.zzd(obj, j8) != 0;
            case 6:
                return zzho.zzc(obj, j8) != 0;
            case 7:
                return zzho.zzw(obj, j8);
            case 8:
                Object objZzf = zzho.zzf(obj, j8);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzei) {
                    return !zzei.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzho.zzf(obj, j8) != null;
            case 10:
                return !zzei.zzb.equals(zzho.zzf(obj, j8));
            case 11:
                return zzho.zzc(obj, j8) != 0;
            case 12:
                return zzho.zzc(obj, j8) != 0;
            case 13:
                return zzho.zzc(obj, j8) != 0;
            case 14:
                return zzho.zzd(obj, j8) != 0;
            case 15:
                return zzho.zzc(obj, j8) != 0;
            case 16:
                return zzho.zzd(obj, j8) != 0;
            case 17:
                return zzho.zzf(obj, j8) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i7, int i8, int i9, int i10) {
        if (i8 == 1048575) {
            return zzI(obj, i7);
        }
        return (i9 & i10) != 0;
    }

    private static boolean zzK(Object obj, int i7, zzgv zzgvVar) {
        return zzgvVar.zzk(zzho.zzf(obj, i7 & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzfi) {
            return ((zzfi) obj).zzz();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i7, int i8) {
        return zzho.zzc(obj, (long) (zzp(i8) & 1048575)) == i7;
    }

    private static boolean zzN(Object obj, long j7) {
        return ((Boolean) zzho.zzf(obj, j7)).booleanValue();
    }

    private static final void zzO(int i7, Object obj, zzhu zzhuVar) {
        if (obj instanceof String) {
            zzhuVar.zzG(i7, (String) obj);
        } else {
            zzhuVar.zzd(i7, (zzei) obj);
        }
    }

    static zzhi zzd(Object obj) {
        zzfi zzfiVar = (zzfi) obj;
        zzhi zzhiVar = zzfiVar.zzc;
        if (zzhiVar != zzhi.zzc()) {
            return zzhiVar;
        }
        zzhi zzhiVarZzf = zzhi.zzf();
        zzfiVar.zzc = zzhiVarZzf;
        return zzhiVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0274  */
    /* JADX WARN: Code duplicated, block: B:131:0x028c  */
    /* JADX WARN: Code duplicated, block: B:132:0x028f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0350  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:190:0x03b0  */
    static zzgo zzl(Class cls, zzgi zzgiVar, zzgq zzgqVar, zzfy zzfyVar, zzhh zzhhVar, zzev zzevVar, zzgg zzggVar) {
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
        Field fieldZzz;
        char cCharAt9;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        Object obj;
        Field fieldZzz2;
        int i33;
        Object obj2;
        Field fieldZzz3;
        int i34;
        char cCharAt10;
        int i35;
        char cCharAt11;
        int i36;
        char cCharAt12;
        int i37;
        char cCharAt13;
        if (!(zzgiVar instanceof zzgu)) {
            throw null;
        }
        zzgu zzguVar = (zzgu) zzgiVar;
        String strZzd = zzguVar.zzd();
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
        Object[] objArrZze = zzguVar.zze();
        Class<?> cls2 = zzguVar.zza().getClass();
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
            zzgu zzguVar2 = zzguVar;
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
                    } else if (zzguVar2.zzc() == 1 || i83 != 0) {
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
                        fieldZzz2 = (Field) obj;
                    } else {
                        fieldZzz2 = zzz(cls2, (String) obj);
                        objArrZze[i32] = fieldZzz2;
                    }
                    int i93 = i13;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz2);
                    i33 = i32 + 1;
                    obj2 = objArrZze[i33];
                    i24 = i93;
                    if (obj2 instanceof Field) {
                        fieldZzz3 = (Field) obj2;
                    } else {
                        fieldZzz3 = zzz(cls2, (String) obj2);
                        objArrZze[i33] = fieldZzz3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz3);
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
                    fieldZzz2 = (Field) obj;
                } else {
                    fieldZzz2 = zzz(cls2, (String) obj);
                    objArrZze[i32] = fieldZzz2;
                }
                int i95 = i13;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz2);
                i33 = i32 + 1;
                obj2 = objArrZze[i33];
                i24 = i95;
                if (obj2 instanceof Field) {
                    fieldZzz3 = (Field) obj2;
                } else {
                    fieldZzz3 = zzz(cls2, (String) obj2);
                    objArrZze[i33] = fieldZzz3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz3);
                strZzd = strZzd;
                i26 = i94;
                i23 = i88;
                i25 = 0;
                c7 = 55296;
            } else {
                i24 = i13;
                int i96 = i12 + 1;
                Field fieldZzz4 = zzz(cls2, (String) objArrZze[i12]);
                if (i82 == 9 || i82 == 17) {
                    int i97 = i73 / 3;
                    objArr[i97 + i97 + 1] = fieldZzz4.getType();
                } else {
                    if (i82 != 27) {
                        if (i82 == 49) {
                            i12 += 2;
                            i28 = 1;
                        } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                            if (zzguVar2.zzc() == 1 || i83 != 0) {
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
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
                                fieldZzz = (Field) obj3;
                            } else {
                                fieldZzz = zzz(cls2, (String) obj3);
                                objArrZze[i106] = fieldZzz;
                            }
                            int i107 = iCharAt13;
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzz);
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
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
            zzguVar = zzguVar2;
            length = length;
            i13 = i24;
        }
        return new zzgo(iArr3, objArr, i8, i10, zzguVar.zza(), false, iArr, i11, i68, zzgqVar, zzfyVar, zzhhVar, zzevVar, zzggVar);
    }

    private static double zzm(Object obj, long j7) {
        return ((Double) zzho.zzf(obj, j7)).doubleValue();
    }

    private static float zzn(Object obj, long j7) {
        return ((Float) zzho.zzf(obj, j7)).floatValue();
    }

    private static int zzo(Object obj, long j7) {
        return ((Integer) zzho.zzf(obj, j7)).intValue();
    }

    private final int zzp(int i7) {
        return this.zzc[i7 + 2];
    }

    private final int zzq(int i7, int i8) {
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

    private static int zzr(int i7) {
        return (i7 >>> 20) & 255;
    }

    private final int zzs(int i7) {
        return this.zzc[i7 + 1];
    }

    private static long zzt(Object obj, long j7) {
        return ((Long) zzho.zzf(obj, j7)).longValue();
    }

    private final zzfl zzu(int i7) {
        int i8 = i7 / 3;
        return (zzfl) this.zzd[i8 + i8 + 1];
    }

    private final zzgv zzv(int i7) {
        Object[] objArr = this.zzd;
        int i8 = i7 / 3;
        int i9 = i8 + i8;
        zzgv zzgvVar = (zzgv) objArr[i9];
        if (zzgvVar != null) {
            return zzgvVar;
        }
        zzgv zzgvVarZzb = zzgs.zza().zzb((Class) objArr[i9 + 1]);
        objArr[i9] = zzgvVarZzb;
        return zzgvVarZzb;
    }

    private final Object zzw(int i7) {
        int i8 = i7 / 3;
        return this.zzd[i8 + i8];
    }

    private final Object zzx(Object obj, int i7) {
        zzgv zzgvVarZzv = zzv(i7);
        int iZzs = zzs(i7) & 1048575;
        if (!zzI(obj, i7)) {
            return zzgvVarZzv.zze();
        }
        Object object = zzb.getObject(obj, iZzs);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzgvVarZzv.zze();
        if (object != null) {
            zzgvVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzy(Object obj, int i7, int i8) {
        zzgv zzgvVarZzv = zzv(i8);
        if (!zzM(obj, i7, i8)) {
            return zzgvVarZzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i8) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzgvVarZzv.zze();
        if (object != null) {
            zzgvVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e7) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e7);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:144:0x03ac A[PHI: r17
      0x03ac: PHI (r17v46 int) = (r17v29 int), (r17v30 int), (r17v33 int), (r17v39 int), (r17v40 int), (r17v43 int), (r17v47 int) binds: [B:211:0x056c, B:207:0x054e, B:201:0x0515, B:159:0x041d, B:155:0x0401, B:149:0x03cb, B:143:0x03aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:182:0x04b1 A[PHI: r17
      0x04b1: PHI (r17v35 int) = (r17v28 int), (r17v36 int) binds: [B:215:0x058a, B:181:0x04af] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final int zza(Object obj) {
        int i7;
        int i8;
        int iZzC;
        int iZzC2;
        int iZzD;
        int iZzC3;
        int iZzC4;
        int iZzC5;
        int iZzd;
        int iZzC6;
        int iZzh;
        int iZzg;
        int size;
        int iZzl;
        int iZzC7;
        int iZzC8;
        int iZzC9;
        int iZze;
        int iZzC10;
        int iZzC11;
        int iZzy;
        int iZzC12;
        int iZzC13;
        int iZzC14;
        int iZzD2;
        int iZzC15;
        int iZzC16;
        int iZzd2;
        int iZzC17;
        zzgo<T> zzgoVar = this;
        int i9 = 1;
        Unsafe unsafe = zzb;
        int i10 = 0;
        int i11 = 0;
        int iZzC18 = 0;
        int i12 = 1048575;
        while (true) {
            int[] iArr = zzgoVar.zzc;
            if (i10 >= iArr.length) {
                int iZza = iZzC18 + ((zzfi) obj).zzc.zza();
                if (!zzgoVar.zzh) {
                    return iZza;
                }
                zzhd zzhdVar = ((zzff) obj).zzb.zza;
                int iZzc = zzhdVar.zzc();
                int iZzc2 = 0;
                for (int i13 = 0; i13 < iZzc; i13++) {
                    Map.Entry entryZzg = zzhdVar.zzg(i13);
                    iZzc2 += zzez.zzc((zzey) ((zzgz) entryZzg).zza(), entryZzg.getValue());
                }
                for (Map.Entry entry : zzhdVar.zzd()) {
                    iZzc2 += zzez.zzc((zzey) entry.getKey(), entry.getValue());
                }
                return iZza + iZzc2;
            }
            int iZzs = zzgoVar.zzs(i10);
            int iZzr = zzr(iZzs);
            int i14 = iArr[i10];
            int i15 = iArr[i10 + 2];
            int i16 = i15 & 1048575;
            if (iZzr <= 17) {
                if (i16 != i12) {
                    i11 = i16 == 1048575 ? 0 : unsafe.getInt(obj, i16);
                    i12 = i16;
                }
                i7 = i9 << (i15 >>> 20);
            } else {
                i7 = 0;
            }
            int i17 = iZzs & 1048575;
            if (iZzr >= zzfa.zzJ.zza()) {
                zzfa.zzW.zza();
            }
            long j7 = i17;
            switch (iZzr) {
                case 0:
                    i8 = i9;
                    if (zzgoVar.zzJ(obj, i10, i12, i11, i7)) {
                        iZzC18 += zzep.zzC(i14 << 3) + 8;
                    }
                    i10 += 3;
                    i9 = i8;
                    break;
                case 1:
                    i8 = i9;
                    if (zzgoVar.zzJ(obj, i10, i12, i11, i7)) {
                        iZzC = zzep.zzC(i14 << 3);
                        iZzC4 = iZzC + 4;
                        iZzC18 += iZzC4;
                    }
                    zzgoVar = this;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 2:
                    i8 = i9;
                    if (zzgoVar.zzJ(obj, i10, i12, i11, i7)) {
                        long j8 = unsafe.getLong(obj, j7);
                        iZzC2 = zzep.zzC(i14 << 3);
                        iZzD = zzep.zzD(j8);
                        iZzC4 = iZzC2 + iZzD;
                        iZzC18 += iZzC4;
                    }
                    zzgoVar = this;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 3:
                    i8 = i9;
                    if (zzgoVar.zzJ(obj, i10, i12, i11, i7)) {
                        long j9 = unsafe.getLong(obj, j7);
                        iZzC2 = zzep.zzC(i14 << 3);
                        iZzD = zzep.zzD(j9);
                        iZzC4 = iZzC2 + iZzD;
                        iZzC18 += iZzC4;
                    }
                    zzgoVar = this;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 4:
                    i8 = i9;
                    if (zzgoVar.zzJ(obj, i10, i12, i11, i7)) {
                        long j10 = unsafe.getInt(obj, j7);
                        iZzC2 = zzep.zzC(i14 << 3);
                        iZzD = zzep.zzD(j10);
                        iZzC4 = iZzC2 + iZzD;
                        iZzC18 += iZzC4;
                    }
                    zzgoVar = this;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 5:
                    i8 = i9;
                    if (zzgoVar.zzJ(obj, i10, i12, i11, i7)) {
                        iZzC3 = zzep.zzC(i14 << 3);
                        iZzC4 = iZzC3 + 8;
                        iZzC18 += iZzC4;
                    }
                    zzgoVar = this;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 6:
                    i8 = i9;
                    if (zzgoVar.zzJ(obj, i10, i12, i11, i7)) {
                        iZzC = zzep.zzC(i14 << 3);
                        iZzC4 = iZzC + 4;
                        iZzC18 += iZzC4;
                    }
                    zzgoVar = this;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 7:
                    i8 = i9;
                    if (zzgoVar.zzJ(obj, i10, i12, i11, i7)) {
                        iZzC4 = zzep.zzC(i14 << 3) + 1;
                        iZzC18 += iZzC4;
                    }
                    zzgoVar = this;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 8:
                    i8 = i9;
                    if (zzgoVar.zzJ(obj, i10, i12, i11, i7)) {
                        int i18 = i14 << 3;
                        Object object = unsafe.getObject(obj, j7);
                        if (object instanceof zzei) {
                            iZzC5 = zzep.zzC(i18);
                            iZzd = ((zzei) object).zzd();
                            iZzC6 = zzep.zzC(iZzd);
                            iZzC4 = iZzC5 + iZzC6 + iZzd;
                            iZzC18 += iZzC4;
                        } else {
                            iZzC2 = zzep.zzC(i18);
                            iZzD = zzep.zzB((String) object);
                            iZzC4 = iZzC2 + iZzD;
                            iZzC18 += iZzC4;
                        }
                    }
                    zzgoVar = this;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 9:
                    i8 = i9;
                    if (zzgoVar.zzJ(obj, i10, i12, i11, i7)) {
                        iZzh = zzgx.zzh(i14, unsafe.getObject(obj, j7), zzgoVar.zzv(i10));
                        iZzC18 += iZzh;
                    }
                    i10 += 3;
                    i9 = i8;
                    break;
                case 10:
                    i8 = i9;
                    if (zzgoVar.zzJ(obj, i10, i12, i11, i7)) {
                        zzei zzeiVar = (zzei) unsafe.getObject(obj, j7);
                        iZzC5 = zzep.zzC(i14 << 3);
                        iZzd = zzeiVar.zzd();
                        iZzC6 = zzep.zzC(iZzd);
                        iZzC4 = iZzC5 + iZzC6 + iZzd;
                        iZzC18 += iZzC4;
                    }
                    zzgoVar = this;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 11:
                    i8 = i9;
                    if (zzgoVar.zzJ(obj, i10, i12, i11, i7)) {
                        int i19 = unsafe.getInt(obj, j7);
                        iZzC2 = zzep.zzC(i14 << 3);
                        iZzD = zzep.zzC(i19);
                        iZzC4 = iZzC2 + iZzD;
                        iZzC18 += iZzC4;
                    }
                    zzgoVar = this;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 12:
                    i8 = i9;
                    if (zzgoVar.zzJ(obj, i10, i12, i11, i7)) {
                        long j11 = unsafe.getInt(obj, j7);
                        iZzC2 = zzep.zzC(i14 << 3);
                        iZzD = zzep.zzD(j11);
                        iZzC4 = iZzC2 + iZzD;
                        iZzC18 += iZzC4;
                    }
                    zzgoVar = this;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 13:
                    i8 = i9;
                    if (zzgoVar.zzJ(obj, i10, i12, i11, i7)) {
                        iZzC = zzep.zzC(i14 << 3);
                        iZzC4 = iZzC + 4;
                        iZzC18 += iZzC4;
                    }
                    zzgoVar = this;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 14:
                    i8 = i9;
                    if (zzgoVar.zzJ(obj, i10, i12, i11, i7)) {
                        iZzC3 = zzep.zzC(i14 << 3);
                        iZzC4 = iZzC3 + 8;
                        iZzC18 += iZzC4;
                    }
                    zzgoVar = this;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 15:
                    i8 = i9;
                    if (zzgoVar.zzJ(obj, i10, i12, i11, i7)) {
                        int i20 = unsafe.getInt(obj, j7);
                        iZzC2 = zzep.zzC(i14 << 3);
                        iZzD = zzep.zzC((i20 >> 31) ^ (i20 + i20));
                        iZzC4 = iZzC2 + iZzD;
                        iZzC18 += iZzC4;
                    }
                    zzgoVar = this;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 16:
                    i8 = i9;
                    if (zzgoVar.zzJ(obj, i10, i12, i11, i7)) {
                        long j12 = unsafe.getLong(obj, j7);
                        iZzC2 = zzep.zzC(i14 << 3);
                        iZzD = zzep.zzD((j12 >> 63) ^ (j12 + j12));
                        iZzC4 = iZzC2 + iZzD;
                        iZzC18 += iZzC4;
                    }
                    zzgoVar = this;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 17:
                    i8 = i9;
                    if (zzgoVar.zzJ(obj, i10, i12, i11, i7)) {
                        iZzh = zzep.zzy(i14, (zzgl) unsafe.getObject(obj, j7), zzgoVar.zzv(i10));
                        iZzC18 += iZzh;
                    }
                    i10 += 3;
                    i9 = i8;
                    break;
                case 18:
                    i8 = i9;
                    iZzh = zzgx.zzd(i14, (List) unsafe.getObject(obj, j7), false);
                    iZzC18 += iZzh;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 19:
                    i8 = i9;
                    iZzh = zzgx.zzb(i14, (List) unsafe.getObject(obj, j7), false);
                    iZzC18 += iZzh;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 20:
                    i8 = i9;
                    List list = (List) unsafe.getObject(obj, j7);
                    int i21 = zzgx.zza;
                    if (list.size() == 0) {
                        iZzg = 0;
                    } else {
                        iZzg = zzgx.zzg(list) + (list.size() * zzep.zzC(i14 << 3));
                    }
                    iZzC18 += iZzg;
                    i10 += 3;
                    i9 = i8;
                    break;
                case zzbbn.zzt.zzm /* 21 */:
                    i8 = i9;
                    List list2 = (List) unsafe.getObject(obj, j7);
                    int i22 = zzgx.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzgx.zzl(list2);
                        iZzC7 = zzep.zzC(i14 << 3);
                        iZzh = iZzl + (size * iZzC7);
                    }
                    iZzC18 += iZzh;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 22:
                    i8 = i9;
                    List list3 = (List) unsafe.getObject(obj, j7);
                    int i23 = zzgx.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzgx.zzf(list3);
                        iZzC7 = zzep.zzC(i14 << 3);
                        iZzh = iZzl + (size * iZzC7);
                    }
                    iZzC18 += iZzh;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 23:
                    i8 = i9;
                    iZzh = zzgx.zzd(i14, (List) unsafe.getObject(obj, j7), false);
                    iZzC18 += iZzh;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 24:
                    i8 = i9;
                    iZzh = zzgx.zzb(i14, (List) unsafe.getObject(obj, j7), false);
                    iZzC18 += iZzh;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 25:
                    i8 = i9;
                    List list4 = (List) unsafe.getObject(obj, j7);
                    int i24 = zzgx.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZzh = 0;
                    } else {
                        iZzh = size2 * (zzep.zzC(i14 << 3) + 1);
                    }
                    iZzC18 += iZzh;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 26:
                    i8 = i9;
                    List list5 = (List) unsafe.getObject(obj, j7);
                    int i25 = zzgx.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzg = 0;
                    } else {
                        iZzg = zzep.zzC(i14 << 3) * size3;
                        if (list5 instanceof zzfx) {
                            zzfx zzfxVar = (zzfx) list5;
                            for (int i26 = 0; i26 < size3; i26++) {
                                Object objZza = zzfxVar.zza();
                                if (objZza instanceof zzei) {
                                    int iZzd3 = ((zzei) objZza).zzd();
                                    iZzg += zzep.zzC(iZzd3) + iZzd3;
                                } else {
                                    iZzg += zzep.zzB((String) objZza);
                                }
                            }
                        } else {
                            for (int i27 = 0; i27 < size3; i27++) {
                                Object obj2 = list5.get(i27);
                                if (obj2 instanceof zzei) {
                                    int iZzd4 = ((zzei) obj2).zzd();
                                    iZzg += zzep.zzC(iZzd4) + iZzd4;
                                } else {
                                    iZzg += zzep.zzB((String) obj2);
                                }
                            }
                        }
                    }
                    iZzC18 += iZzg;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 27:
                    i8 = i9;
                    List list6 = (List) unsafe.getObject(obj, j7);
                    zzgv zzgvVarZzv = zzgoVar.zzv(i10);
                    int i28 = zzgx.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzC8 = 0;
                    } else {
                        iZzC8 = zzep.zzC(i14 << 3) * size4;
                        for (int i29 = 0; i29 < size4; i29++) {
                            Object obj3 = list6.get(i29);
                            if (obj3 instanceof zzfw) {
                                int iZza2 = ((zzfw) obj3).zza();
                                iZzC8 += zzep.zzC(iZza2) + iZza2;
                            } else {
                                iZzC8 += zzep.zzA((zzgl) obj3, zzgvVarZzv);
                            }
                        }
                    }
                    iZzC18 += iZzC8;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 28:
                    i8 = i9;
                    List list7 = (List) unsafe.getObject(obj, j7);
                    int i30 = zzgx.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzC9 = 0;
                    } else {
                        iZzC9 = size5 * zzep.zzC(i14 << 3);
                        for (int i31 = 0; i31 < list7.size(); i31++) {
                            int iZzd5 = ((zzei) list7.get(i31)).zzd();
                            iZzC9 += zzep.zzC(iZzd5) + iZzd5;
                        }
                    }
                    iZzC18 += iZzC9;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 29:
                    i8 = i9;
                    List list8 = (List) unsafe.getObject(obj, j7);
                    int i32 = zzgx.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzgx.zzk(list8);
                        iZzC7 = zzep.zzC(i14 << 3);
                        iZzh = iZzl + (size * iZzC7);
                    }
                    iZzC18 += iZzh;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 30:
                    i8 = i9;
                    List list9 = (List) unsafe.getObject(obj, j7);
                    int i33 = zzgx.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzgx.zza(list9);
                        iZzC7 = zzep.zzC(i14 << 3);
                        iZzh = iZzl + (size * iZzC7);
                    }
                    iZzC18 += iZzh;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 31:
                    i8 = i9;
                    iZzh = zzgx.zzb(i14, (List) unsafe.getObject(obj, j7), false);
                    iZzC18 += iZzh;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 32:
                    i8 = i9;
                    iZzh = zzgx.zzd(i14, (List) unsafe.getObject(obj, j7), false);
                    iZzC18 += iZzh;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 33:
                    i8 = i9;
                    List list10 = (List) unsafe.getObject(obj, j7);
                    int i34 = zzgx.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzgx.zzi(list10);
                        iZzC7 = zzep.zzC(i14 << 3);
                        iZzh = iZzl + (size * iZzC7);
                    }
                    iZzC18 += iZzh;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 34:
                    i8 = i9;
                    List list11 = (List) unsafe.getObject(obj, j7);
                    int i35 = zzgx.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzgx.zzj(list11);
                        iZzC7 = zzep.zzC(i14 << 3);
                        iZzh = iZzl + (size * iZzC7);
                    }
                    iZzC18 += iZzh;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 35:
                    i8 = i9;
                    iZze = zzgx.zze((List) unsafe.getObject(obj, j7));
                    if (iZze > 0) {
                        iZzC10 = zzep.zzC(i14 << 3);
                        iZzC11 = zzep.zzC(iZze);
                        iZzC9 = iZzC10 + iZzC11 + iZze;
                        iZzC18 += iZzC9;
                    }
                    i10 += 3;
                    i9 = i8;
                    break;
                case 36:
                    i8 = i9;
                    iZze = zzgx.zzc((List) unsafe.getObject(obj, j7));
                    if (iZze > 0) {
                        iZzC10 = zzep.zzC(i14 << 3);
                        iZzC11 = zzep.zzC(iZze);
                        iZzC9 = iZzC10 + iZzC11 + iZze;
                        iZzC18 += iZzC9;
                    }
                    i10 += 3;
                    i9 = i8;
                    break;
                case 37:
                    i8 = i9;
                    iZze = zzgx.zzg((List) unsafe.getObject(obj, j7));
                    if (iZze > 0) {
                        iZzC10 = zzep.zzC(i14 << 3);
                        iZzC11 = zzep.zzC(iZze);
                        iZzC9 = iZzC10 + iZzC11 + iZze;
                        iZzC18 += iZzC9;
                    }
                    i10 += 3;
                    i9 = i8;
                    break;
                case 38:
                    i8 = i9;
                    iZze = zzgx.zzl((List) unsafe.getObject(obj, j7));
                    if (iZze > 0) {
                        iZzC10 = zzep.zzC(i14 << 3);
                        iZzC11 = zzep.zzC(iZze);
                        iZzC9 = iZzC10 + iZzC11 + iZze;
                        iZzC18 += iZzC9;
                    }
                    i10 += 3;
                    i9 = i8;
                    break;
                case 39:
                    i8 = i9;
                    iZze = zzgx.zzf((List) unsafe.getObject(obj, j7));
                    if (iZze > 0) {
                        iZzC10 = zzep.zzC(i14 << 3);
                        iZzC11 = zzep.zzC(iZze);
                        iZzC9 = iZzC10 + iZzC11 + iZze;
                        iZzC18 += iZzC9;
                    }
                    i10 += 3;
                    i9 = i8;
                    break;
                case 40:
                    i8 = i9;
                    iZze = zzgx.zze((List) unsafe.getObject(obj, j7));
                    if (iZze > 0) {
                        iZzC10 = zzep.zzC(i14 << 3);
                        iZzC11 = zzep.zzC(iZze);
                        iZzC9 = iZzC10 + iZzC11 + iZze;
                        iZzC18 += iZzC9;
                    }
                    i10 += 3;
                    i9 = i8;
                    break;
                case 41:
                    i8 = i9;
                    iZze = zzgx.zzc((List) unsafe.getObject(obj, j7));
                    if (iZze > 0) {
                        iZzC10 = zzep.zzC(i14 << 3);
                        iZzC11 = zzep.zzC(iZze);
                        iZzC9 = iZzC10 + iZzC11 + iZze;
                        iZzC18 += iZzC9;
                    }
                    i10 += 3;
                    i9 = i8;
                    break;
                case 42:
                    i8 = i9;
                    List list12 = (List) unsafe.getObject(obj, j7);
                    int i36 = zzgx.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzC10 = zzep.zzC(i14 << 3);
                        iZzC11 = zzep.zzC(iZze);
                        iZzC9 = iZzC10 + iZzC11 + iZze;
                        iZzC18 += iZzC9;
                    }
                    i10 += 3;
                    i9 = i8;
                    break;
                case 43:
                    i8 = i9;
                    iZze = zzgx.zzk((List) unsafe.getObject(obj, j7));
                    if (iZze > 0) {
                        iZzC10 = zzep.zzC(i14 << 3);
                        iZzC11 = zzep.zzC(iZze);
                        iZzC9 = iZzC10 + iZzC11 + iZze;
                        iZzC18 += iZzC9;
                    }
                    i10 += 3;
                    i9 = i8;
                    break;
                case 44:
                    i8 = i9;
                    iZze = zzgx.zza((List) unsafe.getObject(obj, j7));
                    if (iZze > 0) {
                        iZzC10 = zzep.zzC(i14 << 3);
                        iZzC11 = zzep.zzC(iZze);
                        iZzC9 = iZzC10 + iZzC11 + iZze;
                        iZzC18 += iZzC9;
                    }
                    i10 += 3;
                    i9 = i8;
                    break;
                case 45:
                    i8 = i9;
                    iZze = zzgx.zzc((List) unsafe.getObject(obj, j7));
                    if (iZze > 0) {
                        iZzC10 = zzep.zzC(i14 << 3);
                        iZzC11 = zzep.zzC(iZze);
                        iZzC9 = iZzC10 + iZzC11 + iZze;
                        iZzC18 += iZzC9;
                    }
                    i10 += 3;
                    i9 = i8;
                    break;
                case 46:
                    i8 = i9;
                    iZze = zzgx.zze((List) unsafe.getObject(obj, j7));
                    if (iZze > 0) {
                        iZzC10 = zzep.zzC(i14 << 3);
                        iZzC11 = zzep.zzC(iZze);
                        iZzC9 = iZzC10 + iZzC11 + iZze;
                        iZzC18 += iZzC9;
                    }
                    i10 += 3;
                    i9 = i8;
                    break;
                case 47:
                    i8 = i9;
                    iZze = zzgx.zzi((List) unsafe.getObject(obj, j7));
                    if (iZze > 0) {
                        iZzC10 = zzep.zzC(i14 << 3);
                        iZzC11 = zzep.zzC(iZze);
                        iZzC9 = iZzC10 + iZzC11 + iZze;
                        iZzC18 += iZzC9;
                    }
                    i10 += 3;
                    i9 = i8;
                    break;
                case 48:
                    i8 = i9;
                    iZze = zzgx.zzj((List) unsafe.getObject(obj, j7));
                    if (iZze > 0) {
                        iZzC10 = zzep.zzC(i14 << 3);
                        iZzC11 = zzep.zzC(iZze);
                        iZzC9 = iZzC10 + iZzC11 + iZze;
                        iZzC18 += iZzC9;
                    }
                    i10 += 3;
                    i9 = i8;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j7);
                    zzgv zzgvVarZzv2 = zzgoVar.zzv(i10);
                    int i37 = zzgx.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZzy = 0;
                    } else {
                        int i38 = 0;
                        iZzy = 0;
                        while (i38 < size6) {
                            iZzy += zzep.zzy(i14, (zzgl) list13.get(i38), zzgvVarZzv2);
                            i38++;
                            i9 = i9;
                        }
                    }
                    i8 = i9;
                    iZzC18 += iZzy;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 50:
                    zzgf zzgfVar = (zzgf) unsafe.getObject(obj, j7);
                    if (!zzgfVar.isEmpty()) {
                        Iterator it = zzgfVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            entry2.getKey();
                            entry2.getValue();
                            throw null;
                        }
                    }
                    i8 = i9;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 51:
                    if (zzgoVar.zzM(obj, i14, i10)) {
                        iZzC12 = zzep.zzC(i14 << 3);
                        iZzC15 = iZzC12 + 8;
                        iZzC18 += iZzC15;
                    }
                    i8 = i9;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 52:
                    if (zzgoVar.zzM(obj, i14, i10)) {
                        iZzC13 = zzep.zzC(i14 << 3);
                        iZzC15 = iZzC13 + 4;
                        iZzC18 += iZzC15;
                    }
                    i8 = i9;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 53:
                    if (zzgoVar.zzM(obj, i14, i10)) {
                        long jZzt = zzt(obj, j7);
                        iZzC14 = zzep.zzC(i14 << 3);
                        iZzD2 = zzep.zzD(jZzt);
                        iZzC15 = iZzC14 + iZzD2;
                        iZzC18 += iZzC15;
                    }
                    i8 = i9;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 54:
                    if (zzgoVar.zzM(obj, i14, i10)) {
                        long jZzt2 = zzt(obj, j7);
                        iZzC14 = zzep.zzC(i14 << 3);
                        iZzD2 = zzep.zzD(jZzt2);
                        iZzC15 = iZzC14 + iZzD2;
                        iZzC18 += iZzC15;
                    }
                    i8 = i9;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 55:
                    if (zzgoVar.zzM(obj, i14, i10)) {
                        long jZzo = zzo(obj, j7);
                        iZzC14 = zzep.zzC(i14 << 3);
                        iZzD2 = zzep.zzD(jZzo);
                        iZzC15 = iZzC14 + iZzD2;
                        iZzC18 += iZzC15;
                    }
                    i8 = i9;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 56:
                    if (zzgoVar.zzM(obj, i14, i10)) {
                        iZzC12 = zzep.zzC(i14 << 3);
                        iZzC15 = iZzC12 + 8;
                        iZzC18 += iZzC15;
                    }
                    i8 = i9;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 57:
                    if (zzgoVar.zzM(obj, i14, i10)) {
                        iZzC13 = zzep.zzC(i14 << 3);
                        iZzC15 = iZzC13 + 4;
                        iZzC18 += iZzC15;
                    }
                    i8 = i9;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 58:
                    if (zzgoVar.zzM(obj, i14, i10)) {
                        iZzC15 = zzep.zzC(i14 << 3) + i9;
                        iZzC18 += iZzC15;
                    }
                    i8 = i9;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 59:
                    if (zzgoVar.zzM(obj, i14, i10)) {
                        int i39 = i14 << 3;
                        Object object2 = unsafe.getObject(obj, j7);
                        if (object2 instanceof zzei) {
                            iZzC16 = zzep.zzC(i39);
                            iZzd2 = ((zzei) object2).zzd();
                            iZzC17 = zzep.zzC(iZzd2);
                            iZzC15 = iZzC16 + iZzC17 + iZzd2;
                            iZzC18 += iZzC15;
                        } else {
                            iZzC14 = zzep.zzC(i39);
                            iZzD2 = zzep.zzB((String) object2);
                            iZzC15 = iZzC14 + iZzD2;
                            iZzC18 += iZzC15;
                        }
                    }
                    i8 = i9;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 60:
                    if (zzgoVar.zzM(obj, i14, i10)) {
                        iZzC15 = zzgx.zzh(i14, unsafe.getObject(obj, j7), zzgoVar.zzv(i10));
                        iZzC18 += iZzC15;
                    }
                    i8 = i9;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 61:
                    if (zzgoVar.zzM(obj, i14, i10)) {
                        zzei zzeiVar2 = (zzei) unsafe.getObject(obj, j7);
                        iZzC16 = zzep.zzC(i14 << 3);
                        iZzd2 = zzeiVar2.zzd();
                        iZzC17 = zzep.zzC(iZzd2);
                        iZzC15 = iZzC16 + iZzC17 + iZzd2;
                        iZzC18 += iZzC15;
                    }
                    i8 = i9;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 62:
                    if (zzgoVar.zzM(obj, i14, i10)) {
                        int iZzo = zzo(obj, j7);
                        iZzC14 = zzep.zzC(i14 << 3);
                        iZzD2 = zzep.zzC(iZzo);
                        iZzC15 = iZzC14 + iZzD2;
                        iZzC18 += iZzC15;
                    }
                    i8 = i9;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 63:
                    if (zzgoVar.zzM(obj, i14, i10)) {
                        long jZzo2 = zzo(obj, j7);
                        iZzC14 = zzep.zzC(i14 << 3);
                        iZzD2 = zzep.zzD(jZzo2);
                        iZzC15 = iZzC14 + iZzD2;
                        iZzC18 += iZzC15;
                    }
                    i8 = i9;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 64:
                    if (zzgoVar.zzM(obj, i14, i10)) {
                        iZzC13 = zzep.zzC(i14 << 3);
                        iZzC15 = iZzC13 + 4;
                        iZzC18 += iZzC15;
                    }
                    i8 = i9;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 65:
                    if (zzgoVar.zzM(obj, i14, i10)) {
                        iZzC12 = zzep.zzC(i14 << 3);
                        iZzC15 = iZzC12 + 8;
                        iZzC18 += iZzC15;
                    }
                    i8 = i9;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 66:
                    if (zzgoVar.zzM(obj, i14, i10)) {
                        int iZzo2 = zzo(obj, j7);
                        iZzC14 = zzep.zzC(i14 << 3);
                        iZzD2 = zzep.zzC((iZzo2 >> 31) ^ (iZzo2 + iZzo2));
                        iZzC15 = iZzC14 + iZzD2;
                        iZzC18 += iZzC15;
                    }
                    i8 = i9;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 67:
                    if (zzgoVar.zzM(obj, i14, i10)) {
                        long jZzt3 = zzt(obj, j7);
                        iZzC14 = zzep.zzC(i14 << 3);
                        iZzD2 = zzep.zzD((jZzt3 >> 63) ^ (jZzt3 + jZzt3));
                        iZzC15 = iZzC14 + iZzD2;
                        iZzC18 += iZzC15;
                    }
                    i8 = i9;
                    i10 += 3;
                    i9 = i8;
                    break;
                case 68:
                    if (zzgoVar.zzM(obj, i14, i10)) {
                        iZzC15 = zzep.zzy(i14, (zzgl) unsafe.getObject(obj, j7), zzgoVar.zzv(i10));
                        iZzC18 += iZzC15;
                    }
                    i8 = i9;
                    i10 += 3;
                    i9 = i8;
                    break;
                default:
                    i8 = i9;
                    i10 += 3;
                    i9 = i8;
                    break;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final int zzb(Object obj) {
        int i7;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i8;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i9 >= iArr.length) {
                int iHashCode = (i10 * 53) + ((zzfi) obj).zzc.hashCode();
                return this.zzh ? (iHashCode * 53) + ((zzff) obj).zzb.zza.hashCode() : iHashCode;
            }
            int iZzs = zzs(i9);
            int i11 = 1048575 & iZzs;
            int iZzr = zzr(iZzs);
            int i12 = iArr[i9];
            long j7 = i11;
            int iHashCode2 = 37;
            switch (iZzr) {
                case 0:
                    i7 = i10 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzho.zza(obj, j7));
                    byte[] bArr = zzfo.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 1:
                    i7 = i10 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzho.zzb(obj, j7));
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 2:
                    i7 = i10 * 53;
                    jDoubleToLongBits = zzho.zzd(obj, j7);
                    byte[] bArr2 = zzfo.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 3:
                    i7 = i10 * 53;
                    jDoubleToLongBits = zzho.zzd(obj, j7);
                    byte[] bArr3 = zzfo.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 4:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzho.zzc(obj, j7);
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 5:
                    i7 = i10 * 53;
                    jDoubleToLongBits = zzho.zzd(obj, j7);
                    byte[] bArr4 = zzfo.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 6:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzho.zzc(obj, j7);
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 7:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzfo.zza(zzho.zzw(obj, j7));
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 8:
                    i7 = i10 * 53;
                    iFloatToIntBits = ((String) zzho.zzf(obj, j7)).hashCode();
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 9:
                    i8 = i10 * 53;
                    Object objZzf = zzho.zzf(obj, j7);
                    if (objZzf != null) {
                        iHashCode2 = objZzf.hashCode();
                    }
                    i10 = i8 + iHashCode2;
                    break;
                case 10:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzho.zzf(obj, j7).hashCode();
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 11:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzho.zzc(obj, j7);
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 12:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzho.zzc(obj, j7);
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 13:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzho.zzc(obj, j7);
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 14:
                    i7 = i10 * 53;
                    jDoubleToLongBits = zzho.zzd(obj, j7);
                    byte[] bArr5 = zzfo.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 15:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzho.zzc(obj, j7);
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 16:
                    i7 = i10 * 53;
                    jDoubleToLongBits = zzho.zzd(obj, j7);
                    byte[] bArr6 = zzfo.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 17:
                    i8 = i10 * 53;
                    Object objZzf2 = zzho.zzf(obj, j7);
                    if (objZzf2 != null) {
                        iHashCode2 = objZzf2.hashCode();
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
                    iFloatToIntBits = zzho.zzf(obj, j7).hashCode();
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 50:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzho.zzf(obj, j7).hashCode();
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 51:
                    if (zzM(obj, i12, i9)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzm(obj, j7));
                        byte[] bArr7 = zzfo.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzM(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzn(obj, j7));
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzM(obj, i12, i9)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = zzt(obj, j7);
                        byte[] bArr8 = zzfo.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzM(obj, i12, i9)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = zzt(obj, j7);
                        byte[] bArr9 = zzfo.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzM(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzo(obj, j7);
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzM(obj, i12, i9)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = zzt(obj, j7);
                        byte[] bArr10 = zzfo.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (zzM(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzo(obj, j7);
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzM(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzfo.zza(zzN(obj, j7));
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzM(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = ((String) zzho.zzf(obj, j7)).hashCode();
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzM(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzho.zzf(obj, j7).hashCode();
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzM(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzho.zzf(obj, j7).hashCode();
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzM(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzo(obj, j7);
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzM(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzo(obj, j7);
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzM(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzo(obj, j7);
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzM(obj, i12, i9)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = zzt(obj, j7);
                        byte[] bArr11 = zzfo.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (zzM(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzo(obj, j7);
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzM(obj, i12, i9)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = zzt(obj, j7);
                        byte[] bArr12 = zzfo.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (zzM(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzho.zzf(obj, j7).hashCode();
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
            }
            i9 += 3;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 40181. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int zzc(java.lang.Object r36, byte[] r37, int r38, int r39, int r40, com.google.android.gms.internal.play_billing.zzdw r41) {
        /*
            Method dump skipped, instruction units count: 4018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzgo.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzdw):int");
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final Object zze() {
        return ((zzfi) this.zzg).zzo();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzfi) {
                zzfi zzfiVar = (zzfi) obj;
                zzfiVar.zzx(C3553a.e.API_PRIORITY_OTHER);
                zzfiVar.zza = 0;
                zzfiVar.zzv();
            }
            int[] iArr = this.zzc;
            for (int i7 = 0; i7 < iArr.length; i7 += 3) {
                int iZzs = zzs(i7);
                int i8 = 1048575 & iZzs;
                int iZzr = zzr(iZzs);
                long j7 = i8;
                if (iZzr != 9) {
                    if (iZzr != 60 && iZzr != 68) {
                        switch (iZzr) {
                            case 17:
                                if (zzI(obj, i7)) {
                                    zzv(i7).zzf(zzb.getObject(obj, j7));
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
                                ((zzfn) zzho.zzf(obj, j7)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j7);
                                if (object != null) {
                                    ((zzgf) object).zzc();
                                    unsafe.putObject(obj, j7, object);
                                }
                                break;
                        }
                    } else if (zzM(obj, iArr[i7], i7)) {
                        zzv(i7).zzf(zzb.getObject(obj, j7));
                    }
                } else if (zzI(obj, i7)) {
                    zzv(i7).zzf(zzb.getObject(obj, j7));
                }
            }
            this.zzl.zzb(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i7 >= iArr.length) {
                zzgx.zzp(this.zzl, obj, obj2);
                if (this.zzh) {
                    zzgx.zzo(this.zzm, obj, obj2);
                    return;
                }
                return;
            }
            int iZzs = zzs(i7);
            int i8 = 1048575 & iZzs;
            int iZzr = zzr(iZzs);
            int i9 = iArr[i7];
            long j7 = i8;
            switch (iZzr) {
                case 0:
                    if (zzI(obj2, i7)) {
                        zzho.zzo(obj, j7, zzho.zza(obj2, j7));
                        zzD(obj, i7);
                    }
                    break;
                case 1:
                    if (zzI(obj2, i7)) {
                        zzho.zzp(obj, j7, zzho.zzb(obj2, j7));
                        zzD(obj, i7);
                    }
                    break;
                case 2:
                    if (zzI(obj2, i7)) {
                        zzho.zzr(obj, j7, zzho.zzd(obj2, j7));
                        zzD(obj, i7);
                    }
                    break;
                case 3:
                    if (zzI(obj2, i7)) {
                        zzho.zzr(obj, j7, zzho.zzd(obj2, j7));
                        zzD(obj, i7);
                    }
                    break;
                case 4:
                    if (zzI(obj2, i7)) {
                        zzho.zzq(obj, j7, zzho.zzc(obj2, j7));
                        zzD(obj, i7);
                    }
                    break;
                case 5:
                    if (zzI(obj2, i7)) {
                        zzho.zzr(obj, j7, zzho.zzd(obj2, j7));
                        zzD(obj, i7);
                    }
                    break;
                case 6:
                    if (zzI(obj2, i7)) {
                        zzho.zzq(obj, j7, zzho.zzc(obj2, j7));
                        zzD(obj, i7);
                    }
                    break;
                case 7:
                    if (zzI(obj2, i7)) {
                        zzho.zzm(obj, j7, zzho.zzw(obj2, j7));
                        zzD(obj, i7);
                    }
                    break;
                case 8:
                    if (zzI(obj2, i7)) {
                        zzho.zzs(obj, j7, zzho.zzf(obj2, j7));
                        zzD(obj, i7);
                    }
                    break;
                case 9:
                    zzB(obj, obj2, i7);
                    break;
                case 10:
                    if (zzI(obj2, i7)) {
                        zzho.zzs(obj, j7, zzho.zzf(obj2, j7));
                        zzD(obj, i7);
                    }
                    break;
                case 11:
                    if (zzI(obj2, i7)) {
                        zzho.zzq(obj, j7, zzho.zzc(obj2, j7));
                        zzD(obj, i7);
                    }
                    break;
                case 12:
                    if (zzI(obj2, i7)) {
                        zzho.zzq(obj, j7, zzho.zzc(obj2, j7));
                        zzD(obj, i7);
                    }
                    break;
                case 13:
                    if (zzI(obj2, i7)) {
                        zzho.zzq(obj, j7, zzho.zzc(obj2, j7));
                        zzD(obj, i7);
                    }
                    break;
                case 14:
                    if (zzI(obj2, i7)) {
                        zzho.zzr(obj, j7, zzho.zzd(obj2, j7));
                        zzD(obj, i7);
                    }
                    break;
                case 15:
                    if (zzI(obj2, i7)) {
                        zzho.zzq(obj, j7, zzho.zzc(obj2, j7));
                        zzD(obj, i7);
                    }
                    break;
                case 16:
                    if (zzI(obj2, i7)) {
                        zzho.zzr(obj, j7, zzho.zzd(obj2, j7));
                        zzD(obj, i7);
                    }
                    break;
                case 17:
                    zzB(obj, obj2, i7);
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
                    zzfn zzfnVarZzd = (zzfn) zzho.zzf(obj, j7);
                    zzfn zzfnVar = (zzfn) zzho.zzf(obj2, j7);
                    int size = zzfnVarZzd.size();
                    int size2 = zzfnVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzfnVarZzd.zzc()) {
                            zzfnVarZzd = zzfnVarZzd.zzd(size2 + size);
                        }
                        zzfnVarZzd.addAll(zzfnVar);
                    }
                    if (size > 0) {
                        zzfnVar = zzfnVarZzd;
                    }
                    zzho.zzs(obj, j7, zzfnVar);
                    break;
                case 50:
                    int i10 = zzgx.zza;
                    zzho.zzs(obj, j7, zzgg.zza(zzho.zzf(obj, j7), zzho.zzf(obj2, j7)));
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
                    if (zzM(obj2, i9, i7)) {
                        zzho.zzs(obj, j7, zzho.zzf(obj2, j7));
                        zzE(obj, i9, i7);
                    }
                    break;
                case 60:
                    zzC(obj, obj2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(obj2, i9, i7)) {
                        zzho.zzs(obj, j7, zzho.zzf(obj2, j7));
                        zzE(obj, i9, i7);
                    }
                    break;
                case 68:
                    zzC(obj, obj2, i7);
                    break;
            }
            i7 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzh(Object obj, byte[] bArr, int i7, int i8, zzdw zzdwVar) {
        zzc(obj, bArr, i7, i8, 0, zzdwVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzi(Object obj, zzhu zzhuVar) {
        Map.Entry entry;
        int i7;
        zzgo<T> zzgoVar = this;
        if (zzgoVar.zzh) {
            zzez zzezVar = ((zzff) obj).zzb;
            if (zzezVar.zza.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) zzezVar.zzf().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = zzgoVar.zzc;
        Unsafe unsafe = zzb;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i10 < iArr.length) {
            int iZzs = zzgoVar.zzs(i10);
            int iZzr = zzr(iZzs);
            int i12 = iArr[i10];
            if (iZzr <= 17) {
                int i13 = iArr[i10 + 2];
                int i14 = i13 & i8;
                if (i14 != i9) {
                    i11 = i14 == i8 ? 0 : unsafe.getInt(obj, i14);
                    i9 = i14;
                }
                i7 = 1 << (i13 >>> 20);
            } else {
                i7 = 0;
            }
            if (entry != null) {
                throw null;
            }
            long j7 = iZzs & i8;
            switch (iZzr) {
                case 0:
                    if (zzgoVar.zzJ(obj, i10, i9, i11, i7)) {
                        zzhuVar.zzf(i12, zzho.zza(obj, j7));
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 1:
                    if (zzgoVar.zzJ(obj, i10, i9, i11, i7)) {
                        zzhuVar.zzo(i12, zzho.zzb(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 2:
                    if (zzgoVar.zzJ(obj, i10, i9, i11, i7)) {
                        zzhuVar.zzt(i12, unsafe.getLong(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 3:
                    if (zzgoVar.zzJ(obj, i10, i9, i11, i7)) {
                        zzhuVar.zzK(i12, unsafe.getLong(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 4:
                    if (zzgoVar.zzJ(obj, i10, i9, i11, i7)) {
                        zzhuVar.zzr(i12, unsafe.getInt(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 5:
                    if (zzgoVar.zzJ(obj, i10, i9, i11, i7)) {
                        zzhuVar.zzm(i12, unsafe.getLong(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 6:
                    if (zzgoVar.zzJ(obj, i10, i9, i11, i7)) {
                        zzhuVar.zzk(i12, unsafe.getInt(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 7:
                    if (zzgoVar.zzJ(obj, i10, i9, i11, i7)) {
                        zzhuVar.zzb(i12, zzho.zzw(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 8:
                    if (zzgoVar.zzJ(obj, i10, i9, i11, i7)) {
                        zzO(i12, unsafe.getObject(obj, j7), zzhuVar);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 9:
                    if (zzgoVar.zzJ(obj, i10, i9, i11, i7)) {
                        zzhuVar.zzv(i12, unsafe.getObject(obj, j7), zzgoVar.zzv(i10));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 10:
                    if (zzgoVar.zzJ(obj, i10, i9, i11, i7)) {
                        zzhuVar.zzd(i12, (zzei) unsafe.getObject(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 11:
                    if (zzgoVar.zzJ(obj, i10, i9, i11, i7)) {
                        zzhuVar.zzI(i12, unsafe.getInt(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 12:
                    if (zzgoVar.zzJ(obj, i10, i9, i11, i7)) {
                        zzhuVar.zzi(i12, unsafe.getInt(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 13:
                    if (zzgoVar.zzJ(obj, i10, i9, i11, i7)) {
                        zzhuVar.zzx(i12, unsafe.getInt(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 14:
                    if (zzgoVar.zzJ(obj, i10, i9, i11, i7)) {
                        zzhuVar.zzz(i12, unsafe.getLong(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 15:
                    if (zzgoVar.zzJ(obj, i10, i9, i11, i7)) {
                        zzhuVar.zzB(i12, unsafe.getInt(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 16:
                    if (zzgoVar.zzJ(obj, i10, i9, i11, i7)) {
                        zzhuVar.zzD(i12, unsafe.getLong(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 17:
                    if (zzgoVar.zzJ(obj, i10, i9, i11, i7)) {
                        zzhuVar.zzq(i12, unsafe.getObject(obj, j7), zzgoVar.zzv(i10));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 18:
                    zzgx.zzr(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 19:
                    zzgx.zzv(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 20:
                    zzgx.zzx(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case zzbbn.zzt.zzm /* 21 */:
                    zzgx.zzD(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 22:
                    zzgx.zzw(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 23:
                    zzgx.zzu(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 24:
                    zzgx.zzt(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 25:
                    zzgx.zzq(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 26:
                    int i15 = iArr[i10];
                    List list = (List) unsafe.getObject(obj, j7);
                    int i16 = zzgx.zza;
                    if (list != null && !list.isEmpty()) {
                        zzhuVar.zzH(i15, list);
                    }
                    break;
                case 27:
                    int i17 = iArr[i10];
                    List list2 = (List) unsafe.getObject(obj, j7);
                    zzgv zzgvVarZzv = zzgoVar.zzv(i10);
                    int i18 = zzgx.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i19 = 0; i19 < list2.size(); i19++) {
                            ((zzeq) zzhuVar).zzv(i17, list2.get(i19), zzgvVarZzv);
                        }
                    }
                    break;
                case 28:
                    int i20 = iArr[i10];
                    List list3 = (List) unsafe.getObject(obj, j7);
                    int i21 = zzgx.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzhuVar.zze(i20, list3);
                    }
                    break;
                case 29:
                    zzgx.zzC(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 30:
                    zzgx.zzs(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 31:
                    zzgx.zzy(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 32:
                    zzgx.zzz(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 33:
                    zzgx.zzA(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 34:
                    zzgx.zzB(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zzgoVar = this;
                    break;
                case 35:
                    zzgx.zzr(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, true);
                    break;
                case 36:
                    zzgx.zzv(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, true);
                    break;
                case 37:
                    zzgx.zzx(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, true);
                    break;
                case 38:
                    zzgx.zzD(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, true);
                    break;
                case 39:
                    zzgx.zzw(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, true);
                    break;
                case 40:
                    zzgx.zzu(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, true);
                    break;
                case 41:
                    zzgx.zzt(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, true);
                    break;
                case 42:
                    zzgx.zzq(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, true);
                    break;
                case 43:
                    zzgx.zzC(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, true);
                    break;
                case 44:
                    zzgx.zzs(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, true);
                    break;
                case 45:
                    zzgx.zzy(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, true);
                    break;
                case 46:
                    zzgx.zzz(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, true);
                    break;
                case 47:
                    zzgx.zzA(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, true);
                    break;
                case 48:
                    zzgx.zzB(iArr[i10], (List) unsafe.getObject(obj, j7), zzhuVar, true);
                    break;
                case 49:
                    int i22 = iArr[i10];
                    List list4 = (List) unsafe.getObject(obj, j7);
                    zzgv zzgvVarZzv2 = zzgoVar.zzv(i10);
                    int i23 = zzgx.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i24 = 0; i24 < list4.size(); i24++) {
                            ((zzeq) zzhuVar).zzq(i22, list4.get(i24), zzgvVarZzv2);
                        }
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j7) != null) {
                        throw null;
                    }
                    break;
                case 51:
                    if (zzgoVar.zzM(obj, i12, i10)) {
                        zzhuVar.zzf(i12, zzm(obj, j7));
                    }
                    break;
                case 52:
                    if (zzgoVar.zzM(obj, i12, i10)) {
                        zzhuVar.zzo(i12, zzn(obj, j7));
                    }
                    break;
                case 53:
                    if (zzgoVar.zzM(obj, i12, i10)) {
                        zzhuVar.zzt(i12, zzt(obj, j7));
                    }
                    break;
                case 54:
                    if (zzgoVar.zzM(obj, i12, i10)) {
                        zzhuVar.zzK(i12, zzt(obj, j7));
                    }
                    break;
                case 55:
                    if (zzgoVar.zzM(obj, i12, i10)) {
                        zzhuVar.zzr(i12, zzo(obj, j7));
                    }
                    break;
                case 56:
                    if (zzgoVar.zzM(obj, i12, i10)) {
                        zzhuVar.zzm(i12, zzt(obj, j7));
                    }
                    break;
                case 57:
                    if (zzgoVar.zzM(obj, i12, i10)) {
                        zzhuVar.zzk(i12, zzo(obj, j7));
                    }
                    break;
                case 58:
                    if (zzgoVar.zzM(obj, i12, i10)) {
                        zzhuVar.zzb(i12, zzN(obj, j7));
                    }
                    break;
                case 59:
                    if (zzgoVar.zzM(obj, i12, i10)) {
                        zzO(i12, unsafe.getObject(obj, j7), zzhuVar);
                    }
                    break;
                case 60:
                    if (zzgoVar.zzM(obj, i12, i10)) {
                        zzhuVar.zzv(i12, unsafe.getObject(obj, j7), zzgoVar.zzv(i10));
                    }
                    break;
                case 61:
                    if (zzgoVar.zzM(obj, i12, i10)) {
                        zzhuVar.zzd(i12, (zzei) unsafe.getObject(obj, j7));
                    }
                    break;
                case 62:
                    if (zzgoVar.zzM(obj, i12, i10)) {
                        zzhuVar.zzI(i12, zzo(obj, j7));
                    }
                    break;
                case 63:
                    if (zzgoVar.zzM(obj, i12, i10)) {
                        zzhuVar.zzi(i12, zzo(obj, j7));
                    }
                    break;
                case 64:
                    if (zzgoVar.zzM(obj, i12, i10)) {
                        zzhuVar.zzx(i12, zzo(obj, j7));
                    }
                    break;
                case 65:
                    if (zzgoVar.zzM(obj, i12, i10)) {
                        zzhuVar.zzz(i12, zzt(obj, j7));
                    }
                    break;
                case 66:
                    if (zzgoVar.zzM(obj, i12, i10)) {
                        zzhuVar.zzB(i12, zzo(obj, j7));
                    }
                    break;
                case 67:
                    if (zzgoVar.zzM(obj, i12, i10)) {
                        zzhuVar.zzD(i12, zzt(obj, j7));
                    }
                    break;
                case 68:
                    if (zzgoVar.zzM(obj, i12, i10)) {
                        zzhuVar.zzq(i12, unsafe.getObject(obj, j7), zzgoVar.zzv(i10));
                    }
                    break;
            }
            i10 += 3;
            i8 = 1048575;
            zzgoVar = this;
        }
        if (entry != null) {
            throw null;
        }
        ((zzfi) obj).zzc.zzl(zzhuVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzE;
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int iZzs = zzs(i7);
            long j7 = iZzs & 1048575;
            switch (zzr(iZzs)) {
                case 0:
                    if (!zzH(obj, obj2, i7) || Double.doubleToLongBits(zzho.zza(obj, j7)) != Double.doubleToLongBits(zzho.zza(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i7) || Float.floatToIntBits(zzho.zzb(obj, j7)) != Float.floatToIntBits(zzho.zzb(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i7) || zzho.zzd(obj, j7) != zzho.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i7) || zzho.zzd(obj, j7) != zzho.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i7) || zzho.zzc(obj, j7) != zzho.zzc(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i7) || zzho.zzd(obj, j7) != zzho.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i7) || zzho.zzc(obj, j7) != zzho.zzc(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i7) || zzho.zzw(obj, j7) != zzho.zzw(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i7) || !zzgx.zzE(zzho.zzf(obj, j7), zzho.zzf(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i7) || !zzgx.zzE(zzho.zzf(obj, j7), zzho.zzf(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i7) || !zzgx.zzE(zzho.zzf(obj, j7), zzho.zzf(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i7) || zzho.zzc(obj, j7) != zzho.zzc(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i7) || zzho.zzc(obj, j7) != zzho.zzc(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i7) || zzho.zzc(obj, j7) != zzho.zzc(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i7) || zzho.zzd(obj, j7) != zzho.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i7) || zzho.zzc(obj, j7) != zzho.zzc(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i7) || zzho.zzd(obj, j7) != zzho.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i7) || !zzgx.zzE(zzho.zzf(obj, j7), zzho.zzf(obj2, j7))) {
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
                    zZzE = zzgx.zzE(zzho.zzf(obj, j7), zzho.zzf(obj2, j7));
                    break;
                case 50:
                    zZzE = zzgx.zzE(zzho.zzf(obj, j7), zzho.zzf(obj2, j7));
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
                    long jZzp = zzp(i7) & 1048575;
                    if (zzho.zzc(obj, jZzp) != zzho.zzc(obj2, jZzp) || !zzgx.zzE(zzho.zzf(obj, j7), zzho.zzf(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzE) {
                return false;
            }
        }
        if (!((zzfi) obj).zzc.equals(((zzfi) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzff) obj).zzb.equals(((zzff) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final boolean zzk(Object obj) {
        int i7;
        int i8;
        List list;
        zzgv zzgvVarZzv;
        int i9;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        while (i11 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i13 = iArr[i11];
            int i14 = iArr2[i13];
            int iZzs = zzs(i13);
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
            if ((268435456 & iZzs) != 0 && !zzJ(obj, i13, i7, i8, i17)) {
                return false;
            }
            int iZzr = zzr(iZzs);
            if (iZzr == 9 || iZzr == 17) {
                if (zzJ(obj, i13, i7, i8, i17) && !zzK(obj, iZzs, zzv(i13))) {
                    return false;
                }
            } else if (iZzr == 27) {
                list = (List) zzho.zzf(obj, iZzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgvVarZzv = zzv(i13);
                    for (i9 = 0; i9 < list.size(); i9++) {
                        if (!zzgvVarZzv.zzk(list.get(i9))) {
                            return false;
                        }
                    }
                }
            } else if (iZzr == 60 || iZzr == 68) {
                if (zzM(obj, i14, i13) && !zzK(obj, iZzs, zzv(i13))) {
                    return false;
                }
            } else if (iZzr == 49) {
                list = (List) zzho.zzf(obj, iZzs & 1048575);
                if (list.isEmpty()) {
                    zzgvVarZzv = zzv(i13);
                    while (i9 < list.size()) {
                        if (!zzgvVarZzv.zzk(list.get(i9))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzr == 50 && !((zzgf) zzho.zzf(obj, iZzs & 1048575)).isEmpty()) {
                throw null;
            }
            i11++;
            i12 = i7;
            i10 = i8;
        }
        return !this.zzh || ((zzff) obj).zzb.zzi();
    }
}
