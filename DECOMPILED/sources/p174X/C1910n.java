package p174X;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.AbstractC6089d;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p220c6.AbstractC3026b;

/* JADX INFO: renamed from: X.n */
/* JADX INFO: loaded from: classes.dex */
public class C1910n implements InterfaceC1883C {

    /* JADX INFO: renamed from: a */
    private final File f6277a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1885E f6278b;

    /* JADX INFO: renamed from: c */
    private final AtomicBoolean f6279c;

    /* JADX INFO: renamed from: X.n$a */
    static final class a extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f6280a;

        /* JADX INFO: renamed from: b */
        Object f6281b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f6282c;

        /* JADX INFO: renamed from: e */
        int f6284e;

        a(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f6282c = obj;
            this.f6284e |= Integer.MIN_VALUE;
            return C1910n.m7913i(C1910n.this, this);
        }
    }

    public C1910n(File file, InterfaceC1885E serializer) {
        AbstractC6118n.m27187e(file, "file");
        AbstractC6118n.m27187e(serializer, "serializer");
        this.f6277a = file;
        this.f6278b = serializer;
        this.f6279c = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [X.n] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.n] */
    /* JADX INFO: renamed from: i */
    static /* synthetic */ Object m7913i(C1910n c1910n, InterfaceC1875e interfaceC1875e) throws IOException {
        a aVar;
        Throwable th;
        Closeable closeable;
        Closeable closeable2;
        Throwable th2;
        if (interfaceC1875e instanceof a) {
            aVar = (a) interfaceC1875e;
            int i7 = aVar.f6284e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                aVar.f6284e = i7 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC1875e);
            }
        } else {
            aVar = new a(interfaceC1875e);
        }
        Object obj = aVar.f6282c;
        Object objE = AbstractC2005b.m8369e();
        ?? r7 = aVar.f6284e;
        try {
            if (r7 != 0) {
                if (r7 == 1) {
                    closeable2 = (Closeable) aVar.f6281b;
                    r7 = (C1910n) aVar.f6280a;
                    try {
                        AbstractC1437o.m6082b(obj);
                        AbstractC3026b.m14999a(closeable2, null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            AbstractC3026b.m14999a(closeable2, th2);
                            throw th4;
                        }
                    }
                }
                if (r7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) aVar.f6280a;
                try {
                    AbstractC1437o.m6082b(obj);
                    AbstractC3026b.m14999a(closeable, null);
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        AbstractC3026b.m14999a(closeable, th);
                        throw th6;
                    }
                }
            }
            AbstractC1437o.m6082b(obj);
            c1910n.m7914f();
            try {
                FileInputStream fileInputStream = new FileInputStream(((C1910n) c1910n).f6277a);
                try {
                    InterfaceC1885E interfaceC1885E = ((C1910n) c1910n).f6278b;
                    aVar.f6280a = c1910n;
                    aVar.f6281b = fileInputStream;
                    aVar.f6284e = 1;
                    Object from = interfaceC1885E.readFrom(fileInputStream, aVar);
                    if (from != objE) {
                        closeable2 = fileInputStream;
                        obj = from;
                        AbstractC3026b.m14999a(closeable2, null);
                        return obj;
                    }
                } catch (Throwable th7) {
                    r7 = c1910n;
                    closeable2 = fileInputStream;
                    th2 = th7;
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                if (!((C1910n) c1910n).f6277a.exists()) {
                    return ((C1910n) c1910n).f6278b.getDefaultValue();
                }
                FileInputStream fileInputStream2 = new FileInputStream(((C1910n) c1910n).f6277a);
                try {
                    InterfaceC1885E interfaceC1885E2 = ((C1910n) c1910n).f6278b;
                    aVar.f6280a = fileInputStream2;
                    aVar.f6281b = null;
                    aVar.f6284e = 2;
                    Object from2 = interfaceC1885E2.readFrom(fileInputStream2, aVar);
                    if (from2 != objE) {
                        obj = from2;
                        closeable = fileInputStream2;
                        AbstractC3026b.m14999a(closeable, null);
                        return obj;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    closeable = fileInputStream2;
                    throw th;
                }
            }
            return objE;
        } catch (FileNotFoundException unused2) {
            c1910n = r7;
        }
    }

    @Override // p174X.InterfaceC1883C
    /* JADX INFO: renamed from: c */
    public Object mo7799c(InterfaceC1875e interfaceC1875e) {
        return m7913i(this, interfaceC1875e);
    }

    @Override // p174X.InterfaceC1899c
    public void close() {
        this.f6279c.set(true);
    }

    /* JADX INFO: renamed from: f */
    protected final void m7914f() {
        if (this.f6279c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    /* JADX INFO: renamed from: g */
    protected final File m7915g() {
        return this.f6277a;
    }

    /* JADX INFO: renamed from: h */
    protected final InterfaceC1885E m7916h() {
        return this.f6278b;
    }
}
