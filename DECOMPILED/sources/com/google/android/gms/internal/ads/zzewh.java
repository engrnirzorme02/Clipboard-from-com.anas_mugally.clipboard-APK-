package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import org.json.JSONException;
import org.json.JSONObject;
import p157U3.InterfaceFutureC1673e;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
final class zzewh implements zzeup {
    private final JSONObject zza;

    zzewh(Context context) {
        this.zza = zzbur.zzb(context, C7584a.m33270T());
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        return ((Boolean) C3250D.m17200c().zzd(zzbci.zzmL)).booleanValue() ? zzgot.zza(zzewf.zza) : zzgot.zza(new zzeun() { // from class: com.google.android.gms.internal.ads.zzewg
            @Override // com.google.android.gms.internal.ads.zzeun
            public final /* synthetic */ void zza(Object obj) {
                this.zza.zzc((JSONObject) obj);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 46;
    }

    final /* synthetic */ void zzc(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            AbstractC3490o0.m17545k("Failed putting version constants.");
        }
    }
}
