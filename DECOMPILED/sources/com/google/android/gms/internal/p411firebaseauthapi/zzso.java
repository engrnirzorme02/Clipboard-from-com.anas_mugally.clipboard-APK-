package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzso extends zzst {
    private final zzsr zza;
    private final zzaal zzb;

    private zzso(zzsr zzsrVar, zzaal zzaalVar) {
        this.zza = zzsrVar;
        this.zzb = zzaalVar;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzst, com.google.android.gms.internal.p411firebaseauthapi.zzbi
    public final /* synthetic */ zzcb zza() {
        return (zzsr) zza();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzbi
    public final Integer zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzst
    /* JADX INFO: renamed from: zzc */
    public final /* synthetic */ zzss zza() {
        return this.zza;
    }

    public final zzaal zzd() {
        return this.zzb;
    }

    public static zzso zza(zzsr zzsrVar, zzaal zzaalVar) throws GeneralSecurityException {
        if (zzsrVar.zzb() == zzaalVar.zza()) {
            return new zzso(zzsrVar, zzaalVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
