package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgha implements Serializable {
    zzgha() {
    }

    public static zzgha zzc() {
        return zzggh.zza;
    }

    public static zzgha zzd(Object obj) {
        return obj == null ? zzggh.zza : new zzghg(obj);
    }

    public abstract Object zza(Object obj);

    public abstract zzgha zzb(zzggr zzggrVar);
}
