package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfgq {
    final /* synthetic */ zzfgz zza;
    private final Object zzb;
    private final List zzc;

    /* synthetic */ zzfgq(zzfgz zzfgzVar, Object obj, List list, byte[] bArr) {
        Objects.requireNonNull(zzfgzVar);
        this.zza = zzfgzVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfgy zza(Callable callable) {
        List list = this.zzc;
        zzgos zzgosVarZzo = zzgot.zzo(list);
        InterfaceFutureC1673e interfaceFutureC1673eZza = zzgosVarZzo.zza(zzfgp.zza, zzbzh.zzg);
        zzfgz zzfgzVar = this.zza;
        return new zzfgy(zzfgzVar, this.zzb, null, interfaceFutureC1673eZza, list, zzgosVarZzo.zza(callable, zzfgzVar.zze()), null);
    }
}
