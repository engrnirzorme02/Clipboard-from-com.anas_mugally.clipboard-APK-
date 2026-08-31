package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzgk extends zzgjq {
    private final Map zza;

    public zzgk(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgjq, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgjq, java.util.Map
    public final boolean containsValue(Object obj) {
        return super.zzc(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgjq, java.util.Map
    public final Set entrySet() {
        return zzglz.zzb(this.zza.entrySet(), zzgi.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgjq, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && super.zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgjq, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.zza.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgjq, java.util.Map
    public final int hashCode() {
        return super.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgjq, java.util.Map
    public final boolean isEmpty() {
        if (this.zza.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgjq, java.util.Map
    public final Set keySet() {
        return zzglz.zzb(this.zza.keySet(), zzgj.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgjq, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgjq
    protected final Map zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgjq, com.google.android.gms.internal.ads.zzgjr
    protected final /* synthetic */ Object zzb() {
        return this.zza;
    }
}
