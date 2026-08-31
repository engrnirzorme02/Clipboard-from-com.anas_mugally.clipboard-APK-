package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p111O.AbstractC1030Z;

/* JADX INFO: renamed from: androidx.recyclerview.widget.c */
/* JADX INFO: loaded from: classes.dex */
public class C2784c extends AbstractC2797p {

    /* JADX INFO: renamed from: s */
    private static TimeInterpolator f11054s;

    /* JADX INFO: renamed from: h */
    private ArrayList f11055h = new ArrayList();

    /* JADX INFO: renamed from: i */
    private ArrayList f11056i = new ArrayList();

    /* JADX INFO: renamed from: j */
    private ArrayList f11057j = new ArrayList();

    /* JADX INFO: renamed from: k */
    private ArrayList f11058k = new ArrayList();

    /* JADX INFO: renamed from: l */
    ArrayList f11059l = new ArrayList();

    /* JADX INFO: renamed from: m */
    ArrayList f11060m = new ArrayList();

    /* JADX INFO: renamed from: n */
    ArrayList f11061n = new ArrayList();

    /* JADX INFO: renamed from: o */
    ArrayList f11062o = new ArrayList();

    /* JADX INFO: renamed from: p */
    ArrayList f11063p = new ArrayList();

    /* JADX INFO: renamed from: q */
    ArrayList f11064q = new ArrayList();

    /* JADX INFO: renamed from: r */
    ArrayList f11065r = new ArrayList();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ArrayList f11066a;

