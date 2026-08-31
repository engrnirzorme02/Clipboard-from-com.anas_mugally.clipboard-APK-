package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3393s2;

/* JADX INFO: loaded from: classes2.dex */
public final class zzent implements zzeun {
    private final C3393s2 zza;
    private final boolean zzb;

    public zzent(C3393s2 c3393s2, boolean z7) {
        this.zza = c3393s2;
        this.zzb = z7;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcuu) obj).zza;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfT)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzb);
        }
        C3393s2 c3393s2 = this.zza;
        if (c3393s2 != null) {
            int i7 = c3393s2.f14089a;
            if (i7 == 1) {
                bundle.putString("avo", "p");
            } else if (i7 == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
