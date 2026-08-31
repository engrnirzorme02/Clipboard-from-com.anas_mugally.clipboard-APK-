package com.google.android.gms.internal.location;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzbr extends zzbs {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzbs zzc;

    zzbr(zzbs zzbsVar, int i7, int i8) {
        this.zzc = zzbsVar;
        this.zza = i7;
        this.zzb = i8;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzbm.zza(i7, this.zzb, "index");
        return this.zzc.get(i7 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzbs, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i7, int i8) {
        return subList(i7, i8);
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.location.zzbs
    /* JADX INFO: renamed from: zzh */
    public final zzbs subList(int i7, int i8) {
        zzbm.zzc(i7, i8, this.zzb);
        zzbs zzbsVar = this.zzc;
        int i9 = this.zza;
        return zzbsVar.subList(i7 + i9, i8 + i9);
    }
}
