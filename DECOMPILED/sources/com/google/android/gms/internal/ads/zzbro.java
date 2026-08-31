package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Objects;
import p380w2.C7351t;
import p396y2.C7535w;

/* JADX INFO: loaded from: classes2.dex */
final class zzbro implements Runnable {
    final /* synthetic */ AdOverlayInfoParcel zza;
    final /* synthetic */ zzbrp zzb;

    zzbro(zzbrp zzbrpVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        Objects.requireNonNull(zzbrpVar);
        this.zzb = zzbrpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7351t.m32348f();
        C7535w.m33168a(this.zzb.zza(), this.zza, true, null);
    }
}
