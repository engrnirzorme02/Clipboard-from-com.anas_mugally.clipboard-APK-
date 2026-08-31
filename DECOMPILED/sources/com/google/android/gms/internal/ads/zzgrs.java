package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgrs {
    public static final zzgrs zza = new zzgrs("SHA1");
    public static final zzgrs zzb = new zzgrs("SHA224");
    public static final zzgrs zzc = new zzgrs("SHA256");
    public static final zzgrs zzd = new zzgrs("SHA384");
    public static final zzgrs zze = new zzgrs("SHA512");
    private final String zzf;

    private zzgrs(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
