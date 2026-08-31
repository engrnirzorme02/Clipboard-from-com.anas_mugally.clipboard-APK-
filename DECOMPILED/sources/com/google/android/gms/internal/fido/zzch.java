package com.google.android.gms.internal.fido;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzch extends zzcc {
    final /* synthetic */ zzci zza;

    zzch(zzci zzciVar) {
        this.zza = zzciVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        return new AbstractMap.SimpleImmutableEntry(this.zza.zza.zzd.zzd.get(i7), this.zza.zza.zze.get(i7));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zza.size();
    }
}
