package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhap {
    public static final zzhap zza = new zzhap("SHA1");
    public static final zzhap zzb = new zzhap("SHA224");
    public static final zzhap zzc = new zzhap("SHA256");
    public static final zzhap zzd = new zzhap("SHA384");
    public static final zzhap zze = new zzhap("SHA512");
    private final String zzf;

    private zzhap(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
