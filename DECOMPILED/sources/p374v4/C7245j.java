package p374v4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p030D4.C0198b;
import p334q4.C6835b;
import p398y4.AbstractC7551l;

/* JADX INFO: renamed from: v4.j */
/* JADX INFO: loaded from: classes.dex */
public class C7245j implements Iterable, Comparable {

    /* JADX INFO: renamed from: d */
    private static final C7245j f28873d = new C7245j("");

    /* JADX INFO: renamed from: a */
    private final C0198b[] f28874a;

    /* JADX INFO: renamed from: b */
    private final int f28875b;

    /* JADX INFO: renamed from: c */
    private final int f28876c;

    /* JADX INFO: renamed from: v4.j$a */
    class a implements Iterator {

        /* JADX INFO: renamed from: a */
        int f28877a;

        a() {
            this.f28877a = C7245j.this.f28875b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0198b next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements.");
            }
            C0198b[] c0198bArr = C7245j.this.f28874a;
            int i7 = this.f28877a;
            C0198b c0198b = c0198bArr[i7];
            this.f28877a = i7 + 1;
            return c0198b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f28877a < C7245j.this.f28876c;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Can't remove component from immutable Path!");
        }
    }

    public C7245j(C0198b... c0198bArr) {
        this.f28874a = (C0198b[]) Arrays.copyOf(c0198bArr, c0198bArr.length);
        this.f28875b = 0;
        this.f28876c = c0198bArr.length;
        for (C0198b c0198b : c0198bArr) {
            AbstractC7551l.m33234g(c0198b != null, "Can't construct a path with a null value!");
        }
    }

    /* JADX INFO: renamed from: B */
    public static C7245j m31990B(C7245j c7245j, C7245j c7245j2) {
        C0198b c0198bM32004z = c7245j.m32004z();
        C0198b c0198bM32004z2 = c7245j2.m32004z();
        if (c0198bM32004z == null) {
            return c7245j2;
        }
        if (c0198bM32004z.equals(c0198bM32004z2)) {
            return m31990B(c7245j.m31996C(), c7245j2.m31996C());
        }
        throw new C6835b("INTERNAL ERROR: " + c7245j2 + " is not contained in " + c7245j);
    }

    /* JADX INFO: renamed from: y */
    public static C7245j m31994y() {
        return f28873d;
    }

    /* JADX INFO: renamed from: A */
    public C7245j m31995A() {
        if (isEmpty()) {
            return null;
        }
        return new C7245j(this.f28874a, this.f28875b, this.f28876c - 1);
    }

    /* JADX INFO: renamed from: C */
    public C7245j m31996C() {
        int i7 = this.f28875b;
        if (!isEmpty()) {
            i7++;
        }
        return new C7245j(this.f28874a, i7, this.f28876c);
    }

    /* JADX INFO: renamed from: D */
    public String m31997D() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i7 = this.f28875b; i7 < this.f28876c; i7++) {
            if (i7 > this.f28875b) {
                sb.append("/");
            }
            sb.append(this.f28874a[i7].m992d());
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7245j)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C7245j c7245j = (C7245j) obj;
        if (size() != c7245j.size()) {
            return false;
        }
        int i7 = this.f28875b;
        for (int i8 = c7245j.f28875b; i7 < this.f28876c && i8 < c7245j.f28876c; i8++) {
            if (!this.f28874a[i7].equals(c7245j.f28874a[i8])) {
                return false;
            }
            i7++;
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = 0;
        for (int i7 = this.f28875b; i7 < this.f28876c; i7++) {
            iHashCode = (iHashCode * 37) + this.f28874a[i7].hashCode();
        }
        return iHashCode;
    }

    public boolean isEmpty() {
        return this.f28875b >= this.f28876c;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    /* JADX INFO: renamed from: n */
    public List m31998n() {
        ArrayList arrayList = new ArrayList(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(((C0198b) it.next()).m992d());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public C7245j m31999p(C0198b c0198b) {
        int size = size();
        int i7 = size + 1;
        C0198b[] c0198bArr = new C0198b[i7];
        System.arraycopy(this.f28874a, this.f28875b, c0198bArr, 0, size);
        c0198bArr[size] = c0198b;
        return new C7245j(c0198bArr, 0, i7);
    }

    /* JADX INFO: renamed from: q */
    public C7245j m32000q(C7245j c7245j) {
        int size = size() + c7245j.size();
        C0198b[] c0198bArr = new C0198b[size];
        System.arraycopy(this.f28874a, this.f28875b, c0198bArr, 0, size());
        System.arraycopy(c7245j.f28874a, c7245j.f28875b, c0198bArr, size(), c7245j.size());
        return new C7245j(c0198bArr, 0, size);
    }

    public int size() {
        return this.f28876c - this.f28875b;
    }

    public String toString() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i7 = this.f28875b; i7 < this.f28876c; i7++) {
            sb.append("/");
            sb.append(this.f28874a[i7].m992d());
        }
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int compareTo(C7245j c7245j) {
        int i7;
        int i8 = this.f28875b;
        int i9 = c7245j.f28875b;
        while (true) {
            i7 = this.f28876c;
            if (i8 >= i7 || i9 >= c7245j.f28876c) {
                break;
            }
            int iCompareTo = this.f28874a[i8].compareTo(c7245j.f28874a[i9]);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            i8++;
            i9++;
        }
        if (i8 == i7 && i9 == c7245j.f28876c) {
            return 0;
        }
        return i8 == i7 ? -1 : 1;
    }

    /* JADX INFO: renamed from: w */
    public boolean m32002w(C7245j c7245j) {
        if (size() > c7245j.size()) {
            return false;
        }
        int i7 = this.f28875b;
        int i8 = c7245j.f28875b;
        while (i7 < this.f28876c) {
            if (!this.f28874a[i7].equals(c7245j.f28874a[i8])) {
                return false;
            }
            i7++;
            i8++;
        }
        return true;
    }

    /* JADX INFO: renamed from: x */
    public C0198b m32003x() {
        if (isEmpty()) {
            return null;
        }
        return this.f28874a[this.f28876c - 1];
    }

    /* JADX INFO: renamed from: z */
    public C0198b m32004z() {
        if (isEmpty()) {
            return null;
        }
        return this.f28874a[this.f28875b];
    }

    public C7245j(List list) {
        this.f28874a = new C0198b[list.size()];
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            this.f28874a[i7] = C0198b.m988j((String) it.next());
            i7++;
        }
        this.f28875b = 0;
        this.f28876c = list.size();
    }

    public C7245j(String str) {
        String[] strArrSplit = str.split("/", -1);
        int i7 = 0;
        for (String str2 : strArrSplit) {
            if (str2.length() > 0) {
                i7++;
            }
        }
        this.f28874a = new C0198b[i7];
        int i8 = 0;
        for (String str3 : strArrSplit) {
            if (str3.length() > 0) {
                this.f28874a[i8] = C0198b.m988j(str3);
                i8++;
            }
        }
        this.f28875b = 0;
        this.f28876c = this.f28874a.length;
    }

    private C7245j(C0198b[] c0198bArr, int i7, int i8) {
        this.f28874a = c0198bArr;
        this.f28875b = i7;
        this.f28876c = i8;
    }
}
