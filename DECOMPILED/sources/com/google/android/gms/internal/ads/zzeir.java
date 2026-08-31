package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzeir extends zzbvr {
    final /* synthetic */ zzcyd zza;
    final /* synthetic */ zzcvq zzb;
    final /* synthetic */ zzcwz zzc;
    final /* synthetic */ zzdei zzd;

    zzeir(zzeis zzeisVar, zzcyd zzcydVar, zzcvq zzcvqVar, zzcwz zzcwzVar, zzdei zzdeiVar) {
        this.zza = zzcydVar;
        this.zzb = zzcvqVar;
        this.zzc = zzcwzVar;
        this.zzd = zzdeiVar;
        Objects.requireNonNull(zzeisVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zze(InterfaceC3772a interfaceC3772a) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzf(InterfaceC3772a interfaceC3772a, int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzg(InterfaceC3772a interfaceC3772a) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzh(InterfaceC3772a interfaceC3772a) {
        this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzi(InterfaceC3772a interfaceC3772a) {
        this.zzd.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzj(InterfaceC3772a interfaceC3772a) {
        this.zza.zzdY(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzk(InterfaceC3772a interfaceC3772a, zzbvt zzbvtVar) {
        this.zzd.zzb(zzbvtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzl(InterfaceC3772a interfaceC3772a) {
        this.zzb.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzm(InterfaceC3772a interfaceC3772a, int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzn(InterfaceC3772a interfaceC3772a) {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzo(InterfaceC3772a interfaceC3772a) {
        this.zzc.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzp(InterfaceC3772a interfaceC3772a) {
        this.zzd.zzb(null);
    }
}
