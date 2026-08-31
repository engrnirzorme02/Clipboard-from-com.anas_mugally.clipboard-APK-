package p048F6;

/* JADX INFO: renamed from: F6.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0441b {
    /* JADX INFO: renamed from: a */
    public static final byte m1919a(char c7) {
        if (c7 < '~') {
            return C0445f.f1718c[c7];
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: b */
    public static final char m1920b(int i7) {
        if (i7 < 117) {
            return C0445f.f1717b[i7];
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: c */
    public static final String m1921c(byte b7) {
        if (b7 == 1) {
            return "quotation mark '\"'";
        }
        if (b7 == 2) {
            return "string escape sequence '\\'";
        }
        if (b7 == 4) {
            return "comma ','";
        }
        if (b7 == 5) {
            return "colon ':'";
        }
        if (b7 == 6) {
            return "start of the object '{'";
        }
        if (b7 == 7) {
            return "end of the object '}'";
        }
        if (b7 == 8) {
            return "start of the array '['";
        }
        if (b7 == 9) {
            return "end of the array ']'";
        }
        if (b7 == 10) {
            return "end of the input";
        }
        return b7 == 127 ? "invalid token" : "valid token";
    }
}
