package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzhia implements zzhjq {
    private static final zzhia zza = new zzhia();

    private zzhia() {
    }

    public static zzhia zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhjq
    public final boolean zzb(Class cls) {
        return zzhih.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzhjq
    public final zzhjp zzc(Class cls) {
        if (!zzhih.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzhjp) zzhih.zzbt(cls.asSubclass(zzhih.class)).zzbs();
        } catch (Exception e7) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
        }
    }
}
