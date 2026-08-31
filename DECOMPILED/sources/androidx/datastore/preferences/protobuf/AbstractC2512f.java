package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2512f implements Iterable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final AbstractC2512f f9510b = new i(AbstractC2534u.f9726d);

    /* JADX INFO: renamed from: c */
    private static final f f9511c;

    /* JADX INFO: renamed from: d */
    private static final Comparator f9512d;

    /* JADX INFO: renamed from: a */
    private int f9513a = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$a */
    class a extends c {

        /* JADX INFO: renamed from: a */
        private int f9514a = 0;

        /* JADX INFO: renamed from: b */
        private final int f9515b;

        a() {
            this.f9515b = AbstractC2512f.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2512f.g
        /* JADX INFO: renamed from: d */
        public byte mo11156d() {
            int i7 = this.f9514a;
            if (i7 >= this.f9515b) {
                throw new NoSuchElementException();
            }
            this.f9514a = i7 + 1;
            return AbstractC2512f.this.mo11150p(i7);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9514a < this.f9515b;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$b */
    class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC2512f abstractC2512f, AbstractC2512f abstractC2512f2) {
            g gVarM11151q = abstractC2512f.m11151q();
            g gVarM11151q2 = abstractC2512f2.m11151q();
            while (gVarM11151q.hasNext() && gVarM11151q2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC2512f.m11146z(gVarM11151q.mo11156d())).compareTo(Integer.valueOf(AbstractC2512f.m11146z(gVarM11151q2.mo11156d())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC2512f.size()).compareTo(Integer.valueOf(abstractC2512f2.size()));
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$c */
    static abstract class c implements g {
        c() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(mo11156d());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$d */
    private static final class d implements f {
        private d() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2512f.f
        /* JADX INFO: renamed from: a */
        public byte[] mo11159a(byte[] bArr, int i7, int i8) {
            return Arrays.copyOfRange(bArr, i7, i8 + i7);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$e */
    private static final class e extends i {

        /* JADX INFO: renamed from: f */
        private final int f9517f;

        /* JADX INFO: renamed from: r */
        private final int f9518r;

        e(byte[] bArr, int i7, int i8) {
            super(bArr);
            AbstractC2512f.m11142g(i7, i7 + i8, bArr.length);
            this.f9517f = i7;
            this.f9518r = i8;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2512f.i
        /* JADX INFO: renamed from: I */
        protected int mo11160I() {
            return this.f9517f;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2512f.i, androidx.datastore.preferences.protobuf.AbstractC2512f
        /* JADX INFO: renamed from: b */
        public byte mo11148b(int i7) {
            AbstractC2512f.m11141e(i7, size());
            return this.f9519e[this.f9517f + i7];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2512f.i, androidx.datastore.preferences.protobuf.AbstractC2512f
        /* JADX INFO: renamed from: n */
        protected void mo11149n(byte[] bArr, int i7, int i8, int i9) {
            System.arraycopy(this.f9519e, mo11160I() + i7, bArr, i8, i9);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2512f.i, androidx.datastore.preferences.protobuf.AbstractC2512f
        /* JADX INFO: renamed from: p */
        byte mo11150p(int i7) {
            return this.f9519e[this.f9517f + i7];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2512f.i, androidx.datastore.preferences.protobuf.AbstractC2512f
        public int size() {
            return this.f9518r;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$f */
    private interface f {
        /* JADX INFO: renamed from: a */
        byte[] mo11159a(byte[] bArr, int i7, int i8);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$g */
    public interface g extends Iterator {
        /* JADX INFO: renamed from: d */
        byte mo11156d();
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$h */
    static abstract class h extends AbstractC2512f {
        /* synthetic */ h(a aVar) {
            this();
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.m11151q();
        }

        private h() {
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$i */
    private static class i extends h {

        /* JADX INFO: renamed from: e */
        protected final byte[] f9519e;

        i(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.f9519e = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2512f
        /* JADX INFO: renamed from: D */
        final void mo11147D(AbstractC2510e abstractC2510e) {
            abstractC2510e.mo11135a(this.f9519e, mo11160I(), size());
        }

        /* JADX INFO: renamed from: F */
        final boolean m11161F(AbstractC2512f abstractC2512f, int i7, int i8) {
            if (i8 > abstractC2512f.size()) {
                throw new IllegalArgumentException("Length too large: " + i8 + size());
            }
            int i9 = i7 + i8;
            if (i9 > abstractC2512f.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i7 + ", " + i8 + ", " + abstractC2512f.size());
            }
            if (!(abstractC2512f instanceof i)) {
                return abstractC2512f.mo11154x(i7, i9).equals(mo11154x(0, i8));
            }
            i iVar = (i) abstractC2512f;
            byte[] bArr = this.f9519e;
            byte[] bArr2 = iVar.f9519e;
            int iMo11160I = mo11160I() + i8;
            int iMo11160I2 = mo11160I();
            int iMo11160I3 = iVar.mo11160I() + i7;
            while (iMo11160I2 < iMo11160I) {
                if (bArr[iMo11160I2] != bArr2[iMo11160I3]) {
                    return false;
                }
                iMo11160I2++;
                iMo11160I3++;
            }
            return true;
        }

        /* JADX INFO: renamed from: I */
        protected int mo11160I() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2512f
        /* JADX INFO: renamed from: b */
        public byte mo11148b(int i7) {
            return this.f9519e[i7];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2512f
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC2512f) || size() != ((AbstractC2512f) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int iM11153w = m11153w();
            int iM11153w2 = iVar.m11153w();
            if (iM11153w == 0 || iM11153w2 == 0 || iM11153w == iM11153w2) {
                return m11161F(iVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2512f
        /* JADX INFO: renamed from: n */
        protected void mo11149n(byte[] bArr, int i7, int i8, int i9) {
            System.arraycopy(this.f9519e, i7, bArr, i8, i9);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2512f
        /* JADX INFO: renamed from: p */
        byte mo11150p(int i7) {
            return this.f9519e[i7];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2512f
        public int size() {
            return this.f9519e.length;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2512f
        /* JADX INFO: renamed from: v */
        protected final int mo11152v(int i7, int i8, int i9) {
            return AbstractC2534u.m11643g(i7, this.f9519e, mo11160I() + i8, i9);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2512f
        /* JADX INFO: renamed from: x */
        public final AbstractC2512f mo11154x(int i7, int i8) {
            int iM11142g = AbstractC2512f.m11142g(i7, i8, size());
            return iM11142g == 0 ? AbstractC2512f.f9510b : new e(this.f9519e, mo11160I() + i7, iM11142g);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$j */
    private static final class j implements f {
        private j() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2512f.f
        /* JADX INFO: renamed from: a */
        public byte[] mo11159a(byte[] bArr, int i7, int i8) {
            byte[] bArr2 = new byte[i8];
            System.arraycopy(bArr, i7, bArr2, 0, i8);
            return bArr2;
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f9511c = AbstractC2508d.m11130c() ? new j(aVar) : new d(aVar);
        f9512d = new b();
    }

    AbstractC2512f() {
    }

    /* JADX INFO: renamed from: A */
    private String m11137A() {
        if (size() <= 50) {
            return AbstractC2509d0.m11131a(this);
        }
        return AbstractC2509d0.m11131a(mo11154x(0, 47)) + "...";
    }

    /* JADX INFO: renamed from: B */
    static AbstractC2512f m11138B(byte[] bArr) {
        return new i(bArr);
    }

    /* JADX INFO: renamed from: C */
    static AbstractC2512f m11139C(byte[] bArr, int i7, int i8) {
        return new e(bArr, i7, i8);
    }

    /* JADX INFO: renamed from: e */
    static void m11141e(int i7, int i8) {
        if (((i8 - (i7 + 1)) | i7) < 0) {
            if (i7 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i7);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i7 + ", " + i8);
        }
    }

    /* JADX INFO: renamed from: g */
    static int m11142g(int i7, int i8, int i9) {
        int i10 = i8 - i7;
        if ((i7 | i8 | i10 | (i9 - i8)) >= 0) {
            return i10;
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i7 + " < 0");
        }
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i7 + ", " + i8);
        }
        throw new IndexOutOfBoundsException("End index: " + i8 + " >= " + i9);
    }

    /* JADX INFO: renamed from: j */
    public static AbstractC2512f m11143j(byte[] bArr) {
        return m11144k(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: k */
    public static AbstractC2512f m11144k(byte[] bArr, int i7, int i8) {
        m11142g(i7, i7 + i8, bArr.length);
        return new i(f9511c.mo11159a(bArr, i7, i8));
    }

    /* JADX INFO: renamed from: m */
    public static AbstractC2512f m11145m(String str) {
        return new i(str.getBytes(AbstractC2534u.f9724b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static int m11146z(byte b7) {
        return b7 & 255;
    }

    /* JADX INFO: renamed from: D */
    abstract void mo11147D(AbstractC2510e abstractC2510e);

    /* JADX INFO: renamed from: b */
    public abstract byte mo11148b(int i7);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iMo11152v = this.f9513a;
        if (iMo11152v == 0) {
            int size = size();
            iMo11152v = mo11152v(size, 0, size);
            if (iMo11152v == 0) {
                iMo11152v = 1;
            }
            this.f9513a = iMo11152v;
        }
        return iMo11152v;
    }

    /* JADX INFO: renamed from: n */
    protected abstract void mo11149n(byte[] bArr, int i7, int i8, int i9);

    /* JADX INFO: renamed from: p */
    abstract byte mo11150p(int i7);

    /* JADX INFO: renamed from: q */
    public g m11151q() {
        return new a();
    }

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), m11137A());
    }

    /* JADX INFO: renamed from: v */
    protected abstract int mo11152v(int i7, int i8, int i9);

    /* JADX INFO: renamed from: w */
    protected final int m11153w() {
        return this.f9513a;
    }

    /* JADX INFO: renamed from: x */
    public abstract AbstractC2512f mo11154x(int i7, int i8);

    /* JADX INFO: renamed from: y */
    public final byte[] m11155y() {
        int size = size();
        if (size == 0) {
            return AbstractC2534u.f9726d;
        }
        byte[] bArr = new byte[size];
        mo11149n(bArr, 0, 0, size);
        return bArr;
    }
}
