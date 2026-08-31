package com.google.android.gms.internal.ads;

import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final class zzgnj extends zzgnl {
    zzgnj(InterfaceFutureC1673e interfaceFutureC1673e, Class cls, zzgob zzgobVar) {
        super(interfaceFutureC1673e, cls, zzgobVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgnl
    final /* synthetic */ void zze(Object obj) {
        zzk((InterfaceFutureC1673e) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgnl
    final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th) {
        zzgob zzgobVar = (zzgob) obj;
        InterfaceFutureC1673e interfaceFutureC1673eZza = zzgobVar.zza(th);
        zzghc.zzl(interfaceFutureC1673eZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgobVar);
        return interfaceFutureC1673eZza;
    }
}
