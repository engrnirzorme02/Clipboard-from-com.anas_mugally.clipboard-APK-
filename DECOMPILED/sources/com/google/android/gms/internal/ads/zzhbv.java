package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhbv extends zzhby {
    private final int zza;

    private zzhbv(int i7) {
        this.zza = i7;
    }

    public static zzhbv zzb(int i7) throws InvalidAlgorithmParameterException {
        if (i7 == 16 || i7 == 32) {
            return new zzhbv(i7);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i7 * 8)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhbv) && ((zzhbv) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhbv.class, Integer.valueOf(this.zza));
    }

    public final String toString() {
        int i7 = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 34);
        sb.append("AesCmac PRF Parameters (");
        sb.append(i7);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final boolean zza() {
        return false;
    }

    public final int zzc() {
        return this.zza;
    }
}
