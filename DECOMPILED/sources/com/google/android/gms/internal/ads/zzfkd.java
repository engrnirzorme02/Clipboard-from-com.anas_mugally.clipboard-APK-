package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3296S1;
import com.google.android.gms.ads.internal.client.C3324b1;
import java.util.Objects;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzfkd extends zzbad {
    final /* synthetic */ zzgpm zza;
    final /* synthetic */ C3296S1 zzb;
    final /* synthetic */ zzfke zzc;

    zzfkd(zzfke zzfkeVar, zzgpm zzgpmVar, C3296S1 c3296s1) {
        this.zza = zzgpmVar;
        this.zzb = c3296s1;
        Objects.requireNonNull(zzfkeVar);
        this.zzc = zzfkeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final void zzb(zzbab zzbabVar) {
        Objects.requireNonNull(this.zzc);
        zzfjy.zza(zzbabVar, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final void zzc(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final void zzd(C3324b1 c3324b1) {
        String string = c3324b1.m17221U().toString();
        String str = this.zzb.f13901a;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 60 + String.valueOf(str).length());
        sb.append("Failed to load app open ad with error parcel: ");
        sb.append(string);
        sb.append(" for ad unit: ");
        sb.append(str);
        AbstractC7599p.m33331f(sb.toString());
        zzfke zzfkeVar = this.zzc;
        Objects.requireNonNull(zzfkeVar);
        zzfkeVar.zzv(c3324b1);
    }
}
