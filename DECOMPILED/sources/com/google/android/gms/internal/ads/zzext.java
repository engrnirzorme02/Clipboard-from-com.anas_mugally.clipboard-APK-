package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.ads.internal.client.C3393s2;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.concurrent.Executor;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzext implements zzely {
    protected final zzcgv zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzeyj zzd;
    private final zzfab zze;
    private final C7584a zzf;
    private final ViewGroup zzg;
    private final zzfie zzh;
    private final zzfdb zzi;
    private InterfaceFutureC1673e zzj;

    protected zzext(Context context, Executor executor, zzcgv zzcgvVar, zzfab zzfabVar, zzeyj zzeyjVar, zzfdb zzfdbVar, C7584a c7584a) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcgvVar;
        this.zze = zzfabVar;
        this.zzd = zzeyjVar;
        this.zzi = zzfdbVar;
        this.zzf = c7584a;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcgvVar.zzv();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized zzcuy zzg(zzezz zzezzVar) {
        zzexq zzexqVar = (zzexq) zzezzVar;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zziU)).booleanValue()) {
            zzcoh zzcohVar = new zzcoh(this.zzg);
            zzcva zzcvaVar = new zzcva();
            zzcvaVar.zza(this.zzb);
            zzcvaVar.zzb(zzexqVar.zza);
            zzcvb zzcvbVarZze = zzcvaVar.zze();
            zzdbr zzdbrVar = new zzdbr();
            zzeyj zzeyjVar = this.zzd;
            Executor executor = this.zzc;
            zzdbrVar.zzd(zzeyjVar, executor);
            zzdbrVar.zzg(zzeyjVar, executor);
            return zzc(zzcohVar, zzcvbVarZze, zzdbrVar.zzn());
        }
        zzeyj zzeyjVarZzn = zzeyj.zzn(this.zzd);
        zzdbr zzdbrVar2 = new zzdbr();
        Executor executor2 = this.zzc;
        zzdbrVar2.zzc(zzeyjVarZzn, executor2);
        zzdbrVar2.zzi(zzeyjVarZzn, executor2);
        zzdbrVar2.zzj(zzeyjVarZzn, executor2);
        zzdbrVar2.zzk(zzeyjVarZzn, executor2);
        zzdbrVar2.zzd(zzeyjVarZzn, executor2);
        zzdbrVar2.zzg(zzeyjVarZzn, executor2);
        zzdbrVar2.zzl(zzeyjVarZzn);
        zzcoh zzcohVar2 = new zzcoh(this.zzg);
        zzcva zzcvaVar2 = new zzcva();
        zzcvaVar2.zza(this.zzb);
        zzcvaVar2.zzb(zzexqVar.zza);
        return zzc(zzcohVar2, zzcvaVar2.zze(), zzdbrVar2.zzn());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    @Override // com.google.android.gms.internal.ads.zzely
    public final synchronized boolean zza(C3349h2 c3349h2, String str, zzelw zzelwVar, zzelx zzelxVar) throws Throwable {
        Throwable th;
        boolean z7;
        zzfib zzfibVar;
        zzcnu zzcnuVar;
        try {
            try {
                if (!c3349h2.m17231U()) {
                    if (((Boolean) zzbeg.zzd.zze()).booleanValue()) {
                        try {
                            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlX)).booleanValue()) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        z7 = false;
                    }
                    if (this.zzf.f30228c < ((Integer) C3250D.m17200c().zzd(zzbci.zzlY)).intValue() || !z7) {
                        AbstractC3718s.m18076e("loadAd must be called on the main UI thread.");
                    }
                }
                if (str == null) {
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33328c("Ad unit ID should not be null for app open ad.");
                    this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexs
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze();
                        }
                    });
                    return false;
                }
                if (this.zzj != null) {
                    return false;
                }
                if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzcnuVar = (zzcnu) this.zze.zzd()) == null) {
                    zzfibVar = null;
                } else {
                    zzfib zzfibVarZzd = zzcnuVar.zzd();
                    zzfibVarZzd.zzi(7);
                    zzfibVarZzd.zzc(c3349h2.f13936A);
                    zzfibVarZzd.zzd(c3349h2.f13961x);
                    zzfibVar = zzfibVarZzd;
                }
                Context context = this.zzb;
                boolean z8 = c3349h2.f13954f;
                zzfdz.zzb(context, z8);
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjI)).booleanValue() && z8) {
                    this.zza.zzu().zzc(true);
                }
                Bundle bundleZza = zzdrw.zza(new Pair(zzdru.PUBLIC_API_CALL.zza(), Long.valueOf(c3349h2.f13946K)), new Pair(zzdru.DYNAMITE_ENTER.zza(), Long.valueOf(C7351t.m32357o().mo18159a())));
                zzfdb zzfdbVar = this.zzi;
                zzfdbVar.zzg(str);
                zzfdbVar.zzc(C3369m2.m17290W());
                zzfdbVar.zza(c3349h2);
                zzfdbVar.zzv(bundleZza);
                zzfdc zzfdcVarZzz = zzfdbVar.zzz();
                zzfhr zzfhrVarZzo = zzfhr.zzo(context, zzfia.zzg(zzfdcVarZzz), 7, c3349h2);
                zzexq zzexqVar = new zzexq(null);
                zzexqVar.zza = zzfdcVarZzz;
                InterfaceFutureC1673e interfaceFutureC1673eZzc = this.zze.zzc(new zzfac(zzexqVar, null), new zzfaa() { // from class: com.google.android.gms.internal.ads.zzexr
                    @Override // com.google.android.gms.internal.ads.zzfaa
                    public final /* synthetic */ zzcuy zza(zzezz zzezzVar) {
                        return this.zza.zzf(zzezzVar);
                    }
                }, null);
                this.zzj = interfaceFutureC1673eZzc;
                zzgot.zzq(interfaceFutureC1673eZzc, new zzexp(this, zzelxVar, zzfibVar, zzfhrVarZzo, zzexqVar), this.zzc);
                return true;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zzb() {
        InterfaceFutureC1673e interfaceFutureC1673e = this.zzj;
        return (interfaceFutureC1673e == null || interfaceFutureC1673e.isDone()) ? false : true;
    }

    protected abstract zzcuy zzc(zzcoh zzcohVar, zzcvb zzcvbVar, zzdbs zzdbsVar);

    public final void zzd(C3393s2 c3393s2) {
        this.zzi.zzp(c3393s2);
    }

    final /* synthetic */ void zze() {
        this.zzd.zzdN(zzfee.zzd(6, null, null));
    }

    final /* synthetic */ Executor zzh() {
        return this.zzc;
    }

    final /* synthetic */ zzeyj zzi() {
        return this.zzd;
    }

    final /* synthetic */ zzfab zzj() {
        return this.zze;
    }

    final /* synthetic */ zzfie zzk() {
        return this.zzh;
    }

    final /* synthetic */ void zzl(InterfaceFutureC1673e interfaceFutureC1673e) {
        this.zzj = null;
    }
}
