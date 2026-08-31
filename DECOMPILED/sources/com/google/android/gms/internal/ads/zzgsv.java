package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgsv extends zzgrf {
    private final zzgta zza;
    private final zzhgh zzb;
    private final zzhgg zzc;
    private final Integer zzd;

    private zzgsv(zzgta zzgtaVar, zzhgh zzhghVar, zzhgg zzhggVar, Integer num) {
        this.zza = zzgtaVar;
        this.zzb = zzhghVar;
        this.zzc = zzhggVar;
        this.zzd = num;
    }

    public static zzgsv zzc(zzgsz zzgszVar, zzhgh zzhghVar, Integer num) throws GeneralSecurityException {
        zzhgg zzhggVarZzb;
        zzgsz zzgszVar2 = zzgsz.zzc;
        if (zzgszVar != zzgszVar2 && num == null) {
            String string = zzgszVar.toString();
            StringBuilder sb = new StringBuilder(string.length() + 62);
            sb.append("For given Variant ");
            sb.append(string);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (zzgszVar == zzgszVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzhghVar.zzd() != 32) {
            int iZzd = zzhghVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzd).length() + 74);
            sb2.append("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
            sb2.append(iZzd);
            throw new GeneralSecurityException(sb2.toString());
        }
        zzgta zzgtaVarZzb = zzgta.zzb(zzgszVar);
        if (zzgtaVarZzb.zzc() == zzgszVar2) {
            zzhggVarZzb = zzgyp.zza;
        } else if (zzgtaVarZzb.zzc() == zzgsz.zzb) {
            zzhggVarZzb = zzgyp.zza(num.intValue());
        } else {
            if (zzgtaVarZzb.zzc() != zzgsz.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzgtaVarZzb.zzc().toString()));
            }
            zzhggVarZzb = zzgyp.zzb(num.intValue());
        }
        return new zzgsv(zzgtaVarZzb, zzhghVar, zzhggVarZzb, num);
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

    public final zzgta zze() {
        return this.zza;
    }

    public final Integer zzf() {
        return this.zzd;
    }
}
