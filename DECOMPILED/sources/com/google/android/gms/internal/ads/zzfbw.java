package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.concurrent.Executor;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfbw implements zzely {
    private final Context zza;
    private final Executor zzb;
    private final zzcgv zzc;
    private final zzfbn zzd;
    private final zzfab zze;
    private final zzfcv zzf;
    private final zzfie zzg;
    private final zzfdb zzh;
    private InterfaceFutureC1673e zzi;

    public zzfbw(Context context, Executor executor, zzcgv zzcgvVar, zzfab zzfabVar, zzfbn zzfbnVar, zzfdb zzfdbVar, zzfcv zzfcvVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgvVar;
        this.zze = zzfabVar;
        this.zzd = zzfbnVar;
        this.zzh = zzfdbVar;
        this.zzf = zzfcvVar;
        this.zzg = zzcgvVar.zzv();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzdoq zze(zzezz zzezzVar) {
        zzdoq zzdoqVarZzn = this.zzc.zzn();
        zzcva zzcvaVar = new zzcva();
        zzcvaVar.zza(this.zza);
        zzcvaVar.zzb(((zzfbv) zzezzVar).zza);
        zzcvaVar.zzf(this.zzf);
        zzdoqVarZzn.zzd(zzcvaVar.zze());
        zzdoqVarZzn.zze(new zzdbr().zzn());
        return zzdoqVarZzn;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zza(C3349h2 c3349h2, String str, zzelw zzelwVar, zzelx zzelxVar) {
        zzfib zzfibVar;
        zzbvo zzbvoVar = new zzbvo(c3349h2, str);
        String str2 = zzbvoVar.zzb;
        if (str2 == null) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33328c("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
            return false;
        }
        InterfaceFutureC1673e interfaceFutureC1673e = this.zzi;
        if (interfaceFutureC1673e != null && !interfaceFutureC1673e.isDone()) {
            return false;
        }
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            zzfab zzfabVar = this.zze;
            if (zzfabVar.zzd() != null) {
                zzfib zzfibVarZzd = ((zzdor) zzfabVar.zzd()).zzd();
                zzfibVarZzd.zzi(5);
                C3349h2 c3349h3 = zzbvoVar.zza;
                zzfibVarZzd.zzc(c3349h3.f13936A);
                zzfibVarZzd.zzd(c3349h3.f13961x);
                zzfibVar = zzfibVarZzd;
            } else {
                zzfibVar = null;
            }
        } else {
            zzfibVar = null;
        }
        Context context = this.zza;
        C3349h2 c3349h4 = zzbvoVar.zza;
        boolean z7 = c3349h4.f13954f;
        zzfdz.zzb(context, z7);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjI)).booleanValue() && z7) {
            this.zzc.zzu().zzc(true);
        }
        Bundle bundleZza = zzdrw.zza(new Pair(zzdru.PUBLIC_API_CALL.zza(), Long.valueOf(c3349h4.f13946K)), new Pair(zzdru.DYNAMITE_ENTER.zza(), Long.valueOf(C7351t.m32357o().mo18159a())));
        zzfdb zzfdbVar = this.zzh;
        zzfdbVar.zzg(str2);
        zzfdbVar.zzc(C3369m2.m17289V());
        zzfdbVar.zza(c3349h4);
        zzfdbVar.zzv(bundleZza);
        zzfdc zzfdcVarZzz = zzfdbVar.zzz();
        zzfhr zzfhrVarZzo = zzfhr.zzo(context, zzfia.zzg(zzfdcVarZzz), 5, c3349h4);
        zzfbv zzfbvVar = new zzfbv(null);
        zzfbvVar.zza = zzfdcVarZzz;
        InterfaceFutureC1673e interfaceFutureC1673eZzc = this.zze.zzc(new zzfac(zzfbvVar, null), new zzfaa() { // from class: com.google.android.gms.internal.ads.zzfbt
            @Override // com.google.android.gms.internal.ads.zzfaa
            public final /* synthetic */ zzcuy zza(zzezz zzezzVar) {
                return this.zza.zzd(zzezzVar);
            }
        }, null);
        this.zzi = interfaceFutureC1673eZzc;
        zzgot.zzq(interfaceFutureC1673eZzc, new zzfbs(this, zzelxVar, zzfibVar, zzfhrVarZzo, zzfbvVar), this.zzb);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zzb() {
        throw null;
    }

    final /* synthetic */ void zzc() {
        this.zzd.zzdN(zzfee.zzd(6, null, null));
    }

    final /* synthetic */ Executor zzf() {
        return this.zzb;
    }

    final /* synthetic */ zzfbn zzg() {
        return this.zzd;
    }

    final /* synthetic */ zzfab zzh() {
        return this.zze;
    }

    final /* synthetic */ zzfie zzi() {
        return this.zzg;
    }

    final void zzj(int i7) {
        this.zzh.zzj().zza(i7);
    }
}
