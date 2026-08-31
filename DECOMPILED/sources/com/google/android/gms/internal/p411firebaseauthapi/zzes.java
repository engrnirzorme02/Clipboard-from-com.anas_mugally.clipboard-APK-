package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzes {
    private static final zzbh<zzba> zza = zzod.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzba.class, zzwx.zzb.SYMMETRIC, zzxt.zze());
    private static final zzor<zzfc> zzb = new zzor() { // from class: com.google.android.gms.internal.firebase-auth-api.zzer
        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzor
        public final zzbi zza(zzcb zzcbVar, Integer num) {
            return zzfd.zza((zzfc) zzcbVar, num);
        }
    };
    private static final zzps<zzfd, zzba> zzc = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzeu
        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzes.zza((zzfd) zzbiVar);
        }
    }, zzfd.class, zzba.class);

    public static /* synthetic */ zzba zza(zzfd zzfdVar) {
        String strZzd = ((zzfc) ((zzcy) zzfdVar.zza())).zzd();
        return zzia.zza(zzep.zza(((zzfc) ((zzcy) zzfdVar.zza())).zzb(), zzca.zza(strZzd).zza(strZzd)), zzfdVar.zzd());
    }

    public static void zza(boolean z7) {
        if (zziv.zza.zza.zza()) {
            zzfg.zza();
            zzop.zza().zza(zzb, zzfc.class);
            zzpa.zza().zza(zzc);
            zznq.zza().zza((zzbh) zza, true);
            return;
        }
        throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
    }
}
