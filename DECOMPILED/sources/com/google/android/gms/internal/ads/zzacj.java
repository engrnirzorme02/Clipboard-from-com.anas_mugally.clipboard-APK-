package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzacj {
    private final Map zza = new LinkedHashMap();

    public final void zza(zzaci zzaciVar) {
        long[] jArr = zzaciVar.zze;
        if (jArr.length > 0) {
            Map map = this.zza;
            if (map.containsKey(Long.valueOf(jArr[0]))) {
                return;
            }
            map.put(Long.valueOf(jArr[0]), zzaciVar);
        }
    }

    public final zzaci zzb() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (zzaci zzaciVar : this.zza.values()) {
            arrayList.add(zzaciVar.zzb);
            arrayList2.add(zzaciVar.zzc);
            arrayList3.add(zzaciVar.zzd);
            arrayList4.add(zzaciVar.zze);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int i7 = (int) length;
        zzghc.zze(length == ((long) i7), "the total number of elements (%s) in the arrays must fit in an int", length);
        int[] iArr3 = new int[i7];
        int i8 = 0;
        for (int[] iArr4 : iArr) {
            int length2 = iArr4.length;
            System.arraycopy(iArr4, 0, iArr3, i8, length2);
            i8 += length2;
        }
        return new zzaci(iArr3, zzgnh.zza((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), zzgnh.zza((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), zzgnh.zza((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }
}
