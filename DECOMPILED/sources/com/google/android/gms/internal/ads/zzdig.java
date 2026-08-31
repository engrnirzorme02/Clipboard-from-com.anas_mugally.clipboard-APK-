package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Objects;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
final class zzdig implements zzgoq {
    final /* synthetic */ View zza;
    final /* synthetic */ zzdip zzb;

    zzdig(zzdip zzdipVar, View view) {
        this.zza = view;
        Objects.requireNonNull(zzdipVar);
        this.zzb = zzdipVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfR)).booleanValue()) {
            C7351t.m32354l().zzh(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zzY(this.zza, (zzedu) obj);
    }
}
