package com.google.android.gms.internal.ads;

import java.util.Map;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfsb {
    private final zzfrx zza;

    public final /* synthetic */ zzfrz zza() {
        zzhih zzhihVarZzbu = this.zza.zzbu();
        AbstractC6118n.m27186d(zzhihVarZzbu, "build(...)");
        return (zzfrz) zzhihVarZzbu;
    }

    public final /* synthetic */ zzhll zzb() {
        Map mapZzb = this.zza.zzb();
        AbstractC6118n.m27186d(mapZzb, "getQueryIdToAdQualityDataMapMap(...)");
        return new zzhll(mapZzb);
    }

    public final void zzc(zzhll zzhllVar, String key, zzfrv value) {
        AbstractC6118n.m27187e(zzhllVar, "<this>");
        AbstractC6118n.m27187e(key, "key");
        AbstractC6118n.m27187e(value, "value");
        this.zza.zzc(key, value);
    }

    public final /* synthetic */ void zzd(zzhll zzhllVar, String key) {
        AbstractC6118n.m27187e(zzhllVar, "<this>");
        AbstractC6118n.m27187e(key, "key");
        this.zza.zza(key);
    }
}
