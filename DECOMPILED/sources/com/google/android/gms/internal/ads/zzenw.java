package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.concurrent.Executor;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzenw implements zzeup {
    private final Executor zza;
    private final zzbyv zzb;

    zzenw(Executor executor, zzbyv zzbyvVar) {
        this.zza = executor;
        this.zzb = zzbyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdn)).booleanValue()) {
            return zzgot.zza(new zzenx(null));
        }
        zzbyv zzbyvVar = this.zzb;
        return zzgot.zzk(zzbyvVar.zzq(), zzenv.zza, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 10;
    }
}
