package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Map;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzccc implements zzbjl {
    private final zzccb zza;

    public zzccc(zzccb zzccbVar) {
        this.zza = zzccbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if (str == null) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Action missing from video GMSG.");
        } else if (str.equals("src")) {
            String str2 = (String) map.get("src");
            if (str2 != null) {
                this.zza.zza(str2);
            } else {
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("src missing from video GMSG.");
            }
        }
    }
}
