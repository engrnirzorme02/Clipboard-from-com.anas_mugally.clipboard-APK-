package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgyl {
    private static final zzgyl zza = new zzgyl();
    private final AtomicReference zzb = new AtomicReference(new zzgzg(new zzgzd(null), null));

    zzgyl() {
    }

    public static zzgyl zza() {
        return zza;
    }

    public final synchronized void zzb(zzgzc zzgzcVar) {
        AtomicReference atomicReference = this.zzb;
        zzgzd zzgzdVar = new zzgzd((zzgzg) atomicReference.get(), null);
        zzgzdVar.zza(zzgzcVar);
        atomicReference.set(new zzgzg(zzgzdVar, null));
    }

    public final synchronized void zzc(zzgzi zzgziVar) {
        AtomicReference atomicReference = this.zzb;
        zzgzd zzgzdVar = new zzgzd((zzgzg) atomicReference.get(), null);
        zzgzdVar.zzb(zzgziVar);
        atomicReference.set(new zzgzg(zzgzdVar, null));
    }

    public final Object zzd(zzgqd zzgqdVar, Class cls) {
        return ((zzgzg) this.zzb.get()).zzb(zzgqdVar, cls);
    }
}
