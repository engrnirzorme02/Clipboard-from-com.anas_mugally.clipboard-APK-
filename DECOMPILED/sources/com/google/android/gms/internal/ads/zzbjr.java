package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Map;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbjr implements zzbjl {
    private final Context zza;
    private final Map zzb;

    public zzbjr(Context context, Map map) {
        this.zza = context;
        this.zzb = map;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        byte b7;
        zzbxr zzbxrVarM32346d = C7351t.m32346d();
        Context context = this.zza;
        if (zzbxrVarM32346d.zza(context)) {
            String str = (String) map.get("eventName");
            String str2 = (String) map.get("eventId");
            int iHashCode = str.hashCode();
            if (iHashCode != 94399) {
                if (iHashCode != 94401) {
                    if (iHashCode == 94407 && str.equals("_ai")) {
                        b7 = 1;
                    } else {
                        b7 = -1;
                    }
                } else if (str.equals("_ac")) {
                    b7 = 0;
                } else {
                    b7 = -1;
                }
            } else if (str.equals("_aa")) {
                b7 = 2;
            } else {
                b7 = -1;
            }
            if (b7 == 0) {
                C7351t.m32346d().zzk(context, str2, (Map) this.zzb.get("_ac"));
            } else if (b7 == 1) {
                C7351t.m32346d().zzl(context, str2, (Map) this.zzb.get("_ai"));
            } else if (b7 == 2) {
                C7351t.m32346d().zzn(context, str2);
            } else {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33328c("logScionEvent gmsg contained unsupported eventName");
            }
        }
    }
}
