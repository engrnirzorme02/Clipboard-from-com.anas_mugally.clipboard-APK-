package com.google.android.recaptcha.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzos {
    public static final /* synthetic */ int zza = 0;
    private static final zzos zzb = new zzos();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzox zzc = new zzoa();

    private zzos() {
    }

    public static zzos zza() {
        return zzb;
    }

    public final zzow zzb(Class cls) {
        zznl.zzc(cls, "messageType");
        zzow zzowVar = (zzow) this.zzd.get(cls);
        if (zzowVar != null) {
            return zzowVar;
        }
        zzow zzowVarZza = this.zzc.zza(cls);
        zznl.zzc(cls, "messageType");
        zzow zzowVar2 = (zzow) this.zzd.putIfAbsent(cls, zzowVarZza);
        return zzowVar2 == null ? zzowVarZza : zzowVar2;
    }
}
