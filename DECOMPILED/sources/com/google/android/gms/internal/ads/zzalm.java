package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzalm {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzc = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzd = Collections.unmodifiableMap(map2);
    }

    public static zzalg zza(zzef zzefVar, List list) {
        Charset charset = StandardCharsets.UTF_8;
        String strZzN = zzefVar.zzN(charset);
        if (strZzN != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(strZzN);
            if (matcher.matches()) {
                return zzd(null, matcher, zzefVar, list);
            }
            String strZzN2 = zzefVar.zzN(charset);
            if (strZzN2 != null) {
                Matcher matcher2 = pattern.matcher(strZzN2);
                if (matcher2.matches()) {
                    return zzd(strZzN.trim(), matcher2, zzefVar, list);
                }
            }
        }
        return null;
    }

    static zzck zzb(String str) {
        zzall zzallVar = new zzall();
        zze(str, zzallVar);
        return zzallVar.zza();
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x0127  */
    static SpannedString zzc(String str, String str2, List list) {
        byte b7;
        int i7;
        int i8 = -1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (i9 < str2.length()) {
            int i10 = i9 + 1;
            char cCharAt = str2.charAt(i9);
            if (cCharAt == '&') {
                int iIndexOf = str2.indexOf(59, i10);
                int iIndexOf2 = str2.indexOf(32, i10);
                if (iIndexOf == i8) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != i8) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != i8) {
                    String strSubstring = str2.substring(i10, iIndexOf);
                    int iHashCode = strSubstring.hashCode();
                    if (iHashCode != 3309) {
                        if (iHashCode != 3464) {
                            if (iHashCode != 96708) {
                                if (iHashCode == 3374865 && strSubstring.equals("nbsp")) {
                                    b7 = 2;
                                } else {
                                    b7 = -1;
                                }
                            } else if (strSubstring.equals("amp")) {
                                b7 = 3;
                            } else {
                                b7 = -1;
                            }
                        } else if (strSubstring.equals("lt")) {
                            b7 = 0;
                        } else {
                            b7 = -1;
                        }
                    } else if (strSubstring.equals("gt")) {
                        b7 = 1;
                    } else {
                        b7 = -1;
                    }
                    if (b7 == 0) {
                        spannableStringBuilder.append('<');
                    } else if (b7 == 1) {
                        spannableStringBuilder.append('>');
                    } else if (b7 == 2) {
                        spannableStringBuilder.append(' ');
                    } else if (b7 != 3) {
                        StringBuilder sb = new StringBuilder(strSubstring.length() + 33);
                        sb.append("ignoring unsupported entity: '&");
                        sb.append(strSubstring);
                        sb.append(";'");
                        zzds.zzc("WebvttCueParser", sb.toString());
                    } else {
                        spannableStringBuilder.append('&');
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i9 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
                i8 = -1;
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
            } else if (i10 < str2.length()) {
                char cCharAt2 = str2.charAt(i10);
                int iIndexOf3 = str2.indexOf(62, i10);
                int length = iIndexOf3 == i8 ? str2.length() : iIndexOf3 + 1;
                int i11 = length - 2;
                boolean z7 = str2.charAt(i11) == '/';
                int i12 = i9 + (cCharAt2 == '/' ? 2 : 1);
                if (!z7) {
                    i11 = length - 1;
                }
                String strSubstring2 = str2.substring(i12, i11);
                if (!strSubstring2.trim().isEmpty()) {
                    String strTrim = strSubstring2.trim();
                    zzghc.zza(!strTrim.isEmpty());
                    String str3 = zzeo.zza;
                    String str4 = strTrim.split("[ \\.]", 2)[0];
                    int iHashCode2 = str4.hashCode();
                    if (iHashCode2 != 98) {
                        if (iHashCode2 != 99) {
                            if (iHashCode2 != 105) {
                                if (iHashCode2 != 3650) {
                                    if (iHashCode2 != 3314158) {
                                        if (iHashCode2 != 3511770) {
                                            if (iHashCode2 != 117) {
                                                if (iHashCode2 == 118 && str4.equals("v")) {
                                                    i7 = 7;
                                                } else {
                                                    i7 = i8;
                                                }
                                            } else if (str4.equals("u")) {
                                                i7 = 6;
                                            } else {
                                                i7 = i8;
                                            }
                                        } else if (str4.equals("ruby")) {
                                            i7 = 4;
                                        } else {
                                            i7 = i8;
                                        }
                                    } else if (str4.equals("lang")) {
                                        i7 = 3;
                                    } else {
                                        i7 = i8;
                                    }
                                } else if (str4.equals("rt")) {
                                    i7 = 5;
                                } else {
                                    i7 = i8;
                                }
                            } else if (str4.equals("i")) {
                                i7 = 2;
                            } else {
                                i7 = i8;
                            }
                        } else if (str4.equals("c")) {
                            i7 = 1;
                        } else {
                            i7 = i8;
                        }
                    } else if (str4.equals("b")) {
                        i7 = 0;
                    } else {
                        i7 = i8;
                    }
                    switch (i7) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            if (cCharAt2 == '/') {
                                while (!arrayDeque.isEmpty()) {
                                    zzalj zzaljVar = (zzalj) arrayDeque.pop();
                                    zzf(str, zzaljVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new zzali(zzaljVar, spannableStringBuilder.length(), null));
                                    }
                                    if (zzaljVar.zza.equals(str4)) {
                                        break;
                                    }
                                }
                            } else if (!z7) {
                                arrayDeque.push(zzalj.zza(strSubstring2, spannableStringBuilder.length()));
                            }
                            break;
                    }
                }
                i9 = length;
            }
            i9 = i10;
            i8 = -1;
        }
        while (!arrayDeque.isEmpty()) {
            zzf(str, (zzalj) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        zzf(str, zzalj.zzb(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static zzalg zzd(String str, Matcher matcher, zzef zzefVar, List list) {
        zzall zzallVar = new zzall();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            zzallVar.zza = zzalo.zza(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            zzallVar.zzb = zzalo.zza(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            zze(strGroup3, zzallVar);
            StringBuilder sb = new StringBuilder();
            String strZzN = zzefVar.zzN(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strZzN)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strZzN.trim());
                strZzN = zzefVar.zzN(StandardCharsets.UTF_8);
            }
            zzallVar.zzc = zzc(str, sb.toString(), list);
            return new zzalg(zzallVar.zza().zzr(), zzallVar.zza, zzallVar.zzb);
        } catch (IllegalArgumentException unused) {
            zzds.zzc("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:96:0x0167  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void zze(String str, zzall zzallVar) {
        byte b7;
        byte b8;
        byte b9;
        Matcher matcher = zzb.matcher(str);
        while (matcher.find()) {
            int i7 = 1;
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i8 = 2;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    byte b10 = -1;
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        switch (strSubstring.hashCode()) {
                            case -1364013995:
                                if (strSubstring.equals("center")) {
                                    b10 = 1;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring.equals("middle")) {
                                    b10 = 2;
                                }
                                break;
                            case 100571:
                                if (strSubstring.equals("end")) {
                                    b10 = 3;
                                }
                                break;
                            case 109757538:
                                if (strSubstring.equals("start")) {
                                    b10 = 0;
                                }
                                break;
                        }
                        if (b10 == 0) {
                            i8 = 0;
                        } else if (b10 == 1 || b10 == 2) {
                            i8 = 1;
                        } else if (b10 != 3) {
                            zzds.zzc("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                            i8 = Integer.MIN_VALUE;
                        }
                        zzallVar.zzg = i8;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    if (strGroup2.endsWith("%")) {
                        zzallVar.zze = zzalo.zzb(strGroup2);
                        zzallVar.zzf = 0;
                    } else {
                        zzallVar.zze = Integer.parseInt(strGroup2);
                        zzallVar.zzf = 1;
                    }
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2) {
                        case "center":
                            b7 = 2;
                            break;
                        case "middle":
                            b7 = 3;
                            break;
                        case "end":
                            b7 = 4;
                            break;
                        case "left":
                            b7 = 1;
                            break;
                        case "right":
                            b7 = 5;
                            break;
                        case "start":
                            b7 = 0;
                            break;
                        default:
                            b7 = -1;
                            break;
                    }
                    if (b7 != 0) {
                        if (b7 == 1) {
                            i7 = 4;
                        } else if (b7 == 2 || b7 == 3) {
                            i7 = 2;
                        } else if (b7 == 4) {
                            i7 = 3;
                        } else if (b7 != 5) {
                            zzds.zzc("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            i7 = 2;
                        } else {
                            i7 = 5;
                        }
                    }
                    zzallVar.zzd = i7;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf2 = strGroup2.indexOf(44);
                    if (iIndexOf2 != -1) {
                        String strSubstring2 = strGroup2.substring(iIndexOf2 + 1);
                        switch (strSubstring2) {
                            case "line-left":
                                b9 = 0;
                                break;
                            case "center":
                                b9 = 2;
                                break;
                            case "line-right":
                                b9 = 4;
                                break;
                            case "middle":
                                b9 = 3;
                                break;
                            case "end":
                                b9 = 5;
                                break;
                            case "start":
                                b9 = 1;
                                break;
                            default:
                                b9 = -1;
                                break;
                        }
                        if (b9 == 0 || b9 == 1) {
                            i7 = 0;
                        } else if (b9 != 2 && b9 != 3) {
                            if (b9 == 4 || b9 == 5) {
                                i7 = 2;
                            } else {
                                zzds.zzc("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring2));
                                i7 = Integer.MIN_VALUE;
                            }
                        }
                        zzallVar.zzi = i7;
                        strGroup2 = strGroup2.substring(0, iIndexOf2);
                    }
                    zzallVar.zzh = zzalo.zzb(strGroup2);
                } else if ("size".equals(strGroup)) {
                    zzallVar.zzj = zzalo.zzb(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    int iHashCode = strGroup2.hashCode();
                    if (iHashCode != 3462) {
                        if (iHashCode == 3642 && strGroup2.equals("rl")) {
                            b8 = 0;
                        } else {
                            b8 = -1;
                        }
                    } else if (strGroup2.equals("lr")) {
                        b8 = 1;
                    } else {
                        b8 = -1;
                    }
                    if (b8 != 0) {
                        if (b8 != 1) {
                            zzds.zzc("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i7 = Integer.MIN_VALUE;
                        } else {
                            i7 = 2;
                        }
                    }
                    zzallVar.zzk = i7;
                } else {
                    StringBuilder sb = new StringBuilder(strGroup.length() + 21 + strGroup2.length());
                    sb.append("Unknown cue setting ");
                    sb.append(strGroup);
                    sb.append(":");
                    sb.append(strGroup2);
                    zzds.zzc("WebvttCueParser", sb.toString());
                }
            } catch (NumberFormatException unused) {
                zzds.zzc("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    private static void zzf(String str, zzalj zzaljVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        byte b7;
        int i7 = zzaljVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzaljVar.zza;
        int iHashCode = str2.hashCode();
        int i8 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode != 3511770) {
                        if (iHashCode != 98) {
                            if (iHashCode != 99) {
                                if (iHashCode != 117) {
                                    if (iHashCode == 118 && str2.equals("v")) {
                                        b7 = 5;
                                    } else {
                                        b7 = -1;
                                    }
                                } else if (str2.equals("u")) {
                                    b7 = 3;
                                } else {
                                    b7 = -1;
                                }
                            } else if (str2.equals("c")) {
                                b7 = 4;
                            } else {
                                b7 = -1;
                            }
                        } else if (str2.equals("b")) {
                            b7 = 0;
                        } else {
                            b7 = -1;
                        }
                    } else if (str2.equals("ruby")) {
                        b7 = 2;
                    } else {
                        b7 = -1;
                    }
                } else if (str2.equals("lang")) {
                    b7 = 6;
                } else {
                    b7 = -1;
                }
            } else if (str2.equals("i")) {
                b7 = 1;
            } else {
                b7 = -1;
            }
        } else if (str2.equals("")) {
            b7 = 7;
        } else {
            b7 = -1;
        }
        switch (b7) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i7, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i7, length, 33);
                break;
            case 2:
                int iZzg = zzg(list2, str, zzaljVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, zzali.zza);
                int i9 = i7;
                int i10 = 0;
                int length2 = 0;
                while (i10 < arrayList.size()) {
                    if ("rt".equals(((zzali) arrayList.get(i10)).zzc().zza)) {
                        zzali zzaliVar = (zzali) arrayList.get(i10);
                        int iZzg2 = zzg(list2, str, zzaliVar.zzc());
                        if (iZzg2 == i8) {
                            iZzg2 = iZzg != i8 ? iZzg : 1;
                        }
                        int i11 = zzaliVar.zzc().zzb - length2;
                        int iZzd = zzaliVar.zzd() - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i11, iZzd);
                        spannableStringBuilder.delete(i11, iZzd);
                        spannableStringBuilder.setSpan(new zzcq(charSequenceSubSequence.toString(), iZzg2), i9, i11, 33);
                        length2 += charSequenceSubSequence.length();
                        i9 = i11;
                    }
                    i10++;
                    i8 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i7, length, 33);
                break;
            case 4:
                for (String str3 : zzaljVar.zzd) {
                    Map map = zzc;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i7, length, 33);
                    } else {
                        Map map2 = zzd;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i7, length, 33);
                        }
                    }
                }
                break;
            case 5:
                spannableStringBuilder.setSpan(new zzct(zzaljVar.zzc), i7, length, 33);
                break;
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List listZzh = zzh(list2, str, zzaljVar);
        for (int i12 = 0; i12 < listZzh.size(); i12++) {
            zzalf zzalfVar = ((zzalk) listZzh.get(i12)).zzb;
            if (zzalfVar != null) {
                if (zzalfVar.zzf() != -1) {
                    zzcr.zza(spannableStringBuilder, new StyleSpan(zzalfVar.zzf()), i7, length, 33);
                }
                if (zzalfVar.zzg()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i7, length, 33);
                }
                if (zzalfVar.zzo()) {
                    zzcr.zza(spannableStringBuilder, new ForegroundColorSpan(zzalfVar.zzm()), i7, length, 33);
                }
                if (zzalfVar.zzr()) {
                    zzcr.zza(spannableStringBuilder, new BackgroundColorSpan(zzalfVar.zzp()), i7, length, 33);
                }
                if (zzalfVar.zzk() != null) {
                    zzcr.zza(spannableStringBuilder, new TypefaceSpan(zzalfVar.zzk()), i7, length, 33);
                }
                int iZzu = zzalfVar.zzu();
                if (iZzu == 1) {
                    zzcr.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzalfVar.zzv(), true), i7, length, 33);
                } else if (iZzu == 2) {
                    zzcr.zza(spannableStringBuilder, new RelativeSizeSpan(zzalfVar.zzv()), i7, length, 33);
                } else if (iZzu == 3) {
                    zzcr.zza(spannableStringBuilder, new RelativeSizeSpan(zzalfVar.zzv() / 100.0f), i7, length, 33);
                }
                if (zzalfVar.zzz()) {
                    spannableStringBuilder.setSpan(new zzcp(), i7, length, 33);
                }
            }
        }
    }

    private static int zzg(List list, String str, zzalj zzaljVar) {
        List listZzh = zzh(list, str, zzaljVar);
        for (int i7 = 0; i7 < listZzh.size(); i7++) {
            zzalf zzalfVar = ((zzalk) listZzh.get(i7)).zzb;
            if (zzalfVar.zzx() != -1) {
                return zzalfVar.zzx();
            }
        }
        return -1;
    }

    private static List zzh(List list, String str, zzalj zzaljVar) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            zzalf zzalfVar = (zzalf) list.get(i7);
            int iZze = zzalfVar.zze(str, zzaljVar.zza, zzaljVar.zzd, zzaljVar.zzc);
            if (iZze > 0) {
                arrayList.add(new zzalk(iZze, zzalfVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
