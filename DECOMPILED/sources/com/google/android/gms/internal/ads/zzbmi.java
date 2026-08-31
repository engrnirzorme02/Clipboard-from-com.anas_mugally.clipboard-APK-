package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public interface zzbmi extends zzbmt, zzbmh {
    @Override // com.google.android.gms.internal.ads.zzbmt
    void zza(String str);

    @Override // com.google.android.gms.internal.ads.zzbmt
    default void zzb(String str, JSONObject jSONObject) {
        zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbmt
    default void zzc(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length() + 2);
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        zza(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    default void zzd(String str, JSONObject jSONObject) {
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        String string2 = sb.toString();
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33326a("Dispatching AFMA event: ".concat(string2));
        zza(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    default void zze(String str, Map map) {
        try {
            zzd(str, C3244B.m17190a().m33296s(map));
        } catch (JSONException unused) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Could not convert parameters to JSON.");
        }
    }
}
