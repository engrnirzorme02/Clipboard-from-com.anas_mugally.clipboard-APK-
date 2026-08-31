package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;
import p380w2.InterfaceC7338g;

/* JADX INFO: loaded from: classes2.dex */
final class zzejv implements InterfaceC7338g {
    final /* synthetic */ zzdfb zza;

    zzejv(zzejw zzejwVar, zzdfb zzdfbVar) {
        this.zza = zzdfbVar;
        Objects.requireNonNull(zzejwVar);
    }

    @Override // p380w2.InterfaceC7338g
    public final void zza(View view) {
    }

    @Override // p380w2.InterfaceC7338g
    public final void zzb() {
        this.zza.zzc().onAdClicked();
    }

    @Override // p380w2.InterfaceC7338g
    public final void zzc() {
        zzdfb zzdfbVar = this.zza;
        zzdfbVar.zzd().zza();
        zzdfbVar.zze().zza();
    }
}
