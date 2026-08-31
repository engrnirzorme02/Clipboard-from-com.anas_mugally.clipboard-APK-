package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3250D;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeoo implements zzeun {
    public final int zza;
    public final boolean zzb;
    public final boolean zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final float zzi;
    public final boolean zzj;
    public final boolean zzk;

    public zzeoo(int i7, boolean z7, boolean z8, int i8, int i9, int i10, int i11, int i12, float f7, boolean z9, boolean z10) {
        this.zza = i7;
        this.zzb = z7;
        this.zzc = z8;
        this.zzd = i8;
        this.zze = i9;
        this.zzf = i10;
        this.zzg = i11;
        this.zzh = i12;
        this.zzi = f7;
        this.zzj = z9;
        this.zzk = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcuu) obj).zza;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlN)).booleanValue()) {
            bundle.putInt("muv_min", this.zze);
            bundle.putInt("muv_max", this.zzf);
        }
        bundle.putFloat("android_app_volume", this.zzi);
        bundle.putBoolean("android_app_muted", this.zzj);
        if (this.zzk) {
            return;
        }
        bundle.putInt("am", this.zza);
        bundle.putBoolean("ma", this.zzb);
        bundle.putBoolean("sp", this.zzc);
        bundle.putInt("muv", this.zzd);
        bundle.putInt("rm", this.zzg);
        bundle.putInt("riv", this.zzh);
    }
}
