package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;
import p380w2.C7351t;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcnj implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;

    private zzcnj(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
    }

    public static zzcnj zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        return new zzcnj(zzhqgVar, zzhqgVar2, zzhqgVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        C7584a c7584aZza = ((zzchs) this.zza).zza();
        JSONObject jSONObject = (JSONObject) this.zzb.zzb();
        String str = (String) this.zzc.zzb();
        boolean zEquals = "native".equals(str);
        C7351t.m32349g();
        return new zzayf(UUID.randomUUID().toString(), c7584aZza, str, jSONObject, false, zEquals);
    }
}
