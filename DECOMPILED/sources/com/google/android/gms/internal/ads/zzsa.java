package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsa implements zzso {
    private final zzght zza;
    private final zzght zzb;

    public zzsa(final int i7) {
        zzght zzghtVar = new zzght() { // from class: com.google.android.gms.internal.ads.zzrz
            @Override // com.google.android.gms.internal.ads.zzght
            public final /* synthetic */ Object zza() {
                return new HandlerThread(zzsb.zzt(i7, "ExoPlayer:MediaCodecAsyncAdapter:"));
            }
        };
        zzght zzghtVar2 = new zzght() { // from class: com.google.android.gms.internal.ads.zzry
            @Override // com.google.android.gms.internal.ads.zzght
            public final /* synthetic */ Object zza() {
                return new HandlerThread(zzsb.zzt(i7, "ExoPlayer:MediaCodecQueueingThread:"));
            }
        };
        this.zza = zzghtVar;
        this.zzb = zzghtVar2;
    }

    public final zzsb zza(zzsn zzsnVar) throws Exception {
        Exception exc;
        MediaCodec mediaCodecCreateByCodecName;
        zzst zzstVar = zzsnVar.zza;
        String str = zzstVar.zza;
        zzsb zzsbVar = null;
        try {
            StringBuilder sb = new StringBuilder(str.length() + 12);
            sb.append("createCodec:");
            sb.append(str);
            Trace.beginSection(sb.toString());
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                zzsb zzsbVar2 = new zzsb(mediaCodecCreateByCodecName, (HandlerThread) this.zza.zza(), new zzse(mediaCodecCreateByCodecName, (HandlerThread) this.zzb.zza()), zzsnVar.zzf, null);
                try {
                    Trace.endSection();
                    Surface surface = zzsnVar.zzd;
                    int i7 = 0;
                    if (surface == null && zzstVar.zzh && Build.VERSION.SDK_INT >= 35) {
                        i7 = 8;
                    }
                    zzsbVar2.zzq(zzsnVar.zzb, surface, null, i7);
                    return zzsbVar2;
                } catch (Exception e7) {
                    exc = e7;
                    zzsbVar = zzsbVar2;
                    if (zzsbVar != null) {
                        zzsbVar.zzk();
                        throw exc;
                    }
                    if (mediaCodecCreateByCodecName == null) {
                        throw exc;
                    }
                    mediaCodecCreateByCodecName.release();
                    throw exc;
                }
            } catch (Exception e8) {
                exc = e8;
            }
        } catch (Exception e9) {
            exc = e9;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final /* bridge */ /* synthetic */ zzsq zzb(zzsn zzsnVar) {
        throw null;
    }
}
