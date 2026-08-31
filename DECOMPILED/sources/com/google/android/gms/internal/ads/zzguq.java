package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzguq extends zzgrf {
    private final zzguw zza;
    private final zzhgh zzb;
    private final zzhgg zzc;
    private final Integer zzd;

    private zzguq(zzguw zzguwVar, zzhgh zzhghVar, zzhgg zzhggVar, Integer num) {
        this.zza = zzguwVar;
        this.zzb = zzhghVar;
        this.zzc = zzhggVar;
        this.zzd = num;
    }

    public static zzguq zzc(zzguv zzguvVar, zzhgh zzhghVar, Integer num) throws GeneralSecurityException {
        zzhgg zzhggVarZzb;
        zzguv zzguvVar2 = zzguv.zzc;
        if (zzguvVar != zzguvVar2 && num == null) {
            String string = zzguvVar.toString();
            StringBuilder sb = new StringBuilder(string.length() + 62);
            sb.append("For given Variant ");
            sb.append(string);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (zzguvVar == zzguvVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzhghVar.zzd() != 32) {
            int iZzd = zzhghVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzd).length() + 75);
            sb2.append("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
            sb2.append(iZzd);
            throw new GeneralSecurityException(sb2.toString());
        }
        zzguw zzguwVarZzb = zzguw.zzb(zzguvVar);
        if (zzguwVarZzb.zzc() == zzguvVar2) {
            zzhggVarZzb = zzgyp.zza;
        } else if (zzguwVarZzb.zzc() == zzguv.zzb) {
            zzhggVarZzb = zzgyp.zza(num.intValue());
        } else {
            if (zzguwVarZzb.zzc() != zzguv.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzguwVarZzb.zzc().toString()));
            }
            zzhggVarZzb = zzgyp.zzb(num.intValue());
        }
        return new zzguq(zzguwVarZzb, zzhghVar, zzhggVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzgrf, com.google.android.gms.internal.ads.zzgqd
    public final /* synthetic */ zzgqs zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgrf
    public final zzhgg zzb() {
        return this.zzc;
    }

    public final zzhgh zzd() {
        return this.zzb;
    }

    public final zzguw zze() {
        return this.zza;
    }

    public final Integer zzf() {
        return this.zzd;
    }
}
