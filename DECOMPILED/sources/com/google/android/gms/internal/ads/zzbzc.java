package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbzc {
    private zzgpd zza;
    private zzdsm zzb;
    private final AtomicBoolean zzc = new AtomicBoolean(false);
    private final AtomicBoolean zzd = new AtomicBoolean(false);
    private long zze = -1;
    private long zzf = -1;

    public final void zza(zzgpd zzgpdVar, zzdsm zzdsmVar) {
        if (this.zzc.getAndSet(true)) {
            return;
        }
        this.zza = zzgpdVar;
        this.zzb = zzdsmVar;
        this.zze = ((Long) C3250D.m17200c().zzd(zzbci.zzou)).longValue();
        this.zzf = ((Long) C3250D.m17200c().zzd(zzbci.zzov)).longValue();
    }

    public final void zzb() {
        zzgpd zzgpdVar;
        if (!this.zzc.get() || this.zze < 0 || this.zzf < 0 || !this.zzd.compareAndSet(false, true) || (zzgpdVar = this.zza) == null) {
            return;
        }
        zzgpdVar.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbzb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc();
            }
        });
    }

    final /* synthetic */ void zzc() {
        zzdsm zzdsmVar;
        while (this.zzd.get()) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbza
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    atomicBoolean.getAndSet(true);
                }
            });
            try {
                Thread.sleep(this.zze);
                if (!atomicBoolean.get()) {
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzow)).booleanValue() && (zzdsmVar = this.zzb) != null) {
                        zzdsl zzdslVarZza = zzdsmVar.zza();
                        zzdslVarZza.zzc("action", "paa");
                        zzdslVarZza.zzf();
                    }
                }
                do {
                    try {
                        Thread.sleep(this.zzf);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                } while (!atomicBoolean.get());
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
