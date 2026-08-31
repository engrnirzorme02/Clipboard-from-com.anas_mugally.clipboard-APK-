package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzawo extends zzaxl {
    private final long zzh;

    public zzawo(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, long j7, int i7, int i8) {
        super(zzavxVar, "6Tbgi6IQESKZikJOpZcClcVJxza1rhAf3nfasZu/vDcTd3loITpTNbH23xjyLA5L", "g107GCb4k6+PXON8scRHoxvRnyAK9ZOpFHjKTWKkbXc=", zzarwVar, i7, 25);
        this.zzh = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    protected final void zza() {
        long jLongValue = ((Long) this.zze.invoke(null, new Object[0])).longValue();
        zzarw zzarwVar = this.zzd;
        synchronized (zzarwVar) {
            try {
                zzarwVar.zzac(jLongValue);
                long j7 = this.zzh;
                if (j7 != 0) {
                    zzarwVar.zzk(jLongValue - j7);
                    zzarwVar.zzn(j7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
