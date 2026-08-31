package androidx.collection;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1631j;
import p353t.AbstractC7065a;

/* JADX INFO: renamed from: androidx.collection.h */
/* JADX INFO: loaded from: classes.dex */
public class C2397h implements Cloneable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f8471a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long[] f8472b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f8473c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f8474d;

    public C2397h() {
        this(0, 1, null);
    }

    /* JADX INFO: renamed from: a */
    public void m10281a() {
        int i7 = this.f8474d;
        Object[] objArr = this.f8473c;
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = null;
        }
        this.f8474d = 0;
        this.f8471a = false;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2397h clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC6118n.m27185c(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C2397h c2397h = (C2397h) objClone;
        c2397h.f8472b = (long[]) this.f8472b.clone();
        c2397h.f8473c = (Object[]) this.f8473c.clone();
        return c2397h;
    }

    /* JADX INFO: renamed from: c */
    public boolean m10283c(long j7) {
        return m10285e(j7) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public Object m10284d(long j7) {
        int iM31155b = AbstractC7065a.m31155b(this.f8472b, this.f8474d, j7);
        if (iM31155b < 0 || this.f8473c[iM31155b] == AbstractC2398i.f8475a) {
            return null;
        }
        return this.f8473c[iM31155b];
    }

    /* JADX INFO: renamed from: e */
    public int m10285e(long j7) {
        if (this.f8471a) {
            int i7 = this.f8474d;
            long[] jArr = this.f8472b;
            Object[] objArr = this.f8473c;
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                Object obj = objArr[i9];
                if (obj != AbstractC2398i.f8475a) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.f8471a = false;
            this.f8474d = i8;
        }
        return AbstractC7065a.m31155b(this.f8472b, this.f8474d, j7);
    }

    /* JADX INFO: renamed from: f */
    public boolean m10286f() {
        return m10291k() == 0;
    }

    /* JADX INFO: renamed from: g */
    public long m10287g(int i7) {
        int i8;
        if (i7 < 0 || i7 >= (i8 = this.f8474d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i7).toString());
        }
        if (this.f8471a) {
            long[] jArr = this.f8472b;
            Object[] objArr = this.f8473c;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != AbstractC2398i.f8475a) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.f8471a = false;
            this.f8474d = i9;
        }
        return this.f8472b[i7];
    }

    /* JADX INFO: renamed from: h */
    public void m10288h(long j7, Object obj) {
        int iM31155b = AbstractC7065a.m31155b(this.f8472b, this.f8474d, j7);
        if (iM31155b >= 0) {
            this.f8473c[iM31155b] = obj;
            return;
        }
        int i7 = ~iM31155b;
        if (i7 < this.f8474d && this.f8473c[i7] == AbstractC2398i.f8475a) {
            this.f8472b[i7] = j7;
            this.f8473c[i7] = obj;
            return;
        }
        if (this.f8471a) {
            int i8 = this.f8474d;
            long[] jArr = this.f8472b;
            if (i8 >= jArr.length) {
                Object[] objArr = this.f8473c;
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    Object obj2 = objArr[i10];
                    if (obj2 != AbstractC2398i.f8475a) {
                        if (i10 != i9) {
                            jArr[i9] = jArr[i10];
                            objArr[i9] = obj2;
                            objArr[i10] = null;
                        }
                        i9++;
                    }
                }
                this.f8471a = false;
                this.f8474d = i9;
                i7 = ~AbstractC7065a.m31155b(this.f8472b, i9, j7);
            }
        }
        int i11 = this.f8474d;
        if (i11 >= this.f8472b.length) {
            int iM31159f = AbstractC7065a.m31159f(i11 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f8472b, iM31159f);
            AbstractC6118n.m27186d(jArrCopyOf, "copyOf(this, newSize)");
            this.f8472b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f8473c, iM31159f);
            AbstractC6118n.m27186d(objArrCopyOf, "copyOf(this, newSize)");
            this.f8473c = objArrCopyOf;
        }
        int i12 = this.f8474d;
        if (i12 - i7 != 0) {
            long[] jArr2 = this.f8472b;
            int i13 = i7 + 1;
            AbstractC1631j.m6693f(jArr2, jArr2, i13, i7, i12);
            Object[] objArr2 = this.f8473c;
            AbstractC1631j.m6694g(objArr2, objArr2, i13, i7, this.f8474d);
        }
        this.f8472b[i7] = j7;
        this.f8473c[i7] = obj;
        this.f8474d++;
    }

    /* JADX INFO: renamed from: i */
    public void m10289i(long j7) {
        int iM31155b = AbstractC7065a.m31155b(this.f8472b, this.f8474d, j7);
        if (iM31155b < 0 || this.f8473c[iM31155b] == AbstractC2398i.f8475a) {
            return;
        }
        this.f8473c[iM31155b] = AbstractC2398i.f8475a;
        this.f8471a = true;
    }

    /* JADX INFO: renamed from: j */
    public void m10290j(int i7) {
        if (this.f8473c[i7] != AbstractC2398i.f8475a) {
            this.f8473c[i7] = AbstractC2398i.f8475a;
            this.f8471a = true;
        }
    }

    /* JADX INFO: renamed from: k */
    public int m10291k() {
        if (this.f8471a) {
            int i7 = this.f8474d;
            long[] jArr = this.f8472b;
            Object[] objArr = this.f8473c;
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                Object obj = objArr[i9];
                if (obj != AbstractC2398i.f8475a) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.f8471a = false;
            this.f8474d = i8;
        }
        return this.f8474d;
    }

    /* JADX INFO: renamed from: l */
    public Object m10292l(int i7) {
        int i8;
        if (i7 < 0 || i7 >= (i8 = this.f8474d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i7).toString());
        }
        if (this.f8471a) {
            long[] jArr = this.f8472b;
            Object[] objArr = this.f8473c;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != AbstractC2398i.f8475a) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.f8471a = false;
            this.f8474d = i9;
        }
        return this.f8473c[i7];
    }

    public String toString() {
        if (m10291k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8474d * 28);
        sb.append('{');
        int i7 = this.f8474d;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(m10287g(i8));
            sb.append('=');
            Object objM10292l = m10292l(i8);
            if (objM10292l != sb) {
                sb.append(objM10292l);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC6118n.m27186d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public C2397h(int i7) {
        if (i7 == 0) {
            this.f8472b = AbstractC7065a.f28225b;
            this.f8473c = AbstractC7065a.f28226c;
        } else {
            int iM31159f = AbstractC7065a.m31159f(i7);
            this.f8472b = new long[iM31159f];
            this.f8473c = new Object[iM31159f];
        }
    }

    public /* synthetic */ C2397h(int i7, int i8, AbstractC6112h abstractC6112h) {
        this((i8 & 1) != 0 ? 10 : i7);
    }
}
