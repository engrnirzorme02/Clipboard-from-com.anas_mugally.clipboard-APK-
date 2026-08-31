package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgjy extends zzgjz {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzgjz zzc;

    zzgjy(zzgjz zzgjzVar, int i7, int i8) {
        Objects.requireNonNull(zzgjzVar);
        this.zzc = zzgjzVar;
        this.zza = i7;
        this.zzb = i8;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzghc.zzm(i7, this.zzb, "index");
        return this.zzc.get(i7 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgjz, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i7, int i8) {
        return subList(i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgjz
    /* JADX INFO: renamed from: zzh */
    public final zzgjz subList(int i7, int i8) {
        zzghc.zzo(i7, i8, this.zzb);
        int i9 = this.zza;
        return this.zzc.subList(i7 + i9, i8 + i9);
    }
}
