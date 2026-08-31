package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzemu implements zzgob {
    static final /* synthetic */ zzemu zza = new zzemu();

    private /* synthetic */ zzemu() {
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
        return ((Throwable) obj) instanceof TimeoutException ? zzgot.zza(new zzemx(Integer.toString(17))) : zzgot.zza(new zzemx(null));
    }
}
