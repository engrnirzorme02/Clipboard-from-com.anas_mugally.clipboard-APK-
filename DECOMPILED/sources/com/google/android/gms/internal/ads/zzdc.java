package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdc {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", "A", "B", "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    public static String zza(byte[] bArr) {
        zzef zzefVar = new zzef(bArr);
        if (!zzh(zzefVar, 31)) {
            return null;
        }
        zzefVar.zzk(4);
        int iZzs = zzefVar.zzs();
        int iZzs2 = zzefVar.zzs();
        if (!zzh(zzefVar, 0)) {
            return null;
        }
        zzefVar.zzQ();
        String strZzK = zzefVar.zzK(4, StandardCharsets.UTF_8);
        if (strZzK.equals("mp4a")) {
            zzefVar.zzQ();
            zzefVar.zzk(2);
            zzee zzeeVar = new zzee();
            zzeeVar.zza(zzefVar);
            int iZzj = zzeeVar.zzj(5);
            if (iZzj == 31) {
                iZzj = zzeeVar.zzj(6) + 32;
            }
            StringBuilder sb = new StringBuilder(strZzK.length() + 4 + String.valueOf(iZzj).length());
            sb.append(strZzK);
            sb.append(".40.");
            sb.append(iZzj);
            strZzK = sb.toString();
        }
        Object[] objArr = {Integer.valueOf(iZzs), Integer.valueOf(iZzs2), strZzK};
        String str = zzeo.zza;
        return String.format(Locale.US, "iamf.%03X.%03X.%s", objArr);
    }

    public static String zzb(int i7, int i8, int i9) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9));
    }

    public static String zzc(int i7, boolean z7, int i8, int i9, int[] iArr, int i10) {
        int i11;
        Object[] objArr = {zzc[i7], Integer.valueOf(i8), Integer.valueOf(i9), Character.valueOf(true != z7 ? 'L' : 'H'), Integer.valueOf(i10)};
        String str = zzeo.zza;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i12 = 6;
        while (true) {
            if (i12 <= 0) {
                break;
            }
            int i13 = i12 - 1;
            if (iArr[i13] != 0) {
                break;
            }
            i12 = i13;
        }
        for (i11 = 0; i11 < i12; i11++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i11])));
        }
        return sb.toString();
    }

    public static String zzd(byte[] bArr) {
        int length = bArr.length;
        zzghc.zzd(length >= 17, "Invalid APV CSD length: %s", length);
        byte b7 = bArr[0];
        zzghc.zzd(b7 == 1, "Invalid APV CSD version: %s", b7);
        Object[] objArr = {Integer.valueOf(bArr[5]), Integer.valueOf(bArr[6]), Integer.valueOf(bArr[7])};
        String str = zzeo.zza;
        return String.format(Locale.US, "apv1.apvf%d.apvl%d.apvb%d", objArr);
    }

    /* JADX WARN: Code duplicated, block: B:145:0x027d A[PHI: r20
      0x027d: PHI (r20v13 int) = 
      (r20v1 int)
      (r20v2 int)
      (r20v3 int)
      (r20v4 int)
      (r20v5 int)
      (r20v6 int)
      (r20v7 int)
      (r20v8 int)
      (r20v9 int)
      (r20v10 int)
      (r20v11 int)
      (r20v14 int)
     binds: [B:143:0x0278, B:140:0x026c, B:137:0x0260, B:134:0x0254, B:131:0x0248, B:128:0x023c, B:125:0x0230, B:122:0x0223, B:119:0x0216, B:116:0x0209, B:113:0x01fc, B:111:0x01f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:191:0x0335  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v98 int, still in use, count: 1, list:
      (r1v98 int) from 0x0067: IF  (r1v98 int) != (1567 int)  -> B:20:0x0069 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v98 int, still in use, count: 1, list:
      (r1v98 int) from 0x0067: IF  (r1v98 int) != (1567 int)  -> B:20:0x0069 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Pair zze(zzu zzuVar) {
        int i7;
        byte b7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Integer num;
        Integer num2;
        String str = zzuVar.zzk;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        int i16 = 8;
        int i17 = 3;
        int i18 = 2;
        if ("video/dolby-vision".equals(zzuVar.zzo)) {
            if (strArrSplit.length < 3) {
                zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
                return null;
            }
            Matcher matcher = zzd.matcher(strArrSplit[1]);
            if (!matcher.matches()) {
                zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
                return null;
            }
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                num = null;
            } else {
                if (strGroup.hashCode() != 1567) {
                    switch (strGroup) {
                        case "00":
                            num = 1;
                            break;
                        case "01":
                            num = 2;
                            break;
                        case "02":
                            num = 4;
                            break;
                        case "03":
                            num = 8;
                            break;
                        case "04":
                            num = 16;
                            break;
                        case "05":
                            num = 32;
                            break;
                        case "06":
                            num = 64;
                            break;
                        case "07":
                            num = 128;
                            break;
                        case "08":
                            num = 256;
                            break;
                        case "09":
                            num = 512;
                            break;
                        default:
                            num = null;
                            break;
                    }
                } else {
                    num = strGroup.equals("10") ? 1024 : null;
                }
            }
            if (num == null) {
                zzds.zzc("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: ".concat(String.valueOf(strGroup)));
                return null;
            }
            String str2 = strArrSplit[2];
            if (str2 != null) {
                str2.hashCode();
                switch (str2) {
                    case "01":
                        num2 = 1;
                        break;
                    case "02":
                        num2 = 2;
                        break;
                    case "03":
                        num2 = 4;
                        break;
                    case "04":
                        num2 = 8;
                        break;
                    case "05":
                        num2 = 16;
                        break;
                    case "06":
                        num2 = 32;
                        break;
                    case "07":
                        num2 = 64;
                        break;
                    case "08":
                        num2 = 128;
                        break;
                    case "09":
                        num2 = 256;
                        break;
                    default:
                        switch (str2) {
                            case 1567:
                                num2 = !str2.equals("10") ? null : 512;
                                break;
                            case 1568:
                                num2 = !str2.equals("11") ? null : 1024;
                                break;
                            case 1569:
                                num2 = !str2.equals("12") ? null : 2048;
                                break;
                            case 1570:
                                num2 = !str2.equals("13") ? null : 4096;
                                break;
                            default:
                                num2 = null;
                                break;
                        }
                }
            } else {
                num2 = null;
            }
            if (num2 != null) {
                return new Pair(num, num2);
            }
            zzds.zzc("CodecSpecificDataUtil", "Unknown Dolby Vision level string: ".concat(String.valueOf(str2)));
            return null;
        }
        int i19 = 0;
        String str3 = strArrSplit[0];
        byte b8 = -1;
        switch (str3.hashCode()) {
            case 2986313:
                i7 = 256;
                if (!str3.equals("ac-4")) {
                    b7 = -1;
                } else {
                    b7 = 9;
                }
                break;
            case 3001066:
                i7 = 256;
                if (!str3.equals("apv1")) {
                    b7 = -1;
                } else {
                    b7 = 7;
                }
                break;
            case 3004662:
                i7 = 256;
                if (!str3.equals("av01")) {
                    b7 = -1;
                } else {
                    b7 = 6;
                }
                break;
            case 3006243:
                i7 = 256;
                if (!str3.equals("avc1")) {
                    b7 = -1;
                } else {
                    b7 = 1;
                }
                break;
            case 3006244:
                i7 = 256;
                if (!str3.equals("avc2")) {
                    b7 = -1;
                } else {
                    b7 = 2;
                }
                break;
            case 3199032:
                i7 = 256;
                if (!str3.equals("hev1")) {
                    b7 = -1;
                } else {
                    b7 = 4;
                }
                break;
            case 3214780:
                i7 = 256;
                if (!str3.equals("hvc1")) {
                    b7 = -1;
                } else {
                    b7 = 5;
                }
                break;
            case 3224753:
                i7 = 256;
                if (!str3.equals("iamf")) {
                    b7 = -1;
                } else {
                    b7 = 10;
                }
                break;
            case 3356560:
                i7 = 256;
                if (!str3.equals("mp4a")) {
                    b7 = -1;
                } else {
                    b7 = 8;
                }
                break;
            case 3475740:
                i7 = 256;
                if (!str3.equals("s263")) {
                    b7 = -1;
                } else {
                    b7 = 0;
                }
                break;
            case 3624515:
                i7 = 256;
                if (!str3.equals("vp09")) {
                    b7 = -1;
                } else {
                    b7 = 3;
                }
                break;
            default:
                i7 = 256;
                b7 = -1;
                break;
        }
        switch (b7) {
            case 0:
                String str4 = zzuVar.zzk;
                Pair pair = new Pair(1, 1);
                if (strArrSplit.length < 3) {
                    zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(String.valueOf(str4)));
                    return pair;
                }
                try {
                    return new Pair(Integer.valueOf(Integer.parseInt(strArrSplit[1])), Integer.valueOf(Integer.parseInt(strArrSplit[2])));
                } catch (NumberFormatException unused) {
                    zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(String.valueOf(str4)));
                    return pair;
                }
            case 1:
            case 2:
                String str5 = zzuVar.zzk;
                int length = strArrSplit.length;
                if (length < 2) {
                    zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str5)));
                    return null;
                }
                try {
                    if (strArrSplit[1].length() == 6) {
                        i8 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                        i9 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                    } else {
                        if (length < 3) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 37);
                            sb.append("Ignoring malformed AVC codec string: ");
                            sb.append(str5);
                            zzds.zzc("CodecSpecificDataUtil", sb.toString());
                            return null;
                        }
                        i8 = Integer.parseInt(strArrSplit[1]);
                        i9 = Integer.parseInt(strArrSplit[2]);
                    }
                    if (i8 == 66) {
                        i18 = 1;
                    } else if (i8 != 77) {
                        if (i8 == 88) {
                            i18 = 4;
                        } else if (i8 == 100) {
                            i18 = 8;
                        } else if (i8 == 110) {
                            i18 = 16;
                        } else if (i8 != 122) {
                            i18 = i8 != 244 ? -1 : 64;
                        } else {
                            i18 = 32;
                        }
                    }
                    if (i18 == -1) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i8).length() + 21);
                        sb2.append("Unknown AVC profile: ");
                        sb2.append(i8);
                        zzds.zzc("CodecSpecificDataUtil", sb2.toString());
                        return null;
                    }
                    switch (i9) {
                        case 10:
                            i10 = 1;
                            break;
                        case 11:
                            i10 = 4;
                            break;
                        case 12:
                            i10 = 8;
                            break;
                        case 13:
                            i10 = 16;
                            break;
                        default:
                            switch (i9) {
                                case 20:
                                    i10 = 32;
                                    break;
                                case zzbbn.zzt.zzm /* 21 */:
                                    i10 = 64;
                                    break;
                                case 22:
                                    i10 = 128;
                                    break;
                                default:
                                    switch (i9) {
                                        case 30:
                                            i10 = i7;
                                            break;
                                        case 31:
                                            i10 = 512;
                                            break;
                                        case 32:
                                            i10 = 1024;
                                            break;
                                        default:
                                            switch (i9) {
                                                case 40:
                                                    i10 = 2048;
                                                    break;
                                                case 41:
                                                    i10 = 4096;
                                                    break;
                                                case 42:
                                                    i10 = 8192;
                                                    break;
                                                default:
                                                    switch (i9) {
                                                        case 50:
                                                            i10 = 16384;
                                                            break;
                                                        case 51:
                                                            i10 = 32768;
                                                            break;
                                                        case 52:
                                                            i10 = 65536;
                                                            break;
                                                        default:
                                                            i10 = -1;
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    if (i10 != -1) {
                        return new Pair(Integer.valueOf(i18), Integer.valueOf(i10));
                    }
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i9).length() + 19);
                    sb3.append("Unknown AVC level: ");
                    sb3.append(i9);
                    zzds.zzc("CodecSpecificDataUtil", sb3.toString());
                    return null;
                } catch (NumberFormatException unused2) {
                    zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str5)));
                }
                break;
            case 3:
                String str6 = zzuVar.zzk;
                if (strArrSplit.length < 3) {
                    zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str6)));
                    return null;
                }
                try {
                    int i20 = Integer.parseInt(strArrSplit[1]);
                    int i21 = Integer.parseInt(strArrSplit[2]);
                    if (i20 == 0) {
                        i11 = 1;
                    } else if (i20 == 1) {
                        i11 = 2;
                    } else if (i20 != 2) {
                        i11 = i20 != 3 ? -1 : 8;
                    } else {
                        i11 = 4;
                    }
                    if (i11 == -1) {
                        StringBuilder sb4 = new StringBuilder(String.valueOf(i20).length() + 21);
                        sb4.append("Unknown VP9 profile: ");
                        sb4.append(i20);
                        zzds.zzc("CodecSpecificDataUtil", sb4.toString());
                        return null;
                    }
                    if (i21 == 10) {
                        i18 = 1;
                    } else if (i21 != 11) {
                        if (i21 == 20) {
                            i18 = 4;
                        } else if (i21 == 21) {
                            i18 = 8;
                        } else if (i21 == 30) {
                            i18 = 16;
                        } else if (i21 == 31) {
                            i18 = 32;
                        } else if (i21 == 40) {
                            i18 = 64;
                        } else if (i21 == 41) {
                            i18 = 128;
                        } else if (i21 == 50) {
                            i18 = i7;
                        } else if (i21 != 51) {
                            switch (i21) {
                                case 60:
                                    i18 = 2048;
                                    break;
                                case 61:
                                    i18 = 4096;
                                    break;
                                case 62:
                                    i18 = 8192;
                                    break;
                                default:
                                    i18 = -1;
                                    break;
                            }
                        } else {
                            i18 = 512;
                        }
                    }
                    if (i18 != -1) {
                        return new Pair(Integer.valueOf(i11), Integer.valueOf(i18));
                    }
                    StringBuilder sb5 = new StringBuilder(String.valueOf(i21).length() + 19);
                    sb5.append("Unknown VP9 level: ");
                    sb5.append(i21);
                    zzds.zzc("CodecSpecificDataUtil", sb5.toString());
                    return null;
                } catch (NumberFormatException unused3) {
                    zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str6)));
                }
                break;
            case 4:
            case 5:
                return zzf(zzuVar.zzk, strArrSplit, zzuVar.zzE);
            case 6:
                String str7 = zzuVar.zzk;
                zzh zzhVar = zzuVar.zzE;
                if (strArrSplit.length < 4) {
                    zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str7)));
                    return null;
                }
                try {
                    int i22 = Integer.parseInt(strArrSplit[1]);
                    int i23 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                    int i24 = Integer.parseInt(strArrSplit[3]);
                    if (i22 != 0) {
                        StringBuilder sb6 = new StringBuilder(String.valueOf(i22).length() + 21);
                        sb6.append("Unknown AV1 profile: ");
                        sb6.append(i22);
                        zzds.zzc("CodecSpecificDataUtil", sb6.toString());
                        return null;
                    }
                    if (i24 == 8) {
                        i12 = 1;
                    } else {
                        if (i24 != 10) {
                            StringBuilder sb7 = new StringBuilder(String.valueOf(i24).length() + 23);
                            sb7.append("Unknown AV1 bit depth: ");
                            sb7.append(i24);
                            zzds.zzc("CodecSpecificDataUtil", sb7.toString());
                            return null;
                        }
                        i12 = (zzhVar == null || !(zzhVar.zze != null || (i13 = zzhVar.zzd) == 7 || i13 == 6)) ? 2 : 4096;
                    }
                    switch (i23) {
                        case 0:
                            i18 = 1;
                            break;
                        case 1:
                            break;
                        case 2:
                            i18 = 4;
                            break;
                        case 3:
                            i18 = 8;
                            break;
                        case 4:
                            i18 = 16;
                            break;
                        case 5:
                            i18 = 32;
                            break;
                        case 6:
                            i18 = 64;
                            break;
                        case 7:
                            i18 = 128;
                            break;
                        case 8:
                            i18 = i7;
                            break;
                        case 9:
                            i18 = 512;
                            break;
                        case 10:
                            i18 = 1024;
                            break;
                        case 11:
                            i18 = 2048;
                            break;
                        case 12:
                            i18 = 4096;
                            break;
                        case 13:
                            i18 = 8192;
                            break;
                        case 14:
                            i18 = 16384;
                            break;
                        case 15:
                            i18 = 32768;
                            break;
                        case 16:
                            i18 = 65536;
                            break;
                        case 17:
                            i18 = 131072;
                            break;
                        case 18:
                            i18 = 262144;
                            break;
                        case 19:
                            i18 = 524288;
                            break;
                        case 20:
                            i18 = 1048576;
                            break;
                        case zzbbn.zzt.zzm /* 21 */:
                            i18 = 2097152;
                            break;
                        case 22:
                            i18 = 4194304;
                            break;
                        case 23:
                            i18 = 8388608;
                            break;
                        default:
                            i18 = -1;
                            break;
                    }
                    if (i18 != -1) {
                        return new Pair(Integer.valueOf(i12), Integer.valueOf(i18));
                    }
                    StringBuilder sb8 = new StringBuilder(String.valueOf(i23).length() + 19);
                    sb8.append("Unknown AV1 level: ");
                    sb8.append(i23);
                    zzds.zzc("CodecSpecificDataUtil", sb8.toString());
                    return null;
                } catch (NumberFormatException unused4) {
                    zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str7)));
                }
                break;
            case 7:
                String str8 = zzuVar.zzk;
                if (strArrSplit.length < 4) {
                    zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed APV codec string: ".concat(String.valueOf(str8)));
                    return null;
                }
                try {
                    int i25 = Integer.parseInt(strArrSplit[1].substring(4));
                    int i26 = Integer.parseInt(strArrSplit[2].substring(4));
                    int i27 = Integer.parseInt(strArrSplit[3].substring(4));
                    if (i25 == 33) {
                        i14 = 1;
                    } else {
                        if (i25 != 44) {
                            StringBuilder sb9 = new StringBuilder(String.valueOf(i25).length() + 30);
                            sb9.append("Ignoring invalid APV profile: ");
                            sb9.append(i25);
                            zzds.zzc("CodecSpecificDataUtil", sb9.toString());
                            return null;
                        }
                        i14 = 8192;
                    }
                    int i28 = i26 / 30;
                    int i29 = i28 + i28;
                    if (i26 % 30 == 0) {
                        i29--;
                    }
                    return new Pair(Integer.valueOf(i14), Integer.valueOf((i7 << (i29 - 1)) | (1 << i27)));
                } catch (NumberFormatException e7) {
                    zzds.zzd("CodecSpecificDataUtil", "Ignoring malformed APV codec string: ".concat(String.valueOf(str8)), e7);
                }
                break;
            case 8:
                String str9 = zzuVar.zzk;
                if (strArrSplit.length != 3) {
                    zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str9)));
                    return null;
                }
                try {
                    if ("audio/mp4a-latm".equals(zzar.zzf(Integer.parseInt(strArrSplit[1], 16)))) {
                        int i30 = Integer.parseInt(strArrSplit[2]);
                        if (i30 == 17) {
                            i17 = 17;
                        } else if (i30 == 20) {
                            i17 = 20;
                        } else if (i30 == 23) {
                            i17 = 23;
                        } else if (i30 == 29) {
                            i17 = 29;
                        } else if (i30 == 39) {
                            i17 = 39;
                        } else if (i30 != 42) {
                            switch (i30) {
                                case 1:
                                    i17 = 1;
                                    break;
                                case 2:
                                    i17 = 2;
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    i17 = 4;
                                    break;
                                case 5:
                                    i17 = 5;
                                    break;
                                case 6:
                                    i17 = 6;
                                    break;
                                default:
                                    i17 = -1;
                                    break;
                            }
                        } else {
                            i17 = 42;
                        }
                        if (i17 != -1) {
                            return new Pair(Integer.valueOf(i17), 0);
                        }
                    }
                    return null;
                } catch (NumberFormatException unused5) {
                    zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str9)));
                }
                break;
            case 9:
                String str10 = zzuVar.zzk;
                if (strArrSplit.length != 4) {
                    zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: ".concat(String.valueOf(str10)));
                    return null;
                }
                try {
                    int i31 = Integer.parseInt(strArrSplit[1]);
                    int i32 = Integer.parseInt(strArrSplit[2]);
                    int i33 = Integer.parseInt(strArrSplit[3]);
                    if (i31 != 0) {
                        if (i31 != 1) {
                            if (i31 != 2) {
                                i19 = i32;
                                i15 = -1;
                            } else if (i32 == 1) {
                                i15 = 1026;
                                i19 = 1;
                            } else if (i32 == 2) {
                                i15 = 1028;
                                i19 = 2;
                            } else {
                                i19 = i32;
                                i15 = -1;
                            }
                        } else if (i32 == 0) {
                            i15 = 513;
                        } else if (i32 == 1) {
                            i15 = 514;
                            i19 = 1;
                        } else {
                            i19 = i32;
                            i15 = -1;
                        }
                    } else if (i32 == 0) {
                        i15 = 257;
                    } else {
                        i19 = i32;
                        i15 = -1;
                    }
                    if (i15 == -1) {
                        StringBuilder sb10 = new StringBuilder(String.valueOf(i31).length() + 23 + String.valueOf(i19).length());
                        sb10.append("Unknown AC-4 profile: ");
                        sb10.append(i31);
                        sb10.append(".");
                        sb10.append(i19);
                        zzds.zzc("CodecSpecificDataUtil", sb10.toString());
                        return null;
                    }
                    if (i33 == 0) {
                        i16 = 1;
                    } else if (i33 == 1) {
                        i16 = 2;
                    } else if (i33 == 2) {
                        i16 = 4;
                    } else if (i33 != 3) {
                        i16 = i33 != 4 ? -1 : 16;
                    }
                    if (i16 != -1) {
                        return new Pair(Integer.valueOf(i15), Integer.valueOf(i16));
                    }
                    StringBuilder sb11 = new StringBuilder(String.valueOf(i33).length() + 20);
                    sb11.append("Unknown AC-4 level: ");
                    sb11.append(i33);
                    zzds.zzc("CodecSpecificDataUtil", sb11.toString());
                    return null;
                } catch (NumberFormatException unused6) {
                    zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: ".concat(String.valueOf(str10)));
                }
                break;
            case 10:
                if (strArrSplit.length < 4) {
                    zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed IAMF codec string: ".concat(str));
                    return null;
                }
                try {
                    int i34 = 1 << (Integer.parseInt(strArrSplit[1]) + 16);
                    String str11 = strArrSplit[3];
                    switch (str11.hashCode()) {
                        case 2464863:
                            if (str11.equals("Opus")) {
                                b8 = 0;
                            }
                            break;
                        case 3114792:
                            if (str11.equals("fLaC")) {
                                b8 = 2;
                            }
                            break;
                        case 3238865:
                            if (str11.equals("ipcm")) {
                                b8 = 3;
                            }
                            break;
                        case 3356560:
                            if (str11.equals("mp4a")) {
                                b8 = 1;
                            }
                            break;
                    }
                    if (b8 == 0) {
                        i16 = 1;
                    } else if (b8 == 1) {
                        i16 = 2;
                    } else if (b8 == 2) {
                        i16 = 4;
                    } else if (b8 != 3) {
                        zzds.zzc("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: ".concat(str11));
                        return null;
                    }
                    return new Pair(Integer.valueOf(i34 | 16777216 | i16), 0);
                } catch (NumberFormatException e8) {
                    zzds.zzd("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: ".concat(String.valueOf(strArrSplit[1])), e8);
                }
                break;
            default:
                return null;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x0196  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    public static Pair zzf(String str, String[] strArr, zzh zzhVar) {
        int i7;
        Integer num;
        if (strArr.length < 4) {
            zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        Matcher matcher = zzd.matcher(strArr[1]);
        if (!matcher.matches()) {
            zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        String strGroup = matcher.group(1);
        if ("1".equals(strGroup)) {
            i7 = 1;
        } else if ("2".equals(strGroup)) {
            i7 = (zzhVar == null || zzhVar.zzd != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(strGroup)) {
                zzds.zzc("CodecSpecificDataUtil", "Unknown HEVC profile string: ".concat(String.valueOf(strGroup)));
                return null;
            }
            i7 = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2) {
                case "L30":
                    num = 1;
                    break;
                case "L60":
                    num = 4;
                    break;
                case "L63":
                    num = 16;
                    break;
                case "L90":
                    num = 64;
                    break;
                case "L93":
                    num = 256;
                    break;
                case "L120":
                    num = 1024;
                    break;
                case "L123":
                    num = 4096;
                    break;
                case "L150":
                    num = 16384;
                    break;
                case "L153":
                    num = 65536;
                    break;
                case "L156":
                    num = 262144;
                    break;
                case "L180":
                    num = 1048576;
                    break;
                case "L183":
                    num = 4194304;
                    break;
                case "L186":
                    num = 16777216;
                    break;
                case "H30":
                    num = 2;
                    break;
                case "H60":
                    num = 8;
                    break;
                case "H63":
                    num = 32;
                    break;
                case "H90":
                    num = 128;
                    break;
                case "H93":
                    num = 512;
                    break;
                case "H120":
                    num = 2048;
                    break;
                case "H123":
                    num = 8192;
                    break;
                case "H150":
                    num = 32768;
                    break;
                case "H153":
                    num = 131072;
                    break;
                case "H156":
                    num = 524288;
                    break;
                case "H180":
                    num = 2097152;
                    break;
                case "H183":
                    num = 8388608;
                    break;
                case "H186":
                    num = 33554432;
                    break;
                default:
                    num = null;
                    break;
            }
        } else {
            num = null;
        }
        if (num != null) {
            return new Pair(Integer.valueOf(i7), num);
        }
        zzds.zzc("CodecSpecificDataUtil", "Unknown HEVC level string: ".concat(String.valueOf(str2)));
        return null;
    }

    public static byte[] zzg(byte[] bArr, int i7, int i8) {
        byte[] bArr2 = new byte[i8 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i7, bArr2, 4, i8);
        return bArr2;
    }

    private static boolean zzh(zzef zzefVar, int i7) {
        if ((zzefVar.zzs() >> 3) != i7) {
            return false;
        }
        zzefVar.zzQ();
        return true;
    }
}
