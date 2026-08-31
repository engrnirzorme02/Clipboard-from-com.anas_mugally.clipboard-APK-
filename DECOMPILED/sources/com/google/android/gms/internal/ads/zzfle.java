package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3324b1;
import java.util.Objects;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzfle extends zzbwg {
    final /* synthetic */ zzgpm zza;
    final /* synthetic */ zzbwa zzb;
    final /* synthetic */ zzflf zzc;

    zzfle(zzflf zzflfVar, zzgpm zzgpmVar, zzbwa zzbwaVar) {
        this.zza = zzgpmVar;
        this.zzb = zzbwaVar;
        Objects.requireNonNull(zzflfVar);
        this.zzc = zzflfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zze() {
        Objects.requireNonNull(this.zzc);
        zzfjy.zza(this.zzb, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzf(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzg(C3324b1 c3324b1) {
        String string = c3324b1.m17221U().toString();
        zzflf zzflfVar = this.zzc;
        String str = zzflfVar.zze.f13901a;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 51 + String.valueOf(str).length());
        sb.append("Failed to load rewarded ad with error: ");
        sb.append(string);
        sb.append(", adUnitId: ");
        sb.append(str);
        AbstractC7599p.m33331f(sb.toString());
        zzflfVar.zzv(c3324b1);
    }
}
