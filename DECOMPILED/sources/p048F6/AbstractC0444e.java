package p048F6;

import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1444v;
import p152T5.C1630i;

/* JADX INFO: renamed from: F6.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0444e {

    /* JADX INFO: renamed from: a */
    private final C1630i f1714a = new C1630i();

    /* JADX INFO: renamed from: b */
    private int f1715b;

    /* JADX INFO: renamed from: a */
    protected final void m1925a(char[] array) {
        AbstractC6118n.m27187e(array, "array");
        synchronized (this) {
            try {
                if (this.f1715b + array.length < AbstractC0442c.f1712a) {
                    this.f1715b += array.length;
                    this.f1714a.addLast(array);
                }
                C1444v c1444v = C1444v.f4971a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    protected final char[] m1926b(int i7) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.f1714a.m6687y();
            if (cArr != null) {
                this.f1715b -= cArr.length;
            } else {
                cArr = null;
            }
        }
        return cArr == null ? new char[i7] : cArr;
    }
}
