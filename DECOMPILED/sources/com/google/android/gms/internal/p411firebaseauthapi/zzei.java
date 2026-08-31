package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzei {
    private static final zzps<zzej, zzba> zza = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzel
        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzei.zza((zzej) zzbiVar);
        }
    }, zzej.class, zzba.class);
    private static final zzor<zzem> zzb = new zzor() { // from class: com.google.android.gms.internal.firebase-auth-api.zzek
        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzor
        public final zzbi zza(zzcb zzcbVar, Integer num) {
            return zzei.zza((zzem) zzcbVar, num);
        }
    };
    private static final zzbh<zzba> zzc = zzod.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzba.class, zzwx.zzb.SYMMETRIC, zzuv.zze());

    public static /* synthetic */ zzba zza(zzej zzejVar) {
        return zzhh.zzb() ? zzhh.zza(zzejVar) : zzzc.zza(zzejVar);
    }

    static zzej zza(zzem zzemVar, Integer num) {
        return zzej.zza(zzemVar.zzb(), zzaal.zza(32), num);
    }

    static String zza() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public static void zza(boolean z7) {
        if (zziv.zza.zza.zza()) {
            zzhj.zza();
            zzpa.zza().zza(zza);
            zzop.zza().zza(zzb, zzem.class);
            zzox zzoxVarZza = zzox.zza();
            HashMap map = new HashMap();
            map.put("CHACHA20_POLY1305", zzem.zza(zzem.zza.zza));
            map.put("CHACHA20_POLY1305_RAW", zzem.zza(zzem.zza.zzc));
            zzoxVarZza.zza(Collections.unmodifiableMap(map));
            zznq.zza().zza((zzbh) zzc, true);
            return;
        }
        throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
    }
}
