package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzchd implements zzhpx {
    private final zzcgx zza;

    private zzchd(zzcgx zzcgxVar) {
        this.zza = zzcgxVar;
    }

    public static zzchd zzc(zzcgx zzcgxVar) {
        return new zzchd(zzcgxVar);
    }

    public static Context zzd(zzcgx zzcgxVar) {
        Context contextZza = zzcgxVar.zza();
        zzhqf.zzb(contextZza);
        return contextZza;
    }

    public final Context zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
