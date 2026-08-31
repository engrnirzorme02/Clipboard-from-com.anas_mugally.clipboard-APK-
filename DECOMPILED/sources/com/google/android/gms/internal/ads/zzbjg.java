package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3457W;
import java.util.Map;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzbjg implements zzbjl {
    static final /* synthetic */ zzbjg zza = new zzbjg();

    private /* synthetic */ zzbjg() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcfw zzcfwVar = (zzcfw) obj;
        zzbjl zzbjlVar = zzbjk.zza;
        String str = (String) map.get("u");
        if (str == null) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("URL missing from httpTrack GMSG.");
        } else {
            zzceb zzcebVar = (zzceb) zzcfwVar;
            new C3457W(zzcfwVar.getContext(), ((zzcge) zzcfwVar).zzs().f30226a, str, null, zzcebVar.zzC() != null ? zzcebVar.zzC().zzax : null).zzb();
        }
    }
}
