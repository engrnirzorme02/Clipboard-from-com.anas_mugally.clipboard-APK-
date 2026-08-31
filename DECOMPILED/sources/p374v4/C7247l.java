package p374v4;

import androidx.appcompat.app.AbstractC2263x;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.database.AbstractC4908e;
import com.google.firebase.database.AbstractC4910g;
import com.google.firebase.database.AbstractC4911h;
import com.google.firebase.database.C4904a;
import com.google.firebase.database.C4905b;
import com.google.firebase.database.C4906c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import p006A4.C0022g;
import p006A4.C0024i;
import p022C4.C0144c;
import p030D4.AbstractC0211o;
import p030D4.C0198b;
import p030D4.C0203g;
import p030D4.C0205i;
import p030D4.C0215s;
import p030D4.InterfaceC0210n;
import p334q4.C6834a;
import p334q4.C6835b;
import p334q4.InterfaceC6841h;
import p358t4.C7084f;
import p358t4.C7093o;
import p358t4.InterfaceC7085g;
import p358t4.InterfaceC7086h;
import p358t4.InterfaceC7094p;
import p390x4.C7409d;
import p390x4.InterfaceC7410e;
import p398y4.AbstractC7542c;
import p398y4.AbstractC7551l;
import p398y4.C7541b;
import p398y4.C7545f;
import p398y4.C7549j;

/* JADX INFO: renamed from: v4.l */
/* JADX INFO: loaded from: classes.dex */
public class C7247l implements InterfaceC7086h.a {

    /* JADX INFO: renamed from: a */
    private final C7250o f28879a;

    /* JADX INFO: renamed from: c */
    private InterfaceC7086h f28881c;

    /* JADX INFO: renamed from: d */
    private C7254s f28882d;

    /* JADX INFO: renamed from: e */
    private C7255t f28883e;

    /* JADX INFO: renamed from: f */
    private C7549j f28884f;

    /* JADX INFO: renamed from: h */
    private final C0022g f28886h;

    /* JADX INFO: renamed from: i */
    private final AbstractC7241f f28887i;

    /* JADX INFO: renamed from: j */
    private final C0144c f28888j;

    /* JADX INFO: renamed from: k */
    private final C0144c f28889k;

    /* JADX INFO: renamed from: l */
    private final C0144c f28890l;

    /* JADX INFO: renamed from: o */
    private C7258w f28893o;

    /* JADX INFO: renamed from: p */
    private C7258w f28894p;

    /* JADX INFO: renamed from: q */
    private C4906c f28895q;

    /* JADX INFO: renamed from: b */
    private final C7545f f28880b = new C7545f(new C7541b(), 0);

    /* JADX INFO: renamed from: g */
    private boolean f28885g = false;

    /* JADX INFO: renamed from: m */
    public long f28891m = 0;

    /* JADX INFO: renamed from: n */
    private long f28892n = 1;

    /* JADX INFO: renamed from: r */
    private boolean f28896r = false;

    /* JADX INFO: renamed from: s */
    private long f28897s = 0;

    /* JADX INFO: renamed from: v4.l$a */
    class a implements C7255t.c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Map f28898a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ List f28899b;

        a(Map map, List list) {
            this.f28898a = map;
            this.f28899b = list;
        }

