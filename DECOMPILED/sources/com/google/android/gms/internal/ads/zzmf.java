package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmf {
    private final zzr zza;
    private final SparseArray zzb;

    public zzmf(zzr zzrVar, SparseArray sparseArray) {
        this.zza = zzrVar;
        SparseArray sparseArray2 = new SparseArray(zzrVar.zzb());
        for (int i7 = 0; i7 < zzrVar.zzb(); i7++) {
            int iZzc = zzrVar.zzc(i7);
            zzme zzmeVar = (zzme) sparseArray.get(iZzc);
            zzmeVar.getClass();
            sparseArray2.append(iZzc, zzmeVar);
        }
        this.zzb = sparseArray2;
    }

    public final zzme zza(int i7) {
        zzme zzmeVar = (zzme) this.zzb.get(i7);
        zzmeVar.getClass();
        return zzmeVar;
    }

    public final boolean zzb(int i7) {
        return this.zza.zza(i7);
    }

    public final int zzc() {
        return this.zza.zzb();
    }

    public final int zzd(int i7) {
        return this.zza.zzc(i7);
    }
}
