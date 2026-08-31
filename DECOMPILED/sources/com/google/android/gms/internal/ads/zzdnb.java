package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdnb extends zzbgk {
    private final String zza;
    private final zzdip zzb;
    private final zzdiu zzc;

    public zzdnb(String str, zzdip zzdipVar, zzdiu zzdiuVar) {
        this.zza = str;
        this.zzb = zzdipVar;
        this.zzc = zzdiuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final InterfaceC3772a zzb() {
        return BinderC3773b.m18221N0(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final String zzc() {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final List zzd() {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final String zze() {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final zzbfw zzf() {
        return this.zzc.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final String zzg() {
        return this.zzc.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final double zzh() {
        return this.zzc.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final String zzi() {
        return this.zzc.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final String zzj() {
        return this.zzc.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final Bundle zzk() {
        return this.zzc.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final void zzl() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final InterfaceC3340f1 zzm() {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final void zzn(Bundle bundle) {
        this.zzb.zzc(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final boolean zzo(Bundle bundle) {
        return this.zzb.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final void zzp(Bundle bundle) {
        this.zzb.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final zzbfp zzq() {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final InterfaceC3772a zzr() {
        return this.zzc.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final String zzs() {
        return this.zza;
    }
}
