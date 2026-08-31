package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
final class zzla implements zzbd {
    private final zzpl<zzlb> zza;
    private final zzoo zzb;

    public zzla(zzpl<zzlb> zzplVar, zzoo zzooVar) {
        this.zza = zzplVar;
        this.zzb = zzooVar;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzbd
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        for (zzlb zzlbVar : this.zza.zza(bArr)) {
            try {
                byte[] bArrZza = zzlbVar.zza.zza(bArr, bArr2);
                this.zzb.zza(zzlbVar.zzb, bArr.length);
                return bArrZza;
            } catch (GeneralSecurityException unused) {
            }
        }
        this.zzb.zza();
        throw new GeneralSecurityException("decryption failed");
    }
}
