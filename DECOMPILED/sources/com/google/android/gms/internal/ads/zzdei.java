package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdei extends zzdbq implements zzbkd {
    public zzdei(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final synchronized void zza() {
        zzs(zzdeh.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zzb(final zzbvt zzbvtVar) {
        zzs(new zzdbp() { // from class: com.google.android.gms.internal.ads.zzdef
            @Override // com.google.android.gms.internal.ads.zzdbp
            public final /* synthetic */ void zza(Object obj) {
                ((zzbkd) obj).zzb(zzbvtVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zzc() {
        zzs(zzdeg.zza);
    }
}
