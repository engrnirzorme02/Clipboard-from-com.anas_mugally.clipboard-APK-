package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;
import p380w2.InterfaceC7338g;

/* JADX INFO: loaded from: classes2.dex */
final class zzejl implements InterfaceC7338g {
    final /* synthetic */ zzbzm zza;
    final /* synthetic */ zzfcu zzb;
    final /* synthetic */ zzfcj zzc;
    final /* synthetic */ zzejs zzd;
    final /* synthetic */ zzejn zze;

    zzejl(zzejn zzejnVar, zzbzm zzbzmVar, zzfcu zzfcuVar, zzfcj zzfcjVar, zzejs zzejsVar) {
        this.zza = zzbzmVar;
        this.zzb = zzfcuVar;
        this.zzc = zzfcjVar;
        this.zzd = zzejsVar;
        Objects.requireNonNull(zzejnVar);
        this.zze = zzejnVar;
    }

    @Override // p380w2.InterfaceC7338g
    public final void zza(View view) {
        zzejs zzejsVar = this.zzd;
        this.zza.zzc(this.zze.zzd().zza(this.zzb, this.zzc, view, zzejsVar));
    }

    @Override // p380w2.InterfaceC7338g
    public final void zzb() {
    }

    @Override // p380w2.InterfaceC7338g
    public final void zzc() {
    }
}
