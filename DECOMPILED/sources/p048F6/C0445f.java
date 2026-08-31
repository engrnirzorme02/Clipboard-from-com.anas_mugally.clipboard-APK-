package p048F6;

/* JADX INFO: renamed from: F6.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0445f {

    /* JADX INFO: renamed from: a */
    public static final C0445f f1716a;

    /* JADX INFO: renamed from: b */
    public static final char[] f1717b;

    /* JADX INFO: renamed from: c */
    public static final byte[] f1718c;

    static {
        C0445f c0445f = new C0445f();
        f1716a = c0445f;
        f1717b = new char[117];
        f1718c = new byte[126];
        c0445f.m1932f();
        c0445f.m1931e();
    }

    private C0445f() {
    }

    /* JADX INFO: renamed from: a */
    private final void m1927a(char c7, char c8) {
        m1928b(c7, c8);
    }

    /* JADX INFO: renamed from: b */
    private final void m1928b(int i7, char c7) {
        if (c7 != 'u') {
            f1717b[c7] = (char) i7;
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m1929c(char c7, byte b7) {
        m1930d(c7, b7);
    }

    /* JADX INFO: renamed from: d */
    private final void m1930d(int i7, byte b7) {
        f1718c[i7] = b7;
    }

    /* JADX INFO: renamed from: e */
    private final void m1931e() {
        for (int i7 = 0; i7 < 33; i7++) {
            m1930d(i7, (byte) 127);
        }
        m1930d(9, (byte) 3);
        m1930d(10, (byte) 3);
        m1930d(13, (byte) 3);
        m1930d(32, (byte) 3);
        m1929c(',', (byte) 4);
        m1929c(':', (byte) 5);
        m1929c('{', (byte) 6);
        m1929c('}', (byte) 7);
        m1929c('[', (byte) 8);
        m1929c(']', (byte) 9);
        m1929c('\"', (byte) 1);
        m1929c('\\', (byte) 2);
    }

    /* JADX INFO: renamed from: f */
    private final void m1932f() {
        for (int i7 = 0; i7 < 32; i7++) {
            m1928b(i7, 'u');
        }
        m1928b(8, 'b');
        m1928b(9, 't');
        m1928b(10, 'n');
        m1928b(12, 'f');
        m1928b(13, 'r');
        m1927a('/', '/');
        m1927a('\"', '\"');
        m1927a('\\', '\\');
    }
}
