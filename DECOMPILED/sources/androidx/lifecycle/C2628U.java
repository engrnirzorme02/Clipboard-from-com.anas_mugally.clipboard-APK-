package androidx.lifecycle;

import android.os.Handler;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: androidx.lifecycle.U */
/* JADX INFO: loaded from: classes.dex */
public class C2628U {

    /* JADX INFO: renamed from: a */
    private final C2659u f10432a;

    /* JADX INFO: renamed from: b */
    private final Handler f10433b;

    /* JADX INFO: renamed from: c */
    private a f10434c;

    /* JADX INFO: renamed from: androidx.lifecycle.U$a */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a */
        private final C2659u f10435a;

        /* JADX INFO: renamed from: b */
        private final AbstractC2650l.a f10436b;

        /* JADX INFO: renamed from: c */
        private boolean f10437c;

        public a(C2659u registry, AbstractC2650l.a event) {
            AbstractC6118n.m27187e(registry, "registry");
            AbstractC6118n.m27187e(event, "event");
            this.f10435a = registry;
            this.f10436b = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f10437c) {
                return;
            }
            this.f10435a.m12651i(this.f10436b);
            this.f10437c = true;
        }
    }

    public C2628U(InterfaceC2657s provider) {
        AbstractC6118n.m27187e(provider, "provider");
        this.f10432a = new C2659u(provider);
        this.f10433b = new Handler();
    }

    /* JADX INFO: renamed from: f */
    private final void m12577f(AbstractC2650l.a aVar) {
        a aVar2 = this.f10434c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f10432a, aVar);
        this.f10434c = aVar3;
        Handler handler = this.f10433b;
        AbstractC6118n.m27184b(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }

    /* JADX INFO: renamed from: a */
    public AbstractC2650l m12578a() {
        return this.f10432a;
    }

    /* JADX INFO: renamed from: b */
    public void m12579b() {
        m12577f(AbstractC2650l.a.ON_START);
    }

    /* JADX INFO: renamed from: c */
    public void m12580c() {
        m12577f(AbstractC2650l.a.ON_CREATE);
    }

    /* JADX INFO: renamed from: d */
    public void m12581d() {
        m12577f(AbstractC2650l.a.ON_STOP);
        m12577f(AbstractC2650l.a.ON_DESTROY);
    }

    /* JADX INFO: renamed from: e */
    public void m12582e() {
        m12577f(AbstractC2650l.a.ON_START);
    }
}
