package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzglm extends zzgke {
    private final transient zzgkc zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    zzglm(zzgkc zzgkcVar, Object[] objArr, int i7, int i8) {
        this.zza = zzgkcVar;
        this.zzb = objArr;
        this.zzc = i8;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv, java.util.AbstractCollection, java.util.Collection
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

    @Override // com.google.android.gms.internal.ads.zzgke, com.google.android.gms.internal.ads.zzgjv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zze().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgke, com.google.android.gms.internal.ads.zzgjv
    /* JADX INFO: renamed from: zza */
    public final zzgmd iterator() {
        return zze().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    final int zzg(Object[] objArr, int i7) {
        return zze().zzg(objArr, i7);
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    final zzgjz zzr() {
        return new zzgll(this);
    }

    final /* synthetic */ Object[] zzv() {
        return this.zzb;
    }

    final /* synthetic */ int zzw() {
        return this.zzc;
    }
}
