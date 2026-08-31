package p260h4;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6116l;
import kotlin.jvm.internal.AbstractC6118n;
import p228d4.C5235g;
import p238e6.InterfaceC5356a;
import p302m6.AbstractC6406h;

/* JADX INFO: renamed from: h4.i */
/* JADX INFO: loaded from: classes.dex */
public final class C5653i {

    /* JADX INFO: renamed from: e */
    public static final a f21638e = new a(null);

    /* JADX INFO: renamed from: f */
    private static boolean f21639f;

    /* JADX INFO: renamed from: a */
    public final ExecutorC5649e f21640a;

    /* JADX INFO: renamed from: b */
    public final ExecutorC5649e f21641b;

    /* JADX INFO: renamed from: c */
    public final ExecutorC5649e f21642c;

    /* JADX INFO: renamed from: d */
    public final ExecutorC5649e f21643d;

    /* JADX INFO: renamed from: h4.i$a */
    public static final class a {

        /* JADX INFO: renamed from: h4.i$a$a, reason: collision with other inner class name */
        /* synthetic */ class C7690a extends AbstractC6116l implements InterfaceC5356a {
            C7690a(Object obj) {
                super(0, obj, a.class, "isBackgroundThread", "isBackgroundThread()Z", 0);
            }

            @Override // p238e6.InterfaceC5356a
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).m25151p());
            }
        }

        /* JADX INFO: renamed from: h4.i$a$b */
        /* synthetic */ class b extends AbstractC6116l implements InterfaceC5356a {
            b(Object obj) {
                super(0, obj, a.class, "isBlockingThread", "isBlockingThread()Z", 0);
            }

            @Override // p238e6.InterfaceC5356a
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).m25152q());
            }
        }

        /* JADX INFO: renamed from: h4.i$a$c */
        /* synthetic */ class c extends AbstractC6116l implements InterfaceC5356a {
            c(Object obj) {
                super(0, obj, a.class, "isNotMainThread", "isNotMainThread()Z", 0);
            }

            @Override // p238e6.InterfaceC5356a
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).m25153r());
            }
        }

        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final String m25146h() {
            return "Must be called on a background thread, was called on " + C5653i.f21638e.m25150o() + '.';
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public static final String m25147j() {
            return "Must be called on a blocking thread, was called on " + C5653i.f21638e.m25150o() + '.';
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: l */
        public static final String m25148l() {
            return "Must not be called on a main thread, was called on " + C5653i.f21638e.m25150o() + '.';
        }

        /* JADX INFO: renamed from: m */
        private final void m25149m(InterfaceC5356a interfaceC5356a, InterfaceC5356a interfaceC5356a2) {
            if (((Boolean) interfaceC5356a.invoke()).booleanValue()) {
                return;
            }
            C5235g.m24179f().m24180b((String) interfaceC5356a2.invoke());
            m25157n();
        }

        /* JADX INFO: renamed from: o */
        private final String m25150o() {
            return Thread.currentThread().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p */
        public final boolean m25151p() {
            String strM25150o = m25150o();
            AbstractC6118n.m27186d(strM25150o, "<get-threadName>(...)");
            return AbstractC6406h.m27589Q(strM25150o, "Firebase Background Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public final boolean m25152q() {
            String strM25150o = m25150o();
            AbstractC6118n.m27186d(strM25150o, "<get-threadName>(...)");
            return AbstractC6406h.m27589Q(strM25150o, "Firebase Blocking Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: r */
        public final boolean m25153r() {
            return !Looper.getMainLooper().isCurrentThread();
        }

        /* JADX INFO: renamed from: g */
        public final void m25154g() {
            m25149m(new C7690a(this), new InterfaceC5356a() { // from class: h4.f
                @Override // p238e6.InterfaceC5356a
                public final Object invoke() {
                    return C5653i.a.m25146h();
                }
            });
        }

        /* JADX INFO: renamed from: i */
        public final void m25155i() {
            m25149m(new b(this), new InterfaceC5356a() { // from class: h4.h
                @Override // p238e6.InterfaceC5356a
                public final Object invoke() {
                    return C5653i.a.m25147j();
                }
            });
        }

        /* JADX INFO: renamed from: k */
        public final void m25156k() {
            m25149m(new c(this), new InterfaceC5356a() { // from class: h4.g
                @Override // p238e6.InterfaceC5356a
                public final Object invoke() {
                    return C5653i.a.m25148l();
                }
            });
        }

        /* JADX INFO: renamed from: n */
        public final boolean m25157n() {
            return C5653i.f21639f;
        }

        /* JADX INFO: renamed from: s */
        public final void m25158s(boolean z7) {
            C5653i.f21639f = z7;
        }

        private a() {
        }
    }

    public C5653i(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        AbstractC6118n.m27187e(backgroundExecutorService, "backgroundExecutorService");
        AbstractC6118n.m27187e(blockingExecutorService, "blockingExecutorService");
        this.f21640a = new ExecutorC5649e(backgroundExecutorService);
        this.f21641b = new ExecutorC5649e(backgroundExecutorService);
        this.f21642c = new ExecutorC5649e(backgroundExecutorService);
        this.f21643d = new ExecutorC5649e(blockingExecutorService);
    }

    /* JADX INFO: renamed from: c */
    public static final void m25136c() {
        f21638e.m25154g();
    }

    /* JADX INFO: renamed from: d */
    public static final void m25137d() {
        f21638e.m25155i();
    }

    /* JADX INFO: renamed from: e */
    public static final void m25138e() {
        f21638e.m25156k();
    }

    /* JADX INFO: renamed from: f */
    public static final void m25139f(boolean z7) {
        f21638e.m25158s(z7);
    }
}
