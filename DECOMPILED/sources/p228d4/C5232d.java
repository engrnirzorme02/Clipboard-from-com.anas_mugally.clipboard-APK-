package p228d4;

import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import p211b5.InterfaceC2971a;
import p211b5.InterfaceC2972b;
import p276j4.AbstractC5868F;
import p276j4.AbstractC5869G;

/* JADX INFO: renamed from: d4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5232d implements InterfaceC5229a {

    /* JADX INFO: renamed from: c */
    private static final InterfaceC5236h f19957c = new b();

    /* JADX INFO: renamed from: a */
    private final InterfaceC2971a f19958a;

    /* JADX INFO: renamed from: b */
    private final AtomicReference f19959b = new AtomicReference(null);

    /* JADX INFO: renamed from: d4.d$b */
    private static final class b implements InterfaceC5236h {
        private b() {
        }

        @Override // p228d4.InterfaceC5236h
        /* JADX INFO: renamed from: a */
        public File mo24163a() {
            return null;
        }

        @Override // p228d4.InterfaceC5236h
        /* JADX INFO: renamed from: b */
        public File mo24164b() {
            return null;
        }

        @Override // p228d4.InterfaceC5236h
        /* JADX INFO: renamed from: c */
        public File mo24165c() {
            return null;
        }

        @Override // p228d4.InterfaceC5236h
        /* JADX INFO: renamed from: d */
        public AbstractC5868F.a mo24166d() {
            return null;
        }

        @Override // p228d4.InterfaceC5236h
        /* JADX INFO: renamed from: e */
        public File mo24167e() {
            return null;
        }

        @Override // p228d4.InterfaceC5236h
        /* JADX INFO: renamed from: f */
        public File mo24168f() {
            return null;
        }

        @Override // p228d4.InterfaceC5236h
        /* JADX INFO: renamed from: g */
        public File mo24169g() {
            return null;
        }
    }

    public C5232d(InterfaceC2971a interfaceC2971a) {
        this.f19958a = interfaceC2971a;
        interfaceC2971a.mo8945a(new InterfaceC2971a.a() { // from class: d4.b
            @Override // p211b5.InterfaceC2971a.a
            /* JADX INFO: renamed from: a */
            public final void mo5341a(InterfaceC2972b interfaceC2972b) {
                C5232d.m24162f(this.f19952a, interfaceC2972b);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m24162f(C5232d c5232d, InterfaceC2972b interfaceC2972b) {
        c5232d.getClass();
        C5235g.m24179f().m24180b("Crashlytics native component now available.");
        c5232d.f19959b.set((InterfaceC5229a) interfaceC2972b.get());
    }

    @Override // p228d4.InterfaceC5229a
    /* JADX INFO: renamed from: a */
    public InterfaceC5236h mo24157a(String str) {
        InterfaceC5229a interfaceC5229a = (InterfaceC5229a) this.f19959b.get();
        return interfaceC5229a == null ? f19957c : interfaceC5229a.mo24157a(str);
    }

    @Override // p228d4.InterfaceC5229a
    /* JADX INFO: renamed from: b */
    public boolean mo24158b() {
        InterfaceC5229a interfaceC5229a = (InterfaceC5229a) this.f19959b.get();
        return interfaceC5229a != null && interfaceC5229a.mo24158b();
    }

    @Override // p228d4.InterfaceC5229a
    /* JADX INFO: renamed from: c */
    public boolean mo24159c(String str) {
        InterfaceC5229a interfaceC5229a = (InterfaceC5229a) this.f19959b.get();
        return interfaceC5229a != null && interfaceC5229a.mo24159c(str);
    }

    @Override // p228d4.InterfaceC5229a
    /* JADX INFO: renamed from: d */
    public void mo24160d(final String str, final String str2, final long j7, final AbstractC5869G abstractC5869G) {
        C5235g.m24179f().m24186i("Deferring native open session: " + str);
        this.f19958a.mo8945a(new InterfaceC2971a.a() { // from class: d4.c
            @Override // p211b5.InterfaceC2971a.a
            /* JADX INFO: renamed from: a */
            public final void mo5341a(InterfaceC2972b interfaceC2972b) {
                ((InterfaceC5229a) interfaceC2972b.get()).mo24160d(str, str2, j7, abstractC5869G);
            }
        });
    }
}
