package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zztl {
    public static final /* synthetic */ int zza = 0;
    private static final HashMap zzb = new HashMap();

    public static zzst zza() {
        List listZzb = zzb("audio/raw", false, false);
        if (listZzb.isEmpty()) {
            return null;
        }
        return (zzst) listZzb.get(0);
    }

    public static synchronized List zzb(String str, boolean z7, boolean z8) {
        try {
            zztc zztcVar = new zztc(str, z7, z8);
            HashMap map = zzb;
            List list = (List) map.get(zztcVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListZzh = zzh(zztcVar, new zztg(z7, z8, str.equals("video/mv-hevc")));
            if (z7) {
                arrayListZzh.isEmpty();
            }
            if ("audio/raw".equals(str)) {
                zzj(arrayListZzh, zzth.zza);
            }
            if (Build.VERSION.SDK_INT < 32 && arrayListZzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzst) arrayListZzh.get(0)).zza)) {
                arrayListZzh.add((zzst) arrayListZzh.remove(0));
            }
            zzgjz zzgjzVarZzq = zzgjz.zzq(arrayListZzh);
            map.put(zztcVar, zzgjzVarZzq);
            return zzgjzVarZzq;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static List zzc(zztb zztbVar, zzu zzuVar, boolean z7, boolean z8) {
        List listZza = zztbVar.zza(zzuVar.zzo, z7, z8);
        List listZzd = zzd(zztbVar, zzuVar, z7, z8);
        int i7 = zzgjz.zzd;
        zzgjw zzgjwVar = new zzgjw();
        zzgjwVar.zzh(listZza);
        zzgjwVar.zzh(listZzd);
        return zzgjwVar.zzi();
    }

    public static List zzd(zztb zztbVar, zzu zzuVar, boolean z7, boolean z8) {
        String strZzg = zzg(zzuVar);
        return strZzg == null ? zzgjz.zzi() : zztbVar.zza(strZzg, z7, z8);
    }

    public static List zze(List list, final zzu zzuVar) {
        ArrayList arrayList = new ArrayList(list);
        zzj(arrayList, new zztk() { // from class: com.google.android.gms.internal.ads.zztj
            @Override // com.google.android.gms.internal.ads.zztk
            public final /* synthetic */ int zza(Object obj) {
                int i7 = zztl.zza;
                return ((zzst) obj).zzd(zzuVar) ? 1 : 0;
            }
        });
        return arrayList;
    }

    public static MediaCodecInfo.CodecProfileLevel zzf(int i7, int i8) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i7;
        codecProfileLevel.level = i8;
        return codecProfileLevel;
    }

    public static String zzg(zzu zzuVar) {
        Pair pairZze;
        String str = zzuVar.zzo;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (pairZze = zzdc.zze(zzuVar)) != null) {
            int iIntValue = ((Integer) pairZze.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0181  */
    /* JADX WARN: Code duplicated, block: B:101:0x0183 A[DONT_INVERT, PHI: r3
      0x0183: PHI (r3v7 boolean) = (r3v6 boolean), (r3v8 boolean) binds: [B:98:0x017d, B:100:0x0181] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x0185 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x01ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x0202 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c A[EDGE_INSN: B:38:0x009c->B:62:0x00f4 BREAK  A[LOOP:1: B:23:0x0066->B:27:0x0074]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0122  */
    /* JADX WARN: Code duplicated, block: B:75:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0126  */
    /* JADX WARN: Code duplicated, block: B:79:0x0130 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:128:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x013c A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:128:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0144  */
    /* JADX WARN: Code duplicated, block: B:86:0x0147  */
    /* JADX WARN: Code duplicated, block: B:89:0x0153 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:128:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0158 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:128:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0168 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:128:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x017b  */
    /* JADX WARN: Code duplicated, block: B:99:0x017f A[DONT_INVERT] */
    private static ArrayList zzh(zztc zztcVar, zzte zzteVar) throws zztd {
        String str;
        int i7;
        int i8;
        String str2;
        String str3;
        String str4;
        boolean zZzd;
        boolean z7;
        int i9;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        boolean zIsHardwareAccelerated;
        boolean zZzi;
        boolean z8;
        String strZza;
        boolean zIsVendor;
        zztc zztcVar2 = zztcVar;
        zzte zzteVar2 = zzteVar;
        String str5 = "secure-playback";
        String str6 = "tunneled-playback";
        try {
            ArrayList arrayList = new ArrayList();
            String str7 = zztcVar2.zza;
            int iZza = zzteVar2.zza();
            boolean zZzc = zzteVar2.zzc();
            int i10 = 0;
            while (i10 < iZza) {
                MediaCodecInfo mediaCodecInfoZzb = zzteVar2.zzb(i10);
                if (Build.VERSION.SDK_INT < 29 || !mediaCodecInfoZzb.isAlias()) {
                    int i11 = iZza;
                    String name = mediaCodecInfoZzb.getName();
                    if (mediaCodecInfoZzb.isEncoder() || (!zZzc && name.endsWith(".secure"))) {
                        str = str6;
                        i7 = i10;
                        i8 = i11;
                    } else {
                        String[] supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length) {
                                if (!str7.equals("video/dolby-vision")) {
                                    if (!str7.equals("video/mv-hevc")) {
                                        if (!str7.equals("audio/alac") || !"OMX.lge.alac.decoder".equals(name)) {
                                            if (!str7.equals("audio/flac") || !"OMX.lge.flac.decoder".equals(name)) {
                                                if (!str7.equals("audio/ac3") || !"OMX.lge.ac3.decoder".equals(name)) {
                                                    str2 = null;
                                                    break;
                                                }
                                                str2 = "audio/lg-ac3";
                                                break;
                                            }
                                            str2 = "audio/x-lg-flac";
                                            break;
                                        }
                                        str2 = "audio/x-lg-alac";
                                        break;
                                    }
                                    if (!"c2.qti.mvhevc.decoder".equals(name) && !"c2.qti.mvhevc.decoder.secure".equals(name)) {
                                        str2 = null;
                                        break;
                                    }
                                    str2 = "video/x-mvhevc";
                                    break;
                                }
                                if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    if (!"OMX.RTK.video.decoder".equals(name) && !"OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str2 = null;
                                        break;
                                    }
                                    str2 = "video/dv_hevc";
                                    break;
                                }
                                str2 = "video/hevcdv";
                                break;
                            }
                            int i13 = i12;
                            str2 = supportedTypes[i13];
                            if (str2.equalsIgnoreCase(str7)) {
                                break;
                            }
                            i12 = i13 + 1;
                        }
                        if (str2 != null) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str2);
                                boolean zZzd2 = zzteVar2.zzd(str6, str2, capabilitiesForType);
                                boolean zZze = zzteVar2.zze(str6, str2, capabilitiesForType);
                                str = str6;
                                if (zztcVar2.zzc) {
                                    if (zZzd2) {
                                        zZzd = zzteVar2.zzd(str5, str2, capabilitiesForType);
                                        boolean zZze2 = zzteVar2.zze(str5, str2, capabilitiesForType);
                                        z7 = zztcVar2.zzb;
                                        if (z7) {
                                            if (z7) {
                                                if (zZzd) {
                                                    zZzd = true;
                                                }
                                            }
                                            i9 = Build.VERSION.SDK_INT;
                                            str5 = str5;
                                            if (i9 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                codecCapabilities = capabilitiesForType;
                                            } else {
                                                codecCapabilities = capabilitiesForType;
                                                if (zzi(mediaCodecInfoZzb, str7)) {
                                                    zIsHardwareAccelerated = false;
                                                } else {
                                                    zIsHardwareAccelerated = true;
                                                }
                                            }
                                            zZzi = zzi(mediaCodecInfoZzb, str7);
                                            z8 = zIsHardwareAccelerated;
                                            if (i9 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzggj.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (!zZzc) {
                                                if (z7 != zZzd) {
                                                    zZzd = true;
                                                    if (zZzc) {
                                                    }
                                                    boolean z9 = zIsVendor;
                                                    i7 = i10;
                                                    i8 = i11;
                                                    MediaCodecInfo.CodecCapabilities codecCapabilities2 = codecCapabilities;
                                                    str3 = str2;
                                                    str4 = name;
                                                    if (!zZzc) {
                                                        continue;
                                                    }
                                                }
                                                boolean z10 = zIsVendor;
                                                i7 = i10;
                                                i8 = i11;
                                                str3 = str2;
                                                str4 = name;
                                                arrayList.add(zzst.zza(name, str7, str3, codecCapabilities, z8, zZzi, z10, false, false));
                                            } else {
                                                if (zZzc) {
                                                }
                                                boolean z11 = zIsVendor;
                                                i7 = i10;
                                                i8 = i11;
                                                MediaCodecInfo.CodecCapabilities codecCapabilities3 = codecCapabilities;
                                                str3 = str2;
                                                str4 = name;
                                                if (!zZzc) {
                                                    continue;
                                                }
                                            }
                                            StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 24 + str3.length() + 1);
                                            sb.append("Failed to query codec ");
                                            sb.append(str4);
                                            sb.append(" (");
                                            sb.append(str3);
                                            sb.append(")");
                                            zzds.zze("MediaCodecUtil", sb.toString());
                                            throw e;
                                        }
                                        if (z7) {
                                            if (zZzd) {
                                                zZzd = true;
                                            }
                                        }
                                        i9 = Build.VERSION.SDK_INT;
                                        str5 = str5;
                                        if (i9 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            codecCapabilities = capabilitiesForType;
                                        } else {
                                            codecCapabilities = capabilitiesForType;
                                            if (zzi(mediaCodecInfoZzb, str7)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                        }
                                        zZzi = zzi(mediaCodecInfoZzb, str7);
                                        z8 = zIsHardwareAccelerated;
                                        if (i9 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzggj.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (!zZzc) {
                                            if (zZzc) {
                                            }
                                            boolean z12 = zIsVendor;
                                            i7 = i10;
                                            i8 = i11;
                                            MediaCodecInfo.CodecCapabilities codecCapabilities4 = codecCapabilities;
                                            str3 = str2;
                                            str4 = name;
                                            if (!zZzc) {
                                                continue;
                                            }
                                        } else {
                                            if (z7 != zZzd) {
                                                zZzd = true;
                                                if (zZzc) {
                                                }
                                                boolean z13 = zIsVendor;
                                                i7 = i10;
                                                i8 = i11;
                                                MediaCodecInfo.CodecCapabilities codecCapabilities5 = codecCapabilities;
                                                str3 = str2;
                                                str4 = name;
                                                if (!zZzc) {
                                                    continue;
                                                }
                                            }
                                            boolean z14 = zIsVendor;
                                            i7 = i10;
                                            i8 = i11;
                                            str3 = str2;
                                            str4 = name;
                                            arrayList.add(zzst.zza(name, str7, str3, codecCapabilities, z8, zZzi, z14, false, false));
                                        }
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 24 + str3.length() + 1);
                                        sb2.append("Failed to query codec ");
                                        sb2.append(str4);
                                        sb2.append(" (");
                                        sb2.append(str3);
                                        sb2.append(")");
                                        zzds.zze("MediaCodecUtil", sb2.toString());
                                        throw e;
                                    }
                                } else if (!zZze) {
                                    zZzd = zzteVar2.zzd(str5, str2, capabilitiesForType);
                                    boolean zZze3 = zzteVar2.zze(str5, str2, capabilitiesForType);
                                    z7 = zztcVar2.zzb;
                                    if (z7 || !zZze3) {
                                        if (z7) {
                                            if (zZzd) {
                                                zZzd = true;
                                            }
                                        }
                                        i9 = Build.VERSION.SDK_INT;
                                        str5 = str5;
                                        if (i9 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            codecCapabilities = capabilitiesForType;
                                        } else {
                                            codecCapabilities = capabilitiesForType;
                                            if (zzi(mediaCodecInfoZzb, str7)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                        }
                                        zZzi = zzi(mediaCodecInfoZzb, str7);
                                        z8 = zIsHardwareAccelerated;
                                        if (i9 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzggj.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = true;
                                            }
                                        }
                                        if (!zZzc) {
                                            if (z7 != zZzd) {
                                                zZzd = true;
                                                if (zZzc) {
                                                }
                                                boolean z15 = zIsVendor;
                                                i7 = i10;
                                                i8 = i11;
                                                MediaCodecInfo.CodecCapabilities codecCapabilities6 = codecCapabilities;
                                                str3 = str2;
                                                str4 = name;
                                                if (!zZzc) {
                                                    continue;
                                                }
                                            }
                                            boolean z16 = zIsVendor;
                                            i7 = i10;
                                            i8 = i11;
                                            str3 = str2;
                                            str4 = name;
                                            arrayList.add(zzst.zza(name, str7, str3, codecCapabilities, z8, zZzi, z16, false, false));
                                        } else if (!zZzc || z7) {
                                            boolean z17 = zIsVendor;
                                            i7 = i10;
                                            i8 = i11;
                                            MediaCodecInfo.CodecCapabilities codecCapabilities7 = codecCapabilities;
                                            str3 = str2;
                                            str4 = name;
                                            if (!zZzc && zZzd) {
                                                StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 7);
                                                sb3.append(str4);
                                                sb3.append(".secure");
                                                arrayList.add(zzst.zza(sb3.toString(), str7, str3, codecCapabilities7, z8, zZzi, z17, false, true));
                                                return arrayList;
                                            }
                                        } else {
                                            boolean z18 = zIsVendor;
                                            i7 = i10;
                                            i8 = i11;
                                            str3 = str2;
                                            try {
                                                str4 = name;
                                                try {
                                                    arrayList.add(zzst.zza(name, str7, str3, codecCapabilities, z8, zZzi, z18, false, false));
                                                } catch (Exception e7) {
                                                    e = e7;
                                                }
                                            } catch (Exception e8) {
                                                e = e8;
                                                str4 = name;
                                                StringBuilder sb4 = new StringBuilder(String.valueOf(str4).length() + 24 + str3.length() + 1);
                                                sb4.append("Failed to query codec ");
                                                sb4.append(str4);
                                                sb4.append(" (");
                                                sb4.append(str3);
                                                sb4.append(")");
                                                zzds.zze("MediaCodecUtil", sb4.toString());
                                                throw e;
                                            }
                                        }
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(str4).length() + 24 + str3.length() + 1);
                                        sb5.append("Failed to query codec ");
                                        sb5.append(str4);
                                        sb5.append(" (");
                                        sb5.append(str3);
                                        sb5.append(")");
                                        zzds.zze("MediaCodecUtil", sb5.toString());
                                        throw e;
                                    }
                                }
                            } catch (Exception e9) {
                                e = e9;
                                str3 = str2;
                            }
                        } else {
                            str = str6;
                        }
                        i7 = i10;
                        i8 = i11;
                    }
                } else {
                    str5 = str5;
                    str = str6;
                    i8 = iZza;
                    i7 = i10;
                }
                i10 = i7 + 1;
                zzteVar2 = zzteVar;
                iZza = i8;
                str5 = str5;
                str6 = str;
                zztcVar2 = zztcVar;
            }
            return arrayList;
        } catch (Exception e10) {
            throw new zztd(e10, null);
        }
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzar.zza(str)) {
            return true;
        }
        String strZza = zzggj.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        if (strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.") || ((strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google."))) {
            return true;
        }
        return (strZza.startsWith("omx.") || strZza.startsWith("c2.")) ? false : true;
    }

    private static void zzj(List list, final zztk zztkVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzti
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                int i7 = zztl.zza;
                zztk zztkVar2 = zztkVar;
                return zztkVar2.zza(obj2) - zztkVar2.zza(obj);
            }
        });
    }
}
