package com.google.android.gms.internal.p411firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzet extends zzcw {
    private final zzev zza;
    private final zzaaj zzb;
    private final Integer zzc;

    private zzet(zzev zzevVar, zzaaj zzaajVar, Integer num) {
        this.zza = zzevVar;
        this.zzb = zzaajVar;
        this.zzc = num;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzcw, com.google.android.gms.internal.p411firebaseauthapi.zzbi
    public final /* synthetic */ zzcb zza() {
        return (zzev) zza();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzbi
    public final Integer zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzcw
    /* JADX INFO: renamed from: zzc */
    public final /* synthetic */ zzcy zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzcw
    public final zzaaj zzd() {
        return this.zzb;
    }

    public static zzet zza(zzev zzevVar, Integer num) throws GeneralSecurityException {
        zzaaj zzaajVarZza;
        if (zzevVar.zzb() == zzev.zza.zza) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzaajVarZza = zzaaj.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzevVar.zzb() != zzev.zza.zzb) {
                throw new GeneralSecurityException("Unknown Variant: " + String.valueOf(zzevVar.zzb()));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzaajVarZza = zzaaj.zza(new byte[0]);
        }
        return new zzet(zzevVar, zzaajVarZza, num);
    }
}
