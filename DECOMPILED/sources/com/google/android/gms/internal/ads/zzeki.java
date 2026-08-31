package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.Collections;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeki extends AbstractBinderC3309X {
    private final Context zza;
    private final InterfaceC3271K zzb;
    private final zzfdc zzc;
    private final zzcok zzd;
    private final ViewGroup zze;
    private final zzdsm zzf;

    public zzeki(Context context, InterfaceC3271K interfaceC3271K, zzfdc zzfdcVar, zzcok zzcokVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = interfaceC3271K;
        this.zzc = zzfdcVar;
        this.zzd = zzcokVar;
        this.zzf = zzdsmVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View viewZza = zzcokVar.zza();
        C7351t.m32349g();
        frameLayout.addView(viewZza, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzn().f14024c);
        frameLayout.setMinimumWidth(zzn().f14027f);
        this.zze = frameLayout;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final boolean zzA() {
        zzcok zzcokVar = this.zzd;
        return zzcokVar != null && zzcokVar.zzs();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final boolean zzB() {
        return false;
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
    public final InterfaceC3340f1 zzF() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzG(C3321a2 c3321a2) {
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33330e("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
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

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzP(InterfaceC3301U0 interfaceC3301U0) {
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzmq)).booleanValue()) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33330e("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        zzeli zzeliVar = this.zzc.zzc;
        if (zzeliVar != null) {
            try {
                if (!interfaceC3301U0.zzf()) {
                    this.zzf.zzb();
                }
            } catch (RemoteException e7) {
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33327b("Error in making CSI ping for reporting paid event callback", e7);
            }
            zzeliVar.zzo(interfaceC3301U0);
        }
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
    public final void zzT(long j7) {
        zzcok zzcokVar = this.zzd;
        if (zzcokVar.zzo() != null) {
            zzcokVar.zzo().zzb(j7);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final long zzU() {
        zzcok zzcokVar = this.zzd;
        if (zzcokVar == null || zzcokVar.zzo() == null) {
            return 0L;
        }
        return zzcokVar.zzo().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzY(C3391s0 c3391s0) {
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33330e("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final InterfaceC3772a zzb() {
        return BinderC3773b.m18221N0(this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzc() {
        AbstractC3718s.m18076e("destroy must be called on the main UI thread.");
        this.zzd.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzdW(InterfaceC3271K interfaceC3271K) {
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33330e("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final boolean zze(C3349h2 c3349h2) {
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33330e("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzf() {
        AbstractC3718s.m18076e("destroy must be called on the main UI thread.");
        this.zzd.zzl().zza(null);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzg() {
        AbstractC3718s.m18076e("destroy must be called on the main UI thread.");
        this.zzd.zzl().zzb(null);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzi(InterfaceC3375o0 interfaceC3375o0) {
        zzeli zzeliVar = this.zzc.zzc;
        if (zzeliVar != null) {
            zzeliVar.zzn(interfaceC3375o0);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzj(InterfaceC3331d0 interfaceC3331d0) {
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33330e("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final Bundle zzk() {
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33330e("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzl() {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzm() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final C3369m2 zzn() {
        AbstractC3718s.m18076e("getAdSize must be called on the main UI thread.");
        return zzfdi.zza(this.zza, Collections.singletonList(this.zzd.zze()));
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzo(C3369m2 c3369m2) {
        AbstractC3718s.m18076e("setAdSize must be called on the main UI thread.");
        zzcok zzcokVar = this.zzd;
        if (zzcokVar != null) {
            zzcokVar.zzb(this.zze, c3369m2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzp(zzbtf zzbtfVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzq(zzbti zzbtiVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final String zzr() {
        zzcok zzcokVar = this.zzd;
        if (zzcokVar.zzn() != null) {
            return zzcokVar.zzn().zze();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final String zzs() {
        zzcok zzcokVar = this.zzd;
        if (zzcokVar.zzn() != null) {
            return zzcokVar.zzn().zze();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final InterfaceC3328c1 zzt() {
        return this.zzd.zzn();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final String zzu() {
        return this.zzc.zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final InterfaceC3375o0 zzv() {
        return this.zzc.zzo;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final InterfaceC3271K zzw() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzx(zzbdd zzbddVar) {
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33330e("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzy(InterfaceC3262H interfaceC3262H) {
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33330e("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzz(boolean z7) {
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33330e("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }
}
