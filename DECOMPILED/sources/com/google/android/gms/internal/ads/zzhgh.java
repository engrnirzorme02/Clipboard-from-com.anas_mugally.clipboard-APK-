package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhgh {
    private final zzhgg zza;

    private zzhgh(zzhgg zzhggVar) {
        this.zza = zzhggVar;
    }

    public static zzhgh zza(byte[] bArr, zzgqt zzgqtVar) {
        return new zzhgh(zzhgg.zza(bArr));
    }

    public static zzhgh zzb(int i7) {
        return new zzhgh(zzhgg.zza(zzgzm.zza(i7)));
    }

    public final byte[] zzc(zzgqt zzgqtVar) {
        return this.zza.zzc();
    }

    public final int zzd() {
        return this.zza.zzd();
    }
}
