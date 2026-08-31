package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.view.View;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final class zzgdw implements zzgcz, zzfvv {
    static final String[] zza = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    private final Context zzb;
    private final ExecutorService zzc;
    private final String[] zzd;
    private long zze = 0;
    private long zzf = 0;
    private long zzg = -1;
    private boolean zzh = false;

    zzgdw(Context context, zzftp zzftpVar, ExecutorService executorService, String[] strArr) {
        this.zzb = context;
        this.zzc = executorService;
        this.zzd = strArr;
    }

    @Override // com.google.android.gms.internal.ads.zzfvv
    public final InterfaceFutureC1673e zza() {
        return Build.VERSION.SDK_INT < 30 ? zzgot.zzb() : zzgot.zze(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgdv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf();
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgcz
    public final void zzb(Map map) {
        long j7;
        long j8;
        zze();
        synchronized (this) {
            try {
                j7 = this.zzh ? this.zzf - this.zze : -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
        map.put("vs", Long.valueOf(j7));
        synchronized (this) {
            j8 = this.zzg;
            this.zzg = -1L;
        }
        map.put("vf", Long.valueOf(j8));
    }

    @Override // com.google.android.gms.internal.ads.zzgcz
    public final void zzc(Map map, Context context, View view) {
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgcz
    public final void zzd(Map map) {
        zze();
    }

    final void zze() {
        synchronized (this) {
            try {
                if (this.zzh) {
                    this.zzf = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void zzf() {
        zzgdu zzgduVar = new zzgdu(this);
        try {
            Object systemService = this.zzb.getSystemService("appops");
            if (systemService == null) {
                throw null;
            }
            ((AppOpsManager) systemService).startWatchingActive(this.zzd, this.zzc, zzgduVar);
        } catch (Throwable unused) {
        }
    }

    final /* synthetic */ void zzg(long j7) {
        this.zze = j7;
    }

    final /* synthetic */ long zzh() {
        return this.zzf;
    }

    final /* synthetic */ void zzi(long j7) {
        this.zzg = j7;
    }

    final /* synthetic */ void zzj(boolean z7) {
        this.zzh = z7;
    }
}
