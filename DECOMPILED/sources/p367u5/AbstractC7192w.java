package p367u5;

/* JADX INFO: renamed from: u5.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7192w {

    /* JADX INFO: renamed from: a */
    private static final int f28677a = m31741a();

    /* JADX INFO: renamed from: a */
    private static int m31741a() {
        return m31745e(System.getProperty("java.version"));
    }

    /* JADX INFO: renamed from: b */
    private static int m31742b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i7 = 0; i7 < str.length(); i7++) {
                char cCharAt = str.charAt(i7);
                if (!Character.isDigit(cCharAt)) {
                    break;
                }
                sb.append(cCharAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m31743c() {
        return f28677a >= 9;
    }

    /* JADX INFO: renamed from: d */
    private static int m31744d(String str) {
        try {
            String[] strArrSplit = str.split("[._]", 3);
            int i7 = Integer.parseInt(strArrSplit[0]);
            return (i7 != 1 || strArrSplit.length <= 1) ? i7 : Integer.parseInt(strArrSplit[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: e */
    static int m31745e(String str) {
        int iM31744d = m31744d(str);
        if (iM31744d == -1) {
            iM31744d = m31742b(str);
        }
        if (iM31744d == -1) {
            return 6;
        }
        return iM31744d;
    }
}
