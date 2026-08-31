package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzawg {
    private static final String[] zza = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    private long zzb = 0;
    private long zzc = 0;
    private long zzd = -1;
    private boolean zze = false;

    zzawg(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new zzawf(this));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
    }

    public static zzawg zza(Context context, Executor executor) {
        return new zzawg(context, executor, zza);
    }

    public final void zzb() {
        if (this.zze) {
            this.zzc = System.currentTimeMillis();
        }
    }

    public final long zzc() {
        if (this.zze) {
            return this.zzc - this.zzb;
        }
        return -1L;
    }

    public final long zzd() {
        long j7 = this.zzd;
        this.zzd = -1L;
        return j7;
    }

    final /* synthetic */ void zze(long j7) {
        this.zzb = j7;
    }

    final /* synthetic */ long zzf() {
        return this.zzc;
    }

    final /* synthetic */ void zzg(long j7) {
        this.zzd = j7;
    }

    final /* synthetic */ void zzh(boolean z7) {
        this.zze = z7;
    }
}
