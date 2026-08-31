package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.common.util.InterfaceC3750e;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p396y2.InterfaceC7536x;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcur implements InterfaceC7536x {
    private final zzfcu zzc;
    private final zzfcj zzd;
    private final InterfaceC3750e zze;
    private final zzdsm zzf;
    private final ScheduledExecutorService zzg;
    private final Object zzb = new Object();
    final zzfiv zza = zzfiw.zza();
    private boolean zzh = false;
    private boolean zzi = false;

    zzcur(zzfcu zzfcuVar, zzfcj zzfcjVar, InterfaceC3750e interfaceC3750e, zzdsm zzdsmVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = zzfcuVar;
        this.zzd = zzfcjVar;
        this.zze = interfaceC3750e;
        this.zzf = zzdsmVar;
        this.zzg = scheduledExecutorService;
    }

    private final void zzn() {
        synchronized (this.zzb) {
            try {
                zzdsm zzdsmVar = this.zzf;
                String str = this.zzc.zzb.zzb.zzb;
                String strEncodeToString = Base64.encodeToString(((zzfiw) this.zza.zzbu()).zzaN(), 1);
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zznH)).booleanValue()) {
                    zzdsl zzdslVarZza = zzdsmVar.zza();
                    zzdslVarZza.zzc("action", "pclma");
                    zzdslVarZza.zzc("pclmd", strEncodeToString);
                    zzdslVarZza.zzc("gqi", str);
                    zzdslVarZza.zzf();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzo(int i7) {
        synchronized (this.zzb) {
            try {
                if (!this.zzi && this.zzh) {
                    zzfiv zzfivVar = this.zza;
                    zzfhp zzfhpVarZza = zzfhq.zza();
                    zzfhpVarZza.zzb(i7);
                    zzfhpVarZza.zza(this.zze.mo18159a());
                    zzfivVar.zza((zzfhq) zzfhpVarZza.zzbu());
                    if (i7 == 10) {
                        zzn();
                        this.zzi = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdA() {
        zzo(7);
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdB() {
        zzo(8);
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdC() {
        zzo(6);
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdD() {
        zzo(9);
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdE() {
        zzo(10);
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdX() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdY(int i7) {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdt() {
        zzo(3);
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdu() {
        zzo(5);
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdv() {
        zzo(4);
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzh() {
    }

    public final void zzl() {
        synchronized (this.zzb) {
            if (this.zzd.zzaE > 0 && !this.zzh) {
                this.zza.zzb(this.zze.mo18159a());
                this.zzh = true;
                this.zzg.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcuq
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzm();
                    }
                }, this.zzd.zzaE, TimeUnit.MILLISECONDS);
            }
        }
    }

    final /* synthetic */ void zzm() {
        synchronized (this.zzb) {
            try {
                if (this.zzi) {
                    return;
                }
                this.zzi = true;
                zzn();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
