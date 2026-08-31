package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Map;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfdn {
    public static zzbjl zza(final zzecn zzecnVar, final zzfjv zzfjvVar, final zzcmi zzcmiVar, final zzddz zzddzVar) {
        return new zzbjl() { // from class: com.google.android.gms.internal.ads.zzfdm
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcek zzcekVar = (zzcek) obj;
                zzbjk.zzc(map, zzddzVar);
                String str = (String) map.get("u");
                if (str == null) {
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33331f("URL missing from click GMSG.");
                } else {
                    zzecn zzecnVar2 = zzecnVar;
                    zzfjv zzfjvVar2 = zzfjvVar;
                    zzgot.zzq(zzbjk.zza(zzcekVar, str), new zzfdk(zzcekVar, zzcmiVar, zzfjvVar2, zzecnVar2), zzbzh.zza);
                }
            }
        };
    }

    public static zzbjl zzb(final zzecn zzecnVar, final zzfjv zzfjvVar) {
        return new zzbjl() { // from class: com.google.android.gms.internal.ads.zzfdl
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzceb zzcebVar = (zzceb) obj;
                String str = (String) map.get("u");
                if (str == null) {
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33331f("URL missing from httpTrack GMSG.");
                    return;
                }
                zzfcj zzfcjVarZzC = zzcebVar.zzC();
                if (zzfcjVarZzC != null && !zzfcjVarZzC.zzai) {
                    zzfjvVar.zzb(str, zzfcjVarZzC.zzax, null, null);
                    return;
                }
                zzfcm zzfcmVarZzaC = ((zzcfr) zzcebVar).zzaC();
                if (zzfcmVarZzaC != null) {
                    zzecnVar.zze(new zzecp(C7351t.m32357o().mo18159a(), zzfcmVarZzaC.zzb, str, 2));
                } else {
                    C7351t.m32354l().zzg(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                }
            }
        };
    }
}
