package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.InterfaceC3292R0;
import com.google.android.gms.ads.internal.client.InterfaceC3301U0;
import com.google.android.gms.ads.internal.client.InterfaceC3328c1;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfca extends zzbvz {
    private final zzfbw zza;
    private final zzfbn zzb;
    private final String zzc;
    private final zzfcv zzd;
    private final Context zze;
    private final C7584a zzf;
    private final zzauu zzg;
    private final zzdsm zzh;
    private zzdom zzi;
    private boolean zzj = ((Boolean) C3250D.m17200c().zzd(zzbci.zzaT)).booleanValue();

    public zzfca(String str, zzfbw zzfbwVar, Context context, zzfbn zzfbnVar, zzfcv zzfcvVar, C7584a c7584a, zzauu zzauuVar, zzdsm zzdsmVar) {
        this.zzc = str;
        this.zza = zzfbwVar;
        this.zzb = zzfbnVar;
        this.zzd = zzfcvVar;
        this.zze = context;
        this.zzf = c7584a;
        this.zzg = zzauuVar;
        this.zzh = zzdsmVar;
    }

    private final synchronized void zzx(C3349h2 c3349h2, zzbwh zzbwhVar, int i7) {
        try {
            if (!c3349h2.m17231U()) {
                boolean z7 = false;
                if (((Boolean) zzbeg.zzk.zze()).booleanValue()) {
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlX)).booleanValue()) {
                        z7 = true;
                    }
                }
                if (this.zzf.f30228c < ((Integer) C3250D.m17200c().zzd(zzbci.zzlY)).intValue() || !z7) {
                    AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
                }
            }
            zzfbn zzfbnVar = this.zzb;
            zzfbnVar.zzh(zzbwhVar);
            C7351t.m32349g();
            if (C3431F0.m17421l(this.zze) && c3349h2.f13939D == null) {
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33328c("Failed to load the ad because app ID is missing.");
                zzfbnVar.zzdN(zzfee.zzd(4, null, null));
                return;
            }
            if (this.zzi != null) {
                return;
            }
            zzfbp zzfbpVar = new zzfbp(null);
            zzfbw zzfbwVar = this.zza;
            zzfbwVar.zzj(i7);
            zzfbwVar.zza(c3349h2, this.zzc, zzfbpVar, new zzfbz(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzb(InterfaceC3772a interfaceC3772a) {
        zzk(interfaceC3772a, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzc(C3349h2 c3349h2, zzbwh zzbwhVar) {
        zzx(c3349h2, zzbwhVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzd(C3349h2 c3349h2, zzbwh zzbwhVar) {
        zzx(c3349h2, zzbwhVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zze(zzbwd zzbwdVar) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        this.zzb.zzi(zzbwdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzf(InterfaceC3292R0 interfaceC3292R0) {
        if (interfaceC3292R0 == null) {
            this.zzb.zzk(null);
        } else {
            this.zzb.zzk(new zzfby(this, interfaceC3292R0));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final Bundle zzg() {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        zzdom zzdomVar = this.zzi;
        return zzdomVar != null ? zzdomVar.zzg() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzh(zzbwo zzbwoVar) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        zzfcv zzfcvVar = this.zzd;
        zzfcvVar.zza = zzbwoVar.zza;
        zzfcvVar.zzb = zzbwoVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final boolean zzi() {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        zzdom zzdomVar = this.zzi;
        return (zzdomVar == null || zzdomVar.zzb()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized String zzj() {
        zzdom zzdomVar = this.zzi;
        if (zzdomVar == null || zzdomVar.zzn() == null) {
            return null;
        }
        return zzdomVar.zzn().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzk(InterfaceC3772a interfaceC3772a, boolean z7) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Rewarded can not be shown before loaded");
            this.zzb.zzj(zzfee.zzd(9, null, null));
        } else {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdg)).booleanValue()) {
                this.zzg.zzb().zzi(new Throwable().getStackTrace());
            }
            this.zzi.zza(z7, (Activity) BinderC3773b.m18220M0(interfaceC3772a));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final zzbvx zzl() {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        zzdom zzdomVar = this.zzi;
        if (zzdomVar != null) {
            return zzdomVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final InterfaceC3328c1 zzm() {
        zzdom zzdomVar;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhg)).booleanValue() && (zzdomVar = this.zzi) != null) {
            return zzdomVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final String zzn() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzo(InterfaceC3301U0 interfaceC3301U0) {
        AbstractC3718s.m18076e("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!interfaceC3301U0.zzf()) {
                this.zzh.zzb();
            }
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33327b("Error in making CSI ping for reporting paid event callback", e7);
        }
        this.zzb.zzl(interfaceC3301U0);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzp(boolean z7) {
        AbstractC3718s.m18076e("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z7;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized long zzq() {
        zzdom zzdomVar = this.zzi;
        if (zzdomVar == null || zzdomVar.zzo() == null) {
            return 0L;
        }
        return zzdomVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzr(long j7) {
        zzdom zzdomVar = this.zzi;
        if (zzdomVar == null || zzdomVar.zzo() == null) {
            return;
        }
        zzdomVar.zzo().zzb(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzs(zzbwi zzbwiVar) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzbwiVar);
    }

    final /* synthetic */ zzfcv zzu() {
        return this.zzd;
    }

    final /* synthetic */ zzdom zzv() {
        return this.zzi;
    }

    final /* synthetic */ void zzw(zzdom zzdomVar) {
        this.zzi = zzdomVar;
    }
}
