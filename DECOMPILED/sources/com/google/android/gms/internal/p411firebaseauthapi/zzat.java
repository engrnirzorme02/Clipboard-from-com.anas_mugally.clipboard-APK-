package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzat<K> extends zzaq<K> {
    private final transient zzal<K, ?> zza;
    private final transient zzah<K> zzb;

    zzat(zzal<K, ?> zzalVar, zzah<K> zzahVar) {
        this.zza = zzalVar;
        this.zzb = zzahVar;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzag, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaq, com.google.android.gms.internal.p411firebaseauthapi.zzag, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzag
    final int zza(Object[] objArr, int i7) {
        return zzc().zza(objArr, i7);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaq, com.google.android.gms.internal.p411firebaseauthapi.zzag
    public final zzah<K> zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzag
    /* JADX INFO: renamed from: zzd */
    public final zzay<K> iterator() {
        return (zzay) zzc().iterator();
    }
}
