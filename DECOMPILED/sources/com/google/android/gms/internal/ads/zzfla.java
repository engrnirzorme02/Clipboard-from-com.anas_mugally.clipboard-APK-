package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.InterfaceC3750e;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzfla implements Runnable {
    final /* synthetic */ zzflb zza;

    zzfla(zzflb zzflbVar) {
        Objects.requireNonNull(zzflbVar);
        this.zza = zzflbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzflb zzflbVar = this.zza;
        if (zzflbVar.zzA() != null) {
            zzfkk zzfkkVarZzA = zzflbVar.zzA();
            InterfaceC3750e interfaceC3750eZzB = zzflbVar.zzB();
            zzfkkVarZzA.zzj(interfaceC3750eZzB.mo18159a(), zzflbVar.zzC(), zzflbVar.zze.f13904d, zzflbVar.zzz());
        }
    }
}
