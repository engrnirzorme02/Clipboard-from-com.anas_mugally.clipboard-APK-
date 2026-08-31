package com.google.android.gms.internal.p409authapi;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zbbh extends zbbi {
    final transient int zba;
    final transient int zbb;
    final /* synthetic */ zbbi zbc;

    zbbh(zbbi zbbiVar, int i7, int i8) {
        Objects.requireNonNull(zbbiVar);
        this.zbc = zbbiVar;
        this.zba = i7;
        this.zbb = i8;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zbbc.zba(i7, this.zbb, "index");
        return this.zbc.get(i7 + this.zba);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbb;
    }

    @Override // com.google.android.gms.internal.p409authapi.zbbi, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i7, int i8) {
        return subList(i7, i8);
    }

    @Override // com.google.android.gms.internal.p409authapi.zbbf
    final Object[] zbb() {
        return this.zbc.zbb();
    }

    @Override // com.google.android.gms.internal.p409authapi.zbbf
    final int zbc() {
        return this.zbc.zbc() + this.zba;
    }

    @Override // com.google.android.gms.internal.p409authapi.zbbf
    final int zbd() {
        return this.zbc.zbc() + this.zba + this.zbb;
    }

    @Override // com.google.android.gms.internal.p409authapi.zbbf
    final boolean zbf() {
        return true;
    }

    @Override // com.google.android.gms.internal.p409authapi.zbbi
    /* JADX INFO: renamed from: zbh */
    public final zbbi subList(int i7, int i8) {
        zbbc.zbc(i7, i8, this.zbb);
        int i9 = this.zba;
        return this.zbc.subList(i7 + i9, i8 + i9);
    }
}
