package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgh implements zzfz {
    private zzgy zzb;
    private String zzc;
    private boolean zzf;
    private final zzgs zza = new zzgs();
    private int zzd = 8000;
    private int zze = 8000;

    public final zzgh zzb(String str) {
        this.zzc = str;
        return this;
    }

    public final zzgh zzc(int i7) {
        this.zzd = i7;
        return this;
    }

    public final zzgh zzd(int i7) {
        this.zze = i7;
        return this;
    }

    public final zzgh zze(boolean z7) {
        this.zzf = true;
        return this;
    }

    public final zzgh zzf(zzgy zzgyVar) {
        this.zzb = zzgyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzgl zza() {
        zzgl zzglVar = new zzgl(this.zzc, this.zzd, this.zze, this.zzf, false, this.zza, null, false, null);
        zzgy zzgyVar = this.zzb;
        if (zzgyVar != null) {
            zzglVar.zze(zzgyVar);
        }
        return zzglVar;
    }
}
