package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.AbstractC3453S;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import org.json.JSONException;
import org.json.JSONObject;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzexg implements zzeun {
    private final String zza;

    public zzexg(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            String str = this.zza;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            AbstractC3453S.m17481h(jSONObject, "pii").put("adsid", str);
        } catch (JSONException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Failed putting trustless token.", e7);
        }
    }
}
