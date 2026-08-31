package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.AbstractC2404b;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p157U3.InterfaceFutureC1673e;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzgnn<V> extends zzgpv implements InterfaceFutureC1673e {
    private static final zza zzbi;
    static final Object zze = new Object();
    static final zzgpb zzf = new zzgpb(zzgnm.class);
    static final boolean zzg;
    volatile zzgnm.zzd listenersField;
    volatile Object valueField;
    volatile zze waitersField;

    abstract class zza {
        /* synthetic */ zza(byte[] bArr) {
        }

        abstract void zza(zze zzeVar, Thread thread);

        abstract void zzb(zze zzeVar, zze zzeVar2);

        abstract boolean zzc(zzgnn zzgnnVar, zze zzeVar, zze zzeVar2);

        abstract boolean zzd(zzgnn zzgnnVar, zzgnm.zzd zzdVar, zzgnm.zzd zzdVar2);

        abstract zze zze(zzgnn zzgnnVar, zze zzeVar);

        abstract zzgnm.zzd zzf(zzgnn zzgnnVar, zzgnm.zzd zzdVar);

        abstract boolean zzg(zzgnn zzgnnVar, Object obj, Object obj2);
    }

    final class zzb extends zza {
        private static final AtomicReferenceFieldUpdater<zze, Thread> zza = AtomicReferenceFieldUpdater.newUpdater(zze.class, Thread.class, "thread");
        private static final AtomicReferenceFieldUpdater<zze, zze> zzb = AtomicReferenceFieldUpdater.newUpdater(zze.class, zze.class, "next");
        private static final AtomicReferenceFieldUpdater<? super zzgnn<?>, zze> zzc = AtomicReferenceFieldUpdater.newUpdater(zzgnn.class, zze.class, "waitersField");
        private static final AtomicReferenceFieldUpdater<? super zzgnn<?>, zzgnm.zzd> zzd = AtomicReferenceFieldUpdater.newUpdater(zzgnn.class, zzgnm.zzd.class, "listenersField");
        private static final AtomicReferenceFieldUpdater<? super zzgnn<?>, Object> zze = AtomicReferenceFieldUpdater.newUpdater(zzgnn.class, Object.class, "valueField");

        private zzb() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        final void zza(zze zzeVar, Thread thread) {
            zza.lazySet(zzeVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        final void zzb(zze zzeVar, zze zzeVar2) {
            zzb.lazySet(zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        final boolean zzc(zzgnn zzgnnVar, zze zzeVar, zze zzeVar2) {
            return AbstractC2404b.m10339a(zzc, zzgnnVar, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        final boolean zzd(zzgnn zzgnnVar, zzgnm.zzd zzdVar, zzgnm.zzd zzdVar2) {
            return AbstractC2404b.m10339a(zzd, zzgnnVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        final zze zze(zzgnn zzgnnVar, zze zzeVar) {
            return zzc.getAndSet(zzgnnVar, zzeVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        final zzgnm.zzd zzf(zzgnn zzgnnVar, zzgnm.zzd zzdVar) {
            return zzd.getAndSet(zzgnnVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        final boolean zzg(zzgnn zzgnnVar, Object obj, Object obj2) {
            return AbstractC2404b.m10339a(zze, zzgnnVar, obj, obj2);
        }

        /* synthetic */ zzb(byte[] bArr) {
            super(null);
        }
    }

    final class zzc extends zza {
        private zzc() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        final void zza(zze zzeVar, Thread thread) {
            zzeVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        final void zzb(zze zzeVar, zze zzeVar2) {
            zzeVar.next = zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        final boolean zzc(zzgnn zzgnnVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzgnnVar) {
                try {
                    if (zzgnnVar.waitersField != zzeVar) {
                        return false;
                    }
                    zzgnnVar.waitersField = zzeVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        final boolean zzd(zzgnn zzgnnVar, zzgnm.zzd zzdVar, zzgnm.zzd zzdVar2) {
            synchronized (zzgnnVar) {
                try {
                    if (zzgnnVar.listenersField != zzdVar) {
                        return false;
                    }
                    zzgnnVar.listenersField = zzdVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        final zze zze(zzgnn zzgnnVar, zze zzeVar) {
            zze zzeVar2;
            synchronized (zzgnnVar) {
                try {
                    zzeVar2 = zzgnnVar.waitersField;
                    if (zzeVar2 != zzeVar) {
                        zzgnnVar.waitersField = zzeVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        final zzgnm.zzd zzf(zzgnn zzgnnVar, zzgnm.zzd zzdVar) {
            zzgnm.zzd zzdVar2;
            synchronized (zzgnnVar) {
                try {
                    zzdVar2 = zzgnnVar.listenersField;
                    if (zzdVar2 != zzdVar) {
                        zzgnnVar.listenersField = zzdVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        final boolean zzg(zzgnn zzgnnVar, Object obj, Object obj2) {
            synchronized (zzgnnVar) {
                try {
                    if (zzgnnVar.valueField != obj) {
                        return false;
                    }
                    zzgnnVar.valueField = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* synthetic */ zzc(byte[] bArr) {
            super(null);
        }
    }

    final class zzd extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;
        public static final /* synthetic */ int zzg = 0;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(zzgno.zza);
                }
                try {
                    zzc = unsafe.objectFieldOffset(zzgnn.class.getDeclaredField("waitersField"));
                    zzb = unsafe.objectFieldOffset(zzgnn.class.getDeclaredField("listenersField"));
                    zzd = unsafe.objectFieldOffset(zzgnn.class.getDeclaredField("valueField"));
                    zze = unsafe.objectFieldOffset(zze.class.getDeclaredField("thread"));
                    zzf = unsafe.objectFieldOffset(zze.class.getDeclaredField("next"));
                    zza = unsafe;
                } catch (NoSuchFieldException e7) {
                    throw new RuntimeException(e7);
                }
            } catch (PrivilegedActionException e8) {
                throw new RuntimeException("Could not initialize intrinsics", e8.getCause());
            }
        }

        private zzd() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        final void zza(zze zzeVar, Thread thread) {
            zza.putObject(zzeVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        final void zzb(zze zzeVar, zze zzeVar2) {
            zza.putObject(zzeVar, zzf, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        final boolean zzc(zzgnn zzgnnVar, zze zzeVar, zze zzeVar2) {
            return AbstractC3899s.m18363a(zza, zzgnnVar, zzc, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        final boolean zzd(zzgnn zzgnnVar, zzgnm.zzd zzdVar, zzgnm.zzd zzdVar2) {
            return AbstractC3899s.m18363a(zza, zzgnnVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        final zze zze(zzgnn zzgnnVar, zze zzeVar) {
            zze zzeVar2;
            do {
                zzeVar2 = zzgnnVar.waitersField;
                if (zzeVar == zzeVar2) {
                    break;
                }
            } while (!zzc(zzgnnVar, zzeVar2, zzeVar));
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        final zzgnm.zzd zzf(zzgnn zzgnnVar, zzgnm.zzd zzdVar) {
            zzgnm.zzd zzdVar2;
            do {
                zzdVar2 = zzgnnVar.listenersField;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zzd(zzgnnVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgnn.zza
        final boolean zzg(zzgnn zzgnnVar, Object obj, Object obj2) {
            return AbstractC3899s.m18363a(zza, zzgnnVar, zzd, obj, obj2);
        }

        /* synthetic */ zzd(byte[] bArr) {
            super(null);
        }
    }

    final class zze {
        static final zze zza = new zze(false);
        volatile zze next;
        volatile Thread thread;

        zze(boolean z7) {
        }

        zze() {
            zzgnn.zzv(this, Thread.currentThread());
        }
    }

    static {
        boolean z7;
        Throwable th;
        Throwable th2;
        zza zzcVar;
        try {
            z7 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z7 = false;
        }
        zzg = z7;
        String property = System.getProperty("java.runtime.name", "");
        byte[] bArr = null;
        if (property == null || property.contains("Android")) {
            try {
                zzcVar = new zzd(bArr);
            } catch (Error | Exception e7) {
                try {
                    zzcVar = new zzb(bArr);
                    th = null;
                    th2 = e7;
                } catch (Error | Exception e8) {
                    th = e8;
                    th2 = e7;
                    zzcVar = new zzc(bArr);
                }
            }
        } else {
            try {
                zzcVar = new zzb(bArr);
            } catch (NoClassDefFoundError unused2) {
                zzcVar = new zzc(bArr);
            }
        }
        th = null;
        th2 = null;
        zzbi = zzcVar;
        if (th != null) {
            zzgpb zzgpbVar = zzf;
            Logger loggerZza = zzgpbVar.zza();
            Level level = Level.SEVERE;
            loggerZza.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zzgpbVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    zzgnn() {
    }

    private final void zza(zze zzeVar) {
        zzeVar.thread = null;
        while (true) {
            zze zzeVar2 = this.waitersField;
            if (zzeVar2 != zze.zza) {
                zze zzeVar3 = null;
                while (zzeVar2 != null) {
                    zze zzeVar4 = zzeVar2.next;
                    if (zzeVar2.thread != null) {
                        zzeVar3 = zzeVar2;
                    } else if (zzeVar3 != null) {
                        zzeVar3.next = zzeVar4;
                        if (zzeVar3.thread == null) {
                        }
                    } else if (!zzbi.zzc(this, zzeVar2, zzeVar4)) {
                    }
                    zzeVar2 = zzeVar4;
                }
                return;
            }
            return;
        }
    }

    static boolean zzr(zzgnn zzgnnVar, Object obj, Object obj2) {
        return zzbi.zzg(zzgnnVar, obj, obj2);
    }

    static /* synthetic */ void zzv(zze zzeVar, Thread thread) {
        zzbi.zza(zzeVar, thread);
    }

    public abstract /* synthetic */ void addListener(Runnable runnable, Executor executor);

    final boolean zzp(zzgnm.zzd zzdVar, zzgnm.zzd zzdVar2) {
        return zzbi.zzd(this, zzdVar, zzdVar2);
    }

    final zzgnm.zzd zzq(zzgnm.zzd zzdVar) {
        return zzbi.zzf(this, zzdVar);
    }

    final void zzs() {
        for (zze zzeVarZze = zzbi.zze(this, zze.zza); zzeVarZze != null; zzeVarZze = zzeVarZze.next) {
            Thread thread = zzeVarZze.thread;
            if (thread != null) {
                zzeVarZze.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    final Object zzt(long j7, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j7);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        if ((obj != null) && zzgnm.zzh(obj)) {
            return zzgnm.zzg(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zze zzeVar = this.waitersField;
            if (zzeVar != zze.zza) {
                zze zzeVar2 = new zze();
                while (true) {
                    zza zzaVar = zzbi;
                    zzaVar.zzb(zzeVar2, zzeVar);
                    if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zza(zzeVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && zzgnm.zzh(obj2)) {
                                return zzgnm.zzg(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zza(zzeVar2);
                        break;
                    }
                    zzeVar = this.waitersField;
                    if (zzeVar == zze.zza) {
                    }
                }
            }
            Object obj3 = this.valueField;
            Objects.requireNonNull(obj3);
            return zzgnm.zzg(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.valueField;
            if ((obj4 != null) && zzgnm.zzh(obj4)) {
                return zzgnm.zzg(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(j7).length() + 8 + String.valueOf(lowerCase2).length());
        sb.append("Waited ");
        sb.append(j7);
        sb.append(" ");
        sb.append(lowerCase2);
        String string3 = sb.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j8 = -nanos;
            long jConvert = timeUnit.convert(j8, TimeUnit.NANOSECONDS);
            long nanos2 = j8 - timeUnit.toNanos(jConvert);
            boolean z7 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                StringBuilder sb2 = new StringBuilder(strConcat.length() + String.valueOf(jConvert).length() + 1 + String.valueOf(lowerCase).length());
                sb2.append(strConcat);
                sb2.append(jConvert);
                sb2.append(" ");
                sb2.append(lowerCase);
                String string4 = sb2.toString();
                if (z7) {
                    string4 = string4.concat(",");
                }
                strConcat = string4.concat(" ");
            }
            if (z7) {
                StringBuilder sb3 = new StringBuilder(strConcat.length() + String.valueOf(nanos2).length() + 13);
                sb3.append(strConcat);
                sb3.append(nanos2);
                sb3.append(" nanoseconds ");
                strConcat = sb3.toString();
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        StringBuilder sb4 = new StringBuilder(string3.length() + 5 + String.valueOf(string).length());
        sb4.append(string3);
        sb4.append(" for ");
        sb4.append(string);
        throw new TimeoutException(sb4.toString());
    }

    final Object zzu() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.valueField;
        if ((obj2 != null) && zzgnm.zzh(obj2)) {
            return zzgnm.zzg(obj2);
        }
        zze zzeVar = this.waitersField;
        if (zzeVar != zze.zza) {
            zze zzeVar2 = new zze();
            do {
                zza zzaVar = zzbi;
                zzaVar.zzb(zzeVar2, zzeVar);
                if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zza(zzeVar2);
                            throw new InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & zzgnm.zzh(obj)));
                    return zzgnm.zzg(obj);
                }
                zzeVar = this.waitersField;
            } while (zzeVar != zze.zza);
        }
        Object obj3 = this.valueField;
        Objects.requireNonNull(obj3);
        return zzgnm.zzg(obj3);
    }
}
