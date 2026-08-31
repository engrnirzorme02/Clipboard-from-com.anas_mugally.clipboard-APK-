package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdyg implements zzdzj {
    private static final Pattern zzh = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdxh zza;
    private final zzgpd zzb;
    private final zzfdc zzc;
    private final ScheduledExecutorService zzd;
    private final zzebk zze;
    private final zzfib zzf;
    private final Context zzg;

    zzdyg(Context context, zzfdc zzfdcVar, zzdxh zzdxhVar, zzgpd zzgpdVar, ScheduledExecutorService scheduledExecutorService, zzebk zzebkVar, zzfib zzfibVar) {
        this.zzg = context;
        this.zzc = zzfdcVar;
        this.zza = zzdxhVar;
        this.zzb = zzgpdVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzebkVar;
        this.zzf = zzfibVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdzj
    public final InterfaceFutureC1673e zza(zzbuv zzbuvVar) {
        Context context = this.zzg;
        InterfaceFutureC1673e interfaceFutureC1673eZza = this.zza.zza(zzbuvVar);
        zzfhr zzfhrVarZzn = zzfhr.zzn(context, 11);
        zzfia.zzb(interfaceFutureC1673eZza, zzfhrVarZzn);
        InterfaceFutureC1673e interfaceFutureC1673eZzj = zzgot.zzj(interfaceFutureC1673eZza, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdyf
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.zza.zzb((zzdzl) obj);
            }
        }, this.zzb);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzgb)).booleanValue()) {
            interfaceFutureC1673eZzj = zzgot.zzh(zzgot.zzi(interfaceFutureC1673eZzj, ((Integer) C3250D.m17200c().zzd(zzbci.zzgc)).intValue(), TimeUnit.SECONDS, this.zzd), TimeoutException.class, zzdye.zza, zzbzh.zzg);
        }
        zzfia.zzd(interfaceFutureC1673eZzj, this.zzf, zzfhrVarZzn);
        zzgot.zzq(interfaceFutureC1673eZzj, new zzdyd(this), zzbzh.zzg);
        return interfaceFutureC1673eZzj;
    }

    final /* synthetic */ InterfaceFutureC1673e zzb(zzdzl zzdzlVar) {
        return zzgot.zza(new zzfcu(new zzfcr(this.zzc), zzfct.zza(new InputStreamReader(zzdzlVar.zza()), zzdzlVar.zzb().zzm)));
    }

    final /* synthetic */ zzebk zzc() {
        return this.zze;
    }
}
