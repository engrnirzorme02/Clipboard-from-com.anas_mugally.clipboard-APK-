package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdnd extends zzbgm {
    private final String zza;
    private final zzdip zzb;
    private final zzdiu zzc;

    public zzdnd(String str, zzdip zzdipVar, zzdiu zzdiuVar) {
        this.zza = str;
        this.zzb = zzdipVar;
        this.zzc = zzdiuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final InterfaceC3772a zzb() {
        return BinderC3773b.m18221N0(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final String zzc() {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final List zzd() {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final String zze() {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final zzbfw zzf() {
        return this.zzc.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final String zzg() {
        return this.zzc.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final String zzh() {
        return this.zzc.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final Bundle zzi() {
        return this.zzc.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzj() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final InterfaceC3340f1 zzk() {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzl(Bundle bundle) {
        this.zzb.zzc(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final boolean zzm(Bundle bundle) {
        return this.zzb.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzn(Bundle bundle) {
        this.zzb.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final zzbfp zzo() {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final InterfaceC3772a zzp() {
        return this.zzc.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final String zzq() {
        return this.zza;
    }
}
