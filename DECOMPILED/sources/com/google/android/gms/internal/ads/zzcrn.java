package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import p396y2.InterfaceC7536x;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcrn implements InterfaceC7536x {
    private final zzcwz zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzcrn(zzcwz zzcwzVar) {
        this.zza = zzcwzVar;
    }

    private final void zzm() {
        AtomicBoolean atomicBoolean = this.zzc;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.zza.zza();
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
        zzm();
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdY(int i7) {
        this.zzb.set(true);
        zzm();
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
        this.zza.zzc();
    }

    public final boolean zzl() {
        return this.zzb.get();
    }
}
