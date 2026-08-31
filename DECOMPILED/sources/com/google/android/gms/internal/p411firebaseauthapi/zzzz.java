package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzz implements zzsq {
    public static zzsq zza(zzso zzsoVar) {
        zzsq zzsqVarZza = zzsv.zza(zzsoVar);
        try {
            return new zzaac(zzsqVarZza, zzsx.zza(zzsoVar));
        } catch (GeneralSecurityException unused) {
            return zzsqVarZza;
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzsq
    public final byte[] zza(byte[] bArr, int i7) {
        throw new NoSuchMethodError();
    }
}
