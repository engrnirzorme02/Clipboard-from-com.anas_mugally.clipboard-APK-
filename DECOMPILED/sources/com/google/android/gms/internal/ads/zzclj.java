package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzclj implements zzckz {
    private final zzdvs zza;

    zzclj(zzdvs zzdvsVar) {
        this.zza = zzdvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzckz
    public final void zza(JSONObject jSONObject) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjY)).booleanValue()) {
            this.zza.zzp(jSONObject);
        }
    }
}
