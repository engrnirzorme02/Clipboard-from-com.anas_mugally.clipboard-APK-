package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzflx {
    private final String zza;
    private final String zzb;

    private zzflx(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static zzflx zza(String str, String str2) {
        zzfnh.zzc(str, "Name is null or empty");
        zzfnh.zzc(str2, "Version is null or empty");
        return new zzflx(str, str2);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
