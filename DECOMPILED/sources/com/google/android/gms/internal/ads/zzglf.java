package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzglf extends zzgid {
    final transient zzght zza;

    zzglf(Map map, zzght zzghtVar) {
        super(map);
        this.zza = zzghtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgid, com.google.android.gms.internal.ads.zzgiu
    protected final /* bridge */ /* synthetic */ Collection zzc() {
        return (List) this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgiu, com.google.android.gms.internal.ads.zzgix
    final Set zzh() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgiu, com.google.android.gms.internal.ads.zzgix
    final Map zzl() {
        return zzm();
    }
}
