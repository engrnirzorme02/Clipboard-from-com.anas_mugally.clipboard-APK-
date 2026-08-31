package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkg extends zzlg {
    private final zzf zza;
    private final zzc zzb;
    private final zzb zzc;
    private final zze zzd;

    private static class zza {
        private final String zza;
        private final int zzb;

        public String toString() {
            return String.format("%s(0x%04x)", this.zza, Integer.valueOf(this.zzb));
        }

        private zza(String str, int i7) {
            this.zza = str;
            this.zzb = i7;
        }
    }

    public static final class zzb extends zza {
        public static final zzb zza = new zzb("AES_128_GCM", 1);
        public static final zzb zzb = new zzb("AES_256_GCM", 2);
        public static final zzb zzc = new zzb("CHACHA20_POLY1305", 3);

        private zzb(String str, int i7) {
            super(str, i7);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzkg.zza
        public final /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    public static final class zzc extends zza {
        public static final zzc zza = new zzc("HKDF_SHA256", 1);
        public static final zzc zzb = new zzc("HKDF_SHA384", 2);
        public static final zzc zzc = new zzc("HKDF_SHA512", 3);

        private zzc(String str, int i7) {
            super(str, i7);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzkg.zza
        public final /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    public static final class zzd {
        private zzf zza;
        private zzc zzb;
        private zzb zzc;
        private zze zzd;

        public final zzd zza(zzb zzbVar) {
            this.zzc = zzbVar;
            return this;
        }

        private zzd() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = zze.zzc;
        }

        public final zzd zza(zzc zzcVar) {
            this.zzb = zzcVar;
            return this;
        }

        public final zzd zza(zzf zzfVar) {
            this.zza = zzfVar;
            return this;
        }

        public final zzd zza(zze zzeVar) {
            this.zzd = zzeVar;
            return this;
        }

        public final zzkg zza() throws GeneralSecurityException {
            zzf zzfVar = this.zza;
            if (zzfVar != null) {
                zzc zzcVar = this.zzb;
                if (zzcVar != null) {
                    zzb zzbVar = this.zzc;
                    if (zzbVar != null) {
                        zze zzeVar = this.zzd;
                        if (zzeVar != null) {
                            return new zzkg(zzfVar, zzcVar, zzbVar, zzeVar);
                        }
                        throw new GeneralSecurityException("HPKE variant is not set");
                    }
                    throw new GeneralSecurityException("HPKE AEAD parameter is not set");
                }
                throw new GeneralSecurityException("HPKE KDF parameter is not set");
            }
            throw new GeneralSecurityException("HPKE KEM parameter is not set");
        }
    }

    public static final class zze {
        public static final zze zza = new zze("TINK");
        public static final zze zzb = new zze("CRUNCHY");
        public static final zze zzc = new zze("NO_PREFIX");
        private final String zzd;

        private zze(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    public static final class zzf extends zza {
        public static final zzf zza = new zzf("DHKEM_P256_HKDF_SHA256", 16);
        public static final zzf zzb = new zzf("DHKEM_P384_HKDF_SHA384", 17);
        public static final zzf zzc = new zzf("DHKEM_P521_HKDF_SHA512", 18);
        public static final zzf zzd = new zzf("DHKEM_X25519_HKDF_SHA256", 32);

        private zzf(String str, int i7) {
            super(str, i7);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzkg.zza
        public final /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    public static zzd zzc() {
        return new zzd();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzkg)) {
            return false;
        }
        zzkg zzkgVar = (zzkg) obj;
        return this.zza == zzkgVar.zza && this.zzb == zzkgVar.zzb && this.zzc == zzkgVar.zzc && this.zzd == zzkgVar.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzkg.class, this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final String toString() {
        return "HPKE Parameters (Variant: " + String.valueOf(this.zzd) + ", KemId: " + String.valueOf(this.zza) + ", KdfId: " + String.valueOf(this.zzb) + ", AeadId: " + String.valueOf(this.zzc) + ")";
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzcb
    public final boolean zza() {
        return this.zzd != zze.zzc;
    }

    public final zzb zzb() {
        return this.zzc;
    }

    public final zzc zzd() {
        return this.zzb;
    }

    public final zzf zze() {
        return this.zza;
    }

    public final zze zzf() {
        return this.zzd;
    }

    private zzkg(zzf zzfVar, zzc zzcVar, zzb zzbVar, zze zzeVar) {
        this.zza = zzfVar;
        this.zzb = zzcVar;
        this.zzc = zzbVar;
        this.zzd = zzeVar;
    }
}
