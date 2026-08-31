package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.internal.ads.zzbbn;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzamq<T> implements zzanb<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzanz.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzamm zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzamu zzn;
    private final zzalw zzo;
    private final zzanu<?, ?> zzp;
    private final zzakw<?> zzq;
    private final zzamf zzr;

    private zzamq(int[] iArr, Object[] objArr, int i7, int i8, zzamm zzammVar, boolean z7, int[] iArr2, int i9, int i10, zzamu zzamuVar, zzalw zzalwVar, zzanu<?, ?> zzanuVar, zzakw<?> zzakwVar, zzamf zzamfVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i7;
        this.zzf = i8;
        this.zzi = zzammVar instanceof zzalf;
        this.zzh = zzakwVar != null && zzakwVar.zza(zzammVar);
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i9;
        this.zzm = i10;
        this.zzn = zzamuVar;
        this.zzo = zzalwVar;
        this.zzp = zzanuVar;
        this.zzq = zzakwVar;
        this.zzg = zzammVar;
        this.zzr = zzamfVar;
    }

    private static <T> double zza(T t7, long j7) {
        return ((Double) zzanz.zze(t7, j7)).doubleValue();
    }

    private static <T> float zzb(T t7, long j7) {
        return ((Float) zzanz.zze(t7, j7)).floatValue();
    }

    private static <T> int zzc(T t7, long j7) {
        return ((Integer) zzanz.zze(t7, j7)).intValue();
    }

    private static <T> long zzd(T t7, long j7) {
        return ((Long) zzanz.zze(t7, j7)).longValue();
    }

    private final zzanb zze(int i7) {
        int i8 = (i7 / 3) << 1;
        zzanb zzanbVar = (zzanb) this.zzd[i8];
        if (zzanbVar != null) {
            return zzanbVar;
        }
        zzanb<T> zzanbVarZza = zzamx.zza().zza((Class) this.zzd[i8 + 1]);
        this.zzd[i8] = zzanbVarZza;
        return zzanbVarZza;
    }

    private final Object zzf(int i7) {
        return this.zzd[(i7 / 3) << 1];
    }

    private static boolean zzg(int i7) {
        return (i7 & 536870912) != 0;
    }

    private static int zza(byte[] bArr, int i7, int i8, zzaog zzaogVar, Class<?> cls, zzaju zzajuVar) {
        switch (zzamp.zza[zzaogVar.ordinal()]) {
            case 1:
                int iZzd = zzajr.zzd(bArr, i7, zzajuVar);
                zzajuVar.zzc = Boolean.valueOf(zzajuVar.zzb != 0);
                return iZzd;
            case 2:
                return zzajr.zza(bArr, i7, zzajuVar);
            case 3:
                zzajuVar.zzc = Double.valueOf(zzajr.zza(bArr, i7));
                return i7 + 8;
            case 4:
            case 5:
                zzajuVar.zzc = Integer.valueOf(zzajr.zzc(bArr, i7));
                return i7 + 4;
            case 6:
            case 7:
                zzajuVar.zzc = Long.valueOf(zzajr.zzd(bArr, i7));
                return i7 + 8;
            case 8:
                zzajuVar.zzc = Float.valueOf(zzajr.zzb(bArr, i7));
                return i7 + 4;
            case 9:
            case 10:
            case 11:
                int iZzc = zzajr.zzc(bArr, i7, zzajuVar);
                zzajuVar.zzc = Integer.valueOf(zzajuVar.zza);
                return iZzc;
            case 12:
            case 13:
                int iZzd2 = zzajr.zzd(bArr, i7, zzajuVar);
                zzajuVar.zzc = Long.valueOf(zzajuVar.zzb);
                return iZzd2;
            case 14:
                return zzajr.zza(zzamx.zza().zza((Class) cls), bArr, i7, i8, zzajuVar);
            case 15:
                int iZzc2 = zzajr.zzc(bArr, i7, zzajuVar);
                zzajuVar.zzc = Integer.valueOf(zzakh.zza(zzajuVar.zza));
                return iZzc2;
            case 16:
                int iZzd3 = zzajr.zzd(bArr, i7, zzajuVar);
                zzajuVar.zzc = Long.valueOf(zzakh.zza(zzajuVar.zzb));
                return iZzd3;
            case 17:
                return zzajr.zzb(bArr, i7, zzajuVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final int zzc(int i7) {
        return this.zzc[i7 + 1];
    }

    private final zzalj zzd(int i7) {
        return (zzalj) this.zzd[((i7 / 3) << 1) + 1];
    }

    private static void zzf(Object obj) {
        if (zzg(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + String.valueOf(obj));
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzalf) {
            return ((zzalf) obj).zzw();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanb
    public final int zzb(T t7) {
        int i7;
        int iZza;
        int length = this.zzc.length;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9 += 3) {
            int iZzc = zzc(i9);
            int i10 = this.zzc[i9];
            long j7 = 1048575 & iZzc;
            int iHashCode = 37;
            switch ((iZzc & 267386880) >>> 20) {
                case 0:
                    i7 = i8 * 53;
                    iZza = zzalh.zza(Double.doubleToLongBits(zzanz.zza(t7, j7)));
                    i8 = i7 + iZza;
                    break;
                case 1:
                    i7 = i8 * 53;
                    iZza = Float.floatToIntBits(zzanz.zzb(t7, j7));
                    i8 = i7 + iZza;
                    break;
                case 2:
                    i7 = i8 * 53;
                    iZza = zzalh.zza(zzanz.zzd(t7, j7));
                    i8 = i7 + iZza;
                    break;
                case 3:
                    i7 = i8 * 53;
                    iZza = zzalh.zza(zzanz.zzd(t7, j7));
                    i8 = i7 + iZza;
                    break;
                case 4:
                    i7 = i8 * 53;
                    iZza = zzanz.zzc(t7, j7);
                    i8 = i7 + iZza;
                    break;
                case 5:
                    i7 = i8 * 53;
                    iZza = zzalh.zza(zzanz.zzd(t7, j7));
                    i8 = i7 + iZza;
                    break;
                case 6:
                    i7 = i8 * 53;
                    iZza = zzanz.zzc(t7, j7);
                    i8 = i7 + iZza;
                    break;
                case 7:
                    i7 = i8 * 53;
                    iZza = zzalh.zza(zzanz.zzh(t7, j7));
                    i8 = i7 + iZza;
                    break;
                case 8:
                    i7 = i8 * 53;
                    iZza = ((String) zzanz.zze(t7, j7)).hashCode();
                    i8 = i7 + iZza;
                    break;
                case 9:
                    Object objZze = zzanz.zze(t7, j7);
                    if (objZze != null) {
                        iHashCode = objZze.hashCode();
                    }
                    i8 = (i8 * 53) + iHashCode;
                    break;
                case 10:
                    i7 = i8 * 53;
                    iZza = zzanz.zze(t7, j7).hashCode();
                    i8 = i7 + iZza;
                    break;
                case 11:
                    i7 = i8 * 53;
                    iZza = zzanz.zzc(t7, j7);
                    i8 = i7 + iZza;
                    break;
                case 12:
                    i7 = i8 * 53;
                    iZza = zzanz.zzc(t7, j7);
                    i8 = i7 + iZza;
                    break;
                case 13:
                    i7 = i8 * 53;
                    iZza = zzanz.zzc(t7, j7);
                    i8 = i7 + iZza;
                    break;
                case 14:
                    i7 = i8 * 53;
                    iZza = zzalh.zza(zzanz.zzd(t7, j7));
                    i8 = i7 + iZza;
                    break;
                case 15:
                    i7 = i8 * 53;
                    iZza = zzanz.zzc(t7, j7);
                    i8 = i7 + iZza;
                    break;
                case 16:
                    i7 = i8 * 53;
                    iZza = zzalh.zza(zzanz.zzd(t7, j7));
                    i8 = i7 + iZza;
                    break;
                case 17:
                    Object objZze2 = zzanz.zze(t7, j7);
                    if (objZze2 != null) {
                        iHashCode = objZze2.hashCode();
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
                    iZza = zzanz.zze(t7, j7).hashCode();
                    i8 = i7 + iZza;
                    break;
                case 50:
                    i7 = i8 * 53;
                    iZza = zzanz.zze(t7, j7).hashCode();
                    i8 = i7 + iZza;
                    break;
                case 51:
                    if (zzc(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iZza = zzalh.zza(Double.doubleToLongBits(zza(t7, j7)));
                        i8 = i7 + iZza;
                    }
                    break;
                case 52:
                    if (zzc(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iZza = Float.floatToIntBits(zzb(t7, j7));
                        i8 = i7 + iZza;
                    }
                    break;
                case 53:
                    if (zzc(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iZza = zzalh.zza(zzd(t7, j7));
                        i8 = i7 + iZza;
                    }
                    break;
                case 54:
                    if (zzc(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iZza = zzalh.zza(zzd(t7, j7));
                        i8 = i7 + iZza;
                    }
                    break;
                case 55:
                    if (zzc(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iZza = zzc(t7, j7);
                        i8 = i7 + iZza;
                    }
                    break;
                case 56:
                    if (zzc(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iZza = zzalh.zza(zzd(t7, j7));
                        i8 = i7 + iZza;
                    }
                    break;
                case 57:
                    if (zzc(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iZza = zzc(t7, j7);
                        i8 = i7 + iZza;
                    }
                    break;
                case 58:
                    if (zzc(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iZza = zzalh.zza(zze(t7, j7));
                        i8 = i7 + iZza;
                    }
                    break;
                case 59:
                    if (zzc(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iZza = ((String) zzanz.zze(t7, j7)).hashCode();
                        i8 = i7 + iZza;
                    }
                    break;
                case 60:
                    if (zzc(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iZza = zzanz.zze(t7, j7).hashCode();
                        i8 = i7 + iZza;
                    }
                    break;
                case 61:
                    if (zzc(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iZza = zzanz.zze(t7, j7).hashCode();
                        i8 = i7 + iZza;
                    }
                    break;
                case 62:
                    if (zzc(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iZza = zzc(t7, j7);
                        i8 = i7 + iZza;
                    }
                    break;
                case 63:
                    if (zzc(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iZza = zzc(t7, j7);
                        i8 = i7 + iZza;
                    }
                    break;
                case 64:
                    if (zzc(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iZza = zzc(t7, j7);
                        i8 = i7 + iZza;
                    }
                    break;
                case 65:
                    if (zzc(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iZza = zzalh.zza(zzd(t7, j7));
                        i8 = i7 + iZza;
                    }
                    break;
                case 66:
                    if (zzc(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iZza = zzc(t7, j7);
                        i8 = i7 + iZza;
                    }
                    break;
                case 67:
                    if (zzc(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iZza = zzalh.zza(zzd(t7, j7));
                        i8 = i7 + iZza;
                    }
                    break;
                case 68:
                    if (zzc(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iZza = zzanz.zze(t7, j7).hashCode();
                        i8 = i7 + iZza;
                    }
                    break;
            }
        }
        int iHashCode2 = (i8 * 53) + this.zzp.zzd(t7).hashCode();
        return this.zzh ? (iHashCode2 * 53) + this.zzq.zza(t7).hashCode() : iHashCode2;
    }

    static zzanx zzc(Object obj) {
        zzalf zzalfVar = (zzalf) obj;
        zzanx zzanxVar = zzalfVar.zzb;
        if (zzanxVar != zzanx.zzc()) {
            return zzanxVar;
        }
        zzanx zzanxVarZzd = zzanx.zzd();
        zzalfVar.zzb = zzanxVarZzd;
        return zzanxVarZzd;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanb
    public final void zzd(T t7) {
        if (zzg(t7)) {
            if (t7 instanceof zzalf) {
                zzalf zzalfVar = (zzalf) t7;
                zzalfVar.zzb(C3553a.e.API_PRIORITY_OTHER);
                zzalfVar.zza = 0;
                zzalfVar.zzu();
            }
            int length = this.zzc.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int iZzc = zzc(i7);
                long j7 = 1048575 & iZzc;
                int i8 = (iZzc & 267386880) >>> 20;
                if (i8 != 9) {
                    if (i8 == 60 || i8 == 68) {
                        if (zzc(t7, this.zzc[i7], i7)) {
                            zze(i7).zzd(zzb.getObject(t7, j7));
                        }
                    } else {
                        switch (i8) {
                            case 17:
                                if (zzc((Object) t7, i7)) {
                                    zze(i7).zzd(zzb.getObject(t7, j7));
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
                                this.zzo.zzb(t7, j7);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(t7, j7);
                                if (object != null) {
                                    unsafe.putObject(t7, j7, this.zzr.zzc(object));
                                }
                                break;
                        }
                    }
                } else if (zzc((Object) t7, i7)) {
                    zze(i7).zzd(zzb.getObject(t7, j7));
                }
            }
            this.zzp.zzf(t7);
            if (this.zzh) {
                this.zzq.zzc(t7);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec A[LOOP:2: B:53:0x00db->B:58:0x00ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.google.android.gms.internal.firebase-auth-api.zzanb] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [com.google.android.gms.internal.firebase-auth-api.zzanb] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanb
    public final boolean zze(T t7) {
        int i7;
        int i8;
        zzamq<T> zzamqVar;
        T t8;
        List list;
        ?? Zze;
        int i9;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        while (i11 < this.zzl) {
            int i13 = this.zzk[i11];
            int i14 = this.zzc[i13];
            int iZzc = zzc(i13);
            int i15 = this.zzc[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i10) {
                if (i16 != 1048575) {
                    i12 = zzb.getInt(t7, i16);
                }
                i8 = i12;
                i7 = i16;
            } else {
                i7 = i10;
                i8 = i12;
            }
            if ((268435456 & iZzc) != 0) {
                zzamqVar = this;
                t8 = t7;
                if (!zzamqVar.zza(t8, i13, i7, i8, i17)) {
                    return false;
                }
            } else {
                zzamqVar = this;
                t8 = t7;
            }
            int i18 = (267386880 & iZzc) >>> 20;
            if (i18 == 9 || i18 == 17) {
                if (zzamqVar.zza(t8, i13, i7, i8, i17) && !zza((Object) t8, iZzc, zze(i13))) {
                    return false;
                }
            } else if (i18 == 27) {
                list = (List) zzanz.zze(t8, iZzc & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    Zze = zze(i13);
                    for (i9 = 0; i9 < list.size(); i9++) {
                        if (!Zze.zze(list.get(i9))) {
                            return false;
                        }
                    }
                }
            } else if (i18 == 60 || i18 == 68) {
                if (zzc(t8, i14, i13) && !zza((Object) t8, iZzc, zze(i13))) {
                    return false;
                }
            } else if (i18 == 49) {
                list = (List) zzanz.zze(t8, iZzc & 1048575);
                if (list.isEmpty()) {
                    Zze = zze(i13);
                    while (i9 < list.size()) {
                        if (!Zze.zze(list.get(i9))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (i18 != 50) {
                continue;
            } else {
                Map<?, ?> mapZzd = zzamqVar.zzr.zzd(zzanz.zze(t8, iZzc & 1048575));
                if (mapZzd.isEmpty()) {
                    continue;
                } else if (zzamqVar.zzr.zza(zzf(i13)).zzc.zzb() == zzaoj.MESSAGE) {
                    ?? Zza = 0;
                    for (Object obj : mapZzd.values()) {
                        if (Zza == 0) {
                            Zza = Zza;
                            Zza = zzamx.zza().zza((Class) obj.getClass());
                        }
                        Zza = Zza;
                        if (!Zza.zze(obj)) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            }
            i11++;
            t7 = t8;
            i10 = i7;
            i12 = i8;
        }
        return !this.zzh || this.zzq.zza(t7).zzg();
    }

    private final boolean zzc(T t7, T t8, int i7) {
        return zzc((Object) t7, i7) == zzc((Object) t8, i7);
    }

    private final boolean zzc(T t7, int i7) {
        int iZzb = zzb(i7);
        long j7 = iZzb & 1048575;
        if (j7 != 1048575) {
            return (zzanz.zzc(t7, j7) & (1 << (iZzb >>> 20))) != 0;
        }
        int iZzc = zzc(i7);
        long j8 = iZzc & 1048575;
        switch ((iZzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzanz.zza(t7, j8)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzanz.zzb(t7, j8)) != 0;
            case 2:
                return zzanz.zzd(t7, j8) != 0;
            case 3:
                return zzanz.zzd(t7, j8) != 0;
            case 4:
                return zzanz.zzc(t7, j8) != 0;
            case 5:
                return zzanz.zzd(t7, j8) != 0;
            case 6:
                return zzanz.zzc(t7, j8) != 0;
            case 7:
                return zzanz.zzh(t7, j8);
            case 8:
                Object objZze = zzanz.zze(t7, j8);
                if (objZze instanceof String) {
                    return !((String) objZze).isEmpty();
                }
                if (objZze instanceof zzajv) {
                    return !zzajv.zza.equals(objZze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzanz.zze(t7, j8) != null;
            case 10:
                return !zzajv.zza.equals(zzanz.zze(t7, j8));
            case 11:
                return zzanz.zzc(t7, j8) != 0;
            case 12:
                return zzanz.zzc(t7, j8) != 0;
            case 13:
                return zzanz.zzc(t7, j8) != 0;
            case 14:
                return zzanz.zzd(t7, j8) != 0;
            case 15:
                return zzanz.zzc(t7, j8) != 0;
            case 16:
                return zzanz.zzd(t7, j8) != 0;
            case 17:
                return zzanz.zze(t7, j8) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:201:0x04d7 A[PHI: r0 r1
      0x04d7: PHI (r0v2 com.google.android.gms.internal.firebase-auth-api.zzamq<T>) = 
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v24 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v30 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
      (r0v1 com.google.android.gms.internal.firebase-auth-api.zzamq<T>)
     binds: [B:18:0x0053, B:199:0x04cd, B:169:0x0431, B:155:0x03e8, B:147:0x03c1, B:141:0x039a, B:121:0x02b9, B:118:0x02a3, B:115:0x028d, B:112:0x0277, B:109:0x0261, B:106:0x024b, B:103:0x0235, B:100:0x021f, B:97:0x020a, B:94:0x01f5, B:91:0x01e0, B:88:0x01cb, B:85:0x01b6, B:81:0x019c, B:76:0x0168, B:73:0x015c, B:70:0x014c, B:67:0x013c, B:64:0x012c, B:61:0x0120, B:58:0x0114, B:55:0x0108, B:49:0x00ea, B:46:0x00d7, B:43:0x00c6, B:40:0x00b7, B:37:0x00a8, B:34:0x009d, B:31:0x0092, B:28:0x0083, B:25:0x0074, B:21:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x04d7: PHI (r1v6 T) = 
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v7 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
     binds: [B:18:0x0053, B:199:0x04cd, B:169:0x0431, B:155:0x03e8, B:147:0x03c1, B:141:0x039a, B:121:0x02b9, B:118:0x02a3, B:115:0x028d, B:112:0x0277, B:109:0x0261, B:106:0x024b, B:103:0x0235, B:100:0x021f, B:97:0x020a, B:94:0x01f5, B:91:0x01e0, B:88:0x01cb, B:85:0x01b6, B:81:0x019c, B:76:0x0168, B:73:0x015c, B:70:0x014c, B:67:0x013c, B:64:0x012c, B:61:0x0120, B:58:0x0114, B:55:0x0108, B:49:0x00ea, B:46:0x00d7, B:43:0x00c6, B:40:0x00b7, B:37:0x00a8, B:34:0x009d, B:31:0x0092, B:28:0x0083, B:25:0x0074, B:21:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanb
    public final int zza(T t7) {
        int i7;
        int iZza;
        int iZza2;
        int iZzb;
        int iZzd;
        int iZzh;
        int iZzi;
        zzamq<T> zzamqVar = this;
        T t8 = t7;
        Unsafe unsafe = zzb;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        while (i9 < zzamqVar.zzc.length) {
            int iZzc = zzamqVar.zzc(i9);
            int i13 = (267386880 & iZzc) >>> 20;
            int[] iArr = zzamqVar.zzc;
            int i14 = iArr[i9];
            int i15 = iArr[i9 + 2];
            int i16 = i15 & i8;
            if (i13 <= 17) {
                if (i16 != i12) {
                    i10 = i16 == i8 ? 0 : unsafe.getInt(t8, i16);
                    i12 = i16;
                }
                i7 = 1 << (i15 >>> 20);
            } else {
                i7 = 0;
            }
            long j7 = iZzc & i8;
            if (i13 >= zzalc.zza.zza()) {
                zzalc.zzb.zza();
            }
            int i17 = i11;
            switch (i13) {
                case 0:
                    if (zzamqVar.zza(t8, i9, i12, i10, i7)) {
                        iZza = zzakn.zza(i14, 0.0d);
                        i11 = i17 + iZza;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 1:
                    if (zzamqVar.zza(t8, i9, i12, i10, i7)) {
                        iZza2 = zzakn.zza(i14, 0.0f);
                        i11 = i17 + iZza2;
                        zzamqVar = this;
                        t8 = t7;
                    }
                    zzamqVar = this;
                    t8 = t7;
                    i11 = i17;
                    break;
                case 2:
                    if (zzamqVar.zza(t8, i9, i12, i10, i7)) {
                        iZzb = zzakn.zzb(i14, unsafe.getLong(t8, j7));
                        i11 = i17 + iZzb;
                        zzamqVar = this;
                    }
                    zzamqVar = this;
                    i11 = i17;
                    break;
                case 3:
                    if (zzamqVar.zza(t8, i9, i12, i10, i7)) {
                        iZzb = zzakn.zze(i14, unsafe.getLong(t8, j7));
                        i11 = i17 + iZzb;
                        zzamqVar = this;
                    }
                    zzamqVar = this;
                    i11 = i17;
                    break;
                case 4:
                    if (zzamqVar.zza(t8, i9, i12, i10, i7)) {
                        iZzb = zzakn.zzc(i14, unsafe.getInt(t8, j7));
                        i11 = i17 + iZzb;
                        zzamqVar = this;
                    }
                    zzamqVar = this;
                    i11 = i17;
                    break;
                case 5:
                    if (zzamqVar.zza(t8, i9, i12, i10, i7)) {
                        iZza2 = zzakn.zza(i14, 0L);
                        i11 = i17 + iZza2;
                        zzamqVar = this;
                        t8 = t7;
                    }
                    zzamqVar = this;
                    t8 = t7;
                    i11 = i17;
                    break;
                case 6:
                    if (zzamqVar.zza(t8, i9, i12, i10, i7)) {
                        iZza2 = zzakn.zzb(i14, 0);
                        i11 = i17 + iZza2;
                        zzamqVar = this;
                        t8 = t7;
                    }
                    zzamqVar = this;
                    t8 = t7;
                    i11 = i17;
                    break;
                case 7:
                    if (zzamqVar.zza(t8, i9, i12, i10, i7)) {
                        iZza2 = zzakn.zza(i14, true);
                        i11 = i17 + iZza2;
                        zzamqVar = this;
                        t8 = t7;
                    }
                    zzamqVar = this;
                    t8 = t7;
                    i11 = i17;
                    break;
                case 8:
                    if (zzamqVar.zza(t8, i9, i12, i10, i7)) {
                        Object object = unsafe.getObject(t8, j7);
                        if (object instanceof zzajv) {
                            iZzb = zzakn.zza(i14, (zzajv) object);
                        } else {
                            iZzb = zzakn.zza(i14, (String) object);
                        }
                        i11 = i17 + iZzb;
                        zzamqVar = this;
                    }
                    zzamqVar = this;
                    i11 = i17;
                    break;
                case 9:
                    if (zzamqVar.zza(t8, i9, i12, i10, i7)) {
                        iZza = zzand.zza(i14, unsafe.getObject(t8, j7), (zzanb<?>) zzamqVar.zze(i9));
                        i11 = i17 + iZza;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 10:
                    if (zzamqVar.zza(t8, i9, i12, i10, i7)) {
                        iZzb = zzakn.zza(i14, (zzajv) unsafe.getObject(t8, j7));
                        i11 = i17 + iZzb;
                        zzamqVar = this;
                    }
                    zzamqVar = this;
                    i11 = i17;
                    break;
                case 11:
                    if (zzamqVar.zza(t8, i9, i12, i10, i7)) {
                        iZzb = zzakn.zzf(i14, unsafe.getInt(t8, j7));
                        i11 = i17 + iZzb;
                        zzamqVar = this;
                    }
                    zzamqVar = this;
                    i11 = i17;
                    break;
                case 12:
                    if (zzamqVar.zza(t8, i9, i12, i10, i7)) {
                        iZzb = zzakn.zza(i14, unsafe.getInt(t8, j7));
                        i11 = i17 + iZzb;
                        zzamqVar = this;
                    }
                    zzamqVar = this;
                    i11 = i17;
                    break;
                case 13:
                    if (zzamqVar.zza(t8, i9, i12, i10, i7)) {
                        iZza2 = zzakn.zzd(i14, 0);
                        i11 = i17 + iZza2;
                        zzamqVar = this;
                        t8 = t7;
                    }
                    zzamqVar = this;
                    t8 = t7;
                    i11 = i17;
                    break;
                case 14:
                    if (zzamqVar.zza(t8, i9, i12, i10, i7)) {
                        iZza2 = zzakn.zzc(i14, 0L);
                        i11 = i17 + iZza2;
                        zzamqVar = this;
                        t8 = t7;
                    }
                    zzamqVar = this;
                    t8 = t7;
                    i11 = i17;
                    break;
                case 15:
                    if (zzamqVar.zza(t8, i9, i12, i10, i7)) {
                        iZzb = zzakn.zze(i14, unsafe.getInt(t8, j7));
                        i11 = i17 + iZzb;
                        zzamqVar = this;
                    }
                    zzamqVar = this;
                    i11 = i17;
                    break;
                case 16:
                    if (zzamqVar.zza(t8, i9, i12, i10, i7)) {
                        iZzb = zzakn.zzd(i14, unsafe.getLong(t8, j7));
                        i11 = i17 + iZzb;
                        zzamqVar = this;
                    }
                    zzamqVar = this;
                    i11 = i17;
                    break;
                case 17:
                    if (zzamqVar.zza(t8, i9, i12, i10, i7)) {
                        iZza = zzand.zza(i14, (zzamm) unsafe.getObject(t8, j7), zzamqVar.zze(i9));
                        i11 = i17 + iZza;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 18:
                    iZza = zzand.zzd(i14, (List) unsafe.getObject(t8, j7), false);
                    i11 = i17 + iZza;
                    break;
                case 19:
                    iZza = zzand.zzc(i14, (List) unsafe.getObject(t8, j7), false);
                    i11 = i17 + iZza;
                    break;
                case 20:
                    iZza = zzand.zzf(i14, (List) unsafe.getObject(t8, j7), false);
                    i11 = i17 + iZza;
                    break;
                case zzbbn.zzt.zzm /* 21 */:
                    iZza = zzand.zzj(i14, (List) unsafe.getObject(t8, j7), false);
                    i11 = i17 + iZza;
                    break;
                case 22:
                    iZza = zzand.zze(i14, (List) unsafe.getObject(t8, j7), false);
                    i11 = i17 + iZza;
                    break;
                case 23:
                    iZza = zzand.zzd(i14, (List) unsafe.getObject(t8, j7), false);
                    i11 = i17 + iZza;
                    break;
                case 24:
                    iZza = zzand.zzc(i14, (List) unsafe.getObject(t8, j7), false);
                    i11 = i17 + iZza;
                    break;
                case 25:
                    iZza = zzand.zza(i14, (List<?>) unsafe.getObject(t8, j7), false);
                    i11 = i17 + iZza;
                    break;
                case 26:
                    iZza = zzand.zzb(i14, (List) unsafe.getObject(t8, j7));
                    i11 = i17 + iZza;
                    break;
                case 27:
                    iZza = zzand.zzb(i14, (List<?>) unsafe.getObject(t8, j7), (zzanb<?>) zzamqVar.zze(i9));
                    i11 = i17 + iZza;
                    break;
                case 28:
                    iZza = zzand.zza(i14, (List<zzajv>) unsafe.getObject(t8, j7));
                    i11 = i17 + iZza;
                    break;
                case 29:
                    iZza = zzand.zzi(i14, (List) unsafe.getObject(t8, j7), false);
                    i11 = i17 + iZza;
                    break;
                case 30:
                    iZza = zzand.zzb(i14, (List<Integer>) unsafe.getObject(t8, j7), false);
                    i11 = i17 + iZza;
                    break;
                case 31:
                    iZza = zzand.zzc(i14, (List) unsafe.getObject(t8, j7), false);
                    i11 = i17 + iZza;
                    break;
                case 32:
                    iZza = zzand.zzd(i14, (List) unsafe.getObject(t8, j7), false);
                    i11 = i17 + iZza;
                    break;
                case 33:
                    iZza = zzand.zzg(i14, (List) unsafe.getObject(t8, j7), false);
                    i11 = i17 + iZza;
                    break;
                case 34:
                    iZza = zzand.zzh(i14, (List) unsafe.getObject(t8, j7), false);
                    i11 = i17 + iZza;
                    break;
                case 35:
                    iZzd = zzand.zzd((List) unsafe.getObject(t8, j7));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i14);
                        iZzi = zzakn.zzi(iZzd);
                        i11 = i17 + iZzh + iZzi + iZzd;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 36:
                    iZzd = zzand.zzc((List) unsafe.getObject(t8, j7));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i14);
                        iZzi = zzakn.zzi(iZzd);
                        i11 = i17 + iZzh + iZzi + iZzd;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 37:
                    iZzd = zzand.zzf((List) unsafe.getObject(t8, j7));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i14);
                        iZzi = zzakn.zzi(iZzd);
                        i11 = i17 + iZzh + iZzi + iZzd;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 38:
                    iZzd = zzand.zzj((List) unsafe.getObject(t8, j7));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i14);
                        iZzi = zzakn.zzi(iZzd);
                        i11 = i17 + iZzh + iZzi + iZzd;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 39:
                    iZzd = zzand.zze((List) unsafe.getObject(t8, j7));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i14);
                        iZzi = zzakn.zzi(iZzd);
                        i11 = i17 + iZzh + iZzi + iZzd;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 40:
                    iZzd = zzand.zzd((List) unsafe.getObject(t8, j7));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i14);
                        iZzi = zzakn.zzi(iZzd);
                        i11 = i17 + iZzh + iZzi + iZzd;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 41:
                    iZzd = zzand.zzc((List) unsafe.getObject(t8, j7));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i14);
                        iZzi = zzakn.zzi(iZzd);
                        i11 = i17 + iZzh + iZzi + iZzd;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 42:
                    iZzd = zzand.zza((List<?>) unsafe.getObject(t8, j7));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i14);
                        iZzi = zzakn.zzi(iZzd);
                        i11 = i17 + iZzh + iZzi + iZzd;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 43:
                    iZzd = zzand.zzi((List) unsafe.getObject(t8, j7));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i14);
                        iZzi = zzakn.zzi(iZzd);
                        i11 = i17 + iZzh + iZzi + iZzd;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 44:
                    iZzd = zzand.zzb((List) unsafe.getObject(t8, j7));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i14);
                        iZzi = zzakn.zzi(iZzd);
                        i11 = i17 + iZzh + iZzi + iZzd;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 45:
                    iZzd = zzand.zzc((List) unsafe.getObject(t8, j7));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i14);
                        iZzi = zzakn.zzi(iZzd);
                        i11 = i17 + iZzh + iZzi + iZzd;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 46:
                    iZzd = zzand.zzd((List) unsafe.getObject(t8, j7));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i14);
                        iZzi = zzakn.zzi(iZzd);
                        i11 = i17 + iZzh + iZzi + iZzd;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 47:
                    iZzd = zzand.zzg((List) unsafe.getObject(t8, j7));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i14);
                        iZzi = zzakn.zzi(iZzd);
                        i11 = i17 + iZzh + iZzi + iZzd;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 48:
                    iZzd = zzand.zzh((List) unsafe.getObject(t8, j7));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i14);
                        iZzi = zzakn.zzi(iZzd);
                        i11 = i17 + iZzh + iZzi + iZzd;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 49:
                    iZza = zzand.zza(i14, (List<zzamm>) unsafe.getObject(t8, j7), (zzanb<?>) zzamqVar.zze(i9));
                    i11 = i17 + iZza;
                    break;
                case 50:
                    iZza = zzamqVar.zzr.zza(i14, unsafe.getObject(t8, j7), zzamqVar.zzf(i9));
                    i11 = i17 + iZza;
                    break;
                case 51:
                    if (zzamqVar.zzc(t8, i14, i9)) {
                        iZza = zzakn.zza(i14, 0.0d);
                        i11 = i17 + iZza;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 52:
                    if (zzamqVar.zzc(t8, i14, i9)) {
                        iZza = zzakn.zza(i14, 0.0f);
                        i11 = i17 + iZza;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 53:
                    if (zzamqVar.zzc(t8, i14, i9)) {
                        iZza = zzakn.zzb(i14, zzd(t8, j7));
                        i11 = i17 + iZza;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 54:
                    if (zzamqVar.zzc(t8, i14, i9)) {
                        iZza = zzakn.zze(i14, zzd(t8, j7));
                        i11 = i17 + iZza;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 55:
                    if (zzamqVar.zzc(t8, i14, i9)) {
                        iZza = zzakn.zzc(i14, zzc(t8, j7));
                        i11 = i17 + iZza;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 56:
                    if (zzamqVar.zzc(t8, i14, i9)) {
                        iZza = zzakn.zza(i14, 0L);
                        i11 = i17 + iZza;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 57:
                    if (zzamqVar.zzc(t8, i14, i9)) {
                        iZza = zzakn.zzb(i14, 0);
                        i11 = i17 + iZza;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 58:
                    if (zzamqVar.zzc(t8, i14, i9)) {
                        iZza = zzakn.zza(i14, true);
                        i11 = i17 + iZza;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 59:
                    if (zzamqVar.zzc(t8, i14, i9)) {
                        Object object2 = unsafe.getObject(t8, j7);
                        if (object2 instanceof zzajv) {
                            iZza = zzakn.zza(i14, (zzajv) object2);
                        } else {
                            iZza = zzakn.zza(i14, (String) object2);
                        }
                        i11 = i17 + iZza;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 60:
                    if (zzamqVar.zzc(t8, i14, i9)) {
                        iZza = zzand.zza(i14, unsafe.getObject(t8, j7), (zzanb<?>) zzamqVar.zze(i9));
                        i11 = i17 + iZza;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 61:
                    if (zzamqVar.zzc(t8, i14, i9)) {
                        iZza = zzakn.zza(i14, (zzajv) unsafe.getObject(t8, j7));
                        i11 = i17 + iZza;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 62:
                    if (zzamqVar.zzc(t8, i14, i9)) {
                        iZza = zzakn.zzf(i14, zzc(t8, j7));
                        i11 = i17 + iZza;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 63:
                    if (zzamqVar.zzc(t8, i14, i9)) {
                        iZza = zzakn.zza(i14, zzc(t8, j7));
                        i11 = i17 + iZza;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 64:
                    if (zzamqVar.zzc(t8, i14, i9)) {
                        iZza = zzakn.zzd(i14, 0);
                        i11 = i17 + iZza;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 65:
                    if (zzamqVar.zzc(t8, i14, i9)) {
                        iZza = zzakn.zzc(i14, 0L);
                        i11 = i17 + iZza;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 66:
                    if (zzamqVar.zzc(t8, i14, i9)) {
                        iZza = zzakn.zze(i14, zzc(t8, j7));
                        i11 = i17 + iZza;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 67:
                    if (zzamqVar.zzc(t8, i14, i9)) {
                        iZza = zzakn.zzd(i14, zzd(t8, j7));
                        i11 = i17 + iZza;
                    } else {
                        i11 = i17;
                    }
                    break;
                case 68:
                    if (zzamqVar.zzc(t8, i14, i9)) {
                        iZza = zzand.zza(i14, (zzamm) unsafe.getObject(t8, j7), zzamqVar.zze(i9));
                        i11 = i17 + iZza;
                    } else {
                        i11 = i17;
                    }
                    break;
                default:
                    i11 = i17;
                    break;
            }
            i9 += 3;
            i8 = 1048575;
        }
        zzanu<?, ?> zzanuVar = zzamqVar.zzp;
        int iZza3 = i11 + zzanuVar.zza(zzanuVar.zzd(t8));
        if (!zzamqVar.zzh) {
            return iZza3;
        }
        zzakx<T> zzakxVarZza = zzamqVar.zzq.zza(t8);
        int iZzb2 = zzakxVarZza.zza.zzb();
        int iZza4 = 0;
        for (int i18 = 0; i18 < iZzb2; i18++) {
            Map.Entry entryZza = zzakxVarZza.zza.zza(i18);
            iZza4 += zzakx.zza((zzakz<?>) entryZza.getKey(), entryZza.getValue());
        }
        for (Map.Entry entry : zzakxVarZza.zza.zzc()) {
            iZza4 += zzakx.zza((zzakz<?>) entry.getKey(), entry.getValue());
        }
        return iZza3 + iZza4;
    }

    private static <T> boolean zze(T t7, long j7) {
        return ((Boolean) zzanz.zze(t7, j7)).booleanValue();
    }

    private final boolean zzc(T t7, int i7, int i8) {
        return zzanz.zzc(t7, (long) (zzb(i8) & 1048575)) == i7;
    }

    private final int zzb(int i7) {
        return this.zzc[i7 + 2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t7, T t8, int i7) {
        int i8 = this.zzc[i7];
        if (zzc(t8, i8, i7)) {
            long jZzc = zzc(i7) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t8, jZzc);
            if (object != null) {
                zzanb zzanbVarZze = zze(i7);
                if (!zzc(t7, i8, i7)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t7, jZzc, object);
                    } else {
                        Object objZza = zzanbVarZze.zza();
                        zzanbVarZze.zza(objZza, object);
                        unsafe.putObject(t7, jZzc, objZza);
                    }
                    zzb(t7, i8, i7);
                    return;
                }
                Object object2 = unsafe.getObject(t7, jZzc);
                if (!zzg(object2)) {
                    Object objZza2 = zzanbVarZze.zza();
                    zzanbVarZze.zza(objZza2, object2);
                    unsafe.putObject(t7, jZzc, objZza2);
                    object2 = objZza2;
                }
                zzanbVarZze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + String.valueOf(t8));
        }
    }

    private final void zzb(T t7, int i7) {
        int iZzb = zzb(i7);
        long j7 = 1048575 & iZzb;
        if (j7 == 1048575) {
            return;
        }
        zzanz.zza((Object) t7, j7, (1 << (iZzb >>> 20)) | zzanz.zzc(t7, j7));
    }

    private final void zzb(T t7, int i7, int i8) {
        zzanz.zza((Object) t7, zzb(i8) & 1048575, i7);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanb
    public final boolean zzb(T t7, T t8) {
        int length = this.zzc.length;
        int i7 = 0;
        while (true) {
            boolean zZza = true;
            if (i7 < length) {
                int iZzc = zzc(i7);
                long j7 = iZzc & 1048575;
                switch ((iZzc & 267386880) >>> 20) {
                    case 0:
                        if (!zzc(t7, t8, i7) || Double.doubleToLongBits(zzanz.zza(t7, j7)) != Double.doubleToLongBits(zzanz.zza(t8, j7))) {
                            zZza = false;
                        }
                        break;
                    case 1:
                        if (!zzc(t7, t8, i7) || Float.floatToIntBits(zzanz.zzb(t7, j7)) != Float.floatToIntBits(zzanz.zzb(t8, j7))) {
                            zZza = false;
                        }
                        break;
                    case 2:
                        if (!zzc(t7, t8, i7) || zzanz.zzd(t7, j7) != zzanz.zzd(t8, j7)) {
                            zZza = false;
                        }
                        break;
                    case 3:
                        if (!zzc(t7, t8, i7) || zzanz.zzd(t7, j7) != zzanz.zzd(t8, j7)) {
                            zZza = false;
                        }
                        break;
                    case 4:
                        if (!zzc(t7, t8, i7) || zzanz.zzc(t7, j7) != zzanz.zzc(t8, j7)) {
                            zZza = false;
                        }
                        break;
                    case 5:
                        if (!zzc(t7, t8, i7) || zzanz.zzd(t7, j7) != zzanz.zzd(t8, j7)) {
                            zZza = false;
                        }
                        break;
                    case 6:
                        if (!zzc(t7, t8, i7) || zzanz.zzc(t7, j7) != zzanz.zzc(t8, j7)) {
                            zZza = false;
                        }
                        break;
                    case 7:
                        if (!zzc(t7, t8, i7) || zzanz.zzh(t7, j7) != zzanz.zzh(t8, j7)) {
                            zZza = false;
                        }
                        break;
                    case 8:
                        if (!zzc(t7, t8, i7) || !zzand.zza(zzanz.zze(t7, j7), zzanz.zze(t8, j7))) {
                            zZza = false;
                        }
                        break;
                    case 9:
                        if (!zzc(t7, t8, i7) || !zzand.zza(zzanz.zze(t7, j7), zzanz.zze(t8, j7))) {
                            zZza = false;
                        }
                        break;
                    case 10:
                        if (!zzc(t7, t8, i7) || !zzand.zza(zzanz.zze(t7, j7), zzanz.zze(t8, j7))) {
                            zZza = false;
                        }
                        break;
                    case 11:
                        if (!zzc(t7, t8, i7) || zzanz.zzc(t7, j7) != zzanz.zzc(t8, j7)) {
                            zZza = false;
                        }
                        break;
                    case 12:
                        if (!zzc(t7, t8, i7) || zzanz.zzc(t7, j7) != zzanz.zzc(t8, j7)) {
                            zZza = false;
                        }
                        break;
                    case 13:
                        if (!zzc(t7, t8, i7) || zzanz.zzc(t7, j7) != zzanz.zzc(t8, j7)) {
                            zZza = false;
                        }
                        break;
                    case 14:
                        if (!zzc(t7, t8, i7) || zzanz.zzd(t7, j7) != zzanz.zzd(t8, j7)) {
                            zZza = false;
                        }
                        break;
                    case 15:
                        if (!zzc(t7, t8, i7) || zzanz.zzc(t7, j7) != zzanz.zzc(t8, j7)) {
                            zZza = false;
                        }
                        break;
                    case 16:
                        if (!zzc(t7, t8, i7) || zzanz.zzd(t7, j7) != zzanz.zzd(t8, j7)) {
                            zZza = false;
                        }
                        break;
                    case 17:
                        if (!zzc(t7, t8, i7) || !zzand.zza(zzanz.zze(t7, j7), zzanz.zze(t8, j7))) {
                            zZza = false;
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
                        zZza = zzand.zza(zzanz.zze(t7, j7), zzanz.zze(t8, j7));
                        break;
                    case 50:
                        zZza = zzand.zza(zzanz.zze(t7, j7), zzanz.zze(t8, j7));
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
                        long jZzb = zzb(i7) & 1048575;
                        if (zzanz.zzc(t7, jZzb) != zzanz.zzc(t8, jZzb) || !zzand.zza(zzanz.zze(t7, j7), zzanz.zze(t8, j7))) {
                            zZza = false;
                        }
                        break;
                }
                if (!zZza) {
                    return false;
                }
                i7 += 3;
            } else {
                if (!this.zzp.zzd(t7).equals(this.zzp.zzd(t8))) {
                    return false;
                }
                if (this.zzh) {
                    return this.zzq.zza(t7).equals(this.zzq.zza(t8));
                }
                return true;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 36281. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int zza(T r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.p411firebaseauthapi.zzaju r35) {
        /*
            Method dump skipped, instruction units count: 3628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p411firebaseauthapi.zzamq.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.zzaju):int");
    }

    private final int zza(int i7) {
        if (i7 < this.zze || i7 > this.zzf) {
            return -1;
        }
        return zza(i7, 0);
    }

    private final int zza(int i7, int i8) {
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

    /* JADX WARN: Code duplicated, block: B:123:0x026a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0271  */
    /* JADX WARN: Code duplicated, block: B:128:0x0287  */
    /* JADX WARN: Code duplicated, block: B:129:0x028a  */
    static <T> zzamq<T> zza(Class<T> cls, zzamk zzamkVar, zzamu zzamuVar, zzalw zzalwVar, zzanu<?, ?> zzanuVar, zzakw<?> zzakwVar, zzamf zzamfVar) {
        int i7;
        int iCharAt;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr;
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
        zzamz zzamzVar;
        int i23;
        int[] iArr2;
        int i24;
        int iObjectFieldOffset;
        int i25;
        int i26;
        int iObjectFieldOffset2;
        int iObjectFieldOffset3;
        int i27;
        Field fieldZza;
        int i28;
        char cCharAt9;
        int i29;
        int i30;
        int i31;
        Object obj;
        Field fieldZza2;
        int i32;
        Object obj2;
        Field fieldZza3;
        int i33;
        char cCharAt10;
        int i34;
        char cCharAt11;
        int i35;
        char cCharAt12;
        int i36;
        char cCharAt13;
        if (zzamkVar instanceof zzamz) {
            zzamz zzamzVar2 = (zzamz) zzamkVar;
            String strZzd = zzamzVar2.zzd();
            int length = strZzd.length();
            char c7 = 55296;
            if (strZzd.charAt(0) >= 55296) {
                int i37 = 1;
                while (true) {
                    i7 = i37 + 1;
                    if (strZzd.charAt(i37) < 55296) {
                        break;
                    }
                    i37 = i7;
                }
            } else {
                i7 = 1;
            }
            int i38 = i7 + 1;
            int iCharAt2 = strZzd.charAt(i7);
            if (iCharAt2 >= 55296) {
                int i39 = iCharAt2 & 8191;
                int i40 = 13;
                while (true) {
                    i36 = i38 + 1;
                    cCharAt13 = strZzd.charAt(i38);
                    if (cCharAt13 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt13 & 8191) << i40;
                    i40 += 13;
                    i38 = i36;
                }
                iCharAt2 = i39 | (cCharAt13 << i40);
                i38 = i36;
            }
            if (iCharAt2 == 0) {
                i9 = 0;
                i11 = 0;
                iCharAt = 0;
                i8 = 0;
                i10 = 0;
                i13 = 0;
                iArr = zza;
                i12 = 0;
            } else {
                int i41 = i38 + 1;
                int iCharAt3 = strZzd.charAt(i38);
                if (iCharAt3 >= 55296) {
                    int i42 = iCharAt3 & 8191;
                    int i43 = 13;
                    while (true) {
                        i21 = i41 + 1;
                        cCharAt8 = strZzd.charAt(i41);
                        if (cCharAt8 < 55296) {
                            break;
                        }
                        i42 |= (cCharAt8 & 8191) << i43;
                        i43 += 13;
                        i41 = i21;
                    }
                    iCharAt3 = i42 | (cCharAt8 << i43);
                    i41 = i21;
                }
                int i44 = i41 + 1;
                int iCharAt4 = strZzd.charAt(i41);
                if (iCharAt4 >= 55296) {
                    int i45 = iCharAt4 & 8191;
                    int i46 = 13;
                    while (true) {
                        i20 = i44 + 1;
                        cCharAt7 = strZzd.charAt(i44);
                        if (cCharAt7 < 55296) {
                            break;
                        }
                        i45 |= (cCharAt7 & 8191) << i46;
                        i46 += 13;
                        i44 = i20;
                    }
                    iCharAt4 = i45 | (cCharAt7 << i46);
                    i44 = i20;
                }
                int i47 = i44 + 1;
                int iCharAt5 = strZzd.charAt(i44);
                if (iCharAt5 >= 55296) {
                    int i48 = iCharAt5 & 8191;
                    int i49 = 13;
                    while (true) {
                        i19 = i47 + 1;
                        cCharAt6 = strZzd.charAt(i47);
                        if (cCharAt6 < 55296) {
                            break;
                        }
                        i48 |= (cCharAt6 & 8191) << i49;
                        i49 += 13;
                        i47 = i19;
                    }
                    iCharAt5 = i48 | (cCharAt6 << i49);
                    i47 = i19;
                }
                int i50 = i47 + 1;
                int iCharAt6 = strZzd.charAt(i47);
                if (iCharAt6 >= 55296) {
                    int i51 = iCharAt6 & 8191;
                    int i52 = 13;
                    while (true) {
                        i18 = i50 + 1;
                        cCharAt5 = strZzd.charAt(i50);
                        if (cCharAt5 < 55296) {
                            break;
                        }
                        i51 |= (cCharAt5 & 8191) << i52;
                        i52 += 13;
                        i50 = i18;
                    }
                    iCharAt6 = i51 | (cCharAt5 << i52);
                    i50 = i18;
                }
                int i53 = i50 + 1;
                iCharAt = strZzd.charAt(i50);
                if (iCharAt >= 55296) {
                    int i54 = iCharAt & 8191;
                    int i55 = 13;
                    while (true) {
                        i17 = i53 + 1;
                        cCharAt4 = strZzd.charAt(i53);
                        if (cCharAt4 < 55296) {
                            break;
                        }
                        i54 |= (cCharAt4 & 8191) << i55;
                        i55 += 13;
                        i53 = i17;
                    }
                    iCharAt = i54 | (cCharAt4 << i55);
                    i53 = i17;
                }
                int i56 = i53 + 1;
                int iCharAt7 = strZzd.charAt(i53);
                if (iCharAt7 >= 55296) {
                    int i57 = iCharAt7 & 8191;
                    int i58 = 13;
                    while (true) {
                        i16 = i56 + 1;
                        cCharAt3 = strZzd.charAt(i56);
                        if (cCharAt3 < 55296) {
                            break;
                        }
                        i57 |= (cCharAt3 & 8191) << i58;
                        i58 += 13;
                        i56 = i16;
                    }
                    iCharAt7 = i57 | (cCharAt3 << i58);
                    i56 = i16;
                }
                int i59 = i56 + 1;
                int iCharAt8 = strZzd.charAt(i56);
                if (iCharAt8 >= 55296) {
                    int i60 = iCharAt8 & 8191;
                    int i61 = 13;
                    while (true) {
                        i15 = i59 + 1;
                        cCharAt2 = strZzd.charAt(i59);
                        if (cCharAt2 < 55296) {
                            break;
                        }
                        i60 |= (cCharAt2 & 8191) << i61;
                        i61 += 13;
                        i59 = i15;
                    }
                    iCharAt8 = i60 | (cCharAt2 << i61);
                    i59 = i15;
                }
                int i62 = i59 + 1;
                int iCharAt9 = strZzd.charAt(i59);
                if (iCharAt9 >= 55296) {
                    int i63 = iCharAt9 & 8191;
                    int i64 = 13;
                    while (true) {
                        i14 = i62 + 1;
                        cCharAt = strZzd.charAt(i62);
                        if (cCharAt < 55296) {
                            break;
                        }
                        i63 |= (cCharAt & 8191) << i64;
                        i64 += 13;
                        i62 = i14;
                    }
                    iCharAt9 = i63 | (cCharAt << i64);
                    i62 = i14;
                }
                int[] iArr3 = new int[iCharAt9 + iCharAt7 + iCharAt8];
                int i65 = (iCharAt3 << 1) + iCharAt4;
                int i66 = iCharAt7;
                i8 = iCharAt5;
                i9 = i66;
                i10 = iCharAt6;
                i11 = i65;
                iArr = iArr3;
                i12 = iCharAt3;
                i13 = iCharAt9;
                i38 = i62;
            }
            Unsafe unsafe = zzb;
            Object[] objArrZze = zzamzVar2.zze();
            Class<?> cls2 = zzamzVar2.zza().getClass();
            int[] iArr4 = new int[iCharAt * 3];
            Object[] objArr = new Object[iCharAt << 1];
            int i67 = i13 + i9;
            int i68 = i13;
            int i69 = i67;
            int i70 = 0;
            int i71 = 0;
            while (i38 < length) {
                int i72 = i38 + 1;
                int iCharAt10 = strZzd.charAt(i38);
                if (iCharAt10 >= c7) {
                    int i73 = iCharAt10 & 8191;
                    int i74 = i72;
                    int i75 = 13;
                    while (true) {
                        i35 = i74 + 1;
                        cCharAt12 = strZzd.charAt(i74);
                        if (cCharAt12 < c7) {
                            break;
                        }
                        i73 |= (cCharAt12 & 8191) << i75;
                        i75 += 13;
                        i74 = i35;
                    }
                    iCharAt10 = i73 | (cCharAt12 << i75);
                    i22 = i35;
                } else {
                    i22 = i72;
                }
                int i76 = i22 + 1;
                int iCharAt11 = strZzd.charAt(i22);
                if (iCharAt11 >= c7) {
                    int i77 = iCharAt11 & 8191;
                    int i78 = i76;
                    int i79 = 13;
                    while (true) {
                        i34 = i78 + 1;
                        cCharAt11 = strZzd.charAt(i78);
                        zzamzVar = zzamzVar2;
                        if (cCharAt11 < 55296) {
                            break;
                        }
                        i77 |= (cCharAt11 & 8191) << i79;
                        i79 += 13;
                        i78 = i34;
                        zzamzVar2 = zzamzVar;
                    }
                    iCharAt11 = i77 | (cCharAt11 << i79);
                    i23 = i34;
                } else {
                    zzamzVar = zzamzVar2;
                    i23 = i76;
                }
                int i80 = iCharAt11 & 255;
                int i81 = length;
                if ((iCharAt11 & 1024) != 0) {
                    iArr[i71] = i70;
                    i71++;
                }
                int i82 = iCharAt10;
                if (i80 >= 51) {
                    i26 = i23 + 1;
                    int iCharAt12 = strZzd.charAt(i23);
                    char c8 = 55296;
                    if (iCharAt12 >= 55296) {
                        int i83 = iCharAt12 & 8191;
                        int i84 = 13;
                        while (true) {
                            i33 = i26 + 1;
                            cCharAt10 = strZzd.charAt(i26);
                            if (cCharAt10 < c8) {
                                break;
                            }
                            i83 |= (cCharAt10 & 8191) << i84;
                            i84 += 13;
                            i26 = i33;
                            c8 = 55296;
                        }
                        iCharAt12 = i83 | (cCharAt10 << i84);
                        i26 = i33;
                    }
                    int i85 = i80 - 51;
                    int i86 = iCharAt12;
                    if (i85 != 9 && i85 != 17) {
                        if (i85 == 12 && (zzamzVar.zzb().equals(zzamy.PROTO2) || (iCharAt11 & 2048) != 0)) {
                            i30 = i11 + 1;
                            objArr[((i70 / 3) << 1) + 1] = objArrZze[i11];
                        }
                        i31 = i86 << 1;
                        obj = objArrZze[i31];
                        if (obj instanceof Field) {
                            fieldZza2 = (Field) obj;
                        } else {
                            fieldZza2 = zza(cls2, (String) obj);
                            objArrZze[i31] = fieldZza2;
                        }
                        iArr2 = iArr4;
                        i24 = i12;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza2);
                        i32 = i31 + 1;
                        obj2 = objArrZze[i32];
                        if (obj2 instanceof Field) {
                            fieldZza3 = (Field) obj2;
                        } else {
                            fieldZza3 = zza(cls2, (String) obj2);
                            objArrZze[i32] = fieldZza3;
                        }
                        iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZza3);
                        i27 = i11;
                        strZzd = strZzd;
                        i25 = 0;
                    } else {
                        i30 = i11 + 1;
                        objArr[((i70 / 3) << 1) + 1] = objArrZze[i11];
                    }
                    i11 = i30;
                    i31 = i86 << 1;
                    obj = objArrZze[i31];
                    if (obj instanceof Field) {
                        fieldZza2 = (Field) obj;
                    } else {
                        fieldZza2 = zza(cls2, (String) obj);
                        objArrZze[i31] = fieldZza2;
                    }
                    iArr2 = iArr4;
                    i24 = i12;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza2);
                    i32 = i31 + 1;
                    obj2 = objArrZze[i32];
                    if (obj2 instanceof Field) {
                        fieldZza3 = (Field) obj2;
                    } else {
                        fieldZza3 = zza(cls2, (String) obj2);
                        objArrZze[i32] = fieldZza3;
                    }
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZza3);
                    i27 = i11;
                    strZzd = strZzd;
                    i25 = 0;
                } else {
                    iArr2 = iArr4;
                    i24 = i12;
                    int i87 = i11 + 1;
                    Field fieldZza4 = zza(cls2, (String) objArrZze[i11]);
                    if (i80 == 9 || i80 == 17) {
                        objArr[((i70 / 3) << 1) + 1] = fieldZza4.getType();
                    } else {
                        if (i80 == 27 || i80 == 49) {
                            i29 = i11 + 2;
                            objArr[((i70 / 3) << 1) + 1] = objArrZze[i87];
                        } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                            if (zzamzVar.zzb() == zzamy.PROTO2 || (iCharAt11 & 2048) != 0) {
                                i29 = i11 + 2;
                                objArr[((i70 / 3) << 1) + 1] = objArrZze[i87];
                            }
                        } else if (i80 == 50) {
                            int i88 = i68 + 1;
                            iArr[i68] = i70;
                            int i89 = (i70 / 3) << 1;
                            int i90 = i11 + 2;
                            objArr[i89] = objArrZze[i87];
                            if ((iCharAt11 & 2048) != 0) {
                                i87 = i11 + 3;
                                objArr[i89 + 1] = objArrZze[i90];
                                i68 = i88;
                            } else {
                                i68 = i88;
                                i87 = i90;
                            }
                        }
                        i87 = i29;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZza4);
                    if ((iCharAt11 & 4096) == 0 || i80 > 17) {
                        iObjectFieldOffset = 1048575;
                        i25 = 0;
                    } else {
                        int i91 = i23 + 1;
                        int iCharAt13 = strZzd.charAt(i23);
                        if (iCharAt13 >= 55296) {
                            int i92 = iCharAt13 & 8191;
                            int i93 = 13;
                            while (true) {
                                i28 = i91 + 1;
                                cCharAt9 = strZzd.charAt(i91);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i92 |= (cCharAt9 & 8191) << i93;
                                i93 += 13;
                                i91 = i28;
                            }
                            iCharAt13 = i92 | (cCharAt9 << i93);
                            i91 = i28;
                        }
                        int i94 = (i24 << 1) + (iCharAt13 / 32);
                        Object obj3 = objArrZze[i94];
                        int i95 = iCharAt13;
                        if (obj3 instanceof Field) {
                            fieldZza = (Field) obj3;
                        } else {
                            fieldZza = zza(cls2, (String) obj3);
                            objArrZze[i94] = fieldZza;
                        }
                        i25 = i95 % 32;
                        int i96 = i91;
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZza);
                        i23 = i96;
                    }
                    if (i80 < 18 || i80 > 49) {
                        int i97 = i87;
                        i26 = i23;
                        iObjectFieldOffset2 = iObjectFieldOffset4;
                        iObjectFieldOffset3 = iObjectFieldOffset;
                        i27 = i97;
                    } else {
                        int i98 = i69 + 1;
                        iArr[i69] = iObjectFieldOffset4;
                        int i99 = i87;
                        i26 = i23;
                        iObjectFieldOffset2 = iObjectFieldOffset4;
                        iObjectFieldOffset3 = iObjectFieldOffset;
                        i27 = i99;
                        i69 = i98;
                    }
                }
                int i100 = i70 + 1;
                iArr2[i70] = i82;
                int i101 = i70 + 2;
                iArr2[i100] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i80 << 20) | iObjectFieldOffset2;
                i70 += 3;
                iArr2[i101] = (i25 << 20) | iObjectFieldOffset3;
                i38 = i26;
                strZzd = strZzd;
                length = i81;
                zzamzVar2 = zzamzVar;
                i12 = i24;
                c7 = 55296;
                i11 = i27;
                iArr4 = iArr2;
            }
            return new zzamq<>(iArr4, objArr, i8, i10, zzamzVar2.zza(), false, iArr, i13, i67, zzamuVar, zzalwVar, zzanuVar, zzakwVar, zzamfVar);
        }
        throw new NoSuchMethodError();
    }

    private final <UT, UB> UB zza(Object obj, int i7, UB ub, zzanu<UT, UB> zzanuVar, Object obj2) {
        zzalj zzaljVarZzd;
        int i8 = this.zzc[i7];
        Object objZze = zzanz.zze(obj, zzc(i7) & 1048575);
        return (objZze == null || (zzaljVarZzd = zzd(i7)) == null) ? ub : (UB) zza(i7, i8, this.zzr.zze(objZze), zzaljVarZzd, ub, zzanuVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i7, int i8, Map<K, V> map, zzalj zzaljVar, UB ub, zzanu<UT, UB> zzanuVar, Object obj) {
        zzamd<?, ?> zzamdVarZza = this.zzr.zza(zzf(i7));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzaljVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzanuVar.zzc(obj);
                }
                zzake zzakeVarZzc = zzajv.zzc(zzame.zza(zzamdVarZza, next.getKey(), next.getValue()));
                try {
                    zzame.zza(zzakeVarZzc.zzb(), zzamdVarZza, next.getKey(), next.getValue());
                    zzanuVar.zza(ub, i8, zzakeVarZzc.zza());
                    it.remove();
                } catch (IOException e7) {
                    throw new RuntimeException(e7);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t7, int i7) {
        zzanb zzanbVarZze = zze(i7);
        long jZzc = zzc(i7) & 1048575;
        if (!zzc((Object) t7, i7)) {
            return zzanbVarZze.zza();
        }
        Object object = zzb.getObject(t7, jZzc);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzanbVarZze.zza();
        if (object != null) {
            zzanbVarZze.zza(objZza, object);
        }
        return objZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t7, int i7, int i8) {
        zzanb zzanbVarZze = zze(i8);
        if (!zzc(t7, i7, i8)) {
            return zzanbVarZze.zza();
        }
        Object object = zzb.getObject(t7, zzc(i8) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzanbVarZze.zza();
        if (object != null) {
            zzanbVarZze.zza(objZza, object);
        }
        return objZza;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanb
    public final T zza() {
        return (T) this.zzn.zza(this.zzg);
    }

    private static Field zza(Class<?> cls, String str) {
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

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanb
    public final void zza(T t7, T t8) {
        zzf(t7);
        t8.getClass();
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int iZzc = zzc(i7);
            long j7 = 1048575 & iZzc;
            int i8 = this.zzc[i7];
            switch ((iZzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((Object) t8, i7)) {
                        zzanz.zza(t7, j7, zzanz.zza(t8, j7));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 1:
                    if (zzc((Object) t8, i7)) {
                        zzanz.zza((Object) t7, j7, zzanz.zzb(t8, j7));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 2:
                    if (zzc((Object) t8, i7)) {
                        zzanz.zza((Object) t7, j7, zzanz.zzd(t8, j7));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 3:
                    if (zzc((Object) t8, i7)) {
                        zzanz.zza((Object) t7, j7, zzanz.zzd(t8, j7));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 4:
                    if (zzc((Object) t8, i7)) {
                        zzanz.zza((Object) t7, j7, zzanz.zzc(t8, j7));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 5:
                    if (zzc((Object) t8, i7)) {
                        zzanz.zza((Object) t7, j7, zzanz.zzd(t8, j7));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 6:
                    if (zzc((Object) t8, i7)) {
                        zzanz.zza((Object) t7, j7, zzanz.zzc(t8, j7));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 7:
                    if (zzc((Object) t8, i7)) {
                        zzanz.zzc(t7, j7, zzanz.zzh(t8, j7));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 8:
                    if (zzc((Object) t8, i7)) {
                        zzanz.zza(t7, j7, zzanz.zze(t8, j7));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 9:
                    zza(t7, t8, i7);
                    break;
                case 10:
                    if (zzc((Object) t8, i7)) {
                        zzanz.zza(t7, j7, zzanz.zze(t8, j7));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 11:
                    if (zzc((Object) t8, i7)) {
                        zzanz.zza((Object) t7, j7, zzanz.zzc(t8, j7));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 12:
                    if (zzc((Object) t8, i7)) {
                        zzanz.zza((Object) t7, j7, zzanz.zzc(t8, j7));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 13:
                    if (zzc((Object) t8, i7)) {
                        zzanz.zza((Object) t7, j7, zzanz.zzc(t8, j7));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 14:
                    if (zzc((Object) t8, i7)) {
                        zzanz.zza((Object) t7, j7, zzanz.zzd(t8, j7));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 15:
                    if (zzc((Object) t8, i7)) {
                        zzanz.zza((Object) t7, j7, zzanz.zzc(t8, j7));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 16:
                    if (zzc((Object) t8, i7)) {
                        zzanz.zza((Object) t7, j7, zzanz.zzd(t8, j7));
                        zzb((Object) t7, i7);
                    }
                    break;
                case 17:
                    zza(t7, t8, i7);
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
                    this.zzo.zza(t7, t8, j7);
                    break;
                case 50:
                    zzand.zza(this.zzr, t7, t8, j7);
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
                    if (zzc(t8, i8, i7)) {
                        zzanz.zza(t7, j7, zzanz.zze(t8, j7));
                        zzb(t7, i8, i7);
                    }
                    break;
                case 60:
                    zzb(t7, t8, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzc(t8, i8, i7)) {
                        zzanz.zza(t7, j7, zzanz.zze(t8, j7));
                        zzb(t7, i8, i7);
                    }
                    break;
                case 68:
                    zzb(t7, t8, i7);
                    break;
            }
        }
        zzand.zza(this.zzp, t7, t8);
        if (this.zzh) {
            zzand.zza(this.zzq, t7, t8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:188:0x0775 A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:24:0x0058, B:186:0x0770, B:188:0x0775, B:189:0x077a, B:83:0x013a, B:84:0x014c, B:85:0x0164, B:86:0x017c, B:87:0x0194, B:88:0x01ac, B:90:0x01bc, B:93:0x01c3, B:94:0x01c9, B:95:0x01d7, B:96:0x01ef, B:97:0x0203, B:98:0x021b, B:99:0x0229, B:100:0x0241, B:101:0x0259, B:102:0x0271, B:103:0x0289, B:104:0x02a1, B:105:0x02b9, B:106:0x02d1, B:107:0x02e9, B:109:0x02ff, B:113:0x0320, B:110:0x0309, B:112:0x0311, B:114:0x0331, B:115:0x0349, B:116:0x035d, B:117:0x0371, B:118:0x0385, B:119:0x0399, B:128:0x03cc, B:129:0x03da, B:130:0x03ee, B:131:0x0402, B:132:0x0416, B:133:0x042a, B:134:0x043e, B:135:0x0452, B:136:0x0466, B:137:0x047a, B:138:0x048e, B:139:0x04a2, B:140:0x04b6, B:141:0x04ca, B:146:0x04f1, B:147:0x04ff, B:148:0x0513, B:149:0x052b, B:151:0x0537, B:152:0x0545, B:153:0x0553, B:154:0x0567, B:155:0x057b, B:156:0x058f, B:157:0x05a3, B:158:0x05b7, B:159:0x05cb, B:160:0x05df, B:161:0x05f3, B:162:0x060b, B:163:0x0620, B:164:0x0634, B:165:0x0648, B:166:0x065c, B:168:0x066b, B:171:0x0672, B:172:0x0678, B:173:0x0682, B:174:0x0696, B:175:0x06aa, B:176:0x06c2, B:177:0x06d0, B:178:0x06e4, B:179:0x06f8, B:180:0x070c, B:181:0x0720, B:182:0x0734, B:183:0x0748, B:184:0x075c), top: B:213:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x0788 A[LOOP:5: B:192:0x0784->B:194:0x0788, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:197:0x079c  */
    /* JADX WARN: Code duplicated, block: B:199:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:205:0x07ae A[LOOP:1: B:203:0x07aa->B:205:0x07ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:208:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:235:0x0781 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.google.android.gms.internal.firebase-auth-api.zzanc] */
    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanb
    public final void zza(T t7, zzanc zzancVar, zzaku zzakuVar) throws Throwable {
        T t8;
        int i7;
        Object objZza;
        T t9;
        zzakw<?> zzakwVar;
        zzaku zzakuVar2;
        zzanu zzanuVar;
        T t10;
        zzamq<T> zzamqVar;
        Object objZza2;
        T t11;
        zzanu zzanuVar2;
        zzanu zzanuVar3;
        int i8;
        Object objZza3;
        T t12;
        zzamq<T> zzamqVar2;
        zzamq<T> zzamqVar3 = this;
        zzaku zzakuVar3 = zzakuVar;
        zzakuVar3.getClass();
        zzf(t7);
        zzanu zzanuVar4 = zzamqVar3.zzp;
        zzakw<?> zzakwVar2 = zzamqVar3.zzq;
        Object objZza4 = null;
        zzakx zzakxVarZzb = null;
        while (true) {
            try {
                int iZzc = zzancVar.zzc();
                int iZza = zzamqVar3.zza(iZzc);
                if (iZza >= 0) {
                    zzakwVar = zzakwVar2;
                    zzakuVar2 = zzakuVar3;
                    zzanuVar = zzanuVar4;
                    t10 = t7;
                    try {
                        int iZzc2 = zzamqVar3.zzc(iZza);
                        switch ((267386880 & iZzc2) >>> 20) {
                            case 0:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza(t10, iZzc2 & 1048575, zzancVar.zza());
                                zzamqVar.zzb((Object) t10, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 1:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza((Object) t10, iZzc2 & 1048575, zzancVar.zzb());
                                zzamqVar.zzb((Object) t10, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 2:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza((Object) t10, iZzc2 & 1048575, zzancVar.zzl());
                                zzamqVar.zzb((Object) t10, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 3:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza((Object) t10, iZzc2 & 1048575, zzancVar.zzo());
                                zzamqVar.zzb((Object) t10, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 4:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza((Object) t10, iZzc2 & 1048575, zzancVar.zzg());
                                zzamqVar.zzb((Object) t10, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 5:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza((Object) t10, iZzc2 & 1048575, zzancVar.zzk());
                                zzamqVar.zzb((Object) t10, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 6:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza((Object) t10, iZzc2 & 1048575, zzancVar.zzf());
                                zzamqVar.zzb((Object) t10, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 7:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zzc(t10, iZzc2 & 1048575, zzancVar.zzs());
                                zzamqVar.zzb((Object) t10, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 8:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzamqVar.zza((Object) t10, iZzc2, (zzanc) zzancVar);
                                zzamqVar.zzb((Object) t10, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 9:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzamm zzammVar = (zzamm) zzamqVar.zza((Object) t10, iZza);
                                zzancVar.zzb(zzammVar, zzamqVar.zze(iZza), zzakuVar2);
                                zzamqVar.zza(t10, iZza, zzammVar);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 10:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza(t10, iZzc2 & 1048575, zzancVar.zzp());
                                zzamqVar.zzb((Object) t10, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 11:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza((Object) t10, iZzc2 & 1048575, zzancVar.zzj());
                                zzamqVar.zzb((Object) t10, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 12:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                int iZze = zzancVar.zze();
                                zzalj zzaljVarZzd = zzamqVar.zzd(iZza);
                                if (zzaljVarZzd != null && !zzaljVarZzd.zza(iZze)) {
                                    objZza4 = zzand.zza(t10, iZzc, iZze, objZza4, zzanuVar4);
                                    zzakxVarZzb = zzakxVarZzb;
                                } else {
                                    zzanz.zza((Object) t10, iZzc2 & 1048575, iZze);
                                    zzamqVar.zzb((Object) t10, iZza);
                                    zzakxVarZzb = zzakxVarZzb;
                                }
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 13:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza((Object) t10, iZzc2 & 1048575, zzancVar.zzh());
                                zzamqVar.zzb((Object) t10, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 14:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza((Object) t10, iZzc2 & 1048575, zzancVar.zzm());
                                zzamqVar.zzb((Object) t10, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 15:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza((Object) t10, iZzc2 & 1048575, zzancVar.zzi());
                                zzamqVar.zzb((Object) t10, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 16:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza((Object) t10, iZzc2 & 1048575, zzancVar.zzn());
                                zzamqVar.zzb((Object) t10, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 17:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzamm zzammVar2 = (zzamm) zzamqVar.zza((Object) t10, iZza);
                                zzancVar.zza(zzammVar2, zzamqVar.zze(iZza), zzakuVar2);
                                zzamqVar.zza(t10, iZza, zzammVar2);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 18:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zzc(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 19:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zzg(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 20:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zzi(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case zzbbn.zzt.zzm /* 21 */:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zzq(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 22:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zzh(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 23:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zzf(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 24:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zze(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 25:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zza(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 26:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                if (zzg(iZzc2)) {
                                    zzancVar.zzo(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                    zzakxVarZzb = zzakxVarZzb;
                                } else {
                                    zzancVar.zzn(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                    zzakxVarZzb = zzakxVarZzb;
                                }
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 27:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zzb(zzamqVar.zzo.zza(t10, iZzc2 & 1048575), zzamqVar.zze(iZza), zzakuVar2);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 28:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zzb(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 29:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zzp(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 30:
                                zzamqVar = zzamqVar3;
                                List listZza = zzamqVar.zzo.zza(t10, iZzc2 & 1048575);
                                zzancVar.zzd(listZza);
                                objZza2 = zzand.zza(t10, iZzc, listZza, zzamqVar.zzd(iZza), objZza4, zzanuVar);
                                zzanuVar4 = zzanuVar;
                                objZza4 = objZza2;
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 31:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zzj(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 32:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zzk(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 33:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zzl(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 34:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zzm(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 35:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zzc(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 36:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zzg(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 37:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zzi(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 38:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zzq(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 39:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zzh(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 40:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zzf(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 41:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zze(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 42:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zza(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 43:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zzp(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 44:
                                zzamqVar = zzamqVar3;
                                t11 = t10;
                                List listZza2 = zzamqVar.zzo.zza(t11, iZzc2 & 1048575);
                                zzancVar.zzd(listZza2);
                                zzalj zzaljVarZzd2 = zzamqVar.zzd(iZza);
                                Object obj = objZza4;
                                try {
                                    objZza2 = zzand.zza(t11, iZzc, listZza2, zzaljVarZzd2, obj, zzanuVar);
                                    zzanuVar4 = zzanuVar;
                                    objZza4 = objZza2;
                                    zzakxVarZzb = zzakxVarZzb;
                                } catch (zzalo unused) {
                                    zzanuVar3 = zzanuVar;
                                    objZza4 = obj;
                                    zzanuVar4 = zzanuVar3;
                                    zzanuVar4.zza((zzanc) zzancVar);
                                    if (objZza4 == null) {
                                        objZza4 = zzanuVar4.zzc(t11);
                                    }
                                    if (!zzanuVar4.zza(objZza4, (zzanc) zzancVar, 0)) {
                                        i8 = zzamqVar.zzl;
                                        objZza3 = objZza4;
                                        while (i8 < zzamqVar.zzm) {
                                            T t13 = t11;
                                            objZza3 = zzamqVar.zza(t13, zzamqVar.zzk[i8], objZza3, (zzanu<UT, Object>) zzanuVar4, t7);
                                            i8++;
                                            t11 = t13;
                                        }
                                        t12 = t11;
                                        if (objZza3 != null) {
                                            zzanuVar4.zzb(t12, objZza3);
                                            return;
                                        }
                                        return;
                                    }
                                    zzakxVarZzb = zzakxVarZzb;
                                } catch (Throwable th) {
                                    th = th;
                                    zzanuVar2 = zzanuVar;
                                    objZza4 = obj;
                                    zzanuVar4 = zzanuVar2;
                                    t8 = t11;
                                    zzamqVar3 = zzamqVar;
                                    i7 = zzamqVar3.zzl;
                                    objZza = objZza4;
                                    while (i7 < zzamqVar3.zzm) {
                                        objZza = zzamqVar3.zza(t8, zzamqVar3.zzk[i7], objZza, (zzanu<UT, Object>) zzanuVar4, t7);
                                        i7++;
                                        zzamqVar3 = this;
                                    }
                                    t9 = t8;
                                    if (objZza != null) {
                                        zzanuVar4.zzb(t9, objZza);
                                    }
                                    throw th;
                                }
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 45:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zzj(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 46:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zzk(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 47:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zzl(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 48:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zzm(zzamqVar.zzo.zza(t10, iZzc2 & 1048575));
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 49:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzancVar.zza(zzamqVar.zzo.zza(t10, iZzc2 & 1048575), zzamqVar.zze(iZza), zzakuVar2);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 50:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                Object objZzf = zzamqVar.zzf(iZza);
                                long jZzc = zzamqVar.zzc(iZza) & 1048575;
                                Object objZze = zzanz.zze(t10, jZzc);
                                if (objZze == null) {
                                    objZze = zzamqVar.zzr.zzb(objZzf);
                                    zzanz.zza(t10, jZzc, objZze);
                                } else if (zzamqVar.zzr.zzf(objZze)) {
                                    Object objZzb = zzamqVar.zzr.zzb(objZzf);
                                    zzamqVar.zzr.zza(objZzb, objZze);
                                    zzanz.zza(t10, jZzc, objZzb);
                                    objZze = objZzb;
                                }
                                zzancVar.zza(zzamqVar.zzr.zze(objZze), zzamqVar.zzr.zza(objZzf), zzakuVar2);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 51:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza(t10, iZzc2 & 1048575, Double.valueOf(zzancVar.zza()));
                                zzamqVar.zzb(t10, iZzc, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 52:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza(t10, iZzc2 & 1048575, Float.valueOf(zzancVar.zzb()));
                                zzamqVar.zzb(t10, iZzc, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 53:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza(t10, iZzc2 & 1048575, Long.valueOf(zzancVar.zzl()));
                                zzamqVar.zzb(t10, iZzc, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 54:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza(t10, iZzc2 & 1048575, Long.valueOf(zzancVar.zzo()));
                                zzamqVar.zzb(t10, iZzc, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 55:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza(t10, iZzc2 & 1048575, Integer.valueOf(zzancVar.zzg()));
                                zzamqVar.zzb(t10, iZzc, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 56:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza(t10, iZzc2 & 1048575, Long.valueOf(zzancVar.zzk()));
                                zzamqVar.zzb(t10, iZzc, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 57:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza(t10, iZzc2 & 1048575, Integer.valueOf(zzancVar.zzf()));
                                zzamqVar.zzb(t10, iZzc, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 58:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza(t10, iZzc2 & 1048575, Boolean.valueOf(zzancVar.zzs()));
                                zzamqVar.zzb(t10, iZzc, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 59:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzamqVar.zza((Object) t10, iZzc2, (zzanc) zzancVar);
                                zzamqVar.zzb(t10, iZzc, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 60:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzamm zzammVar3 = (zzamm) zzamqVar.zza(t10, iZzc, iZza);
                                zzancVar.zzb(zzammVar3, zzamqVar.zze(iZza), zzakuVar2);
                                zzamqVar.zza(t10, iZzc, iZza, zzammVar3);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 61:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza(t10, iZzc2 & 1048575, zzancVar.zzp());
                                zzamqVar.zzb(t10, iZzc, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 62:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza(t10, iZzc2 & 1048575, Integer.valueOf(zzancVar.zzj()));
                                zzamqVar.zzb(t10, iZzc, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 63:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                int iZze2 = zzancVar.zze();
                                zzalj zzaljVarZzd3 = zzamqVar.zzd(iZza);
                                if (zzaljVarZzd3 != null && !zzaljVarZzd3.zza(iZze2)) {
                                    objZza4 = zzand.zza(t10, iZzc, iZze2, objZza4, zzanuVar4);
                                    zzakxVarZzb = zzakxVarZzb;
                                } else {
                                    zzanz.zza(t10, iZzc2 & 1048575, Integer.valueOf(iZze2));
                                    zzamqVar.zzb(t10, iZzc, iZza);
                                    zzakxVarZzb = zzakxVarZzb;
                                }
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 64:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza(t10, iZzc2 & 1048575, Integer.valueOf(zzancVar.zzh()));
                                zzamqVar.zzb(t10, iZzc, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 65:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza(t10, iZzc2 & 1048575, Long.valueOf(zzancVar.zzm()));
                                zzamqVar.zzb(t10, iZzc, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 66:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza(t10, iZzc2 & 1048575, Integer.valueOf(zzancVar.zzi()));
                                zzamqVar.zzb(t10, iZzc, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 67:
                                zzamqVar = zzamqVar3;
                                zzanuVar4 = zzanuVar;
                                zzanz.zza(t10, iZzc2 & 1048575, Long.valueOf(zzancVar.zzn()));
                                zzamqVar.zzb(t10, iZzc, iZza);
                                zzakxVarZzb = zzakxVarZzb;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            case 68:
                                zzamqVar = zzamqVar3;
                                t11 = t10;
                                zzanuVar4 = zzanuVar;
                                try {
                                    zzamm zzammVar4 = (zzamm) zzamqVar.zza(t11, iZzc, iZza);
                                    zzancVar.zza(zzammVar4, zzamqVar.zze(iZza), zzakuVar2);
                                    zzamqVar.zza(t11, iZzc, iZza, zzammVar4);
                                    zzakxVarZzb = zzakxVarZzb;
                                } catch (zzalo unused2) {
                                    zzanuVar4.zza((zzanc) zzancVar);
                                    if (objZza4 == null) {
                                        objZza4 = zzanuVar4.zzc(t11);
                                    }
                                    if (!zzanuVar4.zza(objZza4, (zzanc) zzancVar, 0)) {
                                        i8 = zzamqVar.zzl;
                                        objZza3 = objZza4;
                                        while (i8 < zzamqVar.zzm) {
                                            T t14 = t11;
                                            objZza3 = zzamqVar.zza(t14, zzamqVar.zzk[i8], objZza3, (zzanu<UT, Object>) zzanuVar4, t7);
                                            i8++;
                                            t11 = t14;
                                        }
                                        t12 = t11;
                                        if (objZza3 != null) {
                                            zzanuVar4.zzb(t12, objZza3);
                                            return;
                                        }
                                        return;
                                    }
                                    zzakxVarZzb = zzakxVarZzb;
                                }
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                                break;
                            default:
                                if (objZza4 == null) {
                                    try {
                                        objZza4 = zzanuVar.zzc(t10);
                                    } catch (zzalo unused3) {
                                        zzanuVar3 = zzanuVar;
                                        zzamqVar = zzamqVar3;
                                        t11 = t10;
                                        zzanuVar4 = zzanuVar3;
                                        zzanuVar4.zza((zzanc) zzancVar);
                                        if (objZza4 == null) {
                                            objZza4 = zzanuVar4.zzc(t11);
                                        }
                                        if (!zzanuVar4.zza(objZza4, (zzanc) zzancVar, 0)) {
                                            i8 = zzamqVar.zzl;
                                            objZza3 = objZza4;
                                            while (i8 < zzamqVar.zzm) {
                                                T t15 = t11;
                                                objZza3 = zzamqVar.zza(t15, zzamqVar.zzk[i8], objZza3, (zzanu<UT, Object>) zzanuVar4, t7);
                                                i8++;
                                                t11 = t15;
                                            }
                                            t12 = t11;
                                            if (objZza3 != null) {
                                                zzanuVar4.zzb(t12, objZza3);
                                                return;
                                            }
                                            return;
                                        }
                                        zzakxVarZzb = zzakxVarZzb;
                                    }
                                }
                                try {
                                    if (!zzanuVar.zza(objZza4, (zzanc) zzancVar, 0)) {
                                        int i9 = zzamqVar3.zzl;
                                        Object objZza5 = objZza4;
                                        while (i9 < zzamqVar3.zzm) {
                                            T t16 = t10;
                                            zzanu zzanuVar5 = zzanuVar;
                                            objZza5 = zzamqVar3.zza(t16, zzamqVar3.zzk[i9], objZza5, (zzanu<UT, Object>) zzanuVar5, t7);
                                            i9++;
                                            t10 = t16;
                                            zzamqVar3 = zzamqVar3;
                                            zzanuVar = zzanuVar5;
                                        }
                                        zzanu zzanuVar6 = zzanuVar;
                                        zzamqVar2 = zzamqVar3;
                                        T t17 = t10;
                                        if (objZza5 != null) {
                                            zzanuVar6.zzb(t17, objZza5);
                                        }
                                    } else {
                                        zzamqVar = zzamqVar3;
                                        zzanuVar4 = zzanuVar;
                                        zzakxVarZzb = zzakxVarZzb;
                                        zzamqVar3 = zzamqVar;
                                        zzakuVar3 = zzakuVar2;
                                        zzakwVar2 = zzakwVar;
                                        zzakxVarZzb = zzakxVarZzb;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    zzanuVar2 = zzanuVar;
                                    zzamqVar = zzamqVar3;
                                    t11 = t10;
                                    zzanuVar4 = zzanuVar2;
                                    t8 = t11;
                                    zzamqVar3 = zzamqVar;
                                    i7 = zzamqVar3.zzl;
                                    objZza = objZza4;
                                    while (i7 < zzamqVar3.zzm) {
                                        objZza = zzamqVar3.zza(t8, zzamqVar3.zzk[i7], objZza, (zzanu<UT, Object>) zzanuVar4, t7);
                                        i7++;
                                        zzamqVar3 = this;
                                    }
                                    t9 = t8;
                                    if (objZza != null) {
                                        zzanuVar4.zzb(t9, objZza);
                                    }
                                    throw th;
                                }
                                break;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        t8 = t10;
                        zzanuVar4 = zzanuVar;
                        i7 = zzamqVar3.zzl;
                        objZza = objZza4;
                        while (i7 < zzamqVar3.zzm) {
                            objZza = zzamqVar3.zza(t8, zzamqVar3.zzk[i7], objZza, (zzanu<UT, Object>) zzanuVar4, t7);
                            i7++;
                            zzamqVar3 = this;
                        }
                        t9 = t8;
                        if (objZza != null) {
                            zzanuVar4.zzb(t9, objZza);
                        }
                        throw th;
                    }
                } else if (iZzc == Integer.MAX_VALUE) {
                    int i10 = zzamqVar3.zzl;
                    Object objZza6 = objZza4;
                    while (i10 < zzamqVar3.zzm) {
                        objZza6 = zzamqVar3.zza(t7, zzamqVar3.zzk[i10], objZza6, (zzanu<UT, Object>) zzanuVar4, t7);
                        i10++;
                        zzamqVar3 = zzamqVar3;
                    }
                    zzamqVar2 = zzamqVar3;
                    if (objZza6 != null) {
                        zzanuVar4.zzb(t7, objZza6);
                    }
                } else {
                    zzamqVar = zzamqVar3;
                    t11 = t7;
                    try {
                        Object objZza7 = !zzamqVar.zzh ? null : zzakwVar2.zza(zzakuVar3, zzamqVar.zzg, iZzc);
                        if (objZza7 != null) {
                            if (zzakxVarZzb == null) {
                                try {
                                    zzakxVarZzb = zzakwVar2.zzb(t11);
                                } catch (Throwable th4) {
                                    th = th4;
                                    t8 = t11;
                                }
                            }
                            zzakx zzakxVar = zzakxVarZzb;
                            zzanu zzanuVar7 = zzanuVar4;
                            try {
                                objZza4 = zzakwVar2.zza(t11, zzancVar, objZza7, zzakuVar3, zzakxVar, objZza4, zzanuVar7);
                                zzakxVarZzb = zzakxVar;
                                zzanuVar4 = zzanuVar7;
                                zzakwVar = zzakwVar2;
                                zzakuVar2 = zzakuVar3;
                                zzamqVar3 = zzamqVar;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                            } catch (Throwable th5) {
                                th = th5;
                                t8 = t11;
                                zzanuVar4 = zzanuVar7;
                            }
                        } else {
                            zzakwVar = zzakwVar2;
                            t8 = t11;
                            zzakuVar2 = zzakuVar3;
                            try {
                                zzanuVar4.zza((zzanc) zzancVar);
                                if (objZza4 == null) {
                                    try {
                                        objZza4 = zzanuVar4.zzc(t8);
                                    } catch (Throwable th6) {
                                        th = th6;
                                    }
                                }
                                if (!zzanuVar4.zza(objZza4, (zzanc) zzancVar, 0)) {
                                    int i11 = zzamqVar.zzl;
                                    Object objZza8 = objZza4;
                                    while (i11 < zzamqVar.zzm) {
                                        zzamq<T> zzamqVar4 = zzamqVar;
                                        objZza8 = zzamqVar4.zza(t8, zzamqVar.zzk[i11], objZza8, (zzanu<UT, Object>) zzanuVar4, t7);
                                        i11++;
                                        zzanuVar4 = zzanuVar4;
                                        zzamqVar = zzamqVar4;
                                    }
                                    zzanu zzanuVar8 = zzanuVar4;
                                    if (objZza8 != null) {
                                        zzanuVar8.zzb(t8, objZza8);
                                        return;
                                    }
                                    return;
                                }
                                zzamqVar3 = zzamqVar;
                                zzanuVar4 = zzanuVar4;
                                zzakuVar3 = zzakuVar2;
                                zzakwVar2 = zzakwVar;
                                zzakxVarZzb = zzakxVarZzb;
                            } catch (Throwable th7) {
                                th = th7;
                                zzamqVar3 = zzamqVar;
                                zzanuVar = zzanuVar4;
                                zzanuVar4 = zzanuVar;
                                i7 = zzamqVar3.zzl;
                                objZza = objZza4;
                                while (i7 < zzamqVar3.zzm) {
                                    objZza = zzamqVar3.zza(t8, zzamqVar3.zzk[i7], objZza, (zzanu<UT, Object>) zzanuVar4, t7);
                                    i7++;
                                    zzamqVar3 = this;
                                }
                                t9 = t8;
                                if (objZza != null) {
                                    zzanuVar4.zzb(t9, objZza);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        zzanu zzanuVar9 = zzanuVar4;
                        t10 = t11;
                        zzamqVar3 = zzamqVar;
                        zzanuVar = zzanuVar9;
                        t8 = t10;
                        zzanuVar4 = zzanuVar;
                        i7 = zzamqVar3.zzl;
                        objZza = objZza4;
                        while (i7 < zzamqVar3.zzm) {
                            objZza = zzamqVar3.zza(t8, zzamqVar3.zzk[i7], objZza, (zzanu<UT, Object>) zzanuVar4, t7);
                            i7++;
                            zzamqVar3 = this;
                        }
                        t9 = t8;
                        if (objZza != null) {
                            zzanuVar4.zzb(t9, objZza);
                        }
                        throw th;
                    }
                    zzamqVar3 = zzamqVar;
                }
            } catch (Throwable th9) {
                th = th9;
                t8 = t7;
            }
            i7 = zzamqVar3.zzl;
            objZza = objZza4;
            while (i7 < zzamqVar3.zzm) {
                objZza = zzamqVar3.zza(t8, zzamqVar3.zzk[i7], objZza, (zzanu<UT, Object>) zzanuVar4, t7);
                i7++;
                zzamqVar3 = this;
            }
            t9 = t8;
            if (objZza != null) {
                zzanuVar4.zzb(t9, objZza);
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanb
    public final void zza(T t7, byte[] bArr, int i7, int i8, zzaju zzajuVar) {
        zza(t7, bArr, i7, i8, 0, zzajuVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t7, T t8, int i7) {
        if (zzc((Object) t8, i7)) {
            long jZzc = zzc(i7) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t8, jZzc);
            if (object != null) {
                zzanb zzanbVarZze = zze(i7);
                if (!zzc((Object) t7, i7)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t7, jZzc, object);
                    } else {
                        Object objZza = zzanbVarZze.zza();
                        zzanbVarZze.zza(objZza, object);
                        unsafe.putObject(t7, jZzc, objZza);
                    }
                    zzb((Object) t7, i7);
                    return;
                }
                Object object2 = unsafe.getObject(t7, jZzc);
                if (!zzg(object2)) {
                    Object objZza2 = zzanbVarZze.zza();
                    zzanbVarZze.zza(objZza2, object2);
                    unsafe.putObject(t7, jZzc, objZza2);
                    object2 = objZza2;
                }
                zzanbVarZze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + String.valueOf(t8));
        }
    }

    private final void zza(Object obj, int i7, zzanc zzancVar) {
        if (zzg(i7)) {
            zzanz.zza(obj, i7 & 1048575, zzancVar.zzr());
        } else if (this.zzi) {
            zzanz.zza(obj, i7 & 1048575, zzancVar.zzq());
        } else {
            zzanz.zza(obj, i7 & 1048575, zzancVar.zzp());
        }
    }

    private final void zza(T t7, int i7, Object obj) {
        zzb.putObject(t7, zzc(i7) & 1048575, obj);
        zzb((Object) t7, i7);
    }

    private final void zza(T t7, int i7, int i8, Object obj) {
        zzb.putObject(t7, zzc(i8) & 1048575, obj);
        zzb(t7, i7, i8);
    }

    private final <K, V> void zza(zzaol zzaolVar, int i7, Object obj, int i8) {
        if (obj != null) {
            zzaolVar.zza(i7, this.zzr.zza(zzf(i8)), this.zzr.zzd(obj));
        }
    }

    private static void zza(int i7, Object obj, zzaol zzaolVar) {
        if (obj instanceof String) {
            zzaolVar.zza(i7, (String) obj);
        } else {
            zzaolVar.zza(i7, (zzajv) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:176:0x054b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzanb
    public final void zza(T t7, zzaol zzaolVar) {
        Map.Entry<?, ?> entry;
        Iterator it;
        int i7;
        int i8;
        int i9;
        Iterator itZzc;
        Map.Entry<?, ?> entry2;
        zzamq<T> zzamqVar = this;
        int i10 = 267386880;
        boolean z7 = true;
        int i11 = 1048575;
        if (zzaolVar.zza() == 2) {
            zza(zzamqVar.zzp, t7, zzaolVar);
            if (zzamqVar.zzh) {
                zzakx<T> zzakxVarZza = zzamqVar.zzq.zza(t7);
                if (zzakxVarZza.zza.isEmpty()) {
                    itZzc = null;
                    entry2 = null;
                } else {
                    itZzc = zzakxVarZza.zzc();
                    entry2 = (Map.Entry) itZzc.next();
                }
            } else {
                itZzc = null;
                entry2 = null;
            }
            for (int length = zzamqVar.zzc.length - 3; length >= 0; length -= 3) {
                int iZzc = zzamqVar.zzc(length);
                int i12 = zzamqVar.zzc[length];
                while (entry2 != null && zzamqVar.zzq.zza(entry2) > i12) {
                    zzamqVar.zzq.zza(zzaolVar, entry2);
                    entry2 = itZzc.hasNext() ? (Map.Entry) itZzc.next() : null;
                }
                switch ((iZzc & 267386880) >>> 20) {
                    case 0:
                        if (zzamqVar.zzc((Object) t7, length)) {
                            zzaolVar.zza(i12, zzanz.zza(t7, iZzc & 1048575));
                        }
                        break;
                    case 1:
                        if (zzamqVar.zzc((Object) t7, length)) {
                            zzaolVar.zza(i12, zzanz.zzb(t7, iZzc & 1048575));
                        }
                        break;
                    case 2:
                        if (zzamqVar.zzc((Object) t7, length)) {
                            zzaolVar.zzb(i12, zzanz.zzd(t7, iZzc & 1048575));
                        }
                        break;
                    case 3:
                        if (zzamqVar.zzc((Object) t7, length)) {
                            zzaolVar.zze(i12, zzanz.zzd(t7, iZzc & 1048575));
                        }
                        break;
                    case 4:
                        if (zzamqVar.zzc((Object) t7, length)) {
                            zzaolVar.zzc(i12, zzanz.zzc(t7, iZzc & 1048575));
                        }
                        break;
                    case 5:
                        if (zzamqVar.zzc((Object) t7, length)) {
                            zzaolVar.zza(i12, zzanz.zzd(t7, iZzc & 1048575));
                        }
                        break;
                    case 6:
                        if (zzamqVar.zzc((Object) t7, length)) {
                            zzaolVar.zzb(i12, zzanz.zzc(t7, iZzc & 1048575));
                        }
                        break;
                    case 7:
                        if (zzamqVar.zzc((Object) t7, length)) {
                            zzaolVar.zza(i12, zzanz.zzh(t7, iZzc & 1048575));
                        }
                        break;
                    case 8:
                        if (zzamqVar.zzc((Object) t7, length)) {
                            zza(i12, zzanz.zze(t7, iZzc & 1048575), zzaolVar);
                        }
                        break;
                    case 9:
                        if (zzamqVar.zzc((Object) t7, length)) {
                            zzaolVar.zzb(i12, zzanz.zze(t7, iZzc & 1048575), zzamqVar.zze(length));
                        }
                        break;
                    case 10:
                        if (zzamqVar.zzc((Object) t7, length)) {
                            zzaolVar.zza(i12, (zzajv) zzanz.zze(t7, iZzc & 1048575));
                        }
                        break;
                    case 11:
                        if (zzamqVar.zzc((Object) t7, length)) {
                            zzaolVar.zzf(i12, zzanz.zzc(t7, iZzc & 1048575));
                        }
                        break;
                    case 12:
                        if (zzamqVar.zzc((Object) t7, length)) {
                            zzaolVar.zza(i12, zzanz.zzc(t7, iZzc & 1048575));
                        }
                        break;
                    case 13:
                        if (zzamqVar.zzc((Object) t7, length)) {
                            zzaolVar.zzd(i12, zzanz.zzc(t7, iZzc & 1048575));
                        }
                        break;
                    case 14:
                        if (zzamqVar.zzc((Object) t7, length)) {
                            zzaolVar.zzc(i12, zzanz.zzd(t7, iZzc & 1048575));
                        }
                        break;
                    case 15:
                        if (zzamqVar.zzc((Object) t7, length)) {
                            zzaolVar.zze(i12, zzanz.zzc(t7, iZzc & 1048575));
                        }
                        break;
                    case 16:
                        if (zzamqVar.zzc((Object) t7, length)) {
                            zzaolVar.zzd(i12, zzanz.zzd(t7, iZzc & 1048575));
                        }
                        break;
                    case 17:
                        if (zzamqVar.zzc((Object) t7, length)) {
                            zzaolVar.zza(i12, zzanz.zze(t7, iZzc & 1048575), zzamqVar.zze(length));
                        }
                        break;
                    case 18:
                        zzand.zzb(zzamqVar.zzc[length], (List<Double>) zzanz.zze(t7, iZzc & 1048575), zzaolVar, false);
                        break;
                    case 19:
                        zzand.zzf(zzamqVar.zzc[length], (List) zzanz.zze(t7, iZzc & 1048575), zzaolVar, false);
                        break;
                    case 20:
                        zzand.zzh(zzamqVar.zzc[length], (List) zzanz.zze(t7, iZzc & 1048575), zzaolVar, false);
                        break;
                    case zzbbn.zzt.zzm /* 21 */:
                        zzand.zzn(zzamqVar.zzc[length], (List) zzanz.zze(t7, iZzc & 1048575), zzaolVar, false);
                        break;
                    case 22:
                        zzand.zzg(zzamqVar.zzc[length], (List) zzanz.zze(t7, iZzc & 1048575), zzaolVar, false);
                        break;
                    case 23:
                        zzand.zze(zzamqVar.zzc[length], (List) zzanz.zze(t7, iZzc & 1048575), zzaolVar, false);
                        break;
                    case 24:
                        zzand.zzd(zzamqVar.zzc[length], (List) zzanz.zze(t7, iZzc & 1048575), zzaolVar, false);
                        break;
                    case 25:
                        zzand.zza(zzamqVar.zzc[length], (List<Boolean>) zzanz.zze(t7, iZzc & 1048575), zzaolVar, false);
                        break;
                    case 26:
                        zzand.zzb(zzamqVar.zzc[length], (List<String>) zzanz.zze(t7, iZzc & 1048575), zzaolVar);
                        break;
                    case 27:
                        zzand.zzb(zzamqVar.zzc[length], (List<?>) zzanz.zze(t7, iZzc & 1048575), zzaolVar, (zzanb<?>) zzamqVar.zze(length));
                        break;
                    case 28:
                        zzand.zza(zzamqVar.zzc[length], (List<zzajv>) zzanz.zze(t7, iZzc & 1048575), zzaolVar);
                        break;
                    case 29:
                        zzand.zzm(zzamqVar.zzc[length], (List) zzanz.zze(t7, iZzc & 1048575), zzaolVar, false);
                        break;
                    case 30:
                        zzand.zzc(zzamqVar.zzc[length], (List) zzanz.zze(t7, iZzc & 1048575), zzaolVar, false);
                        break;
                    case 31:
                        zzand.zzi(zzamqVar.zzc[length], (List) zzanz.zze(t7, iZzc & 1048575), zzaolVar, false);
                        break;
                    case 32:
                        zzand.zzj(zzamqVar.zzc[length], (List) zzanz.zze(t7, iZzc & 1048575), zzaolVar, false);
                        break;
                    case 33:
                        zzand.zzk(zzamqVar.zzc[length], (List) zzanz.zze(t7, iZzc & 1048575), zzaolVar, false);
                        break;
                    case 34:
                        zzand.zzl(zzamqVar.zzc[length], (List) zzanz.zze(t7, iZzc & 1048575), zzaolVar, false);
                        break;
                    case 35:
                        zzand.zzb(zzamqVar.zzc[length], (List<Double>) zzanz.zze(t7, iZzc & 1048575), zzaolVar, true);
                        break;
                    case 36:
                        zzand.zzf(zzamqVar.zzc[length], (List) zzanz.zze(t7, iZzc & 1048575), zzaolVar, true);
                        break;
                    case 37:
                        zzand.zzh(zzamqVar.zzc[length], (List) zzanz.zze(t7, iZzc & 1048575), zzaolVar, true);
                        break;
                    case 38:
                        zzand.zzn(zzamqVar.zzc[length], (List) zzanz.zze(t7, iZzc & 1048575), zzaolVar, true);
                        break;
                    case 39:
                        zzand.zzg(zzamqVar.zzc[length], (List) zzanz.zze(t7, iZzc & 1048575), zzaolVar, true);
                        break;
                    case 40:
                        zzand.zze(zzamqVar.zzc[length], (List) zzanz.zze(t7, iZzc & 1048575), zzaolVar, true);
                        break;
                    case 41:
                        zzand.zzd(zzamqVar.zzc[length], (List) zzanz.zze(t7, iZzc & 1048575), zzaolVar, true);
                        break;
                    case 42:
                        zzand.zza(zzamqVar.zzc[length], (List<Boolean>) zzanz.zze(t7, iZzc & 1048575), zzaolVar, true);
                        break;
                    case 43:
                        zzand.zzm(zzamqVar.zzc[length], (List) zzanz.zze(t7, iZzc & 1048575), zzaolVar, true);
                        break;
                    case 44:
                        zzand.zzc(zzamqVar.zzc[length], (List) zzanz.zze(t7, iZzc & 1048575), zzaolVar, true);
                        break;
                    case 45:
                        zzand.zzi(zzamqVar.zzc[length], (List) zzanz.zze(t7, iZzc & 1048575), zzaolVar, true);
                        break;
                    case 46:
                        zzand.zzj(zzamqVar.zzc[length], (List) zzanz.zze(t7, iZzc & 1048575), zzaolVar, true);
                        break;
                    case 47:
                        zzand.zzk(zzamqVar.zzc[length], (List) zzanz.zze(t7, iZzc & 1048575), zzaolVar, true);
                        break;
                    case 48:
                        zzand.zzl(zzamqVar.zzc[length], (List) zzanz.zze(t7, iZzc & 1048575), zzaolVar, true);
                        break;
                    case 49:
                        zzand.zza(zzamqVar.zzc[length], (List<?>) zzanz.zze(t7, iZzc & 1048575), zzaolVar, (zzanb<?>) zzamqVar.zze(length));
                        break;
                    case 50:
                        zzamqVar.zza(zzaolVar, i12, zzanz.zze(t7, iZzc & 1048575), length);
                        break;
                    case 51:
                        if (zzamqVar.zzc(t7, i12, length)) {
                            zzaolVar.zza(i12, zza(t7, iZzc & 1048575));
                        }
                        break;
                    case 52:
                        if (zzamqVar.zzc(t7, i12, length)) {
                            zzaolVar.zza(i12, zzb(t7, iZzc & 1048575));
                        }
                        break;
                    case 53:
                        if (zzamqVar.zzc(t7, i12, length)) {
                            zzaolVar.zzb(i12, zzd(t7, iZzc & 1048575));
                        }
                        break;
                    case 54:
                        if (zzamqVar.zzc(t7, i12, length)) {
                            zzaolVar.zze(i12, zzd(t7, iZzc & 1048575));
                        }
                        break;
                    case 55:
                        if (zzamqVar.zzc(t7, i12, length)) {
                            zzaolVar.zzc(i12, zzc(t7, iZzc & 1048575));
                        }
                        break;
                    case 56:
                        if (zzamqVar.zzc(t7, i12, length)) {
                            zzaolVar.zza(i12, zzd(t7, iZzc & 1048575));
                        }
                        break;
                    case 57:
                        if (zzamqVar.zzc(t7, i12, length)) {
                            zzaolVar.zzb(i12, zzc(t7, iZzc & 1048575));
                        }
                        break;
                    case 58:
                        if (zzamqVar.zzc(t7, i12, length)) {
                            zzaolVar.zza(i12, zze(t7, iZzc & 1048575));
                        }
                        break;
                    case 59:
                        if (zzamqVar.zzc(t7, i12, length)) {
                            zza(i12, zzanz.zze(t7, iZzc & 1048575), zzaolVar);
                        }
                        break;
                    case 60:
                        if (zzamqVar.zzc(t7, i12, length)) {
                            zzaolVar.zzb(i12, zzanz.zze(t7, iZzc & 1048575), zzamqVar.zze(length));
                        }
                        break;
                    case 61:
                        if (zzamqVar.zzc(t7, i12, length)) {
                            zzaolVar.zza(i12, (zzajv) zzanz.zze(t7, iZzc & 1048575));
                        }
                        break;
                    case 62:
                        if (zzamqVar.zzc(t7, i12, length)) {
                            zzaolVar.zzf(i12, zzc(t7, iZzc & 1048575));
                        }
                        break;
                    case 63:
                        if (zzamqVar.zzc(t7, i12, length)) {
                            zzaolVar.zza(i12, zzc(t7, iZzc & 1048575));
                        }
                        break;
                    case 64:
                        if (zzamqVar.zzc(t7, i12, length)) {
                            zzaolVar.zzd(i12, zzc(t7, iZzc & 1048575));
                        }
                        break;
                    case 65:
                        if (zzamqVar.zzc(t7, i12, length)) {
                            zzaolVar.zzc(i12, zzd(t7, iZzc & 1048575));
                        }
                        break;
                    case 66:
                        if (zzamqVar.zzc(t7, i12, length)) {
                            zzaolVar.zze(i12, zzc(t7, iZzc & 1048575));
                        }
                        break;
                    case 67:
                        if (zzamqVar.zzc(t7, i12, length)) {
                            zzaolVar.zzd(i12, zzd(t7, iZzc & 1048575));
                        }
                        break;
                    case 68:
                        if (zzamqVar.zzc(t7, i12, length)) {
                            zzaolVar.zza(i12, zzanz.zze(t7, iZzc & 1048575), zzamqVar.zze(length));
                        }
                        break;
                }
            }
            while (entry2 != null) {
                zzamqVar.zzq.zza(zzaolVar, entry2);
                entry2 = itZzc.hasNext() ? (Map.Entry) itZzc.next() : null;
            }
            return;
        }
        if (zzamqVar.zzh) {
            zzakx<T> zzakxVarZza2 = zzamqVar.zzq.zza(t7);
            if (zzakxVarZza2.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzd = zzakxVarZza2.zzd();
                entry = (Map.Entry) itZzd.next();
                it = itZzd;
            }
        } else {
            entry = null;
            it = null;
        }
        int length2 = zzamqVar.zzc.length;
        Unsafe unsafe = zzb;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i13 < length2) {
            int iZzc2 = zzamqVar.zzc(i13);
            int i16 = i10;
            int[] iArr = zzamqVar.zzc;
            int i17 = iArr[i13];
            int i18 = (iZzc2 & i16) >>> 20;
            boolean z8 = z7;
            if (i18 <= 17) {
                int i19 = iArr[i13 + 2];
                int i20 = i19 & i11;
                if (i20 != i15) {
                    i14 = i20 == i11 ? 0 : unsafe.getInt(t7, i20);
                    i15 = i20;
                }
                i7 = i15;
                i8 = i14;
                i9 = (z8 ? 1 : 0) << (i19 >>> 20);
            } else {
                i7 = i15;
                i8 = i14;
                i9 = 0;
            }
            while (entry != null && zzamqVar.zzq.zza(entry) <= i17) {
                zzamqVar.zzq.zza(zzaolVar, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            Iterator it2 = it;
            long j7 = iZzc2 & i11;
            switch (i18) {
                case 0:
                    z7 = z8 ? 1 : 0;
                    if (zzamqVar.zza(t7, i13, i7, i8, i9)) {
                        zzaolVar.zza(i17, zzanz.zza(t7, j7));
                    }
                    break;
                case 1:
                    z7 = z8 ? 1 : 0;
                    if (zzamqVar.zza(t7, i13, i7, i8, i9)) {
                        zzaolVar.zza(i17, zzanz.zzb(t7, j7));
                    }
                    zzamqVar = this;
                    break;
                case 2:
                    z7 = z8 ? 1 : 0;
                    if (zzamqVar.zza(t7, i13, i7, i8, i9)) {
                        zzaolVar.zzb(i17, unsafe.getLong(t7, j7));
                    }
                    zzamqVar = this;
                    break;
                case 3:
                    z7 = z8 ? 1 : 0;
                    if (zzamqVar.zza(t7, i13, i7, i8, i9)) {
                        zzaolVar.zze(i17, unsafe.getLong(t7, j7));
                    }
                    zzamqVar = this;
                    break;
                case 4:
                    z7 = z8 ? 1 : 0;
                    if (zzamqVar.zza(t7, i13, i7, i8, i9)) {
                        zzaolVar.zzc(i17, unsafe.getInt(t7, j7));
                    }
                    zzamqVar = this;
                    break;
                case 5:
                    z7 = z8 ? 1 : 0;
                    if (zzamqVar.zza(t7, i13, i7, i8, i9)) {
                        zzaolVar.zza(i17, unsafe.getLong(t7, j7));
                    }
                    zzamqVar = this;
                    break;
                case 6:
                    z7 = z8 ? 1 : 0;
                    if (zzamqVar.zza(t7, i13, i7, i8, i9)) {
                        zzaolVar.zzb(i17, unsafe.getInt(t7, j7));
                    }
                    zzamqVar = this;
                    break;
                case 7:
                    z7 = z8 ? 1 : 0;
                    if (zzamqVar.zza(t7, i13, i7, i8, i9)) {
                        zzaolVar.zza(i17, zzanz.zzh(t7, j7));
                    }
                    zzamqVar = this;
                    break;
                case 8:
                    z7 = z8 ? 1 : 0;
                    if (zzamqVar.zza(t7, i13, i7, i8, i9)) {
                        zza(i17, unsafe.getObject(t7, j7), zzaolVar);
                    }
                    zzamqVar = this;
                    break;
                case 9:
                    z7 = z8 ? 1 : 0;
                    if (zzamqVar.zza(t7, i13, i7, i8, i9)) {
                        zzaolVar.zzb(i17, unsafe.getObject(t7, j7), zzamqVar.zze(i13));
                    }
                    break;
                case 10:
                    z7 = z8 ? 1 : 0;
                    if (zzamqVar.zza(t7, i13, i7, i8, i9)) {
                        zzaolVar.zza(i17, (zzajv) unsafe.getObject(t7, j7));
                    }
                    zzamqVar = this;
                    break;
                case 11:
                    z7 = z8 ? 1 : 0;
                    if (zzamqVar.zza(t7, i13, i7, i8, i9)) {
                        zzaolVar.zzf(i17, unsafe.getInt(t7, j7));
                    }
                    zzamqVar = this;
                    break;
                case 12:
                    z7 = z8 ? 1 : 0;
                    if (zzamqVar.zza(t7, i13, i7, i8, i9)) {
                        zzaolVar.zza(i17, unsafe.getInt(t7, j7));
                    }
                    zzamqVar = this;
                    break;
                case 13:
                    z7 = z8 ? 1 : 0;
                    if (zzamqVar.zza(t7, i13, i7, i8, i9)) {
                        zzaolVar.zzd(i17, unsafe.getInt(t7, j7));
                    }
                    zzamqVar = this;
                    break;
                case 14:
                    z7 = z8 ? 1 : 0;
                    if (zzamqVar.zza(t7, i13, i7, i8, i9)) {
                        zzaolVar.zzc(i17, unsafe.getLong(t7, j7));
                    }
                    zzamqVar = this;
                    break;
                case 15:
                    z7 = z8 ? 1 : 0;
                    if (zzamqVar.zza(t7, i13, i7, i8, i9)) {
                        zzaolVar.zze(i17, unsafe.getInt(t7, j7));
                    }
                    zzamqVar = this;
                    break;
                case 16:
                    z7 = z8 ? 1 : 0;
                    if (zzamqVar.zza(t7, i13, i7, i8, i9)) {
                        zzaolVar.zzd(i17, unsafe.getLong(t7, j7));
                    }
                    zzamqVar = this;
                    break;
                case 17:
                    z7 = z8 ? 1 : 0;
                    if (zzamqVar.zza(t7, i13, i7, i8, i9)) {
                        zzaolVar.zza(i17, unsafe.getObject(t7, j7), zzamqVar.zze(i13));
                    }
                    break;
                case 18:
                    z7 = z8 ? 1 : 0;
                    zzand.zzb(zzamqVar.zzc[i13], (List<Double>) unsafe.getObject(t7, j7), zzaolVar, false);
                    break;
                case 19:
                    z7 = z8 ? 1 : 0;
                    zzand.zzf(zzamqVar.zzc[i13], (List) unsafe.getObject(t7, j7), zzaolVar, false);
                    break;
                case 20:
                    z7 = z8 ? 1 : 0;
                    zzand.zzh(zzamqVar.zzc[i13], (List) unsafe.getObject(t7, j7), zzaolVar, false);
                    break;
                case zzbbn.zzt.zzm /* 21 */:
                    z7 = z8 ? 1 : 0;
                    zzand.zzn(zzamqVar.zzc[i13], (List) unsafe.getObject(t7, j7), zzaolVar, false);
                    break;
                case 22:
                    z7 = z8 ? 1 : 0;
                    zzand.zzg(zzamqVar.zzc[i13], (List) unsafe.getObject(t7, j7), zzaolVar, false);
                    break;
                case 23:
                    z7 = z8 ? 1 : 0;
                    zzand.zze(zzamqVar.zzc[i13], (List) unsafe.getObject(t7, j7), zzaolVar, false);
                    break;
                case 24:
                    z7 = z8 ? 1 : 0;
                    zzand.zzd(zzamqVar.zzc[i13], (List) unsafe.getObject(t7, j7), zzaolVar, false);
                    break;
                case 25:
                    z7 = z8 ? 1 : 0;
                    zzand.zza(zzamqVar.zzc[i13], (List<Boolean>) unsafe.getObject(t7, j7), zzaolVar, false);
                    break;
                case 26:
                    z7 = z8 ? 1 : 0;
                    zzand.zzb(zzamqVar.zzc[i13], (List<String>) unsafe.getObject(t7, j7), zzaolVar);
                    break;
                case 27:
                    z7 = z8 ? 1 : 0;
                    zzand.zzb(zzamqVar.zzc[i13], (List<?>) unsafe.getObject(t7, j7), zzaolVar, (zzanb<?>) zzamqVar.zze(i13));
                    break;
                case 28:
                    z7 = z8 ? 1 : 0;
                    zzand.zza(zzamqVar.zzc[i13], (List<zzajv>) unsafe.getObject(t7, j7), zzaolVar);
                    break;
                case 29:
                    z7 = z8 ? 1 : 0;
                    zzand.zzm(zzamqVar.zzc[i13], (List) unsafe.getObject(t7, j7), zzaolVar, false);
                    break;
                case 30:
                    z7 = z8 ? 1 : 0;
                    zzand.zzc(zzamqVar.zzc[i13], (List) unsafe.getObject(t7, j7), zzaolVar, false);
                    break;
                case 31:
                    z7 = z8 ? 1 : 0;
                    zzand.zzi(zzamqVar.zzc[i13], (List) unsafe.getObject(t7, j7), zzaolVar, false);
                    break;
                case 32:
                    z7 = z8 ? 1 : 0;
                    zzand.zzj(zzamqVar.zzc[i13], (List) unsafe.getObject(t7, j7), zzaolVar, false);
                    break;
                case 33:
                    z7 = z8 ? 1 : 0;
                    zzand.zzk(zzamqVar.zzc[i13], (List) unsafe.getObject(t7, j7), zzaolVar, false);
                    break;
                case 34:
                    z7 = z8 ? 1 : 0;
                    zzand.zzl(zzamqVar.zzc[i13], (List) unsafe.getObject(t7, j7), zzaolVar, false);
                    break;
                case 35:
                    z7 = z8 ? 1 : 0;
                    zzand.zzb(zzamqVar.zzc[i13], (List<Double>) unsafe.getObject(t7, j7), zzaolVar, z7);
                    break;
                case 36:
                    z7 = z8 ? 1 : 0;
                    zzand.zzf(zzamqVar.zzc[i13], (List) unsafe.getObject(t7, j7), zzaolVar, z7);
                    break;
                case 37:
                    z7 = z8 ? 1 : 0;
                    zzand.zzh(zzamqVar.zzc[i13], (List) unsafe.getObject(t7, j7), zzaolVar, z7);
                    break;
                case 38:
                    z7 = z8 ? 1 : 0;
                    zzand.zzn(zzamqVar.zzc[i13], (List) unsafe.getObject(t7, j7), zzaolVar, z7);
                    break;
                case 39:
                    z7 = z8 ? 1 : 0;
                    zzand.zzg(zzamqVar.zzc[i13], (List) unsafe.getObject(t7, j7), zzaolVar, z7);
                    break;
                case 40:
                    z7 = z8 ? 1 : 0;
                    zzand.zze(zzamqVar.zzc[i13], (List) unsafe.getObject(t7, j7), zzaolVar, z7);
                    break;
                case 41:
                    z7 = z8 ? 1 : 0;
                    zzand.zzd(zzamqVar.zzc[i13], (List) unsafe.getObject(t7, j7), zzaolVar, z7);
                    break;
                case 42:
                    z7 = z8 ? 1 : 0;
                    zzand.zza(zzamqVar.zzc[i13], (List<Boolean>) unsafe.getObject(t7, j7), zzaolVar, z7);
                    break;
                case 43:
                    z7 = z8 ? 1 : 0;
                    zzand.zzm(zzamqVar.zzc[i13], (List) unsafe.getObject(t7, j7), zzaolVar, z7);
                    break;
                case 44:
                    z7 = z8 ? 1 : 0;
                    zzand.zzc(zzamqVar.zzc[i13], (List) unsafe.getObject(t7, j7), zzaolVar, z7);
                    break;
                case 45:
                    z7 = z8 ? 1 : 0;
                    zzand.zzi(zzamqVar.zzc[i13], (List) unsafe.getObject(t7, j7), zzaolVar, z7);
                    break;
                case 46:
                    z7 = z8 ? 1 : 0;
                    zzand.zzj(zzamqVar.zzc[i13], (List) unsafe.getObject(t7, j7), zzaolVar, z7);
                    break;
                case 47:
                    z7 = z8 ? 1 : 0;
                    zzand.zzk(zzamqVar.zzc[i13], (List) unsafe.getObject(t7, j7), zzaolVar, z7);
                    break;
                case 48:
                    int i21 = zzamqVar.zzc[i13];
                    List list = (List) unsafe.getObject(t7, j7);
                    z7 = z8 ? 1 : 0;
                    zzand.zzl(i21, list, zzaolVar, z7);
                    break;
                case 49:
                    zzand.zza(zzamqVar.zzc[i13], (List<?>) unsafe.getObject(t7, j7), zzaolVar, (zzanb<?>) zzamqVar.zze(i13));
                    z7 = z8 ? 1 : 0;
                    break;
                case 50:
                    zzamqVar.zza(zzaolVar, i17, unsafe.getObject(t7, j7), i13);
                    z7 = z8 ? 1 : 0;
                    break;
                case 51:
                    if (zzamqVar.zzc(t7, i17, i13)) {
                        zzaolVar.zza(i17, zza(t7, j7));
                    }
                    z7 = z8 ? 1 : 0;
                    break;
                case 52:
                    if (zzamqVar.zzc(t7, i17, i13)) {
                        zzaolVar.zza(i17, zzb(t7, j7));
                    }
                    z7 = z8 ? 1 : 0;
                    break;
                case 53:
                    if (zzamqVar.zzc(t7, i17, i13)) {
                        zzaolVar.zzb(i17, zzd(t7, j7));
                    }
                    z7 = z8 ? 1 : 0;
                    break;
                case 54:
                    if (zzamqVar.zzc(t7, i17, i13)) {
                        zzaolVar.zze(i17, zzd(t7, j7));
                    }
                    z7 = z8 ? 1 : 0;
                    break;
                case 55:
                    if (zzamqVar.zzc(t7, i17, i13)) {
                        zzaolVar.zzc(i17, zzc(t7, j7));
                    }
                    z7 = z8 ? 1 : 0;
                    break;
                case 56:
                    if (zzamqVar.zzc(t7, i17, i13)) {
                        zzaolVar.zza(i17, zzd(t7, j7));
                    }
                    z7 = z8 ? 1 : 0;
                    break;
                case 57:
                    if (zzamqVar.zzc(t7, i17, i13)) {
                        zzaolVar.zzb(i17, zzc(t7, j7));
                    }
                    z7 = z8 ? 1 : 0;
                    break;
                case 58:
                    if (zzamqVar.zzc(t7, i17, i13)) {
                        zzaolVar.zza(i17, zze(t7, j7));
                    }
                    z7 = z8 ? 1 : 0;
                    break;
                case 59:
                    if (zzamqVar.zzc(t7, i17, i13)) {
                        zza(i17, unsafe.getObject(t7, j7), zzaolVar);
                    }
                    z7 = z8 ? 1 : 0;
                    break;
                case 60:
                    if (zzamqVar.zzc(t7, i17, i13)) {
                        zzaolVar.zzb(i17, unsafe.getObject(t7, j7), zzamqVar.zze(i13));
                    }
                    z7 = z8 ? 1 : 0;
                    break;
                case 61:
                    if (zzamqVar.zzc(t7, i17, i13)) {
                        zzaolVar.zza(i17, (zzajv) unsafe.getObject(t7, j7));
                    }
                    z7 = z8 ? 1 : 0;
                    break;
                case 62:
                    if (zzamqVar.zzc(t7, i17, i13)) {
                        zzaolVar.zzf(i17, zzc(t7, j7));
                    }
                    z7 = z8 ? 1 : 0;
                    break;
                case 63:
                    if (zzamqVar.zzc(t7, i17, i13)) {
                        zzaolVar.zza(i17, zzc(t7, j7));
                    }
                    z7 = z8 ? 1 : 0;
                    break;
                case 64:
                    if (zzamqVar.zzc(t7, i17, i13)) {
                        zzaolVar.zzd(i17, zzc(t7, j7));
                    }
                    z7 = z8 ? 1 : 0;
                    break;
                case 65:
                    if (zzamqVar.zzc(t7, i17, i13)) {
                        zzaolVar.zzc(i17, zzd(t7, j7));
                    }
                    z7 = z8 ? 1 : 0;
                    break;
                case 66:
                    if (zzamqVar.zzc(t7, i17, i13)) {
                        zzaolVar.zze(i17, zzc(t7, j7));
                    }
                    z7 = z8 ? 1 : 0;
                    break;
                case 67:
                    if (zzamqVar.zzc(t7, i17, i13)) {
                        zzaolVar.zzd(i17, zzd(t7, j7));
                    }
                    z7 = z8 ? 1 : 0;
                    break;
                case 68:
                    if (zzamqVar.zzc(t7, i17, i13)) {
                        zzaolVar.zza(i17, unsafe.getObject(t7, j7), zzamqVar.zze(i13));
                    }
                    z7 = z8 ? 1 : 0;
                    break;
                default:
                    z7 = z8 ? 1 : 0;
                    break;
            }
            i13 += 3;
            i14 = i8;
            it = it2;
            i11 = 1048575;
            i15 = i7;
            entry = entry;
            i10 = i16;
        }
        Iterator it3 = it;
        while (entry != null) {
            zzamqVar.zzq.zza(zzaolVar, entry);
            entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
        }
        zza(zzamqVar.zzp, t7, zzaolVar);
    }

    private static <UT, UB> void zza(zzanu<UT, UB> zzanuVar, T t7, zzaol zzaolVar) {
        zzanuVar.zzb(zzanuVar.zzd(t7), zzaolVar);
    }

    private final boolean zza(T t7, int i7, int i8, int i9, int i10) {
        if (i8 == 1048575) {
            return zzc((Object) t7, i7);
        }
        return (i9 & i10) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i7, zzanb zzanbVar) {
        return zzanbVar.zze(zzanz.zze(obj, i7 & 1048575));
    }
}
