package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
final class zzbin implements zzbjl {
    zzbin() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcek zzcekVar = (zzcek) obj;
        try {
            zzftm.zzh(zzcekVar.getContext()).zzk();
            zzftn.zzh(zzcekVar.getContext()).zzj();
            zzfto.zza(zzcekVar.getContext()).zzb(null);
        } catch (IOException e7) {
            C7351t.m32354l().zzg(e7, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
