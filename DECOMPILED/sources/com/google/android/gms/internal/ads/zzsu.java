package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzsu {
    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8, double d7) {
        List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        int iZzc = zzc(supportedPerformancePoints, AbstractC3852b1.m18316a(i7, i8, (int) d7));
        boolean z7 = true;
        if (iZzc == 1 && zzsv.zza == null) {
            if (Build.VERSION.SDK_INT >= 35) {
                z7 = false;
            } else {
                int iZzb = zzb(false);
                int iZzb2 = zzb(true);
                if (iZzb != 0 && (iZzb2 != 0 ? !(iZzb != 2 || iZzb2 != 2) : iZzb == 2)) {
                    z7 = false;
                }
            }
            zzsv.zza = Boolean.valueOf(z7);
            if (zzsv.zza.booleanValue()) {
                return 0;
            }
        }
        return iZzc;
    }

    private static int zzb(boolean z7) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List supportedPerformancePoints;
        try {
            zzs zzsVar = new zzs();
            zzsVar.zzm("video/avc");
            zzu zzuVarZzM = zzsVar.zzM();
            if (zzuVarZzM.zzo != null) {
                List listZzc = zztl.zzc(zztb.zzb, zzuVarZzM, z7, false);
                for (int i7 = 0; i7 < listZzc.size(); i7++) {
                    if (((zzst) listZzc.get(i7)).zzd != null && (videoCapabilities = ((zzst) listZzc.get(i7)).zzd.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        AbstractC3855c1.m18319a();
                        return zzc(supportedPerformancePoints, AbstractC3852b1.m18316a(1280, 720, 60));
                    }
                }
            }
        } catch (zztd unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (AbstractC3846Z0.m18310a(list.get(i7)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
