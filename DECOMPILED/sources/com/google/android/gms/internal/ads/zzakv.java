package com.google.android.gms.internal.ads;

import android.text.Layout;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class zzakv implements zzajv {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzakt zzh = new zzakt(30.0f, 1, 1);

    public zzakv() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.zzi = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e7) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
        }
    }

    private static String[] zzc(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        String str2 = zzeo.zza;
        return strTrim.split("\\s+", -1);
    }

    /* JADX WARN: Code duplicated, block: B:194:0x034e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v87 */
    /* JADX WARN: Type inference failed for: r7v88 */
    /* JADX WARN: Type inference failed for: r7v9 */
    private static zzaky zzd(XmlPullParser xmlPullParser, zzaky zzakyVar) {
        ?? r7;
        Matcher matcher;
        byte b7;
        int attributeCount = xmlPullParser.getAttributeCount();
        boolean z7 = false;
        zzaky zzakyVarZze = zzakyVar;
        int i7 = 0;
        while (i7 < attributeCount) {
            String attributeValue = xmlPullParser.getAttributeValue(i7);
            String attributeName = xmlPullParser.getAttributeName(i7);
            ?? r11 = -1;
             = -1;
             = -1;
             = -1;
             = -1;
            ?? r12 = -1;
             = -1;
             = -1;
            ?? r13 = -1;
             = -1;
             = -1;
             = -1;
             = -1;
             = -1;
             = -1;
            ?? r14 = -1;
            r11 = -1;
            r11 = -1;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    r7 = !attributeName.equals("fontStyle") ? -1 : 6;
                    break;
                case -1289044182:
                    r7 = !attributeName.equals("extent") ? -1 : 16;
                    break;
                case -1224696685:
                    r7 = !attributeName.equals("fontFamily") ? -1 : 3;
                    break;
                case -1065511464:
                    r7 = !attributeName.equals("textAlign") ? -1 : 7;
                    break;
                case -1008619738:
                    r7 = !attributeName.equals("origin") ? -1 : 15;
                    break;
                case -879295043:
                    r7 = !attributeName.equals("textDecoration") ? -1 : 12;
                    break;
                case -734428249:
                    r7 = !attributeName.equals("fontWeight") ? -1 : 5;
                    break;
                case 3355:
                    r7 = !attributeName.equals("id") ? -1 : z7;
                    break;
                case 3511770:
                    r7 = !attributeName.equals("ruby") ? -1 : 10;
                    break;
                case 94842723:
                    r7 = !attributeName.equals("color") ? -1 : 2;
                    break;
                case 109403361:
                    r7 = !attributeName.equals("shear") ? -1 : 14;
                    break;
                case 110138194:
                    r7 = !attributeName.equals("textCombine") ? -1 : 9;
                    break;
                case 365601008:
                    r7 = !attributeName.equals("fontSize") ? -1 : 4;
                    break;
                case 921125321:
                    r7 = !attributeName.equals("textEmphasis") ? -1 : 13;
                    break;
                case 1115953443:
                    r7 = !attributeName.equals("rubyPosition") ? -1 : 11;
                    break;
                case 1287124693:
                    r7 = !attributeName.equals("backgroundColor") ? -1 : 1;
                    break;
                case 1754920356:
                    r7 = !attributeName.equals("multiRowAlign") ? -1 : 8;
                    break;
                default:
                    r7 = -1;
                    break;
            }
            switch (r7) {
                case 0:
                    if ("style".equals(xmlPullParser.getName())) {
                        zzakyVarZze = zze(zzakyVarZze);
                        zzakyVarZze.zzs(attributeValue);
                    }
                    break;
                case 1:
                    zzakyVarZze = zze(zzakyVarZze);
                    try {
                        zzakyVarZze.zzn(zzdd.zza(attributeValue));
                    } catch (IllegalArgumentException unused) {
                        zzds.zzc("TtmlParser", "Failed parsing background value: ".concat(String.valueOf(attributeValue)));
                    }
                    break;
                case 2:
                    zzakyVarZze = zze(zzakyVarZze);
                    try {
                        zzakyVarZze.zzk(zzdd.zza(attributeValue));
                    } catch (IllegalArgumentException unused2) {
                        zzds.zzc("TtmlParser", "Failed parsing color value: ".concat(String.valueOf(attributeValue)));
                    }
                    break;
                case 3:
                    zzakyVarZze = zze(zzakyVarZze);
                    zzakyVarZze.zzi(attributeValue);
                    break;
                case 4:
                    try {
                        zzakyVarZze = zze(zzakyVarZze);
                        String str = zzeo.zza;
                        String[] strArrSplit = attributeValue.split("\\s+", -1);
                        int length = strArrSplit.length;
                        if (length == 1) {
                            matcher = zze.matcher(attributeValue);
                        } else {
                            if (length != 2) {
                                StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 41);
                                sb.append("Invalid number of entries for fontSize: ");
                                sb.append(length);
                                sb.append(".");
                                throw new zzajr(sb.toString());
                            }
                            matcher = zze.matcher(strArrSplit[1]);
                            zzds.zzc("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        }
                        if (!matcher.matches()) {
                            StringBuilder sb2 = new StringBuilder(attributeValue.length() + 36);
                            sb2.append("Invalid expression for fontSize: '");
                            sb2.append(attributeValue);
                            sb2.append("'.");
                            throw new zzajr(sb2.toString());
                        }
                        String strGroup = matcher.group(3);
                        if (strGroup == null) {
                            throw null;
                        }
                        int iHashCode = strGroup.hashCode();
                        if (iHashCode != 37) {
                            if (iHashCode != 3240) {
                                if (iHashCode == 3592 && strGroup.equals("px")) {
                                    b7 = 0;
                                } else {
                                    b7 = -1;
                                }
                            } else if (strGroup.equals("em")) {
                                b7 = 1;
                            } else {
                                b7 = -1;
                            }
                        } else if (strGroup.equals("%")) {
                            b7 = 2;
                        } else {
                            b7 = -1;
                        }
                        if (b7 == 0) {
                            zzakyVarZze.zzH(1);
                        } else if (b7 == 1) {
                            zzakyVarZze.zzH(2);
                        } else {
                            if (b7 != 2) {
                                StringBuilder sb3 = new StringBuilder(strGroup.length() + 30);
                                sb3.append("Invalid unit for fontSize: '");
                                sb3.append(strGroup);
                                sb3.append("'.");
                                throw new zzajr(sb3.toString());
                            }
                            zzakyVarZze.zzH(3);
                        }
                        String strGroup2 = matcher.group(1);
                        if (strGroup2 == null) {
                            throw null;
                        }
                        zzakyVarZze.zzG(Float.parseFloat(strGroup2));
                    } catch (zzajr unused3) {
                        zzds.zzc("TtmlParser", "Failed parsing fontSize value: ".concat(String.valueOf(attributeValue)));
                    }
                    break;
                case 5:
                    zzakyVarZze = zze(zzakyVarZze);
                    zzakyVarZze.zzf("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 6:
                    zzakyVarZze = zze(zzakyVarZze);
                    zzakyVarZze.zzg("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    zzakyVarZze = zze(zzakyVarZze);
                    zzakyVarZze.zzz(zzf(attributeValue));
                    break;
                case 8:
                    zzakyVarZze = zze(zzakyVarZze);
                    zzakyVarZze.zzB(zzf(attributeValue));
                    break;
                case 9:
                    String strZza = zzggj.zza(attributeValue);
                    int iHashCode2 = strZza.hashCode();
                    if (iHashCode2 != 96673) {
                        if (iHashCode2 == 3387192 && strZza.equals("none")) {
                            r11 = z7;
                        }
                    } else if (strZza.equals("all")) {
                        r11 = 1;
                    }
                    if (r11 == 0) {
                        zzakyVarZze = zze(zzakyVarZze);
                        zzakyVarZze.zzD(z7);
                    } else if (r11 == 1) {
                        zzakyVarZze = zze(zzakyVarZze);
                        zzakyVarZze.zzD(true);
                    }
                    break;
                case 10:
                    String strZza2 = zzggj.zza(attributeValue);
                    switch (strZza2.hashCode()) {
                        case -618561360:
                            if (strZza2.equals("baseContainer")) {
                                r14 = 2;
                            }
                            break;
                        case -410956671:
                            if (strZza2.equals("container")) {
                                r14 = z7;
                            }
                            break;
                        case -250518009:
                            if (strZza2.equals("delimiter")) {
                                r14 = 5;
                            }
                            break;
                        case -136074796:
                            if (strZza2.equals("textContainer")) {
                                r14 = 4;
                            }
                            break;
                        case 3016401:
                            if (strZza2.equals("base")) {
                                r14 = 1;
                            }
                            break;
                        case 3556653:
                            if (strZza2.equals("text")) {
                                r14 = 3;
                            }
                            break;
                    }
                    if (r14 == 0) {
                        zzakyVarZze = zze(zzakyVarZze);
                        zzakyVarZze.zzu(1);
                    } else if (r14 == 1 || r14 == 2) {
                        zzakyVarZze = zze(zzakyVarZze);
                        zzakyVarZze.zzu(2);
                    } else if (r14 == 3 || r14 == 4) {
                        zzakyVarZze = zze(zzakyVarZze);
                        zzakyVarZze.zzu(3);
                    } else if (r14 == 5) {
                        zzakyVarZze = zze(zzakyVarZze);
                        zzakyVarZze.zzu(4);
                    }
                    break;
                case 11:
                    String strZza3 = zzggj.zza(attributeValue);
                    int iHashCode3 = strZza3.hashCode();
                    if (iHashCode3 != -1392885889) {
                        if (iHashCode3 == 92734940 && strZza3.equals("after")) {
                            r13 = 1;
                        }
                    } else if (strZza3.equals("before")) {
                        r13 = z7;
                    }
                    if (r13 == 0) {
                        zzakyVarZze = zze(zzakyVarZze);
                        zzakyVarZze.zzw(1);
                    } else if (r13 == 1) {
                        zzakyVarZze = zze(zzakyVarZze);
                        zzakyVarZze.zzw(2);
                    }
                    break;
                case 12:
                    String strZza4 = zzggj.zza(attributeValue);
                    switch (strZza4.hashCode()) {
                        case -1461280213:
                            if (strZza4.equals("nounderline")) {
                                r12 = 3;
                            }
                            break;
                        case -1026963764:
                            if (strZza4.equals("underline")) {
                                r12 = 2;
                            }
                            break;
                        case 913457136:
                            if (strZza4.equals("nolinethrough")) {
                                r12 = 1;
                            }
                            break;
                        case 1679736913:
                            if (strZza4.equals("linethrough")) {
                                r12 = z7;
                            }
                            break;
                    }
                    if (r12 == 0) {
                        zzakyVarZze = zze(zzakyVarZze);
                        zzakyVarZze.zzc(true);
                    } else if (r12 == 1) {
                        zzakyVarZze = zze(zzakyVarZze);
                        zzakyVarZze.zzc(z7);
                    } else if (r12 == 2) {
                        zzakyVarZze = zze(zzakyVarZze);
                        zzakyVarZze.zze(true);
                    } else if (r12 == 3) {
                        zzakyVarZze = zze(zzakyVarZze);
                        zzakyVarZze.zze(z7);
                    }
                    break;
                case 13:
                    zzakyVarZze = zze(zzakyVarZze);
                    zzakyVarZze.zzF(zzakr.zza(attributeValue));
                    break;
                case 14:
                    zzaky zzakyVarZze2 = zze(zzakyVarZze);
                    Matcher matcher2 = zza.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher2.matches()) {
                        try {
                            String strGroup3 = matcher2.group(1);
                            if (strGroup3 == null) {
                                throw null;
                            }
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup3)));
                        } catch (NumberFormatException e7) {
                            zzds.zzd("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e7);
                        }
                    } else {
                        zzds.zzc("TtmlParser", "Invalid value for shear: ".concat(String.valueOf(attributeValue)));
                    }
                    zzakyVarZze2.zzp(fMin);
                    zzakyVarZze = zzakyVarZze2;
                    break;
                case 15:
                    zzakyVarZze = zze(zzakyVarZze);
                    zzakyVarZze.zzK(attributeValue);
                    break;
                case 16:
                    zzakyVarZze = zze(zzakyVarZze);
                    zzakyVarZze.zzM(attributeValue);
                    break;
            }
            i7++;
            z7 = false;
        }
        return zzakyVarZze;
    }

    private static zzaky zze(zzaky zzakyVar) {
        return zzakyVar == null ? new zzaky() : zzakyVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    private static Layout.Alignment zzf(String str) {
        byte b7;
        switch (zzggj.zza(str)) {
            case "center":
                b7 = 4;
                break;
            case "end":
                b7 = 3;
                break;
            case "left":
                b7 = 0;
                break;
            case "right":
                b7 = 2;
                break;
            case "start":
                b7 = 1;
                break;
            default:
                b7 = -1;
                break;
        }
        if (b7 == 0 || b7 == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (b7 == 2 || b7 == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (b7 != 4) {
            return null;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f2  */
    private static long zzg(String str, zzakt zzaktVar) throws zzajr {
        double d7;
        double d8;
        Matcher matcher = zzc.matcher(str);
        byte b7 = 2;
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            long j7 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            long j8 = Long.parseLong(strGroup2) * 60;
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d9 = j7 + j8;
            double d10 = Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d11 = 0.0d;
            double d12 = strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d;
            double d13 = d9 + d10;
            String strGroup5 = matcher.group(5);
            double d14 = strGroup5 != null ? Long.parseLong(strGroup5) / zzaktVar.zza : 0.0d;
            double d15 = d13 + d12;
            String strGroup6 = matcher.group(6);
            if (strGroup6 != null) {
                d11 = (Long.parseLong(strGroup6) / ((double) zzaktVar.zzb)) / ((double) zzaktVar.zza);
            }
            return (long) ((d15 + d14 + d11) * 1000000.0d);
        }
        Matcher matcher2 = zzd.matcher(str);
        if (!matcher2.matches()) {
            throw new zzajr("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d16 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        int iHashCode = strGroup8.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode != 115) {
                            if (iHashCode == 116 && strGroup8.equals("t")) {
                                b7 = 5;
                            } else {
                                b7 = -1;
                            }
                        } else if (!strGroup8.equals("s")) {
                            b7 = -1;
                        }
                    } else if (strGroup8.equals("ms")) {
                        b7 = 3;
                    } else {
                        b7 = -1;
                    }
                } else if (strGroup8.equals("m")) {
                    b7 = 1;
                } else {
                    b7 = -1;
                }
            } else if (strGroup8.equals("h")) {
                b7 = 0;
            } else {
                b7 = -1;
            }
        } else if (strGroup8.equals("f")) {
            b7 = 4;
        } else {
            b7 = -1;
        }
        if (b7 != 0) {
            if (b7 != 1) {
                if (b7 == 3) {
                    d8 = 1000.0d;
                } else if (b7 == 4) {
                    d8 = zzaktVar.zza;
                } else if (b7 == 5) {
                    d8 = zzaktVar.zzc;
                }
                d16 /= d8;
            } else {
                d7 = 60.0d;
            }
            return (long) (d16 * 1000000.0d);
        }
        d7 = 3600.0d;
        d16 *= d7;
        return (long) (d16 * 1000000.0d);
    }

    @Override // com.google.android.gms.internal.ads.zzajv
    public final void zza(byte[] bArr, int i7, int i8, zzaju zzajuVar, zzdf zzdfVar) {
        zzajp.zza(zzb(bArr, i7, i8), zzajuVar, zzdfVar);
    }

    /* JADX WARN: Code duplicated, block: B:151:0x0315 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TRY_LEAVE, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075a, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x062f, B:345:0x0671, B:386:0x06ec, B:333:0x0642, B:336:0x064c, B:340:0x065a, B:343:0x0661, B:344:0x0669, B:350:0x0688, B:354:0x0694, B:358:0x069d, B:366:0x06af, B:375:0x06c7, B:377:0x06d3, B:379:0x06d8, B:370:0x06b8, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070a, B:392:0x0718, B:395:0x071c, B:397:0x0726, B:399:0x0730, B:401:0x0737, B:402:0x0738, B:405:0x074b, B:408:0x0758, B:413:0x0776), top: B:440:0x0009, inners: #5, #8, #12, #13, #14 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x032b  */
    /* JADX WARN: Code duplicated, block: B:156:0x0334 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, NumberFormatException -> 0x034c, TryCatch #14 {NumberFormatException -> 0x034c, blocks: (B:154:0x032e, B:156:0x0334, B:158:0x0341, B:159:0x034a, B:160:0x034b), top: B:439:0x032e, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x0341 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, NumberFormatException -> 0x034c, TryCatch #14 {NumberFormatException -> 0x034c, blocks: (B:154:0x032e, B:156:0x0334, B:158:0x0341, B:159:0x034a, B:160:0x034b), top: B:439:0x032e, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x0357 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075a, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x062f, B:345:0x0671, B:386:0x06ec, B:333:0x0642, B:336:0x064c, B:340:0x065a, B:343:0x0661, B:344:0x0669, B:350:0x0688, B:354:0x0694, B:358:0x069d, B:366:0x06af, B:375:0x06c7, B:377:0x06d3, B:379:0x06d8, B:370:0x06b8, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070a, B:392:0x0718, B:395:0x071c, B:397:0x0726, B:399:0x0730, B:401:0x0737, B:402:0x0738, B:405:0x074b, B:408:0x0758, B:413:0x0776), top: B:440:0x0009, inners: #5, #8, #12, #13, #14 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x035f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x0361 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TRY_LEAVE, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075a, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x062f, B:345:0x0671, B:386:0x06ec, B:333:0x0642, B:336:0x064c, B:340:0x065a, B:343:0x0661, B:344:0x0669, B:350:0x0688, B:354:0x0694, B:358:0x069d, B:366:0x06af, B:375:0x06c7, B:377:0x06d3, B:379:0x06d8, B:370:0x06b8, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070a, B:392:0x0718, B:395:0x071c, B:397:0x0726, B:399:0x0730, B:401:0x0737, B:402:0x0738, B:405:0x074b, B:408:0x0758, B:413:0x0776), top: B:440:0x0009, inners: #5, #8, #12, #13, #14 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x0369  */
    /* JADX WARN: Code duplicated, block: B:171:0x0370 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, NumberFormatException -> 0x038f, TryCatch #13 {NumberFormatException -> 0x038f, blocks: (B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e), top: B:438:0x036a, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x037b A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, NumberFormatException -> 0x038f, TryCatch #13 {NumberFormatException -> 0x038f, blocks: (B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e), top: B:438:0x036a, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x0397 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075a, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x062f, B:345:0x0671, B:386:0x06ec, B:333:0x0642, B:336:0x064c, B:340:0x065a, B:343:0x0661, B:344:0x0669, B:350:0x0688, B:354:0x0694, B:358:0x069d, B:366:0x06af, B:375:0x06c7, B:377:0x06d3, B:379:0x06d8, B:370:0x06b8, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070a, B:392:0x0718, B:395:0x071c, B:397:0x0726, B:399:0x0730, B:401:0x0737, B:402:0x0738, B:405:0x074b, B:408:0x0758, B:413:0x0776), top: B:440:0x0009, inners: #5, #8, #12, #13, #14 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x039f  */
    /* JADX WARN: Code duplicated, block: B:187:0x03c2 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TRY_LEAVE, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075a, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x062f, B:345:0x0671, B:386:0x06ec, B:333:0x0642, B:336:0x064c, B:340:0x065a, B:343:0x0661, B:344:0x0669, B:350:0x0688, B:354:0x0694, B:358:0x069d, B:366:0x06af, B:375:0x06c7, B:377:0x06d3, B:379:0x06d8, B:370:0x06b8, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070a, B:392:0x0718, B:395:0x071c, B:397:0x0726, B:399:0x0730, B:401:0x0737, B:402:0x0738, B:405:0x074b, B:408:0x0758, B:413:0x0776), top: B:440:0x0009, inners: #5, #8, #12, #13, #14 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:192:0x03db A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, NumberFormatException -> 0x03f5, TryCatch #8 {NumberFormatException -> 0x03f5, blocks: (B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:195:0x03f3, B:196:0x03f4), top: B:432:0x03d5, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x03e8 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, NumberFormatException -> 0x03f5, TryCatch #8 {NumberFormatException -> 0x03f5, blocks: (B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:195:0x03f3, B:196:0x03f4), top: B:432:0x03d5, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x0402 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075a, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x062f, B:345:0x0671, B:386:0x06ec, B:333:0x0642, B:336:0x064c, B:340:0x065a, B:343:0x0661, B:344:0x0669, B:350:0x0688, B:354:0x0694, B:358:0x069d, B:366:0x06af, B:375:0x06c7, B:377:0x06d3, B:379:0x06d8, B:370:0x06b8, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070a, B:392:0x0718, B:395:0x071c, B:397:0x0726, B:399:0x0730, B:401:0x0737, B:402:0x0738, B:405:0x074b, B:408:0x0758, B:413:0x0776), top: B:440:0x0009, inners: #5, #8, #12, #13, #14 }] */
    /* JADX WARN: Code duplicated, block: B:200:0x0408 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:201:0x040a A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TRY_LEAVE, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075a, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x062f, B:345:0x0671, B:386:0x06ec, B:333:0x0642, B:336:0x064c, B:340:0x065a, B:343:0x0661, B:344:0x0669, B:350:0x0688, B:354:0x0694, B:358:0x069d, B:366:0x06af, B:375:0x06c7, B:377:0x06d3, B:379:0x06d8, B:370:0x06b8, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070a, B:392:0x0718, B:395:0x071c, B:397:0x0726, B:399:0x0730, B:401:0x0737, B:402:0x0738, B:405:0x074b, B:408:0x0758, B:413:0x0776), top: B:440:0x0009, inners: #5, #8, #12, #13, #14 }] */
    /* JADX WARN: Code duplicated, block: B:203:0x0417  */
    /* JADX WARN: Code duplicated, block: B:206:0x041e A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, NumberFormatException -> 0x043f, TryCatch #5 {NumberFormatException -> 0x043f, blocks: (B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e), top: B:427:0x0418, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:208:0x0429 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, NumberFormatException -> 0x043f, TryCatch #5 {NumberFormatException -> 0x043f, blocks: (B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e), top: B:427:0x0418, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:212:0x044c A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075a, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x062f, B:345:0x0671, B:386:0x06ec, B:333:0x0642, B:336:0x064c, B:340:0x065a, B:343:0x0661, B:344:0x0669, B:350:0x0688, B:354:0x0694, B:358:0x069d, B:366:0x06af, B:375:0x06c7, B:377:0x06d3, B:379:0x06d8, B:370:0x06b8, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070a, B:392:0x0718, B:395:0x071c, B:397:0x0726, B:399:0x0730, B:401:0x0737, B:402:0x0738, B:405:0x074b, B:408:0x0758, B:413:0x0776), top: B:440:0x0009, inners: #5, #8, #12, #13, #14 }] */
    /* JADX WARN: Code duplicated, block: B:213:0x0459  */
    /* JADX WARN: Code duplicated, block: B:216:0x0465 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TRY_LEAVE, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075a, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x062f, B:345:0x0671, B:386:0x06ec, B:333:0x0642, B:336:0x064c, B:340:0x065a, B:343:0x0661, B:344:0x0669, B:350:0x0688, B:354:0x0694, B:358:0x069d, B:366:0x06af, B:375:0x06c7, B:377:0x06d3, B:379:0x06d8, B:370:0x06b8, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070a, B:392:0x0718, B:395:0x071c, B:397:0x0726, B:399:0x0730, B:401:0x0737, B:402:0x0738, B:405:0x074b, B:408:0x0758, B:413:0x0776), top: B:440:0x0009, inners: #5, #8, #12, #13, #14 }] */
    /* JADX WARN: Code duplicated, block: B:219:0x0472  */
    /* JADX WARN: Code duplicated, block: B:225:0x0482  */
    /* JADX WARN: Code duplicated, block: B:227:0x048a  */
    /* JADX WARN: Code duplicated, block: B:228:0x048d  */
    /* JADX WARN: Code duplicated, block: B:230:0x0490  */
    /* JADX WARN: Code duplicated, block: B:232:0x0493  */
    /* JADX WARN: Code duplicated, block: B:233:0x0498  */
    /* JADX WARN: Code duplicated, block: B:234:0x049f  */
    /* JADX WARN: Code duplicated, block: B:238:0x04b3 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TRY_LEAVE, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075a, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x062f, B:345:0x0671, B:386:0x06ec, B:333:0x0642, B:336:0x064c, B:340:0x065a, B:343:0x0661, B:344:0x0669, B:350:0x0688, B:354:0x0694, B:358:0x069d, B:366:0x06af, B:375:0x06c7, B:377:0x06d3, B:379:0x06d8, B:370:0x06b8, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070a, B:392:0x0718, B:395:0x071c, B:397:0x0726, B:399:0x0730, B:401:0x0737, B:402:0x0738, B:405:0x074b, B:408:0x0758, B:413:0x0776), top: B:440:0x0009, inners: #5, #8, #12, #13, #14 }] */
    /* JADX WARN: Code duplicated, block: B:241:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:243:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:249:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:251:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:252:0x04de  */
    /* JADX WARN: Code duplicated, block: B:254:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:255:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:261:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:263:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:285:0x0565 A[LOOP:1: B:121:0x027a->B:285:0x0565, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:296:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:379:0x06d8 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, zzajr -> 0x06dc, TRY_LEAVE, TryCatch #6 {zzajr -> 0x06dc, blocks: (B:377:0x06d3, B:379:0x06d8), top: B:428:0x06d3 }] */
    /* JADX WARN: Code duplicated, block: B:446:0x034b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:447:0x034a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x038e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:0x038d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:450:0x03f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:451:0x03f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x043e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:0x043d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x055e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v70, types: [com.google.android.gms.internal.ads.zzakw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v17 */
    /* JADX WARN: Type inference failed for: r22v18 */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v20 */
    /* JADX WARN: Type inference failed for: r22v21 */
    /* JADX WARN: Type inference failed for: r22v22 */
    /* JADX WARN: Type inference failed for: r22v23 */
    /* JADX WARN: Type inference failed for: r22v24 */
    /* JADX WARN: Type inference failed for: r22v25 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r51v1, types: [com.google.android.gms.internal.ads.zzaky, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.google.android.gms.internal.ads.zzaku] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v24 */
    public final zzajq zzb(byte[] bArr, int i7, int i8) {
        String str;
        String str2;
        HashMap map;
        ArrayDeque arrayDeque;
        int i9;
        ?? r22;
        ?? zzakuVar;
        zzakt zzaktVar;
        zzaks zzaksVar;
        zzaks zzaksVar2;
        long j7;
        zzaks zzaksVarZzb;
        long j8;
        Object obj;
        byte b7;
        String str3;
        String str4;
        String strZzc;
        String str5;
        String strZzL;
        String str6;
        HashMap map2;
        String str7;
        float f7;
        float f8;
        ?? zzakwVar;
        String strZzc2;
        float f9;
        float f10;
        String strZzc3;
        float f11;
        int i10;
        String strZzc4;
        int i11;
        String strZza;
        int iHashCode;
        byte b8;
        String strZza2;
        int iHashCode2;
        byte b9;
        Matcher matcher;
        Matcher matcher2;
        String strGroup;
        int i12;
        String strGroup2;
        String strGroup3;
        float f12;
        String strGroup4;
        String strZzc5;
        zzaky zzakyVar;
        Matcher matcher3;
        Matcher matcher4;
        String strGroup5;
        int i13;
        String strGroup6;
        String strGroup7;
        float f13;
        String strGroup8;
        zzaky zzakyVar2;
        String str8;
        float f14;
        boolean z7;
        int i14 = 1;
        String str9 = "";
        String str10 = "http://www.w3.org/ns/ttml#parameter";
        String str11 = "Ignoring unsupported tag: ";
        try {
            XmlPullParser xmlPullParserNewPullParser = this.zzi.newPullParser();
            HashMap map3 = new HashMap();
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            map4.put("", new zzakw("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            Object obj2 = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i7, i8), null);
            ArrayDeque arrayDeque2 = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            zzakt zzaktVar2 = zzh;
            zzakz zzakzVar = null;
            ?? r23 = 0;
            zzakt zzaktVar3 = zzaktVar2;
            int i15 = 15;
            int i16 = 0;
            while (eventType != i14) {
                zzaks zzaksVar3 = (zzaks) arrayDeque2.peek();
                if (i16 == 0) {
                    ?? r51 = obj2;
                    String name = xmlPullParserNewPullParser.getName();
                    int i17 = i14;
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            String attributeValue = xmlPullParserNewPullParser.getAttributeValue(str10, "frameRate");
                            int i18 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            str = str9;
                            String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(str10, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                String str12 = zzeo.zza;
                                String[] strArrSplit = attributeValue2.split(" ", -1);
                                zzghc.zzb(strArrSplit.length == 2 ? i17 : 0, "frameRateMultiplier doesn't have 2 parts");
                                f14 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[i17]);
                            } else {
                                f14 = 1.0f;
                            }
                            int i19 = zzaktVar2.zzb;
                            String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(str10, "subFrameRate");
                            if (attributeValue3 != null) {
                                i19 = Integer.parseInt(attributeValue3);
                            }
                            int i20 = zzaktVar2.zzc;
                            float f15 = f14;
                            String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue(str10, "tickRate");
                            if (attributeValue4 != null) {
                                i20 = Integer.parseInt(attributeValue4);
                            }
                            zzakt zzaktVar4 = new zzakt(i18 * f15, i19, i20);
                            String attributeValue5 = xmlPullParserNewPullParser.getAttributeValue(str10, "cellResolution");
                            if (attributeValue5 == null) {
                                str2 = str10;
                                zzaktVar3 = zzaktVar4;
                                zzaktVar2 = zzaktVar2;
                                i15 = 15;
                            } else {
                                Matcher matcher5 = zzg.matcher(attributeValue5);
                                if (matcher5.matches()) {
                                    str2 = str10;
                                    try {
                                        String strGroup9 = matcher5.group(i17);
                                        if (strGroup9 == null) {
                                            throw r51;
                                        }
                                        int i21 = Integer.parseInt(strGroup9);
                                        zzaktVar3 = zzaktVar4;
                                        try {
                                            String strGroup10 = matcher5.group(2);
                                            if (strGroup10 == null) {
                                                throw r51;
                                            }
                                            int i22 = Integer.parseInt(strGroup10);
                                            if (i21 == 0) {
                                                z7 = false;
                                            } else if (i22 != 0) {
                                                z7 = true;
                                            } else {
                                                i22 = 0;
                                                z7 = false;
                                            }
                                            try {
                                                zzghc.zzg(z7, "Invalid cell resolution %s %s", i21, i22);
                                                i15 = i22;
                                            } catch (NumberFormatException unused) {
                                                zzds.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                                i15 = 15;
                                            }
                                        } catch (NumberFormatException unused2) {
                                            zzaktVar2 = zzaktVar2;
                                        }
                                    } catch (NumberFormatException unused3) {
                                        zzaktVar3 = zzaktVar4;
                                    }
                                    zzaktVar2 = zzaktVar2;
                                    zzds.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    i15 = 15;
                                } else {
                                    zzds.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    str2 = str10;
                                    zzaktVar3 = zzaktVar4;
                                    zzaktVar2 = zzaktVar2;
                                    i15 = 15;
                                }
                            }
                            String strZzc6 = zzep.zzc(xmlPullParserNewPullParser, "extent");
                            if (strZzc6 == null) {
                                zzakuVar = r51;
                            } else {
                                Matcher matcher6 = zzf.matcher(strZzc6);
                                if (matcher6.matches()) {
                                    try {
                                        String strGroup11 = matcher6.group(1);
                                        if (strGroup11 == null) {
                                            throw r51;
                                        }
                                        int i23 = Integer.parseInt(strGroup11);
                                        String strGroup12 = matcher6.group(2);
                                        if (strGroup12 == null) {
                                            throw r51;
                                        }
                                        zzakuVar = new zzaku(i23, Integer.parseInt(strGroup12));
                                    } catch (NumberFormatException unused4) {
                                        zzds.zzc("TtmlParser", "Ignoring malformed tts extent: ".concat(strZzc6));
                                        zzakuVar = r51;
                                    }
                                } else {
                                    zzds.zzc("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strZzc6));
                                }
                                zzakuVar = r51;
                            }
                            xmlPullParserNewPullParser.next();
                            eventType = xmlPullParserNewPullParser.getEventType();
                            map4 = map;
                            arrayDeque2 = arrayDeque;
                            i14 = i9;
                            str9 = str;
                            str10 = str2;
                            zzaktVar2 = zzaktVar2;
                            str11 = str11;
                            obj2 = null;
                            r23 = r23;
                        } else {
                            str = str9;
                            str2 = str10;
                            arrayDeque2 = arrayDeque2;
                            zzaktVar2 = zzaktVar2;
                            zzakuVar = r23;
                        }
                        ?? r7 = zzakuVar;
                        i15 = i15;
                        String str13 = "image";
                        String str14 = "metadata";
                        String str15 = "region";
                        String str16 = "head";
                        zzaktVar3 = zzaktVar3;
                        if (name.equals("tt") || name.equals("head") || name.equals("body") || name.equals("div") || name.equals("p") || name.equals("span") || name.equals("br") || name.equals("style") || name.equals("styling") || name.equals("layout") || name.equals("region") || name.equals("metadata") || name.equals("image") || name.equals("data") || name.equals("information")) {
                            if ("head".equals(name)) {
                                while (true) {
                                    xmlPullParserNewPullParser.next();
                                    if (zzep.zzb(xmlPullParserNewPullParser, "style")) {
                                        String strZzc7 = zzep.zzc(xmlPullParserNewPullParser, "style");
                                        zzaky zzakyVarZzd = zzd(xmlPullParserNewPullParser, new zzaky());
                                        if (strZzc7 != null) {
                                            String[] strArrZzc = zzc(strZzc7);
                                            int length = strArrZzc.length;
                                            int i24 = 0;
                                            while (i24 < length) {
                                                int i25 = i24;
                                                zzakyVarZzd.zzr((zzaky) map3.get(strArrZzc[i25]));
                                                i24 = i25 + 1;
                                            }
                                        }
                                        String strZzt = zzakyVarZzd.zzt();
                                        if (strZzt != null) {
                                            map3.put(strZzt, zzakyVarZzd);
                                        }
                                        map = map4;
                                        str3 = str14;
                                        str4 = str15;
                                    } else {
                                        str16 = str16;
                                        str11 = str11;
                                        if (zzep.zzb(xmlPullParserNewPullParser, str15)) {
                                            str4 = str15;
                                            HashMap map6 = map5;
                                            String strZzc8 = zzep.zzc(xmlPullParserNewPullParser, "id");
                                            if (strZzc8 == null) {
                                                zzakwVar = r51;
                                                str6 = str13;
                                                map2 = map4;
                                                str7 = str14;
                                            } else {
                                                String strZzc9 = zzep.zzc(xmlPullParserNewPullParser, "origin");
                                                if (strZzc9 == null) {
                                                    str5 = strZzc9;
                                                    String strZzc10 = zzep.zzc(xmlPullParserNewPullParser, "style");
                                                    if (strZzc10 != null && (zzakyVar2 = (zzaky) map3.get(strZzc10)) != null) {
                                                        strZzL = zzakyVar2.zzL();
                                                    }
                                                    if (strZzL != null) {
                                                        str6 = str13;
                                                        matcher3 = zzb.matcher(strZzL);
                                                        str7 = str14;
                                                        matcher4 = zzf.matcher(strZzL);
                                                        if (matcher3.matches()) {
                                                            map2 = map4;
                                                            try {
                                                                strGroup7 = matcher3.group(1);
                                                                if (strGroup7 != null) {
                                                                    throw r51;
                                                                }
                                                                f13 = Float.parseFloat(strGroup7) / 100.0f;
                                                                strGroup8 = matcher3.group(2);
                                                                if (strGroup8 != null) {
                                                                    throw r51;
                                                                }
                                                                f7 = Float.parseFloat(strGroup8) / 100.0f;
                                                                f8 = f13;
                                                            } catch (NumberFormatException unused5) {
                                                                zzds.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(strZzL));
                                                            }
                                                        } else {
                                                            map2 = map4;
                                                            if (matcher4.matches()) {
                                                                zzds.zzc("TtmlParser", "Ignoring region with unsupported origin: ".concat(strZzL));
                                                            } else if (r7 == 0) {
                                                                zzds.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZzL));
                                                            } else {
                                                                try {
                                                                    strGroup5 = matcher4.group(1);
                                                                    if (strGroup5 != null) {
                                                                        throw r51;
                                                                    }
                                                                    i13 = Integer.parseInt(strGroup5);
                                                                    strGroup6 = matcher4.group(2);
                                                                    if (strGroup6 != null) {
                                                                        throw r51;
                                                                    }
                                                                    int i26 = Integer.parseInt(strGroup6);
                                                                    float f16 = i13 / r7.zza;
                                                                    f7 = i26 / r7.zzb;
                                                                    f8 = f16;
                                                                } catch (NumberFormatException unused6) {
                                                                    zzds.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(strZzL));
                                                                }
                                                            }
                                                            zzakwVar = r51;
                                                        }
                                                        xmlPullParserNewPullParser.next();
                                                        eventType = xmlPullParserNewPullParser.getEventType();
                                                        map4 = map;
                                                        arrayDeque2 = arrayDeque;
                                                        i14 = i9;
                                                        str9 = str;
                                                        str10 = str2;
                                                        zzaktVar2 = zzaktVar2;
                                                        str11 = str11;
                                                        obj2 = null;
                                                        r23 = r23;
                                                    } else {
                                                        str6 = str13;
                                                        map2 = map4;
                                                        str7 = str14;
                                                        f7 = 0.0f;
                                                        f8 = 0.0f;
                                                    }
                                                    strZzc2 = zzep.zzc(xmlPullParserNewPullParser, "extent");
                                                    if (strZzc2 == null && (strZzc5 = zzep.zzc(xmlPullParserNewPullParser, "style")) != null && (zzakyVar = (zzaky) map3.get(strZzc5)) != null) {
                                                        strZzc2 = zzakyVar.zzN();
                                                    }
                                                    if (strZzc2 != null) {
                                                        matcher = zzb.matcher(strZzc2);
                                                        matcher2 = zzf.matcher(strZzc2);
                                                        if (matcher.matches()) {
                                                            try {
                                                                strGroup3 = matcher.group(1);
                                                                if (strGroup3 != null) {
                                                                    throw r51;
                                                                }
                                                                f12 = Float.parseFloat(strGroup3) / 100.0f;
                                                                strGroup4 = matcher.group(2);
                                                                if (strGroup4 != null) {
                                                                    throw r51;
                                                                }
                                                                f10 = Float.parseFloat(strGroup4) / 100.0f;
                                                                f9 = f12;
                                                            } catch (NumberFormatException unused7) {
                                                                zzds.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(strZzL)));
                                                                zzakwVar = r51;
                                                            }
                                                        } else {
                                                            if (matcher2.matches()) {
                                                                zzds.zzc("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(strZzL)));
                                                            } else if (r7 == 0) {
                                                                zzds.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(strZzL)));
                                                            } else {
                                                                try {
                                                                    strGroup = matcher2.group(1);
                                                                    if (strGroup != null) {
                                                                        throw r51;
                                                                    }
                                                                    i12 = Integer.parseInt(strGroup);
                                                                    strGroup2 = matcher2.group(2);
                                                                    if (strGroup2 != null) {
                                                                        throw r51;
                                                                    }
                                                                    int i27 = Integer.parseInt(strGroup2);
                                                                    float f17 = i12 / r7.zza;
                                                                    f10 = i27 / r7.zzb;
                                                                    f9 = f17;
                                                                } catch (NumberFormatException unused8) {
                                                                    zzds.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(strZzL)));
                                                                    zzakwVar = r51;
                                                                }
                                                            }
                                                            zzakwVar = r51;
                                                        }
                                                    } else {
                                                        f9 = 1.0f;
                                                        f10 = 1.0f;
                                                    }
                                                    strZzc3 = zzep.zzc(xmlPullParserNewPullParser, "displayAlign");
                                                    if (strZzc3 != null) {
                                                        strZza2 = zzggj.zza(strZzc3);
                                                        iHashCode2 = strZza2.hashCode();
                                                        if (iHashCode2 != -1364013995) {
                                                            if (iHashCode2 != 92734940 && strZza2.equals("after")) {
                                                                b9 = 1;
                                                            } else {
                                                                b9 = -1;
                                                            }
                                                        } else if (strZza2.equals("center")) {
                                                            b9 = 0;
                                                        } else {
                                                            b9 = -1;
                                                        }
                                                        if (b9 != 0) {
                                                            f11 = f7 + (f10 / 2.0f);
                                                            i10 = 1;
                                                        } else if (b9 != 1) {
                                                            f11 = f7;
                                                            i10 = 0;
                                                        } else {
                                                            f11 = f7 + f10;
                                                            i10 = 2;
                                                        }
                                                    } else {
                                                        f11 = f7;
                                                        i10 = 0;
                                                    }
                                                    float f18 = 1.0f / i15;
                                                    strZzc4 = zzep.zzc(xmlPullParserNewPullParser, "writingMode");
                                                    if (strZzc4 != null) {
                                                        strZza = zzggj.zza(strZzc4);
                                                        iHashCode = strZza.hashCode();
                                                        if (iHashCode != 3694) {
                                                            if (iHashCode != 3553396) {
                                                                if (iHashCode != 3553576 && strZza.equals("tbrl")) {
                                                                    b8 = 2;
                                                                } else {
                                                                    b8 = -1;
                                                                }
                                                            } else if (strZza.equals("tblr")) {
                                                                b8 = 1;
                                                            } else {
                                                                b8 = -1;
                                                            }
                                                        } else if (strZza.equals("tb")) {
                                                            b8 = 0;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                        if (b8 != 0 || b8 == 1) {
                                                            i11 = 2;
                                                        } else if (b8 != 2) {
                                                            i11 = Integer.MIN_VALUE;
                                                        } else {
                                                            i11 = 1;
                                                        }
                                                    } else {
                                                        i11 = Integer.MIN_VALUE;
                                                    }
                                                    zzakwVar = new zzakw(strZzc8, f8, f11, 0, i10, f9, f10, 1, f18, i11);
                                                } else {
                                                    str5 = strZzc9;
                                                }
                                                strZzL = str5;
                                                if (strZzL != null) {
                                                    str6 = str13;
                                                    matcher3 = zzb.matcher(strZzL);
                                                    str7 = str14;
                                                    matcher4 = zzf.matcher(strZzL);
                                                    if (matcher3.matches()) {
                                                        map2 = map4;
                                                        strGroup7 = matcher3.group(1);
                                                        if (strGroup7 != null) {
                                                            throw r51;
                                                        }
                                                        f13 = Float.parseFloat(strGroup7) / 100.0f;
                                                        strGroup8 = matcher3.group(2);
                                                        if (strGroup8 != null) {
                                                            throw r51;
                                                        }
                                                        f7 = Float.parseFloat(strGroup8) / 100.0f;
                                                        f8 = f13;
                                                    } else {
                                                        map2 = map4;
                                                        if (matcher4.matches()) {
                                                            zzds.zzc("TtmlParser", "Ignoring region with unsupported origin: ".concat(strZzL));
                                                        } else if (r7 == 0) {
                                                            zzds.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZzL));
                                                        } else {
                                                            strGroup5 = matcher4.group(1);
                                                            if (strGroup5 != null) {
                                                                throw r51;
                                                            }
                                                            i13 = Integer.parseInt(strGroup5);
                                                            strGroup6 = matcher4.group(2);
                                                            if (strGroup6 != null) {
                                                                throw r51;
                                                            }
                                                            int i28 = Integer.parseInt(strGroup6);
                                                            float f19 = i13 / r7.zza;
                                                            f7 = i28 / r7.zzb;
                                                            f8 = f19;
                                                        }
                                                        zzakwVar = r51;
                                                    }
                                                    xmlPullParserNewPullParser.next();
                                                    eventType = xmlPullParserNewPullParser.getEventType();
                                                    map4 = map;
                                                    arrayDeque2 = arrayDeque;
                                                    i14 = i9;
                                                    str9 = str;
                                                    str10 = str2;
                                                    zzaktVar2 = zzaktVar2;
                                                    str11 = str11;
                                                    obj2 = null;
                                                    r23 = r23;
                                                } else {
                                                    str6 = str13;
                                                    map2 = map4;
                                                    str7 = str14;
                                                    f7 = 0.0f;
                                                    f8 = 0.0f;
                                                }
                                                strZzc2 = zzep.zzc(xmlPullParserNewPullParser, "extent");
                                                if (strZzc2 == null) {
                                                    strZzc2 = zzakyVar.zzN();
                                                }
                                                if (strZzc2 != null) {
                                                    matcher = zzb.matcher(strZzc2);
                                                    matcher2 = zzf.matcher(strZzc2);
                                                    if (matcher.matches()) {
                                                        strGroup3 = matcher.group(1);
                                                        if (strGroup3 != null) {
                                                            throw r51;
                                                        }
                                                        f12 = Float.parseFloat(strGroup3) / 100.0f;
                                                        strGroup4 = matcher.group(2);
                                                        if (strGroup4 != null) {
                                                            throw r51;
                                                        }
                                                        f10 = Float.parseFloat(strGroup4) / 100.0f;
                                                        f9 = f12;
                                                    } else {
                                                        if (matcher2.matches()) {
                                                            zzds.zzc("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(strZzL)));
                                                        } else if (r7 == 0) {
                                                            zzds.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(strZzL)));
                                                        } else {
                                                            strGroup = matcher2.group(1);
                                                            if (strGroup != null) {
                                                                throw r51;
                                                            }
                                                            i12 = Integer.parseInt(strGroup);
                                                            strGroup2 = matcher2.group(2);
                                                            if (strGroup2 != null) {
                                                                throw r51;
                                                            }
                                                            int i29 = Integer.parseInt(strGroup2);
                                                            float f110 = i12 / r7.zza;
                                                            f10 = i29 / r7.zzb;
                                                            f9 = f110;
                                                        }
                                                        zzakwVar = r51;
                                                    }
                                                } else {
                                                    f9 = 1.0f;
                                                    f10 = 1.0f;
                                                }
                                                strZzc3 = zzep.zzc(xmlPullParserNewPullParser, "displayAlign");
                                                if (strZzc3 != null) {
                                                    strZza2 = zzggj.zza(strZzc3);
                                                    iHashCode2 = strZza2.hashCode();
                                                    if (iHashCode2 != -1364013995) {
                                                        if (iHashCode2 != 92734940) {
                                                            b9 = -1;
                                                        } else {
                                                            b9 = 1;
                                                        }
                                                    } else if (strZza2.equals("center")) {
                                                        b9 = 0;
                                                    } else {
                                                        b9 = -1;
                                                    }
                                                    if (b9 != 0) {
                                                        f11 = f7 + (f10 / 2.0f);
                                                        i10 = 1;
                                                    } else if (b9 != 1) {
                                                        f11 = f7;
                                                        i10 = 0;
                                                    } else {
                                                        f11 = f7 + f10;
                                                        i10 = 2;
                                                    }
                                                } else {
                                                    f11 = f7;
                                                    i10 = 0;
                                                }
                                                float f111 = 1.0f / i15;
                                                strZzc4 = zzep.zzc(xmlPullParserNewPullParser, "writingMode");
                                                if (strZzc4 != null) {
                                                    strZza = zzggj.zza(strZzc4);
                                                    iHashCode = strZza.hashCode();
                                                    if (iHashCode != 3694) {
                                                        if (iHashCode != 3553396) {
                                                            if (iHashCode != 3553576) {
                                                                b8 = -1;
                                                            } else {
                                                                b8 = 2;
                                                            }
                                                        } else if (strZza.equals("tblr")) {
                                                            b8 = 1;
                                                        } else {
                                                            b8 = -1;
                                                        }
                                                    } else if (strZza.equals("tb")) {
                                                        b8 = 0;
                                                    } else {
                                                        b8 = -1;
                                                    }
                                                    if (b8 != 0) {
                                                        i11 = 2;
                                                    } else {
                                                        i11 = 2;
                                                    }
                                                } else {
                                                    i11 = Integer.MIN_VALUE;
                                                }
                                                zzakwVar = new zzakw(strZzc8, f8, f11, 0, i10, f9, f10, 1, f111, i11);
                                            }
                                            if (zzakwVar != 0) {
                                                map = map2;
                                                map.put(zzakwVar.zza, zzakwVar);
                                            } else {
                                                map = map2;
                                            }
                                            str8 = str16;
                                            map5 = map6;
                                            str13 = str6;
                                            str3 = str7;
                                        } else {
                                            String str17 = str13;
                                            map = map4;
                                            HashMap map7 = map5;
                                            str3 = str14;
                                            str4 = str15;
                                            if (zzep.zzb(xmlPullParserNewPullParser, str3)) {
                                                while (true) {
                                                    xmlPullParserNewPullParser.next();
                                                    str13 = str17;
                                                    if (!zzep.zzb(xmlPullParserNewPullParser, str13) || (strZzc = zzep.zzc(xmlPullParserNewPullParser, "id")) == null) {
                                                        map5 = map7;
                                                    } else {
                                                        map5 = map7;
                                                        map5.put(strZzc, xmlPullParserNewPullParser.nextText());
                                                    }
                                                    if (!zzep.zza(xmlPullParserNewPullParser, str3)) {
                                                        str17 = str13;
                                                        map7 = map5;
                                                    }
                                                }
                                            } else {
                                                map5 = map7;
                                                str13 = str17;
                                            }
                                        }
                                        if (zzep.zza(xmlPullParserNewPullParser, str8)) {
                                            zzaktVar = zzaktVar3;
                                            arrayDeque = arrayDeque2;
                                        } else {
                                            str14 = str3;
                                            map4 = map;
                                            str15 = str4;
                                            str11 = str11;
                                            str16 = str8;
                                        }
                                    }
                                    str8 = str16;
                                    if (zzep.zza(xmlPullParserNewPullParser, str8)) {
                                        zzaktVar = zzaktVar3;
                                        arrayDeque = arrayDeque2;
                                    } else {
                                        str14 = str3;
                                        map4 = map;
                                        str15 = str4;
                                        str11 = str11;
                                        str16 = str8;
                                    }
                                }
                            } else {
                                str11 = str11;
                                map = map4;
                                Object obj3 = "region";
                                try {
                                    int attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                    zzaky zzakyVarZzd2 = zzd(xmlPullParserNewPullParser, r51);
                                    int i30 = 0;
                                    String str18 = str;
                                    long jZzg = -9223372036854775807L;
                                    long jZzg2 = -9223372036854775807L;
                                    long jZzg3 = -9223372036854775807L;
                                    String[] strArr = null;
                                    String strSubstring = null;
                                    while (i30 < attributeCount) {
                                        try {
                                            String attributeName = xmlPullParserNewPullParser.getAttributeName(i30);
                                            String attributeValue6 = xmlPullParserNewPullParser.getAttributeValue(i30);
                                            switch (attributeName.hashCode()) {
                                                case -934795532:
                                                    obj = obj3;
                                                    b7 = !attributeName.equals(obj) ? (byte) -1 : (byte) 4;
                                                    break;
                                                case 99841:
                                                    if (!attributeName.equals("dur")) {
                                                        obj = obj3;
                                                    } else {
                                                        obj = obj3;
                                                        b7 = 2;
                                                    }
                                                    break;
                                                case 100571:
                                                    if (!attributeName.equals("end")) {
                                                        obj = obj3;
                                                    } else {
                                                        obj = obj3;
                                                        b7 = 1;
                                                    }
                                                    break;
                                                case 93616297:
                                                    if (!attributeName.equals("begin")) {
                                                        obj = obj3;
                                                    } else {
                                                        b7 = 0;
                                                        obj = obj3;
                                                    }
                                                    break;
                                                case 109780401:
                                                    if (!attributeName.equals("style")) {
                                                        obj = obj3;
                                                    } else {
                                                        obj = obj3;
                                                        b7 = 3;
                                                    }
                                                    break;
                                                case 1292595405:
                                                    if (!attributeName.equals("backgroundImage")) {
                                                        obj = obj3;
                                                    } else {
                                                        obj = obj3;
                                                        b7 = 5;
                                                    }
                                                    break;
                                                default:
                                                    obj = obj3;
                                                    break;
                                            }
                                            if (b7 == 0) {
                                                zzaktVar = zzaktVar3;
                                                jZzg2 = zzg(attributeValue6, zzaktVar);
                                            } else if (b7 == 1) {
                                                zzaktVar = zzaktVar3;
                                                jZzg = zzg(attributeValue6, zzaktVar);
                                            } else if (b7 != 2) {
                                                if (b7 == 3) {
                                                    String[] strArrZzc2 = zzc(attributeValue6);
                                                    if (strArrZzc2.length > 0) {
                                                        strArr = strArrZzc2;
                                                    }
                                                } else if (b7 != 4) {
                                                    if (b7 == 5) {
                                                        try {
                                                            if (attributeValue6.startsWith("#")) {
                                                                strSubstring = attributeValue6.substring(1);
                                                            }
                                                        } catch (zzajr e7) {
                                                            e = e7;
                                                            zzaktVar = zzaktVar3;
                                                            arrayDeque = arrayDeque2;
                                                            zzds.zzd("TtmlParser", "Suppressing parser error", e);
                                                            zzaktVar3 = zzaktVar;
                                                            i16 = 1;
                                                            r22 = r7;
                                                            r22 = r23;
                                                            i9 = 1;
                                                            r23 = r22;
                                                            xmlPullParserNewPullParser.next();
                                                            eventType = xmlPullParserNewPullParser.getEventType();
                                                            map4 = map;
                                                            arrayDeque2 = arrayDeque;
                                                            i14 = i9;
                                                            str9 = str;
                                                            str10 = str2;
                                                            zzaktVar2 = zzaktVar2;
                                                            str11 = str11;
                                                            obj2 = null;
                                                            r23 = r23;
                                                        }
                                                    }
                                                } else if (map.containsKey(attributeValue6)) {
                                                    str18 = attributeValue6;
                                                }
                                                zzaktVar = zzaktVar3;
                                            } else {
                                                zzaktVar = zzaktVar3;
                                                jZzg3 = zzg(attributeValue6, zzaktVar);
                                            }
                                            try {
                                                i30++;
                                                obj3 = obj;
                                                zzaktVar3 = zzaktVar;
                                            } catch (zzajr e8) {
                                                e = e8;
                                                arrayDeque = arrayDeque2;
                                                zzds.zzd("TtmlParser", "Suppressing parser error", e);
                                                zzaktVar3 = zzaktVar;
                                                i16 = 1;
                                                r22 = r7;
                                                r22 = r23;
                                                i9 = 1;
                                                r23 = r22;
                                                xmlPullParserNewPullParser.next();
                                                eventType = xmlPullParserNewPullParser.getEventType();
                                                map4 = map;
                                                arrayDeque2 = arrayDeque;
                                                i14 = i9;
                                                str9 = str;
                                                str10 = str2;
                                                zzaktVar2 = zzaktVar2;
                                                str11 = str11;
                                                obj2 = null;
                                                r23 = r23;
                                            }
                                        } catch (zzajr e9) {
                                            e = e9;
                                            zzaktVar = zzaktVar3;
                                        }
                                    }
                                    zzaktVar = zzaktVar3;
                                    if (zzaksVar3 != null) {
                                        zzaksVar = zzaksVar3;
                                        long j9 = zzaksVar.zzd;
                                        if (j9 == -9223372036854775807L) {
                                            zzaksVar2 = zzaksVar;
                                        } else {
                                            jZzg2 = jZzg2 != -9223372036854775807L ? jZzg2 + j9 : -9223372036854775807L;
                                            if (jZzg != -9223372036854775807L) {
                                                jZzg += j9;
                                                zzaksVar2 = zzaksVar;
                                            } else {
                                                zzaksVar2 = zzaksVar;
                                                jZzg = -9223372036854775807L;
                                            }
                                        }
                                    } else {
                                        zzaksVar = zzaksVar3;
                                        zzaksVar2 = null;
                                    }
                                    try {
                                        if (jZzg == -9223372036854775807L) {
                                            if (jZzg3 != -9223372036854775807L) {
                                                j8 = jZzg2 + jZzg3;
                                            } else {
                                                if (zzaksVar2 != null) {
                                                    j8 = zzaksVar2.zze;
                                                    if (j8 != -9223372036854775807L) {
                                                    }
                                                    zzaksVarZzb = zzaks.zzb(xmlPullParserNewPullParser.getName(), jZzg2, j7, zzakyVarZzd2, strArr, str18, strSubstring, zzaksVar2);
                                                    arrayDeque = arrayDeque2;
                                                    arrayDeque.push(zzaksVarZzb);
                                                    if (zzaksVar != null) {
                                                        zzaksVar.zzd(zzaksVarZzb);
                                                    }
                                                }
                                                j7 = -9223372036854775807L;
                                                zzaksVarZzb = zzaks.zzb(xmlPullParserNewPullParser.getName(), jZzg2, j7, zzakyVarZzd2, strArr, str18, strSubstring, zzaksVar2);
                                                arrayDeque = arrayDeque2;
                                                arrayDeque.push(zzaksVarZzb);
                                                if (zzaksVar != null) {
                                                    zzaksVar.zzd(zzaksVarZzb);
                                                }
                                            }
                                            j7 = j8;
                                        } else {
                                            j7 = jZzg;
                                        }
                                        arrayDeque.push(zzaksVarZzb);
                                        if (zzaksVar != null) {
                                            zzaksVar.zzd(zzaksVarZzb);
                                        }
                                    } catch (zzajr e10) {
                                        e = e10;
                                        zzds.zzd("TtmlParser", "Suppressing parser error", e);
                                        zzaktVar3 = zzaktVar;
                                        i16 = 1;
                                        r22 = r7;
                                    }
                                    zzaksVarZzb = zzaks.zzb(xmlPullParserNewPullParser.getName(), jZzg2, j7, zzakyVarZzd2, strArr, str18, strSubstring, zzaksVar2);
                                    arrayDeque = arrayDeque2;
                                } catch (zzajr e11) {
                                    e = e11;
                                    zzaktVar = zzaktVar3;
                                    arrayDeque = arrayDeque2;
                                }
                            }
                            zzaktVar3 = zzaktVar;
                            r22 = r7;
                            i15 = i15;
                        } else {
                            String name2 = xmlPullParserNewPullParser.getName();
                            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 26);
                            sb.append(str11);
                            sb.append(name2);
                            zzds.zzb("TtmlParser", sb.toString());
                            str11 = str11;
                            map = map4;
                            arrayDeque = arrayDeque2;
                        }
                        i16 = 1;
                        r22 = r7;
                    } else {
                        str = str9;
                        str2 = str10;
                        str11 = str11;
                        map = map4;
                        arrayDeque = arrayDeque2;
                        zzaktVar2 = zzaktVar2;
                        if (eventType == 4) {
                            if (zzaksVar3 == null) {
                                throw null;
                            }
                            zzaksVar3.zzd(zzaks.zza(xmlPullParserNewPullParser.getText()));
                            r22 = r23;
                        } else if (eventType == 3) {
                            if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                zzaks zzaksVar4 = (zzaks) arrayDeque.peek();
                                if (zzaksVar4 == null) {
                                    r22 = r23;
                                    throw null;
                                }
                                r22 = r23;
                                zzakzVar = new zzakz(zzaksVar4, map3, map, map5);
                            }
                            r22 = r23;
                            arrayDeque.pop();
                            r22 = r23;
                        }
                    }
                    r22 = r23;
                    i9 = 1;
                    r23 = r22;
                } else {
                    str = str9;
                    str2 = str10;
                    str11 = str11;
                    map = map4;
                    arrayDeque = arrayDeque2;
                    zzaktVar2 = zzaktVar2;
                    if (eventType == 2) {
                        i9 = 1;
                        i16++;
                        r23 = r23;
                    } else {
                        i9 = 1;
                        if (eventType == 3) {
                            i16--;
                        }
                    }
                    xmlPullParserNewPullParser.next();
                    eventType = xmlPullParserNewPullParser.getEventType();
                    map4 = map;
                    arrayDeque2 = arrayDeque;
                    i14 = i9;
                    str9 = str;
                    str10 = str2;
                    zzaktVar2 = zzaktVar2;
                    str11 = str11;
                    obj2 = null;
                    r23 = r23;
                }
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                map4 = map;
                arrayDeque2 = arrayDeque;
                i14 = i9;
                str9 = str;
                str10 = str2;
                zzaktVar2 = zzaktVar2;
                str11 = str11;
                obj2 = null;
                r23 = r23;
            }
            if (zzakzVar != null) {
                return zzakzVar;
            }
            throw null;
        } catch (IOException e12) {
            throw new IllegalStateException("Unexpected error when reading input.", e12);
        } catch (XmlPullParserException e13) {
            throw new IllegalStateException("Unable to decode source", e13);
        }
    }
}
