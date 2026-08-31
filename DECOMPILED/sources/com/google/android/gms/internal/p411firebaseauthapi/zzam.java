package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzam extends zzah {
    private final transient int zza;
    private final transient int zzb;
    private final /* synthetic */ zzah zzc;

    zzam(zzah zzahVar, int i7, int i8) {
        Objects.requireNonNull(zzahVar);
        this.zzc = zzahVar;
        this.zza = i7;
        this.zzb = i8;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzu.zza(i7, this.zzb);
        return this.zzc.get(i7 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzah, java.util.List
    public final /* synthetic */ List subList(int i7, int i8) {
        return subList(i7, i8);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzag
    final int zza() {
        return this.zzc.zzb() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzag
    final int zzb() {
        return this.zzc.zzb() + this.zza;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzag
    final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzah
    /* JADX INFO: renamed from: zza */
    public final zzah subList(int i7, int i8) {
        zzu.zza(i7, i8, this.zzb);
        zzah zzahVar = this.zzc;
        int i9 = this.zza;
        return (zzah) zzahVar.subList(i7 + i9, i8 + i9);
    }
}
