package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeo {
    public static final String zza;
    public static final byte[] zzb;
    private static final Pattern zzc;
    private static HashMap zzd;
    private static final String[] zze;
    private static final String[] zzf;
    private static final int[] zzg;
    private static final int[] zzh;
    private static final int[] zzi;

    static {
        String str = Build.DEVICE;
        String str2 = Build.MODEL;
        String str3 = Build.MANUFACTURER;
        int i7 = Build.VERSION.SDK_INT;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(str2).length() + 2 + String.valueOf(str3).length() + 2 + String.valueOf(i7).length());
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i7);
        zza = sb.toString();
        zzb = new byte[0];
        zzc = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        zze = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        zzf = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        zzg = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        zzh = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        zzi = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, ModuleDescriptor.MODULE_VERSION, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static boolean zzA(int i7) {
        return i7 == 3 || i7 == 2 || i7 == 268435456 || i7 == 21 || i7 == 1342177280 || i7 == 22 || i7 == 1610612736 || i7 == 4;
    }

    public static int zzB(int i7) {
        int i8;
        int i9 = 6396;
        if (i7 == 10) {
            i8 = 737532;
        } else {
            if (i7 == 12) {
                return 743676;
            }
            if (i7 != 24) {
                switch (i7) {
                    case 1:
                        return 4;
                    case 2:
                        return 12;
                    case 3:
                        return 28;
                    case 4:
                        return 204;
                    case 5:
                        return 220;
                    case 6:
                        return 252;
                    case 7:
                        return 1276;
                    case 8:
                        return 6396;
                    default:
                        return 0;
                }
            }
            i8 = 67108860;
            i9 = 0;
        }
        return Build.VERSION.SDK_INT >= 32 ? i8 : i9;
    }

    public static AudioFormat zzC(int i7, int i8, int i9) {
        return new AudioFormat.Builder().setSampleRate(i7).setChannelMask(i8).setEncoding(i9).build();
    }

    public static int zzD(int i7) {
        if (i7 == 30) {
            return 34;
        }
        switch (i7) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i7) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        switch (i7) {
                            case 20:
                                return 30;
                            case zzbbn.zzt.zzm /* 21 */:
                            case 22:
                                return 31;
                            default:
                                return C3553a.e.API_PRIORITY_OTHER;
                        }
                }
        }
    }

    public static int zzE(int i7) {
        if (i7 != 2) {
            if (i7 == 3) {
                return 1;
            }
            if (i7 != 4) {
                if (i7 != 21) {
                    if (i7 != 22) {
                        if (i7 != 268435456) {
                            if (i7 != 1342177280) {
                                if (i7 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int zzF(int i7) {
        if (i7 == 2 || i7 == 4) {
            return 6005;
        }
        if (i7 == 10) {
            return 6004;
        }
        if (i7 == 7) {
            return 6005;
        }
        if (i7 == 8) {
            return 6003;
        }
        switch (i7) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case zzbbn.zzt.zzm /* 21 */:
            case 22:
                return 6004;
            default:
                switch (i7) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    public static int zzG(Uri uri) {
        byte b7;
        int i7;
        String scheme = uri.getScheme();
        if (scheme != null && (zzggj.zze("rtsp", scheme) || zzggj.zze("rtspt", scheme))) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            switch (zzggj.zza(lastPathSegment.substring(iLastIndexOf + 1))) {
                case "ism":
                    b7 = 2;
                    break;
                case "mpd":
                    b7 = 0;
                    break;
                case "isml":
                    b7 = 3;
                    break;
                case "m3u8":
                    b7 = 1;
                    break;
                default:
                    b7 = -1;
                    break;
            }
            if (b7 == 0) {
                i7 = 0;
            } else if (b7 != 1) {
                i7 = (b7 == 2 || b7 == 3) ? 1 : 4;
            } else {
                i7 = 2;
            }
            if (i7 != 4) {
                return i7;
            }
        }
        Pattern pattern = zzc;
        String path = uri.getPath();
        path.getClass();
        Matcher matcher = pattern.matcher(path);
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            if (strGroup.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (strGroup.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static int zzH(byte[] bArr, int i7, int i8, int i9) {
        while (i7 < i8) {
            i9 = zzg[(i9 >>> 24) ^ (bArr[i7] & 255)] ^ (i9 << 8);
            i7++;
        }
        return i9;
    }

    public static int zzI(byte[] bArr, int i7, int i8, int i9) {
        int iZzU = 65535;
        for (int i10 = 0; i10 < i8; i10++) {
            int unsignedInt = Byte.toUnsignedInt(bArr[i10]);
            iZzU = zzU(unsignedInt & 15, zzU(unsignedInt >> 4, iZzU));
        }
        return iZzU;
    }

    public static int zzJ(byte[] bArr, int i7, int i8, int i9) {
        int i10 = 0;
        while (i7 < i8) {
            i10 = zzi[i10 ^ (bArr[i7] & 255)];
            i7++;
        }
        return i10;
    }

    public static int zzK(ByteBuffer byteBuffer, int i7) {
        int i8 = byteBuffer.getInt(i7);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i8 : Integer.reverseBytes(i8);
    }

    public static boolean zzL(zzef zzefVar, zzef zzefVar2, Inflater inflater) {
        boolean z7 = false;
        if (zzefVar.zzd() == 0) {
            return false;
        }
        if (zzefVar2.zzj() < zzefVar.zzd()) {
            int iZzd = zzefVar.zzd();
            zzefVar2.zzc(iZzd + iZzd);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(zzefVar.zzi(), zzefVar.zzg(), zzefVar.zzd());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(zzefVar2.zzi(), iInflate, zzefVar2.zzj() - iInflate);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                        break;
                    }
                    if (iInflate == zzefVar2.zzj()) {
                        int iZzj = zzefVar2.zzj();
                        zzefVar2.zzc(iZzj + iZzj);
                    }
                } else {
                    zzefVar2.zzf(iInflate);
                    z7 = true;
                    break;
                }
            } catch (DataFormatException unused) {
            } catch (Throwable th) {
                inflater.reset();
                throw th;
            }
        }
        inflater.reset();
        return z7;
    }

    public static boolean zzM(zzef zzefVar, zzef zzefVar2, Inflater inflater) {
        return zzefVar.zzd() > 0 && zzefVar.zzn() == 120 && zzL(zzefVar, zzefVar2, inflater);
    }

    public static boolean zzN(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean zzO(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static Point zzP(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && zzN(context)) {
            String strZzV = Build.VERSION.SDK_INT < 28 ? zzV("sys.display-size") : zzV("vendor.display-size");
            if (!TextUtils.isEmpty(strZzV)) {
                try {
                    String[] strArrSplit = strZzV.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i7 = Integer.parseInt(strArrSplit[0]);
                        int i8 = Integer.parseInt(strArrSplit[1]);
                        if (i7 > 0 && i8 > 0) {
                            return new Point(i7, i8);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                zzds.zze("Util", "Invalid display size: ".concat(String.valueOf(strZzV)));
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static String zzQ(int i7) {
        switch (i7) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static int zzR(String str) {
        String[] strArrSplit;
        int length;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z7 = length >= 3 && "neg".equals(strArrSplit[length + (-2)]);
        try {
            if (str2 == null) {
                throw null;
            }
            int i7 = Integer.parseInt(str2);
            return z7 ? -i7 : i7;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static boolean zzS(Context context) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i7 == 30) {
            String str = Build.MODEL;
            if (zzggj.zze(str, "moto g(20)") || zzggj.zze(str, "rmx3231")) {
                return true;
            }
        }
        return i7 == 34 && zzggj.zze(Build.MODEL, "sm-x200");
    }

    private static long zzT(long j7, long j8, long j9, RoundingMode roundingMode) {
        long jZzc = zzgmz.zzc(j7, j8);
        if (jZzc != Long.MAX_VALUE && jZzc != Long.MIN_VALUE) {
            return zzgmz.zza(jZzc, j9, roundingMode);
        }
        long jZzb = zzgmz.zzb(Math.abs(j8), Math.abs(j9));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jZza = zzgmz.zza(j8, jZzb, roundingMode2);
        long jZza2 = zzgmz.zza(j9, jZzb, roundingMode2);
        long jZzb2 = zzgmz.zzb(Math.abs(j7), Math.abs(jZza2));
        long jZza3 = zzgmz.zza(j7, jZzb2, roundingMode2);
        long jZza4 = zzgmz.zza(jZza2, jZzb2, roundingMode2);
        long jZzc2 = zzgmz.zzc(jZza3, jZza);
        if (jZzc2 != Long.MAX_VALUE && jZzc2 != Long.MIN_VALUE) {
            return zzgmz.zza(jZzc2, jZza4, roundingMode);
        }
        double d7 = jZza3 * (jZza / jZza4);
        if (d7 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d7 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return zzgmu.zza(d7, roundingMode);
    }

    private static int zzU(int i7, int i8) {
        return (char) (zzh[(i7 ^ (i8 >> 12)) & 255] ^ ((char) (i8 << 4)));
    }

    private static String zzV(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e7) {
            zzds.zzf("Util", "Failed to read system property ".concat(str), e7);
            return null;
        }
    }

    private static HashMap zzW() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = zze.length;
        HashMap map = new HashMap(length + 88);
        int i7 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = zze;
            int length3 = strArr.length;
            if (i7 >= 88) {
                return map;
            }
            map.put(strArr[i7], strArr[i7 + 1]);
            i7 += 2;
        }
    }

    public static boolean zza(SparseArray sparseArray, int i7) {
        return sparseArray.indexOfKey(i7) >= 0;
    }

    public static Object[] zzb(Object[] objArr, int i7) {
        zzghc.zza(i7 <= objArr.length);
        return Arrays.copyOf(objArr, i7);
    }

    public static Handler zzc(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        return new Handler(looperMyLooper, null);
    }

    public static boolean zzd(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static Looper zze() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static ExecutorService zzf(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.gms.internal.ads.zzen
            @Override // java.util.concurrent.ThreadFactory
            public final /* synthetic */ Thread newThread(Runnable runnable) {
                String str2 = zzeo.zza;
                return new Thread(runnable, str);
            }
        });
    }

    public static ScheduledExecutorService zzg(String str) {
        final String str2 = "ExoPlayer:AudioTrackReleaseThread";
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory(str2) { // from class: com.google.android.gms.internal.ads.zzem
            @Override // java.util.concurrent.ThreadFactory
            public final /* synthetic */ Thread newThread(Runnable runnable) {
                String str3 = zzeo.zza;
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            }
        });
    }

    public static String zzh(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strZza = zzggj.zza(str);
        int i7 = 0;
        String str2 = strZza.split("-", 2)[0];
        if (zzd == null) {
            zzd = zzW();
        }
        String str3 = (String) zzd.get(str2);
        if (str3 != null) {
            strZza = str3.concat(String.valueOf(strZza.substring(str2.length())));
            str2 = str3;
        }
        if ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) {
            while (true) {
                String[] strArr = zzf;
                int length = strArr.length;
                if (i7 >= 18) {
                    break;
                }
                if (strZza.startsWith(strArr[i7])) {
                    return String.valueOf(strArr[i7 + 1]).concat(String.valueOf(strZza.substring(strArr[i7].length())));
                }
                i7 += 2;
            }
        }
        return strZza;
    }

    public static String zzi(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static String zzj(byte[] bArr, int i7, int i8) {
        return new String(bArr, i7, i8, StandardCharsets.UTF_8);
    }

    public static boolean zzk(int i7) {
        return i7 == 10 || i7 == 13;
    }

    public static int zzl(int[] iArr, int i7, boolean z7, boolean z8) {
        int i8;
        int i9;
        int iBinarySearch = Arrays.binarySearch(iArr, i7);
        if (iBinarySearch < 0) {
            i9 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i8 = iBinarySearch - 1;
                if (i8 < 0 || iArr[i8] != i7) {
                    break;
                }
                iBinarySearch = i8;
            }
            i9 = z7 ? iBinarySearch : i8;
        }
        return z8 ? Math.max(0, i9) : i9;
    }

    public static int zzm(long[] jArr, long j7, boolean z7, boolean z8) {
        int i7;
        int iBinarySearch = Arrays.binarySearch(jArr, j7);
        if (iBinarySearch < 0) {
            i7 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i8 = iBinarySearch - 1;
                if (i8 < 0 || jArr[i8] != j7) {
                    break;
                }
                iBinarySearch = i8;
            }
            i7 = iBinarySearch;
        }
        return z8 ? Math.max(0, i7) : i7;
    }

    public static int zzn(zzdt zzdtVar, long j7, boolean z7, boolean z8) {
        int iZzd = zzdtVar.zzd() - 1;
        int i7 = 0;
        while (i7 <= iZzd) {
            int i8 = (i7 + iZzd) >>> 1;
            if (zzdtVar.zzc(i8) < j7) {
                i7 = i8 + 1;
            } else {
                iZzd = i8 - 1;
            }
        }
        int i9 = iZzd + 1;
        if (i9 < zzdtVar.zzd() && zzdtVar.zzc(i9) == j7) {
            return i9;
        }
        if (iZzd == -1) {
            return 0;
        }
        return iZzd;
    }

    public static int zzo(long[] jArr, long j7, boolean z7, boolean z8) {
        int i7;
        int iBinarySearch = Arrays.binarySearch(jArr, j7);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i7 = iBinarySearch + 1;
            if (i7 >= jArr.length || jArr[i7] != j7) {
                break;
            }
            iBinarySearch = i7;
        }
        return !z7 ? i7 : iBinarySearch;
    }

    public static long zzp(long j7) {
        return (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? j7 : j7 / 1000;
    }

    public static long zzq(long j7) {
        return (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? j7 : j7 * 1000;
    }

    public static long zzr(long j7, int i7) {
        return zzt(j7, 1000000L, i7, RoundingMode.DOWN);
    }

    public static long zzs(long j7, int i7) {
        return zzt(j7, i7, 1000000L, RoundingMode.UP);
    }

    public static long zzt(long j7, long j8, long j9, RoundingMode roundingMode) {
        if (j7 == 0 || j8 == 0) {
            return 0L;
        }
        if (j9 >= j8 && j9 % j8 == 0) {
            return zzgmz.zza(j7, zzgmz.zza(j9, j8, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j9 < j8 && j8 % j9 == 0) {
            return zzgmz.zzc(j7, zzgmz.zza(j8, j9, RoundingMode.UNNECESSARY));
        }
        if (j9 < j7 || j9 % j7 != 0) {
            return (j9 >= j7 || j7 % j9 != 0) ? zzT(j7, j8, j9, roundingMode) : zzgmz.zzc(j8, zzgmz.zza(j7, j9, RoundingMode.UNNECESSARY));
        }
        return zzgmz.zza(j8, zzgmz.zza(j9, j7, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static void zzu(long[] jArr, long j7, long j8) {
        long j9;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i7 = 0;
        if (j8 >= 1000000 && j8 % 1000000 == 0) {
            long jZza = zzgmz.zza(j8, 1000000L, RoundingMode.UNNECESSARY);
            while (i7 < jArr.length) {
                jArr[i7] = zzgmz.zza(jArr[i7], jZza, roundingMode);
                i7++;
            }
            return;
        }
        if (j8 < 1000000 && 1000000 % j8 == 0) {
            long jZza2 = zzgmz.zza(1000000L, j8, RoundingMode.UNNECESSARY);
            while (i7 < jArr.length) {
                jArr[i7] = zzgmz.zzc(jArr[i7], jZza2);
                i7++;
            }
            return;
        }
        int i8 = 0;
        while (i8 < jArr.length) {
            long j10 = jArr[i8];
            if (j10 != 0) {
                if (j8 >= j10 && j8 % j10 == 0) {
                    jArr[i8] = zzgmz.zza(1000000L, zzgmz.zza(j8, j10, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j8 >= j10 || j10 % j8 != 0) {
                    j9 = j8;
                    jArr[i8] = zzT(j10, 1000000L, j9, roundingMode);
                } else {
                    jArr[i8] = zzgmz.zzc(1000000L, zzgmz.zza(j10, j8, RoundingMode.UNNECESSARY));
                }
                j9 = j8;
            } else {
                j9 = j8;
            }
            i8++;
            j8 = j9;
        }
    }

    public static long zzv(long j7, float f7) {
        return f7 == 1.0f ? j7 : Math.round(j7 * ((double) f7));
    }

    public static long zzw(long j7, float f7) {
        return f7 == 1.0f ? j7 : Math.round(j7 / ((double) f7));
    }

    public static String zzx(int i7) {
        return new String(new byte[]{(byte) (i7 >> 24), (byte) (i7 >> 16), (byte) (i7 >> 8), (byte) i7}, StandardCharsets.US_ASCII);
    }

    public static zzu zzy(int i7, int i8, int i9) {
        zzs zzsVar = new zzs();
        zzsVar.zzm("audio/raw");
        zzsVar.zzE(i8);
        zzsVar.zzF(i9);
        zzsVar.zzG(i7);
        return zzsVar.zzM();
    }

    public static int zzz(int i7, ByteOrder byteOrder) {
        if (i7 == 8) {
            return 3;
        }
        if (i7 == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i7 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i7 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }
}
