package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzgkm extends AbstractList implements RandomAccess, Serializable {
    final List zza;
    final zzggr zzb;

    zzgkm(List list, zzggr zzggrVar) {
        list.getClass();
        this.zza = list;
        this.zzb = zzggrVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return this.zzb.apply(this.zza.get(i7));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        return new zzgkl(this, this.zza.listIterator(i7));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        return this.zzb.apply(this.zza.remove(i7));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i7, int i8) {
        this.zza.subList(i7, i8).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
