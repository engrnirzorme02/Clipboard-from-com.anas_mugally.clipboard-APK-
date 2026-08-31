package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgos {
    private final boolean zza;
    private final zzgjz zzb;

    /* synthetic */ zzgos(boolean z7, zzgjz zzgjzVar, byte[] bArr) {
        this.zza = z7;
        this.zzb = zzgjzVar;
    }

    public final InterfaceFutureC1673e zza(Callable callable, Executor executor) {
        return new zzgoh(this.zzb, this.zza, executor, callable);
    }
}
