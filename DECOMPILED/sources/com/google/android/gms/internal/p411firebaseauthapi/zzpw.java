package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpw {
    private final Map<zzpx, zzps<?, ?>> zza;
    private final Map<Class<?>, zzpz<?, ?>> zzb;

    public static zzpy zza() {
        return new zzpy();
    }

    private zzpw(zzpy zzpyVar) {
        this.zza = new HashMap(zzpyVar.zza);
        this.zzb = new HashMap(zzpyVar.zzb);
    }

    public static zzpy zza(zzpw zzpwVar) {
        return new zzpy(zzpwVar);
    }

    public final <KeyT extends zzbi, PrimitiveT> PrimitiveT zza(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        zzpx zzpxVar = new zzpx(keyt.getClass(), cls);
        if (this.zza.containsKey(zzpxVar)) {
            return (PrimitiveT) this.zza.get(zzpxVar).zza(keyt);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + String.valueOf(zzpxVar) + " available, see https://developers.google.com/tink/faq/registration_errors");
    }

    public final <WrappedPrimitiveT> WrappedPrimitiveT zza(zzob zzobVar, zzok zzokVar, Class<WrappedPrimitiveT> cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            final zzpz<?, ?> zzpzVar = this.zzb.get(cls);
            return (WrappedPrimitiveT) zzpzVar.zza(zzobVar, zzokVar, new zzqc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpv
                @Override // com.google.android.gms.internal.p411firebaseauthapi.zzqc
                public final Object zza(zzoa zzoaVar) {
                    return this.zza.zza(zzoaVar.zzb(), zzpzVar.zza());
                }
            });
        }
        throw new GeneralSecurityException("No wrapper found for " + String.valueOf(cls));
    }
}
