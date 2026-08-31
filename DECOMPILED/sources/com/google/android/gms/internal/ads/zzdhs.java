package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdhs implements zzhpx {
    private final zzdhq zza;

    private zzdhs(zzdhq zzdhqVar) {
        this.zza = zzdhqVar;
    }

    public static zzdhs zzc(zzdhq zzdhqVar) {
        return new zzdhs(zzdhqVar);
    }

    public static JSONObject zzd(zzdhq zzdhqVar) {
        JSONObject jSONObjectZzc = zzdhqVar.zzc();
        zzhqf.zzb(jSONObjectZzc);
        return jSONObjectZzc;
    }

    public final JSONObject zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
