package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajw implements zzacx {
    private final zzacx zzb;
    private final zzajt zzc;
    private final SparseArray zzd = new SparseArray();
    private boolean zze;

    public zzajw(zzacx zzacxVar, zzajt zzajtVar) {
        this.zzb = zzacxVar;
        this.zzc = zzajtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final zzaeb zzu(int i7, int i8) {
        if (i8 != 3) {
            this.zze = true;
            return this.zzb.zzu(i7, i8);
        }
        SparseArray sparseArray = this.zzd;
        zzajy zzajyVar = (zzajy) sparseArray.get(i7);
        if (zzajyVar != null) {
            return zzajyVar;
        }
        zzajy zzajyVar2 = new zzajy(this.zzb.zzu(i7, 3), this.zzc);
        sparseArray.put(i7, zzajyVar2);
        return zzajyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final void zzv() {
        this.zzb.zzv();
        if (!this.zze) {
            return;
        }
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.zzd;
            if (i7 >= sparseArray.size()) {
                return;
            }
            ((zzajy) sparseArray.valueAt(i7)).zza(true);
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final void zzw(zzadv zzadvVar) {
        this.zzb.zzw(zzadvVar);
    }
}
