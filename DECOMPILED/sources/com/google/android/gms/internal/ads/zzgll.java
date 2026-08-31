package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgll extends zzgjz {
    final /* synthetic */ zzglm zza;

    zzgll(zzglm zzglmVar) {
        Objects.requireNonNull(zzglmVar);
        this.zza = zzglmVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        zzglm zzglmVar = this.zza;
        zzghc.zzm(i7, zzglmVar.zzw(), "index");
        int i8 = i7 + i7;
        Object obj = zzglmVar.zzv()[i8];
        Objects.requireNonNull(obj);
        Object obj2 = zzglmVar.zzv()[i8 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final boolean zzf() {
        return true;
    }
}
