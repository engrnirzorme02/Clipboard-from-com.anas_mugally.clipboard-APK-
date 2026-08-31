package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzbix implements zzbjl {
    zzbix() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcek zzcekVar = (zzcek) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcekVar.zzdp();
        } else if ("resume".equals(str)) {
            zzcekVar.zzdq();
        }
    }
}
