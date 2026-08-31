package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzhkm {
    public static final /* synthetic */ int zza = 0;
    private static final zzhkv zzb;

    static {
        int i7 = zzhgo.zza;
        zzb = new zzhkx();
    }

    static int zzA(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzhhm.zzA(i7 << 3) + 4);
    }

    static int zzB(List list) {
        return list.size() * 8;
    }

    static int zzC(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzhhm.zzA(i7 << 3) + 8);
    }

    static int zzD(int i7, Object obj, zzhkk zzhkkVar) {
        int iZzA;
        int iZzaT;
        int iZzA2;
        int i8 = i7 << 3;
        if (obj instanceof zzhjc) {
            iZzA = zzhhm.zzA(i8);
            iZzaT = ((zzhjc) obj).zzb();
            iZzA2 = zzhhm.zzA(iZzaT);
        } else {
            iZzA = zzhhm.zzA(i8);
            iZzaT = ((zzhgk) obj).zzaT(zzhkkVar);
            iZzA2 = zzhhm.zzA(iZzaT);
        }
        return iZzA + iZzA2 + iZzaT;
    }

    @Deprecated
    static int zzE(int i7, zzhjs zzhjsVar, zzhkk zzhkkVar) {
        int iZzA = zzhhm.zzA(i7 << 3);
        return iZzA + iZzA + ((zzhgk) zzhjsVar).zzaT(zzhkkVar);
    }

    public static zzhkv zzF() {
        return zzb;
    }

    static boolean zzG(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void zzH(zzhhs zzhhsVar, Object obj, Object obj2) {
        if (((zzhid) obj2).zza.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzI(zzhkv zzhkvVar, Object obj, Object obj2) {
        zzhih zzhihVar = (zzhih) obj;
        zzhkw zzhkwVarZzc = zzhihVar.zzt;
        zzhkw zzhkwVar = ((zzhih) obj2).zzt;
        if (!zzhkw.zza().equals(zzhkwVar)) {
            if (zzhkw.zza().equals(zzhkwVarZzc)) {
                zzhkwVarZzc = zzhkw.zzc(zzhkwVarZzc, zzhkwVar);
            } else {
                zzhkwVarZzc.zzm(zzhkwVar);
            }
        }
        zzhihVar.zzt = zzhkwVarZzc;
    }

    static Object zzJ(Object obj, int i7, List list, zzhin zzhinVar, Object obj2, zzhkv zzhkvVar) {
        if (zzhinVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzhinVar.zza(iIntValue)) {
                    obj2 = zzK(obj, i7, iIntValue, obj2, zzhkvVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            Integer num = (Integer) list.get(i9);
            int iIntValue2 = num.intValue();
            if (zzhinVar.zza(iIntValue2)) {
                if (i9 != i8) {
                    list.set(i8, num);
                }
                i8++;
            } else {
                obj2 = zzK(obj, i7, iIntValue2, obj2, zzhkvVar);
            }
        }
        if (i8 != size) {
            list.subList(i8, size).clear();
        }
        return obj2;
    }

    static Object zzK(Object obj, int i7, int i8, Object obj2, zzhkv zzhkvVar) {
        if (obj2 == null) {
            obj2 = zzhkvVar.zzh(obj);
        }
        zzhkvVar.zza(obj2, i7, i8);
        return obj2;
    }

    public static void zza(int i7, List list, zzhlk zzhlkVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzC(i7, list, z7);
    }

    public static void zzb(int i7, List list, zzhlk zzhlkVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzB(i7, list, z7);
    }

    public static void zzc(int i7, List list, zzhlk zzhlkVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzy(i7, list, z7);
    }

    public static void zzd(int i7, List list, zzhlk zzhlkVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzz(i7, list, z7);
    }

    public static void zze(int i7, List list, zzhlk zzhlkVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzL(i7, list, z7);
    }

    public static void zzf(int i7, List list, zzhlk zzhlkVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzA(i7, list, z7);
    }

    public static void zzg(int i7, List list, zzhlk zzhlkVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzJ(i7, list, z7);
    }

    public static void zzh(int i7, List list, zzhlk zzhlkVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzw(i7, list, z7);
    }

    public static void zzi(int i7, List list, zzhlk zzhlkVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzH(i7, list, z7);
    }

    public static void zzj(int i7, List list, zzhlk zzhlkVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzK(i7, list, z7);
    }

    public static void zzk(int i7, List list, zzhlk zzhlkVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzx(i7, list, z7);
    }

    public static void zzl(int i7, List list, zzhlk zzhlkVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzI(i7, list, z7);
    }

    public static void zzm(int i7, List list, zzhlk zzhlkVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzD(i7, list, z7);
    }

    public static void zzn(int i7, List list, zzhlk zzhlkVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzE(i7, list, z7);
    }

    public static void zzo(int i7, List list, zzhlk zzhlkVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzF(i7, list);
    }

    public static void zzp(int i7, List list, zzhlk zzhlkVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzG(i7, list);
    }

    public static void zzq(int i7, List list, zzhlk zzhlkVar, zzhkk zzhkkVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((zzhhn) zzhlkVar).zzr(i7, list.get(i8), zzhkkVar);
        }
    }

    public static void zzr(int i7, List list, zzhlk zzhlkVar, zzhkk zzhkkVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((zzhhn) zzhlkVar).zzs(i7, list.get(i8), zzhkkVar);
        }
    }

    static int zzs(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhjg)) {
            int iZzB = 0;
            while (i7 < size) {
                iZzB += zzhhm.zzB(((Long) list.get(i7)).longValue());
                i7++;
            }
            return iZzB;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        int iZzB2 = 0;
        while (i7 < size) {
            iZzB2 += zzhhm.zzB(zzhjgVar.zzc(i7));
            i7++;
        }
        return iZzB2;
    }

    static int zzt(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhjg)) {
            int iZzB = 0;
            while (i7 < size) {
                iZzB += zzhhm.zzB(((Long) list.get(i7)).longValue());
                i7++;
            }
            return iZzB;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        int iZzB2 = 0;
        while (i7 < size) {
            iZzB2 += zzhhm.zzB(zzhjgVar.zzc(i7));
            i7++;
        }
        return iZzB2;
    }

    static int zzu(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhjg)) {
            int iZzB = 0;
            while (i7 < size) {
                long jLongValue = ((Long) list.get(i7)).longValue();
                iZzB += zzhhm.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i7++;
            }
            return iZzB;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        int iZzB2 = 0;
        while (i7 < size) {
            long jZzc = zzhjgVar.zzc(i7);
            iZzB2 += zzhhm.zzB((jZzc >> 63) ^ (jZzc + jZzc));
            i7++;
        }
        return iZzB2;
    }

    static int zzv(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhii)) {
            int iZzB = 0;
            while (i7 < size) {
                iZzB += zzhhm.zzB(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iZzB;
        }
        zzhii zzhiiVar = (zzhii) list;
        int iZzB2 = 0;
        while (i7 < size) {
            iZzB2 += zzhhm.zzB(zzhiiVar.zzf(i7));
            i7++;
        }
        return iZzB2;
    }

    static int zzw(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhii)) {
            int iZzB = 0;
            while (i7 < size) {
                iZzB += zzhhm.zzB(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iZzB;
        }
        zzhii zzhiiVar = (zzhii) list;
        int iZzB2 = 0;
        while (i7 < size) {
            iZzB2 += zzhhm.zzB(zzhiiVar.zzf(i7));
            i7++;
        }
        return iZzB2;
    }

    static int zzx(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhii)) {
            int iZzA = 0;
            while (i7 < size) {
                iZzA += zzhhm.zzA(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iZzA;
        }
        zzhii zzhiiVar = (zzhii) list;
        int iZzA2 = 0;
        while (i7 < size) {
            iZzA2 += zzhhm.zzA(zzhiiVar.zzf(i7));
            i7++;
        }
        return iZzA2;
    }

    static int zzy(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhii)) {
            int iZzA = 0;
            while (i7 < size) {
                int iIntValue = ((Integer) list.get(i7)).intValue();
                iZzA += zzhhm.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i7++;
            }
            return iZzA;
        }
        zzhii zzhiiVar = (zzhii) list;
        int iZzA2 = 0;
        while (i7 < size) {
            int iZzf = zzhiiVar.zzf(i7);
            iZzA2 += zzhhm.zzA((iZzf >> 31) ^ (iZzf + iZzf));
            i7++;
        }
        return iZzA2;
    }

    static int zzz(List list) {
        return list.size() * 4;
    }
}
