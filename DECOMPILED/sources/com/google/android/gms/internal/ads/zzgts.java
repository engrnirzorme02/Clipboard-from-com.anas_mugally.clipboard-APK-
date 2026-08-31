package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgts {
    public static final zzgts zza = new zzgts("ASSUME_AES_GCM");
    public static final zzgts zzb = new zzgts("ASSUME_XCHACHA20POLY1305");
    public static final zzgts zzc = new zzgts("ASSUME_CHACHA20POLY1305");
    public static final zzgts zzd = new zzgts("ASSUME_AES_CTR_HMAC");
    public static final zzgts zze = new zzgts("ASSUME_AES_EAX");
    public static final zzgts zzf = new zzgts("ASSUME_AES_GCM_SIV");
    private final String zzg;

    private zzgts(String str) {
        this.zzg = str;
    }

    public final String toString() {
        return this.zzg;
    }
}
