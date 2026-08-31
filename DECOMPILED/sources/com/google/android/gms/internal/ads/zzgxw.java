package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgxw extends zzgqs {
    private final zzgzk zza;

    public zzgxw(zzgzk zzgzkVar) {
        this.zza = zzgzkVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgxw)) {
            return false;
        }
        zzgzk zzgzkVar = ((zzgxw) obj).zza;
        zzgzk zzgzkVar2 = this.zza;
        return zzgzkVar2.zzc().zzc().equals(zzgzkVar.zzc().zzc()) && zzgzkVar2.zzc().zza().equals(zzgzkVar.zzc().zza()) && zzgzkVar2.zzc().zzb().equals(zzgzkVar.zzc().zzb());
    }

    public final int hashCode() {
        zzgzk zzgzkVar = this.zza;
        return Objects.hash(zzgzkVar.zzc(), zzgzkVar.zzf());
    }

    public final String toString() {
        String str;
        zzgzk zzgzkVar = this.zza;
        String strZza = zzgzkVar.zzc().zza();
        int iOrdinal = zzgzkVar.zzc().zzc().ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return String.format("(typeUrl=%s, outputPrefixType=%s)", strZza, str);
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final boolean zza() {
        return this.zza.zzc().zzc() != zzhep.RAW;
    }

    public final zzgzk zzb() {
        return this.zza;
    }
}
