package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.internal.ads.zzblr;
import com.google.android.gms.internal.ads.zzbox;
import java.util.Collections;
import java.util.List;
import p404z2.AbstractC7599p;
import p404z2.C7590g;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.M1 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3279M1 extends AbstractBinderC3245B0 {

    /* JADX INFO: renamed from: a */
    private zzblr f13898a;

    final /* synthetic */ void zzb() {
        zzblr zzblrVar = this.f13898a;
        if (zzblrVar != null) {
            try {
                zzblrVar.zzb(Collections.EMPTY_LIST);
            } catch (RemoteException e7) {
                AbstractC7599p.m33332g("Could not notify onComplete event.", e7);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zze() {
        AbstractC7599p.m33328c("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        C7590g.f30239b.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.L1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f13897a.zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzf(float f7) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzg(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzh(boolean z7) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzi(InterfaceC3772a interfaceC3772a, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzj(String str, InterfaceC3772a interfaceC3772a) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final float zzk() {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final boolean zzl() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final String zzm() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzn(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzo(zzbox zzboxVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzp(zzblr zzblrVar) {
        this.f13898a = zzblrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final List zzq() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzr(C3302U1 c3302u1) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzs() {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzt(InterfaceC3284O0 interfaceC3284O0) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzu(boolean z7) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzv(String str) {
    }
}
