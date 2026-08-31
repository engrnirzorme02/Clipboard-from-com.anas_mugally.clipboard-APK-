package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgzc {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzgzc(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgzc zzd(zzgzb zzgzbVar, Class cls, Class cls2) {
        return new zzgza(cls, cls2, zzgzbVar);
    }

    public abstract Object zza(zzgqd zzgqdVar);

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
