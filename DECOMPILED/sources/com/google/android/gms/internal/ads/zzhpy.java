package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhpy implements zzhpx, zzhpr {
    private static final zzhpy zza = new zzhpy(null);
    private final Object zzb;

    private zzhpy(Object obj) {
        this.zzb = obj;
    }

    public static zzhpx zza(Object obj) {
        zzhqf.zza(obj, "instance cannot be null");
        return new zzhpy(obj);
    }

    public static zzhpx zzc(Object obj) {
        return obj == null ? zza : new zzhpy(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final Object zzb() {
        return this.zzb;
    }
}
