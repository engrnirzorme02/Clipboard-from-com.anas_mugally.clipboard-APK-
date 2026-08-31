package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgyh {
    private static final zzgyh zzb = new zzgyh();
    private final Map zza = new HashMap();

    public static zzgyh zza() {
        return zzb;
    }

    public final synchronized void zzb(zzgyg zzgygVar, Class cls) {
        try {
            Map map = this.zza;
            zzgyg zzgygVar2 = (zzgyg) map.get(cls);
            if (zzgygVar2 != null && !zzgygVar2.equals(zzgygVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            map.put(cls, zzgygVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
