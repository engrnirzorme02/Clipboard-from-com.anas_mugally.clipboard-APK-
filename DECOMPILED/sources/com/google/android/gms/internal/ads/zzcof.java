package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.InterfaceC3301U0;
import com.google.android.gms.ads.internal.client.InterfaceC3312Y;
import com.google.android.gms.ads.internal.client.InterfaceC3328c1;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcof extends zzbaa {
    private final zzcoe zza;
    private final InterfaceC3312Y zzb;
    private final zzeyj zzc;
    private boolean zzd = ((Boolean) C3250D.m17200c().zzd(zzbci.zzaW)).booleanValue();
    private final zzdsm zze;

    public zzcof(zzcoe zzcoeVar, InterfaceC3312Y interfaceC3312Y, zzeyj zzeyjVar, zzdsm zzdsmVar) {
        this.zza = zzcoeVar;
        this.zzb = interfaceC3312Y;
        this.zzc = zzeyjVar;
        this.zze = zzdsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final InterfaceC3312Y zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void zzf(InterfaceC3772a interfaceC3772a, zzbai zzbaiVar) {
        try {
            this.zzc.zzp(zzbaiVar);
            this.zza.zzb((Activity) BinderC3773b.m18220M0(interfaceC3772a), zzbaiVar, this.zzd);
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final InterfaceC3328c1 zzg() {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhg)).booleanValue()) {
            return this.zza.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void zzh(boolean z7) {
        this.zzd = z7;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void zzi(InterfaceC3301U0 interfaceC3301U0) {
        AbstractC3718s.m18076e("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!interfaceC3301U0.zzf()) {
                    this.zze.zzb();
                }
            } catch (RemoteException e7) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33327b("Error in making CSI ping for reporting paid event callback", e7);
            }
            this.zzc.zzr(interfaceC3301U0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final String zzj() {
        try {
            return this.zzb.zzu();
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final long zzk() {
        zzcoe zzcoeVar = this.zza;
        if (zzcoeVar == null || zzcoeVar.zzo() == null) {
            return 0L;
        }
        return zzcoeVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void zzl(long j7) {
        zzcoe zzcoeVar = this.zza;
        if (zzcoeVar == null || zzcoeVar.zzo() == null) {
            return;
        }
        zzcoeVar.zzo().zzb(j7);
    }
}
