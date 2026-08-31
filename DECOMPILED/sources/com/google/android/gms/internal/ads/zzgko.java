package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzgko extends AbstractSequentialList implements Serializable {
    final List zza;
    final zzggr zzb;

    zzgko(List list, zzggr zzggrVar) {
        list.getClass();
        this.zza = list;
        this.zzb = zzggrVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        return new zzgkn(this, this.zza.listIterator(i7));
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
