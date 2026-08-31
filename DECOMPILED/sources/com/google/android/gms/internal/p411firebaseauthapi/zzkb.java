package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkb extends zzlg {
    private static final Set<zzcb> zza = (Set) zzql.zza(new zzqo() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkd
        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzqo
        public final Object zza() {
            return zzkb.zzj();
        }
    });
    private final zzc zzb;
    private final zzb zzc;
    private final zze zzd;
    private final zzd zze;
    private final zzcb zzf;
    private final zzaaj zzg;

    public static final class zza {
        private zzc zza;
        private zzb zzb;
        private zze zzc;
        private zzcb zzd;
        private zzd zze;
        private zzaaj zzf;

        public final zza zza(zzc zzcVar) {
            this.zza = zzcVar;
            return this;
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = zzd.zzc;
            this.zzf = null;
        }

        public final zza zza(zzcb zzcbVar) throws GeneralSecurityException {
            if (zzkb.zza.contains(zzcbVar)) {
                this.zzd = zzcbVar;
                return this;
            }
            throw new GeneralSecurityException("Invalid DEM parameters " + String.valueOf(zzcbVar) + "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported.");
        }

        public final zza zza(zzb zzbVar) {
            this.zzb = zzbVar;
            return this;
        }

        public final zza zza(zze zzeVar) {
            this.zzc = zzeVar;
            return this;
        }

        public final zza zza(zzaaj zzaajVar) {
            if (zzaajVar.zza() == 0) {
                this.zzf = null;
                return this;
            }
            this.zzf = zzaajVar;
            return this;
        }

        public final zza zza(zzd zzdVar) {
            this.zze = zzdVar;
            return this;
        }

        public final zzkb zza() throws GeneralSecurityException {
            zzc zzcVar = this.zza;
            if (zzcVar != null) {
                if (this.zzb != null) {
                    if (this.zzd != null) {
                        if (this.zze != null) {
                            zzc zzcVar2 = zzc.zzd;
                            if (zzcVar != zzcVar2 && this.zzc == null) {
                                throw new GeneralSecurityException("Point format is not set");
                            }
                            if (zzcVar == zzcVar2 && this.zzc != null) {
                                throw new GeneralSecurityException("For Curve25519 point format must not be set");
                            }
                            return new zzkb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
                        }
                        throw new GeneralSecurityException("Variant is not set");
                    }
                    throw new GeneralSecurityException("DEM parameters are not set");
                }
                throw new GeneralSecurityException("Hash type is not set");
            }
            throw new GeneralSecurityException("Elliptic curve type is not set");
        }
    }

    public static final class zzb {
        public static final zzb zza = new zzb("SHA1");
        public static final zzb zzb = new zzb("SHA224");
        public static final zzb zzc = new zzb("SHA256");
        public static final zzb zzd = new zzb("SHA384");
        public static final zzb zze = new zzb("SHA512");
        private final String zzf;

        private zzb(String str) {
            this.zzf = str;
        }

        public final String toString() {
            return this.zzf;
        }
    }

    public static final class zzc {
        public static final zzc zza = new zzc("NIST_P256");
        public static final zzc zzb = new zzc("NIST_P384");
        public static final zzc zzc = new zzc("NIST_P521");
        public static final zzc zzd = new zzc("X25519");
        private final String zze;

        private zzc(String str) {
            this.zze = str;
        }

        public final String toString() {
            return this.zze;
        }
    }

    public static final class zzd {
        public static final zzd zza = new zzd("TINK");
        public static final zzd zzb = new zzd("CRUNCHY");
        public static final zzd zzc = new zzd("NO_PREFIX");
        private final String zzd;

        private zzd(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    public static final class zze {
        public static final zze zza = new zze("COMPRESSED");
        public static final zze zzb = new zze("UNCOMPRESSED");
        public static final zze zzc = new zze("LEGACY_UNCOMPRESSED");
        private final String zzd;

        private zze(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    public static zza zzc() {
        return new zza();
    }

    static /* synthetic */ Set zzj() throws GeneralSecurityException {
        HashSet hashSet = new HashSet();
        zzdx.zzb zzbVarZzc = zzdx.zze().zza(12).zzb(16).zzc(16);
        zzdx.zza zzaVar = zzdx.zza.zzc;
        hashSet.add(zzbVarZzc.zza(zzaVar).zza());
        hashSet.add(zzdx.zze().zza(12).zzb(32).zzc(16).zza(zzaVar).zza());
        zzdi.zzb zzbVarZzc2 = zzdi.zzf().zza(16).zzb(32).zzd(16).zzc(16);
        zzdi.zza zzaVar2 = zzdi.zza.zzc;
        zzdi.zzb zzbVarZza = zzbVarZzc2.zza(zzaVar2);
        zzdi.zzc zzcVar = zzdi.zzc.zzc;
        hashSet.add(zzbVarZza.zza(zzcVar).zza());
        hashSet.add(zzdi.zzf().zza(32).zzb(32).zzd(32).zzc(16).zza(zzaVar2).zza(zzcVar).zza());
        hashSet.add(zzge.zzc());
        hashSet.add(zzjf.zzc().zza(64).zza(zzjf.zza.zzc).zza());
        return Collections.unmodifiableSet(hashSet);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzkb)) {
            return false;
        }
        zzkb zzkbVar = (zzkb) obj;
        return Objects.equals(zzkbVar.zzb, this.zzb) && Objects.equals(zzkbVar.zzc, this.zzc) && Objects.equals(zzkbVar.zzd, this.zzd) && Objects.equals(zzkbVar.zzf, this.zzf) && Objects.equals(zzkbVar.zze, this.zze) && Objects.equals(zzkbVar.zzg, this.zzg);
    }

    public final int hashCode() {
        return Objects.hash(zzkb.class, this.zzb, this.zzc, this.zzd, this.zzf, this.zze, this.zzg);
    }

    public final String toString() {
        return String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", this.zzb, this.zzc, this.zzd, this.zzf, this.zze, this.zzg);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzcb
    public final boolean zza() {
        return this.zze != zzd.zzc;
    }

    public final zzcb zzb() {
        return this.zzf;
    }

    public final zzc zzd() {
        return this.zzb;
    }

    public final zzb zze() {
        return this.zzc;
    }

    public final zze zzf() {
        return this.zzd;
    }

    public final zzd zzg() {
        return this.zze;
    }

    public final zzaaj zzh() {
        return this.zzg;
    }

    private zzkb(zzc zzcVar, zzb zzbVar, zze zzeVar, zzcb zzcbVar, zzd zzdVar, zzaaj zzaajVar) {
        this.zzb = zzcVar;
        this.zzc = zzbVar;
        this.zzd = zzeVar;
        this.zzf = zzcbVar;
        this.zze = zzdVar;
        this.zzg = zzaajVar;
    }
}
