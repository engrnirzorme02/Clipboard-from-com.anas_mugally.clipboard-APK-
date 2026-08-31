package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p081K.C0713e;

/* JADX INFO: renamed from: androidx.fragment.app.z */
/* JADX INFO: loaded from: classes.dex */
class C2608z extends AbstractC2574A {

    /* JADX INFO: renamed from: androidx.fragment.app.z$a */
    class a extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Rect f10371a;

        a(Rect rect) {
            this.f10371a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f10371a;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.z$b */
    class b implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f10373a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ArrayList f10374b;

        b(View view, ArrayList arrayList) {
            this.f10373a = view;
            this.f10374b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f10373a.setVisibility(8);
            int size = this.f10374b.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((View) this.f10374b.get(i7)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.z$c */
    class c implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f10376a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ArrayList f10377b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Object f10378c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ ArrayList f10379d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Object f10380e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ ArrayList f10381f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f10376a = obj;
            this.f10377b = arrayList;
            this.f10378c = obj2;
            this.f10379d = arrayList2;
            this.f10380e = obj3;
            this.f10381f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f10376a;
            if (obj != null) {
                C2608z.this.m12519w(obj, this.f10377b, null);
            }
            Object obj2 = this.f10378c;
            if (obj2 != null) {
                C2608z.this.m12519w(obj2, this.f10379d, null);
            }
            Object obj3 = this.f10380e;
            if (obj3 != null) {
                C2608z.this.m12519w(obj3, this.f10381f, null);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.z$d */
    class d implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Runnable f10383a;

        d(Runnable runnable) {
            this.f10383a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f10383a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.z$e */
    class e extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Rect f10385a;

        e(Rect rect) {
            this.f10385a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f10385a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f10385a;
        }
    }

    C2608z() {
    }

    /* JADX INFO: renamed from: v */
    private static boolean m12518v(Transition transition) {
        return (AbstractC2574A.m11936i(transition.getTargetIds()) && AbstractC2574A.m11936i(transition.getTargetNames()) && AbstractC2574A.m11936i(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: a */
    public void mo11937a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: b */
    public void mo11938b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i7 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i7 < transitionCount) {
                mo11938b(transitionSet.getTransitionAt(i7), arrayList);
                i7++;
            }
            return;
        }
        if (m12518v(transition) || !AbstractC2574A.m11936i(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i7 < size) {
            transition.addTarget((View) arrayList.get(i7));
            i7++;
        }
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: c */
    public void mo11939c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: e */
    public boolean mo11940e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: f */
    public Object mo11941f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: j */
    public Object mo11943j(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: k */
    public Object mo11944k(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: m */
    public void mo11946m(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: n */
    public void mo11947n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: o */
    public void mo11948o(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: p */
    public void mo11949p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m11942h(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: q */
    public void mo11950q(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, Object obj, C0713e c0713e, Runnable runnable) {
        ((Transition) obj).addListener(new d(runnable));
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: s */
    public void mo11952s(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC2574A.m11934d(targets, (View) arrayList.get(i7));
        }
        targets.add(view);
        arrayList.add(view);
        mo11938b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: t */
    public void mo11953t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            m12519w(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC2574A
    /* JADX INFO: renamed from: u */
    public Object mo11954u(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* JADX INFO: renamed from: w */
    public void m12519w(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i7 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i7 < transitionCount) {
                m12519w(transitionSet.getTransitionAt(i7), arrayList, arrayList2);
                i7++;
            }
            return;
        }
        if (m12518v(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i7 < size) {
            transition.addTarget((View) arrayList2.get(i7));
            i7++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget((View) arrayList.get(size2));
        }
    }
}
