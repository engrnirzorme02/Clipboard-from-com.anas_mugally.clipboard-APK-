package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AbstractBinderC3309X;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3321a2;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.C3356j1;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.ads.internal.client.C3391s0;
import com.google.android.gms.ads.internal.client.C3393s2;
import com.google.android.gms.ads.internal.client.InterfaceC3262H;
import com.google.android.gms.ads.internal.client.InterfaceC3271K;
import com.google.android.gms.ads.internal.client.InterfaceC3280N;
import com.google.android.gms.ads.internal.client.InterfaceC3301U0;
import com.google.android.gms.ads.internal.client.InterfaceC3328c1;
import com.google.android.gms.ads.internal.client.InterfaceC3331d0;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.ads.internal.client.InterfaceC3375o0;
import com.google.android.gms.ads.internal.client.InterfaceC3403v0;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzelq extends AbstractBinderC3309X {
    private final C3369m2 zza;
    private final Context zzb;
    private final zzfan zzc;
    private final String zzd;
    private final C7584a zze;
    private final zzeli zzf;
    private final zzfbn zzg;
    private final zzauu zzh;
    private final zzdsm zzi;
    private zzdfa zzj;
    private boolean zzk = ((Boolean) C3250D.m17200c().zzd(zzbci.zzaT)).booleanValue();

    public zzelq(Context context, C3369m2 c3369m2, String str, zzfan zzfanVar, zzeli zzeliVar, zzfbn zzfbnVar, C7584a c7584a, zzauu zzauuVar, zzdsm zzdsmVar) {
        this.zza = c3369m2;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzfanVar;
        this.zzf = zzeliVar;
        this.zzg = zzfbnVar;
        this.zze = c7584a;
        this.zzh = zzauuVar;
        this.zzi = zzdsmVar;
    }

    private final synchronized boolean zzN() {
        zzdfa zzdfaVar = this.zzj;
        return (zzdfaVar == null || zzdfaVar.zzb()) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized boolean zzA() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized boolean zzB() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzC(zzbvn zzbvnVar) {
        this.zzg.zzn(zzbvnVar);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzD(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzE(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final InterfaceC3340f1 zzF() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzG(C3321a2 c3321a2) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzH(C3356j1 c3356j1) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzI(C3393s2 c3393s2) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzJ(zzbae zzbaeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzK(boolean z7) {
        AbstractC3718s.m18076e("setImmersiveMode must be called on the main UI thread.");
        this.zzk = z7;
    }

    final /* synthetic */ zzdfa zzL() {
        return this.zzj;
    }

    final /* synthetic */ void zzM(zzdfa zzdfaVar) {
        this.zzj = zzdfaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzP(InterfaceC3301U0 interfaceC3301U0) {
        AbstractC3718s.m18076e("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!interfaceC3301U0.zzf()) {
                this.zzi.zzb();
            }
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33327b("Error in making CSI ping for reporting paid event callback", e7);
        }
        this.zzf.zzo(interfaceC3301U0);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzQ(C3349h2 c3349h2, InterfaceC3280N interfaceC3280N) {
        this.zzf.zzp(interfaceC3280N);
        zze(c3349h2);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzR(InterfaceC3772a interfaceC3772a) {
        if (this.zzj == null) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Interstitial can not be shown before loaded.");
            this.zzf.zzj(zzfee.zzd(9, null, null));
        } else {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdg)).booleanValue()) {
                this.zzh.zzb().zzi(new Throwable().getStackTrace());
            }
            this.zzj.zza(this.zzk, (Activity) BinderC3773b.m18220M0(interfaceC3772a));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzS(InterfaceC3403v0 interfaceC3403v0) {
        this.zzf.zzq(interfaceC3403v0);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzT(long j7) {
        zzdfa zzdfaVar = this.zzj;
        if (zzdfaVar == null || zzdfaVar.zzo() == null) {
            return;
        }
        zzdfaVar.zzo().zzb(j7);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized long zzU() {
        zzdfa zzdfaVar = this.zzj;
        if (zzdfaVar == null || zzdfaVar.zzo() == null) {
            return 0L;
        }
        return zzdfaVar.zzo().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzY(C3391s0 c3391s0) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final InterfaceC3772a zzb() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzc() {
        AbstractC3718s.m18076e("destroy must be called on the main UI thread.");
        zzdfa zzdfaVar = this.zzj;
        if (zzdfaVar != null) {
            zzdfaVar.zzl().zzc(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized boolean zzd() {
        AbstractC3718s.m18076e("isLoaded must be called on the main UI thread.");
        return zzN();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzdW(InterfaceC3271K interfaceC3271K) {
        AbstractC3718s.m18076e("setAdListener must be called on the main UI thread.");
        this.zzf.zzl(interfaceC3271K);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized boolean zze(C3349h2 c3349h2) {
        boolean z7;
        try {
            if (!c3349h2.m17231U()) {
                if (((Boolean) zzbeg.zzi.zze()).booleanValue()) {
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlX)).booleanValue()) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                } else {
                    z7 = false;
                }
                if (this.zze.f30228c < ((Integer) C3250D.m17200c().zzd(zzbci.zzlY)).intValue() || !z7) {
                    AbstractC3718s.m18076e("loadAd must be called on the main UI thread.");
                }
            }
            C7351t.m32349g();
            Context context = this.zzb;
            if (C3431F0.m17421l(context) && c3349h2.f13939D == null) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33328c("Failed to load the ad because app ID is missing.");
                zzeli zzeliVar = this.zzf;
                if (zzeliVar != null) {
                    zzeliVar.zzdN(zzfee.zzd(4, null, null));
                }
            } else if (!zzN()) {
                zzfdz.zzb(context, c3349h2.f13954f);
                this.zzj = null;
                return this.zzc.zza(c3349h2, this.zzd, new zzfag(this.zza), new zzelp(this));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzf() {
        AbstractC3718s.m18076e("pause must be called on the main UI thread.");
        zzdfa zzdfaVar = this.zzj;
        if (zzdfaVar != null) {
            zzdfaVar.zzl().zza(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzg() {
        AbstractC3718s.m18076e("resume must be called on the main UI thread.");
        zzdfa zzdfaVar = this.zzj;
        if (zzdfaVar != null) {
            zzdfaVar.zzl().zzb(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzi(InterfaceC3375o0 interfaceC3375o0) {
        AbstractC3718s.m18076e("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzn(interfaceC3375o0);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzj(InterfaceC3331d0 interfaceC3331d0) {
        AbstractC3718s.m18076e("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final Bundle zzk() {
        AbstractC3718s.m18076e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzl() {
        AbstractC3718s.m18076e("showInterstitial must be called on the main UI thread.");
        if (this.zzj == null) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Interstitial can not be shown before loaded.");
            this.zzf.zzj(zzfee.zzd(9, null, null));
        } else {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdg)).booleanValue()) {
                this.zzh.zzb().zzi(new Throwable().getStackTrace());
            }
            this.zzj.zza(this.zzk, null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzm() {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final C3369m2 zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzo(C3369m2 c3369m2) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzp(zzbtf zzbtfVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzq(zzbti zzbtiVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized String zzr() {
        zzdfa zzdfaVar = this.zzj;
        if (zzdfaVar == null || zzdfaVar.zzn() == null) {
            return null;
        }
        return zzdfaVar.zzn().zze();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized String zzs() {
        zzdfa zzdfaVar = this.zzj;
        if (zzdfaVar == null || zzdfaVar.zzn() == null) {
            return null;
        }
        return zzdfaVar.zzn().zze();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized InterfaceC3328c1 zzt() {
        zzdfa zzdfaVar;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhg)).booleanValue() && (zzdfaVar = this.zzj) != null) {
            return zzdfaVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized String zzu() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final InterfaceC3375o0 zzv() {
        return this.zzf.zzk();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final InterfaceC3271K zzw() {
        return this.zzf.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzx(zzbdd zzbddVar) {
        AbstractC3718s.m18076e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzc(zzbddVar);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzy(InterfaceC3262H interfaceC3262H) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzz(boolean z7) {
    }
}
