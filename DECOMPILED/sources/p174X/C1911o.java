package p174X;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6119o;
import p145S5.C1444v;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;

/* JADX INFO: renamed from: X.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1911o implements InterfaceC1890J {

    /* JADX INFO: renamed from: d */
    public static final b f6285d = new b(null);

    /* JADX INFO: renamed from: e */
    private static final Set f6286e = new LinkedHashSet();

    /* JADX INFO: renamed from: f */
    private static final Object f6287f = new Object();

    /* JADX INFO: renamed from: a */
    private final InterfaceC1885E f6288a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC5367l f6289b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC5356a f6290c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: X.o$a */
    public static final class a extends AbstractC6119o implements InterfaceC5367l {

        /* JADX INFO: renamed from: a */
        public static final a f6291a = new a();

        a() {
            super(1);
        }

        @Override // p238e6.InterfaceC5367l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1916t invoke(File it) {
            AbstractC6118n.m27187e(it, "it");
            return AbstractC1918v.m7927a(it);
        }
    }

    /* JADX INFO: renamed from: X.o$b */
    public static final class b {
        public /* synthetic */ b(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Set m7920a() {
            return C1911o.f6286e;
        }

        /* JADX INFO: renamed from: b */
        public final Object m7921b() {
            return C1911o.f6287f;
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: X.o$c */
    static final class c extends AbstractC6119o implements InterfaceC5356a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ File f6292a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(File file) {
            super(0);
            this.f6292a = file;
        }

        /* JADX INFO: renamed from: a */
        public final void m7922a() {
            b bVar = C1911o.f6285d;
            Object objM7921b = bVar.m7921b();
            File file = this.f6292a;
            synchronized (objM7921b) {
                bVar.m7920a().remove(file.getAbsolutePath());
                C1444v c1444v = C1444v.f4971a;
            }
        }

        @Override // p238e6.InterfaceC5356a
        public /* bridge */ /* synthetic */ Object invoke() {
            m7922a();
            return C1444v.f4971a;
        }
    }

    public C1911o(InterfaceC1885E serializer, InterfaceC5367l coordinatorProducer, InterfaceC5356a produceFile) {
        AbstractC6118n.m27187e(serializer, "serializer");
        AbstractC6118n.m27187e(coordinatorProducer, "coordinatorProducer");
        AbstractC6118n.m27187e(produceFile, "produceFile");
        this.f6288a = serializer;
        this.f6289b = coordinatorProducer;
        this.f6290c = produceFile;
    }

    @Override // p174X.InterfaceC1890J
    /* JADX INFO: renamed from: a */
    public InterfaceC1891K mo7824a() throws IOException {
        File file = ((File) this.f6290c.invoke()).getCanonicalFile();
        synchronized (f6287f) {
            String path = file.getAbsolutePath();
            Set set = f6286e;
            if (set.contains(path)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            AbstractC6118n.m27186d(path, "path");
            set.add(path);
        }
        AbstractC6118n.m27186d(file, "file");
        return new C1912p(file, this.f6288a, (InterfaceC1916t) this.f6289b.invoke(file), new c(file));
    }

    public /* synthetic */ C1911o(InterfaceC1885E interfaceC1885E, InterfaceC5367l interfaceC5367l, InterfaceC5356a interfaceC5356a, int i7, AbstractC6112h abstractC6112h) {
        this(interfaceC1885E, (i7 & 2) != 0 ? a.f6291a : interfaceC5367l, interfaceC5356a);
    }
}
