package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqp extends zzrk {
    private final zzqu zza;
    private final zzaal zzb;
    private final zzaaj zzc;
    private final Integer zzd;

    public static class zza {
        private zzqu zza;
        private zzaal zzb;
        private Integer zzc;

        public final zza zza(zzaal zzaalVar) {
            this.zzb = zzaalVar;
            return this;
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }

        public final zza zza(Integer num) {
            this.zzc = num;
            return this;
        }

        public final zza zza(zzqu zzquVar) {
            this.zza = zzquVar;
            return this;
        }

        public final zzqp zza() throws GeneralSecurityException {
            zzaaj zzaajVarZza;
            zzqu zzquVar = this.zza;
            if (zzquVar != null && this.zzb != null) {
                if (zzquVar.zzc() == this.zzb.zza()) {
                    if (this.zza.zza() && this.zzc == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (!this.zza.zza() && this.zzc != null) {
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    if (this.zza.zze() == zzqu.zza.zzd) {
                        zzaajVarZza = zzpe.zza;
                    } else if (this.zza.zze() != zzqu.zza.zzc && this.zza.zze() != zzqu.zza.zzb) {
                        if (this.zza.zze() == zzqu.zza.zza) {
                            zzaajVarZza = zzpe.zzb(this.zzc.intValue());
                        } else {
                            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + String.valueOf(this.zza.zze()));
                        }
                    } else {
                        zzaajVarZza = zzpe.zza(this.zzc.intValue());
                    }
                    return new zzqp(this.zza, this.zzb, zzaajVarZza, this.zzc);
                }
                throw new GeneralSecurityException("Key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
    }

    public static zza zzc() {
        return new zza();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzrk, com.google.android.gms.internal.p411firebaseauthapi.zzbi
    public final /* synthetic */ zzcb zza() {
        return (zzqu) zza();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzbi
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzrk
    /* JADX INFO: renamed from: zzd */
    public final /* synthetic */ zzrn zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzrk
    public final zzaaj zze() {
        return this.zzc;
    }

    public final zzaal zzf() {
        return this.zzb;
    }

    private zzqp(zzqu zzquVar, zzaal zzaalVar, zzaaj zzaajVar, Integer num) {
        this.zza = zzquVar;
        this.zzb = zzaalVar;
        this.zzc = zzaajVar;
        this.zzd = num;
    }
}
