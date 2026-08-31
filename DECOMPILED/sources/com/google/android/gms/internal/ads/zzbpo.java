package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3718s;
import p314o2.C6550b;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbpo {
    private final zzbpd zza;

    public zzbpo(zzbpd zzbpdVar) {
        this.zza = zzbpdVar;
    }

    public final void onAdClosed() {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdFailedToShow(C6550b c6550b) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called onAdFailedToShow.");
        int iM27807a = c6550b.m27807a();
        String strM27809c = c6550b.m27809c();
        String strM27808b = c6550b.m27808b();
        int length = String.valueOf(iM27807a).length();
        StringBuilder sb = new StringBuilder(length + 60 + String.valueOf(strM27809c).length() + 16 + String.valueOf(strM27808b).length());
        sb.append("Mediation ad failed to show: Error Code = ");
        sb.append(iM27807a);
        sb.append(". Error Message = ");
        sb.append(strM27809c);
        sb.append(" Error Domain = ");
        sb.append(strM27808b);
        AbstractC7599p.m33331f(sb.toString());
        try {
            this.zza.zzy(c6550b.m27810d());
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdLeftApplication() {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzh();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdOpened() {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called onAdOpened.");
        try {
            this.zza.zzi();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final void onVideoComplete() {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called onVideoComplete.");
        try {
            this.zza.zzt();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final void onVideoMute() {
    }

    public final void onVideoPause() {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called onVideoPause.");
        try {
            this.zza.zzq();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final void onVideoPlay() {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called onVideoPlay.");
        try {
            this.zza.zzu();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final void onVideoUnmute() {
    }

    public final void reportAdClicked() {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called reportAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final void reportAdImpression() {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called reportAdImpression.");
        try {
            this.zza.zzk();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdFailedToShow(String str) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        AbstractC7599p.m33326a("Adapter called onAdFailedToShow.");
        AbstractC7599p.m33331f("Mediation ad failed to show: ".concat(String.valueOf(str)));
        try {
            this.zza.zzv(str);
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }
}
