package com.google.android.gms.internal.p411firebaseauthapi;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
final class zzni {
    static final zzni zza;
    BigInteger zzb;
    BigInteger zzc;
    BigInteger zzd;

    static {
        BigInteger bigInteger = BigInteger.ONE;
        zza = new zzni(bigInteger, bigInteger, BigInteger.ZERO);
    }

    zzni(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.zzb = bigInteger;
        this.zzc = bigInteger2;
        this.zzd = bigInteger3;
    }

    final boolean zza() {
        return this.zzd.equals(BigInteger.ZERO);
    }
}
