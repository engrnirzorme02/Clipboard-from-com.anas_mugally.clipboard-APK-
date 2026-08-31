package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zznz {
    public static final /* synthetic */ int zza = 0;
    private static final zzoi zzb;

    static {
        int i7 = zznu.zza;
        zzb = new zzok();
    }

    public static zzoi zzA() {
        return zzb;
    }

    static boolean zzB(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void zzC(zzls zzlsVar, Object obj, Object obj2) {
        if (((zzmc) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzD(zzoi zzoiVar, Object obj, Object obj2) {
        zzmf zzmfVar = (zzmf) obj;
        zzoj zzojVarZzc = zzmfVar.zzc;
        zzoj zzojVar = ((zzmf) obj2).zzc;
        if (!zzoj.zza().equals(zzojVar)) {
            if (zzoj.zza().equals(zzojVarZzc)) {
                zzojVarZzc = zzoj.zzc(zzojVarZzc, zzojVar);
            } else {
                zzojVarZzc.zzl(zzojVar);
            }
        }
        zzmfVar.zzc = zzojVarZzc;
    }

    static Object zzE(Object obj, int i7, int i8, Object obj2, zzoi zzoiVar) {
        if (obj2 == null) {
            obj2 = zzoiVar.zza(obj);
        }
        ((zzoj) obj2).zzk(i7 << 3, Long.valueOf(i8));
        return obj2;
    }

    public static void zza(int i7, List list, zzov zzovVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzC(i7, list, z7);
    }

    public static void zzb(int i7, List list, zzov zzovVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzB(i7, list, z7);
    }

    public static void zzc(int i7, List list, zzov zzovVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzy(i7, list, z7);
    }

    public static void zzd(int i7, List list, zzov zzovVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzz(i7, list, z7);
    }

    public static void zze(int i7, List list, zzov zzovVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzL(i7, list, z7);
    }

    public static void zzf(int i7, List list, zzov zzovVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzA(i7, list, z7);
    }

    public static void zzg(int i7, List list, zzov zzovVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzJ(i7, list, z7);
    }

    public static void zzh(int i7, List list, zzov zzovVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzw(i7, list, z7);
    }

    public static void zzi(int i7, List list, zzov zzovVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzH(i7, list, z7);
    }

    public static void zzj(int i7, List list, zzov zzovVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzK(i7, list, z7);
    }

    public static void zzk(int i7, List list, zzov zzovVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzx(i7, list, z7);
    }

    public static void zzl(int i7, List list, zzov zzovVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzI(i7, list, z7);
    }

    public static void zzm(int i7, List list, zzov zzovVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzD(i7, list, z7);
    }

    public static void zzn(int i7, List list, zzov zzovVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzE(i7, list, z7);
    }

    static int zzo(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzna)) {
            int iZzA = 0;
            while (i7 < size) {
                iZzA += zzlm.zzA(((Long) list.get(i7)).longValue());
                i7++;
            }
            return iZzA;
        }
        zzna zznaVar = (zzna) list;
        int iZzA2 = 0;
        while (i7 < size) {
            iZzA2 += zzlm.zzA(zznaVar.zzc(i7));
            i7++;
        }
        return iZzA2;
    }

    static int zzp(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzna)) {
            int iZzA = 0;
            while (i7 < size) {
                iZzA += zzlm.zzA(((Long) list.get(i7)).longValue());
                i7++;
            }
            return iZzA;
        }
        zzna zznaVar = (zzna) list;
        int iZzA2 = 0;
        while (i7 < size) {
            iZzA2 += zzlm.zzA(zznaVar.zzc(i7));
            i7++;
        }
        return iZzA2;
    }

    static int zzq(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzna)) {
            int iZzA = 0;
            while (i7 < size) {
                long jLongValue = ((Long) list.get(i7)).longValue();
                iZzA += zzlm.zzA((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i7++;
            }
            return iZzA;
        }
        zzna zznaVar = (zzna) list;
        int iZzA2 = 0;
        while (i7 < size) {
            long jZzc = zznaVar.zzc(i7);
            iZzA2 += zzlm.zzA((jZzc >> 63) ^ (jZzc + jZzc));
            i7++;
        }
        return iZzA2;
    }

    static int zzr(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int iZzA = 0;
            while (i7 < size) {
                iZzA += zzlm.zzA(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iZzA;
        }
        zzmg zzmgVar = (zzmg) list;
        int iZzA2 = 0;
        while (i7 < size) {
            iZzA2 += zzlm.zzA(zzmgVar.zzf(i7));
            i7++;
        }
        return iZzA2;
    }

    static int zzs(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int iZzA = 0;
            while (i7 < size) {
                iZzA += zzlm.zzA(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iZzA;
        }
        zzmg zzmgVar = (zzmg) list;
        int iZzA2 = 0;
        while (i7 < size) {
            iZzA2 += zzlm.zzA(zzmgVar.zzf(i7));
            i7++;
        }
        return iZzA2;
    }

    static int zzt(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int iZzz = 0;
            while (i7 < size) {
                iZzz += zzlm.zzz(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iZzz;
        }
        zzmg zzmgVar = (zzmg) list;
        int iZzz2 = 0;
        while (i7 < size) {
            iZzz2 += zzlm.zzz(zzmgVar.zzf(i7));
            i7++;
        }
        return iZzz2;
    }

    static int zzu(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int iZzz = 0;
            while (i7 < size) {
                int iIntValue = ((Integer) list.get(i7)).intValue();
                iZzz += zzlm.zzz((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i7++;
            }
            return iZzz;
        }
        zzmg zzmgVar = (zzmg) list;
        int iZzz2 = 0;
        while (i7 < size) {
            int iZzf = zzmgVar.zzf(i7);
            iZzz2 += zzlm.zzz((iZzf >> 31) ^ (iZzf + iZzf));
            i7++;
        }
        return iZzz2;
    }

    static int zzv(List list) {
        return list.size() * 4;
    }

    static int zzw(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzlm.zzz(i7 << 3) + 4);
    }

    static int zzx(List list) {
        return list.size() * 8;
    }

    static int zzy(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzlm.zzz(i7 << 3) + 8);
    }

    static int zzz(int i7, Object obj, zznx zznxVar) {
        int i8 = i7 << 3;
        if (!(obj instanceof zzmw)) {
            return zzlm.zzz(i8) + zzlm.zzD((zznm) obj, zznxVar);
        }
        int iZzz = zzlm.zzz(i8);
        int iZzb = ((zzmw) obj).zzb();
        return iZzz + zzlm.zzz(iZzb) + iZzb;
    }
}
