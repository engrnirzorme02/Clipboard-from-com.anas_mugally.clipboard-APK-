package p122P3;

/* JADX INFO: renamed from: P3.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1198b {

    /* JADX INFO: renamed from: P3.b$a */
    static abstract class a extends AbstractC1198b {
        a() {
        }
    }

    /* JADX INFO: renamed from: P3.b$b */
    private static final class b extends a {

        /* JADX INFO: renamed from: a */
        private final char f4272a;

        b(char c7) {
            this.f4272a = c7;
        }

        public String toString() {
            return "CharMatcher.is('" + AbstractC1198b.m5258d(this.f4272a) + "')";
        }
    }

    /* JADX INFO: renamed from: P3.b$c */
    static abstract class c extends a {

        /* JADX INFO: renamed from: a */
        private final String f4273a;

        c(String str) {
            this.f4273a = (String) AbstractC1209m.m5302n(str);
        }

        public final String toString() {
            return this.f4273a;
        }
    }

    /* JADX INFO: renamed from: P3.b$d */
    private static final class d extends c {

        /* JADX INFO: renamed from: b */
        static final d f4274b = new d();

        private d() {
            super("CharMatcher.none()");
        }
    }

    /* JADX INFO: renamed from: P3.b$e */
    static final class e extends c {

        /* JADX INFO: renamed from: b */
        static final int f4275b = Integer.numberOfLeadingZeros(31);

        /* JADX INFO: renamed from: c */
        static final e f4276c = new e();

        e() {
            super("CharMatcher.whitespace()");
        }
    }

    protected AbstractC1198b() {
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC1198b m5256b(char c7) {
        return new b(c7);
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC1198b m5257c() {
        return d.f4274b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static String m5258d(char c7) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            cArr[5 - i7] = "0123456789ABCDEF".charAt(c7 & 15);
            c7 = (char) (c7 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC1198b m5259e() {
        return e.f4276c;
    }
}
