package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcle implements zzcky {
    private final zzdvs zza;

    zzcle(zzdvs zzdvsVar) {
        this.zza = zzdvsVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // com.google.android.gms.internal.ads.zzcky
    public final void zza(Map map) {
        byte b7;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 97520651) {
            if (iHashCode == 109399814 && str.equals("shake")) {
                b7 = 0;
            } else {
                b7 = -1;
            }
        } else if (str.equals("flick")) {
            b7 = 1;
        } else {
            b7 = -1;
        }
        if (b7 == 0) {
            this.zza.zze(zzdvo.SHAKE);
        } else if (b7 != 1) {
            this.zza.zze(zzdvo.NONE);
        } else {
            this.zza.zze(zzdvo.FLICK);
        }
    }
}
