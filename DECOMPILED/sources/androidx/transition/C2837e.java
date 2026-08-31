package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC2574A;
import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import java.util.ArrayList;
import java.util.List;
import p081K.C0713e;

/* JADX INFO: renamed from: androidx.transition.e */
/* JADX INFO: loaded from: classes.dex */
public class C2837e extends AbstractC2574A {

    /* JADX INFO: renamed from: androidx.transition.e$a */
    class a extends AbstractC2843k.e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Rect f11479a;

        a(Rect rect) {
            this.f11479a = rect;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$b */
    class b implements AbstractC2843k.f {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f11481a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ArrayList f11482b;

        b(View view, ArrayList arrayList) {
            this.f11481a = view;
            this.f11482b = arrayList;
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: a */
        public void mo14096a(AbstractC2843k abstractC2843k) {
            abstractC2843k.mo14152T(this);
            abstractC2843k.mo14158a(this);
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: b */
        public void mo14097b(AbstractC2843k abstractC2843k) {
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: d */
        public void mo14098d(AbstractC2843k abstractC2843k) {
            abstractC2843k.mo14152T(this);
            this.f11481a.setVisibility(8);
            int size = this.f11482b.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((View) this.f11482b.get(i7)).setVisibility(0);
            }
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: e */
        public void mo14099e(AbstractC2843k abstractC2843k) {
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: g */
        public void mo14100g(AbstractC2843k abstractC2843k) {
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$c */
    class c extends AbstractC2849q {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f11484a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ArrayList f11485b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Object f11486c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ ArrayList f11487d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Object f11488e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ ArrayList f11489f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f11484a = obj;
            this.f11485b = arrayList;
            this.f11486c = obj2;
            this.f11487d = arrayList2;
            this.f11488e = obj3;
            this.f11489f = arrayList3;
        }

        @Override // androidx.transition.AbstractC2849q, androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: a */
        public void mo14096a(AbstractC2843k abstractC2843k) {
            Object obj = this.f11484a;
            if (obj != null) {
                C2837e.this.m14122x(obj, this.f11485b, null);
            }
            Object obj2 = this.f11486c;
            if (obj2 != null) {
                C2837e.this.m14122x(obj2, this.f11487d, null);
            }
            Object obj3 = this.f11488e;
            if (obj3 != null) {
                C2837e.this.m14122x(obj3, this.f11489f, null);
            }
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: d */
        public void mo14098d(AbstractC2843k abstractC2843k) {
            abstractC2843k.mo14152T(this);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$d */
    class d implements AbstractC2843k.f {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Runnable f11491a;

        d(Runnable runnable) {
            this.f11491a = runnable;
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: a */
        public void mo14096a(AbstractC2843k abstractC2843k) {
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: b */
        public void mo14097b(AbstractC2843k abstractC2843k) {
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: d */
        public void mo14098d(AbstractC2843k abstractC2843k) {
            this.f11491a.run();
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: e */
        public void mo14099e(AbstractC2843k abstractC2843k) {
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: g */
        public void mo14100g(AbstractC2843k abstractC2843k) {
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$e */
    class e extends AbstractC2843k.e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Rect f11493a;

        e(Rect rect) {
            this.f11493a = rect;
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m14120v(Runnable runnable, AbstractC2843k abstractC2843k, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            abstractC2843k.cancel();
            runnable2.run();
        }
    }

    /* JADX INFO: renamed from: w */
    private static boolean m14121w(AbstractC2843k abstractC2843k) {
        return (AbstractC2574A.m11936i(abstractC2843k.m14143B()) && AbstractC2574A.m11936i(abstractC2843k.m14144C()) && AbstractC2574A.m11936i(abstractC2843k.m14145D())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: a */
    public void mo11937a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC2843k) obj).mo14160b(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: b */
    public void mo11938b(Object obj, ArrayList arrayList) {
        AbstractC2843k abstractC2843k = (AbstractC2843k) obj;
        if (abstractC2843k == null) {
            return;
        }
        int i7 = 0;
        if (abstractC2843k instanceof C2852t) {
            C2852t c2852t = (C2852t) abstractC2843k;
            int iM14197l0 = c2852t.m14197l0();
            while (i7 < iM14197l0) {
                mo11938b(c2852t.m14196k0(i7), arrayList);
                i7++;
            }
            return;
        }
        if (m14121w(abstractC2843k) || !AbstractC2574A.m11936i(abstractC2843k.m14146E())) {
            return;
        }
        int size = arrayList.size();
        while (i7 < size) {
            abstractC2843k.mo14160b((View) arrayList.get(i7));
            i7++;
        }
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: c */
    public void mo11939c(ViewGroup viewGroup, Object obj) {
        AbstractC2850r.m14186a(viewGroup, (AbstractC2843k) obj);
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: e */
    public boolean mo11940e(Object obj) {
        return obj instanceof AbstractC2843k;
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: f */
    public Object mo11941f(Object obj) {
        if (obj != null) {
            return ((AbstractC2843k) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: j */
    public Object mo11943j(Object obj, Object obj2, Object obj3) {
        AbstractC2843k abstractC2843kM14202q0 = (AbstractC2843k) obj;
        AbstractC2843k abstractC2843k = (AbstractC2843k) obj2;
        AbstractC2843k abstractC2843k2 = (AbstractC2843k) obj3;
        if (abstractC2843kM14202q0 != null && abstractC2843k != null) {
            abstractC2843kM14202q0 = new C2852t().m14195i0(abstractC2843kM14202q0).m14195i0(abstractC2843k).m14202q0(1);
        } else if (abstractC2843kM14202q0 == null) {
            abstractC2843kM14202q0 = abstractC2843k != null ? abstractC2843k : null;
        }
        if (abstractC2843k2 == null) {
            return abstractC2843kM14202q0;
        }
        C2852t c2852t = new C2852t();
        if (abstractC2843kM14202q0 != null) {
            c2852t.m14195i0(abstractC2843kM14202q0);
        }
        c2852t.m14195i0(abstractC2843k2);
        return c2852t;
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: k */
    public Object mo11944k(Object obj, Object obj2, Object obj3) {
        C2852t c2852t = new C2852t();
        if (obj != null) {
            c2852t.m14195i0((AbstractC2843k) obj);
        }
        if (obj2 != null) {
            c2852t.m14195i0((AbstractC2843k) obj2);
        }
        if (obj3 != null) {
            c2852t.m14195i0((AbstractC2843k) obj3);
        }
        return c2852t;
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: m */
    public void mo11946m(Object obj, View view, ArrayList arrayList) {
        ((AbstractC2843k) obj).mo14158a(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: n */
    public void mo11947n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((AbstractC2843k) obj).mo14158a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: o */
    public void mo11948o(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC2843k) obj).mo14157Z(new e(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: p */
    public void mo11949p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m11942h(view, rect);
            ((AbstractC2843k) obj).mo14157Z(new a(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: q */
    public void mo11950q(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, Object obj, C0713e c0713e, Runnable runnable) {
        m14123y(abstractComponentCallbacksC2591i, obj, c0713e, null, runnable);
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: s */
    public void mo11952s(Object obj, View view, ArrayList arrayList) {
        C2852t c2852t = (C2852t) obj;
        List listM14146E = c2852t.m14146E();
        listM14146E.clear();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC2574A.m11934d(listM14146E, (View) arrayList.get(i7));
        }
        listM14146E.add(view);
        arrayList.add(view);
        mo11938b(c2852t, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: t */
    public void mo11953t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C2852t c2852t = (C2852t) obj;
        if (c2852t != null) {
            c2852t.m14146E().clear();
            c2852t.m14146E().addAll(arrayList2);
            m14122x(c2852t, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: u */
    public Object mo11954u(Object obj) {
        if (obj == null) {
            return null;
        }
        C2852t c2852t = new C2852t();
        c2852t.m14195i0((AbstractC2843k) obj);
        return c2852t;
    }

    /* JADX INFO: renamed from: x */
    public void m14122x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC2843k abstractC2843k = (AbstractC2843k) obj;
        int i7 = 0;
        if (abstractC2843k instanceof C2852t) {
            C2852t c2852t = (C2852t) abstractC2843k;
            int iM14197l0 = c2852t.m14197l0();
            while (i7 < iM14197l0) {
                m14122x(c2852t.m14196k0(i7), arrayList, arrayList2);
                i7++;
            }
            return;
        }
        if (m14121w(abstractC2843k)) {
            return;
        }
        List listM14146E = abstractC2843k.m14146E();
        if (listM14146E.size() == arrayList.size() && listM14146E.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i7 < size) {
                abstractC2843k.mo14160b((View) arrayList2.get(i7));
                i7++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC2843k.mo14153U((View) arrayList.get(size2));
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m14123y(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, Object obj, C0713e c0713e, final Runnable runnable, final Runnable runnable2) {
        final AbstractC2843k abstractC2843k = (AbstractC2843k) obj;
        c0713e.m3462c(new C0713e.a() { // from class: androidx.transition.d
            @Override // p081K.C0713e.a
            /* JADX INFO: renamed from: a */
            public final void mo3463a() {
                C2837e.m14120v(runnable, abstractC2843k, runnable2);
            }
        });
        abstractC2843k.mo14158a(new d(runnable2));
    }
}
