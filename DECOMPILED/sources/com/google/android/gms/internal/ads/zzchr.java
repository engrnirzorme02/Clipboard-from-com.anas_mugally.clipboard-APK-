package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzchr implements zzhpx {
    private final zzcgx zza;

    private zzchr(zzcgx zzcgxVar) {
        this.zza = zzcgxVar;
    }

    public static zzchr zza(zzcgx zzcgxVar) {
        return new zzchr(zzcgxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        String strZze = this.zza.zze();
        zzhqf.zzb(strZze);
        return strZze;
    }
}
