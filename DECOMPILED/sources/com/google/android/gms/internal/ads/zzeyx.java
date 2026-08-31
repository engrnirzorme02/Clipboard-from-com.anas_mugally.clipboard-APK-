package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.ads.internal.client.InterfaceC3262H;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeyx implements zzely {
    private final Context zza;
    private final Executor zzb;
    private final zzcgv zzc;
    private final zzeli zzd;
    private final zzelm zze;
    private final ViewGroup zzf;
    private zzbdd zzg;
    private final zzcyt zzh;
    private final zzfie zzi;
    private final zzday zzj;
    private final zzfdb zzk;
    private InterfaceFutureC1673e zzl;
    private boolean zzm;
    private C3324b1 zzn;
    private zzelx zzo;

    public zzeyx(Context context, Executor executor, C3369m2 c3369m2, zzcgv zzcgvVar, zzeli zzeliVar, zzelm zzelmVar, zzfdb zzfdbVar, zzday zzdayVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgvVar;
        this.zzd = zzeliVar;
        this.zze = zzelmVar;
        this.zzk = zzfdbVar;
        this.zzh = zzcgvVar.zzd();
        this.zzi = zzcgvVar.zzv();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdayVar;
        zzfdbVar.zzc(c3369m2);
        this.zzm = true;
        this.zzn = null;
        this.zzo = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public final void zzn() {
        this.zzl = null;
        final C3324b1 c3324b1 = this.zzn;
        this.zzn = null;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zziT)).booleanValue() && c3324b1 != null) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzm(c3324b1);
                }
            });
        }
        zzelx zzelxVar = this.zzo;
        if (zzelxVar != null) {
            zzelxVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zza(C3349h2 c3349h2, String str, zzelw zzelwVar, zzelx zzelxVar) {
        zzcpp zzcppVarZza;
        if (str == null) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33328c("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzl();
                }
            });
            return false;
        }
        if (!zzb()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjI)).booleanValue() && c3349h2.f13954f) {
                this.zzc.zzu().zzc(true);
            }
            Bundle bundleZza = zzdrw.zza(new Pair(zzdru.PUBLIC_API_CALL.zza(), Long.valueOf(c3349h2.f13946K)), new Pair(zzdru.DYNAMITE_ENTER.zza(), Long.valueOf(C7351t.m32357o().mo18159a())));
            zzfdb zzfdbVar = this.zzk;
            zzfdbVar.zzg(str);
            zzfdbVar.zza(c3349h2);
            zzfdbVar.zzv(bundleZza);
            Context context = this.zza;
            zzfdc zzfdcVarZzz = zzfdbVar.zzz();
            zzfhr zzfhrVarZzo = zzfhr.zzo(context, zzfia.zzg(zzfdcVarZzz), 3, c3349h2);
            zzfib zzfibVarZze = null;
            if (!((Boolean) zzbeo.zzd.zze()).booleanValue() || !zzfdbVar.zzf().f14032v) {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zziT)).booleanValue()) {
                    zzcpo zzcpoVarZzg = this.zzc.zzg();
                    zzcva zzcvaVar = new zzcva();
                    zzcvaVar.zza(context);
                    zzcvaVar.zzb(zzfdcVarZzz);
                    zzcpoVarZzg.zzl(zzcvaVar.zze());
                    zzdbr zzdbrVar = new zzdbr();
                    zzeli zzeliVar = this.zzd;
                    Executor executor = this.zzb;
                    zzdbrVar.zzm(zzeliVar, executor);
                    zzdbrVar.zze(zzeliVar, executor);
                    zzcpoVarZzg.zzm(zzdbrVar.zzn());
                    zzcpoVarZzg.zzk(new zzejp(this.zzg));
                    zzcpoVarZzg.zzd(new zzdgy(zzdje.zza, null));
                    zzcpoVarZzg.zzg(new zzcqk(this.zzh, this.zzj));
                    zzcpoVarZzg.zze(new zzcoh(this.zzf));
                    zzcppVarZza = zzcpoVarZzg.zzh();
                } else {
                    zzcpo zzcpoVarZzg2 = this.zzc.zzg();
                    zzcva zzcvaVar2 = new zzcva();
                    zzcvaVar2.zza(context);
                    zzcvaVar2.zzb(zzfdcVarZzz);
                    zzcpoVarZzg2.zzl(zzcvaVar2.zze());
                    zzdbr zzdbrVar2 = new zzdbr();
                    zzeli zzeliVar2 = this.zzd;
                    Executor executor2 = this.zzb;
                    zzdbrVar2.zzm(zzeliVar2, executor2);
                    zzdbrVar2.zzf(zzeliVar2, executor2);
                    zzdbrVar2.zzf(this.zze, executor2);
                    zzdbrVar2.zzg(zzeliVar2, executor2);
                    zzdbrVar2.zzh(zzeliVar2, executor2);
                    zzdbrVar2.zza(zzeliVar2, executor2);
                    zzdbrVar2.zzb(zzeliVar2, executor2);
                    zzdbrVar2.zzc(zzeliVar2, executor2);
                    zzdbrVar2.zze(zzeliVar2, executor2);
                    zzdbrVar2.zzk(zzeliVar2, executor2);
                    zzcpoVarZzg2.zzm(zzdbrVar2.zzn());
                    zzcpoVarZzg2.zzk(new zzejp(this.zzg));
                    zzcpoVarZzg2.zzd(new zzdgy(zzdje.zza, null));
                    zzcpoVarZzg2.zzg(new zzcqk(this.zzh, this.zzj));
                    zzcpoVarZzg2.zze(new zzcoh(this.zzf));
                    zzcppVarZza = zzcpoVarZzg2.zzh();
                }
                if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
                    zzfibVarZze = zzcppVarZza.zze();
                    zzfibVarZze.zzi(3);
                    zzfibVarZze.zzc(c3349h2.f13936A);
                    zzfibVarZze.zzd(c3349h2.f13961x);
                }
                this.zzo = zzelxVar;
                zzcrw zzcrwVarZzc = zzcppVarZza.zzc();
                InterfaceFutureC1673e interfaceFutureC1673eZzc = zzcrwVarZzc.zzc(zzcrwVarZzc.zzb());
                this.zzl = interfaceFutureC1673eZzc;
                zzgot.zzq(interfaceFutureC1673eZzc, new zzeyt(this, zzfibVarZze, zzfhrVarZzo, zzcppVarZza), this.zzb);
                return true;
            }
            zzeli zzeliVar3 = this.zzd;
            if (zzeliVar3 != null) {
                zzeliVar3.zzdN(zzfee.zzd(7, null, null));
            }
        } else if (!this.zzk.zzA()) {
            this.zzm = true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zzb() {
        InterfaceFutureC1673e interfaceFutureC1673e = this.zzl;
        return (interfaceFutureC1673e == null || interfaceFutureC1673e.isDone()) ? false : true;
    }

    public final void zzc() {
        synchronized (this) {
            try {
                InterfaceFutureC1673e interfaceFutureC1673e = this.zzl;
                if (interfaceFutureC1673e != null && interfaceFutureC1673e.isDone()) {
                    try {
                        zzcok zzcokVar = (zzcok) this.zzl.get();
                        this.zzl = null;
                        ViewGroup viewGroup = this.zzf;
                        viewGroup.removeAllViews();
                        zzcokVar.zza();
                        ViewParent parent = zzcokVar.zza().getParent();
                        if (parent instanceof ViewGroup) {
                            String strZze = zzcokVar.zzn() != null ? zzcokVar.zzn().zze() : "";
                            StringBuilder sb = new StringBuilder(String.valueOf(strZze).length() + 78);
                            sb.append("Banner view provided from ");
                            sb.append(strZze);
                            sb.append(" already has a parent view. Removing its old parent.");
                            String string = sb.toString();
                            int i7 = AbstractC3490o0.f14278b;
                            AbstractC7599p.m33331f(string);
                            ((ViewGroup) parent).removeView(zzcokVar.zza());
                        }
                        zzbbz zzbbzVar = zzbci.zziT;
                        if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
                            zzczi zzcziVarZzq = zzcokVar.zzq();
                            zzcziVarZzq.zza(this.zzd);
                            zzcziVarZzq.zzb(this.zze);
                        }
                        viewGroup.addView(zzcokVar.zza());
                        zzelx zzelxVar = this.zzo;
                        if (zzelxVar != null) {
                            zzelxVar.zzb(zzcokVar);
                        }
                        if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
                            Executor executor = this.zzb;
                            final zzeli zzeliVar = this.zzd;
                            Objects.requireNonNull(zzeliVar);
                            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyw
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzeliVar.zzg();
                                }
                            });
                        }
                        if (zzcokVar.zzh() >= 0) {
                            this.zzm = false;
                            zzcyt zzcytVar = this.zzh;
                            zzcytVar.zzd(zzcokVar.zzh());
                            zzcytVar.zze(zzcokVar.zzg());
                        } else {
                            this.zzm = true;
                            this.zzh.zzd(zzcokVar.zzg());
                        }
                    } catch (InterruptedException e7) {
                        e = e7;
                        zzn();
                        AbstractC3490o0.m17546l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.zzm = true;
                        this.zzh.zzc();
                    } catch (ExecutionException e8) {
                        e = e8;
                        zzn();
                        AbstractC3490o0.m17546l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.zzm = true;
                        this.zzh.zzc();
                    }
                } else if (this.zzl != null) {
                    AbstractC3490o0.m17545k("Show timer went off but there is an ongoing ad request.");
                    this.zzm = true;
                } else {
                    AbstractC3490o0.m17545k("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.zzm = true;
                    this.zzh.zzc();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final void zze(zzbdd zzbddVar) {
        this.zzg = zzbddVar;
    }

    public final void zzf(InterfaceC3262H interfaceC3262H) {
        this.zze.zza(interfaceC3262H);
    }

    public final zzfdb zzg() {
        return this.zzk;
    }

    public final boolean zzh() {
        Object parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        C7351t.m32349g();
        return C3431F0.m17387C(view, view.getContext());
    }

    public final void zzi(zzcyo zzcyoVar) {
        this.zzh.zzq(zzcyoVar, this.zzb);
    }

    public final void zzj() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzk() {
        this.zzh.zze(this.zzj.zzd());
    }

    final /* synthetic */ void zzl() {
        this.zzd.zzdN(zzfee.zzd(6, null, null));
    }

    final /* synthetic */ void zzm(C3324b1 c3324b1) {
        this.zzd.zzdN(c3324b1);
    }

    final /* synthetic */ zzcyt zzo() {
        return this.zzh;
    }

    final /* synthetic */ zzfie zzp() {
        return this.zzi;
    }

    final /* synthetic */ zzday zzq() {
        return this.zzj;
    }

    final /* synthetic */ boolean zzr() {
        return this.zzm;
    }

    final /* synthetic */ void zzs(C3324b1 c3324b1) {
        this.zzn = c3324b1;
    }
}
