package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzof extends zzbi {
    private final zzqb zza;

    private static class zza extends zzcb {
        private final String zza;
        private final zzxz zzb;

        public final String toString() {
            String str;
            String str2 = this.zza;
            int i7 = zzoe.zza[this.zzb.ordinal()];
            if (i7 == 1) {
                str = "TINK";
            } else if (i7 == 2) {
                str = "LEGACY";
            } else if (i7 != 3) {
                str = i7 != 4 ? "UNKNOWN" : "CRUNCHY";
            } else {
                str = "RAW";
            }
            return String.format("(typeUrl=%s, outputPrefixType=%s)", str2, str);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzcb
        public final boolean zza() {
            return this.zzb != zzxz.RAW;
        }

        private zza(String str, zzxz zzxzVar) {
            this.zza = str;
            this.zzb = zzxzVar;
        }
    }

    public zzof(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        zza(zzqbVar, zzchVar);
        this.zza = zzqbVar;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzbi
    public final zzcb zza() {
        return new zza(this.zza.zzf(), this.zza.zzb());
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzbi
    public final Integer zzb() {
        return this.zza.zze();
    }

    public final zzaaj zzc() throws GeneralSecurityException {
        zzqb zzqbVar = this.zza;
        if (zzqbVar.zzb().equals(zzxz.RAW)) {
            return zzaaj.zza(new byte[0]);
        }
        if (zzqbVar.zzb().equals(zzxz.TINK)) {
            return zzpe.zzb(zzqbVar.zze().intValue());
        }
        if (zzqbVar.zzb().equals(zzxz.LEGACY) || zzqbVar.zzb().equals(zzxz.CRUNCHY)) {
            return zzpe.zza(zzqbVar.zze().intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }

    public final zzqb zza(zzch zzchVar) throws GeneralSecurityException {
        zza(this.zza, zzchVar);
        return this.zza;
    }

    private static void zza(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        int i7 = zzoe.zzb[zzqbVar.zza().ordinal()];
        if (i7 == 1 || i7 == 2) {
            zzch.zza(zzchVar);
        }
    }
}
