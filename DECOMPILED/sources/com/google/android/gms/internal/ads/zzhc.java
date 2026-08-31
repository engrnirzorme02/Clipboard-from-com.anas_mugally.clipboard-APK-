package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes2.dex */
final class zzhc {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    final /* synthetic */ void zza(int i7, int i8) {
        MediaCodec.CryptoInfo.Pattern pattern = this.zzb;
        pattern.set(i7, i8);
        this.zza.setPattern(pattern);
    }
}
