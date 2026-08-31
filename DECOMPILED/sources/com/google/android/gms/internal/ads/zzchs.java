package com.google.android.gms.internal.ads;

import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzchs implements zzhpx {
    private final zzcgx zza;

    private zzchs(zzcgx zzcgxVar) {
        this.zza = zzcgxVar;
    }

    public static zzchs zzc(zzcgx zzcgxVar) {
        return new zzchs(zzcgxVar);
    }

    public static C7584a zzd(zzcgx zzcgxVar) {
        C7584a c7584aZzd = zzcgxVar.zzd();
        zzhqf.zzb(c7584aZzd);
        return c7584aZzd;
    }

    public final C7584a zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
