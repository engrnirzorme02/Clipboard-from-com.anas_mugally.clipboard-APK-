package p087K5;

import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: K5.d */
/* JADX INFO: loaded from: classes.dex */
final class C0755d {

    /* JADX INFO: renamed from: a */
    private final String f3048a;

    /* JADX INFO: renamed from: b */
    private final int f3049b;

    /* JADX INFO: renamed from: c */
    private int f3050c;

    /* JADX INFO: renamed from: d */
    private int f3051d;

    /* JADX INFO: renamed from: e */
    private int f3052e;

    /* JADX INFO: renamed from: f */
    private int f3053f;

    /* JADX INFO: renamed from: g */
    private char[] f3054g;

    public C0755d(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f3048a = name;
        this.f3049b = name.length();
    }

    /* JADX INFO: renamed from: a */
    private String m3542a() {
        int i7;
        int i8;
        char c7;
        int i9 = this.f3050c;
        this.f3051d = i9;
        this.f3052e = i9;
        while (true) {
            int i10 = this.f3050c;
            if (i10 >= this.f3049b) {
                char[] cArr = this.f3054g;
                int i11 = this.f3051d;
                return new String(cArr, i11, this.f3052e - i11);
            }
            char[] cArr2 = this.f3054g;
            char c8 = cArr2[i10];
            if (c8 != ' ') {
                if (c8 != ';') {
                    if (c8 == '\\') {
                        int i12 = this.f3052e;
                        this.f3052e = i12 + 1;
                        cArr2[i12] = m3544d();
                        this.f3050c++;
                    } else if (c8 != '+' && c8 != ',') {
                        int i13 = this.f3052e;
                        this.f3052e = i13 + 1;
                        cArr2[i13] = c8;
                        this.f3050c = i10 + 1;
                    }
                }
                int i14 = this.f3051d;
                return new String(cArr2, i14, this.f3052e - i14);
            }
            int i15 = this.f3052e;
            this.f3053f = i15;
            this.f3050c = i10 + 1;
            this.f3052e = i15 + 1;
            cArr2[i15] = ' ';
            while (true) {
                i7 = this.f3050c;
                i8 = this.f3049b;
                if (i7 >= i8) {
                    break;
                }
                char[] cArr3 = this.f3054g;
                if (cArr3[i7] != ' ') {
                    break;
                }
                int i16 = this.f3052e;
                this.f3052e = i16 + 1;
                cArr3[i16] = ' ';
                this.f3050c = i7 + 1;
            }
            if (i7 == i8 || (c7 = this.f3054g[i7]) == ',' || c7 == '+' || c7 == ';') {
                char[] cArr4 = this.f3054g;
                int i17 = this.f3051d;
                return new String(cArr4, i17, this.f3053f - i17);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private int m3543c(int i7) {
        int i8;
        int i9;
        int i10 = i7 + 1;
        if (i10 >= this.f3049b) {
            throw new IllegalStateException("Malformed DN: " + this.f3048a);
        }
        char[] cArr = this.f3054g;
        char c7 = cArr[i7];
        if (c7 >= '0' && c7 <= '9') {
            i8 = c7 - '0';
        } else if (c7 >= 'a' && c7 <= 'f') {
            i8 = c7 - 'W';
        } else {
            if (c7 < 'A' || c7 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f3048a);
            }
            i8 = c7 - '7';
        }
        char c8 = cArr[i10];
        if (c8 >= '0' && c8 <= '9') {
            i9 = c8 - '0';
        } else if (c8 >= 'a' && c8 <= 'f') {
            i9 = c8 - 'W';
        } else {
            if (c8 < 'A' || c8 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f3048a);
            }
            i9 = c8 - '7';
        }
        return (i8 << 4) + i9;
    }

    /* JADX INFO: renamed from: d */
    private char m3544d() {
        int i7 = this.f3050c + 1;
        this.f3050c = i7;
        if (i7 == this.f3049b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f3048a);
        }
        char c7 = this.f3054g[i7];
        if (c7 == ' ' || c7 == '%' || c7 == '\\' || c7 == '_' || c7 == '\"' || c7 == '#') {
            return c7;
        }
        switch (c7) {
            case '*':
            case '+':
            case ',':
                return c7;
            default:
                switch (c7) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        return c7;
                    default:
                        return m3545e();
                }
        }
    }

    /* JADX INFO: renamed from: e */
    private char m3545e() {
        int i7;
        int i8;
        int iM3543c = m3543c(this.f3050c);
        this.f3050c++;
        if (iM3543c < 128) {
            return (char) iM3543c;
        }
        if (iM3543c < 192 || iM3543c > 247) {
            return '?';
        }
        if (iM3543c <= 223) {
            i7 = iM3543c & 31;
            i8 = 1;
        } else if (iM3543c <= 239) {
            i7 = iM3543c & 15;
            i8 = 2;
        } else {
            i7 = iM3543c & 7;
            i8 = 3;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.f3050c;
            int i11 = i10 + 1;
            this.f3050c = i11;
            if (i11 == this.f3049b || this.f3054g[i11] != '\\') {
                return '?';
            }
            int i12 = i10 + 2;
            this.f3050c = i12;
            int iM3543c2 = m3543c(i12);
            this.f3050c++;
            if ((iM3543c2 & 192) != 128) {
                return '?';
            }
            i7 = (i7 << 6) + (iM3543c2 & 63);
        }
        return (char) i7;
    }

    /* JADX INFO: renamed from: f */
    private String m3546f() {
        char[] cArr;
        char c7;
        int i7 = this.f3050c;
        if (i7 + 4 >= this.f3049b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f3048a);
        }
        this.f3051d = i7;
        this.f3050c = i7 + 1;
        while (true) {
            int i8 = this.f3050c;
            if (i8 == this.f3049b || (c7 = (cArr = this.f3054g)[i8]) == '+' || c7 == ',' || c7 == ';') {
                this.f3052e = i8;
                break;
            }
            if (c7 == ' ') {
                this.f3052e = i8;
                this.f3050c = i8 + 1;
                while (true) {
                    int i9 = this.f3050c;
                    if (i9 >= this.f3049b || this.f3054g[i9] != ' ') {
                        break;
                    }
                    this.f3050c = i9 + 1;
                }
            } else {
                if (c7 >= 'A' && c7 <= 'F') {
                    cArr[i8] = (char) (c7 + ' ');
                }
                this.f3050c = i8 + 1;
            }
        }
        int i10 = this.f3052e;
        int i11 = this.f3051d;
        int i12 = i10 - i11;
        if (i12 < 5 || (i12 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f3048a);
        }
        int i13 = i12 / 2;
        byte[] bArr = new byte[i13];
        int i14 = i11 + 1;
        for (int i15 = 0; i15 < i13; i15++) {
            bArr[i15] = (byte) m3543c(i14);
            i14 += 2;
        }
        return new String(this.f3054g, this.f3051d, i12);
    }

    /* JADX INFO: renamed from: g */
    private String m3547g() {
        int i7;
        int i8;
        int i9;
        int i10;
        char c7;
        int i11;
        int i12;
        char c8;
        char c9;
        while (true) {
            i7 = this.f3050c;
            i8 = this.f3049b;
            if (i7 >= i8 || this.f3054g[i7] != ' ') {
                break;
            }
            this.f3050c = i7 + 1;
        }
        if (i7 == i8) {
            return null;
        }
        this.f3051d = i7;
        this.f3050c = i7 + 1;
        while (true) {
            i9 = this.f3050c;
            i10 = this.f3049b;
            if (i9 >= i10 || (c9 = this.f3054g[i9]) == '=' || c9 == ' ') {
                break;
            }
            this.f3050c = i9 + 1;
        }
        if (i9 >= i10) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f3048a);
        }
        this.f3052e = i9;
        if (this.f3054g[i9] == ' ') {
            while (true) {
                i11 = this.f3050c;
                i12 = this.f3049b;
                if (i11 >= i12 || (c8 = this.f3054g[i11]) == '=' || c8 != ' ') {
                    break;
                }
                this.f3050c = i11 + 1;
            }
            if (this.f3054g[i11] != '=' || i11 == i12) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f3048a);
            }
        }
        this.f3050c++;
        while (true) {
            int i13 = this.f3050c;
            if (i13 >= this.f3049b || this.f3054g[i13] != ' ') {
                break;
            }
            this.f3050c = i13 + 1;
        }
        int i14 = this.f3052e;
        int i15 = this.f3051d;
        if (i14 - i15 > 4) {
            char[] cArr = this.f3054g;
            if (cArr[i15 + 3] == '.' && (((c7 = cArr[i15]) == 'O' || c7 == 'o') && ((cArr[i15 + 1] == 'I' || cArr[i15 + 1] == 'i') && (cArr[i15 + 2] == 'D' || cArr[i15 + 2] == 'd')))) {
                this.f3051d = i15 + 4;
            }
        }
        char[] cArr2 = this.f3054g;
        int i16 = this.f3051d;
        return new String(cArr2, i16, i14 - i16);
    }

    /* JADX INFO: renamed from: h */
    private String m3548h() {
        int i7 = this.f3050c + 1;
        this.f3050c = i7;
        this.f3051d = i7;
        this.f3052e = i7;
        while (true) {
            int i8 = this.f3050c;
            if (i8 == this.f3049b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f3048a);
            }
            char[] cArr = this.f3054g;
            char c7 = cArr[i8];
            if (c7 == '\"') {
                this.f3050c = i8 + 1;
                while (true) {
                    int i9 = this.f3050c;
                    if (i9 >= this.f3049b || this.f3054g[i9] != ' ') {
                        break;
                    }
                    this.f3050c = i9 + 1;
                }
                char[] cArr2 = this.f3054g;
                int i10 = this.f3051d;
                return new String(cArr2, i10, this.f3052e - i10);
            }
            if (c7 == '\\') {
                cArr[this.f3052e] = m3544d();
            } else {
                cArr[this.f3052e] = c7;
            }
            this.f3050c++;
            this.f3052e++;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m3549b(String str) {
        String strM3548h;
        this.f3050c = 0;
        this.f3051d = 0;
        this.f3052e = 0;
        this.f3053f = 0;
        this.f3054g = this.f3048a.toCharArray();
        String strM3547g = m3547g();
        if (strM3547g == null) {
            return null;
        }
        do {
            int i7 = this.f3050c;
            if (i7 == this.f3049b) {
                return null;
            }
            char c7 = this.f3054g[i7];
            if (c7 == '\"') {
                strM3548h = m3548h();
            } else if (c7 != '#') {
                strM3548h = (c7 == '+' || c7 == ',' || c7 == ';') ? "" : m3542a();
            } else {
                strM3548h = m3546f();
            }
            if (str.equalsIgnoreCase(strM3547g)) {
                return strM3548h;
            }
            int i8 = this.f3050c;
            if (i8 >= this.f3049b) {
                return null;
            }
            char c8 = this.f3054g[i8];
            if (c8 != ',' && c8 != ';' && c8 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f3048a);
            }
            this.f3050c = i8 + 1;
            strM3547g = m3547g();
        } while (strM3547g != null);
        throw new IllegalStateException("Malformed DN: " + this.f3048a);
    }
}
