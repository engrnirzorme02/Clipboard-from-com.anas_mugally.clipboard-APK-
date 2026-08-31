package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AbstractBinderC3286P;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.InterfaceC3271K;

/* JADX INFO: loaded from: classes2.dex */
public final class zzekl extends AbstractBinderC3286P {
    private final zzelt zza;

    public zzekl(Context context, zzcgv zzcgvVar, zzfdb zzfdbVar, zzdje zzdjeVar, InterfaceC3271K interfaceC3271K) {
        zzelv zzelvVar = new zzelv(zzdjeVar, zzcgvVar.zzB());
        zzelvVar.zza(interfaceC3271K);
        this.zza = new zzelt(new zzemf(zzcgvVar, context, zzelvVar, zzfdbVar), zzfdbVar.zzh());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3289Q
    public final void zze(C3349h2 c3349h2) {
        this.zza.zzb(c3349h2, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3289Q
    public final synchronized String zzf() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3289Q
    public final synchronized boolean zzg() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3289Q
    public final synchronized String zzh() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3289Q
    public final synchronized void zzi(C3349h2 c3349h2, int i7) {
        this.zza.zzb(c3349h2, i7);
    }
}
