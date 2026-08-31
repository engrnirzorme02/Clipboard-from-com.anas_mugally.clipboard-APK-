package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgti extends zzgrf {
    private final zzgtk zza;
    private final zzhgg zzb;
    private final Integer zzc;

    private zzgti(zzgtk zzgtkVar, zzhgg zzhggVar, Integer num) {
        this.zza = zzgtkVar;
        this.zzb = zzhggVar;
        this.zzc = num;
    }

    public static zzgti zzc(zzgtk zzgtkVar, Integer num) throws GeneralSecurityException {
        zzhgg zzhggVarZza;
        if (zzgtkVar.zzd() == zzgtj.zza) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzhggVarZza = zzhgg.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzgtkVar.zzd() != zzgtj.zzb) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(zzgtkVar.zzd().toString()));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzhggVarZza = zzhgg.zza(new byte[0]);
        }
        return new zzgti(zzgtkVar, zzhggVarZza, num);
    }

    @Override // com.google.android.gms.internal.ads.zzgrf, com.google.android.gms.internal.ads.zzgqd
    public final /* synthetic */ zzgqs zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgrf
    public final zzhgg zzb() {
        return this.zzb;
    }

    public final zzgtk zzd() {
        return this.zza;
    }

    public final Integer zze() {
        return this.zzc;
    }
}
