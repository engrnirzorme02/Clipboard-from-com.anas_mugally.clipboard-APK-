package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdd extends zzcw {
    private final zzdi zza;
    private final zzaal zzb;
    private final zzaal zzc;
    private final zzaaj zzd;
    private final Integer zze;

    public static class zza {
        private zzdi zza;
        private zzaal zzb;
        private zzaal zzc;
        private Integer zzd;

        public final zza zza(zzaal zzaalVar) {
            this.zzb = zzaalVar;
            return this;
        }

        public final zza zzb(zzaal zzaalVar) {
            this.zzc = zzaalVar;
            return this;
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
        }

        public final zza zza(Integer num) {
            this.zzd = num;
            return this;
        }

        public final zza zza(zzdi zzdiVar) {
            this.zza = zzdiVar;
            return this;
        }

        public final zzdd zza() throws GeneralSecurityException {
            zzaaj zzaajVarZzb;
            zzdi zzdiVar = this.zza;
            if (zzdiVar != null) {
                if (this.zzb != null && this.zzc != null) {
                    if (zzdiVar.zzb() == this.zzb.zza()) {
                        if (this.zza.zzc() == this.zzc.zza()) {
                            if (this.zza.zza() && this.zzd == null) {
                                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                            }
                            if (!this.zza.zza() && this.zzd != null) {
                                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                            }
                            if (this.zza.zzh() == zzdi.zzc.zzc) {
                                zzaajVarZzb = zzpe.zza;
                            } else if (this.zza.zzh() == zzdi.zzc.zzb) {
                                zzaajVarZzb = zzpe.zza(this.zzd.intValue());
                            } else if (this.zza.zzh() == zzdi.zzc.zza) {
                                zzaajVarZzb = zzpe.zzb(this.zzd.intValue());
                            } else {
                                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + String.valueOf(this.zza.zzh()));
                            }
                            return new zzdd(this.zza, this.zzb, this.zzc, zzaajVarZzb, this.zzd);
                        }
                        throw new GeneralSecurityException("HMAC key size mismatch");
                    }
                    throw new GeneralSecurityException("AES key size mismatch");
                }
                throw new GeneralSecurityException("Cannot build without key material");
            }
            throw new GeneralSecurityException("Cannot build without parameters");
        }
    }

    public static zza zze() {
        return new zza();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzcw, com.google.android.gms.internal.p411firebaseauthapi.zzbi
    public final /* synthetic */ zzcb zza() {
        return (zzdi) zza();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzbi
    public final Integer zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzcw
    /* JADX INFO: renamed from: zzc */
    public final /* synthetic */ zzcy zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzcw
    public final zzaaj zzd() {
        return this.zzd;
    }

    public final zzaal zzf() {
        return this.zzb;
    }

    public final zzaal zzg() {
        return this.zzc;
    }

    private zzdd(zzdi zzdiVar, zzaal zzaalVar, zzaal zzaalVar2, zzaaj zzaajVar, Integer num) {
        this.zza = zzdiVar;
        this.zzb = zzaalVar;
        this.zzc = zzaalVar2;
        this.zzd = zzaajVar;
        this.zze = num;
    }
}
