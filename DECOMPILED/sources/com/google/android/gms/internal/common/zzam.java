package com.google.android.gms.internal.common;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzam extends zzak {
    static final zzak zza = new zzam(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzam(Object[] objArr, int i7) {
        this.zzb = objArr;
        this.zzc = i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzv.zza(i7, this.zzc, "index");
        Object obj = this.zzb[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzak, com.google.android.gms.internal.common.zzag
    final int zza(Object[] objArr, int i7) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzag
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzag
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.common.zzag
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.common.zzag
    final Object[] zzg() {
        return this.zzb;
    }
}
