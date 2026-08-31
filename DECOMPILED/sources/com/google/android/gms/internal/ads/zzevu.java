package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzevu implements zzeup {
    private final Executor zza;
    private final String zzb;

    public zzevu(zzbyn zzbynVar, Executor executor, String str, PackageInfo packageInfo, int i7) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        InterfaceFutureC1673e interfaceFutureC1673eZza = zzgot.zza(this.zzb);
        zzevt zzevtVar = zzevt.zza;
        Executor executor = this.zza;
        return zzgot.zzh(zzgot.zzk(interfaceFutureC1673eZza, zzevtVar, executor), Throwable.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzevs
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 41;
    }

    final /* synthetic */ InterfaceFutureC1673e zzc(Throwable th) {
        return zzgot.zza(new zzevv(this.zzb));
    }
}
