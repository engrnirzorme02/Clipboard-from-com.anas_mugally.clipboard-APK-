package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3324b1;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfhn implements zzdde, zzcwi, zzddi {
    private final zzfib zza;
    private final zzfhr zzb;

    zzfhn(Context context, zzfib zzfibVar) {
        this.zza = zzfibVar;
        this.zzb = zzfhr.zzn(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzddi
    public final void zza() {
        if (((Boolean) zzbeb.zzd.zze()).booleanValue()) {
            zzfib zzfibVar = this.zza;
            zzfhr zzfhrVar = this.zzb;
            zzfhrVar.zzd(true);
            zzfibVar.zza(zzfhrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddi
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzdde
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdde
    public final void zzh() {
        if (((Boolean) zzbeb.zzd.zze()).booleanValue()) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzj(C3324b1 c3324b1) {
        if (((Boolean) zzbeb.zzd.zze()).booleanValue()) {
            zzfib zzfibVar = this.zza;
            zzfhr zzfhrVar = this.zzb;
            zzfhrVar.zzk(c3324b1.m17220T().toString());
            zzfhrVar.zzd(false);
            zzfibVar.zza(zzfhrVar);
        }
    }
}
