package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzche implements zzhpx {
    private final zzcgx zza;

    private zzche(zzcgx zzcgxVar) {
        this.zza = zzcgxVar;
    }

    public static zzche zzc(zzcgx zzcgxVar) {
        return new zzche(zzcgxVar);
    }

    public static WeakReference zzd(zzcgx zzcgxVar) {
        WeakReference weakReferenceZzc = zzcgxVar.zzc();
        zzhqf.zzb(weakReferenceZzc);
        return weakReferenceZzc;
    }

    public final WeakReference zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
