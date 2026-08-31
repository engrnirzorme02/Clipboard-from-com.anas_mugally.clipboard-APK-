package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.InterfaceC3318a;
import java.util.Map;
import java.util.Objects;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
final class zzbju implements zzgoq {
    final /* synthetic */ Map zza;
    final /* synthetic */ InterfaceC3318a zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbjy zzd;

    zzbju(zzbjy zzbjyVar, Map map, InterfaceC3318a interfaceC3318a, String str) {
        this.zza = map;
        this.zzb = interfaceC3318a;
        this.zzc = str;
        Objects.requireNonNull(zzbjyVar);
        this.zzd = zzbjyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        C7351t.m32354l().zzg(th, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkR)).booleanValue()) {
            this.zza.put("u", str);
        }
        this.zzd.zzf(str, this.zzb, this.zza, this.zzc);
    }
}
