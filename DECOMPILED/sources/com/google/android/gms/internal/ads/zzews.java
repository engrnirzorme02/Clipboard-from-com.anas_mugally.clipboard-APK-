package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.util.AbstractC3453S;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzews implements zzeun {
    private final Bundle zza;

    public zzews(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Bundle bundle = this.zza;
        if (bundle != null) {
            try {
                AbstractC3453S.m17481h(AbstractC3453S.m17481h(jSONObject, "device"), "play_store").put("parental_controls", C3244B.m17190a().m33298u(bundle));
            } catch (JSONException unused) {
                AbstractC3490o0.m17545k("Failed putting parental controls bundle.");
            }
        }
    }
}
