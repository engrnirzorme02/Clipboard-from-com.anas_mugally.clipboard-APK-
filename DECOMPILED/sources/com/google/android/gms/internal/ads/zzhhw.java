package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzhhw {
    private static final zzhhw zzd = new zzhhw(true);
    final zzhkr zza = new zzhkn();
    boolean zzb;
    boolean zzc;

    private zzhhw() {
    }

    public static zzhhw zza() {
        return zzd;
    }

    static void zzf(zzhhm zzhhmVar, zzhli zzhliVar, int i7, Object obj) {
        if (zzhliVar == zzhli.zzj) {
            zzhhmVar.zzJ(i7, 3);
            ((zzhjs) obj).zzdc(zzhhmVar);
            zzhhmVar.zzJ(i7, 4);
            return;
        }
        zzhhmVar.zzJ(i7, zzhliVar.zzb());
        zzhlj zzhljVar = zzhlj.INT;
        switch (zzhliVar.ordinal()) {
            case 0:
                zzhhmVar.zzv(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzhhmVar.zzt(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzhhmVar.zzu(((Long) obj).longValue());
                break;
            case 3:
                zzhhmVar.zzu(((Long) obj).longValue());
                break;
            case 4:
                zzhhmVar.zzr(((Integer) obj).intValue());
                break;
            case 5:
                zzhhmVar.zzv(((Long) obj).longValue());
                break;
            case 6:
                zzhhmVar.zzt(((Integer) obj).intValue());
                break;
            case 7:
                zzhhmVar.zzq(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzhhb)) {
                    zzhhmVar.zzx((String) obj);
                } else {
                    zzhhmVar.zzl((zzhhb) obj);
                }
                break;
            case 9:
                ((zzhjs) obj).zzdc(zzhhmVar);
                break;
            case 10:
                zzhhmVar.zzp((zzhjs) obj);
                break;
            case 11:
                if (!(obj instanceof zzhhb)) {
                    byte[] bArr = (byte[]) obj;
                    zzhhmVar.zzm(bArr, 0, bArr.length);
                } else {
                    zzhhmVar.zzl((zzhhb) obj);
                }
                break;
            case 12:
                zzhhmVar.zzs(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzhil)) {
                    zzhhmVar.zzr(((Integer) obj).intValue());
                } else {
                    zzhhmVar.zzr(((zzhil) obj).zza());
                }
                break;
            case 14:
                zzhhmVar.zzt(((Integer) obj).intValue());
                break;
            case 15:
                zzhhmVar.zzv(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                zzhhmVar.zzs((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                zzhhmVar.zzu((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    static int zzh(zzhli zzhliVar, int i7, Object obj) {
        int iZzA = zzhhm.zzA(i7 << 3);
        if (zzhliVar == zzhli.zzj) {
            iZzA += iZzA;
        }
        return iZzA + zzi(zzhliVar, obj);
    }

    static int zzi(zzhli zzhliVar, Object obj) {
        int iZzc;
        int iZzA;
        zzhli zzhliVar2 = zzhli.zza;
        zzhlj zzhljVar = zzhlj.INT;
        switch (zzhliVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i7 = zzhhm.zzf;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i8 = zzhhm.zzf;
                return 4;
            case 2:
                return zzhhm.zzB(((Long) obj).longValue());
            case 3:
                return zzhhm.zzB(((Long) obj).longValue());
            case 4:
                return zzhhm.zzB(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i9 = zzhhm.zzf;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i10 = zzhhm.zzf;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i11 = zzhhm.zzf;
                return 1;
            case 8:
                if (!(obj instanceof zzhhb)) {
                    return zzhhm.zzC((String) obj);
                }
                int i12 = zzhhm.zzf;
                iZzc = ((zzhhb) obj).zzc();
                iZzA = zzhhm.zzA(iZzc);
                break;
                break;
            case 9:
                return ((zzhjs) obj).zzbr();
            case 10:
                if (!(obj instanceof zzhjb)) {
                    return zzhhm.zzD((zzhjs) obj);
                }
                iZzc = ((zzhjb) obj).zzb();
                iZzA = zzhhm.zzA(iZzc);
                break;
                break;
            case 11:
                if (!(obj instanceof zzhhb)) {
                    int i13 = zzhhm.zzf;
                    iZzc = ((byte[]) obj).length;
                    iZzA = zzhhm.zzA(iZzc);
                } else {
                    int i14 = zzhhm.zzf;
                    iZzc = ((zzhhb) obj).zzc();
                    iZzA = zzhhm.zzA(iZzc);
                }
                break;
            case 12:
                return zzhhm.zzA(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzhil ? zzhhm.zzB(((zzhil) obj).zza()) : zzhhm.zzB(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i15 = zzhhm.zzf;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i16 = zzhhm.zzf;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return zzhhm.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return zzhhm.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iZzA + iZzc;
    }

    public static int zzj(zzhhv zzhhvVar, Object obj) {
        zzhli zzhliVarZzb = zzhhvVar.zzb();
        int iZza = zzhhvVar.zza();
        if (!zzhhvVar.zzd()) {
            return zzh(zzhliVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i7 = 0;
        if (!zzhhvVar.zze()) {
            int iZzh = 0;
            while (i7 < size) {
                iZzh += zzh(zzhliVarZzb, iZza, list.get(i7));
                i7++;
            }
            return iZzh;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iZzi = 0;
        while (i7 < size) {
            iZzi += zzi(zzhliVarZzb, list.get(i7));
            i7++;
        }
        return zzhhm.zzA(iZza << 3) + iZzi + zzhhm.zzA(iZzi);
    }

    private static boolean zzk(Map.Entry entry) {
        zzhhv zzhhvVar = (zzhhv) entry.getKey();
        if (zzhhvVar.zzc() != zzhlj.MESSAGE) {
            return true;
        }
        if (!zzhhvVar.zzd()) {
            return zzl(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!zzl(list.get(i7))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzl(Object obj) {
        if (obj instanceof zzhjt) {
            return ((zzhjt) obj).zzbi();
        }
        if (obj instanceof zzhjb) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(Map.Entry entry) {
        int i7;
        int iZzA;
        int iZzA2;
        zzhhv zzhhvVar = (zzhhv) entry.getKey();
        Object value = entry.getValue();
        if (zzhhvVar.zzc() != zzhlj.MESSAGE || zzhhvVar.zzd() || zzhhvVar.zze()) {
            return zzj(zzhhvVar, value);
        }
        if (value instanceof zzhjb) {
            int iZza = ((zzhhv) entry.getKey()).zza();
            int iZzA3 = zzhhm.zzA(8);
            i7 = iZzA3 + iZzA3;
            iZzA = zzhhm.zzA(16) + zzhhm.zzA(iZza);
            int iZzA4 = zzhhm.zzA(24);
            int iZzb = ((zzhjb) value).zzb();
            iZzA2 = iZzA4 + zzhhm.zzA(iZzb) + iZzb;
        } else {
            int iZza2 = ((zzhhv) entry.getKey()).zza();
            int iZzA5 = zzhhm.zzA(8);
            i7 = iZzA5 + iZzA5;
            iZzA = zzhhm.zzA(16) + zzhhm.zzA(iZza2);
            iZzA2 = zzhhm.zzA(24) + zzhhm.zzD((zzhjs) value);
        }
        return i7 + iZzA + iZzA2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0047 A[RETURN] */
    private static final void zzn(zzhhv zzhhvVar, Object obj) {
        boolean z7;
        zzhhvVar.zzb();
        byte[] bArr = zzhiu.zzb;
        obj.getClass();
        zzhli zzhliVar = zzhli.zza;
        zzhlj zzhljVar = zzhlj.INT;
        switch (r0.zza()) {
            case INT:
                z7 = obj instanceof Integer;
                if (z7) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhhvVar.zza()), zzhhvVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z7 = obj instanceof Long;
                if (z7) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhhvVar.zza()), zzhhvVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z7 = obj instanceof Float;
                if (z7) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhhvVar.zza()), zzhhvVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z7 = obj instanceof Double;
                if (z7) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhhvVar.zza()), zzhhvVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z7 = obj instanceof Boolean;
                if (z7) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhhvVar.zza()), zzhhvVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z7 = obj instanceof String;
                if (z7) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhhvVar.zza()), zzhhvVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzhhb) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhhvVar.zza()), zzhhvVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzhil)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhhvVar.zza()), zzhhvVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzhjs) || (obj instanceof zzhjb)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhhvVar.zza()), zzhhvVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhhvVar.zza()), zzhhvVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zzhhw zzhhwVar = new zzhhw();
        zzhkr zzhkrVar = this.zza;
        int iZzc = zzhkrVar.zzc();
        for (int i7 = 0; i7 < iZzc; i7++) {
            Map.Entry entryZzd = zzhkrVar.zzd(i7);
            zzhhwVar.zzd((zzhhv) ((zzhko) entryZzd).zza(), entryZzd.getValue());
        }
        for (Map.Entry entry : zzhkrVar.zze()) {
            zzhhwVar.zzd((zzhhv) entry.getKey(), entry.getValue());
        }
        zzhhwVar.zzc = this.zzc;
        return zzhhwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzhhw) {
            return this.zza.equals(((zzhhw) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        zzhkr zzhkrVar = this.zza;
        int iZzc = zzhkrVar.zzc();
        for (int i7 = 0; i7 < iZzc; i7++) {
            Object value = zzhkrVar.zzd(i7).getValue();
            if (value instanceof zzhih) {
                ((zzhih) value).zzbm();
            }
        }
        Iterator it = zzhkrVar.zze().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzhih) {
                ((zzhih) value2).zzbm();
            }
        }
        zzhkrVar.zza();
        this.zzb = true;
    }

    public final Iterator zzc() {
        zzhkr zzhkrVar = this.zza;
        if (zzhkrVar.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.zzc ? new zzhja(zzhkrVar.entrySet().iterator()) : zzhkrVar.entrySet().iterator();
    }

    public final void zzd(zzhhv zzhhvVar, Object obj) {
        if (!zzhhvVar.zzd()) {
            zzn(zzhhvVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i7 = 0; i7 < size; i7++) {
                Object obj2 = list.get(i7);
                zzn(zzhhvVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzhjb) {
            this.zzc = true;
        }
        this.zza.put(zzhhvVar, obj);
    }

    public final boolean zze() {
        zzhkr zzhkrVar = this.zza;
        int iZzc = zzhkrVar.zzc();
        for (int i7 = 0; i7 < iZzc; i7++) {
            if (!zzk(zzhkrVar.zzd(i7))) {
                return false;
            }
        }
        Iterator it = zzhkrVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int zzg() {
        zzhkr zzhkrVar = this.zza;
        int iZzc = zzhkrVar.zzc();
        int iZzm = 0;
        for (int i7 = 0; i7 < iZzc; i7++) {
            iZzm += zzm(zzhkrVar.zzd(i7));
        }
        Iterator it = zzhkrVar.zze().iterator();
        while (it.hasNext()) {
            iZzm += zzm((Map.Entry) it.next());
        }
        return iZzm;
    }

    private zzhhw(boolean z7) {
        zzb();
        zzb();
    }
}
