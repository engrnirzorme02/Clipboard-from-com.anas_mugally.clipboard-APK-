package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdtz {
    private final zzbkl zza;

    zzdtz(zzbkl zzbklVar) {
        this.zza = zzbklVar;
    }

    private final void zzs(zzdty zzdtyVar) {
        String strZza = zzdtyVar.zza();
        String strConcat = "Dispatching AFMA event on publisher webview: ".concat(strZza);
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33330e(strConcat);
        this.zza.zzb(strZza);
    }

    public final void zza() {
        zzs(new zzdty("initialize", null));
    }

    public final void zzb(long j7) {
        zzdty zzdtyVar = new zzdty("creation", null);
        zzdtyVar.zzb(Long.valueOf(j7));
        zzdtyVar.zzc("nativeObjectCreated");
        zzs(zzdtyVar);
    }

    public final void zzc(long j7) {
        zzdty zzdtyVar = new zzdty("creation", null);
        zzdtyVar.zzb(Long.valueOf(j7));
        zzdtyVar.zzc("nativeObjectNotCreated");
        zzs(zzdtyVar);
    }

    public final void zzd(long j7) {
        zzdty zzdtyVar = new zzdty("interstitial", null);
        zzdtyVar.zzb(Long.valueOf(j7));
        zzdtyVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzdtyVar);
    }

    public final void zze(long j7) {
        zzdty zzdtyVar = new zzdty("interstitial", null);
        zzdtyVar.zzb(Long.valueOf(j7));
        zzdtyVar.zzc("onAdLoaded");
        zzs(zzdtyVar);
    }

    public final void zzf(long j7, int i7) {
        zzdty zzdtyVar = new zzdty("interstitial", null);
        zzdtyVar.zzb(Long.valueOf(j7));
        zzdtyVar.zzc("onAdFailedToLoad");
        zzdtyVar.zzd(Integer.valueOf(i7));
        zzs(zzdtyVar);
    }

    public final void zzg(long j7) {
        zzdty zzdtyVar = new zzdty("interstitial", null);
        zzdtyVar.zzb(Long.valueOf(j7));
        zzdtyVar.zzc("onAdOpened");
        zzs(zzdtyVar);
    }

    public final void zzh(long j7) {
        zzdty zzdtyVar = new zzdty("interstitial", null);
        zzdtyVar.zzb(Long.valueOf(j7));
        zzdtyVar.zzc("onAdClicked");
        this.zza.zzb(zzdtyVar.zza());
    }

    public final void zzi(long j7) {
        zzdty zzdtyVar = new zzdty("interstitial", null);
        zzdtyVar.zzb(Long.valueOf(j7));
        zzdtyVar.zzc("onAdClosed");
        zzs(zzdtyVar);
    }

    public final void zzj(long j7) {
        zzdty zzdtyVar = new zzdty("rewarded", null);
        zzdtyVar.zzb(Long.valueOf(j7));
        zzdtyVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzdtyVar);
    }

    public final void zzk(long j7) {
        zzdty zzdtyVar = new zzdty("rewarded", null);
        zzdtyVar.zzb(Long.valueOf(j7));
        zzdtyVar.zzc("onRewardedAdLoaded");
        zzs(zzdtyVar);
    }

    public final void zzl(long j7, int i7) {
        zzdty zzdtyVar = new zzdty("rewarded", null);
        zzdtyVar.zzb(Long.valueOf(j7));
        zzdtyVar.zzc("onRewardedAdFailedToLoad");
        zzdtyVar.zzd(Integer.valueOf(i7));
        zzs(zzdtyVar);
    }

    public final void zzm(long j7) {
        zzdty zzdtyVar = new zzdty("rewarded", null);
        zzdtyVar.zzb(Long.valueOf(j7));
        zzdtyVar.zzc("onRewardedAdOpened");
        zzs(zzdtyVar);
    }

    public final void zzn(long j7, int i7) {
        zzdty zzdtyVar = new zzdty("rewarded", null);
        zzdtyVar.zzb(Long.valueOf(j7));
        zzdtyVar.zzc("onRewardedAdFailedToShow");
        zzdtyVar.zzd(Integer.valueOf(i7));
        zzs(zzdtyVar);
    }

    public final void zzo(long j7) {
        zzdty zzdtyVar = new zzdty("rewarded", null);
        zzdtyVar.zzb(Long.valueOf(j7));
        zzdtyVar.zzc("onRewardedAdClosed");
        zzs(zzdtyVar);
    }

    public final void zzp(long j7, zzbvx zzbvxVar) {
        zzdty zzdtyVar = new zzdty("rewarded", null);
        zzdtyVar.zzb(Long.valueOf(j7));
        zzdtyVar.zzc("onUserEarnedReward");
        zzdtyVar.zze(zzbvxVar.zze());
        zzdtyVar.zzf(Integer.valueOf(zzbvxVar.zzf()));
        zzs(zzdtyVar);
    }

    public final void zzq(long j7) {
        zzdty zzdtyVar = new zzdty("rewarded", null);
        zzdtyVar.zzb(Long.valueOf(j7));
        zzdtyVar.zzc("onAdImpression");
        zzs(zzdtyVar);
    }

    public final void zzr(long j7) {
        zzdty zzdtyVar = new zzdty("rewarded", null);
        zzdtyVar.zzb(Long.valueOf(j7));
        zzdtyVar.zzc("onAdClicked");
        zzs(zzdtyVar);
    }
}
