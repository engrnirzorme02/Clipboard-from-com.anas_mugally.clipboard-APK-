package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzap<E> extends zzah<E> {
    static final zzah<Object> zza = new zzap(new Object[0], 0);
    private final transient Object[] zzb;
    private final transient int zzc;

    zzap(Object[] objArr, int i7) {
        this.zzb = objArr;
        this.zzc = i7;
    }

    @Override // java.util.List
    public final E get(int i7) {
        zzu.zza(i7, this.zzc);
        E e7 = (E) this.zzb[i7];
        Objects.requireNonNull(e7);
        return e7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzah, com.google.android.gms.internal.p411firebaseauthapi.zzag
    final int zza(Object[] objArr, int i7) {
        System.arraycopy(this.zzb, 0, objArr, i7, this.zzc);
        return i7 + this.zzc;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzag
    final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzag
    final Object[] zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzag
    final int zza() {
        return this.zzc;
    }
}
