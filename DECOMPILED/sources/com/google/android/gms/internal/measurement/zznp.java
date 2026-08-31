package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.internal.ads.zzbbn;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zznp<T> implements zznx<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzop.zzq();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zznm zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzoi zzl;
    private final zzls zzm;

    private zznp(int[] iArr, Object[] objArr, int i7, int i8, zznm zznmVar, boolean z7, int[] iArr2, int i9, int i10, zznr zznrVar, zzmy zzmyVar, zzoi zzoiVar, zzls zzlsVar, zznh zznhVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i7;
        this.zzf = i8;
        boolean z8 = false;
        if (zzlsVar != null && (zznmVar instanceof zzmc)) {
            z8 = true;
        }
        this.zzh = z8;
        this.zzi = iArr2;
        this.zzj = i9;
        this.zzk = i10;
        this.zzl = zzoiVar;
        this.zzm = zzlsVar;
        this.zzg = zznmVar;
    }

    private static boolean zzA(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzmf) {
            return ((zzmf) obj).zzcf();
        }
        return true;
    }

    private static void zzB(Object obj) {
        if (!zzA(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static double zzC(Object obj, long j7) {
        return ((Double) zzop.zzn(obj, j7)).doubleValue();
    }

    private static float zzD(Object obj, long j7) {
        return ((Float) zzop.zzn(obj, j7)).floatValue();
    }

    private static int zzE(Object obj, long j7) {
        return ((Integer) zzop.zzn(obj, j7)).intValue();
    }

    private static long zzF(Object obj, long j7) {
        return ((Long) zzop.zzn(obj, j7)).longValue();
    }

    private static boolean zzG(Object obj, long j7) {
        return ((Boolean) zzop.zzn(obj, j7)).booleanValue();
    }

    private final boolean zzH(Object obj, Object obj2, int i7) {
        return zzJ(obj, i7) == zzJ(obj2, i7);
    }

    private final boolean zzI(Object obj, int i7, int i8, int i9, int i10) {
        if (i8 == 1048575) {
            return zzJ(obj, i7);
        }
        return (i9 & i10) != 0;
    }

    private final boolean zzJ(Object obj, int i7) {
        int iZzy = zzy(i7);
        long j7 = iZzy & 1048575;
        if (j7 != 1048575) {
            return (zzop.zzd(obj, j7) & (1 << (iZzy >>> 20))) != 0;
        }
        int iZzx = zzx(i7);
        long j8 = iZzx & 1048575;
        switch (zzz(iZzx)) {
            case 0:
                return Double.doubleToRawLongBits(zzop.zzl(obj, j8)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzop.zzj(obj, j8)) != 0;
            case 2:
                return zzop.zzf(obj, j8) != 0;
            case 3:
                return zzop.zzf(obj, j8) != 0;
            case 4:
                return zzop.zzd(obj, j8) != 0;
            case 5:
                return zzop.zzf(obj, j8) != 0;
            case 6:
                return zzop.zzd(obj, j8) != 0;
            case 7:
                return zzop.zzh(obj, j8);
            case 8:
                Object objZzn = zzop.zzn(obj, j8);
                if (objZzn instanceof String) {
                    return !((String) objZzn).isEmpty();
                }
                if (objZzn instanceof zzlh) {
                    return !zzlh.zzb.equals(objZzn);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzop.zzn(obj, j8) != null;
            case 10:
                return !zzlh.zzb.equals(zzop.zzn(obj, j8));
            case 11:
                return zzop.zzd(obj, j8) != 0;
            case 12:
                return zzop.zzd(obj, j8) != 0;
            case 13:
                return zzop.zzd(obj, j8) != 0;
            case 14:
                return zzop.zzf(obj, j8) != 0;
            case 15:
                return zzop.zzd(obj, j8) != 0;
            case 16:
                return zzop.zzf(obj, j8) != 0;
            case 17:
                return zzop.zzn(obj, j8) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzK(Object obj, int i7) {
        int iZzy = zzy(i7);
        long j7 = 1048575 & iZzy;
        if (j7 == 1048575) {
            return;
        }
        zzop.zze(obj, j7, (1 << (iZzy >>> 20)) | zzop.zzd(obj, j7));
    }

    private final boolean zzL(Object obj, int i7, int i8) {
        return zzop.zzd(obj, (long) (zzy(i8) & 1048575)) == i7;
    }

    private final void zzM(Object obj, int i7, int i8) {
        zzop.zze(obj, zzy(i8) & 1048575, i7);
    }

    private final int zzN(int i7, int i8) {
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

    private static final int zzO(byte[] bArr, int i7, int i8, zzot zzotVar, Class cls, zzkw zzkwVar) {
        zzot zzotVar2 = zzot.zza;
        switch (zzotVar.ordinal()) {
            case 0:
                int i9 = i7 + 8;
                zzkwVar.zzc = Double.valueOf(Double.longBitsToDouble(zzkx.zze(bArr, i7)));
                return i9;
            case 1:
                int i10 = i7 + 4;
                zzkwVar.zzc = Float.valueOf(Float.intBitsToFloat(zzkx.zzd(bArr, i7)));
                return i10;
            case 2:
            case 3:
                int iZzc = zzkx.zzc(bArr, i7, zzkwVar);
                zzkwVar.zzc = Long.valueOf(zzkwVar.zzb);
                return iZzc;
            case 4:
            case 12:
            case 13:
                int iZza = zzkx.zza(bArr, i7, zzkwVar);
                zzkwVar.zzc = Integer.valueOf(zzkwVar.zza);
                return iZza;
            case 5:
            case 15:
                int i11 = i7 + 8;
                zzkwVar.zzc = Long.valueOf(zzkx.zze(bArr, i7));
                return i11;
            case 6:
            case 14:
                int i12 = i7 + 4;
                zzkwVar.zzc = Integer.valueOf(zzkx.zzd(bArr, i7));
                return i12;
            case 7:
                int iZzc2 = zzkx.zzc(bArr, i7, zzkwVar);
                zzkwVar.zzc = Boolean.valueOf(zzkwVar.zzb != 0);
                return iZzc2;
            case 8:
                return zzkx.zzf(bArr, i7, zzkwVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zzkx.zzh(zznu.zza().zzb(cls), bArr, i7, i8, zzkwVar);
            case 11:
                return zzkx.zzg(bArr, i7, zzkwVar);
            case 16:
                int iZza2 = zzkx.zza(bArr, i7, zzkwVar);
                zzkwVar.zzc = Integer.valueOf(zzlj.zzb(zzkwVar.zza));
                return iZza2;
            case 17:
                int iZzc3 = zzkx.zzc(bArr, i7, zzkwVar);
                zzkwVar.zzc = Long.valueOf(zzlj.zzc(zzkwVar.zzb));
                return iZzc3;
        }
    }

    private static final void zzP(int i7, Object obj, zzov zzovVar) {
        if (obj instanceof String) {
            zzovVar.zzm(i7, (String) obj);
        } else {
            zzovVar.zzn(i7, (zzlh) obj);
        }
    }

    static zzoj zzg(Object obj) {
        zzmf zzmfVar = (zzmf) obj;
        zzoj zzojVar = zzmfVar.zzc;
        if (zzojVar != zzoj.zza()) {
            return zzojVar;
        }
        zzoj zzojVarZzb = zzoj.zzb();
        zzmfVar.zzc = zzojVarZzb;
        return zzojVarZzb;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0274  */
    /* JADX WARN: Code duplicated, block: B:131:0x028c  */
    /* JADX WARN: Code duplicated, block: B:132:0x028f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0350  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:190:0x03b0  */
    static zznp zzl(Class cls, zznj zznjVar, zznr zznrVar, zzmy zzmyVar, zzoi zzoiVar, zzls zzlsVar, zznh zznhVar) {
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
        Field fieldZzm;
        char cCharAt9;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        Object obj;
        Field fieldZzm2;
        int i33;
        Object obj2;
        Field fieldZzm3;
        int i34;
        char cCharAt10;
        int i35;
        char cCharAt11;
        int i36;
        char cCharAt12;
        int i37;
        char cCharAt13;
        if (!(zznjVar instanceof zznw)) {
            throw null;
        }
        zznw zznwVar = (zznw) zznjVar;
        String strZzd = zznwVar.zzd();
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
        Object[] objArrZze = zznwVar.zze();
        Class<?> cls2 = zznwVar.zzb().getClass();
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
            zznw zznwVar2 = zznwVar;
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
                    } else if (zznwVar2.zzc() == 1 || i83 != 0) {
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
                        fieldZzm2 = (Field) obj;
                    } else {
                        fieldZzm2 = zzm(cls2, (String) obj);
                        objArrZze[i32] = fieldZzm2;
                    }
                    int i93 = i13;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzm2);
                    i33 = i32 + 1;
                    obj2 = objArrZze[i33];
                    i24 = i93;
                    if (obj2 instanceof Field) {
                        fieldZzm3 = (Field) obj2;
                    } else {
                        fieldZzm3 = zzm(cls2, (String) obj2);
                        objArrZze[i33] = fieldZzm3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzm3);
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
                    fieldZzm2 = (Field) obj;
                } else {
                    fieldZzm2 = zzm(cls2, (String) obj);
                    objArrZze[i32] = fieldZzm2;
                }
                int i95 = i13;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzm2);
                i33 = i32 + 1;
                obj2 = objArrZze[i33];
                i24 = i95;
                if (obj2 instanceof Field) {
                    fieldZzm3 = (Field) obj2;
                } else {
                    fieldZzm3 = zzm(cls2, (String) obj2);
                    objArrZze[i33] = fieldZzm3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzm3);
                strZzd = strZzd;
                i26 = i94;
                i23 = i88;
                i25 = 0;
                c7 = 55296;
            } else {
                i24 = i13;
                int i96 = i12 + 1;
                Field fieldZzm4 = zzm(cls2, (String) objArrZze[i12]);
                if (i82 == 9 || i82 == 17) {
                    int i97 = i73 / 3;
                    objArr[i97 + i97 + 1] = fieldZzm4.getType();
                } else {
                    if (i82 != 27) {
                        if (i82 == 49) {
                            i12 += 2;
                            i28 = 1;
                        } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                            if (zznwVar2.zzc() == 1 || i83 != 0) {
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzm4);
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
                                fieldZzm = (Field) obj3;
                            } else {
                                fieldZzm = zzm(cls2, (String) obj3);
                                objArrZze[i106] = fieldZzm;
                            }
                            int i107 = iCharAt13;
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzm);
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzm4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzm4);
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
            zznwVar = zznwVar2;
            length = length;
            i13 = i24;
        }
        return new zznp(iArr3, objArr, i8, i10, zznwVar.zzb(), false, iArr, i11, i68, zznrVar, zzmyVar, zzoiVar, zzlsVar, zznhVar);
    }

    private static Field zzm(Class cls, String str) {
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

    private final void zzn(Object obj, Object obj2, int i7) {
        if (zzJ(obj2, i7)) {
            int iZzx = zzx(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j7 = iZzx;
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
            zznx zznxVarZzp = zzp(i7);
            if (!zzJ(obj, i7)) {
                if (zzA(object)) {
                    Object objZza = zznxVarZzp.zza();
                    zznxVarZzp.zzd(objZza, object);
                    unsafe.putObject(obj, j7, objZza);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                zzK(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!zzA(object2)) {
                Object objZza2 = zznxVarZzp.zza();
                zznxVarZzp.zzd(objZza2, object2);
                unsafe.putObject(obj, j7, objZza2);
                object2 = objZza2;
            }
            zznxVarZzp.zzd(object2, object);
        }
    }

    private final void zzo(Object obj, Object obj2, int i7) {
        int[] iArr = this.zzc;
        int i8 = iArr[i7];
        if (zzL(obj2, i8, i7)) {
            int iZzx = zzx(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j7 = iZzx;
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
            zznx zznxVarZzp = zzp(i7);
            if (!zzL(obj, i8, i7)) {
                if (zzA(object)) {
                    Object objZza = zznxVarZzp.zza();
                    zznxVarZzp.zzd(objZza, object);
                    unsafe.putObject(obj, j7, objZza);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                zzM(obj, i8, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!zzA(object2)) {
                Object objZza2 = zznxVarZzp.zza();
                zznxVarZzp.zzd(objZza2, object2);
                unsafe.putObject(obj, j7, objZza2);
                object2 = objZza2;
            }
            zznxVarZzp.zzd(object2, object);
        }
    }

    private final zznx zzp(int i7) {
        Object[] objArr = this.zzd;
        int i8 = i7 / 3;
        int i9 = i8 + i8;
        zznx zznxVar = (zznx) objArr[i9];
        if (zznxVar != null) {
            return zznxVar;
        }
        zznx zznxVarZzb = zznu.zza().zzb((Class) objArr[i9 + 1]);
        objArr[i9] = zznxVarZzb;
        return zznxVarZzb;
    }

    private final Object zzq(int i7) {
        int i8 = i7 / 3;
        return this.zzd[i8 + i8];
    }

    private final zzmk zzr(int i7) {
        int i8 = i7 / 3;
        return (zzmk) this.zzd[i8 + i8 + 1];
    }

    private final Object zzs(Object obj, int i7) {
        zznx zznxVarZzp = zzp(i7);
        int iZzx = zzx(i7) & 1048575;
        if (!zzJ(obj, i7)) {
            return zznxVarZzp.zza();
        }
        Object object = zzb.getObject(obj, iZzx);
        if (zzA(object)) {
            return object;
        }
        Object objZza = zznxVarZzp.zza();
        if (object != null) {
            zznxVarZzp.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzt(Object obj, int i7, Object obj2) {
        zzb.putObject(obj, zzx(i7) & 1048575, obj2);
        zzK(obj, i7);
    }

    private final Object zzu(Object obj, int i7, int i8) {
        zznx zznxVarZzp = zzp(i8);
        if (!zzL(obj, i7, i8)) {
            return zznxVarZzp.zza();
        }
        Object object = zzb.getObject(obj, zzx(i8) & 1048575);
        if (zzA(object)) {
            return object;
        }
        Object objZza = zznxVarZzp.zza();
        if (object != null) {
            zznxVarZzp.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzv(Object obj, int i7, int i8, Object obj2) {
        zzb.putObject(obj, zzx(i8) & 1048575, obj2);
        zzM(obj, i7, i8);
    }

    private static boolean zzw(Object obj, int i7, zznx zznxVar) {
        return zznxVar.zzk(zzop.zzn(obj, i7 & 1048575));
    }

    private final int zzx(int i7) {
        return this.zzc[i7 + 1];
    }

    private final int zzy(int i7) {
        return this.zzc[i7 + 2];
    }

    private static int zzz(int i7) {
        return (i7 >>> 20) & 255;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final Object zza() {
        return ((zzmf) this.zzg).zzch();
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final boolean zzb(Object obj, Object obj2) {
        boolean zZzB;
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int iZzx = zzx(i7);
            long j7 = iZzx & 1048575;
            switch (zzz(iZzx)) {
                case 0:
                    if (!zzH(obj, obj2, i7) || Double.doubleToLongBits(zzop.zzl(obj, j7)) != Double.doubleToLongBits(zzop.zzl(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i7) || Float.floatToIntBits(zzop.zzj(obj, j7)) != Float.floatToIntBits(zzop.zzj(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i7) || zzop.zzf(obj, j7) != zzop.zzf(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i7) || zzop.zzf(obj, j7) != zzop.zzf(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i7) || zzop.zzd(obj, j7) != zzop.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i7) || zzop.zzf(obj, j7) != zzop.zzf(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i7) || zzop.zzd(obj, j7) != zzop.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i7) || zzop.zzh(obj, j7) != zzop.zzh(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i7) || !zznz.zzB(zzop.zzn(obj, j7), zzop.zzn(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i7) || !zznz.zzB(zzop.zzn(obj, j7), zzop.zzn(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i7) || !zznz.zzB(zzop.zzn(obj, j7), zzop.zzn(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i7) || zzop.zzd(obj, j7) != zzop.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i7) || zzop.zzd(obj, j7) != zzop.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i7) || zzop.zzd(obj, j7) != zzop.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i7) || zzop.zzf(obj, j7) != zzop.zzf(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i7) || zzop.zzd(obj, j7) != zzop.zzd(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i7) || zzop.zzf(obj, j7) != zzop.zzf(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i7) || !zznz.zzB(zzop.zzn(obj, j7), zzop.zzn(obj2, j7))) {
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
                    zZzB = zznz.zzB(zzop.zzn(obj, j7), zzop.zzn(obj2, j7));
                    break;
                case 50:
                    zZzB = zznz.zzB(zzop.zzn(obj, j7), zzop.zzn(obj2, j7));
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
                    long jZzy = zzy(i7) & 1048575;
                    if (zzop.zzd(obj, jZzy) != zzop.zzd(obj2, jZzy) || !zznz.zzB(zzop.zzn(obj, j7), zzop.zzn(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzB) {
                return false;
            }
        }
        if (!((zzmf) obj).zzc.equals(((zzmf) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzmc) obj).zzb.equals(((zzmc) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
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
                int iHashCode = (i10 * 53) + ((zzmf) obj).zzc.hashCode();
                return this.zzh ? (iHashCode * 53) + ((zzmc) obj).zzb.zza.hashCode() : iHashCode;
            }
            int iZzx = zzx(i9);
            int i11 = 1048575 & iZzx;
            int iZzz = zzz(iZzx);
            int i12 = iArr[i9];
            long j7 = i11;
            int iHashCode2 = 37;
            switch (iZzz) {
                case 0:
                    i7 = i10 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzop.zzl(obj, j7));
                    byte[] bArr = zzmp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 1:
                    i7 = i10 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzop.zzj(obj, j7));
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 2:
                    i7 = i10 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j7);
                    byte[] bArr2 = zzmp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 3:
                    i7 = i10 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j7);
                    byte[] bArr3 = zzmp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 4:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzop.zzd(obj, j7);
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 5:
                    i7 = i10 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j7);
                    byte[] bArr4 = zzmp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 6:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzop.zzd(obj, j7);
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 7:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzmp.zzb(zzop.zzh(obj, j7));
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 8:
                    i7 = i10 * 53;
                    iFloatToIntBits = ((String) zzop.zzn(obj, j7)).hashCode();
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 9:
                    i8 = i10 * 53;
                    Object objZzn = zzop.zzn(obj, j7);
                    if (objZzn != null) {
                        iHashCode2 = objZzn.hashCode();
                    }
                    i10 = i8 + iHashCode2;
                    break;
                case 10:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzop.zzn(obj, j7).hashCode();
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 11:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzop.zzd(obj, j7);
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 12:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzop.zzd(obj, j7);
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 13:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzop.zzd(obj, j7);
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 14:
                    i7 = i10 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j7);
                    byte[] bArr5 = zzmp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 15:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzop.zzd(obj, j7);
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 16:
                    i7 = i10 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j7);
                    byte[] bArr6 = zzmp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 17:
                    i8 = i10 * 53;
                    Object objZzn2 = zzop.zzn(obj, j7);
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
                    iFloatToIntBits = zzop.zzn(obj, j7).hashCode();
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 50:
                    i7 = i10 * 53;
                    iFloatToIntBits = zzop.zzn(obj, j7).hashCode();
                    i10 = i7 + iFloatToIntBits;
                    break;
                case 51:
                    if (zzL(obj, i12, i9)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzC(obj, j7));
                        byte[] bArr7 = zzmp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzL(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzD(obj, j7));
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzL(obj, i12, i9)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = zzF(obj, j7);
                        byte[] bArr8 = zzmp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzL(obj, i12, i9)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = zzF(obj, j7);
                        byte[] bArr9 = zzmp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzL(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzE(obj, j7);
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzL(obj, i12, i9)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = zzF(obj, j7);
                        byte[] bArr10 = zzmp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (zzL(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzE(obj, j7);
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzL(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzmp.zzb(zzG(obj, j7));
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzL(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = ((String) zzop.zzn(obj, j7)).hashCode();
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzL(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzop.zzn(obj, j7).hashCode();
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzL(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzop.zzn(obj, j7).hashCode();
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzL(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzE(obj, j7);
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzL(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzE(obj, j7);
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzL(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzE(obj, j7);
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzL(obj, i12, i9)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = zzF(obj, j7);
                        byte[] bArr11 = zzmp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (zzL(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzE(obj, j7);
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzL(obj, i12, i9)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = zzF(obj, j7);
                        byte[] bArr12 = zzmp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (zzL(obj, i12, i9)) {
                        i7 = i10 * 53;
                        iFloatToIntBits = zzop.zzn(obj, j7).hashCode();
                        i10 = i7 + iFloatToIntBits;
                    }
                    break;
            }
            i9 += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzd(Object obj, Object obj2) {
        zzB(obj);
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i7 >= iArr.length) {
                zznz.zzD(this.zzl, obj, obj2);
                if (this.zzh) {
                    zznz.zzC(this.zzm, obj, obj2);
                    return;
                }
                return;
            }
            int iZzx = zzx(i7);
            int i8 = 1048575 & iZzx;
            int iZzz = zzz(iZzx);
            int i9 = iArr[i7];
            long j7 = i8;
            switch (iZzz) {
                case 0:
                    if (zzJ(obj2, i7)) {
                        zzop.zzm(obj, j7, zzop.zzl(obj2, j7));
                        zzK(obj, i7);
                    }
                    break;
                case 1:
                    if (zzJ(obj2, i7)) {
                        zzop.zzk(obj, j7, zzop.zzj(obj2, j7));
                        zzK(obj, i7);
                    }
                    break;
                case 2:
                    if (zzJ(obj2, i7)) {
                        zzop.zzg(obj, j7, zzop.zzf(obj2, j7));
                        zzK(obj, i7);
                    }
                    break;
                case 3:
                    if (zzJ(obj2, i7)) {
                        zzop.zzg(obj, j7, zzop.zzf(obj2, j7));
                        zzK(obj, i7);
                    }
                    break;
                case 4:
                    if (zzJ(obj2, i7)) {
                        zzop.zze(obj, j7, zzop.zzd(obj2, j7));
                        zzK(obj, i7);
                    }
                    break;
                case 5:
                    if (zzJ(obj2, i7)) {
                        zzop.zzg(obj, j7, zzop.zzf(obj2, j7));
                        zzK(obj, i7);
                    }
                    break;
                case 6:
                    if (zzJ(obj2, i7)) {
                        zzop.zze(obj, j7, zzop.zzd(obj2, j7));
                        zzK(obj, i7);
                    }
                    break;
                case 7:
                    if (zzJ(obj2, i7)) {
                        zzop.zzi(obj, j7, zzop.zzh(obj2, j7));
                        zzK(obj, i7);
                    }
                    break;
                case 8:
                    if (zzJ(obj2, i7)) {
                        zzop.zzo(obj, j7, zzop.zzn(obj2, j7));
                        zzK(obj, i7);
                    }
                    break;
                case 9:
                    zzn(obj, obj2, i7);
                    break;
                case 10:
                    if (zzJ(obj2, i7)) {
                        zzop.zzo(obj, j7, zzop.zzn(obj2, j7));
                        zzK(obj, i7);
                    }
                    break;
                case 11:
                    if (zzJ(obj2, i7)) {
                        zzop.zze(obj, j7, zzop.zzd(obj2, j7));
                        zzK(obj, i7);
                    }
                    break;
                case 12:
                    if (zzJ(obj2, i7)) {
                        zzop.zze(obj, j7, zzop.zzd(obj2, j7));
                        zzK(obj, i7);
                    }
                    break;
                case 13:
                    if (zzJ(obj2, i7)) {
                        zzop.zze(obj, j7, zzop.zzd(obj2, j7));
                        zzK(obj, i7);
                    }
                    break;
                case 14:
                    if (zzJ(obj2, i7)) {
                        zzop.zzg(obj, j7, zzop.zzf(obj2, j7));
                        zzK(obj, i7);
                    }
                    break;
                case 15:
                    if (zzJ(obj2, i7)) {
                        zzop.zze(obj, j7, zzop.zzd(obj2, j7));
                        zzK(obj, i7);
                    }
                    break;
                case 16:
                    if (zzJ(obj2, i7)) {
                        zzop.zzg(obj, j7, zzop.zzf(obj2, j7));
                        zzK(obj, i7);
                    }
                    break;
                case 17:
                    zzn(obj, obj2, i7);
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
                    zzmo zzmoVarZzg = (zzmo) zzop.zzn(obj, j7);
                    zzmo zzmoVar = (zzmo) zzop.zzn(obj2, j7);
                    int size = zzmoVarZzg.size();
                    int size2 = zzmoVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzmoVarZzg.zza()) {
                            zzmoVarZzg = zzmoVarZzg.zzg(size2 + size);
                        }
                        zzmoVarZzg.addAll(zzmoVar);
                    }
                    if (size > 0) {
                        zzmoVar = zzmoVarZzg;
                    }
                    zzop.zzo(obj, j7, zzmoVar);
                    break;
                case 50:
                    int i10 = zznz.zza;
                    zzop.zzo(obj, j7, zznh.zza(zzop.zzn(obj, j7), zzop.zzn(obj2, j7)));
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
                    if (zzL(obj2, i9, i7)) {
                        zzop.zzo(obj, j7, zzop.zzn(obj2, j7));
                        zzM(obj, i9, i7);
                    }
                    break;
                case 60:
                    zzo(obj, obj2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzL(obj2, i9, i7)) {
                        zzop.zzo(obj, j7, zzop.zzn(obj2, j7));
                        zzM(obj, i9, i7);
                    }
                    break;
                case 68:
                    zzo(obj, obj2, i7);
                    break;
            }
            i7 += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:145:0x03b6 A[PHI: r17
      0x03b6: PHI (r17v46 int) = (r17v29 int), (r17v30 int), (r17v33 int), (r17v39 int), (r17v40 int), (r17v43 int), (r17v47 int) binds: [B:212:0x0576, B:208:0x0558, B:202:0x051f, B:160:0x0427, B:156:0x040b, B:150:0x03d5, B:144:0x03b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:183:0x04bb A[PHI: r17
      0x04bb: PHI (r17v35 int) = (r17v28 int), (r17v36 int) binds: [B:216:0x0594, B:182:0x04b9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.zznx
    public final int zze(Object obj) {
        int i7;
        int i8;
        int iZzz;
        int iZzz2;
        int iZzA;
        int iZzz3;
        int iZzz4;
        int iZzz5;
        int iZzc;
        int iZzz6;
        int iZzz7;
        int iZzo;
        int size;
        int iZzp;
        int iZzz8;
        int iZzz9;
        int iZzz10;
        int iZzx;
        int iZzz11;
        int iZzz12;
        int iZzG;
        int iZzd;
        int iZzz13;
        int iZzz14;
        int iZzz15;
        int iZzA2;
        int iZzz16;
        int iZzz17;
        int iZzc2;
        int iZzz18;
        zznp<T> zznpVar = this;
        int i9 = 1;
        Unsafe unsafe = zzb;
        int i10 = 0;
        int i11 = 0;
        int iZzz19 = 0;
        int i12 = 1048575;
        while (true) {
            int[] iArr = zznpVar.zzc;
            if (i10 >= iArr.length) {
                int iZzi = iZzz19 + ((zzmf) obj).zzc.zzi();
                if (!zznpVar.zzh) {
                    return iZzi;
                }
                zzoe zzoeVar = ((zzmc) obj).zzb.zza;
                int iZzc3 = zzoeVar.zzc();
                int iZzj = 0;
                for (int i13 = 0; i13 < iZzc3; i13++) {
                    Map.Entry entryZzd = zzoeVar.zzd(i13);
                    iZzj += zzlw.zzj((zzlv) ((zzob) entryZzd).zza(), entryZzd.getValue());
                }
                for (Map.Entry entry : zzoeVar.zze()) {
                    iZzj += zzlw.zzj((zzlv) entry.getKey(), entry.getValue());
                }
                return iZzi + iZzj;
            }
            int iZzx2 = zznpVar.zzx(i10);
            int iZzz20 = zzz(iZzx2);
            int i14 = iArr[i10];
            int i15 = iArr[i10 + 2];
            int i16 = i15 & 1048575;
            if (iZzz20 <= 17) {
                if (i16 != i12) {
                    i11 = i16 == 1048575 ? 0 : unsafe.getInt(obj, i16);
                    i12 = i16;
                }
                i7 = i9 << (i15 >>> 20);
            } else {
                i7 = 0;
            }
            int i17 = iZzx2 & 1048575;
            if (iZzz20 >= zzlx.zzJ.zza()) {
                zzlx.zzW.zza();
            }
            long j7 = i17;
            switch (iZzz20) {
                case 0:
                    i8 = i9;
                    if (zznpVar.zzI(obj, i10, i12, i11, i7)) {
                        iZzz19 += zzlm.zzz(i14 << 3) + 8;
                    }
                    break;
                case 1:
                    i8 = i9;
                    if (zznpVar.zzI(obj, i10, i12, i11, i7)) {
                        iZzz = zzlm.zzz(i14 << 3);
                        iZzz4 = iZzz + 4;
                        iZzz19 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 2:
                    i8 = i9;
                    if (zznpVar.zzI(obj, i10, i12, i11, i7)) {
                        long j8 = unsafe.getLong(obj, j7);
                        iZzz2 = zzlm.zzz(i14 << 3);
                        iZzA = zzlm.zzA(j8);
                        iZzz4 = iZzz2 + iZzA;
                        iZzz19 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 3:
                    i8 = i9;
                    if (zznpVar.zzI(obj, i10, i12, i11, i7)) {
                        long j9 = unsafe.getLong(obj, j7);
                        iZzz2 = zzlm.zzz(i14 << 3);
                        iZzA = zzlm.zzA(j9);
                        iZzz4 = iZzz2 + iZzA;
                        iZzz19 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 4:
                    i8 = i9;
                    if (zznpVar.zzI(obj, i10, i12, i11, i7)) {
                        long j10 = unsafe.getInt(obj, j7);
                        iZzz2 = zzlm.zzz(i14 << 3);
                        iZzA = zzlm.zzA(j10);
                        iZzz4 = iZzz2 + iZzA;
                        iZzz19 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 5:
                    i8 = i9;
                    if (zznpVar.zzI(obj, i10, i12, i11, i7)) {
                        iZzz3 = zzlm.zzz(i14 << 3);
                        iZzz4 = iZzz3 + 8;
                        iZzz19 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 6:
                    i8 = i9;
                    if (zznpVar.zzI(obj, i10, i12, i11, i7)) {
                        iZzz = zzlm.zzz(i14 << 3);
                        iZzz4 = iZzz + 4;
                        iZzz19 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 7:
                    i8 = i9;
                    if (zznpVar.zzI(obj, i10, i12, i11, i7)) {
                        iZzz4 = zzlm.zzz(i14 << 3) + 1;
                        iZzz19 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 8:
                    i8 = i9;
                    if (zznpVar.zzI(obj, i10, i12, i11, i7)) {
                        int i18 = i14 << 3;
                        Object object = unsafe.getObject(obj, j7);
                        if (object instanceof zzlh) {
                            iZzz5 = zzlm.zzz(i18);
                            iZzc = ((zzlh) object).zzc();
                            iZzz6 = zzlm.zzz(iZzc);
                            iZzz4 = iZzz5 + iZzz6 + iZzc;
                            iZzz19 += iZzz4;
                        } else {
                            iZzz2 = zzlm.zzz(i18);
                            iZzA = zzlm.zzB((String) object);
                            iZzz4 = iZzz2 + iZzA;
                            iZzz19 += iZzz4;
                        }
                    }
                    zznpVar = this;
                    break;
                case 9:
                    i8 = i9;
                    if (zznpVar.zzI(obj, i10, i12, i11, i7)) {
                        iZzz7 = zznz.zzz(i14, unsafe.getObject(obj, j7), zznpVar.zzp(i10));
                        iZzz19 += iZzz7;
                    }
                    break;
                case 10:
                    i8 = i9;
                    if (zznpVar.zzI(obj, i10, i12, i11, i7)) {
                        zzlh zzlhVar = (zzlh) unsafe.getObject(obj, j7);
                        iZzz5 = zzlm.zzz(i14 << 3);
                        iZzc = zzlhVar.zzc();
                        iZzz6 = zzlm.zzz(iZzc);
                        iZzz4 = iZzz5 + iZzz6 + iZzc;
                        iZzz19 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 11:
                    i8 = i9;
                    if (zznpVar.zzI(obj, i10, i12, i11, i7)) {
                        int i19 = unsafe.getInt(obj, j7);
                        iZzz2 = zzlm.zzz(i14 << 3);
                        iZzA = zzlm.zzz(i19);
                        iZzz4 = iZzz2 + iZzA;
                        iZzz19 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 12:
                    i8 = i9;
                    if (zznpVar.zzI(obj, i10, i12, i11, i7)) {
                        long j11 = unsafe.getInt(obj, j7);
                        iZzz2 = zzlm.zzz(i14 << 3);
                        iZzA = zzlm.zzA(j11);
                        iZzz4 = iZzz2 + iZzA;
                        iZzz19 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 13:
                    i8 = i9;
                    if (zznpVar.zzI(obj, i10, i12, i11, i7)) {
                        iZzz = zzlm.zzz(i14 << 3);
                        iZzz4 = iZzz + 4;
                        iZzz19 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 14:
                    i8 = i9;
                    if (zznpVar.zzI(obj, i10, i12, i11, i7)) {
                        iZzz3 = zzlm.zzz(i14 << 3);
                        iZzz4 = iZzz3 + 8;
                        iZzz19 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 15:
                    i8 = i9;
                    if (zznpVar.zzI(obj, i10, i12, i11, i7)) {
                        int i20 = unsafe.getInt(obj, j7);
                        iZzz2 = zzlm.zzz(i14 << 3);
                        iZzA = zzlm.zzz((i20 >> 31) ^ (i20 + i20));
                        iZzz4 = iZzz2 + iZzA;
                        iZzz19 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 16:
                    i8 = i9;
                    if (zznpVar.zzI(obj, i10, i12, i11, i7)) {
                        long j12 = unsafe.getLong(obj, j7);
                        iZzz2 = zzlm.zzz(i14 << 3);
                        iZzA = zzlm.zzA((j12 >> 63) ^ (j12 + j12));
                        iZzz4 = iZzz2 + iZzA;
                        iZzz19 += iZzz4;
                    }
                    zznpVar = this;
                    break;
                case 17:
                    i8 = i9;
                    if (zznpVar.zzI(obj, i10, i12, i11, i7)) {
                        iZzz7 = zzlm.zzG(i14, (zznm) unsafe.getObject(obj, j7), zznpVar.zzp(i10));
                        iZzz19 += iZzz7;
                    }
                    break;
                case 18:
                    i8 = i9;
                    iZzz7 = zznz.zzy(i14, (List) unsafe.getObject(obj, j7), false);
                    iZzz19 += iZzz7;
                    break;
                case 19:
                    i8 = i9;
                    iZzz7 = zznz.zzw(i14, (List) unsafe.getObject(obj, j7), false);
                    iZzz19 += iZzz7;
                    break;
                case 20:
                    i8 = i9;
                    List list = (List) unsafe.getObject(obj, j7);
                    int i21 = zznz.zza;
                    if (list.size() == 0) {
                        iZzo = 0;
                    } else {
                        iZzo = zznz.zzo(list) + (list.size() * zzlm.zzz(i14 << 3));
                    }
                    iZzz19 += iZzo;
                    break;
                case zzbbn.zzt.zzm /* 21 */:
                    i8 = i9;
                    List list2 = (List) unsafe.getObject(obj, j7);
                    int i22 = zznz.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzp = zznz.zzp(list2);
                        iZzz8 = zzlm.zzz(i14 << 3);
                        iZzz7 = iZzp + (size * iZzz8);
                    }
                    iZzz19 += iZzz7;
                    break;
                case 22:
                    i8 = i9;
                    List list3 = (List) unsafe.getObject(obj, j7);
                    int i23 = zznz.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzp = zznz.zzs(list3);
                        iZzz8 = zzlm.zzz(i14 << 3);
                        iZzz7 = iZzp + (size * iZzz8);
                    }
                    iZzz19 += iZzz7;
                    break;
                case 23:
                    i8 = i9;
                    iZzz7 = zznz.zzy(i14, (List) unsafe.getObject(obj, j7), false);
                    iZzz19 += iZzz7;
                    break;
                case 24:
                    i8 = i9;
                    iZzz7 = zznz.zzw(i14, (List) unsafe.getObject(obj, j7), false);
                    iZzz19 += iZzz7;
                    break;
                case 25:
                    i8 = i9;
                    List list4 = (List) unsafe.getObject(obj, j7);
                    int i24 = zznz.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzz7 = size2 * (zzlm.zzz(i14 << 3) + 1);
                    }
                    iZzz19 += iZzz7;
                    break;
                case 26:
                    i8 = i9;
                    List list5 = (List) unsafe.getObject(obj, j7);
                    int i25 = zznz.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzo = 0;
                    } else {
                        iZzo = zzlm.zzz(i14 << 3) * size3;
                        if (list5 instanceof zzmx) {
                            zzmx zzmxVar = (zzmx) list5;
                            for (int i26 = 0; i26 < size3; i26++) {
                                Object objZzc = zzmxVar.zzc();
                                if (objZzc instanceof zzlh) {
                                    int iZzc4 = ((zzlh) objZzc).zzc();
                                    iZzo += zzlm.zzz(iZzc4) + iZzc4;
                                } else {
                                    iZzo += zzlm.zzB((String) objZzc);
                                }
                            }
                        } else {
                            for (int i27 = 0; i27 < size3; i27++) {
                                Object obj2 = list5.get(i27);
                                if (obj2 instanceof zzlh) {
                                    int iZzc5 = ((zzlh) obj2).zzc();
                                    iZzo += zzlm.zzz(iZzc5) + iZzc5;
                                } else {
                                    iZzo += zzlm.zzB((String) obj2);
                                }
                            }
                        }
                    }
                    iZzz19 += iZzo;
                    break;
                case 27:
                    i8 = i9;
                    List list6 = (List) unsafe.getObject(obj, j7);
                    zznx zznxVarZzp = zznpVar.zzp(i10);
                    int i28 = zznz.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzz9 = 0;
                    } else {
                        iZzz9 = zzlm.zzz(i14 << 3) * size4;
                        for (int i29 = 0; i29 < size4; i29++) {
                            Object obj3 = list6.get(i29);
                            if (obj3 instanceof zzmw) {
                                int iZzb = ((zzmw) obj3).zzb();
                                iZzz9 += zzlm.zzz(iZzb) + iZzb;
                            } else {
                                iZzz9 += zzlm.zzD((zznm) obj3, zznxVarZzp);
                            }
                        }
                    }
                    iZzz19 += iZzz9;
                    break;
                case 28:
                    i8 = i9;
                    List list7 = (List) unsafe.getObject(obj, j7);
                    int i30 = zznz.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzz10 = 0;
                    } else {
                        iZzz10 = size5 * zzlm.zzz(i14 << 3);
                        for (int i31 = 0; i31 < list7.size(); i31++) {
                            int iZzc6 = ((zzlh) list7.get(i31)).zzc();
                            iZzz10 += zzlm.zzz(iZzc6) + iZzc6;
                        }
                    }
                    iZzz19 += iZzz10;
                    break;
                case 29:
                    i8 = i9;
                    List list8 = (List) unsafe.getObject(obj, j7);
                    int i32 = zznz.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzp = zznz.zzt(list8);
                        iZzz8 = zzlm.zzz(i14 << 3);
                        iZzz7 = iZzp + (size * iZzz8);
                    }
                    iZzz19 += iZzz7;
                    break;
                case 30:
                    i8 = i9;
                    List list9 = (List) unsafe.getObject(obj, j7);
                    int i33 = zznz.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzp = zznz.zzr(list9);
                        iZzz8 = zzlm.zzz(i14 << 3);
                        iZzz7 = iZzp + (size * iZzz8);
                    }
                    iZzz19 += iZzz7;
                    break;
                case 31:
                    i8 = i9;
                    iZzz7 = zznz.zzw(i14, (List) unsafe.getObject(obj, j7), false);
                    iZzz19 += iZzz7;
                    break;
                case 32:
                    i8 = i9;
                    iZzz7 = zznz.zzy(i14, (List) unsafe.getObject(obj, j7), false);
                    iZzz19 += iZzz7;
                    break;
                case 33:
                    i8 = i9;
                    List list10 = (List) unsafe.getObject(obj, j7);
                    int i34 = zznz.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzp = zznz.zzu(list10);
                        iZzz8 = zzlm.zzz(i14 << 3);
                        iZzz7 = iZzp + (size * iZzz8);
                    }
                    iZzz19 += iZzz7;
                    break;
                case 34:
                    i8 = i9;
                    List list11 = (List) unsafe.getObject(obj, j7);
                    int i35 = zznz.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzp = zznz.zzq(list11);
                        iZzz8 = zzlm.zzz(i14 << 3);
                        iZzz7 = iZzp + (size * iZzz8);
                    }
                    iZzz19 += iZzz7;
                    break;
                case 35:
                    i8 = i9;
                    iZzx = zznz.zzx((List) unsafe.getObject(obj, j7));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz19 += iZzz10;
                    }
                    break;
                case 36:
                    i8 = i9;
                    iZzx = zznz.zzv((List) unsafe.getObject(obj, j7));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz19 += iZzz10;
                    }
                    break;
                case 37:
                    i8 = i9;
                    iZzx = zznz.zzo((List) unsafe.getObject(obj, j7));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz19 += iZzz10;
                    }
                    break;
                case 38:
                    i8 = i9;
                    iZzx = zznz.zzp((List) unsafe.getObject(obj, j7));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz19 += iZzz10;
                    }
                    break;
                case 39:
                    i8 = i9;
                    iZzx = zznz.zzs((List) unsafe.getObject(obj, j7));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz19 += iZzz10;
                    }
                    break;
                case 40:
                    i8 = i9;
                    iZzx = zznz.zzx((List) unsafe.getObject(obj, j7));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz19 += iZzz10;
                    }
                    break;
                case 41:
                    i8 = i9;
                    iZzx = zznz.zzv((List) unsafe.getObject(obj, j7));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz19 += iZzz10;
                    }
                    break;
                case 42:
                    i8 = i9;
                    List list12 = (List) unsafe.getObject(obj, j7);
                    int i36 = zznz.zza;
                    iZzx = list12.size();
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz19 += iZzz10;
                    }
                    break;
                case 43:
                    i8 = i9;
                    iZzx = zznz.zzt((List) unsafe.getObject(obj, j7));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz19 += iZzz10;
                    }
                    break;
                case 44:
                    i8 = i9;
                    iZzx = zznz.zzr((List) unsafe.getObject(obj, j7));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz19 += iZzz10;
                    }
                    break;
                case 45:
                    i8 = i9;
                    iZzx = zznz.zzv((List) unsafe.getObject(obj, j7));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz19 += iZzz10;
                    }
                    break;
                case 46:
                    i8 = i9;
                    iZzx = zznz.zzx((List) unsafe.getObject(obj, j7));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz19 += iZzz10;
                    }
                    break;
                case 47:
                    i8 = i9;
                    iZzx = zznz.zzu((List) unsafe.getObject(obj, j7));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz19 += iZzz10;
                    }
                    break;
                case 48:
                    i8 = i9;
                    iZzx = zznz.zzq((List) unsafe.getObject(obj, j7));
                    if (iZzx > 0) {
                        iZzz11 = zzlm.zzz(i14 << 3);
                        iZzz12 = zzlm.zzz(iZzx);
                        iZzz10 = iZzz11 + iZzz12 + iZzx;
                        iZzz19 += iZzz10;
                    }
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j7);
                    zznx zznxVarZzp2 = zznpVar.zzp(i10);
                    int i37 = zznz.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZzG = 0;
                    } else {
                        int i38 = 0;
                        iZzG = 0;
                        while (i38 < size6) {
                            iZzG += zzlm.zzG(i14, (zznm) list13.get(i38), zznxVarZzp2);
                            i38++;
                            i9 = i9;
                        }
                    }
                    i8 = i9;
                    iZzz19 += iZzG;
                    break;
                case 50:
                    zzng zzngVar = (zzng) unsafe.getObject(obj, j7);
                    zznf zznfVar = (zznf) zznpVar.zzq(i10);
                    if (zzngVar.isEmpty()) {
                        iZzd = 0;
                    } else {
                        iZzd = 0;
                        for (Map.Entry entry2 : zzngVar.entrySet()) {
                            iZzd += zznfVar.zzd(i14, entry2.getKey(), entry2.getValue());
                        }
                    }
                    iZzz19 += iZzd;
                    i8 = i9;
                    break;
                case 51:
                    if (zznpVar.zzL(obj, i14, i10)) {
                        iZzz13 = zzlm.zzz(i14 << 3);
                        iZzz16 = iZzz13 + 8;
                        iZzz19 += iZzz16;
                    }
                    i8 = i9;
                    break;
                case 52:
                    if (zznpVar.zzL(obj, i14, i10)) {
                        iZzz14 = zzlm.zzz(i14 << 3);
                        iZzz16 = iZzz14 + 4;
                        iZzz19 += iZzz16;
                    }
                    i8 = i9;
                    break;
                case 53:
                    if (zznpVar.zzL(obj, i14, i10)) {
                        long jZzF = zzF(obj, j7);
                        iZzz15 = zzlm.zzz(i14 << 3);
                        iZzA2 = zzlm.zzA(jZzF);
                        iZzz16 = iZzz15 + iZzA2;
                        iZzz19 += iZzz16;
                    }
                    i8 = i9;
                    break;
                case 54:
                    if (zznpVar.zzL(obj, i14, i10)) {
                        long jZzF2 = zzF(obj, j7);
                        iZzz15 = zzlm.zzz(i14 << 3);
                        iZzA2 = zzlm.zzA(jZzF2);
                        iZzz16 = iZzz15 + iZzA2;
                        iZzz19 += iZzz16;
                    }
                    i8 = i9;
                    break;
                case 55:
                    if (zznpVar.zzL(obj, i14, i10)) {
                        long jZzE = zzE(obj, j7);
                        iZzz15 = zzlm.zzz(i14 << 3);
                        iZzA2 = zzlm.zzA(jZzE);
                        iZzz16 = iZzz15 + iZzA2;
                        iZzz19 += iZzz16;
                    }
                    i8 = i9;
                    break;
                case 56:
                    if (zznpVar.zzL(obj, i14, i10)) {
                        iZzz13 = zzlm.zzz(i14 << 3);
                        iZzz16 = iZzz13 + 8;
                        iZzz19 += iZzz16;
                    }
                    i8 = i9;
                    break;
                case 57:
                    if (zznpVar.zzL(obj, i14, i10)) {
                        iZzz14 = zzlm.zzz(i14 << 3);
                        iZzz16 = iZzz14 + 4;
                        iZzz19 += iZzz16;
                    }
                    i8 = i9;
                    break;
                case 58:
                    if (zznpVar.zzL(obj, i14, i10)) {
                        iZzz16 = zzlm.zzz(i14 << 3) + i9;
                        iZzz19 += iZzz16;
                    }
                    i8 = i9;
                    break;
                case 59:
                    if (zznpVar.zzL(obj, i14, i10)) {
                        int i39 = i14 << 3;
                        Object object2 = unsafe.getObject(obj, j7);
                        if (object2 instanceof zzlh) {
                            iZzz17 = zzlm.zzz(i39);
                            iZzc2 = ((zzlh) object2).zzc();
                            iZzz18 = zzlm.zzz(iZzc2);
                            iZzz16 = iZzz17 + iZzz18 + iZzc2;
                            iZzz19 += iZzz16;
                        } else {
                            iZzz15 = zzlm.zzz(i39);
                            iZzA2 = zzlm.zzB((String) object2);
                            iZzz16 = iZzz15 + iZzA2;
                            iZzz19 += iZzz16;
                        }
                    }
                    i8 = i9;
                    break;
                case 60:
                    if (zznpVar.zzL(obj, i14, i10)) {
                        iZzz16 = zznz.zzz(i14, unsafe.getObject(obj, j7), zznpVar.zzp(i10));
                        iZzz19 += iZzz16;
                    }
                    i8 = i9;
                    break;
                case 61:
                    if (zznpVar.zzL(obj, i14, i10)) {
                        zzlh zzlhVar2 = (zzlh) unsafe.getObject(obj, j7);
                        iZzz17 = zzlm.zzz(i14 << 3);
                        iZzc2 = zzlhVar2.zzc();
                        iZzz18 = zzlm.zzz(iZzc2);
                        iZzz16 = iZzz17 + iZzz18 + iZzc2;
                        iZzz19 += iZzz16;
                    }
                    i8 = i9;
                    break;
                case 62:
                    if (zznpVar.zzL(obj, i14, i10)) {
                        int iZzE = zzE(obj, j7);
                        iZzz15 = zzlm.zzz(i14 << 3);
                        iZzA2 = zzlm.zzz(iZzE);
                        iZzz16 = iZzz15 + iZzA2;
                        iZzz19 += iZzz16;
                    }
                    i8 = i9;
                    break;
                case 63:
                    if (zznpVar.zzL(obj, i14, i10)) {
                        long jZzE2 = zzE(obj, j7);
                        iZzz15 = zzlm.zzz(i14 << 3);
                        iZzA2 = zzlm.zzA(jZzE2);
                        iZzz16 = iZzz15 + iZzA2;
                        iZzz19 += iZzz16;
                    }
                    i8 = i9;
                    break;
                case 64:
                    if (zznpVar.zzL(obj, i14, i10)) {
                        iZzz14 = zzlm.zzz(i14 << 3);
                        iZzz16 = iZzz14 + 4;
                        iZzz19 += iZzz16;
                    }
                    i8 = i9;
                    break;
                case 65:
                    if (zznpVar.zzL(obj, i14, i10)) {
                        iZzz13 = zzlm.zzz(i14 << 3);
                        iZzz16 = iZzz13 + 8;
                        iZzz19 += iZzz16;
                    }
                    i8 = i9;
                    break;
                case 66:
                    if (zznpVar.zzL(obj, i14, i10)) {
                        int iZzE2 = zzE(obj, j7);
                        iZzz15 = zzlm.zzz(i14 << 3);
                        iZzA2 = zzlm.zzz((iZzE2 >> 31) ^ (iZzE2 + iZzE2));
                        iZzz16 = iZzz15 + iZzA2;
                        iZzz19 += iZzz16;
                    }
                    i8 = i9;
                    break;
                case 67:
                    if (zznpVar.zzL(obj, i14, i10)) {
                        long jZzF3 = zzF(obj, j7);
                        iZzz15 = zzlm.zzz(i14 << 3);
                        iZzA2 = zzlm.zzA((jZzF3 >> 63) ^ (jZzF3 + jZzF3));
                        iZzz16 = iZzz15 + iZzA2;
                        iZzz19 += iZzz16;
                    }
                    i8 = i9;
                    break;
                case 68:
                    if (zznpVar.zzL(obj, i14, i10)) {
                        iZzz16 = zzlm.zzG(i14, (zznm) unsafe.getObject(obj, j7), zznpVar.zzp(i10));
                        iZzz19 += iZzz16;
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

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzf(Object obj, zzov zzovVar) {
        Map.Entry entry;
        int i7;
        zznp<T> zznpVar = this;
        if (zznpVar.zzh) {
            zzlw zzlwVar = ((zzmc) obj).zzb;
            if (zzlwVar.zza.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) zzlwVar.zzc().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = zznpVar.zzc;
        Unsafe unsafe = zzb;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i10 < iArr.length) {
            int iZzx = zznpVar.zzx(i10);
            int iZzz = zzz(iZzx);
            int i12 = iArr[i10];
            if (iZzz <= 17) {
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
            long j7 = iZzx & i8;
            switch (iZzz) {
                case 0:
                    if (zznpVar.zzI(obj, i10, i9, i11, i7)) {
                        zzovVar.zzf(i12, zzop.zzl(obj, j7));
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 1:
                    if (zznpVar.zzI(obj, i10, i9, i11, i7)) {
                        zzovVar.zze(i12, zzop.zzj(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 2:
                    if (zznpVar.zzI(obj, i10, i9, i11, i7)) {
                        zzovVar.zzc(i12, unsafe.getLong(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 3:
                    if (zznpVar.zzI(obj, i10, i9, i11, i7)) {
                        zzovVar.zzh(i12, unsafe.getLong(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 4:
                    if (zznpVar.zzI(obj, i10, i9, i11, i7)) {
                        zzovVar.zzi(i12, unsafe.getInt(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 5:
                    if (zznpVar.zzI(obj, i10, i9, i11, i7)) {
                        zzovVar.zzj(i12, unsafe.getLong(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 6:
                    if (zznpVar.zzI(obj, i10, i9, i11, i7)) {
                        zzovVar.zzk(i12, unsafe.getInt(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 7:
                    if (zznpVar.zzI(obj, i10, i9, i11, i7)) {
                        zzovVar.zzl(i12, zzop.zzh(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 8:
                    if (zznpVar.zzI(obj, i10, i9, i11, i7)) {
                        zzP(i12, unsafe.getObject(obj, j7), zzovVar);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 9:
                    if (zznpVar.zzI(obj, i10, i9, i11, i7)) {
                        zzovVar.zzr(i12, unsafe.getObject(obj, j7), zznpVar.zzp(i10));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 10:
                    if (zznpVar.zzI(obj, i10, i9, i11, i7)) {
                        zzovVar.zzn(i12, (zzlh) unsafe.getObject(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 11:
                    if (zznpVar.zzI(obj, i10, i9, i11, i7)) {
                        zzovVar.zzo(i12, unsafe.getInt(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 12:
                    if (zznpVar.zzI(obj, i10, i9, i11, i7)) {
                        zzovVar.zzg(i12, unsafe.getInt(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 13:
                    if (zznpVar.zzI(obj, i10, i9, i11, i7)) {
                        zzovVar.zzb(i12, unsafe.getInt(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 14:
                    if (zznpVar.zzI(obj, i10, i9, i11, i7)) {
                        zzovVar.zzd(i12, unsafe.getLong(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 15:
                    if (zznpVar.zzI(obj, i10, i9, i11, i7)) {
                        zzovVar.zzp(i12, unsafe.getInt(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 16:
                    if (zznpVar.zzI(obj, i10, i9, i11, i7)) {
                        zzovVar.zzq(i12, unsafe.getLong(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 17:
                    if (zznpVar.zzI(obj, i10, i9, i11, i7)) {
                        zzovVar.zzs(i12, unsafe.getObject(obj, j7), zznpVar.zzp(i10));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 18:
                    zznz.zza(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 19:
                    zznz.zzb(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 20:
                    zznz.zzc(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case zzbbn.zzt.zzm /* 21 */:
                    zznz.zzd(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 22:
                    zznz.zzh(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 23:
                    zznz.zzf(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 24:
                    zznz.zzk(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 25:
                    zznz.zzn(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 26:
                    int i15 = iArr[i10];
                    List list = (List) unsafe.getObject(obj, j7);
                    int i16 = zznz.zza;
                    if (list != null && !list.isEmpty()) {
                        zzovVar.zzF(i15, list);
                    }
                    break;
                case 27:
                    int i17 = iArr[i10];
                    List list2 = (List) unsafe.getObject(obj, j7);
                    zznx zznxVarZzp = zznpVar.zzp(i10);
                    int i18 = zznz.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i19 = 0; i19 < list2.size(); i19++) {
                            ((zzln) zzovVar).zzr(i17, list2.get(i19), zznxVarZzp);
                        }
                    }
                    break;
                case 28:
                    int i20 = iArr[i10];
                    List list3 = (List) unsafe.getObject(obj, j7);
                    int i21 = zznz.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzovVar.zzG(i20, list3);
                    }
                    break;
                case 29:
                    zznz.zzi(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 30:
                    zznz.zzm(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 31:
                    zznz.zzl(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 32:
                    zznz.zzg(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 33:
                    zznz.zzj(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 34:
                    zznz.zze(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    zznpVar = this;
                    break;
                case 35:
                    zznz.zza(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, true);
                    break;
                case 36:
                    zznz.zzb(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, true);
                    break;
                case 37:
                    zznz.zzc(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, true);
                    break;
                case 38:
                    zznz.zzd(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, true);
                    break;
                case 39:
                    zznz.zzh(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, true);
                    break;
                case 40:
                    zznz.zzf(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, true);
                    break;
                case 41:
                    zznz.zzk(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, true);
                    break;
                case 42:
                    zznz.zzn(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, true);
                    break;
                case 43:
                    zznz.zzi(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, true);
                    break;
                case 44:
                    zznz.zzm(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, true);
                    break;
                case 45:
                    zznz.zzl(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, true);
                    break;
                case 46:
                    zznz.zzg(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, true);
                    break;
                case 47:
                    zznz.zzj(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, true);
                    break;
                case 48:
                    zznz.zze(iArr[i10], (List) unsafe.getObject(obj, j7), zzovVar, true);
                    break;
                case 49:
                    int i22 = iArr[i10];
                    List list4 = (List) unsafe.getObject(obj, j7);
                    zznx zznxVarZzp2 = zznpVar.zzp(i10);
                    int i23 = zznz.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i24 = 0; i24 < list4.size(); i24++) {
                            ((zzln) zzovVar).zzs(i22, list4.get(i24), zznxVarZzp2);
                        }
                    }
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j7);
                    if (object != null) {
                        zzovVar.zzM(i12, ((zznf) zznpVar.zzq(i10)).zze(), (zzng) object);
                    }
                    break;
                case 51:
                    if (zznpVar.zzL(obj, i12, i10)) {
                        zzovVar.zzf(i12, zzC(obj, j7));
                    }
                    break;
                case 52:
                    if (zznpVar.zzL(obj, i12, i10)) {
                        zzovVar.zze(i12, zzD(obj, j7));
                    }
                    break;
                case 53:
                    if (zznpVar.zzL(obj, i12, i10)) {
                        zzovVar.zzc(i12, zzF(obj, j7));
                    }
                    break;
                case 54:
                    if (zznpVar.zzL(obj, i12, i10)) {
                        zzovVar.zzh(i12, zzF(obj, j7));
                    }
                    break;
                case 55:
                    if (zznpVar.zzL(obj, i12, i10)) {
                        zzovVar.zzi(i12, zzE(obj, j7));
                    }
                    break;
                case 56:
                    if (zznpVar.zzL(obj, i12, i10)) {
                        zzovVar.zzj(i12, zzF(obj, j7));
                    }
                    break;
                case 57:
                    if (zznpVar.zzL(obj, i12, i10)) {
                        zzovVar.zzk(i12, zzE(obj, j7));
                    }
                    break;
                case 58:
                    if (zznpVar.zzL(obj, i12, i10)) {
                        zzovVar.zzl(i12, zzG(obj, j7));
                    }
                    break;
                case 59:
                    if (zznpVar.zzL(obj, i12, i10)) {
                        zzP(i12, unsafe.getObject(obj, j7), zzovVar);
                    }
                    break;
                case 60:
                    if (zznpVar.zzL(obj, i12, i10)) {
                        zzovVar.zzr(i12, unsafe.getObject(obj, j7), zznpVar.zzp(i10));
                    }
                    break;
                case 61:
                    if (zznpVar.zzL(obj, i12, i10)) {
                        zzovVar.zzn(i12, (zzlh) unsafe.getObject(obj, j7));
                    }
                    break;
                case 62:
                    if (zznpVar.zzL(obj, i12, i10)) {
                        zzovVar.zzo(i12, zzE(obj, j7));
                    }
                    break;
                case 63:
                    if (zznpVar.zzL(obj, i12, i10)) {
                        zzovVar.zzg(i12, zzE(obj, j7));
                    }
                    break;
                case 64:
                    if (zznpVar.zzL(obj, i12, i10)) {
                        zzovVar.zzb(i12, zzE(obj, j7));
                    }
                    break;
                case 65:
                    if (zznpVar.zzL(obj, i12, i10)) {
                        zzovVar.zzd(i12, zzF(obj, j7));
                    }
                    break;
                case 66:
                    if (zznpVar.zzL(obj, i12, i10)) {
                        zzovVar.zzp(i12, zzE(obj, j7));
                    }
                    break;
                case 67:
                    if (zznpVar.zzL(obj, i12, i10)) {
                        zzovVar.zzq(i12, zzF(obj, j7));
                    }
                    break;
                case 68:
                    if (zznpVar.zzL(obj, i12, i10)) {
                        zzovVar.zzs(i12, unsafe.getObject(obj, j7), zznpVar.zzp(i10));
                    }
                    break;
            }
            i10 += 3;
            i8 = 1048575;
            zznpVar = this;
        }
        if (entry != null) {
            throw null;
        }
        ((zzmf) obj).zzc.zzg(zzovVar);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 43441. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int zzh(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.measurement.zzkw r40) {
        /*
            Method dump skipped, instruction units count: 4344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzh(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzkw):int");
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzi(Object obj, byte[] bArr, int i7, int i8, zzkw zzkwVar) {
        zzh(obj, bArr, i7, i8, 0, zzkwVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzj(Object obj) {
        if (zzA(obj)) {
            if (obj instanceof zzmf) {
                zzmf zzmfVar = (zzmf) obj;
                zzmfVar.zzcm(C3553a.e.API_PRIORITY_OTHER);
                zzmfVar.zza = 0;
                zzmfVar.zzcg();
            }
            int[] iArr = this.zzc;
            for (int i7 = 0; i7 < iArr.length; i7 += 3) {
                int iZzx = zzx(i7);
                int i8 = 1048575 & iZzx;
                int iZzz = zzz(iZzx);
                long j7 = i8;
                if (iZzz != 9) {
                    if (iZzz != 60 && iZzz != 68) {
                        switch (iZzz) {
                            case 17:
                                if (zzJ(obj, i7)) {
                                    zzp(i7).zzj(zzb.getObject(obj, j7));
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
                                ((zzmo) zzop.zzn(obj, j7)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j7);
                                if (object != null) {
                                    ((zzng) object).zzd();
                                    unsafe.putObject(obj, j7, object);
                                }
                                break;
                        }
                    } else if (zzL(obj, iArr[i7], i7)) {
                        zzp(i7).zzj(zzb.getObject(obj, j7));
                    }
                } else if (zzJ(obj, i7)) {
                    zzp(i7).zzj(zzb.getObject(obj, j7));
                }
            }
            this.zzl.zzb(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6 A[LOOP:2: B:53:0x00d5->B:58:0x00e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zznx
    public final boolean zzk(Object obj) {
        int i7;
        int i8;
        List list;
        zznx zznxVarZzp;
        int i9;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        while (i11 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i13 = iArr[i11];
            int i14 = iArr2[i13];
            int iZzx = zzx(i13);
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
            if ((268435456 & iZzx) != 0 && !zzI(obj, i13, i7, i8, i17)) {
                return false;
            }
            int iZzz = zzz(iZzx);
            if (iZzz == 9 || iZzz == 17) {
                if (zzI(obj, i13, i7, i8, i17) && !zzw(obj, iZzx, zzp(i13))) {
                    return false;
                }
            } else if (iZzz == 27) {
                list = (List) zzop.zzn(obj, iZzx & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zznxVarZzp = zzp(i13);
                    for (i9 = 0; i9 < list.size(); i9++) {
                        if (!zznxVarZzp.zzk(list.get(i9))) {
                            return false;
                        }
                    }
                }
            } else if (iZzz == 60 || iZzz == 68) {
                if (zzL(obj, i14, i13) && !zzw(obj, iZzx, zzp(i13))) {
                    return false;
                }
            } else if (iZzz == 49) {
                list = (List) zzop.zzn(obj, iZzx & 1048575);
                if (list.isEmpty()) {
                    zznxVarZzp = zzp(i13);
                    while (i9 < list.size()) {
                        if (!zznxVarZzp.zzk(list.get(i9))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzz != 50) {
                continue;
            } else {
                zzng zzngVar = (zzng) zzop.zzn(obj, iZzx & 1048575);
                if (!zzngVar.isEmpty() && ((zznf) zzq(i13)).zze().zzc.zza() == zzou.MESSAGE) {
                    zznx zznxVarZzb = null;
                    for (Object obj2 : zzngVar.values()) {
                        if (zznxVarZzb == null) {
                            zznxVarZzb = zznu.zza().zzb(obj2.getClass());
                        }
                        if (!zznxVarZzb.zzk(obj2)) {
                            return false;
                        }
                    }
                }
            }
            i11++;
            i12 = i7;
            i10 = i8;
        }
        return !this.zzh || ((zzmc) obj).zzb.zze();
    }
}
