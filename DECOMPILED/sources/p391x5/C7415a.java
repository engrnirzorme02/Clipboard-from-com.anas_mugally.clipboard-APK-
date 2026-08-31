package p391x5;

import com.google.gson.EnumC5055p;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import p367u5.AbstractC7168G;
import p367u5.AbstractC7193x;

/* JADX INFO: renamed from: x5.a */
/* JADX INFO: loaded from: classes.dex */
public class C7415a implements Closeable {

    /* JADX INFO: renamed from: A */
    private int[] f29684A;

    /* JADX INFO: renamed from: a */
    private final Reader f29685a;

    /* JADX INFO: renamed from: u */
    private long f29694u;

    /* JADX INFO: renamed from: v */
    private int f29695v;

    /* JADX INFO: renamed from: w */
    private String f29696w;

    /* JADX INFO: renamed from: x */
    private int[] f29697x;

    /* JADX INFO: renamed from: z */
    private String[] f29699z;

    /* JADX INFO: renamed from: b */
    private EnumC5055p f29686b = EnumC5055p.LEGACY_STRICT;

    /* JADX INFO: renamed from: c */
    private int f29687c = 255;

    /* JADX INFO: renamed from: d */
    private final char[] f29688d = new char[1024];

    /* JADX INFO: renamed from: e */
    private int f29689e = 0;

    /* JADX INFO: renamed from: f */
    private int f29690f = 0;

    /* JADX INFO: renamed from: r */
    private int f29691r = 0;

    /* JADX INFO: renamed from: s */
    private int f29692s = 0;

    /* JADX INFO: renamed from: t */
    int f29693t = 0;

    /* JADX INFO: renamed from: y */
    private int f29698y = 1;

    /* JADX INFO: renamed from: x5.a$a */
    class a extends AbstractC7193x {
        a() {
        }

        @Override // p367u5.AbstractC7193x
        /* JADX INFO: renamed from: a */
        public void mo31746a(C7415a c7415a) throws IOException {
            int iM32813Q = c7415a.f29693t;
            if (iM32813Q == 0) {
                iM32813Q = c7415a.m32813Q();
            }
            if (iM32813Q == 13) {
                c7415a.f29693t = 9;
            } else if (iM32813Q == 12) {
                c7415a.f29693t = 8;
            } else {
                if (iM32813Q != 14) {
                    throw c7415a.m32810p1("a name");
                }
                c7415a.f29693t = 10;
            }
        }
    }

    static {
        AbstractC7193x.f28678a = new a();
    }

    public C7415a(Reader reader) {
        int[] iArr = new int[32];
        this.f29697x = iArr;
        iArr[0] = 6;
        this.f29699z = new String[32];
        this.f29684A = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f29685a = reader;
    }

    /* JADX INFO: renamed from: J */
    private void m32793J() throws IOException {
        m32795Y0(true);
        int i7 = this.f29689e;
        this.f29689e = i7 - 1;
        if (i7 + 4 <= this.f29690f || m32805l0(5)) {
            int i8 = this.f29689e;
            char[] cArr = this.f29688d;
            if (cArr[i8] == ')' && cArr[i8 + 1] == ']' && cArr[i8 + 2] == '}' && cArr[i8 + 3] == '\'' && cArr[i8 + 4] == '\n') {
                this.f29689e = i8 + 5;
            }
        }
    }

