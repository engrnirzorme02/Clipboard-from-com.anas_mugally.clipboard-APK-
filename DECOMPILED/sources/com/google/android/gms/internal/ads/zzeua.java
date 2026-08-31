package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeua implements zzeun {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final Long zze;

    public zzeua(String str, String str2, String str3, String str4, Long l7) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = l7;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcuu) obj).zza;
        zzfdr.zze(bundle, "gmp_app_id", this.zza);
        zzfdr.zze(bundle, "fbs_aiid", this.zzb);
        zzfdr.zze(bundle, "fbs_aeid", this.zzc);
        zzfdr.zze(bundle, "apm_id_origin", this.zzd);
        Long l7 = this.zze;
        if (l7 != null) {
            bundle.putLong("sai_timeout", l7.longValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfdr.zze(((zzcuu) obj).zzb, "fbs_aeid", this.zzc);
    }
}
