package p087K5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: K5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0756e {

    /* JADX INFO: renamed from: a */
    private final String[] f3055a;

    /* JADX INFO: renamed from: K5.e$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final List f3056a = new ArrayList(20);

        /* JADX INFO: renamed from: d */
        private void m3554d(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            }
            if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i7 = 0; i7 < length; i7++) {
                char cCharAt = str.charAt(i7);
                if (cCharAt <= 31 || cCharAt >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i7), str));
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("value == null");
            }
            int length2 = str2.length();
            for (int i8 = 0; i8 < length2; i8++) {
                char cCharAt2 = str2.charAt(i8);
                if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i8), str2));
                }
            }
        }

        /* JADX INFO: renamed from: b */
        b m3555b(String str, String str2) {
            this.f3056a.add(str);
            this.f3056a.add(str2.trim());
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C0756e m3556c() {
            return new C0756e(this);
        }

        /* JADX INFO: renamed from: e */
        public b m3557e(String str) {
            int i7 = 0;
            while (i7 < this.f3056a.size()) {
                if (str.equalsIgnoreCase((String) this.f3056a.get(i7))) {
                    this.f3056a.remove(i7);
                    this.f3056a.remove(i7);
                    i7 -= 2;
                }
                i7 += 2;
            }
            return this;
        }

        /* JADX INFO: renamed from: f */
        public b m3558f(String str, String str2) {
            m3554d(str, str2);
            m3557e(str);
            m3555b(str, str2);
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m3550a(int i7) {
        int i8 = i7 * 2;
        if (i8 < 0) {
            return null;
        }
        String[] strArr = this.f3055a;
        if (i8 >= strArr.length) {
            return null;
        }
        return strArr[i8];
    }

    /* JADX INFO: renamed from: b */
    public int m3551b() {
        return this.f3055a.length / 2;
    }

    /* JADX INFO: renamed from: c */
    public String m3552c(int i7) {
        int i8 = (i7 * 2) + 1;
        if (i8 < 0) {
            return null;
        }
        String[] strArr = this.f3055a;
        if (i8 >= strArr.length) {
            return null;
        }
        return strArr[i8];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int iM3551b = m3551b();
        for (int i7 = 0; i7 < iM3551b; i7++) {
            sb.append(m3550a(i7));
            sb.append(": ");
            sb.append(m3552c(i7));
            sb.append("\n");
        }
        return sb.toString();
    }

    private C0756e(b bVar) {
        this.f3055a = (String[]) bVar.f3056a.toArray(new String[bVar.f3056a.size()]);
    }
}
