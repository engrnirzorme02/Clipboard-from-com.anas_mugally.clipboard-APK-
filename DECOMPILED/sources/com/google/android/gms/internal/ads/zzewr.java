package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewr implements zzeup {
    final ScheduledExecutorService zza;

    public zzewr(zzbta zzbtaVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        return zzgot.zzk(zzgot.zzi(zzgot.zza(new Bundle()), ((Long) C3250D.m17200c().zzd(zzbci.zzeH)).longValue(), TimeUnit.MILLISECONDS, this.zza), zzewq.zza, zzbzh.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 49;
    }
}
