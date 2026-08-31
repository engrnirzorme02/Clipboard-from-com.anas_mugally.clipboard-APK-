package p375v5;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: renamed from: v5.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7262a {

    /* JADX INFO: renamed from: a */
    private static final TimeZone f29045a = TimeZone.getTimeZone("UTC");

    /* JADX INFO: renamed from: a */
    private static boolean m32189a(String str, int i7, char c7) {
        return i7 < str.length() && str.charAt(i7) == c7;
    }

    /* JADX INFO: renamed from: b */
    private static int m32190b(String str, int i7) {
        while (i7 < str.length()) {
            char cCharAt = str.charAt(i7);
            if (cCharAt < '0' || cCharAt > '9') {
                return i7;
            }
            i7++;
        }
        return str.length();
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00df A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:51:0x00d9, B:53:0x00df, B:55:0x00e5, B:79:0x0192, B:59:0x00ef, B:60:0x010a, B:61:0x010b, B:65:0x0127, B:67:0x0134, B:70:0x013d, B:72:0x015c, B:75:0x016b, B:76:0x018d, B:78:0x0190, B:64:0x0116, B:81:0x01c3, B:82:0x01ca, B:44:0x00bc, B:45:0x00bf), top: B:93:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e5 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:51:0x00d9, B:53:0x00df, B:55:0x00e5, B:79:0x0192, B:59:0x00ef, B:60:0x010a, B:61:0x010b, B:65:0x0127, B:67:0x0134, B:70:0x013d, B:72:0x015c, B:75:0x016b, B:76:0x018d, B:78:0x0190, B:64:0x0116, B:81:0x01c3, B:82:0x01ca, B:44:0x00bc, B:45:0x00bf), top: B:93:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:63:0x0115  */
    /* JADX WARN: Code duplicated, block: B:64:0x0116 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:51:0x00d9, B:53:0x00df, B:55:0x00e5, B:79:0x0192, B:59:0x00ef, B:60:0x010a, B:61:0x010b, B:65:0x0127, B:67:0x0134, B:70:0x013d, B:72:0x015c, B:75:0x016b, B:76:0x018d, B:78:0x0190, B:64:0x0116, B:81:0x01c3, B:82:0x01ca, B:44:0x00bc, B:45:0x00bf), top: B:93:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0190 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:51:0x00d9, B:53:0x00df, B:55:0x00e5, B:79:0x0192, B:59:0x00ef, B:60:0x010a, B:61:0x010b, B:65:0x0127, B:67:0x0134, B:70:0x013d, B:72:0x015c, B:75:0x016b, B:76:0x018d, B:78:0x0190, B:64:0x0116, B:81:0x01c3, B:82:0x01ca, B:44:0x00bc, B:45:0x00bf), top: B:93:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01c3 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:51:0x00d9, B:53:0x00df, B:55:0x00e5, B:79:0x0192, B:59:0x00ef, B:60:0x010a, B:61:0x010b, B:65:0x0127, B:67:0x0134, B:70:0x013d, B:72:0x015c, B:75:0x016b, B:76:0x018d, B:78:0x0190, B:64:0x0116, B:81:0x01c3, B:82:0x01ca, B:44:0x00bc, B:45:0x00bf), top: B:93:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:85:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ef  */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x0116, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x01cf, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x01ef, please report this as an issue */
    /* JADX INFO: renamed from: c */
    public static Date m32191c(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        String message;
        int i7;
        int i8;
        int i9;
        int iM32192d;
        char cCharAt;
        String strSubstring;
        int length;
        TimeZone timeZone;
        char cCharAt2;
        try {
            int index = parsePosition.getIndex();
            int i10 = index + 4;
            int iM32192d2 = m32192d(str, index, i10);
            if (m32189a(str, i10, '-')) {
                i10 = index + 5;
            }
            int i11 = i10 + 2;
            int iM32192d3 = m32192d(str, i10, i11);
            if (m32189a(str, i11, '-')) {
                i11 = i10 + 3;
            }
            int i12 = i11 + 2;
            int iM32192d4 = m32192d(str, i11, i12);
            boolean zM32189a = m32189a(str, i12, 'T');
            if (!zM32189a && str.length() <= i12) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iM32192d2, iM32192d3 - 1, iM32192d4);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i12);
                return gregorianCalendar.getTime();
            }
            if (zM32189a) {
                int i13 = i11 + 5;
                int iM32192d5 = m32192d(str, i11 + 3, i13);
                if (m32189a(str, i13, ':')) {
                    i13 = i11 + 6;
                }
                int i14 = i13 + 2;
                int iM32192d6 = m32192d(str, i13, i14);
                if (m32189a(str, i14, ':')) {
                    i14 = i13 + 3;
                }
                if (str.length() <= i14 || (cCharAt2 = str.charAt(i14)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i12 = i14;
                    i7 = iM32192d5;
                    i8 = iM32192d6;
                } else {
                    int i15 = i14 + 2;
                    iM32192d = m32192d(str, i14, i15);
                    if (iM32192d > 59 && iM32192d < 63) {
                        iM32192d = 59;
                    }
                    if (m32189a(str, i15, '.')) {
                        int i16 = i14 + 3;
                        int iM32190b = m32190b(str, i14 + 4);
                        int iMin = Math.min(iM32190b, i14 + 6);
                        int iM32192d7 = m32192d(str, i16, iMin);
                        int i17 = iMin - i16;
                        if (i17 == 1) {
                            iM32192d7 *= 100;
                        } else if (i17 == 2) {
                            iM32192d7 *= 10;
                        }
                        i7 = iM32192d5;
                        i12 = iM32190b;
                        i8 = iM32192d6;
                        i9 = iM32192d7;
                    } else {
                        i7 = iM32192d5;
                        i12 = i15;
                        i8 = iM32192d6;
                        i9 = 0;
                    }
                }
                if (str.length() > i12) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i12);
                if (cCharAt == 'Z') {
                    timeZone = f29045a;
                    length = i12 + 1;
                } else {
                    if (cCharAt != '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i12);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring + "00";
                    }
                    length = i12 + strSubstring.length();
                    if (!strSubstring.equals("+0000") || strSubstring.equals("+00:00")) {
                        timeZone = f29045a;
                    } else {
                        String str3 = "GMT" + strSubstring;
                        TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                        String id = timeZone2.getID();
                        if (!id.equals(str3) && !id.replace(":", "").equals(str3)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, iM32192d2);
                gregorianCalendar2.set(2, iM32192d3 - 1);
                gregorianCalendar2.set(5, iM32192d4);
                gregorianCalendar2.set(11, i7);
                gregorianCalendar2.set(12, i8);
                gregorianCalendar2.set(13, iM32192d);
                gregorianCalendar2.set(14, i9);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i7 = 0;
            i8 = 0;
            i9 = 0;
            iM32192d = 0;
            if (str.length() > i12) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i12);
            if (cCharAt == 'Z') {
                timeZone = f29045a;
                length = i12 + 1;
            } else {
                if (cCharAt != '+') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                }
                strSubstring = str.substring(i12);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i12 + strSubstring.length();
                if (strSubstring.equals("+0000")) {
                    timeZone = f29045a;
                } else {
                    timeZone = f29045a;
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, iM32192d2);
            gregorianCalendar3.set(2, iM32192d3 - 1);
            gregorianCalendar3.set(5, iM32192d4);
            gregorianCalendar3.set(11, i7);
            gregorianCalendar3.set(12, i8);
            gregorianCalendar3.set(13, iM32192d);
            gregorianCalendar3.set(14, i9);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (IllegalArgumentException e7) {
            e = e7;
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e8) {
            e = e8;
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        }
    }

    /* JADX INFO: renamed from: d */
    private static int m32192d(String str, int i7, int i8) {
        int i9;
        int i10;
        if (i7 < 0 || i8 > str.length() || i7 > i8) {
            throw new NumberFormatException(str);
        }
        if (i7 < i8) {
            i10 = i7 + 1;
            int iDigit = Character.digit(str.charAt(i7), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i7, i8));
            }
            i9 = -iDigit;
        } else {
            i9 = 0;
            i10 = i7;
        }
        while (i10 < i8) {
            int i11 = i10 + 1;
            int iDigit2 = Character.digit(str.charAt(i10), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i7, i8));
            }
            i9 = (i9 * 10) - iDigit2;
            i10 = i11;
        }
        return -i9;
    }
}
