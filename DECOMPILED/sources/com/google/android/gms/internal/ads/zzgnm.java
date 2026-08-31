package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgnm<V> extends zzgnn<V> {

    final class zza {
        static final zza zza;
        static final zza zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzgnn.zzg) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zza(false, null);
                zza = new zza(true, null);
            }
        }

        zza(boolean z7, Throwable th) {
            this.zzc = z7;
            this.zzd = th;
        }
    }

    final class zzb<V> implements Runnable {
        final zzgnm<V> zza;
        final InterfaceFutureC1673e zzb;

        zzb(zzgnm zzgnmVar, InterfaceFutureC1673e interfaceFutureC1673e) {
            this.zza = zzgnmVar;
            this.zzb = interfaceFutureC1673e;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.zza.valueField != this) {
                return;
            }
            if (zzgnn.zzr(this.zza, this, zzgnm.zze(this.zzb))) {
                zzgnm.zzw(this.zza, false);
            }
        }
    }

    final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzgnm.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    interface zze<V> extends InterfaceFutureC1673e {
        @Override // p157U3.InterfaceFutureC1673e
        /* synthetic */ void addListener(Runnable runnable, Executor executor);
    }

    abstract class zzf<V> extends zzgnm<V> implements zze<V> {
        zzf() {
        }
    }

    protected zzgnm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object zze(InterfaceFutureC1673e interfaceFutureC1673e) {
        Throwable thZzl;
        if (interfaceFutureC1673e instanceof zze) {
            Object zzaVar = ((zzgnm) interfaceFutureC1673e).valueField;
            if (zzaVar instanceof zza) {
                zza zzaVar2 = (zza) zzaVar;
                if (zzaVar2.zzc) {
                    Throwable th = zzaVar2.zzd;
                    zzaVar = th != null ? new zza(false, th) : zza.zzb;
                }
            }
            Objects.requireNonNull(zzaVar);
            return zzaVar;
        }
        if ((interfaceFutureC1673e instanceof zzgpv) && (thZzl = ((zzgpv) interfaceFutureC1673e).zzl()) != null) {
            return new zzc(thZzl);
        }
        boolean zIsCancelled = interfaceFutureC1673e.isCancelled();
        if ((!zzgnn.zzg) && zIsCancelled) {
            zza zzaVar3 = zza.zzb;
            Objects.requireNonNull(zzaVar3);
            return zzaVar3;
        }
        try {
            Object objZzf = zzf(interfaceFutureC1673e);
            if (!zIsCancelled) {
                return objZzf == null ? zzgnn.zze : objZzf;
            }
            String strValueOf = String.valueOf(interfaceFutureC1673e);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 84);
            sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(strValueOf);
            return new zza(false, new IllegalArgumentException(sb.toString()));
        } catch (Error | Exception e7) {
            return new zzc(e7);
        } catch (CancellationException e8) {
            return !zIsCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(interfaceFutureC1673e)), e8)) : new zza(false, e8);
        } catch (ExecutionException e9) {
            return zIsCancelled ? new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(interfaceFutureC1673e)), e9)) : new zzc(e9.getCause());
        }
    }

    private static Object zzf(Future future) {
        Object obj;
        boolean z7 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    static Object zzg(Object obj) throws ExecutionException {
        if (obj instanceof zza) {
            Throwable th = ((zza) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzgnn.zze) {
            return null;
        }
        return obj;
    }

    static boolean zzh(Object obj) {
        return !(obj instanceof zzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzw(zzgnm zzgnmVar, boolean z7) {
        zzd zzdVar = null;
        while (true) {
            zzgnmVar.zzs();
            if (z7) {
                zzgnmVar.zzi();
            }
            zzgnmVar.zzc();
            zzd zzdVar2 = zzdVar;
            zzd zzdVarZzq = zzgnmVar.zzq(zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zzdVarZzq != null) {
                zzd zzdVar4 = zzdVarZzq.next;
                zzdVarZzq.next = zzdVar3;
                zzdVar3 = zzdVarZzq;
                zzdVarZzq = zzdVar4;
            }
            while (zzdVar3 != null) {
                Runnable runnable = zzdVar3.zzb;
                zzdVar = zzdVar3.next;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzb) {
                    zzb zzbVar = (zzb) runnable2;
                    zzgnmVar = zzbVar.zza;
                    if (zzgnmVar.valueField == zzbVar && zzgnn.zzr(zzgnmVar, zzbVar, zze(zzbVar.zzb))) {
                        z7 = false;
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    Objects.requireNonNull(executor);
                    zzy(runnable2, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
        }
    }

    private final void zzx(StringBuilder sb) {
        try {
            Object objZzf = zzf(this);
            sb.append("SUCCESS, result=[");
            if (objZzf == null) {
                sb.append("null");
            } else if (objZzf == this) {
                sb.append("this future");
            } else {
                sb.append(objZzf.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objZzf)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e7) {
            sb.append("FAILURE, cause=[");
            sb.append(e7.getCause());
            sb.append("]");
        } catch (Exception e8) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e8.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private static void zzy(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e7) {
            Logger loggerZza = zzgnn.zzf.zza();
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 57 + strValueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(strValueOf);
            sb.append(" with executor ");
            sb.append(strValueOf2);
            loggerZza.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), (Throwable) e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnn, p157U3.InterfaceFutureC1673e
    public void addListener(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzghc.zzk(runnable, "Runnable was null.");
        zzghc.zzk(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listenersField) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzp(zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listenersField;
                }
            } while (zzdVar != zzd.zza);
        }
        zzy(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z7) {
        zza zzaVar;
        Object obj = this.valueField;
        if (!(obj instanceof zzb) && !(obj == null)) {
            return false;
        }
        if (zzgnn.zzg) {
            zzaVar = new zza(z7, new CancellationException("Future.cancel() was called."));
        } else {
            zzaVar = z7 ? zza.zza : zza.zzb;
            Objects.requireNonNull(zzaVar);
        }
        zzgnm<V> zzgnmVar = this;
        boolean z8 = false;
        while (true) {
            if (zzgnn.zzr(zzgnmVar, obj, zzaVar)) {
                zzw(zzgnmVar, z7);
                if (obj instanceof zzb) {
                    InterfaceFutureC1673e interfaceFutureC1673e = ((zzb) obj).zzb;
                    if (interfaceFutureC1673e instanceof zze) {
                        zzgnmVar = (zzgnm) interfaceFutureC1673e;
                        obj = zzgnmVar.valueField;
                        if (!(obj == null) && !(obj instanceof zzb)) {
                            return true;
                        }
                        z8 = true;
                    } else {
                        interfaceFutureC1673e.cancel(z7);
                    }
                }
                return true;
            }
            obj = zzgnmVar.valueField;
            if (zzh(obj)) {
                return z8;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return zzu();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.valueField instanceof zza;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.valueField;
        return (obj != null) & zzh(obj);
    }

    public String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzx(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.valueField;
            if (obj instanceof zzb) {
                sb.append(", setFuture=[");
                InterfaceFutureC1673e interfaceFutureC1673e = ((zzb) obj).zzb;
                try {
                    if (interfaceFutureC1673e == this) {
                        sb.append("this future");
                    } else {
                        sb.append(interfaceFutureC1673e);
                    }
                } catch (Throwable th) {
                    zzgpl.zzb(th);
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strConcat = zzghs.zzb(zzd());
                } catch (Throwable th2) {
                    zzgpl.zzb(th2);
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (strConcat != null) {
                    sb.append(", info=[");
                    sb.append(strConcat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                zzx(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected boolean zza(Object obj) {
        if (obj == null) {
            obj = zzgnn.zze;
        }
        if (!zzgnn.zzr(this, null, obj)) {
            return false;
        }
        zzw(this, false);
        return true;
    }

    protected boolean zzb(Throwable th) {
        th.getClass();
        if (!zzgnn.zzr(this, null, new zzc(th))) {
            return false;
        }
        zzw(this, false);
        return true;
    }

    protected void zzc() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String zzd() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + 21);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    protected void zzi() {
    }

    protected final boolean zzj() {
        Object obj = this.valueField;
        return (obj instanceof zza) && ((zza) obj).zzc;
    }

    protected final boolean zzk(InterfaceFutureC1673e interfaceFutureC1673e) {
        zzc zzcVar;
        interfaceFutureC1673e.getClass();
        Object obj = this.valueField;
        if (obj == null) {
            if (interfaceFutureC1673e.isDone()) {
                if (!zzgnn.zzr(this, null, zze(interfaceFutureC1673e))) {
                    return false;
                }
                zzw(this, false);
                return true;
            }
            zzb zzbVar = new zzb(this, interfaceFutureC1673e);
            if (zzgnn.zzr(this, null, zzbVar)) {
                try {
                    interfaceFutureC1673e.addListener(zzbVar, zzgoi.INSTANCE);
                } catch (Throwable th) {
                    try {
                        zzcVar = new zzc(th);
                    } catch (Error | Exception unused) {
                        zzcVar = zzc.zza;
                    }
                    zzgnn.zzr(this, zzbVar, zzcVar);
                }
                return true;
            }
            obj = this.valueField;
        }
        if (obj instanceof zza) {
            interfaceFutureC1673e.cancel(((zza) obj).zzc);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgpv
    protected final Throwable zzl() {
        if (!(this instanceof zze)) {
            return null;
        }
        Object obj = this.valueField;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    final void zzm(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzj());
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j7, TimeUnit timeUnit) {
        return zzt(j7, timeUnit);
    }
}
