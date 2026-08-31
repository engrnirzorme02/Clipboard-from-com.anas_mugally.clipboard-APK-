package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class zzevc implements zzeun {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public zzevc(String str, int i7, int i8, int i9, boolean z7, int i10) {
        this.zza = str;
        this.zzb = i7;
        this.zzc = i8;
        this.zzd = i9;
        this.zze = z7;
        this.zzf = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcuu) obj).zza;
        String str = this.zza;
        zzfdr.zzb(bundle, "carrier", str, !TextUtils.isEmpty(str));
        int i7 = this.zzb;
        zzfdr.zzc(bundle, "cnt", i7, i7 != -2);
        bundle.putInt("gnt", this.zzc);
        bundle.putInt("pt", this.zzd);
        Bundle bundleZza = zzfdr.zza(bundle, "device");
        bundle.putBundle("device", bundleZza);
        Bundle bundleZza2 = zzfdr.zza(bundleZza, "network");
        bundleZza.putBundle("network", bundleZza2);
        bundleZza2.putInt("active_network_state", this.zzf);
        bundleZza2.putBoolean("active_network_metered", this.zze);
    }
}
