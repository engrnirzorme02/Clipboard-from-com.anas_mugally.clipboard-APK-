package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzetd implements zzeun {
    private final String zza;
    private final Integer zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    public zzetd(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.zza = str;
        this.zzb = num;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = str5;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcuu) obj).zza;
        zzfdr.zze(bundle, "pn", this.zza);
        zzfdr.zzh(bundle, "vc", this.zzb);
        zzfdr.zze(bundle, "vnm", this.zzc);
        zzfdr.zze(bundle, "dl", this.zzd);
        zzfdr.zze(bundle, "ins_pn", this.zze);
        zzfdr.zze(bundle, "ini_pn", this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuu) obj).zzb;
        zzfdr.zze(bundle, "pn", this.zza);
        zzfdr.zze(bundle, "dl", this.zzd);
    }
}
