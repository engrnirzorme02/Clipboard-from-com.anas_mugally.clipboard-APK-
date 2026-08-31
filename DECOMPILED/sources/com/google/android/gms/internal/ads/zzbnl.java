package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzbnl implements zzbzo {
    final /* synthetic */ zzbnj zza;

    zzbnl(zzbno zzbnoVar, zzbnj zzbnjVar) {
        this.zza = zzbnjVar;
        Objects.requireNonNull(zzbnoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbzo
    public final void zza() {
        AbstractC3490o0.m17545k("Rejecting reference for JS Engine.");
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzij)).booleanValue()) {
            this.zza.zzh(new IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            this.zza.zzg();
        }
    }
}
