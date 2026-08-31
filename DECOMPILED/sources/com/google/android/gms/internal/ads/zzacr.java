package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzacr implements zzaeb {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzu(zzu zzuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final int zzv(zzi zziVar, int i7, boolean z7, int i8) throws EOFException {
        int iZza = zziVar.zza(this.zza, 0, Math.min(4096, i7));
        if (iZza != -1) {
            return iZza;
        }
        if (z7) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzw(zzef zzefVar, int i7, int i8) {
        zzefVar.zzk(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzx(long j7, int i7, int i8, int i9, zzaea zzaeaVar) {
    }
}
