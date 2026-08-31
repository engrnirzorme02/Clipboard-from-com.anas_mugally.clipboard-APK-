package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgot extends zzgov {
    public static InterfaceFutureC1673e zza(Object obj) {
        return obj == null ? zzgox.zza : new zzgox(obj);
    }

    public static InterfaceFutureC1673e zzb() {
        return zzgox.zza;
    }

    public static InterfaceFutureC1673e zzc(Throwable th) {
        th.getClass();
        return new zzgow(th);
    }

    public static InterfaceFutureC1673e zzd(Callable callable, Executor executor) {
        zzgps zzgpsVar = new zzgps(callable);
        executor.execute(zzgpsVar);
        return zzgpsVar;
    }

    public static InterfaceFutureC1673e zze(Runnable runnable, Executor executor) {
        zzgps zzgpsVarZze = zzgps.zze(runnable, null);
        executor.execute(zzgpsVarZze);
        return zzgpsVarZze;
    }

    public static InterfaceFutureC1673e zzf(zzgoa zzgoaVar, Executor executor) {
        zzgps zzgpsVar = new zzgps(zzgoaVar);
        executor.execute(zzgpsVar);
        return zzgpsVar;
    }

    public static InterfaceFutureC1673e zzg(InterfaceFutureC1673e interfaceFutureC1673e, Class cls, zzggr zzggrVar, Executor executor) {
        int i7 = zzgnl.zzd;
        zzgnk zzgnkVar = new zzgnk(interfaceFutureC1673e, cls, zzggrVar);
        interfaceFutureC1673e.addListener(zzgnkVar, zzgpk.zzd(executor, zzgnkVar));
        return zzgnkVar;
    }

    public static InterfaceFutureC1673e zzh(InterfaceFutureC1673e interfaceFutureC1673e, Class cls, zzgob zzgobVar, Executor executor) {
        int i7 = zzgnl.zzd;
        zzgnj zzgnjVar = new zzgnj(interfaceFutureC1673e, cls, zzgobVar);
        interfaceFutureC1673e.addListener(zzgnjVar, zzgpk.zzd(executor, zzgnjVar));
        return zzgnjVar;
    }

    public static InterfaceFutureC1673e zzi(InterfaceFutureC1673e interfaceFutureC1673e, long j7, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return interfaceFutureC1673e.isDone() ? interfaceFutureC1673e : zzgpp.zze(interfaceFutureC1673e, j7, timeUnit, scheduledExecutorService);
    }

    public static InterfaceFutureC1673e zzj(InterfaceFutureC1673e interfaceFutureC1673e, zzgob zzgobVar, Executor executor) {
        int i7 = zzgns.zzc;
        zzgnq zzgnqVar = new zzgnq(interfaceFutureC1673e, zzgobVar);
        interfaceFutureC1673e.addListener(zzgnqVar, zzgpk.zzd(executor, zzgnqVar));
        return zzgnqVar;
    }

    public static InterfaceFutureC1673e zzk(InterfaceFutureC1673e interfaceFutureC1673e, zzggr zzggrVar, Executor executor) {
        int i7 = zzgns.zzc;
        zzgnr zzgnrVar = new zzgnr(interfaceFutureC1673e, zzggrVar);
        interfaceFutureC1673e.addListener(zzgnrVar, zzgpk.zzd(executor, zzgnrVar));
        return zzgnrVar;
    }

    public static InterfaceFutureC1673e zzl(Iterable iterable) {
        return new zzgoc(zzgjz.zzp(iterable), true);
    }

    public static zzgos zzm(Iterable iterable) {
        return new zzgos(false, zzgjz.zzp(iterable), null);
    }

    @SafeVarargs
    public static zzgos zzn(InterfaceFutureC1673e... interfaceFutureC1673eArr) {
        return new zzgos(true, zzgjz.zzr(interfaceFutureC1673eArr), null);
    }

    public static zzgos zzo(Iterable iterable) {
        return new zzgos(true, zzgjz.zzp(iterable), null);
    }

    @SafeVarargs
    public static InterfaceFutureC1673e zzp(InterfaceFutureC1673e... interfaceFutureC1673eArr) {
        return new zzgoc(zzgjz.zzr(interfaceFutureC1673eArr), false);
    }

    public static void zzq(InterfaceFutureC1673e interfaceFutureC1673e, zzgoq zzgoqVar, Executor executor) {
        zzgoqVar.getClass();
        interfaceFutureC1673e.addListener(new zzgor(interfaceFutureC1673e, zzgoqVar), executor);
    }

    public static Object zzr(Future future) {
        if (future.isDone()) {
            return zzgpu.zza(future);
        }
        throw new IllegalStateException(zzghs.zzd("Future was expected to be done: %s", future));
    }

    public static Object zzs(Future future) {
        try {
            return zzgpu.zza(future);
        } catch (ExecutionException e7) {
            if (e7.getCause() instanceof Error) {
                throw new zzgoj((Error) e7.getCause());
            }
            throw new zzgpt(e7.getCause());
        }
    }
}
