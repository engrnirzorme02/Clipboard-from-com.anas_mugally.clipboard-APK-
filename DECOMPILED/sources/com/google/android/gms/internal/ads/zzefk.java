package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Objects;
import p380w2.C7351t;
import p396y2.C7535w;

/* JADX INFO: loaded from: classes2.dex */
final class zzefk implements zzdgp {
    final /* synthetic */ zzbzm zza;
    final /* synthetic */ zzfcj zzb;
    final /* synthetic */ zzefm zzc;

    zzefk(zzefm zzefmVar, zzbzm zzbzmVar, zzfcj zzfcjVar) {
        this.zza = zzbzmVar;
        this.zzb = zzfcjVar;
        Objects.requireNonNull(zzefmVar);
        this.zzc = zzefmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final void zza(boolean z7, Context context, zzcwf zzcwfVar) {
        try {
            C7351t.m32348f();
            C7535w.m33168a(context, (AdOverlayInfoParcel) this.zza.get(), true, this.zzc.zzd());
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final zzfcj zzb() {
        return this.zzb;
    }
}
