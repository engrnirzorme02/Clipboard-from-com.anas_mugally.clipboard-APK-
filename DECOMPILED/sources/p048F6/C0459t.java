package p048F6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6118n;
import p016B6.AbstractC0099g;
import p016B6.InterfaceC0096d;

/* JADX INFO: renamed from: F6.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0459t {

    /* JADX INFO: renamed from: a */
    private Object[] f1730a = new Object[8];

    /* JADX INFO: renamed from: b */
    private int[] f1731b;

    /* JADX INFO: renamed from: c */
    private int f1732c;

    /* JADX INFO: renamed from: F6.t$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f1733a = new a();

        private a() {
        }
    }

    public C0459t() {
        int[] iArr = new int[8];
        for (int i7 = 0; i7 < 8; i7++) {
            iArr[i7] = -1;
        }
        this.f1731b = iArr;
        this.f1732c = -1;
    }

    /* JADX INFO: renamed from: e */
    private final void m1981e() {
        int i7 = this.f1732c * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.f1730a, i7);
        AbstractC6118n.m27186d(objArrCopyOf, "copyOf(...)");
        this.f1730a = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.f1731b, i7);
        AbstractC6118n.m27186d(iArrCopyOf, "copyOf(...)");
        this.f1731b = iArrCopyOf;
    }

    /* JADX INFO: renamed from: a */
    public final String m1982a() {
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        int i7 = this.f1732c + 1;
        for (int i8 = 0; i8 < i7; i8++) {
            Object obj = this.f1730a[i8];
            if (obj instanceof InterfaceC0096d) {
                InterfaceC0096d interfaceC0096d = (InterfaceC0096d) obj;
                if (!AbstractC6118n.m27183a(interfaceC0096d.mo374e(), AbstractC0099g.b.f528a)) {
                    int i9 = this.f1731b[i8];
                    if (i9 >= 0) {
                        sb.append(".");
                        sb.append(interfaceC0096d.mo376g(i9));
                    }
                } else if (this.f1731b[i8] != -1) {
                    sb.append("[");
                    sb.append(this.f1731b[i8]);
                    sb.append("]");
                }
            } else if (obj != a.f1733a) {
                sb.append("[");
                sb.append("'");
                sb.append(obj);
                sb.append("'");
                sb.append("]");
            }
        }
        String string = sb.toString();
        AbstractC6118n.m27186d(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: b */
    public final void m1983b() {
        int i7 = this.f1732c;
        int[] iArr = this.f1731b;
        if (iArr[i7] == -2) {
            iArr[i7] = -1;
            this.f1732c = i7 - 1;
        }
        int i8 = this.f1732c;
        if (i8 != -1) {
            this.f1732c = i8 - 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1984c(InterfaceC0096d sd) {
        AbstractC6118n.m27187e(sd, "sd");
        int i7 = this.f1732c + 1;
        this.f1732c = i7;
        if (i7 == this.f1730a.length) {
            m1981e();
        }
        this.f1730a[i7] = sd;
    }

    /* JADX INFO: renamed from: d */
    public final void m1985d() {
        int[] iArr = this.f1731b;
        int i7 = this.f1732c;
        if (iArr[i7] == -2) {
            this.f1730a[i7] = a.f1733a;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1986f(Object obj) {
        int[] iArr = this.f1731b;
        int i7 = this.f1732c;
        if (iArr[i7] != -2) {
            int i8 = i7 + 1;
            this.f1732c = i8;
            if (i8 == this.f1730a.length) {
                m1981e();
            }
        }
        Object[] objArr = this.f1730a;
        int i9 = this.f1732c;
        objArr[i9] = obj;
        this.f1731b[i9] = -2;
    }

    /* JADX INFO: renamed from: g */
    public final void m1987g(int i7) {
        this.f1731b[this.f1732c] = i7;
    }

    public String toString() {
        return m1982a();
    }
}
