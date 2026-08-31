package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.util.AbstractC3749d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbzh {
    public static final zzgpd zza;
    public static final zzgpd zzb;
    public static final zzgpd zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzgpe zze;
    public static final zzgpd zzf;
    public static final zzgpd zzg;

    /* JADX WARN: Code duplicated, block: B:14:0x0090  */
    static {
        ExecutorService threadPoolExecutor;
        ExecutorService executorServiceZza;
        ExecutorService executorServiceZzc;
        if (AbstractC3749d.m18158a()) {
            zzfrn.zza();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzbze("Default")));
        } else {
            zzbbz zzbbzVar = zzbci.zzmc;
            if (C3250D.m17200c().zze(zzbbzVar) == null || !((Boolean) C3250D.m17200c().zze(zzbbzVar)).booleanValue()) {
                threadPoolExecutor = new ThreadPoolExecutor(2, C3553a.e.API_PRIORITY_OTHER, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzbze("Default"));
            } else {
                zzbbz zzbbzVar2 = zzbci.zzmd;
                if (C3250D.m17200c().zze(zzbbzVar2) != null) {
                    zzbbz zzbbzVar3 = zzbci.zzme;
                    if (C3250D.m17200c().zze(zzbbzVar3) != null) {
                        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(((Integer) C3250D.m17200c().zze(zzbbzVar2)).intValue(), ((Integer) C3250D.m17200c().zze(zzbbzVar2)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbze("Default"));
                        threadPoolExecutor2.allowCoreThreadTimeOut(((Boolean) C3250D.m17200c().zze(zzbbzVar3)).booleanValue());
                        threadPoolExecutor = threadPoolExecutor2;
                    } else {
                        threadPoolExecutor = new ThreadPoolExecutor(2, C3553a.e.API_PRIORITY_OTHER, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzbze("Default"));
                    }
                } else {
                    threadPoolExecutor = new ThreadPoolExecutor(2, C3553a.e.API_PRIORITY_OTHER, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzbze("Default"));
                }
            }
        }
        zza = new zzbzg(threadPoolExecutor, null);
        if (AbstractC3749d.m18158a()) {
            executorServiceZza = zzfrn.zza().zza(5, new zzbze("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbze("Loader"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorServiceZza = threadPoolExecutor3;
        }
        zzb = new zzbzg(executorServiceZza, null);
        if (AbstractC3749d.m18158a()) {
            executorServiceZzc = zzfrn.zza().zzc(new zzbze("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbze("Activeview"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            executorServiceZzc = threadPoolExecutor4;
        }
        zzc = new zzbzg(executorServiceZzc, null);
        zzbzd zzbzdVar = new zzbzd(3, new zzbze("Schedule"));
        zzd = zzbzdVar;
        zze = zzgpk.zzc(zzbzdVar);
        zzf = new zzbzg(new zzbzf(), null);
        zzg = new zzbzg(zzgpk.zza(), null);
    }
}
