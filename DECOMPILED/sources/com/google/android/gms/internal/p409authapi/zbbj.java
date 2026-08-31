package com.google.android.gms.internal.p409authapi;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zbbj extends zbbi {
    static final zbbi zba = new zbbj(new Object[0], 0);
    final transient Object[] zbb;
    private final transient int zbc;

    zbbj(Object[] objArr, int i7) {
        this.zbb = objArr;
        this.zbc = i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zbbc.zba(i7, this.zbc, "index");
        Object obj = this.zbb[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.p409authapi.zbbf
    final Object[] zbb() {
        return this.zbb;
    }

    @Override // com.google.android.gms.internal.p409authapi.zbbf
    final int zbc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p409authapi.zbbf
    final int zbd() {
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.p409authapi.zbbf
    final boolean zbf() {
        return false;
    }

    @Override // com.google.android.gms.internal.p409authapi.zbbi, com.google.android.gms.internal.p409authapi.zbbf
    final int zbg(Object[] objArr, int i7) {
        Object[] objArr2 = this.zbb;
        int i8 = this.zbc;
        System.arraycopy(objArr2, 0, objArr, 0, i8);
        return i8;
    }
}
