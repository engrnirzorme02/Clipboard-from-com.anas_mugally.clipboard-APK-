package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzoy {
    public static final /* synthetic */ int zza = 0;
    private static final zzpl zzb;

    static {
        int i7 = zzos.zza;
        zzb = new zzpn();
    }

    public static void zzA(int i7, List list, zzpy zzpyVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzA(i7, list, z7);
    }

    public static void zzB(int i7, List list, zzpy zzpyVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzC(i7, list, z7);
    }

    public static void zzC(int i7, List list, zzpy zzpyVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzE(i7, list, z7);
    }

    public static void zzD(int i7, List list, zzpy zzpyVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzJ(i7, list, z7);
    }

    public static void zzE(int i7, List list, zzpy zzpyVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzL(i7, list, z7);
    }

    static boolean zzF(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int zza(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzne)) {
            int iZzB = 0;
            while (i7 < size) {
                iZzB += zzln.zzB(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iZzB;
        }
        zzne zzneVar = (zzne) list;
        int iZzB2 = 0;
        while (i7 < size) {
            iZzB2 += zzln.zzB(zzneVar.zze(i7));
            i7++;
        }
        return iZzB2;
    }

    static int zzb(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzln.zzA(i7 << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzln.zzA(i7 << 3) + 8);
    }

    static int zze(List list) {
        return list.size() * 8;
    }

    static int zzf(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzne)) {
            int iZzB = 0;
            while (i7 < size) {
                iZzB += zzln.zzB(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iZzB;
        }
        zzne zzneVar = (zzne) list;
        int iZzB2 = 0;
        while (i7 < size) {
            iZzB2 += zzln.zzB(zzneVar.zze(i7));
            i7++;
        }
        return iZzB2;
    }

    static int zzg(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zznx)) {
            int iZzB = 0;
            while (i7 < size) {
                iZzB += zzln.zzB(((Long) list.get(i7)).longValue());
                i7++;
            }
            return iZzB;
        }
        zznx zznxVar = (zznx) list;
        int iZzB2 = 0;
        while (i7 < size) {
            iZzB2 += zzln.zzB(zznxVar.zze(i7));
            i7++;
        }
        return iZzB2;
    }

    static int zzh(int i7, Object obj, zzow zzowVar) {
        int i8 = i7 << 3;
        if (!(obj instanceof zznt)) {
            return zzln.zzA(i8) + zzln.zzy((zzoi) obj, zzowVar);
        }
        int iZzA = zzln.zzA(i8);
        int iZza = ((zznt) obj).zza();
        return iZzA + zzln.zzA(iZza) + iZza;
    }

    static int zzi(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzne)) {
            int iZzA = 0;
            while (i7 < size) {
                int iIntValue = ((Integer) list.get(i7)).intValue();
                iZzA += zzln.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i7++;
            }
            return iZzA;
        }
        zzne zzneVar = (zzne) list;
        int iZzA2 = 0;
        while (i7 < size) {
            int iZze = zzneVar.zze(i7);
            iZzA2 += zzln.zzA((iZze >> 31) ^ (iZze + iZze));
            i7++;
        }
        return iZzA2;
    }

    static int zzj(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zznx)) {
            int iZzB = 0;
            while (i7 < size) {
                long jLongValue = ((Long) list.get(i7)).longValue();
                iZzB += zzln.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i7++;
            }
            return iZzB;
        }
        zznx zznxVar = (zznx) list;
        int iZzB2 = 0;
        while (i7 < size) {
            long jZze = zznxVar.zze(i7);
            iZzB2 += zzln.zzB((jZze >> 63) ^ (jZze + jZze));
            i7++;
        }
        return iZzB2;
    }

    static int zzk(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzne)) {
            int iZzA = 0;
            while (i7 < size) {
                iZzA += zzln.zzA(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iZzA;
        }
        zzne zzneVar = (zzne) list;
        int iZzA2 = 0;
        while (i7 < size) {
            iZzA2 += zzln.zzA(zzneVar.zze(i7));
            i7++;
        }
        return iZzA2;
    }

    static int zzl(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zznx)) {
            int iZzB = 0;
            while (i7 < size) {
                iZzB += zzln.zzB(((Long) list.get(i7)).longValue());
                i7++;
            }
            return iZzB;
        }
        zznx zznxVar = (zznx) list;
        int iZzB2 = 0;
        while (i7 < size) {
            iZzB2 += zzln.zzB(zznxVar.zze(i7));
            i7++;
        }
        return iZzB2;
    }

    public static zzpl zzm() {
        return zzb;
    }

    static Object zzn(Object obj, int i7, List list, zznh zznhVar, Object obj2, zzpl zzplVar) {
        if (zznhVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zznhVar.zza(iIntValue)) {
                    obj2 = zzo(obj, i7, iIntValue, obj2, zzplVar);
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
            if (zznhVar.zza(iIntValue2)) {
                if (i9 != i8) {
                    list.set(i8, num);
                }
                i8++;
            } else {
                obj2 = zzo(obj, i7, iIntValue2, obj2, zzplVar);
            }
        }
        if (i8 != size) {
            list.subList(i8, size).clear();
        }
        return obj2;
    }

    static Object zzo(Object obj, int i7, int i8, Object obj2, zzpl zzplVar) {
        if (obj2 == null) {
            obj2 = zzplVar.zza(obj);
        }
        zzplVar.zzh(obj2, i7, i8);
        return obj2;
    }

    static void zzp(zzmp zzmpVar, Object obj, Object obj2) {
        zzmt zzmtVar = ((zzna) obj2).zzb;
        if (zzmtVar.zza.isEmpty()) {
            return;
        }
        ((zzna) obj).zzi().zzh(zzmtVar);
    }

    static void zzq(zzpl zzplVar, Object obj, Object obj2) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVarZze = zzndVar.zzc;
        zzpm zzpmVar = ((zznd) obj2).zzc;
        if (!zzpm.zzc().equals(zzpmVar)) {
            if (zzpm.zzc().equals(zzpmVarZze)) {
                zzpmVarZze = zzpm.zze(zzpmVarZze, zzpmVar);
            } else {
                zzpmVarZze.zzd(zzpmVar);
            }
        }
        zzndVar.zzc = zzpmVarZze;
    }

    public static void zzr(int i7, List list, zzpy zzpyVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzc(i7, list, z7);
    }

    public static void zzs(int i7, List list, zzpy zzpyVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzg(i7, list, z7);
    }

    public static void zzt(int i7, List list, zzpy zzpyVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzj(i7, list, z7);
    }

    public static void zzu(int i7, List list, zzpy zzpyVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzl(i7, list, z7);
    }

    public static void zzv(int i7, List list, zzpy zzpyVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzn(i7, list, z7);
    }

    public static void zzw(int i7, List list, zzpy zzpyVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzp(i7, list, z7);
    }

    public static void zzx(int i7, List list, zzpy zzpyVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzs(i7, list, z7);
    }

    public static void zzy(int i7, List list, zzpy zzpyVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzu(i7, list, z7);
    }

    public static void zzz(int i7, List list, zzpy zzpyVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzy(i7, list, z7);
    }
}
