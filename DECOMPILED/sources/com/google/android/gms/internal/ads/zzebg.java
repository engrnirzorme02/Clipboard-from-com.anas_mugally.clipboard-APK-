package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzebg {
    private final zzebc zza;
    private final zzgpd zzb;

    public zzebg(zzebc zzebcVar, zzgpd zzgpdVar) {
        this.zza = zzebcVar;
        this.zzb = zzgpdVar;
    }

    public final void zza(zzfgm zzfgmVar) {
        final zzebc zzebcVar = this.zza;
        Objects.requireNonNull(zzebcVar);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzebf
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzebcVar.getWritableDatabase();
            }
        };
        zzgpd zzgpdVar = this.zzb;
        zzgot.zzq(zzgpdVar.submit(callable), new zzebe(this, zzfgmVar), zzgpdVar);
    }
}
