package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsi implements zzso {
    private final Context zza;

    @Deprecated
    public zzsi() {
        this.zza = null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    @Override // com.google.android.gms.internal.ads.zzso
    public final zzsq zzb(zzsn zzsnVar) throws Throwable {
        Context context;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31 || ((context = this.zza) != null && i7 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int iZzg = zzar.zzg(zzsnVar.zzc.zzo);
            zzds.zzb("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzeo.zzQ(iZzg)));
            return new zzsa(iZzg).zza(zzsnVar);
        }
        MediaCodec mediaCodec = null;
        try {
            zzst zzstVar = zzsnVar.zza;
            String str = zzstVar.zza;
            Trace.beginSection("createCodec:".concat(str));
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
            try {
                Trace.beginSection("configureCodec");
                Surface surface = zzsnVar.zzd;
                int i8 = 0;
                if (surface == null && zzstVar.zzh && i7 >= 35) {
                    i8 = 8;
                }
                mediaCodecCreateByCodecName.configure(zzsnVar.zzb, surface, (MediaCrypto) null, i8);
                Trace.endSection();
                Trace.beginSection("startCodec");
                mediaCodecCreateByCodecName.start();
                Trace.endSection();
                return new zztm(mediaCodecCreateByCodecName, zzsnVar.zzf, null);
            } catch (IOException e7) {
                e = e7;
                mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            } catch (RuntimeException e8) {
                e = e8;
                mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (IOException e9) {
            e = e9;
        } catch (RuntimeException e10) {
            e = e10;
        }
    }

    public zzsi(Context context, zzght zzghtVar, zzght zzghtVar2) {
        this.zza = context;
    }
}
