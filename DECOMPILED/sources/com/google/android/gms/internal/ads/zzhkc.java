package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzhkc {
    private static final zzhkc zza = new zzhkc();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzhkl zzb = new zzhjj();

    private zzhkc() {
    }

    public static zzhkc zza() {
        return zza;
    }

    public final zzhkk zzb(Class cls) {
        zzhiu.zza(cls, "messageType");
        ConcurrentMap concurrentMap = this.zzc;
        zzhkk zzhkkVarZza = (zzhkk) concurrentMap.get(cls);
        if (zzhkkVarZza == null) {
            zzhkkVarZza = this.zzb.zza(cls);
            zzhiu.zza(cls, "messageType");
            zzhkk zzhkkVar = (zzhkk) concurrentMap.putIfAbsent(cls, zzhkkVarZza);
            if (zzhkkVar != null) {
                return zzhkkVar;
            }
        }
        return zzhkkVarZza;
    }
}
