package p147T0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p140S0.InterfaceC1382a;
import p154U0.AbstractC1654d;
import p168W0.C1814p;

/* JADX INFO: renamed from: T0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1449c implements InterfaceC1382a {

    /* JADX INFO: renamed from: a */
    private final List f4976a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private Object f4977b;

    /* JADX INFO: renamed from: c */
    private AbstractC1654d f4978c;

    /* JADX INFO: renamed from: d */
    private a f4979d;

    /* JADX INFO: renamed from: T0.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo5954a(List list);

        /* JADX INFO: renamed from: b */
        void mo5955b(List list);
    }

    AbstractC1449c(AbstractC1654d abstractC1654d) {
        this.f4978c = abstractC1654d;
    }

    /* JADX INFO: renamed from: h */
    private void m6093h(a aVar, Object obj) {
        if (this.f4976a.isEmpty() || aVar == null) {
            return;
        }
        if (obj == null || mo6090c(obj)) {
            aVar.mo5955b(this.f4976a);
        } else {
            aVar.mo5954a(this.f4976a);
        }
    }

    @Override // p140S0.InterfaceC1382a
    /* JADX INFO: renamed from: a */
    public void mo5949a(Object obj) {
        this.f4977b = obj;
        m6093h(this.f4979d, obj);
    }

    /* JADX INFO: renamed from: b */
    abstract boolean mo6089b(C1814p c1814p);

    /* JADX INFO: renamed from: c */
    abstract boolean mo6090c(Object obj);

    /* JADX INFO: renamed from: d */
    public boolean m6094d(String str) {
        Object obj = this.f4977b;
        return obj != null && mo6090c(obj) && this.f4976a.contains(str);
    }

    /* JADX INFO: renamed from: e */
    public void m6095e(Iterable iterable) {
        this.f4976a.clear();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C1814p c1814p = (C1814p) it.next();
            if (mo6089b(c1814p)) {
                this.f4976a.add(c1814p.f5892a);
            }
        }
        if (this.f4976a.isEmpty()) {
            this.f4978c.m6908c(this);
        } else {
            this.f4978c.m6907a(this);
        }
        m6093h(this.f4979d, this.f4977b);
    }

    /* JADX INFO: renamed from: f */
    public void m6096f() {
        if (this.f4976a.isEmpty()) {
            return;
        }
        this.f4976a.clear();
        this.f4978c.m6908c(this);
    }

    /* JADX INFO: renamed from: g */
    public void m6097g(a aVar) {
        if (this.f4979d != aVar) {
            this.f4979d = aVar;
            m6093h(aVar, this.f4977b);
        }
    }
}
