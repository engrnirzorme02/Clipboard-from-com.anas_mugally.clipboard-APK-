package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfgz {
    private static final InterfaceFutureC1673e zza = zzgot.zza(null);
    private final zzgpd zzb;
    private final ScheduledExecutorService zzc;
    private final zzfha zzd;

    public zzfgz(zzgpd zzgpdVar, ScheduledExecutorService scheduledExecutorService, zzfha zzfhaVar) {
        this.zzb = zzgpdVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfhaVar;
    }

    public final zzfgy zza(Object obj, InterfaceFutureC1673e interfaceFutureC1673e) {
        return new zzfgy(this, obj, null, interfaceFutureC1673e, Collections.singletonList(interfaceFutureC1673e), interfaceFutureC1673e, null);
    }

    public final zzfgq zzb(Object obj, InterfaceFutureC1673e... interfaceFutureC1673eArr) {
        return new zzfgq(this, obj, Arrays.asList(interfaceFutureC1673eArr), null);
    }

    protected abstract String zzc(Object obj);

    final /* synthetic */ zzgpd zze() {
        return this.zzb;
    }

    final /* synthetic */ ScheduledExecutorService zzf() {
        return this.zzc;
    }

    final /* synthetic */ zzfha zzg() {
        return this.zzd;
    }
}
