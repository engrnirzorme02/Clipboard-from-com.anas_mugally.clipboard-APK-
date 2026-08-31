package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.internal.ads.zzbbn;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzol<T> implements zzow<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzps.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzoi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzpl zzm;
    private final zzmp zzn;

    private zzol(int[] iArr, Object[] objArr, int i7, int i8, zzoi zzoiVar, boolean z7, int[] iArr2, int i9, int i10, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i7;
        this.zzf = i8;
        this.zzi = zzoiVar instanceof zznd;
        boolean z8 = false;
        if (zzmpVar != null && (zzoiVar instanceof zzna)) {
            z8 = true;
        }
        this.zzh = z8;
        this.zzj = iArr2;
        this.zzk = i9;
        this.zzl = i10;
        this.zzm = zzplVar;
        this.zzn = zzmpVar;
        this.zzg = zzoiVar;
    }

    private final Object zzA(Object obj, int i7) {
        zzow zzowVarZzx = zzx(i7);
        int iZzu = zzu(i7) & 1048575;
        if (!zzN(obj, i7)) {
            return zzowVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzowVarZzx.zze();
        if (object != null) {
            zzowVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i7, int i8) {
        zzow zzowVarZzx = zzx(i8);
        if (!zzR(obj, i7, i8)) {
            return zzowVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i8) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzowVarZzx.zze();
        if (object != null) {
            zzowVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
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

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i7) {
        if (zzN(obj2, i7)) {
            int iZzu = zzu(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j7 = iZzu;
            Object object = unsafe.getObject(obj2, j7);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + obj2.toString());
            }
            zzow zzowVarZzx = zzx(i7);
            if (!zzN(obj, i7)) {
                if (zzQ(object)) {
                    Object objZze = zzowVarZzx.zze();
                    zzowVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j7, objZze);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                zzH(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!zzQ(object2)) {
                Object objZze2 = zzowVarZzx.zze();
                zzowVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j7, objZze2);
                object2 = objZze2;
            }
            zzowVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i7) {
        int i8 = this.zzc[i7];
        if (zzR(obj2, i8, i7)) {
            int iZzu = zzu(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j7 = iZzu;
            Object object = unsafe.getObject(obj2, j7);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + obj2.toString());
            }
            zzow zzowVarZzx = zzx(i7);
            if (!zzR(obj, i8, i7)) {
                if (zzQ(object)) {
                    Object objZze = zzowVarZzx.zze();
                    zzowVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j7, objZze);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                zzI(obj, i8, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!zzQ(object2)) {
                Object objZze2 = zzowVarZzx.zze();
                zzowVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j7, objZze2);
                object2 = objZze2;
            }
            zzowVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i7, zzov zzovVar) {
        long j7 = i7 & 1048575;
        if (zzM(i7)) {
            zzps.zzs(obj, j7, zzovVar.zzs());
        } else if (this.zzi) {
            zzps.zzs(obj, j7, zzovVar.zzr());
        } else {
            zzps.zzs(obj, j7, zzovVar.zzp());
        }
    }

    private final void zzH(Object obj, int i7) {
        int iZzr = zzr(i7);
        long j7 = 1048575 & iZzr;
        if (j7 == 1048575) {
            return;
        }
        zzps.zzq(obj, j7, (1 << (iZzr >>> 20)) | zzps.zzc(obj, j7));
    }

    private final void zzI(Object obj, int i7, int i8) {
        zzps.zzq(obj, zzr(i8) & 1048575, i7);
    }

    private final void zzJ(Object obj, int i7, Object obj2) {
        zzb.putObject(obj, zzu(i7) & 1048575, obj2);
        zzH(obj, i7);
    }

    private final void zzK(Object obj, int i7, int i8, Object obj2) {
        zzb.putObject(obj, zzu(i8) & 1048575, obj2);
        zzI(obj, i7, i8);
    }

    private final boolean zzL(Object obj, Object obj2, int i7) {
        return zzN(obj, i7) == zzN(obj2, i7);
    }

    private static boolean zzM(int i7) {
        return (i7 & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i7) {
        int iZzr = zzr(i7);
        long j7 = iZzr & 1048575;
        if (j7 != 1048575) {
            return (zzps.zzc(obj, j7) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i7);
        long j8 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzps.zza(obj, j8)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzps.zzb(obj, j8)) != 0;
            case 2:
                return zzps.zzd(obj, j8) != 0;
            case 3:
                return zzps.zzd(obj, j8) != 0;
            case 4:
                return zzps.zzc(obj, j8) != 0;
            case 5:
                return zzps.zzd(obj, j8) != 0;
            case 6:
                return zzps.zzc(obj, j8) != 0;
            case 7:
                return zzps.zzw(obj, j8);
            case 8:
                Object objZzf = zzps.zzf(obj, j8);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzle) {
                    return !zzle.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzps.zzf(obj, j8) != null;
            case 10:
                return !zzle.zzb.equals(zzps.zzf(obj, j8));
            case 11:
                return zzps.zzc(obj, j8) != 0;
            case 12:
                return zzps.zzc(obj, j8) != 0;
            case 13:
                return zzps.zzc(obj, j8) != 0;
            case 14:
                return zzps.zzd(obj, j8) != 0;
            case 15:
                return zzps.zzc(obj, j8) != 0;
            case 16:
                return zzps.zzd(obj, j8) != 0;
            case 17:
                return zzps.zzf(obj, j8) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i7, int i8, int i9, int i10) {
        if (i8 == 1048575) {
            return zzN(obj, i7);
        }
        return (i9 & i10) != 0;
    }

    private static boolean zzP(Object obj, int i7, zzow zzowVar) {
        return zzowVar.zzl(zzps.zzf(obj, i7 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zznd) {
            return ((zznd) obj).zzL();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i7, int i8) {
        return zzps.zzc(obj, (long) (zzr(i8) & 1048575)) == i7;
    }

    private static boolean zzS(Object obj, long j7) {
        return ((Boolean) zzps.zzf(obj, j7)).booleanValue();
    }

    private static final void zzT(int i7, Object obj, zzpy zzpyVar) {
        if (obj instanceof String) {
            zzpyVar.zzG(i7, (String) obj);
        } else {
            zzpyVar.zzd(i7, (zzle) obj);
        }
    }

    static zzpm zzd(Object obj) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        if (zzpmVar != zzpm.zzc()) {
            return zzpmVar;
        }
        zzpm zzpmVarZzf = zzpm.zzf();
        zzndVar.zzc = zzpmVarZzf;
        return zzpmVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0274  */
    /* JADX WARN: Code duplicated, block: B:131:0x028c  */
    /* JADX WARN: Code duplicated, block: B:132:0x028f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0350  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:190:0x03b0  */
    static zzol zzm(Class cls, zzof zzofVar, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
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
        Field fieldZzC;
        char cCharAt9;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        Object obj;
        Field fieldZzC2;
        int i33;
        Object obj2;
        Field fieldZzC3;
        int i34;
        char cCharAt10;
        int i35;
        char cCharAt11;
        int i36;
        char cCharAt12;
        int i37;
        char cCharAt13;
        if (!(zzofVar instanceof zzou)) {
            throw null;
        }
        zzou zzouVar = (zzou) zzofVar;
        String strZzd = zzouVar.zzd();
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
        Object[] objArrZze = zzouVar.zze();
        Class<?> cls2 = zzouVar.zza().getClass();
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
            zzou zzouVar2 = zzouVar;
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
                    } else if (zzouVar2.zzc() == 1 || i83 != 0) {
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
                        fieldZzC2 = (Field) obj;
                    } else {
                        fieldZzC2 = zzC(cls2, (String) obj);
                        objArrZze[i32] = fieldZzC2;
                    }
                    int i93 = i13;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC2);
                    i33 = i32 + 1;
                    obj2 = objArrZze[i33];
                    i24 = i93;
                    if (obj2 instanceof Field) {
                        fieldZzC3 = (Field) obj2;
                    } else {
                        fieldZzC3 = zzC(cls2, (String) obj2);
                        objArrZze[i33] = fieldZzC3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC3);
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
                    fieldZzC2 = (Field) obj;
                } else {
                    fieldZzC2 = zzC(cls2, (String) obj);
                    objArrZze[i32] = fieldZzC2;
                }
                int i95 = i13;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC2);
                i33 = i32 + 1;
                obj2 = objArrZze[i33];
                i24 = i95;
                if (obj2 instanceof Field) {
                    fieldZzC3 = (Field) obj2;
                } else {
                    fieldZzC3 = zzC(cls2, (String) obj2);
                    objArrZze[i33] = fieldZzC3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC3);
                strZzd = strZzd;
                i26 = i94;
                i23 = i88;
                i25 = 0;
                c7 = 55296;
            } else {
                i24 = i13;
                int i96 = i12 + 1;
                Field fieldZzC4 = zzC(cls2, (String) objArrZze[i12]);
                if (i82 == 9 || i82 == 17) {
                    int i97 = i73 / 3;
                    objArr[i97 + i97 + 1] = fieldZzC4.getType();
                } else {
                    if (i82 != 27) {
                        if (i82 == 49) {
                            i12 += 2;
                            i28 = 1;
                        } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                            if (zzouVar2.zzc() == 1 || i83 != 0) {
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
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
                                fieldZzC = (Field) obj3;
                            } else {
                                fieldZzC = zzC(cls2, (String) obj3);
                                objArrZze[i106] = fieldZzC;
                            }
                            int i107 = iCharAt13;
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzC);
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
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
            zzouVar = zzouVar2;
            length = length;
            i13 = i24;
        }
        return new zzol(iArr3, objArr, i8, i10, zzouVar.zza(), false, iArr, i11, i68, zzooVar, zznvVar, zzplVar, zzmpVar, zzodVar);
    }

    private static double zzn(Object obj, long j7) {
        return ((Double) zzps.zzf(obj, j7)).doubleValue();
    }

    private static float zzo(Object obj, long j7) {
        return ((Float) zzps.zzf(obj, j7)).floatValue();
    }

    private static int zzp(Object obj, long j7) {
        return ((Integer) zzps.zzf(obj, j7)).intValue();
    }

    private final int zzq(int i7) {
        if (i7 < this.zze || i7 > this.zzf) {
            return -1;
        }
        return zzs(i7, 0);
    }

    private final int zzr(int i7) {
        return this.zzc[i7 + 2];
    }

    private final int zzs(int i7, int i8) {
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

    private static int zzt(int i7) {
        return (i7 >>> 20) & 255;
    }

    private final int zzu(int i7) {
        return this.zzc[i7 + 1];
    }

    private static long zzv(Object obj, long j7) {
        return ((Long) zzps.zzf(obj, j7)).longValue();
    }

    private final zznh zzw(int i7) {
        int i8 = i7 / 3;
        return (zznh) this.zzd[i8 + i8 + 1];
    }

    private final zzow zzx(int i7) {
        Object[] objArr = this.zzd;
        int i8 = i7 / 3;
        int i9 = i8 + i8;
        zzow zzowVar = (zzow) objArr[i9];
        if (zzowVar != null) {
            return zzowVar;
        }
        zzow zzowVarZzb = zzos.zza().zzb((Class) objArr[i9 + 1]);
        this.zzd[i9] = zzowVarZzb;
        return zzowVarZzb;
    }

    private final Object zzy(Object obj, int i7, Object obj2, zzpl zzplVar, Object obj3) {
        int i8 = this.zzc[i7];
        Object objZzf = zzps.zzf(obj, zzu(i7) & 1048575);
        if (objZzf == null || zzw(i7) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i7) {
        int i8 = i7 / 3;
        return this.zzd[i8 + i8];
    }

    /* JADX WARN: Code duplicated, block: B:143:0x03b5 A[PHI: r17
      0x03b5: PHI (r17v45 int) = (r17v28 int), (r17v29 int), (r17v32 int), (r17v38 int), (r17v39 int), (r17v42 int), (r17v46 int) binds: [B:210:0x0577, B:206:0x0559, B:200:0x0520, B:158:0x0427, B:154:0x040b, B:148:0x03d5, B:142:0x03b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:181:0x04bb A[PHI: r17
      0x04bb: PHI (r17v34 int) = (r17v27 int), (r17v35 int) binds: [B:214:0x0595, B:180:0x04b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:282:0x0785 A[PHI: r0 r17
      0x0785: PHI (r0v46 com.google.android.recaptcha.internal.zzol<T>) = 
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v38 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
      (r0v1 com.google.android.recaptcha.internal.zzol<T>)
     binds: [B:280:0x0778, B:250:0x06a1, B:227:0x0603, B:220:0x05ce, B:139:0x0397, B:136:0x037d, B:133:0x0363, B:130:0x0349, B:127:0x032f, B:124:0x0315, B:121:0x02fb, B:118:0x02e1, B:115:0x02c5, B:112:0x02ac, B:109:0x0293, B:106:0x027a, B:103:0x0261, B:98:0x0243, B:337:?, B:338:?, B:336:?, B:335:?, B:334:?, B:333:?, B:332:?, B:331:?, B:330:?, B:329:?, B:328:?, B:327:?, B:326:?, B:325:?, B:324:?, B:323:?, B:322:?, B:321:?, B:320:?, B:319:?, B:19:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0785: PHI (r17v87 int) = 
      (r17v1 int)
      (r17v10 int)
      (r17v20 int)
      (r17v24 int)
      (r17v47 int)
      (r17v48 int)
      (r17v49 int)
      (r17v50 int)
      (r17v51 int)
      (r17v52 int)
      (r17v53 int)
      (r17v54 int)
      (r17v55 int)
      (r17v56 int)
      (r17v57 int)
      (r17v58 int)
      (r17v59 int)
      (r17v62 int)
      (r17v65 int)
      (r17v66 int)
      (r17v67 int)
      (r17v68 int)
      (r17v69 int)
      (r17v70 int)
      (r17v71 int)
      (r17v72 int)
      (r17v73 int)
      (r17v74 int)
      (r17v75 int)
      (r17v76 int)
      (r17v77 int)
      (r17v78 int)
      (r17v79 int)
      (r17v80 int)
      (r17v81 int)
      (r17v82 int)
      (r17v83 int)
      (r17v85 int)
      (r17v88 int)
     binds: [B:280:0x0778, B:250:0x06a1, B:227:0x0603, B:220:0x05ce, B:139:0x0397, B:136:0x037d, B:133:0x0363, B:130:0x0349, B:127:0x032f, B:124:0x0315, B:121:0x02fb, B:118:0x02e1, B:115:0x02c5, B:112:0x02ac, B:109:0x0293, B:106:0x027a, B:103:0x0261, B:98:0x0243, B:337:?, B:338:?, B:336:?, B:335:?, B:334:?, B:333:?, B:332:?, B:331:?, B:330:?, B:329:?, B:328:?, B:327:?, B:326:?, B:325:?, B:324:?, B:323:?, B:322:?, B:321:?, B:320:?, B:319:?, B:19:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.recaptcha.internal.zzow
    public final int zza(Object obj) {
        int i7;
        int i8;
        int iZzA;
        int iZzA2;
        int iZzB;
        int iZzA3;
        int iZzA4;
        int iZzA5;
        int iZzd;
        int iZzA6;
        int iZzh;
        int iZzg;
        int size;
        int iZzl;
        int iZzA7;
        int iZzA8;
        int iZzA9;
        int iZze;
        int iZzA10;
        int iZzA11;
        int iZzw;
        int iZzA12;
        int iZzA13;
        int iZzA14;
        int iZzB2;
        int iZzA15;
        int iZzA16;
        int iZzd2;
        int iZzA17;
        zzol<T> zzolVar = this;
        int i9 = 1;
        Unsafe unsafe = zzb;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        int iZzA18 = 0;
        int i13 = 1048575;
        while (i11 < zzolVar.zzc.length) {
            int iZzu = zzolVar.zzu(i11);
            int iZzt = zzt(iZzu);
            int[] iArr = zzolVar.zzc;
            int i14 = iArr[i11];
            int i15 = iArr[i11 + 2];
            int i16 = i15 & i10;
            if (iZzt <= 17) {
                if (i16 != i13) {
                    i12 = i16 == i10 ? 0 : unsafe.getInt(obj, i16);
                    i13 = i16;
                }
                i7 = i9 << (i15 >>> 20);
            } else {
                i7 = 0;
            }
            int i17 = iZzu & i10;
            if (iZzt >= zzmu.zzJ.zza()) {
                zzmu.zzW.zza();
            }
            int i18 = iZzA18;
            long j7 = i17;
            switch (iZzt) {
                case 0:
                    i8 = i9;
                    if (zzolVar.zzO(obj, i11, i13, i12, i7)) {
                        iZzA18 = i18 + zzln.zzA(i14 << 3) + 8;
                    } else {
                        iZzA18 = i18;
                    }
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 1:
                    i8 = i9;
                    if (zzolVar.zzO(obj, i11, i13, i12, i7)) {
                        iZzA = zzln.zzA(i14 << 3);
                        iZzA4 = iZzA + 4;
                        iZzA18 = i18 + iZzA4;
                        zzolVar = this;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    zzolVar = this;
                    iZzA18 = i18;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 2:
                    i8 = i9;
                    if (zzolVar.zzO(obj, i11, i13, i12, i7)) {
                        long j8 = unsafe.getLong(obj, j7);
                        iZzA2 = zzln.zzA(i14 << 3);
                        iZzB = zzln.zzB(j8);
                        iZzA4 = iZzA2 + iZzB;
                        iZzA18 = i18 + iZzA4;
                        zzolVar = this;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    zzolVar = this;
                    iZzA18 = i18;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 3:
                    i8 = i9;
                    if (zzolVar.zzO(obj, i11, i13, i12, i7)) {
                        long j9 = unsafe.getLong(obj, j7);
                        iZzA2 = zzln.zzA(i14 << 3);
                        iZzB = zzln.zzB(j9);
                        iZzA4 = iZzA2 + iZzB;
                        iZzA18 = i18 + iZzA4;
                        zzolVar = this;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    zzolVar = this;
                    iZzA18 = i18;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 4:
                    i8 = i9;
                    if (zzolVar.zzO(obj, i11, i13, i12, i7)) {
                        long j10 = unsafe.getInt(obj, j7);
                        iZzA2 = zzln.zzA(i14 << 3);
                        iZzB = zzln.zzB(j10);
                        iZzA4 = iZzA2 + iZzB;
                        iZzA18 = i18 + iZzA4;
                        zzolVar = this;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    zzolVar = this;
                    iZzA18 = i18;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 5:
                    i8 = i9;
                    if (zzolVar.zzO(obj, i11, i13, i12, i7)) {
                        iZzA3 = zzln.zzA(i14 << 3);
                        iZzA4 = iZzA3 + 8;
                        iZzA18 = i18 + iZzA4;
                        zzolVar = this;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    zzolVar = this;
                    iZzA18 = i18;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 6:
                    i8 = i9;
                    if (zzolVar.zzO(obj, i11, i13, i12, i7)) {
                        iZzA = zzln.zzA(i14 << 3);
                        iZzA4 = iZzA + 4;
                        iZzA18 = i18 + iZzA4;
                        zzolVar = this;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    zzolVar = this;
                    iZzA18 = i18;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 7:
                    i8 = i9;
                    if (zzolVar.zzO(obj, i11, i13, i12, i7)) {
                        iZzA4 = zzln.zzA(i14 << 3) + 1;
                        iZzA18 = i18 + iZzA4;
                        zzolVar = this;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    zzolVar = this;
                    iZzA18 = i18;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 8:
                    i8 = i9;
                    if (zzolVar.zzO(obj, i11, i13, i12, i7)) {
                        int i19 = i14 << 3;
                        Object object = unsafe.getObject(obj, j7);
                        if (object instanceof zzle) {
                            iZzA5 = zzln.zzA(i19);
                            iZzd = ((zzle) object).zzd();
                            iZzA6 = zzln.zzA(iZzd);
                            iZzA4 = iZzA5 + iZzA6 + iZzd;
                            iZzA18 = i18 + iZzA4;
                            zzolVar = this;
                            i11 += 3;
                            i9 = i8;
                            i10 = 1048575;
                        } else {
                            iZzA2 = zzln.zzA(i19);
                            iZzB = zzln.zzz((String) object);
                            iZzA4 = iZzA2 + iZzB;
                            iZzA18 = i18 + iZzA4;
                            zzolVar = this;
                            i11 += 3;
                            i9 = i8;
                            i10 = 1048575;
                        }
                    }
                    zzolVar = this;
                    iZzA18 = i18;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 9:
                    i8 = i9;
                    if (zzolVar.zzO(obj, i11, i13, i12, i7)) {
                        iZzh = zzoy.zzh(i14, unsafe.getObject(obj, j7), zzolVar.zzx(i11));
                        iZzA18 = i18 + iZzh;
                    } else {
                        iZzA18 = i18;
                    }
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 10:
                    i8 = i9;
                    if (zzolVar.zzO(obj, i11, i13, i12, i7)) {
                        zzle zzleVar = (zzle) unsafe.getObject(obj, j7);
                        iZzA5 = zzln.zzA(i14 << 3);
                        iZzd = zzleVar.zzd();
                        iZzA6 = zzln.zzA(iZzd);
                        iZzA4 = iZzA5 + iZzA6 + iZzd;
                        iZzA18 = i18 + iZzA4;
                        zzolVar = this;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    zzolVar = this;
                    iZzA18 = i18;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 11:
                    i8 = i9;
                    if (zzolVar.zzO(obj, i11, i13, i12, i7)) {
                        int i20 = unsafe.getInt(obj, j7);
                        iZzA2 = zzln.zzA(i14 << 3);
                        iZzB = zzln.zzA(i20);
                        iZzA4 = iZzA2 + iZzB;
                        iZzA18 = i18 + iZzA4;
                        zzolVar = this;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    zzolVar = this;
                    iZzA18 = i18;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 12:
                    i8 = i9;
                    if (zzolVar.zzO(obj, i11, i13, i12, i7)) {
                        long j11 = unsafe.getInt(obj, j7);
                        iZzA2 = zzln.zzA(i14 << 3);
                        iZzB = zzln.zzB(j11);
                        iZzA4 = iZzA2 + iZzB;
                        iZzA18 = i18 + iZzA4;
                        zzolVar = this;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    zzolVar = this;
                    iZzA18 = i18;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 13:
                    i8 = i9;
                    if (zzolVar.zzO(obj, i11, i13, i12, i7)) {
                        iZzA = zzln.zzA(i14 << 3);
                        iZzA4 = iZzA + 4;
                        iZzA18 = i18 + iZzA4;
                        zzolVar = this;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    zzolVar = this;
                    iZzA18 = i18;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 14:
                    i8 = i9;
                    if (zzolVar.zzO(obj, i11, i13, i12, i7)) {
                        iZzA3 = zzln.zzA(i14 << 3);
                        iZzA4 = iZzA3 + 8;
                        iZzA18 = i18 + iZzA4;
                        zzolVar = this;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    zzolVar = this;
                    iZzA18 = i18;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 15:
                    i8 = i9;
                    if (zzolVar.zzO(obj, i11, i13, i12, i7)) {
                        int i21 = unsafe.getInt(obj, j7);
                        iZzA2 = zzln.zzA(i14 << 3);
                        iZzB = zzln.zzA((i21 >> 31) ^ (i21 + i21));
                        iZzA4 = iZzA2 + iZzB;
                        iZzA18 = i18 + iZzA4;
                        zzolVar = this;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    zzolVar = this;
                    iZzA18 = i18;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 16:
                    i8 = i9;
                    if (zzolVar.zzO(obj, i11, i13, i12, i7)) {
                        long j12 = unsafe.getLong(obj, j7);
                        iZzA2 = zzln.zzA(i14 << 3);
                        iZzB = zzln.zzB((j12 >> 63) ^ (j12 + j12));
                        iZzA4 = iZzA2 + iZzB;
                        iZzA18 = i18 + iZzA4;
                        zzolVar = this;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    zzolVar = this;
                    iZzA18 = i18;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 17:
                    i8 = i9;
                    if (zzolVar.zzO(obj, i11, i13, i12, i7)) {
                        iZzh = zzln.zzw(i14, (zzoi) unsafe.getObject(obj, j7), zzolVar.zzx(i11));
                        iZzA18 = i18 + iZzh;
                    } else {
                        iZzA18 = i18;
                    }
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 18:
                    i8 = i9;
                    iZzh = zzoy.zzd(i14, (List) unsafe.getObject(obj, j7), false);
                    iZzA18 = i18 + iZzh;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 19:
                    i8 = i9;
                    iZzh = zzoy.zzb(i14, (List) unsafe.getObject(obj, j7), false);
                    iZzA18 = i18 + iZzh;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 20:
                    i8 = i9;
                    List list = (List) unsafe.getObject(obj, j7);
                    int i22 = zzoy.zza;
                    if (list.size() == 0) {
                        iZzg = 0;
                    } else {
                        iZzg = zzoy.zzg(list) + (list.size() * zzln.zzA(i14 << 3));
                    }
                    iZzA18 = i18 + iZzg;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case zzbbn.zzt.zzm /* 21 */:
                    i8 = i9;
                    List list2 = (List) unsafe.getObject(obj, j7);
                    int i23 = zzoy.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzoy.zzl(list2);
                        iZzA7 = zzln.zzA(i14 << 3);
                        iZzh = iZzl + (size * iZzA7);
                    }
                    iZzA18 = i18 + iZzh;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 22:
                    i8 = i9;
                    List list3 = (List) unsafe.getObject(obj, j7);
                    int i24 = zzoy.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzoy.zzf(list3);
                        iZzA7 = zzln.zzA(i14 << 3);
                        iZzh = iZzl + (size * iZzA7);
                    }
                    iZzA18 = i18 + iZzh;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 23:
                    i8 = i9;
                    iZzh = zzoy.zzd(i14, (List) unsafe.getObject(obj, j7), false);
                    iZzA18 = i18 + iZzh;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 24:
                    i8 = i9;
                    iZzh = zzoy.zzb(i14, (List) unsafe.getObject(obj, j7), false);
                    iZzA18 = i18 + iZzh;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 25:
                    i8 = i9;
                    List list4 = (List) unsafe.getObject(obj, j7);
                    int i25 = zzoy.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZzh = 0;
                    } else {
                        iZzh = size2 * (zzln.zzA(i14 << 3) + 1);
                    }
                    iZzA18 = i18 + iZzh;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 26:
                    i8 = i9;
                    List list5 = (List) unsafe.getObject(obj, j7);
                    int i26 = zzoy.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzg = 0;
                    } else {
                        iZzg = zzln.zzA(i14 << 3) * size3;
                        if (list5 instanceof zznu) {
                            zznu zznuVar = (zznu) list5;
                            for (int i27 = 0; i27 < size3; i27++) {
                                Object objZzc = zznuVar.zzc();
                                if (objZzc instanceof zzle) {
                                    int iZzd3 = ((zzle) objZzc).zzd();
                                    iZzg += zzln.zzA(iZzd3) + iZzd3;
                                } else {
                                    iZzg += zzln.zzz((String) objZzc);
                                }
                            }
                        } else {
                            for (int i28 = 0; i28 < size3; i28++) {
                                Object obj2 = list5.get(i28);
                                if (obj2 instanceof zzle) {
                                    int iZzd4 = ((zzle) obj2).zzd();
                                    iZzg += zzln.zzA(iZzd4) + iZzd4;
                                } else {
                                    iZzg += zzln.zzz((String) obj2);
                                }
                            }
                        }
                    }
                    iZzA18 = i18 + iZzg;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 27:
                    i8 = i9;
                    List list6 = (List) unsafe.getObject(obj, j7);
                    zzow zzowVarZzx = zzolVar.zzx(i11);
                    int i29 = zzoy.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzA8 = 0;
                    } else {
                        iZzA8 = zzln.zzA(i14 << 3) * size4;
                        for (int i30 = 0; i30 < size4; i30++) {
                            Object obj3 = list6.get(i30);
                            if (obj3 instanceof zznt) {
                                int iZza = ((zznt) obj3).zza();
                                iZzA8 += zzln.zzA(iZza) + iZza;
                            } else {
                                iZzA8 += zzln.zzy((zzoi) obj3, zzowVarZzx);
                            }
                        }
                    }
                    iZzA18 = iZzA8 + i18;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 28:
                    i8 = i9;
                    List list7 = (List) unsafe.getObject(obj, j7);
                    int i31 = zzoy.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzA9 = 0;
                    } else {
                        iZzA9 = size5 * zzln.zzA(i14 << 3);
                        for (int i32 = 0; i32 < list7.size(); i32++) {
                            int iZzd5 = ((zzle) list7.get(i32)).zzd();
                            iZzA9 += zzln.zzA(iZzd5) + iZzd5;
                        }
                    }
                    iZzA18 = i18 + iZzA9;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 29:
                    i8 = i9;
                    List list8 = (List) unsafe.getObject(obj, j7);
                    int i33 = zzoy.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzoy.zzk(list8);
                        iZzA7 = zzln.zzA(i14 << 3);
                        iZzh = iZzl + (size * iZzA7);
                    }
                    iZzA18 = i18 + iZzh;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 30:
                    i8 = i9;
                    List list9 = (List) unsafe.getObject(obj, j7);
                    int i34 = zzoy.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzoy.zza(list9);
                        iZzA7 = zzln.zzA(i14 << 3);
                        iZzh = iZzl + (size * iZzA7);
                    }
                    iZzA18 = i18 + iZzh;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 31:
                    i8 = i9;
                    iZzh = zzoy.zzb(i14, (List) unsafe.getObject(obj, j7), false);
                    iZzA18 = i18 + iZzh;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 32:
                    i8 = i9;
                    iZzh = zzoy.zzd(i14, (List) unsafe.getObject(obj, j7), false);
                    iZzA18 = i18 + iZzh;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 33:
                    i8 = i9;
                    List list10 = (List) unsafe.getObject(obj, j7);
                    int i35 = zzoy.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzoy.zzi(list10);
                        iZzA7 = zzln.zzA(i14 << 3);
                        iZzh = iZzl + (size * iZzA7);
                    }
                    iZzA18 = i18 + iZzh;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 34:
                    i8 = i9;
                    List list11 = (List) unsafe.getObject(obj, j7);
                    int i36 = zzoy.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzoy.zzj(list11);
                        iZzA7 = zzln.zzA(i14 << 3);
                        iZzh = iZzl + (size * iZzA7);
                    }
                    iZzA18 = i18 + iZzh;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 35:
                    i8 = i9;
                    iZze = zzoy.zze((List) unsafe.getObject(obj, j7));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i14 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA18 = i18 + iZzA9;
                    } else {
                        iZzA18 = i18;
                    }
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 36:
                    i8 = i9;
                    iZze = zzoy.zzc((List) unsafe.getObject(obj, j7));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i14 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA18 = i18 + iZzA9;
                    } else {
                        iZzA18 = i18;
                    }
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 37:
                    i8 = i9;
                    iZze = zzoy.zzg((List) unsafe.getObject(obj, j7));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i14 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA18 = i18 + iZzA9;
                    } else {
                        iZzA18 = i18;
                    }
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 38:
                    i8 = i9;
                    iZze = zzoy.zzl((List) unsafe.getObject(obj, j7));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i14 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA18 = i18 + iZzA9;
                    } else {
                        iZzA18 = i18;
                    }
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 39:
                    i8 = i9;
                    iZze = zzoy.zzf((List) unsafe.getObject(obj, j7));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i14 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA18 = i18 + iZzA9;
                    } else {
                        iZzA18 = i18;
                    }
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 40:
                    i8 = i9;
                    iZze = zzoy.zze((List) unsafe.getObject(obj, j7));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i14 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA18 = i18 + iZzA9;
                    } else {
                        iZzA18 = i18;
                    }
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 41:
                    i8 = i9;
                    iZze = zzoy.zzc((List) unsafe.getObject(obj, j7));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i14 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA18 = i18 + iZzA9;
                    } else {
                        iZzA18 = i18;
                    }
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 42:
                    i8 = i9;
                    List list12 = (List) unsafe.getObject(obj, j7);
                    int i37 = zzoy.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i14 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA18 = i18 + iZzA9;
                    } else {
                        iZzA18 = i18;
                    }
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 43:
                    i8 = i9;
                    iZze = zzoy.zzk((List) unsafe.getObject(obj, j7));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i14 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA18 = i18 + iZzA9;
                    } else {
                        iZzA18 = i18;
                    }
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 44:
                    i8 = i9;
                    iZze = zzoy.zza((List) unsafe.getObject(obj, j7));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i14 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA18 = i18 + iZzA9;
                    } else {
                        iZzA18 = i18;
                    }
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 45:
                    i8 = i9;
                    iZze = zzoy.zzc((List) unsafe.getObject(obj, j7));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i14 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA18 = i18 + iZzA9;
                    } else {
                        iZzA18 = i18;
                    }
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 46:
                    i8 = i9;
                    iZze = zzoy.zze((List) unsafe.getObject(obj, j7));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i14 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA18 = i18 + iZzA9;
                    } else {
                        iZzA18 = i18;
                    }
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 47:
                    i8 = i9;
                    iZze = zzoy.zzi((List) unsafe.getObject(obj, j7));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i14 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA18 = i18 + iZzA9;
                    } else {
                        iZzA18 = i18;
                    }
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 48:
                    i8 = i9;
                    iZze = zzoy.zzj((List) unsafe.getObject(obj, j7));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i14 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA18 = i18 + iZzA9;
                    } else {
                        iZzA18 = i18;
                    }
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j7);
                    zzow zzowVarZzx2 = zzolVar.zzx(i11);
                    int i38 = zzoy.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZzw = 0;
                    } else {
                        int i39 = 0;
                        iZzw = 0;
                        while (i39 < size6) {
                            iZzw += zzln.zzw(i14, (zzoi) list13.get(i39), zzowVarZzx2);
                            i39++;
                            i9 = i9;
                        }
                    }
                    i8 = i9;
                    iZzA18 = i18 + iZzw;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 50:
                    zzoc zzocVar = (zzoc) unsafe.getObject(obj, j7);
                    if (zzocVar.isEmpty()) {
                        i8 = i9;
                    } else {
                        Iterator it = zzocVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                        i8 = i9;
                    }
                    iZzA18 = i18;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
                case 51:
                    if (zzolVar.zzR(obj, i14, i11)) {
                        iZzA12 = zzln.zzA(i14 << 3);
                        iZzA15 = iZzA12 + 8;
                        iZzA18 = i18 + iZzA15;
                        i8 = i9;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    } else {
                        i8 = i9;
                        iZzA18 = i18;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    break;
                case 52:
                    if (zzolVar.zzR(obj, i14, i11)) {
                        iZzA13 = zzln.zzA(i14 << 3);
                        iZzA15 = iZzA13 + 4;
                        iZzA18 = i18 + iZzA15;
                        i8 = i9;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    } else {
                        i8 = i9;
                        iZzA18 = i18;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    break;
                case 53:
                    if (zzolVar.zzR(obj, i14, i11)) {
                        long jZzv = zzv(obj, j7);
                        iZzA14 = zzln.zzA(i14 << 3);
                        iZzB2 = zzln.zzB(jZzv);
                        iZzA15 = iZzA14 + iZzB2;
                        iZzA18 = i18 + iZzA15;
                        i8 = i9;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    } else {
                        i8 = i9;
                        iZzA18 = i18;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    break;
                case 54:
                    if (zzolVar.zzR(obj, i14, i11)) {
                        long jZzv2 = zzv(obj, j7);
                        iZzA14 = zzln.zzA(i14 << 3);
                        iZzB2 = zzln.zzB(jZzv2);
                        iZzA15 = iZzA14 + iZzB2;
                        iZzA18 = i18 + iZzA15;
                        i8 = i9;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    } else {
                        i8 = i9;
                        iZzA18 = i18;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    break;
                case 55:
                    if (zzolVar.zzR(obj, i14, i11)) {
                        long jZzp = zzp(obj, j7);
                        iZzA14 = zzln.zzA(i14 << 3);
                        iZzB2 = zzln.zzB(jZzp);
                        iZzA15 = iZzA14 + iZzB2;
                        iZzA18 = i18 + iZzA15;
                        i8 = i9;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    } else {
                        i8 = i9;
                        iZzA18 = i18;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    break;
                case 56:
                    if (zzolVar.zzR(obj, i14, i11)) {
                        iZzA12 = zzln.zzA(i14 << 3);
                        iZzA15 = iZzA12 + 8;
                        iZzA18 = i18 + iZzA15;
                        i8 = i9;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    } else {
                        i8 = i9;
                        iZzA18 = i18;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    break;
                case 57:
                    if (zzolVar.zzR(obj, i14, i11)) {
                        iZzA13 = zzln.zzA(i14 << 3);
                        iZzA15 = iZzA13 + 4;
                        iZzA18 = i18 + iZzA15;
                        i8 = i9;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    } else {
                        i8 = i9;
                        iZzA18 = i18;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    break;
                case 58:
                    if (zzolVar.zzR(obj, i14, i11)) {
                        iZzA15 = zzln.zzA(i14 << 3) + i9;
                        iZzA18 = i18 + iZzA15;
                        i8 = i9;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    } else {
                        i8 = i9;
                        iZzA18 = i18;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    break;
                case 59:
                    if (zzolVar.zzR(obj, i14, i11)) {
                        int i40 = i14 << 3;
                        Object object2 = unsafe.getObject(obj, j7);
                        if (object2 instanceof zzle) {
                            iZzA16 = zzln.zzA(i40);
                            iZzd2 = ((zzle) object2).zzd();
                            iZzA17 = zzln.zzA(iZzd2);
                            iZzA15 = iZzA16 + iZzA17 + iZzd2;
                            iZzA18 = i18 + iZzA15;
                            i8 = i9;
                            i11 += 3;
                            i9 = i8;
                            i10 = 1048575;
                        } else {
                            iZzA14 = zzln.zzA(i40);
                            iZzB2 = zzln.zzz((String) object2);
                            iZzA15 = iZzA14 + iZzB2;
                            iZzA18 = i18 + iZzA15;
                            i8 = i9;
                            i11 += 3;
                            i9 = i8;
                            i10 = 1048575;
                        }
                    } else {
                        i8 = i9;
                        iZzA18 = i18;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    break;
                case 60:
                    if (zzolVar.zzR(obj, i14, i11)) {
                        iZzA15 = zzoy.zzh(i14, unsafe.getObject(obj, j7), zzolVar.zzx(i11));
                        iZzA18 = i18 + iZzA15;
                        i8 = i9;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    } else {
                        i8 = i9;
                        iZzA18 = i18;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    break;
                case 61:
                    if (zzolVar.zzR(obj, i14, i11)) {
                        zzle zzleVar2 = (zzle) unsafe.getObject(obj, j7);
                        iZzA16 = zzln.zzA(i14 << 3);
                        iZzd2 = zzleVar2.zzd();
                        iZzA17 = zzln.zzA(iZzd2);
                        iZzA15 = iZzA16 + iZzA17 + iZzd2;
                        iZzA18 = i18 + iZzA15;
                        i8 = i9;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    } else {
                        i8 = i9;
                        iZzA18 = i18;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    break;
                case 62:
                    if (zzolVar.zzR(obj, i14, i11)) {
                        int iZzp = zzp(obj, j7);
                        iZzA14 = zzln.zzA(i14 << 3);
                        iZzB2 = zzln.zzA(iZzp);
                        iZzA15 = iZzA14 + iZzB2;
                        iZzA18 = i18 + iZzA15;
                        i8 = i9;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    } else {
                        i8 = i9;
                        iZzA18 = i18;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    break;
                case 63:
                    if (zzolVar.zzR(obj, i14, i11)) {
                        long jZzp2 = zzp(obj, j7);
                        iZzA14 = zzln.zzA(i14 << 3);
                        iZzB2 = zzln.zzB(jZzp2);
                        iZzA15 = iZzA14 + iZzB2;
                        iZzA18 = i18 + iZzA15;
                        i8 = i9;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    } else {
                        i8 = i9;
                        iZzA18 = i18;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    break;
                case 64:
                    if (zzolVar.zzR(obj, i14, i11)) {
                        iZzA13 = zzln.zzA(i14 << 3);
                        iZzA15 = iZzA13 + 4;
                        iZzA18 = i18 + iZzA15;
                        i8 = i9;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    } else {
                        i8 = i9;
                        iZzA18 = i18;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    break;
                case 65:
                    if (zzolVar.zzR(obj, i14, i11)) {
                        iZzA12 = zzln.zzA(i14 << 3);
                        iZzA15 = iZzA12 + 8;
                        iZzA18 = i18 + iZzA15;
                        i8 = i9;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    } else {
                        i8 = i9;
                        iZzA18 = i18;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    break;
                case 66:
                    if (zzolVar.zzR(obj, i14, i11)) {
                        int iZzp2 = zzp(obj, j7);
                        iZzA14 = zzln.zzA(i14 << 3);
                        iZzB2 = zzln.zzA((iZzp2 >> 31) ^ (iZzp2 + iZzp2));
                        iZzA15 = iZzA14 + iZzB2;
                        iZzA18 = i18 + iZzA15;
                        i8 = i9;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    } else {
                        i8 = i9;
                        iZzA18 = i18;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    break;
                case 67:
                    if (zzolVar.zzR(obj, i14, i11)) {
                        long jZzv3 = zzv(obj, j7);
                        iZzA14 = zzln.zzA(i14 << 3);
                        iZzB2 = zzln.zzB((jZzv3 >> 63) ^ (jZzv3 + jZzv3));
                        iZzA15 = iZzA14 + iZzB2;
                        iZzA18 = i18 + iZzA15;
                        i8 = i9;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    } else {
                        i8 = i9;
                        iZzA18 = i18;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    break;
                case 68:
                    if (zzolVar.zzR(obj, i14, i11)) {
                        iZzA15 = zzln.zzw(i14, (zzoi) unsafe.getObject(obj, j7), zzolVar.zzx(i11));
                        iZzA18 = i18 + iZzA15;
                        i8 = i9;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    } else {
                        i8 = i9;
                        iZzA18 = i18;
                        i11 += 3;
                        i9 = i8;
                        i10 = 1048575;
                    }
                    break;
                default:
                    i8 = i9;
                    iZzA18 = i18;
                    i11 += 3;
                    i9 = i8;
                    i10 = 1048575;
                    break;
            }
        }
        int iZza2 = iZzA18 + ((zznd) obj).zzc.zza();
        if (!zzolVar.zzh) {
            return iZza2;
        }
        zzmt zzmtVar = ((zzna) obj).zzb;
        int iZzc = zzmtVar.zza.zzc();
        int iZza3 = 0;
        for (int i41 = 0; i41 < iZzc; i41++) {
            Map.Entry entryZzg = zzmtVar.zza.zzg(i41);
            iZza3 += zzmt.zza((zzms) ((zzpa) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry2 : zzmtVar.zza.zzd()) {
            iZza3 += zzmt.zza((zzms) entry2.getKey(), entry2.getValue());
        }
        return iZza2 + iZza3;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zzb(Object obj) {
        int i7;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i8;
        int i9 = 0;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzu = zzu(i10);
            int[] iArr = this.zzc;
            int i11 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i12 = iArr[i10];
            long j7 = i11;
            int iHashCode = 37;
            switch (iZzt) {
                case 0:
                    i7 = i9 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzps.zza(obj, j7));
                    byte[] bArr = zznl.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 1:
                    i7 = i9 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzps.zzb(obj, j7));
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 2:
                    i7 = i9 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j7);
                    byte[] bArr2 = zznl.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 3:
                    i7 = i9 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j7);
                    byte[] bArr3 = zznl.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 4:
                    i7 = i9 * 53;
                    iFloatToIntBits = zzps.zzc(obj, j7);
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 5:
                    i7 = i9 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j7);
                    byte[] bArr4 = zznl.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 6:
                    i7 = i9 * 53;
                    iFloatToIntBits = zzps.zzc(obj, j7);
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 7:
                    i7 = i9 * 53;
                    iFloatToIntBits = zznl.zza(zzps.zzw(obj, j7));
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 8:
                    i7 = i9 * 53;
                    iFloatToIntBits = ((String) zzps.zzf(obj, j7)).hashCode();
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 9:
                    i8 = i9 * 53;
                    Object objZzf = zzps.zzf(obj, j7);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i9 = i8 + iHashCode;
                    break;
                case 10:
                    i7 = i9 * 53;
                    iFloatToIntBits = zzps.zzf(obj, j7).hashCode();
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 11:
                    i7 = i9 * 53;
                    iFloatToIntBits = zzps.zzc(obj, j7);
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 12:
                    i7 = i9 * 53;
                    iFloatToIntBits = zzps.zzc(obj, j7);
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 13:
                    i7 = i9 * 53;
                    iFloatToIntBits = zzps.zzc(obj, j7);
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 14:
                    i7 = i9 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j7);
                    byte[] bArr5 = zznl.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 15:
                    i7 = i9 * 53;
                    iFloatToIntBits = zzps.zzc(obj, j7);
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 16:
                    i7 = i9 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j7);
                    byte[] bArr6 = zznl.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 17:
                    i8 = i9 * 53;
                    Object objZzf2 = zzps.zzf(obj, j7);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i9 = i8 + iHashCode;
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
                    i7 = i9 * 53;
                    iFloatToIntBits = zzps.zzf(obj, j7).hashCode();
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 50:
                    i7 = i9 * 53;
                    iFloatToIntBits = zzps.zzf(obj, j7).hashCode();
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 51:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j7));
                        byte[] bArr7 = zznl.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i9 = i7 + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j7));
                        i9 = i7 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        jDoubleToLongBits = zzv(obj, j7);
                        byte[] bArr8 = zznl.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i9 = i7 + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        jDoubleToLongBits = zzv(obj, j7);
                        byte[] bArr9 = zznl.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i9 = i7 + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        iFloatToIntBits = zzp(obj, j7);
                        i9 = i7 + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        jDoubleToLongBits = zzv(obj, j7);
                        byte[] bArr10 = zznl.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i9 = i7 + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        iFloatToIntBits = zzp(obj, j7);
                        i9 = i7 + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        iFloatToIntBits = zznl.zza(zzS(obj, j7));
                        i9 = i7 + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        iFloatToIntBits = ((String) zzps.zzf(obj, j7)).hashCode();
                        i9 = i7 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        iFloatToIntBits = zzps.zzf(obj, j7).hashCode();
                        i9 = i7 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        iFloatToIntBits = zzps.zzf(obj, j7).hashCode();
                        i9 = i7 + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        iFloatToIntBits = zzp(obj, j7);
                        i9 = i7 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        iFloatToIntBits = zzp(obj, j7);
                        i9 = i7 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        iFloatToIntBits = zzp(obj, j7);
                        i9 = i7 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        jDoubleToLongBits = zzv(obj, j7);
                        byte[] bArr11 = zznl.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i9 = i7 + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        iFloatToIntBits = zzp(obj, j7);
                        i9 = i7 + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        jDoubleToLongBits = zzv(obj, j7);
                        byte[] bArr12 = zznl.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i9 = i7 + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (zzR(obj, i12, i10)) {
                        i7 = i9 * 53;
                        iFloatToIntBits = zzps.zzf(obj, j7).hashCode();
                        i9 = i7 + iFloatToIntBits;
                    }
                    break;
            }
        }
        int iHashCode2 = (i9 * 53) + ((zznd) obj).zzc.hashCode();
        return this.zzh ? (iHashCode2 * 53) + ((zzna) obj).zzb.zza.hashCode() : iHashCode2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 38561. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int zzc(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.recaptcha.internal.zzkt r40) {
        /*
            Method dump skipped, instruction units count: 3856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzkt):int");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final Object zze() {
        return ((zznd) this.zzg).zzv();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084 A[SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zznd) {
                zznd zzndVar = (zznd) obj;
                zzndVar.zzJ(C3553a.e.API_PRIORITY_OTHER);
                zzndVar.zza = 0;
                zzndVar.zzH();
            }
            int[] iArr = this.zzc;
            for (int i7 = 0; i7 < iArr.length; i7 += 3) {
                int iZzu = zzu(i7);
                int i8 = 1048575 & iZzu;
                int iZzt = zzt(iZzu);
                long j7 = i8;
                if (iZzt != 9) {
                    if (iZzt != 60 && iZzt != 68) {
                        switch (iZzt) {
                            case 17:
                                if (zzN(obj, i7)) {
                                    zzx(i7).zzf(zzb.getObject(obj, j7));
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
                                ((zznk) zzps.zzf(obj, j7)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j7);
                                if (object != null) {
                                    ((zzoc) object).zzc();
                                    unsafe.putObject(obj, j7, object);
                                }
                                break;
                        }
                    } else if (zzR(obj, this.zzc[i7], i7)) {
                        zzx(i7).zzf(zzb.getObject(obj, j7));
                    }
                } else if (zzN(obj, i7)) {
                    zzx(i7).zzf(zzb.getObject(obj, j7));
                }
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int iZzu = zzu(i7);
            int i8 = 1048575 & iZzu;
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i9 = iArr[i7];
            long j7 = i8;
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i7)) {
                        zzps.zzo(obj, j7, zzps.zza(obj2, j7));
                        zzH(obj, i7);
                    }
                    break;
                case 1:
                    if (zzN(obj2, i7)) {
                        zzps.zzp(obj, j7, zzps.zzb(obj2, j7));
                        zzH(obj, i7);
                    }
                    break;
                case 2:
                    if (zzN(obj2, i7)) {
                        zzps.zzr(obj, j7, zzps.zzd(obj2, j7));
                        zzH(obj, i7);
                    }
                    break;
                case 3:
                    if (zzN(obj2, i7)) {
                        zzps.zzr(obj, j7, zzps.zzd(obj2, j7));
                        zzH(obj, i7);
                    }
                    break;
                case 4:
                    if (zzN(obj2, i7)) {
                        zzps.zzq(obj, j7, zzps.zzc(obj2, j7));
                        zzH(obj, i7);
                    }
                    break;
                case 5:
                    if (zzN(obj2, i7)) {
                        zzps.zzr(obj, j7, zzps.zzd(obj2, j7));
                        zzH(obj, i7);
                    }
                    break;
                case 6:
                    if (zzN(obj2, i7)) {
                        zzps.zzq(obj, j7, zzps.zzc(obj2, j7));
                        zzH(obj, i7);
                    }
                    break;
                case 7:
                    if (zzN(obj2, i7)) {
                        zzps.zzm(obj, j7, zzps.zzw(obj2, j7));
                        zzH(obj, i7);
                    }
                    break;
                case 8:
                    if (zzN(obj2, i7)) {
                        zzps.zzs(obj, j7, zzps.zzf(obj2, j7));
                        zzH(obj, i7);
                    }
                    break;
                case 9:
                    zzE(obj, obj2, i7);
                    break;
                case 10:
                    if (zzN(obj2, i7)) {
                        zzps.zzs(obj, j7, zzps.zzf(obj2, j7));
                        zzH(obj, i7);
                    }
                    break;
                case 11:
                    if (zzN(obj2, i7)) {
                        zzps.zzq(obj, j7, zzps.zzc(obj2, j7));
                        zzH(obj, i7);
                    }
                    break;
                case 12:
                    if (zzN(obj2, i7)) {
                        zzps.zzq(obj, j7, zzps.zzc(obj2, j7));
                        zzH(obj, i7);
                    }
                    break;
                case 13:
                    if (zzN(obj2, i7)) {
                        zzps.zzq(obj, j7, zzps.zzc(obj2, j7));
                        zzH(obj, i7);
                    }
                    break;
                case 14:
                    if (zzN(obj2, i7)) {
                        zzps.zzr(obj, j7, zzps.zzd(obj2, j7));
                        zzH(obj, i7);
                    }
                    break;
                case 15:
                    if (zzN(obj2, i7)) {
                        zzps.zzq(obj, j7, zzps.zzc(obj2, j7));
                        zzH(obj, i7);
                    }
                    break;
                case 16:
                    if (zzN(obj2, i7)) {
                        zzps.zzr(obj, j7, zzps.zzd(obj2, j7));
                        zzH(obj, i7);
                    }
                    break;
                case 17:
                    zzE(obj, obj2, i7);
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
                    zznk zznkVarZzd = (zznk) zzps.zzf(obj, j7);
                    zznk zznkVar = (zznk) zzps.zzf(obj2, j7);
                    int size = zznkVarZzd.size();
                    int size2 = zznkVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zznkVarZzd.zzc()) {
                            zznkVarZzd = zznkVarZzd.zzd(size2 + size);
                        }
                        zznkVarZzd.addAll(zznkVar);
                    }
                    if (size > 0) {
                        zznkVar = zznkVarZzd;
                    }
                    zzps.zzs(obj, j7, zznkVar);
                    break;
                case 50:
                    int i10 = zzoy.zza;
                    zzps.zzs(obj, j7, zzod.zzb(zzps.zzf(obj, j7), zzps.zzf(obj2, j7)));
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
                    if (zzR(obj2, i9, i7)) {
                        zzps.zzs(obj, j7, zzps.zzf(obj2, j7));
                        zzI(obj, i9, i7);
                    }
                    break;
                case 60:
                    zzF(obj, obj2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i9, i7)) {
                        zzps.zzs(obj, j7, zzps.zzf(obj2, j7));
                        zzI(obj, i9, i7);
                    }
                    break;
                case 68:
                    zzF(obj, obj2, i7);
                    break;
            }
        }
        zzoy.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzoy.zzp(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:237:0x0851 A[LOOP:2: B:235:0x084d->B:237:0x0851, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:239:0x085f  */
    /* JADX WARN: Code duplicated, block: B:247:0x0872 A[LOOP:3: B:245:0x086e->B:247:0x0872, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:249:0x0882  */
    /* JADX WARN: Code duplicated, block: B:256:0x083e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x084b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0174  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179 A[Catch: all -> 0x005e, TryCatch #14 {all -> 0x005e, blocks: (B:21:0x0055, B:26:0x0066, B:28:0x006e, B:29:0x0072, B:62:0x0168, B:70:0x0193, B:67:0x0179, B:69:0x0181, B:31:0x0078, B:32:0x0082, B:33:0x008c, B:34:0x0096, B:35:0x00a0, B:36:0x00a7, B:37:0x00a8, B:38:0x00b2, B:39:0x00b8, B:41:0x00c2, B:43:0x00d7, B:44:0x00e4, B:45:0x00e9, B:46:0x00ea, B:48:0x00f4, B:50:0x0109, B:51:0x0116, B:52:0x011b, B:53:0x011c, B:54:0x0121, B:55:0x012a, B:56:0x0133, B:57:0x013c, B:58:0x0145, B:59:0x014e, B:60:0x0157, B:61:0x0160, B:72:0x019c, B:73:0x019f, B:75:0x01a2), top: B:264:0x0055 }] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzh(Object obj, zzov zzovVar, zzmo zzmoVar) throws Throwable {
        Object obj2;
        zzol<T> zzolVar;
        Object obj3;
        int i7;
        int i8;
        zzpl zzplVar;
        zzpl zzplVar2;
        Object obj4;
        zzpl zzplVar3;
        Object obj5;
        zznc zzncVarZza;
        zznc zzncVar;
        Object objValueOf;
        int iOrdinal;
        Object objZze;
        int i9;
        Object obj6;
        Object obj7;
        zzol<T> zzolVar2 = this;
        boolean z7 = 1;
        zzmoVar.getClass();
        zzD(obj);
        zzpl zzplVar4 = zzolVar2.zzm;
        Throwable th = null;
        Object objZza = null;
        zzmt zzmtVarZzi = null;
        while (true) {
            try {
                int iZzc = zzovVar.zzc();
                int iZzq = zzolVar2.zzq(iZzc);
                if (iZzq >= 0) {
                    obj5 = obj;
                    zzplVar3 = zzplVar4;
                    obj4 = objZza;
                    try {
                        int iZzu = zzolVar2.zzu(iZzq);
                        try {
                            switch (zzt(iZzu)) {
                                case 0:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    i7 = z7 ? 1 : 0;
                                    zzps.zzo(obj5, iZzu & 1048575, zzovVar.zza());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 1:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    i7 = z7 ? 1 : 0;
                                    zzps.zzp(obj5, iZzu & 1048575, zzovVar.zzb());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 2:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    i7 = z7 ? 1 : 0;
                                    zzps.zzr(obj5, iZzu & 1048575, zzovVar.zzl());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 3:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    i7 = z7 ? 1 : 0;
                                    zzps.zzr(obj5, iZzu & 1048575, zzovVar.zzo());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 4:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    i7 = z7 ? 1 : 0;
                                    zzps.zzq(obj5, iZzu & 1048575, zzovVar.zzg());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 5:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    i7 = z7 ? 1 : 0;
                                    zzps.zzr(obj5, iZzu & 1048575, zzovVar.zzk());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 6:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    i7 = z7 ? 1 : 0;
                                    zzps.zzq(obj5, iZzu & 1048575, zzovVar.zzf());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 7:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    i7 = z7 ? 1 : 0;
                                    zzps.zzm(obj5, iZzu & 1048575, zzovVar.zzN());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 8:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    i7 = z7 ? 1 : 0;
                                    zzolVar.zzG(obj5, iZzu, zzovVar);
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 9:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    i7 = z7 ? 1 : 0;
                                    zzoi zzoiVar = (zzoi) zzolVar.zzA(obj5, iZzq);
                                    zzovVar.zzu(zzoiVar, zzolVar.zzx(iZzq), zzmoVar);
                                    zzolVar.zzJ(obj5, iZzq, zzoiVar);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 10:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    i7 = z7 ? 1 : 0;
                                    zzps.zzs(obj5, iZzu & 1048575, zzovVar.zzp());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 11:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    i7 = z7 ? 1 : 0;
                                    zzps.zzq(obj5, iZzu & 1048575, zzovVar.zzj());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 12:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    i7 = z7 ? 1 : 0;
                                    int iZze = zzovVar.zze();
                                    zznh zznhVarZzw = zzolVar.zzw(iZzq);
                                    if (zznhVarZzw == null || zznhVarZzw.zza(iZze)) {
                                        zzps.zzq(obj5, iZzu & 1048575, iZze);
                                        zzolVar.zzH(obj5, iZzq);
                                        objZza = obj3;
                                    } else {
                                        objZza = zzoy.zzo(obj5, iZzc, iZze, obj3, zzplVar4);
                                    }
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 13:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    i7 = z7 ? 1 : 0;
                                    zzps.zzq(obj5, iZzu & 1048575, zzovVar.zzh());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 14:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    i7 = z7 ? 1 : 0;
                                    zzps.zzr(obj5, iZzu & 1048575, zzovVar.zzm());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 15:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    i7 = z7 ? 1 : 0;
                                    zzps.zzq(obj5, iZzu & 1048575, zzovVar.zzi());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 16:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    obj2 = obj5;
                                    int i10 = iZzu & 1048575;
                                    long jZzn = zzovVar.zzn();
                                    i7 = z7 ? 1 : 0;
                                    try {
                                        zzps.zzr(obj2, i10, jZzn);
                                        zzolVar.zzH(obj2, iZzq);
                                        objZza = obj3;
                                    } catch (zznm unused) {
                                        objZza = obj3;
                                        if (objZza == null) {
                                            try {
                                                objZza = zzplVar4.zza(obj2);
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        }
                                        if (!zzplVar4.zzk(objZza, zzovVar, 0)) {
                                            for (i9 = zzolVar.zzk; i9 < zzolVar.zzl; i9 += i7 == true ? 1 : 0) {
                                                zzolVar.zzy(obj2, zzolVar.zzj[i9], objZza, zzplVar4, obj);
                                            }
                                            if (objZza != null) {
                                                zzplVar4.zzj(obj2, objZza);
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 17:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    zzoi zzoiVar2 = (zzoi) zzolVar.zzA(obj5, iZzq);
                                    zzovVar.zzt(zzoiVar2, zzolVar.zzx(iZzq), zzmoVar);
                                    zzolVar.zzJ(obj5, iZzq, zzoiVar2);
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 18:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    zzovVar.zzx(zznv.zza(obj5, iZzu & 1048575));
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 19:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    zzovVar.zzB(zznv.zza(obj5, iZzu & 1048575));
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 20:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    zzovVar.zzE(zznv.zza(obj5, iZzu & 1048575));
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case zzbbn.zzt.zzm /* 21 */:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    zzovVar.zzM(zznv.zza(obj5, iZzu & 1048575));
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 22:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    zzovVar.zzD(zznv.zza(obj5, iZzu & 1048575));
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 23:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    zzovVar.zzA(zznv.zza(obj5, iZzu & 1048575));
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 24:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    zzovVar.zzz(zznv.zza(obj5, iZzu & 1048575));
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 25:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    zzovVar.zzv(zznv.zza(obj5, iZzu & 1048575));
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 26:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    if (zzM(iZzu)) {
                                        ((zzlj) zzovVar).zzK(zznv.zza(obj5, iZzu & 1048575), z7);
                                    } else {
                                        ((zzlj) zzovVar).zzK(zznv.zza(obj5, iZzu & 1048575), false);
                                    }
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 27:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    zzovVar.zzF(zznv.zza(obj5, iZzu & 1048575), zzolVar.zzx(iZzq), zzmoVar);
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 28:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    zzovVar.zzw(zznv.zza(obj5, iZzu & 1048575));
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 29:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    zzovVar.zzL(zznv.zza(obj5, iZzu & 1048575));
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 30:
                                    zzolVar = zzolVar2;
                                    List listZza = zznv.zza(obj5, iZzu & 1048575);
                                    zzovVar.zzy(listZza);
                                    zzplVar2 = zzplVar3;
                                    objZza = zzoy.zzn(obj5, iZzc, listZza, zzolVar.zzw(iZzq), obj4, zzplVar2);
                                    zzplVar4 = zzplVar2;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 31:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    zzovVar.zzG(zznv.zza(obj5, iZzu & 1048575));
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 32:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    zzovVar.zzH(zznv.zza(obj5, iZzu & 1048575));
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 33:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    zzovVar.zzI(zznv.zza(obj5, iZzu & 1048575));
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 34:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    zzovVar.zzJ(zznv.zza(obj5, iZzu & 1048575));
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 35:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    zzovVar.zzx(zznv.zza(obj5, iZzu & 1048575));
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 36:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    zzovVar.zzB(zznv.zza(obj5, iZzu & 1048575));
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 37:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    zzovVar.zzE(zznv.zza(obj5, iZzu & 1048575));
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 38:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    zzovVar.zzM(zznv.zza(obj5, iZzu & 1048575));
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 39:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    zzovVar.zzD(zznv.zza(obj5, iZzu & 1048575));
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 40:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    zzovVar.zzA(zznv.zza(obj5, iZzu & 1048575));
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 41:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    zzovVar.zzz(zznv.zza(obj5, iZzu & 1048575));
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 42:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    zzovVar.zzv(zznv.zza(obj5, iZzu & 1048575));
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 43:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar3;
                                    obj2 = obj5;
                                    try {
                                        zzovVar.zzL(zznv.zza(obj2, iZzu & 1048575));
                                        i7 = z7 ? 1 : 0;
                                        objZza = obj3;
                                    } catch (zznm unused2) {
                                        i7 = z7 ? 1 : 0;
                                        objZza = obj3;
                                        if (objZza == null) {
                                            objZza = zzplVar4.zza(obj2);
                                        }
                                        if (!zzplVar4.zzk(objZza, zzovVar, 0)) {
                                            while (i9 < zzolVar.zzl) {
                                                zzolVar.zzy(obj2, zzolVar.zzj[i9], objZza, zzplVar4, obj);
                                            }
                                            if (objZza != null) {
                                                zzplVar4.zzj(obj2, objZza);
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        i7 = z7 ? 1 : 0;
                                        objZza = obj3;
                                        i8 = zzolVar.zzk;
                                        while (i8 < zzolVar.zzl) {
                                            zzolVar.zzy(obj2, zzolVar.zzj[i8], objZza, zzplVar4, obj);
                                            i8 += i7;
                                            zzolVar = this;
                                        }
                                        if (objZza != null) {
                                            zzplVar4.zzj(obj2, objZza);
                                        }
                                        throw th;
                                    }
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 44:
                                    zzolVar = zzolVar2;
                                    zzplVar2 = zzplVar3;
                                    List listZza2 = zznv.zza(obj5, iZzu & 1048575);
                                    zzovVar.zzy(listZza2);
                                    objZza = zzoy.zzn(obj5, iZzc, listZza2, zzolVar.zzw(iZzq), obj4, zzplVar2);
                                    zzplVar4 = zzplVar2;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 45:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar2 = zzplVar3;
                                    zzovVar.zzG(zznv.zza(obj6, iZzu & 1048575));
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 46:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar2 = zzplVar3;
                                    zzovVar.zzH(zznv.zza(obj6, iZzu & 1048575));
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 47:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar2 = zzplVar3;
                                    zzovVar.zzI(zznv.zza(obj6, iZzu & 1048575));
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 48:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar2 = zzplVar3;
                                    zzovVar.zzJ(zznv.zza(obj6, iZzu & 1048575));
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 49:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar2 = zzplVar3;
                                    zzovVar.zzC(zznv.zza(obj6, iZzu & 1048575), zzolVar.zzx(iZzq), zzmoVar);
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 50:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar2 = zzplVar3;
                                    Object objZzz = zzolVar.zzz(iZzq);
                                    long jZzu = zzolVar.zzu(iZzq) & 1048575;
                                    Object objZzf = zzps.zzf(obj6, jZzu);
                                    if (objZzf == null) {
                                        zzoc zzocVarZzb = zzoc.zza().zzb();
                                        zzps.zzs(obj6, jZzu, zzocVarZzb);
                                        obj7 = zzocVarZzb;
                                    } else if (zzod.zza(objZzf)) {
                                        obj7 = objZzf;
                                        zzoc zzocVarZzb2 = zzoc.zza().zzb();
                                        zzod.zzb(zzocVarZzb2, objZzf);
                                        zzps.zzs(obj6, jZzu, zzocVarZzb2);
                                        obj7 = zzocVarZzb2;
                                    }
                                    obj7 = objZzf;
                                    throw th;
                                case 51:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar2 = zzplVar3;
                                    zzps.zzs(obj6, iZzu & 1048575, Double.valueOf(zzovVar.zza()));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 52:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar2 = zzplVar3;
                                    zzps.zzs(obj6, iZzu & 1048575, Float.valueOf(zzovVar.zzb()));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 53:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar2 = zzplVar3;
                                    zzps.zzs(obj6, iZzu & 1048575, Long.valueOf(zzovVar.zzl()));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 54:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar2 = zzplVar3;
                                    zzps.zzs(obj6, iZzu & 1048575, Long.valueOf(zzovVar.zzo()));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 55:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar2 = zzplVar3;
                                    zzps.zzs(obj6, iZzu & 1048575, Integer.valueOf(zzovVar.zzg()));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 56:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar2 = zzplVar3;
                                    zzps.zzs(obj6, iZzu & 1048575, Long.valueOf(zzovVar.zzk()));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 57:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar2 = zzplVar3;
                                    zzps.zzs(obj6, iZzu & 1048575, Integer.valueOf(zzovVar.zzf()));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 58:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar2 = zzplVar3;
                                    zzps.zzs(obj6, iZzu & 1048575, Boolean.valueOf(zzovVar.zzN()));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 59:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar2 = zzplVar3;
                                    zzolVar.zzG(obj6, iZzu, zzovVar);
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 60:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar2 = zzplVar3;
                                    zzoi zzoiVar3 = (zzoi) zzolVar.zzB(obj6, iZzc, iZzq);
                                    zzovVar.zzu(zzoiVar3, zzolVar.zzx(iZzq), zzmoVar);
                                    zzolVar.zzK(obj6, iZzc, iZzq, zzoiVar3);
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 61:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar2 = zzplVar3;
                                    zzps.zzs(obj6, iZzu & 1048575, zzovVar.zzp());
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 62:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar2 = zzplVar3;
                                    zzps.zzs(obj6, iZzu & 1048575, Integer.valueOf(zzovVar.zzj()));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 63:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar2 = zzplVar3;
                                    int iZze2 = zzovVar.zze();
                                    zznh zznhVarZzw2 = zzolVar.zzw(iZzq);
                                    if (zznhVarZzw2 != null && !zznhVarZzw2.zza(iZze2)) {
                                        objZza = zzoy.zzo(obj6, iZzc, iZze2, obj4, zzplVar2);
                                        zzplVar4 = zzplVar2;
                                        zzolVar2 = zzolVar;
                                    }
                                    zzps.zzs(obj6, iZzu & 1048575, Integer.valueOf(iZze2));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 64:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar2 = zzplVar3;
                                    zzps.zzs(obj6, iZzu & 1048575, Integer.valueOf(zzovVar.zzh()));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 65:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar2 = zzplVar3;
                                    zzps.zzs(obj6, iZzu & 1048575, Long.valueOf(zzovVar.zzm()));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 66:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar2 = zzplVar3;
                                    zzps.zzs(obj6, iZzu & 1048575, Integer.valueOf(zzovVar.zzi()));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 67:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar2 = zzplVar3;
                                    zzps.zzs(obj6, iZzu & 1048575, Long.valueOf(zzovVar.zzn()));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                case 68:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar2 = zzplVar3;
                                    try {
                                        zzoi zzoiVar4 = (zzoi) zzolVar.zzB(obj6, iZzc, iZzq);
                                        zzovVar.zzt(zzoiVar4, zzolVar.zzx(iZzq), zzmoVar);
                                        zzolVar.zzK(obj6, iZzc, iZzq, zzoiVar4);
                                        obj3 = obj4;
                                        zzplVar4 = zzplVar2;
                                        i7 = z7 ? 1 : 0;
                                        objZza = obj3;
                                    } catch (zznm unused3) {
                                        obj2 = obj6;
                                        obj3 = obj4;
                                        zzplVar4 = zzplVar2;
                                        i7 = z7 ? 1 : 0;
                                        objZza = obj3;
                                        if (objZza == null) {
                                            objZza = zzplVar4.zza(obj2);
                                        }
                                        if (!zzplVar4.zzk(objZza, zzovVar, 0)) {
                                            while (i9 < zzolVar.zzl) {
                                                zzolVar.zzy(obj2, zzolVar.zzj[i9], objZza, zzplVar4, obj);
                                            }
                                            if (objZza != null) {
                                                zzplVar4.zzj(obj2, objZza);
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        obj2 = obj6;
                                        obj3 = obj4;
                                        zzplVar4 = zzplVar2;
                                        i7 = z7 ? 1 : 0;
                                        objZza = obj3;
                                        i8 = zzolVar.zzk;
                                        while (i8 < zzolVar.zzl) {
                                            zzolVar.zzy(obj2, zzolVar.zzj[i8], objZza, zzplVar4, obj);
                                            i8 += i7;
                                            zzolVar = this;
                                        }
                                        if (objZza != null) {
                                            zzplVar4.zzj(obj2, objZza);
                                        }
                                        throw th;
                                    }
                                    zzolVar2 = zzolVar;
                                    z7 = i7;
                                    th = null;
                                    break;
                                default:
                                    objZza = obj4 == null ? zzplVar3.zza(obj5) : obj4;
                                    try {
                                        if (zzplVar3.zzk(objZza, zzovVar, 0)) {
                                            zzolVar = zzolVar2;
                                            zzplVar2 = zzplVar3;
                                            zzplVar4 = zzplVar2;
                                            zzolVar2 = zzolVar;
                                        } else {
                                            int i11 = zzolVar2.zzk;
                                            while (i11 < zzolVar2.zzl) {
                                                zzpl zzplVar5 = zzplVar3;
                                                zzolVar2.zzy(obj, zzolVar2.zzj[i11], objZza, zzplVar5, obj);
                                                i11 += z7 ? 1 : 0;
                                                obj5 = obj;
                                                zzolVar2 = zzolVar2;
                                                zzplVar3 = zzplVar5;
                                            }
                                            Object obj8 = obj5;
                                            zzplVar = zzplVar3;
                                            obj2 = obj8;
                                            zzplVar4 = zzplVar;
                                        }
                                    } catch (zznm unused4) {
                                        zzolVar = zzolVar2;
                                        obj2 = obj5;
                                        zzplVar4 = zzplVar3;
                                        i7 = z7 ? 1 : 0;
                                        if (objZza == null) {
                                            objZza = zzplVar4.zza(obj2);
                                        }
                                        if (!zzplVar4.zzk(objZza, zzovVar, 0)) {
                                            while (i9 < zzolVar.zzl) {
                                                zzolVar.zzy(obj2, zzolVar.zzj[i9], objZza, zzplVar4, obj);
                                            }
                                        }
                                        zzolVar2 = zzolVar;
                                        z7 = i7;
                                        th = null;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        zzolVar = zzolVar2;
                                        obj2 = obj5;
                                        zzplVar4 = zzplVar3;
                                        i7 = z7 ? 1 : 0;
                                    }
                                    break;
                            }
                        } catch (zznm unused5) {
                            zzolVar = zzolVar2;
                            obj3 = obj4;
                            zzplVar4 = zzplVar3;
                            obj2 = obj5;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        zzpl zzplVar6 = zzplVar3;
                        zzolVar = zzolVar2;
                        obj3 = obj4;
                        zzplVar4 = zzplVar6;
                        obj2 = obj5;
                        i7 = z7 ? 1 : 0;
                        objZza = obj3;
                        i8 = zzolVar.zzk;
                        while (i8 < zzolVar.zzl) {
                            zzolVar.zzy(obj2, zzolVar.zzj[i8], objZza, zzplVar4, obj);
                            i8 += i7;
                            zzolVar = this;
                        }
                        if (objZza != null) {
                            zzplVar4.zzj(obj2, objZza);
                        }
                        throw th;
                    }
                } else if (iZzc == Integer.MAX_VALUE) {
                    int i12 = zzolVar2.zzk;
                    while (i12 < zzolVar2.zzl) {
                        zzolVar2.zzy(obj, zzolVar2.zzj[i12], objZza, zzplVar4, obj);
                        i12 += z7 ? 1 : 0;
                        zzplVar4 = zzplVar4;
                    }
                    zzplVar = zzplVar4;
                    obj2 = obj;
                    zzplVar4 = zzplVar;
                } else {
                    Object obj9 = obj;
                    zzplVar2 = zzplVar4;
                    obj4 = objZza;
                    try {
                        if (zzolVar2.zzh) {
                            zzncVarZza = zzmoVar.zza(zzolVar2.zzg, iZzc);
                        } else {
                            zzncVar = th;
                        }
                        if (zzncVar != 0) {
                            zzncVar = zzncVarZza;
                            if (zzmtVarZzi == null) {
                                try {
                                    zzmtVarZzi = ((zzna) obj9).zzi();
                                } catch (Throwable th8) {
                                    th = th8;
                                    zzolVar = zzolVar2;
                                    obj2 = obj9;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    i7 = z7 ? 1 : 0;
                                    objZza = obj3;
                                    i8 = zzolVar.zzk;
                                    while (i8 < zzolVar.zzl) {
                                        zzolVar.zzy(obj2, zzolVar.zzj[i8], objZza, zzplVar4, obj);
                                        i8 += i7;
                                        zzolVar = this;
                                    }
                                    if (objZza != null) {
                                        zzplVar4.zzj(obj2, objZza);
                                    }
                                    throw th;
                                }
                            }
                            zznb zznbVar = zzncVar.zza;
                            zzpw zzpwVar = zzpw.zzn;
                            zzpw zzpwVar2 = zznbVar.zzb;
                            if (zzpwVar2 == zzpwVar) {
                                zzovVar.zzg();
                                throw th;
                            }
                            switch (zzpwVar2.ordinal()) {
                                case 0:
                                    objValueOf = Double.valueOf(zzovVar.zza());
                                    iOrdinal = zzncVar.zza.zzb.ordinal();
                                    if ((iOrdinal != 9 || iOrdinal == 10) && (objZze = zzmtVarZzi.zze(zzncVar.zza)) != null) {
                                        byte[] bArr = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVar.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 1:
                                    objValueOf = Float.valueOf(zzovVar.zzb());
                                    iOrdinal = zzncVar.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr2 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr3 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVar.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 2:
                                    objValueOf = Long.valueOf(zzovVar.zzl());
                                    iOrdinal = zzncVar.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr4 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr5 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVar.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 3:
                                    objValueOf = Long.valueOf(zzovVar.zzo());
                                    iOrdinal = zzncVar.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr6 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr7 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVar.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 4:
                                    objValueOf = Integer.valueOf(zzovVar.zzg());
                                    iOrdinal = zzncVar.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr8 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr9 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVar.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 5:
                                    objValueOf = Long.valueOf(zzovVar.zzk());
                                    iOrdinal = zzncVar.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr10 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr11 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVar.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 6:
                                    objValueOf = Integer.valueOf(zzovVar.zzf());
                                    iOrdinal = zzncVar.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr12 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr13 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVar.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 7:
                                    objValueOf = Boolean.valueOf(zzovVar.zzN());
                                    iOrdinal = zzncVar.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr14 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr15 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVar.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 8:
                                    objValueOf = zzovVar.zzr();
                                    iOrdinal = zzncVar.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr16 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr17 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVar.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 9:
                                    Object objZze2 = zzmtVarZzi.zze(zzncVar.zza);
                                    if (!(objZze2 instanceof zznd)) {
                                        throw th;
                                    }
                                    zzow zzowVarZzb = zzos.zza().zzb(objZze2.getClass());
                                    if (!((zznd) objZze2).zzL()) {
                                        Object objZze3 = zzowVarZzb.zze();
                                        zzowVarZzb.zzg(objZze3, objZze2);
                                        zzmtVarZzi.zzi(zzncVar.zza, objZze3);
                                        objZze2 = objZze3;
                                    }
                                    zzovVar.zzt(objZze2, zzowVarZzb, zzmoVar);
                                    objZza = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                    break;
                                case 10:
                                    Object objZze4 = zzmtVarZzi.zze(zzncVar.zza);
                                    if (!(objZze4 instanceof zznd)) {
                                        throw th;
                                    }
                                    zzow zzowVarZzb2 = zzos.zza().zzb(objZze4.getClass());
                                    if (!((zznd) objZze4).zzL()) {
                                        Object objZze5 = zzowVarZzb2.zze();
                                        zzowVarZzb2.zzg(objZze5, objZze4);
                                        zzmtVarZzi.zzi(zzncVar.zza, objZze5);
                                        objZze4 = objZze5;
                                    }
                                    zzovVar.zzu(objZze4, zzowVarZzb2, zzmoVar);
                                    objZza = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                    break;
                                case 11:
                                    objValueOf = zzovVar.zzp();
                                    iOrdinal = zzncVar.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr18 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr19 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVar.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 12:
                                    objValueOf = Integer.valueOf(zzovVar.zzj());
                                    iOrdinal = zzncVar.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr110 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr111 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVar.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 13:
                                    throw new IllegalStateException("Shouldn't reach here.");
                                case 14:
                                    objValueOf = Integer.valueOf(zzovVar.zzh());
                                    iOrdinal = zzncVar.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr112 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr113 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVar.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 15:
                                    objValueOf = Long.valueOf(zzovVar.zzm());
                                    iOrdinal = zzncVar.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr114 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr115 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVar.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 16:
                                    objValueOf = Integer.valueOf(zzovVar.zzi());
                                    iOrdinal = zzncVar.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr116 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr117 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVar.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 17:
                                    objValueOf = Long.valueOf(zzovVar.zzn());
                                    iOrdinal = zzncVar.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr118 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr119 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVar.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                default:
                                    objValueOf = th;
                                    iOrdinal = zzncVar.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr1110 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr1111 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVar.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                            }
                        } else {
                            zzncVar = zzncVarZza;
                            objZza = obj4 == null ? zzplVar2.zza(obj9) : obj4;
                            try {
                                if (zzplVar2.zzk(objZza, zzovVar, 0)) {
                                    zzplVar4 = zzplVar2;
                                } else {
                                    int i13 = zzolVar2.zzk;
                                    while (i13 < zzolVar2.zzl) {
                                        zzpl zzplVar7 = zzplVar2;
                                        Object obj10 = obj9;
                                        zzolVar2.zzy(obj10, zzolVar2.zzj[i13], objZza, zzplVar7, obj);
                                        i13 += z7 ? 1 : 0;
                                        obj9 = obj10;
                                        zzplVar2 = zzplVar7;
                                    }
                                    obj2 = obj9;
                                    zzplVar4 = zzplVar2;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                obj2 = obj9;
                                i7 = z7 ? 1 : 0;
                                zzplVar4 = zzplVar2;
                                zzolVar = zzolVar2;
                            }
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        zzplVar3 = zzplVar2;
                        obj5 = obj9;
                        zzpl zzplVar8 = zzplVar3;
                        zzolVar = zzolVar2;
                        obj3 = obj4;
                        zzplVar4 = zzplVar8;
                        obj2 = obj5;
                        i7 = z7 ? 1 : 0;
                        objZza = obj3;
                    }
                }
            } catch (Throwable th11) {
                th = th11;
                obj2 = obj;
                zzolVar = zzolVar2;
                obj3 = objZza;
            }
            objZza = obj3;
            i8 = zzolVar.zzk;
            while (i8 < zzolVar.zzl) {
                zzolVar.zzy(obj2, zzolVar.zzj[i8], objZza, zzplVar4, obj);
                i8 += i7;
                zzolVar = this;
            }
            if (objZza != null) {
                zzplVar4.zzj(obj2, objZza);
            }
            throw th;
        }
        if (objZza != null) {
            zzplVar4.zzj(obj2, objZza);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzi(Object obj, byte[] bArr, int i7, int i8, zzkt zzktVar) {
        zzc(obj, bArr, i7, i8, 0, zzktVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzj(Object obj, zzpy zzpyVar) {
        Map.Entry entry;
        Iterator it;
        int i7;
        int i8;
        int i9;
        zzol<T> zzolVar = this;
        if (zzolVar.zzh) {
            zzmt zzmtVar = ((zzna) obj).zzb;
            if (zzmtVar.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzf = zzmtVar.zzf();
                entry = (Map.Entry) itZzf.next();
                it = itZzf;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = zzolVar.zzc;
        Unsafe unsafe = zzb;
        int i10 = 1048575;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (i12 < iArr.length) {
            int iZzu = zzolVar.zzu(i12);
            int[] iArr2 = zzolVar.zzc;
            int iZzt = zzt(iZzu);
            int i14 = iArr2[i12];
            if (iZzt <= 17) {
                int i15 = iArr2[i12 + 2];
                int i16 = i15 & i10;
                if (i16 != i11) {
                    i13 = i16 == i10 ? 0 : unsafe.getInt(obj, i16);
                    i11 = i16;
                }
                i7 = i11;
                i8 = i13;
                i9 = 1 << (i15 >>> 20);
            } else {
                i7 = i11;
                i8 = i13;
                i9 = 0;
            }
            while (entry != null && ((zznb) entry.getKey()).zza <= i14) {
                zzolVar.zzn.zzb(zzpyVar, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j7 = iZzu & i10;
            switch (iZzt) {
                case 0:
                    if (zzolVar.zzO(obj, i12, i7, i8, i9)) {
                        zzpyVar.zzf(i14, zzps.zza(obj, j7));
                    }
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 1:
                    if (zzolVar.zzO(obj, i12, i7, i8, i9)) {
                        zzpyVar.zzo(i14, zzps.zzb(obj, j7));
                    }
                    zzolVar = this;
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 2:
                    if (zzolVar.zzO(obj, i12, i7, i8, i9)) {
                        zzpyVar.zzt(i14, unsafe.getLong(obj, j7));
                    }
                    zzolVar = this;
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 3:
                    if (zzolVar.zzO(obj, i12, i7, i8, i9)) {
                        zzpyVar.zzK(i14, unsafe.getLong(obj, j7));
                    }
                    zzolVar = this;
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 4:
                    if (zzolVar.zzO(obj, i12, i7, i8, i9)) {
                        zzpyVar.zzr(i14, unsafe.getInt(obj, j7));
                    }
                    zzolVar = this;
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 5:
                    if (zzolVar.zzO(obj, i12, i7, i8, i9)) {
                        zzpyVar.zzm(i14, unsafe.getLong(obj, j7));
                    }
                    zzolVar = this;
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 6:
                    if (zzolVar.zzO(obj, i12, i7, i8, i9)) {
                        zzpyVar.zzk(i14, unsafe.getInt(obj, j7));
                    }
                    zzolVar = this;
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 7:
                    if (zzolVar.zzO(obj, i12, i7, i8, i9)) {
                        zzpyVar.zzb(i14, zzps.zzw(obj, j7));
                    }
                    zzolVar = this;
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 8:
                    if (zzolVar.zzO(obj, i12, i7, i8, i9)) {
                        zzT(i14, unsafe.getObject(obj, j7), zzpyVar);
                    }
                    zzolVar = this;
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 9:
                    if (zzolVar.zzO(obj, i12, i7, i8, i9)) {
                        zzpyVar.zzv(i14, unsafe.getObject(obj, j7), zzolVar.zzx(i12));
                    }
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 10:
                    if (zzolVar.zzO(obj, i12, i7, i8, i9)) {
                        zzpyVar.zzd(i14, (zzle) unsafe.getObject(obj, j7));
                    }
                    zzolVar = this;
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 11:
                    if (zzolVar.zzO(obj, i12, i7, i8, i9)) {
                        zzpyVar.zzI(i14, unsafe.getInt(obj, j7));
                    }
                    zzolVar = this;
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 12:
                    if (zzolVar.zzO(obj, i12, i7, i8, i9)) {
                        zzpyVar.zzi(i14, unsafe.getInt(obj, j7));
                    }
                    zzolVar = this;
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 13:
                    if (zzolVar.zzO(obj, i12, i7, i8, i9)) {
                        zzpyVar.zzx(i14, unsafe.getInt(obj, j7));
                    }
                    zzolVar = this;
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 14:
                    if (zzolVar.zzO(obj, i12, i7, i8, i9)) {
                        zzpyVar.zzz(i14, unsafe.getLong(obj, j7));
                    }
                    zzolVar = this;
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 15:
                    if (zzolVar.zzO(obj, i12, i7, i8, i9)) {
                        zzpyVar.zzB(i14, unsafe.getInt(obj, j7));
                    }
                    zzolVar = this;
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 16:
                    if (zzolVar.zzO(obj, i12, i7, i8, i9)) {
                        zzpyVar.zzD(i14, unsafe.getLong(obj, j7));
                    }
                    zzolVar = this;
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 17:
                    if (zzolVar.zzO(obj, i12, i7, i8, i9)) {
                        zzpyVar.zzq(i14, unsafe.getObject(obj, j7), zzolVar.zzx(i12));
                    }
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 18:
                    zzoy.zzs(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, false);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 19:
                    zzoy.zzw(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, false);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 20:
                    zzoy.zzy(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, false);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case zzbbn.zzt.zzm /* 21 */:
                    zzoy.zzE(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, false);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 22:
                    zzoy.zzx(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, false);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 23:
                    zzoy.zzv(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, false);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 24:
                    zzoy.zzu(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, false);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 25:
                    zzoy.zzr(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, false);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 26:
                    int i17 = zzolVar.zzc[i12];
                    List list = (List) unsafe.getObject(obj, j7);
                    int i18 = zzoy.zza;
                    if (list != null && !list.isEmpty()) {
                        zzpyVar.zzH(i17, list);
                    }
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 27:
                    int i19 = zzolVar.zzc[i12];
                    List list2 = (List) unsafe.getObject(obj, j7);
                    zzow zzowVarZzx = zzolVar.zzx(i12);
                    int i20 = zzoy.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i21 = 0; i21 < list2.size(); i21++) {
                            ((zzlo) zzpyVar).zzv(i19, list2.get(i21), zzowVarZzx);
                        }
                    }
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 28:
                    int i22 = zzolVar.zzc[i12];
                    List list3 = (List) unsafe.getObject(obj, j7);
                    int i23 = zzoy.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzpyVar.zze(i22, list3);
                    }
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 29:
                    zzoy.zzD(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, false);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 30:
                    zzoy.zzt(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, false);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 31:
                    zzoy.zzz(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, false);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 32:
                    zzoy.zzA(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, false);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 33:
                    zzoy.zzB(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, false);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 34:
                    zzoy.zzC(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, false);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 35:
                    zzoy.zzs(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, true);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 36:
                    zzoy.zzw(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, true);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 37:
                    zzoy.zzy(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, true);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 38:
                    zzoy.zzE(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, true);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 39:
                    zzoy.zzx(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, true);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 40:
                    zzoy.zzv(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, true);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 41:
                    zzoy.zzu(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, true);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 42:
                    zzoy.zzr(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, true);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 43:
                    zzoy.zzD(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, true);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 44:
                    zzoy.zzt(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, true);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 45:
                    zzoy.zzz(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, true);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 46:
                    zzoy.zzA(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, true);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 47:
                    zzoy.zzB(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, true);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 48:
                    zzoy.zzC(zzolVar.zzc[i12], (List) unsafe.getObject(obj, j7), zzpyVar, true);
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 49:
                    int i24 = zzolVar.zzc[i12];
                    List list4 = (List) unsafe.getObject(obj, j7);
                    zzow zzowVarZzx2 = zzolVar.zzx(i12);
                    int i25 = zzoy.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i26 = 0; i26 < list4.size(); i26++) {
                            ((zzlo) zzpyVar).zzq(i24, list4.get(i26), zzowVarZzx2);
                        }
                    }
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j7) != null) {
                        throw null;
                    }
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 51:
                    if (zzolVar.zzR(obj, i14, i12)) {
                        zzpyVar.zzf(i14, zzn(obj, j7));
                    }
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 52:
                    if (zzolVar.zzR(obj, i14, i12)) {
                        zzpyVar.zzo(i14, zzo(obj, j7));
                    }
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 53:
                    if (zzolVar.zzR(obj, i14, i12)) {
                        zzpyVar.zzt(i14, zzv(obj, j7));
                    }
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 54:
                    if (zzolVar.zzR(obj, i14, i12)) {
                        zzpyVar.zzK(i14, zzv(obj, j7));
                    }
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 55:
                    if (zzolVar.zzR(obj, i14, i12)) {
                        zzpyVar.zzr(i14, zzp(obj, j7));
                    }
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 56:
                    if (zzolVar.zzR(obj, i14, i12)) {
                        zzpyVar.zzm(i14, zzv(obj, j7));
                    }
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 57:
                    if (zzolVar.zzR(obj, i14, i12)) {
                        zzpyVar.zzk(i14, zzp(obj, j7));
                    }
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 58:
                    if (zzolVar.zzR(obj, i14, i12)) {
                        zzpyVar.zzb(i14, zzS(obj, j7));
                    }
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 59:
                    if (zzolVar.zzR(obj, i14, i12)) {
                        zzT(i14, unsafe.getObject(obj, j7), zzpyVar);
                    }
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 60:
                    if (zzolVar.zzR(obj, i14, i12)) {
                        zzpyVar.zzv(i14, unsafe.getObject(obj, j7), zzolVar.zzx(i12));
                    }
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 61:
                    if (zzolVar.zzR(obj, i14, i12)) {
                        zzpyVar.zzd(i14, (zzle) unsafe.getObject(obj, j7));
                    }
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 62:
                    if (zzolVar.zzR(obj, i14, i12)) {
                        zzpyVar.zzI(i14, zzp(obj, j7));
                    }
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 63:
                    if (zzolVar.zzR(obj, i14, i12)) {
                        zzpyVar.zzi(i14, zzp(obj, j7));
                    }
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 64:
                    if (zzolVar.zzR(obj, i14, i12)) {
                        zzpyVar.zzx(i14, zzp(obj, j7));
                    }
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 65:
                    if (zzolVar.zzR(obj, i14, i12)) {
                        zzpyVar.zzz(i14, zzv(obj, j7));
                    }
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 66:
                    if (zzolVar.zzR(obj, i14, i12)) {
                        zzpyVar.zzB(i14, zzp(obj, j7));
                    }
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 67:
                    if (zzolVar.zzR(obj, i14, i12)) {
                        zzpyVar.zzD(i14, zzv(obj, j7));
                    }
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                case 68:
                    if (zzolVar.zzR(obj, i14, i12)) {
                        zzpyVar.zzq(i14, unsafe.getObject(obj, j7), zzolVar.zzx(i12));
                    }
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
                default:
                    i12 += 3;
                    i13 = i8;
                    i10 = 1048575;
                    i11 = i7;
                    entry = entry;
                    break;
            }
        }
        while (entry != null) {
            zzolVar.zzn.zzb(zzpyVar, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        ((zznd) obj).zzc.zzl(zzpyVar);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzF;
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int iZzu = zzu(i7);
            long j7 = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i7) || Double.doubleToLongBits(zzps.zza(obj, j7)) != Double.doubleToLongBits(zzps.zza(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i7) || Float.floatToIntBits(zzps.zzb(obj, j7)) != Float.floatToIntBits(zzps.zzb(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i7) || zzps.zzd(obj, j7) != zzps.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i7) || zzps.zzd(obj, j7) != zzps.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i7) || zzps.zzc(obj, j7) != zzps.zzc(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i7) || zzps.zzd(obj, j7) != zzps.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i7) || zzps.zzc(obj, j7) != zzps.zzc(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i7) || zzps.zzw(obj, j7) != zzps.zzw(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i7) || !zzoy.zzF(zzps.zzf(obj, j7), zzps.zzf(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i7) || !zzoy.zzF(zzps.zzf(obj, j7), zzps.zzf(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i7) || !zzoy.zzF(zzps.zzf(obj, j7), zzps.zzf(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i7) || zzps.zzc(obj, j7) != zzps.zzc(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i7) || zzps.zzc(obj, j7) != zzps.zzc(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i7) || zzps.zzc(obj, j7) != zzps.zzc(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i7) || zzps.zzd(obj, j7) != zzps.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i7) || zzps.zzc(obj, j7) != zzps.zzc(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i7) || zzps.zzd(obj, j7) != zzps.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i7) || !zzoy.zzF(zzps.zzf(obj, j7), zzps.zzf(obj2, j7))) {
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
                    zZzF = zzoy.zzF(zzps.zzf(obj, j7), zzps.zzf(obj2, j7));
                    break;
                case 50:
                    zZzF = zzoy.zzF(zzps.zzf(obj, j7), zzps.zzf(obj2, j7));
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
                    long jZzr = zzr(i7) & 1048575;
                    if (zzps.zzc(obj, jZzr) != zzps.zzc(obj2, jZzr) || !zzoy.zzF(zzps.zzf(obj, j7), zzps.zzf(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzF) {
                return false;
            }
        }
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6 A[SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzl(Object obj) {
        int i7;
        int i8;
        List list;
        zzow zzowVarZzx;
        int i9;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        while (i10 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i13 = iArr[i10];
            int i14 = iArr2[i13];
            int iZzu = zzu(i13);
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
            if ((268435456 & iZzu) != 0 && !zzO(obj2, i13, i7, i8, i17)) {
                return false;
            }
            int iZzt = zzt(iZzu);
            if (iZzt == 9 || iZzt == 17) {
                if (zzO(obj2, i13, i7, i8, i17) && !zzP(obj2, iZzu, zzx(i13))) {
                    return false;
                }
            } else if (iZzt == 27) {
                list = (List) zzps.zzf(obj2, iZzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzowVarZzx = zzx(i13);
                    for (i9 = 0; i9 < list.size(); i9++) {
                        if (!zzowVarZzx.zzl(list.get(i9))) {
                            return false;
                        }
                    }
                }
            } else if (iZzt == 60 || iZzt == 68) {
                if (zzR(obj2, i14, i13) && !zzP(obj2, iZzu, zzx(i13))) {
                    return false;
                }
            } else if (iZzt == 49) {
                list = (List) zzps.zzf(obj2, iZzu & 1048575);
                if (list.isEmpty()) {
                    zzowVarZzx = zzx(i13);
                    while (i9 < list.size()) {
                        if (!zzowVarZzx.zzl(list.get(i9))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzt == 50 && !((zzoc) zzps.zzf(obj2, iZzu & 1048575)).isEmpty()) {
                throw null;
            }
            i10++;
            obj = obj2;
            i12 = i7;
            i11 = i8;
        }
        return !this.zzh || ((zzna) obj).zzb.zzk();
    }
}
