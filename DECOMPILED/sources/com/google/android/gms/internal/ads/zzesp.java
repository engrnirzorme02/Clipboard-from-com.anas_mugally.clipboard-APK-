package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.util.InterfaceC3494q0;
import java.util.concurrent.Callable;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzesp implements zzeup {
    private final zzgpd zza;
    private final zzfdc zzb;
    private final PackageInfo zzc;
    private final InterfaceC3494q0 zzd;

    public zzesp(zzgpd zzgpdVar, zzfdc zzfdcVar, PackageInfo packageInfo, InterfaceC3494q0 interfaceC3494q0) {
        this.zza = zzgpdVar;
        this.zzb = zzfdcVar;
        this.zzc = packageInfo;
        this.zzd = interfaceC3494q0;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeso
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 26;
    }

    final /* synthetic */ zzesq zzc() {
        return new zzesq(this.zzb, this.zzc, this.zzd);
    }
}
