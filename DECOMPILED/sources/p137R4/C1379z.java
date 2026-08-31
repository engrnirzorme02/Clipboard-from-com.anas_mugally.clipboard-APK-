package p137R4;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.C4928n;
import com.google.firebase.firestore.InterfaceC4925k;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import p123P4.AbstractC1221a;
import p123P4.C1229i;
import p130Q4.C1288a;
import p151T4.AbstractC1521Y;
import p151T4.C1472A;
import p151T4.C1558l;
import p151T4.InterfaceC1602z1;
import p158U4.C1687k;
import p158U4.InterfaceC1684h;
import p179X4.C1964K;
import p179X4.C1968O;
import p179X4.InterfaceC1958E;
import p186Y4.AbstractC2034b;
import p186Y4.AbstractC2049q;
import p186Y4.C2037e;
import p186Y4.InterfaceC2048p;

/* JADX INFO: renamed from: R4.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1379z {

    /* JADX INFO: renamed from: a */
    private final C1365l f4869a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1221a f4870b;

    /* JADX INFO: renamed from: c */
    private final AbstractC1221a f4871c;

    /* JADX INFO: renamed from: d */
    private final C2037e f4872d;

    /* JADX INFO: renamed from: e */
    private final C1288a f4873e;

    /* JADX INFO: renamed from: f */
    private AbstractC1521Y f4874f;

    /* JADX INFO: renamed from: g */
    private C1472A f4875g;

    /* JADX INFO: renamed from: h */
    private C1968O f4876h;

    /* JADX INFO: renamed from: i */
    private C1347O f4877i;

    /* JADX INFO: renamed from: j */
    private C1368o f4878j;

    /* JADX INFO: renamed from: k */
    private InterfaceC1602z1 f4879k;

    /* JADX INFO: renamed from: l */
    private InterfaceC1602z1 f4880l;

    public C1379z(final Context context, C1365l c1365l, AbstractC1221a abstractC1221a, AbstractC1221a abstractC1221a2, final C2037e c2037e, final InterfaceC1958E interfaceC1958E, final AbstractC1363j abstractC1363j) {
        this.f4869a = c1365l;
        this.f4870b = abstractC1221a;
        this.f4871c = abstractC1221a2;
        this.f4872d = c2037e;
        this.f4873e = new C1288a(new C1964K(c1365l.m5900a()));
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        c2037e.m8471i(new Runnable() { // from class: R4.t
            @Override // java.lang.Runnable
            public final void run() {
                C1379z.m5934f(this.f4854a, taskCompletionSource, context, abstractC1363j, interfaceC1958E);
            }
        });
        abstractC1221a.mo5340c(new InterfaceC2048p() { // from class: R4.u
            @Override // p186Y4.InterfaceC2048p
            /* JADX INFO: renamed from: a */
            public final void mo5928a(Object obj) {
                C1379z.m5929a(this.f4859a, atomicBoolean, taskCompletionSource, c2037e, (C1229i) obj);
            }
        });
        abstractC1221a2.mo5340c(new InterfaceC2048p() { // from class: R4.v
            @Override // p186Y4.InterfaceC2048p
            /* JADX INFO: renamed from: a */
            public final void mo5928a(Object obj) {
                C1379z.m5931c((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5929a(final C1379z c1379z, AtomicBoolean atomicBoolean, TaskCompletionSource taskCompletionSource, C2037e c2037e, final C1229i c1229i) {
        c1379z.getClass();
        if (!atomicBoolean.compareAndSet(false, true)) {
            c2037e.m8471i(new Runnable() { // from class: R4.w
                @Override // java.lang.Runnable
                public final void run() {
                    C1379z.m5935g(this.f4863a, c1229i);
                }
            });
        } else {
            AbstractC2034b.m8460d(!taskCompletionSource.getTask().isComplete(), "Already fulfilled first user task", new Object[0]);
            taskCompletionSource.setResult(c1229i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC1684h m5930b(Task task) throws C4928n {
        InterfaceC1684h interfaceC1684h = (InterfaceC1684h) task.getResult();
        if (interfaceC1684h.mo7073b()) {
            return interfaceC1684h;
        }
        if (interfaceC1684h.mo7079h()) {
            return null;
        }
        throw new C4928n("Failed to get document from cache. (However, this document may exist on the server. Run again without setting source to CACHE to attempt to retrieve the document from the server.)", C4928n.a.UNAVAILABLE);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m5931c(String str) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m5934f(C1379z c1379z, TaskCompletionSource taskCompletionSource, Context context, AbstractC1363j abstractC1363j, InterfaceC1958E interfaceC1958E) {
        c1379z.getClass();
        try {
            c1379z.m5937j(context, (C1229i) Tasks.await(taskCompletionSource.getTask()), abstractC1363j, interfaceC1958E);
        } catch (InterruptedException | ExecutionException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m5935g(C1379z c1379z, C1229i c1229i) {
        AbstractC2034b.m8460d(c1379z.f4877i != null, "SyncEngine not yet initialized", new Object[0]);
        AbstractC2049q.m8502a("FirestoreClient", "Credential changed. Current user: %s", c1229i.m5349a());
        c1379z.f4877i.m5795k(c1229i);
    }

    /* JADX INFO: renamed from: j */
    private void m5937j(Context context, C1229i c1229i, AbstractC1363j abstractC1363j, InterfaceC1958E interfaceC1958E) {
        AbstractC2049q.m8502a("FirestoreClient", "Initializing. user=%s", c1229i.m5349a());
        abstractC1363j.m5889s(new AbstractC1363j.a(context, this.f4872d, this.f4869a, c1229i, 100, this.f4870b, this.f4871c, interfaceC1958E));
        this.f4874f = abstractC1363j.m5885o();
        this.f4880l = abstractC1363j.m5882l();
        this.f4875g = abstractC1363j.m5884n();
        this.f4876h = abstractC1363j.m5887q();
        this.f4877i = abstractC1363j.m5888r();
        this.f4878j = abstractC1363j.m5881k();
        C1558l c1558lM5883m = abstractC1363j.m5883m();
        InterfaceC1602z1 interfaceC1602z1 = this.f4880l;
        if (interfaceC1602z1 != null) {
            interfaceC1602z1.start();
        }
        if (c1558lM5883m != null) {
            C1558l.a aVarM6421f = c1558lM5883m.m6421f();
            this.f4879k = aVarM6421f;
            aVarM6421f.start();
        }
    }

    /* JADX INFO: renamed from: n */
    private void m5938n() {
        if (m5940k()) {
            throw new IllegalStateException("The client has already been terminated");
        }
    }

    /* JADX INFO: renamed from: i */
    public Task m5939i(final C1687k c1687k) {
        m5938n();
        return this.f4872d.m8469g(new Callable() { // from class: R4.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4852a.f4875g.m6149B(c1687k);
            }
        }).continueWith(new Continuation() { // from class: R4.s
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return C1379z.m5930b(task);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public boolean m5940k() {
        return this.f4872d.m8473k();
    }

    /* JADX INFO: renamed from: l */
    public C1344L m5941l(C1343K c1343k, C1368o.b bVar, InterfaceC4925k interfaceC4925k) {
        m5938n();
        final C1344L c1344l = new C1344L(c1343k, bVar, interfaceC4925k);
        this.f4872d.m8471i(new Runnable() { // from class: R4.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f4867a.f4878j.m5911d(c1344l);
            }
        });
        return c1344l;
    }

    /* JADX INFO: renamed from: m */
    public void m5942m(final C1344L c1344l) {
        this.f4872d.m8471i(new Runnable() { // from class: R4.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f4865a.f4878j.m5912f(c1344l);
            }
        });
    }
}
