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
public final class zzfan implements zzely {
    private final Context zza;
    private final Executor zzb;
    private final zzcgv zzc;
    private final zzeli zzd;
    private final zzfbn zze;
    private zzbdd zzf;
    private final zzfie zzg;
    private final zzfdb zzh;
    private InterfaceFutureC1673e zzi;

    public zzfan(Context context, Executor executor, zzcgv zzcgvVar, zzeli zzeliVar, zzfbn zzfbnVar, zzfdb zzfdbVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgvVar;
        this.zzd = zzeliVar;
        this.zzh = zzfdbVar;
        this.zze = zzfbnVar;
        this.zzg = zzcgvVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zza(C3349h2 c3349h2, String str, zzelw zzelwVar, zzelx zzelxVar) {
        zzdgh zzdghVarZzh;
        zzfib zzfibVarZzc;
        if (str == null) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33328c("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfam
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
            return false;
        }
        if (zzb()) {
            return false;
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjI)).booleanValue() && c3349h2.f13954f) {
            this.zzc.zzu().zzc(true);
        }
        C3369m2 c3369m2 = ((zzfag) zzelwVar).zza;
        Bundle bundleZza = zzdrw.zza(new Pair(zzdru.PUBLIC_API_CALL.zza(), Long.valueOf(c3349h2.f13946K)), new Pair(zzdru.DYNAMITE_ENTER.zza(), Long.valueOf(C7351t.m32357o().mo18159a())));
        zzfdb zzfdbVar = this.zzh;
        zzfdbVar.zzg(str);
        zzfdbVar.zzc(c3369m2);
        zzfdbVar.zza(c3349h2);
        zzfdbVar.zzv(bundleZza);
        Context context = this.zza;
        zzfdc zzfdcVarZzz = zzfdbVar.zzz();
        zzfhr zzfhrVarZzo = zzfhr.zzo(context, zzfia.zzg(zzfdcVarZzz), 4, c3349h2);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zziV)).booleanValue()) {
            zzdgg zzdggVarZzk = this.zzc.zzk();
            zzcva zzcvaVar = new zzcva();
            zzcvaVar.zza(context);
            zzcvaVar.zzb(zzfdcVarZzz);
            zzdggVarZzk.zze(zzcvaVar.zze());
            zzdbr zzdbrVar = new zzdbr();
            zzeli zzeliVar = this.zzd;
            Executor executor = this.zzb;
            zzdbrVar.zzm(zzeliVar, executor);
            zzdbrVar.zze(zzeliVar, executor);
            zzdggVarZzk.zzf(zzdbrVar.zzn());
            zzdggVarZzk.zzd(new zzejp(this.zzf));
            zzdghVarZzh = zzdggVarZzk.zzh();
        } else {
            zzdbr zzdbrVar2 = new zzdbr();
            zzfbn zzfbnVar = this.zze;
            if (zzfbnVar != null) {
                Executor executor2 = this.zzb;
                zzdbrVar2.zza(zzfbnVar, executor2);
                zzdbrVar2.zzb(zzfbnVar, executor2);
                zzdbrVar2.zzc(zzfbnVar, executor2);
            }
            zzdgg zzdggVarZzk2 = this.zzc.zzk();
            zzcva zzcvaVar2 = new zzcva();
            zzcvaVar2.zza(context);
            zzcvaVar2.zzb(zzfdcVarZzz);
            zzdggVarZzk2.zze(zzcvaVar2.zze());
            zzeli zzeliVar2 = this.zzd;
            Executor executor3 = this.zzb;
            zzdbrVar2.zzm(zzeliVar2, executor3);
            zzdbrVar2.zza(zzeliVar2, executor3);
            zzdbrVar2.zzb(zzeliVar2, executor3);
            zzdbrVar2.zzc(zzeliVar2, executor3);
            zzdbrVar2.zzf(zzeliVar2, executor3);
            zzdbrVar2.zzg(zzeliVar2, executor3);
            zzdbrVar2.zze(zzeliVar2, executor3);
            zzdbrVar2.zzk(zzeliVar2, executor3);
            zzdbrVar2.zzd(zzeliVar2, executor3);
            zzdggVarZzk2.zzf(zzdbrVar2.zzn());
            zzdggVarZzk2.zzd(new zzejp(this.zzf));
            zzdghVarZzh = zzdggVarZzk2.zzh();
        }
        zzdgh zzdghVar = zzdghVarZzh;
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            zzfibVarZzc = zzdghVar.zzc();
            zzfibVarZzc.zzi(4);
            zzfibVarZzc.zzc(c3349h2.f13936A);
            zzfibVarZzc.zzd(c3349h2.f13961x);
        } else {
            zzfibVarZzc = null;
        }
        zzfib zzfibVar = zzfibVarZzc;
        zzcrw zzcrwVarZzb = zzdghVar.zzb();
        InterfaceFutureC1673e interfaceFutureC1673eZzc = zzcrwVarZzb.zzc(zzcrwVarZzb.zzb());
        this.zzi = interfaceFutureC1673eZzc;
        zzgot.zzq(interfaceFutureC1673eZzc, new zzfal(this, zzelxVar, zzfibVar, zzfhrVarZzo, zzdghVar), this.zzb);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zzb() {
        InterfaceFutureC1673e interfaceFutureC1673e = this.zzi;
        return (interfaceFutureC1673e == null || interfaceFutureC1673e.isDone()) ? false : true;
    }

    public final void zzc(zzbdd zzbddVar) {
        this.zzf = zzbddVar;
    }

    final /* synthetic */ void zzd() {
        this.zzd.zzdN(zzfee.zzd(6, null, null));
    }

    final /* synthetic */ Executor zze() {
        return this.zzb;
    }

    final /* synthetic */ zzeli zzf() {
        return this.zzd;
    }

    final /* synthetic */ zzfbn zzg() {
        return this.zze;
    }

    final /* synthetic */ zzfie zzh() {
        return this.zzg;
    }

    final /* synthetic */ void zzi(InterfaceFutureC1673e interfaceFutureC1673e) {
        this.zzi = null;
    }
}
