package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class zzgiq implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzgir zzc;

    zzgiq(zzgir zzgirVar) {
        Objects.requireNonNull(zzgirVar);
        this.zzc = zzgirVar;
        Collection collection = zzgirVar.zzb;
        this.zzb = collection;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
        zzgir zzgirVar = this.zzc;
        zzgiu zzgiuVar = zzgirVar.zze;
        zzgiuVar.zzq(zzgiuVar.zzp() - 1);
        zzgirVar.zzb();
    }

    final void zza() {
        zzgir zzgirVar = this.zzc;
        zzgirVar.zza();
        if (zzgirVar.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    zzgiq(zzgir zzgirVar, Iterator it) {
        Objects.requireNonNull(zzgirVar);
        this.zzc = zzgirVar;
        this.zzb = zzgirVar.zzb;
        this.zza = it;
    }
}
