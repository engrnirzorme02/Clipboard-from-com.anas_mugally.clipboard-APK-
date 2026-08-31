package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaeu implements zzacu {
    private final zzef zza = new zzef(4);
    private final zzadx zzb = new zzadx(-1, -1, "image/avif");

    private final boolean zza(zzacv zzacvVar, int i7) {
        zzef zzefVar = this.zza;
        zzefVar.zza(4);
        ((zzacl) zzacvVar).zzh(zzefVar.zzi(), 0, 4, false);
        return zzefVar.zzz() == ((long) i7);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws EOFException, InterruptedIOException {
        ((zzacl) zzacvVar).zzj(4, false);
        return zza(zzacvVar, 1718909296) && zza(zzacvVar, 1635150182);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zzb.zzf(zzacxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) {
        return this.zzb.zzg(zzacvVar, zzadsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j7, long j8) {
        this.zzb.zzh(j7, j8);
    }
}
