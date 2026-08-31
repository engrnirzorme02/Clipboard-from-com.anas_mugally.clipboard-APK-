package p174X;

import android.os.FileObserver;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6119o;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p318o6.InterfaceC6661e0;
import p336q6.AbstractC6858n;
import p336q6.InterfaceC6866v;
import p344r6.AbstractC6920e;
import p344r6.InterfaceC6918c;

/* JADX INFO: renamed from: X.A */
/* JADX INFO: loaded from: classes.dex */
public final class FileObserverC1881A extends FileObserver {

    /* JADX INFO: renamed from: c */
    public static final a f6045c = new a(null);

    /* JADX INFO: renamed from: d */
    private static final Object f6046d = new Object();

    /* JADX INFO: renamed from: e */
    private static final Map f6047e = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    private final String f6048a;

    /* JADX INFO: renamed from: b */
    private final CopyOnWriteArrayList f6049b;

    /* JADX INFO: renamed from: X.A$a */
    public static final class a {

        /* JADX INFO: renamed from: X.A$a$a, reason: collision with other inner class name */
        static final class C7650a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            Object f6050a;

            /* JADX INFO: renamed from: b */
            int f6051b;

            /* JADX INFO: renamed from: c */
            private /* synthetic */ Object f6052c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ File f6053d;

            /* JADX INFO: renamed from: X.A$a$a$a, reason: collision with other inner class name */
            static final class C7651a extends AbstractC6119o implements InterfaceC5356a {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ InterfaceC6661e0 f6054a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C7651a(InterfaceC6661e0 interfaceC6661e0) {
                    super(0);
                    this.f6054a = interfaceC6661e0;
                }

                /* JADX INFO: renamed from: a */
                public final void m7796a() {
                    this.f6054a.mo7954k();
                }

                @Override // p238e6.InterfaceC5356a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m7796a();
                    return C1444v.f4971a;
                }
            }

            /* JADX INFO: renamed from: X.A$a$a$b */
            static final class b extends AbstractC6119o implements InterfaceC5367l {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ File f6055a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ InterfaceC6866v f6056b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(File file, InterfaceC6866v interfaceC6866v) {
                    super(1);
                    this.f6055a = file;
                    this.f6056b = interfaceC6866v;
                }

                /* JADX INFO: renamed from: a */
                public final void m7797a(String str) {
                    if (AbstractC6118n.m27183a(str, this.f6055a.getName())) {
                        AbstractC6858n.m30061b(this.f6056b, C1444v.f4971a);
                    }
                }

                @Override // p238e6.InterfaceC5367l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m7797a((String) obj);
                    return C1444v.f4971a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7650a(File file, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f6053d = file;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                C7650a c7650a = new C7650a(this.f6053d, interfaceC1875e);
                c7650a.f6052c = obj;
                return c7650a;
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6866v interfaceC6866v, InterfaceC1875e interfaceC1875e) {
                return ((C7650a) create(interfaceC6866v, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
            
                if (p336q6.AbstractC6864t.m30068a(r3, r7, r6) == r0) goto L16;
             */
            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                InterfaceC6661e0 interfaceC6661e0M7791d;
                InterfaceC6866v interfaceC6866v;
                Object objE = AbstractC2005b.m8369e();
                int i7 = this.f6051b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        interfaceC6661e0M7791d = (InterfaceC6661e0) this.f6050a;
                        interfaceC6866v = (InterfaceC6866v) this.f6052c;
                        AbstractC1437o.m6082b(obj);
                    } else {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1437o.m6082b(obj);
                    }
                    return C1444v.f4971a;
                }
                AbstractC1437o.m6082b(obj);
                InterfaceC6866v interfaceC6866v2 = (InterfaceC6866v) this.f6052c;
                b bVar = new b(this.f6053d, interfaceC6866v2);
                a aVar = FileObserverC1881A.f6045c;
                File parentFile = this.f6053d.getParentFile();
                AbstractC6118n.m27184b(parentFile);
                interfaceC6661e0M7791d = aVar.m7791d(parentFile, bVar);
                C1444v c1444v = C1444v.f4971a;
                this.f6052c = interfaceC6866v2;
                this.f6050a = interfaceC6661e0M7791d;
                this.f6051b = 1;
                if (interfaceC6866v2.mo29980i(c1444v, this) != objE) {
                    interfaceC6866v = interfaceC6866v2;
                }
                return objE;
                C7651a c7651a = new C7651a(interfaceC6661e0M7791d);
                this.f6052c = null;
                this.f6050a = null;
                this.f6051b = 2;
            }
        }

        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public final InterfaceC6661e0 m7791d(File file, final InterfaceC5367l interfaceC5367l) {
            final String key = file.getCanonicalFile().getPath();
            synchronized (FileObserverC1881A.f6046d) {
                try {
                    Map mapM7793c = FileObserverC1881A.f6045c.m7793c();
                    AbstractC6118n.m27186d(key, "key");
                    Object fileObserverC1881A = mapM7793c.get(key);
                    if (fileObserverC1881A == null) {
                        fileObserverC1881A = new FileObserverC1881A(key, null);
                        mapM7793c.put(key, fileObserverC1881A);
                    }
                    FileObserverC1881A fileObserverC1881A2 = (FileObserverC1881A) fileObserverC1881A;
                    fileObserverC1881A2.f6049b.add(interfaceC5367l);
                    if (fileObserverC1881A2.f6049b.size() == 1) {
                        fileObserverC1881A2.startWatching();
                    }
                    C1444v c1444v = C1444v.f4971a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new InterfaceC6661e0() { // from class: X.z
                @Override // p318o6.InterfaceC6661e0
                /* JADX INFO: renamed from: k */
                public final void mo7954k() {
                    FileObserverC1881A.a.m7792f(key, interfaceC5367l);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final void m7792f(String str, InterfaceC5367l observer) {
            AbstractC6118n.m27187e(observer, "$observer");
            synchronized (FileObserverC1881A.f6046d) {
                try {
                    a aVar = FileObserverC1881A.f6045c;
                    FileObserverC1881A fileObserverC1881A = (FileObserverC1881A) aVar.m7793c().get(str);
                    if (fileObserverC1881A != null) {
                        fileObserverC1881A.f6049b.remove(observer);
                        if (fileObserverC1881A.f6049b.isEmpty()) {
                            aVar.m7793c().remove(str);
                            fileObserverC1881A.stopWatching();
                        }
                    }
                    C1444v c1444v = C1444v.f4971a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public final Map m7793c() {
            return FileObserverC1881A.f6047e;
        }

        /* JADX INFO: renamed from: e */
        public final InterfaceC6918c m7794e(File file) {
            AbstractC6118n.m27187e(file, "file");
            return AbstractC6920e.m30359e(new C7650a(file, null));
        }

        private a() {
        }
    }

    public /* synthetic */ FileObserverC1881A(String str, AbstractC6112h abstractC6112h) {
        this(str);
    }

    @Override // android.os.FileObserver
    public void onEvent(int i7, String str) {
        Iterator it = this.f6049b.iterator();
        while (it.hasNext()) {
            ((InterfaceC5367l) it.next()).invoke(str);
        }
    }

    private FileObserverC1881A(String str) {
        super(str, 128);
        this.f6048a = str;
        this.f6049b = new CopyOnWriteArrayList();
    }
}
