package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class zzhps {
    final LinkedHashMap zza;

    zzhps(int i7) {
        this.zza = zzhpu.zzc(i7);
    }

    final zzhps zza(Object obj, zzhqg zzhqgVar) {
        zzhqf.zza(obj, "key");
        zzhqf.zza(zzhqgVar, "provider");
        this.zza.put(obj, zzhqgVar);
        return this;
    }
}
