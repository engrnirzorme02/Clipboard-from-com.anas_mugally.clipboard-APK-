package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.p */
/* JADX INFO: loaded from: classes.dex */
class C2598p {

    /* JADX INFO: renamed from: a */
    private final CopyOnWriteArrayList f10233a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b */
    private final AbstractC2599q f10234b;

    /* JADX INFO: renamed from: androidx.fragment.app.p$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        final AbstractC2599q.k f10235a;

        /* JADX INFO: renamed from: b */
        final boolean f10236b;

        a(AbstractC2599q.k kVar, boolean z7) {
            this.f10235a = kVar;
            this.f10236b = z7;
        }
    }

    C2598p(AbstractC2599q abstractC2599q) {
        this.f10234b = abstractC2599q;
    }

    /* JADX INFO: renamed from: a */
    void m12272a(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, Bundle bundle, boolean z7) {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12409y0 = this.f10234b.m12409y0();
        if (abstractComponentCallbacksC2591iM12409y0 != null) {
            abstractComponentCallbacksC2591iM12409y0.m12132K().m12407x0().m12272a(abstractComponentCallbacksC2591i, bundle, true);
        }
        for (a aVar : this.f10233a) {
            if (!z7 || aVar.f10236b) {
                aVar.f10235a.m12420a(this.f10234b, abstractComponentCallbacksC2591i, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    void m12273b(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, boolean z7) {
        Context contextM12269j = this.f10234b.m12403v0().m12269j();
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12409y0 = this.f10234b.m12409y0();
        if (abstractComponentCallbacksC2591iM12409y0 != null) {
            abstractComponentCallbacksC2591iM12409y0.m12132K().m12407x0().m12273b(abstractComponentCallbacksC2591i, true);
        }
        for (a aVar : this.f10233a) {
            if (!z7 || aVar.f10236b) {
                aVar.f10235a.m12421b(this.f10234b, abstractComponentCallbacksC2591i, contextM12269j);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    void m12274c(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, Bundle bundle, boolean z7) {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12409y0 = this.f10234b.m12409y0();
        if (abstractComponentCallbacksC2591iM12409y0 != null) {
            abstractComponentCallbacksC2591iM12409y0.m12132K().m12407x0().m12274c(abstractComponentCallbacksC2591i, bundle, true);
        }
        for (a aVar : this.f10233a) {
            if (!z7 || aVar.f10236b) {
                aVar.f10235a.m12422c(this.f10234b, abstractComponentCallbacksC2591i, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    void m12275d(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, boolean z7) {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12409y0 = this.f10234b.m12409y0();
        if (abstractComponentCallbacksC2591iM12409y0 != null) {
            abstractComponentCallbacksC2591iM12409y0.m12132K().m12407x0().m12275d(abstractComponentCallbacksC2591i, true);
        }
        for (a aVar : this.f10233a) {
            if (!z7 || aVar.f10236b) {
                aVar.f10235a.m12423d(this.f10234b, abstractComponentCallbacksC2591i);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    void m12276e(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, boolean z7) {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12409y0 = this.f10234b.m12409y0();
        if (abstractComponentCallbacksC2591iM12409y0 != null) {
            abstractComponentCallbacksC2591iM12409y0.m12132K().m12407x0().m12276e(abstractComponentCallbacksC2591i, true);
        }
        for (a aVar : this.f10233a) {
            if (!z7 || aVar.f10236b) {
                aVar.f10235a.m12424e(this.f10234b, abstractComponentCallbacksC2591i);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    void m12277f(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, boolean z7) {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12409y0 = this.f10234b.m12409y0();
        if (abstractComponentCallbacksC2591iM12409y0 != null) {
            abstractComponentCallbacksC2591iM12409y0.m12132K().m12407x0().m12277f(abstractComponentCallbacksC2591i, true);
        }
        for (a aVar : this.f10233a) {
            if (!z7 || aVar.f10236b) {
                aVar.f10235a.m12425f(this.f10234b, abstractComponentCallbacksC2591i);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    void m12278g(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, boolean z7) {
        Context contextM12269j = this.f10234b.m12403v0().m12269j();
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12409y0 = this.f10234b.m12409y0();
        if (abstractComponentCallbacksC2591iM12409y0 != null) {
            abstractComponentCallbacksC2591iM12409y0.m12132K().m12407x0().m12278g(abstractComponentCallbacksC2591i, true);
        }
        for (a aVar : this.f10233a) {
            if (!z7 || aVar.f10236b) {
                aVar.f10235a.m12426g(this.f10234b, abstractComponentCallbacksC2591i, contextM12269j);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    void m12279h(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, Bundle bundle, boolean z7) {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12409y0 = this.f10234b.m12409y0();
        if (abstractComponentCallbacksC2591iM12409y0 != null) {
            abstractComponentCallbacksC2591iM12409y0.m12132K().m12407x0().m12279h(abstractComponentCallbacksC2591i, bundle, true);
        }
        for (a aVar : this.f10233a) {
            if (!z7 || aVar.f10236b) {
                aVar.f10235a.m12427h(this.f10234b, abstractComponentCallbacksC2591i, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    void m12280i(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, boolean z7) {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12409y0 = this.f10234b.m12409y0();
        if (abstractComponentCallbacksC2591iM12409y0 != null) {
            abstractComponentCallbacksC2591iM12409y0.m12132K().m12407x0().m12280i(abstractComponentCallbacksC2591i, true);
        }
        for (a aVar : this.f10233a) {
            if (!z7 || aVar.f10236b) {
                aVar.f10235a.m12428i(this.f10234b, abstractComponentCallbacksC2591i);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    void m12281j(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, Bundle bundle, boolean z7) {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12409y0 = this.f10234b.m12409y0();
        if (abstractComponentCallbacksC2591iM12409y0 != null) {
            abstractComponentCallbacksC2591iM12409y0.m12132K().m12407x0().m12281j(abstractComponentCallbacksC2591i, bundle, true);
        }
        for (a aVar : this.f10233a) {
            if (!z7 || aVar.f10236b) {
                aVar.f10235a.m12429j(this.f10234b, abstractComponentCallbacksC2591i, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    void m12282k(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, boolean z7) {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12409y0 = this.f10234b.m12409y0();
        if (abstractComponentCallbacksC2591iM12409y0 != null) {
            abstractComponentCallbacksC2591iM12409y0.m12132K().m12407x0().m12282k(abstractComponentCallbacksC2591i, true);
        }
        for (a aVar : this.f10233a) {
            if (!z7 || aVar.f10236b) {
                aVar.f10235a.m12430k(this.f10234b, abstractComponentCallbacksC2591i);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    void m12283l(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, boolean z7) {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12409y0 = this.f10234b.m12409y0();
        if (abstractComponentCallbacksC2591iM12409y0 != null) {
            abstractComponentCallbacksC2591iM12409y0.m12132K().m12407x0().m12283l(abstractComponentCallbacksC2591i, true);
        }
        for (a aVar : this.f10233a) {
            if (!z7 || aVar.f10236b) {
                aVar.f10235a.m12431l(this.f10234b, abstractComponentCallbacksC2591i);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    void m12284m(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, View view, Bundle bundle, boolean z7) {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12409y0 = this.f10234b.m12409y0();
        if (abstractComponentCallbacksC2591iM12409y0 != null) {
            abstractComponentCallbacksC2591iM12409y0.m12132K().m12407x0().m12284m(abstractComponentCallbacksC2591i, view, bundle, true);
        }
        for (a aVar : this.f10233a) {
            if (!z7 || aVar.f10236b) {
                aVar.f10235a.mo3688m(this.f10234b, abstractComponentCallbacksC2591i, view, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    void m12285n(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, boolean z7) {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12409y0 = this.f10234b.m12409y0();
        if (abstractComponentCallbacksC2591iM12409y0 != null) {
            abstractComponentCallbacksC2591iM12409y0.m12132K().m12407x0().m12285n(abstractComponentCallbacksC2591i, true);
        }
        for (a aVar : this.f10233a) {
            if (!z7 || aVar.f10236b) {
                aVar.f10235a.m12432n(this.f10234b, abstractComponentCallbacksC2591i);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void m12286o(AbstractC2599q.k kVar, boolean z7) {
        this.f10233a.add(new a(kVar, z7));
    }

    /* JADX INFO: renamed from: p */
    public void m12287p(AbstractC2599q.k kVar) {
        synchronized (this.f10233a) {
            try {
                int size = this.f10233a.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (((a) this.f10233a.get(i7)).f10235a == kVar) {
                        this.f10233a.remove(i7);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
