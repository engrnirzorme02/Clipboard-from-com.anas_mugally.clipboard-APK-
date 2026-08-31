package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzrf implements zzpz {
    final /* synthetic */ zzrg zza;

    /* synthetic */ zzrf(zzrg zzrgVar, byte[] bArr) {
        Objects.requireNonNull(zzrgVar);
        this.zza = zzrgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final void zza() {
        zzlk zzlkVarZzaX = this.zza.zzaX();
        if (zzlkVarZzaX != null) {
            zzlkVarZzaX.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final void zzb(Exception exc) {
        zzds.zzf("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzav().zzi(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final void zzc(zzpw zzpwVar) {
        this.zza.zzav().zzl(zzpwVar);
    }
}
