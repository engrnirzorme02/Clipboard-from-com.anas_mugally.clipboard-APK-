package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzca {
    private static final CopyOnWriteArrayList<zzbx> zza = new CopyOnWriteArrayList<>();

    public static zzbx zza(String str) throws GeneralSecurityException {
        for (zzbx zzbxVar : zza) {
            if (zzbxVar.zzb(str)) {
                return zzbxVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
