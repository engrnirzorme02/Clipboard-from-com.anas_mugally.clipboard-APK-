package com.google.gson.internal.bind;

import com.google.gson.AbstractC5028g;
import com.google.gson.C5027f;
import com.google.gson.C5030i;
import com.google.gson.C5049j;
import com.google.gson.C5051l;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p391x5.C7417c;

/* JADX INFO: renamed from: com.google.gson.internal.bind.g */
/* JADX INFO: loaded from: classes.dex */
public final class C5037g extends C7417c {

    /* JADX INFO: renamed from: C */
    private static final Writer f19108C = new a();

    /* JADX INFO: renamed from: D */
    private static final C5051l f19109D = new C5051l("closed");

    /* JADX INFO: renamed from: A */
    private String f19110A;

    /* JADX INFO: renamed from: B */
    private AbstractC5028g f19111B;

    /* JADX INFO: renamed from: z */
    private final List f19112z;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.g$a */
    class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i7, int i8) {
            throw new AssertionError();
        }
    }

    public C5037g() {
        super(f19108C);
        this.f19112z = new ArrayList();
        this.f19111B = C5030i.f19086a;
    }

    /* JADX INFO: renamed from: j1 */
    private AbstractC5028g m22677j1() {
        List list = this.f19112z;
        return (AbstractC5028g) list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: k1 */
    private void m22678k1(AbstractC5028g abstractC5028g) {
        if (this.f19110A != null) {
            if (!abstractC5028g.m22656j() || m32849l0()) {
                ((C5049j) m22677j1()).m22789n(this.f19110A, abstractC5028g);
            }
            this.f19110A = null;
            return;
        }
        if (this.f19112z.isEmpty()) {
            this.f19111B = abstractC5028g;
            return;
        }
        AbstractC5028g abstractC5028gM22677j1 = m22677j1();
        if (!(abstractC5028gM22677j1 instanceof C5027f)) {
            throw new IllegalStateException();
        }
        ((C5027f) abstractC5028gM22677j1).m22651n(abstractC5028g);
    }

    @Override // p391x5.C7417c
    /* JADX INFO: renamed from: J */
    public C7417c mo22679J() {
        C5049j c5049j = new C5049j();
        m22678k1(c5049j);
        this.f19112z.add(c5049j);
        return this;
    }

    @Override // p391x5.C7417c
    /* JADX INFO: renamed from: K0 */
    public C7417c mo22680K0(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f19112z.isEmpty() || this.f19110A != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(m22677j1() instanceof C5049j)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f19110A = str;
        return this;
    }

    @Override // p391x5.C7417c
    /* JADX INFO: renamed from: R0 */
    public C7417c mo22681R0() {
        m22678k1(C5030i.f19086a);
        return this;
    }

    @Override // p391x5.C7417c
    /* JADX INFO: renamed from: b1 */
    public C7417c mo22682b1(double d7) {
        if (m32852w0() || !(Double.isNaN(d7) || Double.isInfinite(d7))) {
            m22678k1(new C5051l(Double.valueOf(d7)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d7);
    }

    @Override // p391x5.C7417c
    /* JADX INFO: renamed from: c1 */
    public C7417c mo22683c1(long j7) {
        m22678k1(new C5051l(Long.valueOf(j7)));
        return this;
    }

    @Override // p391x5.C7417c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f19112z.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f19112z.add(f19109D);
    }

    @Override // p391x5.C7417c
    /* JADX INFO: renamed from: d0 */
    public C7417c mo22684d0() {
        if (this.f19112z.isEmpty() || this.f19110A != null) {
            throw new IllegalStateException();
        }
        if (!(m22677j1() instanceof C5027f)) {
            throw new IllegalStateException();
        }
        List list = this.f19112z;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // p391x5.C7417c
    /* JADX INFO: renamed from: d1 */
    public C7417c mo22685d1(Boolean bool) {
        if (bool == null) {
            return mo22681R0();
        }
        m22678k1(new C5051l(bool));
        return this;
    }

    @Override // p391x5.C7417c
    /* JADX INFO: renamed from: e1 */
    public C7417c mo22686e1(Number number) {
        if (number == null) {
            return mo22681R0();
        }
        if (!m32852w0()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m22678k1(new C5051l(number));
        return this;
    }

    @Override // p391x5.C7417c
    /* JADX INFO: renamed from: f1 */
    public C7417c mo22687f1(String str) {
        if (str == null) {
            return mo22681R0();
        }
        m22678k1(new C5051l(str));
        return this;
    }

    @Override // p391x5.C7417c, java.io.Flushable
    public void flush() {
    }

    @Override // p391x5.C7417c
    /* JADX INFO: renamed from: g1 */
    public C7417c mo22688g1(boolean z7) {
        m22678k1(new C5051l(Boolean.valueOf(z7)));
        return this;
    }

    /* JADX INFO: renamed from: i1 */
    public AbstractC5028g m22689i1() {
        if (this.f19112z.isEmpty()) {
            return this.f19111B;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f19112z);
    }

    @Override // p391x5.C7417c
    /* JADX INFO: renamed from: k0 */
    public C7417c mo22690k0() {
        if (this.f19112z.isEmpty() || this.f19110A != null) {
            throw new IllegalStateException();
        }
        if (!(m22677j1() instanceof C5049j)) {
            throw new IllegalStateException();
        }
        List list = this.f19112z;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // p391x5.C7417c
    /* JADX INFO: renamed from: x */
    public C7417c mo22691x() {
        C5027f c5027f = new C5027f();
        m22678k1(c5027f);
        this.f19112z.add(c5027f);
        return this;
    }
}
