package p048F6;

import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1426d;
import p302m6.AbstractC6406h;

/* JADX INFO: renamed from: F6.z */
/* JADX INFO: loaded from: classes.dex */
public class C0465z extends AbstractC0440a {

    /* JADX INFO: renamed from: e */
    private final String f1757e;

    public C0465z(String source) {
        AbstractC6118n.m27187e(source, "source");
        this.f1757e = source;
    }

    @Override // p048F6.AbstractC0440a
    /* JADX INFO: renamed from: E */
    public int mo1900E(int i7) {
        if (i7 < mo1897A().length()) {
            return i7;
        }
        return -1;
    }

    @Override // p048F6.AbstractC0440a
    /* JADX INFO: renamed from: G */
    public int mo1873G() {
        char cCharAt;
        int i7 = this.f1708a;
        if (i7 == -1) {
            return i7;
        }
        String strMo1897A = mo1897A();
        while (i7 < strMo1897A.length() && ((cCharAt = strMo1897A.charAt(i7)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i7++;
        }
        this.f1708a = i7;
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p048F6.AbstractC0440a
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public String mo1897A() {
        return this.f1757e;
    }

    @Override // p048F6.AbstractC0440a
    /* JADX INFO: renamed from: e */
    public boolean mo1874e() {
        int i7 = this.f1708a;
        if (i7 == -1) {
            return false;
        }
        String strMo1897A = mo1897A();
        while (i7 < strMo1897A.length()) {
            char cCharAt = strMo1897A.charAt(i7);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f1708a = i7;
                return m1898B(cCharAt);
            }
            i7++;
        }
        this.f1708a = i7;
        return false;
    }

    @Override // p048F6.AbstractC0440a
    /* JADX INFO: renamed from: i */
    public String mo1908i() {
        mo1876k('\"');
        int i7 = this.f1708a;
        int iZ = AbstractC6406h.m27601Z(mo1897A(), '\"', i7, false, 4, null);
        if (iZ == -1) {
            m1912p();
            m1917w((byte) 1, false);
            throw new C1426d();
        }
        for (int i8 = i7; i8 < iZ; i8++) {
            if (mo1897A().charAt(i8) == '\\') {
                return m1911o(mo1897A(), this.f1708a, i8);
            }
        }
        this.f1708a = iZ + 1;
        String strSubstring = mo1897A().substring(i7, iZ);
        AbstractC6118n.m27186d(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // p048F6.AbstractC0440a
    /* JADX INFO: renamed from: j */
    public byte mo1875j() {
        String strMo1897A = mo1897A();
        int i7 = this.f1708a;
        while (i7 != -1 && i7 < strMo1897A.length()) {
            int i8 = i7 + 1;
            char cCharAt = strMo1897A.charAt(i7);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f1708a = i8;
                return AbstractC0441b.m1919a(cCharAt);
            }
            i7 = i8;
        }
        this.f1708a = strMo1897A.length();
        return (byte) 10;
    }

    @Override // p048F6.AbstractC0440a
    /* JADX INFO: renamed from: k */
    public void mo1876k(char c7) {
        if (this.f1708a == -1) {
            m1905M(c7);
        }
        String strMo1897A = mo1897A();
        int i7 = this.f1708a;
        while (i7 < strMo1897A.length()) {
            int i8 = i7 + 1;
            char cCharAt = strMo1897A.charAt(i7);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f1708a = i8;
                if (cCharAt == c7) {
                    return;
                } else {
                    m1905M(c7);
                }
            }
            i7 = i8;
        }
        this.f1708a = -1;
        m1905M(c7);
    }
}
