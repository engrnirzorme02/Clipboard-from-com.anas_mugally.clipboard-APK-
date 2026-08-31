package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import p380w2.InterfaceC7338g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzejh implements InterfaceC7338g {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzcvq zzb;
    private final zzcwk zzc;
    private final zzdeb zzd;
    private final zzddt zze;
    private final zzcnf zzf;

    zzejh(zzcvq zzcvqVar, zzcwk zzcwkVar, zzdeb zzdebVar, zzddt zzddtVar, zzcnf zzcnfVar) {
        this.zzb = zzcvqVar;
        this.zzc = zzcwkVar;
        this.zzd = zzdebVar;
        this.zze = zzddtVar;
        this.zzf = zzcnfVar;
    }

    @Override // p380w2.InterfaceC7338g
    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzdw();
            this.zze.zza(view);
        }
    }

    @Override // p380w2.InterfaceC7338g
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // p380w2.InterfaceC7338g
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
