package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.internal.p411firebaseauthapi.zzbi;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzps<KeyT extends zzbi, PrimitiveT> {
    private final Class<KeyT> zza;
    private final Class<PrimitiveT> zzb;

    public static <KeyT extends zzbi, PrimitiveT> zzps<KeyT, PrimitiveT> zza(zzpu<KeyT, PrimitiveT> zzpuVar, Class<KeyT> cls, Class<PrimitiveT> cls2) {
        return new zzpr(cls, cls2, zzpuVar);
    }

    public abstract PrimitiveT zza(KeyT keyt);

    public final Class<PrimitiveT> zzb() {
        return this.zzb;
    }

    private zzps(Class<KeyT> cls, Class<PrimitiveT> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final Class<KeyT> zza() {
        return this.zza;
    }
}
