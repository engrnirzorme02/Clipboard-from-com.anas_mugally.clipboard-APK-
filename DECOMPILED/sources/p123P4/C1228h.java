package p123P4;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.C4882w;
import p164V3.C1759d;
import p186Y4.AbstractC2044l;
import p186Y4.AbstractC2049q;
import p186Y4.InterfaceC2048p;
import p192Z3.InterfaceC2112a;
import p192Z3.InterfaceC2114b;
import p211b5.InterfaceC2971a;
import p211b5.InterfaceC2972b;
import p253g5.C5518b;

/* JADX INFO: renamed from: P4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1228h extends AbstractC1221a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC2112a f4325a = new InterfaceC2112a() { // from class: P4.e
        @Override // p192Z3.InterfaceC2112a
        /* JADX INFO: renamed from: a */
        public final void mo5343a(C5518b c5518b) {
            this.f4321a.m5348h();
        }
    };

    /* JADX INFO: renamed from: b */
    private InterfaceC2114b f4326b;

    /* JADX INFO: renamed from: c */
    private InterfaceC2048p f4327c;

    /* JADX INFO: renamed from: d */
    private int f4328d;

    /* JADX INFO: renamed from: e */
    private boolean f4329e;

    public C1228h(InterfaceC2971a interfaceC2971a) {
        interfaceC2971a.mo8945a(new InterfaceC2971a.a() { // from class: P4.f
            @Override // p211b5.InterfaceC2971a.a
            /* JADX INFO: renamed from: a */
            public final void mo5341a(InterfaceC2972b interfaceC2972b) {
                C1228h.m5345e(this.f4322a, interfaceC2972b);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Task m5344d(C1228h c1228h, int i7, Task task) {
        synchronized (c1228h) {
            try {
                if (i7 != c1228h.f4328d) {
                    AbstractC2049q.m8502a("FirebaseAuthCredentialsProvider", "getToken aborted due to token change", new Object[0]);
                    return c1228h.mo5338a();
                }
                if (task.isSuccessful()) {
                    return Tasks.forResult(((C4882w) task.getResult()).m22060c());
                }
                return Tasks.forException(task.getException());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m5345e(C1228h c1228h, InterfaceC2972b interfaceC2972b) {
        synchronized (c1228h) {
            c1228h.f4326b = (InterfaceC2114b) interfaceC2972b.get();
            c1228h.m5348h();
            c1228h.f4326b.mo8684b(c1228h.f4325a);
        }
    }

    /* JADX INFO: renamed from: g */
    private synchronized C1229i m5347g() {
        String strMo8683a;
        try {
            InterfaceC2114b interfaceC2114b = this.f4326b;
            strMo8683a = interfaceC2114b == null ? null : interfaceC2114b.mo8683a();
        } catch (Throwable th) {
            throw th;
        }
        return strMo8683a != null ? new C1229i(strMo8683a) : C1229i.f4330b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public synchronized void m5348h() {
        this.f4328d++;
        InterfaceC2048p interfaceC2048p = this.f4327c;
        if (interfaceC2048p != null) {
            interfaceC2048p.mo5928a(m5347g());
        }
    }

    @Override // p123P4.AbstractC1221a
    /* JADX INFO: renamed from: a */
    public synchronized Task mo5338a() {
        InterfaceC2114b interfaceC2114b = this.f4326b;
        if (interfaceC2114b == null) {
            return Tasks.forException(new C1759d("auth is not available"));
        }
        Task taskMo8685c = interfaceC2114b.mo8685c(this.f4329e);
        this.f4329e = false;
        final int i7 = this.f4328d;
        return taskMo8685c.continueWithTask(AbstractC2044l.f6763b, new Continuation() { // from class: P4.g
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return C1228h.m5344d(this.f4323a, i7, task);
            }
        });
    }

    @Override // p123P4.AbstractC1221a
    /* JADX INFO: renamed from: b */
    public synchronized void mo5339b() {
        this.f4329e = true;
    }

    @Override // p123P4.AbstractC1221a
    /* JADX INFO: renamed from: c */
    public synchronized void mo5340c(InterfaceC2048p interfaceC2048p) {
        this.f4327c = interfaceC2048p;
        interfaceC2048p.mo5928a(m5347g());
    }
}
