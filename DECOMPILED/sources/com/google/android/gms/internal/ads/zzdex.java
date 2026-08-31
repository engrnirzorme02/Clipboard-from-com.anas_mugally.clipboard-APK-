package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.InterfaceC3318a;
import java.util.concurrent.atomic.AtomicBoolean;
import p396y2.InterfaceC7536x;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdex implements InterfaceC7536x, InterfaceC3318a {
    private final zzdpu zza;
    private final zzfcm zzb;
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    zzdex(zzdpu zzdpuVar, zzfcm zzfcmVar) {
        this.zza = zzdpuVar;
        this.zzb = zzfcmVar;
    }

    private final void zzl() {
        if (this.zzc.getAndSet(true)) {
            return;
        }
        this.zza.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3318a
    public final void onAdClicked() {
        this.zza.zzc();
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdA() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdB() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdC() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdD() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdE() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdX() {
        zzl();
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdY(int i7) {
        zzl();
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdt() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdu() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdv() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzh() {
        this.zza.zzb(this.zzb.zzb);
    }
}
