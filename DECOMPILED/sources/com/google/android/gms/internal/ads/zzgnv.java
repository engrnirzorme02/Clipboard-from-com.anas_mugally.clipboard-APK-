package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzgnv extends zzgnz {
    private static final zzgpb zza = new zzgpb(zzgnv.class);
    private zzgjv zzb;
    private final boolean zzc;
    private final boolean zzd;

    zzgnv(zzgjv zzgjvVar, boolean z7, boolean z8) {
        super(zzgjvVar.size());
        this.zzb = zzgjvVar;
        this.zzc = z7;
        this.zzd = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
    public final void zzy(int i7, InterfaceFutureC1673e interfaceFutureC1673e) {
        try {
            if (interfaceFutureC1673e.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i7, interfaceFutureC1673e);
            }
        } finally {
            zzz(null);
        }
    }

    private final void zzE(Throwable th) {
        th.getClass();
        if (this.zzc && !zzb(th) && zzI(zzB(), th)) {
            zzF(th);
        } else if (th instanceof Error) {
            zzF(th);
        }
    }

    private static void zzF(Throwable th) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private final void zzG(int i7, Future future) {
        try {
            zzw(i7, zzgpu.zza(future));
        } catch (ExecutionException e7) {
            zzE(e7.getCause());
        } catch (Throwable th) {
            zzE(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzz(zzgjv zzgjvVar) {
        int iZzC = zzC();
        int i7 = 0;
        zzghc.zzi(iZzC >= 0, "Less than 0 remaining futures");
        if (iZzC == 0) {
            if (zzgjvVar != null) {
                zzgmd it = zzgjvVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i7, future);
                    }
                    i7++;
                }
            }
            this.seenExceptionsField = null;
            zzx();
            zzA(2);
        }
    }

    private static boolean zzI(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    void zzA(int i7) {
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    protected final void zzc() {
        zzgjv zzgjvVar = this.zzb;
        zzA(1);
        if ((zzgjvVar != null) && isCancelled()) {
            boolean zZzj = zzj();
            zzgmd it = zzgjvVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zZzj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    protected final String zzd() {
        zzgjv zzgjvVar = this.zzb;
        return zzgjvVar != null ? "futures=".concat(zzgjvVar.toString()) : super.zzd();
    }

    final void zze() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzx();
            return;
        }
        if (this.zzc) {
            zzgmd it = this.zzb.iterator();
            final int i7 = 0;
            while (it.hasNext()) {
                final InterfaceFutureC1673e interfaceFutureC1673e = (InterfaceFutureC1673e) it.next();
                int i8 = i7 + 1;
                if (interfaceFutureC1673e.isDone()) {
                    zzy(i7, interfaceFutureC1673e);
                } else {
                    interfaceFutureC1673e.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgnu
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzy(i7, interfaceFutureC1673e);
                        }
                    }, zzgoi.INSTANCE);
                }
                i7 = i8;
            }
            return;
        }
        zzgjv zzgjvVar = this.zzb;
        final zzgjv zzgjvVar2 = true != this.zzd ? null : zzgjvVar;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzgnt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzz(zzgjvVar2);
            }
        };
        zzgmd it2 = zzgjvVar.iterator();
        while (it2.hasNext()) {
            InterfaceFutureC1673e interfaceFutureC1673e2 = (InterfaceFutureC1673e) it2.next();
            if (interfaceFutureC1673e2.isDone()) {
                zzz(zzgjvVar2);
            } else {
                interfaceFutureC1673e2.addListener(runnable, zzgoi.INSTANCE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    final void zzf(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thZzl = zzl();
        Objects.requireNonNull(thZzl);
        zzI(set, thZzl);
    }

    abstract void zzw(int i7, Object obj);

    abstract void zzx();
}
