package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p098M0.AbstractC0880j;
import p098M0.InterfaceC0883m;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcgr {
    private final zzcgj zza;
    private final zzdsm zzb;

    zzcgr(zzcgj zzcgjVar, zzdsm zzdsmVar) {
        this.zza = zzcgjVar;
        this.zzb = zzdsmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.concurrent.ThreadPoolExecutor] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final void zza() {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzox)).booleanValue()) {
            Executor threadPoolExecutor = zzbzh.zza;
            final ?? r7 = 0;
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzoA)).booleanValue()) {
                zzcgq zzcgqVar = new zzcgq(((Integer) C3250D.m17200c().zzd(zzbci.zzoC)).intValue(), null);
                int iIntValue = ((Integer) C3250D.m17200c().zzd(zzbci.zzoB)).intValue();
                threadPoolExecutor = new ThreadPoolExecutor(iIntValue, iIntValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzcgqVar);
                r7 = threadPoolExecutor;
            }
            final long jMo18161c = C7351t.m32357o().mo18161c();
            AbstractC0880j.d dVar = new AbstractC0880j.d() { // from class: com.google.android.gms.internal.ads.zzcgo
                @Override // p098M0.AbstractC0880j.d
                public final /* synthetic */ void onSuccess(InterfaceC0883m interfaceC0883m) {
                    this.zza.zzb(jMo18161c, r7, interfaceC0883m);
                }
            };
            this.zza.zzd(threadPoolExecutor, ((Boolean) C3250D.m17200c().zzd(zzbci.zzoz)).booleanValue(), dVar);
        }
    }

    final /* synthetic */ void zzb(long j7, ThreadPoolExecutor threadPoolExecutor, InterfaceC0883m interfaceC0883m) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzoy)).booleanValue()) {
            long jMo18161c = C7351t.m32357o().mo18161c() - j7;
            zzdsl zzdslVarZza = this.zzb.zza();
            zzdslVarZza.zzc("action", "webview_startup_l");
            StringBuilder sb = new StringBuilder(String.valueOf(jMo18161c).length());
            sb.append(jMo18161c);
            zzdslVarZza.zzc("webview_startup_l", sb.toString());
            Long totalTimeInUiThreadMillis = interfaceC0883m.getTotalTimeInUiThreadMillis();
            StringBuilder sb2 = new StringBuilder(String.valueOf(totalTimeInUiThreadMillis).length());
            sb2.append(totalTimeInUiThreadMillis);
            zzdslVarZza.zzc("webview_startup_uil", sb2.toString());
            zzdslVarZza.zzd();
        }
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzoF)).booleanValue()) {
            zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
        }
    }

    final /* synthetic */ void zzc() {
        this.zza.zzf(new zzcgm(this, C7351t.m32357o().mo18161c()));
    }

    final /* synthetic */ zzdsm zzd() {
        return this.zzb;
    }
}
