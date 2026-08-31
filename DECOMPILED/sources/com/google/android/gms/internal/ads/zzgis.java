package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgis extends zzgiq implements ListIterator {
    final /* synthetic */ zzgit zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgis(zzgit zzgitVar) {
        super(zzgitVar);
        Objects.requireNonNull(zzgitVar);
        this.zzd = zzgitVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        zzgit zzgitVar = this.zzd;
        boolean zIsEmpty = zzgitVar.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzgiu zzgiuVar = zzgitVar.zzf;
        zzgiuVar.zzq(zzgiuVar.zzp() + 1);
        if (zIsEmpty) {
            zzgitVar.zzc();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgis(zzgit zzgitVar, int i7) {
        super(zzgitVar, ((List) zzgitVar.zzb).listIterator(i7));
        Objects.requireNonNull(zzgitVar);
        this.zzd = zzgitVar;
    }
}
