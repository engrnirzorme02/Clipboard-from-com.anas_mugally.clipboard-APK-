package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzch {
    private static final zzch zza = new zzch();

    private zzch() {
    }

    static zzch zza() {
        return zza;
    }

    public static zzch zza(zzch zzchVar) throws GeneralSecurityException {
        if (zzchVar != null) {
            return zzchVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