        a(ArrayList arrayList) {
            this.f11066a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (j jVar : this.f11066a) {
                C2784c.this.m13714T(jVar.f11100a, jVar.f11101b, jVar.f11102c, jVar.f11103d, jVar.f11104e);
            }
            this.f11066a.clear();
            C2784c.this.f11060m.remove(this.f11066a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ArrayList f11068a;

        b(ArrayList arrayList) {
            this.f11068a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f11068a.iterator();
            while (it.hasNext()) {
                C2784c.this.m13713S((i) it.next());
            }
            this.f11068a.clear();
            C2784c.this.f11061n.remove(this.f11068a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ArrayList f11070a;

        c(ArrayList arrayList) {
            this.f11070a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f11070a.iterator();
            while (it.hasNext()) {
                C2784c.this.m13712R((RecyclerView.AbstractC2749E) it.next());
            }
            this.f11070a.clear();
            C2784c.this.f11059l.remove(this.f11070a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$d */
    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC2749E f11072a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f11073b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ View f11074c;

        d(RecyclerView.AbstractC2749E abstractC2749E, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f11072a = abstractC2749E;
            this.f11073b = viewPropertyAnimator;
            this.f11074c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f11073b.setListener(null);
            this.f11074c.setAlpha(1.0f);
            C2784c.this.m13884H(this.f11072a);
            C2784c.this.f11064q.remove(this.f11072a);
            C2784c.this.m13716W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C2784c.this.m13885I(this.f11072a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$e */
    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC2749E f11076a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f11077b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f11078c;

        e(RecyclerView.AbstractC2749E abstractC2749E, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f11076a = abstractC2749E;
            this.f11077b = view;
            this.f11078c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f11077b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f11078c.setListener(null);
            C2784c.this.m13878B(this.f11076a);
            C2784c.this.f11062o.remove(this.f11076a);
            C2784c.this.m13716W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C2784c.this.m13879C(this.f11076a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$f */
    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC2749E f11080a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f11081b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ View f11082c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f11083d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f11084e;

        f(RecyclerView.AbstractC2749E abstractC2749E, int i7, View view, int i8, ViewPropertyAnimator viewPropertyAnimator) {
            this.f11080a = abstractC2749E;
            this.f11081b = i7;
            this.f11082c = view;
            this.f11083d = i8;
            this.f11084e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f11081b != 0) {
                this.f11082c.setTranslationX(0.0f);
            }
            if (this.f11083d != 0) {
                this.f11082c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f11084e.setListener(null);
            C2784c.this.m13882F(this.f11080a);
            C2784c.this.f11063p.remove(this.f11080a);
            C2784c.this.m13716W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C2784c.this.m13883G(this.f11080a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$g */
    class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ i f11086a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f11087b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ View f11088c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f11086a = iVar;
            this.f11087b = viewPropertyAnimator;
            this.f11088c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f11087b.setListener(null);
            this.f11088c.setAlpha(1.0f);
            this.f11088c.setTranslationX(0.0f);
            this.f11088c.setTranslationY(0.0f);
            C2784c.this.m13880D(this.f11086a.f11094a, true);
            C2784c.this.f11065r.remove(this.f11086a.f11094a);
            C2784c.this.m13716W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C2784c.this.m13881E(this.f11086a.f11094a, true);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$h */
    class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ i f11090a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f11091b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ View f11092c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f11090a = iVar;
            this.f11091b = viewPropertyAnimator;
            this.f11092c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f11091b.setListener(null);
            this.f11092c.setAlpha(1.0f);
            this.f11092c.setTranslationX(0.0f);
            this.f11092c.setTranslationY(0.0f);
            C2784c.this.m13880D(this.f11090a.f11095b, false);
            C2784c.this.f11065r.remove(this.f11090a.f11095b);
            C2784c.this.m13716W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C2784c.this.m13881E(this.f11090a.f11095b, false);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$j */
    private static class j {

        /* JADX INFO: renamed from: a */
        public RecyclerView.AbstractC2749E f11100a;

        /* JADX INFO: renamed from: b */
        public int f11101b;

        /* JADX INFO: renamed from: c */
        public int f11102c;

        /* JADX INFO: renamed from: d */
        public int f11103d;

        /* JADX INFO: renamed from: e */
        public int f11104e;

        j(RecyclerView.AbstractC2749E abstractC2749E, int i7, int i8, int i9, int i10) {
            this.f11100a = abstractC2749E;
            this.f11101b = i7;
            this.f11102c = i8;
            this.f11103d = i9;
            this.f11104e = i10;
        }
    }

    /* JADX INFO: renamed from: U */
    private void m13706U(RecyclerView.AbstractC2749E abstractC2749E) {
        View view = abstractC2749E.f10894a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f11064q.add(abstractC2749E);
        viewPropertyAnimatorAnimate.setDuration(m13351o()).alpha(0.0f).setListener(new d(abstractC2749E, viewPropertyAnimatorAnimate, view)).start();
    }

    /* JADX INFO: renamed from: X */
    private void m13707X(List list, RecyclerView.AbstractC2749E abstractC2749E) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (m13709Z(iVar, abstractC2749E) && iVar.f11094a == null && iVar.f11095b == null) {
                list.remove(iVar);
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    private void m13708Y(i iVar) {
        RecyclerView.AbstractC2749E abstractC2749E = iVar.f11094a;
        if (abstractC2749E != null) {
            m13709Z(iVar, abstractC2749E);
        }
        RecyclerView.AbstractC2749E abstractC2749E2 = iVar.f11095b;
        if (abstractC2749E2 != null) {
            m13709Z(iVar, abstractC2749E2);
        }
    }

    /* JADX INFO: renamed from: Z */
    private boolean m13709Z(i iVar, RecyclerView.AbstractC2749E abstractC2749E) {
        boolean z7 = false;
        if (iVar.f11095b == abstractC2749E) {
            iVar.f11095b = null;
        } else {
            if (iVar.f11094a != abstractC2749E) {
                return false;
            }
            iVar.f11094a = null;
            z7 = true;
        }
        abstractC2749E.f10894a.setAlpha(1.0f);
        abstractC2749E.f10894a.setTranslationX(0.0f);
        abstractC2749E.f10894a.setTranslationY(0.0f);
        m13880D(abstractC2749E, z7);
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    private void m13710a0(RecyclerView.AbstractC2749E abstractC2749E) {
        if (f11054s == null) {
            f11054s = new ValueAnimator().getInterpolator();
        }
        abstractC2749E.f10894a.animate().setInterpolator(f11054s);
        mo13346j(abstractC2749E);
    }

    @Override // androidx.recyclerview.widget.AbstractC2797p
    /* JADX INFO: renamed from: A */
    public boolean mo13711A(RecyclerView.AbstractC2749E abstractC2749E) {
        m13710a0(abstractC2749E);
        this.f11055h.add(abstractC2749E);
        return true;
    }

    /* JADX INFO: renamed from: R */
    void m13712R(RecyclerView.AbstractC2749E abstractC2749E) {
        View view = abstractC2749E.f10894a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f11062o.add(abstractC2749E);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(m13348l()).setListener(new e(abstractC2749E, view, viewPropertyAnimatorAnimate)).start();
    }

    /* JADX INFO: renamed from: S */
    void m13713S(i iVar) {
        RecyclerView.AbstractC2749E abstractC2749E = iVar.f11094a;
        View view = abstractC2749E == null ? null : abstractC2749E.f10894a;
        RecyclerView.AbstractC2749E abstractC2749E2 = iVar.f11095b;
        View view2 = abstractC2749E2 != null ? abstractC2749E2.f10894a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m13349m());
            this.f11065r.add(iVar.f11094a);
            duration.translationX(iVar.f11098e - iVar.f11096c);
            duration.translationY(iVar.f11099f - iVar.f11097d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f11065r.add(iVar.f11095b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m13349m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    /* JADX INFO: renamed from: T */
    void m13714T(RecyclerView.AbstractC2749E abstractC2749E, int i7, int i8, int i9, int i10) {
        View view = abstractC2749E.f10894a;
        int i11 = i9 - i7;
        int i12 = i10 - i8;
        if (i11 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i12 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f11063p.add(abstractC2749E);
        viewPropertyAnimatorAnimate.setDuration(m13350n()).setListener(new f(abstractC2749E, i11, view, i12, viewPropertyAnimatorAnimate)).start();
    }

    /* JADX INFO: renamed from: V */
    void m13715V(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.AbstractC2749E) list.get(size)).f10894a.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: W */
    void m13716W() {
        if (mo13352p()) {
            return;
        }
        m13345i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2762m
    /* JADX INFO: renamed from: g */
    public boolean mo13343g(RecyclerView.AbstractC2749E abstractC2749E, List list) {
        return !list.isEmpty() || super.mo13343g(abstractC2749E, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2762m
    /* JADX INFO: renamed from: j */
    public void mo13346j(RecyclerView.AbstractC2749E abstractC2749E) {
        View view = abstractC2749E.f10894a;
        view.animate().cancel();
        int size = this.f11057j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) this.f11057j.get(size)).f11100a == abstractC2749E) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m13882F(abstractC2749E);
                this.f11057j.remove(size);
            }
        }
        m13707X(this.f11058k, abstractC2749E);
        if (this.f11055h.remove(abstractC2749E)) {
            view.setAlpha(1.0f);
            m13884H(abstractC2749E);
        }
        if (this.f11056i.remove(abstractC2749E)) {
            view.setAlpha(1.0f);
            m13878B(abstractC2749E);
        }
        for (int size2 = this.f11061n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f11061n.get(size2);
            m13707X(arrayList, abstractC2749E);
            if (arrayList.isEmpty()) {
                this.f11061n.remove(size2);
            }
        }
        for (int size3 = this.f11060m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f11060m.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (((j) arrayList2.get(size4)).f11100a == abstractC2749E) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m13882F(abstractC2749E);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.f11060m.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.f11059l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f11059l.get(size5);
            if (arrayList3.remove(abstractC2749E)) {
                view.setAlpha(1.0f);
                m13878B(abstractC2749E);
                if (arrayList3.isEmpty()) {
                    this.f11059l.remove(size5);
                }
            }
        }
        this.f11064q.remove(abstractC2749E);
        this.f11062o.remove(abstractC2749E);
        this.f11065r.remove(abstractC2749E);
        this.f11063p.remove(abstractC2749E);
        m13716W();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2762m
    /* JADX INFO: renamed from: k */
    public void mo13347k() {
        int size = this.f11057j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f11057j.get(size);
            View view = jVar.f11100a.f10894a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m13882F(jVar.f11100a);
            this.f11057j.remove(size);
        }
        for (int size2 = this.f11055h.size() - 1; size2 >= 0; size2--) {
            m13884H((RecyclerView.AbstractC2749E) this.f11055h.get(size2));
            this.f11055h.remove(size2);
        }
        int size3 = this.f11056i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC2749E abstractC2749E = (RecyclerView.AbstractC2749E) this.f11056i.get(size3);
            abstractC2749E.f10894a.setAlpha(1.0f);
            m13878B(abstractC2749E);
            this.f11056i.remove(size3);
        }
        for (int size4 = this.f11058k.size() - 1; size4 >= 0; size4--) {
            m13708Y((i) this.f11058k.get(size4));
        }
        this.f11058k.clear();
        if (mo13352p()) {
            for (int size5 = this.f11060m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f11060m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f11100a.f10894a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m13882F(jVar2.f11100a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f11060m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f11059l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f11059l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.AbstractC2749E abstractC2749E2 = (RecyclerView.AbstractC2749E) arrayList2.get(size8);
                    abstractC2749E2.f10894a.setAlpha(1.0f);
                    m13878B(abstractC2749E2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f11059l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f11061n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f11061n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m13708Y((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f11061n.remove(arrayList3);
                    }
                }
            }
            m13715V(this.f11064q);
            m13715V(this.f11063p);
            m13715V(this.f11062o);
            m13715V(this.f11065r);
            m13345i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2762m
    /* JADX INFO: renamed from: p */
    public boolean mo13352p() {
        return (this.f11056i.isEmpty() && this.f11058k.isEmpty() && this.f11057j.isEmpty() && this.f11055h.isEmpty() && this.f11063p.isEmpty() && this.f11064q.isEmpty() && this.f11062o.isEmpty() && this.f11065r.isEmpty() && this.f11060m.isEmpty() && this.f11059l.isEmpty() && this.f11061n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2762m
    /* JADX INFO: renamed from: v */
    public void mo13358v() {
        boolean zIsEmpty = this.f11055h.isEmpty();
        boolean zIsEmpty2 = this.f11057j.isEmpty();
        boolean zIsEmpty3 = this.f11058k.isEmpty();
        boolean zIsEmpty4 = this.f11056i.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator it = this.f11055h.iterator();
        while (it.hasNext()) {
            m13706U((RecyclerView.AbstractC2749E) it.next());
        }
        this.f11055h.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f11057j);
            this.f11060m.add(arrayList);
            this.f11057j.clear();
            a aVar = new a(arrayList);
            if (zIsEmpty) {
                aVar.run();
            } else {
                AbstractC1030Z.m4460c0(((j) arrayList.get(0)).f11100a.f10894a, aVar, m13351o());
            }
        }
        if (!zIsEmpty3) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f11058k);
            this.f11061n.add(arrayList2);
            this.f11058k.clear();
            b bVar = new b(arrayList2);
            if (zIsEmpty) {
                bVar.run();
            } else {
                AbstractC1030Z.m4460c0(((i) arrayList2.get(0)).f11094a.f10894a, bVar, m13351o());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(this.f11056i);
        this.f11059l.add(arrayList3);
        this.f11056i.clear();
        c cVar = new c(arrayList3);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            cVar.run();
        } else {
            AbstractC1030Z.m4460c0(((RecyclerView.AbstractC2749E) arrayList3.get(0)).f10894a, cVar, (!zIsEmpty ? m13351o() : 0L) + Math.max(!zIsEmpty2 ? m13350n() : 0L, zIsEmpty3 ? 0L : m13349m()));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2797p
    /* JADX INFO: renamed from: x */
    public boolean mo13717x(RecyclerView.AbstractC2749E abstractC2749E) {
        m13710a0(abstractC2749E);
        abstractC2749E.f10894a.setAlpha(0.0f);
        this.f11056i.add(abstractC2749E);
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC2797p
    /* JADX INFO: renamed from: y */
    public boolean mo13718y(RecyclerView.AbstractC2749E abstractC2749E, RecyclerView.AbstractC2749E abstractC2749E2, int i7, int i8, int i9, int i10) {
        if (abstractC2749E == abstractC2749E2) {
            return mo13719z(abstractC2749E, i7, i8, i9, i10);
        }
        float translationX = abstractC2749E.f10894a.getTranslationX();
        float translationY = abstractC2749E.f10894a.getTranslationY();
        float alpha = abstractC2749E.f10894a.getAlpha();
        m13710a0(abstractC2749E);
        int i11 = (int) ((i9 - i7) - translationX);
        int i12 = (int) ((i10 - i8) - translationY);
        abstractC2749E.f10894a.setTranslationX(translationX);
        abstractC2749E.f10894a.setTranslationY(translationY);
        abstractC2749E.f10894a.setAlpha(alpha);
        if (abstractC2749E2 != null) {
            m13710a0(abstractC2749E2);
            abstractC2749E2.f10894a.setTranslationX(-i11);
            abstractC2749E2.f10894a.setTranslationY(-i12);
            abstractC2749E2.f10894a.setAlpha(0.0f);
        }
        this.f11058k.add(new i(abstractC2749E, abstractC2749E2, i7, i8, i9, i10));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC2797p
    /* JADX INFO: renamed from: z */
    public boolean mo13719z(RecyclerView.AbstractC2749E abstractC2749E, int i7, int i8, int i9, int i10) {
        View view = abstractC2749E.f10894a;
        int translationX = i7 + ((int) view.getTranslationX());
        int translationY = i8 + ((int) abstractC2749E.f10894a.getTranslationY());
        m13710a0(abstractC2749E);
        int i11 = i9 - translationX;
        int i12 = i10 - translationY;
        if (i11 == 0 && i12 == 0) {
            m13882F(abstractC2749E);
            return false;
        }
        if (i11 != 0) {
            view.setTranslationX(-i11);
        }
        if (i12 != 0) {
            view.setTranslationY(-i12);
        }
        this.f11057j.add(new j(abstractC2749E, translationX, translationY, i9, i10));
        return true;
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$i */
    private static class i {

        /* JADX INFO: renamed from: a */
        public RecyclerView.AbstractC2749E f11094a;

        /* JADX INFO: renamed from: b */
        public RecyclerView.AbstractC2749E f11095b;

        /* JADX INFO: renamed from: c */
        public int f11096c;

        /* JADX INFO: renamed from: d */
        public int f11097d;

        /* JADX INFO: renamed from: e */
        public int f11098e;

        /* JADX INFO: renamed from: f */
        public int f11099f;

        private i(RecyclerView.AbstractC2749E abstractC2749E, RecyclerView.AbstractC2749E abstractC2749E2) {
            this.f11094a = abstractC2749E;
            this.f11095b = abstractC2749E2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f11094a + ", newHolder=" + this.f11095b + ", fromX=" + this.f11096c + ", fromY=" + this.f11097d + ", toX=" + this.f11098e + ", toY=" + this.f11099f + '}';
        }

        i(RecyclerView.AbstractC2749E abstractC2749E, RecyclerView.AbstractC2749E abstractC2749E2, int i7, int i8, int i9, int i10) {
            this(abstractC2749E, abstractC2749E2);
            this.f11096c = i7;
            this.f11097d = i8;
            this.f11098e = i9;
            this.f11099f = i10;
        }
    }
}
