package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaww extends zzaxl {
    private final zzava zzh;
    private final long zzi;
    private final long zzj;

    public zzaww(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i7, int i8, zzava zzavaVar, long j7, long j8) {
        super(zzavxVar, "1MiCMWad12oLn5alnMxHwTvbBZm7RpaUcGFZ/LjrpVbPksWcBk53Qc+euKdOo/dG", "/cnUVQvNHFqi3ggOmiA4o/IdQSFHoegJ/H9a2xERT14=", zzarwVar, i7, 11);
        this.zzh = zzavaVar;
        this.zzi = j7;
        this.zzj = j8;
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    protected final void zza() {
        zzava zzavaVar = this.zzh;
        if (zzavaVar != null) {
            zzauy zzauyVar = new zzauy((String) this.zze.invoke(null, zzavaVar.zzb(), Long.valueOf(this.zzi), Long.valueOf(this.zzj)));
            zzarw zzarwVar = this.zzd;
            synchronized (zzarwVar) {
                try {
                    zzarwVar.zzf(zzauyVar.zza.longValue());
                    if (zzauyVar.zzb.longValue() >= 0) {
                        zzarwVar.zzW(zzauyVar.zzb.longValue());
                    }
                    if (zzauyVar.zzc.longValue() >= 0) {
                        zzarwVar.zzX(zzauyVar.zzc.longValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
