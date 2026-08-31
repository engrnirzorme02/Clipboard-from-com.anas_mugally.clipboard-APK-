package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzakz implements zzajq {
    private final zzaks zza;
    private final long[] zzb;
    private final Map zzc;
    private final Map zzd;
    private final Map zze;

    public zzakz(zzaks zzaksVar, Map map, Map map2, Map map3) {
        this.zza = zzaksVar;
        this.zzd = map2;
        this.zze = map3;
        this.zzc = Collections.unmodifiableMap(map);
        this.zzb = zzaksVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzajq
    public final int zza() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzajq
    public final long zzb(int i7) {
        return this.zzb[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzajq
    public final List zzc(long j7) {
        return this.zza.zzh(j7, this.zzc, this.zzd, this.zze);
    }
}