    /* JADX INFO: renamed from: R0 */
    private boolean m32794R0(char c7) throws C7418d {
        if (c7 == '\t' || c7 == '\n' || c7 == '\f' || c7 == '\r' || c7 == ' ') {
            return false;
        }
        if (c7 != '#') {
            if (c7 == ',') {
                return false;
            }
            if (c7 != '/' && c7 != '=') {
                if (c7 == '{' || c7 == '}' || c7 == ':') {
                    return false;
                }
                if (c7 != ';') {
                    switch (c7) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m32811x();
        return false;
    }

    /* JADX INFO: renamed from: Y0 */
    private int m32795Y0(boolean z7) throws IOException {
        char[] cArr = this.f29688d;
        int i7 = this.f29689e;
        int i8 = this.f29690f;
        while (true) {
            if (i7 == i8) {
                this.f29689e = i7;
                if (!m32805l0(1)) {
                    if (!z7) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m32815S0());
                }
                i7 = this.f29689e;
                i8 = this.f29690f;
            }
            int i9 = i7 + 1;
            char c7 = cArr[i7];
            if (c7 == '\n') {
                this.f29691r++;
                this.f29692s = i9;
            } else if (c7 != ' ' && c7 != '\r' && c7 != '\t') {
                if (c7 == '/') {
                    this.f29689e = i9;
                    if (i9 == i8) {
                        this.f29689e = i7;
                        boolean zM32805l0 = m32805l0(2);
                        this.f29689e++;
                        if (!zM32805l0) {
                        }
                        return c7;
                    }
                    m32811x();
                    int i10 = this.f29689e;
                    char c8 = cArr[i10];
                    if (c8 == '*') {
                        this.f29689e = i10 + 1;
                        if (!m32804k1("*/")) {
                            throw m32809o1("Unterminated comment");
                        }
                        i7 = this.f29689e + 2;
                        i8 = this.f29690f;
                    } else {
                        if (c8 != '/') {
                            return c7;
                        }
                        this.f29689e = i10 + 1;
                        m32806l1();
                        i7 = this.f29689e;
                        i8 = this.f29690f;
                    }
                } else {
                    if (c7 != '#') {
                        this.f29689e = i9;
                        return c7;
                    }
                    this.f29689e = i9;
                    m32811x();
                    m32806l1();
                    i7 = this.f29689e;
                    i8 = this.f29690f;
                }
            }
            i7 = i9;
        }
    }

    /* JADX INFO: renamed from: a1 */
    private String m32796a1(char c7) throws C7418d {
        int i7;
        char[] cArr = this.f29688d;
        StringBuilder sb = null;
        do {
            int i8 = this.f29689e;
            int i9 = this.f29690f;
            while (true) {
                int i10 = i9;
                i7 = i8;
                while (true) {
                    if (i8 < i10) {
                        int i11 = i8 + 1;
                        char c8 = cArr[i8];
                        if (this.f29686b == EnumC5055p.STRICT && c8 < ' ') {
                            throw m32809o1("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                        }
                        if (c8 == c7) {
                            this.f29689e = i11;
                            int i12 = (i11 - i7) - 1;
                            if (sb == null) {
                                return new String(cArr, i7, i12);
                            }
                            sb.append(cArr, i7, i12);
                            return sb.toString();
                        }
                        if (c8 == '\\') {
                            this.f29689e = i11;
                            int i13 = i11 - i7;
                            int i14 = i13 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i13 * 2, 16));
                            }
                            sb.append(cArr, i7, i14);
                            sb.append(m32802h1());
                            i8 = this.f29689e;
                            i9 = this.f29690f;
                        } else {
                            if (c8 == '\n') {
                                this.f29691r++;
                                this.f29692s = i11;
                            }
                            i8 = i11;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i8 - i7) * 2, 16));
            }
            sb.append(cArr, i7, i8 - i7);
            this.f29689e = i8;
        } while (m32805l0(1));
        throw m32809o1("Unterminated string");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX INFO: renamed from: c1 */
    private String m32797c1() throws C7418d {
        String string;
        StringBuilder sb = null;
        int i7 = 0;
        while (true) {
            int i8 = 0;
            while (true) {
                int i9 = this.f29689e;
                if (i9 + i8 < this.f29690f) {
                    char c7 = this.f29688d[i9 + i8];
                    if (c7 != '\t' && c7 != '\n' && c7 != '\f' && c7 != '\r' && c7 != ' ') {
                        if (c7 != '#') {
                            if (c7 != ',') {
                                if (c7 != '/' && c7 != '=') {
                                    if (c7 != '{' && c7 != '}' && c7 != ':') {
                                        if (c7 != ';') {
                                            switch (c7) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i8++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        m32811x();
                    }
                    i7 = i8;
                } else if (i8 >= this.f29688d.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i8, 16));
                    }
                    sb.append(this.f29688d, this.f29689e, i8);
                    this.f29689e += i8;
                    if (!m32805l0(1)) {
                    }
                } else if (!m32805l0(i8 + 1)) {
                    i7 = i8;
                }
                if (sb == null) {
                    string = new String(this.f29688d, this.f29689e, i7);
                } else {
                    sb.append(this.f29688d, this.f29689e, i7);
                    string = sb.toString();
                }
                this.f29689e += i7;
                return string;
            }
        }
    }

    /* JADX INFO: renamed from: e1 */
    private int m32799e1() {
        String str;
        String str2;
        int i7;
        char c7 = this.f29688d[this.f29689e];
        if (c7 == 't' || c7 == 'T') {
            str = "true";
            str2 = "TRUE";
            i7 = 5;
        } else if (c7 == 'f' || c7 == 'F') {
            str = "false";
            str2 = "FALSE";
            i7 = 6;
        } else {
            if (c7 != 'n' && c7 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i7 = 7;
        }
        boolean z7 = this.f29686b != EnumC5055p.STRICT;
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (this.f29689e + i8 >= this.f29690f && !m32805l0(i8 + 1)) {
                return 0;
            }
            char c8 = this.f29688d[this.f29689e + i8];
            if (c8 != str.charAt(i8) && (!z7 || c8 != str2.charAt(i8))) {
                return 0;
            }
        }
        if ((this.f29689e + length < this.f29690f || m32805l0(length + 1)) && m32794R0(this.f29688d[this.f29689e + length])) {
            return 0;
        }
        this.f29689e += length;
        this.f29693t = i7;
        return i7;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:85:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00da  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e1  */
    /* JADX INFO: renamed from: f1 */
    private int m32800f1() {
        char c7;
        int i7;
        char[] cArr = this.f29688d;
        int i8 = this.f29689e;
        int i9 = this.f29690f;
        int i10 = 0;
        int i11 = 0;
        char c8 = 0;
        boolean z7 = false;
        int i12 = 1;
        long j7 = 0;
        while (true) {
            char c9 = 2;
            if (i8 + i11 != i9) {
                c7 = cArr[i8 + i11];
                i7 = i10;
                if (c7 != '+') {
                    if (c7 != 'E' || c7 == 'e') {
                        if (c8 == 2 && c8 != 4) {
                            return i7;
                        }
                        c8 = 5;
                    } else if (c7 == '-') {
                        c9 = 6;
                        if (c8 == 0) {
                            c8 = 1;
                            z7 = true;
                        } else if (c8 != 5) {
                            return i7;
                        }
                    } else if (c7 != '.') {
                        if (c7 < '0' || c7 > '9') {
                            if (!m32794R0(c7)) {
                                break;
                            }
                            return i7;
                        }
                        if (c8 == 1 || c8 == 0) {
                            j7 = -(c7 - '0');
                        } else if (c8 == 2) {
                            if (j7 == 0) {
                                return i7;
                            }
                            long j8 = (10 * j7) - ((long) (c7 - '0'));
                            i12 &= (j7 > -922337203685477580L || (j7 == -922337203685477580L && j8 < j7)) ? 1 : i7;
                            j7 = j8;
                        } else if (c8 == 3) {
                            c8 = 4;
                        } else if (c8 == 5 || c8 == 6) {
                            c8 = 7;
                        }
                    } else {
                        if (c8 != 2) {
                            return i7;
                        }
                        c8 = 3;
                    }
                    i11++;
                    i10 = i7;
                } else {
                    c9 = 6;
                    if (c8 != 5) {
                        return i7;
                    }
                }
                c8 = c9;
                i11++;
                i10 = i7;
            } else {
                if (i11 == cArr.length) {
                    return i10;
                }
                if (!m32805l0(i11 + 1)) {
                    i7 = i10;
                    break;
                }
                i8 = this.f29689e;
                i9 = this.f29690f;
                c7 = cArr[i8 + i11];
                i7 = i10;
                if (c7 != '+') {
                    if (c7 != 'E') {
                        if (c8 == 2) {
                        }
                        c8 = 5;
                    } else {
                        if (c8 == 2) {
                        }
                        c8 = 5;
                    }
                    i11++;
                    i10 = i7;
                } else {
                    c9 = 6;
                    if (c8 != 5) {
                        return i7;
                    }
                }
                c8 = c9;
                i11++;
                i10 = i7;
            }
        }
        if (c8 == 2 && i12 != 0 && ((j7 != Long.MIN_VALUE || z7) && (j7 != 0 || !z7))) {
            if (!z7) {
                j7 = -j7;
            }
            this.f29694u = j7;
            this.f29689e += i11;
            this.f29693t = 15;
            return 15;
        }
        if (c8 != 2 && c8 != 4 && c8 != 7) {
            return i7;
        }
        this.f29695v = i11;
        this.f29693t = 16;
        return 16;
    }

    /* JADX INFO: renamed from: g1 */
    private void m32801g1(int i7) throws C7418d {
        int i8 = this.f29698y;
        if (i8 - 1 >= this.f29687c) {
            throw new C7418d("Nesting limit " + this.f29687c + " reached" + m32815S0());
        }
        int[] iArr = this.f29697x;
        if (i8 == iArr.length) {
            int i9 = i8 * 2;
            this.f29697x = Arrays.copyOf(iArr, i9);
            this.f29684A = Arrays.copyOf(this.f29684A, i9);
            this.f29699z = (String[]) Arrays.copyOf(this.f29699z, i9);
        }
        int[] iArr2 = this.f29697x;
        int i10 = this.f29698y;
        this.f29698y = i10 + 1;
        iArr2[i10] = i7;
    }

    /* JADX INFO: renamed from: h1 */
    private char m32802h1() throws C7418d {
        int i7;
        if (this.f29689e == this.f29690f && !m32805l0(1)) {
            throw m32809o1("Unterminated escape sequence");
        }
        char[] cArr = this.f29688d;
        int i8 = this.f29689e;
        int i9 = i8 + 1;
        this.f29689e = i9;
        char c7 = cArr[i8];
        if (c7 != '\n') {
            if (c7 != '\"') {
                if (c7 != '\'') {
                    if (c7 != '/' && c7 != '\\') {
                        if (c7 == 'b') {
                            return '\b';
                        }
                        if (c7 == 'f') {
                            return '\f';
                        }
                        if (c7 == 'n') {
                            return '\n';
                        }
                        if (c7 == 'r') {
                            return '\r';
                        }
                        if (c7 == 't') {
                            return '\t';
                        }
                        if (c7 != 'u') {
                            throw m32809o1("Invalid escape sequence");
                        }
                        if (i8 + 5 > this.f29690f && !m32805l0(4)) {
                            throw m32809o1("Unterminated escape sequence");
                        }
                        int i10 = this.f29689e;
                        int i11 = i10 + 4;
                        int i12 = 0;
                        while (i10 < i11) {
                            char c8 = this.f29688d[i10];
                            int i13 = i12 << 4;
                            if (c8 >= '0' && c8 <= '9') {
                                i7 = c8 - '0';
                            } else if (c8 >= 'a' && c8 <= 'f') {
                                i7 = c8 - 'W';
                            } else {
                                if (c8 < 'A' || c8 > 'F') {
                                    throw m32809o1("Malformed Unicode escape \\u" + new String(this.f29688d, this.f29689e, 4));
                                }
                                i7 = c8 - '7';
                            }
                            i12 = i13 + i7;
                            i10++;
                        }
                        this.f29689e += 4;
                        return (char) i12;
                    }
                }
            }
            return c7;
        }
        if (this.f29686b == EnumC5055p.STRICT) {
            throw m32809o1("Cannot escape a newline character in strict mode");
        }
        this.f29691r++;
        this.f29692s = i9;
        if (this.f29686b == EnumC5055p.STRICT) {
            throw m32809o1("Invalid escaped character \"'\" in strict mode");
        }
        return c7;
    }

    /* JADX INFO: renamed from: j1 */
    private void m32803j1(char c7) throws C7418d {
        char[] cArr = this.f29688d;
        do {
            int i7 = this.f29689e;
            int i8 = this.f29690f;
            while (i7 < i8) {
                int i9 = i7 + 1;
                char c8 = cArr[i7];
                if (c8 == c7) {
                    this.f29689e = i9;
                    return;
                }
                if (c8 == '\\') {
                    this.f29689e = i9;
                    m32802h1();
                    i7 = this.f29689e;
                    i8 = this.f29690f;
                } else {
                    if (c8 == '\n') {
                        this.f29691r++;
                        this.f29692s = i9;
                    }
                    i7 = i9;
                }
            }
            this.f29689e = i7;
        } while (m32805l0(1));
        throw m32809o1("Unterminated string");
    }

    /* JADX INFO: renamed from: k1 */
    private boolean m32804k1(String str) {
        int length = str.length();
        while (true) {
            if (this.f29689e + length > this.f29690f && !m32805l0(length)) {
                return false;
            }
            char[] cArr = this.f29688d;
            int i7 = this.f29689e;
            if (cArr[i7] != '\n') {
                for (int i8 = 0; i8 < length; i8++) {
                    if (this.f29688d[this.f29689e + i8] == str.charAt(i8)) {
                    }
                }
                return true;
            }
            this.f29691r++;
            this.f29692s = i7 + 1;
            this.f29689e++;
        }
    }

    /* JADX INFO: renamed from: l0 */
    private boolean m32805l0(int i7) throws IOException {
        int i8;
        int i9;
        char[] cArr = this.f29688d;
        int i10 = this.f29692s;
        int i11 = this.f29689e;
        this.f29692s = i10 - i11;
        int i12 = this.f29690f;
        if (i12 != i11) {
            int i13 = i12 - i11;
            this.f29690f = i13;
            System.arraycopy(cArr, i11, cArr, 0, i13);
        } else {
            this.f29690f = 0;
        }
        this.f29689e = 0;
        do {
            Reader reader = this.f29685a;
            int i14 = this.f29690f;
            int i15 = reader.read(cArr, i14, cArr.length - i14);
            if (i15 == -1) {
                return false;
            }
            i8 = this.f29690f + i15;
            this.f29690f = i8;
            if (this.f29691r == 0 && (i9 = this.f29692s) == 0 && i8 > 0 && cArr[0] == 65279) {
                this.f29689e++;
                this.f29692s = i9 + 1;
                i7++;
            }
        } while (i8 < i7);
        return true;
    }

    /* JADX INFO: renamed from: l1 */
    private void m32806l1() {
        char c7;
        do {
            if (this.f29689e >= this.f29690f && !m32805l0(1)) {
                return;
            }
            char[] cArr = this.f29688d;
            int i7 = this.f29689e;
            int i8 = i7 + 1;
            this.f29689e = i8;
            c7 = cArr[i7];
            if (c7 == '\n') {
                this.f29691r++;
                this.f29692s = i8;
                return;
            }
        } while (c7 != '\r');
    }

    /* JADX INFO: renamed from: m1 */
    private void m32807m1() throws C7418d {
        do {
            int i7 = 0;
            while (true) {
                int i8 = this.f29689e;
                if (i8 + i7 < this.f29690f) {
                    char c7 = this.f29688d[i8 + i7];
                    if (c7 != '\t' && c7 != '\n' && c7 != '\f' && c7 != '\r' && c7 != ' ') {
                        if (c7 != '#') {
                            if (c7 != ',') {
                                if (c7 != '/' && c7 != '=') {
                                    if (c7 != '{' && c7 != '}' && c7 != ':') {
                                        if (c7 != ';') {
                                            switch (c7) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i7++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        m32811x();
                    }
                    this.f29689e += i7;
                    return;
                }
                this.f29689e = i8 + i7;
            }
        } while (m32805l0(1));
    }

    /* JADX INFO: renamed from: o0 */
    private String m32808o0(boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i7 = 0;
        while (true) {
            int i8 = this.f29698y;
            if (i7 >= i8) {
                return sb.toString();
            }
            int i9 = this.f29697x[i7];
            switch (i9) {
                case 1:
                case 2:
                    int i10 = this.f29684A[i7];
                    if (z7 && i10 > 0 && i7 == i8 - 1) {
                        i10--;
                    }
                    sb.append('[');
                    sb.append(i10);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.f29699z[i7];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError("Unknown scope value: " + i9);
            }
            i7++;
        }
    }

    /* JADX INFO: renamed from: o1 */
    private C7418d m32809o1(String str) throws C7418d {
        throw new C7418d(str + m32815S0() + "\nSee " + AbstractC7168G.m31678a("malformed-json"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public IllegalStateException m32810p1(String str) {
        return new IllegalStateException("Expected " + str + " but was " + m32824d1() + m32815S0() + "\nSee " + AbstractC7168G.m31678a(m32824d1() == EnumC7416b.NULL ? "adapter-not-null-safe" : "unexpected-json-structure"));
    }

    /* JADX INFO: renamed from: x */
    private void m32811x() throws C7418d {
        if (this.f29686b != EnumC5055p.LENIENT) {
            throw m32809o1("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m32812K0() throws IOException {
        int iM32813Q = this.f29693t;
        if (iM32813Q == 0) {
            iM32813Q = m32813Q();
        }
        return (iM32813Q == 2 || iM32813Q == 4 || iM32813Q == 17) ? false : true;
    }

    /* JADX INFO: renamed from: Q */
    int m32813Q() throws IOException {
        int iM32795Y0;
        int[] iArr = this.f29697x;
        int i7 = this.f29698y;
        int i8 = iArr[i7 - 1];
        if (i8 == 1) {
            iArr[i7 - 1] = 2;
        } else if (i8 == 2) {
            int iM32795Y1 = m32795Y0(true);
            if (iM32795Y1 != 44) {
                if (iM32795Y1 != 59) {
                    if (iM32795Y1 != 93) {
                        throw m32809o1("Unterminated array");
                    }
                    this.f29693t = 4;
                    return 4;
                }
                m32811x();
            }
        } else {
            if (i8 == 3 || i8 == 5) {
                iArr[i7 - 1] = 4;
                if (i8 == 5 && (iM32795Y0 = m32795Y0(true)) != 44) {
                    if (iM32795Y0 != 59) {
                        if (iM32795Y0 != 125) {
                            throw m32809o1("Unterminated object");
                        }
                        this.f29693t = 2;
                        return 2;
                    }
                    m32811x();
                }
                int iM32795Y2 = m32795Y0(true);
                if (iM32795Y2 == 34) {
                    this.f29693t = 13;
                    return 13;
                }
                if (iM32795Y2 == 39) {
                    m32811x();
                    this.f29693t = 12;
                    return 12;
                }
                if (iM32795Y2 == 125) {
                    if (i8 == 5) {
                        throw m32809o1("Expected name");
                    }
                    this.f29693t = 2;
                    return 2;
                }
                m32811x();
                this.f29689e--;
                if (!m32794R0((char) iM32795Y2)) {
                    throw m32809o1("Expected name");
                }
                this.f29693t = 14;
                return 14;
            }
            if (i8 == 4) {
                iArr[i7 - 1] = 5;
                int iM32795Y3 = m32795Y0(true);
                if (iM32795Y3 != 58) {
                    if (iM32795Y3 != 61) {
                        throw m32809o1("Expected ':'");
                    }
                    m32811x();
                    if (this.f29689e < this.f29690f || m32805l0(1)) {
                        char[] cArr = this.f29688d;
                        int i9 = this.f29689e;
                        if (cArr[i9] == '>') {
                            this.f29689e = i9 + 1;
                        }
                    }
                }
            } else if (i8 == 6) {
                if (this.f29686b == EnumC5055p.LENIENT) {
                    m32793J();
                }
                this.f29697x[this.f29698y - 1] = 7;
            } else if (i8 == 7) {
                if (m32795Y0(false) == -1) {
                    this.f29693t = 17;
                    return 17;
                }
                m32811x();
                this.f29689e--;
            } else if (i8 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iM32795Y4 = m32795Y0(true);
        if (iM32795Y4 == 34) {
            this.f29693t = 9;
            return 9;
        }
        if (iM32795Y4 == 39) {
            m32811x();
            this.f29693t = 8;
            return 8;
        }
        if (iM32795Y4 != 44 && iM32795Y4 != 59) {
            if (iM32795Y4 == 91) {
                this.f29693t = 3;
                return 3;
            }
            if (iM32795Y4 != 93) {
                if (iM32795Y4 == 123) {
                    this.f29693t = 1;
                    return 1;
                }
                this.f29689e--;
                int iM32799e1 = m32799e1();
                if (iM32799e1 != 0) {
                    return iM32799e1;
                }
                int iM32800f1 = m32800f1();
                if (iM32800f1 != 0) {
                    return iM32800f1;
                }
                if (!m32794R0(this.f29688d[this.f29689e])) {
                    throw m32809o1("Expected value");
                }
                m32811x();
                this.f29693t = 10;
                return 10;
            }
            if (i8 == 1) {
                this.f29693t = 4;
                return 4;
            }
        }
        if (i8 != 1 && i8 != 2) {
            throw m32809o1("Unexpected value");
        }
        m32811x();
        this.f29689e--;
        this.f29693t = 7;
        return 7;
    }

    /* JADX INFO: renamed from: Q0 */
    public final boolean m32814Q0() {
        return this.f29686b == EnumC5055p.LENIENT;
    }

    /* JADX INFO: renamed from: S0 */
    String m32815S0() {
        return " at line " + (this.f29691r + 1) + " column " + ((this.f29689e - this.f29692s) + 1) + " path " + m32831q0();
    }

    /* JADX INFO: renamed from: T0 */
    public boolean m32816T0() throws IOException {
        int iM32813Q = this.f29693t;
        if (iM32813Q == 0) {
            iM32813Q = m32813Q();
        }
        if (iM32813Q == 5) {
            this.f29693t = 0;
            int[] iArr = this.f29684A;
            int i7 = this.f29698y - 1;
            iArr[i7] = iArr[i7] + 1;
            return true;
        }
        if (iM32813Q != 6) {
            throw m32810p1("a boolean");
        }
        this.f29693t = 0;
        int[] iArr2 = this.f29684A;
        int i8 = this.f29698y - 1;
        iArr2[i8] = iArr2[i8] + 1;
        return false;
    }

    /* JADX INFO: renamed from: U0 */
    public double m32817U0() throws IOException {
        int iM32813Q = this.f29693t;
        if (iM32813Q == 0) {
            iM32813Q = m32813Q();
        }
        if (iM32813Q == 15) {
            this.f29693t = 0;
            int[] iArr = this.f29684A;
            int i7 = this.f29698y - 1;
            iArr[i7] = iArr[i7] + 1;
            return this.f29694u;
        }
        if (iM32813Q == 16) {
            this.f29696w = new String(this.f29688d, this.f29689e, this.f29695v);
            this.f29689e += this.f29695v;
        } else if (iM32813Q == 8 || iM32813Q == 9) {
            this.f29696w = m32796a1(iM32813Q == 8 ? '\'' : '\"');
        } else if (iM32813Q == 10) {
            this.f29696w = m32797c1();
        } else if (iM32813Q != 11) {
            throw m32810p1("a double");
        }
        this.f29693t = 11;
        double d7 = Double.parseDouble(this.f29696w);
        if (this.f29686b != EnumC5055p.LENIENT && (Double.isNaN(d7) || Double.isInfinite(d7))) {
            throw m32809o1("JSON forbids NaN and infinities: " + d7);
        }
        this.f29696w = null;
        this.f29693t = 0;
        int[] iArr2 = this.f29684A;
        int i8 = this.f29698y - 1;
        iArr2[i8] = iArr2[i8] + 1;
        return d7;
    }

    /* JADX INFO: renamed from: V0 */
    public int m32818V0() throws IOException {
        int iM32813Q = this.f29693t;
        if (iM32813Q == 0) {
            iM32813Q = m32813Q();
        }
        if (iM32813Q == 15) {
            long j7 = this.f29694u;
            int i7 = (int) j7;
            if (j7 == i7) {
                this.f29693t = 0;
                int[] iArr = this.f29684A;
                int i8 = this.f29698y - 1;
                iArr[i8] = iArr[i8] + 1;
                return i7;
            }
            throw new NumberFormatException("Expected an int but was " + this.f29694u + m32815S0());
        }
        if (iM32813Q == 16) {
            this.f29696w = new String(this.f29688d, this.f29689e, this.f29695v);
            this.f29689e += this.f29695v;
        } else {
            if (iM32813Q != 8 && iM32813Q != 9 && iM32813Q != 10) {
                throw m32810p1("an int");
            }
            if (iM32813Q == 10) {
                this.f29696w = m32797c1();
            } else {
                this.f29696w = m32796a1(iM32813Q == 8 ? '\'' : '\"');
            }
            try {
                int i9 = Integer.parseInt(this.f29696w);
                this.f29693t = 0;
                int[] iArr2 = this.f29684A;
                int i10 = this.f29698y - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return i9;
            } catch (NumberFormatException unused) {
            }
        }
        this.f29693t = 11;
        double d7 = Double.parseDouble(this.f29696w);
        int i11 = (int) d7;
        if (i11 != d7) {
            throw new NumberFormatException("Expected an int but was " + this.f29696w + m32815S0());
        }
        this.f29696w = null;
        this.f29693t = 0;
        int[] iArr3 = this.f29684A;
        int i12 = this.f29698y - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return i11;
    }

    /* JADX INFO: renamed from: W0 */
    public long m32819W0() throws IOException {
        int iM32813Q = this.f29693t;
        if (iM32813Q == 0) {
            iM32813Q = m32813Q();
        }
        if (iM32813Q == 15) {
            this.f29693t = 0;
            int[] iArr = this.f29684A;
            int i7 = this.f29698y - 1;
            iArr[i7] = iArr[i7] + 1;
            return this.f29694u;
        }
        if (iM32813Q == 16) {
            this.f29696w = new String(this.f29688d, this.f29689e, this.f29695v);
            this.f29689e += this.f29695v;
        } else {
            if (iM32813Q != 8 && iM32813Q != 9 && iM32813Q != 10) {
                throw m32810p1("a long");
            }
            if (iM32813Q == 10) {
                this.f29696w = m32797c1();
            } else {
                this.f29696w = m32796a1(iM32813Q == 8 ? '\'' : '\"');
            }
            try {
                long j7 = Long.parseLong(this.f29696w);
                this.f29693t = 0;
                int[] iArr2 = this.f29684A;
                int i8 = this.f29698y - 1;
                iArr2[i8] = iArr2[i8] + 1;
                return j7;
            } catch (NumberFormatException unused) {
            }
        }
        this.f29693t = 11;
        double d7 = Double.parseDouble(this.f29696w);
        long j8 = (long) d7;
        if (j8 != d7) {
            throw new NumberFormatException("Expected a long but was " + this.f29696w + m32815S0());
        }
        this.f29696w = null;
        this.f29693t = 0;
        int[] iArr3 = this.f29684A;
        int i9 = this.f29698y - 1;
        iArr3[i9] = iArr3[i9] + 1;
        return j8;
    }

    /* JADX INFO: renamed from: X0 */
    public String m32820X0() throws IOException {
        String strM32796a1;
        int iM32813Q = this.f29693t;
        if (iM32813Q == 0) {
            iM32813Q = m32813Q();
        }
        if (iM32813Q == 14) {
            strM32796a1 = m32797c1();
        } else if (iM32813Q == 12) {
            strM32796a1 = m32796a1('\'');
        } else {
            if (iM32813Q != 13) {
                throw m32810p1("a name");
            }
            strM32796a1 = m32796a1('\"');
        }
        this.f29693t = 0;
        this.f29699z[this.f29698y - 1] = strM32796a1;
        return strM32796a1;
    }

    /* JADX INFO: renamed from: Z0 */
    public void m32821Z0() throws IOException {
        int iM32813Q = this.f29693t;
        if (iM32813Q == 0) {
            iM32813Q = m32813Q();
        }
        if (iM32813Q != 7) {
            throw m32810p1("null");
        }
        this.f29693t = 0;
        int[] iArr = this.f29684A;
        int i7 = this.f29698y - 1;
        iArr[i7] = iArr[i7] + 1;
    }

    /* JADX INFO: renamed from: b1 */
    public String m32822b1() throws IOException {
        String str;
        int iM32813Q = this.f29693t;
        if (iM32813Q == 0) {
            iM32813Q = m32813Q();
        }
        if (iM32813Q == 10) {
            str = m32797c1();
        } else if (iM32813Q == 8) {
            str = m32796a1('\'');
        } else if (iM32813Q == 9) {
            str = m32796a1('\"');
        } else if (iM32813Q == 11) {
            str = this.f29696w;
            this.f29696w = null;
        } else if (iM32813Q == 15) {
            str = Long.toString(this.f29694u);
        } else {
            if (iM32813Q != 16) {
                throw m32810p1("a string");
            }
            str = new String(this.f29688d, this.f29689e, this.f29695v);
            this.f29689e += this.f29695v;
        }
        this.f29693t = 0;
        int[] iArr = this.f29684A;
        int i7 = this.f29698y - 1;
        iArr[i7] = iArr[i7] + 1;
        return str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f29693t = 0;
        this.f29697x[0] = 8;
        this.f29698y = 1;
        this.f29685a.close();
    }

    /* JADX INFO: renamed from: d0 */
    public void m32823d0() throws IOException {
        int iM32813Q = this.f29693t;
        if (iM32813Q == 0) {
            iM32813Q = m32813Q();
        }
        if (iM32813Q != 4) {
            throw m32810p1("END_ARRAY");
        }
        int i7 = this.f29698y;
        this.f29698y = i7 - 1;
        int[] iArr = this.f29684A;
        int i8 = i7 - 2;
        iArr[i8] = iArr[i8] + 1;
        this.f29693t = 0;
    }

    /* JADX INFO: renamed from: d1 */
    public EnumC7416b m32824d1() throws IOException {
        int iM32813Q = this.f29693t;
        if (iM32813Q == 0) {
            iM32813Q = m32813Q();
        }
        switch (iM32813Q) {
            case 1:
                return EnumC7416b.BEGIN_OBJECT;
            case 2:
                return EnumC7416b.END_OBJECT;
            case 3:
                return EnumC7416b.BEGIN_ARRAY;
            case 4:
                return EnumC7416b.END_ARRAY;
            case 5:
            case 6:
                return EnumC7416b.BOOLEAN;
            case 7:
                return EnumC7416b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC7416b.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC7416b.NAME;
            case 15:
            case 16:
                return EnumC7416b.NUMBER;
            case 17:
                return EnumC7416b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m32825i1(EnumC5055p enumC5055p) {
        Objects.requireNonNull(enumC5055p);
        this.f29686b = enumC5055p;
    }

    /* JADX INFO: renamed from: k0 */
    public void m32826k0() throws IOException {
        int iM32813Q = this.f29693t;
        if (iM32813Q == 0) {
            iM32813Q = m32813Q();
        }
        if (iM32813Q != 2) {
            throw m32810p1("END_OBJECT");
        }
        int i7 = this.f29698y;
        int i8 = i7 - 1;
        this.f29698y = i8;
        this.f29699z[i8] = null;
        int[] iArr = this.f29684A;
        int i9 = i7 - 2;
        iArr[i9] = iArr[i9] + 1;
        this.f29693t = 0;
    }

    /* JADX INFO: renamed from: m */
    public void m32827m() throws IOException {
        int iM32813Q = this.f29693t;
        if (iM32813Q == 0) {
            iM32813Q = m32813Q();
        }
        if (iM32813Q != 3) {
            throw m32810p1("BEGIN_ARRAY");
        }
        m32801g1(1);
        this.f29684A[this.f29698y - 1] = 0;
        this.f29693t = 0;
    }

    /* JADX INFO: renamed from: n */
    public void m32828n() throws IOException {
        int iM32813Q = this.f29693t;
        if (iM32813Q == 0) {
            iM32813Q = m32813Q();
        }
        if (iM32813Q != 1) {
            throw m32810p1("BEGIN_OBJECT");
        }
        m32801g1(3);
        this.f29693t = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: n1 */
    public void m32829n1() throws IOException {
        int i7 = 0;
        do {
            int iM32813Q = this.f29693t;
            if (iM32813Q == 0) {
                iM32813Q = m32813Q();
            }
            switch (iM32813Q) {
                case 1:
                    m32801g1(3);
                    i7++;
                    this.f29693t = 0;
                    break;
                case 2:
                    if (i7 == 0) {
                        this.f29699z[this.f29698y - 1] = null;
                    }
                    this.f29698y--;
                    i7--;
                    this.f29693t = 0;
                    break;
                case 3:
                    m32801g1(1);
                    i7++;
                    this.f29693t = 0;
                    break;
                case 4:
                    this.f29698y--;
                    i7--;
                    this.f29693t = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f29693t = 0;
                    break;
                case 8:
                    m32803j1('\'');
                    this.f29693t = 0;
                    break;
                case 9:
                    m32803j1('\"');
                    this.f29693t = 0;
                    break;
                case 10:
                    m32807m1();
                    this.f29693t = 0;
                    break;
                case 12:
                    m32803j1('\'');
                    if (i7 == 0) {
                        this.f29699z[this.f29698y - 1] = "<skipped>";
                    }
                    this.f29693t = 0;
                    break;
                case 13:
                    m32803j1('\"');
                    if (i7 == 0) {
                        this.f29699z[this.f29698y - 1] = "<skipped>";
                    }
                    this.f29693t = 0;
                    break;
                case 14:
                    m32807m1();
                    if (i7 == 0) {
                        this.f29699z[this.f29698y - 1] = "<skipped>";
                    }
                    this.f29693t = 0;
                    break;
                case 16:
                    this.f29689e += this.f29695v;
                    this.f29693t = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i7 > 0);
        int[] iArr = this.f29684A;
        int i8 = this.f29698y - 1;
        iArr[i8] = iArr[i8] + 1;
    }

    /* JADX INFO: renamed from: p0 */
    public String m32830p0() {
        return m32808o0(true);
    }

    /* JADX INFO: renamed from: q0 */
    public String m32831q0() {
        return m32808o0(false);
    }

    public String toString() {
        return getClass().getSimpleName() + m32815S0();
    }

    /* JADX INFO: renamed from: w0 */
    public final EnumC5055p m32832w0() {
        return this.f29686b;
    }
}
