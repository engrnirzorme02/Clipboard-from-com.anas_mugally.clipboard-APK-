package p048F6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6118n;
import p278j6.AbstractC5905g;

/* JADX INFO: renamed from: F6.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0461v implements InterfaceC0451l {

    /* JADX INFO: renamed from: a */
    private char[] f1734a = C0443d.f1713c.m1924d();

    /* JADX INFO: renamed from: b */
    private int f1735b;

    /* JADX INFO: renamed from: e */
    private final void m1989e(int i7, int i8, String str) {
        byte b7;
        int length = str.length();
        while (i7 < length) {
            int iM1991g = m1991g(i8, 2);
            char cCharAt = str.charAt(i7);
            if (cCharAt >= AbstractC0437C.m1877a().length || (b7 = AbstractC0437C.m1877a()[cCharAt]) == 0) {
                int i9 = iM1991g + 1;
                this.f1734a[iM1991g] = cCharAt;
                i8 = i9;
            } else if (b7 == 1) {
                String str2 = AbstractC0437C.m1878b()[cCharAt];
                AbstractC6118n.m27184b(str2);
                int iM1991g2 = m1991g(iM1991g, str2.length());
                str2.getChars(0, str2.length(), this.f1734a, iM1991g2);
                i8 = iM1991g2 + str2.length();
                this.f1735b = i8;
            } else {
                char[] cArr = this.f1734a;
                cArr[iM1991g] = '\\';
                cArr[iM1991g + 1] = (char) b7;
                i8 = iM1991g + 2;
                this.f1735b = i8;
            }
            i7++;
        }
        int iM1991g3 = m1991g(i8, 1);
        this.f1734a[iM1991g3] = '\"';
        this.f1735b = iM1991g3 + 1;
    }

    /* JADX INFO: renamed from: f */
    private final void m1990f(int i7) {
        m1991g(this.f1735b, i7);
    }

    /* JADX INFO: renamed from: g */
    private final int m1991g(int i7, int i8) {
        int i9 = i8 + i7;
        char[] cArr = this.f1734a;
        if (cArr.length <= i9) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, AbstractC5905g.m26654b(i9, i7 * 2));
            AbstractC6118n.m27186d(cArrCopyOf, "copyOf(...)");
            this.f1734a = cArrCopyOf;
        }
        return i7;
    }

    @Override // p048F6.InterfaceC0451l
    /* JADX INFO: renamed from: a */
    public void mo1952a(char c7) {
        m1990f(1);
        char[] cArr = this.f1734a;
        int i7 = this.f1735b;
        this.f1735b = i7 + 1;
        cArr[i7] = c7;
    }

    @Override // p048F6.InterfaceC0451l
    /* JADX INFO: renamed from: b */
    public void mo1953b(String text) {
        AbstractC6118n.m27187e(text, "text");
        m1990f(text.length() + 2);
        char[] cArr = this.f1734a;
        int i7 = this.f1735b;
        int i8 = i7 + 1;
        cArr[i7] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i8);
        int i9 = length + i8;
        for (int i10 = i8; i10 < i9; i10++) {
            char c7 = cArr[i10];
            if (c7 < AbstractC0437C.m1877a().length && AbstractC0437C.m1877a()[c7] != 0) {
                m1989e(i10 - i8, i10, text);
                return;
            }
        }
        cArr[i9] = '\"';
        this.f1735b = i9 + 1;
    }

    @Override // p048F6.InterfaceC0451l
    /* JADX INFO: renamed from: c */
    public void mo1954c(long j7) {
        mo1955d(String.valueOf(j7));
    }

    @Override // p048F6.InterfaceC0451l
    /* JADX INFO: renamed from: d */
    public void mo1955d(String text) {
        AbstractC6118n.m27187e(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        m1990f(length);
        text.getChars(0, text.length(), this.f1734a, this.f1735b);
        this.f1735b += length;
    }

    /* JADX INFO: renamed from: h */
    public void m1992h() {
        C0443d.f1713c.m1923c(this.f1734a);
    }

    public String toString() {
        return new String(this.f1734a, 0, this.f1735b);
    }
}
