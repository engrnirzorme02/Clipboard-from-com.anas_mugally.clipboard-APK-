package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdro implements zzfhi {
    private final Map zza;
    private final zzbbh zzb;

    zzdro(zzbbh zzbbhVar, Map map) {
        this.zza = map;
        this.zzb = zzbbhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdP(zzfhb zzfhbVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdQ(zzfhb zzfhbVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfhbVar)) {
            this.zzb.zzc(((zzdrn) map.get(zzfhbVar)).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdR(zzfhb zzfhbVar, String str, Throwable th) {
        Map map = this.zza;
        if (map.containsKey(zzfhbVar)) {
            this.zzb.zzc(((zzdrn) map.get(zzfhbVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdS(zzfhb zzfhbVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfhbVar)) {
            this.zzb.zzc(((zzdrn) map.get(zzfhbVar)).zzb);
        }
    }
}
