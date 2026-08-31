package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p084K2.AbstractC0736a;
import p084K2.InterfaceC0737b;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeoc implements zzeup {
    final zzbyv zza;
    InterfaceC0737b zzb;
    private final ScheduledExecutorService zzc;
    private final zzgpd zzd;
    private final Context zze;

    zzeoc(Context context, zzbyv zzbyvVar, ScheduledExecutorService scheduledExecutorService, zzgpd zzgpdVar) {
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzds)).booleanValue()) {
            this.zzb = AbstractC0736a.m3498a(context);
        }
        this.zze = context;
        this.zza = zzbyvVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgpdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdo)).booleanValue()) {
            if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzdt)).booleanValue()) {
                if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzdp)).booleanValue()) {
                    return zzgot.zzk(zzftu.zza(this.zzb.getAppSetIdInfo(), null), zzeob.zza, zzbzh.zzg);
                }
                Task taskZzb = ((Boolean) C3250D.m17200c().zzd(zzbci.zzds)).booleanValue() ? zzfeh.zzb(this.zze) : this.zzb.getAppSetIdInfo();
                if (taskZzb == null) {
                    return zzgot.zza(new zzeod(null, -1));
                }
                InterfaceFutureC1673e interfaceFutureC1673eZzj = zzgot.zzj(zzftu.zza(taskZzb, null), zzenz.zza, zzbzh.zzg);
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdq)).booleanValue()) {
                    interfaceFutureC1673eZzj = zzgot.zzi(interfaceFutureC1673eZzj, ((Long) C3250D.m17200c().zzd(zzbci.zzdr)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzgot.zzg(interfaceFutureC1673eZzj, Exception.class, new zzggr() { // from class: com.google.android.gms.internal.ads.zzeoa
                    @Override // com.google.android.gms.internal.ads.zzggr
                    public final /* synthetic */ Object apply(Object obj) {
                        this.zza.zza.zzg((Exception) obj, "AppSetIdInfoSignal");
                        return new zzeod(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzgot.zza(new zzeod(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 11;
    }
}
