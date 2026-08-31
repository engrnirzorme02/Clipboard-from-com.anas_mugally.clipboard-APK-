package p137R4;

import com.google.firebase.firestore.C4928n;
import com.google.firebase.firestore.InterfaceC4925k;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: R4.h */
/* JADX INFO: loaded from: classes.dex */
public class C1361h implements InterfaceC4925k {

    /* JADX INFO: renamed from: a */
    private final Executor f4772a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC4925k f4773b;

    /* JADX INFO: renamed from: c */
    private volatile boolean f4774c = false;

    public C1361h(Executor executor, InterfaceC4925k interfaceC4925k) {
        this.f4772a = executor;
        this.f4773b = interfaceC4925k;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5869b(C1361h c1361h, Object obj, C4928n c4928n) {
        if (c1361h.f4774c) {
            return;
        }
        c1361h.f4773b.mo5870a(obj, c4928n);
    }

    @Override // com.google.firebase.firestore.InterfaceC4925k
    /* JADX INFO: renamed from: a */
    public void mo5870a(final Object obj, final C4928n c4928n) {
        this.f4772a.execute(new Runnable() { // from class: R4.g
            @Override // java.lang.Runnable
            public final void run() {
                C1361h.m5869b(this.f4769a, obj, c4928n);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public void m5871c() {
        this.f4774c = true;
    }
}
