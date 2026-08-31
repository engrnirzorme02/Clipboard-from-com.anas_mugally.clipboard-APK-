package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzar<K, V> extends zzaq<Map.Entry<K, V>> {
    private final transient zzal<K, V> zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    zzar(zzal<K, V> zzalVar, Object[] objArr, int i7, int i8) {
        this.zza = zzalVar;
        this.zzb = objArr;
        this.zzc = i8;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzag, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaq, com.google.android.gms.internal.p411firebaseauthapi.zzag, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzag
    /* JADX INFO: renamed from: zzd */
    public final zzay<Map.Entry<K, V>> iterator() {
        return (zzay) zzc().iterator();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaq
    final zzah<Map.Entry<K, V>> zzf() {
        return new zzau(this);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzag
    final int zza(Object[] objArr, int i7) {
        return zzc().zza(objArr, i7);
    }
}
