package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
final class zzbio implements zzbjl {
    zzbio() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcek zzcekVar = (zzcek) obj;
        try {
            String str = (String) map.get("enabled");
            zzbjl zzbjlVar = zzbjk.zza;
            if (!zzggj.zze("true", str) && !zzggj.zze("false", str)) {
                return;
            }
            zzftj.zza(zzcekVar.getContext()).zzd(Boolean.parseBoolean(str));
        } catch (IOException e7) {
            C7351t.m32354l().zzg(e7, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
