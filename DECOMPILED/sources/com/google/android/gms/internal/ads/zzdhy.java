package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;
import p380w2.C7351t;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdhy implements zzhpx {
    private final zzhqg zza;

    private zzdhy(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
    }

    public static zzdhy zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdhy(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        C7584a c7584aZza = ((zzchs) this.zza).zza();
        C7351t.m32349g();
        return new zzayf(UUID.randomUUID().toString(), c7584aZza, "native", new JSONObject(), false, true);
    }
}
