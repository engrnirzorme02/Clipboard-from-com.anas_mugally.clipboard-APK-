package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbeg {
    public static final zzbds zza = zzbds.zza("gads:init:init_on_bg_thread", true);
    public static final zzbds zzb = zzbds.zza("gads:init:init_on_single_bg_thread", false);
    public static final zzbds zzc = zzbds.zza("gads:adloader_load_bg_thread", true);
    public static final zzbds zzd = zzbds.zza("gads:appopen_load_on_bg_thread", true);
    public static final zzbds zze = zzbds.zza("gads:banner_destroy_bg_thread", false);
    public static final zzbds zzf = zzbds.zza("gads:banner_load_bg_thread", true);
    public static final zzbds zzg = zzbds.zza("gads:banner_pause_bg_thread", false);
    public static final zzbds zzh = zzbds.zza("gads:banner_resume_bg_thread", false);
    public static final zzbds zzi = zzbds.zza("gads:interstitial_load_on_bg_thread", true);
    public static final zzbds zzj;
    public static final zzbds zzk;

    static {
        zzbds.zza("gads:persist_flags_on_bg_thread", true);
        zzj = zzbds.zza("gads:query_info_bg_thread", true);
        zzk = zzbds.zza("gads:rewarded_load_bg_thread", true);
    }
}
