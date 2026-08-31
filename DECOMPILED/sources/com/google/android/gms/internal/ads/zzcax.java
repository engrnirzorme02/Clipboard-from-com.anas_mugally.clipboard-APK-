package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcax {
    private long zzb;
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) C3250D.m17200c().zzd(zzbci.zzW)).longValue());
    private boolean zzc = true;

    zzcax() {
    }

    public final void zza() {
        this.zzc = true;
    }

    public final void zzb(SurfaceTexture surfaceTexture, final zzcai zzcaiVar) {
        if (zzcaiVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.zzc) {
            long j7 = timestamp - this.zzb;
            if (Math.abs(j7) < this.zza) {
                return;
            }
        }
        this.zzc = false;
        this.zzb = timestamp;
        C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcaw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcaiVar.zzi();
            }
        });
    }
}
