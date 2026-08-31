package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.List;
import java.util.Objects;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
final class zzdks implements zzgoq {
    final /* synthetic */ zzdku zza;

    zzdks(zzdku zzdkuVar) {
        Objects.requireNonNull(zzdkuVar);
        this.zza = zzdkuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfR)).booleanValue()) {
            C7351t.m32354l().zzg(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            zzcek zzcekVar = (zzcek) list.get(0);
            if (zzcekVar != null) {
                this.zza.zza(zzcekVar);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e7) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfR)).booleanValue()) {
                C7351t.m32354l().zzg(e7, "omid native display exp");
            }
        }
    }
}
