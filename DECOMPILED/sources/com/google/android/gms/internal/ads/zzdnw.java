package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdnw implements zzbjl {
    final /* synthetic */ zzdnx zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbjl zzd;

    /* synthetic */ zzdnw(zzdnx zzdnxVar, WeakReference weakReference, String str, zzbjl zzbjlVar, byte[] bArr) {
        Objects.requireNonNull(zzdnxVar);
        this.zza = zzdnxVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbjlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zze(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
