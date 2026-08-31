package p048F6;

/* JADX INFO: renamed from: F6.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0437C {

    /* JADX INFO: renamed from: a */
    private static final String[] f1698a;

    /* JADX INFO: renamed from: b */
    private static final byte[] f1699b;

    static {
        String[] strArr = new String[93];
        for (int i7 = 0; i7 < 32; i7++) {
            strArr[i7] = "\\u" + m1879c(i7 >> 12) + m1879c(i7 >> 8) + m1879c(i7 >> 4) + m1879c(i7);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f1698a = strArr;
        byte[] bArr = new byte[93];
        for (int i8 = 0; i8 < 32; i8++) {
            bArr[i8] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f1699b = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static final byte[] m1877a() {
        return f1699b;
    }

    /* JADX INFO: renamed from: b */
    public static final String[] m1878b() {
        return f1698a;
    }

    /* JADX INFO: renamed from: c */
    private static final char m1879c(int i7) {
        int i8 = i7 & 15;
        return (char) (i8 < 10 ? i8 + 48 : i8 + 87);
    }
}
