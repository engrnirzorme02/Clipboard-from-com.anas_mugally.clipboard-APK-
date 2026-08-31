package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: loaded from: classes2.dex */
final class zztg implements zzte {
    private final int zza;
    private MediaCodecInfo[] zzb;

    public zztg(boolean z7, boolean z8, boolean z9) {
        int i7 = 1;
        if (!z7 && !z8 && !z9) {
            i7 = 0;
        }
        this.zza = i7;
    }

    private final void zzf() {
        if (this.zzb == null) {
            this.zzb = new MediaCodecList(this.zza).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final int zza() {
        zzf();
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final MediaCodecInfo zzb(int i7) {
        zzf();
        return this.zzb[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final boolean zzc() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final boolean zze(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }
}
