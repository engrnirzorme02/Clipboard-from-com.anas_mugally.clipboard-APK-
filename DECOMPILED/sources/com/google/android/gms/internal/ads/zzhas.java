package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhas {
    static {
        int i7 = zzher.zza;
        try {
            zza();
        } catch (GeneralSecurityException e7) {
            throw new ExceptionInInitializerError(e7);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzhay.zzc();
        zzhag.zzc();
        zzhan.zza(true);
        if (zzgxe.zza()) {
            return;
        }
        zzhaa.zza(true);
    }
}
