package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
final class zzjn implements zzbe {
    private final zzpl<zzjo> zza;
    private final zzoo zzb;

    public zzjn(zzjo zzjoVar, zzpl<zzjo> zzplVar, zzoo zzooVar, zzoo zzooVar2) {
        this.zza = zzplVar;
        this.zzb = zzooVar2;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzbe
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        for (zzjo zzjoVar : this.zza.zza(bArr)) {
            try {
                byte[] bArrZza = zzjoVar.zza.zza(bArr, bArr2);
                this.zzb.zza(zzjoVar.zzb, bArr.length);
                return bArrZza;
            } catch (GeneralSecurityException unused) {
            }
        }
        this.zzb.zza();
        throw new GeneralSecurityException("decryption failed");
    }
}
