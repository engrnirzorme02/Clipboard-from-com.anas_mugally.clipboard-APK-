package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgys {
    private final zzhgg zza;
    private final Class zzb;

    /* synthetic */ zzgys(zzhgg zzhggVar, Class cls, byte[] bArr) {
        this.zza = zzhggVar;
        this.zzb = cls;
    }

    public static zzgys zzd(zzgyr zzgyrVar, zzhgg zzhggVar, Class cls) {
        return new zzgyq(zzhggVar, cls, zzgyrVar);
    }

    public abstract zzgqs zza(zzgzn zzgznVar);

    public final zzhgg zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
