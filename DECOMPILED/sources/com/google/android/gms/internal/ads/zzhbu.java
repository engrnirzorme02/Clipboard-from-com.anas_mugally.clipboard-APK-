package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhbu extends zzhbx {
    private final zzhbv zza;
    private final zzhgh zzb;

    private zzhbu(zzhbv zzhbvVar, zzhgh zzhghVar) {
        this.zza = zzhbvVar;
        this.zzb = zzhghVar;
    }

    public static zzhbu zzb(zzhbv zzhbvVar, zzhgh zzhghVar) throws GeneralSecurityException {
        if (zzhbvVar.zzc() == zzhghVar.zzd()) {
            return new zzhbu(zzhbvVar, zzhghVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // com.google.android.gms.internal.ads.zzhbx, com.google.android.gms.internal.ads.zzgqd
    public final /* synthetic */ zzgqs zza() {
        return this.zza;
    }

    public final zzhgh zzc() {
        return this.zzb;
    }
}
