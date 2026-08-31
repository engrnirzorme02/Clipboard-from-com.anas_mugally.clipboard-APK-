package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzzz implements zzabo {
    final /* synthetic */ zzaae zza;

    zzzz(zzaae zzaaeVar) {
        Objects.requireNonNull(zzaaeVar);
        this.zza = zzaaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zza() {
        zzlk zzlkVarZzaX = this.zza.zzaX();
        if (zzlkVarZzaX != null) {
            zzlkVarZzaX.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzb() {
        zzaae zzaaeVar = this.zza;
        if (zzaaeVar.zzbh() != null) {
            zzaaeVar.zzbg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzc() {
        zzaae zzaaeVar = this.zza;
        if (zzaaeVar.zzbh() != null) {
            zzaaeVar.zzav(0, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzd(zzbu zzbuVar) {
    }
}
