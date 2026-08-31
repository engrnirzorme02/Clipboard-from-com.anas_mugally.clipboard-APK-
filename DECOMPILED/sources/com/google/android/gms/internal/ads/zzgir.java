package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class zzgir extends AbstractCollection {
    final Object zza;
    Collection zzb;
    final zzgir zzc;
    final Collection zzd;
    final /* synthetic */ zzgiu zze;

    zzgir(zzgiu zzgiuVar, Object obj, Collection collection, zzgir zzgirVar) {
        Objects.requireNonNull(zzgiuVar);
        this.zze = zzgiuVar;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzgirVar;
        this.zzd = zzgirVar == null ? null : zzgirVar.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zza();
        boolean zIsEmpty = this.zzb.isEmpty();
        boolean zAdd = this.zzb.add(obj);
        if (zAdd) {
            zzgiu zzgiuVar = this.zze;
            zzgiuVar.zzq(zzgiuVar.zzp() + 1);
            if (zIsEmpty) {
                zzc();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.zzb.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.zzb.size();
        zzgiu zzgiuVar = this.zze;
        zzgiuVar.zzq(zzgiuVar.zzp() + (size2 - size));
        if (size != 0) {
            return zAddAll;
        }
        zzc();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.zzb.clear();
        zzgiu zzgiuVar = this.zze;
        zzgiuVar.zzq(zzgiuVar.zzp() - size);
        zzb();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zza();
        return this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zza();
        return this.zzb.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zza();
        return this.zzb.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zza();
        return this.zzb.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zza();
        return new zzgiq(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zza();
        boolean zRemove = this.zzb.remove(obj);
        if (zRemove) {
            zzgiu zzgiuVar = this.zze;
            zzgiuVar.zzq(zzgiuVar.zzp() - 1);
            zzb();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.zzb.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.zzb.size();
            zzgiu zzgiuVar = this.zze;
            zzgiuVar.zzq(zzgiuVar.zzp() + (size2 - size));
            zzb();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.zzb.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.zzb.size();
            zzgiu zzgiuVar = this.zze;
            zzgiuVar.zzq(zzgiuVar.zzp() + (size2 - size));
            zzb();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zza();
        return this.zzb.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zza();
        return this.zzb.toString();
    }

    final void zza() {
        zzgir zzgirVar = this.zzc;
        if (zzgirVar != null) {
            zzgirVar.zza();
            if (zzgirVar.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.zzb.isEmpty()) {
            zzgiu zzgiuVar = this.zze;
            Collection collection = (Collection) zzgiuVar.zzo().get(this.zza);
            if (collection != null) {
                this.zzb = collection;
            }
        }
    }

    final void zzb() {
        zzgir zzgirVar = this.zzc;
        if (zzgirVar != null) {
            zzgirVar.zzb();
        } else if (this.zzb.isEmpty()) {
            zzgiu zzgiuVar = this.zze;
            zzgiuVar.zzo().remove(this.zza);
        }
    }

    final void zzc() {
        zzgir zzgirVar = this.zzc;
        if (zzgirVar != null) {
            zzgirVar.zzc();
            return;
        }
        zzgiu zzgiuVar = this.zze;
        zzgiuVar.zzo().put(this.zza, this.zzb);
    }
}
