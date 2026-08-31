package com.google.protobuf;

import com.google.android.gms.common.api.C3553a;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.protobuf.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5104i implements Iterable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final AbstractC5104i f19401b = new i(AbstractC5063B.f19296d);

    /* JADX INFO: renamed from: c */
    private static final f f19402c;

    /* JADX INFO: renamed from: d */
    private static final Comparator f19403d;

    /* JADX INFO: renamed from: a */
    private int f19404a = 0;

    /* JADX INFO: renamed from: com.google.protobuf.i$a */
    class a extends c {

        /* JADX INFO: renamed from: a */
        private int f19405a = 0;

        /* JADX INFO: renamed from: b */
        private final int f19406b;

        a() {
            this.f19406b = AbstractC5104i.this.size();
        }

        @Override // com.google.protobuf.AbstractC5104i.g
        /* JADX INFO: renamed from: d */
        public byte mo23173d() {
            int i7 = this.f19405a;
            if (i7 >= this.f19406b) {
                throw new NoSuchElementException();
            }
            this.f19405a = i7 + 1;
            return AbstractC5104i.this.mo23095z(i7);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19405a < this.f19406b;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.i$b */
    class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC5104i abstractC5104i, AbstractC5104i abstractC5104i2) {
            g gVarMo23164C = abstractC5104i.iterator();
            g gVarMo23164C2 = abstractC5104i2.iterator();
            while (gVarMo23164C.hasNext() && gVarMo23164C2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC5104i.m23150U(gVarMo23164C.mo23173d())).compareTo(Integer.valueOf(AbstractC5104i.m23150U(gVarMo23164C2.mo23173d())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC5104i.size()).compareTo(Integer.valueOf(abstractC5104i2.size()));
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.i$c */
    static abstract class c implements g {
        c() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(mo23173d());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.i$d */
    private static final class d implements f {
        private d() {
        }

        @Override // com.google.protobuf.AbstractC5104i.f
        /* JADX INFO: renamed from: a */
        public byte[] mo23176a(byte[] bArr, int i7, int i8) {
            return Arrays.copyOfRange(bArr, i7, i8 + i7);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.i$e */
    private static final class e extends i {

        /* JADX INFO: renamed from: f */
        private final int f19408f;

        /* JADX INFO: renamed from: r */
        private final int f19409r;

        e(byte[] bArr, int i7, int i8) {
            super(bArr);
            AbstractC5104i.m23158k(i7, i7 + i8, bArr.length);
            this.f19408f = i7;
            this.f19409r = i8;
        }

        @Override // com.google.protobuf.AbstractC5104i.i
        /* JADX INFO: renamed from: e0 */
        protected int mo23177e0() {
            return this.f19408f;
        }

        @Override // com.google.protobuf.AbstractC5104i.i, com.google.protobuf.AbstractC5104i
        /* JADX INFO: renamed from: g */
        public byte mo23093g(int i7) {
            AbstractC5104i.m23157j(i7, size());
            return this.f19410e[this.f19408f + i7];
        }

        @Override // com.google.protobuf.AbstractC5104i.i, com.google.protobuf.AbstractC5104i
        public int size() {
            return this.f19409r;
        }

        @Override // com.google.protobuf.AbstractC5104i.i, com.google.protobuf.AbstractC5104i
        /* JADX INFO: renamed from: x */
        protected void mo23094x(byte[] bArr, int i7, int i8, int i9) {
            System.arraycopy(this.f19410e, mo23177e0() + i7, bArr, i8, i9);
        }

        @Override // com.google.protobuf.AbstractC5104i.i, com.google.protobuf.AbstractC5104i
        /* JADX INFO: renamed from: z */
        byte mo23095z(int i7) {
            return this.f19410e[this.f19408f + i7];
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.i$f */
    private interface f {
        /* JADX INFO: renamed from: a */
        byte[] mo23176a(byte[] bArr, int i7, int i8);
    }

    /* JADX INFO: renamed from: com.google.protobuf.i$g */
    public interface g extends Iterator {
        /* JADX INFO: renamed from: d */
        byte mo23173d();
    }

    /* JADX INFO: renamed from: com.google.protobuf.i$h */
    static abstract class h extends AbstractC5104i {
        h() {
        }

        @Override // com.google.protobuf.AbstractC5104i
        /* JADX INFO: renamed from: A */
        protected final boolean mo23163A() {
            return true;
        }

        /* JADX INFO: renamed from: d0 */
        abstract boolean mo23092d0(AbstractC5104i abstractC5104i, int i7, int i8);

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.protobuf.AbstractC5104i
        /* JADX INFO: renamed from: y */
        protected final int mo23172y() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.i$i */
    private static class i extends h {

        /* JADX INFO: renamed from: e */
        protected final byte[] f19410e;

        i(byte[] bArr) {
            bArr.getClass();
            this.f19410e = bArr;
        }

        @Override // com.google.protobuf.AbstractC5104i
        /* JADX INFO: renamed from: B */
        public final boolean mo23084B() {
            int iMo23177e0 = mo23177e0();
            return AbstractC5139z0.m23828t(this.f19410e, iMo23177e0, size() + iMo23177e0);
        }

        @Override // com.google.protobuf.AbstractC5104i
        /* JADX INFO: renamed from: D */
        public final AbstractC5106j mo23085D() {
            return AbstractC5106j.m23191m(this.f19410e, mo23177e0(), size(), true);
        }

        @Override // com.google.protobuf.AbstractC5104i
        /* JADX INFO: renamed from: F */
        protected final int mo23086F(int i7, int i8, int i9) {
            return AbstractC5063B.m22844h(i7, this.f19410e, mo23177e0() + i8, i9);
        }

        @Override // com.google.protobuf.AbstractC5104i
        /* JADX INFO: renamed from: I */
        protected final int mo23087I(int i7, int i8, int i9) {
            int iMo23177e0 = mo23177e0() + i8;
            return AbstractC5139z0.m23830v(i7, this.f19410e, iMo23177e0, i9 + iMo23177e0);
        }

        @Override // com.google.protobuf.AbstractC5104i
        /* JADX INFO: renamed from: P */
        public final AbstractC5104i mo23088P(int i7, int i8) {
            int iM23158k = AbstractC5104i.m23158k(i7, i8, size());
            return iM23158k == 0 ? AbstractC5104i.f19401b : new e(this.f19410e, mo23177e0() + i7, iM23158k);
        }

        @Override // com.google.protobuf.AbstractC5104i
        /* JADX INFO: renamed from: W */
        protected final String mo23089W(Charset charset) {
            return new String(this.f19410e, mo23177e0(), size(), charset);
        }

        @Override // com.google.protobuf.AbstractC5104i
        /* JADX INFO: renamed from: b */
        public final ByteBuffer mo23090b() {
            return ByteBuffer.wrap(this.f19410e, mo23177e0(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.AbstractC5104i
        /* JADX INFO: renamed from: c0 */
        final void mo23091c0(AbstractC5102h abstractC5102h) {
            abstractC5102h.mo23145b(this.f19410e, mo23177e0(), size());
        }

        @Override // com.google.protobuf.AbstractC5104i.h
        /* JADX INFO: renamed from: d0 */
        final boolean mo23092d0(AbstractC5104i abstractC5104i, int i7, int i8) {
            if (i8 > abstractC5104i.size()) {
                throw new IllegalArgumentException("Length too large: " + i8 + size());
            }
            int i9 = i7 + i8;
            if (i9 > abstractC5104i.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i7 + ", " + i8 + ", " + abstractC5104i.size());
            }
            if (!(abstractC5104i instanceof i)) {
                return abstractC5104i.mo23088P(i7, i9).equals(mo23088P(0, i8));
            }
            i iVar = (i) abstractC5104i;
            byte[] bArr = this.f19410e;
            byte[] bArr2 = iVar.f19410e;
            int iMo23177e0 = mo23177e0() + i8;
            int iMo23177e1 = mo23177e0();
            int iMo23177e2 = iVar.mo23177e0() + i7;
            while (iMo23177e1 < iMo23177e0) {
                if (bArr[iMo23177e1] != bArr2[iMo23177e2]) {
                    return false;
                }
                iMo23177e1++;
                iMo23177e2++;
            }
            return true;
        }

        /* JADX INFO: renamed from: e0 */
        protected int mo23177e0() {
            return 0;
        }

        @Override // com.google.protobuf.AbstractC5104i
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC5104i) || size() != ((AbstractC5104i) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int iM23165K = m23165K();
            int iM23165K2 = iVar.m23165K();
            if (iM23165K == 0 || iM23165K2 == 0 || iM23165K == iM23165K2) {
                return mo23092d0(iVar, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractC5104i
        /* JADX INFO: renamed from: g */
        public byte mo23093g(int i7) {
            return this.f19410e[i7];
        }

        @Override // com.google.protobuf.AbstractC5104i
        public int size() {
            return this.f19410e.length;
        }

        @Override // com.google.protobuf.AbstractC5104i
        /* JADX INFO: renamed from: x */
        protected void mo23094x(byte[] bArr, int i7, int i8, int i9) {
            System.arraycopy(this.f19410e, i7, bArr, i8, i9);
        }

        @Override // com.google.protobuf.AbstractC5104i
        /* JADX INFO: renamed from: z */
        byte mo23095z(int i7) {
            return this.f19410e[i7];
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.i$j */
    private static final class j implements f {
        private j() {
        }

        @Override // com.google.protobuf.AbstractC5104i.f
        /* JADX INFO: renamed from: a */
        public byte[] mo23176a(byte[] bArr, int i7, int i8) {
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
        f19402c = AbstractC5094d.m23098c() ? new j(aVar) : new d(aVar);
        f19403d = new b();
    }

    AbstractC5104i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static int m23150U(byte b7) {
        return b7 & 255;
    }

    /* JADX INFO: renamed from: Y */
    private String m23151Y() {
        if (size() <= 50) {
            return AbstractC5123r0.m23574a(this);
        }
        return AbstractC5123r0.m23574a(mo23088P(0, 47)) + "...";
    }

    /* JADX INFO: renamed from: Z */
    static AbstractC5104i m23152Z(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new C5093c0(byteBuffer);
        }
        return m23155b0(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    /* JADX INFO: renamed from: a0 */
    static AbstractC5104i m23154a0(byte[] bArr) {
        return new i(bArr);
    }

    /* JADX INFO: renamed from: b0 */
    static AbstractC5104i m23155b0(byte[] bArr, int i7, int i8) {
        return new e(bArr, i7, i8);
    }

    /* JADX INFO: renamed from: e */
    private static AbstractC5104i m23156e(Iterator it, int i7) {
        if (i7 < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i7)));
        }
        if (i7 == 1) {
            return (AbstractC5104i) it.next();
        }
        int i8 = i7 >>> 1;
        return m23156e(it, i8).m23170m(m23156e(it, i7 - i8));
    }

    /* JADX INFO: renamed from: j */
    static void m23157j(int i7, int i8) {
        if (((i8 - (i7 + 1)) | i7) < 0) {
            if (i7 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i7);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i7 + ", " + i8);
        }
    }

    /* JADX INFO: renamed from: k */
    static int m23158k(int i7, int i8, int i9) {
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

    /* JADX INFO: renamed from: n */
    public static AbstractC5104i m23159n(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? f19401b : m23156e(iterable.iterator(), size);
    }

    /* JADX INFO: renamed from: p */
    public static AbstractC5104i m23160p(byte[] bArr) {
        return m23161q(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: q */
    public static AbstractC5104i m23161q(byte[] bArr, int i7, int i8) {
        m23158k(i7, i7 + i8, bArr.length);
        return new i(f19402c.mo23176a(bArr, i7, i8));
    }

    /* JADX INFO: renamed from: v */
    public static AbstractC5104i m23162v(String str) {
        return new i(str.getBytes(AbstractC5063B.f19294b));
    }

    /* JADX INFO: renamed from: A */
    protected abstract boolean mo23163A();

    /* JADX INFO: renamed from: B */
    public abstract boolean mo23084B();

    /* JADX INFO: renamed from: C */
    public g iterator() {
        return new a();
    }

    /* JADX INFO: renamed from: D */
    public abstract AbstractC5106j mo23085D();

    /* JADX INFO: renamed from: F */
    protected abstract int mo23086F(int i7, int i8, int i9);

    /* JADX INFO: renamed from: I */
    protected abstract int mo23087I(int i7, int i8, int i9);

    /* JADX INFO: renamed from: K */
    protected final int m23165K() {
        return this.f19404a;
    }

    /* JADX INFO: renamed from: O */
    public final AbstractC5104i m23166O(int i7) {
        return mo23088P(i7, size());
    }

    /* JADX INFO: renamed from: P */
    public abstract AbstractC5104i mo23088P(int i7, int i8);

    /* JADX INFO: renamed from: T */
    public final byte[] m23167T() {
        int size = size();
        if (size == 0) {
            return AbstractC5063B.f19296d;
        }
        byte[] bArr = new byte[size];
        mo23094x(bArr, 0, 0, size);
        return bArr;
    }

    /* JADX INFO: renamed from: V */
    public final String m23168V(Charset charset) {
        return size() == 0 ? "" : mo23089W(charset);
    }

    /* JADX INFO: renamed from: W */
    protected abstract String mo23089W(Charset charset);

    /* JADX INFO: renamed from: X */
    public final String m23169X() {
        return m23168V(AbstractC5063B.f19294b);
    }

    /* JADX INFO: renamed from: b */
    public abstract ByteBuffer mo23090b();

    /* JADX INFO: renamed from: c0 */
    abstract void mo23091c0(AbstractC5102h abstractC5102h);

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: g */
    public abstract byte mo23093g(int i7);

    public final int hashCode() {
        int iMo23086F = this.f19404a;
        if (iMo23086F == 0) {
            int size = size();
            iMo23086F = mo23086F(size, 0, size);
            if (iMo23086F == 0) {
                iMo23086F = 1;
            }
            this.f19404a = iMo23086F;
        }
        return iMo23086F;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC5104i m23170m(AbstractC5104i abstractC5104i) {
        if (C3553a.e.API_PRIORITY_OTHER - size() >= abstractC5104i.size()) {
            return C5111l0.m23453g0(this, abstractC5104i);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + abstractC5104i.size());
    }

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), m23151Y());
    }

    /* JADX INFO: renamed from: w */
    public final void m23171w(byte[] bArr, int i7, int i8, int i9) {
        m23158k(i7, i7 + i9, size());
        m23158k(i8, i8 + i9, bArr.length);
        if (i9 > 0) {
            mo23094x(bArr, i7, i8, i9);
        }
    }

    /* JADX INFO: renamed from: x */
    protected abstract void mo23094x(byte[] bArr, int i7, int i8, int i9);

    /* JADX INFO: renamed from: y */
    protected abstract int mo23172y();

    /* JADX INFO: renamed from: z */
    abstract byte mo23095z(int i7);
}
