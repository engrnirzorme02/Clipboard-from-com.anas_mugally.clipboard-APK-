package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.AbstractBinderC3277M;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.client.InterfaceC3312Y;
import java.util.Objects;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzfkg extends AbstractBinderC3277M {
    final /* synthetic */ zzgpm zza;
    final /* synthetic */ InterfaceC3312Y zzb;
    final /* synthetic */ zzfkh zzc;

    zzfkg(zzfkh zzfkhVar, zzgpm zzgpmVar, InterfaceC3312Y interfaceC3312Y) {
        this.zza = zzgpmVar;
        this.zzb = interfaceC3312Y;
        Objects.requireNonNull(zzfkhVar);
        this.zzc = zzfkhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3280N
    public final void zzb() {
        Objects.requireNonNull(this.zzc);
        zzfjy.zza(this.zzb, this.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3280N
    public final void zzc(C3324b1 c3324b1) {
        String string = c3324b1.m17221U().toString();
        zzfkh zzfkhVar = this.zzc;
        String str = zzfkhVar.zze.f13901a;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 57 + String.valueOf(str).length());
        sb.append("Failed to load interstitial ad with error: ");
        sb.append(string);
        sb.append(" for ad unit: ");
        sb.append(str);
        AbstractC7599p.m33331f(sb.toString());
        zzfkhVar.zzv(c3324b1);
    }
}
