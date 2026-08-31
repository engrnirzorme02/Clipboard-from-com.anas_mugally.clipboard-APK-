package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.internal.AbstractC3718s;
import p012B2.AbstractC0082w;
import p012B2.InterfaceC0069j;
import p012B2.InterfaceC0074o;
import p012B2.InterfaceC0076q;
import p314o2.C6550b;
import p314o2.C6573y;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbqa implements InterfaceC0069j, InterfaceC0074o, InterfaceC0076q {
    private final zzbpd zza;
    private AbstractC0082w zzb;
    private zzbgr zzc;

    public zzbqa(zzbpd zzbpdVar) {
        this.zza = zzbpdVar;
    }

    @Override // p012B2.InterfaceC0069j
    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // p012B2.InterfaceC0069j
    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i7) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 44);
        sb.append("Adapter called onAdFailedToLoad with error. ");
        sb.append(i7);
        AbstractC7599p.m33326a(sb.toString());
        try {
            this.zza.zzg(i7);
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // p012B2.InterfaceC0076q
    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC0082w abstractC0082w = this.zzb;
        if (this.zzc == null) {
            if (abstractC0082w == null) {
                AbstractC7599p.m33334i("#007 Could not call remote method.", null);
                return;
            } else if (!abstractC0082w.m278n()) {
                AbstractC7599p.m33326a("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        AbstractC7599p.m33326a("Adapter called onAdImpression.");
        try {
            this.zza.zzk();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzh();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // p012B2.InterfaceC0069j
    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called onAdLoaded.");
        try {
            this.zza.zzj();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // p012B2.InterfaceC0069j
    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called onAdOpened.");
        try {
            this.zza.zzi();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called onVideoEnd.");
        try {
            this.zza.zzn();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // p012B2.InterfaceC0069j
    public final void zza(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called onAppEvent.");
        try {
            this.zza.zzl(str, str2);
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final AbstractC0082w zzb() {
        return this.zzb;
    }

    @Override // p012B2.InterfaceC0076q
    public final void zzc(MediationNativeAdapter mediationNativeAdapter, zzbgr zzbgrVar) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called onAdLoaded with template id ".concat(String.valueOf(zzbgrVar.zzb())));
        this.zzc = zzbgrVar;
        try {
            this.zza.zzj();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // p012B2.InterfaceC0076q
    public final void zzd(MediationNativeAdapter mediationNativeAdapter, zzbgr zzbgrVar, String str) {
        try {
            this.zza.zzm(zzbgrVar.zza(), str);
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final zzbgr zze() {
        return this.zzc;
    }

    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // p012B2.InterfaceC0074o
    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // p012B2.InterfaceC0069j
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, C6550b c6550b) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        int iM27807a = c6550b.m27807a();
        String strM27809c = c6550b.m27809c();
        String strM27808b = c6550b.m27808b();
        int length = String.valueOf(iM27807a).length();
        StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(strM27809c).length() + 15 + String.valueOf(strM27808b).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(iM27807a);
        sb.append(". ErrorMessage: ");
        sb.append(strM27809c);
        sb.append(". ErrorDomain: ");
        sb.append(strM27808b);
        AbstractC7599p.m33326a(sb.toString());
        try {
            this.zza.zzx(c6550b.m27810d());
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzh();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // p012B2.InterfaceC0074o
    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called onAdLoaded.");
        try {
            this.zza.zzj();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // p012B2.InterfaceC0074o
    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called onAdOpened.");
        try {
            this.zza.zzi();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // p012B2.InterfaceC0076q
    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC0082w abstractC0082w = this.zzb;
        if (this.zzc == null) {
            if (abstractC0082w == null) {
                AbstractC7599p.m33334i("#007 Could not call remote method.", null);
                return;
            } else if (!abstractC0082w.m277m()) {
                AbstractC7599p.m33326a("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        AbstractC7599p.m33326a("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // p012B2.InterfaceC0076q
    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzh();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // p012B2.InterfaceC0076q
    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, AbstractC0082w abstractC0082w) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called onAdLoaded.");
        this.zzb = abstractC0082w;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            C6573y c6573y = new C6573y();
            c6573y.m27869b(new zzbpn());
            if (abstractC0082w != null && abstractC0082w.m283s()) {
                abstractC0082w.m260H(c6573y);
            }
        }
        try {
            this.zza.zzj();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // p012B2.InterfaceC0076q
    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called onAdOpened.");
        try {
            this.zza.zzi();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // p012B2.InterfaceC0074o
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i7) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 44);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i7);
        sb.append(".");
        AbstractC7599p.m33326a(sb.toString());
        try {
            this.zza.zzg(i7);
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // p012B2.InterfaceC0074o
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, C6550b c6550b) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        int iM27807a = c6550b.m27807a();
        String strM27809c = c6550b.m27809c();
        String strM27808b = c6550b.m27808b();
        int length = String.valueOf(iM27807a).length();
        StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(strM27809c).length() + 15 + String.valueOf(strM27808b).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(iM27807a);
        sb.append(". ErrorMessage: ");
        sb.append(strM27809c);
        sb.append(". ErrorDomain: ");
        sb.append(strM27808b);
        AbstractC7599p.m33326a(sb.toString());
        try {
            this.zza.zzx(c6550b.m27810d());
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i7) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 44);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i7);
        sb.append(".");
        AbstractC7599p.m33326a(sb.toString());
        try {
            this.zza.zzg(i7);
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // p012B2.InterfaceC0076q
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, C6550b c6550b) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        int iM27807a = c6550b.m27807a();
        String strM27809c = c6550b.m27809c();
        String strM27808b = c6550b.m27808b();
        int length = String.valueOf(iM27807a).length();
        StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(strM27809c).length() + 15 + String.valueOf(strM27808b).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(iM27807a);
        sb.append(". ErrorMessage: ");
        sb.append(strM27809c);
        sb.append(". ErrorDomain: ");
        sb.append(strM27808b);
        AbstractC7599p.m33326a(sb.toString());
        try {
            this.zza.zzx(c6550b.m27810d());
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }
}
