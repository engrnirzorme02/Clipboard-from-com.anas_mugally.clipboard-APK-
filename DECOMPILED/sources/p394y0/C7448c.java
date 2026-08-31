package p394y0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p026D0.InterfaceC0176g;
import p026D0.InterfaceC0177h;
import p145S5.C1444v;
import p238e6.InterfaceC5367l;

/* JADX INFO: renamed from: y0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7448c {

    /* JADX INFO: renamed from: m */
    public static final a f29853m = new a(null);

    /* JADX INFO: renamed from: a */
    public InterfaceC0177h f29854a;

    /* JADX INFO: renamed from: b */
    private final Handler f29855b;

    /* JADX INFO: renamed from: c */
    private Runnable f29856c;

    /* JADX INFO: renamed from: d */
    private final Object f29857d;

    /* JADX INFO: renamed from: e */
    private long f29858e;

    /* JADX INFO: renamed from: f */
    private final Executor f29859f;

    /* JADX INFO: renamed from: g */
    private int f29860g;

    /* JADX INFO: renamed from: h */
    private long f29861h;

    /* JADX INFO: renamed from: i */
    private InterfaceC0176g f29862i;

    /* JADX INFO: renamed from: j */
    private boolean f29863j;

    /* JADX INFO: renamed from: k */
    private final Runnable f29864k;

    /* JADX INFO: renamed from: l */
    private final Runnable f29865l;

    /* JADX INFO: renamed from: y0.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    public C7448c(long j7, TimeUnit autoCloseTimeUnit, Executor autoCloseExecutor) {
        AbstractC6118n.m27187e(autoCloseTimeUnit, "autoCloseTimeUnit");
        AbstractC6118n.m27187e(autoCloseExecutor, "autoCloseExecutor");
        this.f29855b = new Handler(Looper.getMainLooper());
        this.f29857d = new Object();
        this.f29858e = autoCloseTimeUnit.toMillis(j7);
        this.f29859f = autoCloseExecutor;
        this.f29861h = SystemClock.uptimeMillis();
        this.f29864k = new Runnable() { // from class: y0.a
            @Override // java.lang.Runnable
            public final void run() {
                C7448c.m32984f(this.f29851a);
            }
        };
        this.f29865l = new Runnable() { // from class: y0.b
            @Override // java.lang.Runnable
            public final void run() {
                C7448c.m32983c(this.f29852a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m32983c(C7448c this$0) {
        C1444v c1444v;
        AbstractC6118n.m27187e(this$0, "this$0");
        synchronized (this$0.f29857d) {
            try {
                if (SystemClock.uptimeMillis() - this$0.f29861h < this$0.f29858e) {
                    return;
                }
                if (this$0.f29860g != 0) {
                    return;
                }
                Runnable runnable = this$0.f29856c;
                if (runnable != null) {
                    runnable.run();
                    c1444v = C1444v.f4971a;
                } else {
                    c1444v = null;
                }
                if (c1444v == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                InterfaceC0176g interfaceC0176g = this$0.f29862i;
                if (interfaceC0176g != null && interfaceC0176g.isOpen()) {
                    interfaceC0176g.close();
                }
                this$0.f29862i = null;
                C1444v c1444v2 = C1444v.f4971a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m32984f(C7448c this$0) {
        AbstractC6118n.m27187e(this$0, "this$0");
        this$0.f29859f.execute(this$0.f29865l);
    }

    /* JADX INFO: renamed from: d */
    public final void m32985d() {
        synchronized (this.f29857d) {
            try {
                this.f29863j = true;
                InterfaceC0176g interfaceC0176g = this.f29862i;
                if (interfaceC0176g != null) {
                    interfaceC0176g.close();
                }
                this.f29862i = null;
                C1444v c1444v = C1444v.f4971a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m32986e() {
        synchronized (this.f29857d) {
            try {
                int i7 = this.f29860g;
                if (i7 <= 0) {
                    throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
                }
                int i8 = i7 - 1;
                this.f29860g = i8;
                if (i8 == 0) {
                    if (this.f29862i == null) {
                        return;
                    } else {
                        this.f29855b.postDelayed(this.f29864k, this.f29858e);
                    }
                }
                C1444v c1444v = C1444v.f4971a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final Object m32987g(InterfaceC5367l block) {
        AbstractC6118n.m27187e(block, "block");
        try {
            return block.invoke(m32990j());
        } finally {
            m32986e();
        }
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC0176g m32988h() {
        return this.f29862i;
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC0177h m32989i() {
        InterfaceC0177h interfaceC0177h = this.f29854a;
        if (interfaceC0177h != null) {
            return interfaceC0177h;
        }
        AbstractC6118n.m27197o("delegateOpenHelper");
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC0176g m32990j() {
        synchronized (this.f29857d) {
            this.f29855b.removeCallbacks(this.f29864k);
            this.f29860g++;
            if (this.f29863j) {
                throw new IllegalStateException("Attempting to open already closed database.");
            }
            InterfaceC0176g interfaceC0176g = this.f29862i;
            if (interfaceC0176g != null && interfaceC0176g.isOpen()) {
                return interfaceC0176g;
            }
            InterfaceC0176g interfaceC0176gMo892Y = m32989i().mo892Y();
            this.f29862i = interfaceC0176gMo892Y;
            return interfaceC0176gMo892Y;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m32991k(InterfaceC0177h delegateOpenHelper) {
        AbstractC6118n.m27187e(delegateOpenHelper, "delegateOpenHelper");
        m32993m(delegateOpenHelper);
    }

    /* JADX INFO: renamed from: l */
    public final void m32992l(Runnable onAutoClose) {
        AbstractC6118n.m27187e(onAutoClose, "onAutoClose");
        this.f29856c = onAutoClose;
    }

    /* JADX INFO: renamed from: m */
    public final void m32993m(InterfaceC0177h interfaceC0177h) {
        AbstractC6118n.m27187e(interfaceC0177h, "<set-?>");
        this.f29854a = interfaceC0177h;
    }
}
