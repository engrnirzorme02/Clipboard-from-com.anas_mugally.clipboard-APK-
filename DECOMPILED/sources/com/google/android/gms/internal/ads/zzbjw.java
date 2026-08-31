package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.InterfaceC3318a;
import java.util.Map;
import java.util.Objects;
import p396y2.InterfaceC7512G;

/* JADX INFO: loaded from: classes2.dex */
final class zzbjw implements InterfaceC7512G {
    boolean zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ InterfaceC3318a zzc;
    final /* synthetic */ Map zzd;
    final /* synthetic */ Map zze;

    zzbjw(zzbjy zzbjyVar, boolean z7, InterfaceC3318a interfaceC3318a, Map map, Map map2) {
        this.zzb = z7;
        this.zzc = interfaceC3318a;
        this.zzd = map;
        this.zze = map2;
        Objects.requireNonNull(zzbjyVar);
        this.zza = false;
    }

    @Override // p396y2.InterfaceC7512G
    public final void zza(boolean z7) {
        if (this.zza) {
            return;
        }
        if (z7 && this.zzb) {
            ((zzddz) this.zzc).zzdz();
        }
        this.zza = true;
        Map map = this.zzd;
        map.put((String) this.zze.get("event_id"), Boolean.valueOf(z7));
        ((zzbmh) this.zzc).zze("openIntentAsync", map);
    }

    @Override // p396y2.InterfaceC7512G
    public final void zzb(int i7) {
    }
}
