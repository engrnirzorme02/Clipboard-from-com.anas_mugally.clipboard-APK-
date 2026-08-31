package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zztz implements zzwh {
    private final zzgjz zza;
    private long zzb;

    public zztz(List list, List list2) {
        int i7 = zzgjz.zzd;
        zzgjw zzgjwVar = new zzgjw();
        zzghc.zza(list.size() == list2.size());
        for (int i8 = 0; i8 < list.size(); i8++) {
            zzgjwVar.zzf(new zzty((zzwh) list.get(i8), (List) list2.get(i8)));
        }
        this.zza = zzgjwVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzg(long j7) {
        int i7 = 0;
        while (true) {
            zzgjz zzgjzVar = this.zza;
            if (i7 >= zzgjzVar.size()) {
                return;
            }
            ((zzty) zzgjzVar.get(i7)).zzg(j7);
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final long zzi() {
        int i7 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            zzgjz zzgjzVar = this.zza;
            if (i7 >= zzgjzVar.size()) {
                break;
            }
            zzty zztyVar = (zzty) zzgjzVar.get(i7);
            long jZzi = zztyVar.zzi();
            if ((zztyVar.zza().contains(1) || zztyVar.zza().contains(2) || zztyVar.zza().contains(4)) && jZzi != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzi);
            }
            if (jZzi != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzi);
            }
            i7++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.zzb = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j7 = this.zzb;
        return j7 != -9223372036854775807L ? j7 : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final long zzl() {
        int i7 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            zzgjz zzgjzVar = this.zza;
            if (i7 >= zzgjzVar.size()) {
                break;
            }
            long jZzl = ((zzty) zzgjzVar.get(i7)).zzl();
            if (jZzl != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzl);
            }
            i7++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final boolean zzm(zzkl zzklVar) {
        boolean zZzm;
        boolean z7 = false;
        do {
            long jZzl = zzl();
            if (jZzl == Long.MIN_VALUE) {
                break;
            }
            int i7 = 0;
            zZzm = false;
            while (true) {
                zzgjz zzgjzVar = this.zza;
                if (i7 >= zzgjzVar.size()) {
                    break;
                }
                long jZzl2 = ((zzty) zzgjzVar.get(i7)).zzl();
                boolean z8 = jZzl2 != Long.MIN_VALUE && jZzl2 <= zzklVar.zza;
                if (jZzl2 == jZzl || z8) {
                    zZzm |= ((zzty) zzgjzVar.get(i7)).zzm(zzklVar);
                }
                i7++;
            }
            z7 |= zZzm;
        } while (zZzm);
        return z7;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final boolean zzn() {
        int i7 = 0;
        while (true) {
            zzgjz zzgjzVar = this.zza;
            if (i7 >= zzgjzVar.size()) {
                return false;
            }
            if (((zzty) zzgjzVar.get(i7)).zzn()) {
                return true;
            }
            i7++;
        }
    }
}
