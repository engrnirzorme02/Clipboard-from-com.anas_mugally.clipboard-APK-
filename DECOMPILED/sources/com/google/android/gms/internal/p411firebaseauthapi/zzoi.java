package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzoi extends zzcb {
    private final zzqe zza;

    public zzoi(zzqe zzqeVar) {
        this.zza = zzqeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzoi)) {
            return false;
        }
        zzqe zzqeVar = ((zzoi) obj).zza;
        return this.zza.zza().zzd().equals(zzqeVar.zza().zzd()) && this.zza.zza().zzf().equals(zzqeVar.zza().zzf()) && this.zza.zza().zze().equals(zzqeVar.zza().zze());
    }

    public final int hashCode() {
        return Objects.hash(this.zza.zza(), this.zza.zzc());
    }

    public final String toString() {
        String str;
        String strZzf = this.zza.zza().zzf();
        int i7 = zzoh.zza[this.zza.zza().zzd().ordinal()];
        if (i7 == 1) {
            str = "TINK";
        } else if (i7 == 2) {
            str = "LEGACY";
        } else if (i7 != 3) {
            str = i7 != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return String.format("(typeUrl=%s, outputPrefixType=%s)", strZzf, str);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzcb
    public final boolean zza() {
        return this.zza.zza().zzd() != zzxz.RAW;
    }

    public final zzqe zzb() {
        return this.zza;
    }
}
