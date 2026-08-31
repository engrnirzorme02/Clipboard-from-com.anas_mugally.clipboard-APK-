package com.google.android.gms.internal.ads;

import java.util.AbstractList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhir extends AbstractList {
    private final zzhip zza;
    private final zzhiq zzb;

    public zzhir(zzhip zzhipVar, zzhiq zzhiqVar) {
        this.zza = zzhipVar;
        this.zzb = zzhiqVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return this.zzb.zzb(this.zza.zzf(i7));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
