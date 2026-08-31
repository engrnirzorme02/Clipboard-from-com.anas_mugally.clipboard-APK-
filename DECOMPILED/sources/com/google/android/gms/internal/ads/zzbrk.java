package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p068I2.InterfaceC0607b;
import p314o2.C6550b;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzbrk {
    final zzbpd zza;

    zzbrk(zzbpd zzbpdVar) {
        this.zza = zzbpdVar;
    }

    public final void onAdClosed() {
        try {
            this.zza.zzf();
        } catch (RemoteException unused) {
        }
    }

    public final void onAdFailedToShow(C6550b c6550b) {
        try {
            int iM27807a = c6550b.m27807a();
            String strM27809c = c6550b.m27809c();
            String strM27808b = c6550b.m27808b();
            StringBuilder sb = new StringBuilder(String.valueOf(iM27807a).length() + 59 + String.valueOf(strM27809c).length() + 16 + String.valueOf(strM27808b).length());
            sb.append("Mediated ad failed to show: Error Code = ");
            sb.append(iM27807a);
            sb.append(". Error Message = ");
            sb.append(strM27809c);
            sb.append(" Error Domain = ");
            sb.append(strM27808b);
            AbstractC7599p.m33331f(sb.toString());
            this.zza.zzy(c6550b.m27810d());
        } catch (RemoteException unused) {
        }
    }

    public final void onAdLeftApplication() {
        try {
            this.zza.zzh();
        } catch (RemoteException unused) {
        }
    }

    public final void onAdOpened() {
        try {
            this.zza.zzi();
        } catch (RemoteException unused) {
        }
    }

    public final void onUserEarnedReward() {
        try {
            this.zza.zzz();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoComplete() {
        try {
            this.zza.zzn();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoMute() {
    }

    public final void onVideoPause() {
        try {
            this.zza.zzq();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoPlay() {
        try {
            this.zza.zzu();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoStart() {
        try {
            this.zza.zzo();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoUnmute() {
    }

    public final void reportAdClicked() {
        try {
            this.zza.zze();
        } catch (RemoteException unused) {
        }
    }

    public final void reportAdImpression() {
        try {
            this.zza.zzk();
        } catch (RemoteException unused) {
        }
    }

    public final void onUserEarnedReward(InterfaceC0607b interfaceC0607b) {
        try {
            this.zza.zzr(new zzbwr(interfaceC0607b));
        } catch (RemoteException unused) {
        }
    }

    public final void onAdFailedToShow(String str) {
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28);
            sb.append("Mediated ad failed to show: ");
            sb.append(str);
            AbstractC7599p.m33331f(sb.toString());
            this.zza.zzv(str);
        } catch (RemoteException unused) {
        }
    }
}
