package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqu extends zzrn {
    private final int zza;
    private final int zzb;
    private final zza zzc;

    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("CRUNCHY");
        public static final zza zzc = new zza("LEGACY");
        public static final zza zzd = new zza("NO_PREFIX");
        private final String zze;

        private zza(String str) {
            this.zze = str;
        }

        public final String toString() {
            return this.zze;
        }
    }

    public static final class zzb {
        private Integer zza;
        private Integer zzb;
        private zza zzc;

        public final zzb zza(int i7) throws InvalidAlgorithmParameterException {
            if (i7 != 16 && i7 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i7 << 3)));
            }
            this.zza = Integer.valueOf(i7);
            return this;
        }

        public final zzb zzb(int i7) throws GeneralSecurityException {
            if (i7 >= 10 && 16 >= i7) {
                this.zzb = Integer.valueOf(i7);
                return this;
            }
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i7);
        }

        private zzb() {
            this.zza = null;
            this.zzb = null;
            this.zzc = zza.zzd;
        }

        public final zzb zza(zza zzaVar) {
            this.zzc = zzaVar;
            return this;
        }

        public final zzqu zza() throws GeneralSecurityException {
            Integer num = this.zza;
            if (num != null) {
                if (this.zzb != null) {
                    if (this.zzc != null) {
                        return new zzqu(num.intValue(), this.zzb.intValue(), this.zzc);
                    }
                    throw new GeneralSecurityException("variant not set");
                }
                throw new GeneralSecurityException("tag size not set");
            }
            throw new GeneralSecurityException("key size not set");
        }
    }

    public static zzb zzd() {
        return new zzb();
    }

    private final int zzf() {
        zza zzaVar = this.zzc;
        if (zzaVar == zza.zzd) {
            return this.zzb;
        }
        if (zzaVar != zza.zza && zzaVar != zza.zzb && zzaVar != zza.zzc) {
            throw new IllegalStateException("Unknown variant");
        }
        int i7 = this.zzb;
        return i7 + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqu)) {
            return false;
        }
        zzqu zzquVar = (zzqu) obj;
        return zzquVar.zza == this.zza && zzquVar.zzf() == zzf() && zzquVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzqu.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.zzc) + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzcb
    public final boolean zza() {
        return this.zzc != zza.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zza zze() {
        return this.zzc;
    }

    private zzqu(int i7, int i8, zza zzaVar) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = zzaVar;
    }
}
