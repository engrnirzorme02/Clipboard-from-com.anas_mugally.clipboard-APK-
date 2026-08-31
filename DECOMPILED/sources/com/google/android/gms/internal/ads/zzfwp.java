package com.google.android.gms.internal.ads;

import java.util.Objects;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final class zzfwp implements zzgob {
    final /* synthetic */ zzfwr zza;

    zzfwp(zzfwr zzfwrVar) {
        Objects.requireNonNull(zzfwrVar);
        this.zza = zzfwrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* bridge */ /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
        zzfwn zzfwnVar = (zzfwn) obj;
        if (zzfwnVar != null) {
            return zzgot.zza(zzfwnVar);
        }
        zzfwr zzfwrVar = this.zza;
        zzfwrVar.zza().zzb(51);
        return zzfwrVar.zzc(2);
    }
}
