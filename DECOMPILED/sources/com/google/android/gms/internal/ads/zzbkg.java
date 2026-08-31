package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbkg implements zzbjl {
    private final zzdvs zza;

    public zzbkg(zzdvs zzdvsVar) {
        AbstractC3718s.m18084m(zzdvsVar, "The Inspector Manager must not be null");
        this.zza = zzdvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j7 = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j7 = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.zza.zzi((String) map.get("extras"), j7);
    }
}
