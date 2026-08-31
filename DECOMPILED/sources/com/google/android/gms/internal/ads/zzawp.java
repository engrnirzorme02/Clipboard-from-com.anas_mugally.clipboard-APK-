package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzawp extends zzaxl {
    private static volatile String zzh;
    private static final Object zzi = new Object();

    public zzawp(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i7, int i8) {
        super(zzavxVar, "gyMGe4SoPVIhBgFM+VlZQFWek2IoqCotue6ayBNgVb95WbB68suDu+Zv4jWiM6iG", "etp1batKULd2kwg+5GPfxliTu8RjfdN0zKvZOjQe8mU=", zzarwVar, i7, 82);
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    protected final void zza() {
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
            zzarwVar.zzV(zzh);
        }
    }
}
