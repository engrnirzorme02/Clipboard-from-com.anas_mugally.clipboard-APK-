package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgif extends zzgks {
    final /* synthetic */ zzgih zza;

    zzgif(zzgih zzgihVar) {
        Objects.requireNonNull(zzgihVar);
        this.zza = zzgihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgks, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return zzgjb.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzgig(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgks, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        zzgih zzgihVar = this.zza;
        zzgihVar.zzb.zzn(entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgks
    final Map zza() {
        return this.zza;
    }
}
