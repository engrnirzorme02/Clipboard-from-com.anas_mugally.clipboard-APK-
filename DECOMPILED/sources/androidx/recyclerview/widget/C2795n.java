package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
import p111O.AbstractC1030Z;
import p111O.C1032a;
import p118P.C1170s;
import p118P.C1171t;

/* JADX INFO: renamed from: androidx.recyclerview.widget.n */
/* JADX INFO: loaded from: classes.dex */
public class C2795n extends C1032a {

    /* JADX INFO: renamed from: d */
    final RecyclerView f11239d;

    /* JADX INFO: renamed from: e */
    private final a f11240e;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.n$a */
    public static class a extends C1032a {

        /* JADX INFO: renamed from: d */
        final C2795n f11241d;

        /* JADX INFO: renamed from: e */
        private Map f11242e = new WeakHashMap();

        public a(C2795n c2795n) {
            this.f11241d = c2795n;
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: a */
        public boolean mo4581a(View view, AccessibilityEvent accessibilityEvent) {
            C1032a c1032a = (C1032a) this.f11242e.get(view);
            return c1032a != null ? c1032a.mo4581a(view, accessibilityEvent) : super.mo4581a(view, accessibilityEvent);
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: b */
        public C1171t mo4582b(View view) {
            C1032a c1032a = (C1032a) this.f11242e.get(view);
            return c1032a != null ? c1032a.mo4582b(view) : super.mo4582b(view);
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: f */
        public void mo4584f(View view, AccessibilityEvent accessibilityEvent) {
            C1032a c1032a = (C1032a) this.f11242e.get(view);
            if (c1032a != null) {
                c1032a.mo4584f(view, accessibilityEvent);
            } else {
                super.mo4584f(view, accessibilityEvent);
            }
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: g */
        public void mo4585g(View view, C1170s c1170s) {
            if (this.f11241d.m13872o() || this.f11241d.f11239d.getLayoutManager() == null) {
                super.mo4585g(view, c1170s);
                return;
            }
            this.f11241d.f11239d.getLayoutManager().m13413T0(view, c1170s);
            C1032a c1032a = (C1032a) this.f11242e.get(view);
            if (c1032a != null) {
                c1032a.mo4585g(view, c1170s);
            } else {
                super.mo4585g(view, c1170s);
            }
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: h */
        public void mo4586h(View view, AccessibilityEvent accessibilityEvent) {
            C1032a c1032a = (C1032a) this.f11242e.get(view);
            if (c1032a != null) {
                c1032a.mo4586h(view, accessibilityEvent);
            } else {
                super.mo4586h(view, accessibilityEvent);
            }
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: i */
        public boolean mo4587i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C1032a c1032a = (C1032a) this.f11242e.get(viewGroup);
            return c1032a != null ? c1032a.mo4587i(viewGroup, view, accessibilityEvent) : super.mo4587i(viewGroup, view, accessibilityEvent);
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: j */
        public boolean mo4588j(View view, int i7, Bundle bundle) {
            if (this.f11241d.m13872o() || this.f11241d.f11239d.getLayoutManager() == null) {
                return super.mo4588j(view, i7, bundle);
            }
            C1032a c1032a = (C1032a) this.f11242e.get(view);
            if (c1032a != null) {
                if (c1032a.mo4588j(view, i7, bundle)) {
                    return true;
                }
            } else if (super.mo4588j(view, i7, bundle)) {
                return true;
            }
            return this.f11241d.f11239d.getLayoutManager().m13448n1(view, i7, bundle);
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: l */
        public void mo4589l(View view, int i7) {
            C1032a c1032a = (C1032a) this.f11242e.get(view);
            if (c1032a != null) {
                c1032a.mo4589l(view, i7);
            } else {
                super.mo4589l(view, i7);
            }
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: m */
        public void mo4590m(View view, AccessibilityEvent accessibilityEvent) {
            C1032a c1032a = (C1032a) this.f11242e.get(view);
            if (c1032a != null) {
                c1032a.mo4590m(view, accessibilityEvent);
            } else {
                super.mo4590m(view, accessibilityEvent);
            }
        }

        /* JADX INFO: renamed from: n */
        C1032a m13873n(View view) {
            return (C1032a) this.f11242e.remove(view);
        }

        /* JADX INFO: renamed from: o */
        void m13874o(View view) {
            C1032a c1032aM4477l = AbstractC1030Z.m4477l(view);
            if (c1032aM4477l == null || c1032aM4477l == this) {
                return;
            }
            this.f11242e.put(view, c1032aM4477l);
        }
    }

    public C2795n(RecyclerView recyclerView) {
        this.f11239d = recyclerView;
        C1032a c1032aM13871n = m13871n();
        if (c1032aM13871n == null || !(c1032aM13871n instanceof a)) {
            this.f11240e = new a(this);
        } else {
            this.f11240e = (a) c1032aM13871n;
        }
    }

    @Override // p111O.C1032a
    /* JADX INFO: renamed from: f */
    public void mo4584f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo4584f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || m13872o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo13042P0(accessibilityEvent);
        }
    }

    @Override // p111O.C1032a
    /* JADX INFO: renamed from: g */
    public void mo4585g(View view, C1170s c1170s) {
        super.mo4585g(view, c1170s);
        if (m13872o() || this.f11239d.getLayoutManager() == null) {
            return;
        }
        this.f11239d.getLayoutManager().m13410R0(c1170s);
    }

    @Override // p111O.C1032a
    /* JADX INFO: renamed from: j */
    public boolean mo4588j(View view, int i7, Bundle bundle) {
        if (super.mo4588j(view, i7, bundle)) {
            return true;
        }
        if (m13872o() || this.f11239d.getLayoutManager() == null) {
            return false;
        }
        return this.f11239d.getLayoutManager().m13444l1(i7, bundle);
    }

    /* JADX INFO: renamed from: n */
    public C1032a m13871n() {
        return this.f11240e;
    }

    /* JADX INFO: renamed from: o */
    boolean m13872o() {
        return this.f11239d.m13186n0();
    }
}
