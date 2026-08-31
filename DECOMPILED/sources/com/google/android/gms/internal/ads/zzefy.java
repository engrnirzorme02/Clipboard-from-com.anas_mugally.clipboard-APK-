package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Objects;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzefy implements zzdgp {
    final /* synthetic */ zzeec zza;
    final /* synthetic */ zzfcj zzb;
    final /* synthetic */ zzefz zzc;

    zzefy(zzefz zzefzVar, zzeec zzeecVar, zzfcj zzfcjVar) {
        this.zza = zzeecVar;
        this.zzb = zzfcjVar;
        Objects.requireNonNull(zzefzVar);
        this.zzc = zzefzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final void zza(boolean z7, Context context, zzcwf zzcwfVar) throws zzdgo {
        try {
            zzfea zzfeaVar = (zzfea) this.zza.zzb;
            zzfeaVar.zzs(z7);
            if (this.zzc.zzc().f30228c < ((Integer) C3250D.m17200c().zzd(zzbci.zzaX)).intValue()) {
                zzfeaVar.zzd();
            } else {
                zzfeaVar.zze(context);
            }
        } catch (zzfdj e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33330e("Cannot show interstitial.");
            throw new zzdgo(e7.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final zzfcj zzb() {
        return this.zzb;
    }
}
