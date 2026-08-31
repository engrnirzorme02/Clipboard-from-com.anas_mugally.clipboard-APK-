package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzglk extends zzgjz {
    static final zzgjz zza = new zzglk(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzglk(Object[] objArr, int i7) {
        this.zzb = objArr;
        this.zzc = i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzghc.zzm(i7, this.zzc, "index");
        Object obj = this.zzb[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    final Object[] zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgjz, com.google.android.gms.internal.ads.zzgjv
    final int zzg(Object[] objArr, int i7) {
        Object[] objArr2 = this.zzb;
        int i8 = this.zzc;
        System.arraycopy(objArr2, 0, objArr, i7, i8);
        return i7 + i8;
    }
}
