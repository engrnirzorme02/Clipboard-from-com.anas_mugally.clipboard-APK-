package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzeen implements zzdgp {
    final /* synthetic */ zzeec zza;
    final /* synthetic */ zzfcj zzb;

    zzeen(zzeeo zzeeoVar, zzeec zzeecVar, zzfcj zzfcjVar) {
        this.zza = zzeecVar;
        this.zzb = zzfcjVar;
        Objects.requireNonNull(zzeeoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final void zza(boolean z7, Context context, zzcwf zzcwfVar) throws zzdgo {
        try {
            zzfea zzfeaVar = (zzfea) this.zza.zzb;
            zzfeaVar.zzs(z7);
            zzfeaVar.zzz(context);
        } catch (zzfdj e7) {
            throw new zzdgo(e7.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final zzfcj zzb() {
        return this.zzb;
    }
}
