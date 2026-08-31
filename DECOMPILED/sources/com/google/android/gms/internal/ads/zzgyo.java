package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgyo {
    private static final zzgyo zza = (zzgyo) zzgzt.zza(zzgyn.zza);
    private final AtomicReference zzb = new AtomicReference(new zzgzr(new zzgzo(), null));

    public static zzgyo zza() {
        return zza;
    }

    public final synchronized void zzb(zzgxq zzgxqVar) {
        AtomicReference atomicReference = this.zzb;
        zzgzo zzgzoVar = new zzgzo((zzgzr) atomicReference.get());
        zzgzoVar.zza(zzgxqVar);
        atomicReference.set(new zzgzr(zzgzoVar, null));
    }

    public final synchronized void zzc(zzgxn zzgxnVar) {
        AtomicReference atomicReference = this.zzb;
        zzgzo zzgzoVar = new zzgzo((zzgzr) atomicReference.get());
        zzgzoVar.zzb(zzgxnVar);
        atomicReference.set(new zzgzr(zzgzoVar, null));
    }

    public final synchronized void zzd(zzgyv zzgyvVar) {
        AtomicReference atomicReference = this.zzb;
        zzgzo zzgzoVar = new zzgzo((zzgzr) atomicReference.get());
        zzgzoVar.zzc(zzgyvVar);
        atomicReference.set(new zzgzr(zzgzoVar, null));
    }

    public final synchronized void zze(zzgys zzgysVar) {
        AtomicReference atomicReference = this.zzb;
        zzgzo zzgzoVar = new zzgzo((zzgzr) atomicReference.get());
        zzgzoVar.zzd(zzgysVar);
        atomicReference.set(new zzgzr(zzgzoVar, null));
    }

    public final boolean zzf(zzgzn zzgznVar) {
        return ((zzgzr) this.zzb.get()).zza(zzgznVar);
    }

    public final zzgqd zzg(zzgzn zzgznVar, zzgqt zzgqtVar) {
        return ((zzgzr) this.zzb.get()).zzb(zzgznVar, zzgqtVar);
    }

    public final zzgzn zzh(zzgqd zzgqdVar, Class cls, zzgqt zzgqtVar) {
        return ((zzgzr) this.zzb.get()).zzc(zzgqdVar, cls, zzgqtVar);
    }

    public final boolean zzi(zzgzn zzgznVar) {
        return ((zzgzr) this.zzb.get()).zzd(zzgznVar);
    }

    public final zzgqs zzj(zzgzn zzgznVar) {
        return ((zzgzr) this.zzb.get()).zze(zzgznVar);
    }

    public final zzgzn zzk(zzgqs zzgqsVar, Class cls) {
        return ((zzgzr) this.zzb.get()).zzf(zzgqsVar, cls);
    }
}
