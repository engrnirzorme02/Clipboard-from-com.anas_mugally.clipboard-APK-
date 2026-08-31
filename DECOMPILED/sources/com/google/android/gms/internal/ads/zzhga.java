package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhga implements zzhbw {
    public static zzhbw zzb(zzhbu zzhbuVar) {
        zzhbw zzhbwVarZzb = zzhca.zzb(zzhbuVar);
        try {
            return new zzhfz(zzhbwVarZzb, zzhcb.zzb(zzhbuVar), null);
        } catch (GeneralSecurityException unused) {
            return zzhbwVarZzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbw
    public final byte[] zza(byte[] bArr, int i7) {
        throw null;
    }
}
