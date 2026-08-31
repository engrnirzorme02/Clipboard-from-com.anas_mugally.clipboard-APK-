package p179X4;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import p063H5.AbstractC0506A;
import p063H5.AbstractC0543g;
import p063H5.C0530Z;
import p063H5.C0532a0;
import p063H5.C0554l0;
import p123P4.AbstractC1221a;
import p158U4.C1682f;
import p186Y4.AbstractC2034b;
import p186Y4.C2037e;

/* JADX INFO: renamed from: X4.u */
/* JADX INFO: loaded from: classes.dex */
public class C1998u {

    /* JADX INFO: renamed from: g */
    private static final C0530Z.g f6643g;

    /* JADX INFO: renamed from: h */
    private static final C0530Z.g f6644h;

    /* JADX INFO: renamed from: i */
    private static final C0530Z.g f6645i;

    /* JADX INFO: renamed from: j */
    private static volatile String f6646j;

    /* JADX INFO: renamed from: a */
    private final C2037e f6647a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1221a f6648b;

    /* JADX INFO: renamed from: c */
    private final AbstractC1221a f6649c;

    /* JADX INFO: renamed from: d */
    private final C1957D f6650d;

    /* JADX INFO: renamed from: e */
    private final String f6651e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC1958E f6652f;

    /* JADX INFO: renamed from: X4.u$a */
    class a extends AbstractC0543g.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC1959F f6653a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AbstractC0543g[] f6654b;

        a(InterfaceC1959F interfaceC1959F, AbstractC0543g[] abstractC0543gArr) {
            this.f6653a = interfaceC1959F;
            this.f6654b = abstractC0543gArr;
        }

        @Override // p063H5.AbstractC0543g.a
        /* JADX INFO: renamed from: a */
        public void mo2421a(C0554l0 c0554l0, C0530Z c0530z) {
            try {
                this.f6653a.mo8100b(c0554l0);
            } catch (Throwable th) {
                C1998u.this.f6647a.m8474l(th);
            }
        }

        @Override // p063H5.AbstractC0543g.a
        /* JADX INFO: renamed from: b */
        public void mo2422b(C0530Z c0530z) {
            try {
                this.f6653a.mo8101c(c0530z);
            } catch (Throwable th) {
                C1998u.this.f6647a.m8474l(th);
            }
        }

        @Override // p063H5.AbstractC0543g.a
        /* JADX INFO: renamed from: c */
        public void mo2423c(Object obj) {
            try {
                this.f6653a.mo8102d(obj);
                this.f6654b[0].mo2120c(1);
            } catch (Throwable th) {
                C1998u.this.f6647a.m8474l(th);
            }
        }

        @Override // p063H5.AbstractC0543g.a
        /* JADX INFO: renamed from: d */
        public void mo2424d() {
        }
    }

    /* JADX INFO: renamed from: X4.u$b */
    class b extends AbstractC0506A {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC0543g[] f6656a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Task f6657b;

        b(AbstractC0543g[] abstractC0543gArr, Task task) {
            this.f6656a = abstractC0543gArr;
            this.f6657b = task;
        }

        @Override // p063H5.AbstractC0506A, p063H5.AbstractC0542f0, p063H5.AbstractC0543g
        /* JADX INFO: renamed from: b */
        public void mo2119b() {
            if (this.f6656a[0] == null) {
                this.f6657b.addOnSuccessListener(C1998u.this.f6647a.m8472j(), new OnSuccessListener() { // from class: X4.v
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        ((AbstractC0543g) obj).mo2119b();
                    }
                });
            } else {
                super.mo2119b();
            }
        }

        @Override // p063H5.AbstractC0506A, p063H5.AbstractC0542f0
        /* JADX INFO: renamed from: f */
        protected AbstractC0543g mo2123f() {
            AbstractC2034b.m8460d(this.f6656a[0] != null, "ClientCall used before onOpen() callback", new Object[0]);
            return this.f6656a[0];
        }
    }

    static {
        C0530Z.d dVar = C0530Z.f1980e;
        f6643g = C0530Z.g.m2296e("x-goog-api-client", dVar);
        f6644h = C0530Z.g.m2296e("google-cloud-resource-prefix", dVar);
        f6645i = C0530Z.g.m2296e("x-goog-request-params", dVar);
        f6646j = "gl-java/";
    }

    C1998u(C2037e c2037e, AbstractC1221a abstractC1221a, AbstractC1221a abstractC1221a2, C1682f c1682f, InterfaceC1958E interfaceC1958E, C1957D c1957d) {
        this.f6647a = c2037e;
        this.f6652f = interfaceC1958E;
        this.f6648b = abstractC1221a;
        this.f6649c = abstractC1221a2;
        this.f6650d = c1957d;
        this.f6651e = String.format("projects/%s/databases/%s", c1682f.m7070k(), c1682f.m7069j());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8357a(C1998u c1998u, AbstractC0543g[] abstractC0543gArr, InterfaceC1959F interfaceC1959F, Task task) {
        c1998u.getClass();
        AbstractC0543g abstractC0543g = (AbstractC0543g) task.getResult();
        abstractC0543gArr[0] = abstractC0543g;
        abstractC0543g.mo2122e(c1998u.new a(interfaceC1959F, abstractC0543gArr), c1998u.m8360e());
        interfaceC1959F.mo8099a();
        abstractC0543gArr[0].mo2120c(1);
    }

    /* JADX INFO: renamed from: c */
    private String m8359c() {
        return String.format("%s fire/%s grpc/", f6646j, "26.0.1");
    }

    /* JADX INFO: renamed from: e */
    private C0530Z m8360e() {
        C0530Z c0530z = new C0530Z();
        c0530z.m2287p(f6643g, m8359c());
        c0530z.m2287p(f6644h, this.f6651e);
        c0530z.m2287p(f6645i, this.f6651e);
        InterfaceC1958E interfaceC1958E = this.f6652f;
        if (interfaceC1958E != null) {
            interfaceC1958E.mo8098a(c0530z);
        }
        return c0530z;
    }

    /* JADX INFO: renamed from: g */
    public static void m8361g(String str) {
        f6646j = str;
    }

    /* JADX INFO: renamed from: d */
    public void m8362d() {
        this.f6648b.mo5339b();
        this.f6649c.mo5339b();
    }

    /* JADX INFO: renamed from: f */
    AbstractC0543g m8363f(C0532a0 c0532a0, final InterfaceC1959F interfaceC1959F) {
        final AbstractC0543g[] abstractC0543gArr = {null};
        Task taskM8097i = this.f6650d.m8097i(c0532a0);
        taskM8097i.addOnCompleteListener(this.f6647a.m8472j(), new OnCompleteListener() { // from class: X4.t
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1998u.m8357a(this.f6640a, abstractC0543gArr, interfaceC1959F, task);
            }
        });
        return new b(abstractC0543gArr, taskM8097i);
    }
}
