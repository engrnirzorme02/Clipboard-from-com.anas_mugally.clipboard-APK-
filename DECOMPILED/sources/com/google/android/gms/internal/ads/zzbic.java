package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Map;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbic implements zzbjl {
    private final zzbid zza;

    public zzbic(zzbid zzbidVar) {
        this.zza = zzbidVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str != null) {
            this.zza.zzb(str, (String) map.get("info"));
        } else {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("App event with no name parameter.");
        }
    }
}
