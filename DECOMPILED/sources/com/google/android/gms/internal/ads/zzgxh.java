package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgxh {
    private final Map zza;
    private final Map zzb;

    /* synthetic */ zzgxh(Map map, Map map2, byte[] bArr) {
        this.zza = map;
        this.zzb = map2;
    }

    public static zzgxg zza() {
        return new zzgxg(null);
    }

    public final Enum zzb(Object obj) throws GeneralSecurityException {
        Enum r7 = (Enum) this.zzb.get(obj);
        if (r7 != null) {
            return r7;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object zzc(Enum r7) throws GeneralSecurityException {
        Object obj = this.zza.get(r7);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r7)));
    }
}
