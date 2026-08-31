package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzav {
    private final zzq zza = new zzq();

    public final zzav zza(int i7) {
        this.zza.zza(i7);
        return this;
    }

    public final zzav zzb(int i7, boolean z7) {
        if (z7) {
            this.zza.zza(i7);
        }
        return this;
    }

    public final zzav zzc(int... iArr) {
        for (int i7 = 0; i7 < 20; i7++) {
            this.zza.zza(iArr[i7]);
        }
        return this;
    }

    public final zzav zzd(zzaw zzawVar) {
        zzr zzrVarZza = zzawVar.zza();
        for (int i7 = 0; i7 < zzrVarZza.zzb(); i7++) {
            this.zza.zza(zzrVarZza.zzc(i7));
        }
        return this;
    }

    public final zzaw zze() {
        return new zzaw(this.zza.zzb(), null);
    }
}
