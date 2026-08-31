package com.google.android.gms.internal.ads;

import java.util.Set;
import p324p2.InterfaceC6738e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdaw extends zzdbq implements zzbid {
    public zzdaw(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbid
    public final synchronized void zzb(final String str, final String str2) {
        zzs(new zzdbp() { // from class: com.google.android.gms.internal.ads.zzdav
            @Override // com.google.android.gms.internal.ads.zzdbp
            public final /* synthetic */ void zza(Object obj) {
                ((InterfaceC6738e) obj).onAppEvent(str, str2);
            }
        });
    }
}
