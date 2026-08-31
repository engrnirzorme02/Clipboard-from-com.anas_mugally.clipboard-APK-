package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3324b1;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdui extends zzbwg {
    final /* synthetic */ zzduk zza;

    zzdui(zzduk zzdukVar) {
        Objects.requireNonNull(zzdukVar);
        this.zza = zzdukVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zze() {
        zzduk zzdukVar = this.zza;
        zzdukVar.zze().zzk(zzdukVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzf(int i7) {
        zzduk zzdukVar = this.zza;
        zzdukVar.zze().zzl(zzdukVar.zzd(), i7);
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzg(C3324b1 c3324b1) {
        zzduk zzdukVar = this.zza;
        zzdukVar.zze().zzl(zzdukVar.zzd(), c3324b1.f13918a);
    }
}
