package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzand {
    private static final zzanu<?, ?> zza = new zzanw();

    @Deprecated
    static int zza(int i7, zzamm zzammVar, zzanb zzanbVar) {
        return (zzakn.zzh(i7) << 1) + ((zzajm) zzammVar).zza(zzanbVar);
    }

    static int zzb(int i7, List<Integer> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzakn.zzh(i7));
    }

    static int zzc(int i7, List<?> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzakn.zzb(i7, 0);
    }

    static int zzd(int i7, List<?> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzakn.zza(i7, 0L);
    }

    static int zze(int i7, List<Integer> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzakn.zzh(i7));
    }

    static int zzf(int i7, List<Long> list, boolean z7) {
        if (list.size() == 0) {
            return 0;
        }
        return zzf(list) + (list.size() * zzakn.zzh(i7));
    }

    static int zzg(int i7, List<Integer> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzakn.zzh(i7));
    }

    static int zzh(int i7, List<Long> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzh(list) + (size * zzakn.zzh(i7));
    }

    static int zzi(int i7, List<Integer> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzi(list) + (size * zzakn.zzh(i7));
    }

    static int zzj(int i7, List<Long> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zzakn.zzh(i7));
    }

    public static void zzk(int i7, List<Integer> list, zzaol zzaolVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzk(i7, list, z7);
    }

    public static void zzl(int i7, List<Long> list, zzaol zzaolVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzl(i7, list, z7);
    }

    public static void zzm(int i7, List<Integer> list, zzaol zzaolVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzm(i7, list, z7);
    }

    public static void zzn(int i7, List<Long> list, zzaol zzaolVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzn(i7, list, z7);
    }

    private static int zza(zzajm zzajmVar, zzanb zzanbVar) {
        return zzakn.zzd(zzajmVar.zza(zzanbVar));
    }

    static int zzc(List<?> list) {
        return list.size() << 2;
    }

    static int zzd(List<?> list) {
        return list.size() << 3;
    }

    static int zzb(List<Integer> list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzali)) {
            int iZza = 0;
            while (i7 < size) {
                iZza += zzakn.zza(list.get(i7).intValue());
                i7++;
            }
            return iZza;
        }
        zzali zzaliVar = (zzali) list;
        int iZza2 = 0;
        while (i7 < size) {
            iZza2 += zzakn.zza(zzaliVar.zzb(i7));
            i7++;
        }
        return iZza2;
    }

    public static void zzc(int i7, List<Integer> list, zzaol zzaolVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzc(i7, list, z7);
    }

    public static void zzd(int i7, List<Integer> list, zzaol zzaolVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzd(i7, list, z7);
    }

    static int zze(List<Integer> list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzali)) {
            int iZzc = 0;
            while (i7 < size) {
                iZzc += zzakn.zzc(list.get(i7).intValue());
                i7++;
            }
            return iZzc;
        }
        zzali zzaliVar = (zzali) list;
        int iZzc2 = 0;
        while (i7 < size) {
            iZzc2 += zzakn.zzc(zzaliVar.zzb(i7));
            i7++;
        }
        return iZzc2;
    }

    static int zzf(List<Long> list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzalx)) {
            int iZzb = 0;
            while (i7 < size) {
                iZzb += zzakn.zzb(list.get(i7).longValue());
                i7++;
            }
            return iZzb;
        }
        zzalx zzalxVar = (zzalx) list;
        int iZzb2 = 0;
        while (i7 < size) {
            iZzb2 += zzakn.zzb(zzalxVar.zzb(i7));
            i7++;
        }
        return iZzb2;
    }

    static int zzg(List<Integer> list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzali)) {
            int iZzg = 0;
            while (i7 < size) {
                iZzg += zzakn.zzg(list.get(i7).intValue());
                i7++;
            }
            return iZzg;
        }
        zzali zzaliVar = (zzali) list;
        int iZzg2 = 0;
        while (i7 < size) {
            iZzg2 += zzakn.zzg(zzaliVar.zzb(i7));
            i7++;
        }
        return iZzg2;
    }

    static int zzh(List<Long> list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzalx)) {
            int iZzd = 0;
            while (i7 < size) {
                iZzd += zzakn.zzd(list.get(i7).longValue());
                i7++;
            }
            return iZzd;
        }
        zzalx zzalxVar = (zzalx) list;
        int iZzd2 = 0;
        while (i7 < size) {
            iZzd2 += zzakn.zzd(zzalxVar.zzb(i7));
            i7++;
        }
        return iZzd2;
    }

    static int zzi(List<Integer> list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzali)) {
            int iZzi = 0;
            while (i7 < size) {
                iZzi += zzakn.zzi(list.get(i7).intValue());
                i7++;
            }
            return iZzi;
        }
        zzali zzaliVar = (zzali) list;
        int iZzi2 = 0;
        while (i7 < size) {
            iZzi2 += zzakn.zzi(zzaliVar.zzb(i7));
            i7++;
        }
        return iZzi2;
    }

    static int zzj(List<Long> list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzalx)) {
            int iZze = 0;
            while (i7 < size) {
                iZze += zzakn.zze(list.get(i7).longValue());
                i7++;
            }
            return iZze;
        }
        zzalx zzalxVar = (zzalx) list;
        int iZze2 = 0;
        while (i7 < size) {
            iZze2 += zzakn.zze(zzalxVar.zzb(i7));
            i7++;
        }
        return iZze2;
    }

    static int zza(int i7, List<?> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzakn.zza(i7, true);
    }

    static int zza(List<?> list) {
        return list.size();
    }

    static int zza(int i7, List<zzajv> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzh = size * zzakn.zzh(i7);
        for (int i8 = 0; i8 < list.size(); i8++) {
            iZzh += zzakn.zza(list.get(i8));
        }
        return iZzh;
    }

    static int zzb(int i7, List<?> list, zzanb<?> zzanbVar) {
        int iZza;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzh = zzakn.zzh(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = list.get(i8);
            if (obj instanceof zzalu) {
                iZza = zzakn.zza((zzalu) obj);
            } else {
                iZza = zza((zzajm) obj, (zzanb) zzanbVar);
            }
            iZzh += iZza;
        }
        return iZzh;
    }

    public static void zze(int i7, List<Long> list, zzaol zzaolVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zze(i7, list, z7);
    }

    public static void zzf(int i7, List<Float> list, zzaol zzaolVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzf(i7, list, z7);
    }

    public static void zzg(int i7, List<Integer> list, zzaol zzaolVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzg(i7, list, z7);
    }

    public static void zzh(int i7, List<Long> list, zzaol zzaolVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzh(i7, list, z7);
    }

    public static void zzi(int i7, List<Integer> list, zzaol zzaolVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzi(i7, list, z7);
    }

    public static void zzj(int i7, List<Long> list, zzaol zzaolVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzj(i7, list, z7);
    }

    static int zza(int i7, List<zzamm> list, zzanb<?> zzanbVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZza = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iZza += zza(i7, list.get(i8), (zzanb) zzanbVar);
        }
        return iZza;
    }

    static int zza(int i7, Object obj, zzanb<?> zzanbVar) {
        if (obj instanceof zzalu) {
            return zzakn.zzb(i7, (zzalu) obj);
        }
        return zzakn.zzh(i7) + zza((zzajm) obj, (zzanb) zzanbVar);
    }

    static int zzb(int i7, List<?> list) {
        int iZza;
        int iZza2;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzh = zzakn.zzh(i7) * size;
        if (!(list instanceof zzalt)) {
            while (i8 < size) {
                Object obj = list.get(i8);
                if (obj instanceof zzajv) {
                    iZza = zzakn.zza((zzajv) obj);
                } else {
                    iZza = zzakn.zza((String) obj);
                }
                iZzh += iZza;
                i8++;
            }
            return iZzh;
        }
        zzalt zzaltVar = (zzalt) list;
        while (i8 < size) {
            Object objZza = zzaltVar.zza(i8);
            if (objZza instanceof zzajv) {
                iZza2 = zzakn.zza((zzajv) objZza);
            } else {
                iZza2 = zzakn.zza((String) objZza);
            }
            iZzh += iZza2;
            i8++;
        }
        return iZzh;
    }

    public static zzanu<?, ?> zza() {
        return zza;
    }

    static <UT, UB> UB zza(Object obj, int i7, List<Integer> list, zzalj zzaljVar, UB ub, zzanu<UT, UB> zzanuVar) {
        if (zzaljVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                Integer num = list.get(i9);
                int iIntValue = num.intValue();
                if (zzaljVar.zza(iIntValue)) {
                    if (i9 != i8) {
                        list.set(i8, num);
                    }
                    i8++;
                } else {
                    ub = (UB) zza(obj, i7, iIntValue, ub, zzanuVar);
                }
            }
            if (i8 != size) {
                list.subList(i8, size).clear();
            }
            return ub;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue2 = it.next().intValue();
            if (!zzaljVar.zza(iIntValue2)) {
                ub = (UB) zza(obj, i7, iIntValue2, ub, zzanuVar);
                it.remove();
            }
        }
        return ub;
    }

    public static void zzb(int i7, List<Double> list, zzaol zzaolVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzb(i7, list, z7);
    }

    public static void zzb(int i7, List<?> list, zzaol zzaolVar, zzanb<?> zzanbVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzb(i7, list, (zzanb) zzanbVar);
    }

    static <UT, UB> UB zza(Object obj, int i7, int i8, UB ub, zzanu<UT, UB> zzanuVar) {
        if (ub == null) {
            ub = zzanuVar.zzc(obj);
        }
        zzanuVar.zzb(ub, i7, i8);
        return ub;
    }

    public static void zzb(int i7, List<String> list, zzaol zzaolVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzb(i7, list);
    }

    static <T, FT extends zzakz<FT>> void zza(zzakw<FT> zzakwVar, T t7, T t8) {
        zzakx<T> zzakxVarZza = zzakwVar.zza(t8);
        if (zzakxVarZza.zza.isEmpty()) {
            return;
        }
        zzakwVar.zzb(t7).zza((zzakx) zzakxVarZza);
    }

    static <T> void zza(zzamf zzamfVar, T t7, T t8, long j7) {
        zzanz.zza(t7, j7, zzamfVar.zza(zzanz.zze(t7, j7), zzanz.zze(t8, j7)));
    }

    static <T, UT, UB> void zza(zzanu<UT, UB> zzanuVar, T t7, T t8) {
        zzanuVar.zzc(t7, zzanuVar.zza(zzanuVar.zzd(t7), zzanuVar.zzd(t8)));
    }

    public static void zza(Class<?> cls) {
        zzalf.class.isAssignableFrom(cls);
    }

    public static void zza(int i7, List<Boolean> list, zzaol zzaolVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zza(i7, list, z7);
    }

    public static void zza(int i7, List<zzajv> list, zzaol zzaolVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zza(i7, list);
    }

    public static void zza(int i7, List<?> list, zzaol zzaolVar, zzanb<?> zzanbVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zza(i7, list, (zzanb) zzanbVar);
    }

    static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
