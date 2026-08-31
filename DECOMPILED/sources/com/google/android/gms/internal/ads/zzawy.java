package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzawy extends zzaxl {
    private static volatile String zzh;
    private static final Object zzi = new Object();

    public zzawy(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i7, int i8) {
        super(zzavxVar, "MMDDWI2IGLmF5pG/RRqJJZVb/JAirVaBalbjWCkub0DwWmFp7b+bfaTjmPK9uiWU", "m1dpreCDNlkoMOYdr+vmzaz+jSmUZiIrETih78jZTqg=", zzarwVar, i7, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    protected final void zza() {
        this.zzd.zza("E");
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (String) this.zze.invoke(null, new Object[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        zzarw zzarwVar = this.zzd;
        synchronized (zzarwVar) {
            zzarwVar.zza(zzh);
        }
    }
}
