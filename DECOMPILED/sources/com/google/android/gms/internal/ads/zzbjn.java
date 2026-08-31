package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Map;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbjn implements zzbjl {
    private final zzbjo zza;

    public zzbjn(zzbjo zzbjoVar) {
        this.zza = zzbjoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcek zzcekVar = (zzcek) obj;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f7 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f7 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Fail to parse float", e7);
        }
        zzbjo zzbjoVar = this.zza;
        zzbjoVar.zza(zEquals);
        zzbjoVar.zzb(zEquals2, f7);
        zzcekVar.zzaE(zEquals);
    }
}
