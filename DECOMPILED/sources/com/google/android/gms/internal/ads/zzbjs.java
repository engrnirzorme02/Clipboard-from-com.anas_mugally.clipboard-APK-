package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.common.util.AbstractC3751f;
import java.util.Map;
import p380w2.C7333b;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbjs implements zzbjl {
    static final Map zza = AbstractC3751f.m18165d(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final C7333b zzb;
    private final zzbrv zzc;
    private final zzbsc zzd;

    public zzbjs(C7333b c7333b, zzbrv zzbrvVar, zzbsc zzbscVar) {
        this.zzb = c7333b;
        this.zzc = zzbrvVar;
        this.zzd = zzbscVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcek zzcekVar = (zzcek) obj;
        int iIntValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i7 = 6;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                C7333b c7333b = this.zzb;
                if (!c7333b.m32306b()) {
                    c7333b.m32307c(null);
                    return;
                }
                if (iIntValue == 1) {
                    this.zzc.zza(map);
                    return;
                }
                if (iIntValue == 3) {
                    new zzbry(zzcekVar, map).zza();
                    return;
                }
                if (iIntValue == 4) {
                    new zzbrs(zzcekVar, map).zza();
                    return;
                }
                if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.zzc.zzb(true);
                        return;
                    } else if (iIntValue != 7) {
                        int i8 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33330e("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean z7 = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (zzcekVar == null) {
            int i9 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i7 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i7 = z7 ? -1 : 14;
        }
        zzcekVar.zzam(i7);
    }
}
