package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AbstractBinderC3297T;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.ads.internal.client.C3391s0;
import com.google.android.gms.ads.internal.client.InterfaceC3271K;
import com.google.android.gms.ads.internal.client.InterfaceC3289Q;
import java.util.ArrayList;
import p340r2.C6883a;
import p340r2.C6889g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzekk extends AbstractBinderC3297T {
    final zzfdb zza;
    final zzdjd zzb;
    private final Context zzc;
    private final zzcgv zzd;
    private InterfaceC3271K zze;

    public zzekk(zzcgv zzcgvVar, Context context, String str) {
        zzfdb zzfdbVar = new zzfdb();
        this.zza = zzfdbVar;
        this.zzb = new zzdjd();
        this.zzd = zzcgvVar;
        zzfdbVar.zzg(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3300U
    public final InterfaceC3289Q zze() {
        zzdje zzdjeVarZzg = this.zzb.zzg();
        ArrayList arrayListZzh = zzdjeVarZzg.zzh();
        zzfdb zzfdbVar = this.zza;
        zzfdbVar.zzm(arrayListZzh);
        zzfdbVar.zzn(zzdjeVarZzg.zzi());
        if (zzfdbVar.zzf() == null) {
            zzfdbVar.zzc(C3369m2.m17288U());
        }
        return new zzekl(this.zzc, this.zzd, zzfdbVar, zzdjeVarZzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3300U
    public final void zzf(InterfaceC3271K interfaceC3271K) {
        this.zze = interfaceC3271K;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3300U
    public final void zzg(zzbgu zzbguVar) {
        this.zzb.zzb(zzbguVar);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3300U
    public final void zzh(zzbgx zzbgxVar) {
        this.zzb.zza(zzbgxVar);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3300U
    public final void zzi(String str, zzbhd zzbhdVar, zzbha zzbhaVar) {
        this.zzb.zzf(str, zzbhdVar, zzbhaVar);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3300U
    public final void zzj(zzbfl zzbflVar) {
        this.zza.zzo(zzbflVar);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3300U
    public final void zzk(zzbhh zzbhhVar, C3369m2 c3369m2) {
        this.zzb.zzd(zzbhhVar);
        this.zza.zzc(c3369m2);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3300U
    public final void zzl(C6889g c6889g) {
        this.zza.zzr(c6889g);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3300U
    public final void zzm(zzbhk zzbhkVar) {
        this.zzb.zzc(zzbhkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3300U
    public final void zzn(zzblw zzblwVar) {
        this.zza.zzq(zzblwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3300U
    public final void zzo(zzbmf zzbmfVar) {
        this.zzb.zze(zzbmfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3300U
    public final void zzp(C6883a c6883a) {
        this.zza.zzs(c6883a);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3300U
    public final void zzq(C3391s0 c3391s0) {
        this.zza.zzX(c3391s0);
    }
}
