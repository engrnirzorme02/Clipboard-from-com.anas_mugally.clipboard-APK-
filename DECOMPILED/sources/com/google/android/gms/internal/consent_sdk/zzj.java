package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import p108N3.C0964f;
import p108N3.C0965g;
import p108N3.EnumC0963e;
import p108N3.InterfaceC0961c;
import p108N3.InterfaceC0962d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzj {
    private final zzaq zza;
    private final zzw zzb;
    private final zzbo zzc;
    private final Object zzd = new Object();
    private final Object zze = new Object();
    private boolean zzf = false;
    private boolean zzg = false;
    private C0964f zzh = new C0964f.a().m4220a();

    public zzj(zzaq zzaqVar, zzw zzwVar, zzbo zzboVar) {
        this.zza = zzaqVar;
        this.zzb = zzwVar;
        this.zzc = zzboVar;
    }

    public final boolean canRequestAds() {
        zzaq zzaqVar = this.zza;
        if (!zzaqVar.zzk()) {
            int iZza = !zzc() ? 0 : zzaqVar.zza();
            if (iZza != 1 && iZza != 3) {
                return false;
            }
        }
        return true;
    }

    public final int getConsentStatus() {
        if (zzc()) {
            return this.zza.zza();
        }
        return 0;
    }

    public final EnumC0963e getPrivacyOptionsRequirementStatus() {
        return !zzc() ? EnumC0963e.UNKNOWN : this.zza.zzb();
    }

    public final boolean isConsentFormAvailable() {
        return this.zzc.zzf();
    }

    public final void requestConsentInfoUpdate(Activity activity, C0964f c0964f, InterfaceC0962d interfaceC0962d, InterfaceC0961c interfaceC0961c) {
        synchronized (this.zzd) {
            this.zzf = true;
        }
        this.zzh = c0964f;
        this.zzb.zzc(activity, c0964f, interfaceC0962d, interfaceC0961c);
    }

    public final void reset() {
        this.zzc.zzd(null);
        this.zza.zze();
        synchronized (this.zzd) {
            this.zzf = false;
        }
    }

    public final void zza(Activity activity) {
        if (zzc() && !zzd()) {
            zzb(true);
            this.zzb.zzc(activity, this.zzh, new InterfaceC0962d() { // from class: com.google.android.gms.internal.consent_sdk.zzh
                @Override // p108N3.InterfaceC0962d
                public final void onConsentInfoUpdateSuccess() {
                    this.zza.zzb(false);
                }
            }, new InterfaceC0961c() { // from class: com.google.android.gms.internal.consent_sdk.zzi
                @Override // p108N3.InterfaceC0961c
                public final void onConsentInfoUpdateFailure(C0965g c0965g) {
                    this.zza.zzb(false);
                }
            });
            return;
        }
        Log.w("UserMessagingPlatform", "Retry request is not executed. consentInfoUpdateHasBeenCalled=" + zzc() + ", retryRequestIsInProgress=" + zzd());
    }

    public final void zzb(boolean z7) {
        synchronized (this.zze) {
            this.zzg = z7;
        }
    }

    public final boolean zzc() {
        boolean z7;
        synchronized (this.zzd) {
            z7 = this.zzf;
        }
        return z7;
    }

    public final boolean zzd() {
        boolean z7;
        synchronized (this.zze) {
            z7 = this.zzg;
        }
        return z7;
    }
}
