package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
final class zzale {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzef zzc = new zzef();
    private final StringBuilder zzd = new StringBuilder();

    static void zzb(zzef zzefVar) {
        while (true) {
            for (boolean z7 = true; zzefVar.zzd() > 0 && z7; z7 = false) {
                char c7 = (char) zzefVar.zzi()[zzefVar.zzg()];
                if (c7 == '\t' || c7 == '\n' || c7 == '\f' || c7 == '\r' || c7 == ' ') {
                    zzefVar.zzk(1);
                } else {
                    int iZzg = zzefVar.zzg();
                    int iZze = zzefVar.zze();
                    byte[] bArrZzi = zzefVar.zzi();
                    if (iZzg + 2 <= iZze) {
                        int i7 = iZzg + 1;
                        if (bArrZzi[iZzg] == 47) {
                            int i8 = iZzg + 2;
                            if (bArrZzi[i7] == 42) {
                                while (true) {
                                    int i9 = i8 + 1;
                                    if (i9 >= iZze) {
                                        break;
                                    }
                                    if (((char) bArrZzi[i8]) == '*' && ((char) bArrZzi[i9]) == '/') {
                                        iZze = i8 + 2;
                                        i8 = iZze;
                                    } else {
                                        i8 = i9;
                                    }
                                }
                                zzefVar.zzk(iZze - zzefVar.zzg());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    static String zzc(zzef zzefVar, StringBuilder sb) {
        zzb(zzefVar);
        if (zzefVar.zzd() == 0) {
            return null;
        }
        String strZzd = zzd(zzefVar, sb);
        if (!strZzd.isEmpty()) {
            return strZzd;
        }
        char cZzs = (char) zzefVar.zzs();
        StringBuilder sb2 = new StringBuilder(String.valueOf(cZzs).length());
        sb2.append(cZzs);
        return sb2.toString();
    }

    private static String zzd(zzef zzefVar, StringBuilder sb) {
        char c7;
        sb.setLength(0);
        int iZzg = zzefVar.zzg();
        int iZze = zzefVar.zze();
        loop0: while (true) {
            boolean z7 = false;
            while (true) {
                if (iZzg < iZze && !z7) {
                    c7 = (char) zzefVar.zzi()[iZzg];
                    if ((c7 >= 'A' && c7 <= 'Z') || ((c7 >= 'a' && c7 <= 'z') || ((c7 >= '0' && c7 <= '9') || c7 == '#' || c7 == '-' || c7 == '.' || c7 == '_'))) {
                        break;
                    }
                    z7 = true;
                } else {
                    break loop0;
                }
            }
            sb.append(c7);
            iZzg++;
        }
        zzefVar.zzk(iZzg - zzefVar.zzg());
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:104:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:109:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:113:0x020e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0216  */
    /* JADX WARN: Code duplicated, block: B:118:0x021e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0226  */
    /* JADX WARN: Code duplicated, block: B:121:0x022b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0233  */
    /* JADX WARN: Code duplicated, block: B:124:0x0238  */
    /* JADX WARN: Code duplicated, block: B:126:0x0240  */
    /* JADX WARN: Code duplicated, block: B:128:0x0248  */
    /* JADX WARN: Code duplicated, block: B:129:0x024d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0255  */
    /* JADX WARN: Code duplicated, block: B:133:0x025d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0262  */
    /* JADX WARN: Code duplicated, block: B:136:0x026a  */
    /* JADX WARN: Code duplicated, block: B:138:0x027a  */
    /* JADX WARN: Code duplicated, block: B:139:0x029c  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:143:0x02af  */
    /* JADX WARN: Code duplicated, block: B:149:0x02be  */
    /* JADX WARN: Code duplicated, block: B:151:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:152:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:154:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:155:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x02d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:159:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:163:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:175:0x02de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x003e  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d3  */
    public final List zza(zzef zzefVar) {
        String strTrim;
        String string;
        Matcher matcher;
        String strGroup;
        int iHashCode;
        byte b7;
        boolean z7;
        int i7 = -1;
        StringBuilder sb = this.zzd;
        int i8 = 0;
        sb.setLength(0);
        int iZzg = zzefVar.zzg();
        while (!TextUtils.isEmpty(zzefVar.zzN(StandardCharsets.UTF_8))) {
        }
        zzef zzefVar2 = this.zzc;
        zzefVar2.zzb(zzefVar.zzi(), zzefVar.zzg());
        zzefVar2.zzh(iZzg);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzb(zzefVar2);
            if (zzefVar2.zzd() >= 5 && "::cue".equals(zzefVar2.zzK(5, StandardCharsets.UTF_8))) {
                int iZzg2 = zzefVar2.zzg();
                String strZzc = zzc(zzefVar2, sb);
                if (strZzc == null) {
                    strTrim = null;
                } else if ("{".equals(strZzc)) {
                    zzefVar2.zzh(iZzg2);
                    strTrim = "";
                } else {
                    if ("(".equals(strZzc)) {
                        int iZzg3 = zzefVar2.zzg();
                        int iZze = zzefVar2.zze();
                        int i9 = i8;
                        while (iZzg3 < iZze && i9 == 0) {
                            int i10 = iZzg3 + 1;
                            i9 = ((char) zzefVar2.zzi()[iZzg3]) == ')' ? 1 : i8;
                            iZzg3 = i10;
                        }
                        strTrim = zzefVar2.zzK((iZzg3 + i7) - zzefVar2.zzg(), StandardCharsets.UTF_8).trim();
                    } else {
                        strTrim = null;
                    }
                    if (!")".equals(zzc(zzefVar2, sb))) {
                        strTrim = null;
                    }
                }
            } else {
                strTrim = null;
            }
            if (strTrim == null || !"{".equals(zzc(zzefVar2, sb))) {
                break;
            }
            zzalf zzalfVar = new zzalf();
            if (!strTrim.isEmpty()) {
                int iIndexOf = strTrim.indexOf(91);
                if (iIndexOf != i7) {
                    Matcher matcher2 = zza.matcher(strTrim.substring(iIndexOf));
                    if (matcher2.matches()) {
                        String strGroup2 = matcher2.group(1);
                        strGroup2.getClass();
                        zzalfVar.zzd(strGroup2);
                    }
                    strTrim = strTrim.substring(i8, iIndexOf);
                }
                String str = zzeo.zza;
                String[] strArrSplit = strTrim.split("\\.", i7);
                String str2 = strArrSplit[i8];
                int iIndexOf2 = str2.indexOf(35);
                if (iIndexOf2 != i7) {
                    zzalfVar.zzb(str2.substring(i8, iIndexOf2));
                    zzalfVar.zza(str2.substring(iIndexOf2 + 1));
                } else {
                    zzalfVar.zzb(str2);
                }
                int length = strArrSplit.length;
                if (length > 1) {
                    zzalfVar.zzc((String[]) Arrays.copyOfRange(strArrSplit, 1, length));
                }
            }
            int i11 = i8;
            String strZzc2 = null;
            while (i11 == 0) {
                int iZzg4 = zzefVar2.zzg();
                strZzc2 = zzc(zzefVar2, sb);
                int i12 = (strZzc2 == null || "}".equals(strZzc2)) ? 1 : i8;
                if (i12 == 0) {
                    zzefVar2.zzh(iZzg4);
                    zzb(zzefVar2);
                    String strZzd = zzd(zzefVar2, sb);
                    if (!strZzd.isEmpty() && ":".equals(zzc(zzefVar2, sb))) {
                        zzb(zzefVar2);
                        StringBuilder sb2 = new StringBuilder();
                        int i13 = i8;
                        while (true) {
                            if (i13 != 0) {
                                string = sb2.toString();
                                break;
                            }
                            int iZzg5 = zzefVar2.zzg();
                            String strZzc3 = zzc(zzefVar2, sb);
                            if (strZzc3 == null) {
                                string = null;
                                break;
                            }
                            if ("}".equals(strZzc3) || ";".equals(strZzc3)) {
                                zzefVar2.zzh(iZzg5);
                                i13 = 1;
                            } else {
                                sb2.append(strZzc3);
                            }
                        }
                        if (string != null && !string.isEmpty()) {
                            int iZzg6 = zzefVar2.zzg();
                            String strZzc4 = zzc(zzefVar2, sb);
                            if (";".equals(strZzc4)) {
                                if ("color".equals(strZzd)) {
                                    zzalfVar.zzn(zzdd.zzb(string));
                                } else if ("background-color".equals(strZzd)) {
                                    zzalfVar.zzq(zzdd.zzb(string));
                                } else if ("ruby-position".equals(strZzd)) {
                                    if ("over".equals(string)) {
                                        zzalfVar.zzw(1);
                                    } else if ("under".equals(string)) {
                                        zzalfVar.zzw(2);
                                    }
                                } else if ("text-combine-upright".equals(strZzd)) {
                                    if ("all".equals(string)) {
                                        z7 = true;
                                    } else {
                                        z7 = true;
                                    }
                                    zzalfVar.zzy(z7);
                                } else if ("text-decoration".equals(strZzd)) {
                                    if ("underline".equals(string)) {
                                        zzalfVar.zzh(true);
                                    }
                                } else if ("font-family".equals(strZzd)) {
                                    zzalfVar.zzl(string);
                                } else if ("font-weight".equals(strZzd)) {
                                    if ("bold".equals(string)) {
                                        zzalfVar.zzi(true);
                                    }
                                } else if ("font-style".equals(strZzd)) {
                                    if ("italic".equals(string)) {
                                        zzalfVar.zzj(true);
                                    }
                                } else if ("font-size".equals(strZzd)) {
                                    matcher = zzb.matcher(zzggj.zza(string));
                                    if (matcher.matches()) {
                                        strGroup = matcher.group(2);
                                        strGroup.getClass();
                                        iHashCode = strGroup.hashCode();
                                        if (iHashCode != 37) {
                                            if (iHashCode != 3240) {
                                                if (iHashCode != 3592) {
                                                    b7 = -1;
                                                } else {
                                                    b7 = 0;
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
                                        if (b7 != 0) {
                                            zzalfVar.zzt(1);
                                        } else if (b7 != 1) {
                                            zzalfVar.zzt(2);
                                        } else {
                                            if (b7 == 2) {
                                                throw new IllegalStateException();
                                            }
                                            zzalfVar.zzt(3);
                                        }
                                        String strGroup3 = matcher.group(1);
                                        strGroup3.getClass();
                                        zzalfVar.zzs(Float.parseFloat(strGroup3));
                                    } else {
                                        StringBuilder sb3 = new StringBuilder(string.length() + 22);
                                        sb3.append("Invalid font-size: '");
                                        sb3.append(string);
                                        sb3.append("'.");
                                        zzds.zzc("WebvttCssParser", sb3.toString());
                                    }
                                } else {
                                    continue;
                                }
                            } else if ("}".equals(strZzc4)) {
                                zzefVar2.zzh(iZzg6);
                                if ("color".equals(strZzd)) {
                                    zzalfVar.zzn(zzdd.zzb(string));
                                } else if ("background-color".equals(strZzd)) {
                                    zzalfVar.zzq(zzdd.zzb(string));
                                } else if ("ruby-position".equals(strZzd)) {
                                    if ("over".equals(string)) {
                                        zzalfVar.zzw(1);
                                    } else if ("under".equals(string)) {
                                        zzalfVar.zzw(2);
                                    }
                                } else if ("text-combine-upright".equals(strZzd)) {
                                    if ("all".equals(string) || string.startsWith("digits")) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    zzalfVar.zzy(z7);
                                } else if ("text-decoration".equals(strZzd)) {
                                    if ("underline".equals(string)) {
                                        zzalfVar.zzh(true);
                                    }
                                } else if ("font-family".equals(strZzd)) {
                                    zzalfVar.zzl(string);
                                } else if ("font-weight".equals(strZzd)) {
                                    if ("bold".equals(string)) {
                                        zzalfVar.zzi(true);
                                    }
                                } else if ("font-style".equals(strZzd)) {
                                    if ("italic".equals(string)) {
                                        zzalfVar.zzj(true);
                                    }
                                } else if ("font-size".equals(strZzd)) {
                                    matcher = zzb.matcher(zzggj.zza(string));
                                    if (matcher.matches()) {
                                        StringBuilder sb4 = new StringBuilder(string.length() + 22);
                                        sb4.append("Invalid font-size: '");
                                        sb4.append(string);
                                        sb4.append("'.");
                                        zzds.zzc("WebvttCssParser", sb4.toString());
                                    } else {
                                        strGroup = matcher.group(2);
                                        strGroup.getClass();
                                        iHashCode = strGroup.hashCode();
                                        if (iHashCode != 37) {
                                            if (iHashCode != 3240) {
                                                if (iHashCode != 3592 && strGroup.equals("px")) {
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
                                        if (b7 != 0) {
                                            zzalfVar.zzt(1);
                                        } else if (b7 != 1) {
                                            zzalfVar.zzt(2);
                                        } else {
                                            if (b7 == 2) {
                                                throw new IllegalStateException();
                                            }
                                            zzalfVar.zzt(3);
                                        }
                                        String strGroup4 = matcher.group(1);
                                        strGroup4.getClass();
                                        zzalfVar.zzs(Float.parseFloat(strGroup4));
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i11 = i12;
                i8 = 0;
            }
            if ("}".equals(strZzc2)) {
                arrayList.add(zzalfVar);
            }
            i7 = -1;
            i8 = 0;
        }
        return arrayList;
    }
}
