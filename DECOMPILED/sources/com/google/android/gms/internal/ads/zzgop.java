package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgop extends zzgon implements InterfaceFutureC1673e {
    protected zzgop() {
    }

    @Override // p157U3.InterfaceFutureC1673e
    public final void addListener(Runnable runnable, Executor executor) {
        zzc().addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    protected /* bridge */ /* synthetic */ Future zza() {
        throw null;
    }

    protected abstract InterfaceFutureC1673e zzc();
}
