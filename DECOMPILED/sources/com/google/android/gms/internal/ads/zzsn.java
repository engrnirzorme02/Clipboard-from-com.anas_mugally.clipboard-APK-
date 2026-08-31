package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsn {
    public final zzst zza;
    public final MediaFormat zzb;
    public final zzu zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;
    public final zzsm zzf;

    private zzsn(zzst zzstVar, MediaFormat mediaFormat, zzu zzuVar, Surface surface, MediaCrypto mediaCrypto, zzsm zzsmVar) {
        this.zza = zzstVar;
        this.zzb = mediaFormat;
        this.zzc = zzuVar;
        this.zzd = surface;
        this.zzf = zzsmVar;
    }

    public static zzsn zza(zzst zzstVar, MediaFormat mediaFormat, zzu zzuVar, MediaCrypto mediaCrypto, zzsm zzsmVar) {
        return new zzsn(zzstVar, mediaFormat, zzuVar, null, null, zzsmVar);
    }

    public static zzsn zzb(zzst zzstVar, MediaFormat mediaFormat, zzu zzuVar, Surface surface, MediaCrypto mediaCrypto) {
        return new zzsn(zzstVar, mediaFormat, zzuVar, surface, null, null);
    }
}
