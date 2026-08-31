package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcht implements zzhpx {
    private final zzcgx zza;

    private zzcht(zzcgx zzcgxVar) {
        this.zza = zzcgxVar;
    }

    public static zzcht zza(zzcgx zzcgxVar) {
        return new zzcht(zzcgxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return Long.valueOf(this.zza.zzi());
    }
}
