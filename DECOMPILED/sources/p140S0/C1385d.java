package p140S0;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p112O0.AbstractC1097j;
import p147T0.AbstractC1449c;
import p147T0.C1447a;
import p147T0.C1448b;
import p147T0.C1450d;
import p147T0.C1451e;
import p147T0.C1452f;
import p147T0.C1453g;
import p147T0.C1454h;
import p182Y0.InterfaceC2010a;

/* JADX INFO: renamed from: S0.d */
/* JADX INFO: loaded from: classes.dex */
public class C1385d implements AbstractC1449c.a {

    /* JADX INFO: renamed from: d */
    private static final String f4888d = AbstractC1097j.m4846f("WorkConstraintsTracker");

    /* JADX INFO: renamed from: a */
    private final InterfaceC1384c f4889a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1449c[] f4890b;

    /* JADX INFO: renamed from: c */
    private final Object f4891c;

    public C1385d(Context context, InterfaceC2010a interfaceC2010a, InterfaceC1384c interfaceC1384c) {
        Context applicationContext = context.getApplicationContext();
        this.f4889a = interfaceC1384c;
        this.f4890b = new AbstractC1449c[]{new C1447a(applicationContext, interfaceC2010a), new C1448b(applicationContext, interfaceC2010a), new C1454h(applicationContext, interfaceC2010a), new C1450d(applicationContext, interfaceC2010a), new C1453g(applicationContext, interfaceC2010a), new C1452f(applicationContext, interfaceC2010a), new C1451e(applicationContext, interfaceC2010a)};
        this.f4891c = new Object();
    }

    @Override // p147T0.AbstractC1449c.a
    /* JADX INFO: renamed from: a */
    public void mo5954a(List list) {
        synchronized (this.f4891c) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (m5956c(str)) {
                        AbstractC1097j.m4844c().mo4847a(f4888d, String.format("Constraints met for %s", str), new Throwable[0]);
                        arrayList.add(str);
                    }
                }
                InterfaceC1384c interfaceC1384c = this.f4889a;
                if (interfaceC1384c != null) {
                    interfaceC1384c.mo5495f(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p147T0.AbstractC1449c.a
    /* JADX INFO: renamed from: b */
    public void mo5955b(List list) {
        synchronized (this.f4891c) {
            try {
                InterfaceC1384c interfaceC1384c = this.f4889a;
                if (interfaceC1384c != null) {
                    interfaceC1384c.mo5494b(list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m5956c(String str) {
        synchronized (this.f4891c) {
            try {
                for (AbstractC1449c abstractC1449c : this.f4890b) {
                    if (abstractC1449c.m6094d(str)) {
                        AbstractC1097j.m4844c().mo4847a(f4888d, String.format("Work %s constrained by %s", str, abstractC1449c.getClass().getSimpleName()), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m5957d(Iterable iterable) {
        synchronized (this.f4891c) {
            try {
                for (AbstractC1449c abstractC1449c : this.f4890b) {
                    abstractC1449c.m6097g(null);
                }
                for (AbstractC1449c abstractC1449c2 : this.f4890b) {
                    abstractC1449c2.m6095e(iterable);
                }
                for (AbstractC1449c abstractC1449c3 : this.f4890b) {
                    abstractC1449c3.m6097g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m5958e() {
        synchronized (this.f4891c) {
            try {
                for (AbstractC1449c abstractC1449c : this.f4890b) {
                    abstractC1449c.m6096f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
