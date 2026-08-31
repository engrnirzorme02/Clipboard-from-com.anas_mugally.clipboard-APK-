package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class zzgit extends zzgir implements List {
    final /* synthetic */ zzgiu zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgit(zzgiu zzgiuVar, Object obj, List list, zzgir zzgirVar) {
        super(zzgiuVar, obj, list, zzgirVar);
        Objects.requireNonNull(zzgiuVar);
        this.zzf = zzgiuVar;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        zza();
        boolean zIsEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i7, obj);
        zzgiu zzgiuVar = this.zzf;
        zzgiuVar.zzq(zzgiuVar.zzp() + 1);
        if (zIsEmpty) {
            zzc();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.zzb).addAll(i7, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.zzb.size();
        zzgiu zzgiuVar = this.zzf;
        zzgiuVar.zzq(zzgiuVar.zzp() + (size2 - size));
        if (size != 0) {
            return zAddAll;
        }
        zzc();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zza();
        return ((List) this.zzb).get(i7);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zza();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zza();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zza();
        return new zzgis(this);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        zza();
        Object objRemove = ((List) this.zzb).remove(i7);
        zzgiu zzgiuVar = this.zzf;
        zzgiuVar.zzq(zzgiuVar.zzp() - 1);
        zzb();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        zza();
        return ((List) this.zzb).set(i7, obj);
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        zza();
        List listSubList = ((List) this.zzb).subList(i7, i8);
        zzgir zzgirVar = this.zzc;
        if (zzgirVar == null) {
            zzgirVar = this;
        }
        return this.zzf.zzg(this.zza, listSubList, zzgirVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        zza();
        return new zzgis(this, i7);
    }
}
