package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.AbstractC3453S;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzevz implements zzeun {
    final String zza;
    final int zzb;

    public zzevz(String str, int i7) {
        this.zza = str;
        this.zzb = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i7;
        String str = this.zza;
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(str) || (i7 = this.zzb) == -1) {
            return;
        }
        try {
            JSONObject jSONObjectM17481h = AbstractC3453S.m17481h(jSONObject, "pii");
            jSONObjectM17481h.put("pvid", str);
            jSONObjectM17481h.put("pvid_s", i7);
        } catch (JSONException e7) {
            AbstractC3490o0.m17546l("Failed putting gms core app set ID info.", e7);
        }
    }
}
