package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzbon implements zzbkb {
    private final zzbzm zza;

    public zzbon(zzbop zzbopVar, zzbzm zzbzmVar) {
        Objects.requireNonNull(zzbopVar);
        this.zza = zzbzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkb
    public final void zza(JSONObject jSONObject) {
        try {
            this.zza.zzc(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e7) {
            this.zza.zzd(e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkb
    public final void zzb(String str) {
        try {
            if (str == null) {
                this.zza.zzd(new zzbns());
            } else {
                this.zza.zzd(new zzbns(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
