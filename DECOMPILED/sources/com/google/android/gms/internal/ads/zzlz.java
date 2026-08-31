package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
final class zzlz implements Handler.Callback, zzay {
    private final zzba zza;
    private final zzlx zzb;
    private final zzbc zzc = new zzbc();
    private final zzdl zzd;
    private final zzly zze;

    public zzlz(zzba zzbaVar, zzlx zzlxVar, zzdb zzdbVar, int i7) {
        this.zza = zzbaVar;
        this.zzb = zzlxVar;
        this.zzd = zzdbVar.zzd(zzbaVar.zzc(), this);
        this.zze = new zzly(this, i7);
        zzbaVar.zzd(this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        this.zze.zza();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zza(zzba zzbaVar, zzax zzaxVar) {
        this.zze.zza();
    }

    public final void zzv() {
        this.zzd.zzl(null);
        this.zza.zze(this);
    }

    final /* synthetic */ zzba zzw() {
        return this.zza;
    }

    final /* synthetic */ zzlx zzx() {
        return this.zzb;
    }

    final /* synthetic */ zzbc zzy() {
        return this.zzc;
    }

    final /* synthetic */ zzdl zzz() {
        return this.zzd;
    }
}
