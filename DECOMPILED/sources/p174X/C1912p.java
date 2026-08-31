package p174X;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.AbstractC6087b;
import kotlin.coroutines.jvm.internal.AbstractC6089d;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1423a;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5371p;
import p238e6.InterfaceC5372q;
import p392x6.AbstractC7425g;
import p392x6.InterfaceC7419a;

/* JADX INFO: renamed from: X.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1912p implements InterfaceC1891K {

    /* JADX INFO: renamed from: a */
    private final File f6293a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1885E f6294b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1916t f6295c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC5356a f6296d;

    /* JADX INFO: renamed from: e */
    private final AtomicBoolean f6297e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC7419a f6298f;

    /* JADX INFO: renamed from: X.p$a */
    static final class a extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f6299a;

        /* JADX INFO: renamed from: b */
        Object f6300b;

        /* JADX INFO: renamed from: c */
        boolean f6301c;

        /* JADX INFO: renamed from: d */
        /* synthetic */ Object f6302d;

        /* JADX INFO: renamed from: f */
        int f6304f;

        a(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f6302d = obj;
            this.f6304f |= Integer.MIN_VALUE;
            return C1912p.this.mo7825b(null, this);
        }
    }

    /* JADX INFO: renamed from: X.p$b */
    static final class b extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f6305a;

        /* JADX INFO: renamed from: b */
        Object f6306b;

        /* JADX INFO: renamed from: c */
        Object f6307c;

        /* JADX INFO: renamed from: d */
        Object f6308d;

        /* JADX INFO: renamed from: e */
        /* synthetic */ Object f6309e;

        /* JADX INFO: renamed from: r */
        int f6311r;

        b(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f6309e = obj;
            this.f6311r |= Integer.MIN_VALUE;
            return C1912p.this.mo7827e(null, this);
        }
    }

    public C1912p(File file, InterfaceC1885E serializer, InterfaceC1916t coordinator, InterfaceC5356a onClose) {
        AbstractC6118n.m27187e(file, "file");
        AbstractC6118n.m27187e(serializer, "serializer");
        AbstractC6118n.m27187e(coordinator, "coordinator");
        AbstractC6118n.m27187e(onClose, "onClose");
        this.f6293a = file;
        this.f6294b = serializer;
        this.f6295c = coordinator;
        this.f6296d = onClose;
        this.f6297e = new AtomicBoolean(false);
        this.f6298f = AbstractC7425g.m32877b(false, 1, null);
    }

    /* JADX INFO: renamed from: f */
    private final void m7923f() {
        if (this.f6297e.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m7924g(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007c, blocks: (B:31:0x007b, B:40:0x008c, B:39:0x0089, B:36:0x0084), top: B:52:0x0022, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0094  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.p] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.p] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.p$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.p] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [e6.q] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // p174X.InterfaceC1891K
    /* JADX INFO: renamed from: b */
    public Object mo7825b(InterfaceC5372q interfaceC5372q, InterfaceC1875e interfaceC1875e) throws Throwable {
        ?? aVar;
        Throwable th;
        InterfaceC1899c interfaceC1899c;
        ?? r8;
        ?? r7;
        if (interfaceC1875e instanceof a) {
            a aVar2 = (a) interfaceC1875e;
            int i7 = aVar2.f6304f;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                aVar2.f6304f = i7 - Integer.MIN_VALUE;
                aVar = aVar2;
            } else {
                aVar = new a(interfaceC1875e);
            }
        } else {
            aVar = new a(interfaceC1875e);
        }
        Object obj = aVar.f6302d;
        Object objE = AbstractC2005b.m8369e();
        int i8 = aVar.f6304f;
        try {
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC5372q = aVar.f6301c;
                interfaceC1899c = (InterfaceC1899c) aVar.f6300b;
                aVar = (C1912p) aVar.f6299a;
                try {
                    AbstractC1437o.m6082b(obj);
                    r7 = aVar;
                    r8 = interfaceC5372q;
                    try {
                        interfaceC1899c.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r8 != 0) {
                        InterfaceC7419a.a.m32858b(r7.f6298f, null, 1, null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        interfaceC1899c.close();
                    } catch (Throwable th4) {
                        AbstractC1423a.m6060a(th, th4);
                    }
                    throw th;
                }
            }
            AbstractC1437o.m6082b(obj);
            m7923f();
            boolean zM32857a = InterfaceC7419a.a.m32857a(this.f6298f, null, 1, null);
            try {
                C1910n c1910n = new C1910n(this.f6293a, this.f6294b);
                try {
                    Boolean boolM27120a = AbstractC6087b.m27120a(zM32857a);
                    aVar.f6299a = this;
                    aVar.f6300b = c1910n;
                    aVar.f6301c = zM32857a;
                    aVar.f6304f = 1;
                    Object objMo7830j = interfaceC5372q.mo7830j(c1910n, boolM27120a, aVar);
                    if (objMo7830j == objE) {
                        return objE;
                    }
                    obj = objMo7830j;
                    r8 = zM32857a;
                    r7 = this;
                    interfaceC1899c = c1910n;
                    interfaceC1899c.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r8 != 0) {
                        InterfaceC7419a.a.m32858b(r7.f6298f, null, 1, null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    interfaceC5372q = zM32857a;
                    aVar = this;
                    interfaceC1899c = c1910n;
                    interfaceC1899c.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                interfaceC5372q = zM32857a;
                aVar = this;
                if (interfaceC5372q != 0) {
                    InterfaceC7419a.a.m32858b(aVar.f6298f, null, 1, null);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            if (interfaceC5372q != 0) {
                InterfaceC7419a.a.m32858b(aVar.f6298f, null, 1, null);
            }
            throw th;
        }
    }

    @Override // p174X.InterfaceC1899c
    public void close() {
        this.f6297e.set(true);
        this.f6296d.invoke();
    }

    @Override // p174X.InterfaceC1891K
    /* JADX INFO: renamed from: d */
    public InterfaceC1916t mo7826d() {
        return this.f6295c;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bb A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TryCatch #0 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fd, B:58:0x010c, B:60:0x0112, B:61:0x0115, B:56:0x010a, B:55:0x0107, B:24:0x007a, B:25:0x0096), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fd, B:58:0x010c, B:60:0x0112, B:61:0x0115, B:56:0x010a, B:55:0x0107, B:24:0x007a, B:25:0x0096), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, x6.a] */
    @Override // p174X.InterfaceC1891K
    /* JADX INFO: renamed from: e */
    public Object mo7827e(InterfaceC5371p interfaceC5371p, InterfaceC1875e interfaceC1875e) throws IOException {
        b bVar;
        File file;
        C1912p c1912p;
        InterfaceC7419a interfaceC7419a;
        C1913q c1913q;
        Throwable th;
        InterfaceC1899c interfaceC1899c;
        File file2;
        C1912p c1912p2;
        if (interfaceC1875e instanceof b) {
            bVar = (b) interfaceC1875e;
            int i7 = bVar.f6311r;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                bVar.f6311r = i7 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC1875e);
            }
        } else {
            bVar = new b(interfaceC1875e);
        }
        Object obj = bVar.f6309e;
        Object objE = AbstractC2005b.m8369e();
        ?? r7 = bVar.f6311r;
        try {
            try {
                try {
                    try {
                        if (r7 == 0) {
                            AbstractC1437o.m6082b(obj);
                            m7923f();
                            m7924g(this.f6293a);
                            InterfaceC7419a interfaceC7419a2 = this.f6298f;
                            bVar.f6305a = this;
                            bVar.f6306b = interfaceC5371p;
                            bVar.f6307c = interfaceC7419a2;
                            bVar.f6311r = 1;
                            if (interfaceC7419a2.mo32856d(null, bVar) != objE) {
                                c1912p = this;
                                interfaceC7419a = interfaceC7419a2;
                            }
                            return objE;
                        }
                        if (r7 != 1) {
                            if (r7 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC1899c = (InterfaceC1899c) bVar.f6308d;
                            File file3 = (File) bVar.f6307c;
                            interfaceC7419a = (InterfaceC7419a) bVar.f6306b;
                            c1912p2 = (C1912p) bVar.f6305a;
                            try {
                                AbstractC1437o.m6082b(obj);
                                file2 = file3;
                                C1444v c1444v = C1444v.f4971a;
                                try {
                                    interfaceC1899c.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists() && !AbstractC1909m.m7912a(file2, c1912p2.f6293a)) {
                                    throw new IOException("Unable to rename " + file2 + " to " + c1912p2.f6293a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                                C1444v c1444v2 = C1444v.f4971a;
                                interfaceC7419a.mo32855c(null);
                                return C1444v.f4971a;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    interfaceC1899c.close();
                                } catch (Throwable th4) {
                                    AbstractC1423a.m6060a(th, th4);
                                }
                                throw th;
                            }
                        }
                        InterfaceC7419a interfaceC7419a3 = (InterfaceC7419a) bVar.f6307c;
                        InterfaceC5371p interfaceC5371p2 = (InterfaceC5371p) bVar.f6306b;
                        c1912p = (C1912p) bVar.f6305a;
                        AbstractC1437o.m6082b(obj);
                        interfaceC7419a = interfaceC7419a3;
                        interfaceC5371p = interfaceC5371p2;
                        bVar.f6305a = c1912p;
                        bVar.f6306b = interfaceC7419a;
                        bVar.f6307c = file;
                        bVar.f6308d = c1913q;
                        bVar.f6311r = 2;
                        if (interfaceC5371p.invoke(c1913q, bVar) != objE) {
                            file2 = file;
                            c1912p2 = c1912p;
                            interfaceC1899c = c1913q;
                            C1444v c1444v3 = C1444v.f4971a;
                            interfaceC1899c.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (file2.exists()) {
                                throw new IOException("Unable to rename " + file2 + " to " + c1912p2.f6293a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                            }
                            C1444v c1444v4 = C1444v.f4971a;
                            interfaceC7419a.mo32855c(null);
                            return C1444v.f4971a;
                        }
                        return objE;
                    } catch (Throwable th5) {
                        th = th5;
                        interfaceC1899c = c1913q;
                        interfaceC1899c.close();
                        throw th;
                    }
                    c1913q = new C1913q(file, c1912p.f6294b);
                } catch (IOException e7) {
                    e = e7;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(c1912p.f6293a.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                r7.mo32855c(null);
                throw th6;
            }
        } catch (IOException e8) {
            e = e8;
            file = objE;
        }
    }
}
