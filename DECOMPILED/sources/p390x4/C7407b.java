package p390x4;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import p006A4.C0016a;
import p006A4.C0024i;
import p022C4.C0144c;
import p030D4.C0198b;
import p030D4.C0203g;
import p030D4.C0205i;
import p030D4.InterfaceC0210n;
import p374v4.AbstractC7241f;
import p374v4.C7236a;
import p374v4.C7245j;
import p398y4.AbstractC7551l;
import p398y4.C7541b;
import p398y4.InterfaceC7540a;

/* JADX INFO: renamed from: x4.b */
/* JADX INFO: loaded from: classes.dex */
public class C7407b implements InterfaceC7410e {

    /* JADX INFO: renamed from: a */
    private final InterfaceC7411f f29654a;

    /* JADX INFO: renamed from: b */
    private final C7414i f29655b;

    /* JADX INFO: renamed from: c */
    private final C0144c f29656c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC7406a f29657d;

    /* JADX INFO: renamed from: e */
    private long f29658e;

    public C7407b(AbstractC7241f abstractC7241f, InterfaceC7411f interfaceC7411f, InterfaceC7406a interfaceC7406a) {
        this(abstractC7241f, interfaceC7411f, interfaceC7406a, new C7541b());
    }

    /* JADX INFO: renamed from: c */
    private void m32733c() {
        long j7 = this.f29658e + 1;
        this.f29658e = j7;
        if (this.f29657d.mo32732d(j7)) {
            if (this.f29656c.m627f()) {
                this.f29656c.m624b("Reached prune check threshold.", new Object[0]);
            }
            this.f29658e = 0L;
            long jMo30313s = this.f29654a.mo30313s();
            if (this.f29656c.m627f()) {
                this.f29656c.m624b("Cache size: " + jMo30313s, new Object[0]);
            }
            boolean z7 = true;
            while (z7 && this.f29657d.mo32729a(jMo30313s, this.f29655b.m32775f())) {
                C7412g c7412gM32781p = this.f29655b.m32781p(this.f29657d);
                if (c7412gM32781p.m32754e()) {
                    this.f29654a.mo30305k(C7245j.m31994y(), c7412gM32781p);
                } else {
                    z7 = false;
                }
                jMo30313s = this.f29654a.mo30313s();
                if (this.f29656c.m627f()) {
                    this.f29656c.m624b("Cache size after prune: " + jMo30313s, new Object[0]);
                }
            }
        }
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: a */
    public void mo32734a(long j7) {
        this.f29654a.mo30295a(j7);
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: b */
    public void mo32735b(C7245j c7245j, InterfaceC0210n interfaceC0210n, long j7) {
        this.f29654a.mo30296b(c7245j, interfaceC0210n, j7);
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: d */
    public void mo32736d(C7245j c7245j, C7236a c7236a, long j7) {
        this.f29654a.mo30298d(c7245j, c7236a, j7);
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: e */
    public List mo32737e() {
        return this.f29654a.mo30299e();
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: f */
    public void mo32738f(C0024i c0024i, Set set) {
        AbstractC7551l.m33234g(!c0024i.m140g(), "We should only track keys for filtered queries.");
        C7413h c7413hM32777i = this.f29655b.m32777i(c0024i);
        AbstractC7551l.m33234g(c7413hM32777i != null && c7413hM32777i.f29672e, "We only expect tracked keys for currently-active queries.");
        this.f29654a.mo30310p(c7413hM32777i.f29668a, set);
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: g */
    public void mo32739g(C0024i c0024i, InterfaceC0210n interfaceC0210n) {
        if (c0024i.m140g()) {
            this.f29654a.mo30312r(c0024i.m138e(), interfaceC0210n);
        } else {
            this.f29654a.mo30309o(c0024i.m138e(), interfaceC0210n);
        }
        mo32748p(c0024i);
        m32733c();
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: h */
    public void mo32740h(C0024i c0024i, Set set, Set set2) {
        AbstractC7551l.m33234g(!c0024i.m140g(), "We should only track keys for filtered queries.");
        C7413h c7413hM32777i = this.f29655b.m32777i(c0024i);
        AbstractC7551l.m33234g(c7413hM32777i != null && c7413hM32777i.f29672e, "We only expect tracked keys for currently-active queries.");
        this.f29654a.mo30315u(c7413hM32777i.f29668a, set, set2);
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: i */
    public Object mo32741i(Callable callable) {
        this.f29654a.mo30297c();
        try {
            Object objCall = callable.call();
            this.f29654a.mo30302h();
            this.f29654a.mo30304j();
            return objCall;
        } catch (Throwable th) {
            try {
                this.f29656c.m625c("Caught Throwable.", th);
                throw new RuntimeException(th);
            } catch (Throwable th2) {
                this.f29654a.mo30304j();
                throw th2;
            }
        }
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: j */
    public void mo32742j(C0024i c0024i) {
        this.f29655b.m32786x(c0024i);
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: k */
    public C0016a mo32743k(C0024i c0024i) {
        Set<C0198b> setM32778j;
        boolean z7;
        if (this.f29655b.m32780n(c0024i)) {
            C7413h c7413hM32777i = this.f29655b.m32777i(c0024i);
            setM32778j = (c0024i.m140g() || c7413hM32777i == null || !c7413hM32777i.f29671d) ? null : this.f29654a.mo30301g(c7413hM32777i.f29668a);
            z7 = true;
        } else {
            setM32778j = this.f29655b.m32778j(c0024i.m138e());
            z7 = false;
        }
        InterfaceC0210n interfaceC0210nMo30303i = this.f29654a.mo30303i(c0024i.m138e());
        if (setM32778j == null) {
            return new C0016a(C0205i.m1062e(interfaceC0210nMo30303i, c0024i.m136c()), z7, false);
        }
        InterfaceC0210n interfaceC0210nM1050w = C0203g.m1050w();
        for (C0198b c0198b : setM32778j) {
            interfaceC0210nM1050w = interfaceC0210nM1050w.mo999E(c0198b, interfaceC0210nMo30303i.mo1008l(c0198b));
        }
        return new C0016a(C0205i.m1062e(interfaceC0210nM1050w, c0024i.m136c()), z7, true);
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: l */
    public void mo32744l(C0024i c0024i) {
        this.f29655b.m32784u(c0024i);
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: m */
    public void mo32745m(C7245j c7245j, InterfaceC0210n interfaceC0210n) {
        if (this.f29655b.m32779l(c7245j)) {
            return;
        }
        this.f29654a.mo30312r(c7245j, interfaceC0210n);
        this.f29655b.m32776g(c7245j);
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: n */
    public void mo32746n(C7245j c7245j, C7236a c7236a) {
        Iterator it = c7236a.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            mo32745m(c7245j.m32000q((C7245j) entry.getKey()), (InterfaceC0210n) entry.getValue());
        }
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: o */
    public void mo32747o(C7245j c7245j, C7236a c7236a) {
        this.f29654a.mo30307m(c7245j, c7236a);
        m32733c();
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: p */
    public void mo32748p(C0024i c0024i) {
        if (c0024i.m140g()) {
            this.f29655b.m32783t(c0024i.m138e());
        } else {
            this.f29655b.m32785w(c0024i);
        }
    }

    public C7407b(AbstractC7241f abstractC7241f, InterfaceC7411f interfaceC7411f, InterfaceC7406a interfaceC7406a, InterfaceC7540a interfaceC7540a) {
        this.f29658e = 0L;
        this.f29654a = interfaceC7411f;
        C0144c c0144cM31972q = abstractC7241f.m31972q("Persistence");
        this.f29656c = c0144cM31972q;
        this.f29655b = new C7414i(interfaceC7411f, c0144cM31972q, interfaceC7540a);
        this.f29657d = interfaceC7406a;
    }
}
