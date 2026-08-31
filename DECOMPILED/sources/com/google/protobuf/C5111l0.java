package com.google.protobuf;

import com.google.android.gms.common.api.C3553a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.protobuf.l0 */
/* JADX INFO: loaded from: classes.dex */
final class C5111l0 extends AbstractC5104i {

    /* JADX INFO: renamed from: u */
    static final int[] f19484u = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, C3553a.e.API_PRIORITY_OTHER};

    /* JADX INFO: renamed from: e */
    private final int f19485e;

    /* JADX INFO: renamed from: f */
    private final AbstractC5104i f19486f;

    /* JADX INFO: renamed from: r */
    private final AbstractC5104i f19487r;

    /* JADX INFO: renamed from: s */
    private final int f19488s;

    /* JADX INFO: renamed from: t */
    private final int f19489t;

    /* JADX INFO: renamed from: com.google.protobuf.l0$a */
    class a extends AbstractC5104i.c {

        /* JADX INFO: renamed from: a */
        final c f19490a;

        /* JADX INFO: renamed from: b */
        AbstractC5104i.g f19491b = m23458b();

        a() {
            this.f19490a = new c(C5111l0.this, null);
        }

        /* JADX INFO: renamed from: b */
        private AbstractC5104i.g m23458b() {
            if (this.f19490a.hasNext()) {
                return this.f19490a.next().iterator();
            }
            return null;
        }

        @Override // com.google.protobuf.AbstractC5104i.g
        /* JADX INFO: renamed from: d */
        public byte mo23173d() {
            AbstractC5104i.g gVar = this.f19491b;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            byte bMo23173d = gVar.mo23173d();
            if (!this.f19491b.hasNext()) {
                this.f19491b = m23458b();
            }
            return bMo23173d;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19491b != null;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.l0$c */
    private static final class c implements Iterator {

        /* JADX INFO: renamed from: a */
        private final ArrayDeque f19494a;

        /* JADX INFO: renamed from: b */
        private AbstractC5104i.h f19495b;

        /* synthetic */ c(AbstractC5104i abstractC5104i, a aVar) {
            this(abstractC5104i);
        }

        /* JADX INFO: renamed from: a */
        private AbstractC5104i.h m23464a(AbstractC5104i abstractC5104i) {
            while (abstractC5104i instanceof C5111l0) {
                C5111l0 c5111l0 = (C5111l0) abstractC5104i;
                this.f19494a.push(c5111l0);
                abstractC5104i = c5111l0.f19486f;
            }
            return (AbstractC5104i.h) abstractC5104i;
        }

        /* JADX INFO: renamed from: b */
        private AbstractC5104i.h m23465b() {
            AbstractC5104i.h hVarM23464a;
            do {
                ArrayDeque arrayDeque = this.f19494a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                hVarM23464a = m23464a(((C5111l0) this.f19494a.pop()).f19487r);
            } while (hVarM23464a.isEmpty());
            return hVarM23464a;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC5104i.h next() {
            AbstractC5104i.h hVar = this.f19495b;
            if (hVar == null) {
                throw new NoSuchElementException();
            }
            this.f19495b = m23465b();
            return hVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19495b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(AbstractC5104i abstractC5104i) {
            if (!(abstractC5104i instanceof C5111l0)) {
                this.f19494a = null;
                this.f19495b = (AbstractC5104i.h) abstractC5104i;
                return;
            }
            C5111l0 c5111l0 = (C5111l0) abstractC5104i;
            ArrayDeque arrayDeque = new ArrayDeque(c5111l0.mo23172y());
            this.f19494a = arrayDeque;
            arrayDeque.push(c5111l0);
            this.f19495b = m23464a(c5111l0.f19486f);
        }
    }

    /* synthetic */ C5111l0(AbstractC5104i abstractC5104i, AbstractC5104i abstractC5104i2, a aVar) {
        this(abstractC5104i, abstractC5104i2);
    }

    /* JADX INFO: renamed from: g0 */
    static AbstractC5104i m23453g0(AbstractC5104i abstractC5104i, AbstractC5104i abstractC5104i2) {
        if (abstractC5104i2.size() == 0) {
            return abstractC5104i;
        }
        if (abstractC5104i.size() == 0) {
            return abstractC5104i2;
        }
        int size = abstractC5104i.size() + abstractC5104i2.size();
        if (size < 128) {
            return m23454h0(abstractC5104i, abstractC5104i2);
        }
        if (abstractC5104i instanceof C5111l0) {
            C5111l0 c5111l0 = (C5111l0) abstractC5104i;
            if (c5111l0.f19487r.size() + abstractC5104i2.size() < 128) {
                return new C5111l0(c5111l0.f19486f, m23454h0(c5111l0.f19487r, abstractC5104i2));
            }
            if (c5111l0.f19486f.mo23172y() > c5111l0.f19487r.mo23172y() && c5111l0.mo23172y() > abstractC5104i2.mo23172y()) {
                return new C5111l0(c5111l0.f19486f, new C5111l0(c5111l0.f19487r, abstractC5104i2));
            }
        }
        return size >= m23456j0(Math.max(abstractC5104i.mo23172y(), abstractC5104i2.mo23172y()) + 1) ? new C5111l0(abstractC5104i, abstractC5104i2) : new b(null).m23460b(abstractC5104i, abstractC5104i2);
    }

    /* JADX INFO: renamed from: h0 */
    private static AbstractC5104i m23454h0(AbstractC5104i abstractC5104i, AbstractC5104i abstractC5104i2) {
        int size = abstractC5104i.size();
        int size2 = abstractC5104i2.size();
        byte[] bArr = new byte[size + size2];
        abstractC5104i.m23171w(bArr, 0, 0, size);
        abstractC5104i2.m23171w(bArr, 0, size, size2);
        return AbstractC5104i.m23154a0(bArr);
    }

    /* JADX INFO: renamed from: i0 */
    private boolean m23455i0(AbstractC5104i abstractC5104i) {
        AbstractC5104i.h hVar;
        a aVar = null;
        c cVar = new c(this, aVar);
        AbstractC5104i.h hVar2 = (AbstractC5104i.h) cVar.next();
        c cVar2 = new c(abstractC5104i, aVar);
        AbstractC5104i.h hVar3 = (AbstractC5104i.h) cVar2.next();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int size = hVar2.size() - i7;
            int size2 = hVar3.size() - i8;
            int iMin = Math.min(size, size2);
            if (!(i7 == 0 ? hVar2.mo23092d0(hVar3, i8, iMin) : hVar3.mo23092d0(hVar2, i7, iMin))) {
                return false;
            }
            i9 += iMin;
            int i10 = this.f19485e;
            if (i9 >= i10) {
                if (i9 == i10) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                hVar = (AbstractC5104i.h) cVar.next();
                i7 = 0;
            } else {
                i7 += iMin;
            }
            if (iMin == size2) {
                hVar2 = hVar2;
                hVar2 = hVar;
                hVar3 = (AbstractC5104i.h) cVar2.next();
                i8 = 0;
            } else {
                hVar2 = hVar2;
                hVar2 = hVar;
                i8 += iMin;
            }
        }
    }

    /* JADX INFO: renamed from: j0 */
    static int m23456j0(int i7) {
        int[] iArr = f19484u;
        return i7 >= iArr.length ? C3553a.e.API_PRIORITY_OTHER : iArr[i7];
    }

    @Override // com.google.protobuf.AbstractC5104i
    /* JADX INFO: renamed from: A */
    protected boolean mo23163A() {
        return this.f19485e >= m23456j0(this.f19489t);
    }

    @Override // com.google.protobuf.AbstractC5104i
    /* JADX INFO: renamed from: B */
    public boolean mo23084B() {
        int iMo23087I = this.f19486f.mo23087I(0, 0, this.f19488s);
        AbstractC5104i abstractC5104i = this.f19487r;
        return abstractC5104i.mo23087I(iMo23087I, 0, abstractC5104i.size()) == 0;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public AbstractC5104i.g iterator() {
        return new a();
    }

    @Override // com.google.protobuf.AbstractC5104i
    /* JADX INFO: renamed from: D */
    public AbstractC5106j mo23085D() {
        return AbstractC5106j.m23187i(m23457f0(), true);
    }

    @Override // com.google.protobuf.AbstractC5104i
    /* JADX INFO: renamed from: F */
    protected int mo23086F(int i7, int i8, int i9) {
        int i10 = i8 + i9;
        int i11 = this.f19488s;
        if (i10 <= i11) {
            return this.f19486f.mo23086F(i7, i8, i9);
        }
        if (i8 >= i11) {
            return this.f19487r.mo23086F(i7, i8 - i11, i9);
        }
        int i12 = i11 - i8;
        return this.f19487r.mo23086F(this.f19486f.mo23086F(i7, i8, i12), 0, i9 - i12);
    }

    @Override // com.google.protobuf.AbstractC5104i
    /* JADX INFO: renamed from: I */
    protected int mo23087I(int i7, int i8, int i9) {
        int i10 = i8 + i9;
        int i11 = this.f19488s;
        if (i10 <= i11) {
            return this.f19486f.mo23087I(i7, i8, i9);
        }
        if (i8 >= i11) {
            return this.f19487r.mo23087I(i7, i8 - i11, i9);
        }
        int i12 = i11 - i8;
        return this.f19487r.mo23087I(this.f19486f.mo23087I(i7, i8, i12), 0, i9 - i12);
    }

    @Override // com.google.protobuf.AbstractC5104i
    /* JADX INFO: renamed from: P */
    public AbstractC5104i mo23088P(int i7, int i8) {
        int iM23158k = AbstractC5104i.m23158k(i7, i8, this.f19485e);
        if (iM23158k == 0) {
            return AbstractC5104i.f19401b;
        }
        if (iM23158k == this.f19485e) {
            return this;
        }
        int i9 = this.f19488s;
        if (i8 <= i9) {
            return this.f19486f.mo23088P(i7, i8);
        }
        return i7 >= i9 ? this.f19487r.mo23088P(i7 - i9, i8 - i9) : new C5111l0(this.f19486f.m23166O(i7), this.f19487r.mo23088P(0, i8 - this.f19488s));
    }

    @Override // com.google.protobuf.AbstractC5104i
    /* JADX INFO: renamed from: W */
    protected String mo23089W(Charset charset) {
        return new String(m23167T(), charset);
    }

    @Override // com.google.protobuf.AbstractC5104i
    /* JADX INFO: renamed from: b */
    public ByteBuffer mo23090b() {
        return ByteBuffer.wrap(m23167T()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC5104i
    /* JADX INFO: renamed from: c0 */
    void mo23091c0(AbstractC5102h abstractC5102h) {
        this.f19486f.mo23091c0(abstractC5102h);
        this.f19487r.mo23091c0(abstractC5102h);
    }

    @Override // com.google.protobuf.AbstractC5104i
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5104i)) {
            return false;
        }
        AbstractC5104i abstractC5104i = (AbstractC5104i) obj;
        if (this.f19485e != abstractC5104i.size()) {
            return false;
        }
        if (this.f19485e == 0) {
            return true;
        }
        int iM23165K = m23165K();
        int iM23165K2 = abstractC5104i.m23165K();
        if (iM23165K == 0 || iM23165K2 == 0 || iM23165K == iM23165K2) {
            return m23455i0(abstractC5104i);
        }
        return false;
    }

    /* JADX INFO: renamed from: f0 */
    public List m23457f0() {
        ArrayList arrayList = new ArrayList();
        c cVar = new c(this, null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().mo23090b());
        }
        return arrayList;
    }

    @Override // com.google.protobuf.AbstractC5104i
    /* JADX INFO: renamed from: g */
    public byte mo23093g(int i7) {
        AbstractC5104i.m23157j(i7, this.f19485e);
        return mo23095z(i7);
    }

    @Override // com.google.protobuf.AbstractC5104i
    public int size() {
        return this.f19485e;
    }

    @Override // com.google.protobuf.AbstractC5104i
    /* JADX INFO: renamed from: x */
    protected void mo23094x(byte[] bArr, int i7, int i8, int i9) {
        int i10 = i7 + i9;
        int i11 = this.f19488s;
        if (i10 <= i11) {
            this.f19486f.mo23094x(bArr, i7, i8, i9);
        } else {
            if (i7 >= i11) {
                this.f19487r.mo23094x(bArr, i7 - i11, i8, i9);
                return;
            }
            int i12 = i11 - i7;
            this.f19486f.mo23094x(bArr, i7, i8, i12);
            this.f19487r.mo23094x(bArr, 0, i8 + i12, i9 - i12);
        }
    }

    @Override // com.google.protobuf.AbstractC5104i
    /* JADX INFO: renamed from: y */
    protected int mo23172y() {
        return this.f19489t;
    }

    @Override // com.google.protobuf.AbstractC5104i
    /* JADX INFO: renamed from: z */
    byte mo23095z(int i7) {
        int i8 = this.f19488s;
        return i7 < i8 ? this.f19486f.mo23095z(i7) : this.f19487r.mo23095z(i7 - i8);
    }

    /* JADX INFO: renamed from: com.google.protobuf.l0$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        private final ArrayDeque f19493a;

        private b() {
            this.f19493a = new ArrayDeque();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public AbstractC5104i m23460b(AbstractC5104i abstractC5104i, AbstractC5104i abstractC5104i2) {
            m23461c(abstractC5104i);
            m23461c(abstractC5104i2);
            AbstractC5104i c5111l0 = (AbstractC5104i) this.f19493a.pop();
            while (!this.f19493a.isEmpty()) {
                c5111l0 = new C5111l0((AbstractC5104i) this.f19493a.pop(), c5111l0, null);
            }
            return c5111l0;
        }

        /* JADX INFO: renamed from: c */
        private void m23461c(AbstractC5104i abstractC5104i) {
            if (abstractC5104i.mo23163A()) {
                m23463e(abstractC5104i);
                return;
            }
            if (abstractC5104i instanceof C5111l0) {
                C5111l0 c5111l0 = (C5111l0) abstractC5104i;
                m23461c(c5111l0.f19486f);
                m23461c(c5111l0.f19487r);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + abstractC5104i.getClass());
            }
        }

        /* JADX INFO: renamed from: d */
        private int m23462d(int i7) {
            int iBinarySearch = Arrays.binarySearch(C5111l0.f19484u, i7);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        /* JADX INFO: renamed from: e */
        private void m23463e(AbstractC5104i abstractC5104i) {
            a aVar;
            int iM23462d = m23462d(abstractC5104i.size());
            int iM23456j0 = C5111l0.m23456j0(iM23462d + 1);
            if (this.f19493a.isEmpty() || ((AbstractC5104i) this.f19493a.peek()).size() >= iM23456j0) {
                this.f19493a.push(abstractC5104i);
                return;
            }
            int iM23456j1 = C5111l0.m23456j0(iM23462d);
            AbstractC5104i c5111l0 = (AbstractC5104i) this.f19493a.pop();
            while (true) {
                aVar = null;
                if (this.f19493a.isEmpty() || ((AbstractC5104i) this.f19493a.peek()).size() >= iM23456j1) {
                    break;
                } else {
                    c5111l0 = new C5111l0((AbstractC5104i) this.f19493a.pop(), c5111l0, aVar);
                }
            }
            C5111l0 c5111l1 = new C5111l0(c5111l0, abstractC5104i, aVar);
            while (!this.f19493a.isEmpty()) {
                if (((AbstractC5104i) this.f19493a.peek()).size() >= C5111l0.m23456j0(m23462d(c5111l1.size()) + 1)) {
                    break;
                } else {
                    c5111l1 = new C5111l0((AbstractC5104i) this.f19493a.pop(), c5111l1, aVar);
                }
            }
            this.f19493a.push(c5111l1);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private C5111l0(AbstractC5104i abstractC5104i, AbstractC5104i abstractC5104i2) {
        this.f19486f = abstractC5104i;
        this.f19487r = abstractC5104i2;
        int size = abstractC5104i.size();
        this.f19488s = size;
        this.f19485e = size + abstractC5104i2.size();
        this.f19489t = Math.max(abstractC5104i.mo23172y(), abstractC5104i2.mo23172y()) + 1;
    }
}