        @Override // p374v4.C7255t.c
        /* JADX INFO: renamed from: a */
        public void mo32057a(C7245j c7245j, InterfaceC0210n interfaceC0210n) {
            this.f28899b.addAll(C7247l.this.f28894p.m32168z(c7245j, AbstractC7253r.m32096g(interfaceC0210n, C7247l.this.f28894p.m32155I(c7245j, new ArrayList()), this.f28898a)));
            C7247l.this.m32019U(C7247l.this.m32027g(c7245j, -9));
        }
    }

    /* JADX INFO: renamed from: v4.l$b */
    class b implements C7549j.c {
        b() {
        }

        @Override // p398y4.C7549j.c
        /* JADX INFO: renamed from: a */
        public void mo32058a(C7549j c7549j) {
            C7247l.this.m32023a0(c7549j);
        }
    }

    /* JADX INFO: renamed from: v4.l$c */
    class c implements InterfaceC7094p {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C7245j f28902a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ List f28903b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C7247l f28904c;

        /* JADX INFO: renamed from: v4.l$c$a */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C4904a f28906a;

            a(t tVar, C4904a c4904a) {
                this.f28906a = c4904a;
            }

            @Override // java.lang.Runnable
            public void run() {
                t.m32080x(null);
                throw null;
            }
        }

        c(C7245j c7245j, List list, C7247l c7247l) {
            this.f28902a = c7245j;
            this.f28903b = list;
            this.f28904c = c7247l;
        }

        @Override // p358t4.InterfaceC7094p
        /* JADX INFO: renamed from: a */
        public void mo31348a(String str, String str2) {
            C6834a c6834aM32012H = C7247l.m32012H(str, str2);
            C7247l.this.m32026e0("Transaction", this.f28902a, c6834aM32012H);
            ArrayList arrayList = new ArrayList();
            if (c6834aM32012H != null) {
                if (c6834aM32012H.m29875f() == -1) {
                    Iterator it = this.f28903b.iterator();
                    while (it.hasNext()) {
                        AbstractC2263x.m9328a(it.next());
                        if (t.m32073n(null) == u.SENT_NEEDS_ABORT) {
                            t.m32074o(null, u.NEEDS_ABORT);
                        } else {
                            t.m32074o(null, u.RUN);
                        }
                    }
                } else {
                    Iterator it2 = this.f28903b.iterator();
                    while (it2.hasNext()) {
                        AbstractC2263x.m9328a(it2.next());
                        t.m32074o(null, u.NEEDS_ABORT);
                        t.m32065A(null, c6834aM32012H);
                    }
                }
                C7247l.this.m32019U(this.f28902a);
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = this.f28903b.iterator();
            while (it3.hasNext()) {
                AbstractC2263x.m9328a(it3.next());
                t.m32074o(null, u.COMPLETED);
                arrayList.addAll(C7247l.this.f28894p.m32164s(t.m32075p(null), false, false, C7247l.this.f28880b));
                arrayList2.add(new a(null, AbstractC4908e.m22119a(AbstractC4908e.m22121c(this.f28904c, t.m32079w(null)), C0205i.m1061b(t.m32071k(null)))));
                C7247l c7247l = C7247l.this;
                t.m32081y(null);
                c7247l.m32053S(new C7232C(c7247l, null, C0024i.m134a(t.m32079w(null))));
            }
            C7247l c7247l2 = C7247l.this;
            c7247l2.m32017R(c7247l2.f28884f.m33225k(this.f28902a));
            C7247l.this.m32022Z();
            this.f28904c.m32016Q(arrayList);
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                C7247l.this.m32052P((Runnable) arrayList2.get(i7));
            }
        }
    }

    /* JADX INFO: renamed from: v4.l$d */
    class d implements C7549j.c {
        d() {
        }

        @Override // p398y4.C7549j.c
        /* JADX INFO: renamed from: a */
        public void mo32058a(C7549j c7549j) {
            C7247l.this.m32017R(c7549j);
        }
    }

    /* JADX INFO: renamed from: v4.l$e */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7247l.this.m32011G();
        }
    }

    /* JADX INFO: renamed from: v4.l$f */
    class f implements Runnable {
        f(t tVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7247l c7247l = C7247l.this;
            t.m32081y(null);
            c7247l.m32053S(new C7232C(c7247l, null, C0024i.m134a(t.m32079w(null))));
        }
    }

    /* JADX INFO: renamed from: v4.l$g */
    class g implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C6834a f28911a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C4904a f28912b;

        g(t tVar, C6834a c6834a, C4904a c4904a) {
            this.f28911a = c6834a;
            this.f28912b = c4904a;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.m32080x(null);
            throw null;
        }
    }

    /* JADX INFO: renamed from: v4.l$h */
    class h implements C7549j.c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List f28914a;

        h(List list) {
            this.f28914a = list;
        }

        @Override // p398y4.C7549j.c
        /* JADX INFO: renamed from: a */
        public void mo32058a(C7549j c7549j) {
            C7247l.this.m32009D(this.f28914a, c7549j);
        }
    }

    /* JADX INFO: renamed from: v4.l$i */
    class i implements C7549j.b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f28916a;

        i(int i7) {
            this.f28916a = i7;
        }

        @Override // p398y4.C7549j.b
        /* JADX INFO: renamed from: a */
        public boolean mo32059a(C7549j c7549j) {
            C7247l.this.m32028h(c7549j, this.f28916a);
            return false;
        }
    }

    /* JADX INFO: renamed from: v4.l$j */
    class j implements C7549j.c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f28918a;

        j(int i7) {
            this.f28918a = i7;
        }

        @Override // p398y4.C7549j.c
        /* JADX INFO: renamed from: a */
        public void mo32058a(C7549j c7549j) {
            C7247l.this.m32028h(c7549j, this.f28918a);
        }
    }

    /* JADX INFO: renamed from: v4.l$k */
    class k implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C6834a f28920a;

        k(t tVar, C6834a c6834a) {
            this.f28920a = c6834a;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.m32080x(null);
            throw null;
        }
    }

    /* JADX INFO: renamed from: v4.l$l */
    class l implements InterfaceC7261z.b {
        l() {
        }

        @Override // p374v4.InterfaceC7261z.b
        /* JADX INFO: renamed from: a */
        public void mo32060a(String str) {
            C7247l.this.f28888j.m624b("Auth token changed, triggering auth token refresh", new Object[0]);
            C7247l.this.f28881c.mo31249k(str);
        }
    }

    /* JADX INFO: renamed from: v4.l$m */
    class m implements InterfaceC7261z.b {
        m() {
        }

        @Override // p374v4.InterfaceC7261z.b
        /* JADX INFO: renamed from: a */
        public void mo32060a(String str) {
            C7247l.this.f28888j.m624b("App check token changed, triggering app check token refresh", new Object[0]);
            C7247l.this.f28881c.mo31250m(str);
        }
    }

    /* JADX INFO: renamed from: v4.l$n */
    class n implements C7258w.r {

        /* JADX INFO: renamed from: v4.l$n$a */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C0024i f28925a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C7258w.o f28926b;

            a(C0024i c0024i, C7258w.o oVar) {
                this.f28925a = c0024i;
                this.f28926b = oVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC0210n interfaceC0210nM32100a = C7247l.this.f28882d.m32100a(this.f28925a.m138e());
                if (interfaceC0210nM32100a.isEmpty()) {
                    return;
                }
                C7247l.this.m32016Q(C7247l.this.f28893o.m32168z(this.f28925a.m138e(), interfaceC0210nM32100a));
                this.f28926b.mo32183c(null);
            }
        }

        n() {
        }

        @Override // p374v4.C7258w.r
        /* JADX INFO: renamed from: a */
        public void mo32061a(C0024i c0024i, C7259x c7259x, InterfaceC7085g interfaceC7085g, C7258w.o oVar) {
            C7247l.this.m32055Y(new a(c0024i, oVar));
        }

        @Override // p374v4.C7258w.r
        /* JADX INFO: renamed from: b */
        public void mo32062b(C0024i c0024i, C7259x c7259x) {
        }
    }

    /* JADX INFO: renamed from: v4.l$o */
    class o implements C7258w.r {

        /* JADX INFO: renamed from: v4.l$o$a */
        class a implements InterfaceC7094p {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C7258w.o f28929a;

            a(C7258w.o oVar) {
                this.f28929a = oVar;
            }

            @Override // p358t4.InterfaceC7094p
            /* JADX INFO: renamed from: a */
            public void mo31348a(String str, String str2) {
                C7247l.this.m32016Q(this.f28929a.mo32183c(C7247l.m32012H(str, str2)));
            }
        }

        o() {
        }

        @Override // p374v4.C7258w.r
        /* JADX INFO: renamed from: a */
        public void mo32061a(C0024i c0024i, C7259x c7259x, InterfaceC7085g interfaceC7085g, C7258w.o oVar) {
            C7247l.this.f28881c.mo31252p(c0024i.m138e().m31998n(), c0024i.m137d().m125i(), interfaceC7085g, c7259x != null ? Long.valueOf(c7259x.m32185a()) : null, new a(oVar));
        }

        @Override // p374v4.C7258w.r
        /* JADX INFO: renamed from: b */
        public void mo32062b(C0024i c0024i, C7259x c7259x) {
            C7247l.this.f28881c.mo31251o(c0024i.m138e().m31998n(), c0024i.m137d().m125i());
        }
    }

    /* JADX INFO: renamed from: v4.l$p */
    class p implements InterfaceC7094p {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C7230A f28931a;

        p(C7230A c7230a) {
            this.f28931a = c7230a;
        }

        @Override // p358t4.InterfaceC7094p
        /* JADX INFO: renamed from: a */
        public void mo31348a(String str, String str2) {
            C6834a c6834aM32012H = C7247l.m32012H(str, str2);
            C7247l.this.m32026e0("Persisted write", this.f28931a.m31883c(), c6834aM32012H);
            C7247l.this.m32008C(this.f28931a.m31884d(), this.f28931a.m31883c(), c6834aM32012H);
        }
    }

    /* JADX INFO: renamed from: v4.l$q */
    class q implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C4905b.b f28933a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C6834a f28934b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C4905b f28935c;

        q(C4905b.b bVar, C6834a c6834a, C4905b c4905b) {
            this.f28933a = bVar;
            this.f28934b = c6834a;
            this.f28935c = c4905b;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28933a.mo22112a(this.f28934b, this.f28935c);
        }
    }

    /* JADX INFO: renamed from: v4.l$r */
    class r implements InterfaceC7094p {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C7245j f28937a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ long f28938b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C4905b.b f28939c;

        r(C7245j c7245j, long j7, C4905b.b bVar) {
            this.f28937a = c7245j;
            this.f28938b = j7;
            this.f28939c = bVar;
        }

        @Override // p358t4.InterfaceC7094p
        /* JADX INFO: renamed from: a */
        public void mo31348a(String str, String str2) {
            C6834a c6834aM32012H = C7247l.m32012H(str, str2);
            C7247l.this.m32026e0("setValue", this.f28937a, c6834aM32012H);
            C7247l.this.m32008C(this.f28938b, this.f28937a, c6834aM32012H);
            C7247l.this.m32047F(this.f28939c, c6834aM32012H, this.f28937a);
        }
    }

    /* JADX INFO: renamed from: v4.l$s */
    class s implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC4910g f28941a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TaskCompletionSource f28942b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C7247l f28943c;

        s(AbstractC4910g abstractC4910g, TaskCompletionSource taskCompletionSource, C7247l c7247l) {
            this.f28941a = abstractC4910g;
            this.f28942b = taskCompletionSource;
            this.f28943c = c7247l;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m32063a(s sVar, TaskCompletionSource taskCompletionSource, C4904a c4904a, AbstractC4910g abstractC4910g, C7247l c7247l, Task task) {
            sVar.getClass();
            if (taskCompletionSource.getTask().isComplete()) {
                return;
            }
            if (task.isSuccessful()) {
                InterfaceC0210n interfaceC0210nM1085a = AbstractC0211o.m1085a(task.getResult());
                C0024i c0024iM22127d = abstractC4910g.m22127d();
                C7247l.this.m32050N(c0024iM22127d, true, true);
                c7247l.m32016Q(c0024iM22127d.m140g() ? C7247l.this.f28894p.m32168z(c0024iM22127d.m138e(), interfaceC0210nM1085a) : C7247l.this.f28894p.m32151E(c0024iM22127d.m138e(), interfaceC0210nM1085a, C7247l.this.m32048L().m32163Y(c0024iM22127d)));
                taskCompletionSource.setResult(AbstractC4908e.m22119a(abstractC4910g.m22126c(), C0205i.m1062e(interfaceC0210nM1085a, abstractC4910g.m22127d().m136c())));
                C7247l.this.m32050N(c0024iM22127d, false, true);
                return;
            }
            if (c4904a.m22101b()) {
                taskCompletionSource.setResult(c4904a);
                return;
            }
            Exception exception = task.getException();
            Objects.requireNonNull(exception);
            taskCompletionSource.setException(exception);
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC0210n interfaceC0210nM32156M = C7247l.this.f28894p.m32156M(this.f28941a.m22127d());
            if (interfaceC0210nM32156M != null) {
                this.f28942b.setResult(AbstractC4908e.m22119a(this.f28941a.m22126c(), C0205i.m1061b(interfaceC0210nM32156M)));
                return;
            }
            C7247l.this.f28894p.m32162W(this.f28941a.m22127d());
            final C4904a c4904aM32158O = C7247l.this.f28894p.m32158O(this.f28941a);
            if (c4904aM32158O.m22101b()) {
                C7247l c7247l = C7247l.this;
                final TaskCompletionSource taskCompletionSource = this.f28942b;
                c7247l.m32054X(new Runnable() { // from class: v4.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        taskCompletionSource.trySetResult(c4904aM32158O);
                    }
                }, 3000L);
            }
            Task taskMo31243b = C7247l.this.f28881c.mo31243b(this.f28941a.m22125b().m31998n(), this.f28941a.m22127d().m137d().m125i());
            ScheduledExecutorService scheduledExecutorServiceM33184d = ((AbstractC7542c) C7247l.this.f28887i.m31976v()).m33184d();
            final TaskCompletionSource taskCompletionSource2 = this.f28942b;
            final AbstractC4910g abstractC4910g = this.f28941a;
            final C7247l c7247l2 = this.f28943c;
            taskMo31243b.addOnCompleteListener(scheduledExecutorServiceM33184d, new OnCompleteListener() { // from class: v4.n
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C7247l.s.m32063a(this.f28954a, taskCompletionSource2, c4904aM32158O, abstractC4910g, c7247l2, task);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v4.l$t */
    private static class t implements Comparable {
        /* JADX INFO: renamed from: A */
        static /* synthetic */ C6834a m32065A(t tVar, C6834a c6834a) {
            throw null;
        }

        /* JADX INFO: renamed from: B */
        static /* synthetic */ boolean m32066B(t tVar) {
            throw null;
        }

        /* JADX INFO: renamed from: c */
        static /* synthetic */ InterfaceC0210n m32067c(t tVar) {
            throw null;
        }

        /* JADX INFO: renamed from: d */
        static /* synthetic */ InterfaceC0210n m32068d(t tVar, InterfaceC0210n interfaceC0210n) {
            throw null;
        }

        /* JADX INFO: renamed from: h */
        static /* synthetic */ InterfaceC0210n m32069h(t tVar) {
            throw null;
        }

        /* JADX INFO: renamed from: j */
        static /* synthetic */ InterfaceC0210n m32070j(t tVar, InterfaceC0210n interfaceC0210n) {
            throw null;
        }

        /* JADX INFO: renamed from: k */
        static /* synthetic */ InterfaceC0210n m32071k(t tVar) {
            throw null;
        }

        /* JADX INFO: renamed from: m */
        static /* synthetic */ InterfaceC0210n m32072m(t tVar, InterfaceC0210n interfaceC0210n) {
            throw null;
        }

        /* JADX INFO: renamed from: n */
        static /* synthetic */ u m32073n(t tVar) {
            throw null;
        }

        /* JADX INFO: renamed from: o */
        static /* synthetic */ u m32074o(t tVar, u uVar) {
            throw null;
        }

        /* JADX INFO: renamed from: p */
        static /* synthetic */ long m32075p(t tVar) {
            throw null;
        }

        /* JADX INFO: renamed from: q */
        static /* synthetic */ long m32076q(t tVar, long j7) {
            throw null;
        }

        /* JADX INFO: renamed from: t */
        static /* synthetic */ int m32077t(t tVar) {
            throw null;
        }

        /* JADX INFO: renamed from: v */
        static /* synthetic */ int m32078v(t tVar) {
            throw null;
        }

        /* JADX INFO: renamed from: w */
        static /* synthetic */ C7245j m32079w(t tVar) {
            throw null;
        }

        /* JADX INFO: renamed from: x */
        static /* synthetic */ AbstractC4911h.b m32080x(t tVar) {
            throw null;
        }

        /* JADX INFO: renamed from: y */
        static /* synthetic */ InterfaceC6841h m32081y(t tVar) {
            throw null;
        }

        /* JADX INFO: renamed from: z */
        static /* synthetic */ C6834a m32082z(t tVar) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: v4.l$u */
    private enum u {
        INITIALIZING,
        RUN,
        SENT,
        COMPLETED,
        SENT_NEEDS_ABORT,
        NEEDS_ABORT
    }

    C7247l(C7250o c7250o, AbstractC7241f abstractC7241f, C4906c c4906c) {
        this.f28879a = c7250o;
        this.f28887i = abstractC7241f;
        this.f28895q = c4906c;
        this.f28888j = abstractC7241f.m31972q("RepoOperation");
        this.f28889k = abstractC7241f.m31972q("Transaction");
        this.f28890l = abstractC7241f.m31972q("DataOperation");
        this.f28886h = new C0022g(abstractC7241f);
        m32055Y(new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public void m32008C(long j7, C7245j c7245j, C6834a c6834a) {
        if (c6834a == null || c6834a.m29875f() != -25) {
            List listM32164s = this.f28894p.m32164s(j7, !(c6834a == null), true, this.f28880b);
            if (listM32164s.size() > 0) {
                m32019U(c7245j);
            }
            m32016Q(listM32164s);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public void m32009D(List list, C7549j c7549j) {
        List list2 = (List) c7549j.m33221g();
        if (list2 != null) {
            list.addAll(list2);
        }
        c7549j.m33217c(new h(list));
    }

    /* JADX INFO: renamed from: E */
    private List m32010E(C7549j c7549j) {
        ArrayList arrayList = new ArrayList();
        m32009D(arrayList, c7549j);
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public void m32011G() {
        C7250o c7250o = this.f28879a;
        this.f28881c = this.f28887i.m31964D(new C7084f(c7250o.f28959a, c7250o.f28961c, c7250o.f28960b), this);
        this.f28887i.m31969m().mo30255a(((AbstractC7542c) this.f28887i.m31976v()).m33184d(), new l());
        this.f28887i.m31968l().mo30255a(((AbstractC7542c) this.f28887i.m31976v()).m33184d(), new m());
        this.f28881c.mo31242a();
        InterfaceC7410e interfaceC7410eM31975t = this.f28887i.m31975t(this.f28879a.f28959a);
        this.f28882d = new C7254s();
        this.f28883e = new C7255t();
        this.f28884f = new C7549j();
        this.f28893o = new C7258w(this.f28887i, new C7409d(), new n());
        this.f28894p = new C7258w(this.f28887i, interfaceC7410eM31975t, new o());
        m32020V(interfaceC7410eM31975t);
        C0198b c0198b = AbstractC7237b.f28845c;
        Boolean bool = Boolean.FALSE;
        m32025d0(c0198b, bool);
        m32025d0(AbstractC7237b.f28846d, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static C6834a m32012H(String str, String str2) {
        if (str != null) {
            return C6834a.m29873d(str, str2);
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    private C7549j m32013I(C7245j c7245j) {
        C7549j c7549jM33225k = this.f28884f;
        while (!c7245j.isEmpty() && c7549jM33225k.m33221g() == null) {
            c7549jM33225k = c7549jM33225k.m33225k(new C7245j(c7245j.m32004z()));
            c7245j = c7245j.m31996C();
        }
        return c7549jM33225k;
    }

    /* JADX INFO: renamed from: J */
    private InterfaceC0210n m32014J(C7245j c7245j, List list) {
        InterfaceC0210n interfaceC0210nM32155I = this.f28894p.m32155I(c7245j, list);
        return interfaceC0210nM32155I == null ? C0203g.m1050w() : interfaceC0210nM32155I;
    }

    /* JADX INFO: renamed from: K */
    private long m32015K() {
        long j7 = this.f28892n;
        this.f28892n = 1 + j7;
        return j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public void m32016Q(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f28886h.m115b(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public void m32017R(C7549j c7549j) {
        List list = (List) c7549j.m33221g();
        if (list != null) {
            int i7 = 0;
            while (i7 < list.size()) {
                AbstractC2263x.m9328a(list.get(i7));
                if (t.m32073n(null) == u.COMPLETED) {
                    list.remove(i7);
                } else {
                    i7++;
                }
            }
            if (list.size() > 0) {
                c7549j.m33224j(list);
            } else {
                c7549j.m33224j(null);
            }
        }
        c7549j.m33217c(new d());
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0035 A[SYNTHETIC] */
    /* JADX INFO: renamed from: T */
    private void m32018T(List list, C7245j c7245j) {
        C6834a c6834aM29871b;
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2263x.m9328a(it.next());
            arrayList2.add(Long.valueOf(t.m32075p(null)));
        }
        Iterator it2 = list.iterator();
        while (true) {
            int i7 = 0;
            if (!it2.hasNext()) {
                m32017R(this.f28884f);
                while (i7 < arrayList.size()) {
                    m32052P((Runnable) arrayList.get(i7));
                    i7++;
                }
                m32022Z();
                return;
            }
            AbstractC2263x.m9328a(it2.next());
            C7245j c7245jM31990B = C7245j.m31990B(c7245j, t.m32079w(null));
            ArrayList arrayList3 = new ArrayList();
            AbstractC7551l.m33233f(c7245jM31990B != null);
            if (t.m32073n(null) == u.NEEDS_ABORT) {
                c6834aM29871b = t.m32082z(null);
                if (c6834aM29871b.m29875f() != -25) {
                    arrayList3.addAll(this.f28894p.m32164s(t.m32075p(null), true, false, this.f28880b));
                }
            } else {
                if (t.m32073n(null) == u.RUN) {
                    if (t.m32077t(null) >= 25) {
                        c6834aM29871b = C6834a.m29872c("maxretries");
                        arrayList3.addAll(this.f28894p.m32164s(t.m32075p(null), true, false, this.f28880b));
                    } else {
                        InterfaceC0210n interfaceC0210nM32014J = m32014J(t.m32079w(null), arrayList2);
                        t.m32068d(null, interfaceC0210nM32014J);
                        AbstractC4908e.m22120b(interfaceC0210nM32014J);
                        try {
                            t.m32080x(null);
                            throw null;
                        } catch (Throwable th) {
                            this.f28888j.m625c("Caught Throwable.", th);
                            c6834aM29871b = C6834a.m29871b(th);
                            AbstractC4911h.c cVarM22128a = AbstractC4911h.m22128a();
                            if (cVarM22128a.m22130b()) {
                                long jM32075p = t.m32075p(null);
                                Long lValueOf = Long.valueOf(jM32075p);
                                Map mapM32092c = AbstractC7253r.m32092c(this.f28880b);
                                InterfaceC0210n interfaceC0210nM22129a = cVarM22128a.m22129a();
                                InterfaceC0210n interfaceC0210nM32096g = AbstractC7253r.m32096g(interfaceC0210nM22129a, interfaceC0210nM32014J, mapM32092c);
                                t.m32070j(null, interfaceC0210nM22129a);
                                t.m32072m(null, interfaceC0210nM32096g);
                                t.m32076q(null, m32015K());
                                arrayList2.remove(lValueOf);
                                arrayList3.addAll(this.f28894p.m32154H(t.m32079w(null), interfaceC0210nM22129a, interfaceC0210nM32096g, t.m32075p(null), t.m32066B(null), false));
                                arrayList3.addAll(this.f28894p.m32164s(jM32075p, true, false, this.f28880b));
                            } else {
                                arrayList3.addAll(this.f28894p.m32164s(t.m32075p(null), true, false, this.f28880b));
                            }
                        }
                    }
                }
                c6834aM29871b = null;
                m32016Q(arrayList3);
                if (i7 != 0) {
                    t.m32074o(null, u.COMPLETED);
                    C4904a c4904aM22119a = AbstractC4908e.m22119a(AbstractC4908e.m22121c(this, t.m32079w(null)), C0205i.m1061b(t.m32067c(null)));
                    m32055Y(new f(null));
                    arrayList.add(new g(null, c6834aM29871b, c4904aM22119a));
                }
            }
            i7 = 1;
            m32016Q(arrayList3);
            if (i7 != 0) {
                t.m32074o(null, u.COMPLETED);
                C4904a c4904aM22119a2 = AbstractC4908e.m22119a(AbstractC4908e.m22121c(this, t.m32079w(null)), C0205i.m1061b(t.m32067c(null)));
                m32055Y(new f(null));
                arrayList.add(new g(null, c6834aM29871b, c4904aM22119a2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public C7245j m32019U(C7245j c7245j) {
        C7549j c7549jM32013I = m32013I(c7245j);
        C7245j c7245jM33220f = c7549jM32013I.m33220f();
        m32018T(m32010E(c7549jM32013I), c7245jM33220f);
        return c7245jM33220f;
    }

    /* JADX INFO: renamed from: V */
    private void m32020V(InterfaceC7410e interfaceC7410e) {
        List<C7230A> listMo32737e = interfaceC7410e.mo32737e();
        Map mapM32092c = AbstractC7253r.m32092c(this.f28880b);
        long jM31884d = Long.MIN_VALUE;
        for (C7230A c7230a : listMo32737e) {
            p pVar = new p(c7230a);
            if (jM31884d >= c7230a.m31884d()) {
                throw new IllegalStateException("Write ids were not in order.");
            }
            jM31884d = c7230a.m31884d();
            this.f28892n = c7230a.m31884d() + 1;
            if (c7230a.m31885e()) {
                if (this.f28888j.m627f()) {
                    this.f28888j.m624b("Restoring overwrite with id " + c7230a.m31884d(), new Object[0]);
                }
                this.f28881c.mo31248i(c7230a.m31883c().m31998n(), c7230a.m31882b().mo1001N(true), pVar);
                this.f28894p.m32154H(c7230a.m31883c(), c7230a.m31882b(), AbstractC7253r.m32097h(c7230a.m31882b(), this.f28894p, c7230a.m31883c(), mapM32092c), c7230a.m31884d(), true, false);
            } else {
                if (this.f28888j.m627f()) {
                    this.f28888j.m624b("Restoring merge with id " + c7230a.m31884d(), new Object[0]);
                }
                this.f28881c.mo31244c(c7230a.m31883c().m31998n(), c7230a.m31881a().m31942x(true), pVar);
                this.f28894p.m32153G(c7230a.m31883c(), c7230a.m31881a(), AbstractC7253r.m32095f(c7230a.m31881a(), this.f28894p, c7230a.m31883c(), mapM32092c), c7230a.m31884d(), false);
            }
        }
    }

    /* JADX INFO: renamed from: W */
    private void m32021W() {
        Map mapM32092c = AbstractC7253r.m32092c(this.f28880b);
        ArrayList arrayList = new ArrayList();
        this.f28883e.m32104b(C7245j.m31994y(), new a(mapM32092c, arrayList));
        this.f28883e = new C7255t();
        m32016Q(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public void m32022Z() {
        C7549j c7549j = this.f28884f;
        m32017R(c7549j);
        m32023a0(c7549j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public void m32023a0(C7549j c7549j) {
        if (((List) c7549j.m33221g()) == null) {
            if (c7549j.m33222h()) {
                c7549j.m33217c(new b());
                return;
            }
            return;
        }
        List listM32010E = m32010E(c7549j);
        AbstractC7551l.m33233f(listM32010E.size() > 0);
        Boolean bool = Boolean.TRUE;
        Iterator it = listM32010E.iterator();
        while (it.hasNext()) {
            AbstractC2263x.m9328a(it.next());
            if (t.m32073n(null) != u.RUN) {
                bool = Boolean.FALSE;
                break;
            }
        }
        if (bool.booleanValue()) {
            m32024b0(listM32010E, c7549j.m33220f());
        }
    }

    /* JADX INFO: renamed from: b0 */
    private void m32024b0(List list, C7245j c7245j) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2263x.m9328a(it.next());
            arrayList.add(Long.valueOf(t.m32075p(null)));
        }
        InterfaceC0210n interfaceC0210nM32014J = m32014J(c7245j, arrayList);
        String strMo1004S = !this.f28885g ? interfaceC0210nM32014J.mo1004S() : "badhash";
        Iterator it2 = list.iterator();
        while (true) {
            boolean z7 = true;
            if (!it2.hasNext()) {
                this.f28881c.mo31246e(c7245j.m31998n(), interfaceC0210nM32014J.mo1001N(true), strMo1004S, new c(c7245j, list, this));
                return;
            }
            AbstractC2263x.m9328a(it2.next());
            if (t.m32073n(null) != u.RUN) {
                z7 = false;
            }
            AbstractC7551l.m33233f(z7);
            t.m32074o(null, u.SENT);
            t.m32078v(null);
            interfaceC0210nM32014J = interfaceC0210nM32014J.mo1015u(C7245j.m31990B(c7245j, t.m32079w(null)), t.m32069h(null));
        }
    }

    /* JADX INFO: renamed from: d0 */
    private void m32025d0(C0198b c0198b, Object obj) {
        if (c0198b.equals(AbstractC7237b.f28844b)) {
            this.f28880b.m33210b(((Long) obj).longValue());
        }
        C7245j c7245j = new C7245j(AbstractC7237b.f28843a, c0198b);
        try {
            InterfaceC0210n interfaceC0210nM1085a = AbstractC0211o.m1085a(obj);
            this.f28882d.m32102c(c7245j, interfaceC0210nM1085a);
            m32016Q(this.f28893o.m32168z(c7245j, interfaceC0210nM1085a));
        } catch (C6835b e7) {
            this.f28888j.m625c("Failed to parse info update", e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public void m32026e0(String str, C7245j c7245j, C6834a c6834a) {
        if (c6834a == null || c6834a.m29875f() == -1 || c6834a.m29875f() == -25) {
            return;
        }
        this.f28888j.m628i(str + " at " + c7245j.toString() + " failed: " + c6834a.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public C7245j m32027g(C7245j c7245j, int i7) {
        C7245j c7245jM33220f = m32013I(c7245j).m33220f();
        if (this.f28889k.m627f()) {
            this.f28888j.m624b("Aborting transactions for path: " + c7245j + ". Affected: " + c7245jM33220f, new Object[0]);
        }
        C7549j c7549jM33225k = this.f28884f.m33225k(c7245j);
        c7549jM33225k.m33215a(new i(i7));
        m32028h(c7549jM33225k, i7);
        c7549jM33225k.m33218d(new j(i7));
        return c7245jM33220f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m32028h(C7549j c7549j, int i7) {
        C6834a c6834aM29870a;
        List list = (List) c7549j.m33221g();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            if (i7 == -9) {
                c6834aM29870a = C6834a.m29872c("overriddenBySet");
            } else {
                AbstractC7551l.m33234g(i7 == -25, "Unknown transaction abort reason: " + i7);
                c6834aM29870a = C6834a.m29870a(-25);
            }
            int i8 = -1;
            for (int i9 = 0; i9 < list.size(); i9++) {
                AbstractC2263x.m9328a(list.get(i9));
                u uVarM32073n = t.m32073n(null);
                u uVar = u.SENT_NEEDS_ABORT;
                if (uVarM32073n != uVar) {
                    if (t.m32073n(null) == u.SENT) {
                        AbstractC7551l.m33233f(i8 == i9 + (-1));
                        t.m32074o(null, uVar);
                        t.m32065A(null, c6834aM29870a);
                        i8 = i9;
                    } else {
                        AbstractC7551l.m33233f(t.m32073n(null) == u.RUN);
                        t.m32081y(null);
                        m32053S(new C7232C(this, null, C0024i.m134a(t.m32079w(null))));
                        if (i7 == -9) {
                            arrayList.addAll(this.f28894p.m32164s(t.m32075p(null), true, false, this.f28880b));
                        } else {
                            AbstractC7551l.m33234g(i7 == -25, "Unknown transaction abort reason: " + i7);
                        }
                        arrayList2.add(new k(null, c6834aM29870a));
                    }
                }
            }
            if (i8 == -1) {
                c7549j.m33224j(null);
            } else {
                c7549j.m33224j(list.subList(0, i8 + 1));
            }
            m32016Q(arrayList);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                m32052P((Runnable) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: F */
    void m32047F(C4905b.b bVar, C6834a c6834a, C7245j c7245j) {
        if (bVar != null) {
            C0198b c0198bM32003x = c7245j.m32003x();
            m32052P(new q(bVar, c6834a, (c0198bM32003x == null || !c0198bM32003x.m996q()) ? AbstractC4908e.m22121c(this, c7245j) : AbstractC4908e.m22121c(this, c7245j.m31995A())));
        }
    }

    /* JADX INFO: renamed from: L */
    C7258w m32048L() {
        return this.f28894p;
    }

    /* JADX INFO: renamed from: M */
    public Task m32049M(AbstractC4910g abstractC4910g) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m32055Y(new s(abstractC4910g, taskCompletionSource, this));
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: renamed from: N */
    public void m32050N(C0024i c0024i, boolean z7, boolean z8) {
        AbstractC7551l.m33233f(c0024i.m138e().isEmpty() || !c0024i.m138e().m32004z().equals(AbstractC7237b.f28843a));
        this.f28894p.m32157N(c0024i, z7, z8);
    }

    /* JADX INFO: renamed from: O */
    public void m32051O(C0198b c0198b, Object obj) {
        m32025d0(c0198b, obj);
    }

    /* JADX INFO: renamed from: P */
    public void m32052P(Runnable runnable) {
        this.f28887i.m31965E();
        this.f28887i.m31971o().mo30265b(runnable);
    }

    /* JADX INFO: renamed from: S */
    public void m32053S(AbstractC7243h abstractC7243h) {
        m32016Q(AbstractC7237b.f28843a.equals(abstractC7243h.mo31898d().m138e().m32004z()) ? this.f28893o.m32160T(abstractC7243h) : this.f28894p.m32160T(abstractC7243h));
    }

    /* JADX INFO: renamed from: X */
    public void m32054X(Runnable runnable, long j7) {
        this.f28887i.m31965E();
        this.f28887i.m31976v().mo32089c(runnable, j7);
    }

    /* JADX INFO: renamed from: Y */
    public void m32055Y(Runnable runnable) {
        this.f28887i.m31965E();
        this.f28887i.m31976v().mo32088b(runnable);
    }

    @Override // p358t4.InterfaceC7086h.a
    /* JADX INFO: renamed from: a */
    public void mo31253a(List list, Object obj, boolean z7, Long l7) {
        List listM32168z;
        C7245j c7245j = new C7245j(list);
        if (this.f28888j.m627f()) {
            this.f28888j.m624b("onDataUpdate: " + c7245j, new Object[0]);
        }
        if (this.f28890l.m627f()) {
            this.f28888j.m624b("onDataUpdate: " + c7245j + " " + obj, new Object[0]);
        }
        this.f28891m++;
        try {
            if (l7 != null) {
                C7259x c7259x = new C7259x(l7.longValue());
                if (z7) {
                    HashMap map = new HashMap();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        map.put(new C7245j((String) entry.getKey()), AbstractC0211o.m1085a(entry.getValue()));
                    }
                    listM32168z = this.f28894p.m32150D(c7245j, map, c7259x);
                } else {
                    listM32168z = this.f28894p.m32151E(c7245j, AbstractC0211o.m1085a(obj), c7259x);
                }
            } else if (z7) {
                HashMap map2 = new HashMap();
                for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                    map2.put(new C7245j((String) entry2.getKey()), AbstractC0211o.m1085a(entry2.getValue()));
                }
                listM32168z = this.f28894p.m32167y(c7245j, map2);
            } else {
                listM32168z = this.f28894p.m32168z(c7245j, AbstractC0211o.m1085a(obj));
            }
            if (listM32168z.size() > 0) {
                m32019U(c7245j);
            }
            m32016Q(listM32168z);
        } catch (C6835b e7) {
            this.f28888j.m625c("FIREBASE INTERNAL ERROR", e7);
        }
    }

    @Override // p358t4.InterfaceC7086h.a
    /* JADX INFO: renamed from: b */
    public void mo31254b(boolean z7) {
        m32051O(AbstractC7237b.f28845c, Boolean.valueOf(z7));
    }

    @Override // p358t4.InterfaceC7086h.a
    /* JADX INFO: renamed from: c */
    public void mo31255c() {
        m32051O(AbstractC7237b.f28846d, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: c0 */
    public void m32056c0(C7245j c7245j, InterfaceC0210n interfaceC0210n, C4905b.b bVar) {
        if (this.f28888j.m627f()) {
            this.f28888j.m624b("set: " + c7245j, new Object[0]);
        }
        if (this.f28890l.m627f()) {
            this.f28890l.m624b("set: " + c7245j + " " + interfaceC0210n, new Object[0]);
        }
        InterfaceC0210n interfaceC0210nM32096g = AbstractC7253r.m32096g(interfaceC0210n, this.f28894p.m32155I(c7245j, new ArrayList()), AbstractC7253r.m32092c(this.f28880b));
        long jM32015K = m32015K();
        m32016Q(this.f28894p.m32154H(c7245j, interfaceC0210n, interfaceC0210nM32096g, jM32015K, true, true));
        this.f28881c.mo31248i(c7245j.m31998n(), interfaceC0210n.mo1001N(true), new r(c7245j, jM32015K, bVar));
        m32019U(m32027g(c7245j, -9));
    }

    @Override // p358t4.InterfaceC7086h.a
    /* JADX INFO: renamed from: d */
    public void mo31256d(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            m32025d0(C0198b.m988j((String) entry.getKey()), entry.getValue());
        }
    }

    @Override // p358t4.InterfaceC7086h.a
    /* JADX INFO: renamed from: e */
    public void mo31257e() {
        m32051O(AbstractC7237b.f28846d, Boolean.FALSE);
        m32021W();
    }

    @Override // p358t4.InterfaceC7086h.a
    /* JADX INFO: renamed from: f */
    public void mo31258f(List list, List list2, Long l7) {
        C7245j c7245j = new C7245j(list);
        if (this.f28888j.m627f()) {
            this.f28888j.m624b("onRangeMergeUpdate: " + c7245j, new Object[0]);
        }
        if (this.f28890l.m627f()) {
            this.f28888j.m624b("onRangeMergeUpdate: " + c7245j + " " + list2, new Object[0]);
        }
        this.f28891m++;
        ArrayList arrayList = new ArrayList(list2.size());
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new C0215s((C7093o) it.next()));
        }
        List listM32152F = l7 != null ? this.f28894p.m32152F(c7245j, arrayList, new C7259x(l7.longValue())) : this.f28894p.m32148A(c7245j, arrayList);
        if (listM32152F.size() > 0) {
            m32019U(c7245j);
        }
        m32016Q(listM32152F);
    }

    public String toString() {
        return this.f28879a.toString();
    }
}
