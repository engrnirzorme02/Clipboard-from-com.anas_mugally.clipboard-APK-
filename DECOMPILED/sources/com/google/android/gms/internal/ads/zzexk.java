package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzexk implements zzeun {
    private final Map zza;

    public zzexk(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", C3244B.m17190a().m33296s(this.zza));
        } catch (JSONException e7) {
            AbstractC3490o0.m17545k("Could not encode video decoder properties: ".concat(String.valueOf(e7.getMessage())));
        }
    }
}
