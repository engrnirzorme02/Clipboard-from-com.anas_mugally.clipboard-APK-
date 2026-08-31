package com.google.android.gms.internal.p411firebaseauthapi;

import java.lang.Enum;
import java.security.GeneralSecurityException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zznl<E extends Enum<E>, O> {
    private final Map<E, O> zza;
    private final Map<O, E> zzb;

    public static <E extends Enum<E>, O> zznk<E, O> zza() {
        return new zznk<>();
    }

    private zznl(Map<E, O> map, Map<O, E> map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final E zza(O o7) throws GeneralSecurityException {
        E e7 = this.zzb.get(o7);
        if (e7 != null) {
            return e7;
        }
        throw new GeneralSecurityException("Unable to convert object enum: " + String.valueOf(o7));
    }

    public final O zza(E e7) throws GeneralSecurityException {
        O o7 = this.zza.get(e7);
        if (o7 != null) {
            return o7;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: " + String.valueOf(e7));
    }
}
