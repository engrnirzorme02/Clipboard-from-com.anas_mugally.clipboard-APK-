package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdmh {
    private final Executor zza;
    private final zzdmc zzb;
    private final zzdsg zzc;

    zzdmh(Executor executor, zzdmc zzdmcVar, zzdsg zzdsgVar) {
        this.zza = executor;
        this.zzb = zzdmcVar;
        this.zzc = zzdsgVar;
    }

    public final InterfaceFutureC1673e zza(JSONObject jSONObject, String str) {
        InterfaceFutureC1673e interfaceFutureC1673eZza;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return zzgot.zza(Collections.EMPTY_LIST);
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcy)).booleanValue()) {
            this.zzc.zze().putLong(zzdru.NATIVE_ASSETS_LOADING_CUSTOM_START.zza(), C7351t.m32357o().mo18159a());
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i7);
            if (jSONObjectOptJSONObject == null) {
                interfaceFutureC1673eZza = zzgot.zza(null);
            } else {
                final String strOptString = jSONObjectOptJSONObject.optString("name");
                if (strOptString == null) {
                    interfaceFutureC1673eZza = zzgot.zza(null);
                } else {
                    String strOptString2 = jSONObjectOptJSONObject.optString("type");
                    interfaceFutureC1673eZza = "string".equals(strOptString2) ? zzgot.zza(new zzdme(strOptString, jSONObjectOptJSONObject.optString("string_value"))) : "image".equals(strOptString2) ? zzgot.zzk(this.zzb.zza(jSONObjectOptJSONObject, "image_value", null), new zzggr() { // from class: com.google.android.gms.internal.ads.zzdmf
                        @Override // com.google.android.gms.internal.ads.zzggr
                        public final /* synthetic */ Object apply(Object obj) {
                            return new zzdme(strOptString, (zzbfh) obj);
                        }
                    }, this.zza) : zzgot.zza(null);
                }
            }
            arrayList.add(interfaceFutureC1673eZza);
        }
        return zzgot.zzk(zzgot.zzl(arrayList), zzdmg.zza, this.zza);
    }
}
