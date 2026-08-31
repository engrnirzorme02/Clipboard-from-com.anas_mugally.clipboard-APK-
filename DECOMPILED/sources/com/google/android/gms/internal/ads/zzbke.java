package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Map;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbke implements zzbjl {
    private final zzbkd zza;

    public zzbke(zzbkd zzbkdVar) {
        this.zza = zzbkdVar;
    }

    public static void zzb(zzcek zzcekVar, zzbkd zzbkdVar) {
        zzcekVar.zzab("/reward", new zzbke(zzbkdVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zza();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.zza.zzc();
                    return;
                }
                return;
            }
        }
        zzbvt zzbvtVar = null;
        try {
            int i7 = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzbvtVar = new zzbvt(str2, i7);
            }
        } catch (NumberFormatException e7) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Unable to parse reward amount.", e7);
        }
        this.zza.zzb(zzbvtVar);
    }
}
