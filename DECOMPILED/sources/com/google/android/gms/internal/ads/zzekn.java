package com.google.android.gms.internal.ads;

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
import java.util.Collections;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzekn extends AbstractBinderC3309X implements zzcyo {
    private final Context zza;
    private final zzeyx zzb;
    private final String zzc;
    private final zzeli zzd;
    private C3369m2 zze;
    private final zzfdb zzf;
    private final C7584a zzg;
    private final zzdsm zzh;
    private zzcok zzi;

    public zzekn(Context context, C3369m2 c3369m2, String str, zzeyx zzeyxVar, zzeli zzeliVar, C7584a c7584a, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = zzeyxVar;
        this.zze = c3369m2;
        this.zzc = str;
        this.zzd = zzeliVar;
        this.zzf = zzeyxVar.zzg();
        this.zzg = c7584a;
        this.zzh = zzdsmVar;
        zzeyxVar.zzi(this);
    }

    private final synchronized void zzO(C3369m2 c3369m2) {
        zzfdb zzfdbVar = this.zzf;
        zzfdbVar.zzc(c3369m2);
        zzfdbVar.zze(this.zze.f14035y);
    }

    private final synchronized boolean zzV(C3349h2 c3349h2) {
        try {
            if (zzW()) {
                AbstractC3718s.m18076e("loadAd must be called on the main UI thread.");
            }
            C7351t.m32349g();
            Context context = this.zza;
            if (!C3431F0.m17421l(context) || c3349h2.f13939D != null) {
                zzfdz.zzb(context, c3349h2.f13954f);
                return this.zzb.zza(c3349h2, this.zzc, null, new zzekm(this));
            }
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33328c("Failed to load the ad because app ID is missing.");
            zzeli zzeliVar = this.zzd;
            if (zzeliVar != null) {
                zzeliVar.zzdN(zzfee.zzd(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    private final boolean zzW() {
        boolean z7;
        if (((Boolean) zzbeg.zzf.zze()).booleanValue()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlX)).booleanValue()) {
                z7 = true;
            } else {
                z7 = false;
            }
        } else {
            z7 = false;
        }
        return this.zzg.f30228c < ((Integer) C3250D.m17200c().zzd(zzbci.zzlY)).intValue() || !z7;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized boolean zzA() {
        zzcok zzcokVar = this.zzi;
        return zzcokVar != null && zzcokVar.zzs();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized boolean zzB() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzC(zzbvn zzbvnVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzD(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzE(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized InterfaceC3340f1 zzF() {
        AbstractC3718s.m18076e("getVideoController must be called from the main thread.");
        zzcok zzcokVar = this.zzi;
        if (zzcokVar == null) {
            return null;
        }
        return zzcokVar.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzG(C3321a2 c3321a2) {
        try {
            if (zzW()) {
                AbstractC3718s.m18076e("setVideoOptions must be called on the main UI thread.");
            }
            this.zzf.zzi(c3321a2);
        } catch (Throwable th) {
            throw th;
        }
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
    public final void zzK(boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final synchronized void zzL() {
        zzeyx zzeyxVar = this.zzb;
        if (zzeyxVar.zzh()) {
            zzeyxVar.zzc();
        } else {
            zzeyxVar.zzk();
        }
    }

    final /* synthetic */ zzcok zzM() {
        return this.zzi;
    }

    final /* synthetic */ void zzN(zzcok zzcokVar) {
        this.zzi = zzcokVar;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzP(InterfaceC3301U0 interfaceC3301U0) {
        if (zzW()) {
            AbstractC3718s.m18076e("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!interfaceC3301U0.zzf()) {
                this.zzh.zzb();
            }
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33327b("Error in making CSI ping for reporting paid event callback", e7);
        }
        this.zzd.zzo(interfaceC3301U0);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzQ(C3349h2 c3349h2, InterfaceC3280N interfaceC3280N) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzR(InterfaceC3772a interfaceC3772a) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzS(InterfaceC3403v0 interfaceC3403v0) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzT(long j7) {
        this.zzf.zzx(j7);
        zzcok zzcokVar = this.zzi;
        if (zzcokVar == null || zzcokVar.zzo() == null) {
            return;
        }
        zzcokVar.zzo().zzb(j7);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized long zzU() {
        zzcok zzcokVar = this.zzi;
        if (zzcokVar == null || zzcokVar.zzo() == null) {
            return this.zzf.zzw();
        }
        return zzcokVar.zzo().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzY(C3391s0 c3391s0) {
        AbstractC3718s.m18076e("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzX(c3391s0);
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final synchronized void zza() {
        try {
            if (!this.zzb.zzh()) {
                this.zzb.zzj();
                return;
            }
            zzfdb zzfdbVar = this.zzf;
            C3369m2 c3369m2Zzf = zzfdbVar.zzf();
            if (this.zzi != null && zzfdbVar.zzB()) {
                c3369m2Zzf = zzfdi.zza(this.zza, Collections.singletonList(this.zzi.zzf()));
            }
            zzO(c3369m2Zzf);
            zzfdbVar.zzd(true);
            try {
                zzV(zzfdbVar.zzb());
            } catch (RemoteException unused) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("Failed to refresh the banner ad.");
            }
            this.zzf.zzd(false);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final InterfaceC3772a zzb() {
        if (zzW()) {
            AbstractC3718s.m18076e("getAdFrame must be called on the main UI thread.");
        }
        return BinderC3773b.m18221N0(this.zzb.zzd());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzc() {
        try {
            if (((Boolean) zzbeg.zze.zze()).booleanValue()) {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlU)).booleanValue()) {
                    if (this.zzg.f30228c < ((Integer) C3250D.m17200c().zzd(zzbci.zzlZ)).intValue()) {
                        AbstractC3718s.m18076e("destroy must be called on the main UI thread.");
                    }
                } else {
                    AbstractC3718s.m18076e("destroy must be called on the main UI thread.");
                }
            } else {
                AbstractC3718s.m18076e("destroy must be called on the main UI thread.");
            }
            zzcok zzcokVar = this.zzi;
            if (zzcokVar != null) {
                zzcokVar.zzd();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzdW(InterfaceC3271K interfaceC3271K) {
        if (zzW()) {
            AbstractC3718s.m18076e("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zzl(interfaceC3271K);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized boolean zze(C3349h2 c3349h2) {
        zzO(this.zze);
        return zzV(c3349h2);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzf() {
        try {
            if (((Boolean) zzbeg.zzg.zze()).booleanValue()) {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlV)).booleanValue()) {
                    if (this.zzg.f30228c < ((Integer) C3250D.m17200c().zzd(zzbci.zzlZ)).intValue()) {
                        AbstractC3718s.m18076e("pause must be called on the main UI thread.");
                    }
                } else {
                    AbstractC3718s.m18076e("pause must be called on the main UI thread.");
                }
            } else {
                AbstractC3718s.m18076e("pause must be called on the main UI thread.");
            }
            zzcok zzcokVar = this.zzi;
            if (zzcokVar != null) {
                zzcokVar.zzl().zza(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzg() {
        try {
            if (((Boolean) zzbeg.zzh.zze()).booleanValue()) {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlT)).booleanValue()) {
                    if (this.zzg.f30228c < ((Integer) C3250D.m17200c().zzd(zzbci.zzlZ)).intValue()) {
                        AbstractC3718s.m18076e("resume must be called on the main UI thread.");
                    }
                } else {
                    AbstractC3718s.m18076e("resume must be called on the main UI thread.");
                }
            } else {
                AbstractC3718s.m18076e("resume must be called on the main UI thread.");
            }
            zzcok zzcokVar = this.zzi;
            if (zzcokVar != null) {
                zzcokVar.zzl().zzb(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzi(InterfaceC3375o0 interfaceC3375o0) {
        if (zzW()) {
            AbstractC3718s.m18076e("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzn(interfaceC3375o0);
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
    public final void zzl() {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzm() {
        AbstractC3718s.m18076e("recordManualImpression must be called on the main UI thread.");
        zzcok zzcokVar = this.zzi;
        if (zzcokVar != null) {
            zzcokVar.zzi();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized C3369m2 zzn() {
        AbstractC3718s.m18076e("getAdSize must be called on the main UI thread.");
        zzcok zzcokVar = this.zzi;
        if (zzcokVar != null) {
            return zzfdi.zza(this.zza, Collections.singletonList(zzcokVar.zze()));
        }
        return this.zzf.zzf();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzo(C3369m2 c3369m2) {
        AbstractC3718s.m18076e("setAdSize must be called on the main UI thread.");
        this.zzf.zzc(c3369m2);
        this.zze = c3369m2;
        zzcok zzcokVar = this.zzi;
        if (zzcokVar != null) {
            zzcokVar.zzb(this.zzb.zzd(), c3369m2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzp(zzbtf zzbtfVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzq(zzbti zzbtiVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized String zzr() {
        zzcok zzcokVar = this.zzi;
        if (zzcokVar == null || zzcokVar.zzn() == null) {
            return null;
        }
        return zzcokVar.zzn().zze();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized String zzs() {
        zzcok zzcokVar = this.zzi;
        if (zzcokVar == null || zzcokVar.zzn() == null) {
            return null;
        }
        return zzcokVar.zzn().zze();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized InterfaceC3328c1 zzt() {
        zzcok zzcokVar;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhg)).booleanValue() && (zzcokVar = this.zzi) != null) {
            return zzcokVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized String zzu() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final InterfaceC3375o0 zzv() {
        return this.zzd.zzk();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final InterfaceC3271K zzw() {
        return this.zzd.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzx(zzbdd zzbddVar) {
        AbstractC3718s.m18076e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zze(zzbddVar);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzy(InterfaceC3262H interfaceC3262H) {
        if (zzW()) {
            AbstractC3718s.m18076e("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzf(interfaceC3262H);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzz(boolean z7) {
        try {
            if (zzW()) {
                AbstractC3718s.m18076e("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.zzf.zzk(z7);
        } catch (Throwable th) {
            throw th;
        }
    }
}
