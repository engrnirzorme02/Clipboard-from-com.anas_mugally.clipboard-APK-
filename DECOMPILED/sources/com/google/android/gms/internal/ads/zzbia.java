package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.AbstractC3453S;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbia implements zzbjl {
    private final zzbib zza;

    public zzbia(zzbib zzbibVar) {
        this.zza = zzbibVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        if (this.zza == null) {
            return;
        }
        String str = (String) map.get("name");
        if (str == null) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33330e("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundleM17485l = null;
        if (map.containsKey("info")) {
            try {
                bundleM17485l = AbstractC3453S.m17485l(new JSONObject((String) map.get("info")));
            } catch (JSONException e7) {
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("Failed to convert ad metadata to JSON.", e7);
            }
        }
        if (bundleM17485l != null) {
            this.zza.zza(str, bundleM17485l);
        } else {
            int i9 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33328c("Failed to convert ad metadata to Bundle.");
        }
    }
}
