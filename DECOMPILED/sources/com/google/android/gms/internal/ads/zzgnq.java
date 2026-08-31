package com.google.android.gms.internal.ads;

import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final class zzgnq extends zzgns {
    zzgnq(InterfaceFutureC1673e interfaceFutureC1673e, zzgob zzgobVar) {
        super(interfaceFutureC1673e, zzgobVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgns
    final /* synthetic */ void zze(Object obj) {
        zzk((InterfaceFutureC1673e) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgns
    final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) {
        zzgob zzgobVar = (zzgob) obj;
        InterfaceFutureC1673e interfaceFutureC1673eZza = zzgobVar.zza(obj2);
        zzghc.zzl(interfaceFutureC1673eZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgobVar);
        return interfaceFutureC1673eZza;
    }
}
