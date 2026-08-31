package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfs implements zzga {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzge zzd;

    protected zzfs(boolean z7) {
        this.zza = z7;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zze(zzgy zzgyVar) {
        zzgyVar.getClass();
        ArrayList arrayList = this.zzb;
        if (arrayList.contains(zzgyVar)) {
            return;
        }
        arrayList.add(zzgyVar);
        this.zzc++;
    }

    protected final void zzf(zzge zzgeVar) {
        for (int i7 = 0; i7 < this.zzc; i7++) {
            ((zzgy) this.zzb.get(i7)).zza(this, zzgeVar, this.zza);
        }
    }

    protected final void zzg(zzge zzgeVar) {
        this.zzd = zzgeVar;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            ((zzgy) this.zzb.get(i7)).zzb(this, zzgeVar, this.zza);
        }
    }

    protected final void zzh(int i7) {
        zzge zzgeVar = this.zzd;
        String str = zzeo.zza;
        for (int i8 = 0; i8 < this.zzc; i8++) {
            ((zzgy) this.zzb.get(i8)).zzc(this, zzgeVar, this.zza, i7);
        }
    }

    protected final void zzi() {
        zzge zzgeVar = this.zzd;
        String str = zzeo.zza;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            ((zzgy) this.zzb.get(i7)).zzd(this, zzgeVar, this.zza);
        }
        this.zzd = null;
    }
}
