package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzgs {
    public static final /* synthetic */ int zza = 0;
    private static final zzgs zzb = new zzgs();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzgw zzc = new zzgd();

    private zzgs() {
    }

    public static zzgs zza() {
        return zzb;
    }

    public final zzgv zzb(Class cls) {
        zzfo.zzc(cls, "messageType");
        ConcurrentMap concurrentMap = this.zzd;
        zzgv zzgvVarZza = (zzgv) concurrentMap.get(cls);
        if (zzgvVarZza == null) {
            zzgvVarZza = this.zzc.zza(cls);
            zzfo.zzc(cls, "messageType");
            zzgv zzgvVar = (zzgv) concurrentMap.putIfAbsent(cls, zzgvVarZza);
            if (zzgvVar != null) {
                return zzgvVar;
            }
        }
        return zzgvVarZza;
    }
}
