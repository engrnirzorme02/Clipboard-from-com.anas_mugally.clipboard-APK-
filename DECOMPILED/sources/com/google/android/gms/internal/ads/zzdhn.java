package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;
import p404z2.C7606w;

/* JADX INFO: loaded from: classes2.dex */
final class zzdhn implements zzbjl {
    private final WeakReference zza;
    private final zzfjv zzb;
    private final C7606w zzc;
    private final zzfib zzd;

    /* synthetic */ zzdhn(zzdho zzdhoVar, zzfjv zzfjvVar, C7606w c7606w, zzfib zzfibVar, byte[] bArr) {
        this.zza = new WeakReference(zzdhoVar);
        this.zzb = zzfjvVar;
        this.zzc = c7606w;
        this.zzd = zzfibVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        zzdho zzdhoVar = (zzdho) this.zza.get();
        String str = (String) map.get("u");
        if (zzdhoVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.zzb.zzb(str, this.zzc, this.zzd, zzdhoVar.zzF());
    }
}
