package androidx.work;

import com.google.android.gms.common.api.C3553a;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p112O0.AbstractC1096i;
import p112O0.AbstractC1109v;
import p112O0.InterfaceC1094g;
import p112O0.InterfaceC1104q;
import p119P0.C1174a;

/* JADX INFO: renamed from: androidx.work.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2895a {

    /* JADX INFO: renamed from: a */
    final Executor f11859a;

    /* JADX INFO: renamed from: b */
    final Executor f11860b;

    /* JADX INFO: renamed from: c */
    final AbstractC1109v f11861c;

    /* JADX INFO: renamed from: d */
    final AbstractC1096i f11862d;

    /* JADX INFO: renamed from: e */
    final InterfaceC1104q f11863e;

    /* JADX INFO: renamed from: f */
    final String f11864f;

    /* JADX INFO: renamed from: g */
    final int f11865g;

    /* JADX INFO: renamed from: h */
    final int f11866h;

    /* JADX INFO: renamed from: i */
    final int f11867i;

    /* JADX INFO: renamed from: j */
    final int f11868j;

    /* JADX INFO: renamed from: k */
    private final boolean f11869k;

    /* JADX INFO: renamed from: androidx.work.a$a */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private final AtomicInteger f11870a = new AtomicInteger(0);

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f11871b;

        a(boolean z7) {
            this.f11871b = z7;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.f11871b ? "WM.task-" : "androidx.work-") + this.f11870a.incrementAndGet());
        }
    }

    /* JADX INFO: renamed from: androidx.work.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        Executor f11873a;

        /* JADX INFO: renamed from: b */
        AbstractC1109v f11874b;

        /* JADX INFO: renamed from: c */
        AbstractC1096i f11875c;

        /* JADX INFO: renamed from: d */
        Executor f11876d;

        /* JADX INFO: renamed from: e */
        InterfaceC1104q f11877e;

        /* JADX INFO: renamed from: f */
        String f11878f;

        /* JADX INFO: renamed from: g */
        int f11879g = 4;

        /* JADX INFO: renamed from: h */
        int f11880h = 0;

        /* JADX INFO: renamed from: i */
        int f11881i = C3553a.e.API_PRIORITY_OTHER;

        /* JADX INFO: renamed from: j */
        int f11882j = 20;

        /* JADX INFO: renamed from: a */
        public C2895a m14493a() {
            return new C2895a(this);
        }
    }

    C2895a(b bVar) {
        Executor executor = bVar.f11873a;
        if (executor == null) {
            this.f11859a = m14480a(false);
        } else {
            this.f11859a = executor;
        }
        Executor executor2 = bVar.f11876d;
        if (executor2 == null) {
            this.f11869k = true;
            this.f11860b = m14480a(true);
        } else {
            this.f11869k = false;
            this.f11860b = executor2;
        }
        AbstractC1109v abstractC1109v = bVar.f11874b;
        if (abstractC1109v == null) {
            this.f11861c = AbstractC1109v.m4874c();
        } else {
            this.f11861c = abstractC1109v;
        }
        AbstractC1096i abstractC1096i = bVar.f11875c;
        if (abstractC1096i == null) {
            this.f11862d = AbstractC1096i.m4841c();
        } else {
            this.f11862d = abstractC1096i;
        }
        InterfaceC1104q interfaceC1104q = bVar.f11877e;
        if (interfaceC1104q == null) {
            this.f11863e = new C1174a();
        } else {
            this.f11863e = interfaceC1104q;
        }
        this.f11865g = bVar.f11879g;
        this.f11866h = bVar.f11880h;
        this.f11867i = bVar.f11881i;
        this.f11868j = bVar.f11882j;
        this.f11864f = bVar.f11878f;
    }

    /* JADX INFO: renamed from: a */
    private Executor m14480a(boolean z7) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), m14481b(z7));
    }

    /* JADX INFO: renamed from: b */
    private ThreadFactory m14481b(boolean z7) {
        return new a(z7);
    }

    /* JADX INFO: renamed from: c */
    public String m14482c() {
        return this.f11864f;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC1094g m14483d() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public Executor m14484e() {
        return this.f11859a;
    }

    /* JADX INFO: renamed from: f */
    public AbstractC1096i m14485f() {
        return this.f11862d;
    }

    /* JADX INFO: renamed from: g */
    public int m14486g() {
        return this.f11867i;
    }

    /* JADX INFO: renamed from: h */
    public int m14487h() {
        return this.f11868j;
    }

    /* JADX INFO: renamed from: i */
    public int m14488i() {
        return this.f11866h;
    }

    /* JADX INFO: renamed from: j */
    public int m14489j() {
        return this.f11865g;
    }

    /* JADX INFO: renamed from: k */
    public InterfaceC1104q m14490k() {
        return this.f11863e;
    }

    /* JADX INFO: renamed from: l */
    public Executor m14491l() {
        return this.f11860b;
    }

    /* JADX INFO: renamed from: m */
    public AbstractC1109v m14492m() {
        return this.f11861c;
    }
}
