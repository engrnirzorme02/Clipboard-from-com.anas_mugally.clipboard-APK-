package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeuy implements zzeun {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final boolean zze;
    public final boolean zzf;
    public final String zzg;
    public final String zzh;
    public final String zzi;
    public final ArrayList zzj;
    public final String zzk;
    public final String zzl;
    public final String zzm;
    public final boolean zzn;
    public final String zzo;
    public final long zzp;
    public final boolean zzq;
    public final String zzr;
    public final int zzs;
    public final String zzt;

    public zzeuy(boolean z7, boolean z8, String str, boolean z9, boolean z10, boolean z11, String str2, ArrayList arrayList, String str3, String str4, String str5, boolean z12, String str6, long j7, boolean z13, String str7, int i7, String str8, String str9, String str10) {
        this.zza = z7;
        this.zzb = z8;
        this.zzc = str;
        this.zzd = z9;
        this.zze = z10;
        this.zzf = z11;
        this.zzg = str2;
        this.zzh = str8;
        this.zzj = arrayList;
        this.zzk = str3;
        this.zzl = str4;
        this.zzm = str5;
        this.zzn = z12;
        this.zzo = str6;
        this.zzp = j7;
        this.zzq = z13;
        this.zzr = str7;
        this.zzs = i7;
        this.zzt = str10;
        this.zzi = str9;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0072  */
    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        String str;
        Bundle bundle = ((zzcuu) obj).zza;
        bundle.putBoolean("cog", this.zza);
        bundle.putBoolean("coh", this.zzb);
        bundle.putString("gl", this.zzc);
        bundle.putBoolean("simulator", this.zzd);
        bundle.putBoolean("is_latchsky", this.zze);
        bundle.putInt("build_api_level", this.zzs);
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzlQ)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.zzf);
        }
        bundle.putString("hl", this.zzg);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzog)).booleanValue()) {
            bundle.putString("dlc", this.zzh);
        } else if (((Boolean) C3250D.m17200c().zzd(zzbci.zzoh)).booleanValue()) {
            bundle.putString("dlc", this.zzh);
        }
        ArrayList<String> arrayList = this.zzj;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        String str2 = this.zzi;
        if (str2 != null) {
            bundle.putString("dgl", str2);
        }
        bundle.putString("mv", this.zzk);
        bundle.putString("submodel", this.zzo);
        Bundle bundleZza = zzfdr.zza(bundle, "device");
        bundle.putBundle("device", bundleZza);
        bundleZza.putString("build", this.zzm);
        bundleZza.putLong("remaining_data_partition_space", this.zzp);
        Bundle bundleZza2 = zzfdr.zza(bundleZza, "browser");
        bundleZza.putBundle("browser", bundleZza2);
        bundleZza2.putBoolean("is_browser_custom_tabs_capable", this.zzn);
        String str3 = this.zzl;
        if (!TextUtils.isEmpty(str3)) {
            Bundle bundleZza3 = zzfdr.zza(bundleZza, "play_store");
            bundleZza.putBundle("play_store", bundleZza3);
            bundleZza3.putString("package_version", str3);
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmg)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.zzq);
        }
        String str4 = this.zzr;
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("v_unity", str4);
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzma)).booleanValue()) {
            zzfdr.zzd(bundle, "gotmt_l", true, ((Boolean) C3250D.m17200c().zzd(zzbci.zzlX)).booleanValue());
            zzfdr.zzd(bundle, "gotmt_i", true, ((Boolean) C3250D.m17200c().zzd(zzbci.zzlW)).booleanValue());
        }
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzoM)).booleanValue() || (str = this.zzt) == null) {
            return;
        }
        bundle.putString("sdk_i_s", str);
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuu) obj).zzb;
        bundle.putBoolean("simulator", this.zzd);
        bundle.putInt("build_api_level", this.zzs);
        ArrayList<String> arrayList = this.zzj;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        bundle.putString("submodel", this.zzo);
    }
}
