package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.common.util.InterfaceC3750e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfci {
    private final InterfaceC3750e zza;
    private final zzdsm zzb;
    private final Object zzc = new Object();
    private volatile int zze = 1;
    private volatile long zzd = 0;

    public zzfci(InterfaceC3750e interfaceC3750e, zzdsm zzdsmVar) {
        this.zza = interfaceC3750e;
        this.zzb = zzdsmVar;
    }

    private final void zze() {
        long jMo18159a = this.zza.mo18159a();
        synchronized (this.zzc) {
            try {
                if (this.zze == 3) {
                    if (this.zzd + ((Long) C3250D.m17200c().zzd(zzbci.zzgt)).longValue() <= jMo18159a) {
                        this.zze = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzf(int i7, int i8) {
        zze();
        Object obj = this.zzc;
        long jMo18159a = this.zza.mo18159a();
        synchronized (obj) {
            try {
                if (this.zze != i7) {
                    return;
                }
                this.zze = i8;
                if (this.zze == 3) {
                    this.zzd = jMo18159a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza(boolean z7) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zznS)).booleanValue()) {
            zzdsl zzdslVarZza = this.zzb.zza();
            zzdslVarZza.zzc("action", "mbs_state");
            zzdslVarZza.zzc("mbs_state", true != z7 ? "0" : "1");
            zzdslVarZza.zzd();
        }
        if (z7) {
            zzf(1, 2);
        } else {
            zzf(2, 1);
        }
    }

    public final boolean zzb() {
        boolean z7;
        synchronized (this.zzc) {
            zze();
            z7 = this.zze == 2;
        }
        return z7;
    }

    public final boolean zzc() {
        boolean z7;
        synchronized (this.zzc) {
            zze();
            z7 = this.zze == 3;
        }
        return z7;
    }

    public final void zzd() {
        zzf(2, 3);
    }
}
