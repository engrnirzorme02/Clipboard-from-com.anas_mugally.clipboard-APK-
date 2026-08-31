package p048F6;

import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1426d;
import p302m6.AbstractC6406h;

/* JADX INFO: renamed from: F6.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0436B extends C0465z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0436B(String source) {
        super(source);
        AbstractC6118n.m27187e(source, "source");
    }

    @Override // p048F6.AbstractC0440a
    /* JADX INFO: renamed from: C */
    public byte mo1872C() {
        String strMo1897A = mo1897A();
        int iMo1873G = mo1873G();
        if (iMo1873G >= strMo1897A.length() || iMo1873G == -1) {
            return (byte) 10;
        }
        this.f1708a = iMo1873G;
        return AbstractC0441b.m1919a(strMo1897A.charAt(iMo1873G));
    }

    @Override // p048F6.C0465z, p048F6.AbstractC0440a
    /* JADX INFO: renamed from: G */
    public int mo1873G() {
        int i7;
        int iZ = this.f1708a;
        if (iZ == -1) {
            return iZ;
        }
        String strMo1897A = mo1897A();
        while (iZ < strMo1897A.length()) {
            char cCharAt = strMo1897A.charAt(iZ);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt != '/' || (i7 = iZ + 1) >= strMo1897A.length()) {
                    break;
                }
                char cCharAt2 = strMo1897A.charAt(i7);
                if (cCharAt2 == '*') {
                    int iA0 = AbstractC6406h.m27602a0(strMo1897A, "*/", iZ + 2, false, 4, null);
                    if (iA0 == -1) {
                        this.f1708a = strMo1897A.length();
                        AbstractC0440a.m1894v(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                        throw new C1426d();
                    }
                    iZ = iA0 + 2;
                } else {
                    if (cCharAt2 != '/') {
                        break;
                    }
                    iZ = AbstractC6406h.m27601Z(strMo1897A, '\n', iZ + 2, false, 4, null);
                    iZ = iZ == -1 ? strMo1897A.length() : iZ + 1;
                }
            }
        }
        this.f1708a = iZ;
        return iZ;
    }

    @Override // p048F6.C0465z, p048F6.AbstractC0440a
    /* JADX INFO: renamed from: e */
    public boolean mo1874e() {
        int iMo1873G = mo1873G();
        if (iMo1873G >= mo1897A().length() || iMo1873G == -1) {
            return false;
        }
        return m1898B(mo1897A().charAt(iMo1873G));
    }

    @Override // p048F6.C0465z, p048F6.AbstractC0440a
    /* JADX INFO: renamed from: j */
    public byte mo1875j() {
        String strMo1897A = mo1897A();
        int iMo1873G = mo1873G();
        if (iMo1873G >= strMo1897A.length() || iMo1873G == -1) {
            return (byte) 10;
        }
        this.f1708a = iMo1873G + 1;
        return AbstractC0441b.m1919a(strMo1897A.charAt(iMo1873G));
    }

    @Override // p048F6.C0465z, p048F6.AbstractC0440a
    /* JADX INFO: renamed from: k */
    public void mo1876k(char c7) {
        String strMo1897A = mo1897A();
        int iMo1873G = mo1873G();
        if (iMo1873G >= strMo1897A.length() || iMo1873G == -1) {
            this.f1708a = -1;
            m1905M(c7);
        }
        char cCharAt = strMo1897A.charAt(iMo1873G);
        this.f1708a = iMo1873G + 1;
        if (cCharAt == c7) {
            return;
        }
        m1905M(c7);
    }
}
