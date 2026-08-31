package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
final class zzbyu {
    private final Object zza = new Object();
    private volatile int zzc = 1;
    private volatile long zzb = 0;

    private zzbyu() {
    }

    public final void zza() {
        long jMo18159a = C7351t.m32357o().mo18159a();
        synchronized (this.zza) {
            try {
                if (this.zzc == 3) {
                    if (this.zzb + ((Long) C3250D.m17200c().zzd(zzbci.zzgt)).longValue() <= jMo18159a) {
                        this.zzc = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        long jMo18159a2 = C7351t.m32357o().mo18159a();
        synchronized (this.zza) {
            try {
                if (this.zzc != 2) {
                    return;
                }
                this.zzc = 3;
                if (this.zzc == 3) {
                    this.zzb = jMo18159a2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* synthetic */ zzbyu(byte[] bArr) {
    }
}
