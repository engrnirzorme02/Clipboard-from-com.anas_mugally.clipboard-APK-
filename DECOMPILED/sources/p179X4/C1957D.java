package p179X4;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p063H5.AbstractC0526V;
import p063H5.AbstractC0527W;
import p063H5.AbstractC0533b;
import p063H5.C0532a0;
import p063H5.C0535c;
import p063H5.EnumC0561p;
import p071I5.C0638a;
import p137R4.C1365l;
import p170W2.C1842g;
import p170W2.C1843h;
import p186Y4.AbstractC2044l;
import p186Y4.AbstractC2049q;
import p186Y4.C2037e;
import p186Y4.InterfaceC2052t;
import p291l3.AbstractC6295a;
import p351s5.AbstractC7031m;

/* JADX INFO: renamed from: X4.D */
/* JADX INFO: loaded from: classes.dex */
public class C1957D {

    /* JADX INFO: renamed from: h */
    private static InterfaceC2052t f6442h;

    /* JADX INFO: renamed from: a */
    private Task f6443a;

    /* JADX INFO: renamed from: b */
    private final C2037e f6444b;

    /* JADX INFO: renamed from: c */
    private C0535c f6445c;

    /* JADX INFO: renamed from: d */
    private C2037e.b f6446d;

    /* JADX INFO: renamed from: e */
    private final Context f6447e;

    /* JADX INFO: renamed from: f */
    private final C1365l f6448f;

    /* JADX INFO: renamed from: g */
    private final AbstractC0533b f6449g;

    C1957D(C2037e c2037e, Context context, C1365l c1365l, AbstractC0533b abstractC0533b) {
        this.f6444b = c2037e;
        this.f6447e = context;
        this.f6448f = c1365l;
        this.f6449g = abstractC0533b;
        m8094k();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8085a(C1957D c1957d, AbstractC0526V abstractC0526V) {
        c1957d.getClass();
        abstractC0526V.mo2248m();
        c1957d.m8094k();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m8089e(C1957D c1957d, AbstractC0526V abstractC0526V) {
        c1957d.getClass();
        AbstractC2049q.m8502a("GrpcCallProvider", "connectivityAttemptTimer elapsed. Resetting the channel.", new Object[0]);
        c1957d.m8092h();
        c1957d.m8096m(abstractC0526V);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Task m8090f(C1957D c1957d, C0532a0 c0532a0, Task task) {
        c1957d.getClass();
        return Tasks.forResult(((AbstractC0526V) task.getResult()).mo2405f(c0532a0, c1957d.f6445c));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ AbstractC0526V m8091g(final C1957D c1957d) {
        final AbstractC0526V abstractC0526VM8093j = c1957d.m8093j(c1957d.f6447e, c1957d.f6448f);
        c1957d.f6444b.m8471i(new Runnable() { // from class: X4.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f6660a.m8095l(abstractC0526VM8093j);
            }
        });
        c1957d.f6445c = ((AbstractC7031m.b) ((AbstractC7031m.b) AbstractC7031m.m30774c(abstractC0526VM8093j).m4976c(c1957d.f6449g)).m4977d(c1957d.f6444b.m8472j())).m4975b();
        AbstractC2049q.m8502a("GrpcCallProvider", "Channel successfully reset.", new Object[0]);
        return abstractC0526VM8093j;
    }

    /* JADX INFO: renamed from: h */
    private void m8092h() {
        if (this.f6446d != null) {
            AbstractC2049q.m8502a("GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
            this.f6446d.m8481c();
            this.f6446d = null;
        }
    }

    /* JADX INFO: renamed from: j */
    private AbstractC0526V m8093j(Context context, C1365l c1365l) {
        AbstractC0527W abstractC0527W;
        try {
            AbstractC6295a.m27215a(context);
        } catch (C1842g | C1843h | IllegalStateException e7) {
            AbstractC2049q.m8505d("GrpcCallProvider", "Failed to update ssl context: %s", e7);
        }
        InterfaceC2052t interfaceC2052t = f6442h;
        if (interfaceC2052t != null) {
            abstractC0527W = (AbstractC0527W) interfaceC2052t.get();
        } else {
            AbstractC0527W abstractC0527WM2249b = AbstractC0527W.m2249b(c1365l.m5901b());
            if (!c1365l.m5903d()) {
                abstractC0527WM2249b.mo2252d();
            }
            abstractC0527W = abstractC0527WM2249b;
        }
        abstractC0527W.mo2251c(30L, TimeUnit.SECONDS);
        return C0638a.m2939k(abstractC0527W).m2940i(context).mo2250a();
    }

    /* JADX INFO: renamed from: k */
    private void m8094k() {
        this.f6443a = Tasks.call(AbstractC2044l.f6764c, new Callable() { // from class: X4.w
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C1957D.m8091g(this.f6659a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m8095l(final AbstractC0526V abstractC0526V) {
        EnumC0561p enumC0561pMo2246k = abstractC0526V.mo2246k(true);
        AbstractC2049q.m8502a("GrpcCallProvider", "Current gRPC connectivity state: " + enumC0561pMo2246k, new Object[0]);
        m8092h();
        if (enumC0561pMo2246k == EnumC0561p.CONNECTING) {
            AbstractC2049q.m8502a("GrpcCallProvider", "Setting the connectivityAttemptTimer", new Object[0]);
            this.f6446d = this.f6444b.m8470h(C2037e.d.CONNECTIVITY_ATTEMPT_TIMER, 15000L, new Runnable() { // from class: X4.y
                @Override // java.lang.Runnable
                public final void run() {
                    C1957D.m8089e(this.f6662a, abstractC0526V);
                }
            });
        }
        abstractC0526V.mo2247l(enumC0561pMo2246k, new Runnable() { // from class: X4.z
            @Override // java.lang.Runnable
            public final void run() {
                C1957D c1957d = this.f6664a;
                c1957d.f6444b.m8471i(new Runnable() { // from class: X4.B
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6438a.m8095l(abstractC0526V);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: m */
    private void m8096m(final AbstractC0526V abstractC0526V) {
        this.f6444b.m8471i(new Runnable() { // from class: X4.C
            @Override // java.lang.Runnable
            public final void run() {
                C1957D.m8085a(this.f6440a, abstractC0526V);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public Task m8097i(final C0532a0 c0532a0) {
        return this.f6443a.continueWithTask(this.f6444b.m8472j(), new Continuation() { // from class: X4.A
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return C1957D.m8090f(this.f6436a, c0532a0, task);
            }
        });
    }
}
