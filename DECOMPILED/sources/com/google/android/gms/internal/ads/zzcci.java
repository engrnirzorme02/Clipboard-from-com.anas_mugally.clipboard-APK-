package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3422B;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.util.concurrent.Callable;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcci extends AbstractC3422B {
    final zzcbd zza;
    final zzccq zzb;
    private final String zzc;
    private final String[] zzd;

    zzcci(zzcbd zzcbdVar, zzccq zzccqVar, String str, String[] strArr) {
        this.zza = zzcbdVar;
        this.zzb = zzccqVar;
        this.zzc = str;
        this.zzd = strArr;
        C7351t.m32344b().zzc(this);
    }

    @Override // com.google.android.gms.ads.internal.util.AbstractC3422B
    public final void zza() {
        try {
            this.zzb.zzf(this.zzc, this.zzd);
        } finally {
            C3431F0.f14180l.post(new zzccg(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.AbstractC3422B
    public final InterfaceFutureC1673e zzb() {
        return (((Boolean) C3250D.m17200c().zzd(zzbci.zzcj)).booleanValue() && (this.zzb instanceof zzccz)) ? zzbzh.zzf.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzcch
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zze();
            }
        }) : super.zzb();
    }

    public final String zzd() {
        return this.zzc;
    }

    final /* synthetic */ Boolean zze() {
        return Boolean.valueOf(this.zzb.zzg(this.zzc, this.zzd, this));
    }
}
