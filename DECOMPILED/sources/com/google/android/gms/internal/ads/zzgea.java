package com.google.android.gms.internal.ads;

import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgea {
    private final zzfvz zza;
    private final zzftp zzb;

    zzgea(zzftp zzftpVar, zzfvz zzfvzVar) {
        this.zza = zzfvzVar;
        this.zzb = zzftpVar;
    }

    public final zzgdy zza(int i7) {
        return new zzgdy(i7, this.zzb, this.zza);
    }

    public final void zzb(int i7) {
        this.zza.zzb(i7 - 1, -1L, null, null);
    }

    public final void zzc(int i7, String str) {
        this.zza.zzb(15203, -1L, null, str);
    }

    public final void zzd(int i7, Throwable th) {
        this.zza.zzb(i7 - 1, -1L, th, null);
    }

    public final InterfaceFutureC1673e zze(int i7, InterfaceFutureC1673e interfaceFutureC1673e) {
        zzgdy zzgdyVarZza = zza(i7);
        zzgdyVarZza.zza();
        zzgot.zzq(interfaceFutureC1673e, new zzgdz(this, zzgdyVarZza), zzgpk.zza());
        return interfaceFutureC1673e;
    }
}
