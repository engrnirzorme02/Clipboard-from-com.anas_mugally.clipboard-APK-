package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Map;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzbjh implements zzbjl {
    static final /* synthetic */ zzbjh zza = new zzbjh();

    private /* synthetic */ zzbjh() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcgd zzcgdVar = (zzcgd) obj;
        zzbjl zzbjlVar = zzbjk.zza;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int i7 = Integer.parseInt(str);
            int i8 = Integer.parseInt(str2);
            int i9 = Integer.parseInt(str3);
            zzauu zzauuVarZzS = zzcgdVar.zzS();
            if (zzauuVarZzS != null) {
                zzauuVarZzS.zzb().zze(i7, i8, i9);
            }
        } catch (NumberFormatException unused) {
            int i10 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Could not parse touch parameters from gmsg.");
        }
    }
}
