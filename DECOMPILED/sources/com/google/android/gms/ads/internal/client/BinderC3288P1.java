package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.internal.ads.zzbvx;
import com.google.android.gms.internal.ads.zzbvz;
import com.google.android.gms.internal.ads.zzbwd;
import com.google.android.gms.internal.ads.zzbwh;
import com.google.android.gms.internal.ads.zzbwi;
import com.google.android.gms.internal.ads.zzbwo;
import p404z2.AbstractC7599p;
import p404z2.C7590g;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.P1 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3288P1 extends zzbvz {
    /* JADX INFO: renamed from: L0 */
    private static void m17213L0(final zzbwh zzbwhVar) {
        AbstractC7599p.m33328c("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        C7590g.f30239b.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.O1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbwh zzbwhVar2 = zzbwhVar;
                if (zzbwhVar2 != null) {
                    try {
                        zzbwhVar2.zzf(1);
                    } catch (RemoteException e7) {
                        AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzb(InterfaceC3772a interfaceC3772a) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzc(C3349h2 c3349h2, zzbwh zzbwhVar) {
        m17213L0(zzbwhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzd(C3349h2 c3349h2, zzbwh zzbwhVar) {
        m17213L0(zzbwhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zze(zzbwd zzbwdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzf(InterfaceC3292R0 interfaceC3292R0) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzh(zzbwo zzbwoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final boolean zzi() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final String zzj() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzk(InterfaceC3772a interfaceC3772a, boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final zzbvx zzl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final InterfaceC3328c1 zzm() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final String zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzo(InterfaceC3301U0 interfaceC3301U0) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzp(boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final long zzq() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzr(long j7) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzs(zzbwi zzbwiVar) {
    }
}
