package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgyv {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzgyv(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgyv zzd(zzgyu zzgyuVar, Class cls, Class cls2) {
        return new zzgyt(cls, cls2, zzgyuVar);
    }

    public abstract zzgzn zza(zzgqs zzgqsVar);

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
