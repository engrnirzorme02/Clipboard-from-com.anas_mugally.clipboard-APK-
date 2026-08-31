package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzbig implements zzbjl {
    zzbig() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZzc;
        zzcek zzcekVar = (zzcek) obj;
        zzbfj zzbfjVarZzar = zzcekVar.zzar();
        if (zzbfjVarZzar == null || (jSONObjectZzc = zzbfjVarZzar.zzc()) == null) {
            zzcekVar.zzd("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcekVar.zzd("nativeAdViewSignalsReady", jSONObjectZzc);
        }
    }
}
