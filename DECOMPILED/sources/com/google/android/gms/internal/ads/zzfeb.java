package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfeb {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzgpd zzc;

    public zzfeb(Callable callable, zzgpd zzgpdVar) {
        this.zzb = callable;
        this.zzc = zzgpdVar;
    }

    public final synchronized void zza(int i7) {
        Deque deque = this.zza;
        int size = i7 - deque.size();
        for (int i8 = 0; i8 < size; i8++) {
            deque.add(this.zzc.submit(this.zzb));
        }
    }

    public final synchronized InterfaceFutureC1673e zzb() {
        zza(1);
        return (InterfaceFutureC1673e) this.zza.poll();
    }

    public final synchronized void zzc(InterfaceFutureC1673e interfaceFutureC1673e) {
        this.zza.addFirst(interfaceFutureC1673e);
    }
}
