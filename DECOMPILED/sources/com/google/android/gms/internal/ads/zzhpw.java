package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhpw implements zzhqg, zzhpr {
    private static final Object zza = new Object();
    private volatile zzhqg zzb;
    private volatile Object zzc = zza;

    private zzhpw(zzhqg zzhqgVar) {
        this.zzb = zzhqgVar;
    }

    public static zzhqg zza(zzhqg zzhqgVar) {
        return zzhqgVar instanceof zzhpw ? zzhqgVar : new zzhpw(zzhqgVar);
    }

    public static zzhpr zzc(zzhqg zzhqgVar) {
        if (zzhqgVar instanceof zzhpr) {
            return (zzhpr) zzhqgVar;
        }
        zzhqgVar.getClass();
        return new zzhpw(zzhqgVar);
    }

    private final synchronized Object zzd() {
        try {
            Object obj = this.zzc;
            Object obj2 = zza;
            if (obj != obj2) {
                return obj;
            }
            Object objZzb = this.zzb.zzb();
            Object obj3 = this.zzc;
            if (obj3 != obj2 && obj3 != objZzb) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZzb + ". This is likely due to a circular dependency.");
            }
            this.zzc = objZzb;
            this.zzb = null;
            return objZzb;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final Object zzb() {
        Object obj = this.zzc;
        return obj == zza ? zzd() : obj;
    }
}
