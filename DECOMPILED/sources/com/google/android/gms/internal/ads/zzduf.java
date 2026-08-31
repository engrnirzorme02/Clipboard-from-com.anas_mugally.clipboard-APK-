package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.AbstractBinderC3268J;
import com.google.android.gms.ads.internal.client.C3324b1;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzduf extends AbstractBinderC3268J {
    final /* synthetic */ zzdtz zza;
    final /* synthetic */ zzdug zzb;

    zzduf(zzdug zzdugVar, zzdtz zzdtzVar) {
        this.zza = zzdtzVar;
        Objects.requireNonNull(zzdugVar);
        this.zzb = zzdugVar;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zzb() {
        this.zza.zzi(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zzc(int i7) {
        this.zza.zzf(this.zzb.zzd(), i7);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zzd(C3324b1 c3324b1) {
        this.zza.zzf(this.zzb.zzd(), c3324b1.f13918a);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zzf() {
        this.zza.zze(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zzg() {
        this.zza.zzg(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zzh() {
        this.zza.zzh(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zzj() {
    }
}
