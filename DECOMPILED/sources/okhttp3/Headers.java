package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6107c;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.Util;
import p145S5.AbstractC1440r;
import p145S5.C1435m;
import p152T5.AbstractC1638q;
import p194Z5.AbstractC2168c;
import p246f6.InterfaceC5442a;
import p302m6.AbstractC6406h;

/* JADX INFO: loaded from: classes.dex */
public final class Headers implements Iterable<C1435m>, InterfaceC5442a {

    /* JADX INFO: renamed from: b */
    public static final Companion f25275b = new Companion(null);

    /* JADX INFO: renamed from: a */
    private final String[] f25276a;

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private final List f25277a = new ArrayList(20);

        /* JADX INFO: renamed from: a */
        public final Builder m28482a(String name, String value) {
            AbstractC6118n.m27187e(name, "name");
            AbstractC6118n.m27187e(value, "value");
            Companion companion = Headers.f25275b;
            companion.m28493d(name);
            companion.m28494e(value, name);
            m28484c(name, value);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final Builder m28483b(String line) {
            AbstractC6118n.m27187e(line, "line");
            int iZ = AbstractC6406h.m27601Z(line, ':', 1, false, 4, null);
            if (iZ != -1) {
                String strSubstring = line.substring(0, iZ);
                AbstractC6118n.m27186d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iZ + 1);
                AbstractC6118n.m27186d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                m28484c(strSubstring, strSubstring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                m28484c("", line);
                return this;
            }
            String strSubstring3 = line.substring(1);
            AbstractC6118n.m27186d(strSubstring3, "this as java.lang.String).substring(startIndex)");
            m28484c("", strSubstring3);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final Builder m28484c(String name, String value) {
            AbstractC6118n.m27187e(name, "name");
            AbstractC6118n.m27187e(value, "value");
            this.f25277a.add(name);
            this.f25277a.add(AbstractC6406h.m27594S0(value).toString());
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final Headers m28485d() {
            return new Headers((String[]) this.f25277a.toArray(new String[0]), null);
        }

        /* JADX INFO: renamed from: e */
        public final String m28486e(String name) {
            AbstractC6118n.m27187e(name, "name");
            int size = this.f25277a.size() - 2;
            int iM8789b = AbstractC2168c.m8789b(size, 0, -2);
            if (iM8789b > size) {
                return null;
            }
            while (!AbstractC6406h.m27564w(name, (String) this.f25277a.get(size), true)) {
                if (size == iM8789b) {
                    return null;
                }
                size -= 2;
            }
            return (String) this.f25277a.get(size + 1);
        }

        /* JADX INFO: renamed from: f */
        public final List m28487f() {
            return this.f25277a;
        }

        /* JADX INFO: renamed from: g */
        public final Builder m28488g(String name) {
            AbstractC6118n.m27187e(name, "name");
            int i7 = 0;
            while (i7 < this.f25277a.size()) {
                if (AbstractC6406h.m27564w(name, (String) this.f25277a.get(i7), true)) {
                    this.f25277a.remove(i7);
                    this.f25277a.remove(i7);
                    i7 -= 2;
                }
                i7 += 2;
            }
            return this;
        }

        /* JADX INFO: renamed from: h */
        public final Builder m28489h(String name, String value) {
            AbstractC6118n.m27187e(name, "name");
            AbstractC6118n.m27187e(value, "value");
            Companion companion = Headers.f25275b;
            companion.m28493d(name);
            companion.m28494e(value, name);
            m28488g(name);
            m28484c(name, value);
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public final void m28493d(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i7 = 0; i7 < length; i7++) {
                char cCharAt = str.charAt(i7);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(Util.m28780t("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i7), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public final void m28494e(String str, String str2) {
            int length = str.length();
            for (int i7 = 0; i7 < length; i7++) {
                char cCharAt = str.charAt(i7);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Util.m28780t("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i7), str2));
                    sb.append(Util.m28739H(str2) ? "" : ": " + str);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public final String m28495f(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iM8789b = AbstractC2168c.m8789b(length, 0, -2);
            if (iM8789b > length) {
                return null;
            }
            while (!AbstractC6406h.m27564w(str, strArr[length], true)) {
                if (length == iM8789b) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        /* JADX INFO: renamed from: g */
        public final Headers m28496g(String... namesAndValues) {
            AbstractC6118n.m27187e(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i7 = 0;
            for (int i8 = 0; i8 < length; i8++) {
                String str = strArr[i8];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr[i8] = AbstractC6406h.m27594S0(str).toString();
            }
            int iM8789b = AbstractC2168c.m8789b(0, strArr.length - 1, 2);
            if (iM8789b >= 0) {
                while (true) {
                    String str2 = strArr[i7];
                    String str3 = strArr[i7 + 1];
                    m28493d(str2);
                    m28494e(str3, str2);
                    if (i7 == iM8789b) {
                        break;
                    }
                    i7 += 2;
                }
            }
            return new Headers(strArr, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ Headers(String[] strArr, AbstractC6112h abstractC6112h) {
        this(strArr);
    }

    /* JADX INFO: renamed from: a */
    public final String m28477a(String name) {
        AbstractC6118n.m27187e(name, "name");
        return f25275b.m28495f(this.f25276a, name);
    }

    /* JADX INFO: renamed from: b */
    public final String m28478b(int i7) {
        return this.f25276a[i7 * 2];
    }

    /* JADX INFO: renamed from: e */
    public final Builder m28479e() {
        Builder builder = new Builder();
        AbstractC1638q.m6780w(builder.m28487f(), this.f25276a);
        return builder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.f25276a, ((Headers) obj).f25276a);
    }

    /* JADX INFO: renamed from: g */
    public final String m28480g(int i7) {
        return this.f25276a[(i7 * 2) + 1];
    }

    public int hashCode() {
        return Arrays.hashCode(this.f25276a);
    }

    @Override // java.lang.Iterable
    public Iterator<C1435m> iterator() {
        int size = size();
        C1435m[] c1435mArr = new C1435m[size];
        for (int i7 = 0; i7 < size; i7++) {
            c1435mArr[i7] = AbstractC1440r.m6083a(m28478b(i7), m28480g(i7));
        }
        return AbstractC6107c.m27171a(c1435mArr);
    }

    /* JADX INFO: renamed from: k */
    public final List m28481k(String name) {
        AbstractC6118n.m27187e(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < size; i7++) {
            if (AbstractC6406h.m27564w(name, m28478b(i7), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m28480g(i7));
            }
        }
        if (arrayList == null) {
            return AbstractC1638q.m6765j();
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        AbstractC6118n.m27186d(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public final int size() {
        return this.f25276a.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            String strM28478b = m28478b(i7);
            String strM28480g = m28480g(i7);
            sb.append(strM28478b);
            sb.append(": ");
            if (Util.m28739H(strM28478b)) {
                strM28480g = "██";
            }
            sb.append(strM28480g);
            sb.append("\n");
        }
        String string = sb.toString();
        AbstractC6118n.m27186d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private Headers(String[] strArr) {
        this.f25276a = strArr;
    }
}
