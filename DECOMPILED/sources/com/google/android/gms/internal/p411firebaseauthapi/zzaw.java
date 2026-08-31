package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzaw extends zzah<Object> {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    zzaw(Object[] objArr, int i7, int i8) {
        this.zza = objArr;
        this.zzb = i7;
        this.zzc = i8;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzu.zza(i7, this.zzc);
        Object obj = this.zza[(i7 * 2) + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
