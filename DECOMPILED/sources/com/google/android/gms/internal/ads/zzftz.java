package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final class zzftz implements zzgob {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzfuc zzb;

    zzftz(zzfuc zzfucVar, Context context) {
        this.zza = context;
        Objects.requireNonNull(zzfucVar);
        this.zzb = zzfucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* bridge */ /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
        return this.zzb.zzg().zzb(this.zza);
    }
}
