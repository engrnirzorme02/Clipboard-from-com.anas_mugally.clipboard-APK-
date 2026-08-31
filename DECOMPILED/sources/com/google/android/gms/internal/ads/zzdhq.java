package com.google.android.gms.internal.ads;

import org.json.JSONObject;
import p380w2.C7333b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdhq {
    private final JSONObject zza;
    private final zzdnx zzb;
    private final C7333b zzc;
    private final zzbxf zzd;

    public zzdhq(JSONObject jSONObject, zzdnx zzdnxVar, C7333b c7333b, zzbxf zzbxfVar) {
        this.zza = jSONObject;
        this.zzb = zzdnxVar;
        this.zzc = c7333b;
        this.zzd = zzbxfVar;
    }

    final C7333b zza() {
        return this.zzc;
    }

    final zzbxf zzb() {
        return this.zzd;
    }

    public final JSONObject zzc() {
        return this.zza;
    }

    public final zzdnx zzd() {
        return this.zzb;
    }
}
