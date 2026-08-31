package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzgln extends zzgke {
    private final transient zzgkc zza;
    private final transient zzgjz zzb;

    zzgln(zzgkc zzgkcVar, zzgjz zzgjzVar) {
        this.zza = zzgkcVar;
        this.zzb = zzgjzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgke, com.google.android.gms.internal.ads.zzgjv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgke, com.google.android.gms.internal.ads.zzgjv
    /* JADX INFO: renamed from: zza */
    public final zzgmd iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgke, com.google.android.gms.internal.ads.zzgjv
    public final zzgjz zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    final int zzg(Object[] objArr, int i7) {
        return this.zzb.zzg(objArr, i7);
    }
}
