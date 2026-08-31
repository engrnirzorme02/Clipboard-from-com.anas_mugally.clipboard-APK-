package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.InterfaceC3318a;
import com.google.android.gms.common.util.InterfaceC3750e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcsi implements zzcxg, InterfaceC3318a, zzcyy, zzcwm, zzcvs, zzdbj {
    private final InterfaceC3750e zza;
    private final zzbyp zzb;

    public zzcsi(InterfaceC3750e interfaceC3750e, zzbyp zzbypVar) {
        this.zza = interfaceC3750e;
        this.zzb = zzbypVar;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3318a
    public final void onAdClicked() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzd(zzbvh zzbvhVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdO() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdT(zzbuv zzbuvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdU(zzfcu zzfcuVar) {
        this.zzb.zzd(this.zza.mo18161c());
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdw() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdx() {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdy() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzg() {
        this.zzb.zzh(true);
    }

    public final void zzi(C3349h2 c3349h2) {
        this.zzb.zza(c3349h2);
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzj(zzbbn.zzb zzbVar) {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzk(zzbbn.zzb zzbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzl(zzbbn.zzb zzbVar) {
        this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzm(boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzn(boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzo() {
    }

    public final String zzp() {
        return this.zzb.zzj();
    }
}
