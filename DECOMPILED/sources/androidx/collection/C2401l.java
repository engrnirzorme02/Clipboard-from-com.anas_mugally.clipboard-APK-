package androidx.collection;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1631j;
import p353t.AbstractC7065a;

/* JADX INFO: renamed from: androidx.collection.l */
/* JADX INFO: loaded from: classes.dex */
public class C2401l implements Cloneable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f8479a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int[] f8480b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f8481c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f8482d;

    public C2401l() {
        this(0, 1, null);
    }

    /* JADX INFO: renamed from: a */
    public void m10302a(int i7, Object obj) {
        int i8 = this.f8482d;
        if (i8 != 0 && i7 <= this.f8480b[i8 - 1]) {
            m10308g(i7, obj);
            return;
        }
        if (this.f8479a && i8 >= this.f8480b.length) {
            AbstractC2402m.m10314d(this);
        }
        int i9 = this.f8482d;
        if (i9 >= this.f8480b.length) {
            int iM31158e = AbstractC7065a.m31158e(i9 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f8480b, iM31158e);
            AbstractC6118n.m27186d(iArrCopyOf, "copyOf(this, newSize)");
            this.f8480b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f8481c, iM31158e);
            AbstractC6118n.m27186d(objArrCopyOf, "copyOf(this, newSize)");
            this.f8481c = objArrCopyOf;
        }
        this.f8480b[i9] = i7;
        this.f8481c[i9] = obj;
        this.f8482d = i9 + 1;
    }

    /* JADX INFO: renamed from: b */
    public void m10303b() {
        int i7 = this.f8482d;
        Object[] objArr = this.f8481c;
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = null;
        }
        this.f8482d = 0;
        this.f8479a = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C2401l clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC6118n.m27185c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C2401l c2401l = (C2401l) objClone;
        c2401l.f8480b = (int[]) this.f8480b.clone();
        c2401l.f8481c = (Object[]) this.f8481c.clone();
        return c2401l;
    }

    /* JADX INFO: renamed from: d */
    public Object m10305d(int i7) {
        return AbstractC2402m.m10313c(this, i7);
    }

    /* JADX INFO: renamed from: e */
    public int m10306e(Object obj) {
        if (this.f8479a) {
            AbstractC2402m.m10314d(this);
        }
        int i7 = this.f8482d;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f8481c[i8] == obj) {
                return i8;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public int m10307f(int i7) {
        if (this.f8479a) {
            AbstractC2402m.m10314d(this);
        }
        return this.f8480b[i7];
    }

    /* JADX INFO: renamed from: g */
    public void m10308g(int i7, Object obj) {
        int iM31154a = AbstractC7065a.m31154a(this.f8480b, this.f8482d, i7);
        if (iM31154a >= 0) {
            this.f8481c[iM31154a] = obj;
            return;
        }
        int i8 = ~iM31154a;
        if (i8 < this.f8482d && this.f8481c[i8] == AbstractC2402m.f8483a) {
            this.f8480b[i8] = i7;
            this.f8481c[i8] = obj;
            return;
        }
        if (this.f8479a && this.f8482d >= this.f8480b.length) {
            AbstractC2402m.m10314d(this);
            i8 = ~AbstractC7065a.m31154a(this.f8480b, this.f8482d, i7);
        }
        int i9 = this.f8482d;
        if (i9 >= this.f8480b.length) {
            int iM31158e = AbstractC7065a.m31158e(i9 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f8480b, iM31158e);
            AbstractC6118n.m27186d(iArrCopyOf, "copyOf(this, newSize)");
            this.f8480b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f8481c, iM31158e);
            AbstractC6118n.m27186d(objArrCopyOf, "copyOf(this, newSize)");
            this.f8481c = objArrCopyOf;
        }
        int i10 = this.f8482d;
        if (i10 - i8 != 0) {
            int[] iArr = this.f8480b;
            int i11 = i8 + 1;
            AbstractC1631j.m6692e(iArr, iArr, i11, i8, i10);
            Object[] objArr = this.f8481c;
            AbstractC1631j.m6694g(objArr, objArr, i11, i8, this.f8482d);
        }
        this.f8480b[i8] = i7;
        this.f8481c[i8] = obj;
        this.f8482d++;
    }

    /* JADX INFO: renamed from: h */
    public int m10309h() {
        if (this.f8479a) {
            AbstractC2402m.m10314d(this);
        }
        return this.f8482d;
    }

    /* JADX INFO: renamed from: i */
    public Object m10310i(int i7) {
        if (this.f8479a) {
            AbstractC2402m.m10314d(this);
        }
        return this.f8481c[i7];
    }

    public String toString() {
        if (m10309h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8482d * 28);
        sb.append('{');
        int i7 = this.f8482d;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(m10307f(i8));
            sb.append('=');
            Object objM10310i = m10310i(i8);
            if (objM10310i != this) {
                sb.append(objM10310i);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC6118n.m27186d(string, "buffer.toString()");
        return string;
    }

    public C2401l(int i7) {
        if (i7 == 0) {
            this.f8480b = AbstractC7065a.f28224a;
            this.f8481c = AbstractC7065a.f28226c;
        } else {
            int iM31158e = AbstractC7065a.m31158e(i7);
            this.f8480b = new int[iM31158e];
            this.f8481c = new Object[iM31158e];
        }
    }

    public /* synthetic */ C2401l(int i7, int i8, AbstractC6112h abstractC6112h) {
        this((i8 & 1) != 0 ? 10 : i7);
    }
}
