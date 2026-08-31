package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC2632Y;
import androidx.lifecycle.C2635a0;
import androidx.lifecycle.C2637b0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.fragment.app.t */
/* JADX INFO: loaded from: classes.dex */
final class C2602t extends AbstractC2632Y {

    /* JADX INFO: renamed from: i */
    private static final C2635a0.c f10306i = new a();

    /* JADX INFO: renamed from: e */
    private final boolean f10310e;

    /* JADX INFO: renamed from: b */
    private final HashMap f10307b = new HashMap();

    /* JADX INFO: renamed from: c */
    private final HashMap f10308c = new HashMap();

    /* JADX INFO: renamed from: d */
    private final HashMap f10309d = new HashMap();

    /* JADX INFO: renamed from: f */
    private boolean f10311f = false;

    /* JADX INFO: renamed from: g */
    private boolean f10312g = false;

    /* JADX INFO: renamed from: h */
    private boolean f10313h = false;

    /* JADX INFO: renamed from: androidx.fragment.app.t$a */
    class a implements C2635a0.c {
        a() {
        }

        @Override // androidx.lifecycle.C2635a0.c
        /* JADX INFO: renamed from: a */
        public AbstractC2632Y mo12451a(Class cls) {
            return new C2602t(true);
        }
    }

    C2602t(boolean z7) {
        this.f10310e = z7;
    }

    /* JADX INFO: renamed from: h */
    private void m12437h(String str) {
        C2602t c2602t = (C2602t) this.f10308c.get(str);
        if (c2602t != null) {
            c2602t.mo12439d();
            this.f10308c.remove(str);
        }
        C2637b0 c2637b0 = (C2637b0) this.f10309d.get(str);
        if (c2637b0 != null) {
            c2637b0.m12604a();
            this.f10309d.remove(str);
        }
    }

    /* JADX INFO: renamed from: k */
    static C2602t m12438k(C2637b0 c2637b0) {
        return (C2602t) new C2635a0(c2637b0, f10306i).m12591a(C2602t.class);
    }

    @Override // androidx.lifecycle.AbstractC2632Y
    /* JADX INFO: renamed from: d */
    protected void mo12439d() {
        if (AbstractC2599q.m12289I0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f10311f = true;
    }

    /* JADX INFO: renamed from: e */
    void m12440e(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        if (this.f10313h) {
            if (AbstractC2599q.m12289I0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f10307b.containsKey(abstractComponentCallbacksC2591i.f10155f)) {
                return;
            }
            this.f10307b.put(abstractComponentCallbacksC2591i.f10155f, abstractComponentCallbacksC2591i);
            if (AbstractC2599q.m12289I0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + abstractComponentCallbacksC2591i);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2602t.class == obj.getClass()) {
            C2602t c2602t = (C2602t) obj;
            if (this.f10307b.equals(c2602t.f10307b) && this.f10308c.equals(c2602t.f10308c) && this.f10309d.equals(c2602t.f10309d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    void m12441f(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        if (AbstractC2599q.m12289I0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC2591i);
        }
        m12437h(abstractComponentCallbacksC2591i.f10155f);
    }

    /* JADX INFO: renamed from: g */
    void m12442g(String str) {
        if (AbstractC2599q.m12289I0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        m12437h(str);
    }

    public int hashCode() {
        return (((this.f10307b.hashCode() * 31) + this.f10308c.hashCode()) * 31) + this.f10309d.hashCode();
    }

    /* JADX INFO: renamed from: i */
    AbstractComponentCallbacksC2591i m12443i(String str) {
        return (AbstractComponentCallbacksC2591i) this.f10307b.get(str);
    }

    /* JADX INFO: renamed from: j */
    C2602t m12444j(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        C2602t c2602t = (C2602t) this.f10308c.get(abstractComponentCallbacksC2591i.f10155f);
        if (c2602t != null) {
            return c2602t;
        }
        C2602t c2602t2 = new C2602t(this.f10310e);
        this.f10308c.put(abstractComponentCallbacksC2591i.f10155f, c2602t2);
        return c2602t2;
    }

    /* JADX INFO: renamed from: l */
    Collection m12445l() {
        return new ArrayList(this.f10307b.values());
    }

    /* JADX INFO: renamed from: m */
    C2637b0 m12446m(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        C2637b0 c2637b0 = (C2637b0) this.f10309d.get(abstractComponentCallbacksC2591i.f10155f);
        if (c2637b0 != null) {
            return c2637b0;
        }
        C2637b0 c2637b1 = new C2637b0();
        this.f10309d.put(abstractComponentCallbacksC2591i.f10155f, c2637b1);
        return c2637b1;
    }

    /* JADX INFO: renamed from: n */
    boolean m12447n() {
        return this.f10311f;
    }

    /* JADX INFO: renamed from: o */
    void m12448o(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        if (this.f10313h) {
            if (AbstractC2599q.m12289I0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f10307b.remove(abstractComponentCallbacksC2591i.f10155f) == null || !AbstractC2599q.m12289I0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC2591i);
        }
    }

    /* JADX INFO: renamed from: p */
    void m12449p(boolean z7) {
        this.f10313h = z7;
    }

    /* JADX INFO: renamed from: q */
    boolean m12450q(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        if (this.f10307b.containsKey(abstractComponentCallbacksC2591i.f10155f)) {
            return this.f10310e ? this.f10311f : !this.f10312g;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f10307b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f10308c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f10309d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
