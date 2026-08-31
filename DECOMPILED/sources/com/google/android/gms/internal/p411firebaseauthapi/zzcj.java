package com.google.android.gms.internal.p411firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcj {
    public static zzcb zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzxb zzxbVarZza = zzxb.zza(bArr, zzaku.zza());
            zzoz zzozVarZza = zzoz.zza();
            zzqe zzqeVarZza = zzqe.zza(zzxbVarZza);
            return !zzozVarZza.zzc(zzqeVarZza) ? new zzoi(zzqeVarZza) : zzozVarZza.zza(zzqeVarZza);
        } catch (IOException e7) {
            throw new GeneralSecurityException("Failed to parse proto", e7);
        }
    }

    public static byte[] zza(zzcb zzcbVar) {
        if (zzcbVar instanceof zzoi) {
            return ((zzoi) zzcbVar).zzb().zza().zzk();
        }
        return ((zzqe) zzoz.zza().zza(zzcbVar, zzqe.class)).zza().zzk();
    }
}
