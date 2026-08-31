package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Map;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbjt implements zzbjl {
    private final zzdtp zza;

    public zzbjt(zzdtp zzdtpVar) {
        this.zza = zzdtpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("id") || TextUtils.isEmpty((CharSequence) map.get("id")) || !map.containsKey("event_type") || TextUtils.isEmpty((CharSequence) map.get("event_type"))) {
            AbstractC3490o0.m17545k("Ignoring onDeviceStorageEvent GMSG: missing required parameters.");
            return;
        }
        try {
            this.zza.zza(Long.parseLong((String) map.get("id")), Integer.parseInt((String) map.get("event_type")), C7351t.m32357o().mo18159a());
        } catch (NumberFormatException e7) {
            AbstractC3490o0.m17546l("Ignoring onDeviceStorageEvent GMSG: invalid number format for ID or eventType.", e7);
        }
    }
}
