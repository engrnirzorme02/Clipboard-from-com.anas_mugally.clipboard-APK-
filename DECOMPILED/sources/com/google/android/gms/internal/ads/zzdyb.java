package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdyb {
    private final ScheduledExecutorService zza;
    private final zzgpd zzb;
    private final zzgpd zzc;
    private final zzdyx zzd;
    private final zzhpr zze;

    public zzdyb(ScheduledExecutorService scheduledExecutorService, zzgpd zzgpdVar, zzgpd zzgpdVar2, zzdyx zzdyxVar, zzhpr zzhprVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgpdVar;
        this.zzc = zzgpdVar2;
        this.zzd = zzdyxVar;
        this.zze = zzhprVar;
    }

    public final InterfaceFutureC1673e zza(final zzbuv zzbuvVar) {
        InterfaceFutureC1673e interfaceFutureC1673eSubmit;
        String str = zzbuvVar.zzd;
        C7351t.m32349g();
        if (C3431F0.m17412g(str)) {
            interfaceFutureC1673eSubmit = zzgot.zzc(new zzdzk(1));
        } else {
            interfaceFutureC1673eSubmit = (((Boolean) C3250D.m17200c().zzd(zzbci.zzhU)).booleanValue() || ((Boolean) zzbet.zza.zze()).booleanValue()) ? this.zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxy
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzc(zzbuvVar);
                }
            }) : this.zzd.zza(zzbuvVar);
        }
        final int callingUid = Binder.getCallingUid();
        return (zzgol) zzgot.zzh((zzgol) zzgot.zzi(zzgol.zzw(interfaceFutureC1673eSubmit), ((Integer) C3250D.m17200c().zzd(zzbci.zzgc)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdya
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.zza.zzb(zzbuvVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ InterfaceFutureC1673e zzb(final zzbuv zzbuvVar, int i7, Throwable th) {
        Bundle bundle;
        if (zzbuvVar != null && (bundle = zzbuvVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgot.zzj(((zzeap) this.zze.zzb()).zzj(zzbuvVar, i7), new zzgob() { // from class: com.google.android.gms.internal.ads.zzdxz
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return zzgot.zza(new zzdzl((InputStream) obj, zzbuvVar));
            }
        }, this.zzb);
    }

    final /* synthetic */ zzdzl zzc(zzbuv zzbuvVar) {
        return (zzdzl) this.zzd.zza(zzbuvVar).get(((Integer) C3250D.m17200c().zzd(zzbci.zzgc)).intValue(), TimeUnit.SECONDS);
    }
}
