package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgyj {
    private static final zzgyj zza = new zzgyj();
    private static final zzgyi zzb = new zzgyi(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzgyj zza() {
        return zza;
    }

    public final zzgya zzb() {
        zzgya zzgyaVar = (zzgya) this.zzc.get();
        return zzgyaVar == null ? zzb : zzgyaVar;
    }
}
