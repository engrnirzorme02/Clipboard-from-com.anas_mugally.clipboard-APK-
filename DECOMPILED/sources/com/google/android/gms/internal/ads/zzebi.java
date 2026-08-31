package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.util.InterfaceC3494q0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzebi implements zzcxg, zzcvv {
    private static final Object zza = new Object();
    private static int zzb;
    private final InterfaceC3494q0 zzc;
    private final zzebs zzd;

    public zzebi(zzebs zzebsVar, InterfaceC3494q0 interfaceC3494q0) {
        this.zzd = zzebsVar;
        this.zzc = interfaceC3494q0;
    }

    private final void zzb(boolean z7) {
        int i7;
        int iIntValue;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzgF)).booleanValue() && !this.zzc.zzx()) {
            Object obj = zza;
            synchronized (obj) {
                i7 = zzb;
                iIntValue = ((Integer) C3250D.m17200c().zzd(zzbci.zzgG)).intValue();
            }
            if (i7 < iIntValue) {
                this.zzd.zza(z7);
                synchronized (obj) {
                    zzb++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzdN(C3324b1 c3324b1) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzg() {
        zzb(true);
    }
}
