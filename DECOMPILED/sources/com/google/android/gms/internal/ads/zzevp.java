package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.AbstractC3453S;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import org.json.JSONException;
import org.json.JSONObject;
import p356t2.C7073a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzevp implements zzeun {
    private final C7073a.a zza;
    private final String zzb;
    private final zzfti zzc;

    public zzevp(C7073a.a aVar, String str, zzfti zzftiVar) {
        this.zza = aVar;
        this.zzb = str;
        this.zzc = zzftiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            JSONObject jSONObjectM17481h = AbstractC3453S.m17481h((JSONObject) obj, "pii");
            C7073a.a aVar = this.zza;
            if (aVar == null || TextUtils.isEmpty(aVar.m31190a())) {
                String str = this.zzb;
                if (str != null) {
                    jSONObjectM17481h.put("pdid", str);
                    jSONObjectM17481h.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectM17481h.put("rdid", aVar.m31190a());
            jSONObjectM17481h.put("is_lat", aVar.m31191b());
            jSONObjectM17481h.put("idtype", "adid");
            zzfti zzftiVar = this.zzc;
            if (zzftiVar.zzc()) {
                jSONObjectM17481h.put("paidv1_id_android_3p", zzftiVar.zza());
                jSONObjectM17481h.put("paidv1_creation_time_android_3p", zzftiVar.zzb());
            }
        } catch (JSONException e7) {
            AbstractC3490o0.m17546l("Failed putting Ad ID.", e7);
        }
    }
}
