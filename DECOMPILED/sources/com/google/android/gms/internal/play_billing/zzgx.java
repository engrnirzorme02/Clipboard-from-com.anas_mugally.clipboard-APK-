package com.google.android.gms.internal.play_billing;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzgx {
    public static final /* synthetic */ int zza = 0;
    private static final zzhh zzb;

    static {
        int i7 = zzgs.zza;
        zzb = new zzhj();
    }

    public static void zzA(int i7, List list, zzhu zzhuVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzC(i7, list, z7);
    }

    public static void zzB(int i7, List list, zzhu zzhuVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzE(i7, list, z7);
    }

    public static void zzC(int i7, List list, zzhu zzhuVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzJ(i7, list, z7);
    }

    public static void zzD(int i7, List list, zzhu zzhuVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzL(i7, list, z7);
    }

    static boolean zzE(Object obj, Object obj2) {
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
        if (!(list instanceof zzfj)) {
            int iZzD = 0;
            while (i7 < size) {
                iZzD += zzep.zzD(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iZzD;
        }
        zzfj zzfjVar = (zzfj) list;
        int iZzD2 = 0;
        while (i7 < size) {
            iZzD2 += zzep.zzD(zzfjVar.zze(i7));
            i7++;
        }
        return iZzD2;
    }

    static int zzb(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzep.zzC(i7 << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzep.zzC(i7 << 3) + 8);
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
        if (!(list instanceof zzfj)) {
            int iZzD = 0;
            while (i7 < size) {
                iZzD += zzep.zzD(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iZzD;
        }
        zzfj zzfjVar = (zzfj) list;
        int iZzD2 = 0;
        while (i7 < size) {
            iZzD2 += zzep.zzD(zzfjVar.zze(i7));
            i7++;
        }
        return iZzD2;
    }

    static int zzg(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzga)) {
            int iZzD = 0;
            while (i7 < size) {
                iZzD += zzep.zzD(((Long) list.get(i7)).longValue());
                i7++;
            }
            return iZzD;
        }
        zzga zzgaVar = (zzga) list;
        int iZzD2 = 0;
        while (i7 < size) {
            iZzD2 += zzep.zzD(zzgaVar.zze(i7));
            i7++;
        }
        return iZzD2;
    }

    static int zzh(int i7, Object obj, zzgv zzgvVar) {
        int i8 = i7 << 3;
        if (!(obj instanceof zzfw)) {
            return zzep.zzC(i8) + zzep.zzA((zzgl) obj, zzgvVar);
        }
        int iZzC = zzep.zzC(i8);
        int iZza = ((zzfw) obj).zza();
        return iZzC + zzep.zzC(iZza) + iZza;
    }

    static int zzi(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfj)) {
            int iZzC = 0;
            while (i7 < size) {
                int iIntValue = ((Integer) list.get(i7)).intValue();
                iZzC += zzep.zzC((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i7++;
            }
            return iZzC;
        }
        zzfj zzfjVar = (zzfj) list;
        int iZzC2 = 0;
        while (i7 < size) {
            int iZze = zzfjVar.zze(i7);
            iZzC2 += zzep.zzC((iZze >> 31) ^ (iZze + iZze));
            i7++;
        }
        return iZzC2;
    }

    static int zzj(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzga)) {
            int iZzD = 0;
            while (i7 < size) {
                long jLongValue = ((Long) list.get(i7)).longValue();
                iZzD += zzep.zzD((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i7++;
            }
            return iZzD;
        }
        zzga zzgaVar = (zzga) list;
        int iZzD2 = 0;
        while (i7 < size) {
            long jZze = zzgaVar.zze(i7);
            iZzD2 += zzep.zzD((jZze >> 63) ^ (jZze + jZze));
            i7++;
        }
        return iZzD2;
    }

    static int zzk(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfj)) {
            int iZzC = 0;
            while (i7 < size) {
                iZzC += zzep.zzC(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iZzC;
        }
        zzfj zzfjVar = (zzfj) list;
        int iZzC2 = 0;
        while (i7 < size) {
            iZzC2 += zzep.zzC(zzfjVar.zze(i7));
            i7++;
        }
        return iZzC2;
    }

    static int zzl(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzga)) {
            int iZzD = 0;
            while (i7 < size) {
                iZzD += zzep.zzD(((Long) list.get(i7)).longValue());
                i7++;
            }
            return iZzD;
        }
        zzga zzgaVar = (zzga) list;
        int iZzD2 = 0;
        while (i7 < size) {
            iZzD2 += zzep.zzD(zzgaVar.zze(i7));
            i7++;
        }
        return iZzD2;
    }

    public static zzhh zzm() {
        return zzb;
    }

    static Object zzn(Object obj, int i7, int i8, Object obj2, zzhh zzhhVar) {
        if (obj2 == null) {
            obj2 = zzhhVar.zza(obj);
        }
        ((zzhi) obj2).zzj(i7 << 3, Long.valueOf(i8));
        return obj2;
    }

    static void zzo(zzev zzevVar, Object obj, Object obj2) {
        if (((zzff) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzp(zzhh zzhhVar, Object obj, Object obj2) {
        zzfi zzfiVar = (zzfi) obj;
        zzhi zzhiVarZze = zzfiVar.zzc;
        zzhi zzhiVar = ((zzfi) obj2).zzc;
        if (!zzhi.zzc().equals(zzhiVar)) {
            if (zzhi.zzc().equals(zzhiVarZze)) {
                zzhiVarZze = zzhi.zze(zzhiVarZze, zzhiVar);
            } else {
                zzhiVarZze.zzd(zzhiVar);
            }
        }
        zzfiVar.zzc = zzhiVarZze;
    }

    public static void zzq(int i7, List list, zzhu zzhuVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzc(i7, list, z7);
    }

    public static void zzr(int i7, List list, zzhu zzhuVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzg(i7, list, z7);
    }

    public static void zzs(int i7, List list, zzhu zzhuVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzj(i7, list, z7);
    }

    public static void zzt(int i7, List list, zzhu zzhuVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzl(i7, list, z7);
    }

    public static void zzu(int i7, List list, zzhu zzhuVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzn(i7, list, z7);
    }

    public static void zzv(int i7, List list, zzhu zzhuVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzp(i7, list, z7);
    }

    public static void zzw(int i7, List list, zzhu zzhuVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzs(i7, list, z7);
    }

    public static void zzx(int i7, List list, zzhu zzhuVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzu(i7, list, z7);
    }

    public static void zzy(int i7, List list, zzhu zzhuVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzy(i7, list, z7);
    }

    public static void zzz(int i7, List list, zzhu zzhuVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzA(i7, list, z7);
    }
}
