package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbex {
    public static final zzbds zza = zzbds.zza("gads:trustless_token_for_decagon:enabled", true);
    public static final zzbds zzb;

    static {
        zzbds.zza("gads:invalidate_token_at_refresh_start", true);
        zzbds.zza("gms:expose_token_for_gma:enabled", true);
        zzbds.zza("gads:referesh_rate_limit", false);
        zzb = zzbds.zzb("gads:timeout_for_trustless_token:millis", 2000L);
        zzbds.zza("gads:token_anonymization:enabled", true);
        zzbds.zzb("gads:cached_token:ttl_millis", 10800000L);
    }
}
