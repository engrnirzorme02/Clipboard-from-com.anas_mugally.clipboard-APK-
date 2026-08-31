package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzau extends zzah {
    private final /* synthetic */ zzar zza;

    zzau(zzar zzarVar) {
        Objects.requireNonNull(zzarVar);
        this.zza = zzarVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzu.zza(i7, this.zza.zzc);
        int i8 = i7 * 2;
        Object obj = this.zza.zzb[i8];
        Objects.requireNonNull(obj);
        Object obj2 = this.zza.zzb[i8 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
