package p174X;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import kotlin.coroutines.jvm.internal.AbstractC6087b;
import kotlin.coroutines.jvm.internal.AbstractC6089d;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6119o;
import p145S5.AbstractC1430h;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;
import p220c6.AbstractC3026b;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p302m6.AbstractC6406h;
import p318o6.AbstractC6668i;
import p318o6.InterfaceC6624N;
import p344r6.InterfaceC6918c;
import p392x6.AbstractC7425g;
import p392x6.InterfaceC7419a;

/* JADX INFO: renamed from: X.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1920x implements InterfaceC1916t {

    /* JADX INFO: renamed from: j */
    public static final a f6322j = new a(null);

    /* JADX INFO: renamed from: k */
    private static final String f6323k = "Resource deadlock would occur";

    /* JADX INFO: renamed from: l */
    private static final long f6324l = 10;

    /* JADX INFO: renamed from: m */
    private static final long f6325m = 60000;

    /* JADX INFO: renamed from: a */
    private final InterfaceC1879i f6326a;

    /* JADX INFO: renamed from: b */
    private final File f6327b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC6918c f6328c;

    /* JADX INFO: renamed from: d */
    private final String f6329d;

    /* JADX INFO: renamed from: e */
    private final String f6330e;

    /* JADX INFO: renamed from: f */
    private final String f6331f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC7419a f6332g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC1429g f6333h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC1429g f6334i;

    /* JADX INFO: renamed from: X.x$a */
    public static final class a {

        /* JADX INFO: renamed from: X.x$a$a, reason: collision with other inner class name */
        static final class C7659a extends AbstractC6089d {

            /* JADX INFO: renamed from: a */
            Object f6335a;

            /* JADX INFO: renamed from: b */
            long f6336b;

            /* JADX INFO: renamed from: c */
            /* synthetic */ Object f6337c;

            /* JADX INFO: renamed from: e */
            int f6339e;

            C7659a(InterfaceC1875e interfaceC1875e) {
                super(interfaceC1875e);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                this.f6337c = obj;
                this.f6339e |= Integer.MIN_VALUE;
                return a.this.m7946b(null, this);
            }
        }

        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't wrap try/catch for region: R(3:31|17|18) */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
        
            r2 = r0.getMessage();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
        
            if (r2 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
        
            r15.f6335a = r14;
            r15.f6336b = r5;
            r15.f6339e = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
        
            if (p318o6.AbstractC6645Y.m28137a(r5, r15) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
        
            throw r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007c -> B:27:0x007f). Please report as a decompilation issue!!! */
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object m7946b(FileOutputStream fileOutputStream, InterfaceC1875e interfaceC1875e) throws IOException {
            C7659a c7659a;
            long j7;
            C7659a c7659a2;
            if (interfaceC1875e instanceof C7659a) {
                c7659a = (C7659a) interfaceC1875e;
                int i7 = c7659a.f6339e;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    c7659a.f6339e = i7 - Integer.MIN_VALUE;
                } else {
                    c7659a = new C7659a(interfaceC1875e);
                }
            } else {
                c7659a = new C7659a(interfaceC1875e);
            }
            Object obj = c7659a.f6337c;
            Object objE = AbstractC2005b.m8369e();
            int i8 = c7659a.f6339e;
            if (i8 == 0) {
                AbstractC1437o.m6082b(obj);
                j7 = C1920x.f6324l;
                c7659a2 = c7659a;
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j7 = c7659a.f6336b;
                fileOutputStream = (FileOutputStream) c7659a.f6335a;
                AbstractC1437o.m6082b(obj);
                c7659a2 = c7659a;
                j7 *= (long) 2;
            }
            if (j7 <= C1920x.f6325m) {
                FileLock fileLockLock = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
                AbstractC6118n.m27186d(fileLockLock, "lockFileStream.getChanne…LUE, /* shared= */ false)");
                return fileLockLock;
            }
            FileLock fileLockLock2 = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
            AbstractC6118n.m27186d(fileLockLock2, "lockFileStream.getChanne…LUE, /* shared= */ false)");
            return fileLockLock2;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: X.x$b */
    public static final class b extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f6340a;

        public b(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C1920x.this.new b(interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            AbstractC2005b.m8369e();
            if (this.f6340a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            return AbstractC6087b.m27122c(C1920x.this.m7944r().m7804b());
        }
    }

    /* JADX INFO: renamed from: X.x$c */
    public static final class c extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f6342a;

        public c(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C1920x.this.new c(interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((c) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            AbstractC2005b.m8369e();
            if (this.f6342a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            return AbstractC6087b.m27122c(C1920x.this.m7944r().m7805c());
        }
    }

    /* JADX INFO: renamed from: X.x$d */
    static final class d extends AbstractC6119o implements InterfaceC5356a {

        /* JADX INFO: renamed from: X.x$d$a */
        static final class a extends AbstractC6119o implements InterfaceC5356a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C1920x f6345a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C1920x c1920x) {
                super(0);
                this.f6345a = c1920x;
            }

            @Override // p238e6.InterfaceC5356a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final File invoke() throws IOException {
                C1920x c1920x = this.f6345a;
                File fileM7942p = c1920x.m7942p(c1920x.f6330e);
                this.f6345a.m7940n(fileM7942p);
                return fileM7942p;
            }
        }

        d() {
            super(0);
        }

        @Override // p238e6.InterfaceC5356a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1886F invoke() {
            C1886F.a aVar = C1886F.f6065b;
            aVar.m7809d();
            return aVar.m7807a(new a(C1920x.this));
        }
    }

    /* JADX INFO: renamed from: X.x$e */
    static final class e extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f6346a;

        /* JADX INFO: renamed from: b */
        Object f6347b;

        /* JADX INFO: renamed from: c */
        Object f6348c;

        /* JADX INFO: renamed from: d */
        /* synthetic */ Object f6349d;

        /* JADX INFO: renamed from: f */
        int f6351f;

        e(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f6349d = obj;
            this.f6351f |= Integer.MIN_VALUE;
            return C1920x.this.mo7818b(null, this);
        }
    }

    /* JADX INFO: renamed from: X.x$f */
    static final class f extends AbstractC6119o implements InterfaceC5356a {
        f() {
            super(0);
        }

        @Override // p238e6.InterfaceC5356a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() throws IOException {
            C1920x c1920x = C1920x.this;
            File fileM7942p = c1920x.m7942p(c1920x.f6329d);
            C1920x.this.m7940n(fileM7942p);
            return fileM7942p;
        }
    }

    /* JADX INFO: renamed from: X.x$g */
    static final class g extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f6353a;

        /* JADX INFO: renamed from: b */
        Object f6354b;

        /* JADX INFO: renamed from: c */
        Object f6355c;

        /* JADX INFO: renamed from: d */
        boolean f6356d;

        /* JADX INFO: renamed from: e */
        /* synthetic */ Object f6357e;

        /* JADX INFO: renamed from: r */
        int f6359r;

        g(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f6357e = obj;
            this.f6359r |= Integer.MIN_VALUE;
            return C1920x.this.mo7820d(null, this);
        }
    }

    public C1920x(InterfaceC1879i context, File file) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(file, "file");
        this.f6326a = context;
        this.f6327b = file;
        this.f6328c = FileObserverC1881A.f6045c.m7794e(file);
        this.f6329d = ".lock";
        this.f6330e = ".version";
        this.f6331f = "fcntl failed: EAGAIN";
        this.f6332g = AbstractC7425g.m32877b(false, 1, null);
        this.f6333h = AbstractC1430h.m6066b(new f());
        this.f6334i = AbstractC1430h.m6066b(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final void m7940n(File file) throws IOException {
        m7941o(file);
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    /* JADX INFO: renamed from: o */
    private final void m7941o(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final File m7942p(String str) {
        return new File(this.f6327b.getAbsolutePath() + str);
    }

    /* JADX INFO: renamed from: q */
    private final File m7943q() {
        return (File) this.f6333h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final C1886F m7944r() {
        return (C1886F) this.f6334i.getValue();
    }

    @Override // p174X.InterfaceC1916t
    /* JADX INFO: renamed from: a */
    public Object mo7817a(InterfaceC1875e interfaceC1875e) {
        return this.f6334i.mo6064d() ? AbstractC6087b.m27122c(m7944r().m7804b()) : AbstractC6668i.m28186g(this.f6326a, new b(null), interfaceC1875e);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb A[Catch: all -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:56:0x00d9, B:57:0x00dc), top: B:78:0x0024, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9 A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:56:0x00d9, B:57:0x00dc), top: B:78:0x0024, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [x6.a] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [x6.a] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [x6.a] */
    @Override // p174X.InterfaceC1916t
    /* JADX INFO: renamed from: b */
    public Object mo7818b(InterfaceC5367l interfaceC5367l, InterfaceC1875e interfaceC1875e) throws Throwable {
        e eVar;
        C1920x c1920x;
        FileOutputStream fileOutputStream;
        Throwable th;
        InterfaceC5367l interfaceC5367l2;
        Closeable closeable;
        ?? r7;
        ?? r10;
        FileLock fileLock;
        FileLock fileLock2;
        Object objInvoke;
        Closeable closeable2;
        ?? r11;
        ?? r8;
        if (interfaceC1875e instanceof e) {
            eVar = (e) interfaceC1875e;
            int i7 = eVar.f6351f;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                eVar.f6351f = i7 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC1875e);
            }
        } else {
            eVar = new e(interfaceC1875e);
        }
        ?? r12 = eVar.f6349d;
        ?? E7 = AbstractC2005b.m8369e();
        int i8 = eVar.f6351f;
        try {
            try {
                try {
                    if (i8 == 0) {
                        AbstractC1437o.m6082b(r12);
                        InterfaceC7419a interfaceC7419a = this.f6332g;
                        eVar.f6346a = this;
                        eVar.f6347b = interfaceC5367l;
                        eVar.f6348c = interfaceC7419a;
                        eVar.f6351f = 1;
                        if (interfaceC7419a.mo32856d(null, eVar) != E7) {
                            c1920x = this;
                            r12 = interfaceC7419a;
                        }
                        return E7;
                    }
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            fileLock = (FileLock) eVar.f6348c;
                            closeable2 = (Closeable) eVar.f6347b;
                            InterfaceC7419a interfaceC7419a2 = (InterfaceC7419a) eVar.f6346a;
                            try {
                                AbstractC1437o.m6082b(r12);
                                r8 = interfaceC7419a2;
                                r11 = r12;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                try {
                                    AbstractC3026b.m14999a(closeable2, null);
                                    r8.mo32855c(null);
                                    return r11;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r12 = r8;
                                    r12.mo32855c(null);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        }
                        closeable = (Closeable) eVar.f6348c;
                        r7 = (InterfaceC7419a) eVar.f6347b;
                        interfaceC5367l2 = (InterfaceC5367l) eVar.f6346a;
                        try {
                            AbstractC1437o.m6082b(r12);
                            r7 = r7;
                            r10 = r12;
                            fileLock2 = (FileLock) r10;
                            try {
                                eVar.f6346a = r7;
                                eVar.f6347b = closeable;
                                eVar.f6348c = fileLock2;
                                eVar.f6351f = 3;
                                objInvoke = interfaceC5367l2.invoke(eVar);
                                if (objInvoke != E7) {
                                    closeable2 = closeable;
                                    fileLock = fileLock2;
                                    r11 = objInvoke;
                                    r8 = r7;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    AbstractC3026b.m14999a(closeable2, null);
                                    r8.mo32855c(null);
                                    return r11;
                                }
                                return E7;
                            } catch (Throwable th4) {
                                fileLock = fileLock2;
                                th = th4;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    }
                    InterfaceC7419a interfaceC7419a3 = (InterfaceC7419a) eVar.f6348c;
                    InterfaceC5367l interfaceC5367l3 = (InterfaceC5367l) eVar.f6347b;
                    c1920x = (C1920x) eVar.f6346a;
                    AbstractC1437o.m6082b(r12);
                    r12 = interfaceC7419a3;
                    interfaceC5367l = interfaceC5367l3;
                    a aVar = f6322j;
                    eVar.f6346a = interfaceC5367l;
                    eVar.f6347b = r12;
                    eVar.f6348c = fileOutputStream;
                    eVar.f6351f = 2;
                    Object objM7946b = aVar.m7946b(fileOutputStream, eVar);
                    if (objM7946b != E7) {
                        interfaceC5367l2 = interfaceC5367l;
                        closeable = fileOutputStream;
                        r7 = r12;
                        r10 = objM7946b;
                        fileLock2 = (FileLock) r10;
                        eVar.f6346a = r7;
                        eVar.f6347b = closeable;
                        eVar.f6348c = fileLock2;
                        eVar.f6351f = 3;
                        objInvoke = interfaceC5367l2.invoke(eVar);
                        if (objInvoke != E7) {
                            closeable2 = closeable;
                            fileLock = fileLock2;
                            r11 = objInvoke;
                            r8 = r7;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            AbstractC3026b.m14999a(closeable2, null);
                            r8.mo32855c(null);
                            return r11;
                        }
                    }
                    return E7;
                } catch (Throwable th6) {
                    th = th6;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
                fileOutputStream = new FileOutputStream(c1920x.m7943q());
            } catch (Throwable th7) {
                th = th7;
                r12.mo32855c(null);
                throw th;
            }
        } catch (Throwable th8) {
            r12 = eVar;
            try {
                throw th8;
            } catch (Throwable th9) {
                AbstractC3026b.m14999a(E7, th8);
                throw th9;
            }
        }
    }

    @Override // p174X.InterfaceC1916t
    /* JADX INFO: renamed from: c */
    public Object mo7819c(InterfaceC1875e interfaceC1875e) {
        return this.f6334i.mo6064d() ? AbstractC6087b.m27122c(m7944r().m7805c()) : AbstractC6668i.m28186g(this.f6326a, new c(null), interfaceC1875e);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6 A[Catch: all -> 0x00ea, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00ea, blocks: (B:59:0x00e6, B:71:0x0101, B:72:0x0104), top: B:91:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:71:0x0101 A[Catch: all -> 0x00ea, TRY_ENTER, TryCatch #7 {all -> 0x00ea, blocks: (B:59:0x00e6, B:71:0x0101, B:72:0x0104), top: B:91:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0110  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [e6.p] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.x$g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [x6.a] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.io.Closeable] */
    @Override // p174X.InterfaceC1916t
    /* JADX INFO: renamed from: d */
    public Object mo7820d(InterfaceC5371p interfaceC5371p, InterfaceC1875e interfaceC1875e) throws Throwable {
        ?? gVar;
        String message;
        FileLock fileLockTryLock;
        FileLock fileLock;
        InterfaceC7419a interfaceC7419a;
        boolean z7;
        Closeable closeable;
        InterfaceC7419a interfaceC7419a2;
        boolean z8;
        ?? r7 = interfaceC5371p;
        if (interfaceC1875e instanceof g) {
            g gVar2 = (g) interfaceC1875e;
            int i7 = gVar2.f6359r;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                gVar2.f6359r = i7 - Integer.MIN_VALUE;
                gVar = gVar2;
            } else {
                gVar = new g(interfaceC1875e);
            }
        } else {
            gVar = new g(interfaceC1875e);
        }
        Object objInvoke = gVar.f6357e;
        Object objE = AbstractC2005b.m8369e();
        ?? r8 = gVar.f6359r;
        try {
            try {
                if (r8 != 0) {
                    if (r8 == 1) {
                        z8 = gVar.f6356d;
                        interfaceC7419a2 = (InterfaceC7419a) gVar.f6353a;
                        AbstractC1437o.m6082b(objInvoke);
                        if (z8) {
                            interfaceC7419a2.mo32855c(null);
                        }
                        return objInvoke;
                    }
                    if (r8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z7 = gVar.f6356d;
                    fileLock = (FileLock) gVar.f6355c;
                    closeable = (Closeable) gVar.f6354b;
                    interfaceC7419a = (InterfaceC7419a) gVar.f6353a;
                    try {
                        AbstractC1437o.m6082b(objInvoke);
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        AbstractC3026b.m14999a(closeable, null);
                        if (z7) {
                            interfaceC7419a.mo32855c(null);
                        }
                        return objInvoke;
                    } catch (Throwable th) {
                        th = th;
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        throw th;
                    }
                }
                AbstractC1437o.m6082b(objInvoke);
                InterfaceC7419a interfaceC7419a3 = this.f6332g;
                boolean zMo32853a = interfaceC7419a3.mo32853a(null);
                try {
                    if (zMo32853a) {
                        FileInputStream fileInputStream = new FileInputStream(m7943q());
                        try {
                            try {
                                fileLockTryLock = fileInputStream.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                            } catch (Throwable th2) {
                                th = th2;
                                fileLock = null;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (IOException e7) {
                            String message2 = e7.getMessage();
                            if ((message2 == null || !AbstractC6406h.m27557K(message2, this.f6331f, false, 2, null)) && ((message = e7.getMessage()) == null || !AbstractC6406h.m27557K(message, f6323k, false, 2, null))) {
                                throw e7;
                            }
                            fileLockTryLock = null;
                        }
                        try {
                            Boolean boolM27120a = AbstractC6087b.m27120a(fileLockTryLock != null);
                            gVar.f6353a = interfaceC7419a3;
                            gVar.f6354b = fileInputStream;
                            gVar.f6355c = fileLockTryLock;
                            gVar.f6356d = zMo32853a;
                            gVar.f6359r = 2;
                            objInvoke = r7.invoke(boolM27120a, gVar);
                            if (objInvoke != objE) {
                                interfaceC7419a = interfaceC7419a3;
                                z7 = zMo32853a;
                                closeable = fileInputStream;
                                fileLock = fileLockTryLock;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                AbstractC3026b.m14999a(closeable, null);
                                if (z7) {
                                    interfaceC7419a.mo32855c(null);
                                }
                                return objInvoke;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileLock = fileLockTryLock;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } else {
                        Boolean boolM27120a2 = AbstractC6087b.m27120a(false);
                        gVar.f6353a = interfaceC7419a3;
                        gVar.f6356d = zMo32853a;
                        gVar.f6359r = 1;
                        objInvoke = r7.invoke(boolM27120a2, gVar);
                        if (objInvoke != objE) {
                            interfaceC7419a2 = interfaceC7419a3;
                            z8 = zMo32853a;
                            if (z8) {
                                interfaceC7419a2.mo32855c(null);
                            }
                            return objInvoke;
                        }
                    }
                    return objE;
                } catch (Throwable th4) {
                    th = th4;
                    gVar = interfaceC7419a3;
                    r7 = zMo32853a;
                    if (r7 != 0) {
                        gVar.mo32855c(null);
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            ?? r9 = gVar;
            try {
                throw th6;
            } catch (Throwable th7) {
                try {
                    AbstractC3026b.m14999a(r8, th6);
                    throw th7;
                } catch (Throwable th8) {
                    th = th8;
                    r7 = r7;
                    gVar = r9;
                    if (r7 != 0) {
                        gVar.mo32855c(null);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // p174X.InterfaceC1916t
    /* JADX INFO: renamed from: e */
    public InterfaceC6918c mo7821e() {
        return this.f6328c;
    }
}
