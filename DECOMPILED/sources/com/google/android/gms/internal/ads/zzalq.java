package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzalq implements zzajq {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzalq(List list) {
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.zzb = new long[size + size];
        for (int i7 = 0; i7 < list.size(); i7++) {
            zzalg zzalgVar = (zzalg) list.get(i7);
            long[] jArr = this.zzb;
            int i8 = i7 + i7;
            jArr[i8] = zzalgVar.zzb;
            jArr[i8 + 1] = zzalgVar.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzajq
    public final int zza() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzajq
    public final long zzb(int i7) {
        zzghc.zza(i7 >= 0);
        long[] jArr = this.zzc;
        zzghc.zza(i7 < jArr.length);
        return jArr[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzajq
    public final List zzc(long j7) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        while (true) {
            List list = this.zza;
            if (i7 >= list.size()) {
                break;
            }
            long[] jArr = this.zzb;
            int i8 = i7 + i7;
            if (jArr[i8] <= j7 && j7 < jArr[i8 + 1]) {
                zzalg zzalgVar = (zzalg) list.get(i7);
                zzcl zzclVar = zzalgVar.zza;
                if (zzclVar.zze == -3.4028235E38f) {
                    arrayList2.add(zzalgVar);
                } else {
                    arrayList.add(zzclVar);
                }
            }
            i7++;
        }
        Collections.sort(arrayList2, zzalp.zza);
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            zzck zzckVarZza = ((zzalg) arrayList2.get(i9)).zza.zza();
            zzckVarZza.zzf((-1) - i9, 1);
            arrayList.add(zzckVarZza.zzr());
        }
        return arrayList;
    }
}
