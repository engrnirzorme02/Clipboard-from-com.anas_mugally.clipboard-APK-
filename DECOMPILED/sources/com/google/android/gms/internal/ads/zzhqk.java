package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhqk implements zzhqg {
    private static final Object zza = new Object();
    private volatile zzhqg zzb;
    private volatile Object zzc = zza;

    private zzhqk(zzhqg zzhqgVar) {
        this.zzb = zzhqgVar;
    }

    public static zzhqg zza(zzhqg zzhqgVar) {
        return ((zzhqgVar instanceof zzhqk) || (zzhqgVar instanceof zzhpw)) ? zzhqgVar : new zzhqk(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zzhqg zzhqgVar = this.zzb;
        if (zzhqgVar == null) {
            return this.zzc;
        }
        Object objZzb = zzhqgVar.zzb();
        this.zzc = objZzb;
        this.zzb = null;
        return objZzb;
    }
}
