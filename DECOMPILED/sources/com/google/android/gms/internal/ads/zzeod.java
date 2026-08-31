package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeod implements zzeun {
    final String zza;
    final int zzb;

    public zzeod(String str, int i7) {
        this.zza = str;
        this.zzb = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i7;
        Bundle bundle = ((zzcuu) obj).zza;
        String str = this.zza;
        if (TextUtils.isEmpty(str) || (i7 = this.zzb) == -1) {
            return;
        }
        Bundle bundleZza = zzfdr.zza(bundle, "pii");
        bundle.putBundle("pii", bundleZza);
        bundleZza.putString("pvid", str);
        bundleZza.putInt("pvid_s", i7);
    }
}
