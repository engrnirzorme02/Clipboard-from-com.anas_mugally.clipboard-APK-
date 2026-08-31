package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzst {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;
    private int zzj;
    private int zzk;
    private float zzl;

    zzst(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z7;
        this.zze = z10;
        this.zzf = z12;
        this.zzh = z13;
        this.zzi = zzar.zzb(str2);
        this.zzl = -3.4028235E38f;
        this.zzj = -1;
        this.zzk = -1;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    public static zzst zza(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        boolean z14 = codecCapabilities != null && codecCapabilities.isFeatureSupported("tunneled-playback");
        boolean z15 = z11 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z12 = false;
        } else {
            String str4 = Build.MANUFACTURER;
            if (str4.equals("Xiaomi") || str4.equals("OPPO") || str4.equals("realme") || str4.equals("motorola") || str4.equals("LENOVO")) {
                z12 = false;
            } else {
                z12 = true;
            }
        }
        return new zzst(str, str2, str3, codecCapabilities, z7, z8, z9, z13, z14, z15, z12);
    }

    private final boolean zzj(zzu zzuVar) {
        String str = this.zzb;
        return str.equals(zzuVar.zzo) || str.equals(zztl.zzg(zzuVar));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x009f  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4 A[PHI: r5
      0x00b4: PHI (r5v4 int) = (r5v3 int), (r5v3 int), (r5v5 int) binds: [B:42:0x00a5, B:44:0x00ad, B:47:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0108  */
    /* JADX WARN: Code duplicated, block: B:64:0x010e  */
    /* JADX WARN: Code duplicated, block: B:82:0x012e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private final boolean zzk(zzu zzuVar, boolean z7) {
        int iIntValue;
        int iIntValue2;
        int i7;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzb;
        String str;
        int length;
        int i8;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        String str2;
        int iHashCode;
        int i9 = zztl.zza;
        Pair pairZze = zzdc.zze(zzuVar);
        String str3 = zzuVar.zzo;
        byte b7 = -1;
        if (str3 != null && str3.equals("video/mv-hevc")) {
            String strZzi = zzar.zzi(this.zzc);
            if (!strZzi.equals("video/mv-hevc")) {
                if (strZzi.equals("video/hevc")) {
                    String strZzj = zzfl.zzj(zzuVar.zzr);
                    if (strZzj == null) {
                        pairZze = null;
                    } else {
                        String strTrim = strZzj.trim();
                        String str4 = zzeo.zza;
                        pairZze = zzdc.zzf(strZzj, strTrim.split("\\.", -1), zzuVar.zzE);
                    }
                }
                if (pairZze != null) {
                    iIntValue = ((Integer) pairZze.first).intValue();
                    iIntValue2 = ((Integer) pairZze.second).intValue();
                    i7 = 8;
                    if ("video/dolby-vision".equals(str3)) {
                        str2 = this.zzb;
                        iHashCode = str2.hashCode();
                        if (iHashCode != -1662735862) {
                            if (iHashCode != -1662541442) {
                                if (iHashCode == 1331836730) {
                                    b7 = 0;
                                }
                            } else if (str2.equals("video/hevc")) {
                                b7 = 1;
                            }
                        } else if (str2.equals("video/av01")) {
                            b7 = 2;
                        }
                        if (b7 == 0) {
                            if (b7 != 1) {
                            }
                            iIntValue = 2;
                        } else {
                            iIntValue = 8;
                        }
                        iIntValue2 = 0;
                    }
                    if (this.zzi) {
                        codecProfileLevelArrZzb = zzb();
                        str = this.zzb;
                        if (str.equals("audio/ac4")) {
                            codecCapabilities = this.zzd;
                            if (codecCapabilities != null) {
                                i7 = 16;
                            }
                            codecProfileLevelArrZzb = new MediaCodecInfo.CodecProfileLevel[]{zztl.zzf(257, i7), zztl.zzf(513, i7), zztl.zzf(514, i7), zztl.zzf(1026, i7), zztl.zzf(1028, i7)};
                        }
                        length = codecProfileLevelArrZzb.length;
                        for (i8 = 0; i8 < length; i8++) {
                            codecProfileLevel = codecProfileLevelArrZzb[i8];
                            if (codecProfileLevel.profile != iIntValue) {
                            }
                        }
                        String str5 = zzuVar.zzk;
                        String str6 = this.zzc;
                        StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 22 + str6.length());
                        sb.append("codec.profileLevel, ");
                        sb.append(str5);
                        sb.append(", ");
                        sb.append(str6);
                        zzm(sb.toString());
                        return false;
                    }
                    codecProfileLevelArrZzb = zzb();
                    str = this.zzb;
                    if (str.equals("audio/ac4")) {
                        codecCapabilities = this.zzd;
                        if (codecCapabilities != null) {
                            i7 = 16;
                        }
                        codecProfileLevelArrZzb = new MediaCodecInfo.CodecProfileLevel[]{zztl.zzf(257, i7), zztl.zzf(513, i7), zztl.zzf(514, i7), zztl.zzf(1026, i7), zztl.zzf(1028, i7)};
                    }
                    length = codecProfileLevelArrZzb.length;
                    while (i8 < length) {
                        codecProfileLevel = codecProfileLevelArrZzb[i8];
                        if (codecProfileLevel.profile != iIntValue) {
                        }
                    }
                    String str7 = zzuVar.zzk;
                    String str8 = this.zzc;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str7).length() + 22 + str8.length());
                    sb2.append("codec.profileLevel, ");
                    sb2.append(str7);
                    sb2.append(", ");
                    sb2.append(str8);
                    zzm(sb2.toString());
                    return false;
                }
            }
        } else if (pairZze != null) {
            iIntValue = ((Integer) pairZze.first).intValue();
            iIntValue2 = ((Integer) pairZze.second).intValue();
            i7 = 8;
            if ("video/dolby-vision".equals(str3)) {
                str2 = this.zzb;
                iHashCode = str2.hashCode();
                if (iHashCode != -1662735862) {
                    if (iHashCode != -1662541442) {
                        if (iHashCode == 1331836730 && str2.equals("video/avc")) {
                            b7 = 0;
                        }
                    } else if (str2.equals("video/hevc")) {
                        b7 = 1;
                    }
                } else if (str2.equals("video/av01")) {
                    b7 = 2;
                }
                if (b7 == 0) {
                    iIntValue = 8;
                } else if (b7 != 1 || b7 == 2) {
                    iIntValue = 2;
                }
                iIntValue2 = 0;
            }
            if (this.zzi || this.zzb.equals("audio/ac4")) {
                codecProfileLevelArrZzb = zzb();
                str = this.zzb;
                if (str.equals("audio/ac4") && codecProfileLevelArrZzb.length == 0) {
                    codecCapabilities = this.zzd;
                    if (codecCapabilities != null && (audioCapabilities = codecCapabilities.getAudioCapabilities()) != null && audioCapabilities.getMaxInputChannelCount() > 18) {
                        i7 = 16;
                    }
                    codecProfileLevelArrZzb = new MediaCodecInfo.CodecProfileLevel[]{zztl.zzf(257, i7), zztl.zzf(513, i7), zztl.zzf(514, i7), zztl.zzf(1026, i7), zztl.zzf(1028, i7)};
                }
                length = codecProfileLevelArrZzb.length;
                while (i8 < length) {
                    codecProfileLevel = codecProfileLevelArrZzb[i8];
                    if (codecProfileLevel.profile != iIntValue && (codecProfileLevel.level >= iIntValue2 || !z7)) {
                        if ("video/hevc".equals(str) && iIntValue == 2) {
                            String str9 = Build.DEVICE;
                            if ("sailfish".equals(str9) || "marlin".equals(str9)) {
                            }
                        }
                    }
                }
                String str10 = zzuVar.zzk;
                String str11 = this.zzc;
                StringBuilder sb3 = new StringBuilder(String.valueOf(str10).length() + 22 + str11.length());
                sb3.append("codec.profileLevel, ");
                sb3.append(str10);
                sb3.append(", ");
                sb3.append(str11);
                zzm(sb3.toString());
                return false;
            }
            if (iIntValue == 42) {
                iIntValue = 42;
                codecProfileLevelArrZzb = zzb();
                str = this.zzb;
                if (str.equals("audio/ac4")) {
                    codecCapabilities = this.zzd;
                    if (codecCapabilities != null) {
                        i7 = 16;
                    }
                    codecProfileLevelArrZzb = new MediaCodecInfo.CodecProfileLevel[]{zztl.zzf(257, i7), zztl.zzf(513, i7), zztl.zzf(514, i7), zztl.zzf(1026, i7), zztl.zzf(1028, i7)};
                }
                length = codecProfileLevelArrZzb.length;
                while (i8 < length) {
                    codecProfileLevel = codecProfileLevelArrZzb[i8];
                    if (codecProfileLevel.profile != iIntValue) {
                    }
                }
                String str12 = zzuVar.zzk;
                String str13 = this.zzc;
                StringBuilder sb4 = new StringBuilder(String.valueOf(str12).length() + 22 + str13.length());
                sb4.append("codec.profileLevel, ");
                sb4.append(str12);
                sb4.append(", ");
                sb4.append(str13);
                zzm(sb4.toString());
                return false;
            }
        }
        return true;
    }

    private final boolean zzl(zzu zzuVar) {
        return (Objects.equals(zzuVar.zzo, "audio/flac") && zzuVar.zzI == 22 && Build.VERSION.SDK_INT < 34 && this.zza.equals("c2.android.flac.decoder")) ? false : true;
    }

    private final void zzm(String str) {
        String str2 = zzeo.zza;
        String str3 = this.zzb;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length();
        String str4 = this.zza;
        StringBuilder sb = new StringBuilder(length3 + 14 + str4.length() + 2 + length + 3 + length2 + 1);
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str4);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str2);
        sb.append("]");
        zzds.zza("MediaCodecInfo", sb.toString());
    }

    private static boolean zzn(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8, double d7) {
        Point pointZzo = zzo(videoCapabilities, i7, i8);
        int i9 = pointZzo.x;
        int i10 = pointZzo.y;
        if (d7 == -1.0d || d7 < 1.0d) {
            return videoCapabilities.isSizeSupported(i9, i10);
        }
        double dFloor = Math.floor(d7);
        if (!videoCapabilities.areSizeAndRateSupported(i9, i10, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i9, i10);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    private static Point zzo(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = zzeo.zza;
        return new Point((((i7 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i8 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final String toString() {
        return this.zza;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzb() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final boolean zzc(zzu zzuVar) {
        int i7;
        int i8;
        if (!zzj(zzuVar) || !zzk(zzuVar, true) || !zzl(zzuVar)) {
            return false;
        }
        if (this.zzi) {
            int i9 = zzuVar.zzv;
            if (i9 <= 0 || (i8 = zzuVar.zzw) <= 0) {
                return true;
            }
            return zzg(i9, i8, zzuVar.zzz);
        }
        int i10 = zzuVar.zzH;
        if (i10 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzm("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzm("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i10)) {
                StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 20);
                sb.append("sampleRate.support, ");
                sb.append(i10);
                zzm(sb.toString());
                return false;
            }
        }
        int i11 = zzuVar.zzG;
        if (i11 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
            if (codecCapabilities2 == null) {
                zzm("channelCount.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                zzm("channelCount.aCaps");
                return false;
            }
            String str = this.zza;
            String str2 = this.zzb;
            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
            if (maxInputChannelCount <= 1 && maxInputChannelCount <= 0 && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2)) {
                if ("audio/ac3".equals(str2)) {
                    i7 = 6;
                } else {
                    i7 = "audio/eac3".equals(str2) ? 16 : 30;
                }
                StringBuilder sb2 = new StringBuilder(str.length() + 32 + String.valueOf(maxInputChannelCount).length() + 4 + String.valueOf(i7).length() + 1);
                sb2.append("AssumedMaxChannelAdjustment: ");
                sb2.append(str);
                sb2.append(", [");
                sb2.append(maxInputChannelCount);
                sb2.append(" to ");
                sb2.append(i7);
                sb2.append("]");
                zzds.zzc("MediaCodecInfo", sb2.toString());
                maxInputChannelCount = i7;
            }
            if (maxInputChannelCount < i11) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + 22);
                sb3.append("channelCount.support, ");
                sb3.append(i11);
                zzm(sb3.toString());
                return false;
            }
        }
        return true;
    }

    public final boolean zzd(zzu zzuVar) {
        return zzj(zzuVar) && zzk(zzuVar, false) && zzl(zzuVar);
    }

    public final boolean zze(zzu zzuVar) {
        if (this.zzi) {
            return this.zze;
        }
        int i7 = zztl.zza;
        Pair pairZze = zzdc.zze(zzuVar);
        return pairZze != null && ((Integer) pairZze.first).intValue() == 42;
    }

    public final zzhs zzf(zzu zzuVar, zzu zzuVar2) {
        zzu zzuVar3;
        zzu zzuVar4;
        int i7;
        int i8 = true != Objects.equals(zzuVar.zzo, zzuVar2.zzo) ? 8 : 0;
        if (this.zzi) {
            if (zzuVar.zzA != zzuVar2.zzA) {
                i8 |= 1024;
            }
            boolean z7 = (zzuVar.zzv == zzuVar2.zzv && zzuVar.zzw == zzuVar2.zzw) ? false : true;
            if (!this.zze && z7) {
                i8 |= 512;
            }
            zzh zzhVar = zzuVar.zzE;
            if ((!zzh.zza(zzhVar) || !zzh.zza(zzuVar2.zzE)) && !Objects.equals(zzhVar, zzuVar2.zzE)) {
                i8 |= 2048;
            }
            String str = this.zza;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzuVar.zzd(zzuVar2)) {
                i8 |= 2;
            }
            int i9 = zzuVar.zzx;
            if (i9 != -1 && (i7 = zzuVar.zzy) != -1 && i9 == zzuVar2.zzx && i7 == zzuVar2.zzy && z7) {
                i8 |= 2;
            }
            if (i8 == 0) {
                return new zzhs(str, zzuVar, zzuVar2, true == zzuVar.zzd(zzuVar2) ? 3 : 2, 0);
            }
            zzuVar3 = zzuVar;
            zzuVar4 = zzuVar2;
        } else {
            zzuVar3 = zzuVar;
            zzuVar4 = zzuVar2;
            if (zzuVar3.zzG != zzuVar4.zzG) {
                i8 |= 4096;
            }
            if (zzuVar3.zzH != zzuVar4.zzH) {
                i8 |= 8192;
            }
            if (zzuVar3.zzI != zzuVar4.zzI) {
                i8 |= 16384;
            }
            if (i8 == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                int i10 = zztl.zza;
                Pair pairZze = zzdc.zze(zzuVar3);
                Pair pairZze2 = zzdc.zze(zzuVar4);
                if (pairZze != null && pairZze2 != null) {
                    int iIntValue = ((Integer) pairZze.first).intValue();
                    int iIntValue2 = ((Integer) pairZze2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new zzhs(this.zza, zzuVar3, zzuVar4, 3, 0);
                    }
                }
            }
            if (!zzuVar3.zzd(zzuVar4)) {
                i8 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i8 |= 2;
            }
            if (i8 == 0) {
                return new zzhs(this.zza, zzuVar3, zzuVar4, 1, 0);
            }
        }
        return new zzhs(this.zza, zzuVar3, zzuVar4, 0, i8);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    public final boolean zzg(int i7, int i8, double d7) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzm("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzm("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int iZza = zzsv.zza(videoCapabilities, i7, i8, d7);
            if (iZza != 2) {
                if (iZza == 1) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 20 + String.valueOf(i8).length() + 1 + String.valueOf(d7).length());
                    sb.append("sizeAndRate.cover, ");
                    sb.append(i7);
                    sb.append("x");
                    sb.append(i8);
                    sb.append("@");
                    sb.append(d7);
                    zzm(sb.toString());
                    return false;
                }
                if (!zzn(videoCapabilities, i7, i8, d7)) {
                    if (i7 < i8) {
                        str = this.zza;
                        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 22 + String.valueOf(i8).length() + 1 + String.valueOf(d7).length());
                            sb2.append("sizeAndRate.rotated, ");
                            sb2.append(i7);
                            sb2.append("x");
                            sb2.append(i8);
                            sb2.append("@");
                            sb2.append(d7);
                            String string = sb2.toString();
                            String str2 = this.zzb;
                            int length = str.length();
                            String str3 = zzeo.zza;
                            int length2 = String.valueOf(str2).length();
                            StringBuilder sb3 = new StringBuilder(string.length() + 19 + length + 2 + length2 + 3 + String.valueOf(str3).length() + 1);
                            sb3.append("AssumedSupport [");
                            sb3.append(string);
                            sb3.append("] [");
                            sb3.append(str);
                            sb3.append(", ");
                            sb3.append(str2);
                            sb3.append("] [");
                            sb3.append(str3);
                            sb3.append("]");
                            zzds.zza("MediaCodecInfo", sb3.toString());
                        } else {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(i7).length() + 22 + String.valueOf(i8).length() + 1 + String.valueOf(d7).length());
                            sb4.append("sizeAndRate.rotated, ");
                            sb4.append(i7);
                            sb4.append("x");
                            sb4.append(i8);
                            sb4.append("@");
                            sb4.append(d7);
                            String string2 = sb4.toString();
                            String str4 = this.zzb;
                            int length3 = str.length();
                            String str5 = zzeo.zza;
                            int length4 = String.valueOf(str4).length();
                            StringBuilder sb5 = new StringBuilder(string2.length() + 19 + length3 + 2 + length4 + 3 + String.valueOf(str5).length() + 1);
                            sb5.append("AssumedSupport [");
                            sb5.append(string2);
                            sb5.append("] [");
                            sb5.append(str);
                            sb5.append(", ");
                            sb5.append(str4);
                            sb5.append("] [");
                            sb5.append(str5);
                            sb5.append("]");
                            zzds.zza("MediaCodecInfo", sb5.toString());
                        }
                    }
                    StringBuilder sb6 = new StringBuilder(String.valueOf(i7).length() + 22 + String.valueOf(i8).length() + 1 + String.valueOf(d7).length());
                    sb6.append("sizeAndRate.support, ");
                    sb6.append(i7);
                    sb6.append("x");
                    sb6.append(i8);
                    sb6.append("@");
                    sb6.append(d7);
                    zzm(sb6.toString());
                    return false;
                }
            }
        } else if (!zzn(videoCapabilities, i7, i8, d7)) {
            if (i7 < i8) {
                str = this.zza;
                if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && zzn(videoCapabilities, i8, i7, d7)) {
                    StringBuilder sb7 = new StringBuilder(String.valueOf(i7).length() + 22 + String.valueOf(i8).length() + 1 + String.valueOf(d7).length());
                    sb7.append("sizeAndRate.rotated, ");
                    sb7.append(i7);
                    sb7.append("x");
                    sb7.append(i8);
                    sb7.append("@");
                    sb7.append(d7);
                    String string3 = sb7.toString();
                    String str6 = this.zzb;
                    int length5 = str.length();
                    String str7 = zzeo.zza;
                    int length6 = String.valueOf(str6).length();
                    StringBuilder sb8 = new StringBuilder(string3.length() + 19 + length5 + 2 + length6 + 3 + String.valueOf(str7).length() + 1);
                    sb8.append("AssumedSupport [");
                    sb8.append(string3);
                    sb8.append("] [");
                    sb8.append(str);
                    sb8.append(", ");
                    sb8.append(str6);
                    sb8.append("] [");
                    sb8.append(str7);
                    sb8.append("]");
                    zzds.zza("MediaCodecInfo", sb8.toString());
                }
            }
            StringBuilder sb9 = new StringBuilder(String.valueOf(i7).length() + 22 + String.valueOf(i8).length() + 1 + String.valueOf(d7).length());
            sb9.append("sizeAndRate.support, ");
            sb9.append(i7);
            sb9.append("x");
            sb9.append(i8);
            sb9.append("@");
            sb9.append(d7);
            zzm(sb9.toString());
            return false;
        }
        return true;
    }

    public final float zzh(int i7, int i8) {
        if (!this.zzi) {
            return -3.4028235E38f;
        }
        float f7 = this.zzl;
        if (f7 != -3.4028235E38f && this.zzj == i7 && this.zzk == i8) {
            return f7;
        }
        float f8 = 1024.0f;
        if (!zzg(i7, i8, 1024.0d)) {
            float f9 = 0.0f;
            while (true) {
                float f10 = f8 - f9;
                if (Math.abs(f10) <= 5.0f) {
                    break;
                }
                float f11 = (f10 / 2.0f) + f9;
                boolean zZzg = zzg(i7, i8, f11);
                if (true == zZzg) {
                    f9 = f11;
                }
                if (true != zZzg) {
                    f8 = f11;
                }
            }
            f8 = f9;
        }
        this.zzl = f8;
        this.zzj = i7;
        this.zzk = i8;
        return f8;
    }

    public final Point zzi(int i7, int i8) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzo(videoCapabilities, i7, i8);
    }
}
