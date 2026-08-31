package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfgy {
    final /* synthetic */ zzfgz zza;
    private final Object zzb;
    private final String zzc;
    private final InterfaceFutureC1673e zzd;
    private final List zze;
    private final InterfaceFutureC1673e zzf;

    /* synthetic */ zzfgy(zzfgz zzfgzVar, Object obj, String str, InterfaceFutureC1673e interfaceFutureC1673e, List list, InterfaceFutureC1673e interfaceFutureC1673e2, byte[] bArr) {
        this(zzfgzVar, obj, null, interfaceFutureC1673e, list, interfaceFutureC1673e2);
    }

    public final zzfgy zza(String str) {
        return new zzfgy(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfgy zzb(final zzfgm zzfgmVar) {
        return zzc(new zzgob() { // from class: com.google.android.gms.internal.ads.zzfgx
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return zzgot.zza(zzfgmVar.zza(obj));
            }
        });
    }

    public final zzfgy zzc(zzgob zzgobVar) {
        return zzd(zzgobVar, this.zza.zze());
    }

    public final zzfgy zzd(zzgob zzgobVar, Executor executor) {
        return new zzfgy(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgot.zzj(this.zzf, zzgobVar, executor));
    }

    public final zzfgy zze(final InterfaceFutureC1673e interfaceFutureC1673e) {
        return zzd(new zzgob() { // from class: com.google.android.gms.internal.ads.zzfgu
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return interfaceFutureC1673e;
            }
        }, zzbzh.zzg);
    }

    public final zzfgy zzf(Class cls, final zzfgm zzfgmVar) {
        return zzg(cls, new zzgob(zzfgmVar) { // from class: com.google.android.gms.internal.ads.zzfgv
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return zzgot.zza("");
            }
        });
    }

    public final zzfgy zzg(Class cls, zzgob zzgobVar) {
        zzfgz zzfgzVar = this.zza;
        zzgpd zzgpdVarZze = zzfgzVar.zze();
        return new zzfgy(zzfgzVar, this.zzb, this.zzc, this.zzd, this.zze, zzgot.zzh(this.zzf, cls, zzgobVar, zzgpdVarZze));
    }

    public final zzfgy zzh(long j7, TimeUnit timeUnit) {
        zzfgz zzfgzVar = this.zza;
        ScheduledExecutorService scheduledExecutorServiceZzf = zzfgzVar.zzf();
        return new zzfgy(zzfgzVar, this.zzb, this.zzc, this.zzd, this.zze, zzgot.zzi(this.zzf, j7, timeUnit, scheduledExecutorServiceZzf));
    }

    public final zzfgo zzi() {
        Object obj = this.zzb;
        String strZzc = this.zzc;
        if (strZzc == null) {
            strZzc = this.zza.zzc(obj);
        }
        final zzfgo zzfgoVar = new zzfgo(obj, strZzc, this.zzf);
        this.zza.zzg().zza(zzfgoVar);
        InterfaceFutureC1673e interfaceFutureC1673e = this.zzd;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza.zzg().zzb(zzfgoVar);
            }
        };
        zzgpd zzgpdVar = zzbzh.zzg;
        interfaceFutureC1673e.addListener(runnable, zzgpdVar);
        zzgot.zzq(zzfgoVar, new zzfgt(this, zzfgoVar), zzgpdVar);
        return zzfgoVar;
    }

    public final zzfgy zzj(Object obj) {
        return this.zza.zza(obj, zzi());
    }

    private zzfgy(zzfgz zzfgzVar, Object obj, String str, InterfaceFutureC1673e interfaceFutureC1673e, List list, InterfaceFutureC1673e interfaceFutureC1673e2) {
        Objects.requireNonNull(zzfgzVar);
        this.zza = zzfgzVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = interfaceFutureC1673e;
        this.zze = list;
        this.zzf = interfaceFutureC1673e2;
    }
}
