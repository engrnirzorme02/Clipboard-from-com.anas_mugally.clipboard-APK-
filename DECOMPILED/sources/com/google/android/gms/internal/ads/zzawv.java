package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzawv extends zzaxl {
    private final zzavp zzh;

    public zzawv(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i7, int i8, zzavp zzavpVar) {
        super(zzavxVar, "sl6J6ogR1CQFBNHXqYqYlsoHhQEQ3GzqykotbgjuxxtAslvwVDD28XhO/FGDcWNY", "etPaLFHhmzrmC9guV7/txSJ19uqkwWx/gSnrE4vBCvs=", zzarwVar, i7, 94);
        this.zzh = zzavpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    protected final void zza() {
        int iIntValue = ((Integer) this.zze.invoke(null, this.zzh.zzb())).intValue();
        zzarw zzarwVar = this.zzd;
        synchronized (zzarwVar) {
            zzarwVar.zzaj(zzasi.zza(iIntValue));
        }
    }
}
